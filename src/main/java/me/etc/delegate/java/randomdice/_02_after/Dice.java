package me.etc.delegate.java.randomdice._02_after;

import java.util.Random;

public class Dice extends Random {
    private final Random random;

    public Dice() {
        super(314159L);
        random = this;
    }

    public Dice(long seed) {
        super(seed);
        random = this;
    }

    @Override
    public int nextInt() {
        return random.nextInt(6) + 1;
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
