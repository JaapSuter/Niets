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
    private BasicEditField _phoneNumField; 
    private BasicEditField _messageField; 
    private ButtonField _sendButton; 
    private StringBuffer _statusGather;
    private RichTextField _statusField;              
    
    public Screen()
    {                       
        setTitle("Niets");
                
        _phoneNumField = new BasicEditField("Phone-Nr: ", "16043135227");
        _phoneNumField.setBorder(BorderFactory
        add(_phoneNumField);
        
        _messageField = new BasicEditField("Message: ", "...text...");    
        add(_messageField);
        
        _sendButton = new ButtonField("Send");
        add(_sendButton);
        
        _statusField = new RichTextField(Field.NON_FOCUSABLE);    
        _statusField.setBackground(BackgroundFactory.createSolidBackground(0x00feddee));
        add(_statusField);
        
        _statusGather = new StringBuffer();
        
        final Screen self = this;
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
                                _statusField.setText(_statusGather.toString());
                            }
                        });
                    }
                }).start();
            }
        });
        
        // String phoneNum = Phone.getDevicePhoneNumber(false);
        // String ownerName = OwnerInfo.getOwnerName();
        // String imei = StringUtil.byteArrayToString(GPRSInfo.getIMEI());
        
        
        try {
            Stanza s = (Stanza)Class.forName("com.jaapsuter.niets.Stanza").newInstance();
        }
        catch (InstantiationException ie) {}
        catch (IllegalAccessException iae) {}
        catch (ClassNotFoundException cnfe) {}
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
