/* CalculatorGUI.java */
package calculator;

import java.awt.*;
import javax.swing.*;

/*
 * Adam Reid
 * February 15 2016
 */

public class CalculatorGUI extends JFrame
{
    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 350;
    public static final int HEIGHT = 300;

    /* Constructors */
    public CalculatorGUI()
    {
        /* Set basic window settings */
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("Calculator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //addWindowListener(new ExitListener());
        
        setLayout(new BorderLayout()); 
        
        JPanel topPanel = new JPanel();
        JPanel mainPanel = new JPanel();

        // Create Menu Bar 
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(new QuitListener()); 
        file.add(quit);
        bar.add(file);
        setJMenuBar(bar);
        
        // Setup top panel        
        JTextField mainField = new JTextField(11);
        mainField.setFont(new Font("SansSerif", Font.BOLD, 30));
        mainField.setHorizontalAlignment(JTextField.RIGHT);
        mainField.setCaretColor(Color.WHITE);
        mainField.addKeyListener(new NumberPress(mainField));
        
        topPanel.add(mainField);
        add(topPanel, BorderLayout.NORTH);
        
        // Setup main panel
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton dot = new JButton(".");
        JButton plusminus = new JButton("+/-");
        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("x");
        JButton divide = new JButton("/");
        
        
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(add);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(subtract);
        mainPanel.add(button7);
        mainPanel.add(button8);
        mainPanel.add(button9);
        mainPanel.add(multiply);
        mainPanel.add(button0);
        mainPanel.add(dot);
        mainPanel.add(plusminus);
        mainPanel.add(divide);
        add(mainPanel, BorderLayout.CENTER);

    }
}
