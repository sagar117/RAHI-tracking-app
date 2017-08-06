package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rahi.mhc.inotrans.R;

import java.util.List;

/**
 * Created by MHC on 7/20/2016.
 */

public class busadaptar extends BaseAdapter {
    private Context mcontext;
    private List<bus> mlist;

    public busadaptar(Context mcontext, List<bus> mlist) {
        this.mcontext = mcontext;
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mlist.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view=View.inflate(mcontext,R.layout.list_item,null);

        TextView id = (TextView) view.findViewById(R.id.id);
        TextView stopa = (TextView) view.findViewById(R.id.stopa);
        TextView stopz = (TextView) view.findViewById(R.id.stopz);
        TextView adress = (TextView) view.findViewById(R.id.adress);
        TextView end = (TextView) view.findViewById(R.id.end);

        // Populate fields with extracted properties

        end.setText(mlist.get(position).getTime10());
        stopa.setText(mlist.get(position).getStop1());
        stopz.setText(mlist.get(position).getStop10());
        adress.setText(mlist.get(position).getStop1());
        id.setText(String.valueOf(mlist.get(position).getId()));


        return null;
    }
}
