package com.rahi.mhc.inotrans.fragment.fragment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 6/27/2016.
 */
public class CustomList extends ArrayAdapter<String> {


    private String[] ids;
    private String[] names;
    private String[] address;
    private String[] address2;
    private String[] address3;
    private String[] cancle;
//    private String[] lat;
//    private String[] lng;
    private String[] stopA;
//    private String[] stop1;
//    private String[] stop2;
//    private String[] stop3;
//    private String[] stop4;
//    private String[] stop5;
//    private String[] stop6;
//    private String[] stop7;
//    private String[] stop8;
//    private String[] stop9;
//    private String[] stop10;
//    private String[] stop11;
//    private String[] stop12;
//    private String[] stop13;
//    private String[] stop14;
//    private String[] stop15;
//    private String[] stop16;
//    private String[] stop17;
//    private String[] stop18;
    private String[] stop19;
    private Activity context;


    public CustomList(Activity context, String[] ids,String[] stpa, String[] names,String[] address, String[] address2, String[] stp19) {
        super(context, R.layout.listitem2, ids);
        this.context = context;
        this.ids = ids;
        this.names = names;
        this.address = address;
        this.address2 = address2;
        this.address3 = address3;
        this.cancle=cancle;
//        this.lat = latitude;
//        this.lng=longitude;
        this.stopA=stpa;
//        this.stop1=stp1;
//        this.stop2=stp2;
//        this.stop3=stp3;
//        this.stop4=stp4;
//        this.stop5=stp5;
//        this.stop6=stp6;
//        this.stop7=stp7;
//        this.stop8=stp8;
//        this.stop9=stp9;
//        this.stop10=stp10;
//        this.stop11=stp11;
//        this.stop12=stp12;
//        this.stop13=stp13;
//        this.stop14=stp14;
//        this.stop15=stp15;
//        this.stop16=stp16;
//        this.stop17=stp17;
//        this.stop18=stp18;
        this.stop19=stp19;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_item, null, true);
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.id);
//        TextView textViewName = (TextView) listViewItem.findViewById(R.id.name);
        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.adress);
        TextView textViewadd1 = (TextView) listViewItem.findViewById(R.id.end);
//        TextView textViewadd2 = (TextView) listViewItem.findViewById(R.id.brk);
//        TextView textviewcncl= (TextView) listViewItem.findViewById(R.id.cncl);
        TextView tvbusa=(TextView) listViewItem.findViewById(R.id.stopa);
//        TextView tvbus1=(TextView) listViewItem.findViewById(R.id.bus1);
//        TextView tvbus2=(TextView) listViewItem.findViewById(R.id.bus2);
//        TextView tvbus3=(TextView) listViewItem.findViewById(R.id.bus3);
//        TextView tvbus4=(TextView) listViewItem.findViewById(R.id.bus4);
//        TextView tvbus5=(TextView) listViewItem.findViewById(R.id.bus5);
//        TextView tvbus6=(TextView) listViewItem.findViewById(R.id.bus6);
//        TextView tvbus7=(TextView) listViewItem.findViewById(R.id.bus7);
//        TextView tvbus8=(TextView) listViewItem.findViewById(R.id.bus8);
//        TextView tvbus9=(TextView) listViewItem.findViewById(R.id.bus9);
//        TextView tvbus10=(TextView) listViewItem.findViewById(R.id.bus10);
//        TextView tvbus11=(TextView) listViewItem.findViewById(R.id.bus11);
//        TextView tvbus12=(TextView) listViewItem.findViewById(R.id.bus12);
//        TextView tvbus13=(TextView) listViewItem.findViewById(R.id.bus13);
//        TextView tvbus14=(TextView) listViewItem.findViewById(R.id.bus14);
//        TextView tvbus15=(TextView) listViewItem.findViewById(R.id.bus15);
//        TextView tvbus16=(TextView) listViewItem.findViewById(R.id.bus16);
//        TextView tvbus17=(TextView) listViewItem.findViewById(R.id.bus17);
//        TextView tvbus18=(TextView) listViewItem.findViewById(R.id.bus18);
        TextView tvbus19=(TextView) listViewItem.findViewById(R.id.stopz);
//



        textViewId.setText(ids[position]);
//        textViewName.setText(names[position]);
        textViewEmail.setText(address[position]);
        textViewadd1.setText(address2[position]);
//        textViewadd2.setText(address3[position]);
//        textviewcncl.setText(cancle[position]);
        tvbusa.setText(stopA[position]);
//        tvbus1.setText(stop1[position]);
//        tvbus2.setText(stop2[position]);
//        tvbus3.setText(stop3[position]);
//        tvbus4.setText(stop4[position]);
//        tvbus5.setText(stop5[position]);
//        tvbus6.setText(stop6[position]);
//        tvbus7.setText(stop7[position]);
//        tvbus8.setText(stop8[position]);
//        tvbus9.setText(stop9[position]);
//        tvbus10.setText(stop10[position]);
//        tvbus11.setText(stop11[position]);
//        tvbus12.setText(stop12[position]);
//        tvbus13.setText(stop13[position]);
//        tvbus14.setText(stop14[position]);
//        tvbus15.setText(stop15[position]);
//        tvbus16.setText(stop16[position]);
//        tvbus17.setText(stop17[position]);
//        tvbus18.setText(stop18[position]);
        tvbus19.setText(stop19[position]);






        return listViewItem;
    }



}