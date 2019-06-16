package com.example.animerack;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import java.util.List;

public class AnimeListOfflineAdapter extends BaseAdapter {
    Activity activity;
    List<AnimeListOffline> lstanimeoffline;
    LayoutInflater inflater;
    EditText edtjudul,edtseason,edtpenyimpanan;

    public AnimeListOfflineAdapter(Activity activity, List<AnimeListOffline> lstanimeoffline, LayoutInflater inflater, EditText edtjudul, EditText edtseason, EditText edtpenyimpanan) {
        this.activity = activity;
        this.lstanimeoffline = lstanimeoffline;
        this.inflater = inflater;
        this.edtjudul = edtjudul;
        this.edtseason = edtseason;
        this.edtpenyimpanan = edtpenyimpanan;
    }

    @Override
    public int getCount() {
        return lstanimeoffline.size();
    }

    @Override
    public Object getItem(int i) {
        return lstanimeoffline.get(i);
    }

    @Override
    public long getItemId(int i) {
        return lstanimeoffline.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
