package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.rahi.mhc.inotrans.R;

import java.util.HashMap;
import java.util.Map;

import static com.rahi.mhc.inotrans.R.id.editTextUsername;

/**
 * Created by MHC on 7/7/2016.
 */

public class login extends AppCompatActivity implements View.OnClickListener {
    public static final String LOGIN_URL = "http://anonloger.com/login.php";

    public static final String KEY_ROLLNO="rollno";
    public static final String KEY_PASSWORD="password";

    private EditText editTextRollno;
    private EditText editTextPassword;
    private Button buttonLogin;

    private String rollno;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextRollno = (EditText) findViewById(editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(this);
    }


    private void userLogin() {
        rollno = editTextRollno.getText().toString().trim();
        password = editTextPassword.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.trim().equals("success")){
                            openProfile();
                        }else{
                            Toast.makeText(login.this,response,Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(login.this,error.toString(),Toast.LENGTH_LONG ).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map = new HashMap<>();
                map.put(KEY_ROLLNO,rollno);
                map.put(KEY_PASSWORD,password);
                return map;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void openProfile(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(KEY_ROLLNO, rollno);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        userLogin();
    }
    public void onsclick(View v){
        if (v.getId()==R.id.signupb){
            Intent intent=new Intent(this,signup.class);
            startActivity(intent);
        }
    }
}
