package com.example.appchatfb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.example.appchatfb.databinding.ActivityRegisterBinding;
import com.example.appchatfb.interfacefunc.Event;
import com.example.appchatfb.viewmodel.LoginViewModel;

public class Register extends AppCompatActivity{
    private ActivityRegisterBinding binding;
    private LoginViewModel viewModel;
    Event event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_register);
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        event=new Event() {
            @Override
            public void onClick() {
                if(viewModel.register(binding.regisUser.getText().toString(),binding.etEmail.getText().toString(),binding.etPass.getText().toString())){
                    Intent intent=new Intent(Register.this,DangNhap.class);
                    startActivity(intent);
                }
            }
        };
        binding.setEvent(event);
    }


}
