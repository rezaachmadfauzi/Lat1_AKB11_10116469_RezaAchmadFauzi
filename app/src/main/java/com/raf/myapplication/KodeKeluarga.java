package com.raf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KodeKeluarga extends AppCompatActivity implements View.OnClickListener {
 private Button btnMasuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_keluarga);

        btnMasuk = findViewById(R.id.btnMasuk);
        btnMasuk.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent i = new Intent(this,NamaPanggilan.class);
        startActivity(i);
    }
}

