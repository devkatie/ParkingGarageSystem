package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1;
    public static final Garage GARAGE = new Garage();
    public static final Manager MANAGER = new Manager();
    private EditText Username, Password;
    private Button Login;
    private int Counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.loginBtn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                //validateLogin(Username.getText().toString(), Password.getText().toString());
            }
        });


    }

    private void validateLogin(String userName, String userPassword) {
        if((userName == "Admin") && (userPassword == "1234")) {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        } else {
            Counter--;

            if(Counter == 0) {
                Login.setEnabled(false);

            }
        }
    }
}
