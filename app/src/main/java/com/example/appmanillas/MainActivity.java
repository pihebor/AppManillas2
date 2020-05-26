package com.example.appmanillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private Spinner combo_material, combo_dije, combo_tipo_dije;
    private String[] material;
    private String[] dije;
    private String[] tipo_dije;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        combo_material = findViewById(R.id.cmbMaterial);
        material = getResources().getStringArray(R.array.material);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,material);
        combo_material.setAdapter(adapter);

    }
}
