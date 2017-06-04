package com.akashjpro.spinnerquocgia;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Akashjpro on 8/31/2016.
 */
public class QuocGiaAdapter extends ArrayAdapter<QuocGia> {

    Activity context;
    int resource;
    List<QuocGia> objects;

    public QuocGiaAdapter(Activity context, int resource, List<QuocGia> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView txtTenQuocGia = (TextView) row.findViewById(R.id.txtTenQuocGia);
        ImageView imgLaCo = (ImageView) row.findViewById(R.id.imgLaCo);

        QuocGia quocGia = this.objects.get(position);
        txtTenQuocGia.setText(quocGia.getTenQuocGia());
        imgLaCo.setImageResource(quocGia.getImgLaCo());

        return row;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView txtTenQuocGia = (TextView) row.findViewById(R.id.txtTenQuocGia);
        ImageView imgLaCo = (ImageView) row.findViewById(R.id.imgLaCo);

        QuocGia quocGia = this.objects.get(position);
        txtTenQuocGia.setText(quocGia.getTenQuocGia());
        imgLaCo.setImageResource(quocGia.getImgLaCo());

        return row;
    }
}
