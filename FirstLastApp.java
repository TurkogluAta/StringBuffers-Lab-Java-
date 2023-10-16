/*
 * FirstLastApp.java
 * @author: Ata Turkoglu
 * Date: 14/04/2023
 */

import javax.swing.JOptionPane;
public class FirstLastApp {
    public static void main(String args[]){
        String input, output;

        FirstLast myFirstLast = new FirstLast();

        input = JOptionPane.showInputDialog(null,"Enter a input:");
        myFirstLast.setInput(input);

        myFirstLast.compute();

        output = myFirstLast.getOutput();
        JOptionPane.showMessageDialog(null,output);
    }
}
