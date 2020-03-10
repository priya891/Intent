package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        Button button;
        EditText ed,ed4,ed5,ed6;
        public static final String EXTRA_USER="com.example.intents.EXTRA_USER";
        public static final String EXTRA_EMAIL="com.example.intents.EXTRA_EMAIL";
        public static final String EXTRA_PHONE="com.example.intents.EXTRA_PHONE";
        public static final String EXTRA_PASS="com.example.intents.EXTRA_PASS";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button=(Button)findViewById(R.id.signbtn);
            ed=findViewById(R.id.editText);
            ed4=findViewById(R.id.editText4);
            ed5=findViewById(R.id.editText5);
            ed6=findViewById(R.id.editText6);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    validate();


                }
            });

        }

        public void validate(){

            if( ed.getText().toString().equals(""))
            {
                ed.setError("please enter valid username");
            }
            else if( ed4.getText().toString().equals(""))
            {
                ed4.setError("please enter valid email");
            }
            else if( ed5.getText().toString().equals(""))
            {
                ed5.setError("please enter valid phone no.");
            }
            else if( ed6.getText().toString().equals(""))
            {
                ed6.setError("please enter valid password");
            }
            else {
                openactivity2();
            }
        }
        void openactivity2(){
            Intent intent=new Intent(this,ex.class);
            String user_name=ed.getText().toString();
            String email=ed4.getText().toString();
            int phone=Integer.parseInt(ed5.getText().toString());
            String pass=ed6.getText().toString();
            intent.putExtra(EXTRA_USER,user_name);
            intent.putExtra(EXTRA_EMAIL,email);
            intent.putExtra(EXTRA_PHONE,phone);
            intent.putExtra(EXTRA_PASS,pass);
            startActivity(intent);
        }

    }

