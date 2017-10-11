package me.xdrop.jrand.builders.basics;

import me.xdrop.jrand.Constants;
import me.xdrop.jrand.Generator;

public class DoubleGenerator extends Generator<Double> {

    private double min;
    private double max;

    public DoubleGenerator() {
        this.min = 0;
        this.max = 1;
    }

    /**
     * Sets the maximum value (inclusive)
     * @param max The maximum value
     * @return
     */
    public DoubleGenerator max(double max) {
        this.max = max;
        return this;
    }

    /**
     * Set the minimum value (inclusive)
     * @param min The minimum value
     * @return
     */
    public DoubleGenerator min(double min) {
        this.min = min;
        return this;
    }

    @Override
    public Double rand() {
        double rand = random().randDouble();
        double result = min + (rand * (max-min));
        return result;
    }
}