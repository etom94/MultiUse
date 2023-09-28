package Java.MultiUse;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

public class MyFrame extends JFrame 
{
    public MyFrame(int height, int width) 
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        int frameWidth = height;
        int frameHeight = width;
        int xPosition = (screenWidth - frameWidth) / 2;
        int yPosition = (screenHeight - frameHeight) / 2;

        setBounds(xPosition, yPosition, frameWidth, frameHeight);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setVisible(true);
    }
}
