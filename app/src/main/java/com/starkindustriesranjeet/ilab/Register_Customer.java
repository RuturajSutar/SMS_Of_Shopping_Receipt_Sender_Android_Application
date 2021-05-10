package com.starkindustriesranjeet.ilab;

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

public class Register_Customer extends AppCompatActivity {

    Button register;
    TextView login;
    CheckBox showpassword;
    EditText name,email,mobile,address,password;

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Register_Customer.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__customer);

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

        name=(EditText)findViewById(R.id.editText1);
        email=(EditText)findViewById(R.id.editText2);
        mobile=(EditText)findViewById(R.id.editText3);
        address=(EditText)findViewById(R.id.editText4);
        password=(EditText)findViewById(R.id.editText5);

        register = (Button)findViewById(R.id.button2);
        login = (TextView)findViewById(R.id.textView3);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String myname=name.getText().toString();
                String myemail=email.getText().toString();
                String mymobile=mobile.getText().toString();
                String myaddress=address.getText().toString();
                String mypassword=password.getText().toString();


                if(myname.isEmpty()){
                    name.setError("Enter Name");
                    name.requestFocus();
                    return;
                }
                else if (mymobile.isEmpty()){
                    mobile.setError("Enter Mobile Number");
                    mobile.requestFocus();
                    return;
                }
                else if (mymobile.length() != 10){
                    mobile.setError("Mobile number must contains 10 numbers");
                    mobile.requestFocus();
                    return;
                }
                else if (myaddress.isEmpty()){
                    address.setError("Enter Your Address");
                    address.requestFocus();
                    return;
                }
                else if (myemail.isEmpty()){
                    email.setError("Enter your aadhar Number");
                    email.requestFocus();
                    return;
                }
                else if (mypassword.isEmpty()){
                    password.setError("Enter Your Password");
                    password.requestFocus();
                    return;
                }
                else if (myname.isEmpty() && mymobile.isEmpty() &&  myaddress.isEmpty() && myemail.isEmpty() && mypassword.isEmpty() ){
                    name.setError("Enter Name");
                    name.requestFocus();
                    return;
                }
                else if (!(myname.isEmpty() && mymobile.isEmpty() &&  myaddress.isEmpty() && myemail.isEmpty() && mypassword.isEmpty())){


                    Intent intent=new Intent(Register_Customer.this,OTP_Verification.class);
                    intent.putExtra("a",myname);
                    intent.putExtra("b",myemail);
                    intent.putExtra("c",mymobile);
                    intent.putExtra("d",myaddress);
                    intent.putExtra("e",mypassword);
                    startActivity(intent);
                    finish();

                }
                else{
                    Toast.makeText(Register_Customer.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register_Customer.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
