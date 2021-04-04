package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNama, tvNim, tvNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.TV_namaOut);
        tvNim = findViewById(R.id.TV_nimOut);
        tvNilai = findViewById(R.id.TV_nilaiOut);

        Bundle extras = getIntent().getExtras();
        String nama = extras.getString("Nama");
        String nim = extras.getString("Nim");
        String nilai = extras.getString("Nilai");

        tvNama.setText(nama);
        tvNim.setText(nim);
        tvNilai.setText(nilai);
    }
}