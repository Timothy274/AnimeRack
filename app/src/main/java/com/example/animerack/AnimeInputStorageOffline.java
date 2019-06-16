package com.example.animerack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AnimeInputStorageOffline extends AppCompatActivity {
    FloatingActionButton fab;
    Activity activity;
    List<AnimeListOffline> lstanimeoffline;
    LayoutInflater inflater;
    EditText edtid,edtjudul,edtseason,edtpenyimpanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_input_storage_offline);
        fab = (FloatingActionButton)findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnimeInputStorageOffline.this,AnimeStorage.class));
            }
        });
    }
    public AnimeInputStorageOffline(Activity activity, List<AnimeListOffline> lstanimeoffline, LayoutInflater inflater, EditText edtjudul, EditText edtid, EditText edtseason, EditText edtpenyimpanan) {
        this.activity = activity;
        this.lstanimeoffline = lstanimeoffline;
        this.inflater = inflater;
        this.edtid = edtid;
        this.edtjudul = edtjudul;
        this.edtseason = edtseason;
        this.edtpenyimpanan = edtpenyimpanan;
    }

    public int getCount() {

        return lstanimeoffline.size();
    }

    public Object getItem(int i) {

        return lstanimeoffline.get(i);
    }

    public long getItemId(int i) {

        return lstanimeoffline.get(i).getId();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {

        View rowView;
        rowView=inflater.inflate(R.layout.row,null);
        final TextView txtJudul, txtSeason, txtPenyimpanan;
        txtJudul = (TextView)rowView.findViewById(R.id.txtJudul);
        txtSeason = (TextView)rowView.findViewById(R.id.txtSeason);
        txtPenyimpanan = (TextView)rowView.findViewById(R.id.txtPenyimpanan);

        txtJudul.setText(""+lstanimeoffline.get(i).getJudul());
        txtSeason.setText(""+lstanimeoffline.get(i).getSeason());
        txtPenyimpanan.setText(""+lstanimeoffline.get(i).getPenyimpanan());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtid.setText(""+txtJudul.getText());
                edtid.setText(""+txtSeason.getText());
                edtid.setText(""+txtPenyimpanan.getText());
            }
        });
        return rowView;
    }

}

