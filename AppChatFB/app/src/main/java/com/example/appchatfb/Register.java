package com.example.appchatfb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.example.appchatfb.databinding.ActivityRegisterBinding;
import com.example.appchatfb.view.MainActivity;

public class Register extends AppCompatActivity implements Event{
    private ActivityRegisterBinding binding;
    private LoginViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_register);
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);
    }

    @Override
    public void onClick() {
        if(viewModel.register(binding.regisUser.getText().toString(),binding.etEmail.getText().toString(),binding.etPass.getText().toString())){
            Intent intent=new Intent(Register.this,DangNhap.class);
            startActivity(intent);
        }
    }
}
