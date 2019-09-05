package com.example.actividad3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Item[] items;

    private ArrayList<Item> lista = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutprincipal);
        cargarDatos();
        generarVista();
    }

    private void cargarDatos() {
        lista.add(new Item(R.drawable.st1, 1));
        lista.add(new Item(R.drawable.st2, 3));
        lista.add(new Item(R.drawable.st3, 2));
        lista.add(new Item(R.drawable.st4, 5));
    }

    private void generarVista() {
        ArrayAdapter<Item> adapter = new AdapterLista(lista, this);
        ListView lv = (ListView) findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }
}