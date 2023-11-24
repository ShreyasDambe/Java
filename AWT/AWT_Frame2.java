// Program to demonstrate frame creation by extending frame class

import java.awt.*;

class AWT_Frame2 extends Frame
{
    AWT_Frame2(String name)
    {
        //call from class Constructor
        super(name);
    }

    public static void main(String[] args)
    {
        //Create new Frame
        AWT_Frame2 f = new AWT_Frame2("Linus Infosystems");

        //Deside Size of that Frame
        f.setSize(700,700);

        //Display That Frame
        f.setVisible(true);
    }
}

    

