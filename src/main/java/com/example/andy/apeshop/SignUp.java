package com.example.andy.apeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText email;
    EditText password;
    EditText address;
    Button signUpButton;

    Spinner countrySpinner;
    Spinner provinceSpinner;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //country Spinner
        countrySpinner = (Spinner) findViewById(R.id.countrySpinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.countryArray,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(adapter);
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //province Spinner
        provinceSpinner = (Spinner) findViewById(R.id.provinceSpinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.provinceArray,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        provinceSpinner.setAdapter(adapter);
        provinceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        firstName = (EditText)findViewById(R.id.firstNameText);
        lastName = (EditText)findViewById(R.id.lastNameText);
        email = (EditText)findViewById(R.id.emailText);
        password = (EditText)findViewById(R.id.passwordText);
        address = (EditText)findViewById(R.id.addressText);

        signUpButton = (Button)findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String newFirstName = firstName.getText().toString();
                String newLastName = lastName.getText().toString();
                String newEmail = email.getText().toString();
                String newPassword = password.getText().toString();
                String newAddress = address.getText().toString();
                String newCountry = countrySpinner.getSelectedItem().toString();
                String newProvince = provinceSpinner.getSelectedItem().toString();

                if (newFirstName.length()==0){
                    firstName.requestFocus();
                    firstName.setError("First Name cannot be Empty");
                }
                else if (newLastName.length()==0){
                    lastName.requestFocus();
                    lastName.setError("Last Name cannot be empty");
                }
                else if (newEmail.length()==0){
                    email.requestFocus();
                    email.setError("Email cannot be empty");
                }
                else if (newPassword.length()==0){
                    password.requestFocus();
                    password.setError("Password cannot be empty");
                }
                else if (newAddress.length()==0){
                    address.requestFocus();
                    address.setError("Address cannot be empty");
                }
                else if (newCountry.matches("Select")){
                    countrySpinner.requestFocus();
                    Toast.makeText(getBaseContext(),"Country Not Selected", Toast.LENGTH_LONG).show();
                }
                else if (newProvince.matches("Select")){
                    provinceSpinner.requestFocus();
                    Toast.makeText(getBaseContext(),"Province Not Selected", Toast.LENGTH_LONG).show();
                }
                else{
                    startActivity(new Intent(SignUp.this, Login.class));
                }
            }
        });



    }

    public void signUp(View view){

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
