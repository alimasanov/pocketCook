package com.pocketcook.alim.pocketcook;

public class Ingridient {
    private String nameOfIngridient;
    private String unit;
    private double count;


    public Ingridient(String nameOfIngridient, String unit, double count) {
        this.nameOfIngridient = nameOfIngridient;
        this.unit = unit;
        this.count = count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getCount() {

        return count;
    }

    @Override
    public String toString() {
        return "" + count;
    }

    public void setNameOfIngridient(String nameOfIngridient) {
        this.nameOfIngridient = nameOfIngridient;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNameOfIngridient() {
        return nameOfIngridient;
    }

    public String getUnit() {
        return unit;
    }
}