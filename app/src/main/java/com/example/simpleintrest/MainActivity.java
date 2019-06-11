package com.example.simpleintrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String s1;
    String s2;
    String s3;
    Button button;
    EditText editText1,editText2,editText3;
    TextView textView;
    double p,n,r,si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText1=findViewById(R.id.editText4);
        editText2=findViewById(R.id.editText5);
        editText3=findViewById(R.id.editText6);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = editText1.getText().toString().trim();
                s2 = editText2.getText().toString().trim();
                s3 = editText3.getText().toString().trim();

                if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Some Value", Toast.LENGTH_SHORT).show();
                }
                else {

                    p = Double.parseDouble(s1);
                    n = Double.parseDouble(s2);
                    r = Double.parseDouble(s3);

                    si = (p * n * r) / 100;

                    String s = String.valueOf(si);
                    textView.append(s);
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setTextSize(24);
                }

            }
        });
    }
}
