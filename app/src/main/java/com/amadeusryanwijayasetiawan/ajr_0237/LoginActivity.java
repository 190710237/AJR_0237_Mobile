package com.amadeusryanwijayasetiawan.ajr_0237;

import static com.android.volley.Request.Method.GET;
import static com.android.volley.Request.Method.POST;
import static com.android.volley.Request.Method.PUT;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.amadeusryanwijayasetiawan.ajr_0237.CustomerActivity;
import com.amadeusryanwijayasetiawan.ajr_0237.DriverActivity;
import com.amadeusryanwijayasetiawan.ajr_0237.ManagerActivity;
import com.amadeusryanwijayasetiawan.ajr_0237.R;
import com.amadeusryanwijayasetiawan.ajr_0237.api.UserApi;
import com.amadeusryanwijayasetiawan.ajr_0237.model.User;
import com.amadeusryanwijayasetiawan.ajr_0237.model.UserResponse;
import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout etEmail, etPassword;
    private MaterialButton btnLogin;
    private LinearLayout layoutLoading;
    private RequestQueue queue;

    //TODO CONVERT TO VOLLEY

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        queue = Volley.newRequestQueue(this);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inUsername = etEmail.getEditText().getText().toString();
                String inPassword = etPassword.getEditText().getText().toString();

                //cek database user
                loginUser();
            }
        });
    }

    private void loginUser(){
//        setLoading(true);
        final String email = etEmail.getEditText().getText().toString();
        final String password = etPassword.getEditText().getText().toString();

        if(email.equals("manager@ajr.com") && password.equals("manager")){
            Toast.makeText(LoginActivity.this, "Authenticated", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, ManagerActivity.class));
            finish();
        }
        else if(email.equals("glens@gmail.com") && password.equals("1999-06-16")){
            Toast.makeText(LoginActivity.this, "Authenticated", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, DriverActivity.class));
            finish();
        }
        else if(email.equals("levina@gmail.com") && password.equals("2000-01-01")){
            Toast.makeText(LoginActivity.this, "Authenticated", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, CustomerActivity.class));
            finish();
        }
        else{
            Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
        }

//        User user = new User(username, password);

//        StringRequest stringRequest = new StringRequest(POST, UserApi.LOGIN,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try{
//                            JSONObject jsonObject = new JSONObject(response);
//                            String message = jsonObject.getString("message");
//                            String token = jsonObject.getString("access_token");
//                        } catch (Exception e){
//                            e.printStackTrace();
//                        }
//
//                        Gson gson = new Gson();
//
//                        UserResponse userResponse = gson.fromJson(response, UserResponse.class);
//                        User userLogin = userResponse.getUser();
//
//                        String userAccess = userLogin.getAccess_level();
//
//                        Toast.makeText(LoginActivity.this, userResponse.getMessage(), Toast.LENGTH_SHORT).show();
//
//                        if(userAccess.equals("manager"))
//                        {
//                            startActivity(new Intent(LoginActivity.this, ManagerActivity.class));
//                            finish();
//                        }
//                        else if(userAccess.equals("driver")){
//                            startActivity(new Intent(LoginActivity.this, DriverActivity.class));
//                            finish();
//                        }
//                        else if(userAccess.equals("customer")){
//                            startActivity(new Intent(LoginActivity.this, CustomerActivity.class));
//                            finish();
//                        }
//
////                        setLoading(false);
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
////                setLoading(false);
//
//                try{
//                    String responseBody = new String(error.networkResponse.data,
//                            StandardCharsets.UTF_8);
//                    JSONObject errors = new JSONObject(responseBody);
//
//                    Toast.makeText(LoginActivity.this,
//                            errors.getString("message"), Toast.LENGTH_LONG).show();
//                } catch (Exception e){
//                    Toast.makeText(LoginActivity.this, "Invalid Credentials",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        }){
//            //Header
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                HashMap<String, String> headers = new HashMap<String, String>();
//                headers.put("Accept", "application/json");
//
//                return headers;
//            }
//
//            //Body
//            @Override
//            public byte[] getBody() throws AuthFailureError {
//                Gson gson = new Gson();
//                /* Serialisasi data dari java object
//                menjadi JSON string menggunakan Gson */
//                String requestBody = gson.toJson(user);
//
//                return requestBody.getBytes(StandardCharsets.UTF_8);
//            }
//
//            @Override
//            public String getBodyContentType() {
//                return "application/json";
//            }
//        };
//
//        queue.add(stringRequest);
    }

    private boolean validateForm(String username, String password){
        if (username.isEmpty() || password.isEmpty()){
            Toast.makeText(LoginActivity.this, "Username atau Password Kosong", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void setLoading(boolean isLoading) {
        if (isLoading) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            layoutLoading.setVisibility(View.VISIBLE);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            layoutLoading.setVisibility(View.GONE);
        }
    }
}
