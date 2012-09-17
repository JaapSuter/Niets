package com.whatsapp;

import java.io.File;
import java.io.Serializable;

public class MediaData
  implements Serializable
{
  static final long serialVersionUID = -3211751283609594L;
  transient ob downloader;
  public File file;
  long progress;
  public boolean transferred = false;
  transient boolean transferring = false;
  transient pb uploader;

  public MediaData()
  {
  }

  public MediaData(MediaData paramMediaData)
  {
    this.transferred = paramMediaData.transferred;
    this.file = paramMediaData.file;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.MediaData
 * JD-Core Version:    0.6.1
 */