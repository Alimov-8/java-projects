/*
Student:
U1910060
Alimov Abdullokh
MSC2070-002
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorU1910060 extends JFrame
{
    // Creating Buttons
    JButton jbtOne = new JButton("1");
    JButton jbtTwo = new JButton("2");
    JButton jbtThree = new JButton("3");
    JButton jbtFour = new JButton("4");
    JButton jbtFive = new JButton("5");
    JButton jbtSix = new JButton("6");
    JButton jbtSeven = new JButton("7");
    JButton jbtEight = new JButton("8");
    JButton jbtNine = new JButton("9");
    JButton jbtZero = new JButton("0");
    JButton jbtDot = new JButton(".");
    JButton jbtEqual = new JButton("=");
    JButton jbtDiv = new JButton("/");
    JButton jbtMul = new JButton("*");
    JButton jbtSub = new JButton("-");
    JButton jbtAdd = new JButton("+");

    // TextField
    JTextField jtfSpace = new JTextField();

    public CalculatorU1910060() {
        // Create a panel to hold buttons
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,4));
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        // Adding buttons to the Panel
        p1.add(jbtSeven); p1.add(jbtEight); p1.add(jbtNine); p1.add(jbtDiv);
        p1.add(jbtFour); p1.add(jbtFive); p1.add(jbtSix); p1.add(jbtMul);
        p1.add(jbtOne); p1.add(jbtTwo); p1.add(jbtThree); p1.add(jbtSub);
        p1.add(jbtZero); p1.add(jbtDot); p1.add(jbtEqual); p1.add(jbtAdd);

        p2.add(jtfSpace, BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2); // Add panel to the frame

        // Register listeners
        ListenerClass listener = new ListenerClass();

        jbtOne.addActionListener(listener);
        jbtTwo.addActionListener(listener);
        jbtThree.addActionListener(listener);
        jbtFour.addActionListener(listener);
        jbtFive.addActionListener(listener);
        jbtSix.addActionListener(listener);
        jbtSeven.addActionListener(listener);
        jbtEight.addActionListener(listener);
        jbtNine.addActionListener(listener);
        jbtZero.addActionListener(listener);
        jbtDot.addActionListener(listener);
        jbtEqual.addActionListener(listener);
        jbtDiv.addActionListener(listener);
        jbtMul.addActionListener(listener);
        jbtSub.addActionListener(listener);
        jbtAdd.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new CalculatorU1910060();
        frame.setTitle("Calculator");
        frame.setSize(250,300);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    class ListenerClass implements ActionListener {
        String value;
        String math;
        double num1, num2, result;
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtOne){
                jtfSpace.setText(jtfSpace.getText() + "1");
            }
            else if (e.getSource() == jbtTwo) {
                jtfSpace.setText(jtfSpace.getText() + "2");
            }
            else if (e.getSource() == jbtThree) {
                jtfSpace.setText(jtfSpace.getText() + "3");
            }
            else if (e.getSource() == jbtFour) {
                jtfSpace.setText(jtfSpace.getText() + "4");
            }
            else if (e.getSource() == jbtFive) {
                jtfSpace.setText(jtfSpace.getText() + "5");
            }
            else if (e.getSource() == jbtSix) {
                jtfSpace.setText(jtfSpace.getText() + "6");
            }
            else if (e.getSource() == jbtSeven) {
                jtfSpace.setText(jtfSpace.getText() + "7");
            }
            else if (e.getSource() == jbtEight) {
                jtfSpace.setText(jtfSpace.getText() + "8");
            }
            else if (e.getSource() == jbtNine) {
                jtfSpace.setText(jtfSpace.getText() + "9");
            }
            else if (e.getSource() == jbtZero) {
                jtfSpace.setText(jtfSpace.getText() + "0");
            }
            else if (e.getSource() == jbtDot) {
                jtfSpace.setText(jtfSpace.getText() + ".");
            }
            else if (e.getSource() == jbtDiv) {
                math = "Div";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
            }
            else if (e.getSource() == jbtMul) {
                math = "Mul";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
            }
            else if (e.getSource() == jbtAdd) {
                math = "Add";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
            }
            else if (e.getSource() == jbtSub) {
                math = "Sub";
                value = jtfSpace.getText();
                num1 = Double.parseDouble(value);
                jtfSpace.setText("");
            }
            else if (e.getSource() == jbtEqual) {
                value = jtfSpace.getText();
                num2 = Double.parseDouble(value);
                switch (math) {
                    case "Div" -> result = num1 / num2;
                    case "Mul" -> result = num1 * num2;
                    case "Add" -> result = num1 + num2;
                    case "Sub" -> result = num1 - num2;
                }
                jtfSpace.setText("" + result);
            }
            }
        }
}


