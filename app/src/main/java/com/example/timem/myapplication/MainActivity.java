package com.example.timem.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userName;
    private EditText userPassword;
    private Button login_btn;
    private CheckBox rememberPwd;
    private Button forgetPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        userName = (EditText) findViewById(R.id.user_name);
        userPassword = (EditText) findViewById(R.id.user_password);

        rememberPwd = (CheckBox) findViewById(R.id.remember_pwd);
        forgetPwd = (Button) findViewById(R.id.forget_pwd);

        login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                String userNameText = userName.getText().toString();
                String userPasswordText = userPassword.getText().toString();
                LoginFunction login = new LoginFunction(userNameText,userPasswordText);
//                login.show();
                break;
            case R.id.forget_pwd:

                break;
            default:

                break;
        }
    }
}
