package com.example.andy.apeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Button to login page
     * @param view
     */
    public void showLogin(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    /**
     * Button to Sign Up page
     * @param view
     */
    public void showSignUp(View view){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}
