package com.whatsapp;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Editable.Factory;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class ConversationTextEntry extends EditText
{
  private static final Editable.Factory editableFactory = new yd();
  private boolean inputEnterSend;

  public ConversationTextEntry(Context paramContext)
  {
    super(paramContext);
    if (Build.VERSION.SDK_INT >= 11)
      setEditableFactory(editableFactory);
  }

  public ConversationTextEntry(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (Build.VERSION.SDK_INT >= 11)
      setEditableFactory(editableFactory);
  }

  public ConversationTextEntry(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (Build.VERSION.SDK_INT >= 11)
      setEditableFactory(editableFactory);
  }

  public void a(boolean paramBoolean)
  {
    this.inputEnterSend = paramBoolean;
    setRawInputType(180225);
    if (paramBoolean)
    {
      setImeOptions(4);
      if (!DialogToastListActivity.f);
    }
    else
    {
      setImeOptions(1073741828);
    }
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    if (this.inputEnterSend)
    {
      int i = 0xFF & paramEditorInfo.imeOptions;
      if ((i & 0x4) != 0)
      {
        paramEditorInfo.imeOptions = (i ^ paramEditorInfo.imeOptions);
        paramEditorInfo.imeOptions = (0x4 | paramEditorInfo.imeOptions);
      }
      if ((0x40000000 & paramEditorInfo.imeOptions) != 0)
        paramEditorInfo.imeOptions = (0xBFFFFFFF & paramEditorInfo.imeOptions);
    }
    return localInputConnection;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ConversationTextEntry
 * JD-Core Version:    0.6.1
 */