package com.starkindustriesranjeet.ilab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button login;
    TextView register;
    CheckBox showpassword;
    EditText mobile,password;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        showpassword=(CheckBox)findViewById(R.id.showpassword);
        showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        mobile=(EditText)findViewById(R.id.editText1);
        password=(EditText)findViewById(R.id.editText2);

        login = (Button)findViewById(R.id.button2);
        register = (TextView)findViewById(R.id.textView3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String mymobile=mobile.getText().toString();
                final String mypassword=password.getText().toString();

                if (mymobile.isEmpty()){
                    mobile.setError("Please Enter Mobile Number");
                    mobile.requestFocus();
                    return;
                }
                else if (mymobile.length() != 10){
                    mobile.setError("Mobile number must contains 10 numbers");
                    mobile.requestFocus();
                    return;
                }
                else if (mypassword.isEmpty()){
                    password.setError("Please Enter Password");
                    password.requestFocus();
                    return;
                }
                else if (mymobile.isEmpty() && mypassword.isEmpty()){
                    mobile.setError("Please Enter Email");
                    password.setError("Please Enter Password");
                    mobile.requestFocus();
                    password.requestFocus();
                    return;
                }
                else if (!(mymobile.isEmpty() && mypassword.isEmpty())){


                    mRef= FirebaseDatabase.getInstance().getReference().child("Customer").child(mymobile);
                    mRef.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                            try {
                                String mob=dataSnapshot.child("Mobile").getValue().toString();
                                String pass=dataSnapshot.child("Password").getValue().toString();


                                if (mymobile.equals(mob) && mypassword.equals(pass)){
                                    Intent intent=new Intent(MainActivity.this,Product_One.class);
                                    intent.putExtra("a",mymobile);
                                    startActivity(intent);
                                    finish();
                                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();


                                }
                                else{
                                    Toast.makeText(MainActivity.this, "Please Enter Valid Mobile or Password", Toast.LENGTH_LONG).show();

                                }
                            }
                            catch (Exception e){
                                e.printStackTrace();
                                Toast.makeText(MainActivity.this, "Please Enter Valid Mobile And Password", Toast.LENGTH_LONG).show();

                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            Toast.makeText(MainActivity.this, "Check Mobile number or Password", Toast.LENGTH_LONG).show();
                        }
                    });

                }
                else {
                    Toast.makeText(MainActivity.this, "Inalid Email or Password", Toast.LENGTH_SHORT).show();
                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register_Customer.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
