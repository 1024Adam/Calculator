/* CalculatorGUI.java */

/*
 * Adam Reid
 * February 15 2016
 */

package calculator;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class CalculatorGUI extends JFrame
{
    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 350;
    public static final int HEIGHT = 300;

    public static int lastButton = 0;

    /* Constructors */
    public CalculatorGUI()
    {
        /* Set basic window settings */
        super();
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
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
        mainField.setText("0");
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
        JButton equals = new JButton("=");
        JButton clear = new JButton("C");
        JButton percent = new JButton("%");
        JButton mod = new JButton("mod");

        button1.addActionListener(new ButtonListener(mainField));
        button2.addActionListener(new ButtonListener(mainField));
        button3.addActionListener(new ButtonListener(mainField));
        button4.addActionListener(new ButtonListener(mainField));
        button5.addActionListener(new ButtonListener(mainField));
        button6.addActionListener(new ButtonListener(mainField));
        button7.addActionListener(new ButtonListener(mainField));
        button8.addActionListener(new ButtonListener(mainField));
        button9.addActionListener(new ButtonListener(mainField));
        button0.addActionListener(new ButtonListener(mainField));
        dot.addActionListener(new ButtonListener(mainField));
        plusminus.addActionListener(new ButtonListener(mainField));
        add.addActionListener(new ButtonListener(mainField));
        subtract.addActionListener(new ButtonListener(mainField));
        multiply.addActionListener(new ButtonListener(mainField));
        divide.addActionListener(new ButtonListener(mainField));
        equals.addActionListener(new ButtonListener(mainField));
        clear.addActionListener(new ButtonListener(mainField));
        percent.addActionListener(new ButtonListener(mainField));
        mod.addActionListener(new ButtonListener(mainField));

        button1.addKeyListener(new NumberPress(mainField));
        button2.addKeyListener(new NumberPress(mainField));
        button3.addKeyListener(new NumberPress(mainField));
        button4.addKeyListener(new NumberPress(mainField));
        button5.addKeyListener(new NumberPress(mainField));
        button6.addKeyListener(new NumberPress(mainField));
        button7.addKeyListener(new NumberPress(mainField));
        button8.addKeyListener(new NumberPress(mainField));
        button9.addKeyListener(new NumberPress(mainField));
        button0.addKeyListener(new NumberPress(mainField));
        dot.addKeyListener(new NumberPress(mainField));
        plusminus.addKeyListener(new NumberPress(mainField));
        add.addKeyListener(new NumberPress(mainField));
        subtract.addKeyListener(new NumberPress(mainField));
        multiply.addKeyListener(new NumberPress(mainField));
        divide.addKeyListener(new NumberPress(mainField));
        equals.addKeyListener(new NumberPress(mainField));
        clear.addKeyListener(new NumberPress(mainField));
        percent.addKeyListener(new NumberPress(mainField));
        mod.addKeyListener(new NumberPress(mainField));


        clear.setFocusable(true);

        mainPanel.add(clear);
        mainPanel.add(percent);
        mainPanel.add(mod);
        mainPanel.add(divide);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(multiply);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(subtract);
        mainPanel.add(button7);
        mainPanel.add(button8);
        mainPanel.add(button9);
        mainPanel.add(add);
        mainPanel.add(button0);
        mainPanel.add(dot);
        mainPanel.add(plusminus);
        mainPanel.add(equals);
        add(mainPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() 
        {
            public void windowOpened( WindowEvent e )
            {
                clear.requestFocus();
            }
        }); 

    }
}
