package com.rahi.mhc.inotrans.fragment.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rahi.mhc.inotrans.R;

import java.util.HashMap;

import static com.rahi.mhc.inotrans.R.id.rollno;

/**
 * Created by MHC on 7/7/2016.
 */

public class signup extends AppCompatActivity implements View.OnClickListener {

    private static final String REGISTER_URL = "http://anonloger.com/inoregister.php";

    public static final String KEY_NAME = "name";
    public static final String KEY_ROLL = "rollno";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_CNFPASSWORD = "cnfpassword";
    public static final String KEY_MOBNO = "mobno";


    private EditText editTextname;
    private EditText editTextrollno;
    private EditText editTextPassword;
    private EditText editTextcnfPassword;
    private EditText editTextmobno;

    private Button buttonRegister1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        editTextname = (EditText) findViewById(R.id.name);
        editTextPassword = (EditText) findViewById(R.id.Password);
        editTextcnfPassword=(EditText)findViewById(R.id.cnfpassword);
        editTextrollno= (EditText) findViewById(rollno);
        editTextmobno=(EditText)findViewById(R.id.mobno);
        buttonRegister1 = (Button) findViewById(R.id.buttonRegister1);

        buttonRegister1.setOnClickListener(this);
    }

    private void signup(){
        final String name = editTextname.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();
        final String cnfpassword=editTextcnfPassword.getText().toString().trim();
        final String rollno=editTextrollno.getText().toString().trim();
        final String mobno=editTextmobno.getText().toString().trim();

if (mobno.length()==10) {
    register(name, rollno, password, mobno);
}
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Toast.makeText(signup.this,response,Toast.LENGTH_LONG).show();
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(signup.this,error.toString(),Toast.LENGTH_LONG).show();
//                    }
//                }){
//            @Override
//            protected Map<String,String> getParams(){
//                Map<String,String> params = new HashMap<>();
//                params.put(KEY_NAME,name);
//                params.put(KEY_PASSWORD,password);
//                params.put(KEY_ROLL,rollno);
//                params.put(KEY_MOBNO,mobno);
//                return params;
//            }
//
//        };
//
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest);
    }



    private void register(String name, String rollno, String password, String mobno) {
        class RegisterUser extends AsyncTask<String, Void, String> {
            ProgressDialog loading;
            register ruc = new register();


            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(signup.this, "Please Wait",null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(String... params) {

                HashMap<String, String> data = new HashMap<>();
                data.put("name",params[0]);
                data.put("rollno",params[1]);
                data.put("password",params[2]);
                data.put("mobno",params[3]);

                String result = ruc.sendPostRequest(REGISTER_URL,data);

                return  result;
            }
        }

        RegisterUser ru = new RegisterUser();
        ru.execute(name,rollno,password,mobno);

    }

    @Override
    public void onClick(View v) {
        if(v == buttonRegister1){
            signup();

        }

    }
    public void onlclick(View v){
        if (v.getId()==R.id.lgn){
            Intent a=new Intent(this,login.class);
            startActivity(a);
        }
    }

}
