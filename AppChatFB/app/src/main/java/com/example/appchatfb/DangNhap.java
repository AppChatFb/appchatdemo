package com.example.appchatfb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appchatfb.view.MainActivity;

public class DangNhap extends AppCompatActivity {
    Button btnSingIn,btnRegis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnSingIn=findViewById(R.id.btn_sing_in);
        btnRegis=findViewById(R.id.btn_regis);
        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DangNhap.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DangNhap.this,Register.class);
                startActivity(intent);
            }
        });
    }
}
