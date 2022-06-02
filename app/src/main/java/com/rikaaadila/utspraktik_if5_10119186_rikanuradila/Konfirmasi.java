package com.rikaaadila.utspraktik_if5_10119186_rikanuradila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Konfirmasi extends AppCompatActivity {
    TextView tx_nik, tx_nama, tx_tgl_lahir, tx_jk, tx_hubungan, tx_tgl_konfir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);


        tx_nik=(TextView)findViewById(R.id.text_nik);
        tx_nama=(TextView)findViewById(R.id.text_nama);
        tx_tgl_lahir=(TextView)findViewById(R.id.text_ttl);
        tx_jk=(TextView)findViewById(R.id.text_jeniskelamin);
        tx_hubungan=(TextView)findViewById(R.id.text_hubungan);
        tx_tgl_konfir=(TextView)findViewById(R.id.tgl_konfir);
        
        Intent i = getIntent();
        tx_nik.setText(i.getExtras().getString("Nik"));
        tx_nama.setText(i.getExtras().getString("Nama"));
        tx_tgl_lahir.setText(i.getExtras().getString("Tgl_lahir"));
        tx_jk.setText(i.getExtras().getString("Jk"));
        tx_hubungan.setText(i.getExtras().getString("Hub"));

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
            }
        });
        Button selanjutnya = findViewById(R.id.selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dialog = new Intent(getApplicationContext(), Dialog.class);
                startActivity(Dialog);
            }
        });
    }
}