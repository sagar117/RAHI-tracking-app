package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.model.Marker;
import com.rahi.mhc.inotrans.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.ADDRESS2;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.JSON_ARRAY;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.KEY_EMAIL;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.KEY_ID;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.KEY_NAME;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.STOP19;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.STOPA;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.address;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.address2;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.ids;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.names;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.stop13;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.stop19;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.stopA;

/**
 * Created by MHC on 6/22/2016.
 */

public class bustrace extends AppCompatActivity implements View.OnClickListener {

    public static final String BUSNO = "busnoa";

    public static final String JSON_URL = "http://anonloger.com/json.php";
    public static final String JSON_URL2 = "http://anonloger.com/json2.php";
    private Button buttonGet;
    DatabaseHelper dbHelper;
    private ListView listView;
    private List<bus> mlist;
    private busadaptar mbusadaptar;

    private String json;
    private Marker marker;

    public String ParseJSON(String json) {
        ParseJSON pj = new ParseJSON(json);
        pj.parseJSON();
        return json;
    }

    private JSONArray users = null;

    protected void parseJSON() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids = new String[users.length()];
            names = new String[users.length()];
            address = new String[users.length()];
            address2 = new String[users.length()];
//            address3=new String[users.length()];
//            cancle=new String[users.length()];
//            lat=new String[users.length()];
//            lng=new String[users.length()];
            stopA = new String[users.length()];

            stop19 = new String[users.length()];

            for (int i = 0; i < users.length(); i++) {
                JSONObject jo = users.getJSONObject(i);
                ids[i] = jo.getString(KEY_ID);
                names[i] = jo.getString(KEY_NAME);
                address[i] = jo.getString(KEY_EMAIL);
                address2[i] = jo.getString(ADDRESS2);
//                address3[i] = jo.getString(ADDRESS3);
//                cancle[i]=jo.getString(CANCEL);
////                lat[i]=jo.getString(LATITUDE);
////                lng[i]=jo.getString(LONGITUDE);
                stopA[i] = jo.getString(STOPA);

                stop19[i] = jo.getString(STOP19);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2);

        buttonGet = (Button) findViewById(R.id.buttonGet);
        buttonGet.setOnClickListener(this);
        listView = (ListView) findViewById(R.id.listView);


        String[]  UPSTATION = new String[]{
                "BHU BUS STOP/LANKA", "MMV(MAHILA MAHAVIDYALAY)", "KABIR COLONY MORE", "UNIVERSITY GUEST HOUSE MORE", "FACULTY OF MANAGEMENT STUDIES,MAITRI CANTEEN/FACULTY OF SOCIAL STUDIES",
                "SCIENCE FACULTY/DEPARTMENT OF MINING","FACULTY OF COMMERCE/DEPARTMENT OF GEOLOGY","VT (VISHWANATH TEMPLE) BUS STOP","IIT BHU MORE","CV RAMAN MORE","SRK HOSTEL MORE","BROCHA-DALMIA MORE","BROCHA-BIRLA MORE","BIRLA CHAURAHA","LD GUEST HOUSE MORE/INTERNATIONAL HOSTEL","HOLKAR BHAVAN MORE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, UPSTATION);
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.actv);
        textView.setAdapter(adapter);

        String[]  DOWNSTATION = new String[]{
                "BHU BUS STOP/LANKA", "MMV(MAHILA MAHAVIDYALAY)", "KABIR COLONY MORE", "UNIVERSITY GUEST HOUSE MORE", "FACULTY OF MANAGEMENT STUDIES,MAITRI CANTEEN/FACULTY OF SOCIAL STUDIES",
                "SCIENCE FACULTY/DEPARTMENT OF MINING","FACULTY OF COMMERCE/DEPARTMENT OF GEOLOGY","VT (VISHWANATH TEMPLE) BUS STOP","IIT BHU MORE","CV RAMAN MORE","SRK HOSTEL MORE","BROCHA-DALMIA MORE","BROCHA-BIRLA MORE","BIRLA CHAURAHA","LD GUEST HOUSE MORE/INTERNATIONAL HOSTEL","HOLKAR BHAVAN MORE"
        };
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, DOWNSTATION);
        AutoCompleteTextView textView2 = (AutoCompleteTextView) findViewById(R.id.actv2);
        textView2.setAdapter(adapter2);




//        Button btn = (Button) findViewById(R.id.busn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                qbus();
//
//            }
//        });


    }

