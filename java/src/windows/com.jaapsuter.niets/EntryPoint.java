package com.jaapsuter.niets;

public class EntryPoint
{
    public static void main(String[] args)
    {
        Niets.run();

        new NetworkThread("16043135227", "Here's a message....", new NetworkEventHandler() {
            public void log(String msg) {
                System.out.println(msg);
            }
        }).start();
    }
}