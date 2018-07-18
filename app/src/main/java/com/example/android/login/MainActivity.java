package com.example.android.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText4);
        login = (Button) findViewById(R.id.button);
    }





    public void Verify(View view) {

        if (username.getText().toString().equals("sakku") && password.getText().toString().equals("naik")) {

            Intent intent = new Intent(this,successful.class);
            startActivity(intent);

        } else {


        }

    }
}

