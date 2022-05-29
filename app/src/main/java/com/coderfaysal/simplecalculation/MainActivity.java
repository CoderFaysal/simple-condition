package com.coderfaysal.simplecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    int one, two, three;

    int sum;
    int mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        one = 10;
        two = 20;
        three = 30;

        sum = one+two+three;
        mul = one*two*three;

        textView.setText("Sum = "+sum+"\nGun = "+mul);





    }
}