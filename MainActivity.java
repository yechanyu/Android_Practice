package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float n1,n2,result;
    TextView tv;
    EditText a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        tv=(TextView)findViewById(R.id.result1);
        a=(EditText)findViewById(R.id.text1);
        b=(EditText)findViewById(R.id.text2);

    }
    public void addClick(View v){
        n1=Float.parseFloat(a.getText().toString());
        n2=Float.parseFloat(b.getText().toString());
        result=n1+n2;
        tv.setText(Float.toString(result));
    }
    public void subClick(View v){
        n1=Float.parseFloat(a.getText().toString());
        n2=Float.parseFloat(b.getText().toString());
        result=n1-n2;
        tv.setText(Float.toString(result));
    }
    public void divClick(View v){
        n1=Float.parseFloat(a.getText().toString());
        n2=Float.parseFloat(b.getText().toString());
        if(n2==0){
            Toast.makeText(this, "0입니다.", Toast.LENGTH_SHORT).show();
        }
        else {
            result = n1 / n2;
            tv.setText(Float.toString(result));
        }
    }
    public void mulClick(View v){
        n1=Float.parseFloat(a.getText().toString());
        n2=Float.parseFloat(b.getText().toString());
        result=n1*n2;
        tv.setText(Float.toString(result));
    }
    public void restClick(View v){
        n1=Float.parseFloat(a.getText().toString());
        n2=Float.parseFloat(b.getText().toString());
        result=n1%n2;
        tv.setText(Float.toString(result));
    }
}