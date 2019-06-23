package com.ranjen.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //create new button and textview object as in the view
    private Button myButton;
    private TextView myTextView;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //refer the object to the button
        myButton = findViewById(R.id.button1);
        myEditText = findViewById(R.id.editText1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //show the entered text in input once clicked the button
                String input1 = myEditText.getText().toString();

                //text to displayed when clicked on the button1
                myTextView.setText("Hello " + input1);
            }
        });
        myTextView = findViewById(R.id.textView1);

    }
}
