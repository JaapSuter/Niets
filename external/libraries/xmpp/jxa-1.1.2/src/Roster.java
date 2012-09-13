/*
 * Copyright 2006 Dustin Hass, Sven Jost, Swen Kummer
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

//package net.sourceforge.jxa.client;

import java.util.Hashtable;

/**
 * Roster for J2ME XMPP API (JXA)
 * Created for a project Multimediaprotokolle at University of Potsdam - Germany
 *
 * Roster class is required to manage incomming und outgoing messages. You can
 * use Roster also to manage buddy status. 
 *
 * @author Dustin Hass, Sven Jost, Swen Kummer
 * @version 2.0
 * @since JXAC 1.0
 */

public class Roster {
    /**
     * All messages, in + out, are saved in messagearchive 
     */
    private Hashtable messagearchive = new Hashtable();

    /**
     * Every buddy status can be saved in status 
     */
    private Hashtable status = new Hashtable();
    
    /**
     * Messagenumber is the counter of saved messages in messagearchive.
     * If you delete messages in messagearchive, the counter did not change.
     * The counter is needful to generate the key for hashtable. We use
     * messagenumber also to perambulate the messagearchive in get_Messages.
     */
    private int messagenumber = 0; 

    /**
     * The return value of get_Buddystatus is string. So we use buddystatus
     * in get_Buddystatus and init first empty. Later in get_Buddystatus we
     * init with "error". If no buddy was found in buddystatus, we return an 
     * error message "error".
     */
    private String buddystatus = "";

    /**
     * The returnvalue of get_Messages is string. So we add all matching
     * messages from messagearchiv to one long string to messagehistory 
     * and return them.
     */
    private String messagehistory = "";

    /**
     * A temporary string variable for get_Messages. We use namesearchstring
     * to build a key and to search with the key in messagearchive.
     */
    private String namesearchstring = "";

    /**
     * This is also a temporary variable for loop in get_Messages.
     */
    private int messagecounter = 0;

 
 
    public Roster() {
    }




 
   /** Save incomming Messages<br>
    *  All recieved messages saved in hashtable with key and value.
    *  You must save all incomming messages, else they will be lost.   
    *  @param from person who send the message to you
    *  @param messagetext the message self
    */ 


   public void save_Message_ex(String from, final String messagetext) {
       // build key
       this.messagenumber = this.messagenumber + 1;
       from = from + "*" + this.messagenumber ;
       
       // save in hashtable
       this.messagearchive.put(from,messagetext);
    }





   /** Save all outgoing Messages<br>
    *  All send messages saved in hashtable with key and value.
    *  In JXAC -> commandAction -> chatC_senden you should call this method.
    *  To view later the history (JXAC form sI.chat.SetText) the send text,
    *  you have to call <i>get_Messages(String from, String me)</i>.
    *  @param from person who sends the message
    *  @param to person who receives the message
    *  @param messagetext the message text
    */
    
    
    public void save_Message_in(String from, final String to, final String messagetext) {
       // buildkey
       this.messagenumber = this.messagenumber + 1;
           from = from + "*" + to + "*" + this.messagenumber;
       
       // save in hashtable
       this.messagearchive.put(from,messagetext);
      }





   /** Return all Messages between two persons as String <br>
    *  when open a buddy contact by viewing messages, you must call
    *  <i>get_Messages()</i> to receive the chat history. In JXAC the 
    *  return value is given to form sI.chat.SetText.
    *  @param from person who sends the message
    *  @param me person who receives the message
    *  @return messagehistory all matching message between from + me
    */
	
	
    public String get_Messages(final String from, final String me) {
        // reset variables
        this.messagehistory = "";
        this.namesearchstring = "";
        // walk through archive to find messages from me to selected person
        for ( this.messagecounter=0; this.messagecounter <= this.messagenumber; this.messagecounter++ ) { 
          
            // build search key for messages incomming
            this.namesearchstring = from + "*" + this.messagecounter;
            if (this.messagearchive.containsKey(this.namesearchstring)) 
               {
               this.messagehistory = this.messagehistory + from + " " + this.messagearchive.get(this.namesearchstring) + "\n";
               }
            // build search key for messages outgoing
            this.namesearchstring = me + "*" + this.namesearchstring;
            if (this.messagearchive.containsKey(this.namesearchstring)) 
               {
               this.messagehistory = this.messagehistory + me + " " +  this.messagearchive.get(this.namesearchstring) + "\n";
               }
            }
        return this.messagehistory;
        }
  
  
  
  
   /** Return all Messages since application start as String<br>
    *  @return messagehistory which contains all messages in archive
    */


    public String get_allMessages() {
        this.messagehistory = "";
        this.messagehistory = this.messagearchive.toString();
        return this.messagehistory;
        }
  
 
 
 
        
   /** Clear all Messages in hashtable<br>
    *  Empty the hashtable messagearchive.
    */
 
 
    public void clear_Messages() {
       this.messagearchive.clear();
    }

   /** Set status for items in buddylist<br>
    *  Status saved in hashtable with jid and value.
    *  In JXAC we used shortjid, so beware if to buddy's use same shortjid.
    *  @param new_status new status for buddy 
    *  @param buddyname name of buddy
    */    
    public void set_Buddystatus(final String new_status, final String buddyname) {
       this.status.put(buddyname,new_status);
    }





   /** Return status for buddy <br>
    *  If buddy is not in hashtable, return string "error"
    *  @param buddy buddy with requested status
    *  @return status status of buddy
    */         
    public String get_Buddystatus(final String buddy) {
         this.buddystatus = "error";
         if (this.status.containsKey(buddy)) 
               {
               this.buddystatus = this.status.get(buddy).toString();
               }
        return this.buddystatus;
        }
  
 }
