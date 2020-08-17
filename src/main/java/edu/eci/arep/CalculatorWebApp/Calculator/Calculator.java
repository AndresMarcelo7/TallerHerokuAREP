package edu.eci.arep.CalculatorWebApp.Calculator;


import edu.eci.arep.CalculatorWebApp.DataStructure.LinkedList;

/**
 * The type Calculator for Mean and Standard Deviation.
 */
public class Calculator {
    /**
     * Instantiates a new Calculator.
     */
    public Calculator() {
    }

    /**
     * Addition, Calculates the sum of all Linked List's  elements .
     *
     * @param data the Linked List containing the data
     * @return the sum of all elements
     */
    public double Addition(LinkedList<Double> data){
        double sum = 0.0;
        for(double i: data){
            sum += i;
        }
        return sum;
    }

    /**
     * Mean.
     *
     * @param data the Linked List containing the data
     * @return the calculated mean of the data.
     */
    public double mean(LinkedList<Double> data){
        double sum = Addition(data);
        return sum / data.size();
    }

    /**
     * Standard deviation.
     *
     * @param data the Linked List containing the data
     * @return the standard Deviation of the data
     */
    public double standardDeviation(LinkedList<Double> data){
        double miu = mean(data);
        double sum = 0.0;
        for(double i: data){
            sum+= Math.pow(Math.abs(i-miu),2);
        }
        return Math.sqrt(sum / (data.size()-1));
    }

}
