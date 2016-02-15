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
        }
		if(e.getActionCommand().equalsIgnoreCase("%"))
        {
        	
        }
        if(e.getActionCommand().equalsIgnoreCase("mod"))
        {
        	
        }
        if(e.getActionCommand().equalsIgnoreCase("/"))
        {
        	
        }
        if(e.getActionCommand().equalsIgnoreCase("1"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("1");
        	}
        	else
        	{
        		field.setText(field.getText() + "1");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("2"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("2");
        	}
        	else
        	{
        		field.setText(field.getText() + "2");
        	}        
        }
        if(e.getActionCommand().equalsIgnoreCase("3"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("3");
        	}
        	else
        	{
        		field.setText(field.getText() + "3");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("x"))
        {
        	
        }
        if(e.getActionCommand().equalsIgnoreCase("4"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("4");
        	}
        	else
        	{
        		field.setText(field.getText() + "4");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("5"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("5");
        	}
        	else
        	{
        		field.setText(field.getText() + "5");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("6"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("6");
        	}
        	else
        	{
        		field.setText(field.getText() + "6");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("-"))
        {
        	
        }
        if(e.getActionCommand().equalsIgnoreCase("7"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("7");
        	}
        	else
        	{
        		field.setText(field.getText() + "7");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("8"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("8");
        	}
        	else
        	{
        		field.setText(field.getText() + "8");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("9"))
        {
        	if(field.getText().equalsIgnoreCase("0"))
        	{
        		field.setText("9");
        	}
        	else
        	{
        		field.setText(field.getText() + "9");
        	}
        }
        if(e.getActionCommand().equalsIgnoreCase("+"))
        {
        	
        }
        if(e.getActionCommand().equalsIgnoreCase("0"))
        {
        	if(!field.getText().equalsIgnoreCase("0"))
        	{
        	    field.setText(field.getText() + "0");
        	}
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
        if(e.getActionCommand().equalsIgnoreCase("="))
        {
        	
        }
	}

}
