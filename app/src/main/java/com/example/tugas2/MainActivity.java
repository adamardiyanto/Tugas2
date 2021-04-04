package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;

    private EditText etNama, etNim, etNilai;
    private String  nilaiHuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.Btn_submit);
        etNama = findViewById(R.id.ET_nama);
        etNim = findViewById(R.id.ET_nim);
        etNilai = findViewById(R.id.ET_nilai);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNama = etNama.getText().toString();
                    String sNim = etNim.getText().toString();
                    String sNilai = etNilai.getText().toString();


                    double nilai = Double.parseDouble(sNilai);

                    if (nilai < 1) {
                        nilaiHuruf = "D";
                    } else if (nilai <= 1.33) {
                        nilaiHuruf = "D+";
                    } else if (nilai <= 1.66) {
                        nilaiHuruf = "C-";
                    } else if (nilai <= 2) {
                        nilaiHuruf = "C";
                    } else if (nilai <= 2.33) {
                        nilaiHuruf = "C+";
                    } else if (nilai <= 2.66) {
                        nilaiHuruf = "B-";
                    } else if (nilai <= 3) {
                        nilaiHuruf = "B";
                    } else if (nilai <= 3.33) {
                        nilaiHuruf = "B+";
                    } else if (nilai <= 3.66) {
                        nilaiHuruf = "A-";
                    } else if (nilai <= 4) {
                        nilaiHuruf = "A";
                    }

                    //if (sNama != null && sNama != "" || sNim != null || sNilai != null) {
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        i.putExtra("Nama", sNama);
                        i.putExtra("Nim", sNim);
                        i.putExtra("Nilai", nilaiHuruf);
                        startActivity(i);

//                    } else {
//                        Toast.makeText(getApplication(), "YOU NEED TO FILL the field", Toast.LENGTH_SHORT);
//                    }

                } catch (NumberFormatException nfe){

                    Toast.makeText(getApplication(), "FIELD TIDAK BOLEH KOSONG !",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}