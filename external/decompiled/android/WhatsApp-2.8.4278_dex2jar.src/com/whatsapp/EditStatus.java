package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditStatus extends Activity
{
  static CharSequence b;
  EditText a;

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903089);
    this.a = ((EditText)findViewById(2131558655));
    this.a.setGravity(TextEmojiLabel.a(this.a.getText().toString()));
    this.a.addTextChangedListener(new bs(this));
    if (b != null)
      this.a.setText(b);
    ((Button)findViewById(2131558638)).setOnClickListener(new cs(this));
  }
}