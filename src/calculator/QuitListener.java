/* QuitListener.java */

/*
 * Adam Reid
 * February 15, 2016
 */

package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class QuitListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
