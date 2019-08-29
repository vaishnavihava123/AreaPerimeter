package com.example.areaperimeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //EditText editText;
        //Button button;
        //TextView textView;
        final EditText editText;
        Button button;
        TextView textView,textView1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.res);
        textView1=findViewById(R.id.textView);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double Pi = 3.14;

               String r= String.valueOf(editText.getText( ));
               int num =Integer.parseInt(r);
               double no =Pi*num*num;
               //Toast.makeText(MainActivity.this, "area of circle"+no, Toast.LENGTH_SHORT).show();
               double no1=2*Pi*num;
               Toast.makeText(MainActivity.this, "area of circle"+no+"\n"+"perimeter of circle"+no1, Toast.LENGTH_SHORT).show();

           }
       });
    }
}
