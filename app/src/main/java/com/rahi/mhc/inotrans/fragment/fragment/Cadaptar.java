package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 7/19/2016.
 */

public class Cadaptar extends CursorAdapter {
    DatabaseHelper databaseHelper;
    public Cadaptar(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView id = (TextView) view.findViewById(R.id.id);
        TextView stopa = (TextView) view.findViewById(R.id.stopa);
        TextView stopz = (TextView) view.findViewById(R.id.stopz);
        TextView adress = (TextView) view.findViewById(R.id.adress);
        TextView end = (TextView) view.findViewById(R.id.end);
        // Extract properties from cursor
        String end1 = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLOUMN_TIME1));
        String stopa1 = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLOUMN_STOP1));
        String stopz1 = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLOUMN_STOP10));
        String adress1 = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLOUMN_TIME10));
        int id1 = cursor.getInt(cursor.getColumnIndexOrThrow(DatabaseHelper.COLOUMN_ID));
        // Populate fields with extracted properties

        end.setText(end1);
        stopa.setText(stopa1);
        stopz.setText(stopz1);
        adress.setText(adress1);
        id.setText(String.valueOf(id1));

    }
}
