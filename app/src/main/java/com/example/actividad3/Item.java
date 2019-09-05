package com.example.actividad3;

public class Item {
    private int imagen;
    private float estrellas;

    public Item(int imagen, float estrellas){
        this.imagen = imagen;
        this.estrellas = estrellas;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public float getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(float estrellas) {
        this.estrellas = estrellas;
    }
}
