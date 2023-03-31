package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    private EditText etNilai1, etNilai2;
    private View btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        etNilai1 = findViewById(R.id.et_nilai1);
        etNilai2 = findViewById(R.id.et_nilai2);
        btnHitung = findViewById(R.id.btn_hitung);
    }
}
