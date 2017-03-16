package com.example;

import com.google.auto.value.AutoValue;

import java.io.Serializable;

@AutoValue
public abstract class TestAutoValue implements Serializable
{
    public abstract int test();

    public static TestAutoValue create(int test)
    {
        return new AutoValue_TestAutoValue(test);
    }
}
