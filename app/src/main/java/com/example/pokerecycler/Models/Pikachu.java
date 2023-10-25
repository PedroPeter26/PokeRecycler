package com.example.pokerecycler.Models;

public class Pikachu extends Pokemon{
    private Chapete chapeteizq;
    private Chapete chapeteder;

    public Pikachu(Chapete chapeteizq, Chapete chapeteder) {
        this.chapeteizq = chapeteizq;
        this.chapeteder = chapeteder;
    }

    public Chapete getChapeteizq() {
        return chapeteizq;
    }

    public void setChapeteizq(Chapete chapeteizq) {
        this.chapeteizq = chapeteizq;
    }

    public Chapete getChapeteder() {
        return chapeteder;
    }

    public void setChapeteder(Chapete chapeteder) {
        this.chapeteder = chapeteder;
    }
}
