package com.codemargonda.finalproject.resep_ku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepActivity extends AppCompatActivity {

    TextView tNamaResep, tDeskripsi;
    ImageView imgGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        tNamaResep = (TextView) findViewById(R.id.tNama);
        tDeskripsi = (TextView) findViewById(R.id.tDeskripsi);
        imgGambar = (ImageView) findViewById(R.id.imgGambar);


    }
}
