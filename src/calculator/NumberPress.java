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
		if(!Character.isDigit(e.getKeyChar()))
        {
        	e.consume();
        }
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

}
