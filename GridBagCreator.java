package Java.MultiUse;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagCreator {
    private GridBagConstraints constraints;
    private GridBagConstraints defaultConstraints;
    private GridBagConstraints result;

    public GridBagCreator(){
        constraints = defaultConstraints();
    }

    private GridBagConstraints defaultConstraints(){
        defaultConstraints = new GridBagConstraints();
        defaultConstraints.gridx = 0;
        defaultConstraints.gridy = 0;
        defaultConstraints.gridwidth = 1;
        defaultConstraints.gridheight = 1;
        defaultConstraints.weightx = 1;
        defaultConstraints.weighty = 1;
        defaultConstraints.anchor = GridBagConstraints.CENTER;
        defaultConstraints.fill = GridBagConstraints.NONE;
        defaultConstraints.insets = new Insets(0, 0, 0, 0);
        defaultConstraints.ipadx = 0;
        defaultConstraints.ipady = 0;

        return defaultConstraints;
    }

    public GridBagCreator gridX(int gridx){
        constraints.gridx = gridx;
        return this;
    }

    public GridBagCreator gridY(int gridy){
        constraints.gridy = gridy;
        return this;
    }

    public GridBagCreator gridWidth(int gridwidth){
        constraints.gridwidth = gridwidth;
        return this;
    }

    public GridBagCreator gridHeight(int gridheight){
        constraints.gridheight = gridheight;
        return this;
    }

    public GridBagCreator weightX(double weightx){
        constraints.weightx = weightx;
        return this;
    }

    public GridBagCreator weightY(double weighty){
        constraints.weighty = weighty;
        return this;
    }

    public GridBagCreator anchor(int anchor){
        constraints.anchor = anchor;
        return this;
    }

    public GridBagCreator fill(int fill){
        constraints.fill = fill;
        return this;
    }

    public GridBagCreator ipadx(int ipadx){
        constraints.ipadx = ipadx;
        return this;
    }

    public GridBagCreator ipady(int ipady){
        constraints.ipady = ipady;
        return this;
    }

    public GridBagConstraints build(){
        result = constraints;
        constraints = (GridBagConstraints) defaultConstraints.clone();
        return result;
    }
    public GridBagConstraints setDefaultValues(){
        return defaultConstraints;
    }
    
}