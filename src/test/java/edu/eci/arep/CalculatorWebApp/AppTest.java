package edu.eci.arep.CalculatorWebApp;

import edu.eci.arep.CalculatorWebApp.Calculator.Calculator;
import edu.eci.arep.CalculatorWebApp.DataStructure.LinkedList;
import edu.eci.arep.CalculatorWebApp.WebApp.App;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Test Class for the Calculator App.
 */
public class AppTest {
    /**
     * The Calculator to Use.
     */
    Calculator calculator;
    /**
     * The Data set 1.
     */
    LinkedList<Double> dataSet1,
    /**
     * The Data set 2.
     */
    dataSet2,
    /**
     * The Data set 3.
     */
    dataSet3,
    /**
     * The Data set 4.
     */
    dataSet4,
    /**
     * The Data set 5.
     */
    dataSet5,
    /**
     * The Data set 6.
     */
    dataSet6;

    /**
     * SetUp of the test, Fill up of the data structures.
     */
    @Before
    public void setup(){
        calculator = new Calculator();
        dataSet1 = createLinkedList(new double[]{1.77,3.26,23.34,25.92,29.08,37.82,45.65,62.06,62.66,78.37});
        dataSet2 = createLinkedList(new double[]{15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2});
        dataSet3 = createLinkedList(new double[]{160,591,114,229,230,270,128,1657,624,1503});
        dataSet4 = createLinkedList(new double[]{39.63,54.11,57.07,63.98,68.60});
        dataSet5 = createLinkedList(new double[]{47.69,60.06,37.07,78.89,19.63,28.50,15.53,75.80,78.91,78.04});
        dataSet6 = createLinkedList(new double[]{25.2547,27.0088,55.1112,8.6243,79.3423,78.2012,97.1161,37.4080,7.5995,94.5614,26.3058,12.3282,49.3001,25.1194,92.0442});

    }

    /**
     * Should calculate mean of the data sets.
     */
    @Test
    public void shouldCalculateMean() {
        Assert.assertEquals(36.99, calculator.mean(dataSet1), 0.01);
        Assert.assertEquals(60.32, calculator.mean(dataSet2), 0.01);
        Assert.assertEquals(550.6, calculator.mean(dataSet3), 0.01);
        Assert.assertEquals(56.678, calculator.mean(dataSet4), 0.01);
        Assert.assertEquals(52.01, calculator.mean(dataSet5), 0.01);
        Assert.assertEquals(47.68, calculator.mean(dataSet6), 0.01);
    }

    /**
     * Should calculate Standard Deviation of the data Sets.
     */
    @Test
    public void shouldCalculateSD() {
        Assert.assertEquals(25.44, calculator.standardDeviation(dataSet1), 0.01);
        Assert.assertEquals(62.26, calculator.standardDeviation(dataSet2), 0.01);
        Assert.assertEquals(572.03, calculator.standardDeviation(dataSet3), 0.01);
        Assert.assertEquals(11.09, calculator.standardDeviation(dataSet4), 0.01);
        Assert.assertEquals(25.66, calculator.standardDeviation(dataSet5), 0.01);
        Assert.assertEquals(32.71, calculator.standardDeviation(dataSet6), 0.01);
    }

    /**
     * Should not calculate mean of the dataStructures.
     */
    @Test
    public void shouldNotCalculateMean() {
        Assert.assertNotEquals(321.21, calculator.mean(dataSet1), 0.01);
        Assert.assertNotEquals(70.32, calculator.mean(dataSet2), 0.01);
        Assert.assertNotEquals(88.45, calculator.mean(dataSet3), 0.01);
        Assert.assertNotEquals(1.2, calculator.mean(dataSet4), 0.01);
        Assert.assertNotEquals(1.45, calculator.mean(dataSet5), 0.01);
        Assert.assertNotEquals(4.02, calculator.mean(dataSet6), 0.01);
    }

    /**
     * Should not calculate standard deviation of the dataSets.
     */
    @Test
    public void shouldNotCalculateSD(){
        Assert.assertNotEquals(7.03, calculator.standardDeviation(dataSet1), 0.05);
        Assert.assertNotEquals(61.26, calculator.standardDeviation(dataSet2), 0.03);
        Assert.assertNotEquals(81.96, calculator.standardDeviation(dataSet3), 0.01);
        Assert.assertNotEquals(4.5, calculator.standardDeviation(dataSet4), 0.01);
        Assert.assertNotEquals(20.66, calculator.standardDeviation(dataSet5), 0.01);
        Assert.assertNotEquals(33.08, calculator.standardDeviation(dataSet6), 0.01);
    }


    /**
     * Should add nodes to a linked list.
     */
    @Test
    public void shouldAddNodes(){
        double[] values = {1.02,23.12,56.11,132.11,23.344,99.13,13.321,3213.1,10.10,11.133};
        LinkedList<Double> linkedListTest = createLinkedList(values);
        Assert.assertEquals(10,linkedListTest.size());
    }

    /**
     * Should remove nodes from a linked list.
     */
    @Test
    public void shouldRemoveNodes() {
        double[] values = {1.02,23.12,56.11,132.11,23.344,99.13,13.321,3213.1,10.10,11.133};
        LinkedList<Double> linkedListTest = createLinkedList(values);
        linkedListTest.add(1.01);
        linkedListTest.add(1.02);
        linkedListTest.add(1.03);
        linkedListTest.add(1.04);
        linkedListTest.add(1.05);
        linkedListTest.add(1.06);
        linkedListTest.remove();
        linkedListTest.remove();
        Assert.assertEquals(14,linkedListTest.size());
    }


    /**
     * Auxiliary method to fill the linked List for the tests.
     * @param doubles
     * @return a linked list with all the elements of an array.
     */
    private LinkedList<Double> createLinkedList(double[] doubles){
        LinkedList<Double> ll = new LinkedList<Double>();
        for(double i: doubles){
            ll.add(i);
        }
        return ll;
    }
}
