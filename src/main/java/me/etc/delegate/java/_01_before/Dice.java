package me.etc.delegate.java._01_before;

import java.util.Random;

public class Dice extends Random {
    public Dice() {
        super(314159L);
    }

    public Dice(long seed) {
        super(seed);
    }

    @Override
    public int nextInt() {
        return super.nextInt(6) + 1;
    }


    @Override
    public long nextLong() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean nextBoolean() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float nextFloat() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double nextDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    public synchronized double nextGaussian() {
        throw new UnsupportedOperationException();
    }
}
