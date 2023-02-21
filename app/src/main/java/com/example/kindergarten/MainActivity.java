package com.example.kindergarten;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    public static String PREFS_NAME="MyPrefsFile";
    Button login,register;
    TextView email,password;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        SharedPreferences sharedPreferences=getSharedPreferences(MainActivity.PREFS_NAME,0);
        SharedPreferences.Editor editor=sharedPreferences.edit();

        editor.putBoolean("hasLoggedIn",true);
        editor.commit();

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        auth=FirebaseAuth.getInstance();
        login=findViewById(R.id.login);
        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregister();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // openLogin();
                String emaill, passwordd;
                emaill = email.getText().toString();
                passwordd = password.getText().toString();
                if (email.getText().toString().trim().length() == 0) {
                    email.setError("Email is not entered");

                    email.requestFocus();
                }
                if (password.getText().toString().trim().length() == 0) {
                    password.setError("Password is not entered");

                    password.requestFocus();
                }
                else {
                    auth.signInWithEmailAndPassword(emaill, passwordd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                startActivity(new Intent(MainActivity.this, Mainmenu.class));
                                Toast.makeText(MainActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, (CharSequence) task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

    }

    private void openregister() {
        Intent mainIntent = new Intent(this,Register.class);
        startActivity(mainIntent);
    }
   /* private void openLogin() {
        Intent mainIntent = new Intent(this, Mainmenu.class);
        startActivity(mainIntent);

    }*/
    }