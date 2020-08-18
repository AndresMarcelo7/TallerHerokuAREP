package edu.eci.arep.CalculatorWebApp.Calculator;

import edu.eci.arep.CalculatorWebApp.DataStructure.LinkedList;

import java.util.regex.Pattern;

public class Reader {
    public Reader() {
    }

    /**
     * The entry point of application.
     *
     */
    public String[] readAndReturn(String data) {
        return CalculateData(data);

    }

    /**
     * Auxiliary method that Calculates mean and SD line by line.
     *
     * @param data The string of Double numbers separated by "," in the file Data.txt
     */

    private String[] CalculateData(String data) {
        LinkedList<Double> ll = new LinkedList<>();
        Calculator cal = new Calculator();
        if(!Pattern.matches("^[0-9,.]*$", data)){
            return new String[]{"NOT A VALID INPUT"};
        }
        else{
            String[] parts = data.split(",");
            for (String i : parts) {
                try{
                    double d = Double.parseDouble(i);
                    ll.add(d);
                }
                catch (NumberFormatException e){
                    return new String[]{"NOT A VALID INPUT"};
                }
            }

            return new String[]{String.valueOf(cal.mean(ll)),String.valueOf(cal.standardDeviation(ll)),data};
        }

    }


}
