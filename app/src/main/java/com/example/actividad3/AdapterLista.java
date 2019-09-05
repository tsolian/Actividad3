package com.example.actividad3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;

import java.util.ArrayList;

public class AdapterLista extends ArrayAdapter {
    ArrayList<Item> lista;
    Context ctx;

    public AdapterLista(ArrayList<Item> lista, Context contexto){
        super(contexto, R.layout.item, lista);
        this.lista = lista;
        this.ctx = contexto;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        LayoutInflater li = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(itemView == null)
            itemView = li.inflate(R.layout.item, parent, false);

        Item itemActual = lista.get(position);

        ImageView imagen = (ImageView) itemView.findViewById(R.id.imagenItem);
        imagen.setImageResource(itemActual.getImagen());

        RatingBar ratingBar = (RatingBar) itemView.findViewById(R.id.ratingItem);
        ratingBar.setNumStars((int)itemActual.getEstrellas());

        return itemView;
    }
}
