package Java.Multiuse;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class StartseiteView 
{

    private static JPanel mainPanel;
    private static JPanel titelPanel;
    private static JPanel bodyPanel;
    private static JPanel buttonPanel;

public static JPanel Startseite() 
{
    GridBagConstraints titelPanelConstraints = new GridBagConstraints(0, 0, 1, 1, 1, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
    GridBagConstraints bodyPanelConstraints = new GridBagConstraints(0, 1, 1, 1, 1, 0.9, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
    GridBagConstraints buttonPanelConstraints = new GridBagConstraints(0, 0, 0, 0, 0,0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);

    mainPanel = new JPanel(new GridBagLayout());
    titelPanel = new JPanel(new GridBagLayout());
    bodyPanel = new JPanel(new GridBagLayout());
    buttonPanel = new JPanel(new GridBagLayout());
 
    buttonPanel.setBackground(Color.red);
    titelPanel.setBackground(Color.yellow);
    bodyPanel.setBackground(Color.blue);

    bodyPanel.add(buttonPanel, buttonPanelConstraints);
    mainPanel.add(bodyPanel, bodyPanelConstraints);
    mainPanel.add(titelPanel, titelPanelConstraints);

    return mainPanel;
}


    public static JPanel getMainPanel() 
    {
        return Startseite();
    }
    public static JPanel getBodyPanel()
    {
        return bodyPanel;
    }
    public static JPanel getButtonPanel()
    {
        return buttonPanel;
    }
}