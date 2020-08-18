package edu.eci.arep.CalculatorWebApp.WebApp;

import edu.eci.arep.CalculatorWebApp.Calculator.Reader;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 */
public class App {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>AREP Mean and Standard deviation Calculator</h2>"
                + "<form action=\"/results\">"
                + "  Only Integers and float(.) separated by \",\" (No [space] and letters allowed):<br>"
                + "  <input type=\"text\" name=\"data\" value=\"1.0,2,3,4,5\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        String data = req.queryParams("data");
        Reader r = new Reader();
        String[] out = r.readAndReturn(data);
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<ul>"
                + "<h2> Your Input: </h2>"
                + "<li>" + (out.length>1 ? out[2] : "Invalid Input!") + "</li>"
                + "<h2> Mean </h2>"
                + "<li>" + (out.length>1 ? out[0] : "N/A") + "</li>"
                + "<h2> Standard Deviation </h2>"
                + "<li>" + (out.length>1 ? out[1] : "N/A") + "</li>"
                + "<br/>"
                + "<a href=\"inputdata\">Try Another set of numbers!</a>"
                + "</ul>"
                + "</body>"
                + "</html>";

        return pageContent;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}