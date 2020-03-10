package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    public class ex extends AppCompatActivity {
        TextView textView3,textView4,textView5,textView6;
        EditText editText2;
        Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ex);
            Intent intent=getIntent();
            String user_name=intent.getStringExtra(MainActivity.EXTRA_USER);
            String email=intent.getStringExtra(MainActivity.EXTRA_EMAIL);
            int phone=intent.getIntExtra(MainActivity.EXTRA_PHONE,0);
            String pass=intent.getStringExtra(MainActivity.EXTRA_PASS);
            textView3=findViewById(R.id.textView3);
            textView4=findViewById(R.id.textView4);
            textView5=findViewById(R.id.textView5);
            textView6=findViewById(R.id.textView6);
            editText2=findViewById(R.id.editText2);
            button=(Button)findViewById(R.id.button);

            textView3.setText(user_name);
            textView4.setText(email);
            textView5.setText(""+phone);
            textView6.setText(pass);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url=  editText2.getText().toString();
                    if(!url.equals(""))
                    {
                        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                        startActivity(intent1);
                    }
                    else
                        Toast.makeText(ex.this,"Please enter the url",Toast.LENGTH_LONG).show();
                }
            });

        }
}
