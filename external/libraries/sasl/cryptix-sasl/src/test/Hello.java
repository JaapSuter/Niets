package test;

// $Id: Hello.java,v 1.1 2001/06/16 09:06:05 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote
{
   String sayHello() throws RemoteException;
}