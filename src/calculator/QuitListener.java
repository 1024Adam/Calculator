/* QuitListener.java */
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Adam Reid
 * December 7, 2015
 */

public class QuitListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
