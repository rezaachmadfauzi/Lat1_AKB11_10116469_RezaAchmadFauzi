package com.raf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NamaPanggilan extends AppCompatActivity implements View.OnClickListener {
    private Button btnLanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_panggilan);
        btnLanjut=findViewById(R.id.btnLanjut);
        btnLanjut.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        EditText edtNama = (EditText) findViewById(R.id.edtNama);
        String nama = edtNama.getText().toString();
        Intent i=new Intent(this,Beres.class);
        i.putExtra("nama",nama);
        startActivity(i);

    }
}
