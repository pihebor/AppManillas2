package com.example.appmanillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    private ArrayAdapter<String> adapter1;
    private ArrayAdapter<String> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        combo_material = findViewById(R.id.cmbMaterial);
        material = getResources().getStringArray(R.array.material);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,material);
        combo_material.setAdapter(adapter);

        combo_dije = findViewById(R.id.cmbDije);
        dije = getResources().getStringArray(R.array.dije);
        adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,dije);
        combo_dije.setAdapter(adapter1);

        combo_tipo_dije = findViewById(R.id.cmbTipoDije);
        tipo_dije = getResources().getStringArray(R.array.tipo_dije);
        adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,tipo_dije);
        combo_tipo_dije.setAdapter(adapter2);

    }

    public void calcular(View v){
        int sel_material;
        int sel_dije;
        int sel_tipo_dije;
        sel_material = combo_material.getSelectedItemPosition();
        sel_dije = combo_dije.getSelectedItemPosition();
        sel_tipo_dije = combo_tipo_dije.getSelectedItemPosition();
        
    }
}
