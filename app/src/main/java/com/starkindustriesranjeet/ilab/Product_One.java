package com.starkindustriesranjeet.ilab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Product_One extends AppCompatActivity {

    EditText p1,p2,p3,p4,p5;
    EditText q1,q2,q3,q4,q5;
    EditText tp1,tp2,tp3,tp4,tp5;
    EditText ta1,ta2,ta3,ta4,ta5;
    EditText taop1,taop2,taop3,taop4,taop5;

    String mymobile;

    Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product__one);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        generate = (Button)findViewById(R.id.button6);

        Intent intent30 = getIntent();
        mymobile=intent30.getStringExtra("a");

        p1=(EditText)findViewById(R.id.editText1);
        p2=(EditText)findViewById(R.id.editText11);
        p3=(EditText)findViewById(R.id.editText111);
        p4=(EditText)findViewById(R.id.editText1111);
        p5=(EditText)findViewById(R.id.editText11111);

        q1=(EditText)findViewById(R.id.editText2);
        q2=(EditText)findViewById(R.id.editText22);
        q3=(EditText)findViewById(R.id.editText222);
        q4=(EditText)findViewById(R.id.editText2222);
        q5=(EditText)findViewById(R.id.editText22222);

        tp1=(EditText)findViewById(R.id.editText3);
        tp2=(EditText)findViewById(R.id.editText33);
        tp3=(EditText)findViewById(R.id.editText333);
        tp4=(EditText)findViewById(R.id.editText3333);
        tp5=(EditText)findViewById(R.id.editText33333);

        ta1=(EditText)findViewById(R.id.editText4);
        ta2=(EditText)findViewById(R.id.editText44);
        ta3=(EditText)findViewById(R.id.editText444);
        ta4=(EditText)findViewById(R.id.editText4444);
        ta5=(EditText)findViewById(R.id.editText44444);

        taop1=(EditText)findViewById(R.id.editText5);
        taop2=(EditText)findViewById(R.id.editText55);
        taop3=(EditText)findViewById(R.id.editText555);
        taop4=(EditText)findViewById(R.id.editText5555);
        taop5=(EditText)findViewById(R.id.editText55555);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p_1 = p1.getText().toString();
                String p_2 = p2.getText().toString();
                String p_3 = p3.getText().toString();
                String p_4 = p4.getText().toString();
                String p_5 = p5.getText().toString();

                String q_1 = q1.getText().toString();
                String q_2 = q2.getText().toString();
                String q_3 = q3.getText().toString();
                String q_4 = q4.getText().toString();
                String q_5 = q5.getText().toString();

                String tp_1 = tp1.getText().toString();
                String tp_2 = tp2.getText().toString();
                String tp_3 = tp3.getText().toString();
                String tp_4 = tp4.getText().toString();
                String tp_5 = tp5.getText().toString();

                String ta_1 = ta1.getText().toString();
                String ta_2 = ta2.getText().toString();
                String ta_3 = ta3.getText().toString();
                String ta_4 = ta4.getText().toString();
                String ta_5 = ta5.getText().toString();

                String taop_1 = taop1.getText().toString();
                String taop_2 = taop2.getText().toString();
                String taop_3 = taop3.getText().toString();
                String taop_4 = taop4.getText().toString();
                String taop_5 = taop5.getText().toString();


                Intent intent = new Intent(Product_One.this,Final_Reciept.class);

                intent.putExtra("a",p_1);
                intent.putExtra("aa",p_2);
                intent.putExtra("aaa",p_3);
                intent.putExtra("aaaa",p_4);
                intent.putExtra("aaaaa",p_5);

                intent.putExtra("b",q_1);
                intent.putExtra("bb",q_2);
                intent.putExtra("bbb",q_3);
                intent.putExtra("bbbb",q_4);
                intent.putExtra("bbbbb",q_5);

                intent.putExtra("c",tp_1);
                intent.putExtra("cc",tp_2);
                intent.putExtra("ccc",tp_3);
                intent.putExtra("cccc",tp_4);
                intent.putExtra("ccccc",tp_5);

                intent.putExtra("d",ta_1);
                intent.putExtra("dd",ta_2);
                intent.putExtra("ddd",ta_3);
                intent.putExtra("dddd",ta_4);
                intent.putExtra("ddddd",ta_5);

                intent.putExtra("e",taop_1);
                intent.putExtra("ee",taop_2);
                intent.putExtra("eee",taop_3);
                intent.putExtra("eeee",taop_4);
                intent.putExtra("eeeee",taop_5);


                String heading = "Sr.No   ||   Price of product   ||   Quantity of product   ||   Tax percentage   ||   Taxable amount   ||   Total product amount\n";
                String line_1 = " 1   "+p_1+"   "+q_1+"   "+tp_1+"   "+ta_1+"   "+taop_1+"\n";
                String line_2 = " 2   "+p_2+"   "+q_2+"   "+tp_2+"   "+ta_2+"   "+taop_2+"\n";
                String line_3 = " 3   "+p_3+"   "+q_3+"   "+tp_3+"   "+ta_3+"   "+taop_3+"\n";
                String line_4 = " 4   "+p_4+"   "+q_4+"   "+tp_4+"   "+ta_4+"   "+taop_4+"\n";
                String line_5 = " 5   "+p_5+"   "+q_5+"   "+tp_5+"   "+ta_5+"   "+taop_5+"\n";

                int a1 = Integer.parseInt(taop_1);
                int a2 = Integer.parseInt(taop_2);
                int a3 = Integer.parseInt(taop_3);
                int a4 = Integer.parseInt(taop_4);
                int a5 = Integer.parseInt(taop_5);

                int tot = a1+a2+a3+a4+a5;

                String mytotal = Integer.toString(tot);

                String line_6 = "Total Ammount =  "+mytotal;

                String Message = heading+line_1+line_2+line_3+line_4+line_5+line_6;

                int permissionCheck = ContextCompat.checkSelfPermission(Product_One.this, Manifest.permission.SEND_SMS);
                if(permissionCheck == PackageManager.PERMISSION_GRANTED){

                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(mymobile,null,Message,null,null);
                    Toast.makeText(Product_One.this, "Message is Sent", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                    finish();
                }
                else{
                    ActivityCompat.requestPermissions(Product_One.this,new String[]{Manifest.permission.SEND_SMS},0);
                }


            }

        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case 0:
                if(grantResults.length>=0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Tap Again on Generate Reciept", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Permission is not granted", Toast.LENGTH_SHORT).show();
                }
        }
    }
}
