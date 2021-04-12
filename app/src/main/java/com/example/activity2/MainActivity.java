package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text_num1,text_num2;
    Button button_addition,button_subtraction, button_multiplication, button_division, button_clear_result;
    TextView text_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_answer = findViewById(R.id.txt_answer);
        button_addition = findViewById(R.id.btn_addition);
        button_subtraction = findViewById(R.id.btn_subtraction);
        button_multiplication = findViewById(R.id.button_multiplication);
        button_division = findViewById(R.id.button_division);
        text_num1 = findViewById(R.id.num_input1);
        text_num2 = findViewById(R.id.num_input2);
        button_clear_result = findViewById(R.id.btn_clear_result);

        button_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first_value = Double.parseDouble(text_num1.getText().toString());
                double second_value = Double.parseDouble(text_num2.getText().toString());

                double result = first_value + second_value;

                text_answer.setText(String.valueOf(result));
            }
        });

        button_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first_value = Double.parseDouble(text_num1.getText().toString());
                double second_value = Double.parseDouble(text_num2.getText().toString());

                double result = first_value - second_value;

                text_answer.setText(String.valueOf(result));
            }
        });

        button_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first_value = Double.parseDouble(text_num1.getText().toString());
                double second_value = Double.parseDouble(text_num2.getText().toString());

                double result = first_value * second_value;

                text_answer.setText(String.valueOf(result));
            }
        });

        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first_value = Double.parseDouble(text_num1.getText().toString());
                double second_value = Double.parseDouble(text_num2.getText().toString());

                double result = first_value / second_value;

                text_answer.setText(String.valueOf(result));
            }
        });

        button_clear_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_answer.setText(String.valueOf(0));
                text_num1.setText(String.valueOf(0));
                text_num2.setText(String.valueOf(0));
            }
        });
    }
}