//    private void qbus(){
//        EditText editTextbusnumber=(EditText)findViewById(R.id.busntv);
//        final String busnoa=editTextbusnumber.getText().toString().trim();
//
//        StringRequest stringRequest2 = new StringRequest(Request.Method.POST, JSON_URL2,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Toast.makeText(bustrace.this, response, Toast.LENGTH_SHORT).show();
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(bustrace.this, error.toString(), Toast.LENGTH_SHORT).show();
//                    }
//                }) {
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
//
//                params.put(BUSNO,busnoa);
//                return params;
//            }
//
//        };
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest2);
//
//
//        StringRequest stringRequest1 = new StringRequest(JSON_URL2,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        showJSON2(response);
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(bustrace.this, error.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });
//
//        RequestQueue requestQueue4 = Volley.newRequestQueue(this);
//        requestQueue4.add(stringRequest1);
//
//
//
//
//
//
//    }

    private void sendRequest() {

        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(bustrace.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void showJSON()  {
        String[]  UPSTATION = new String[]{
                "BHU BUS STOP/LANKA", "MMV(MAHILA MAHAVIDYALAY)", "KABIR COLONY MORE", "UNIVERSITY GUEST HOUSE MORE", "FACULTY OF MANAGEMENT STUDIES,MAITRI CANTEEN/FACULTY OF SOCIAL STUDIES",
                "SCIENCE FACULTY/DEPARTMENT OF MINING","FACULTY OF COMMERCE/DEPARTMENT OF GEOLOGY","VT (VISHWANATH TEMPLE) BUS STOP","IIT BHU MORE","CV RAMAN MORE","SRK HOSTEL MORE","BROCHA-DALMIA MORE","BROCHA-BIRLA MORE","BIRLA CHAURAHA","LD GUEST HOUSE MORE/INTERNATIONAL HOSTEL","HOLKAR BHAVAN MORE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, UPSTATION);
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.actv);
        textView.setAdapter(adapter);


        String[]  DOWNSTATION = new String[]{
                "BHU BUS STOP/LANKA", "MMV(MAHILA MAHAVIDYALAY)", "KABIR COLONY MORE", "UNIVERSITY GUEST HOUSE MORE", "FACULTY OF MANAGEMENT STUDIES,MAITRI CANTEEN/FACULTY OF SOCIAL STUDIES",
                "SCIENCE FACULTY/DEPARTMENT OF MINING","FACULTY OF COMMERCE/DEPARTMENT OF GEOLOGY","VT (VISHWANATH TEMPLE) BUS STOP","IIT BHU MORE","CV RAMAN MORE","SRK HOSTEL MORE","BROCHA-DALMIA MORE","BROCHA-BIRLA MORE","BIRLA CHAURAHA","LD GUEST HOUSE MORE/INTERNATIONAL HOSTEL","HOLKAR BHAVAN MORE"
        };
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, DOWNSTATION);
        AutoCompleteTextView textView2 = (AutoCompleteTextView) findViewById(R.id.actv2);
        textView2.setAdapter(adapter2);
        String a=textView.getText().toString();
        String b=textView2.getText().toString();
        Button btn;

        if ((a.equals("BHU BUS STOP/LANKA") || a.equals("MMV(MAHILA MAHAVIDYALAY)") || a.equals("KABIR COLONY MORE") || a.equals("UNIVERSITY GUEST HOUSE MORE")|| a.equals("FACULTY OF MANAGEMENT STUDIES,MAITRI CANTEEN/FACULTY OF SOCIAL STUDIES")|| a.equals("BHU BUS STOP/LANKA")&& a.equals("BHU BUS STOP/LANKA")|| a.equals("BHU BUS STOP/LANKA")||
                a.equals("SCIENCE FACULTY/DEPARTMENT OF MINING")|| a.equals("FACULTY OF COMMERCE/DEPARTMENT OF GEOLOGY")|| a.equals("VT (VISHWANATH TEMPLE) BUS STOP") || a.equals("IIT BHU MORE")|| a.equals("SRK HOSTEL MORE")|| a.equals("BROCHA-DALMIA MORE")|| a.equals("BIRLA CHAURAHA")|| a.equals("LD GUEST HOUSE MORE/INTERNATIONAL HOSTEL")|| a.equals("HOLKAR BHAVAN MORE")) &&
                ( b.equals("BHU BUS STOP/LANKA") || b.equals("MMV(MAHILA MAHAVIDYALAY)")|| b.equals("KABIR COLONY MORE") || b.equals("UNIVERSITY GUEST HOUSE MORE")|| b.equals("FACULTY OF MANAGEMENT STUDIES,MAITRI CANTEEN/FACULTY OF SOCIAL STUDIES")|| b.equals("BHU BUS STOP/LANKA")|| b.equals("BHU BUS STOP/LANKA")|| b.equals("BHU BUS STOP/LANKA")||
                        b.equals("SCIENCE FACULTY/DEPARTMENT OF MINING")|| b.equals("FACULTY OF COMMERCE/DEPARTMENT OF GEOLOGY")|| b.equals("VT (VISHWANATH TEMPLE) BUS STOP") || b.equals("IIT BHU MORE")|| b.equals("SRK HOSTEL MORE")|| b.equals("BROCHA-DALMIA MORE")|| b.equals("BIRLA CHAURAHA")|| b.equals("LD GUEST HOUSE MORE/INTERNATIONAL HOSTEL")|| b.equals("HOLKAR BHAVAN MORE"))) {


//            File database=getApplicationContext().getDatabasePath(dbHelper.DATABASE_NAME);
//            if (!database.exists()){
//                Toast.makeText(bustrace.this, "SORRY THERE ARE NO BUSES TO SHOW",
//                        Toast.LENGTH_LONG).show();
//
//
//                if (copyDatabase(this)){
//                    Toast.makeText(bustrace.this, "SORRY THERE ARE NO BUSES TO SHOW true",
//                            Toast.LENGTH_LONG).show();
//
//                }else{
//                    Toast.makeText(bustrace.this, "SORRY THERE ARE NO BUSES TO SHOW false",
//                            Toast.LENGTH_LONG).show();
//
//                }
//
//            }
//
//            dbHelper.getReadableDatabase();
//            mlist=dbHelper.getdata();
//            mbusadaptar=new busadaptar(this,mlist);
//            listView.setAdapter(mbusadaptar);
//            ParseJSON pj = new ParseJSON(json);
//            pj.parseJSON();
//            final CustomList cl = new CustomList(this, ParseJSON.ids, stopA, names, address, address2, stop13);
//            listView.setAdapter(cl);
//
//
//
//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                    Intent c = new Intent(bustrace.this, singlebus.class);
//                    ListView listView=(ListView)findViewById(R.id.listView);
//                    String a=cl.getItem(position);
//
//
//
//                    c.putExtra("b", a);
//                    Toast.makeText(bustrace.this, a,
//                            Toast.LENGTH_LONG).show();
//                    startActivity(c);
////                 c.putExtra(ParseJSON.ids);
//                }
//
//            });
            Intent p=new Intent(bustrace.this,sbus.class);
            startActivity(p);

        }else {

            Toast.makeText(bustrace.this, "SORRY THERE ARE NO BUSES TO SHOW",
                    Toast.LENGTH_LONG).show();
        }
    }



    public void showJSON2(String json)  {

            ParseJSON pj = new ParseJSON(json);
            pj.parseJSON();
            final CustomList cl = new CustomList(this, ParseJSON.ids, stopA, names, address, address2, stop13);
            listView.setAdapter(cl);



            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent c = new Intent(bustrace.this, singlebus.class);
                    ListView listView=(ListView)findViewById(R.id.listView);
                    String a=cl.getItem(position);



                    c.putExtra("b", a);
                    Toast.makeText(bustrace.this, a,
                            Toast.LENGTH_LONG).show();
                    startActivity(c);
//                 c.putExtra(ParseJSON.ids);
                }

            });

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonGet) {

            showJSON();


            InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }


