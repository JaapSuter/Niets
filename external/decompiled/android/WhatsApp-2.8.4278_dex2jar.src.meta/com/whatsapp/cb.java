package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

class cb extends AsyncTask<Void, Void, Bitmap>
{
  final Conversation a;

  cb(Conversation paramConversation)
  {
  }

  protected Bitmap a(Void[] paramArrayOfVoid)
  {
    Bitmap localBitmap = this.a.Qb.a((int)App.Mb.getResources().getDimension(2131361797), j4.a(App.Mb.getApplicationContext()).L, false);
    if (localBitmap == null)
      localBitmap = this.a.Qb.l();
    return localBitmap;
  }

  protected void a(Bitmap paramBitmap)
  {
    ImageView localImageView = this.a.Ob;
    if ((Conversation.k(this.a)) || (App.p()));
    for (boolean bool = true; ; bool = false)
    {
      localImageView.setEnabled(bool);
      this.a.Ob.setImageDrawable(new n(this, this.a.getResources(), paramBitmap));
      this.a.Ob.setVisibility(0);
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cb
 * JD-Core Version:    0.6.1
 */