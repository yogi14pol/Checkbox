package com.clicks.yogi.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1,checkBox2;
    RelativeLayout MyRelativeId;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        MyRelativeId = findViewById(R.id.MyRelativeId);
        checkBox1 = (CheckBox)findViewById(R.id.Android);
        checkBox2 = (CheckBox)findViewById(R.id.Kotlin);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked() && checkBox2.isChecked()){

                    Intent i = new Intent(MainActivity.this,NextActivity.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "New Activity",
                            Toast.LENGTH_SHORT).show();

                }else if (checkBox1.isChecked()){

                    MyRelativeId.setBackgroundColor(Color.BLUE);
                    Toast.makeText(MainActivity.this, "Hello Android",
                            Toast.LENGTH_SHORT).show();

                }else if (checkBox2.isChecked()){
                    MyRelativeId.setBackgroundColor(Color.CYAN);
                    Toast.makeText(MainActivity.this, "Hello Kotlin",
                            Toast.LENGTH_SHORT).show();

                }else if (!checkBox2.isChecked() && !checkBox1.isChecked())
                    MyRelativeId.setBackgroundColor(Color.WHITE);
                Toast.makeText(MainActivity.this, "Select the checkbox",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
}
