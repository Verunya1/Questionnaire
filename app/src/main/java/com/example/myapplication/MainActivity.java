package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String PASSWORD = "123";
    public static final String LOGIN = "test";

    private ActivityMainBinding bind;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getLogin = bind.editTextTextPersonName.getText().toString();
                String getPassword = bind.editTextTextPassword.getText().toString();
                if (PASSWORD.equals(getPassword) && LOGIN.equals(getLogin)) {
                    bind.textView.setText(R.string.Correct);
                    bind.textView.setTextColor(Color.GREEN);
                } else {
                    bind.textView.setText(R.string.Notcorrect);
                    bind.textView.setTextColor(Color.RED);
                }
            }

        });


        //setContentView(R.layout.activity_main);
    }
}
