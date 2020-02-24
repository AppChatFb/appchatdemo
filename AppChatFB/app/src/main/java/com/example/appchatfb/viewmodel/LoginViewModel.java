package com.example.appchatfb.viewmodel;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginViewModel extends ViewModel {
    private FirebaseAuth mAuth;
    final String TAG="AAA";
    private Boolean check=false;
    // ...
// Initialize Firebase Auth
    public boolean register(String text, String text1, String text2) {
        mAuth = FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword(text1, text2)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            check=true;
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.d("BBB", "createUserWithEmail:failure", task.getException());
                            check=false;
                        }

                        // ...
                    }
                });
        return check;
    }
}
