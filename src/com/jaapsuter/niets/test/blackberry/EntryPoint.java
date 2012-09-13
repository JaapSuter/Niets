package com.jaapsuter.niets.test.blackberry;

public class EntryPoint
{
    public static void main(String[] args)
    {
        // Create a new instance of the application and make the currently
        // running thread the application's event dispatch thread.
        App theApp = new App();
        theApp.enterEventDispatcher();
    }    
}