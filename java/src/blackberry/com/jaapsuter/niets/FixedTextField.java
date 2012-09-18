package com.jaapsuter.niets;

import net.rim.device.api.ui.Graphics;
import net.rim.device.api.ui.Manager;
import net.rim.device.api.ui.component.TextField;
import net.rim.device.api.ui.container.VerticalFieldManager;

public class FixedTextField extends VerticalFieldManager {

    private int fieldWidth;
    private int fieldHeight;
    private TextField textField;

    public FixedTextField(int width, int height) {

        super(Manager.NO_VERTICAL_SCROLL);
        fieldWidth = width;
        fieldHeight = height;

        VerticalFieldManager vfm = new VerticalFieldManager(Manager.VERTICAL_SCROLL|Manager.VERTICAL_SCROLLBAR);

        textField = new TextField() {
            public void paint(Graphics g) {
                getManager().invalidate();
                super.paint(g);
            }
        };
        
        vfm.add(textField);
        add(vfm);
    }

    public void paint(Graphics g) {
        // draw the border of the text area;
        int color = g.getColor();
        g.setColor(0x00FFCC);
        g.drawRect(0, 0, fieldWidth, fieldHeight);
        g.setColor(color);
        super.paint(g);
    }

    public void sublayout(int width, int height) {
        if (fieldWidth == 0) {
            fieldWidth = width;
        }
        if (fieldHeight == 0) {
            fieldHeight = height;
        }
        super.sublayout(fieldWidth, fieldHeight);
        setExtent(fieldWidth,fieldHeight);
    }

    public String getText() {
        return textField.getText();
    }
    
    public void setText(String text) {
        textField.setText(text);
    }
}
