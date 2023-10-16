/*
 * FirstLast.java
 * @author: Ata Turkoglu
 * Date: 14/04/2023
 */

public class FirstLast {
    private String input;
    private String output;

    // Constructor
    public FirstLast() {
        input = "";
        output = "";
    }

    // Set method for input
    public void setInput(String input) {
        this.input = input;
    }

    // Compute method
    public void compute() {
        if (input.length() > 1) {
            char first = input.charAt(0);
            char last = input.charAt(input.length() - 1);
            output = last + input.substring(1, input.length() - 1) + first;
        } 
        else if(input.length() == 1){
            output = "You need to enter a input longer than 1 char";
        }
        else if(input.length() < 1){
            output = "You need to enter a input";
        }
        else {
            output = "Error";
        }
    }

    // Getters
    public String getOutput() {
        return output;
    }
}