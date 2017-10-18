package com.example.admin.firebaseauthentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class GithubActivity extends AppCompatActivity {

    private static final String TAG = "TwitterActivity";

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        firebaseAuth = FirebaseAuth.getInstance();
    }
}
