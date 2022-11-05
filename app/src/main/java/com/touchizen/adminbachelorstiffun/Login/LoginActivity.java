package com.touchizen.adminbachelorstiffun.Login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.touchizen.adminbachelorstiffun.FirebaseDao.StoreDataInFirebase;
import com.touchizen.adminbachelorstiffun.MainActivity;
import com.touchizen.adminbachelorstiffun.R;

public class LoginActivity extends AppCompatActivity {

    private CardView cardBtnLogin;
    private EditText etUsername,etPassword;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    StoreDataInFirebase storeDataInFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        validate();

        cardBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                if(Login()) {
//                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                }
            }
        });

    }

    private boolean Login() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if(!username.isEmpty()){
            if(!password.isEmpty()){
                String status = storeDataInFirebase.checkAdminLogin(username,password);
                if(status.equalsIgnoreCase("usernamenotexist")){
                    Toast.makeText(this, "Username does not exist", Toast.LENGTH_SHORT).show();
                    return false;
                }
                if(status.equalsIgnoreCase("passwordnotmatch")){
                    Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show();
                    return false;
                }
                if(status.equalsIgnoreCase("bothmatch")){
                    Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }else{
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
        }

        return false;
    }

    private void validate() {
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        cardBtnLogin = findViewById(R.id.cardBtnLogin);
        storeDataInFirebase = new StoreDataInFirebase();
    }
}