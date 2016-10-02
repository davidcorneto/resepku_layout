package com.codemargonda.finalproject.resep_ku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button bLogin;
    CheckBox cbKeepLogin;
    TextView tSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tSignUp = (TextView) findViewById(R.id.tSignUp);
        cbKeepLogin = (CheckBox) findViewById(R.id.cbKeepLogin);
        bLogin = (Button) findViewById(R.id.bLogin);


    }
}
