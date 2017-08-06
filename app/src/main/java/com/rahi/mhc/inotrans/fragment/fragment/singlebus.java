package com.rahi.mhc.inotrans.fragment.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.rahi.mhc.inotrans.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.JSON_ARRAY;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.KEY_ID;
import static com.rahi.mhc.inotrans.fragment.fragment.ParseJSON.ids;
import static com.rahi.mhc.inotrans.fragment.fragment.ParselJSON.lat;
import static com.rahi.mhc.inotrans.fragment.fragment.ParselJSON.lng;

/**
 * Created by MHC on 6/30/2016.
 */

public class singlebus extends AppCompatActivity {


    public static final String JSON_URL = "http://anonloger.com/json.php";

    private Button buttonGet;
    private String json;
    private ListView listView;


    public String ParseJSON(String json) {
        ParselJSON pj = new ParselJSON(json);
        pj.parselJSON();
        return json;
    }

    private JSONArray users = null;

    protected void ParseJSON() {
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


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlebuslv2);
        sendRequest();


    }

    private void sendRequest() {

        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        station(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(singlebus.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }


    private void station(String json) {

        TextView mh=(TextView)findViewById(R.id.mainh);
        TextView sub1=(TextView)findViewById(R.id.sub1);
        TextView sub2=(TextView)findViewById(R.id.sub2);

        TextView stptv1=(TextView)findViewById(R.id.stop1);
        TextView stptv2=(TextView)findViewById(R.id.stop2);
        TextView stptv3=(TextView)findViewById(R.id.stop3);
        TextView stptv4=(TextView)findViewById(R.id.stop4);
        TextView stptv5=(TextView)findViewById(R.id.stop5);
        TextView stptv6=(TextView)findViewById(R.id.stop6);
        TextView stptv7=(TextView)findViewById(R.id.stop7);
        TextView stptv8=(TextView)findViewById(R.id.stop8);
        TextView stptv9=(TextView)findViewById(R.id.stop9);
        TextView stptv10=(TextView)findViewById(R.id.stop10);
        TextView stptv11=(TextView)findViewById(R.id.stop11);
        TextView stptv12=(TextView)findViewById(R.id.stop12);
        TextView stptv13=(TextView)findViewById(R.id.stop13);
        TextView stptv14=(TextView)findViewById(R.id.stop14);
        TextView stptv15=(TextView)findViewById(R.id.stop15);
        TextView stptv16=(TextView)findViewById(R.id.stop16);
        TextView stptv17=(TextView)findViewById(R.id.stop17);
        TextView stptv18=(TextView)findViewById(R.id.stop18);
        TextView stptv19=(TextView)findViewById(R.id.stop19);
        TextView stptv20=(TextView)findViewById(R.id.stop20);
        TextView stptv21=(TextView)findViewById(R.id.stop21);
        TextView stptv22=(TextView)findViewById(R.id.stop22);
        TextView stptv23=(TextView)findViewById(R.id.stop23);
        TextView stptv24=(TextView)findViewById(R.id.stop24);
        TextView stptv25=(TextView)findViewById(R.id.stop25);
        TextView stptv26=(TextView)findViewById(R.id.stop26);
        TextView stptv27=(TextView)findViewById(R.id.stop27);
        TextView stptv28=(TextView)findViewById(R.id.stop28);
        TextView stptv29=(TextView)findViewById(R.id.stop29);
        TextView stptv30=(TextView)findViewById(R.id.stop30);
        TextView stptv31=(TextView)findViewById(R.id.stop31);
        TextView stptv32=(TextView)findViewById(R.id.stop32);
        TextView stptv33=(TextView)findViewById(R.id.stop33);
        TextView stptv34=(TextView)findViewById(R.id.stop34);
        TextView stptv35=(TextView)findViewById(R.id.stop35);
        TextView stptv36=(TextView)findViewById(R.id.stop36);
        TextView stptv37=(TextView)findViewById(R.id.stop37);
        TextView stptv38=(TextView)findViewById(R.id.stop38);
        TextView stptv39=(TextView)findViewById(R.id.stop39);
        TextView stptv40=(TextView)findViewById(R.id.stop40);
        TextView stptv41=(TextView)findViewById(R.id.stop41);
        TextView stptv42=(TextView)findViewById(R.id.stop42);
        TextView stptv43=(TextView)findViewById(R.id.stop43);
        TextView stptv44=(TextView)findViewById(R.id.stop44);
        TextView stptv45=(TextView)findViewById(R.id.stop45);
        TextView stptv46=(TextView)findViewById(R.id.stop46);
        TextView stptv47=(TextView)findViewById(R.id.stop47);
        TextView stptv48=(TextView)findViewById(R.id.stop48);
        TextView stptv49=(TextView)findViewById(R.id.stop49);
        TextView stptv50=(TextView)findViewById(R.id.stop50);
        TextView stptv51=(TextView)findViewById(R.id.stop51);
        TextView stptv52=(TextView)findViewById(R.id.stop52);
        TextView stptv53=(TextView)findViewById(R.id.stop53);
        TextView stptv54=(TextView)findViewById(R.id.stop54);
        TextView stptv55=(TextView)findViewById(R.id.stop55);
        TextView stptv56=(TextView)findViewById(R.id.stop56);
        TextView stptv57=(TextView)findViewById(R.id.stop57);
        TextView stptv58=(TextView)findViewById(R.id.stop58);
        TextView stptv59=(TextView)findViewById(R.id.stop59);
        TextView stptv60=(TextView)findViewById(R.id.stop60);
        TextView stptv61=(TextView)findViewById(R.id.stop61);
        TextView stptv62=(TextView)findViewById(R.id.stop62);
        TextView stptv63=(TextView)findViewById(R.id.stop63);
        TextView stptv64=(TextView)findViewById(R.id.stop64);
        TextView stptv65=(TextView)findViewById(R.id.stop65);
        TextView stptv66=(TextView)findViewById(R.id.stop66);
        TextView stptv67=(TextView)findViewById(R.id.stop67);
        TextView stptv68=(TextView)findViewById(R.id.stop68);
        TextView stptv69=(TextView)findViewById(R.id.stop69);
        TextView stptv70=(TextView)findViewById(R.id.stop70);
        TextView stptv71=(TextView)findViewById(R.id.stop71);
        TextView stptv72=(TextView)findViewById(R.id.stop72);
        TextView stptv73=(TextView)findViewById(R.id.stop73);
        TextView stptv74=(TextView)findViewById(R.id.stop74);
        TextView stptv75=(TextView)findViewById(R.id.stop75);
        TextView stptv76=(TextView)findViewById(R.id.stop76);
        TextView stptv77=(TextView)findViewById(R.id.stop77);
        TextView stptv78=(TextView)findViewById(R.id.stop78);
        TextView stptv79=(TextView)findViewById(R.id.stop79);
        TextView stptv80=(TextView)findViewById(R.id.stop80);
        TextView stptv81=(TextView)findViewById(R.id.stop81);
        TextView stptv82=(TextView)findViewById(R.id.stop82);
        TextView stptv83=(TextView)findViewById(R.id.stop83);
        TextView stptv84=(TextView)findViewById(R.id.stop84);
        TextView stptv85=(TextView)findViewById(R.id.stop85);
        TextView stptv86=(TextView)findViewById(R.id.stop86);
        TextView stptv87=(TextView)findViewById(R.id.stop87);
        TextView stptv88=(TextView)findViewById(R.id.stop88);
        TextView stptv89=(TextView)findViewById(R.id.stop89);
        TextView stptv90=(TextView)findViewById(R.id.stop90);

        TextView tmtv1=(TextView)findViewById(R.id.t1);
        TextView tmtv2=(TextView)findViewById(R.id.t2);
        TextView tmtv3=(TextView)findViewById(R.id.t3);
        TextView tmtv4=(TextView)findViewById(R.id.t4);
        TextView tmtv5=(TextView)findViewById(R.id.t5);
        TextView tmtv6=(TextView)findViewById(R.id.t6);
        TextView tmtv7=(TextView)findViewById(R.id.t7);
        TextView tmtv8=(TextView)findViewById(R.id.t8);
        TextView tmtv9=(TextView)findViewById(R.id.t9);
        TextView tmtv10=(TextView)findViewById(R.id.t10);
        TextView tmtv11=(TextView)findViewById(R.id.t11);
        TextView tmtv12=(TextView)findViewById(R.id.t12);
        TextView tmtv13=(TextView)findViewById(R.id.t13);
        TextView tmtv14=(TextView)findViewById(R.id.t14);
        TextView tmtv15=(TextView)findViewById(R.id.t15);
        TextView tmtv16=(TextView)findViewById(R.id.t16);
        TextView tmtv17=(TextView)findViewById(R.id.t17);
        TextView tmtv18=(TextView)findViewById(R.id.t18);
        TextView tmtv19=(TextView)findViewById(R.id.t19);
        TextView tmtv20=(TextView)findViewById(R.id.t20);
        TextView tmtv21=(TextView)findViewById(R.id.t21);
        TextView tmtv22=(TextView)findViewById(R.id.t22);
        TextView tmtv23=(TextView)findViewById(R.id.t23);
        TextView tmtv24=(TextView)findViewById(R.id.t24);
        TextView tmtv25=(TextView)findViewById(R.id.t25);
        TextView tmtv26=(TextView)findViewById(R.id.t26);
        TextView tmtv27=(TextView)findViewById(R.id.t27);
        TextView tmtv28=(TextView)findViewById(R.id.t28);
        TextView tmtv29=(TextView)findViewById(R.id.t29);
        TextView tmtv30=(TextView)findViewById(R.id.t30);
        TextView tmtv31=(TextView)findViewById(R.id.t31);
        TextView tmtv32=(TextView)findViewById(R.id.t32);
        TextView tmtv33=(TextView)findViewById(R.id.t33);
        TextView tmtv34=(TextView)findViewById(R.id.t34);
        TextView tmtv35=(TextView)findViewById(R.id.t35);
        TextView tmtv36=(TextView)findViewById(R.id.t36);
        TextView tmtv37=(TextView)findViewById(R.id.t37);
        TextView tmtv38=(TextView)findViewById(R.id.t38);
        TextView tmtv39=(TextView)findViewById(R.id.t39);
        TextView tmtv40=(TextView)findViewById(R.id.t40);
        TextView tmtv41=(TextView)findViewById(R.id.t41);
        TextView tmtv42=(TextView)findViewById(R.id.t42);
        TextView tmtv43=(TextView)findViewById(R.id.t43);
        TextView tmtv44=(TextView)findViewById(R.id.t44);
        TextView tmtv45=(TextView)findViewById(R.id.t45);
        TextView tmtv46=(TextView)findViewById(R.id.t46);
        TextView tmtv47=(TextView)findViewById(R.id.t47);
        TextView tmtv48=(TextView)findViewById(R.id.t48);
        TextView tmtv49=(TextView)findViewById(R.id.t49);
        TextView tmtv50=(TextView)findViewById(R.id.t50);
        TextView tmtv51=(TextView)findViewById(R.id.t51);
        TextView tmtv52=(TextView)findViewById(R.id.t52);
        TextView tmtv53=(TextView)findViewById(R.id.t53);
        TextView tmtv54=(TextView)findViewById(R.id.t54);
        TextView tmtv55=(TextView)findViewById(R.id.t55);
        TextView tmtv56=(TextView)findViewById(R.id.t56);
        TextView tmtv57=(TextView)findViewById(R.id.t57);
        TextView tmtv58=(TextView)findViewById(R.id.t58);
        TextView tmtv59=(TextView)findViewById(R.id.t59);
        TextView tmtv60=(TextView)findViewById(R.id.t60);
        TextView tmtv61=(TextView)findViewById(R.id.t61);
        TextView tmtv62=(TextView)findViewById(R.id.t62);
        TextView tmtv63=(TextView)findViewById(R.id.t63);
        TextView tmtv64=(TextView)findViewById(R.id.t64);
        TextView tmtv65=(TextView)findViewById(R.id.t65);
        TextView tmtv66=(TextView)findViewById(R.id.t66);
        TextView tmtv67=(TextView)findViewById(R.id.t67);
        TextView tmtv68=(TextView)findViewById(R.id.t68);
        TextView tmtv69=(TextView)findViewById(R.id.t69);
        TextView tmtv70=(TextView)findViewById(R.id.t70);
        TextView tmtv71=(TextView)findViewById(R.id.t71);
        TextView tmtv72=(TextView)findViewById(R.id.t72);
        TextView tmtv73=(TextView)findViewById(R.id.t73);
        TextView tmtv74=(TextView)findViewById(R.id.t74);
        TextView tmtv75=(TextView)findViewById(R.id.t75);
        TextView tmtv76=(TextView)findViewById(R.id.t76);
        TextView tmtv77=(TextView)findViewById(R.id.t77);
        TextView tmtv78=(TextView)findViewById(R.id.t78);
        TextView tmtv79=(TextView)findViewById(R.id.t79);
        TextView tmtv80=(TextView)findViewById(R.id.t80);
        TextView tmtv81=(TextView)findViewById(R.id.t81);
        TextView tmtv82=(TextView)findViewById(R.id.t82);
        TextView tmtv83=(TextView)findViewById(R.id.t83);
        TextView tmtv84=(TextView)findViewById(R.id.t84);
        TextView tmtv85=(TextView)findViewById(R.id.t85);
        TextView tmtv86=(TextView)findViewById(R.id.t86);
        TextView tmtv87=(TextView)findViewById(R.id.t87);
        TextView tmtv88=(TextView)findViewById(R.id.t88);
        TextView tmtv89=(TextView)findViewById(R.id.t89);
        TextView tmtv90=(TextView)findViewById(R.id.t90);




        String data = getIntent().getStringExtra("b");

        int s=Integer.parseInt(data);

        ParseJSON pj = new ParseJSON(json);
        pj.parseJSON();
        String[] id = ParseJSON.ids;
        String[] name = ParseJSON.names;
        String[] stpA = ParseJSON.stopA;

        String[] stp1 = ParseJSON.stop1;
        String[] stp2 = ParseJSON.stop2;
        String[] stp3 = ParseJSON.stop3;
        String[] stp4 = ParseJSON.stop4;
        String[] stp5 = ParseJSON.stop5;
        String[] stp6 = ParseJSON.stop6;
        String[] stp7 = ParseJSON.stop7;
        String[] stp8 = ParseJSON.stop8;
        String[] stp9 = ParseJSON.stop9;
        String[] stp10 = ParseJSON.stop10;
        String[] stp11 = ParseJSON.stop11;
        String[] stp12 = ParseJSON.stop12;
        String[] stp13 = ParseJSON.stop13;
        String[] stp14 = ParseJSON.stop14;
        String[] stp15 = ParseJSON.stop15;
        String[] stp16 = ParseJSON.stop16;
        String[] stp17= ParseJSON.stop17;
        String[] stp18 = ParseJSON.stop18;
        String[] stp19= ParseJSON.stop19;
        String[] stp20= ParseJSON.stop20;
        String[] stp21 = ParseJSON.stop21;
        String[] stp22= ParseJSON.stop22;
        String[] stp23 = ParseJSON.stop23;
        String[] stp24 = ParseJSON.stop24;
        String[] stp25 = ParseJSON.stop25;
        String[] stp26 = ParseJSON.stop26;
        String[] stp27 = ParseJSON.stop27;
        String[] stp28 = ParseJSON.stop28;
        String[] stp29 = ParseJSON.stop29;
        String[] stp30 = ParseJSON.stop30;
        String[] stp31 = ParseJSON.stop31;
        String[] stp32 = ParseJSON.stop32;
        String[] stp33 = ParseJSON.stop33;
        String[] stp34 = ParseJSON.stop34;
        String[] stp35 = ParseJSON.stop35;
        String[] stp36 = ParseJSON.stop36;
        String[] stp37 = ParseJSON.stop37;
        String[] stp38 = ParseJSON.stop38;
        String[] stp39 = ParseJSON.stop39;
        String[] stp40 = ParseJSON.stop40;
        String[] stp41 = ParseJSON.stop41;
        String[] stp42 = ParseJSON.stop42;
        String[] stp43 = ParseJSON.stop43;
        String[] stp44 = ParseJSON.stop44;
        String[] stp45 = ParseJSON.stop45;
        String[] stp46 = ParseJSON.stop46;
        String[] stp47 = ParseJSON.stop47;
        String[] stp48 = ParseJSON.stop48;
        String[] stp49 = ParseJSON.stop49;
        String[] stp50 = ParseJSON.stop50;
        String[] stp51 = ParseJSON.stop51;
        String[] stp52 = ParseJSON.stop52;
        String[] stp53 = ParseJSON.stop53;
        String[] stp54 = ParseJSON.stop54;
        String[] stp55 = ParseJSON.stop55;
        String[] stp56 = ParseJSON.stop56;
        String[] stp57 = ParseJSON.stop57;
        String[] stp58 = ParseJSON.stop58;
        String[] stp59 = ParseJSON.stop59;
        String[] stp60 = ParseJSON.stop60;
        String[] stp61 = ParseJSON.stop61;
        String[] stp62 = ParseJSON.stop62;
        String[] stp63 = ParseJSON.stop63;
        String[] stp64 = ParseJSON.stop64;
        String[] stp65 = ParseJSON.stop65;
        String[] stp66 = ParseJSON.stop66;
        String[] stp67 = ParseJSON.stop67;
        String[] stp68 = ParseJSON.stop68;
        String[] stp69 = ParseJSON.stop69;
        String[] stp70 = ParseJSON.stop70;
        String[] stp71 = ParseJSON.stop71;
        String[] stp72 = ParseJSON.stop72;
        String[] stp73 = ParseJSON.stop73;
        String[] stp74 = ParseJSON.stop74;
        String[] stp75 = ParseJSON.stop75;
        String[] stp76 = ParseJSON.stop76;
        String[] stp77 = ParseJSON.stop77;
        String[] stp78 = ParseJSON.stop78;
        String[] stp79 = ParseJSON.stop79;
        String[] stp80 = ParseJSON.stop80;
        String[] stp81 = ParseJSON.stop81;
        String[] stp82 = ParseJSON.stop82;
        String[] stp83 = ParseJSON.stop83;
        String[] stp84 = ParseJSON.stop84;
        String[] stp85 = ParseJSON.stop85;
        String[] stp86 = ParseJSON.stop86;
        String[] stp87 = ParseJSON.stop87;
        String[] stp88 = ParseJSON.stop88;
        String[] stp89 = ParseJSON.stop89;
        String[] stp90 = ParseJSON.stop90;




        String[] time1 = ParseJSON.time1;
        String[] time2 = ParseJSON.time2;
        String[] time3 = ParseJSON.time3;
        String[] time4 = ParseJSON.time4;
        String[] time5 = ParseJSON.time5;
        String[] time6 = ParseJSON.time6;
        String[] time7 = ParseJSON.time7;
        String[] time8 = ParseJSON.time8;
        String[] time9 = ParseJSON.time9;
        String[] time10 = ParseJSON.time10;
        String[] time11 = ParseJSON.time11;
        String[] time12= ParseJSON.time12;
        String[] time13 = ParseJSON.time13;
        String[] time14 = ParseJSON.time14;
        String[] time15 = ParseJSON.time15;
        String[] time16 = ParseJSON.time16;
        String[] time17 = ParseJSON.time17;
        String[] time18 = ParseJSON.time18;
        String[] time19 = ParseJSON.time19;
        String[] time20 = ParseJSON.time20;
        String[] time21 = ParseJSON.time21;
        String[] time22 = ParseJSON.time22;
        String[] time23 = ParseJSON.time23;
        String[] time24 = ParseJSON.time24;
        String[] time25 = ParseJSON.time25;
        String[] time26 = ParseJSON.time26;
        String[] time27 = ParseJSON.time27;
        String[] time28 = ParseJSON.time28;
        String[] time29 = ParseJSON.time29;
        String[] time30 = ParseJSON.time30;
        String[] time31 = ParseJSON.time31;
        String[] time32= ParseJSON.time32;
        String[] time33 = ParseJSON.time33;
        String[] time34 = ParseJSON.time34;
        String[] time35 = ParseJSON.time35;
        String[] time36 = ParseJSON.time36;
        String[] time37 = ParseJSON.time37;
        String[] time38 = ParseJSON.time38;
        String[] time39 = ParseJSON.time39;
        String[] time40 = ParseJSON.time30;
        String[] time41 = ParseJSON.time41;
        String[] time42 = ParseJSON.time42;
        String[] time43 = ParseJSON.time43;
        String[] time44 = ParseJSON.time44;
        String[] time45 = ParseJSON.time45;
        String[] time46 = ParseJSON.time46;
        String[] time47 = ParseJSON.time47;
        String[] time48 = ParseJSON.time48;
        String[] time49 = ParseJSON.time49;
        String[] time50 = ParseJSON.time40;
        String[] time51 = ParseJSON.time51;
        String[] time52= ParseJSON.time52;
        String[] time53 = ParseJSON.time53;
        String[] time54 = ParseJSON.time54;
        String[] time55 = ParseJSON.time55;
        String[] time56 = ParseJSON.time56;
        String[] time57 = ParseJSON.time57;
        String[] time58 = ParseJSON.time58;
        String[] time59 = ParseJSON.time59;
        String[] time60 = ParseJSON.time60;
        String[] time61 = ParseJSON.time61;
        String[] time62 = ParseJSON.time62;
        String[] time63 = ParseJSON.time63;
        String[] time64 = ParseJSON.time64;
        String[] time65 = ParseJSON.time65;
        String[] time66 = ParseJSON.time66;
        String[] time67 = ParseJSON.time67;
        String[] time68 = ParseJSON.time68;
        String[] time69 = ParseJSON.time69;
        String[] time70 = ParseJSON.time70;
        String[] time71 = ParseJSON.time71;
        String[] time72= ParseJSON.time72;
        String[] time73 = ParseJSON.time73;
        String[] time74 = ParseJSON.time74;
        String[] time75 = ParseJSON.time75;
        String[] time76 = ParseJSON.time76;
        String[] time77 = ParseJSON.time77;
        String[] time78 = ParseJSON.time78;
        String[] time79 = ParseJSON.time79;
        String[] time80 = ParseJSON.time80;
        String[] time81 = ParseJSON.time81;
        String[] time82= ParseJSON.time82;
        String[] time83 = ParseJSON.time83;
        String[] time84 = ParseJSON.time84;
        String[] time85 = ParseJSON.time85;
        String[] time86 = ParseJSON.time86;
        String[] time87 = ParseJSON.time87;
        String[] time88 = ParseJSON.time88;
        String[] time89 = ParseJSON.time89;
        String[] time90 = ParseJSON.time90;



        String a1=ParseJSON(id[s]);
        String a = ParseJSON(name[s-1]);
        String b = ParseJSON(stpA[s-1]);
        String c=ParseJSON(stp10[s-1]);
        String d=ParseJSON(stp1[s-1]);
        String e=ParseJSON(stp2[s-1]);
        String f=ParseJSON(stp3[s-1]);
        String g=ParseJSON(stp4[s-1]);
        String h=ParseJSON(stp5[s-1]);
        String i=ParseJSON(stp6[s-1]);
        String j=ParseJSON(stp7[s-1]);
        String k=ParseJSON(stp8[s-1]);
        String l=ParseJSON(stp9[s-1]);
        String m=ParseJSON(stp11[s-1]);
        String n=ParseJSON(stp12[s-1]);
        String o=ParseJSON(stp13[s-1]);
        String p = ParseJSON(stp14[s-1]);
        String q = ParseJSON(stp15[s-1]);
        String r=ParseJSON(stp16[s-1]);
        String sz=ParseJSON(stp17[s-1]);
        String t=ParseJSON(stp18[s-1]);
        String u=ParseJSON(stp19[s-1]);
        String v=ParseJSON(stp20[s-1]);
        String w=ParseJSON(stp21[s-1]);
        String x=ParseJSON(stp22[s-1]);
        String y=ParseJSON(stp23[s-1]);
        String z=ParseJSON(stp24[s-1]);
        String ab=ParseJSON(stp25[s-1]);
        String bb=ParseJSON(stp26[s-1]);
        String cb=ParseJSON(stp27[s-1]);
        String db=ParseJSON(stp28[s-1]);
        String eb = ParseJSON(stp29[s-1]);
        String fb = ParseJSON(stp30[s-1]);
        String gb=ParseJSON(stp31[s-1]);
        String hb=ParseJSON(stp32[s-1]);
        String ib=ParseJSON(stp33[s-1]);
        String jb=ParseJSON(stp34[s-1]);
        String kb=ParseJSON(stp35[s-1]);
        String lb=ParseJSON(stp36[s-1]);
        String mb=ParseJSON(stp37[s-1]);
        String nb=ParseJSON(stp38[s-1]);
        String ob=ParseJSON(stp39[s-1]);
        String pb=ParseJSON(stp40[s-1]);
        String qb=ParseJSON(stp41[s-1]);
        String rb=ParseJSON(stp42[s-1]);
        String sb=ParseJSON(stp43[s-1]);
        String tb = ParseJSON(stp44[s-1]);
        String ub= ParseJSON(stp45[s-1]);
        String vb=ParseJSON(stp46[s-1]);
        String wb=ParseJSON(stp47[s-1]);
        String xb=ParseJSON(stp48[s-1]);
        String yb=ParseJSON(stp49[s-1]);
        String zb=ParseJSON(stp50[s-1]);
        String ac=ParseJSON(stp51[s-1]);
        String bc=ParseJSON(stp52[s-1]);
        String cc=ParseJSON(stp53[s-1]);
        String dc=ParseJSON(stp54[s-1]);
        String ec=ParseJSON(stp55[s-1]);
        String fc=ParseJSON(stp56[s-1]);
        String gc=ParseJSON(stp57[s-1]);
        String hc=ParseJSON(stp58[s-1]);
        String ic= ParseJSON(stp59[s-1]);
        String jc= ParseJSON(stp60[s-1]);
        String kc=ParseJSON(stp61[s-1]);
        String lc=ParseJSON(stp62[s-1]);
        String mc=ParseJSON(stp63[s-1]);
        String nc=ParseJSON(stp64[s-1]);
        String oc=ParseJSON(stp65[s-1]);
        String pc=ParseJSON(stp65[s-1]);
        String qc=ParseJSON(stp66[s-1]);
        String rc=ParseJSON(stp67[s-1]);
        String sc=ParseJSON(stp68[s-1]);
        String tc=ParseJSON(stp69[s-1]);
        String uc=ParseJSON(stp70[s-1]);
        String vc=ParseJSON(stp71[s-1]);
        String wc=ParseJSON(stp72[s-1]);
        String xc= ParseJSON(stp73[s-1]);
        String yc= ParseJSON(stp74[s-1]);
        String zc=ParseJSON(stp75[s-1]);
        String ad=ParseJSON(stp76[s-1]);
        String bd=ParseJSON(stp77[s-1]);
        String cd=ParseJSON(stp78[s-1]);
        String dd=ParseJSON(stp79[s-1]);
        String ed=ParseJSON(stp80[s-1]);
        String fd=ParseJSON(stp81[s-1]);
        String gd=ParseJSON(stp82[s-1]);
        String hd=ParseJSON(stp83[s-1]);
        String imd=ParseJSON(stp84[s-1]);
        String jd=ParseJSON(stp85[s-1]);
        String kd=ParseJSON(stp86[s-1]);
        String ld=ParseJSON(stp87[s-1]);
        String md= ParseJSON(stp88[s-1]);
        String nd= ParseJSON(stp89[s-1]);
        String od=ParseJSON(stp90[s-1]);

        String a2 = ParseJSON(time1[s-1]);
        String b2 = ParseJSON(time2[s-1]);
        String c2=ParseJSON(time3[s-1]);
        String d2=ParseJSON(time4[s-1]);
        String e2=ParseJSON(time5[s-1]);
        String f2=ParseJSON(time6[s-1]);
        String g2=ParseJSON(time7[s-1]);
        String h2=ParseJSON(time8[s-1]);
        String i2=ParseJSON(time9[s-1]);
        String j2=ParseJSON(time10[s-1]);
        String k2=ParseJSON(time11[s-1]);
        String l2=ParseJSON(time12[s-1]);
        String m2=ParseJSON(time13[s-1]);
        String n2 = ParseJSON(time14[s-1]);
        String o2 = ParseJSON(time15[s-1]);
        String p2=ParseJSON(time16[s-1]);
        String q2=ParseJSON(time17[s-1]);
        String r2=ParseJSON(time18[s-1]);
        String s2=ParseJSON(time19[s-1]);
        String t2=ParseJSON(time20[s-1]);
        String u2 = ParseJSON(time21[s-1]);
        String v2 = ParseJSON(time22[s-1]);
        String w2=ParseJSON(time23[s-1]);
        String x2=ParseJSON(time24[s-1]);
        String y2=ParseJSON(time25[s-1]);
        String z2=ParseJSON(time26[s-1]);
        String ab2=ParseJSON(time27[s-1]);
        String bb2=ParseJSON(time28[s-1]);
        String cb2=ParseJSON(time29[s-1]);
        String db2=ParseJSON(time30[s-1]);
        String eb2=ParseJSON(time31[s-1]);
        String fb2=ParseJSON(time32[s-1]);
        String gb2=ParseJSON(time33[s-1]);
        String hb2 = ParseJSON(time34[s-1]);
        String ib2 = ParseJSON(time35[s-1]);
        String jb2=ParseJSON(time36[s-1]);
        String kb2=ParseJSON(time37[s-1]);
        String lb2=ParseJSON(time38[s-1]);
        String mb2=ParseJSON(time39[s-1]);
        String nb2=ParseJSON(time40[s-1]);
        String ob2 = ParseJSON(time41[s-1]);
        String pb2 = ParseJSON(time42[s-1]);
        String qb2=ParseJSON(time43[s-1]);
        String rb2=ParseJSON(time44[s-1]);
        String sb2=ParseJSON(time45[s-1]);
        String tb2=ParseJSON(time46[s-1]);
        String ub2=ParseJSON(time47[s-1]);
        String vb2=ParseJSON(time48[s-1]);
        String wb2=ParseJSON(time49[s-1]);
        String xb2=ParseJSON(time50[s-1]);
        String yb2=ParseJSON(time51[s-1]);
        String zb2=ParseJSON(time52[s-1]);
        String ac2=ParseJSON(time53[s-1]);
        String bc2 = ParseJSON(time54[s-1]);
        String cc2 = ParseJSON(time55[s-1]);
        String dc2=ParseJSON(time56[s-1]);
        String ec2=ParseJSON(time57[s-1]);
        String fc2=ParseJSON(time58[s-1]);
        String gc2=ParseJSON(time59[s-1]);
        String hc2=ParseJSON(time60[s-1]);
        String ic2 = ParseJSON(time61[s-1]);
        String jc2 = ParseJSON(time62[s-1]);
        String kc2=ParseJSON(time63[s-1]);
        String lc2=ParseJSON(time64[s-1]);
        String mc2=ParseJSON(time65[s-1]);
        String nc2=ParseJSON(time66[s-1]);
        String oc2=ParseJSON(time67[s-1]);
        String pc2=ParseJSON(time68[s-1]);
        String qc2=ParseJSON(time69[s-1]);
        String rc2=ParseJSON(time70[s-1]);
        String sc2=ParseJSON(time71[s-1]);
        String tc2=ParseJSON(time72[s-1]);
        String uc2=ParseJSON(time73[s-1]);
        String vc2 = ParseJSON(time74[s-1]);
        String wc2 = ParseJSON(time75[s-1]);
        String xc2=ParseJSON(time76[s-1]);
        String yc2=ParseJSON(time77[s-1]);
        String zc2=ParseJSON(time78[s-1]);
        String ad2=ParseJSON(time79[s-1]);
        String bd2=ParseJSON(time80[s-1]);
        String cd2 = ParseJSON(time81[s-1]);
        String dd2 = ParseJSON(time82[s-1]);
        String ed2=ParseJSON(time83[s-1]);
        String fd2=ParseJSON(time84[s-1]);
        String gd2=ParseJSON(time85[s-1]);
        String hd2=ParseJSON(time86[s-1]);
        String id2=ParseJSON(time87[s-1]);
        String jd2=ParseJSON(time88[s-1]);
        String kd2=ParseJSON(time89[s-1]);
        String ld2=ParseJSON(time90[s-1]);




        mh.setText(a);
        sub1.setText(b);
        sub2.setText(n);
        stptv1.setText(b);
        stptv2.setText(d);
        stptv3.setText(e);
        stptv4.setText(f);
        stptv5.setText(g);
        stptv6.setText(h);
        stptv7.setText(i);
        stptv8.setText(j);
        stptv9.setText(k);
        stptv10.setText(l);
        stptv11.setText(m);
        stptv12.setText(n);
        stptv13.setText(o);
        stptv14.setText(p);
        stptv15.setText(q);
        stptv16.setText(r);
        stptv17.setText(sz);
        stptv18.setText(t);
        stptv19.setText(u);
        stptv20.setText(v);
        stptv21.setText(w);
        stptv22.setText(x);
        stptv23.setText(y);
        stptv24.setText(z);
        stptv25.setText(ab);
        stptv26.setText(bb);
        stptv27.setText(cb);
        stptv28.setText(db);
        stptv29.setText(eb);
        stptv30.setText(fb);
        stptv31.setText(gb);
        stptv32.setText(hb);
        stptv33.setText(ib);
        stptv34.setText(jb);
        stptv35.setText(kb);
        stptv36.setText(lb);
        stptv37.setText(mb);
        stptv38.setText(nb);
        stptv39.setText(ob);
        stptv40.setText(qb);
        stptv41.setText(rb);
        stptv42.setText(sb);
        stptv43.setText(tb);
        stptv44.setText(ub);
        stptv45.setText(vb);
        stptv46.setText(wb);
        stptv47.setText(xb);
        stptv48.setText(yb);
        stptv49.setText(zb);
        stptv50.setText(ac);
        stptv51.setText(bc);
        stptv52.setText(cc);
        stptv53.setText(dc);
        stptv54.setText(ec);
        stptv55.setText(fc);
        stptv56.setText(gc);
        stptv57.setText(hc);
        stptv58.setText(ic);
        stptv59.setText(jc);
        stptv60.setText(kc);
        stptv61.setText(lc);
        stptv62.setText(mc);
        stptv63.setText(nc);
        stptv64.setText(oc);
        stptv65.setText(pc);
        stptv66.setText(qc);
        stptv67.setText(rc);
        stptv68.setText(sc);
        stptv69.setText(tc);
        stptv70.setText(uc);
        stptv71.setText(vc);
        stptv72.setText(wc);
        stptv73.setText(xc);
        stptv74.setText(yc);
        stptv75.setText(zc);
        stptv76.setText(ad);
        stptv77.setText(bd);
        stptv78.setText(cd);
        stptv79.setText(dd);
        stptv80.setText(ed);
        stptv81.setText(fd);
        stptv82.setText(gd);
        stptv83.setText(hd);
        stptv84.setText(imd);
        stptv85.setText(jd);
        stptv86.setText(kd);
        stptv87.setText(ld);
        stptv88.setText(md);
        stptv89.setText(nd);
        stptv90.setText(od);



        tmtv1.setText(a2);
        tmtv2.setText(b2);
        tmtv3.setText(c2);
        tmtv4.setText(d2);
        tmtv5.setText(e2);
        tmtv6.setText(f2);
        tmtv7.setText(g2);
        tmtv8.setText(h2);
        tmtv9.setText(i2);
        tmtv10.setText(j2);
        tmtv11.setText(k2);
        tmtv12.setText(l2);
        tmtv13.setText(m2);
        tmtv14.setText(n2);
        tmtv15.setText(o2);
        tmtv16.setText(p2);
        tmtv17.setText(q2);
        tmtv18.setText(r2);
        tmtv19.setText(s2);
        tmtv20.setText(t2);
        tmtv21.setText(u2);
        tmtv22.setText(v2);
        tmtv23.setText(w2);
        tmtv24.setText(x2);
        tmtv25.setText(y2);
        tmtv26.setText(z2);
        tmtv27.setText(ab2);
        tmtv28.setText(bb2);
        tmtv29.setText(cb2);
        tmtv30.setText(db2);
        tmtv31.setText(eb2);
        tmtv32.setText(fb2);
        tmtv33.setText(gb2);
        tmtv34.setText(hb2);
        tmtv35.setText(ib2);
        tmtv36.setText(jb2);
        tmtv37.setText(kb2);
        tmtv38.setText(lb2);
        tmtv39.setText(mb2);
        tmtv40.setText(nb2);
        tmtv41.setText(ob2);
        tmtv42.setText(pb2);
        tmtv43.setText(qb2);
        tmtv44.setText(rb2);
        tmtv45.setText(sb2);
        tmtv46.setText(tb2);
        tmtv47.setText(ub2);
        tmtv48.setText(vb2);
        tmtv49.setText(wb2);
        tmtv50.setText(xb2);
        tmtv51.setText(yb2);
        tmtv52.setText(zb2);
        tmtv53.setText(ac2);
        tmtv54.setText(bc2);
        tmtv55.setText(cc2);
        tmtv56.setText(dc2);
        tmtv57.setText(ec2);
        tmtv58.setText(fc2);
        tmtv59.setText(gc2);
        tmtv60.setText(hc2);
        tmtv61.setText(ic2);
        tmtv62.setText(jc2);
        tmtv63.setText(kc2);
        tmtv64.setText(lc2);
        tmtv65.setText(mc2);
        tmtv66.setText(nc2);
        tmtv67.setText(oc2);
        tmtv68.setText(pc2);
        tmtv69.setText(qc2);
        tmtv70.setText(rc2);
        tmtv71.setText(sc2);
        tmtv72.setText(tc2);
        tmtv73.setText(uc2);
        tmtv74.setText(vc2);
        tmtv75.setText(wc2);
        tmtv76.setText(xc2);
        tmtv77.setText(yc2);
        tmtv78.setText(zc2);
        tmtv79.setText(ad2);
        tmtv80.setText(bd2);
        tmtv81.setText(cd2);
        tmtv82.setText(dd2);
        tmtv83.setText(ed2);
        tmtv84.setText(fd2);
        tmtv85.setText(gd2);
        tmtv86.setText(hd2);
        tmtv87.setText(id2);
        tmtv88.setText(jd2);
        tmtv89.setText(kd2);
        tmtv90.setText(ld2);

    }
    
}
