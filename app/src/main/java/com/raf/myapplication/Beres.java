package com.raf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Beres extends AppCompatActivity implements View.OnClickListener {
    String newString;
    TextView txtBeres;
    private Button btnOke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beres);
        txtBeres=findViewById(R.id.txtBeres);
        btnOke = findViewById(R.id.btnOke);
        btnOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("nama");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("nama");
        }

        txtBeres.setText("Beres! Sekarang "+newString);


            }

    @Override
    public void onClick(View v) {

    }
}
