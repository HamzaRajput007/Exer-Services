package com.zamhtech.exer.Login_Registration;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.irfan.exerproject.Activities.MainActivity;
import com.example.irfan.exerproject.R;
import com.example.irfan.exerproject.Retrofit.ApiClient;
import com.example.irfan.exerproject.Retrofit.ApiInterface;
import com.example.irfan.exerproject.Retrofit.Models.RegisterResponse;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupActivity extends AppCompatActivity {
    Button btn_signup;
    // CallbackManager callbackManager;
    EditText e_email;
    EditText e_name;
    EditText e_password;
    // LoginButton loginButton;
    ProgressDialog progressDialog;
    TextView t_asignup;
    ApiInterface apiInterface;
    RegisterResponse registerResponse;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        e_email = findViewById(R.id.email_signup);
        e_name = findViewById(R.id.name_signup);
        e_password = findViewById(R.id.password_signup);
        btn_signup = findViewById(R.id.btn_signup);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        btn_signup.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Call<RegisterResponse> call = apiInterface.mRegisterResponse(e_email.getText().toString(), e_password.getText().toString(),
                        e_name.getText().toString()
                        );

                call.enqueue(new Callback<RegisterResponse>() {
                    @Override
                    public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                        registerResponse = response.body();

                        if (registerResponse.getResponse().equals("ok")){
                            startActivity(new Intent(SignupActivity.this, MainActivity.class));
                            finish();
                            Toast.makeText(SignupActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(SignupActivity.this, "Registration Error: "+ registerResponse.getResponse(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<RegisterResponse> call, Throwable t) {
                        call.cancel();
                        Toast.makeText(SignupActivity.this, "Some Error Occurred. Please try again.", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }
}
