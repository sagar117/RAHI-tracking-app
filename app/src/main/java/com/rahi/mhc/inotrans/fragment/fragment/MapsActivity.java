package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.rahi.mhc.inotrans.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Locale;

import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.JSON_ARRAY;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.KEY_ID;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.ids;
import static com.rahi.mhc.inotrans.fragment.fragment.ParselJSON.lat;
import static com.rahi.mhc.inotrans.fragment.fragment.ParselJSON.lng;


public class MapsActivity extends FragmentActivity {

    bustrace bus=new bustrace();

    public static final String LATITUDE = "lat";
    public static final String LONGITUDE = "lng";

//    String a = ParselJSON(lat[1]);
//    String b = ParselJSON(lng[1]);
//
//    final double j = Double.parseDouble(a);
//    final double k = Double.parseDouble(b);


    public static final String JSON_URL = "http://anonloger.com/json.php";
    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private String json;
    private Marker marker;

    public String ParselJSON(String json) {
        ParselJSON pj = new ParselJSON(json);
        pj.parselJSON();
        return json;
    }

    private JSONArray users = null;

    protected void ParselJSON() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids = new String[users.length()];

            lat = new String[users.length()];
            lng = new String[users.length()];


            for (int i = 0; i < users.length(); i++) {
                JSONObject jo = users.getJSONObject(i);
                ids[i] = jo.getString(KEY_ID);

                lat[i] = jo.getString(LATITUDE);
                lng[i] = jo.getString(LONGITUDE);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();







    }

    private void sendRequest() {

        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        setUpMap(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MapsActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }

    private void setUpMap(String json) {


        String data = getIntent().getStringExtra("a");

        int s=Integer.parseInt(data);






        ParselJSON pj = new ParselJSON(json);
        pj.parselJSON();
        String[] id = ParselJSON.ids;
        String[] lat = ParselJSON.lat;
        String[] lng = ParselJSON.lng;
        String[]  name=ParselJSON.names;
         String a = ParselJSON(lat[s]);
        String b = ParselJSON(lng[s]);
        String c=ParselJSON(name[s]);

        final double j = Double.parseDouble(a);
        final double k = Double.parseDouble(b);


        mMap.addMarker(new MarkerOptions().position(new LatLng(j, k)).title(c).icon(BitmapDescriptorFactory.fromResource(R.mipmap.busmarker)));
        final float zoomLevel = (float) 18.0; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(j, k), zoomLevel));
//            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(j,k),zoomLevel));
        getCompleteAddressString(j, k);


    }


    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }


    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            sendRequest();

//            if (mMap != null) {
//                final Handler h = new Handler();
//                final int delay = 10; //milliseconds
//
//                h.postDelayed(new Runnable() {
//                    public void run() {
//                        sendRequest();
//                        h.postDelayed(this, delay);
//                    }
//                }, delay);
//        }
        }
    }

    private String getCompleteAddressString(double LATITUDE, double LONGITUDE) {

        String strAdd = "";
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1);
            if (addresses != null) {
                Address returnedAddress = addresses.get(0);
                StringBuilder strReturnedAddress = new StringBuilder("");

                for (int i = 0; i < returnedAddress.getMaxAddressLineIndex(); i++) {
                    strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n");
                }
                strAdd = strReturnedAddress.toString();
                String message = String.format(
                        strReturnedAddress.toString()

                );
                TextView tv = (TextView) findViewById(R.id.cstation);
                tv.setText(message);

//                Toast.makeText(MapsActivity.this, message,
//                        Toast.LENGTH_LONG).show();

//                Log.w("My address", "" + strReturnedAddress.toString());
            } else {
                Log.w("My address", "No Address returned!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("My address", "Cannot get Address!");
        }
        return strAdd;
    }


    //    private void setUpMap() {
//
//
//            mMap.addMarker(new MarkerOptions().position(new LatLng(j, k)).title("Marker"));
//
//            mMap.setMyLocationEnabled(true);
//            final float zoomLevel = (float) 18.0; //This goes up to 21
//            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(j, k), zoomLevel));
////            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(j,k),zoomLevel));
//            getCompleteAddressString(j, k);
//
////
//
//
//    }
    public void oncclick(View view) {

        if (view.getId() == R.id.refresh) {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
    }
}


