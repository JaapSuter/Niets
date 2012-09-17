package com;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface b extends IInterface
{
  public abstract Bundle a(Bundle paramBundle)
    throws RemoteException;
}