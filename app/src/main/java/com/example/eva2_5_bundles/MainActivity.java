package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] datos ={
            "Tacos",
            "Tortas",
            "Hotdogs",
            "Hamburguesas",
            "Montados",
            "Carne asada",
            "Caldo",
            "Tostadas",
            "Burritos",
            "Sushi",
            "Boneless",
            "Bolas de arroz",
            "Burritos",
            "Sushi",
            "Boneless",
            "Bolas de arroz"
    };

    Intent intent;
    ListView lstVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwDatos = findViewById(R.id.lstVwDatos);
        intent = new Intent(this, DetailActivity.class);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos));
        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("COMIDA", datos[i]);
                bundle.putInt("POSICION",i);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}