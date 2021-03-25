package com.example.universalapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoGinApp extends AppCompatActivity {
    EditText textLogin;
    EditText textPassword;
    Button Enter;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo_gin_app);

        textLogin = findViewById(R.id.album_description_view);
        textPassword = findViewById(R.id.editTextNumberPassword);
        Enter = findViewById(R.id.next_button);


        




        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(textLogin.getText().toString().isEmpty()) || !(textPassword.getText().toString().isEmpty())) {
                     Intent intent = new Intent(LoGinApp.this,CalculatorApp.class);
                    startActivity(intent);
                    Enter.setBackgroundColor(Color.BLUE);
                    Toast toast = Toast.makeText(getApplicationContext(),"Вы успешно вошли в калькулятор!", Toast.LENGTH_LONG);
                    toast.show();

                }else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Заполняем поля !", Toast.LENGTH_LONG);
                    toast.show();
                }
                Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibe.vibrate(100);
            }
        });



    }
}