package com.example.kalkulatorluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    Persegi persegi = new Persegi();
    EditText inputSisiPersegi;
    TextView tvHasilPersegi;
    Button btnHitungPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        inputSisiPersegi = findViewById(R.id.input_sisi_persegi);
        btnHitungPersegi = findViewById(R.id.btn_hitung_persegi);
        tvHasilPersegi = findViewById(R.id.tv_hasil_persegi);

        btnHitungPersegi.setOnClickListener(view -> {
            String stringSisiPersegi = inputSisiPersegi.getText().toString();

            double sisiPersegi = Double.parseDouble(stringSisiPersegi);

            String luasPersegi = persegi.hitungLuas(sisiPersegi);

            tvHasilPersegi.setText(luasPersegi);
        });
    }
}