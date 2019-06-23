package com.ranjen.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //create new button and textview object as in the view
    private Button myButton;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //refer the object to the button
        myButton = findViewById(R.id.button1);
        myTextView = findViewById(R.id.textView1);

        //test to overwrite the UI text
        myTextView.setText("Text 2");
    }
}
