package edu.sbcc.cs105;

import java.util.ArrayList;

public class TemperatureStats {
    
    ArrayList<Double> tempStats = new ArrayList<>();

    public TemperatureStats() {
        System.out.println(tempStats);
    }

    public void addTemperature(double t) {
        tempStats.add(t);
    }

    public void clearTemperatures() {
        tempStats.clear();
    }

    public double getMaximumTemperature() {
        
    }

    public double getMinimumTemperature() {

    }

    public double getAverageTemperature() {
        
    }
}
