package edu.sbcc.cs105;

import java.util.ArrayList;

public class TemperatureStats {
    
    ArrayList<Double> tempStats = new ArrayList<>();

    /**
     * prints array list tempStats
     */
    public TemperatureStats() {
        System.out.println(tempStats);
    }

    /**
     * adds temperatures from (t) to array list
     */
    public void addTemperature(double t) {
        tempStats.add(t);
    }

    /**
     * clears tempStats array list
     */
    public void clearTemperatures() {
        tempStats.clear();
    }

    /**
     * loop finds and returns the maximum value from the array list
     * @return maxium
     */
    public double getMaximumTemperature() {
        double maximum = tempStats.get(0);
        for (int i = 1; i < tempStats.size(); i++) {
            if (maximum < tempStats.get(i)) {
                maximum = tempStats.get(i);
            }
        }
        return maximum;
    }

    /**
     * loop finds and returns the minium value from the array list
     * @return minium
     */
    public double getMinimumTemperature() {
        double minium = tempStats.get(0);
        for (int i = 1; i < tempStats.size(); i++) {
            if (minium > tempStats.get(i)) {
                minium = tempStats.get(i);
            }
        }
        return minium;
    }

    /**
     * loop adds all elements within array list and divides by the array list size to return the average
     * @return sum
     */
    public double getAverageTemperature() {
        double sum = 0;
        for (int i = 0; i < tempStats.size(); i++) {
            sum += tempStats.get(i);
        }
        return sum / tempStats.size();
    }
}
