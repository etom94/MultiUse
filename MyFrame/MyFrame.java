// Source code is decompiled from a .class file using FernFlower decompiler.
package MultiUse.MyFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
   public MyFrame(int frameWidth, int frameHeight) {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int screenWidth = (int)screenSize.getWidth();
      int screenHeight = (int)screenSize.getHeight();
      int framePositionHorizontal = (screenWidth - frameWidth) / 2;
      int framePositionVertical = (screenHeight - frameHeight) / 2;
      this.setBounds(framePositionHorizontal, framePositionVertical, frameWidth, frameHeight);
      this.setDefaultCloseOperation(3);
      this.setVisible(true);
   }
}
