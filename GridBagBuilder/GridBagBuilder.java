// Source code is decompiled from a .class file using FernFlower decompiler.
package MultiUse.GridBagBuilder;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagBuilder {
   private GridBagConstraints constraints = new GridBagConstraints();
   private GridBagConstraints defaultConstraints = new GridBagConstraints();

   public GridBagBuilder() {
      this.setDefaultValues();
   }

   public GridBagBuilder setDefaultValues() {
      this.defaultConstraints.anchor = 10;
      this.defaultConstraints.fill = 1;
      this.defaultConstraints.gridx = 0;
      this.defaultConstraints.gridy = 0;
      this.defaultConstraints.gridheight = 1;
      this.defaultConstraints.gridwidth = 1;
      this.defaultConstraints.weightx = 1.0;
      this.defaultConstraints.weighty = 1.0;
      this.defaultConstraints.insets = new Insets(0, 0, 0, 0);
      return this;
   }

   public GridBagBuilder resetValues() {
      this.constraints.anchor = this.defaultConstraints.anchor;
      this.constraints.fill = this.defaultConstraints.fill;
      this.constraints.gridx = this.defaultConstraints.gridx;
      this.constraints.gridy = this.defaultConstraints.gridy;
      this.constraints.gridheight = this.defaultConstraints.gridheight;
      this.constraints.gridwidth = this.defaultConstraints.gridwidth;
      this.constraints.weightx = this.defaultConstraints.weightx;
      this.constraints.weighty = this.defaultConstraints.weighty;
      this.constraints.insets = this.defaultConstraints.insets;
      return this;
   }

   public GridBagBuilder gridx(int x) {
      this.constraints.gridx = x;
      return this;
   }

   public GridBagBuilder gridy(int y) {
      this.constraints.gridy = y;
      return this;
   }

   public GridBagBuilder gridwidth(int width) {
      this.constraints.gridwidth = width;
      return this;
   }

   public GridBagBuilder gridheight(int height) {
      this.constraints.gridheight = height;
      return this;
   }

   public GridBagBuilder weightx(double weightx) {
      this.constraints.weightx = weightx;
      return this;
   }

   public GridBagBuilder weighty(double weighty) {
      this.constraints.weighty = weighty;
      return this;
   }

   public GridBagBuilder fill(int fill) {
      this.constraints.fill = fill;
      return this;
   }

   public GridBagBuilder anchor(int anchor) {
      this.constraints.anchor = anchor;
      return this;
   }

   public GridBagBuilder insets(Insets insets) {
      this.constraints.insets = insets;
      return this;
   }

   public GridBagConstraints build() {
      return this.constraints;
   }
}
