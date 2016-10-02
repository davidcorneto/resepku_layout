package com.codemargonda.finalproject.resep_ku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class DaftarResepActivity extends AppCompatActivity {

    RecyclerView rv;
    TextView tKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_resep);

        rv = (RecyclerView) findViewById(R.id.rvResep);
        tKeterangan = (TextView) findViewById(R.id.tKeterangan);



    }
}
