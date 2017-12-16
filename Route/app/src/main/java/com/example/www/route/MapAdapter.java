package com.example.www.route;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

/**
 * Created by student on 10/12/17.
 */

public class MapAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> transportList;
    GoogleMap map;
    CheckBox checkBoxRoute;
    private static LayoutInflater inflater = null;

    public MapAdapter(Context context, ArrayList<String> transportList, GoogleMap map) {
        this.context = context;
        this.transportList = transportList;
        this.map = map;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return transportList.size();
    }

    @Override
    public Object getItem(int position) {
        return transportList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.listview_row, parent, false);

        TextView txtRoute = convertView.findViewById(R.id.txtViewSelectRoute);
//        txtRoute.setText((transportList.get(position).toString()));

        return convertView;
    }


}
