package com.example.travelmania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travelmania.helpers.ForgotPassword;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signin;
    private EditText editTextEmail, editTextPassword;
    private TextView register,forgotpassword;

    private FirebaseAuth mAuth;
    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth=FirebaseAuth.getInstance();

        signin=findViewById(R.id.signin);
        signin.setOnClickListener(this);

        register=findViewById(R.id.register);
        register.setOnClickListener(this);

        forgotpassword=findViewById(R.id.forgotpassword);
        forgotpassword.setOnClickListener(this);

        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);

        progressBar=findViewById(R.id.progressbar);

        if (mAuth.getCurrentUser() != null) {
            startActivity(new Intent(MainActivity.this, Places.class));
            finish();
        }








    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                startActivity(new Intent(this, RegisterUser.class));
                break;
            case R.id.signin:
                userLogin();
                break;
            case R.id.forgotpassword:
                startActivity(new Intent(this, ForgotPassword.class));
                break;
        }
    }

    private void userLogin() {
        String email= editTextEmail.getText().toString().trim();
        String password= editTextPassword.getText().toString().trim();

        if(email.isEmpty()){
            editTextEmail.setError("Enter Email!");
            editTextEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Please provide a valid email!");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()) {
            editTextPassword.setError("Enter Password!");
            editTextPassword.requestFocus();
            return;
        }
        if(password.length() < 6){
            editTextPassword.setError("Minimum password length is 6!");
            editTextPassword.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
                            if(user.isEmailVerified()){
                                startActivity(new Intent(MainActivity.this,Places.class));

                            }else{
                                user.sendEmailVerification();
                                Toast.makeText(MainActivity.this,"Check your email to verify account",Toast.LENGTH_LONG).show();
                            }

                        }else{
                            Toast.makeText(MainActivity.this,"Failed to LOGIN!",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}