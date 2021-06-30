package com.example.recyclervuewpares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private RecyclerView miRecicler;
    private RecyclerView.Adapter miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView logo = (ImageView) findViewById(R.id.imageView);
        // logo.setImageResource(R.drawable.icmenutick);

        // Buscamos el control para cargar los datos
        miRecicler = (RecyclerView) findViewById(R.id.rv1);

        // Añadimos que  el tamaño del RecyclerView no se cambiará.
// que tiene hijos (items) que tienen anchura y altura fijas. Permite // que el RecyclerView optimice mejor

        miRecicler.setHasFixedSize(true);

        miRecicler.setLayoutManager(new LinearLayoutManager(this));
        //Especificamos el adaptador con la lista a visualizar
        miAdapter = new Adaptador(DatosClientes());
        miRecicler.setAdapter(miAdapter);

    }
    public List<Clientes> DatosClientes() {

        List<Clientes> Lista = new ArrayList<>();
        Lista.add(new Clientes("Rey", "12"));
        Lista.add(new Clientes("Gil", "13"));
        Lista.add(new Clientes("Alonso","12"));
        Lista.add(new Clientes("Tovar", "12"));
        Lista.add(new Clientes("Cerezo", "12"));
        Lista.add(new Clientes("Arroyo","12"));
        Lista.add(new Clientes("Sala","12"));
        Lista.add(new Clientes("Martín","12"));
        Lista.add(new Clientes("Jimeno","12"));
        Lista.add(new Clientes("Muñoz","12"));
        Lista.add(new Clientes("Negro","12"));
        Lista.add(new Clientes("Fernández","12"));
        return Lista;
    }

}
