package com.example.syaheerah.eralab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton, reset;
    private EditText etName;
    private TextView tvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);
        reset = (Button) findViewById(R.id.button2);
    }

    public void displayText (View view) {

        String text = etName.getText().toString();
        tvMessage.setText("Welcome " + text + "!");

        Toast toast = Toast.makeText(this,"Welcome " + text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void reset (View view) {

        Toast toast = Toast.makeText(this,"Name has been reset!", Toast.LENGTH_LONG);
        toast.show();

        etName.getText().clear();
        tvMessage.setText("Welcome!");
    }
}
