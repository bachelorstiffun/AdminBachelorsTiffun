package com.touchizen.adminbachelorstiffun.FirebaseDao;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.touchizen.adminbachelorstiffun.Login.LoginActivity;
import com.touchizen.adminbachelorstiffun.Model.Admin;

public class StoreDataInFirebase {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    public String status;

    public String checkAdminLogin(final String username,final String password){

        Admin admin = new Admin();


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Admin");

        Query checkUsername = databaseReference.orderByChild("username").equalTo(username);

        checkUsername.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String checkPassword = snapshot.child(username).child("password").getValue(String.class);
                    if(checkPassword.equals(password)){
                        status = "bothmatch";
                    }else{
                        status = "passwordnotmatch";
                    }
                }else{
                    status = "usernamenotexist";
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        return status;

    }

}
