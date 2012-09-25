// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
package com.jaapsuter.niets;

import com.jaapsuter.niets.NetworkEventHandler;
import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.*; 
import net.rim.device.api.ui.component.*; 
import net.rim.device.api.ui.container.*;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.decor.*;
import net.rim.blackberry.api.phone.*;
import net.rim.device.api.system.*;

import java.lang.String;

public final class Screen extends MainScreen
{
    private BasicEditField  _phoneNumField; 
    private BasicEditField  _messageField; 
    private ButtonField     _sendButton; 
    private StringBuffer    _statusGather;
    private TextField       _statusTextField;
    
    public Screen()
    {
        setBackground(BackgroundFactory.createBitmapBackground(Bitmap.getBitmapResource("background.png"), 0, 0, Background.REPEAT_BOTH));        
    
        setBanner(new LabelField("Niets..."));        
        setTitle("Send a Message");        
                
        _phoneNumField = new BasicEditField("To: ", "16043135227");
        _phoneNumField.setBorder(BorderFactory.createRoundedBorder(new XYEdges(5, 5, 5, 5)));
        _phoneNumField.setBackground(BackgroundFactory.createSolidBackground(0x00eeeeee));
        
        _messageField = new BasicEditField();
        _messageField.setText("...your message here.");
        _messageField.setBackground(BackgroundFactory.createSolidBackground(0x00fefdff));
        _messageField.setBorder(BorderFactory.createRoundedBorder(new XYEdges(5, 5, 5, 5)));        
                
        _sendButton = new ButtonField("Send");
        _sendButton.setChangeListener(new FieldChangeListener() {
            public void fieldChanged(Field field, int context) {
                final String dst = _phoneNumField.getText();
                final String msg = _messageField.getText();
                
                new NetworkThread(dst, msg, new NetworkEventHandler() {
                    public void log(final String str) {
                        UiApplication.getUiApplication().invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                _statusGather.append(str);
                                _statusGather.append('\n');
                                _statusTextField.setText(_statusGather.toString());
                            }
                        });
                    }
                }).start();
            }
        });
        
        
        _statusTextField = new TextField();
        _statusTextField.setBackground(BackgroundFactory.createSolidBackground(0xdddddd));
        _statusTextField.setBorder(BorderFactory.createRoundedBorder(new XYEdges(5, 5, 5, 5)));
        
        _statusGather = new StringBuffer();        
        
        add(_phoneNumField);        
        add(new LabelField("Message:"));
        add(_messageField);        
        add(_sendButton);        
        add(_statusTextField);                
    }
    
    protected void makeMenu(Menu menu, int instance) { 
            menu.add(_close);
    }
    
    private MenuItem _close = new MenuItem("Close", 110, 10) { 
        public void run() { 
            Dialog.alert("Later...");     
            onClose();
        } 
    };
}
