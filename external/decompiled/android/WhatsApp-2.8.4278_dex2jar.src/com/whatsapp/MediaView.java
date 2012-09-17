package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.text.SpannableStringBuilder;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.wallpaper.CropImage;
import com.whatsapp.wallpaper.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaView extends DialogToastActivity
{
  public static Display B;
  public static MediaView L;
  public static int M;
  private static final String[] Z;
  public static int w;
  private String A;
  private Uri C;
  boolean D;
  private Handler E;
  private int F;
  private int G;
  private Button H;
  private boolean I = false;
  private boolean J;
  private View.OnTouchListener K;
  long N;
  int O;
  int P;
  Handler Q;
  int R = 0;
  boolean S = false;
  boolean T = false;
  int U;
  boolean V = false;
  sb W;
  View.OnClickListener X = new bx(this);
  Handler Y = new kd(this);
  private TextView f;
  private TextView g;
  private TextView h;
  private TouchImageView i;
  private TextView j;
  private SeekBar k;
  private MediaPlayer l;
  private ImageView m;
  private ImageView n;
  private ImageView o;
  private ImageView p;
  private View q;
  private GalleryView r;
  private View s;
  private LinearLayout t;
  private j4 u;
  private Uri v;
  ArrayList<sz> x;
  private int y;
  private int z;

  // ERROR //
  static
  {
    // Byte code:
    //   0: bipush 59
    //   2: anewarray 76	java/lang/String
    //   5: astore_0
    //   6: ldc 78
    //   8: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   11: astore_1
    //   12: aload_1
    //   13: arraylength
    //   14: istore_2
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_2
    //   18: iload_3
    //   19: if_icmpgt +2333 -> 2352
    //   22: aload_0
    //   23: iconst_0
    //   24: new 76	java/lang/String
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 86	java/lang/String:<init>	([C)V
    //   32: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   35: aastore
    //   36: ldc 92
    //   38: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   41: astore 6
    //   43: aload 6
    //   45: arraylength
    //   46: istore 7
    //   48: iconst_0
    //   49: istore 8
    //   51: iload 7
    //   53: iload 8
    //   55: if_icmpgt +2384 -> 2439
    //   58: aload_0
    //   59: iconst_1
    //   60: new 76	java/lang/String
    //   63: dup
    //   64: aload 6
    //   66: invokespecial 86	java/lang/String:<init>	([C)V
    //   69: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   72: aastore
    //   73: ldc 94
    //   75: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   78: astore 11
    //   80: aload 11
    //   82: arraylength
    //   83: istore 12
    //   85: iconst_0
    //   86: istore 13
    //   88: iload 12
    //   90: iload 13
    //   92: if_icmpgt +2437 -> 2529
    //   95: aload_0
    //   96: iconst_2
    //   97: new 76	java/lang/String
    //   100: dup
    //   101: aload 11
    //   103: invokespecial 86	java/lang/String:<init>	([C)V
    //   106: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   109: aastore
    //   110: ldc 96
    //   112: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   115: astore 16
    //   117: aload 16
    //   119: arraylength
    //   120: istore 17
    //   122: iconst_0
    //   123: istore 18
    //   125: iload 17
    //   127: iload 18
    //   129: if_icmpgt +2492 -> 2621
    //   132: aload_0
    //   133: iconst_3
    //   134: new 76	java/lang/String
    //   137: dup
    //   138: aload 16
    //   140: invokespecial 86	java/lang/String:<init>	([C)V
    //   143: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   146: aastore
    //   147: ldc 98
    //   149: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   152: astore 21
    //   154: aload 21
    //   156: arraylength
    //   157: istore 22
    //   159: iconst_0
    //   160: istore 23
    //   162: iload 22
    //   164: iload 23
    //   166: if_icmpgt +2547 -> 2713
    //   169: aload_0
    //   170: iconst_4
    //   171: new 76	java/lang/String
    //   174: dup
    //   175: aload 21
    //   177: invokespecial 86	java/lang/String:<init>	([C)V
    //   180: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   183: aastore
    //   184: ldc 100
    //   186: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   189: astore 26
    //   191: aload 26
    //   193: arraylength
    //   194: istore 27
    //   196: iconst_0
    //   197: istore 28
    //   199: iload 27
    //   201: iload 28
    //   203: if_icmpgt +2602 -> 2805
    //   206: aload_0
    //   207: iconst_5
    //   208: new 76	java/lang/String
    //   211: dup
    //   212: aload 26
    //   214: invokespecial 86	java/lang/String:<init>	([C)V
    //   217: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   220: aastore
    //   221: ldc 102
    //   223: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   226: astore 31
    //   228: aload 31
    //   230: arraylength
    //   231: istore 32
    //   233: iconst_0
    //   234: istore 33
    //   236: iload 32
    //   238: iload 33
    //   240: if_icmpgt +2657 -> 2897
    //   243: aload_0
    //   244: bipush 6
    //   246: new 76	java/lang/String
    //   249: dup
    //   250: aload 31
    //   252: invokespecial 86	java/lang/String:<init>	([C)V
    //   255: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   258: aastore
    //   259: ldc 104
    //   261: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   264: astore 36
    //   266: aload 36
    //   268: arraylength
    //   269: istore 37
    //   271: iconst_0
    //   272: istore 38
    //   274: iload 37
    //   276: iload 38
    //   278: if_icmpgt +2711 -> 2989
    //   281: aload_0
    //   282: bipush 7
    //   284: new 76	java/lang/String
    //   287: dup
    //   288: aload 36
    //   290: invokespecial 86	java/lang/String:<init>	([C)V
    //   293: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   296: aastore
    //   297: ldc 106
    //   299: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   302: astore 41
    //   304: aload 41
    //   306: arraylength
    //   307: istore 42
    //   309: iconst_0
    //   310: istore 43
    //   312: iload 42
    //   314: iload 43
    //   316: if_icmpgt +2765 -> 3081
    //   319: aload_0
    //   320: bipush 8
    //   322: new 76	java/lang/String
    //   325: dup
    //   326: aload 41
    //   328: invokespecial 86	java/lang/String:<init>	([C)V
    //   331: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   334: aastore
    //   335: ldc 108
    //   337: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   340: astore 46
    //   342: aload 46
    //   344: arraylength
    //   345: istore 47
    //   347: iconst_0
    //   348: istore 48
    //   350: iload 47
    //   352: iload 48
    //   354: if_icmpgt +2819 -> 3173
    //   357: aload_0
    //   358: bipush 9
    //   360: new 76	java/lang/String
    //   363: dup
    //   364: aload 46
    //   366: invokespecial 86	java/lang/String:<init>	([C)V
    //   369: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   372: aastore
    //   373: ldc 110
    //   375: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   378: astore 51
    //   380: aload 51
    //   382: arraylength
    //   383: istore 52
    //   385: iconst_0
    //   386: istore 53
    //   388: iload 52
    //   390: iload 53
    //   392: if_icmpgt +2873 -> 3265
    //   395: aload_0
    //   396: bipush 10
    //   398: new 76	java/lang/String
    //   401: dup
    //   402: aload 51
    //   404: invokespecial 86	java/lang/String:<init>	([C)V
    //   407: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   410: aastore
    //   411: ldc 112
    //   413: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   416: astore 56
    //   418: aload 56
    //   420: arraylength
    //   421: istore 57
    //   423: iconst_0
    //   424: istore 58
    //   426: iload 57
    //   428: iload 58
    //   430: if_icmpgt +2927 -> 3357
    //   433: aload_0
    //   434: bipush 11
    //   436: new 76	java/lang/String
    //   439: dup
    //   440: aload 56
    //   442: invokespecial 86	java/lang/String:<init>	([C)V
    //   445: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   448: aastore
    //   449: ldc 114
    //   451: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   454: astore 61
    //   456: aload 61
    //   458: arraylength
    //   459: istore 62
    //   461: iconst_0
    //   462: istore 63
    //   464: iload 62
    //   466: iload 63
    //   468: if_icmpgt +2981 -> 3449
    //   471: aload_0
    //   472: bipush 12
    //   474: new 76	java/lang/String
    //   477: dup
    //   478: aload 61
    //   480: invokespecial 86	java/lang/String:<init>	([C)V
    //   483: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   486: aastore
    //   487: ldc 116
    //   489: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   492: astore 66
    //   494: aload 66
    //   496: arraylength
    //   497: istore 67
    //   499: iconst_0
    //   500: istore 68
    //   502: iload 67
    //   504: iload 68
    //   506: if_icmpgt +3035 -> 3541
    //   509: aload_0
    //   510: bipush 13
    //   512: new 76	java/lang/String
    //   515: dup
    //   516: aload 66
    //   518: invokespecial 86	java/lang/String:<init>	([C)V
    //   521: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   524: aastore
    //   525: ldc 118
    //   527: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   530: astore 71
    //   532: aload 71
    //   534: arraylength
    //   535: istore 72
    //   537: iconst_0
    //   538: istore 73
    //   540: iload 72
    //   542: iload 73
    //   544: if_icmpgt +3089 -> 3633
    //   547: aload_0
    //   548: bipush 14
    //   550: new 76	java/lang/String
    //   553: dup
    //   554: aload 71
    //   556: invokespecial 86	java/lang/String:<init>	([C)V
    //   559: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   562: aastore
    //   563: ldc 120
    //   565: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   568: astore 76
    //   570: aload 76
    //   572: arraylength
    //   573: istore 77
    //   575: iconst_0
    //   576: istore 78
    //   578: iload 77
    //   580: iload 78
    //   582: if_icmpgt +3143 -> 3725
    //   585: aload_0
    //   586: bipush 15
    //   588: new 76	java/lang/String
    //   591: dup
    //   592: aload 76
    //   594: invokespecial 86	java/lang/String:<init>	([C)V
    //   597: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   600: aastore
    //   601: ldc 122
    //   603: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   606: astore 81
    //   608: aload 81
    //   610: arraylength
    //   611: istore 82
    //   613: iconst_0
    //   614: istore 83
    //   616: iload 82
    //   618: iload 83
    //   620: if_icmpgt +3197 -> 3817
    //   623: aload_0
    //   624: bipush 16
    //   626: new 76	java/lang/String
    //   629: dup
    //   630: aload 81
    //   632: invokespecial 86	java/lang/String:<init>	([C)V
    //   635: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   638: aastore
    //   639: ldc 124
    //   641: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   644: astore 86
    //   646: aload 86
    //   648: arraylength
    //   649: istore 87
    //   651: iconst_0
    //   652: istore 88
    //   654: iload 87
    //   656: iload 88
    //   658: if_icmpgt +3251 -> 3909
    //   661: aload_0
    //   662: bipush 17
    //   664: new 76	java/lang/String
    //   667: dup
    //   668: aload 86
    //   670: invokespecial 86	java/lang/String:<init>	([C)V
    //   673: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   676: aastore
    //   677: ldc 126
    //   679: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   682: astore 91
    //   684: aload 91
    //   686: arraylength
    //   687: istore 92
    //   689: iconst_0
    //   690: istore 93
    //   692: iload 92
    //   694: iload 93
    //   696: if_icmpgt +3305 -> 4001
    //   699: aload_0
    //   700: bipush 18
    //   702: new 76	java/lang/String
    //   705: dup
    //   706: aload 91
    //   708: invokespecial 86	java/lang/String:<init>	([C)V
    //   711: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   714: aastore
    //   715: ldc 128
    //   717: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   720: astore 96
    //   722: aload 96
    //   724: arraylength
    //   725: istore 97
    //   727: iconst_0
    //   728: istore 98
    //   730: iload 97
    //   732: iload 98
    //   734: if_icmpgt +3359 -> 4093
    //   737: aload_0
    //   738: bipush 19
    //   740: new 76	java/lang/String
    //   743: dup
    //   744: aload 96
    //   746: invokespecial 86	java/lang/String:<init>	([C)V
    //   749: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   752: aastore
    //   753: ldc 130
    //   755: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   758: astore 101
    //   760: aload 101
    //   762: arraylength
    //   763: istore 102
    //   765: iconst_0
    //   766: istore 103
    //   768: iload 102
    //   770: iload 103
    //   772: if_icmpgt +3413 -> 4185
    //   775: aload_0
    //   776: bipush 20
    //   778: new 76	java/lang/String
    //   781: dup
    //   782: aload 101
    //   784: invokespecial 86	java/lang/String:<init>	([C)V
    //   787: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   790: aastore
    //   791: ldc 132
    //   793: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   796: astore 106
    //   798: aload 106
    //   800: arraylength
    //   801: istore 107
    //   803: iconst_0
    //   804: istore 108
    //   806: iload 107
    //   808: iload 108
    //   810: if_icmpgt +3467 -> 4277
    //   813: aload_0
    //   814: bipush 21
    //   816: new 76	java/lang/String
    //   819: dup
    //   820: aload 106
    //   822: invokespecial 86	java/lang/String:<init>	([C)V
    //   825: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   828: aastore
    //   829: ldc 134
    //   831: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   834: astore 111
    //   836: aload 111
    //   838: arraylength
    //   839: istore 112
    //   841: iconst_0
    //   842: istore 113
    //   844: iload 112
    //   846: iload 113
    //   848: if_icmpgt +3521 -> 4369
    //   851: aload_0
    //   852: bipush 22
    //   854: new 76	java/lang/String
    //   857: dup
    //   858: aload 111
    //   860: invokespecial 86	java/lang/String:<init>	([C)V
    //   863: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   866: aastore
    //   867: ldc 136
    //   869: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   872: astore 116
    //   874: aload 116
    //   876: arraylength
    //   877: istore 117
    //   879: iconst_0
    //   880: istore 118
    //   882: iload 117
    //   884: iload 118
    //   886: if_icmpgt +3575 -> 4461
    //   889: aload_0
    //   890: bipush 23
    //   892: new 76	java/lang/String
    //   895: dup
    //   896: aload 116
    //   898: invokespecial 86	java/lang/String:<init>	([C)V
    //   901: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   904: aastore
    //   905: ldc 138
    //   907: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   910: astore 121
    //   912: aload 121
    //   914: arraylength
    //   915: istore 122
    //   917: iconst_0
    //   918: istore 123
    //   920: iload 122
    //   922: iload 123
    //   924: if_icmpgt +3629 -> 4553
    //   927: aload_0
    //   928: bipush 24
    //   930: new 76	java/lang/String
    //   933: dup
    //   934: aload 121
    //   936: invokespecial 86	java/lang/String:<init>	([C)V
    //   939: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   942: aastore
    //   943: ldc 140
    //   945: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   948: astore 126
    //   950: aload 126
    //   952: arraylength
    //   953: istore 127
    //   955: iconst_0
    //   956: istore 128
    //   958: iload 127
    //   960: iload 128
    //   962: if_icmpgt +3683 -> 4645
    //   965: aload_0
    //   966: bipush 25
    //   968: new 76	java/lang/String
    //   971: dup
    //   972: aload 126
    //   974: invokespecial 86	java/lang/String:<init>	([C)V
    //   977: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   980: aastore
    //   981: ldc 142
    //   983: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   986: astore 131
    //   988: aload 131
    //   990: arraylength
    //   991: istore 132
    //   993: iconst_0
    //   994: istore 133
    //   996: iload 132
    //   998: iload 133
    //   1000: if_icmpgt +3737 -> 4737
    //   1003: aload_0
    //   1004: bipush 26
    //   1006: new 76	java/lang/String
    //   1009: dup
    //   1010: aload 131
    //   1012: invokespecial 86	java/lang/String:<init>	([C)V
    //   1015: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1018: aastore
    //   1019: ldc 144
    //   1021: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1024: astore 136
    //   1026: aload 136
    //   1028: arraylength
    //   1029: istore 137
    //   1031: iconst_0
    //   1032: istore 138
    //   1034: iload 137
    //   1036: iload 138
    //   1038: if_icmpgt +3791 -> 4829
    //   1041: aload_0
    //   1042: bipush 27
    //   1044: new 76	java/lang/String
    //   1047: dup
    //   1048: aload 136
    //   1050: invokespecial 86	java/lang/String:<init>	([C)V
    //   1053: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1056: aastore
    //   1057: ldc 146
    //   1059: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1062: astore 141
    //   1064: aload 141
    //   1066: arraylength
    //   1067: istore 142
    //   1069: iconst_0
    //   1070: istore 143
    //   1072: iload 142
    //   1074: iload 143
    //   1076: if_icmpgt +3845 -> 4921
    //   1079: aload_0
    //   1080: bipush 28
    //   1082: new 76	java/lang/String
    //   1085: dup
    //   1086: aload 141
    //   1088: invokespecial 86	java/lang/String:<init>	([C)V
    //   1091: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1094: aastore
    //   1095: ldc 148
    //   1097: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1100: astore 146
    //   1102: aload 146
    //   1104: arraylength
    //   1105: istore 147
    //   1107: iconst_0
    //   1108: istore 148
    //   1110: iload 147
    //   1112: iload 148
    //   1114: if_icmpgt +3899 -> 5013
    //   1117: aload_0
    //   1118: bipush 29
    //   1120: new 76	java/lang/String
    //   1123: dup
    //   1124: aload 146
    //   1126: invokespecial 86	java/lang/String:<init>	([C)V
    //   1129: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1132: aastore
    //   1133: ldc 150
    //   1135: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1138: astore 151
    //   1140: aload 151
    //   1142: arraylength
    //   1143: istore 152
    //   1145: iconst_0
    //   1146: istore 153
    //   1148: iload 152
    //   1150: iload 153
    //   1152: if_icmpgt +3953 -> 5105
    //   1155: aload_0
    //   1156: bipush 30
    //   1158: new 76	java/lang/String
    //   1161: dup
    //   1162: aload 151
    //   1164: invokespecial 86	java/lang/String:<init>	([C)V
    //   1167: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1170: aastore
    //   1171: ldc 152
    //   1173: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1176: astore 156
    //   1178: aload 156
    //   1180: arraylength
    //   1181: istore 157
    //   1183: iconst_0
    //   1184: istore 158
    //   1186: iload 157
    //   1188: iload 158
    //   1190: if_icmpgt +4007 -> 5197
    //   1193: aload_0
    //   1194: bipush 31
    //   1196: new 76	java/lang/String
    //   1199: dup
    //   1200: aload 156
    //   1202: invokespecial 86	java/lang/String:<init>	([C)V
    //   1205: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1208: aastore
    //   1209: ldc 154
    //   1211: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1214: astore 161
    //   1216: aload 161
    //   1218: arraylength
    //   1219: istore 162
    //   1221: iconst_0
    //   1222: istore 163
    //   1224: iload 162
    //   1226: iload 163
    //   1228: if_icmpgt +4061 -> 5289
    //   1231: aload_0
    //   1232: bipush 32
    //   1234: new 76	java/lang/String
    //   1237: dup
    //   1238: aload 161
    //   1240: invokespecial 86	java/lang/String:<init>	([C)V
    //   1243: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1246: aastore
    //   1247: ldc 156
    //   1249: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1252: astore 166
    //   1254: aload 166
    //   1256: arraylength
    //   1257: istore 167
    //   1259: iconst_0
    //   1260: istore 168
    //   1262: iload 167
    //   1264: iload 168
    //   1266: if_icmpgt +4115 -> 5381
    //   1269: aload_0
    //   1270: bipush 33
    //   1272: new 76	java/lang/String
    //   1275: dup
    //   1276: aload 166
    //   1278: invokespecial 86	java/lang/String:<init>	([C)V
    //   1281: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1284: aastore
    //   1285: ldc 158
    //   1287: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1290: astore 171
    //   1292: aload 171
    //   1294: arraylength
    //   1295: istore 172
    //   1297: iconst_0
    //   1298: istore 173
    //   1300: iload 172
    //   1302: iload 173
    //   1304: if_icmpgt +4169 -> 5473
    //   1307: aload_0
    //   1308: bipush 34
    //   1310: new 76	java/lang/String
    //   1313: dup
    //   1314: aload 171
    //   1316: invokespecial 86	java/lang/String:<init>	([C)V
    //   1319: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1322: aastore
    //   1323: ldc 160
    //   1325: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1328: astore 176
    //   1330: aload 176
    //   1332: arraylength
    //   1333: istore 177
    //   1335: iconst_0
    //   1336: istore 178
    //   1338: iload 177
    //   1340: iload 178
    //   1342: if_icmpgt +4223 -> 5565
    //   1345: aload_0
    //   1346: bipush 35
    //   1348: new 76	java/lang/String
    //   1351: dup
    //   1352: aload 176
    //   1354: invokespecial 86	java/lang/String:<init>	([C)V
    //   1357: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1360: aastore
    //   1361: ldc 162
    //   1363: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1366: astore 181
    //   1368: aload 181
    //   1370: arraylength
    //   1371: istore 182
    //   1373: iconst_0
    //   1374: istore 183
    //   1376: iload 182
    //   1378: iload 183
    //   1380: if_icmpgt +4277 -> 5657
    //   1383: aload_0
    //   1384: bipush 36
    //   1386: new 76	java/lang/String
    //   1389: dup
    //   1390: aload 181
    //   1392: invokespecial 86	java/lang/String:<init>	([C)V
    //   1395: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1398: aastore
    //   1399: ldc 164
    //   1401: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1404: astore 186
    //   1406: aload 186
    //   1408: arraylength
    //   1409: istore 187
    //   1411: iconst_0
    //   1412: istore 188
    //   1414: iload 187
    //   1416: iload 188
    //   1418: if_icmpgt +4331 -> 5749
    //   1421: aload_0
    //   1422: bipush 37
    //   1424: new 76	java/lang/String
    //   1427: dup
    //   1428: aload 186
    //   1430: invokespecial 86	java/lang/String:<init>	([C)V
    //   1433: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1436: aastore
    //   1437: ldc 166
    //   1439: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1442: astore 191
    //   1444: aload 191
    //   1446: arraylength
    //   1447: istore 192
    //   1449: iconst_0
    //   1450: istore 193
    //   1452: iload 192
    //   1454: iload 193
    //   1456: if_icmpgt +4385 -> 5841
    //   1459: aload_0
    //   1460: bipush 38
    //   1462: new 76	java/lang/String
    //   1465: dup
    //   1466: aload 191
    //   1468: invokespecial 86	java/lang/String:<init>	([C)V
    //   1471: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1474: aastore
    //   1475: ldc 168
    //   1477: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1480: astore 196
    //   1482: aload 196
    //   1484: arraylength
    //   1485: istore 197
    //   1487: iconst_0
    //   1488: istore 198
    //   1490: iload 197
    //   1492: iload 198
    //   1494: if_icmpgt +4439 -> 5933
    //   1497: aload_0
    //   1498: bipush 39
    //   1500: new 76	java/lang/String
    //   1503: dup
    //   1504: aload 196
    //   1506: invokespecial 86	java/lang/String:<init>	([C)V
    //   1509: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1512: aastore
    //   1513: ldc 170
    //   1515: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1518: astore 201
    //   1520: aload 201
    //   1522: arraylength
    //   1523: istore 202
    //   1525: iconst_0
    //   1526: istore 203
    //   1528: iload 202
    //   1530: iload 203
    //   1532: if_icmpgt +4493 -> 6025
    //   1535: aload_0
    //   1536: bipush 40
    //   1538: new 76	java/lang/String
    //   1541: dup
    //   1542: aload 201
    //   1544: invokespecial 86	java/lang/String:<init>	([C)V
    //   1547: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1550: aastore
    //   1551: ldc 172
    //   1553: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1556: astore 206
    //   1558: aload 206
    //   1560: arraylength
    //   1561: istore 207
    //   1563: iconst_0
    //   1564: istore 208
    //   1566: iload 207
    //   1568: iload 208
    //   1570: if_icmpgt +4547 -> 6117
    //   1573: aload_0
    //   1574: bipush 41
    //   1576: new 76	java/lang/String
    //   1579: dup
    //   1580: aload 206
    //   1582: invokespecial 86	java/lang/String:<init>	([C)V
    //   1585: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1588: aastore
    //   1589: ldc 174
    //   1591: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1594: astore 211
    //   1596: aload 211
    //   1598: arraylength
    //   1599: istore 212
    //   1601: iconst_0
    //   1602: istore 213
    //   1604: iload 212
    //   1606: iload 213
    //   1608: if_icmpgt +4601 -> 6209
    //   1611: aload_0
    //   1612: bipush 42
    //   1614: new 76	java/lang/String
    //   1617: dup
    //   1618: aload 211
    //   1620: invokespecial 86	java/lang/String:<init>	([C)V
    //   1623: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1626: aastore
    //   1627: ldc 176
    //   1629: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1632: astore 216
    //   1634: aload 216
    //   1636: arraylength
    //   1637: istore 217
    //   1639: iconst_0
    //   1640: istore 218
    //   1642: iload 217
    //   1644: iload 218
    //   1646: if_icmpgt +4655 -> 6301
    //   1649: aload_0
    //   1650: bipush 43
    //   1652: new 76	java/lang/String
    //   1655: dup
    //   1656: aload 216
    //   1658: invokespecial 86	java/lang/String:<init>	([C)V
    //   1661: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1664: aastore
    //   1665: ldc 178
    //   1667: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1670: astore 221
    //   1672: aload 221
    //   1674: arraylength
    //   1675: istore 222
    //   1677: iconst_0
    //   1678: istore 223
    //   1680: iload 222
    //   1682: iload 223
    //   1684: if_icmpgt +4709 -> 6393
    //   1687: aload_0
    //   1688: bipush 44
    //   1690: new 76	java/lang/String
    //   1693: dup
    //   1694: aload 221
    //   1696: invokespecial 86	java/lang/String:<init>	([C)V
    //   1699: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1702: aastore
    //   1703: ldc 180
    //   1705: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1708: astore 226
    //   1710: aload 226
    //   1712: arraylength
    //   1713: istore 227
    //   1715: iconst_0
    //   1716: istore 228
    //   1718: iload 227
    //   1720: iload 228
    //   1722: if_icmpgt +4763 -> 6485
    //   1725: aload_0
    //   1726: bipush 45
    //   1728: new 76	java/lang/String
    //   1731: dup
    //   1732: aload 226
    //   1734: invokespecial 86	java/lang/String:<init>	([C)V
    //   1737: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1740: aastore
    //   1741: ldc 182
    //   1743: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1746: astore 231
    //   1748: aload 231
    //   1750: arraylength
    //   1751: istore 232
    //   1753: iconst_0
    //   1754: istore 233
    //   1756: iload 232
    //   1758: iload 233
    //   1760: if_icmpgt +4817 -> 6577
    //   1763: aload_0
    //   1764: bipush 46
    //   1766: new 76	java/lang/String
    //   1769: dup
    //   1770: aload 231
    //   1772: invokespecial 86	java/lang/String:<init>	([C)V
    //   1775: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1778: aastore
    //   1779: ldc 184
    //   1781: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1784: astore 236
    //   1786: aload 236
    //   1788: arraylength
    //   1789: istore 237
    //   1791: iconst_0
    //   1792: istore 238
    //   1794: iload 237
    //   1796: iload 238
    //   1798: if_icmpgt +4871 -> 6669
    //   1801: aload_0
    //   1802: bipush 47
    //   1804: new 76	java/lang/String
    //   1807: dup
    //   1808: aload 236
    //   1810: invokespecial 86	java/lang/String:<init>	([C)V
    //   1813: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1816: aastore
    //   1817: ldc 186
    //   1819: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1822: astore 241
    //   1824: aload 241
    //   1826: arraylength
    //   1827: istore 242
    //   1829: iconst_0
    //   1830: istore 243
    //   1832: iload 242
    //   1834: iload 243
    //   1836: if_icmpgt +4925 -> 6761
    //   1839: aload_0
    //   1840: bipush 48
    //   1842: new 76	java/lang/String
    //   1845: dup
    //   1846: aload 241
    //   1848: invokespecial 86	java/lang/String:<init>	([C)V
    //   1851: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1854: aastore
    //   1855: ldc 188
    //   1857: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1860: astore 246
    //   1862: aload 246
    //   1864: arraylength
    //   1865: istore 247
    //   1867: iconst_0
    //   1868: istore 248
    //   1870: iload 247
    //   1872: iload 248
    //   1874: if_icmpgt +4979 -> 6853
    //   1877: aload_0
    //   1878: bipush 49
    //   1880: new 76	java/lang/String
    //   1883: dup
    //   1884: aload 246
    //   1886: invokespecial 86	java/lang/String:<init>	([C)V
    //   1889: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1892: aastore
    //   1893: ldc 190
    //   1895: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1898: astore 251
    //   1900: aload 251
    //   1902: arraylength
    //   1903: istore 252
    //   1905: iconst_0
    //   1906: istore 253
    //   1908: iload 252
    //   1910: iload 253
    //   1912: if_icmpgt +5033 -> 6945
    //   1915: aload_0
    //   1916: bipush 50
    //   1918: new 76	java/lang/String
    //   1921: dup
    //   1922: aload 251
    //   1924: invokespecial 86	java/lang/String:<init>	([C)V
    //   1927: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1930: aastore
    //   1931: ldc 192
    //   1933: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1936: wide
    //   1940: wide
    //   1944: arraylength
    //   1945: wide
    //   1949: iconst_0
    //   1950: wide
    //   1954: wide
    //   1958: wide
    //   1962: if_icmpgt +5075 -> 7037
    //   1965: aload_0
    //   1966: bipush 51
    //   1968: new 76	java/lang/String
    //   1971: dup
    //   1972: wide
    //   1976: invokespecial 86	java/lang/String:<init>	([C)V
    //   1979: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   1982: aastore
    //   1983: ldc 194
    //   1985: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   1988: wide
    //   1992: wide
    //   1996: arraylength
    //   1997: wide
    //   2001: iconst_0
    //   2002: wide
    //   2006: wide
    //   2010: wide
    //   2014: if_icmpgt +5144 -> 7158
    //   2017: aload_0
    //   2018: bipush 52
    //   2020: new 76	java/lang/String
    //   2023: dup
    //   2024: wide
    //   2028: invokespecial 86	java/lang/String:<init>	([C)V
    //   2031: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2034: aastore
    //   2035: ldc 196
    //   2037: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   2040: wide
    //   2044: wide
    //   2048: arraylength
    //   2049: wide
    //   2053: iconst_0
    //   2054: wide
    //   2058: wide
    //   2062: wide
    //   2066: if_icmpgt +5212 -> 7278
    //   2069: aload_0
    //   2070: bipush 53
    //   2072: new 76	java/lang/String
    //   2075: dup
    //   2076: wide
    //   2080: invokespecial 86	java/lang/String:<init>	([C)V
    //   2083: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2086: aastore
    //   2087: ldc 198
    //   2089: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   2092: wide
    //   2096: wide
    //   2100: arraylength
    //   2101: wide
    //   2105: iconst_0
    //   2106: wide
    //   2110: wide
    //   2114: wide
    //   2118: if_icmpgt +5280 -> 7398
    //   2121: aload_0
    //   2122: bipush 54
    //   2124: new 76	java/lang/String
    //   2127: dup
    //   2128: wide
    //   2132: invokespecial 86	java/lang/String:<init>	([C)V
    //   2135: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2138: aastore
    //   2139: ldc 200
    //   2141: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   2144: wide
    //   2148: wide
    //   2152: arraylength
    //   2153: wide
    //   2157: iconst_0
    //   2158: wide
    //   2162: wide
    //   2166: wide
    //   2170: if_icmpgt +5348 -> 7518
    //   2173: aload_0
    //   2174: bipush 55
    //   2176: new 76	java/lang/String
    //   2179: dup
    //   2180: wide
    //   2184: invokespecial 86	java/lang/String:<init>	([C)V
    //   2187: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2190: aastore
    //   2191: ldc 202
    //   2193: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   2196: wide
    //   2200: wide
    //   2204: arraylength
    //   2205: wide
    //   2209: iconst_0
    //   2210: wide
    //   2214: wide
    //   2218: wide
    //   2222: if_icmpgt +5416 -> 7638
    //   2225: aload_0
    //   2226: bipush 56
    //   2228: new 76	java/lang/String
    //   2231: dup
    //   2232: wide
    //   2236: invokespecial 86	java/lang/String:<init>	([C)V
    //   2239: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2242: aastore
    //   2243: ldc 204
    //   2245: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   2248: wide
    //   2252: wide
    //   2256: arraylength
    //   2257: wide
    //   2261: iconst_0
    //   2262: wide
    //   2266: wide
    //   2270: wide
    //   2274: if_icmpgt +5484 -> 7758
    //   2277: aload_0
    //   2278: bipush 57
    //   2280: new 76	java/lang/String
    //   2283: dup
    //   2284: wide
    //   2288: invokespecial 86	java/lang/String:<init>	([C)V
    //   2291: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2294: aastore
    //   2295: ldc 206
    //   2297: invokevirtual 82	java/lang/String:toCharArray	()[C
    //   2300: wide
    //   2304: wide
    //   2308: arraylength
    //   2309: wide
    //   2313: iconst_0
    //   2314: wide
    //   2318: wide
    //   2322: wide
    //   2326: if_icmpgt +5552 -> 7878
    //   2329: aload_0
    //   2330: bipush 58
    //   2332: new 76	java/lang/String
    //   2335: dup
    //   2336: wide
    //   2340: invokespecial 86	java/lang/String:<init>	([C)V
    //   2343: invokevirtual 90	java/lang/String:intern	()Ljava/lang/String;
    //   2346: aastore
    //   2347: aload_0
    //   2348: putstatic 208	com/whatsapp/MediaView:Z	[Ljava/lang/String;
    //   2351: return
    //   2352: aload_1
    //   2353: iload_3
    //   2354: caload
    //   2355: istore 4
    //   2357: iload_3
    //   2358: iconst_5
    //   2359: irem
    //   2360: tableswitch	default:+32 -> 2392, 0:+51->2411, 1:+58->2418, 2:+65->2425, 3:+72->2432
    //   2393: dload_2
    //   2394: istore 5
    //   2396: aload_1
    //   2397: iload_3
    //   2398: iload 5
    //   2400: iload 4
    //   2402: ixor
    //   2403: i2c
    //   2404: castore
    //   2405: iinc 3 1
    //   2408: goto -2391 -> 17
    //   2411: bipush 60
    //   2413: istore 5
    //   2415: goto -19 -> 2396
    //   2418: bipush 75
    //   2420: istore 5
    //   2422: goto -26 -> 2396
    //   2425: bipush 98
    //   2427: istore 5
    //   2429: goto -33 -> 2396
    //   2432: bipush 121
    //   2434: istore 5
    //   2436: goto -40 -> 2396
    //   2439: aload 6
    //   2441: iload 8
    //   2443: caload
    //   2444: istore 9
    //   2446: iload 8
    //   2448: iconst_5
    //   2449: irem
    //   2450: tableswitch	default:+30 -> 2480, 0:+51->2501, 1:+58->2508, 2:+65->2515, 3:+72->2522
    //   2481: dload_2
    //   2482: istore 10
    //   2484: aload 6
    //   2486: iload 8
    //   2488: iload 10
    //   2490: iload 9
    //   2492: ixor
    //   2493: i2c
    //   2494: castore
    //   2495: iinc 8 1
    //   2498: goto -2447 -> 51
    //   2501: bipush 60
    //   2503: istore 10
    //   2505: goto -21 -> 2484
    //   2508: bipush 75
    //   2510: istore 10
    //   2512: goto -28 -> 2484
    //   2515: bipush 98
    //   2517: istore 10
    //   2519: goto -35 -> 2484
    //   2522: bipush 121
    //   2524: istore 10
    //   2526: goto -42 -> 2484
    //   2529: aload 11
    //   2531: iload 13
    //   2533: caload
    //   2534: istore 14
    //   2536: iload 13
    //   2538: iconst_5
    //   2539: irem
    //   2540: tableswitch	default:+32 -> 2572, 0:+53->2593, 1:+60->2600, 2:+67->2607, 3:+74->2614
    //   2573: dload_2
    //   2574: istore 15
    //   2576: aload 11
    //   2578: iload 13
    //   2580: iload 15
    //   2582: iload 14
    //   2584: ixor
    //   2585: i2c
    //   2586: castore
    //   2587: iinc 13 1
    //   2590: goto -2502 -> 88
    //   2593: bipush 60
    //   2595: istore 15
    //   2597: goto -21 -> 2576
    //   2600: bipush 75
    //   2602: istore 15
    //   2604: goto -28 -> 2576
    //   2607: bipush 98
    //   2609: istore 15
    //   2611: goto -35 -> 2576
    //   2614: bipush 121
    //   2616: istore 15
    //   2618: goto -42 -> 2576
    //   2621: aload 16
    //   2623: iload 18
    //   2625: caload
    //   2626: istore 19
    //   2628: iload 18
    //   2630: iconst_5
    //   2631: irem
    //   2632: tableswitch	default:+32 -> 2664, 0:+53->2685, 1:+60->2692, 2:+67->2699, 3:+74->2706
    //   2665: dload_2
    //   2666: istore 20
    //   2668: aload 16
    //   2670: iload 18
    //   2672: iload 20
    //   2674: iload 19
    //   2676: ixor
    //   2677: i2c
    //   2678: castore
    //   2679: iinc 18 1
    //   2682: goto -2557 -> 125
    //   2685: bipush 60
    //   2687: istore 20
    //   2689: goto -21 -> 2668
    //   2692: bipush 75
    //   2694: istore 20
    //   2696: goto -28 -> 2668
    //   2699: bipush 98
    //   2701: istore 20
    //   2703: goto -35 -> 2668
    //   2706: bipush 121
    //   2708: istore 20
    //   2710: goto -42 -> 2668
    //   2713: aload 21
    //   2715: iload 23
    //   2717: caload
    //   2718: istore 24
    //   2720: iload 23
    //   2722: iconst_5
    //   2723: irem
    //   2724: tableswitch	default:+32 -> 2756, 0:+53->2777, 1:+60->2784, 2:+67->2791, 3:+74->2798
    //   2757: dload_2
    //   2758: istore 25
    //   2760: aload 21
    //   2762: iload 23
    //   2764: iload 25
    //   2766: iload 24
    //   2768: ixor
    //   2769: i2c
    //   2770: castore
    //   2771: iinc 23 1
    //   2774: goto -2612 -> 162
    //   2777: bipush 60
    //   2779: istore 25
    //   2781: goto -21 -> 2760
    //   2784: bipush 75
    //   2786: istore 25
    //   2788: goto -28 -> 2760
    //   2791: bipush 98
    //   2793: istore 25
    //   2795: goto -35 -> 2760
    //   2798: bipush 121
    //   2800: istore 25
    //   2802: goto -42 -> 2760
    //   2805: aload 26
    //   2807: iload 28
    //   2809: caload
    //   2810: istore 29
    //   2812: iload 28
    //   2814: iconst_5
    //   2815: irem
    //   2816: tableswitch	default:+32 -> 2848, 0:+53->2869, 1:+60->2876, 2:+67->2883, 3:+74->2890
    //   2849: dload_2
    //   2850: istore 30
    //   2852: aload 26
    //   2854: iload 28
    //   2856: iload 30
    //   2858: iload 29
    //   2860: ixor
    //   2861: i2c
    //   2862: castore
    //   2863: iinc 28 1
    //   2866: goto -2667 -> 199
    //   2869: bipush 60
    //   2871: istore 30
    //   2873: goto -21 -> 2852
    //   2876: bipush 75
    //   2878: istore 30
    //   2880: goto -28 -> 2852
    //   2883: bipush 98
    //   2885: istore 30
    //   2887: goto -35 -> 2852
    //   2890: bipush 121
    //   2892: istore 30
    //   2894: goto -42 -> 2852
    //   2897: aload 31
    //   2899: iload 33
    //   2901: caload
    //   2902: istore 34
    //   2904: iload 33
    //   2906: iconst_5
    //   2907: irem
    //   2908: tableswitch	default:+32 -> 2940, 0:+53->2961, 1:+60->2968, 2:+67->2975, 3:+74->2982
    //   2941: dload_2
    //   2942: istore 35
    //   2944: aload 31
    //   2946: iload 33
    //   2948: iload 35
    //   2950: iload 34
    //   2952: ixor
    //   2953: i2c
    //   2954: castore
    //   2955: iinc 33 1
    //   2958: goto -2722 -> 236
    //   2961: bipush 60
    //   2963: istore 35
    //   2965: goto -21 -> 2944
    //   2968: bipush 75
    //   2970: istore 35
    //   2972: goto -28 -> 2944
    //   2975: bipush 98
    //   2977: istore 35
    //   2979: goto -35 -> 2944
    //   2982: bipush 121
    //   2984: istore 35
    //   2986: goto -42 -> 2944
    //   2989: aload 36
    //   2991: iload 38
    //   2993: caload
    //   2994: istore 39
    //   2996: iload 38
    //   2998: iconst_5
    //   2999: irem
    //   3000: tableswitch	default:+32 -> 3032, 0:+53->3053, 1:+60->3060, 2:+67->3067, 3:+74->3074
    //   3033: dload_2
    //   3034: istore 40
    //   3036: aload 36
    //   3038: iload 38
    //   3040: iload 40
    //   3042: iload 39
    //   3044: ixor
    //   3045: i2c
    //   3046: castore
    //   3047: iinc 38 1
    //   3050: goto -2776 -> 274
    //   3053: bipush 60
    //   3055: istore 40
    //   3057: goto -21 -> 3036
    //   3060: bipush 75
    //   3062: istore 40
    //   3064: goto -28 -> 3036
    //   3067: bipush 98
    //   3069: istore 40
    //   3071: goto -35 -> 3036
    //   3074: bipush 121
    //   3076: istore 40
    //   3078: goto -42 -> 3036
    //   3081: aload 41
    //   3083: iload 43
    //   3085: caload
    //   3086: istore 44
    //   3088: iload 43
    //   3090: iconst_5
    //   3091: irem
    //   3092: tableswitch	default:+32 -> 3124, 0:+53->3145, 1:+60->3152, 2:+67->3159, 3:+74->3166
    //   3125: dload_2
    //   3126: istore 45
    //   3128: aload 41
    //   3130: iload 43
    //   3132: iload 45
    //   3134: iload 44
    //   3136: ixor
    //   3137: i2c
    //   3138: castore
    //   3139: iinc 43 1
    //   3142: goto -2830 -> 312
    //   3145: bipush 60
    //   3147: istore 45
    //   3149: goto -21 -> 3128
    //   3152: bipush 75
    //   3154: istore 45
    //   3156: goto -28 -> 3128
    //   3159: bipush 98
    //   3161: istore 45
    //   3163: goto -35 -> 3128
    //   3166: bipush 121
    //   3168: istore 45
    //   3170: goto -42 -> 3128
    //   3173: aload 46
    //   3175: iload 48
    //   3177: caload
    //   3178: istore 49
    //   3180: iload 48
    //   3182: iconst_5
    //   3183: irem
    //   3184: tableswitch	default:+32 -> 3216, 0:+53->3237, 1:+60->3244, 2:+67->3251, 3:+74->3258
    //   3217: dload_2
    //   3218: istore 50
    //   3220: aload 46
    //   3222: iload 48
    //   3224: iload 50
    //   3226: iload 49
    //   3228: ixor
    //   3229: i2c
    //   3230: castore
    //   3231: iinc 48 1
    //   3234: goto -2884 -> 350
    //   3237: bipush 60
    //   3239: istore 50
    //   3241: goto -21 -> 3220
    //   3244: bipush 75
    //   3246: istore 50
    //   3248: goto -28 -> 3220
    //   3251: bipush 98
    //   3253: istore 50
    //   3255: goto -35 -> 3220
    //   3258: bipush 121
    //   3260: istore 50
    //   3262: goto -42 -> 3220
    //   3265: aload 51
    //   3267: iload 53
    //   3269: caload
    //   3270: istore 54
    //   3272: iload 53
    //   3274: iconst_5
    //   3275: irem
    //   3276: tableswitch	default:+32 -> 3308, 0:+53->3329, 1:+60->3336, 2:+67->3343, 3:+74->3350
    //   3309: dload_2
    //   3310: istore 55
    //   3312: aload 51
    //   3314: iload 53
    //   3316: iload 55
    //   3318: iload 54
    //   3320: ixor
    //   3321: i2c
    //   3322: castore
    //   3323: iinc 53 1
    //   3326: goto -2938 -> 388
    //   3329: bipush 60
    //   3331: istore 55
    //   3333: goto -21 -> 3312
    //   3336: bipush 75
    //   3338: istore 55
    //   3340: goto -28 -> 3312
    //   3343: bipush 98
    //   3345: istore 55
    //   3347: goto -35 -> 3312
    //   3350: bipush 121
    //   3352: istore 55
    //   3354: goto -42 -> 3312
    //   3357: aload 56
    //   3359: iload 58
    //   3361: caload
    //   3362: istore 59
    //   3364: iload 58
    //   3366: iconst_5
    //   3367: irem
    //   3368: tableswitch	default:+32 -> 3400, 0:+53->3421, 1:+60->3428, 2:+67->3435, 3:+74->3442
    //   3401: dload_2
    //   3402: istore 60
    //   3404: aload 56
    //   3406: iload 58
    //   3408: iload 60
    //   3410: iload 59
    //   3412: ixor
    //   3413: i2c
    //   3414: castore
    //   3415: iinc 58 1
    //   3418: goto -2992 -> 426
    //   3421: bipush 60
    //   3423: istore 60
    //   3425: goto -21 -> 3404
    //   3428: bipush 75
    //   3430: istore 60
    //   3432: goto -28 -> 3404
    //   3435: bipush 98
    //   3437: istore 60
    //   3439: goto -35 -> 3404
    //   3442: bipush 121
    //   3444: istore 60
    //   3446: goto -42 -> 3404
    //   3449: aload 61
    //   3451: iload 63
    //   3453: caload
    //   3454: istore 64
    //   3456: iload 63
    //   3458: iconst_5
    //   3459: irem
    //   3460: tableswitch	default:+32 -> 3492, 0:+53->3513, 1:+60->3520, 2:+67->3527, 3:+74->3534
    //   3493: dload_2
    //   3494: istore 65
    //   3496: aload 61
    //   3498: iload 63
    //   3500: iload 65
    //   3502: iload 64
    //   3504: ixor
    //   3505: i2c
    //   3506: castore
    //   3507: iinc 63 1
    //   3510: goto -3046 -> 464
    //   3513: bipush 60
    //   3515: istore 65
    //   3517: goto -21 -> 3496
    //   3520: bipush 75
    //   3522: istore 65
    //   3524: goto -28 -> 3496
    //   3527: bipush 98
    //   3529: istore 65
    //   3531: goto -35 -> 3496
    //   3534: bipush 121
    //   3536: istore 65
    //   3538: goto -42 -> 3496
    //   3541: aload 66
    //   3543: iload 68
    //   3545: caload
    //   3546: istore 69
    //   3548: iload 68
    //   3550: iconst_5
    //   3551: irem
    //   3552: tableswitch	default:+32 -> 3584, 0:+53->3605, 1:+60->3612, 2:+67->3619, 3:+74->3626
    //   3585: dload_2
    //   3586: istore 70
    //   3588: aload 66
    //   3590: iload 68
    //   3592: iload 70
    //   3594: iload 69
    //   3596: ixor
    //   3597: i2c
    //   3598: castore
    //   3599: iinc 68 1
    //   3602: goto -3100 -> 502
    //   3605: bipush 60
    //   3607: istore 70
    //   3609: goto -21 -> 3588
    //   3612: bipush 75
    //   3614: istore 70
    //   3616: goto -28 -> 3588
    //   3619: bipush 98
    //   3621: istore 70
    //   3623: goto -35 -> 3588
    //   3626: bipush 121
    //   3628: istore 70
    //   3630: goto -42 -> 3588
    //   3633: aload 71
    //   3635: iload 73
    //   3637: caload
    //   3638: istore 74
    //   3640: iload 73
    //   3642: iconst_5
    //   3643: irem
    //   3644: tableswitch	default:+32 -> 3676, 0:+53->3697, 1:+60->3704, 2:+67->3711, 3:+74->3718
    //   3677: dload_2
    //   3678: istore 75
    //   3680: aload 71
    //   3682: iload 73
    //   3684: iload 75
    //   3686: iload 74
    //   3688: ixor
    //   3689: i2c
    //   3690: castore
    //   3691: iinc 73 1
    //   3694: goto -3154 -> 540
    //   3697: bipush 60
    //   3699: istore 75
    //   3701: goto -21 -> 3680
    //   3704: bipush 75
    //   3706: istore 75
    //   3708: goto -28 -> 3680
    //   3711: bipush 98
    //   3713: istore 75
    //   3715: goto -35 -> 3680
    //   3718: bipush 121
    //   3720: istore 75
    //   3722: goto -42 -> 3680
    //   3725: aload 76
    //   3727: iload 78
    //   3729: caload
    //   3730: istore 79
    //   3732: iload 78
    //   3734: iconst_5
    //   3735: irem
    //   3736: tableswitch	default:+32 -> 3768, 0:+53->3789, 1:+60->3796, 2:+67->3803, 3:+74->3810
    //   3769: dload_2
    //   3770: istore 80
    //   3772: aload 76
    //   3774: iload 78
    //   3776: iload 80
    //   3778: iload 79
    //   3780: ixor
    //   3781: i2c
    //   3782: castore
    //   3783: iinc 78 1
    //   3786: goto -3208 -> 578
    //   3789: bipush 60
    //   3791: istore 80
    //   3793: goto -21 -> 3772
    //   3796: bipush 75
    //   3798: istore 80
    //   3800: goto -28 -> 3772
    //   3803: bipush 98
    //   3805: istore 80
    //   3807: goto -35 -> 3772
    //   3810: bipush 121
    //   3812: istore 80
    //   3814: goto -42 -> 3772
    //   3817: aload 81
    //   3819: iload 83
    //   3821: caload
    //   3822: istore 84
    //   3824: iload 83
    //   3826: iconst_5
    //   3827: irem
    //   3828: tableswitch	default:+32 -> 3860, 0:+53->3881, 1:+60->3888, 2:+67->3895, 3:+74->3902
    //   3861: dload_2
    //   3862: istore 85
    //   3864: aload 81
    //   3866: iload 83
    //   3868: iload 85
    //   3870: iload 84
    //   3872: ixor
    //   3873: i2c
    //   3874: castore
    //   3875: iinc 83 1
    //   3878: goto -3262 -> 616
    //   3881: bipush 60
    //   3883: istore 85
    //   3885: goto -21 -> 3864
    //   3888: bipush 75
    //   3890: istore 85
    //   3892: goto -28 -> 3864
    //   3895: bipush 98
    //   3897: istore 85
    //   3899: goto -35 -> 3864
    //   3902: bipush 121
    //   3904: istore 85
    //   3906: goto -42 -> 3864
    //   3909: aload 86
    //   3911: iload 88
    //   3913: caload
    //   3914: istore 89
    //   3916: iload 88
    //   3918: iconst_5
    //   3919: irem
    //   3920: tableswitch	default:+32 -> 3952, 0:+53->3973, 1:+60->3980, 2:+67->3987, 3:+74->3994
    //   3953: dload_2
    //   3954: istore 90
    //   3956: aload 86
    //   3958: iload 88
    //   3960: iload 90
    //   3962: iload 89
    //   3964: ixor
    //   3965: i2c
    //   3966: castore
    //   3967: iinc 88 1
    //   3970: goto -3316 -> 654
    //   3973: bipush 60
    //   3975: istore 90
    //   3977: goto -21 -> 3956
    //   3980: bipush 75
    //   3982: istore 90
    //   3984: goto -28 -> 3956
    //   3987: bipush 98
    //   3989: istore 90
    //   3991: goto -35 -> 3956
    //   3994: bipush 121
    //   3996: istore 90
    //   3998: goto -42 -> 3956
    //   4001: aload 91
    //   4003: iload 93
    //   4005: caload
    //   4006: istore 94
    //   4008: iload 93
    //   4010: iconst_5
    //   4011: irem
    //   4012: tableswitch	default:+32 -> 4044, 0:+53->4065, 1:+60->4072, 2:+67->4079, 3:+74->4086
    //   4045: dload_2
    //   4046: istore 95
    //   4048: aload 91
    //   4050: iload 93
    //   4052: iload 95
    //   4054: iload 94
    //   4056: ixor
    //   4057: i2c
    //   4058: castore
    //   4059: iinc 93 1
    //   4062: goto -3370 -> 692
    //   4065: bipush 60
    //   4067: istore 95
    //   4069: goto -21 -> 4048
    //   4072: bipush 75
    //   4074: istore 95
    //   4076: goto -28 -> 4048
    //   4079: bipush 98
    //   4081: istore 95
    //   4083: goto -35 -> 4048
    //   4086: bipush 121
    //   4088: istore 95
    //   4090: goto -42 -> 4048
    //   4093: aload 96
    //   4095: iload 98
    //   4097: caload
    //   4098: istore 99
    //   4100: iload 98
    //   4102: iconst_5
    //   4103: irem
    //   4104: tableswitch	default:+32 -> 4136, 0:+53->4157, 1:+60->4164, 2:+67->4171, 3:+74->4178
    //   4137: dload_2
    //   4138: istore 100
    //   4140: aload 96
    //   4142: iload 98
    //   4144: iload 100
    //   4146: iload 99
    //   4148: ixor
    //   4149: i2c
    //   4150: castore
    //   4151: iinc 98 1
    //   4154: goto -3424 -> 730
    //   4157: bipush 60
    //   4159: istore 100
    //   4161: goto -21 -> 4140
    //   4164: bipush 75
    //   4166: istore 100
    //   4168: goto -28 -> 4140
    //   4171: bipush 98
    //   4173: istore 100
    //   4175: goto -35 -> 4140
    //   4178: bipush 121
    //   4180: istore 100
    //   4182: goto -42 -> 4140
    //   4185: aload 101
    //   4187: iload 103
    //   4189: caload
    //   4190: istore 104
    //   4192: iload 103
    //   4194: iconst_5
    //   4195: irem
    //   4196: tableswitch	default:+32 -> 4228, 0:+53->4249, 1:+60->4256, 2:+67->4263, 3:+74->4270
    //   4229: dload_2
    //   4230: istore 105
    //   4232: aload 101
    //   4234: iload 103
    //   4236: iload 105
    //   4238: iload 104
    //   4240: ixor
    //   4241: i2c
    //   4242: castore
    //   4243: iinc 103 1
    //   4246: goto -3478 -> 768
    //   4249: bipush 60
    //   4251: istore 105
    //   4253: goto -21 -> 4232
    //   4256: bipush 75
    //   4258: istore 105
    //   4260: goto -28 -> 4232
    //   4263: bipush 98
    //   4265: istore 105
    //   4267: goto -35 -> 4232
    //   4270: bipush 121
    //   4272: istore 105
    //   4274: goto -42 -> 4232
    //   4277: aload 106
    //   4279: iload 108
    //   4281: caload
    //   4282: istore 109
    //   4284: iload 108
    //   4286: iconst_5
    //   4287: irem
    //   4288: tableswitch	default:+32 -> 4320, 0:+53->4341, 1:+60->4348, 2:+67->4355, 3:+74->4362
    //   4321: dload_2
    //   4322: istore 110
    //   4324: aload 106
    //   4326: iload 108
    //   4328: iload 110
    //   4330: iload 109
    //   4332: ixor
    //   4333: i2c
    //   4334: castore
    //   4335: iinc 108 1
    //   4338: goto -3532 -> 806
    //   4341: bipush 60
    //   4343: istore 110
    //   4345: goto -21 -> 4324
    //   4348: bipush 75
    //   4350: istore 110
    //   4352: goto -28 -> 4324
    //   4355: bipush 98
    //   4357: istore 110
    //   4359: goto -35 -> 4324
    //   4362: bipush 121
    //   4364: istore 110
    //   4366: goto -42 -> 4324
    //   4369: aload 111
    //   4371: iload 113
    //   4373: caload
    //   4374: istore 114
    //   4376: iload 113
    //   4378: iconst_5
    //   4379: irem
    //   4380: tableswitch	default:+32 -> 4412, 0:+53->4433, 1:+60->4440, 2:+67->4447, 3:+74->4454
    //   4413: dload_2
    //   4414: istore 115
    //   4416: aload 111
    //   4418: iload 113
    //   4420: iload 115
    //   4422: iload 114
    //   4424: ixor
    //   4425: i2c
    //   4426: castore
    //   4427: iinc 113 1
    //   4430: goto -3586 -> 844
    //   4433: bipush 60
    //   4435: istore 115
    //   4437: goto -21 -> 4416
    //   4440: bipush 75
    //   4442: istore 115
    //   4444: goto -28 -> 4416
    //   4447: bipush 98
    //   4449: istore 115
    //   4451: goto -35 -> 4416
    //   4454: bipush 121
    //   4456: istore 115
    //   4458: goto -42 -> 4416
    //   4461: aload 116
    //   4463: iload 118
    //   4465: caload
    //   4466: istore 119
    //   4468: iload 118
    //   4470: iconst_5
    //   4471: irem
    //   4472: tableswitch	default:+32 -> 4504, 0:+53->4525, 1:+60->4532, 2:+67->4539, 3:+74->4546
    //   4505: dload_2
    //   4506: istore 120
    //   4508: aload 116
    //   4510: iload 118
    //   4512: iload 120
    //   4514: iload 119
    //   4516: ixor
    //   4517: i2c
    //   4518: castore
    //   4519: iinc 118 1
    //   4522: goto -3640 -> 882
    //   4525: bipush 60
    //   4527: istore 120
    //   4529: goto -21 -> 4508
    //   4532: bipush 75
    //   4534: istore 120
    //   4536: goto -28 -> 4508
    //   4539: bipush 98
    //   4541: istore 120
    //   4543: goto -35 -> 4508
    //   4546: bipush 121
    //   4548: istore 120
    //   4550: goto -42 -> 4508
    //   4553: aload 121
    //   4555: iload 123
    //   4557: caload
    //   4558: istore 124
    //   4560: iload 123
    //   4562: iconst_5
    //   4563: irem
    //   4564: tableswitch	default:+32 -> 4596, 0:+53->4617, 1:+60->4624, 2:+67->4631, 3:+74->4638
    //   4597: dload_2
    //   4598: istore 125
    //   4600: aload 121
    //   4602: iload 123
    //   4604: iload 125
    //   4606: iload 124
    //   4608: ixor
    //   4609: i2c
    //   4610: castore
    //   4611: iinc 123 1
    //   4614: goto -3694 -> 920
    //   4617: bipush 60
    //   4619: istore 125
    //   4621: goto -21 -> 4600
    //   4624: bipush 75
    //   4626: istore 125
    //   4628: goto -28 -> 4600
    //   4631: bipush 98
    //   4633: istore 125
    //   4635: goto -35 -> 4600
    //   4638: bipush 121
    //   4640: istore 125
    //   4642: goto -42 -> 4600
    //   4645: aload 126
    //   4647: iload 128
    //   4649: caload
    //   4650: istore 129
    //   4652: iload 128
    //   4654: iconst_5
    //   4655: irem
    //   4656: tableswitch	default:+32 -> 4688, 0:+53->4709, 1:+60->4716, 2:+67->4723, 3:+74->4730
    //   4689: dload_2
    //   4690: istore 130
    //   4692: aload 126
    //   4694: iload 128
    //   4696: iload 130
    //   4698: iload 129
    //   4700: ixor
    //   4701: i2c
    //   4702: castore
    //   4703: iinc 128 1
    //   4706: goto -3748 -> 958
    //   4709: bipush 60
    //   4711: istore 130
    //   4713: goto -21 -> 4692
    //   4716: bipush 75
    //   4718: istore 130
    //   4720: goto -28 -> 4692
    //   4723: bipush 98
    //   4725: istore 130
    //   4727: goto -35 -> 4692
    //   4730: bipush 121
    //   4732: istore 130
    //   4734: goto -42 -> 4692
    //   4737: aload 131
    //   4739: iload 133
    //   4741: caload
    //   4742: istore 134
    //   4744: iload 133
    //   4746: iconst_5
    //   4747: irem
    //   4748: tableswitch	default:+32 -> 4780, 0:+53->4801, 1:+60->4808, 2:+67->4815, 3:+74->4822
    //   4781: dload_2
    //   4782: istore 135
    //   4784: aload 131
    //   4786: iload 133
    //   4788: iload 135
    //   4790: iload 134
    //   4792: ixor
    //   4793: i2c
    //   4794: castore
    //   4795: iinc 133 1
    //   4798: goto -3802 -> 996
    //   4801: bipush 60
    //   4803: istore 135
    //   4805: goto -21 -> 4784
    //   4808: bipush 75
    //   4810: istore 135
    //   4812: goto -28 -> 4784
    //   4815: bipush 98
    //   4817: istore 135
    //   4819: goto -35 -> 4784
    //   4822: bipush 121
    //   4824: istore 135
    //   4826: goto -42 -> 4784
    //   4829: aload 136
    //   4831: iload 138
    //   4833: caload
    //   4834: istore 139
    //   4836: iload 138
    //   4838: iconst_5
    //   4839: irem
    //   4840: tableswitch	default:+32 -> 4872, 0:+53->4893, 1:+60->4900, 2:+67->4907, 3:+74->4914
    //   4873: dload_2
    //   4874: istore 140
    //   4876: aload 136
    //   4878: iload 138
    //   4880: iload 140
    //   4882: iload 139
    //   4884: ixor
    //   4885: i2c
    //   4886: castore
    //   4887: iinc 138 1
    //   4890: goto -3856 -> 1034
    //   4893: bipush 60
    //   4895: istore 140
    //   4897: goto -21 -> 4876
    //   4900: bipush 75
    //   4902: istore 140
    //   4904: goto -28 -> 4876
    //   4907: bipush 98
    //   4909: istore 140
    //   4911: goto -35 -> 4876
    //   4914: bipush 121
    //   4916: istore 140
    //   4918: goto -42 -> 4876
    //   4921: aload 141
    //   4923: iload 143
    //   4925: caload
    //   4926: istore 144
    //   4928: iload 143
    //   4930: iconst_5
    //   4931: irem
    //   4932: tableswitch	default:+32 -> 4964, 0:+53->4985, 1:+60->4992, 2:+67->4999, 3:+74->5006
    //   4965: dload_2
    //   4966: istore 145
    //   4968: aload 141
    //   4970: iload 143
    //   4972: iload 145
    //   4974: iload 144
    //   4976: ixor
    //   4977: i2c
    //   4978: castore
    //   4979: iinc 143 1
    //   4982: goto -3910 -> 1072
    //   4985: bipush 60
    //   4987: istore 145
    //   4989: goto -21 -> 4968
    //   4992: bipush 75
    //   4994: istore 145
    //   4996: goto -28 -> 4968
    //   4999: bipush 98
    //   5001: istore 145
    //   5003: goto -35 -> 4968
    //   5006: bipush 121
    //   5008: istore 145
    //   5010: goto -42 -> 4968
    //   5013: aload 146
    //   5015: iload 148
    //   5017: caload
    //   5018: istore 149
    //   5020: iload 148
    //   5022: iconst_5
    //   5023: irem
    //   5024: tableswitch	default:+32 -> 5056, 0:+53->5077, 1:+60->5084, 2:+67->5091, 3:+74->5098
    //   5057: dload_2
    //   5058: istore 150
    //   5060: aload 146
    //   5062: iload 148
    //   5064: iload 150
    //   5066: iload 149
    //   5068: ixor
    //   5069: i2c
    //   5070: castore
    //   5071: iinc 148 1
    //   5074: goto -3964 -> 1110
    //   5077: bipush 60
    //   5079: istore 150
    //   5081: goto -21 -> 5060
    //   5084: bipush 75
    //   5086: istore 150
    //   5088: goto -28 -> 5060
    //   5091: bipush 98
    //   5093: istore 150
    //   5095: goto -35 -> 5060
    //   5098: bipush 121
    //   5100: istore 150
    //   5102: goto -42 -> 5060
    //   5105: aload 151
    //   5107: iload 153
    //   5109: caload
    //   5110: istore 154
    //   5112: iload 153
    //   5114: iconst_5
    //   5115: irem
    //   5116: tableswitch	default:+32 -> 5148, 0:+53->5169, 1:+60->5176, 2:+67->5183, 3:+74->5190
    //   5149: dload_2
    //   5150: istore 155
    //   5152: aload 151
    //   5154: iload 153
    //   5156: iload 155
    //   5158: iload 154
    //   5160: ixor
    //   5161: i2c
    //   5162: castore
    //   5163: iinc 153 1
    //   5166: goto -4018 -> 1148
    //   5169: bipush 60
    //   5171: istore 155
    //   5173: goto -21 -> 5152
    //   5176: bipush 75
    //   5178: istore 155
    //   5180: goto -28 -> 5152
    //   5183: bipush 98
    //   5185: istore 155
    //   5187: goto -35 -> 5152
    //   5190: bipush 121
    //   5192: istore 155
    //   5194: goto -42 -> 5152
    //   5197: aload 156
    //   5199: iload 158
    //   5201: caload
    //   5202: istore 159
    //   5204: iload 158
    //   5206: iconst_5
    //   5207: irem
    //   5208: tableswitch	default:+32 -> 5240, 0:+53->5261, 1:+60->5268, 2:+67->5275, 3:+74->5282
    //   5241: dload_2
    //   5242: istore 160
    //   5244: aload 156
    //   5246: iload 158
    //   5248: iload 160
    //   5250: iload 159
    //   5252: ixor
    //   5253: i2c
    //   5254: castore
    //   5255: iinc 158 1
    //   5258: goto -4072 -> 1186
    //   5261: bipush 60
    //   5263: istore 160
    //   5265: goto -21 -> 5244
    //   5268: bipush 75
    //   5270: istore 160
    //   5272: goto -28 -> 5244
    //   5275: bipush 98
    //   5277: istore 160
    //   5279: goto -35 -> 5244
    //   5282: bipush 121
    //   5284: istore 160
    //   5286: goto -42 -> 5244
    //   5289: aload 161
    //   5291: iload 163
    //   5293: caload
    //   5294: istore 164
    //   5296: iload 163
    //   5298: iconst_5
    //   5299: irem
    //   5300: tableswitch	default:+32 -> 5332, 0:+53->5353, 1:+60->5360, 2:+67->5367, 3:+74->5374
    //   5333: dload_2
    //   5334: istore 165
    //   5336: aload 161
    //   5338: iload 163
    //   5340: iload 165
    //   5342: iload 164
    //   5344: ixor
    //   5345: i2c
    //   5346: castore
    //   5347: iinc 163 1
    //   5350: goto -4126 -> 1224
    //   5353: bipush 60
    //   5355: istore 165
    //   5357: goto -21 -> 5336
    //   5360: bipush 75
    //   5362: istore 165
    //   5364: goto -28 -> 5336
    //   5367: bipush 98
    //   5369: istore 165
    //   5371: goto -35 -> 5336
    //   5374: bipush 121
    //   5376: istore 165
    //   5378: goto -42 -> 5336
    //   5381: aload 166
    //   5383: iload 168
    //   5385: caload
    //   5386: istore 169
    //   5388: iload 168
    //   5390: iconst_5
    //   5391: irem
    //   5392: tableswitch	default:+32 -> 5424, 0:+53->5445, 1:+60->5452, 2:+67->5459, 3:+74->5466
    //   5425: dload_2
    //   5426: istore 170
    //   5428: aload 166
    //   5430: iload 168
    //   5432: iload 170
    //   5434: iload 169
    //   5436: ixor
    //   5437: i2c
    //   5438: castore
    //   5439: iinc 168 1
    //   5442: goto -4180 -> 1262
    //   5445: bipush 60
    //   5447: istore 170
    //   5449: goto -21 -> 5428
    //   5452: bipush 75
    //   5454: istore 170
    //   5456: goto -28 -> 5428
    //   5459: bipush 98
    //   5461: istore 170
    //   5463: goto -35 -> 5428
    //   5466: bipush 121
    //   5468: istore 170
    //   5470: goto -42 -> 5428
    //   5473: aload 171
    //   5475: iload 173
    //   5477: caload
    //   5478: istore 174
    //   5480: iload 173
    //   5482: iconst_5
    //   5483: irem
    //   5484: tableswitch	default:+32 -> 5516, 0:+53->5537, 1:+60->5544, 2:+67->5551, 3:+74->5558
    //   5517: dload_2
    //   5518: istore 175
    //   5520: aload 171
    //   5522: iload 173
    //   5524: iload 175
    //   5526: iload 174
    //   5528: ixor
    //   5529: i2c
    //   5530: castore
    //   5531: iinc 173 1
    //   5534: goto -4234 -> 1300
    //   5537: bipush 60
    //   5539: istore 175
    //   5541: goto -21 -> 5520
    //   5544: bipush 75
    //   5546: istore 175
    //   5548: goto -28 -> 5520
    //   5551: bipush 98
    //   5553: istore 175
    //   5555: goto -35 -> 5520
    //   5558: bipush 121
    //   5560: istore 175
    //   5562: goto -42 -> 5520
    //   5565: aload 176
    //   5567: iload 178
    //   5569: caload
    //   5570: istore 179
    //   5572: iload 178
    //   5574: iconst_5
    //   5575: irem
    //   5576: tableswitch	default:+32 -> 5608, 0:+53->5629, 1:+60->5636, 2:+67->5643, 3:+74->5650
    //   5609: dload_2
    //   5610: istore 180
    //   5612: aload 176
    //   5614: iload 178
    //   5616: iload 180
    //   5618: iload 179
    //   5620: ixor
    //   5621: i2c
    //   5622: castore
    //   5623: iinc 178 1
    //   5626: goto -4288 -> 1338
    //   5629: bipush 60
    //   5631: istore 180
    //   5633: goto -21 -> 5612
    //   5636: bipush 75
    //   5638: istore 180
    //   5640: goto -28 -> 5612
    //   5643: bipush 98
    //   5645: istore 180
    //   5647: goto -35 -> 5612
    //   5650: bipush 121
    //   5652: istore 180
    //   5654: goto -42 -> 5612
    //   5657: aload 181
    //   5659: iload 183
    //   5661: caload
    //   5662: istore 184
    //   5664: iload 183
    //   5666: iconst_5
    //   5667: irem
    //   5668: tableswitch	default:+32 -> 5700, 0:+53->5721, 1:+60->5728, 2:+67->5735, 3:+74->5742
    //   5701: dload_2
    //   5702: istore 185
    //   5704: aload 181
    //   5706: iload 183
    //   5708: iload 185
    //   5710: iload 184
    //   5712: ixor
    //   5713: i2c
    //   5714: castore
    //   5715: iinc 183 1
    //   5718: goto -4342 -> 1376
    //   5721: bipush 60
    //   5723: istore 185
    //   5725: goto -21 -> 5704
    //   5728: bipush 75
    //   5730: istore 185
    //   5732: goto -28 -> 5704
    //   5735: bipush 98
    //   5737: istore 185
    //   5739: goto -35 -> 5704
    //   5742: bipush 121
    //   5744: istore 185
    //   5746: goto -42 -> 5704
    //   5749: aload 186
    //   5751: iload 188
    //   5753: caload
    //   5754: istore 189
    //   5756: iload 188
    //   5758: iconst_5
    //   5759: irem
    //   5760: tableswitch	default:+32 -> 5792, 0:+53->5813, 1:+60->5820, 2:+67->5827, 3:+74->5834
    //   5793: dload_2
    //   5794: istore 190
    //   5796: aload 186
    //   5798: iload 188
    //   5800: iload 190
    //   5802: iload 189
    //   5804: ixor
    //   5805: i2c
    //   5806: castore
    //   5807: iinc 188 1
    //   5810: goto -4396 -> 1414
    //   5813: bipush 60
    //   5815: istore 190
    //   5817: goto -21 -> 5796
    //   5820: bipush 75
    //   5822: istore 190
    //   5824: goto -28 -> 5796
    //   5827: bipush 98
    //   5829: istore 190
    //   5831: goto -35 -> 5796
    //   5834: bipush 121
    //   5836: istore 190
    //   5838: goto -42 -> 5796
    //   5841: aload 191
    //   5843: iload 193
    //   5845: caload
    //   5846: istore 194
    //   5848: iload 193
    //   5850: iconst_5
    //   5851: irem
    //   5852: tableswitch	default:+32 -> 5884, 0:+53->5905, 1:+60->5912, 2:+67->5919, 3:+74->5926
    //   5885: dload_2
    //   5886: istore 195
    //   5888: aload 191
    //   5890: iload 193
    //   5892: iload 195
    //   5894: iload 194
    //   5896: ixor
    //   5897: i2c
    //   5898: castore
    //   5899: iinc 193 1
    //   5902: goto -4450 -> 1452
    //   5905: bipush 60
    //   5907: istore 195
    //   5909: goto -21 -> 5888
    //   5912: bipush 75
    //   5914: istore 195
    //   5916: goto -28 -> 5888
    //   5919: bipush 98
    //   5921: istore 195
    //   5923: goto -35 -> 5888
    //   5926: bipush 121
    //   5928: istore 195
    //   5930: goto -42 -> 5888
    //   5933: aload 196
    //   5935: iload 198
    //   5937: caload
    //   5938: istore 199
    //   5940: iload 198
    //   5942: iconst_5
    //   5943: irem
    //   5944: tableswitch	default:+32 -> 5976, 0:+53->5997, 1:+60->6004, 2:+67->6011, 3:+74->6018
    //   5977: dload_2
    //   5978: istore 200
    //   5980: aload 196
    //   5982: iload 198
    //   5984: iload 200
    //   5986: iload 199
    //   5988: ixor
    //   5989: i2c
    //   5990: castore
    //   5991: iinc 198 1
    //   5994: goto -4504 -> 1490
    //   5997: bipush 60
    //   5999: istore 200
    //   6001: goto -21 -> 5980
    //   6004: bipush 75
    //   6006: istore 200
    //   6008: goto -28 -> 5980
    //   6011: bipush 98
    //   6013: istore 200
    //   6015: goto -35 -> 5980
    //   6018: bipush 121
    //   6020: istore 200
    //   6022: goto -42 -> 5980
    //   6025: aload 201
    //   6027: iload 203
    //   6029: caload
    //   6030: istore 204
    //   6032: iload 203
    //   6034: iconst_5
    //   6035: irem
    //   6036: tableswitch	default:+32 -> 6068, 0:+53->6089, 1:+60->6096, 2:+67->6103, 3:+74->6110
    //   6069: dload_2
    //   6070: istore 205
    //   6072: aload 201
    //   6074: iload 203
    //   6076: iload 205
    //   6078: iload 204
    //   6080: ixor
    //   6081: i2c
    //   6082: castore
    //   6083: iinc 203 1
    //   6086: goto -4558 -> 1528
    //   6089: bipush 60
    //   6091: istore 205
    //   6093: goto -21 -> 6072
    //   6096: bipush 75
    //   6098: istore 205
    //   6100: goto -28 -> 6072
    //   6103: bipush 98
    //   6105: istore 205
    //   6107: goto -35 -> 6072
    //   6110: bipush 121
    //   6112: istore 205
    //   6114: goto -42 -> 6072
    //   6117: aload 206
    //   6119: iload 208
    //   6121: caload
    //   6122: istore 209
    //   6124: iload 208
    //   6126: iconst_5
    //   6127: irem
    //   6128: tableswitch	default:+32 -> 6160, 0:+53->6181, 1:+60->6188, 2:+67->6195, 3:+74->6202
    //   6161: dload_2
    //   6162: istore 210
    //   6164: aload 206
    //   6166: iload 208
    //   6168: iload 210
    //   6170: iload 209
    //   6172: ixor
    //   6173: i2c
    //   6174: castore
    //   6175: iinc 208 1
    //   6178: goto -4612 -> 1566
    //   6181: bipush 60
    //   6183: istore 210
    //   6185: goto -21 -> 6164
    //   6188: bipush 75
    //   6190: istore 210
    //   6192: goto -28 -> 6164
    //   6195: bipush 98
    //   6197: istore 210
    //   6199: goto -35 -> 6164
    //   6202: bipush 121
    //   6204: istore 210
    //   6206: goto -42 -> 6164
    //   6209: aload 211
    //   6211: iload 213
    //   6213: caload
    //   6214: istore 214
    //   6216: iload 213
    //   6218: iconst_5
    //   6219: irem
    //   6220: tableswitch	default:+32 -> 6252, 0:+53->6273, 1:+60->6280, 2:+67->6287, 3:+74->6294
    //   6253: dload_2
    //   6254: istore 215
    //   6256: aload 211
    //   6258: iload 213
    //   6260: iload 215
    //   6262: iload 214
    //   6264: ixor
    //   6265: i2c
    //   6266: castore
    //   6267: iinc 213 1
    //   6270: goto -4666 -> 1604
    //   6273: bipush 60
    //   6275: istore 215
    //   6277: goto -21 -> 6256
    //   6280: bipush 75
    //   6282: istore 215
    //   6284: goto -28 -> 6256
    //   6287: bipush 98
    //   6289: istore 215
    //   6291: goto -35 -> 6256
    //   6294: bipush 121
    //   6296: istore 215
    //   6298: goto -42 -> 6256
    //   6301: aload 216
    //   6303: iload 218
    //   6305: caload
    //   6306: istore 219
    //   6308: iload 218
    //   6310: iconst_5
    //   6311: irem
    //   6312: tableswitch	default:+32 -> 6344, 0:+53->6365, 1:+60->6372, 2:+67->6379, 3:+74->6386
    //   6345: dload_2
    //   6346: istore 220
    //   6348: aload 216
    //   6350: iload 218
    //   6352: iload 220
    //   6354: iload 219
    //   6356: ixor
    //   6357: i2c
    //   6358: castore
    //   6359: iinc 218 1
    //   6362: goto -4720 -> 1642
    //   6365: bipush 60
    //   6367: istore 220
    //   6369: goto -21 -> 6348
    //   6372: bipush 75
    //   6374: istore 220
    //   6376: goto -28 -> 6348
    //   6379: bipush 98
    //   6381: istore 220
    //   6383: goto -35 -> 6348
    //   6386: bipush 121
    //   6388: istore 220
    //   6390: goto -42 -> 6348
    //   6393: aload 221
    //   6395: iload 223
    //   6397: caload
    //   6398: istore 224
    //   6400: iload 223
    //   6402: iconst_5
    //   6403: irem
    //   6404: tableswitch	default:+32 -> 6436, 0:+53->6457, 1:+60->6464, 2:+67->6471, 3:+74->6478
    //   6437: dload_2
    //   6438: istore 225
    //   6440: aload 221
    //   6442: iload 223
    //   6444: iload 225
    //   6446: iload 224
    //   6448: ixor
    //   6449: i2c
    //   6450: castore
    //   6451: iinc 223 1
    //   6454: goto -4774 -> 1680
    //   6457: bipush 60
    //   6459: istore 225
    //   6461: goto -21 -> 6440
    //   6464: bipush 75
    //   6466: istore 225
    //   6468: goto -28 -> 6440
    //   6471: bipush 98
    //   6473: istore 225
    //   6475: goto -35 -> 6440
    //   6478: bipush 121
    //   6480: istore 225
    //   6482: goto -42 -> 6440
    //   6485: aload 226
    //   6487: iload 228
    //   6489: caload
    //   6490: istore 229
    //   6492: iload 228
    //   6494: iconst_5
    //   6495: irem
    //   6496: tableswitch	default:+32 -> 6528, 0:+53->6549, 1:+60->6556, 2:+67->6563, 3:+74->6570
    //   6529: dload_2
    //   6530: istore 230
    //   6532: aload 226
    //   6534: iload 228
    //   6536: iload 230
    //   6538: iload 229
    //   6540: ixor
    //   6541: i2c
    //   6542: castore
    //   6543: iinc 228 1
    //   6546: goto -4828 -> 1718
    //   6549: bipush 60
    //   6551: istore 230
    //   6553: goto -21 -> 6532
    //   6556: bipush 75
    //   6558: istore 230
    //   6560: goto -28 -> 6532
    //   6563: bipush 98
    //   6565: istore 230
    //   6567: goto -35 -> 6532
    //   6570: bipush 121
    //   6572: istore 230
    //   6574: goto -42 -> 6532
    //   6577: aload 231
    //   6579: iload 233
    //   6581: caload
    //   6582: istore 234
    //   6584: iload 233
    //   6586: iconst_5
    //   6587: irem
    //   6588: tableswitch	default:+32 -> 6620, 0:+53->6641, 1:+60->6648, 2:+67->6655, 3:+74->6662
    //   6621: dload_2
    //   6622: istore 235
    //   6624: aload 231
    //   6626: iload 233
    //   6628: iload 235
    //   6630: iload 234
    //   6632: ixor
    //   6633: i2c
    //   6634: castore
    //   6635: iinc 233 1
    //   6638: goto -4882 -> 1756
    //   6641: bipush 60
    //   6643: istore 235
    //   6645: goto -21 -> 6624
    //   6648: bipush 75
    //   6650: istore 235
    //   6652: goto -28 -> 6624
    //   6655: bipush 98
    //   6657: istore 235
    //   6659: goto -35 -> 6624
    //   6662: bipush 121
    //   6664: istore 235
    //   6666: goto -42 -> 6624
    //   6669: aload 236
    //   6671: iload 238
    //   6673: caload
    //   6674: istore 239
    //   6676: iload 238
    //   6678: iconst_5
    //   6679: irem
    //   6680: tableswitch	default:+32 -> 6712, 0:+53->6733, 1:+60->6740, 2:+67->6747, 3:+74->6754
    //   6713: dload_2
    //   6714: istore 240
    //   6716: aload 236
    //   6718: iload 238
    //   6720: iload 240
    //   6722: iload 239
    //   6724: ixor
    //   6725: i2c
    //   6726: castore
    //   6727: iinc 238 1
    //   6730: goto -4936 -> 1794
    //   6733: bipush 60
    //   6735: istore 240
    //   6737: goto -21 -> 6716
    //   6740: bipush 75
    //   6742: istore 240
    //   6744: goto -28 -> 6716
    //   6747: bipush 98
    //   6749: istore 240
    //   6751: goto -35 -> 6716
    //   6754: bipush 121
    //   6756: istore 240
    //   6758: goto -42 -> 6716
    //   6761: aload 241
    //   6763: iload 243
    //   6765: caload
    //   6766: istore 244
    //   6768: iload 243
    //   6770: iconst_5
    //   6771: irem
    //   6772: tableswitch	default:+32 -> 6804, 0:+53->6825, 1:+60->6832, 2:+67->6839, 3:+74->6846
    //   6805: dload_2
    //   6806: istore 245
    //   6808: aload 241
    //   6810: iload 243
    //   6812: iload 245
    //   6814: iload 244
    //   6816: ixor
    //   6817: i2c
    //   6818: castore
    //   6819: iinc 243 1
    //   6822: goto -4990 -> 1832
    //   6825: bipush 60
    //   6827: istore 245
    //   6829: goto -21 -> 6808
    //   6832: bipush 75
    //   6834: istore 245
    //   6836: goto -28 -> 6808
    //   6839: bipush 98
    //   6841: istore 245
    //   6843: goto -35 -> 6808
    //   6846: bipush 121
    //   6848: istore 245
    //   6850: goto -42 -> 6808
    //   6853: aload 246
    //   6855: iload 248
    //   6857: caload
    //   6858: istore 249
    //   6860: iload 248
    //   6862: iconst_5
    //   6863: irem
    //   6864: tableswitch	default:+32 -> 6896, 0:+53->6917, 1:+60->6924, 2:+67->6931, 3:+74->6938
    //   6897: dload_2
    //   6898: istore 250
    //   6900: aload 246
    //   6902: iload 248
    //   6904: iload 250
    //   6906: iload 249
    //   6908: ixor
    //   6909: i2c
    //   6910: castore
    //   6911: iinc 248 1
    //   6914: goto -5044 -> 1870
    //   6917: bipush 60
    //   6919: istore 250
    //   6921: goto -21 -> 6900
    //   6924: bipush 75
    //   6926: istore 250
    //   6928: goto -28 -> 6900
    //   6931: bipush 98
    //   6933: istore 250
    //   6935: goto -35 -> 6900
    //   6938: bipush 121
    //   6940: istore 250
    //   6942: goto -42 -> 6900
    //   6945: aload 251
    //   6947: iload 253
    //   6949: caload
    //   6950: istore 254
    //   6952: iload 253
    //   6954: iconst_5
    //   6955: irem
    //   6956: tableswitch	default:+32 -> 6988, 0:+53->7009, 1:+60->7016, 2:+67->7023, 3:+74->7030
    //   6989: dload_2
    //   6990: istore 255
    //   6992: aload 251
    //   6994: iload 253
    //   6996: iload 255
    //   6998: iload 254
    //   7000: ixor
    //   7001: i2c
    //   7002: castore
    //   7003: iinc 253 1
    //   7006: goto -5098 -> 1908
    //   7009: bipush 60
    //   7011: istore 255
    //   7013: goto -21 -> 6992
    //   7016: bipush 75
    //   7018: istore 255
    //   7020: goto -28 -> 6992
    //   7023: bipush 98
    //   7025: istore 255
    //   7027: goto -35 -> 6992
    //   7030: bipush 121
    //   7032: istore 255
    //   7034: goto -42 -> 6992
    //   7037: wide
    //   7041: wide
    //   7045: caload
    //   7046: wide
    //   7050: wide
    //   7054: iconst_5
    //   7055: irem
    //   7056: tableswitch	default:+32 -> 7088, 0:+66->7122, 1:+75->7131, 2:+84->7140, 3:+93->7149
    //   7089: dload_2
    //   7090: wide
    //   7094: wide
    //   7098: wide
    //   7102: wide
    //   7106: wide
    //   7110: ixor
    //   7111: i2c
    //   7112: castore
    //   7113: wide
    //   7119: goto -5165 -> 1954
    //   7122: bipush 60
    //   7124: wide
    //   7128: goto -34 -> 7094
    //   7131: bipush 75
    //   7133: wide
    //   7137: goto -43 -> 7094
    //   7140: bipush 98
    //   7142: wide
    //   7146: goto -52 -> 7094
    //   7149: bipush 121
    //   7151: wide
    //   7155: goto -61 -> 7094
    //   7158: wide
    //   7162: wide
    //   7166: caload
    //   7167: wide
    //   7171: wide
    //   7175: iconst_5
    //   7176: irem
    //   7177: tableswitch	default:+31 -> 7208, 0:+65->7242, 1:+74->7251, 2:+83->7260, 3:+92->7269
    //   7209: dload_2
    //   7210: wide
    //   7214: wide
    //   7218: wide
    //   7222: wide
    //   7226: wide
    //   7230: ixor
    //   7231: i2c
    //   7232: castore
    //   7233: wide
    //   7239: goto -5233 -> 2006
    //   7242: bipush 60
    //   7244: wide
    //   7248: goto -34 -> 7214
    //   7251: bipush 75
    //   7253: wide
    //   7257: goto -43 -> 7214
    //   7260: bipush 98
    //   7262: wide
    //   7266: goto -52 -> 7214
    //   7269: bipush 121
    //   7271: wide
    //   7275: goto -61 -> 7214
    //   7278: wide
    //   7282: wide
    //   7286: caload
    //   7287: wide
    //   7291: wide
    //   7295: iconst_5
    //   7296: irem
    //   7297: tableswitch	default:+31 -> 7328, 0:+65->7362, 1:+74->7371, 2:+83->7380, 3:+92->7389
    //   7329: dload_2
    //   7330: wide
    //   7334: wide
    //   7338: wide
    //   7342: wide
    //   7346: wide
    //   7350: ixor
    //   7351: i2c
    //   7352: castore
    //   7353: wide
    //   7359: goto -5301 -> 2058
    //   7362: bipush 60
    //   7364: wide
    //   7368: goto -34 -> 7334
    //   7371: bipush 75
    //   7373: wide
    //   7377: goto -43 -> 7334
    //   7380: bipush 98
    //   7382: wide
    //   7386: goto -52 -> 7334
    //   7389: bipush 121
    //   7391: wide
    //   7395: goto -61 -> 7334
    //   7398: wide
    //   7402: wide
    //   7406: caload
    //   7407: wide
    //   7411: wide
    //   7415: iconst_5
    //   7416: irem
    //   7417: tableswitch	default:+31 -> 7448, 0:+65->7482, 1:+74->7491, 2:+83->7500, 3:+92->7509
    //   7449: dload_2
    //   7450: wide
    //   7454: wide
    //   7458: wide
    //   7462: wide
    //   7466: wide
    //   7470: ixor
    //   7471: i2c
    //   7472: castore
    //   7473: wide
    //   7479: goto -5369 -> 2110
    //   7482: bipush 60
    //   7484: wide
    //   7488: goto -34 -> 7454
    //   7491: bipush 75
    //   7493: wide
    //   7497: goto -43 -> 7454
    //   7500: bipush 98
    //   7502: wide
    //   7506: goto -52 -> 7454
    //   7509: bipush 121
    //   7511: wide
    //   7515: goto -61 -> 7454
    //   7518: wide
    //   7522: wide
    //   7526: caload
    //   7527: wide
    //   7531: wide
    //   7535: iconst_5
    //   7536: irem
    //   7537: tableswitch	default:+31 -> 7568, 0:+65->7602, 1:+74->7611, 2:+83->7620, 3:+92->7629
    //   7569: dload_2
    //   7570: wide
    //   7574: wide
    //   7578: wide
    //   7582: wide
    //   7586: wide
    //   7590: ixor
    //   7591: i2c
    //   7592: castore
    //   7593: wide
    //   7599: goto -5437 -> 2162
    //   7602: bipush 60
    //   7604: wide
    //   7608: goto -34 -> 7574
    //   7611: bipush 75
    //   7613: wide
    //   7617: goto -43 -> 7574
    //   7620: bipush 98
    //   7622: wide
    //   7626: goto -52 -> 7574
    //   7629: bipush 121
    //   7631: wide
    //   7635: goto -61 -> 7574
    //   7638: wide
    //   7642: wide
    //   7646: caload
    //   7647: wide
    //   7651: wide
    //   7655: iconst_5
    //   7656: irem
    //   7657: tableswitch	default:+31 -> 7688, 0:+65->7722, 1:+74->7731, 2:+83->7740, 3:+92->7749
    //   7689: dload_2
    //   7690: wide
    //   7694: wide
    //   7698: wide
    //   7702: wide
    //   7706: wide
    //   7710: ixor
    //   7711: i2c
    //   7712: castore
    //   7713: wide
    //   7719: goto -5505 -> 2214
    //   7722: bipush 60
    //   7724: wide
    //   7728: goto -34 -> 7694
    //   7731: bipush 75
    //   7733: wide
    //   7737: goto -43 -> 7694
    //   7740: bipush 98
    //   7742: wide
    //   7746: goto -52 -> 7694
    //   7749: bipush 121
    //   7751: wide
    //   7755: goto -61 -> 7694
    //   7758: wide
    //   7762: wide
    //   7766: caload
    //   7767: wide
    //   7771: wide
    //   7775: iconst_5
    //   7776: irem
    //   7777: tableswitch	default:+31 -> 7808, 0:+65->7842, 1:+74->7851, 2:+83->7860, 3:+92->7869
    //   7809: dload_2
    //   7810: wide
    //   7814: wide
    //   7818: wide
    //   7822: wide
    //   7826: wide
    //   7830: ixor
    //   7831: i2c
    //   7832: castore
    //   7833: wide
    //   7839: goto -5573 -> 2266
    //   7842: bipush 60
    //   7844: wide
    //   7848: goto -34 -> 7814
    //   7851: bipush 75
    //   7853: wide
    //   7857: goto -43 -> 7814
    //   7860: bipush 98
    //   7862: wide
    //   7866: goto -52 -> 7814
    //   7869: bipush 121
    //   7871: wide
    //   7875: goto -61 -> 7814
    //   7878: wide
    //   7882: wide
    //   7886: caload
    //   7887: wide
    //   7891: wide
    //   7895: iconst_5
    //   7896: irem
    //   7897: tableswitch	default:+31 -> 7928, 0:+65->7962, 1:+74->7971, 2:+83->7980, 3:+92->7989
    //   7929: dload_2
    //   7930: wide
    //   7934: wide
    //   7938: wide
    //   7942: wide
    //   7946: wide
    //   7950: ixor
    //   7951: i2c
    //   7952: castore
    //   7953: wide
    //   7959: goto -5641 -> 2318
    //   7962: bipush 60
    //   7964: wide
    //   7968: goto -34 -> 7934
    //   7971: bipush 75
    //   7973: wide
    //   7977: goto -43 -> 7934
    //   7980: bipush 98
    //   7982: wide
    //   7986: goto -52 -> 7934
    //   7989: bipush 121
    //   7991: wide
    //   7995: goto -61 -> 7934
  }

  private int a(int paramInt)
  {
    int i1 = 4;
    if (paramInt < i1)
      i1 = 1;
    while (true)
    {
      return i1;
      if (paramInt < 7)
        i1 = 2;
    }
  }

  public static Intent a(sz paramsz, String paramString, Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, MediaView.class);
    ArrayList localArrayList = new ArrayList();
    localIntent.putExtra(Z[51], paramsz.b.hashCode());
    localIntent.putExtra(Z[50], paramString);
    localArrayList.add(paramsz.b.a);
    if (paramsz.b.b);
    for (String str = "1"; ; str = "0")
    {
      localArrayList.add(str);
      localArrayList.add(paramsz.b.c);
      localIntent.putStringArrayListExtra(Z[52], localArrayList);
      return localIntent;
    }
  }

  static MediaPlayer a(MediaView paramMediaView)
  {
    return paramMediaView.l;
  }

  static TouchImageView a(MediaView paramMediaView, TouchImageView paramTouchImageView)
  {
    paramMediaView.i = paramTouchImageView;
    return paramTouchImageView;
  }

  private void a()
  {
    if ((this.l != null) && (this.l.isPlaying()))
      this.l.stop();
    this.l = new MediaPlayer();
    try
    {
      this.l.setDataSource(this.C.getPath());
      this.l.setOnPreparedListener(new yw(this));
      this.l.setOnErrorListener(new zw(this));
      this.l.prepare();
      g5.b(Z[31] + this.l.getDuration());
      this.G = 5;
      TextView localTextView = this.j;
      StringBuilder localStringBuilder = new StringBuilder();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      localTextView.setText(getString(2131296802, arrayOfObject) + "%");
      this.k.setMax(this.l.getDuration());
      this.k.setProgress(0);
      this.H.setText(getString(2131296756));
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.d(localIOException);
        a(2131296784, new ax(this));
      }
    }
  }

  private void a(int paramInt, TouchImageView paramTouchImageView)
  {
    a(paramInt, paramTouchImageView, null, true);
  }

  // ERROR //
  private void a(int paramInt, TouchImageView paramTouchImageView1, TouchImageView paramTouchImageView2, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 417	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore 5
    //   5: aload_0
    //   6: getfield 218	com/whatsapp/MediaView:T	Z
    //   9: ifeq +12 -> 21
    //   12: getstatic 208	com/whatsapp/MediaView:Z	[Ljava/lang/String;
    //   15: bipush 23
    //   17: aaload
    //   18: invokestatic 419	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   21: aload_2
    //   22: ifnull +10 -> 32
    //   25: aload_2
    //   26: invokevirtual 424	com/whatsapp/TouchImageView:a	()Landroid/graphics/Bitmap;
    //   29: ifnull +4 -> 33
    //   32: return
    //   33: aload_0
    //   34: iload_1
    //   35: invokevirtual 427	com/whatsapp/MediaView:d	(I)Lcom/whatsapp/sz;
    //   38: astore 6
    //   40: aload 6
    //   42: getfield 430	com/whatsapp/sz:t	Ljava/lang/Object;
    //   45: checkcast 432	com/whatsapp/MediaData
    //   48: astore 7
    //   50: aload_0
    //   51: getfield 434	com/whatsapp/MediaView:s	Landroid/view/View;
    //   54: iconst_0
    //   55: invokevirtual 439	android/view/View:setVisibility	(I)V
    //   58: aload 6
    //   60: getfield 249	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   63: getfield 270	com/whatsapp/uz:b	Z
    //   66: ifne +44 -> 110
    //   69: aload 7
    //   71: getfield 442	com/whatsapp/MediaData:transferred	Z
    //   74: ifne +36 -> 110
    //   77: aload 7
    //   79: getfield 445	com/whatsapp/MediaData:progress	J
    //   82: aload 6
    //   84: getfield 447	com/whatsapp/sz:m	J
    //   87: lcmp
    //   88: ifeq +22 -> 110
    //   91: aload_0
    //   92: aload_0
    //   93: aload 6
    //   95: getfield 449	com/whatsapp/sz:l	B
    //   98: invokestatic 451	com/whatsapp/MediaView:g	(I)I
    //   101: invokevirtual 389	com/whatsapp/MediaView:getString	(I)Ljava/lang/String;
    //   104: invokestatic 456	com/whatsapp/App:a	(Lcom/whatsapp/lr;Ljava/lang/String;)V
    //   107: goto -75 -> 32
    //   110: aload_0
    //   111: aload 7
    //   113: getfield 460	com/whatsapp/MediaData:file	Ljava/io/File;
    //   116: invokestatic 464	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   119: putfield 301	com/whatsapp/MediaView:C	Landroid/net/Uri;
    //   122: aload_0
    //   123: getfield 466	com/whatsapp/MediaView:t	Landroid/widget/LinearLayout;
    //   126: bipush 8
    //   128: invokevirtual 469	android/widget/LinearLayout:setVisibility	(I)V
    //   131: aload_0
    //   132: getfield 301	com/whatsapp/MediaView:C	Landroid/net/Uri;
    //   135: invokevirtual 306	android/net/Uri:getPath	()Ljava/lang/String;
    //   138: getstatic 208	com/whatsapp/MediaView:Z	[Ljava/lang/String;
    //   141: bipush 21
    //   143: aaload
    //   144: invokevirtual 473	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   147: ifeq +50 -> 197
    //   150: aload_2
    //   151: iconst_1
    //   152: invokevirtual 476	com/whatsapp/TouchImageView:a	(Z)V
    //   155: aload_0
    //   156: getfield 301	com/whatsapp/MediaView:C	Landroid/net/Uri;
    //   159: invokevirtual 306	android/net/Uri:getPath	()Ljava/lang/String;
    //   162: invokestatic 482	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   165: astore 18
    //   167: aload_2
    //   168: aload 18
    //   170: iload 4
    //   172: invokevirtual 485	com/whatsapp/TouchImageView:a	(Landroid/graphics/Bitmap;Z)V
    //   175: aload_0
    //   176: aload_2
    //   177: aload 18
    //   179: invokevirtual 488	com/whatsapp/MediaView:a	(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V
    //   182: aload_0
    //   183: iconst_1
    //   184: aload_0
    //   185: getfield 214	com/whatsapp/MediaView:R	I
    //   188: iadd
    //   189: putfield 214	com/whatsapp/MediaView:R	I
    //   192: iload 5
    //   194: ifeq -162 -> 32
    //   197: aload_2
    //   198: iconst_0
    //   199: invokevirtual 476	com/whatsapp/TouchImageView:a	(Z)V
    //   202: aload_0
    //   203: getfield 301	com/whatsapp/MediaView:C	Landroid/net/Uri;
    //   206: invokevirtual 306	android/net/Uri:getPath	()Ljava/lang/String;
    //   209: getstatic 208	com/whatsapp/MediaView:Z	[Ljava/lang/String;
    //   212: bipush 20
    //   214: aaload
    //   215: invokevirtual 473	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   218: ifeq +27 -> 245
    //   221: aload_2
    //   222: iconst_1
    //   223: putfield 490	com/whatsapp/TouchImageView:i	Z
    //   226: aload_2
    //   227: aload_0
    //   228: invokevirtual 494	com/whatsapp/MediaView:getResources	()Landroid/content/res/Resources;
    //   231: invokevirtual 500	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   234: getfield 505	android/content/res/Configuration:orientation	I
    //   237: invokevirtual 507	com/whatsapp/TouchImageView:a	(I)V
    //   240: iload 5
    //   242: ifeq -210 -> 32
    //   245: aload_2
    //   246: iconst_1
    //   247: putfield 509	com/whatsapp/TouchImageView:h	Z
    //   250: aload_0
    //   251: getfield 220	com/whatsapp/MediaView:V	Z
    //   254: ifeq +123 -> 377
    //   257: aload_3
    //   258: ifnull +119 -> 377
    //   261: aload_3
    //   262: invokevirtual 424	com/whatsapp/TouchImageView:a	()Landroid/graphics/Bitmap;
    //   265: ifnull +112 -> 377
    //   268: aload_2
    //   269: aload_3
    //   270: invokevirtual 424	com/whatsapp/TouchImageView:a	()Landroid/graphics/Bitmap;
    //   273: invokevirtual 513	com/whatsapp/TouchImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   276: goto -244 -> 32
    //   279: astore 14
    //   281: new 329	java/lang/StringBuilder
    //   284: dup
    //   285: invokespecial 330	java/lang/StringBuilder:<init>	()V
    //   288: getstatic 208	com/whatsapp/MediaView:Z	[Ljava/lang/String;
    //   291: bipush 22
    //   293: aaload
    //   294: invokevirtual 334	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: aload 14
    //   299: invokevirtual 516	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   302: invokevirtual 343	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   305: invokestatic 518	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   308: aload_0
    //   309: invokevirtual 520	com/whatsapp/MediaView:d	()V
    //   312: new 522	android/graphics/BitmapFactory$Options
    //   315: dup
    //   316: invokespecial 523	android/graphics/BitmapFactory$Options:<init>	()V
    //   319: astore 15
    //   321: aload 15
    //   323: iconst_2
    //   324: putfield 526	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   327: aload_0
    //   328: getfield 301	com/whatsapp/MediaView:C	Landroid/net/Uri;
    //   331: invokevirtual 306	android/net/Uri:getPath	()Ljava/lang/String;
    //   334: aload 15
    //   336: invokestatic 529	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   339: astore 17
    //   341: aload_2
    //   342: aload 17
    //   344: invokevirtual 513	com/whatsapp/TouchImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   347: aload_0
    //   348: aload_2
    //   349: aload 17
    //   351: invokevirtual 488	com/whatsapp/MediaView:a	(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V
    //   354: goto -172 -> 182
    //   357: astore 16
    //   359: aload_0
    //   360: ldc_w 530
    //   363: new 532	com/whatsapp/cx
    //   366: dup
    //   367: aload_0
    //   368: invokespecial 533	com/whatsapp/cx:<init>	(Lcom/whatsapp/MediaView;)V
    //   371: invokevirtual 403	com/whatsapp/MediaView:a	(ILcom/whatsapp/nr;)V
    //   374: goto -342 -> 32
    //   377: new 535	android/media/MediaMetadataRetriever
    //   380: dup
    //   381: invokespecial 536	android/media/MediaMetadataRetriever:<init>	()V
    //   384: astore 8
    //   386: aload 8
    //   388: aload 7
    //   390: getfield 460	com/whatsapp/MediaData:file	Ljava/io/File;
    //   393: invokevirtual 541	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   396: invokevirtual 542	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   399: getstatic 547	android/os/Build$VERSION:SDK_INT	I
    //   402: bipush 10
    //   404: if_icmplt +78 -> 482
    //   407: aload 8
    //   409: lconst_0
    //   410: invokevirtual 551	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
    //   413: astore 13
    //   415: aload 13
    //   417: ifnull +21 -> 438
    //   420: aload_0
    //   421: aload_2
    //   422: aload 13
    //   424: invokevirtual 488	com/whatsapp/MediaView:a	(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V
    //   427: aload_2
    //   428: aload 13
    //   430: invokevirtual 513	com/whatsapp/TouchImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   433: iload 5
    //   435: ifeq -403 -> 32
    //   438: getstatic 208	com/whatsapp/MediaView:Z	[Ljava/lang/String;
    //   441: bipush 19
    //   443: aaload
    //   444: invokestatic 419	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   447: aload_2
    //   448: invokevirtual 553	com/whatsapp/TouchImageView:f	()V
    //   451: goto -419 -> 32
    //   454: astore 11
    //   456: aload 11
    //   458: invokestatic 396	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   461: aload_2
    //   462: invokevirtual 553	com/whatsapp/TouchImageView:f	()V
    //   465: goto -433 -> 32
    //   468: astore 10
    //   470: aload 10
    //   472: invokestatic 396	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   475: aload_2
    //   476: invokevirtual 553	com/whatsapp/TouchImageView:f	()V
    //   479: goto -447 -> 32
    //   482: aload 8
    //   484: invokevirtual 556	android/media/MediaMetadataRetriever:captureFrame	()Landroid/graphics/Bitmap;
    //   487: astore 12
    //   489: aload 12
    //   491: astore 13
    //   493: goto -78 -> 415
    //   496: astore 9
    //   498: aload 9
    //   500: invokestatic 396	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   503: aload_0
    //   504: invokevirtual 520	com/whatsapp/MediaView:d	()V
    //   507: aload_2
    //   508: invokevirtual 553	com/whatsapp/TouchImageView:f	()V
    //   511: goto -479 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   155	182	279	java/lang/OutOfMemoryError
    //   327	354	357	java/lang/OutOfMemoryError
    //   386	451	454	java/lang/RuntimeException
    //   482	489	454	java/lang/RuntimeException
    //   377	386	468	java/lang/UnsatisfiedLinkError
    //   386	451	468	java/lang/UnsatisfiedLinkError
    //   456	465	468	java/lang/UnsatisfiedLinkError
    //   482	489	468	java/lang/UnsatisfiedLinkError
    //   498	511	468	java/lang/UnsatisfiedLinkError
    //   386	451	496	java/lang/OutOfMemoryError
    //   482	489	496	java/lang/OutOfMemoryError
  }

  public static void a(ContentResolver paramContentResolver, byte[] paramArrayOfByte, long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    String str = Z[41] + paramLong + Z[46] + Z[47] + Z[48] + Z[49] + "'";
    Cursor localCursor = paramContentResolver.query(ContactsContract.Data.CONTENT_URI, null, str, null, null);
    int i1 = localCursor.getColumnIndexOrThrow(Z[27]);
    if (localCursor.moveToFirst());
    for (int i2 = localCursor.getInt(i1); ; i2 = -1)
    {
      localCursor.close();
      localContentValues.put(Z[44], Long.valueOf(paramLong));
      localContentValues.put(Z[45], Integer.valueOf(1));
      localContentValues.put(Z[42], paramArrayOfByte);
      localContentValues.put(Z[47], Z[49]);
      if (i2 >= 0)
      {
        paramContentResolver.update(ContactsContract.Data.CONTENT_URI, localContentValues, Z[43] + i2, null);
        if (!DialogToastListActivity.f);
      }
      else
      {
        paramContentResolver.insert(ContactsContract.Data.CONTENT_URI, localContentValues);
      }
      return;
    }
  }

  private void a(Uri paramUri, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramUri == null)
    {
      l.a(true, paramInt1, null, paramInt2, paramInt3);
      if (!DialogToastListActivity.f);
    }
    else
    {
      l.a(false, -1, paramUri, 0, 0);
    }
    j5.b(paramUri);
  }

  static void a(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.c(paramInt);
  }

  static void a(MediaView paramMediaView, int paramInt, TouchImageView paramTouchImageView)
  {
    paramMediaView.a(paramInt, paramTouchImageView);
  }

  static void a(MediaView paramMediaView, int paramInt, TouchImageView paramTouchImageView1, TouchImageView paramTouchImageView2, boolean paramBoolean)
  {
    paramMediaView.a(paramInt, paramTouchImageView1, paramTouchImageView2, paramBoolean);
  }

  static boolean a(MediaView paramMediaView, boolean paramBoolean)
  {
    paramMediaView.I = paramBoolean;
    return paramBoolean;
  }

  static int b(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.G = paramInt;
    return paramInt;
  }

  static Handler b(MediaView paramMediaView)
  {
    return paramMediaView.E;
  }

  private void b()
  {
    boolean bool = DialogToastListActivity.f;
    sz localsz = d(this.y);
    Intent localIntent = new Intent(Z[33]);
    switch (localsz.l)
    {
    default:
    case 2:
    case 3:
    case 1:
    }
    while (true)
    {
      MediaData localMediaData = (MediaData)localsz.t;
      localIntent.putExtra(Z[34], Uri.fromFile(localMediaData.file));
      startActivity(Intent.createChooser(localIntent, null));
      return;
      localIntent.setType(Z[32]);
      if (bool)
      {
        localIntent.setType(Z[4]);
        if (bool)
          localIntent.setType(Z[13]);
      }
    }
  }

  private void b(int paramInt)
  {
    if ((this.i.i) || (this.i.h))
      c();
    if (paramInt == 1)
    {
      if (this.y > 0)
      {
        this.y = (-1 + this.y);
        this.r.b(this.y);
        if (!DialogToastListActivity.f);
      }
    }
    else if (this.y < -1 + this.z)
    {
      this.y = (1 + this.y);
      this.r.b(this.y);
    }
  }

  static boolean b(MediaView paramMediaView, boolean paramBoolean)
  {
    paramMediaView.J = paramBoolean;
    return paramBoolean;
  }

  static int c(MediaView paramMediaView)
  {
    return paramMediaView.G;
  }

  private void c()
  {
    if ((this.i.i) && (this.l != null) && (this.l.isPlaying()))
    {
      this.l.stop();
      this.l.release();
      this.l = null;
    }
  }

  private void c(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    Z[3];
    sz localsz = d(this.y);
    if (localsz == null);
    while (true)
    {
      return;
      this.C = Uri.fromFile(((MediaData)localsz.t).file);
      if (localsz.l == 3)
      {
        Intent localIntent = new Intent(Z[5]);
        localIntent.setDataAndType(this.C, Z[4]);
        if (Build.MANUFACTURER.startsWith(Z[3]))
        {
          List localList = App.hb.queryIntentActivities(localIntent, 0);
          if (localList != null)
          {
            Iterator localIterator = localList.iterator();
            do
            {
              if (!localIterator.hasNext())
                break;
              ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
              g5.b(localResolveInfo.activityInfo.packageName + Z[0] + localResolveInfo.activityInfo.name);
              if (localResolveInfo.activityInfo.name.equals(Z[2]))
                localIntent.setClassName(Z[1], Z[2]);
            }
            while (!bool);
          }
        }
        startActivity(localIntent);
        if (!bool);
      }
      else if (localsz.l == 2)
      {
        if ((!this.D) || (this.l == null))
          a();
        this.G = 4;
        this.E.sendEmptyMessage(0);
        this.H.setText(2131296798);
        this.l.start();
        if (paramInt > 0)
        {
          this.l.seekTo(paramInt);
          this.k.setProgress(this.l.getCurrentPosition());
        }
      }
    }
  }

  static void c(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.f(paramInt);
  }

  static Button d(MediaView paramMediaView)
  {
    return paramMediaView.H;
  }

  static void d(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.e(paramInt);
  }

  static int e(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.y = paramInt;
    return paramInt;
  }

  private void e(int paramInt)
  {
    int i1 = paramInt - 1;
    a(i1, (TouchImageView)this.r.getChildAt(i1));
    int i2 = paramInt + 1;
    a(i2, (TouchImageView)this.r.getChildAt(i2));
    f(paramInt);
  }

  static boolean e(MediaView paramMediaView)
  {
    return paramMediaView.J;
  }

  static int f(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.F = paramInt;
    return paramInt;
  }

  static SeekBar f(MediaView paramMediaView)
  {
    return paramMediaView.k;
  }

  private void f(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    sz localsz = d(paramInt);
    if (localsz == null)
      return;
    Object localObject2;
    SpannableStringBuilder localSpannableStringBuilder2;
    label145: Object localObject1;
    SpannableStringBuilder localSpannableStringBuilder1;
    TextView localTextView1;
    Object[] arrayOfObject1;
    if (localsz.b.b)
    {
      TextView localTextView3 = this.h;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = getString(2131296866);
      arrayOfObject3[1] = t4.a(this, localsz.i);
      localTextView3.setText(getString(2131296490, arrayOfObject3));
      if (!bool);
    }
    else if ((localsz.b.a.contains("-")) && (localsz.c != null))
    {
      localObject2 = App.w.a(localsz.c, null).b();
      localSpannableStringBuilder2 = v4.a((String)localObject2, getBaseContext());
      TextView localTextView2 = this.h;
      Object[] arrayOfObject2 = new Object[2];
      if (localSpannableStringBuilder2 != null)
        break label407;
      arrayOfObject2[0] = localObject2;
      arrayOfObject2[1] = t4.a(this, localsz.i);
      localTextView2.setText(getString(2131296490, arrayOfObject2));
      if (!bool);
    }
    else
    {
      localObject1 = App.w.a(this.A, null).b();
      localSpannableStringBuilder1 = v4.a((String)localObject1, getBaseContext());
      localTextView1 = this.h;
      arrayOfObject1 = new Object[2];
      if (localSpannableStringBuilder1 != null)
        break label414;
    }
    while (true)
    {
      arrayOfObject1[0] = localObject1;
      arrayOfObject1[1] = t4.a(this, localsz.i);
      localTextView1.setText(getString(2131296490, arrayOfObject1));
      this.t.setVisibility(8);
      if (localsz.l == 2)
      {
        this.C = Uri.fromFile(((MediaData)localsz.t).file);
        g5.b(Z[53] + this.C.getPath());
        this.t.setVisibility(0);
        if (!this.V)
          a();
      }
      if (paramInt == 0)
      {
        this.n.setImageDrawable(null);
        if (!bool);
      }
      else
      {
        this.n.setImageResource(2130838545);
      }
      if (paramInt == -1 + this.x.size())
      {
        this.m.setImageDrawable(null);
        if (!bool)
          break;
      }
      this.m.setImageResource(2130838544);
      break;
      label407: localObject2 = localSpannableStringBuilder2;
      break label145;
      label414: localObject1 = localSpannableStringBuilder1;
    }
  }

  public static int g(int paramInt)
  {
    int i1;
    switch (paramInt)
    {
    default:
      i1 = 2131296782;
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return i1;
      i1 = 2131296779;
      continue;
      i1 = 2131296781;
      continue;
      i1 = 2131296780;
    }
  }

  static void g(MediaView paramMediaView)
  {
    paramMediaView.a();
  }

  static void g(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.b(paramInt);
  }

  static int h(MediaView paramMediaView, int paramInt)
  {
    return paramMediaView.a(paramInt);
  }

  static GalleryView h(MediaView paramMediaView)
  {
    return paramMediaView.r;
  }

  static int i(MediaView paramMediaView)
  {
    return paramMediaView.y;
  }

  static int i(MediaView paramMediaView, int paramInt)
  {
    paramMediaView.z = paramInt;
    return paramInt;
  }

  static View j(MediaView paramMediaView)
  {
    return paramMediaView.s;
  }

  static View k(MediaView paramMediaView)
  {
    return paramMediaView.q;
  }

  static TextView l(MediaView paramMediaView)
  {
    return paramMediaView.h;
  }

  static int m(MediaView paramMediaView)
  {
    return paramMediaView.z;
  }

  static TextView n(MediaView paramMediaView)
  {
    return paramMediaView.g;
  }

  static TouchImageView o(MediaView paramMediaView)
  {
    return paramMediaView.i;
  }

  static void p(MediaView paramMediaView)
  {
    paramMediaView.c();
  }

  static boolean q(MediaView paramMediaView)
  {
    return paramMediaView.I;
  }

  static int r(MediaView paramMediaView)
  {
    return paramMediaView.F;
  }

  static TextView s(MediaView paramMediaView)
  {
    return paramMediaView.j;
  }

  static String t(MediaView paramMediaView)
  {
    return paramMediaView.A;
  }

  static void u(MediaView paramMediaView)
  {
    paramMediaView.b();
  }

  static ImageView v(MediaView paramMediaView)
  {
    return paramMediaView.n;
  }

  static ImageView w(MediaView paramMediaView)
  {
    return paramMediaView.m;
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    boolean bool = DialogToastListActivity.f;
    int i2;
    for (int i1 = paramInt - 1; ; i1 = i2)
      if (i1 < paramInt + 2)
      {
        TouchImageView localTouchImageView = (TouchImageView)this.r.getChildAt(i1);
        if (localTouchImageView != null)
        {
          if (i1 == paramInt)
          {
            localTouchImageView.t = paramBoolean;
            if (!bool);
          }
          else
          {
            localTouchImageView.t = true;
          }
          if ((i1 == paramInt - 1) || (i1 == paramInt + 1))
          {
            localTouchImageView.e();
            a(localTouchImageView, localTouchImageView.a());
          }
        }
        i2 = i1 + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }

  public void a(Menu paramMenu, int paramInt1, int paramInt2, int paramInt3)
  {
    paramMenu.add(0, paramInt1, 0, paramInt2).setIcon(paramInt3);
  }

  public void a(TouchImageView paramTouchImageView, Bitmap paramBitmap)
  {
    if (this.T)
      g5.d(Z[54] + paramTouchImageView.getTag());
    if (paramBitmap == null)
      if (paramTouchImageView.i)
        paramTouchImageView.a(getResources().getConfiguration().orientation);
    while (true)
    {
      return;
      paramTouchImageView.e();
      paramTouchImageView.u = 1.0F;
      if (paramTouchImageView.i)
        paramTouchImageView.a(getResources().getConfiguration().orientation);
    }
  }

  public sz d(int paramInt)
  {
    int i1 = this.x.size();
    sz localsz = null;
    if (paramInt < i1)
      localsz = (sz)this.x.get(-1 + (i1 - paramInt));
    return localsz;
  }

  public void d()
  {
    boolean bool = DialogToastListActivity.f;
    long l1 = Runtime.getRuntime().maxMemory() / 1024L;
    g5.b(Z[38] + l1 + Z[40]);
    g5.d(Z[39] + Debug.getNativeHeapAllocatedSize() / 1024L + Z[35]);
    if (this.R == 0)
      this.S = true;
    int i1 = 0;
    int i2 = 0;
    while (true)
    {
      int i3;
      if (i1 < this.x.size())
      {
        if ((i1 < -1 + this.y) || (i1 > 1 + this.y))
        {
          TouchImageView localTouchImageView = (TouchImageView)this.r.getChildAt(i1);
          localTouchImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
          if (localTouchImageView.b())
            i2++;
        }
        i3 = i1 + 1;
        if (!bool);
      }
      else
      {
        g5.b(Z[37] + i2);
        if (i2 == 0)
          j5.c();
        System.gc();
        g5.d(Z[36] + Debug.getNativeHeapAllocatedSize() / 1024L + Z[35]);
        return;
      }
      i1 = i3;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      if ((paramInt2 == -1) && (paramIntent != null) && (paramIntent.getData() != null))
      {
        a(paramIntent.getData(), -1, 0, 0);
        if ((bool) && (paramInt2 == -1) && (paramIntent != null) && (paramIntent.hasExtra(Z[28])))
        {
          Bitmap localBitmap = (Bitmap)paramIntent.getParcelableExtra(Z[28]);
          g5.b(Z[29] + localBitmap.getWidth() + Z[0] + this.v);
          if (Uri.withAppendedPath(this.v, Z[26]) != null)
          {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            localBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
            byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
            long l1 = ContentUris.parseId(this.v);
            ContentResolver localContentResolver = getContentResolver();
            Uri localUri2 = ContactsContract.RawContacts.CONTENT_URI;
            String[] arrayOfString1 = new String[1];
            arrayOfString1[0] = Z[27];
            String str = Z[30];
            String[] arrayOfString2 = new String[1];
            arrayOfString2[0] = String.valueOf(l1);
            Cursor localCursor = localContentResolver.query(localUri2, arrayOfString1, str, arrayOfString2, null);
            int i2 = 0;
            do
            {
              if (!localCursor.moveToNext())
                break;
              long l2 = localCursor.getLong(0);
              if (i2 == 0)
              {
                a(App.ib, arrayOfByte, l2);
                i2 = 1;
              }
              g5.b(Z[25] + l2);
            }
            while (!bool);
            if ((bool) && (paramInt2 == -1) && (paramIntent != null))
            {
              this.v = paramIntent.getData();
              Uri localUri1 = Uri.fromFile(((MediaData)d(this.y).t).file);
              int i1 = (int)App.Mb.getResources().getDimension(2131361796);
              Intent localIntent = new Intent(this, CropImage.class);
              localIntent.putExtra(Z[8], i1);
              localIntent.putExtra(Z[9], i1);
              localIntent.putExtra(Z[11], 1);
              localIntent.putExtra(Z[7], true);
              localIntent.putExtra(Z[14], true);
              localIntent.putExtra(Z[24], true);
              localIntent.setData(localUri1);
              localIntent.putExtra(Z[15], l.c());
              localIntent.putExtra(Z[12], Bitmap.CompressFormat.JPEG.toString());
              startActivityForResult(localIntent, 1);
            }
          }
        }
      }
    }
  }

  public void onBackPressed()
  {
    this.W.a();
    super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool = DialogToastListActivity.f;
    super.onConfigurationChanged(paramConfiguration);
    g5.c(Z[17]);
    M = paramConfiguration.orientation;
    this.i.e();
    int i1;
    if (this.y == 0)
      i1 = 0;
    int i3;
    for (int i2 = i1; ; i2 = i3)
      if (i2 < 2 + this.y)
      {
        TouchImageView localTouchImageView = (TouchImageView)this.r.getChildAt(i2);
        if ((localTouchImageView != null) && (localTouchImageView.j))
          a(localTouchImageView, localTouchImageView.a());
        i3 = i2 + 1;
        if (!bool);
      }
      else
      {
        if (this.i.i)
        {
          this.i.a(paramConfiguration.orientation);
          if (!bool);
        }
        else
        {
          a(this.i, this.i.a());
        }
        this.r.locked = false;
        this.s.setVisibility(0);
        this.r.a(this.y, B.getWidth());
        this.Y.sendEmptyMessageDelayed(0, 50L);
        return;
        i1 = -1 + this.y;
        break;
      }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(Z[58]);
    super.onCreate(paramBundle);
    App.z();
    requestWindowFeature(1);
    Intent localIntent;
    ArrayList localArrayList;
    Object localObject;
    SpannableStringBuilder localSpannableStringBuilder;
    TextView localTextView;
    try
    {
      setContentView(2130903108);
      localIntent = getIntent();
      if (localIntent == null)
      {
        finish();
        return;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        g5.d(Z[56] + Debug.getNativeHeapAllocatedSize() / 1024L + Z[35]);
        j5.c();
        a(2131296981, new xw(this));
      }
      L = this;
      this.u = j4.a(this);
      this.A = localIntent.getStringExtra(Z[50]);
      this.g = ((TextView)findViewById(2131558712));
      localArrayList = localIntent.getStringArrayListExtra(Z[52]);
      if ((localArrayList != null) && (localArrayList.size() >= 3))
      {
        this.x = new ArrayList();
        sz localsz2 = App.z.a(new uz((String)localArrayList.get(0), "1".equals(localArrayList.get(1)), (String)localArrayList.get(2)));
        this.x.add(localsz2);
        this.z = this.x.size();
        if ((localsz2.l == 2) || (localsz2.l == 3))
          this.D = true;
        this.g.setVisibility(4);
        findViewById(2131558713).setVisibility(0);
        this.W = new sb(this);
        this.W.execute(new Void[0]);
        if (!bool);
      }
      else
      {
        this.x = App.z.n(this.A);
        this.z = this.x.size();
      }
      w = this.u.c();
      this.j = ((TextView)findViewById(2131558716));
      this.k = ((SeekBar)findViewById(2131558717));
      this.k.setOnSeekBarChangeListener(new dx(this));
      this.t = ((LinearLayout)findViewById(2131558715));
      this.f = ((TextView)findViewById(2131558707));
      this.m = ((ImageView)findViewById(2131558694));
      this.n = ((ImageView)findViewById(2131558693));
      this.h = ((TextView)findViewById(2131558710));
      this.o = ((ImageView)findViewById(2131558719));
      this.p = ((ImageView)findViewById(2131558720));
      this.H = ((Button)findViewById(2131558718));
      this.s = findViewById(2131558714);
      this.q = findViewById(2131558711);
      this.o.setBackgroundResource(2130838546);
      this.p.setBackgroundResource(2130838546);
      this.m.setBackgroundResource(2130838546);
      this.n.setBackgroundResource(2130838546);
      localObject = App.w.a(this.A, null).b();
      localSpannableStringBuilder = v4.a((String)localObject, getBaseContext());
      localTextView = this.f;
      if (localSpannableStringBuilder != null)
        break label1155;
    }
    label619: localTextView.setText((CharSequence)localObject);
    int i1;
    if (localArrayList == null)
    {
      i1 = localIntent.getIntExtra(Z[55], 0);
      label645: this.y = i1;
      this.U = localIntent.getIntExtra(Z[51], 0);
      g5.b(Z[57] + this.U);
      if ((localArrayList != null) || (this.y != -1));
    }
    int i4;
    for (int i3 = 0; ; i3 = i4)
    {
      if (i3 < this.x.size())
      {
        sz localsz1 = (sz)this.x.get(i3);
        if (localsz1.b.hashCode() == this.U)
        {
          this.y = (-1 + (this.x.size() - i3));
          if ((localsz1.l == 2) || (localsz1.l == 3))
          {
            this.D = true;
            if (!bool);
          }
        }
        else
        {
          i4 = i3 + 1;
          if (!bool)
            continue;
        }
      }
      if (this.y == -1)
        this.y = 0;
      B = getWindowManager().getDefaultDisplay();
      this.H.setOnClickListener(new ex(this));
      this.r = ((GalleryView)findViewById(2131558709));
      this.r.a(false);
      this.r.a(new fx(this));
      int i2 = 0;
      do
      {
        if (i2 >= this.x.size())
          break;
        TouchImageView localTouchImageView = new TouchImageView(this);
        localTouchImageView.setScaleType(ImageView.ScaleType.MATRIX);
        localTouchImageView.setTag(Integer.valueOf(i2));
        this.r.addView(localTouchImageView);
        i2++;
      }
      while (!bool);
      this.E = new ld(this);
      if (this.x.size() > 0)
      {
        this.i = ((TouchImageView)this.r.getChildAt(this.y));
        a(this.y, this.i);
        this.r.b(this.y);
        this.m.setOnClickListener(this.X);
        this.n.setOnClickListener(this.X);
        this.p.setOnClickListener(new hx(this));
        if (this.D)
          c(0);
      }
      this.K = new ix(this);
      this.m.setOnTouchListener(this.K);
      this.n.setOnTouchListener(this.K);
      this.m.setTag(Integer.valueOf(0));
      this.n.setTag(Integer.valueOf(1));
      this.o.setOnClickListener(new jx(this));
      this.Q = new md(this);
      this.Y.sendEmptyMessageDelayed(0, 50L);
      break;
      label1155: localObject = localSpannableStringBuilder;
      break label619;
      i1 = 0;
      break label645;
    }
  }

  public void onDestroy()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(Z[18]);
    if (this.r != null);
    int i2;
    for (int i1 = 0; ; i1 = i2)
      if (i1 < this.r.getChildCount())
      {
        ((TouchImageView)this.r.getChildAt(i1)).b();
        i2 = i1 + 1;
        if (!bool);
      }
      else
      {
        App.z();
        super.onDestroy();
        return;
      }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = DialogToastListActivity.f;
    int i5;
    int i6;
    int i2;
    int i3;
    switch (paramMenuItem.getItemId())
    {
    default:
      return true;
    case 1:
      if (getResources().getConfiguration().orientation == 1)
      {
        i5 = B.getHeight() - (int)getResources().getDimension(2131361813) - this.u.c();
        i6 = B.getWidth();
        if (!bool)
          break;
      }
      else
      {
        int i1 = B.getWidth() - (int)getResources().getDimension(2131361813) - this.u.c();
        i2 = B.getHeight();
        i3 = i1;
      }
      break;
    case 0:
    case 2:
    }
    for (int i4 = i2; ; i4 = i6)
    {
      Uri localUri2 = Uri.fromFile(((MediaData)d(this.y).t).file);
      g5.b(Z[6] + i3);
      Intent localIntent2 = new Intent(this, CropImage.class);
      localIntent2.putExtra(Z[8], i4);
      localIntent2.putExtra(Z[9], i3);
      localIntent2.putExtra(Z[11], 1);
      localIntent2.putExtra(Z[7], true);
      localIntent2.putExtra(Z[14], true);
      localIntent2.setData(localUri2);
      localIntent2.putExtra(Z[15], l.c());
      localIntent2.putExtra(Z[12], Bitmap.CompressFormat.JPEG.toString());
      startActivityForResult(localIntent2, 0);
      if (!bool)
        break;
      startActivityForResult(new Intent(Z[10], ContactsContract.Contacts.CONTENT_URI), 2);
      if (!bool)
        break;
      sz localsz = d(this.y);
      MediaData localMediaData = (MediaData)localsz.t;
      if (localMediaData.file == null)
        localMediaData.file = App.a(localsz);
      Uri localUri1 = Uri.fromFile(localMediaData.file);
      Intent localIntent1 = new Intent(Z[5]);
      switch (localsz.l)
      {
      default:
      case 1:
      }
      while (true)
      {
        try
        {
          startActivity(localIntent1);
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          App.a(App.Mb.getApplicationContext(), 2131296533, 0);
        }
        break;
        localIntent1.setDataAndType(localUri1, Z[13]);
      }
      i3 = i5;
    }
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    paramMenu.clear();
    if ((!this.i.i) && (!this.i.h))
    {
      a(paramMenu, 0, 2131296904, 2130838464);
      a(paramMenu, 1, 2131296903, 2130838484);
      a(paramMenu, 2, 2131296905, 2130838472);
    }
    return super.onPrepareOptionsMenu(paramMenu);
  }

  protected void onStop()
  {
    boolean bool = DialogToastListActivity.f;
    super.onStop();
    if ((this.l != null) && (this.l.isPlaying()))
    {
      this.l.stop();
      this.l.release();
      this.l = null;
      this.s.setVisibility(0);
    }
    g5.b(Z[16]);
    if (this.r != null);
    int i2;
    for (int i1 = 0; ; i1 = i2)
      if (i1 < this.r.getChildCount())
      {
        if ((i1 < -1 + this.y) || (i1 > 1 + this.y))
          ((TouchImageView)this.r.getChildAt(i1)).b();
        i2 = i1 + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }
}