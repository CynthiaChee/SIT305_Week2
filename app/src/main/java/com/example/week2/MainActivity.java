package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect to layout items
        mEditText = findViewById(R.id.editTextTextPersonName);
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);

        //button
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputValue = mEditText.getText().toString();
                Toast.makeText(MainActivity.this, inputValue, Toast.LENGTH_LONG).show();

                mTextView.setText("Welcome to SIT305, \n" + inputValue);
            }
        });


    }
}
