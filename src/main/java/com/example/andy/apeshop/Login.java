package com.example.andy.apeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button loginButton;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText)findViewById(R.id.loginEmail);
        password = (EditText)findViewById(R.id.loginPassword);

        loginButton = (Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String loginEmail = email.getText().toString();
                String loginPassword = password.getText().toString();

                if (loginEmail.equals("Ape") && loginPassword.equals("Ape")){
                    startActivity(new Intent(Login.this, MainActivity.class));
                    Toast.makeText(getBaseContext(), "Login In Successful!", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getBaseContext(),"InCorrect Email Or Password you not Ape", Toast.LENGTH_LONG).show();
                }

            }


        });

    }
    /**
     * Button to home page
     * @param view
     */
    public void showHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
