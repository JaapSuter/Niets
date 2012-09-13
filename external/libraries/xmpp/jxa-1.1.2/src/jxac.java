/*
 * Copyright 2008 Yuan-Chu Tai
 * http://sourceforge.net/projects/jxa
 *
 * This file is part of JXAC. JXAC is free software, developed at university.
 * You can redistribute it and/or modify it under the terms of the GNU General 
 * Public License as published by the Free Software Foundation; 
 * either version 2 of the License, or (at your option) any later version.
 * JXAC is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with mobber;
 * if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307 USA .
 */

import net.sourceforge.jxa.*;
import java.io.*;import java.util.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class jxac extends MIDlet implements CommandListener, XmppListener {
	private Form login_form;
	private List contacts_list;
	private Alert msg_alert;
	private TextBox send_box;
	private TextField id_field;
	private TextField passwd_field;
	private TextField server_field;
	private Command exit_cmd;
	private Command login_cmd;
	private Command send_cmd;
	private Command back_cmd;
	private Image offline_img;
	private Image online_img;
	private String whom;	
	private Jxa jxa;
	private Roster roster = new Roster();
	
	private Image loadImage(String name) {
		Image image = null;
		try {
		  image = Image.createImage(name);
		} catch (IOException ioe) {
		  System.out.println(ioe);
		}
		return image;
  }
	
	public void onConnFailed(String msg) {}

	public void onAuth(final String resource) {
		try {
			jxa.getRoster();
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		contacts_list.setTitle("contacts");
	}

	public void onAuthFailed(final String message) {}

	public void onMessageEvent(final String from, final String body) {
		msg_alert = new Alert("from " + from, body, null, AlertType.INFO);
		msg_alert.setTimeout(Alert.FOREVER );
		Display.getDisplay(this).setCurrent(msg_alert);
		java.lang.System.out.println("*debug* message, " + from + ":" + body);
		java.lang.System.out.println("*debug* " + this.roster.get_allMessages());
	}

	public void onContactEvent(final String jid, final String name, final String group, final String subscription) {
		if (subscription.equals("both"))
			contacts_list.append(jid, offline_img);
	}

	public void onContactOverEvent() {}

	public void onStatusEvent(final String jid, final String show, final String status) {
		java.lang.System.out.println("*debug* onStatusEvent: " + jid + ", " + show + ", " + status);
		int i = jid.indexOf('/');
		String name = jid.substring(0, i);
		for (i=0; i< contacts_list.size(); i++) {
			if (name.equals(contacts_list.getString(i)))
				if (show.equals("na"))
					contacts_list.set(i, name, offline_img);
				else
					contacts_list.set(i, name, online_img);
		}
	}

	public void onSubscribeEvent(final String jid) {}

	public void onUnsubscribeEvent(final String jid) {}

	public void commandAction(final Command cmd, final Displayable displayable) {
		if (cmd == login_cmd) {
			String id = id_field.getString();
			String passwd = passwd_field.getString();
			String server = server_field.getString();
			Display.getDisplay(this).setCurrent(contacts_list);
			jxa = new Jxa(id, passwd, "mobile", 10, server, "5223", true);
	    jxa.addListener(this);
	    jxa.start();
	  } else if (cmd == back_cmd) {
	  	Display.getDisplay(this).setCurrent(contacts_list);
	  } else if (cmd == send_cmd) {
	  	jxa.sendMessage(whom, send_box.getString());
	  	Display.getDisplay(this).setCurrent(contacts_list);
		} else if (cmd == List.SELECT_COMMAND) {
			String to = contacts_list.getString(contacts_list.getSelectedIndex());
			whom = to;
			send_box.setTitle("to " + to);
			Display.getDisplay(this).setCurrent(send_box);
		} else if (cmd == exit_cmd) 
			notifyDestroyed();
	}

	public void startApp() {
		login_form = new Form("login");
    id_field = new TextField("ID(xxx@xxx.xxx)", null, 30, TextField.ANY);
    login_form.append(id_field);
    passwd_field = new TextField("password", null, 15, TextField.PASSWORD);
    login_form.append(passwd_field);
    server_field = new TextField("server", "talk.google.com", 20, TextField.ANY);
    login_form.append(server_field);
    exit_cmd = new Command("Exit", Command.EXIT, 0);
		login_cmd = new Command("Login", Command.OK, 1);
		login_form.addCommand(exit_cmd);
		login_form.addCommand(login_cmd);
    login_form.setCommandListener(this);
    
    contacts_list = new List("connecting...", List.IMPLICIT);
		contacts_list.addCommand(exit_cmd);
    contacts_list.setCommandListener(this);
    
    send_box = new TextBox(null, null, 50, TextField.ANY);
    back_cmd = new Command("Back", Command.BACK, 0);
		send_cmd = new Command("Send", Command.OK, 1);
		send_box.addCommand(back_cmd);
		send_box.addCommand(send_cmd);
		send_box.setCommandListener(this);
		
		online_img = loadImage("/online.png");
		offline_img = loadImage("/offline.png");
     
    Display.getDisplay(this).setCurrent(login_form);
	}
	
	public void pauseApp () {}
  
  public void destroyApp(boolean unconditional) {}
}
