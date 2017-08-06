package com.rahi.mhc.inotrans.fragment.fragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by MHC on 7/3/2016.
 */


public class ParselJSON {
    public static String[] ids;
    public static String[] names;

    public static String[] lat;
    public static String[] lng;


    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";

    public static final String LATITUDE = "lat";
    public static final String LONGITUDE="lng";



    private JSONArray users = null;

    private String json;

    public ParselJSON(String json){
        this.json = json;
    }

    protected void parselJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids = new String[users.length()];
            names = new String[users.length()];

            lat=new String[users.length()];
            lng=new String[users.length()];


            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids[i] = jo.getString(KEY_ID);
                names[i] = jo.getString(KEY_NAME);

                lat[i]=jo.getString(LATITUDE);
                lng[i]=jo.getString(LONGITUDE);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
