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
    public static int lastFunc = 0;
    
    public static JTextField field = new JTextField(11);

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
        field.setFont(new Font("SansSerif", Font.BOLD, 30));
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setCaretColor(Color.WHITE);
        field.setText("0");
        field.addKeyListener(new NumberPress());

        topPanel.add(field);
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

        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());
        button4.addActionListener(new ButtonListener());
        button5.addActionListener(new ButtonListener());
        button6.addActionListener(new ButtonListener());
        button7.addActionListener(new ButtonListener());
        button8.addActionListener(new ButtonListener());
        button9.addActionListener(new ButtonListener());
        button0.addActionListener(new ButtonListener());
        dot.addActionListener(new ButtonListener());
        plusminus.addActionListener(new ButtonListener());
        add.addActionListener(new ButtonListener());
        subtract.addActionListener(new ButtonListener());
        multiply.addActionListener(new ButtonListener());
        divide.addActionListener(new ButtonListener());
        equals.addActionListener(new ButtonListener());
        clear.addActionListener(new ButtonListener());
        percent.addActionListener(new ButtonListener());
        mod.addActionListener(new ButtonListener());

        button1.addKeyListener(new NumberPress());
        button2.addKeyListener(new NumberPress());
        button3.addKeyListener(new NumberPress());
        button4.addKeyListener(new NumberPress());
        button5.addKeyListener(new NumberPress());
        button6.addKeyListener(new NumberPress());
        button7.addKeyListener(new NumberPress());
        button8.addKeyListener(new NumberPress());
        button9.addKeyListener(new NumberPress());
        button0.addKeyListener(new NumberPress());
        dot.addKeyListener(new NumberPress());
        plusminus.addKeyListener(new NumberPress());
        add.addKeyListener(new NumberPress());
        subtract.addKeyListener(new NumberPress());
        multiply.addKeyListener(new NumberPress());
        divide.addKeyListener(new NumberPress());
        equals.addKeyListener(new NumberPress());
        clear.addKeyListener(new NumberPress());
        percent.addKeyListener(new NumberPress());
        mod.addKeyListener(new NumberPress());


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
    
    public static void performEquals()
    {
        if(CalculatorGUI.lastButton == 0 || Calculator.eq.getNum2() == 0)
        {
            Calculator.eq.setNum2(Double.parseDouble(CalculatorGUI.field.getText()));
        }
        Calculator.eq.evaluate();
        if(Calculator.eq.getResult() % 1 != 0)
        {
            CalculatorGUI.field.setText(Double.toString(Calculator.eq.getResult()));
        }
        else
        {
            CalculatorGUI.field.setText(Integer.toString((int)Calculator.eq.getResult()));
        }
        CalculatorGUI.lastButton = 1;
        CalculatorGUI.lastFunc = 1;
        Calculator.eq.setNum1(Calculator.eq.getResult());
    }
}
