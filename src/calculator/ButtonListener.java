/* ButtonListener.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonListener implements ActionListener
{
    private static JTextField field;

    public ButtonListener(JTextField newField)
    {
        super();
        field = newField;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equalsIgnoreCase("C"))
        {
            field.setText("0");
            Calculator.eq = new Equation();
        }
        if(e.getActionCommand().equalsIgnoreCase("1"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("1");
            }
            else
            {
                field.setText(field.getText() + "1");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("2"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("2");
            }
            else
            {
                field.setText(field.getText() + "2");
            } 
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("3"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("3");
            }
            else
            {
                field.setText(field.getText() + "3");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("4"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("4");
            }
            else
            {
                field.setText(field.getText() + "4");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("5"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("5");
            }
            else
            {
                field.setText(field.getText() + "5");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("6"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("6");
            }
            else
            {
                field.setText(field.getText() + "6");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("7"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("7");
            }
            else
            {
                field.setText(field.getText() + "7");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("8"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("8");
            }
            else
            {
                field.setText(field.getText() + "8");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("9"))
        {
            if(field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                field.setText("9");
            }
            else
            {
                field.setText(field.getText() + "9");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("0"))
        {
            if(!field.getText().equalsIgnoreCase("0"))
            {
                field.setText(field.getText() + "0");
            }
            if(CalculatorGUI.lastButton == 1)
            {
                field.setText("0");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("."))
        {
            if(!field.getText().contains("."))
            {
                field.setText(field.getText() + ".");
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("+/-"))
        {
            if(field.getText().equalsIgnoreCase("0"))
            {
                field.setText(field.getText());
            }
            else if(field.getText().contains("-"))
            {
                field.setText(field.getText().substring(1, field.getText().length()));
            }
            else
            {
                field.setText("-" + field.getText());
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("+"))
        {
            Calculator.eq.setNum1(Double.parseDouble(field.getText()));
            Calculator.eq.setFunc('+');
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("-"))
        {
            Calculator.eq.setNum1(Double.parseDouble(field.getText()));
            Calculator.eq.setFunc('-');
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("x"))
        {
            Calculator.eq.setNum1(Double.parseDouble(field.getText()));
            Calculator.eq.setFunc('*');
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("/"))
        {
            Calculator.eq.setNum1(Double.parseDouble(field.getText()));
            Calculator.eq.setFunc('/');
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("%"))
        {
            if(Calculator.eq.getFunc() == '0')
            {
                Calculator.eq.setNum1(Double.parseDouble(field.getText())/100);
                if(Calculator.eq.getNum1() % 1 != 0)
                {
                    field.setText(Double.toString(Calculator.eq.getNum1()));
                }
                else
                {
                    field.setText(Integer.toString((int)Calculator.eq.getNum1()));
                }
            }
            else
            {
                Calculator.eq.setNum2(Double.parseDouble(field.getText())/100);
                if(Calculator.eq.getNum2() % 1 != 0)
                {
                    field.setText(Double.toString(Calculator.eq.getNum2()));
                }
                else
                {
                    field.setText(Integer.toString((int)Calculator.eq.getNum2()));
                }
            }
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("mod"))
        {
            Calculator.eq.setNum1(Double.parseDouble(field.getText()));
            Calculator.eq.setFunc('m');
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("="))
        {
            if(CalculatorGUI.lastButton == 0 || Calculator.eq.getNum2() == 0)
            {
                Calculator.eq.setNum2(Double.parseDouble(field.getText()));
            }
            Calculator.eq.evaluate();
            if(Calculator.eq.getResult() % 1 != 0)
            {
                field.setText(Double.toString(Calculator.eq.getResult()));
            }
            else
            {
                field.setText(Integer.toString((int)Calculator.eq.getResult()));
            }
            CalculatorGUI.lastButton = 1;
            Calculator.eq.setNum1(Calculator.eq.getResult());
        }
    }

}
