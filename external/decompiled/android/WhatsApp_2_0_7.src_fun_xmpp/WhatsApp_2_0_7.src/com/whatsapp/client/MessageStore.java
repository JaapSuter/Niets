package com.whatsapp.client;

import java.util.Vector;

public abstract interface MessageStore
{
  public abstract Vector getChats();

  public abstract Vector getAllOfflineMessages();

  public abstract FunXMPP.FMessage getMessage(FunXMPP.FMessage.Key paramKey);

  public abstract Vector getMessages(String paramString1, String paramString2);

  public abstract Vector getMessagesBefore(String paramString, FunXMPP.FMessage paramFMessage, int paramInt, int[] paramArrayOfInt);

  public abstract boolean putMessage(FunXMPP.FMessage paramFMessage, CompletionCallback paramCompletionCallback);

  public abstract boolean deleteMessage(FunXMPP.FMessage paramFMessage);

  public abstract boolean updateMessageStatus(FunXMPP.FMessage paramFMessage, CompletionCallback paramCompletionCallback);

  public abstract boolean deleteChatHistory(String paramString);

  public abstract boolean putMessageToTemp(FunXMPP.FMessage paramFMessage, CompletionCallback paramCompletionCallback);

  public abstract FunXMPP.FMessage getTempMessage(FunXMPP.FMessage.Key paramKey);

  public abstract boolean getGroupInfo(String paramString, ChatHistory.Group paramGroup);

  public abstract boolean putGroupSubject(String paramString1, String paramString2);

  public abstract boolean addGroupUser(String paramString1, String paramString2);

  public abstract boolean removeGroupUser(String paramString1, String paramString2);

  public abstract boolean addMMSFilename(String paramString1, String paramString2, MMSDownloader.MMSFilestoreCallback paramMMSFilestoreCallback);

  public abstract String[] getMMSFilenames(long paramLong);

  public abstract boolean recentError();

  public abstract int queueSize();

  public static abstract interface CompletionCallback
  {
    public abstract void operationCompleted();
  }

  public static abstract interface Listener
  {
    public abstract void messageReceipt(FunXMPP.FMessage.Key paramKey, int paramInt);

    public abstract void chatHistoryDeleted(String paramString);

    public abstract void groupChatMetadataUpdate(String paramString);

    public abstract void newFullMessage(FunXMPP.FMessage paramFMessage);

    public abstract void newSkeletalMessage(FunXMPP.FMessage paramFMessage);
  }
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.MessageStore
 * JD-Core Version:    0.6.0
 */