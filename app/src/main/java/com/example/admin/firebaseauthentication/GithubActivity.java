package com.example.admin.firebaseauthentication;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GithubAuthProvider;

import okhttp3.HttpUrl;

public class GithubActivity extends AppCompatActivity {

    private static final String TAG = "TwitterActivity";

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        final ImageView image = findViewById(R.id.ivProfile);
        final TextView userName = findViewById(R.id.tvUserName);
        final TextView email = findViewById(R.id.tvEmail);

//        firebaseAuth = FirebaseAuth.getInstance();
//        authStateListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//
//                if (user != null) {
//
//                    Glide.with(GithubActivity.this)
//                            .load(user.getPhotoUrl())
//                            .into(image);
//
//                    userName.setText(user.getDisplayName());
//                    email.setText(user.getEmail());
//
//                } else {
//
//                }
//
//            }
//        };

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        firebaseAuth.addAuthStateListener(authStateListener);
//    }
}

/*
https://www.youtube.com/watch?v=rARolj84Bvw
 */

// githubSignIn > onResume > sendPost > SignInWithToken