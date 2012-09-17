package com.jaapsuter.niets;

import net.rim.device.api.ui.UiApplication;

public class App extends UiApplication
{
    public App()
    {        
        // Push a screen onto the UI stack for rendering.
        pushScreen(new Screen());
    }    
}
