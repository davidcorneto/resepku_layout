package com.codemargonda.finalproject.resep_ku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TambahResepActivity extends AppCompatActivity {


    EditText etNamaResep, etDeskripsi;
    LinearLayout bGambar, bTambah;
    ImageView imgGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_resep);




    }
}
