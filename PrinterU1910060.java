/*
Student:
U1910060
Alimov Abdullokh
MSC2070-002
*/

import javax.swing.*;
import java.awt.*;

public class PrinterU1910060 extends JFrame {
    public static void main(String[] args) {
        // Create Labels
        JLabel jlblPrinter = new JLabel("Printer: My Printer");
        jlblPrinter.setBounds(30,10, 150,20);
        JLabel jlblQuality = new JLabel("Print Quality:  ");
        jlblQuality.setBounds(30,100, 150,20);

        // Create TextAreas
        JTextArea jtxtType = new JTextArea();
        jtxtType.setBounds(25,35, 50,60);
        JTextArea jtxtSize = new JTextArea();
        jtxtSize.setBounds(150,35, 40,60);
        JTextArea jtxtSpace = new JTextArea();
        jtxtSpace.setBounds(270,35, 50,60);

        // Create CheckBox
        JCheckBox jchkImg = new JCheckBox("Image");
        jchkImg.setBounds(80,35, 70,20);
        JCheckBox jchkText = new JCheckBox("Text");
        jchkText.setBounds(80,55, 70,20);
        JCheckBox jchkCode = new JCheckBox("Code");
        jchkCode.setBounds(80,75, 70,20);
        JCheckBox jchkPrint = new JCheckBox("Print to File");
        jchkPrint.setBounds(220,100, 100,20);

        // Create RadioButton
        JRadioButton jrbSelect = new JRadioButton("Select");
        jrbSelect.setBounds(195,35, 70,20);
        JRadioButton jrbAll = new JRadioButton("All");
        jrbAll.setBounds(195,55, 70,20);
        JRadioButton jrbApplet = new JRadioButton("Applet");
        jrbApplet.setBounds(195,75, 70,20);

        // Create ComboBox
        JComboBox jcboQuality = new JComboBox(new String[] {"High","Middle", "Low"});
        jcboQuality.setBounds(130,100, 75,20);

        // Create Buttons
        JButton jbtOK = new JButton("OK");
        jbtOK.setBounds(340,10, 80,30);
        JButton jbtCancel = new JButton("Cancel");
        jbtCancel.setBounds(340,45, 80,30);
        JButton jbtSetup = new JButton("Setup...");
        jbtSetup.setBounds(340,80, 80,30);
        JButton jbtHelp = new JButton("Help");
        jbtHelp.setBounds(340,115, 80,30);


        JFrame frame = new PrinterU1910060();
        // Add to frame
        frame.add(jlblPrinter); frame.add(jtxtType); frame.add(jlblQuality);
        frame.add(jchkImg); frame.add(jchkText); frame.add(jchkCode); frame.add(jtxtSize);
        frame.add(jcboQuality); frame.add(jchkPrint);
        frame.add(jrbSelect); frame.add(jrbAll); frame.add(jrbApplet);
        frame.add(jtxtSpace);
        frame.add(jbtOK); frame.add(jbtCancel); frame.add(jbtSetup); frame.add(jbtHelp);
        // Show in Window
        frame.setTitle("Printer");
        frame.setLayout(null);
        frame.setSize(450, 200);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

