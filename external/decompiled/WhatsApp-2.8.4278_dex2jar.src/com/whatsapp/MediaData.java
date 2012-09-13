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