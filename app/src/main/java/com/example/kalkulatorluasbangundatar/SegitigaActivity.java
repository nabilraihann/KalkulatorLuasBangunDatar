package com.example.kalkulatorluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {
    Segitiga segitiga = new Segitiga();
    EditText inputAlasSegitiga;
    EditText inputTinggiSegitiga;
    TextView tvHasilSegitiga;
    Button btnHitungSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        inputAlasSegitiga = findViewById(R.id.input_alas_segitiga);
        inputTinggiSegitiga = findViewById(R.id.input_tinggi_segitiga);
        btnHitungSegitiga = findViewById(R.id.btn_hitung_segitiga);
        tvHasilSegitiga = findViewById(R.id.tv_hasil_segitiga);

        btnHitungSegitiga.setOnClickListener(view -> {
            String stringPanjangSegitiga = inputAlasSegitiga.getText().toString();
            String stringLebarSegitiga = inputTinggiSegitiga.getText().toString();

            double alasSegitiga = Double.parseDouble(stringPanjangSegitiga);
            double tinggiSegitiga = Double.parseDouble(stringLebarSegitiga);

            String luasSegitiga = segitiga.hitungLuas(alasSegitiga, tinggiSegitiga);

            tvHasilSegitiga.setText(luasSegitiga);
        });
    }
}