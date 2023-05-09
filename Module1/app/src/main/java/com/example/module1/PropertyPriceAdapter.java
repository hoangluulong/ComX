package com.example.module1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PropertyPriceAdapter extends BaseAdapter {

    Activity activity;
    String [] a;

    public PropertyPriceAdapter(Activity activity, String[] a) {
        this.activity = activity;
        this.a = a;
    }

    @Override
    public int getCount() {
        return a.length;
    }

    @Override
    public Object getItem(int i) {
        return a[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item_property_price, null);

        ImageView imgAvatar = view.findViewById(R.id.imgAvatar);
        TextView tvDate = view.findViewById(R.id.tvDate);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        TextView tvReservationCancell = view.findViewById(R.id.tvReservationCancell);

        return view;
    }
}
