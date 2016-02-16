/* ButtonListener.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
    public ButtonListener() 
    {
        super();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equalsIgnoreCase("C"))
        {
            CalculatorGUI.field.setText("0");
            Calculator.eq = new Equation();
        }
        if(e.getActionCommand().equalsIgnoreCase("1"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("1");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "1");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("2"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("2");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "2");
            } 
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("3"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("3");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "3");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("4"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("4");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "4");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("5"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("5");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "5");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("6"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("6");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "6");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("7"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("7");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "7");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("8"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("8");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "8");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("9"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0") || CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("9");
            }
            else
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "9");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("0"))
        {
            if(!CalculatorGUI.field.getText().equalsIgnoreCase("0"))
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + "0");
            }
            if(CalculatorGUI.lastButton == 1)
            {
                CalculatorGUI.field.setText("0");
            }
            CalculatorGUI.lastButton = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("."))
        {
            if(!CalculatorGUI.field.getText().contains("."))
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText() + ".");
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("+/-"))
        {
            if(CalculatorGUI.field.getText().equalsIgnoreCase("0"))
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText());
            }
            else if(CalculatorGUI.field.getText().contains("-"))
            {
                CalculatorGUI.field.setText(CalculatorGUI.field.getText().substring(1, CalculatorGUI.field.getText().length()));
            }
            else
            {
                CalculatorGUI.field.setText("-" + CalculatorGUI.field.getText());
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("+"))
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('+');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("-"))
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('-');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("x"))
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('*');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("/"))
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('/');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("%"))
        {
            if(Calculator.eq.getFunc() == '0')
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText())/100);
                if(Calculator.eq.getNum1() % 1 != 0)
                {
                    CalculatorGUI.field.setText(Double.toString(Calculator.eq.getNum1()));
                }
                else
                {
                    CalculatorGUI.field.setText(Integer.toString((int)Calculator.eq.getNum1()));
                }
            }
            else
            {
                Calculator.eq.setNum2(Double.parseDouble(CalculatorGUI.field.getText())/100);
                if(Calculator.eq.getNum2() % 1 != 0)
                {
                    CalculatorGUI.field.setText(Double.toString(Calculator.eq.getNum2()));
                }
                else
                {
                    CalculatorGUI.field.setText(Integer.toString((int)Calculator.eq.getNum2()));
                }
            }
            CalculatorGUI.lastButton = 1;
        }
        if(e.getActionCommand().equalsIgnoreCase("mod"))
        {
            if(Calculator.eq.getFunc() != '0' && CalculatorGUI.lastFunc != 1)
            {
                CalculatorGUI.performEquals();
            }
            else
            {
                Calculator.eq.setNum1(Double.parseDouble(CalculatorGUI.field.getText()));
            }
            Calculator.eq.setFunc('m');
            CalculatorGUI.lastButton = 1;
            CalculatorGUI.lastFunc = 0;
        }
        if(e.getActionCommand().equalsIgnoreCase("="))
        {
            CalculatorGUI.performEquals();
        }
    }
}