//    public void onnoclick(View v) {
//        if (v.getId() == R.id.busn) {
//            sendRequestb(json);
//        }
//    }

//    private void sendRequestb(String json) {
//
//try {
//
//
//        EditText editText = (EditText) findViewById(R.id.busntv);
//
//    Editable input1 = editText.getText();
//
//    String input=input1.toString();
//    if (input!=null) {
//        setContentView(R.layout.list_item);
//        int i = Integer.parseInt(input);
//
//        ParseJSON pj = new ParseJSON(json);
//        pj.parseJSON();
//        String[] id = ParseJSON.ids;
//        String[] name = ParseJSON.names;
//        String[] addres = ParseJSON.address;
//        String[] addres2 = ParseJSON.address2;
//        String[] stopa = ParseJSON.stopA;
//        String[] stop19 = ParseJSON.stop19;
//
//        String idno = ParseJSON(id[i]);
//        String nameno = ParseJSON(name[i]);
//        String addressno = ParseJSON(addres[i]);
//        String adddress2no = ParseJSON(addres2[i]);
//        String sa = ParseJSON(stopa[i]);
//        String s19 = ParseJSON(stop19[i]);
//
//        TextView textViewId = (TextView) findViewById(R.id.id);
//        TextView textViewEmail = (TextView) findViewById(R.id.adress);
//        TextView textViewadd1 = (TextView) findViewById(R.id.end);
//        TextView tvbusa = (TextView) findViewById(R.id.stopa);
//        TextView tvbus19 = (TextView) findViewById(R.id.stopz);
//
//        textViewId.setText(idno);
//        textViewEmail.setText(addressno);
//        textViewadd1.setText(adddress2no);
//        tvbusa.setText(sa);
//        tvbus19.setText(s19);
//    }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
////
//    }


    public void onbclick(View view) {
        if (view.getId() == R.id.golive) {
            ListView listView=(ListView)findViewById(R.id.listView);
            final int position = listView.getPositionForView((View) view.getParent());
            String g=Integer.toString(position);

            Intent intent = new Intent(bustrace.this, MapsActivity.class);

            String  a = null;
            if (g==null) {
                intent.putExtra("a", 5);
                Toast.makeText(bustrace.this, position,
                        Toast.LENGTH_LONG).show();
            }else{
                intent.putExtra("a", g);
                Toast.makeText(bustrace.this, g,
                        Toast.LENGTH_LONG).show();
            }
            startActivity(intent);
//            Bundle bundle=new Bundle();
//            bundle.putInt("d",position);
//            MapsActivity mapsActivity = new MapsActivity();
//            mapsActivity.


        }

    }

}

