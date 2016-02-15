/* NumberPress.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

import java.awt.event.*;
import javax.swing.*;

public class NumberPress implements KeyListener
{
    private static JTextField textField;

    public NumberPress(JTextField field)
    {
        super();
        textField = field;
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        if(Character.isDigit(e.getKeyChar()) || e.getKeyChar() == '.')
        {
        	e.consume();
        	if(e.getKeyChar() == '.' && !textField.getText().contains("."))
        	{
        		textField.setText(textField.getText() + e.getKeyChar());
        	}
        	else if(e.getKeyChar() == '.' && textField.getText().contains("."))
        	{
        	    textField.setText(textField.getText());	
        	}
        	else if(textField.getText().equalsIgnoreCase("0"))
        	{
            	textField.setText("" + e.getKeyChar());
        	}
        	else
        	{
        		textField.setText(textField.getText() + e.getKeyChar());
        	}
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}
