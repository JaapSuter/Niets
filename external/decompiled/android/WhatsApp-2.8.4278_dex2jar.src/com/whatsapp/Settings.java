package com.whatsapp;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.text.SpannableStringBuilder;
import android.view.Display;
import android.view.WindowManager;
import com.whatsapp.wallpaper.CropImage;
import com.whatsapp.wallpaper.l;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;

public class Settings extends PreferenceActivity
  implements lr
{
  private static Display g;
  static final SimpleDateFormat l;
  static final SimpleDateFormat m;
  private static final String[] z;
  private Handler a = new Handler();
  private PackageManager b;
  private boolean c = false;
  private String d;
  private ed e;
  private CheckBoxPreference f;
  private String h = null;
  private HashMap<String, bq> i;
  private String j = null;
  private String k = null;
  Preference.OnPreferenceChangeListener n = new v2(this);
  Preference.OnPreferenceChangeListener o = new w2(this);
  Preference.OnPreferenceChangeListener p = new x2(this);

  // ERROR //
  static
  {
    // Byte code:
    //   0: bipush 69
    //   2: anewarray 39	java/lang/String
    //   5: astore_0
    //   6: ldc 41
    //   8: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   11: astore_1
    //   12: aload_1
    //   13: arraylength
    //   14: istore_2
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_2
    //   18: iload_3
    //   19: if_icmpgt +2875 -> 2894
    //   22: aload_0
    //   23: iconst_0
    //   24: new 39	java/lang/String
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 49	java/lang/String:<init>	([C)V
    //   32: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   35: aastore
    //   36: ldc 55
    //   38: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   41: astore 6
    //   43: aload 6
    //   45: arraylength
    //   46: istore 7
    //   48: iconst_0
    //   49: istore 8
    //   51: iload 7
    //   53: iload 8
    //   55: if_icmpgt +2924 -> 2979
    //   58: aload_0
    //   59: iconst_1
    //   60: new 39	java/lang/String
    //   63: dup
    //   64: aload 6
    //   66: invokespecial 49	java/lang/String:<init>	([C)V
    //   69: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   72: aastore
    //   73: ldc 57
    //   75: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   78: astore 11
    //   80: aload 11
    //   82: arraylength
    //   83: istore 12
    //   85: iconst_0
    //   86: istore 13
    //   88: iload 12
    //   90: iload 13
    //   92: if_icmpgt +2977 -> 3069
    //   95: aload_0
    //   96: iconst_2
    //   97: new 39	java/lang/String
    //   100: dup
    //   101: aload 11
    //   103: invokespecial 49	java/lang/String:<init>	([C)V
    //   106: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   109: aastore
    //   110: ldc 59
    //   112: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   115: astore 16
    //   117: aload 16
    //   119: arraylength
    //   120: istore 17
    //   122: iconst_0
    //   123: istore 18
    //   125: iload 17
    //   127: iload 18
    //   129: if_icmpgt +3032 -> 3161
    //   132: aload_0
    //   133: iconst_3
    //   134: new 39	java/lang/String
    //   137: dup
    //   138: aload 16
    //   140: invokespecial 49	java/lang/String:<init>	([C)V
    //   143: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   146: aastore
    //   147: ldc 61
    //   149: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   152: astore 21
    //   154: aload 21
    //   156: arraylength
    //   157: istore 22
    //   159: iconst_0
    //   160: istore 23
    //   162: iload 22
    //   164: iload 23
    //   166: if_icmpgt +3087 -> 3253
    //   169: aload_0
    //   170: iconst_4
    //   171: new 39	java/lang/String
    //   174: dup
    //   175: aload 21
    //   177: invokespecial 49	java/lang/String:<init>	([C)V
    //   180: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   183: aastore
    //   184: ldc 63
    //   186: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   189: astore 26
    //   191: aload 26
    //   193: arraylength
    //   194: istore 27
    //   196: iconst_0
    //   197: istore 28
    //   199: iload 27
    //   201: iload 28
    //   203: if_icmpgt +3142 -> 3345
    //   206: aload_0
    //   207: iconst_5
    //   208: new 39	java/lang/String
    //   211: dup
    //   212: aload 26
    //   214: invokespecial 49	java/lang/String:<init>	([C)V
    //   217: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   220: aastore
    //   221: ldc 65
    //   223: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   226: astore 31
    //   228: aload 31
    //   230: arraylength
    //   231: istore 32
    //   233: iconst_0
    //   234: istore 33
    //   236: iload 32
    //   238: iload 33
    //   240: if_icmpgt +3197 -> 3437
    //   243: aload_0
    //   244: bipush 6
    //   246: new 39	java/lang/String
    //   249: dup
    //   250: aload 31
    //   252: invokespecial 49	java/lang/String:<init>	([C)V
    //   255: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   258: aastore
    //   259: ldc 67
    //   261: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   264: astore 36
    //   266: aload 36
    //   268: arraylength
    //   269: istore 37
    //   271: iconst_0
    //   272: istore 38
    //   274: iload 37
    //   276: iload 38
    //   278: if_icmpgt +3251 -> 3529
    //   281: aload_0
    //   282: bipush 7
    //   284: new 39	java/lang/String
    //   287: dup
    //   288: aload 36
    //   290: invokespecial 49	java/lang/String:<init>	([C)V
    //   293: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   296: aastore
    //   297: ldc 69
    //   299: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   302: astore 41
    //   304: aload 41
    //   306: arraylength
    //   307: istore 42
    //   309: iconst_0
    //   310: istore 43
    //   312: iload 42
    //   314: iload 43
    //   316: if_icmpgt +3305 -> 3621
    //   319: aload_0
    //   320: bipush 8
    //   322: new 39	java/lang/String
    //   325: dup
    //   326: aload 41
    //   328: invokespecial 49	java/lang/String:<init>	([C)V
    //   331: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   334: aastore
    //   335: ldc 71
    //   337: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   340: astore 46
    //   342: aload 46
    //   344: arraylength
    //   345: istore 47
    //   347: iconst_0
    //   348: istore 48
    //   350: iload 47
    //   352: iload 48
    //   354: if_icmpgt +3359 -> 3713
    //   357: aload_0
    //   358: bipush 9
    //   360: new 39	java/lang/String
    //   363: dup
    //   364: aload 46
    //   366: invokespecial 49	java/lang/String:<init>	([C)V
    //   369: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   372: aastore
    //   373: ldc 73
    //   375: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   378: astore 51
    //   380: aload 51
    //   382: arraylength
    //   383: istore 52
    //   385: iconst_0
    //   386: istore 53
    //   388: iload 52
    //   390: iload 53
    //   392: if_icmpgt +3413 -> 3805
    //   395: aload_0
    //   396: bipush 10
    //   398: new 39	java/lang/String
    //   401: dup
    //   402: aload 51
    //   404: invokespecial 49	java/lang/String:<init>	([C)V
    //   407: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   410: aastore
    //   411: ldc 75
    //   413: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   416: astore 56
    //   418: aload 56
    //   420: arraylength
    //   421: istore 57
    //   423: iconst_0
    //   424: istore 58
    //   426: iload 57
    //   428: iload 58
    //   430: if_icmpgt +3467 -> 3897
    //   433: aload_0
    //   434: bipush 11
    //   436: new 39	java/lang/String
    //   439: dup
    //   440: aload 56
    //   442: invokespecial 49	java/lang/String:<init>	([C)V
    //   445: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   448: aastore
    //   449: ldc 77
    //   451: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   454: astore 61
    //   456: aload 61
    //   458: arraylength
    //   459: istore 62
    //   461: iconst_0
    //   462: istore 63
    //   464: iload 62
    //   466: iload 63
    //   468: if_icmpgt +3521 -> 3989
    //   471: aload_0
    //   472: bipush 12
    //   474: new 39	java/lang/String
    //   477: dup
    //   478: aload 61
    //   480: invokespecial 49	java/lang/String:<init>	([C)V
    //   483: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   486: aastore
    //   487: ldc 79
    //   489: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   492: astore 66
    //   494: aload 66
    //   496: arraylength
    //   497: istore 67
    //   499: iconst_0
    //   500: istore 68
    //   502: iload 67
    //   504: iload 68
    //   506: if_icmpgt +3575 -> 4081
    //   509: aload_0
    //   510: bipush 13
    //   512: new 39	java/lang/String
    //   515: dup
    //   516: aload 66
    //   518: invokespecial 49	java/lang/String:<init>	([C)V
    //   521: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   524: aastore
    //   525: ldc 81
    //   527: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   530: astore 71
    //   532: aload 71
    //   534: arraylength
    //   535: istore 72
    //   537: iconst_0
    //   538: istore 73
    //   540: iload 72
    //   542: iload 73
    //   544: if_icmpgt +3629 -> 4173
    //   547: aload_0
    //   548: bipush 14
    //   550: new 39	java/lang/String
    //   553: dup
    //   554: aload 71
    //   556: invokespecial 49	java/lang/String:<init>	([C)V
    //   559: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   562: aastore
    //   563: ldc 83
    //   565: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   568: astore 76
    //   570: aload 76
    //   572: arraylength
    //   573: istore 77
    //   575: iconst_0
    //   576: istore 78
    //   578: iload 77
    //   580: iload 78
    //   582: if_icmpgt +3683 -> 4265
    //   585: aload_0
    //   586: bipush 15
    //   588: new 39	java/lang/String
    //   591: dup
    //   592: aload 76
    //   594: invokespecial 49	java/lang/String:<init>	([C)V
    //   597: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   600: aastore
    //   601: ldc 85
    //   603: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   606: astore 81
    //   608: aload 81
    //   610: arraylength
    //   611: istore 82
    //   613: iconst_0
    //   614: istore 83
    //   616: iload 82
    //   618: iload 83
    //   620: if_icmpgt +3737 -> 4357
    //   623: aload_0
    //   624: bipush 16
    //   626: new 39	java/lang/String
    //   629: dup
    //   630: aload 81
    //   632: invokespecial 49	java/lang/String:<init>	([C)V
    //   635: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   638: aastore
    //   639: ldc 87
    //   641: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   644: astore 86
    //   646: aload 86
    //   648: arraylength
    //   649: istore 87
    //   651: iconst_0
    //   652: istore 88
    //   654: iload 87
    //   656: iload 88
    //   658: if_icmpgt +3791 -> 4449
    //   661: aload_0
    //   662: bipush 17
    //   664: new 39	java/lang/String
    //   667: dup
    //   668: aload 86
    //   670: invokespecial 49	java/lang/String:<init>	([C)V
    //   673: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   676: aastore
    //   677: ldc 89
    //   679: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   682: astore 91
    //   684: aload 91
    //   686: arraylength
    //   687: istore 92
    //   689: iconst_0
    //   690: istore 93
    //   692: iload 92
    //   694: iload 93
    //   696: if_icmpgt +3845 -> 4541
    //   699: aload_0
    //   700: bipush 18
    //   702: new 39	java/lang/String
    //   705: dup
    //   706: aload 91
    //   708: invokespecial 49	java/lang/String:<init>	([C)V
    //   711: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   714: aastore
    //   715: ldc 91
    //   717: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   720: astore 96
    //   722: aload 96
    //   724: arraylength
    //   725: istore 97
    //   727: iconst_0
    //   728: istore 98
    //   730: iload 97
    //   732: iload 98
    //   734: if_icmpgt +3899 -> 4633
    //   737: aload_0
    //   738: bipush 19
    //   740: new 39	java/lang/String
    //   743: dup
    //   744: aload 96
    //   746: invokespecial 49	java/lang/String:<init>	([C)V
    //   749: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   752: aastore
    //   753: ldc 93
    //   755: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   758: astore 101
    //   760: aload 101
    //   762: arraylength
    //   763: istore 102
    //   765: iconst_0
    //   766: istore 103
    //   768: iload 102
    //   770: iload 103
    //   772: if_icmpgt +3953 -> 4725
    //   775: aload_0
    //   776: bipush 20
    //   778: new 39	java/lang/String
    //   781: dup
    //   782: aload 101
    //   784: invokespecial 49	java/lang/String:<init>	([C)V
    //   787: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   790: aastore
    //   791: ldc 95
    //   793: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   796: astore 106
    //   798: aload 106
    //   800: arraylength
    //   801: istore 107
    //   803: iconst_0
    //   804: istore 108
    //   806: iload 107
    //   808: iload 108
    //   810: if_icmpgt +4007 -> 4817
    //   813: aload_0
    //   814: bipush 21
    //   816: new 39	java/lang/String
    //   819: dup
    //   820: aload 106
    //   822: invokespecial 49	java/lang/String:<init>	([C)V
    //   825: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   828: aastore
    //   829: ldc 97
    //   831: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   834: astore 111
    //   836: aload 111
    //   838: arraylength
    //   839: istore 112
    //   841: iconst_0
    //   842: istore 113
    //   844: iload 112
    //   846: iload 113
    //   848: if_icmpgt +4061 -> 4909
    //   851: aload_0
    //   852: bipush 22
    //   854: new 39	java/lang/String
    //   857: dup
    //   858: aload 111
    //   860: invokespecial 49	java/lang/String:<init>	([C)V
    //   863: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   866: aastore
    //   867: ldc 99
    //   869: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   872: astore 116
    //   874: aload 116
    //   876: arraylength
    //   877: istore 117
    //   879: iconst_0
    //   880: istore 118
    //   882: iload 117
    //   884: iload 118
    //   886: if_icmpgt +4115 -> 5001
    //   889: aload_0
    //   890: bipush 23
    //   892: new 39	java/lang/String
    //   895: dup
    //   896: aload 116
    //   898: invokespecial 49	java/lang/String:<init>	([C)V
    //   901: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   904: aastore
    //   905: ldc 101
    //   907: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   910: astore 121
    //   912: aload 121
    //   914: arraylength
    //   915: istore 122
    //   917: iconst_0
    //   918: istore 123
    //   920: iload 122
    //   922: iload 123
    //   924: if_icmpgt +4169 -> 5093
    //   927: aload_0
    //   928: bipush 24
    //   930: new 39	java/lang/String
    //   933: dup
    //   934: aload 121
    //   936: invokespecial 49	java/lang/String:<init>	([C)V
    //   939: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   942: aastore
    //   943: ldc 103
    //   945: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   948: astore 126
    //   950: aload 126
    //   952: arraylength
    //   953: istore 127
    //   955: iconst_0
    //   956: istore 128
    //   958: iload 127
    //   960: iload 128
    //   962: if_icmpgt +4223 -> 5185
    //   965: aload_0
    //   966: bipush 25
    //   968: new 39	java/lang/String
    //   971: dup
    //   972: aload 126
    //   974: invokespecial 49	java/lang/String:<init>	([C)V
    //   977: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   980: aastore
    //   981: ldc 105
    //   983: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   986: astore 131
    //   988: aload 131
    //   990: arraylength
    //   991: istore 132
    //   993: iconst_0
    //   994: istore 133
    //   996: iload 132
    //   998: iload 133
    //   1000: if_icmpgt +4277 -> 5277
    //   1003: aload_0
    //   1004: bipush 26
    //   1006: new 39	java/lang/String
    //   1009: dup
    //   1010: aload 131
    //   1012: invokespecial 49	java/lang/String:<init>	([C)V
    //   1015: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1018: aastore
    //   1019: ldc 107
    //   1021: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1024: astore 136
    //   1026: aload 136
    //   1028: arraylength
    //   1029: istore 137
    //   1031: iconst_0
    //   1032: istore 138
    //   1034: iload 137
    //   1036: iload 138
    //   1038: if_icmpgt +4331 -> 5369
    //   1041: aload_0
    //   1042: bipush 27
    //   1044: new 39	java/lang/String
    //   1047: dup
    //   1048: aload 136
    //   1050: invokespecial 49	java/lang/String:<init>	([C)V
    //   1053: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1056: aastore
    //   1057: ldc 109
    //   1059: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1062: astore 141
    //   1064: aload 141
    //   1066: arraylength
    //   1067: istore 142
    //   1069: iconst_0
    //   1070: istore 143
    //   1072: iload 142
    //   1074: iload 143
    //   1076: if_icmpgt +4385 -> 5461
    //   1079: aload_0
    //   1080: bipush 28
    //   1082: new 39	java/lang/String
    //   1085: dup
    //   1086: aload 141
    //   1088: invokespecial 49	java/lang/String:<init>	([C)V
    //   1091: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1094: aastore
    //   1095: ldc 111
    //   1097: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1100: astore 146
    //   1102: aload 146
    //   1104: arraylength
    //   1105: istore 147
    //   1107: iconst_0
    //   1108: istore 148
    //   1110: iload 147
    //   1112: iload 148
    //   1114: if_icmpgt +4439 -> 5553
    //   1117: aload_0
    //   1118: bipush 29
    //   1120: new 39	java/lang/String
    //   1123: dup
    //   1124: aload 146
    //   1126: invokespecial 49	java/lang/String:<init>	([C)V
    //   1129: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1132: aastore
    //   1133: ldc 113
    //   1135: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1138: astore 151
    //   1140: aload 151
    //   1142: arraylength
    //   1143: istore 152
    //   1145: iconst_0
    //   1146: istore 153
    //   1148: iload 152
    //   1150: iload 153
    //   1152: if_icmpgt +4493 -> 5645
    //   1155: aload_0
    //   1156: bipush 30
    //   1158: new 39	java/lang/String
    //   1161: dup
    //   1162: aload 151
    //   1164: invokespecial 49	java/lang/String:<init>	([C)V
    //   1167: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1170: aastore
    //   1171: ldc 115
    //   1173: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1176: astore 156
    //   1178: aload 156
    //   1180: arraylength
    //   1181: istore 157
    //   1183: iconst_0
    //   1184: istore 158
    //   1186: iload 157
    //   1188: iload 158
    //   1190: if_icmpgt +4547 -> 5737
    //   1193: aload_0
    //   1194: bipush 31
    //   1196: new 39	java/lang/String
    //   1199: dup
    //   1200: aload 156
    //   1202: invokespecial 49	java/lang/String:<init>	([C)V
    //   1205: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1208: aastore
    //   1209: ldc 117
    //   1211: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1214: astore 161
    //   1216: aload 161
    //   1218: arraylength
    //   1219: istore 162
    //   1221: iconst_0
    //   1222: istore 163
    //   1224: iload 162
    //   1226: iload 163
    //   1228: if_icmpgt +4601 -> 5829
    //   1231: aload_0
    //   1232: bipush 32
    //   1234: new 39	java/lang/String
    //   1237: dup
    //   1238: aload 161
    //   1240: invokespecial 49	java/lang/String:<init>	([C)V
    //   1243: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1246: aastore
    //   1247: ldc 119
    //   1249: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1252: astore 166
    //   1254: aload 166
    //   1256: arraylength
    //   1257: istore 167
    //   1259: iconst_0
    //   1260: istore 168
    //   1262: iload 167
    //   1264: iload 168
    //   1266: if_icmpgt +4655 -> 5921
    //   1269: aload_0
    //   1270: bipush 33
    //   1272: new 39	java/lang/String
    //   1275: dup
    //   1276: aload 166
    //   1278: invokespecial 49	java/lang/String:<init>	([C)V
    //   1281: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1284: aastore
    //   1285: ldc 121
    //   1287: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1290: astore 171
    //   1292: aload 171
    //   1294: arraylength
    //   1295: istore 172
    //   1297: iconst_0
    //   1298: istore 173
    //   1300: iload 172
    //   1302: iload 173
    //   1304: if_icmpgt +4709 -> 6013
    //   1307: aload_0
    //   1308: bipush 34
    //   1310: new 39	java/lang/String
    //   1313: dup
    //   1314: aload 171
    //   1316: invokespecial 49	java/lang/String:<init>	([C)V
    //   1319: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1322: aastore
    //   1323: ldc 123
    //   1325: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1328: astore 176
    //   1330: aload 176
    //   1332: arraylength
    //   1333: istore 177
    //   1335: iconst_0
    //   1336: istore 178
    //   1338: iload 177
    //   1340: iload 178
    //   1342: if_icmpgt +4763 -> 6105
    //   1345: aload_0
    //   1346: bipush 35
    //   1348: new 39	java/lang/String
    //   1351: dup
    //   1352: aload 176
    //   1354: invokespecial 49	java/lang/String:<init>	([C)V
    //   1357: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1360: aastore
    //   1361: ldc 125
    //   1363: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1366: astore 181
    //   1368: aload 181
    //   1370: arraylength
    //   1371: istore 182
    //   1373: iconst_0
    //   1374: istore 183
    //   1376: iload 182
    //   1378: iload 183
    //   1380: if_icmpgt +4817 -> 6197
    //   1383: aload_0
    //   1384: bipush 36
    //   1386: new 39	java/lang/String
    //   1389: dup
    //   1390: aload 181
    //   1392: invokespecial 49	java/lang/String:<init>	([C)V
    //   1395: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1398: aastore
    //   1399: ldc 127
    //   1401: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1404: astore 186
    //   1406: aload 186
    //   1408: arraylength
    //   1409: istore 187
    //   1411: iconst_0
    //   1412: istore 188
    //   1414: iload 187
    //   1416: iload 188
    //   1418: if_icmpgt +4871 -> 6289
    //   1421: aload_0
    //   1422: bipush 37
    //   1424: new 39	java/lang/String
    //   1427: dup
    //   1428: aload 186
    //   1430: invokespecial 49	java/lang/String:<init>	([C)V
    //   1433: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1436: aastore
    //   1437: ldc 129
    //   1439: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1442: astore 191
    //   1444: aload 191
    //   1446: arraylength
    //   1447: istore 192
    //   1449: iconst_0
    //   1450: istore 193
    //   1452: iload 192
    //   1454: iload 193
    //   1456: if_icmpgt +4925 -> 6381
    //   1459: aload_0
    //   1460: bipush 38
    //   1462: new 39	java/lang/String
    //   1465: dup
    //   1466: aload 191
    //   1468: invokespecial 49	java/lang/String:<init>	([C)V
    //   1471: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1474: aastore
    //   1475: ldc 131
    //   1477: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1480: astore 196
    //   1482: aload 196
    //   1484: arraylength
    //   1485: istore 197
    //   1487: iconst_0
    //   1488: istore 198
    //   1490: iload 197
    //   1492: iload 198
    //   1494: if_icmpgt +4979 -> 6473
    //   1497: aload_0
    //   1498: bipush 39
    //   1500: new 39	java/lang/String
    //   1503: dup
    //   1504: aload 196
    //   1506: invokespecial 49	java/lang/String:<init>	([C)V
    //   1509: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1512: aastore
    //   1513: ldc 133
    //   1515: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1518: astore 201
    //   1520: aload 201
    //   1522: arraylength
    //   1523: istore 202
    //   1525: iconst_0
    //   1526: istore 203
    //   1528: iload 202
    //   1530: iload 203
    //   1532: if_icmpgt +5033 -> 6565
    //   1535: aload_0
    //   1536: bipush 40
    //   1538: new 39	java/lang/String
    //   1541: dup
    //   1542: aload 201
    //   1544: invokespecial 49	java/lang/String:<init>	([C)V
    //   1547: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1550: aastore
    //   1551: ldc 135
    //   1553: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1556: astore 206
    //   1558: aload 206
    //   1560: arraylength
    //   1561: istore 207
    //   1563: iconst_0
    //   1564: istore 208
    //   1566: iload 207
    //   1568: iload 208
    //   1570: if_icmpgt +5087 -> 6657
    //   1573: aload_0
    //   1574: bipush 41
    //   1576: new 39	java/lang/String
    //   1579: dup
    //   1580: aload 206
    //   1582: invokespecial 49	java/lang/String:<init>	([C)V
    //   1585: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1588: aastore
    //   1589: ldc 137
    //   1591: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1594: astore 211
    //   1596: aload 211
    //   1598: arraylength
    //   1599: istore 212
    //   1601: iconst_0
    //   1602: istore 213
    //   1604: iload 212
    //   1606: iload 213
    //   1608: if_icmpgt +5141 -> 6749
    //   1611: aload_0
    //   1612: bipush 42
    //   1614: new 39	java/lang/String
    //   1617: dup
    //   1618: aload 211
    //   1620: invokespecial 49	java/lang/String:<init>	([C)V
    //   1623: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1626: aastore
    //   1627: ldc 139
    //   1629: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1632: astore 216
    //   1634: aload 216
    //   1636: arraylength
    //   1637: istore 217
    //   1639: iconst_0
    //   1640: istore 218
    //   1642: iload 217
    //   1644: iload 218
    //   1646: if_icmpgt +5195 -> 6841
    //   1649: aload_0
    //   1650: bipush 43
    //   1652: new 39	java/lang/String
    //   1655: dup
    //   1656: aload 216
    //   1658: invokespecial 49	java/lang/String:<init>	([C)V
    //   1661: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1664: aastore
    //   1665: ldc 141
    //   1667: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1670: astore 221
    //   1672: aload 221
    //   1674: arraylength
    //   1675: istore 222
    //   1677: iconst_0
    //   1678: istore 223
    //   1680: iload 222
    //   1682: iload 223
    //   1684: if_icmpgt +5249 -> 6933
    //   1687: aload_0
    //   1688: bipush 44
    //   1690: new 39	java/lang/String
    //   1693: dup
    //   1694: aload 221
    //   1696: invokespecial 49	java/lang/String:<init>	([C)V
    //   1699: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1702: aastore
    //   1703: ldc 143
    //   1705: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1708: astore 226
    //   1710: aload 226
    //   1712: arraylength
    //   1713: istore 227
    //   1715: iconst_0
    //   1716: istore 228
    //   1718: iload 227
    //   1720: iload 228
    //   1722: if_icmpgt +5303 -> 7025
    //   1725: aload_0
    //   1726: bipush 45
    //   1728: new 39	java/lang/String
    //   1731: dup
    //   1732: aload 226
    //   1734: invokespecial 49	java/lang/String:<init>	([C)V
    //   1737: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1740: aastore
    //   1741: ldc 145
    //   1743: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1746: astore 231
    //   1748: aload 231
    //   1750: arraylength
    //   1751: istore 232
    //   1753: iconst_0
    //   1754: istore 233
    //   1756: iload 232
    //   1758: iload 233
    //   1760: if_icmpgt +5357 -> 7117
    //   1763: aload_0
    //   1764: bipush 46
    //   1766: new 39	java/lang/String
    //   1769: dup
    //   1770: aload 231
    //   1772: invokespecial 49	java/lang/String:<init>	([C)V
    //   1775: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1778: aastore
    //   1779: ldc 147
    //   1781: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1784: astore 236
    //   1786: aload 236
    //   1788: arraylength
    //   1789: istore 237
    //   1791: iconst_0
    //   1792: istore 238
    //   1794: iload 237
    //   1796: iload 238
    //   1798: if_icmpgt +5411 -> 7209
    //   1801: aload_0
    //   1802: bipush 47
    //   1804: new 39	java/lang/String
    //   1807: dup
    //   1808: aload 236
    //   1810: invokespecial 49	java/lang/String:<init>	([C)V
    //   1813: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1816: aastore
    //   1817: ldc 149
    //   1819: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1822: astore 241
    //   1824: aload 241
    //   1826: arraylength
    //   1827: istore 242
    //   1829: iconst_0
    //   1830: istore 243
    //   1832: iload 242
    //   1834: iload 243
    //   1836: if_icmpgt +5465 -> 7301
    //   1839: aload_0
    //   1840: bipush 48
    //   1842: new 39	java/lang/String
    //   1845: dup
    //   1846: aload 241
    //   1848: invokespecial 49	java/lang/String:<init>	([C)V
    //   1851: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1854: aastore
    //   1855: ldc 151
    //   1857: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1860: astore 246
    //   1862: aload 246
    //   1864: arraylength
    //   1865: istore 247
    //   1867: iconst_0
    //   1868: istore 248
    //   1870: iload 247
    //   1872: iload 248
    //   1874: if_icmpgt +5519 -> 7393
    //   1877: aload_0
    //   1878: bipush 49
    //   1880: new 39	java/lang/String
    //   1883: dup
    //   1884: aload 246
    //   1886: invokespecial 49	java/lang/String:<init>	([C)V
    //   1889: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1892: aastore
    //   1893: ldc 153
    //   1895: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1898: astore 251
    //   1900: aload 251
    //   1902: arraylength
    //   1903: istore 252
    //   1905: iconst_0
    //   1906: istore 253
    //   1908: iload 252
    //   1910: iload 253
    //   1912: if_icmpgt +5573 -> 7485
    //   1915: aload_0
    //   1916: bipush 50
    //   1918: new 39	java/lang/String
    //   1921: dup
    //   1922: aload 251
    //   1924: invokespecial 49	java/lang/String:<init>	([C)V
    //   1927: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1930: aastore
    //   1931: ldc 155
    //   1933: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1936: wide
    //   1940: wide
    //   1944: arraylength
    //   1945: wide
    //   1949: iconst_0
    //   1950: wide
    //   1954: wide
    //   1958: wide
    //   1962: if_icmpgt +5615 -> 7577
    //   1965: aload_0
    //   1966: bipush 51
    //   1968: new 39	java/lang/String
    //   1971: dup
    //   1972: wide
    //   1976: invokespecial 49	java/lang/String:<init>	([C)V
    //   1979: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   1982: aastore
    //   1983: ldc 157
    //   1985: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   1988: wide
    //   1992: wide
    //   1996: arraylength
    //   1997: wide
    //   2001: iconst_0
    //   2002: wide
    //   2006: wide
    //   2010: wide
    //   2014: if_icmpgt +5684 -> 7698
    //   2017: aload_0
    //   2018: bipush 52
    //   2020: new 39	java/lang/String
    //   2023: dup
    //   2024: wide
    //   2028: invokespecial 49	java/lang/String:<init>	([C)V
    //   2031: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2034: aastore
    //   2035: ldc 159
    //   2037: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2040: wide
    //   2044: wide
    //   2048: arraylength
    //   2049: wide
    //   2053: iconst_0
    //   2054: wide
    //   2058: wide
    //   2062: wide
    //   2066: if_icmpgt +5752 -> 7818
    //   2069: aload_0
    //   2070: bipush 53
    //   2072: new 39	java/lang/String
    //   2075: dup
    //   2076: wide
    //   2080: invokespecial 49	java/lang/String:<init>	([C)V
    //   2083: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2086: aastore
    //   2087: ldc 161
    //   2089: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2092: wide
    //   2096: wide
    //   2100: arraylength
    //   2101: wide
    //   2105: iconst_0
    //   2106: wide
    //   2110: wide
    //   2114: wide
    //   2118: if_icmpgt +5820 -> 7938
    //   2121: aload_0
    //   2122: bipush 54
    //   2124: new 39	java/lang/String
    //   2127: dup
    //   2128: wide
    //   2132: invokespecial 49	java/lang/String:<init>	([C)V
    //   2135: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2138: aastore
    //   2139: ldc 163
    //   2141: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2144: wide
    //   2148: wide
    //   2152: arraylength
    //   2153: wide
    //   2157: iconst_0
    //   2158: wide
    //   2162: wide
    //   2166: wide
    //   2170: if_icmpgt +5888 -> 8058
    //   2173: aload_0
    //   2174: bipush 55
    //   2176: new 39	java/lang/String
    //   2179: dup
    //   2180: wide
    //   2184: invokespecial 49	java/lang/String:<init>	([C)V
    //   2187: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2190: aastore
    //   2191: ldc 165
    //   2193: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2196: wide
    //   2200: wide
    //   2204: arraylength
    //   2205: wide
    //   2209: iconst_0
    //   2210: wide
    //   2214: wide
    //   2218: wide
    //   2222: if_icmpgt +5956 -> 8178
    //   2225: aload_0
    //   2226: bipush 56
    //   2228: new 39	java/lang/String
    //   2231: dup
    //   2232: wide
    //   2236: invokespecial 49	java/lang/String:<init>	([C)V
    //   2239: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2242: aastore
    //   2243: ldc 167
    //   2245: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2248: wide
    //   2252: wide
    //   2256: arraylength
    //   2257: wide
    //   2261: iconst_0
    //   2262: wide
    //   2266: wide
    //   2270: wide
    //   2274: if_icmpgt +6024 -> 8298
    //   2277: aload_0
    //   2278: bipush 57
    //   2280: new 39	java/lang/String
    //   2283: dup
    //   2284: wide
    //   2288: invokespecial 49	java/lang/String:<init>	([C)V
    //   2291: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2294: aastore
    //   2295: ldc 169
    //   2297: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2300: wide
    //   2304: wide
    //   2308: arraylength
    //   2309: wide
    //   2313: iconst_0
    //   2314: wide
    //   2318: wide
    //   2322: wide
    //   2326: if_icmpgt +6092 -> 8418
    //   2329: aload_0
    //   2330: bipush 58
    //   2332: new 39	java/lang/String
    //   2335: dup
    //   2336: wide
    //   2340: invokespecial 49	java/lang/String:<init>	([C)V
    //   2343: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2346: aastore
    //   2347: ldc 171
    //   2349: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2352: wide
    //   2356: wide
    //   2360: arraylength
    //   2361: wide
    //   2365: iconst_0
    //   2366: wide
    //   2370: wide
    //   2374: wide
    //   2378: if_icmpgt +6160 -> 8538
    //   2381: aload_0
    //   2382: bipush 59
    //   2384: new 39	java/lang/String
    //   2387: dup
    //   2388: wide
    //   2392: invokespecial 49	java/lang/String:<init>	([C)V
    //   2395: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2398: aastore
    //   2399: ldc 173
    //   2401: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2404: wide
    //   2408: wide
    //   2412: arraylength
    //   2413: wide
    //   2417: iconst_0
    //   2418: wide
    //   2422: wide
    //   2426: wide
    //   2430: if_icmpgt +6228 -> 8658
    //   2433: aload_0
    //   2434: bipush 60
    //   2436: new 39	java/lang/String
    //   2439: dup
    //   2440: wide
    //   2444: invokespecial 49	java/lang/String:<init>	([C)V
    //   2447: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2450: aastore
    //   2451: ldc 175
    //   2453: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2456: wide
    //   2460: wide
    //   2464: arraylength
    //   2465: wide
    //   2469: iconst_0
    //   2470: wide
    //   2474: wide
    //   2478: wide
    //   2482: if_icmpgt +6296 -> 8778
    //   2485: aload_0
    //   2486: bipush 61
    //   2488: new 39	java/lang/String
    //   2491: dup
    //   2492: wide
    //   2496: invokespecial 49	java/lang/String:<init>	([C)V
    //   2499: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2502: aastore
    //   2503: ldc 177
    //   2505: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2508: wide
    //   2512: wide
    //   2516: arraylength
    //   2517: wide
    //   2521: iconst_0
    //   2522: wide
    //   2526: wide
    //   2530: wide
    //   2534: if_icmpgt +6364 -> 8898
    //   2537: aload_0
    //   2538: bipush 62
    //   2540: new 39	java/lang/String
    //   2543: dup
    //   2544: wide
    //   2548: invokespecial 49	java/lang/String:<init>	([C)V
    //   2551: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2554: aastore
    //   2555: ldc 179
    //   2557: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2560: wide
    //   2564: wide
    //   2568: arraylength
    //   2569: wide
    //   2573: iconst_0
    //   2574: wide
    //   2578: wide
    //   2582: wide
    //   2586: if_icmpgt +6432 -> 9018
    //   2589: aload_0
    //   2590: bipush 63
    //   2592: new 39	java/lang/String
    //   2595: dup
    //   2596: wide
    //   2600: invokespecial 49	java/lang/String:<init>	([C)V
    //   2603: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2606: aastore
    //   2607: ldc 181
    //   2609: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2612: wide
    //   2616: wide
    //   2620: arraylength
    //   2621: wide
    //   2625: iconst_0
    //   2626: wide
    //   2630: wide
    //   2634: wide
    //   2638: if_icmpgt +6500 -> 9138
    //   2641: aload_0
    //   2642: bipush 64
    //   2644: new 39	java/lang/String
    //   2647: dup
    //   2648: wide
    //   2652: invokespecial 49	java/lang/String:<init>	([C)V
    //   2655: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2658: aastore
    //   2659: ldc 183
    //   2661: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2664: wide
    //   2668: wide
    //   2672: arraylength
    //   2673: wide
    //   2677: iconst_0
    //   2678: wide
    //   2682: wide
    //   2686: wide
    //   2690: if_icmpgt +6568 -> 9258
    //   2693: aload_0
    //   2694: bipush 65
    //   2696: new 39	java/lang/String
    //   2699: dup
    //   2700: wide
    //   2704: invokespecial 49	java/lang/String:<init>	([C)V
    //   2707: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2710: aastore
    //   2711: ldc 185
    //   2713: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2716: wide
    //   2720: wide
    //   2724: arraylength
    //   2725: wide
    //   2729: iconst_0
    //   2730: wide
    //   2734: wide
    //   2738: wide
    //   2742: if_icmpgt +6636 -> 9378
    //   2745: aload_0
    //   2746: bipush 66
    //   2748: new 39	java/lang/String
    //   2751: dup
    //   2752: wide
    //   2756: invokespecial 49	java/lang/String:<init>	([C)V
    //   2759: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2762: aastore
    //   2763: ldc 187
    //   2765: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2768: wide
    //   2772: wide
    //   2776: arraylength
    //   2777: wide
    //   2781: iconst_0
    //   2782: wide
    //   2786: wide
    //   2790: wide
    //   2794: if_icmpgt +6704 -> 9498
    //   2797: aload_0
    //   2798: bipush 67
    //   2800: new 39	java/lang/String
    //   2803: dup
    //   2804: wide
    //   2808: invokespecial 49	java/lang/String:<init>	([C)V
    //   2811: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2814: aastore
    //   2815: ldc 189
    //   2817: invokevirtual 45	java/lang/String:toCharArray	()[C
    //   2820: wide
    //   2824: wide
    //   2828: arraylength
    //   2829: wide
    //   2833: iconst_0
    //   2834: wide
    //   2838: wide
    //   2842: wide
    //   2846: if_icmpgt +6772 -> 9618
    //   2849: aload_0
    //   2850: bipush 68
    //   2852: new 39	java/lang/String
    //   2855: dup
    //   2856: wide
    //   2860: invokespecial 49	java/lang/String:<init>	([C)V
    //   2863: invokevirtual 53	java/lang/String:intern	()Ljava/lang/String;
    //   2866: aastore
    //   2867: aload_0
    //   2868: putstatic 191	com/whatsapp/Settings:z	[Ljava/lang/String;
    //   2871: new 193	java/text/SimpleDateFormat
    //   2874: dup
    //   2875: getstatic 191	com/whatsapp/Settings:z	[Ljava/lang/String;
    //   2878: bipush 68
    //   2880: aaload
    //   2881: invokespecial 196	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   2884: putstatic 198	com/whatsapp/Settings:l	Ljava/text/SimpleDateFormat;
    //   2887: getstatic 198	com/whatsapp/Settings:l	Ljava/text/SimpleDateFormat;
    //   2890: putstatic 200	com/whatsapp/Settings:m	Ljava/text/SimpleDateFormat;
    //   2893: return
    //   2894: aload_1
    //   2895: iload_3
    //   2896: caload
    //   2897: istore 4
    //   2899: iload_3
    //   2900: iconst_5
    //   2901: irem
    //   2902: tableswitch	default:+30 -> 2932, 0:+49->2951, 1:+56->2958, 2:+63->2965, 3:+70->2972
    //   2933: ldiv
    //   2934: istore 5
    //   2936: aload_1
    //   2937: iload_3
    //   2938: iload 5
    //   2940: iload 4
    //   2942: ixor
    //   2943: i2c
    //   2944: castore
    //   2945: iinc 3 1
    //   2948: goto -2931 -> 17
    //   2951: bipush 104
    //   2953: istore 5
    //   2955: goto -19 -> 2936
    //   2958: bipush 113
    //   2960: istore 5
    //   2962: goto -26 -> 2936
    //   2965: bipush 24
    //   2967: istore 5
    //   2969: goto -33 -> 2936
    //   2972: bipush 24
    //   2974: istore 5
    //   2976: goto -40 -> 2936
    //   2979: aload 6
    //   2981: iload 8
    //   2983: caload
    //   2984: istore 9
    //   2986: iload 8
    //   2988: iconst_5
    //   2989: irem
    //   2990: tableswitch	default:+30 -> 3020, 0:+51->3041, 1:+58->3048, 2:+65->3055, 3:+72->3062
    //   3021: ldiv
    //   3022: istore 10
    //   3024: aload 6
    //   3026: iload 8
    //   3028: iload 10
    //   3030: iload 9
    //   3032: ixor
    //   3033: i2c
    //   3034: castore
    //   3035: iinc 8 1
    //   3038: goto -2987 -> 51
    //   3041: bipush 104
    //   3043: istore 10
    //   3045: goto -21 -> 3024
    //   3048: bipush 113
    //   3050: istore 10
    //   3052: goto -28 -> 3024
    //   3055: bipush 24
    //   3057: istore 10
    //   3059: goto -35 -> 3024
    //   3062: bipush 24
    //   3064: istore 10
    //   3066: goto -42 -> 3024
    //   3069: aload 11
    //   3071: iload 13
    //   3073: caload
    //   3074: istore 14
    //   3076: iload 13
    //   3078: iconst_5
    //   3079: irem
    //   3080: tableswitch	default:+32 -> 3112, 0:+53->3133, 1:+60->3140, 2:+67->3147, 3:+74->3154
    //   3113: ldiv
    //   3114: istore 15
    //   3116: aload 11
    //   3118: iload 13
    //   3120: iload 15
    //   3122: iload 14
    //   3124: ixor
    //   3125: i2c
    //   3126: castore
    //   3127: iinc 13 1
    //   3130: goto -3042 -> 88
    //   3133: bipush 104
    //   3135: istore 15
    //   3137: goto -21 -> 3116
    //   3140: bipush 113
    //   3142: istore 15
    //   3144: goto -28 -> 3116
    //   3147: bipush 24
    //   3149: istore 15
    //   3151: goto -35 -> 3116
    //   3154: bipush 24
    //   3156: istore 15
    //   3158: goto -42 -> 3116
    //   3161: aload 16
    //   3163: iload 18
    //   3165: caload
    //   3166: istore 19
    //   3168: iload 18
    //   3170: iconst_5
    //   3171: irem
    //   3172: tableswitch	default:+32 -> 3204, 0:+53->3225, 1:+60->3232, 2:+67->3239, 3:+74->3246
    //   3205: ldiv
    //   3206: istore 20
    //   3208: aload 16
    //   3210: iload 18
    //   3212: iload 20
    //   3214: iload 19
    //   3216: ixor
    //   3217: i2c
    //   3218: castore
    //   3219: iinc 18 1
    //   3222: goto -3097 -> 125
    //   3225: bipush 104
    //   3227: istore 20
    //   3229: goto -21 -> 3208
    //   3232: bipush 113
    //   3234: istore 20
    //   3236: goto -28 -> 3208
    //   3239: bipush 24
    //   3241: istore 20
    //   3243: goto -35 -> 3208
    //   3246: bipush 24
    //   3248: istore 20
    //   3250: goto -42 -> 3208
    //   3253: aload 21
    //   3255: iload 23
    //   3257: caload
    //   3258: istore 24
    //   3260: iload 23
    //   3262: iconst_5
    //   3263: irem
    //   3264: tableswitch	default:+32 -> 3296, 0:+53->3317, 1:+60->3324, 2:+67->3331, 3:+74->3338
    //   3297: ldiv
    //   3298: istore 25
    //   3300: aload 21
    //   3302: iload 23
    //   3304: iload 25
    //   3306: iload 24
    //   3308: ixor
    //   3309: i2c
    //   3310: castore
    //   3311: iinc 23 1
    //   3314: goto -3152 -> 162
    //   3317: bipush 104
    //   3319: istore 25
    //   3321: goto -21 -> 3300
    //   3324: bipush 113
    //   3326: istore 25
    //   3328: goto -28 -> 3300
    //   3331: bipush 24
    //   3333: istore 25
    //   3335: goto -35 -> 3300
    //   3338: bipush 24
    //   3340: istore 25
    //   3342: goto -42 -> 3300
    //   3345: aload 26
    //   3347: iload 28
    //   3349: caload
    //   3350: istore 29
    //   3352: iload 28
    //   3354: iconst_5
    //   3355: irem
    //   3356: tableswitch	default:+32 -> 3388, 0:+53->3409, 1:+60->3416, 2:+67->3423, 3:+74->3430
    //   3389: ldiv
    //   3390: istore 30
    //   3392: aload 26
    //   3394: iload 28
    //   3396: iload 30
    //   3398: iload 29
    //   3400: ixor
    //   3401: i2c
    //   3402: castore
    //   3403: iinc 28 1
    //   3406: goto -3207 -> 199
    //   3409: bipush 104
    //   3411: istore 30
    //   3413: goto -21 -> 3392
    //   3416: bipush 113
    //   3418: istore 30
    //   3420: goto -28 -> 3392
    //   3423: bipush 24
    //   3425: istore 30
    //   3427: goto -35 -> 3392
    //   3430: bipush 24
    //   3432: istore 30
    //   3434: goto -42 -> 3392
    //   3437: aload 31
    //   3439: iload 33
    //   3441: caload
    //   3442: istore 34
    //   3444: iload 33
    //   3446: iconst_5
    //   3447: irem
    //   3448: tableswitch	default:+32 -> 3480, 0:+53->3501, 1:+60->3508, 2:+67->3515, 3:+74->3522
    //   3481: ldiv
    //   3482: istore 35
    //   3484: aload 31
    //   3486: iload 33
    //   3488: iload 35
    //   3490: iload 34
    //   3492: ixor
    //   3493: i2c
    //   3494: castore
    //   3495: iinc 33 1
    //   3498: goto -3262 -> 236
    //   3501: bipush 104
    //   3503: istore 35
    //   3505: goto -21 -> 3484
    //   3508: bipush 113
    //   3510: istore 35
    //   3512: goto -28 -> 3484
    //   3515: bipush 24
    //   3517: istore 35
    //   3519: goto -35 -> 3484
    //   3522: bipush 24
    //   3524: istore 35
    //   3526: goto -42 -> 3484
    //   3529: aload 36
    //   3531: iload 38
    //   3533: caload
    //   3534: istore 39
    //   3536: iload 38
    //   3538: iconst_5
    //   3539: irem
    //   3540: tableswitch	default:+32 -> 3572, 0:+53->3593, 1:+60->3600, 2:+67->3607, 3:+74->3614
    //   3573: ldiv
    //   3574: istore 40
    //   3576: aload 36
    //   3578: iload 38
    //   3580: iload 40
    //   3582: iload 39
    //   3584: ixor
    //   3585: i2c
    //   3586: castore
    //   3587: iinc 38 1
    //   3590: goto -3316 -> 274
    //   3593: bipush 104
    //   3595: istore 40
    //   3597: goto -21 -> 3576
    //   3600: bipush 113
    //   3602: istore 40
    //   3604: goto -28 -> 3576
    //   3607: bipush 24
    //   3609: istore 40
    //   3611: goto -35 -> 3576
    //   3614: bipush 24
    //   3616: istore 40
    //   3618: goto -42 -> 3576
    //   3621: aload 41
    //   3623: iload 43
    //   3625: caload
    //   3626: istore 44
    //   3628: iload 43
    //   3630: iconst_5
    //   3631: irem
    //   3632: tableswitch	default:+32 -> 3664, 0:+53->3685, 1:+60->3692, 2:+67->3699, 3:+74->3706
    //   3665: ldiv
    //   3666: istore 45
    //   3668: aload 41
    //   3670: iload 43
    //   3672: iload 45
    //   3674: iload 44
    //   3676: ixor
    //   3677: i2c
    //   3678: castore
    //   3679: iinc 43 1
    //   3682: goto -3370 -> 312
    //   3685: bipush 104
    //   3687: istore 45
    //   3689: goto -21 -> 3668
    //   3692: bipush 113
    //   3694: istore 45
    //   3696: goto -28 -> 3668
    //   3699: bipush 24
    //   3701: istore 45
    //   3703: goto -35 -> 3668
    //   3706: bipush 24
    //   3708: istore 45
    //   3710: goto -42 -> 3668
    //   3713: aload 46
    //   3715: iload 48
    //   3717: caload
    //   3718: istore 49
    //   3720: iload 48
    //   3722: iconst_5
    //   3723: irem
    //   3724: tableswitch	default:+32 -> 3756, 0:+53->3777, 1:+60->3784, 2:+67->3791, 3:+74->3798
    //   3757: ldiv
    //   3758: istore 50
    //   3760: aload 46
    //   3762: iload 48
    //   3764: iload 50
    //   3766: iload 49
    //   3768: ixor
    //   3769: i2c
    //   3770: castore
    //   3771: iinc 48 1
    //   3774: goto -3424 -> 350
    //   3777: bipush 104
    //   3779: istore 50
    //   3781: goto -21 -> 3760
    //   3784: bipush 113
    //   3786: istore 50
    //   3788: goto -28 -> 3760
    //   3791: bipush 24
    //   3793: istore 50
    //   3795: goto -35 -> 3760
    //   3798: bipush 24
    //   3800: istore 50
    //   3802: goto -42 -> 3760
    //   3805: aload 51
    //   3807: iload 53
    //   3809: caload
    //   3810: istore 54
    //   3812: iload 53
    //   3814: iconst_5
    //   3815: irem
    //   3816: tableswitch	default:+32 -> 3848, 0:+53->3869, 1:+60->3876, 2:+67->3883, 3:+74->3890
    //   3849: ldiv
    //   3850: istore 55
    //   3852: aload 51
    //   3854: iload 53
    //   3856: iload 55
    //   3858: iload 54
    //   3860: ixor
    //   3861: i2c
    //   3862: castore
    //   3863: iinc 53 1
    //   3866: goto -3478 -> 388
    //   3869: bipush 104
    //   3871: istore 55
    //   3873: goto -21 -> 3852
    //   3876: bipush 113
    //   3878: istore 55
    //   3880: goto -28 -> 3852
    //   3883: bipush 24
    //   3885: istore 55
    //   3887: goto -35 -> 3852
    //   3890: bipush 24
    //   3892: istore 55
    //   3894: goto -42 -> 3852
    //   3897: aload 56
    //   3899: iload 58
    //   3901: caload
    //   3902: istore 59
    //   3904: iload 58
    //   3906: iconst_5
    //   3907: irem
    //   3908: tableswitch	default:+32 -> 3940, 0:+53->3961, 1:+60->3968, 2:+67->3975, 3:+74->3982
    //   3941: ldiv
    //   3942: istore 60
    //   3944: aload 56
    //   3946: iload 58
    //   3948: iload 60
    //   3950: iload 59
    //   3952: ixor
    //   3953: i2c
    //   3954: castore
    //   3955: iinc 58 1
    //   3958: goto -3532 -> 426
    //   3961: bipush 104
    //   3963: istore 60
    //   3965: goto -21 -> 3944
    //   3968: bipush 113
    //   3970: istore 60
    //   3972: goto -28 -> 3944
    //   3975: bipush 24
    //   3977: istore 60
    //   3979: goto -35 -> 3944
    //   3982: bipush 24
    //   3984: istore 60
    //   3986: goto -42 -> 3944
    //   3989: aload 61
    //   3991: iload 63
    //   3993: caload
    //   3994: istore 64
    //   3996: iload 63
    //   3998: iconst_5
    //   3999: irem
    //   4000: tableswitch	default:+32 -> 4032, 0:+53->4053, 1:+60->4060, 2:+67->4067, 3:+74->4074
    //   4033: ldiv
    //   4034: istore 65
    //   4036: aload 61
    //   4038: iload 63
    //   4040: iload 65
    //   4042: iload 64
    //   4044: ixor
    //   4045: i2c
    //   4046: castore
    //   4047: iinc 63 1
    //   4050: goto -3586 -> 464
    //   4053: bipush 104
    //   4055: istore 65
    //   4057: goto -21 -> 4036
    //   4060: bipush 113
    //   4062: istore 65
    //   4064: goto -28 -> 4036
    //   4067: bipush 24
    //   4069: istore 65
    //   4071: goto -35 -> 4036
    //   4074: bipush 24
    //   4076: istore 65
    //   4078: goto -42 -> 4036
    //   4081: aload 66
    //   4083: iload 68
    //   4085: caload
    //   4086: istore 69
    //   4088: iload 68
    //   4090: iconst_5
    //   4091: irem
    //   4092: tableswitch	default:+32 -> 4124, 0:+53->4145, 1:+60->4152, 2:+67->4159, 3:+74->4166
    //   4125: ldiv
    //   4126: istore 70
    //   4128: aload 66
    //   4130: iload 68
    //   4132: iload 70
    //   4134: iload 69
    //   4136: ixor
    //   4137: i2c
    //   4138: castore
    //   4139: iinc 68 1
    //   4142: goto -3640 -> 502
    //   4145: bipush 104
    //   4147: istore 70
    //   4149: goto -21 -> 4128
    //   4152: bipush 113
    //   4154: istore 70
    //   4156: goto -28 -> 4128
    //   4159: bipush 24
    //   4161: istore 70
    //   4163: goto -35 -> 4128
    //   4166: bipush 24
    //   4168: istore 70
    //   4170: goto -42 -> 4128
    //   4173: aload 71
    //   4175: iload 73
    //   4177: caload
    //   4178: istore 74
    //   4180: iload 73
    //   4182: iconst_5
    //   4183: irem
    //   4184: tableswitch	default:+32 -> 4216, 0:+53->4237, 1:+60->4244, 2:+67->4251, 3:+74->4258
    //   4217: ldiv
    //   4218: istore 75
    //   4220: aload 71
    //   4222: iload 73
    //   4224: iload 75
    //   4226: iload 74
    //   4228: ixor
    //   4229: i2c
    //   4230: castore
    //   4231: iinc 73 1
    //   4234: goto -3694 -> 540
    //   4237: bipush 104
    //   4239: istore 75
    //   4241: goto -21 -> 4220
    //   4244: bipush 113
    //   4246: istore 75
    //   4248: goto -28 -> 4220
    //   4251: bipush 24
    //   4253: istore 75
    //   4255: goto -35 -> 4220
    //   4258: bipush 24
    //   4260: istore 75
    //   4262: goto -42 -> 4220
    //   4265: aload 76
    //   4267: iload 78
    //   4269: caload
    //   4270: istore 79
    //   4272: iload 78
    //   4274: iconst_5
    //   4275: irem
    //   4276: tableswitch	default:+32 -> 4308, 0:+53->4329, 1:+60->4336, 2:+67->4343, 3:+74->4350
    //   4309: ldiv
    //   4310: istore 80
    //   4312: aload 76
    //   4314: iload 78
    //   4316: iload 80
    //   4318: iload 79
    //   4320: ixor
    //   4321: i2c
    //   4322: castore
    //   4323: iinc 78 1
    //   4326: goto -3748 -> 578
    //   4329: bipush 104
    //   4331: istore 80
    //   4333: goto -21 -> 4312
    //   4336: bipush 113
    //   4338: istore 80
    //   4340: goto -28 -> 4312
    //   4343: bipush 24
    //   4345: istore 80
    //   4347: goto -35 -> 4312
    //   4350: bipush 24
    //   4352: istore 80
    //   4354: goto -42 -> 4312
    //   4357: aload 81
    //   4359: iload 83
    //   4361: caload
    //   4362: istore 84
    //   4364: iload 83
    //   4366: iconst_5
    //   4367: irem
    //   4368: tableswitch	default:+32 -> 4400, 0:+53->4421, 1:+60->4428, 2:+67->4435, 3:+74->4442
    //   4401: ldiv
    //   4402: istore 85
    //   4404: aload 81
    //   4406: iload 83
    //   4408: iload 85
    //   4410: iload 84
    //   4412: ixor
    //   4413: i2c
    //   4414: castore
    //   4415: iinc 83 1
    //   4418: goto -3802 -> 616
    //   4421: bipush 104
    //   4423: istore 85
    //   4425: goto -21 -> 4404
    //   4428: bipush 113
    //   4430: istore 85
    //   4432: goto -28 -> 4404
    //   4435: bipush 24
    //   4437: istore 85
    //   4439: goto -35 -> 4404
    //   4442: bipush 24
    //   4444: istore 85
    //   4446: goto -42 -> 4404
    //   4449: aload 86
    //   4451: iload 88
    //   4453: caload
    //   4454: istore 89
    //   4456: iload 88
    //   4458: iconst_5
    //   4459: irem
    //   4460: tableswitch	default:+32 -> 4492, 0:+53->4513, 1:+60->4520, 2:+67->4527, 3:+74->4534
    //   4493: ldiv
    //   4494: istore 90
    //   4496: aload 86
    //   4498: iload 88
    //   4500: iload 90
    //   4502: iload 89
    //   4504: ixor
    //   4505: i2c
    //   4506: castore
    //   4507: iinc 88 1
    //   4510: goto -3856 -> 654
    //   4513: bipush 104
    //   4515: istore 90
    //   4517: goto -21 -> 4496
    //   4520: bipush 113
    //   4522: istore 90
    //   4524: goto -28 -> 4496
    //   4527: bipush 24
    //   4529: istore 90
    //   4531: goto -35 -> 4496
    //   4534: bipush 24
    //   4536: istore 90
    //   4538: goto -42 -> 4496
    //   4541: aload 91
    //   4543: iload 93
    //   4545: caload
    //   4546: istore 94
    //   4548: iload 93
    //   4550: iconst_5
    //   4551: irem
    //   4552: tableswitch	default:+32 -> 4584, 0:+53->4605, 1:+60->4612, 2:+67->4619, 3:+74->4626
    //   4585: ldiv
    //   4586: istore 95
    //   4588: aload 91
    //   4590: iload 93
    //   4592: iload 95
    //   4594: iload 94
    //   4596: ixor
    //   4597: i2c
    //   4598: castore
    //   4599: iinc 93 1
    //   4602: goto -3910 -> 692
    //   4605: bipush 104
    //   4607: istore 95
    //   4609: goto -21 -> 4588
    //   4612: bipush 113
    //   4614: istore 95
    //   4616: goto -28 -> 4588
    //   4619: bipush 24
    //   4621: istore 95
    //   4623: goto -35 -> 4588
    //   4626: bipush 24
    //   4628: istore 95
    //   4630: goto -42 -> 4588
    //   4633: aload 96
    //   4635: iload 98
    //   4637: caload
    //   4638: istore 99
    //   4640: iload 98
    //   4642: iconst_5
    //   4643: irem
    //   4644: tableswitch	default:+32 -> 4676, 0:+53->4697, 1:+60->4704, 2:+67->4711, 3:+74->4718
    //   4677: ldiv
    //   4678: istore 100
    //   4680: aload 96
    //   4682: iload 98
    //   4684: iload 100
    //   4686: iload 99
    //   4688: ixor
    //   4689: i2c
    //   4690: castore
    //   4691: iinc 98 1
    //   4694: goto -3964 -> 730
    //   4697: bipush 104
    //   4699: istore 100
    //   4701: goto -21 -> 4680
    //   4704: bipush 113
    //   4706: istore 100
    //   4708: goto -28 -> 4680
    //   4711: bipush 24
    //   4713: istore 100
    //   4715: goto -35 -> 4680
    //   4718: bipush 24
    //   4720: istore 100
    //   4722: goto -42 -> 4680
    //   4725: aload 101
    //   4727: iload 103
    //   4729: caload
    //   4730: istore 104
    //   4732: iload 103
    //   4734: iconst_5
    //   4735: irem
    //   4736: tableswitch	default:+32 -> 4768, 0:+53->4789, 1:+60->4796, 2:+67->4803, 3:+74->4810
    //   4769: ldiv
    //   4770: istore 105
    //   4772: aload 101
    //   4774: iload 103
    //   4776: iload 105
    //   4778: iload 104
    //   4780: ixor
    //   4781: i2c
    //   4782: castore
    //   4783: iinc 103 1
    //   4786: goto -4018 -> 768
    //   4789: bipush 104
    //   4791: istore 105
    //   4793: goto -21 -> 4772
    //   4796: bipush 113
    //   4798: istore 105
    //   4800: goto -28 -> 4772
    //   4803: bipush 24
    //   4805: istore 105
    //   4807: goto -35 -> 4772
    //   4810: bipush 24
    //   4812: istore 105
    //   4814: goto -42 -> 4772
    //   4817: aload 106
    //   4819: iload 108
    //   4821: caload
    //   4822: istore 109
    //   4824: iload 108
    //   4826: iconst_5
    //   4827: irem
    //   4828: tableswitch	default:+32 -> 4860, 0:+53->4881, 1:+60->4888, 2:+67->4895, 3:+74->4902
    //   4861: ldiv
    //   4862: istore 110
    //   4864: aload 106
    //   4866: iload 108
    //   4868: iload 110
    //   4870: iload 109
    //   4872: ixor
    //   4873: i2c
    //   4874: castore
    //   4875: iinc 108 1
    //   4878: goto -4072 -> 806
    //   4881: bipush 104
    //   4883: istore 110
    //   4885: goto -21 -> 4864
    //   4888: bipush 113
    //   4890: istore 110
    //   4892: goto -28 -> 4864
    //   4895: bipush 24
    //   4897: istore 110
    //   4899: goto -35 -> 4864
    //   4902: bipush 24
    //   4904: istore 110
    //   4906: goto -42 -> 4864
    //   4909: aload 111
    //   4911: iload 113
    //   4913: caload
    //   4914: istore 114
    //   4916: iload 113
    //   4918: iconst_5
    //   4919: irem
    //   4920: tableswitch	default:+32 -> 4952, 0:+53->4973, 1:+60->4980, 2:+67->4987, 3:+74->4994
    //   4953: ldiv
    //   4954: istore 115
    //   4956: aload 111
    //   4958: iload 113
    //   4960: iload 115
    //   4962: iload 114
    //   4964: ixor
    //   4965: i2c
    //   4966: castore
    //   4967: iinc 113 1
    //   4970: goto -4126 -> 844
    //   4973: bipush 104
    //   4975: istore 115
    //   4977: goto -21 -> 4956
    //   4980: bipush 113
    //   4982: istore 115
    //   4984: goto -28 -> 4956
    //   4987: bipush 24
    //   4989: istore 115
    //   4991: goto -35 -> 4956
    //   4994: bipush 24
    //   4996: istore 115
    //   4998: goto -42 -> 4956
    //   5001: aload 116
    //   5003: iload 118
    //   5005: caload
    //   5006: istore 119
    //   5008: iload 118
    //   5010: iconst_5
    //   5011: irem
    //   5012: tableswitch	default:+32 -> 5044, 0:+53->5065, 1:+60->5072, 2:+67->5079, 3:+74->5086
    //   5045: ldiv
    //   5046: istore 120
    //   5048: aload 116
    //   5050: iload 118
    //   5052: iload 120
    //   5054: iload 119
    //   5056: ixor
    //   5057: i2c
    //   5058: castore
    //   5059: iinc 118 1
    //   5062: goto -4180 -> 882
    //   5065: bipush 104
    //   5067: istore 120
    //   5069: goto -21 -> 5048
    //   5072: bipush 113
    //   5074: istore 120
    //   5076: goto -28 -> 5048
    //   5079: bipush 24
    //   5081: istore 120
    //   5083: goto -35 -> 5048
    //   5086: bipush 24
    //   5088: istore 120
    //   5090: goto -42 -> 5048
    //   5093: aload 121
    //   5095: iload 123
    //   5097: caload
    //   5098: istore 124
    //   5100: iload 123
    //   5102: iconst_5
    //   5103: irem
    //   5104: tableswitch	default:+32 -> 5136, 0:+53->5157, 1:+60->5164, 2:+67->5171, 3:+74->5178
    //   5137: ldiv
    //   5138: istore 125
    //   5140: aload 121
    //   5142: iload 123
    //   5144: iload 125
    //   5146: iload 124
    //   5148: ixor
    //   5149: i2c
    //   5150: castore
    //   5151: iinc 123 1
    //   5154: goto -4234 -> 920
    //   5157: bipush 104
    //   5159: istore 125
    //   5161: goto -21 -> 5140
    //   5164: bipush 113
    //   5166: istore 125
    //   5168: goto -28 -> 5140
    //   5171: bipush 24
    //   5173: istore 125
    //   5175: goto -35 -> 5140
    //   5178: bipush 24
    //   5180: istore 125
    //   5182: goto -42 -> 5140
    //   5185: aload 126
    //   5187: iload 128
    //   5189: caload
    //   5190: istore 129
    //   5192: iload 128
    //   5194: iconst_5
    //   5195: irem
    //   5196: tableswitch	default:+32 -> 5228, 0:+53->5249, 1:+60->5256, 2:+67->5263, 3:+74->5270
    //   5229: ldiv
    //   5230: istore 130
    //   5232: aload 126
    //   5234: iload 128
    //   5236: iload 130
    //   5238: iload 129
    //   5240: ixor
    //   5241: i2c
    //   5242: castore
    //   5243: iinc 128 1
    //   5246: goto -4288 -> 958
    //   5249: bipush 104
    //   5251: istore 130
    //   5253: goto -21 -> 5232
    //   5256: bipush 113
    //   5258: istore 130
    //   5260: goto -28 -> 5232
    //   5263: bipush 24
    //   5265: istore 130
    //   5267: goto -35 -> 5232
    //   5270: bipush 24
    //   5272: istore 130
    //   5274: goto -42 -> 5232
    //   5277: aload 131
    //   5279: iload 133
    //   5281: caload
    //   5282: istore 134
    //   5284: iload 133
    //   5286: iconst_5
    //   5287: irem
    //   5288: tableswitch	default:+32 -> 5320, 0:+53->5341, 1:+60->5348, 2:+67->5355, 3:+74->5362
    //   5321: ldiv
    //   5322: istore 135
    //   5324: aload 131
    //   5326: iload 133
    //   5328: iload 135
    //   5330: iload 134
    //   5332: ixor
    //   5333: i2c
    //   5334: castore
    //   5335: iinc 133 1
    //   5338: goto -4342 -> 996
    //   5341: bipush 104
    //   5343: istore 135
    //   5345: goto -21 -> 5324
    //   5348: bipush 113
    //   5350: istore 135
    //   5352: goto -28 -> 5324
    //   5355: bipush 24
    //   5357: istore 135
    //   5359: goto -35 -> 5324
    //   5362: bipush 24
    //   5364: istore 135
    //   5366: goto -42 -> 5324
    //   5369: aload 136
    //   5371: iload 138
    //   5373: caload
    //   5374: istore 139
    //   5376: iload 138
    //   5378: iconst_5
    //   5379: irem
    //   5380: tableswitch	default:+32 -> 5412, 0:+53->5433, 1:+60->5440, 2:+67->5447, 3:+74->5454
    //   5413: ldiv
    //   5414: istore 140
    //   5416: aload 136
    //   5418: iload 138
    //   5420: iload 140
    //   5422: iload 139
    //   5424: ixor
    //   5425: i2c
    //   5426: castore
    //   5427: iinc 138 1
    //   5430: goto -4396 -> 1034
    //   5433: bipush 104
    //   5435: istore 140
    //   5437: goto -21 -> 5416
    //   5440: bipush 113
    //   5442: istore 140
    //   5444: goto -28 -> 5416
    //   5447: bipush 24
    //   5449: istore 140
    //   5451: goto -35 -> 5416
    //   5454: bipush 24
    //   5456: istore 140
    //   5458: goto -42 -> 5416
    //   5461: aload 141
    //   5463: iload 143
    //   5465: caload
    //   5466: istore 144
    //   5468: iload 143
    //   5470: iconst_5
    //   5471: irem
    //   5472: tableswitch	default:+32 -> 5504, 0:+53->5525, 1:+60->5532, 2:+67->5539, 3:+74->5546
    //   5505: ldiv
    //   5506: istore 145
    //   5508: aload 141
    //   5510: iload 143
    //   5512: iload 145
    //   5514: iload 144
    //   5516: ixor
    //   5517: i2c
    //   5518: castore
    //   5519: iinc 143 1
    //   5522: goto -4450 -> 1072
    //   5525: bipush 104
    //   5527: istore 145
    //   5529: goto -21 -> 5508
    //   5532: bipush 113
    //   5534: istore 145
    //   5536: goto -28 -> 5508
    //   5539: bipush 24
    //   5541: istore 145
    //   5543: goto -35 -> 5508
    //   5546: bipush 24
    //   5548: istore 145
    //   5550: goto -42 -> 5508
    //   5553: aload 146
    //   5555: iload 148
    //   5557: caload
    //   5558: istore 149
    //   5560: iload 148
    //   5562: iconst_5
    //   5563: irem
    //   5564: tableswitch	default:+32 -> 5596, 0:+53->5617, 1:+60->5624, 2:+67->5631, 3:+74->5638
    //   5597: ldiv
    //   5598: istore 150
    //   5600: aload 146
    //   5602: iload 148
    //   5604: iload 150
    //   5606: iload 149
    //   5608: ixor
    //   5609: i2c
    //   5610: castore
    //   5611: iinc 148 1
    //   5614: goto -4504 -> 1110
    //   5617: bipush 104
    //   5619: istore 150
    //   5621: goto -21 -> 5600
    //   5624: bipush 113
    //   5626: istore 150
    //   5628: goto -28 -> 5600
    //   5631: bipush 24
    //   5633: istore 150
    //   5635: goto -35 -> 5600
    //   5638: bipush 24
    //   5640: istore 150
    //   5642: goto -42 -> 5600
    //   5645: aload 151
    //   5647: iload 153
    //   5649: caload
    //   5650: istore 154
    //   5652: iload 153
    //   5654: iconst_5
    //   5655: irem
    //   5656: tableswitch	default:+32 -> 5688, 0:+53->5709, 1:+60->5716, 2:+67->5723, 3:+74->5730
    //   5689: ldiv
    //   5690: istore 155
    //   5692: aload 151
    //   5694: iload 153
    //   5696: iload 155
    //   5698: iload 154
    //   5700: ixor
    //   5701: i2c
    //   5702: castore
    //   5703: iinc 153 1
    //   5706: goto -4558 -> 1148
    //   5709: bipush 104
    //   5711: istore 155
    //   5713: goto -21 -> 5692
    //   5716: bipush 113
    //   5718: istore 155
    //   5720: goto -28 -> 5692
    //   5723: bipush 24
    //   5725: istore 155
    //   5727: goto -35 -> 5692
    //   5730: bipush 24
    //   5732: istore 155
    //   5734: goto -42 -> 5692
    //   5737: aload 156
    //   5739: iload 158
    //   5741: caload
    //   5742: istore 159
    //   5744: iload 158
    //   5746: iconst_5
    //   5747: irem
    //   5748: tableswitch	default:+32 -> 5780, 0:+53->5801, 1:+60->5808, 2:+67->5815, 3:+74->5822
    //   5781: ldiv
    //   5782: istore 160
    //   5784: aload 156
    //   5786: iload 158
    //   5788: iload 160
    //   5790: iload 159
    //   5792: ixor
    //   5793: i2c
    //   5794: castore
    //   5795: iinc 158 1
    //   5798: goto -4612 -> 1186
    //   5801: bipush 104
    //   5803: istore 160
    //   5805: goto -21 -> 5784
    //   5808: bipush 113
    //   5810: istore 160
    //   5812: goto -28 -> 5784
    //   5815: bipush 24
    //   5817: istore 160
    //   5819: goto -35 -> 5784
    //   5822: bipush 24
    //   5824: istore 160
    //   5826: goto -42 -> 5784
    //   5829: aload 161
    //   5831: iload 163
    //   5833: caload
    //   5834: istore 164
    //   5836: iload 163
    //   5838: iconst_5
    //   5839: irem
    //   5840: tableswitch	default:+32 -> 5872, 0:+53->5893, 1:+60->5900, 2:+67->5907, 3:+74->5914
    //   5873: ldiv
    //   5874: istore 165
    //   5876: aload 161
    //   5878: iload 163
    //   5880: iload 165
    //   5882: iload 164
    //   5884: ixor
    //   5885: i2c
    //   5886: castore
    //   5887: iinc 163 1
    //   5890: goto -4666 -> 1224
    //   5893: bipush 104
    //   5895: istore 165
    //   5897: goto -21 -> 5876
    //   5900: bipush 113
    //   5902: istore 165
    //   5904: goto -28 -> 5876
    //   5907: bipush 24
    //   5909: istore 165
    //   5911: goto -35 -> 5876
    //   5914: bipush 24
    //   5916: istore 165
    //   5918: goto -42 -> 5876
    //   5921: aload 166
    //   5923: iload 168
    //   5925: caload
    //   5926: istore 169
    //   5928: iload 168
    //   5930: iconst_5
    //   5931: irem
    //   5932: tableswitch	default:+32 -> 5964, 0:+53->5985, 1:+60->5992, 2:+67->5999, 3:+74->6006
    //   5965: ldiv
    //   5966: istore 170
    //   5968: aload 166
    //   5970: iload 168
    //   5972: iload 170
    //   5974: iload 169
    //   5976: ixor
    //   5977: i2c
    //   5978: castore
    //   5979: iinc 168 1
    //   5982: goto -4720 -> 1262
    //   5985: bipush 104
    //   5987: istore 170
    //   5989: goto -21 -> 5968
    //   5992: bipush 113
    //   5994: istore 170
    //   5996: goto -28 -> 5968
    //   5999: bipush 24
    //   6001: istore 170
    //   6003: goto -35 -> 5968
    //   6006: bipush 24
    //   6008: istore 170
    //   6010: goto -42 -> 5968
    //   6013: aload 171
    //   6015: iload 173
    //   6017: caload
    //   6018: istore 174
    //   6020: iload 173
    //   6022: iconst_5
    //   6023: irem
    //   6024: tableswitch	default:+32 -> 6056, 0:+53->6077, 1:+60->6084, 2:+67->6091, 3:+74->6098
    //   6057: ldiv
    //   6058: istore 175
    //   6060: aload 171
    //   6062: iload 173
    //   6064: iload 175
    //   6066: iload 174
    //   6068: ixor
    //   6069: i2c
    //   6070: castore
    //   6071: iinc 173 1
    //   6074: goto -4774 -> 1300
    //   6077: bipush 104
    //   6079: istore 175
    //   6081: goto -21 -> 6060
    //   6084: bipush 113
    //   6086: istore 175
    //   6088: goto -28 -> 6060
    //   6091: bipush 24
    //   6093: istore 175
    //   6095: goto -35 -> 6060
    //   6098: bipush 24
    //   6100: istore 175
    //   6102: goto -42 -> 6060
    //   6105: aload 176
    //   6107: iload 178
    //   6109: caload
    //   6110: istore 179
    //   6112: iload 178
    //   6114: iconst_5
    //   6115: irem
    //   6116: tableswitch	default:+32 -> 6148, 0:+53->6169, 1:+60->6176, 2:+67->6183, 3:+74->6190
    //   6149: ldiv
    //   6150: istore 180
    //   6152: aload 176
    //   6154: iload 178
    //   6156: iload 180
    //   6158: iload 179
    //   6160: ixor
    //   6161: i2c
    //   6162: castore
    //   6163: iinc 178 1
    //   6166: goto -4828 -> 1338
    //   6169: bipush 104
    //   6171: istore 180
    //   6173: goto -21 -> 6152
    //   6176: bipush 113
    //   6178: istore 180
    //   6180: goto -28 -> 6152
    //   6183: bipush 24
    //   6185: istore 180
    //   6187: goto -35 -> 6152
    //   6190: bipush 24
    //   6192: istore 180
    //   6194: goto -42 -> 6152
    //   6197: aload 181
    //   6199: iload 183
    //   6201: caload
    //   6202: istore 184
    //   6204: iload 183
    //   6206: iconst_5
    //   6207: irem
    //   6208: tableswitch	default:+32 -> 6240, 0:+53->6261, 1:+60->6268, 2:+67->6275, 3:+74->6282
    //   6241: ldiv
    //   6242: istore 185
    //   6244: aload 181
    //   6246: iload 183
    //   6248: iload 185
    //   6250: iload 184
    //   6252: ixor
    //   6253: i2c
    //   6254: castore
    //   6255: iinc 183 1
    //   6258: goto -4882 -> 1376
    //   6261: bipush 104
    //   6263: istore 185
    //   6265: goto -21 -> 6244
    //   6268: bipush 113
    //   6270: istore 185
    //   6272: goto -28 -> 6244
    //   6275: bipush 24
    //   6277: istore 185
    //   6279: goto -35 -> 6244
    //   6282: bipush 24
    //   6284: istore 185
    //   6286: goto -42 -> 6244
    //   6289: aload 186
    //   6291: iload 188
    //   6293: caload
    //   6294: istore 189
    //   6296: iload 188
    //   6298: iconst_5
    //   6299: irem
    //   6300: tableswitch	default:+32 -> 6332, 0:+53->6353, 1:+60->6360, 2:+67->6367, 3:+74->6374
    //   6333: ldiv
    //   6334: istore 190
    //   6336: aload 186
    //   6338: iload 188
    //   6340: iload 190
    //   6342: iload 189
    //   6344: ixor
    //   6345: i2c
    //   6346: castore
    //   6347: iinc 188 1
    //   6350: goto -4936 -> 1414
    //   6353: bipush 104
    //   6355: istore 190
    //   6357: goto -21 -> 6336
    //   6360: bipush 113
    //   6362: istore 190
    //   6364: goto -28 -> 6336
    //   6367: bipush 24
    //   6369: istore 190
    //   6371: goto -35 -> 6336
    //   6374: bipush 24
    //   6376: istore 190
    //   6378: goto -42 -> 6336
    //   6381: aload 191
    //   6383: iload 193
    //   6385: caload
    //   6386: istore 194
    //   6388: iload 193
    //   6390: iconst_5
    //   6391: irem
    //   6392: tableswitch	default:+32 -> 6424, 0:+53->6445, 1:+60->6452, 2:+67->6459, 3:+74->6466
    //   6425: ldiv
    //   6426: istore 195
    //   6428: aload 191
    //   6430: iload 193
    //   6432: iload 195
    //   6434: iload 194
    //   6436: ixor
    //   6437: i2c
    //   6438: castore
    //   6439: iinc 193 1
    //   6442: goto -4990 -> 1452
    //   6445: bipush 104
    //   6447: istore 195
    //   6449: goto -21 -> 6428
    //   6452: bipush 113
    //   6454: istore 195
    //   6456: goto -28 -> 6428
    //   6459: bipush 24
    //   6461: istore 195
    //   6463: goto -35 -> 6428
    //   6466: bipush 24
    //   6468: istore 195
    //   6470: goto -42 -> 6428
    //   6473: aload 196
    //   6475: iload 198
    //   6477: caload
    //   6478: istore 199
    //   6480: iload 198
    //   6482: iconst_5
    //   6483: irem
    //   6484: tableswitch	default:+32 -> 6516, 0:+53->6537, 1:+60->6544, 2:+67->6551, 3:+74->6558
    //   6517: ldiv
    //   6518: istore 200
    //   6520: aload 196
    //   6522: iload 198
    //   6524: iload 200
    //   6526: iload 199
    //   6528: ixor
    //   6529: i2c
    //   6530: castore
    //   6531: iinc 198 1
    //   6534: goto -5044 -> 1490
    //   6537: bipush 104
    //   6539: istore 200
    //   6541: goto -21 -> 6520
    //   6544: bipush 113
    //   6546: istore 200
    //   6548: goto -28 -> 6520
    //   6551: bipush 24
    //   6553: istore 200
    //   6555: goto -35 -> 6520
    //   6558: bipush 24
    //   6560: istore 200
    //   6562: goto -42 -> 6520
    //   6565: aload 201
    //   6567: iload 203
    //   6569: caload
    //   6570: istore 204
    //   6572: iload 203
    //   6574: iconst_5
    //   6575: irem
    //   6576: tableswitch	default:+32 -> 6608, 0:+53->6629, 1:+60->6636, 2:+67->6643, 3:+74->6650
    //   6609: ldiv
    //   6610: istore 205
    //   6612: aload 201
    //   6614: iload 203
    //   6616: iload 205
    //   6618: iload 204
    //   6620: ixor
    //   6621: i2c
    //   6622: castore
    //   6623: iinc 203 1
    //   6626: goto -5098 -> 1528
    //   6629: bipush 104
    //   6631: istore 205
    //   6633: goto -21 -> 6612
    //   6636: bipush 113
    //   6638: istore 205
    //   6640: goto -28 -> 6612
    //   6643: bipush 24
    //   6645: istore 205
    //   6647: goto -35 -> 6612
    //   6650: bipush 24
    //   6652: istore 205
    //   6654: goto -42 -> 6612
    //   6657: aload 206
    //   6659: iload 208
    //   6661: caload
    //   6662: istore 209
    //   6664: iload 208
    //   6666: iconst_5
    //   6667: irem
    //   6668: tableswitch	default:+32 -> 6700, 0:+53->6721, 1:+60->6728, 2:+67->6735, 3:+74->6742
    //   6701: ldiv
    //   6702: istore 210
    //   6704: aload 206
    //   6706: iload 208
    //   6708: iload 210
    //   6710: iload 209
    //   6712: ixor
    //   6713: i2c
    //   6714: castore
    //   6715: iinc 208 1
    //   6718: goto -5152 -> 1566
    //   6721: bipush 104
    //   6723: istore 210
    //   6725: goto -21 -> 6704
    //   6728: bipush 113
    //   6730: istore 210
    //   6732: goto -28 -> 6704
    //   6735: bipush 24
    //   6737: istore 210
    //   6739: goto -35 -> 6704
    //   6742: bipush 24
    //   6744: istore 210
    //   6746: goto -42 -> 6704
    //   6749: aload 211
    //   6751: iload 213
    //   6753: caload
    //   6754: istore 214
    //   6756: iload 213
    //   6758: iconst_5
    //   6759: irem
    //   6760: tableswitch	default:+32 -> 6792, 0:+53->6813, 1:+60->6820, 2:+67->6827, 3:+74->6834
    //   6793: ldiv
    //   6794: istore 215
    //   6796: aload 211
    //   6798: iload 213
    //   6800: iload 215
    //   6802: iload 214
    //   6804: ixor
    //   6805: i2c
    //   6806: castore
    //   6807: iinc 213 1
    //   6810: goto -5206 -> 1604
    //   6813: bipush 104
    //   6815: istore 215
    //   6817: goto -21 -> 6796
    //   6820: bipush 113
    //   6822: istore 215
    //   6824: goto -28 -> 6796
    //   6827: bipush 24
    //   6829: istore 215
    //   6831: goto -35 -> 6796
    //   6834: bipush 24
    //   6836: istore 215
    //   6838: goto -42 -> 6796
    //   6841: aload 216
    //   6843: iload 218
    //   6845: caload
    //   6846: istore 219
    //   6848: iload 218
    //   6850: iconst_5
    //   6851: irem
    //   6852: tableswitch	default:+32 -> 6884, 0:+53->6905, 1:+60->6912, 2:+67->6919, 3:+74->6926
    //   6885: ldiv
    //   6886: istore 220
    //   6888: aload 216
    //   6890: iload 218
    //   6892: iload 220
    //   6894: iload 219
    //   6896: ixor
    //   6897: i2c
    //   6898: castore
    //   6899: iinc 218 1
    //   6902: goto -5260 -> 1642
    //   6905: bipush 104
    //   6907: istore 220
    //   6909: goto -21 -> 6888
    //   6912: bipush 113
    //   6914: istore 220
    //   6916: goto -28 -> 6888
    //   6919: bipush 24
    //   6921: istore 220
    //   6923: goto -35 -> 6888
    //   6926: bipush 24
    //   6928: istore 220
    //   6930: goto -42 -> 6888
    //   6933: aload 221
    //   6935: iload 223
    //   6937: caload
    //   6938: istore 224
    //   6940: iload 223
    //   6942: iconst_5
    //   6943: irem
    //   6944: tableswitch	default:+32 -> 6976, 0:+53->6997, 1:+60->7004, 2:+67->7011, 3:+74->7018
    //   6977: ldiv
    //   6978: istore 225
    //   6980: aload 221
    //   6982: iload 223
    //   6984: iload 225
    //   6986: iload 224
    //   6988: ixor
    //   6989: i2c
    //   6990: castore
    //   6991: iinc 223 1
    //   6994: goto -5314 -> 1680
    //   6997: bipush 104
    //   6999: istore 225
    //   7001: goto -21 -> 6980
    //   7004: bipush 113
    //   7006: istore 225
    //   7008: goto -28 -> 6980
    //   7011: bipush 24
    //   7013: istore 225
    //   7015: goto -35 -> 6980
    //   7018: bipush 24
    //   7020: istore 225
    //   7022: goto -42 -> 6980
    //   7025: aload 226
    //   7027: iload 228
    //   7029: caload
    //   7030: istore 229
    //   7032: iload 228
    //   7034: iconst_5
    //   7035: irem
    //   7036: tableswitch	default:+32 -> 7068, 0:+53->7089, 1:+60->7096, 2:+67->7103, 3:+74->7110
    //   7069: ldiv
    //   7070: istore 230
    //   7072: aload 226
    //   7074: iload 228
    //   7076: iload 230
    //   7078: iload 229
    //   7080: ixor
    //   7081: i2c
    //   7082: castore
    //   7083: iinc 228 1
    //   7086: goto -5368 -> 1718
    //   7089: bipush 104
    //   7091: istore 230
    //   7093: goto -21 -> 7072
    //   7096: bipush 113
    //   7098: istore 230
    //   7100: goto -28 -> 7072
    //   7103: bipush 24
    //   7105: istore 230
    //   7107: goto -35 -> 7072
    //   7110: bipush 24
    //   7112: istore 230
    //   7114: goto -42 -> 7072
    //   7117: aload 231
    //   7119: iload 233
    //   7121: caload
    //   7122: istore 234
    //   7124: iload 233
    //   7126: iconst_5
    //   7127: irem
    //   7128: tableswitch	default:+32 -> 7160, 0:+53->7181, 1:+60->7188, 2:+67->7195, 3:+74->7202
    //   7161: ldiv
    //   7162: istore 235
    //   7164: aload 231
    //   7166: iload 233
    //   7168: iload 235
    //   7170: iload 234
    //   7172: ixor
    //   7173: i2c
    //   7174: castore
    //   7175: iinc 233 1
    //   7178: goto -5422 -> 1756
    //   7181: bipush 104
    //   7183: istore 235
    //   7185: goto -21 -> 7164
    //   7188: bipush 113
    //   7190: istore 235
    //   7192: goto -28 -> 7164
    //   7195: bipush 24
    //   7197: istore 235
    //   7199: goto -35 -> 7164
    //   7202: bipush 24
    //   7204: istore 235
    //   7206: goto -42 -> 7164
    //   7209: aload 236
    //   7211: iload 238
    //   7213: caload
    //   7214: istore 239
    //   7216: iload 238
    //   7218: iconst_5
    //   7219: irem
    //   7220: tableswitch	default:+32 -> 7252, 0:+53->7273, 1:+60->7280, 2:+67->7287, 3:+74->7294
    //   7253: ldiv
    //   7254: istore 240
    //   7256: aload 236
    //   7258: iload 238
    //   7260: iload 240
    //   7262: iload 239
    //   7264: ixor
    //   7265: i2c
    //   7266: castore
    //   7267: iinc 238 1
    //   7270: goto -5476 -> 1794
    //   7273: bipush 104
    //   7275: istore 240
    //   7277: goto -21 -> 7256
    //   7280: bipush 113
    //   7282: istore 240
    //   7284: goto -28 -> 7256
    //   7287: bipush 24
    //   7289: istore 240
    //   7291: goto -35 -> 7256
    //   7294: bipush 24
    //   7296: istore 240
    //   7298: goto -42 -> 7256
    //   7301: aload 241
    //   7303: iload 243
    //   7305: caload
    //   7306: istore 244
    //   7308: iload 243
    //   7310: iconst_5
    //   7311: irem
    //   7312: tableswitch	default:+32 -> 7344, 0:+53->7365, 1:+60->7372, 2:+67->7379, 3:+74->7386
    //   7345: ldiv
    //   7346: istore 245
    //   7348: aload 241
    //   7350: iload 243
    //   7352: iload 245
    //   7354: iload 244
    //   7356: ixor
    //   7357: i2c
    //   7358: castore
    //   7359: iinc 243 1
    //   7362: goto -5530 -> 1832
    //   7365: bipush 104
    //   7367: istore 245
    //   7369: goto -21 -> 7348
    //   7372: bipush 113
    //   7374: istore 245
    //   7376: goto -28 -> 7348
    //   7379: bipush 24
    //   7381: istore 245
    //   7383: goto -35 -> 7348
    //   7386: bipush 24
    //   7388: istore 245
    //   7390: goto -42 -> 7348
    //   7393: aload 246
    //   7395: iload 248
    //   7397: caload
    //   7398: istore 249
    //   7400: iload 248
    //   7402: iconst_5
    //   7403: irem
    //   7404: tableswitch	default:+32 -> 7436, 0:+53->7457, 1:+60->7464, 2:+67->7471, 3:+74->7478
    //   7437: ldiv
    //   7438: istore 250
    //   7440: aload 246
    //   7442: iload 248
    //   7444: iload 250
    //   7446: iload 249
    //   7448: ixor
    //   7449: i2c
    //   7450: castore
    //   7451: iinc 248 1
    //   7454: goto -5584 -> 1870
    //   7457: bipush 104
    //   7459: istore 250
    //   7461: goto -21 -> 7440
    //   7464: bipush 113
    //   7466: istore 250
    //   7468: goto -28 -> 7440
    //   7471: bipush 24
    //   7473: istore 250
    //   7475: goto -35 -> 7440
    //   7478: bipush 24
    //   7480: istore 250
    //   7482: goto -42 -> 7440
    //   7485: aload 251
    //   7487: iload 253
    //   7489: caload
    //   7490: istore 254
    //   7492: iload 253
    //   7494: iconst_5
    //   7495: irem
    //   7496: tableswitch	default:+32 -> 7528, 0:+53->7549, 1:+60->7556, 2:+67->7563, 3:+74->7570
    //   7529: ldiv
    //   7530: istore 255
    //   7532: aload 251
    //   7534: iload 253
    //   7536: iload 255
    //   7538: iload 254
    //   7540: ixor
    //   7541: i2c
    //   7542: castore
    //   7543: iinc 253 1
    //   7546: goto -5638 -> 1908
    //   7549: bipush 104
    //   7551: istore 255
    //   7553: goto -21 -> 7532
    //   7556: bipush 113
    //   7558: istore 255
    //   7560: goto -28 -> 7532
    //   7563: bipush 24
    //   7565: istore 255
    //   7567: goto -35 -> 7532
    //   7570: bipush 24
    //   7572: istore 255
    //   7574: goto -42 -> 7532
    //   7577: wide
    //   7581: wide
    //   7585: caload
    //   7586: wide
    //   7590: wide
    //   7594: iconst_5
    //   7595: irem
    //   7596: tableswitch	default:+32 -> 7628, 0:+66->7662, 1:+75->7671, 2:+84->7680, 3:+93->7689
    //   7629: ldiv
    //   7630: wide
    //   7634: wide
    //   7638: wide
    //   7642: wide
    //   7646: wide
    //   7650: ixor
    //   7651: i2c
    //   7652: castore
    //   7653: wide
    //   7659: goto -5705 -> 1954
    //   7662: bipush 104
    //   7664: wide
    //   7668: goto -34 -> 7634
    //   7671: bipush 113
    //   7673: wide
    //   7677: goto -43 -> 7634
    //   7680: bipush 24
    //   7682: wide
    //   7686: goto -52 -> 7634
    //   7689: bipush 24
    //   7691: wide
    //   7695: goto -61 -> 7634
    //   7698: wide
    //   7702: wide
    //   7706: caload
    //   7707: wide
    //   7711: wide
    //   7715: iconst_5
    //   7716: irem
    //   7717: tableswitch	default:+31 -> 7748, 0:+65->7782, 1:+74->7791, 2:+83->7800, 3:+92->7809
    //   7749: ldiv
    //   7750: wide
    //   7754: wide
    //   7758: wide
    //   7762: wide
    //   7766: wide
    //   7770: ixor
    //   7771: i2c
    //   7772: castore
    //   7773: wide
    //   7779: goto -5773 -> 2006
    //   7782: bipush 104
    //   7784: wide
    //   7788: goto -34 -> 7754
    //   7791: bipush 113
    //   7793: wide
    //   7797: goto -43 -> 7754
    //   7800: bipush 24
    //   7802: wide
    //   7806: goto -52 -> 7754
    //   7809: bipush 24
    //   7811: wide
    //   7815: goto -61 -> 7754
    //   7818: wide
    //   7822: wide
    //   7826: caload
    //   7827: wide
    //   7831: wide
    //   7835: iconst_5
    //   7836: irem
    //   7837: tableswitch	default:+31 -> 7868, 0:+65->7902, 1:+74->7911, 2:+83->7920, 3:+92->7929
    //   7869: ldiv
    //   7870: wide
    //   7874: wide
    //   7878: wide
    //   7882: wide
    //   7886: wide
    //   7890: ixor
    //   7891: i2c
    //   7892: castore
    //   7893: wide
    //   7899: goto -5841 -> 2058
    //   7902: bipush 104
    //   7904: wide
    //   7908: goto -34 -> 7874
    //   7911: bipush 113
    //   7913: wide
    //   7917: goto -43 -> 7874
    //   7920: bipush 24
    //   7922: wide
    //   7926: goto -52 -> 7874
    //   7929: bipush 24
    //   7931: wide
    //   7935: goto -61 -> 7874
    //   7938: wide
    //   7942: wide
    //   7946: caload
    //   7947: wide
    //   7951: wide
    //   7955: iconst_5
    //   7956: irem
    //   7957: tableswitch	default:+31 -> 7988, 0:+65->8022, 1:+74->8031, 2:+83->8040, 3:+92->8049
    //   7989: ldiv
    //   7990: wide
    //   7994: wide
    //   7998: wide
    //   8002: wide
    //   8006: wide
    //   8010: ixor
    //   8011: i2c
    //   8012: castore
    //   8013: wide
    //   8019: goto -5909 -> 2110
    //   8022: bipush 104
    //   8024: wide
    //   8028: goto -34 -> 7994
    //   8031: bipush 113
    //   8033: wide
    //   8037: goto -43 -> 7994
    //   8040: bipush 24
    //   8042: wide
    //   8046: goto -52 -> 7994
    //   8049: bipush 24
    //   8051: wide
    //   8055: goto -61 -> 7994
    //   8058: wide
    //   8062: wide
    //   8066: caload
    //   8067: wide
    //   8071: wide
    //   8075: iconst_5
    //   8076: irem
    //   8077: tableswitch	default:+31 -> 8108, 0:+65->8142, 1:+74->8151, 2:+83->8160, 3:+92->8169
    //   8109: ldiv
    //   8110: wide
    //   8114: wide
    //   8118: wide
    //   8122: wide
    //   8126: wide
    //   8130: ixor
    //   8131: i2c
    //   8132: castore
    //   8133: wide
    //   8139: goto -5977 -> 2162
    //   8142: bipush 104
    //   8144: wide
    //   8148: goto -34 -> 8114
    //   8151: bipush 113
    //   8153: wide
    //   8157: goto -43 -> 8114
    //   8160: bipush 24
    //   8162: wide
    //   8166: goto -52 -> 8114
    //   8169: bipush 24
    //   8171: wide
    //   8175: goto -61 -> 8114
    //   8178: wide
    //   8182: wide
    //   8186: caload
    //   8187: wide
    //   8191: wide
    //   8195: iconst_5
    //   8196: irem
    //   8197: tableswitch	default:+31 -> 8228, 0:+65->8262, 1:+74->8271, 2:+83->8280, 3:+92->8289
    //   8229: ldiv
    //   8230: wide
    //   8234: wide
    //   8238: wide
    //   8242: wide
    //   8246: wide
    //   8250: ixor
    //   8251: i2c
    //   8252: castore
    //   8253: wide
    //   8259: goto -6045 -> 2214
    //   8262: bipush 104
    //   8264: wide
    //   8268: goto -34 -> 8234
    //   8271: bipush 113
    //   8273: wide
    //   8277: goto -43 -> 8234
    //   8280: bipush 24
    //   8282: wide
    //   8286: goto -52 -> 8234
    //   8289: bipush 24
    //   8291: wide
    //   8295: goto -61 -> 8234
    //   8298: wide
    //   8302: wide
    //   8306: caload
    //   8307: wide
    //   8311: wide
    //   8315: iconst_5
    //   8316: irem
    //   8317: tableswitch	default:+31 -> 8348, 0:+65->8382, 1:+74->8391, 2:+83->8400, 3:+92->8409
    //   8349: ldiv
    //   8350: wide
    //   8354: wide
    //   8358: wide
    //   8362: wide
    //   8366: wide
    //   8370: ixor
    //   8371: i2c
    //   8372: castore
    //   8373: wide
    //   8379: goto -6113 -> 2266
    //   8382: bipush 104
    //   8384: wide
    //   8388: goto -34 -> 8354
    //   8391: bipush 113
    //   8393: wide
    //   8397: goto -43 -> 8354
    //   8400: bipush 24
    //   8402: wide
    //   8406: goto -52 -> 8354
    //   8409: bipush 24
    //   8411: wide
    //   8415: goto -61 -> 8354
    //   8418: wide
    //   8422: wide
    //   8426: caload
    //   8427: wide
    //   8431: wide
    //   8435: iconst_5
    //   8436: irem
    //   8437: tableswitch	default:+31 -> 8468, 0:+65->8502, 1:+74->8511, 2:+83->8520, 3:+92->8529
    //   8469: ldiv
    //   8470: wide
    //   8474: wide
    //   8478: wide
    //   8482: wide
    //   8486: wide
    //   8490: ixor
    //   8491: i2c
    //   8492: castore
    //   8493: wide
    //   8499: goto -6181 -> 2318
    //   8502: bipush 104
    //   8504: wide
    //   8508: goto -34 -> 8474
    //   8511: bipush 113
    //   8513: wide
    //   8517: goto -43 -> 8474
    //   8520: bipush 24
    //   8522: wide
    //   8526: goto -52 -> 8474
    //   8529: bipush 24
    //   8531: wide
    //   8535: goto -61 -> 8474
    //   8538: wide
    //   8542: wide
    //   8546: caload
    //   8547: wide
    //   8551: wide
    //   8555: iconst_5
    //   8556: irem
    //   8557: tableswitch	default:+31 -> 8588, 0:+65->8622, 1:+74->8631, 2:+83->8640, 3:+92->8649
    //   8589: ldiv
    //   8590: wide
    //   8594: wide
    //   8598: wide
    //   8602: wide
    //   8606: wide
    //   8610: ixor
    //   8611: i2c
    //   8612: castore
    //   8613: wide
    //   8619: goto -6249 -> 2370
    //   8622: bipush 104
    //   8624: wide
    //   8628: goto -34 -> 8594
    //   8631: bipush 113
    //   8633: wide
    //   8637: goto -43 -> 8594
    //   8640: bipush 24
    //   8642: wide
    //   8646: goto -52 -> 8594
    //   8649: bipush 24
    //   8651: wide
    //   8655: goto -61 -> 8594
    //   8658: wide
    //   8662: wide
    //   8666: caload
    //   8667: wide
    //   8671: wide
    //   8675: iconst_5
    //   8676: irem
    //   8677: tableswitch	default:+31 -> 8708, 0:+65->8742, 1:+74->8751, 2:+83->8760, 3:+92->8769
    //   8709: ldiv
    //   8710: wide
    //   8714: wide
    //   8718: wide
    //   8722: wide
    //   8726: wide
    //   8730: ixor
    //   8731: i2c
    //   8732: castore
    //   8733: wide
    //   8739: goto -6317 -> 2422
    //   8742: bipush 104
    //   8744: wide
    //   8748: goto -34 -> 8714
    //   8751: bipush 113
    //   8753: wide
    //   8757: goto -43 -> 8714
    //   8760: bipush 24
    //   8762: wide
    //   8766: goto -52 -> 8714
    //   8769: bipush 24
    //   8771: wide
    //   8775: goto -61 -> 8714
    //   8778: wide
    //   8782: wide
    //   8786: caload
    //   8787: wide
    //   8791: wide
    //   8795: iconst_5
    //   8796: irem
    //   8797: tableswitch	default:+31 -> 8828, 0:+65->8862, 1:+74->8871, 2:+83->8880, 3:+92->8889
    //   8829: ldiv
    //   8830: wide
    //   8834: wide
    //   8838: wide
    //   8842: wide
    //   8846: wide
    //   8850: ixor
    //   8851: i2c
    //   8852: castore
    //   8853: wide
    //   8859: goto -6385 -> 2474
    //   8862: bipush 104
    //   8864: wide
    //   8868: goto -34 -> 8834
    //   8871: bipush 113
    //   8873: wide
    //   8877: goto -43 -> 8834
    //   8880: bipush 24
    //   8882: wide
    //   8886: goto -52 -> 8834
    //   8889: bipush 24
    //   8891: wide
    //   8895: goto -61 -> 8834
    //   8898: wide
    //   8902: wide
    //   8906: caload
    //   8907: wide
    //   8911: wide
    //   8915: iconst_5
    //   8916: irem
    //   8917: tableswitch	default:+31 -> 8948, 0:+65->8982, 1:+74->8991, 2:+83->9000, 3:+92->9009
    //   8949: ldiv
    //   8950: wide
    //   8954: wide
    //   8958: wide
    //   8962: wide
    //   8966: wide
    //   8970: ixor
    //   8971: i2c
    //   8972: castore
    //   8973: wide
    //   8979: goto -6453 -> 2526
    //   8982: bipush 104
    //   8984: wide
    //   8988: goto -34 -> 8954
    //   8991: bipush 113
    //   8993: wide
    //   8997: goto -43 -> 8954
    //   9000: bipush 24
    //   9002: wide
    //   9006: goto -52 -> 8954
    //   9009: bipush 24
    //   9011: wide
    //   9015: goto -61 -> 8954
    //   9018: wide
    //   9022: wide
    //   9026: caload
    //   9027: wide
    //   9031: wide
    //   9035: iconst_5
    //   9036: irem
    //   9037: tableswitch	default:+31 -> 9068, 0:+65->9102, 1:+74->9111, 2:+83->9120, 3:+92->9129
    //   9069: ldiv
    //   9070: wide
    //   9074: wide
    //   9078: wide
    //   9082: wide
    //   9086: wide
    //   9090: ixor
    //   9091: i2c
    //   9092: castore
    //   9093: wide
    //   9099: goto -6521 -> 2578
    //   9102: bipush 104
    //   9104: wide
    //   9108: goto -34 -> 9074
    //   9111: bipush 113
    //   9113: wide
    //   9117: goto -43 -> 9074
    //   9120: bipush 24
    //   9122: wide
    //   9126: goto -52 -> 9074
    //   9129: bipush 24
    //   9131: wide
    //   9135: goto -61 -> 9074
    //   9138: wide
    //   9142: wide
    //   9146: caload
    //   9147: wide
    //   9151: wide
    //   9155: iconst_5
    //   9156: irem
    //   9157: tableswitch	default:+31 -> 9188, 0:+65->9222, 1:+74->9231, 2:+83->9240, 3:+92->9249
    //   9189: ldiv
    //   9190: wide
    //   9194: wide
    //   9198: wide
    //   9202: wide
    //   9206: wide
    //   9210: ixor
    //   9211: i2c
    //   9212: castore
    //   9213: wide
    //   9219: goto -6589 -> 2630
    //   9222: bipush 104
    //   9224: wide
    //   9228: goto -34 -> 9194
    //   9231: bipush 113
    //   9233: wide
    //   9237: goto -43 -> 9194
    //   9240: bipush 24
    //   9242: wide
    //   9246: goto -52 -> 9194
    //   9249: bipush 24
    //   9251: wide
    //   9255: goto -61 -> 9194
    //   9258: wide
    //   9262: wide
    //   9266: caload
    //   9267: wide
    //   9271: wide
    //   9275: iconst_5
    //   9276: irem
    //   9277: tableswitch	default:+31 -> 9308, 0:+65->9342, 1:+74->9351, 2:+83->9360, 3:+92->9369
    //   9309: ldiv
    //   9310: wide
    //   9314: wide
    //   9318: wide
    //   9322: wide
    //   9326: wide
    //   9330: ixor
    //   9331: i2c
    //   9332: castore
    //   9333: wide
    //   9339: goto -6657 -> 2682
    //   9342: bipush 104
    //   9344: wide
    //   9348: goto -34 -> 9314
    //   9351: bipush 113
    //   9353: wide
    //   9357: goto -43 -> 9314
    //   9360: bipush 24
    //   9362: wide
    //   9366: goto -52 -> 9314
    //   9369: bipush 24
    //   9371: wide
    //   9375: goto -61 -> 9314
    //   9378: wide
    //   9382: wide
    //   9386: caload
    //   9387: wide
    //   9391: wide
    //   9395: iconst_5
    //   9396: irem
    //   9397: tableswitch	default:+31 -> 9428, 0:+65->9462, 1:+74->9471, 2:+83->9480, 3:+92->9489
    //   9429: ldiv
    //   9430: wide
    //   9434: wide
    //   9438: wide
    //   9442: wide
    //   9446: wide
    //   9450: ixor
    //   9451: i2c
    //   9452: castore
    //   9453: wide
    //   9459: goto -6725 -> 2734
    //   9462: bipush 104
    //   9464: wide
    //   9468: goto -34 -> 9434
    //   9471: bipush 113
    //   9473: wide
    //   9477: goto -43 -> 9434
    //   9480: bipush 24
    //   9482: wide
    //   9486: goto -52 -> 9434
    //   9489: bipush 24
    //   9491: wide
    //   9495: goto -61 -> 9434
    //   9498: wide
    //   9502: wide
    //   9506: caload
    //   9507: wide
    //   9511: wide
    //   9515: iconst_5
    //   9516: irem
    //   9517: tableswitch	default:+31 -> 9548, 0:+65->9582, 1:+74->9591, 2:+83->9600, 3:+92->9609
    //   9549: ldiv
    //   9550: wide
    //   9554: wide
    //   9558: wide
    //   9562: wide
    //   9566: wide
    //   9570: ixor
    //   9571: i2c
    //   9572: castore
    //   9573: wide
    //   9579: goto -6793 -> 2786
    //   9582: bipush 104
    //   9584: wide
    //   9588: goto -34 -> 9554
    //   9591: bipush 113
    //   9593: wide
    //   9597: goto -43 -> 9554
    //   9600: bipush 24
    //   9602: wide
    //   9606: goto -52 -> 9554
    //   9609: bipush 24
    //   9611: wide
    //   9615: goto -61 -> 9554
    //   9618: wide
    //   9622: wide
    //   9626: caload
    //   9627: wide
    //   9631: wide
    //   9635: iconst_5
    //   9636: irem
    //   9637: tableswitch	default:+31 -> 9668, 0:+65->9702, 1:+74->9711, 2:+83->9720, 3:+92->9729
    //   9669: ldiv
    //   9670: wide
    //   9674: wide
    //   9678: wide
    //   9682: wide
    //   9686: wide
    //   9690: ixor
    //   9691: i2c
    //   9692: castore
    //   9693: wide
    //   9699: goto -6861 -> 2838
    //   9702: bipush 104
    //   9704: wide
    //   9708: goto -34 -> 9674
    //   9711: bipush 113
    //   9713: wide
    //   9717: goto -43 -> 9674
    //   9720: bipush 24
    //   9722: wide
    //   9726: goto -52 -> 9674
    //   9729: bipush 24
    //   9731: wide
    //   9735: goto -61 -> 9674
  }

  static String a(Settings paramSettings)
  {
    return paramSettings.j;
  }

  static String a(Settings paramSettings, String paramString)
  {
    paramSettings.k = paramString;
    return paramString;
  }

  static HashMap a(Settings paramSettings, HashMap paramHashMap)
  {
    paramSettings.i = paramHashMap;
    return paramHashMap;
  }

  private void a()
  {
    boolean bool = DialogToastListActivity.f;
    long l1 = App.g();
    String str1;
    if (l1 == 0L)
    {
      str1 = getString(2131296276);
      if (!bool);
    }
    else if (l1 == -1L)
    {
      str1 = getString(2131296275);
      if (!bool);
    }
    else
    {
      str1 = t4.i(this, l1);
    }
    String str2 = z[30];
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = str1;
    a(str2, 2131296690, arrayOfObject);
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
    App.a(getBaseContext(), getString(2131296581), 0);
  }

  private void a(String paramString, int paramInt, long paramLong)
  {
    Preference localPreference = findPreference(paramString);
    String str = App.Z.a(paramInt, (int)paramLong);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    localPreference.setSummary(String.format(str, arrayOfObject));
  }

  private void a(String paramString, int paramInt, Object[] paramArrayOfObject)
  {
    findPreference(paramString).setSummary(String.format(getString(paramInt), paramArrayOfObject));
  }

  private void a(String paramString, long paramLong)
  {
    boolean bool = DialogToastListActivity.f;
    double d1 = paramLong;
    int i1 = 0;
    do
    {
      if ((i1 >= 3) || (d1 <= 1024.0D))
        break;
      d1 /= 1024.0D;
      i1++;
    }
    while (!bool);
    int i2;
    switch (i1)
    {
    default:
      i2 = 0;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Double.valueOf(d1);
      a(paramString, i2, arrayOfObject);
      while (true)
      {
        return;
        a(paramString, 2131427339, paramLong);
      }
      i2 = 2131296747;
      if (bool)
      {
        i2 = 2131296748;
        if (bool)
          i2 = 2131296749;
      }
    }
  }

  static String b(Settings paramSettings, String paramString)
  {
    paramSettings.j = paramString;
    return paramString;
  }

  static void b(Settings paramSettings)
  {
    paramSettings.a();
  }

  static HashMap c(Settings paramSettings)
  {
    return paramSettings.i;
  }

  public static void c()
  {
    lr locallr = App.jb();
    if ((locallr instanceof Settings))
      ((Settings)locallr).a();
  }

  static CheckBoxPreference d(Settings paramSettings)
  {
    return paramSettings.f;
  }

  static String e(Settings paramSettings)
  {
    return paramSettings.k;
  }

  public void a(int paramInt)
  {
    this.d = getString(paramInt);
    if (!isFinishing())
      showDialog(500);
  }

  void b()
  {
    Statistics.Data localData = e4.a;
    if (localData != null)
    {
      a(z[63], 2131427338, localData.b());
      a(z[66], 2131427338, localData.a());
      a(z[60], localData.d());
      a(z[62], localData.c());
      a(z[65], localData.f());
      a(z[64], localData.e());
      a(z[67], localData.h());
      a(z[61], localData.g());
      long l1 = localData.i();
      if (l1 != -9223372036854775808L)
      {
        String str2 = z[33];
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = m.format(new Date(l1));
        a(str2, 2131296751, arrayOfObject2);
        if (!DialogToastListActivity.f);
      }
      else
      {
        String str1 = z[33];
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = getString(2131296276);
        a(str1, 2131296751, arrayOfObject1);
      }
    }
  }

  public void c(String paramString)
  {
    this.d = paramString;
    if (!isFinishing())
      showDialog(500);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    if ((paramInt2 == 0) && (paramIntent != null))
    {
      if (paramIntent.getBooleanExtra(z[29], false))
      {
        g5.d(z[21]);
        App.a(this, App.Mb.getString(2131296980));
      }
      if (paramIntent.getBooleanExtra(z[5], false))
      {
        g5.d(z[12]);
        App.a(this, App.Mb.getString(2131296987));
      }
      if (paramIntent.getBooleanExtra(z[14], false))
      {
        g5.d(z[25]);
        App.a(this, App.Mb.getString(2131296988));
      }
    }
    int i6;
    int i7;
    int i1;
    int i2;
    switch (paramInt1)
    {
    default:
    case 18:
    case 17:
      do
      {
        do
          do
          {
            do
            {
              super.onActivityResult(paramInt1, paramInt2, paramIntent);
              return;
              if (paramInt2 != -1)
                break;
            }
            while ((paramIntent == null) || (paramIntent.getData() == null));
            a(paramIntent.getData(), -1, 0, 0);
          }
          while (!bool);
        while ((paramIntent == null) || (!paramIntent.getBooleanExtra(z[9], true)));
        g5.d(z[23]);
        showDialog(7);
      }
      while ((!bool) || (paramInt2 != -1) || (paramIntent == null));
      j4 localj4 = j4.a(this);
      if (getResources().getConfiguration().orientation == 1)
      {
        i6 = g.getHeight() - localj4.c() - Math.round(App.Mb.getResources().getDimension(2131361813));
        i7 = g.getWidth();
        if (!bool)
          break;
      }
      else
      {
        i1 = g.getWidth() - localj4.c() - Math.round(App.Mb.getResources().getDimension(2131361813));
        i2 = g.getHeight();
      }
      break;
    case 104:
    }
    for (int i3 = i1; ; i3 = i6)
    {
      while (true)
      {
        Cursor localCursor;
        if (paramIntent.getData() != null)
        {
          g5.b(z[4] + paramIntent.getData().toString());
          localCursor = App.ib.query(paramIntent.getData(), null, null, null, null);
          if (localCursor == null);
        }
        try
        {
          while (true)
          {
            localCursor.moveToFirst();
            int i5 = localCursor.getColumnIndex(z[15]);
            if ((i5 >= 0) && (localCursor.getString(i5).equals(et.e)))
            {
              BitmapFactory.Options localOptions = new BitmapFactory.Options();
              localOptions.inJustDecodeBounds = true;
              try
              {
                BitmapFactory.decodeStream(App.ib.openInputStream(paramIntent.getData()), null, localOptions);
                if ((localOptions.outWidth == g.getWidth()) && (localOptions.outHeight == i3))
                  a(paramIntent.getData(), -1, 0, 0);
              }
              catch (FileNotFoundException localFileNotFoundException)
              {
                g5.d(localFileNotFoundException);
              }
            }
          }
          if (localCursor != null)
            localCursor.close();
          g5.b(z[27] + i2 + z[28] + i3);
          Intent localIntent = new Intent(this, CropImage.class);
          localIntent.putExtra(z[24], i2);
          localIntent.putExtra(z[17], i3);
          localIntent.putExtra(z[26], 1);
          localIntent.putExtra(z[6], true);
          localIntent.putExtra(z[22], true);
          localIntent.setData(paramIntent.getData());
          localIntent.putExtra(z[10], l.c());
          localIntent.putExtra(z[8], Bitmap.CompressFormat.JPEG.toString());
          startActivityForResult(localIntent, 18);
          if (bool)
          {
            int i4 = paramIntent.getIntExtra(z[13], 0);
            if (i4 != 0)
            {
              g5.b(z[7] + i4 + z[11] + i2 + "," + i3 + "]");
              a(null, i4, i2, i3);
              if (!bool);
            }
            else if (paramIntent.getBooleanExtra(z[19], false))
            {
              l.a(this);
              App.a(getBaseContext(), getString(2131296582), 0);
              g5.b(z[2]);
              if (!bool);
            }
            else if (paramIntent.getBooleanExtra(z[18], false))
            {
              l.a();
              App.a(getBaseContext(), getString(2131296581), 0);
              g5.b(z[3]);
              if (!bool);
            }
            else
            {
              App.a(getBaseContext(), getString(2131296990), 0);
              g5.d(z[20] + paramIntent.toString());
            }
          }
          if ((!bool) || (paramInt2 != -1))
            break;
          this.h = paramIntent.getStringExtra(z[16]);
          showDialog(19);
          break;
        }
        finally
        {
          if (localCursor != null)
            localCursor.close();
        }
      }
      i2 = i7;
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    g = getWindowManager().getDefaultDisplay();
  }

  protected void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    this.e = new ed();
    addPreferencesFromResource(2131034116);
    getContentResolver();
    this.b = getPackageManager();
    g = getWindowManager().getDefaultDisplay();
    findPreference(z[34]).setOnPreferenceClickListener(new y2(this));
    findPreference(z[56]).setOnPreferenceClickListener(new z2(this));
    findPreference(z[41]).setOnPreferenceClickListener(new a3(this));
    findPreference(z[51]).setOnPreferenceClickListener(new c3(this));
    Preference localPreference1 = findPreference(z[55]);
    if (App.p())
    {
      localPreference1.setOnPreferenceClickListener(new d3(this));
      if (bool)
        App.wc = 1 + App.wc;
    }
    else
    {
      ((PreferenceGroup)findPreference(z[37])).removePreference(localPreference1);
    }
    Preference localPreference2 = findPreference(z[53]);
    Object localObject;
    SpannableStringBuilder localSpannableStringBuilder;
    if (App.p())
    {
      ((PreferenceGroup)findPreference(z[57])).removePreference(localPreference2);
      if (!bool);
    }
    else
    {
      String str = localPreference2.getSharedPreferences().getString(z[53], null);
      if (str != null)
      {
        localObject = getString(2131296691) + z[42] + str;
        localSpannableStringBuilder = v4.a((String)localObject, this);
        if (localSpannableStringBuilder != null)
          break label1045;
      }
    }
    while (true)
    {
      localPreference2.setTitle((CharSequence)localObject);
      localPreference2.setOnPreferenceClickListener(new e3(this, localPreference2));
      findPreference(z[50]).setOnPreferenceClickListener(new g3(this));
      CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)findPreference(z[36]);
      localCheckBoxPreference1.setOnPreferenceClickListener(new h3(this, localCheckBoxPreference1));
      CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)findPreference(z[58]);
      if (localCheckBoxPreference2 != null)
        localCheckBoxPreference2.setOnPreferenceClickListener(new i3(this, localCheckBoxPreference2));
      ListPreference localListPreference1 = (ListPreference)findPreference(z[43]);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localListPreference1.getEntry();
      localListPreference1.setTitle(getString(2131296729, arrayOfObject1));
      localListPreference1.setOnPreferenceChangeListener(new j3(this));
      findPreference(z[47]).setOnPreferenceClickListener(new k3(this));
      findPreference(z[32]).setOnPreferenceClickListener(new l3(this));
      findPreference(z[52]).setOnPreferenceClickListener(new m3(this));
      findPreference(z[0]).setOnPreferenceClickListener(new o3(this));
      findPreference(z[44]).setOnPreferenceClickListener(new p3(this));
      ((DialogPreference)findPreference(z[33])).a(new q3(this));
      ListPreference localListPreference2 = (ListPreference)findPreference(z[54]);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localListPreference2.getEntry();
      localListPreference2.setTitle(getString(2131296712, arrayOfObject2));
      localListPreference2.setOnPreferenceChangeListener(this.n);
      ListPreference localListPreference3 = (ListPreference)findPreference(z[46]);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localListPreference3.getEntry();
      localListPreference3.setTitle(getString(2131296712, arrayOfObject3));
      localListPreference3.setOnPreferenceChangeListener(this.n);
      ListPreference localListPreference4 = (ListPreference)findPreference(z[39]);
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = localListPreference4.getEntry();
      localListPreference4.setTitle(getString(2131296703, arrayOfObject4));
      localListPreference4.setOnPreferenceChangeListener(this.o);
      ListPreference localListPreference5 = (ListPreference)findPreference(z[48]);
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = localListPreference5.getEntry();
      localListPreference5.setTitle(getString(2131296703, arrayOfObject5));
      localListPreference5.setOnPreferenceChangeListener(this.o);
      ListPreference localListPreference6 = (ListPreference)findPreference(z[31]);
      localListPreference6.setSummary(localListPreference6.getEntry());
      localListPreference6.setOnPreferenceChangeListener(this.p);
      ListPreference localListPreference7 = (ListPreference)findPreference(z[38]);
      localListPreference7.setSummary(localListPreference7.getEntry());
      localListPreference7.setOnPreferenceChangeListener(this.p);
      if ((Build.MANUFACTURER.replace(' ', '_').equalsIgnoreCase(z[40])) && (getPreferenceScreen() != null))
      {
        PreferenceCategory localPreferenceCategory1 = (PreferenceCategory)findPreference(z[35]);
        if (localPreferenceCategory1 != null)
          localPreferenceCategory1.removePreference(localListPreference2);
        PreferenceCategory localPreferenceCategory2 = (PreferenceCategory)findPreference(z[45]);
        if (localPreferenceCategory2 != null)
          localPreferenceCategory2.removePreference(localListPreference3);
      }
      this.f = ((CheckBoxPreference)findPreference(z[49]));
      this.f.setOnPreferenceClickListener(new r3(this));
      findPreference(z[30]).setOnPreferenceClickListener(new s3(this));
      findPreference(z[59]).setOnPreferenceClickListener(new t3(this));
      return;
      label1045: localObject = localSpannableStringBuilder;
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 7:
    case 500:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 15:
    case 16:
    case 101:
    case 102:
    case 103:
    case 19:
    case 17:
    case 18:
    }
    while (true)
    {
      return localObject;
      localObject = new AlertDialog.Builder(this).setMessage(getString(2131296734)).setNeutralButton(2131296270, new q2(this)).create();
      if (bool)
      {
        localObject = new AlertDialog.Builder(this).setMessage(this.d).setNeutralButton(2131296270, new b3(this)).create();
        continue;
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(14, 0);
        localCalendar.set(13, 0);
        localCalendar.set(12, 0);
        localCalendar.set(11, 4);
        f localf = new f(this);
        localf.setTitle(getString(2131296935));
        int i3;
        label298: int i2;
        label377: AlertDialog.Builder localBuilder3;
        if (App.tb())
        {
          i3 = 2131296736;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = t4.g(this, localCalendar.getTimeInMillis());
          localf.setMessage(getString(i3, arrayOfObject3));
          localf.setIndeterminate(true);
          localf.setCancelable(false);
          if (bool)
          {
            AlertDialog.Builder localBuilder4 = new AlertDialog.Builder(this).setTitle(getString(2131296940));
            if (App.tb())
            {
              i2 = 2131296426;
              localObject = localBuilder4.setMessage(getString(i2)).setNeutralButton(2131296270, new n3(this)).create();
              if (!bool)
                continue;
              localBuilder3 = new AlertDialog.Builder(this).setTitle(getString(2131296940));
              if (!App.tb())
                break label607;
            }
          }
        }
        else
        {
          label607: for (int i1 = 2131296424; ; i1 = 2131296425)
          {
            localObject = localBuilder3.setMessage(getString(i1)).setNeutralButton(2131296270, new u3(this)).create();
            if (!bool)
              break;
            localObject = new ProgressDialog(this);
            ((ProgressDialog)localObject).setMessage(getString(2131296335));
            ((ProgressDialog)localObject).setIndeterminate(true);
            ((ProgressDialog)localObject).setCancelable(false);
            if (!bool)
              break;
            localObject = new AlertDialog.Builder(this).setMessage(2131296721).setPositiveButton(2131296272, new w3(this)).setNegativeButton(2131296268, new v3(this)).create();
            if (!bool)
              break;
            localObject = new ProgressDialog(this);
            ((ProgressDialog)localObject).setMessage(getString(2131296337));
            ((ProgressDialog)localObject).setIndeterminate(true);
            ((ProgressDialog)localObject).setCancelable(false);
            break;
            i3 = 2131296737;
            break label298;
            i2 = 2131296427;
            break label377;
          }
          AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(this).setTitle(2131296327);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = getString(2131296328);
          localObject = localBuilder2.setMessage(getString(2131296338, arrayOfObject2)).setNeutralButton(2131296270, new x3(this)).create();
          continue;
          localObject = new ProgressDialog(this);
          ((ProgressDialog)localObject).setMessage(getString(2131296394));
          ((ProgressDialog)localObject).setIndeterminate(true);
          ((ProgressDialog)localObject).setCancelable(false);
          continue;
          localObject = new f(this);
          ((f)localObject).setTitle(getString(2131296393));
          ((f)localObject).setMessage(getString(2131296394));
          ((f)localObject).setIndeterminate(true);
          ((f)localObject).setCancelable(false);
          continue;
          AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this).setTitle(2131296327);
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = getString(2131296328);
          localObject = localBuilder1.setMessage(getString(2131296338, arrayOfObject1)).setNeutralButton(2131296270, new y3(this)).create();
          continue;
          localObject = new AlertDialog.Builder(this).setMessage(2131296339).setPositiveButton(2131296288, new r2(this)).setNegativeButton(2131296268, new z3(this)).create();
          continue;
          if (this.h == null)
          {
            localObject = super.onCreateDialog(paramInt);
            if (!bool);
          }
          else
          {
            zq localzq = App.w.a(this.h, null);
            localObject = new AlertDialog.Builder(this).setMessage(2131296561).setPositiveButton(2131296562, new t2(this, localzq)).setNeutralButton(2131296563, new s2(this, localzq)).create();
            continue;
            localObject = new ProgressDialog(this);
            ((ProgressDialog)localObject).setTitle(getString(2131296393));
            ((ProgressDialog)localObject).setMessage(getString(2131296394));
            ((ProgressDialog)localObject).setIndeterminate(true);
            ((ProgressDialog)localObject).setCancelable(false);
            continue;
            localObject = new AlertDialog.Builder(this).setMessage(2131296548).setNeutralButton(2131296270, new u2(this)).create();
            continue;
            localObject = localf;
          }
        }
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    App.a(null);
  }

  protected void onPause()
  {
    super.onPause();
    this.c = false;
    App.b(this);
    if (this.e.hasMessages(0))
      this.e.removeMessages(0);
    App.nb();
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
    case 103:
    }
    while (true)
    {
      return;
      if (this.k != null)
        ((AlertDialog)paramDialog).setMessage(this.k);
    }
  }

  protected void onResume()
  {
    super.onResume();
    if (App.c(this) != 3)
    {
      g5.b(z[1] + App.c(this));
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      this.c = true;
      b();
      App.a(this);
      this.e.sendEmptyMessageDelayed(0, 3000L);
      a();
      Preference localPreference = findPreference(z[0]);
      int i1 = App.yb.size();
      String str;
      if (i1 > 0)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i1);
        str = getString(2131296714, arrayOfObject2);
        if (!DialogToastListActivity.f);
      }
      else
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = getString(2131296290);
        str = getString(2131296714, arrayOfObject1);
      }
      localPreference.setTitle(str);
    }
  }
}