package me.xdrop.jrand;

import me.xdrop.jrand.random.Rand;

import java.util.Collection;

public abstract class Generator<T> {

    private Rand randGen;

    public Generator() {
        this.randGen = new Rand();
    }

    public Rand random() {
        return this.randGen;
    }

    public abstract T generate();

    public abstract Collection<T> generateMany(int num);

}
