package com.example.appmanillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado,p_unitario;
    private EditText cantidad;
    int txtcantidad;
    Double res;
    private Spinner combo_material, combo_dije, combo_tipo_dije;
    private String[] material;
    private String[] dije;
    private String[] tipo_dije;
    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> adapter1;
    private ArrayAdapter<String> adapter2;
    public double trm, total, precio_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.lblPrecio);
        cantidad=findViewById(R.id.txtCantidad);
        p_unitario=findViewById(R.id.lblPrecioUni);


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
        double precio;
        trm=3200;

        txtcantidad= Integer.parseInt(cantidad.getText().toString());

        sel_material = combo_material.getSelectedItemPosition();
        sel_dije = combo_dije.getSelectedItemPosition();
        sel_tipo_dije = combo_tipo_dije.getSelectedItemPosition();

        if (sel_material==0 && sel_dije==0 && (sel_tipo_dije==0 || sel_tipo_dije==1)) {
            precio_g = 100;
        } else if (sel_material==0 && sel_dije==0 && sel_tipo_dije==2){
            precio_g=80;
        } else if (sel_material==0 && sel_dije==0 && sel_tipo_dije==3){
            precio_g=70;
        }else if (sel_material==0 && sel_dije==1 && (sel_tipo_dije==0 || sel_tipo_dije==1)){
            precio_g=120;
        }else if (sel_material==0 && sel_dije==1 && sel_tipo_dije==2){
            precio_g=100;
        }else if (sel_material==0 && sel_dije==1 && sel_tipo_dije==3){
            precio_g=90;
        } else if (sel_material==1 && sel_dije==0 && (sel_tipo_dije==0 || sel_tipo_dije==1)) {
            precio_g = 90;
        } else if (sel_material==1 && sel_dije==0 && sel_tipo_dije==2){
            precio_g=70;
        } else if (sel_material==1 && sel_dije==0 && sel_tipo_dije==3){
            precio_g=50;
        }else if (sel_material==1 && sel_dije==1 && (sel_tipo_dije==0 || sel_tipo_dije==1)){
            precio_g=110;
        }else if (sel_material==1 && sel_dije==1 && sel_tipo_dije==2){
            precio_g=90;
        }else if (sel_material==1 && sel_dije==1 && sel_tipo_dije==3){
            precio_g=80;
        }
        p_unitario.setText("" + precio_g);
        total = precio_g*txtcantidad;
        resultado.setText("" + total);
    }

    public void limpiar(View v){
        resultado.setText("");
        combo_material.setSelection(0);
        combo_dije.setSelection(0);
        combo_tipo_dije.setSelection(0);
        p_unitario.setText("");
        cantidad.setText("");
    }
}
