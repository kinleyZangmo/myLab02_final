package com.calculatorapp.mylab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //To count the number of button clicks
    public void onClickCount(View view) {
        TextView text = (TextView) findViewById(R.id.txt);
        count ++;
        text.setText(String.valueOf(count));
    }
    //To display toast message
    public void toastDisplay(View v){
        Toast.makeText(MainActivity.this,"YOU ARE TOAST BUDDY!!", Toast.LENGTH_SHORT).show();
    }
}