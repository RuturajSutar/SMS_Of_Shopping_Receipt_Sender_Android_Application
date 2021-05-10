package com.starkindustriesranjeet.ilab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Final_Reciept extends AppCompatActivity {

    TextView p_1,p_2,p_3,p_4,p_5;
    TextView q_1,q_2,q_3,q_4,q_5;
    TextView tp_1,tp_2,tp_3,tp_4,tp_5;
    TextView ta_1,ta_2,ta_3,ta_4,ta_5;
    TextView taop_1,taop_2,taop_3,taop_4,taop_5;

    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__reciept);

        Intent intent30 = getIntent();

        String p1 = intent30.getStringExtra("a");
        String p2 = intent30.getStringExtra("aa");
        String p3 = intent30.getStringExtra("aaa");
        String p4 = intent30.getStringExtra("aaaa");
        String p5 = intent30.getStringExtra("aaaaa");

        String q1 = intent30.getStringExtra("b");
        String q2 = intent30.getStringExtra("bb");
        String q3 = intent30.getStringExtra("bbb");
        String q4 = intent30.getStringExtra("bbbb");
        String q5 = intent30.getStringExtra("bbbbb");

        String tp1 = intent30.getStringExtra("c");
        String tp2 = intent30.getStringExtra("cc");
        String tp3 = intent30.getStringExtra("ccc");
        String tp4 = intent30.getStringExtra("cccc");
        String tp5 = intent30.getStringExtra("ccccc");

        String ta1 = intent30.getStringExtra("d");
        String ta2 = intent30.getStringExtra("dd");
        String ta3 = intent30.getStringExtra("ddd");
        String ta4 = intent30.getStringExtra("dddd");
        String ta5 = intent30.getStringExtra("ddddd");

        String taop1 = intent30.getStringExtra("e");
        String taop2 = intent30.getStringExtra("ee");
        String taop3 = intent30.getStringExtra("eee");
        String taop4 = intent30.getStringExtra("eeee");
        String taop5 = intent30.getStringExtra("eeeee");



        p_1=(TextView)findViewById(R.id.textView22);
        p_2=(TextView)findViewById(R.id.textView222);
        p_3=(TextView)findViewById(R.id.textView2222);
        p_4=(TextView)findViewById(R.id.textView22222);
        p_5=(TextView)findViewById(R.id.textView222222);

        q_1=(TextView)findViewById(R.id.textView33);
        q_2=(TextView)findViewById(R.id.textView333);
        q_3=(TextView)findViewById(R.id.textView3333);
        q_4=(TextView)findViewById(R.id.textView33333);
        q_5=(TextView)findViewById(R.id.textView333333);

        tp_1=(TextView)findViewById(R.id.textView44);
        tp_2=(TextView)findViewById(R.id.textView444);
        tp_3=(TextView)findViewById(R.id.textView4444);
        tp_4=(TextView)findViewById(R.id.textView44444);
        tp_5=(TextView)findViewById(R.id.textView444444);

        ta_1=(TextView)findViewById(R.id.textView55);
        ta_2=(TextView)findViewById(R.id.textView555);
        ta_3=(TextView)findViewById(R.id.textView5555);
        ta_4=(TextView)findViewById(R.id.textView55555);
        ta_5=(TextView)findViewById(R.id.textView555555);

        taop_1=(TextView)findViewById(R.id.textView66);
        taop_2=(TextView)findViewById(R.id.textView666);
        taop_3=(TextView)findViewById(R.id.textView6666);
        taop_4=(TextView)findViewById(R.id.textView66666);
        taop_5=(TextView)findViewById(R.id.textView666666);

        p_1.setText(p1);
        p_2.setText(p2);
        p_3.setText(p3);
        p_4.setText(p4);
        p_5.setText(p5);

        q_1.setText(q1);
        q_2.setText(q2);
        q_3.setText(q3);
        q_4.setText(q4);
        q_5.setText(q5);

        tp_1.setText(tp1);
        tp_2.setText(tp2);
        tp_3.setText(tp3);
        tp_4.setText(tp4);
        tp_5.setText(tp5);

        ta_1.setText(ta1);
        ta_2.setText(ta2);
        ta_3.setText(ta3);
        ta_4.setText(ta4);
        ta_5.setText(ta5);

        taop_1.setText(taop1);
        taop_2.setText(taop2);
        taop_3.setText(taop3);
        taop_4.setText(taop4);
        taop_5.setText(taop5);





        total = (TextView)findViewById(R.id.textView6666666);

        int a1 = Integer.parseInt(taop1);
        int a2 = Integer.parseInt(taop2);
        int a3 = Integer.parseInt(taop3);
        int a4 = Integer.parseInt(taop4);
        int a5 = Integer.parseInt(taop5);

        int tot = a1+a2+a3+a4+a5;

        String mytotal = Integer.toString(tot);

        total.setText(mytotal);







    }
}
