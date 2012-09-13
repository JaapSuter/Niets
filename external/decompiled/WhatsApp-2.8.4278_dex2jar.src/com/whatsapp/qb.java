package com.whatsapp;

import android.os.AsyncTask;
import java.io.File;

public class qb extends AsyncTask<Void, Void, String>
{
  private File a;

  public qb(File paramFile)
  {
    this.a = paramFile;
  }

  protected String a(Void[] paramArrayOfVoid)
  {
    return pb.b(this.a);
  }
}