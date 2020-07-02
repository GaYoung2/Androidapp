package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends Activity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0; //버튼은 0번부터 9번까지
    private Button addbutton,delbutton,multiplebutton,dividerbutton,resultbutton,clearbutton; //계산 버튼 +,-,*,/,=,clear
    Intent intent = getIntent();
    private TextView text;
    private EditText edit;

    private int a;
    private int where=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button0 = (Button)findViewById(R.id.button0);
        addbutton = (Button)findViewById(R.id.addbutton);
        delbutton = (Button)findViewById(R.id.delbutton);
        multiplebutton = (Button)findViewById(R.id.multiplebutton);
        dividerbutton = (Button)findViewById(R.id.dividerbutton);
        resultbutton = (Button)findViewById(R.id.resultbutton);
        clearbutton = (Button)findViewById(R.id.clearbutton);

        //title
        text = (TextView)findViewById(R.id.title);

        //결과표시창
        edit = (EditText)findViewById(R.id.display);

        OnClickListener listener = new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v==button1){
                    edit.setText(edit.getText().toString()+1);
                }
                else if(v==button2){
                    edit.setText(edit.getText().toString()+2);
                }
                else if(v==button3){
                    edit.setText(edit.getText().toString()+3);
                }
                else if(v==button4){
                    edit.setText(edit.getText().toString()+4);
                }
                else if(v==button5){
                    edit.setText(edit.getText().toString()+5);
                }
                else if(v==button6){
                    edit.setText(edit.getText().toString()+6);
                }
                else if(v==button7){
                    edit.setText(edit.getText().toString()+7);
                }
                else if(v==button8){
                    edit.setText(edit.getText().toString()+8);
                }
                else if(v==button9){
                    edit.setText(edit.getText().toString()+9);
                }
                else if(v==button0){
                    edit.setText(edit.getText().toString()+0);
                }

                else if(v==addbutton){
                    // 더하기 부분
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =1;
                }

                else if(v==delbutton){
                    // 빼기 부분
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =2;
                }

                else if(v==multiplebutton){
                    // 곱하기 부분
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =3;
                }

                else if(v==dividerbutton){
                    // 나누기 부분
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where =4;
                }

                //결과부분
                else if(v==resultbutton){

                    //더하기
                    if(where==1){
                        a = a + Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }
                    //빼기
                    else if(where==2){
                        a = a - Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }
                    //곱하기
                    else if(where==3){
                        a = a * Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }
                    //나누기
                    else if(where==4){
                        a = a / Integer.valueOf(edit.getText().toString().trim());
                        edit.setText(Integer.toString(a));
                    }

                }

                //edittext 클리어
                else if(v==clearbutton){
                    edit.setText("");
                }
            }
        };

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button0.setOnClickListener(listener);
        addbutton.setOnClickListener(listener);
        delbutton.setOnClickListener(listener);
        multiplebutton.setOnClickListener(listener);
        dividerbutton.setOnClickListener(listener);
        resultbutton.setOnClickListener(listener);
        clearbutton.setOnClickListener(listener);

    }

}