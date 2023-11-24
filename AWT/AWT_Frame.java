//Program to Demonstrate Frame Creation in AWT

import java.awt.*;
class AWT_Frame
{
    public static void main(String[] args)
    {
        //Create new Frame
        Frame f = new Frame("Linus Infosystems");

        //Deside size of that Frame
        f.setSize(1000,1400);

        //Display that Frame
        f.setVisible(true);
    }
}