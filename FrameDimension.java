package Java.Multiuse;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameDimension {
    public static int getWidth(JFrame frame) {
        return frame.getContentPane().getSize().width;
    }

    public static int getHeight(JFrame frame) {
        return frame.getContentPane().getSize().height;
    }
    
    public static int getWidth(JPanel panel) {
        return panel.getSize().width;
    }

    public static int getHeight(JPanel panel) {
        return panel.getSize().height;
    }
}

