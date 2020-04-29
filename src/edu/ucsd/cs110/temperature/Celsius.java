package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature fah = new Fahrenheit(getValue()*9/5 + 32);
        return fah;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + getValue() + " C";
    }
}