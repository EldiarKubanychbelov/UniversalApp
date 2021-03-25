package com.example.universalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class CalculatorApp extends AppCompatActivity {
    Button textZero;
    Button textOne;
    Button textTwo;
    Button textThree;
    Button textFour;
    Button textFive;
    Button textSix;
    Button textSeven;
    Button textEight;
    Button textNine;
    Button textPoint;
    Button textRemoval;
    Button textEqually;
    Button textPlus;
    Button textMultiplication;
    Button textMinus;
    Button textDivision;
    ImageButton textDelete;
    EditText textResult;

    float сValueOne, сValueTwo;

    boolean textAddition, textSubtract, crunchifyMultiplication, crunchifyRemoval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_app);
        textZero = findViewById(R.id.zero);
        textOne = findViewById(R.id.one);
        textTwo = findViewById(R.id.two);
        textThree = findViewById(R.id.three);
        textFour = findViewById(R.id.four);
        textFive = findViewById(R.id.five);
        textSix = findViewById(R.id.six);
        textSeven = findViewById(R.id.seven);
        textEight = findViewById(R.id.eight);
        textNine = findViewById(R.id.nine);
        textPoint = findViewById(R.id.point);
        textPlus = findViewById(R.id.plus);
        textMultiplication = findViewById(R.id.multiplication);
        textRemoval = findViewById(R.id.removal);
        textEqually = findViewById(R.id.equally);
        textMinus = findViewById(R.id.minus);
        textDivision = findViewById(R.id.division);
        textDelete = findViewById(R.id.imageButton);
        textResult = findViewById(R.id.result);


        textZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "0");
            }
        });

        textOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "1");
            }
        });

        textTwo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "2");
            }
        });

        textThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "3");
            }
        });

        textFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "4");
            }
        });

        textFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "5");
            }
        });

        textSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "6");
            }
        });

        textSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "7");
            }
        });

        textEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "8");
            }
        });

        textNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "9");
            }
        });


        textDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                сValueOne = Float.parseFloat(textResult.getText() + "");
                crunchifyRemoval = true;
                textResult.setText(null);
            }
        });

        textPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textResult == null) {
                    textResult.setText("");
                } else {
                    сValueOne = Float.parseFloat(textResult.getText() + "");
                    textAddition = true;
                    textResult.setText(null);
                }
            }
        });

        textMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                сValueOne = Float.parseFloat(textResult.getText() + "");
                textSubtract = true;
                textResult.setText(null);
            }
        });

        textMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                сValueOne = Float.parseFloat(textResult.getText() + "");
                crunchifyMultiplication = true;
                textResult.setText(null);
            }
        });


        textEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                сValueTwo = Float.parseFloat(textResult.getText() + "");

                if (textAddition == true) {
                    textResult.setText(сValueOne + сValueTwo + "");
                    textAddition = false;
                }

                if (textSubtract == true) {
                    textResult.setText(сValueOne - сValueTwo + "");
                    textSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    textResult.setText(сValueOne * сValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyRemoval == true) {
                    textResult.setText(сValueOne / сValueTwo + "");
                    crunchifyRemoval = false;
                }
            }
        });

        textDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        textPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + ".");
            }
        });
    }
}