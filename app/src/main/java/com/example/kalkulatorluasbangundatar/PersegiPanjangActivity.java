package com.example.kalkulatorluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    EditText inputPanjangPersegiPanjang;
    EditText inputLebarPersegiPanjang;
    TextView tvHasilPersegiPanjang;
    Button btnHitungPersegiPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        inputPanjangPersegiPanjang = findViewById(R.id.input_panjang_persegi_panjang);
        inputLebarPersegiPanjang = findViewById(R.id.input_lebar_persegi_panjang);
        btnHitungPersegiPanjang = findViewById(R.id.btn_hitung_persegi_panjang);
        tvHasilPersegiPanjang = findViewById(R.id.tv_hasil_persegi_panjang);

        btnHitungPersegiPanjang.setOnClickListener(view -> {
            String stringPanjangPersegiPanjang = inputPanjangPersegiPanjang.getText().toString();
            String stringLebarPersegiPanjang = inputLebarPersegiPanjang.getText().toString();

            double panjangPersegiPanjang = Double.parseDouble(stringPanjangPersegiPanjang);
            double lebarPersegiPanjang = Double.parseDouble(stringLebarPersegiPanjang);

            String luasPersegiPanjang = persegiPanjang.hitungLuas(panjangPersegiPanjang, lebarPersegiPanjang);

            tvHasilPersegiPanjang.setText(luasPersegiPanjang);
        });
    }
}