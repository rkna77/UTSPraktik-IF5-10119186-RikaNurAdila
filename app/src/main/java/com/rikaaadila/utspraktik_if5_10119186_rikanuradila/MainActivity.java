package com.rikaaadila.utspraktik_if5_10119186_rikanuradila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edt_nik, edt_nama, edt_tgl_lahir, tgl_konfir;
    RadioButton radiocowo, radiocewe, rortu, rnikah, ranak, rlainnya, r_rapid, r_pcr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgl_konfir=(EditText)findViewById(R.id.tgl_konfir);
        r_rapid=(RadioButton)findViewById(R.id.r_rapid);
        r_pcr=(RadioButton)findViewById(R.id.r_rapid);
        edt_nik=(EditText)findViewById(R.id.nik);
        edt_nama=(EditText)findViewById(R.id.nama);
        edt_tgl_lahir=(EditText)findViewById(R.id.tgl_lahir);
        radiocowo=(RadioButton)findViewById(R.id.cowo);
        radiocowo.setOnClickListener(null);
        radiocewe=(RadioButton)findViewById(R.id.cewe);
        radiocewe.setOnClickListener(null);
        rortu=(RadioButton)findViewById(R.id.ortu);
        rnikah=(RadioButton)findViewById(R.id.nikah);
        ranak=(RadioButton)findViewById(R.id.anak);
        rlainnya=(RadioButton)findViewById(R.id.lainnya);


        Button selanjutnya = findViewById(R.id.selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Konfirmasi = new Intent(getApplicationContext(), Konfirmasi.class);
                startActivity(Konfirmasi);
            }
        });
    }
}