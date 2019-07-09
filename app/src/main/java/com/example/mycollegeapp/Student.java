package com.example.mycollegeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Student extends AppCompatActivity {
    TextView tcv;
    Button bt1;
    Button bt2;
    EditText edt1;
    EditText ed2; @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_student);
        tcv = (TextView) findViewById(R.id.textView2);
        edt1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=edt1.getText().toString();
                String pass=ed2.getText().toString();
                if (user.equals("kushagraagarwal9@gmail.com") &&  pass.equals("hello123") ) {

                    Intent inte = new Intent(Student.this, Home.class);
                    startActivity(inte);
                } else {
                    Toast.makeText( Student.this,"ERROR", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}


