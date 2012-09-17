package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.whatsapp.App;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.cg;
import com.whatsapp.g5;
import com.whatsapp.p5;
import com.whatsapp.tc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MessageService extends Service
{
  public static int C;
  private static final String[] D;
  private BroadcastReceiver A = new MessageService.1(this);
  private Handler B = new g(this);
  private boolean a = false;
  private m b;
  private final j c = new j(this);
  private Messenger d;
  private final Messenger e = new Messenger(new i(this));
  private Messenger f;
  private Messenger g = new Messenger(new h(this));
  private boolean h;
  private boolean i = false;
  private String j;
  private String k;
  private AlarmManager l;
  private ConnectivityManager m;
  private boolean n = false;
  private int o = -1;
  private final p5 p = new p5(true);
  private long q = 10000L;
  private long r = 20000L;
  private boolean s = true;
  private boolean t = true;
  private boolean u = true;
  private boolean v = false;
  private boolean w = true;
  private Handler x = null;
  private boolean y = false;
  private boolean z = false;

  static
  {
    // Byte code:
    //   0: bipush 55
    //   2: anewarray 51	java/lang/String
    //   5: astore_0
    //   6: ldc 53
    //   8: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   11: astore_1
    //   12: aload_1
    //   13: arraylength
    //   14: istore_2
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_2
    //   18: iload_3
    //   19: if_icmpgt +2125 -> 2144
    //   22: aload_0
    //   23: iconst_0
    //   24: new 51	java/lang/String
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 61	java/lang/String:<init>	([C)V
    //   32: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   35: aastore
    //   36: ldc 67
    //   38: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   41: astore 6
    //   43: aload 6
    //   45: arraylength
    //   46: istore 7
    //   48: iconst_0
    //   49: istore 8
    //   51: iload 7
    //   53: iload 8
    //   55: if_icmpgt +2176 -> 2231
    //   58: aload_0
    //   59: iconst_1
    //   60: new 51	java/lang/String
    //   63: dup
    //   64: aload 6
    //   66: invokespecial 61	java/lang/String:<init>	([C)V
    //   69: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   72: aastore
    //   73: ldc 69
    //   75: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   78: astore 11
    //   80: aload 11
    //   82: arraylength
    //   83: istore 12
    //   85: iconst_0
    //   86: istore 13
    //   88: iload 12
    //   90: iload 13
    //   92: if_icmpgt +2229 -> 2321
    //   95: aload_0
    //   96: iconst_2
    //   97: new 51	java/lang/String
    //   100: dup
    //   101: aload 11
    //   103: invokespecial 61	java/lang/String:<init>	([C)V
    //   106: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   109: aastore
    //   110: ldc 71
    //   112: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   115: astore 16
    //   117: aload 16
    //   119: arraylength
    //   120: istore 17
    //   122: iconst_0
    //   123: istore 18
    //   125: iload 17
    //   127: iload 18
    //   129: if_icmpgt +2284 -> 2413
    //   132: aload_0
    //   133: iconst_3
    //   134: new 51	java/lang/String
    //   137: dup
    //   138: aload 16
    //   140: invokespecial 61	java/lang/String:<init>	([C)V
    //   143: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   146: aastore
    //   147: ldc 73
    //   149: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   152: astore 21
    //   154: aload 21
    //   156: arraylength
    //   157: istore 22
    //   159: iconst_0
    //   160: istore 23
    //   162: iload 22
    //   164: iload 23
    //   166: if_icmpgt +2339 -> 2505
    //   169: aload_0
    //   170: iconst_4
    //   171: new 51	java/lang/String
    //   174: dup
    //   175: aload 21
    //   177: invokespecial 61	java/lang/String:<init>	([C)V
    //   180: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   183: aastore
    //   184: ldc 75
    //   186: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   189: astore 26
    //   191: aload 26
    //   193: arraylength
    //   194: istore 27
    //   196: iconst_0
    //   197: istore 28
    //   199: iload 27
    //   201: iload 28
    //   203: if_icmpgt +2394 -> 2597
    //   206: aload_0
    //   207: iconst_5
    //   208: new 51	java/lang/String
    //   211: dup
    //   212: aload 26
    //   214: invokespecial 61	java/lang/String:<init>	([C)V
    //   217: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   220: aastore
    //   221: ldc 77
    //   223: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   226: astore 31
    //   228: aload 31
    //   230: arraylength
    //   231: istore 32
    //   233: iconst_0
    //   234: istore 33
    //   236: iload 32
    //   238: iload 33
    //   240: if_icmpgt +2449 -> 2689
    //   243: aload_0
    //   244: bipush 6
    //   246: new 51	java/lang/String
    //   249: dup
    //   250: aload 31
    //   252: invokespecial 61	java/lang/String:<init>	([C)V
    //   255: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   258: aastore
    //   259: ldc 79
    //   261: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   264: astore 36
    //   266: aload 36
    //   268: arraylength
    //   269: istore 37
    //   271: iconst_0
    //   272: istore 38
    //   274: iload 37
    //   276: iload 38
    //   278: if_icmpgt +2503 -> 2781
    //   281: aload_0
    //   282: bipush 7
    //   284: new 51	java/lang/String
    //   287: dup
    //   288: aload 36
    //   290: invokespecial 61	java/lang/String:<init>	([C)V
    //   293: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   296: aastore
    //   297: ldc 81
    //   299: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   302: astore 41
    //   304: aload 41
    //   306: arraylength
    //   307: istore 42
    //   309: iconst_0
    //   310: istore 43
    //   312: iload 42
    //   314: iload 43
    //   316: if_icmpgt +2557 -> 2873
    //   319: aload_0
    //   320: bipush 8
    //   322: new 51	java/lang/String
    //   325: dup
    //   326: aload 41
    //   328: invokespecial 61	java/lang/String:<init>	([C)V
    //   331: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   334: aastore
    //   335: ldc 83
    //   337: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   340: astore 46
    //   342: aload 46
    //   344: arraylength
    //   345: istore 47
    //   347: iconst_0
    //   348: istore 48
    //   350: iload 47
    //   352: iload 48
    //   354: if_icmpgt +2611 -> 2965
    //   357: aload_0
    //   358: bipush 9
    //   360: new 51	java/lang/String
    //   363: dup
    //   364: aload 46
    //   366: invokespecial 61	java/lang/String:<init>	([C)V
    //   369: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   372: aastore
    //   373: ldc 85
    //   375: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   378: astore 51
    //   380: aload 51
    //   382: arraylength
    //   383: istore 52
    //   385: iconst_0
    //   386: istore 53
    //   388: iload 52
    //   390: iload 53
    //   392: if_icmpgt +2665 -> 3057
    //   395: aload_0
    //   396: bipush 10
    //   398: new 51	java/lang/String
    //   401: dup
    //   402: aload 51
    //   404: invokespecial 61	java/lang/String:<init>	([C)V
    //   407: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   410: aastore
    //   411: ldc 87
    //   413: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   416: astore 56
    //   418: aload 56
    //   420: arraylength
    //   421: istore 57
    //   423: iconst_0
    //   424: istore 58
    //   426: iload 57
    //   428: iload 58
    //   430: if_icmpgt +2719 -> 3149
    //   433: aload_0
    //   434: bipush 11
    //   436: new 51	java/lang/String
    //   439: dup
    //   440: aload 56
    //   442: invokespecial 61	java/lang/String:<init>	([C)V
    //   445: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   448: aastore
    //   449: ldc 89
    //   451: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   454: astore 61
    //   456: aload 61
    //   458: arraylength
    //   459: istore 62
    //   461: iconst_0
    //   462: istore 63
    //   464: iload 62
    //   466: iload 63
    //   468: if_icmpgt +2773 -> 3241
    //   471: aload_0
    //   472: bipush 12
    //   474: new 51	java/lang/String
    //   477: dup
    //   478: aload 61
    //   480: invokespecial 61	java/lang/String:<init>	([C)V
    //   483: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   486: aastore
    //   487: ldc 91
    //   489: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   492: astore 66
    //   494: aload 66
    //   496: arraylength
    //   497: istore 67
    //   499: iconst_0
    //   500: istore 68
    //   502: iload 67
    //   504: iload 68
    //   506: if_icmpgt +2827 -> 3333
    //   509: aload_0
    //   510: bipush 13
    //   512: new 51	java/lang/String
    //   515: dup
    //   516: aload 66
    //   518: invokespecial 61	java/lang/String:<init>	([C)V
    //   521: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   524: aastore
    //   525: ldc 93
    //   527: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   530: astore 71
    //   532: aload 71
    //   534: arraylength
    //   535: istore 72
    //   537: iconst_0
    //   538: istore 73
    //   540: iload 72
    //   542: iload 73
    //   544: if_icmpgt +2881 -> 3425
    //   547: aload_0
    //   548: bipush 14
    //   550: new 51	java/lang/String
    //   553: dup
    //   554: aload 71
    //   556: invokespecial 61	java/lang/String:<init>	([C)V
    //   559: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   562: aastore
    //   563: ldc 95
    //   565: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   568: astore 76
    //   570: aload 76
    //   572: arraylength
    //   573: istore 77
    //   575: iconst_0
    //   576: istore 78
    //   578: iload 77
    //   580: iload 78
    //   582: if_icmpgt +2935 -> 3517
    //   585: aload_0
    //   586: bipush 15
    //   588: new 51	java/lang/String
    //   591: dup
    //   592: aload 76
    //   594: invokespecial 61	java/lang/String:<init>	([C)V
    //   597: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   600: aastore
    //   601: ldc 97
    //   603: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   606: astore 81
    //   608: aload 81
    //   610: arraylength
    //   611: istore 82
    //   613: iconst_0
    //   614: istore 83
    //   616: iload 82
    //   618: iload 83
    //   620: if_icmpgt +2989 -> 3609
    //   623: aload_0
    //   624: bipush 16
    //   626: new 51	java/lang/String
    //   629: dup
    //   630: aload 81
    //   632: invokespecial 61	java/lang/String:<init>	([C)V
    //   635: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   638: aastore
    //   639: ldc 99
    //   641: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   644: astore 86
    //   646: aload 86
    //   648: arraylength
    //   649: istore 87
    //   651: iconst_0
    //   652: istore 88
    //   654: iload 87
    //   656: iload 88
    //   658: if_icmpgt +3043 -> 3701
    //   661: aload_0
    //   662: bipush 17
    //   664: new 51	java/lang/String
    //   667: dup
    //   668: aload 86
    //   670: invokespecial 61	java/lang/String:<init>	([C)V
    //   673: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   676: aastore
    //   677: ldc 101
    //   679: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   682: astore 91
    //   684: aload 91
    //   686: arraylength
    //   687: istore 92
    //   689: iconst_0
    //   690: istore 93
    //   692: iload 92
    //   694: iload 93
    //   696: if_icmpgt +3097 -> 3793
    //   699: aload_0
    //   700: bipush 18
    //   702: new 51	java/lang/String
    //   705: dup
    //   706: aload 91
    //   708: invokespecial 61	java/lang/String:<init>	([C)V
    //   711: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   714: aastore
    //   715: ldc 103
    //   717: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   720: astore 96
    //   722: aload 96
    //   724: arraylength
    //   725: istore 97
    //   727: iconst_0
    //   728: istore 98
    //   730: iload 97
    //   732: iload 98
    //   734: if_icmpgt +3151 -> 3885
    //   737: aload_0
    //   738: bipush 19
    //   740: new 51	java/lang/String
    //   743: dup
    //   744: aload 96
    //   746: invokespecial 61	java/lang/String:<init>	([C)V
    //   749: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   752: aastore
    //   753: ldc 105
    //   755: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   758: astore 101
    //   760: aload 101
    //   762: arraylength
    //   763: istore 102
    //   765: iconst_0
    //   766: istore 103
    //   768: iload 102
    //   770: iload 103
    //   772: if_icmpgt +3205 -> 3977
    //   775: aload_0
    //   776: bipush 20
    //   778: new 51	java/lang/String
    //   781: dup
    //   782: aload 101
    //   784: invokespecial 61	java/lang/String:<init>	([C)V
    //   787: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   790: aastore
    //   791: ldc 107
    //   793: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   796: astore 106
    //   798: aload 106
    //   800: arraylength
    //   801: istore 107
    //   803: iconst_0
    //   804: istore 108
    //   806: iload 107
    //   808: iload 108
    //   810: if_icmpgt +3259 -> 4069
    //   813: aload_0
    //   814: bipush 21
    //   816: new 51	java/lang/String
    //   819: dup
    //   820: aload 106
    //   822: invokespecial 61	java/lang/String:<init>	([C)V
    //   825: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   828: aastore
    //   829: ldc 109
    //   831: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   834: astore 111
    //   836: aload 111
    //   838: arraylength
    //   839: istore 112
    //   841: iconst_0
    //   842: istore 113
    //   844: iload 112
    //   846: iload 113
    //   848: if_icmpgt +3313 -> 4161
    //   851: aload_0
    //   852: bipush 22
    //   854: new 51	java/lang/String
    //   857: dup
    //   858: aload 111
    //   860: invokespecial 61	java/lang/String:<init>	([C)V
    //   863: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   866: aastore
    //   867: ldc 111
    //   869: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   872: astore 116
    //   874: aload 116
    //   876: arraylength
    //   877: istore 117
    //   879: iconst_0
    //   880: istore 118
    //   882: iload 117
    //   884: iload 118
    //   886: if_icmpgt +3367 -> 4253
    //   889: aload_0
    //   890: bipush 23
    //   892: new 51	java/lang/String
    //   895: dup
    //   896: aload 116
    //   898: invokespecial 61	java/lang/String:<init>	([C)V
    //   901: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   904: aastore
    //   905: ldc 113
    //   907: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   910: astore 121
    //   912: aload 121
    //   914: arraylength
    //   915: istore 122
    //   917: iconst_0
    //   918: istore 123
    //   920: iload 122
    //   922: iload 123
    //   924: if_icmpgt +3421 -> 4345
    //   927: aload_0
    //   928: bipush 24
    //   930: new 51	java/lang/String
    //   933: dup
    //   934: aload 121
    //   936: invokespecial 61	java/lang/String:<init>	([C)V
    //   939: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   942: aastore
    //   943: ldc 115
    //   945: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   948: astore 126
    //   950: aload 126
    //   952: arraylength
    //   953: istore 127
    //   955: iconst_0
    //   956: istore 128
    //   958: iload 127
    //   960: iload 128
    //   962: if_icmpgt +3475 -> 4437
    //   965: aload_0
    //   966: bipush 25
    //   968: new 51	java/lang/String
    //   971: dup
    //   972: aload 126
    //   974: invokespecial 61	java/lang/String:<init>	([C)V
    //   977: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   980: aastore
    //   981: ldc 117
    //   983: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   986: astore 131
    //   988: aload 131
    //   990: arraylength
    //   991: istore 132
    //   993: iconst_0
    //   994: istore 133
    //   996: iload 132
    //   998: iload 133
    //   1000: if_icmpgt +3529 -> 4529
    //   1003: aload_0
    //   1004: bipush 26
    //   1006: new 51	java/lang/String
    //   1009: dup
    //   1010: aload 131
    //   1012: invokespecial 61	java/lang/String:<init>	([C)V
    //   1015: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1018: aastore
    //   1019: ldc 119
    //   1021: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1024: astore 136
    //   1026: aload 136
    //   1028: arraylength
    //   1029: istore 137
    //   1031: iconst_0
    //   1032: istore 138
    //   1034: iload 137
    //   1036: iload 138
    //   1038: if_icmpgt +3583 -> 4621
    //   1041: aload_0
    //   1042: bipush 27
    //   1044: new 51	java/lang/String
    //   1047: dup
    //   1048: aload 136
    //   1050: invokespecial 61	java/lang/String:<init>	([C)V
    //   1053: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1056: aastore
    //   1057: ldc 121
    //   1059: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1062: astore 141
    //   1064: aload 141
    //   1066: arraylength
    //   1067: istore 142
    //   1069: iconst_0
    //   1070: istore 143
    //   1072: iload 142
    //   1074: iload 143
    //   1076: if_icmpgt +3637 -> 4713
    //   1079: aload_0
    //   1080: bipush 28
    //   1082: new 51	java/lang/String
    //   1085: dup
    //   1086: aload 141
    //   1088: invokespecial 61	java/lang/String:<init>	([C)V
    //   1091: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1094: aastore
    //   1095: ldc 123
    //   1097: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1100: astore 146
    //   1102: aload 146
    //   1104: arraylength
    //   1105: istore 147
    //   1107: iconst_0
    //   1108: istore 148
    //   1110: iload 147
    //   1112: iload 148
    //   1114: if_icmpgt +3691 -> 4805
    //   1117: aload_0
    //   1118: bipush 29
    //   1120: new 51	java/lang/String
    //   1123: dup
    //   1124: aload 146
    //   1126: invokespecial 61	java/lang/String:<init>	([C)V
    //   1129: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1132: aastore
    //   1133: ldc 125
    //   1135: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1138: astore 151
    //   1140: aload 151
    //   1142: arraylength
    //   1143: istore 152
    //   1145: iconst_0
    //   1146: istore 153
    //   1148: iload 152
    //   1150: iload 153
    //   1152: if_icmpgt +3745 -> 4897
    //   1155: aload_0
    //   1156: bipush 30
    //   1158: new 51	java/lang/String
    //   1161: dup
    //   1162: aload 151
    //   1164: invokespecial 61	java/lang/String:<init>	([C)V
    //   1167: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1170: aastore
    //   1171: ldc 127
    //   1173: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1176: astore 156
    //   1178: aload 156
    //   1180: arraylength
    //   1181: istore 157
    //   1183: iconst_0
    //   1184: istore 158
    //   1186: iload 157
    //   1188: iload 158
    //   1190: if_icmpgt +3799 -> 4989
    //   1193: aload_0
    //   1194: bipush 31
    //   1196: new 51	java/lang/String
    //   1199: dup
    //   1200: aload 156
    //   1202: invokespecial 61	java/lang/String:<init>	([C)V
    //   1205: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1208: aastore
    //   1209: ldc 129
    //   1211: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1214: astore 161
    //   1216: aload 161
    //   1218: arraylength
    //   1219: istore 162
    //   1221: iconst_0
    //   1222: istore 163
    //   1224: iload 162
    //   1226: iload 163
    //   1228: if_icmpgt +3853 -> 5081
    //   1231: aload_0
    //   1232: bipush 32
    //   1234: new 51	java/lang/String
    //   1237: dup
    //   1238: aload 161
    //   1240: invokespecial 61	java/lang/String:<init>	([C)V
    //   1243: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1246: aastore
    //   1247: ldc 131
    //   1249: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1252: astore 166
    //   1254: aload 166
    //   1256: arraylength
    //   1257: istore 167
    //   1259: iconst_0
    //   1260: istore 168
    //   1262: iload 167
    //   1264: iload 168
    //   1266: if_icmpgt +3907 -> 5173
    //   1269: aload_0
    //   1270: bipush 33
    //   1272: new 51	java/lang/String
    //   1275: dup
    //   1276: aload 166
    //   1278: invokespecial 61	java/lang/String:<init>	([C)V
    //   1281: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1284: aastore
    //   1285: ldc 133
    //   1287: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1290: astore 171
    //   1292: aload 171
    //   1294: arraylength
    //   1295: istore 172
    //   1297: iconst_0
    //   1298: istore 173
    //   1300: iload 172
    //   1302: iload 173
    //   1304: if_icmpgt +3961 -> 5265
    //   1307: aload_0
    //   1308: bipush 34
    //   1310: new 51	java/lang/String
    //   1313: dup
    //   1314: aload 171
    //   1316: invokespecial 61	java/lang/String:<init>	([C)V
    //   1319: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1322: aastore
    //   1323: ldc 135
    //   1325: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1328: astore 176
    //   1330: aload 176
    //   1332: arraylength
    //   1333: istore 177
    //   1335: iconst_0
    //   1336: istore 178
    //   1338: iload 177
    //   1340: iload 178
    //   1342: if_icmpgt +4015 -> 5357
    //   1345: aload_0
    //   1346: bipush 35
    //   1348: new 51	java/lang/String
    //   1351: dup
    //   1352: aload 176
    //   1354: invokespecial 61	java/lang/String:<init>	([C)V
    //   1357: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1360: aastore
    //   1361: ldc 137
    //   1363: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1366: astore 181
    //   1368: aload 181
    //   1370: arraylength
    //   1371: istore 182
    //   1373: iconst_0
    //   1374: istore 183
    //   1376: iload 182
    //   1378: iload 183
    //   1380: if_icmpgt +4069 -> 5449
    //   1383: aload_0
    //   1384: bipush 36
    //   1386: new 51	java/lang/String
    //   1389: dup
    //   1390: aload 181
    //   1392: invokespecial 61	java/lang/String:<init>	([C)V
    //   1395: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1398: aastore
    //   1399: ldc 139
    //   1401: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1404: astore 186
    //   1406: aload 186
    //   1408: arraylength
    //   1409: istore 187
    //   1411: iconst_0
    //   1412: istore 188
    //   1414: iload 187
    //   1416: iload 188
    //   1418: if_icmpgt +4123 -> 5541
    //   1421: aload_0
    //   1422: bipush 37
    //   1424: new 51	java/lang/String
    //   1427: dup
    //   1428: aload 186
    //   1430: invokespecial 61	java/lang/String:<init>	([C)V
    //   1433: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1436: aastore
    //   1437: ldc 141
    //   1439: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1442: astore 191
    //   1444: aload 191
    //   1446: arraylength
    //   1447: istore 192
    //   1449: iconst_0
    //   1450: istore 193
    //   1452: iload 192
    //   1454: iload 193
    //   1456: if_icmpgt +4177 -> 5633
    //   1459: aload_0
    //   1460: bipush 38
    //   1462: new 51	java/lang/String
    //   1465: dup
    //   1466: aload 191
    //   1468: invokespecial 61	java/lang/String:<init>	([C)V
    //   1471: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1474: aastore
    //   1475: ldc 143
    //   1477: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1480: astore 196
    //   1482: aload 196
    //   1484: arraylength
    //   1485: istore 197
    //   1487: iconst_0
    //   1488: istore 198
    //   1490: iload 197
    //   1492: iload 198
    //   1494: if_icmpgt +4231 -> 5725
    //   1497: aload_0
    //   1498: bipush 39
    //   1500: new 51	java/lang/String
    //   1503: dup
    //   1504: aload 196
    //   1506: invokespecial 61	java/lang/String:<init>	([C)V
    //   1509: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1512: aastore
    //   1513: ldc 145
    //   1515: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1518: astore 201
    //   1520: aload 201
    //   1522: arraylength
    //   1523: istore 202
    //   1525: iconst_0
    //   1526: istore 203
    //   1528: iload 202
    //   1530: iload 203
    //   1532: if_icmpgt +4285 -> 5817
    //   1535: aload_0
    //   1536: bipush 40
    //   1538: new 51	java/lang/String
    //   1541: dup
    //   1542: aload 201
    //   1544: invokespecial 61	java/lang/String:<init>	([C)V
    //   1547: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1550: aastore
    //   1551: ldc 147
    //   1553: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1556: astore 206
    //   1558: aload 206
    //   1560: arraylength
    //   1561: istore 207
    //   1563: iconst_0
    //   1564: istore 208
    //   1566: iload 207
    //   1568: iload 208
    //   1570: if_icmpgt +4339 -> 5909
    //   1573: aload_0
    //   1574: bipush 41
    //   1576: new 51	java/lang/String
    //   1579: dup
    //   1580: aload 206
    //   1582: invokespecial 61	java/lang/String:<init>	([C)V
    //   1585: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1588: aastore
    //   1589: ldc 149
    //   1591: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1594: astore 211
    //   1596: aload 211
    //   1598: arraylength
    //   1599: istore 212
    //   1601: iconst_0
    //   1602: istore 213
    //   1604: iload 212
    //   1606: iload 213
    //   1608: if_icmpgt +4393 -> 6001
    //   1611: aload_0
    //   1612: bipush 42
    //   1614: new 51	java/lang/String
    //   1617: dup
    //   1618: aload 211
    //   1620: invokespecial 61	java/lang/String:<init>	([C)V
    //   1623: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1626: aastore
    //   1627: ldc 151
    //   1629: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1632: astore 216
    //   1634: aload 216
    //   1636: arraylength
    //   1637: istore 217
    //   1639: iconst_0
    //   1640: istore 218
    //   1642: iload 217
    //   1644: iload 218
    //   1646: if_icmpgt +4447 -> 6093
    //   1649: aload_0
    //   1650: bipush 43
    //   1652: new 51	java/lang/String
    //   1655: dup
    //   1656: aload 216
    //   1658: invokespecial 61	java/lang/String:<init>	([C)V
    //   1661: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1664: aastore
    //   1665: ldc 153
    //   1667: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1670: astore 221
    //   1672: aload 221
    //   1674: arraylength
    //   1675: istore 222
    //   1677: iconst_0
    //   1678: istore 223
    //   1680: iload 222
    //   1682: iload 223
    //   1684: if_icmpgt +4501 -> 6185
    //   1687: aload_0
    //   1688: bipush 44
    //   1690: new 51	java/lang/String
    //   1693: dup
    //   1694: aload 221
    //   1696: invokespecial 61	java/lang/String:<init>	([C)V
    //   1699: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1702: aastore
    //   1703: ldc 155
    //   1705: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1708: astore 226
    //   1710: aload 226
    //   1712: arraylength
    //   1713: istore 227
    //   1715: iconst_0
    //   1716: istore 228
    //   1718: iload 227
    //   1720: iload 228
    //   1722: if_icmpgt +4555 -> 6277
    //   1725: aload_0
    //   1726: bipush 45
    //   1728: new 51	java/lang/String
    //   1731: dup
    //   1732: aload 226
    //   1734: invokespecial 61	java/lang/String:<init>	([C)V
    //   1737: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1740: aastore
    //   1741: ldc 157
    //   1743: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1746: astore 231
    //   1748: aload 231
    //   1750: arraylength
    //   1751: istore 232
    //   1753: iconst_0
    //   1754: istore 233
    //   1756: iload 232
    //   1758: iload 233
    //   1760: if_icmpgt +4609 -> 6369
    //   1763: aload_0
    //   1764: bipush 46
    //   1766: new 51	java/lang/String
    //   1769: dup
    //   1770: aload 231
    //   1772: invokespecial 61	java/lang/String:<init>	([C)V
    //   1775: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1778: aastore
    //   1779: ldc 159
    //   1781: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1784: astore 236
    //   1786: aload 236
    //   1788: arraylength
    //   1789: istore 237
    //   1791: iconst_0
    //   1792: istore 238
    //   1794: iload 237
    //   1796: iload 238
    //   1798: if_icmpgt +4663 -> 6461
    //   1801: aload_0
    //   1802: bipush 47
    //   1804: new 51	java/lang/String
    //   1807: dup
    //   1808: aload 236
    //   1810: invokespecial 61	java/lang/String:<init>	([C)V
    //   1813: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1816: aastore
    //   1817: ldc 161
    //   1819: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1822: astore 241
    //   1824: aload 241
    //   1826: arraylength
    //   1827: istore 242
    //   1829: iconst_0
    //   1830: istore 243
    //   1832: iload 242
    //   1834: iload 243
    //   1836: if_icmpgt +4717 -> 6553
    //   1839: aload_0
    //   1840: bipush 48
    //   1842: new 51	java/lang/String
    //   1845: dup
    //   1846: aload 241
    //   1848: invokespecial 61	java/lang/String:<init>	([C)V
    //   1851: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1854: aastore
    //   1855: ldc 163
    //   1857: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1860: astore 246
    //   1862: aload 246
    //   1864: arraylength
    //   1865: istore 247
    //   1867: iconst_0
    //   1868: istore 248
    //   1870: iload 247
    //   1872: iload 248
    //   1874: if_icmpgt +4771 -> 6645
    //   1877: aload_0
    //   1878: bipush 49
    //   1880: new 51	java/lang/String
    //   1883: dup
    //   1884: aload 246
    //   1886: invokespecial 61	java/lang/String:<init>	([C)V
    //   1889: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1892: aastore
    //   1893: ldc 165
    //   1895: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1898: astore 251
    //   1900: aload 251
    //   1902: arraylength
    //   1903: istore 252
    //   1905: iconst_0
    //   1906: istore 253
    //   1908: iload 252
    //   1910: iload 253
    //   1912: if_icmpgt +4825 -> 6737
    //   1915: aload_0
    //   1916: bipush 50
    //   1918: new 51	java/lang/String
    //   1921: dup
    //   1922: aload 251
    //   1924: invokespecial 61	java/lang/String:<init>	([C)V
    //   1927: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1930: aastore
    //   1931: ldc 167
    //   1933: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1936: wide
    //   1940: wide
    //   1944: arraylength
    //   1945: wide
    //   1949: iconst_0
    //   1950: wide
    //   1954: wide
    //   1958: wide
    //   1962: if_icmpgt +4867 -> 6829
    //   1965: aload_0
    //   1966: bipush 51
    //   1968: new 51	java/lang/String
    //   1971: dup
    //   1972: wide
    //   1976: invokespecial 61	java/lang/String:<init>	([C)V
    //   1979: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   1982: aastore
    //   1983: ldc 169
    //   1985: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   1988: wide
    //   1992: wide
    //   1996: arraylength
    //   1997: wide
    //   2001: iconst_0
    //   2002: wide
    //   2006: wide
    //   2010: wide
    //   2014: if_icmpgt +4936 -> 6950
    //   2017: aload_0
    //   2018: bipush 52
    //   2020: new 51	java/lang/String
    //   2023: dup
    //   2024: wide
    //   2028: invokespecial 61	java/lang/String:<init>	([C)V
    //   2031: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   2034: aastore
    //   2035: ldc 171
    //   2037: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   2040: wide
    //   2044: wide
    //   2048: arraylength
    //   2049: wide
    //   2053: iconst_0
    //   2054: wide
    //   2058: wide
    //   2062: wide
    //   2066: if_icmpgt +5004 -> 7070
    //   2069: aload_0
    //   2070: bipush 53
    //   2072: new 51	java/lang/String
    //   2075: dup
    //   2076: wide
    //   2080: invokespecial 61	java/lang/String:<init>	([C)V
    //   2083: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   2086: aastore
    //   2087: ldc 173
    //   2089: invokevirtual 57	java/lang/String:toCharArray	()[C
    //   2092: wide
    //   2096: wide
    //   2100: arraylength
    //   2101: wide
    //   2105: iconst_0
    //   2106: wide
    //   2110: wide
    //   2114: wide
    //   2118: if_icmpgt +5072 -> 7190
    //   2121: aload_0
    //   2122: bipush 54
    //   2124: new 51	java/lang/String
    //   2127: dup
    //   2128: wide
    //   2132: invokespecial 61	java/lang/String:<init>	([C)V
    //   2135: invokevirtual 65	java/lang/String:intern	()Ljava/lang/String;
    //   2138: aastore
    //   2139: aload_0
    //   2140: putstatic 175	com/whatsapp/messaging/MessageService:D	[Ljava/lang/String;
    //   2143: return
    //   2144: aload_1
    //   2145: iload_3
    //   2146: caload
    //   2147: istore 4
    //   2149: iload_3
    //   2150: iconst_5
    //   2151: irem
    //   2152: tableswitch	default:+32 -> 2184, 0:+51->2203, 1:+58->2210, 2:+65->2217, 3:+72->2224
    //   2185: ldc2_w 13829
    //   2188: aload_1
    //   2189: iload_3
    //   2190: iload 5
    //   2192: iload 4
    //   2194: ixor
    //   2195: i2c
    //   2196: castore
    //   2197: iinc 3 1
    //   2200: goto -2183 -> 17
    //   2203: bipush 63
    //   2205: istore 5
    //   2207: goto -19 -> 2188
    //   2210: bipush 75
    //   2212: istore 5
    //   2214: goto -26 -> 2188
    //   2217: bipush 64
    //   2219: istore 5
    //   2221: goto -33 -> 2188
    //   2224: bipush 102
    //   2226: istore 5
    //   2228: goto -40 -> 2188
    //   2231: aload 6
    //   2233: iload 8
    //   2235: caload
    //   2236: istore 9
    //   2238: iload 8
    //   2240: iconst_5
    //   2241: irem
    //   2242: tableswitch	default:+30 -> 2272, 0:+51->2293, 1:+58->2300, 2:+65->2307, 3:+72->2314
    //   2273: ldc2_w 13834
    //   2276: aload 6
    //   2278: iload 8
    //   2280: iload 10
    //   2282: iload 9
    //   2284: ixor
    //   2285: i2c
    //   2286: castore
    //   2287: iinc 8 1
    //   2290: goto -2239 -> 51
    //   2293: bipush 63
    //   2295: istore 10
    //   2297: goto -21 -> 2276
    //   2300: bipush 75
    //   2302: istore 10
    //   2304: goto -28 -> 2276
    //   2307: bipush 64
    //   2309: istore 10
    //   2311: goto -35 -> 2276
    //   2314: bipush 102
    //   2316: istore 10
    //   2318: goto -42 -> 2276
    //   2321: aload 11
    //   2323: iload 13
    //   2325: caload
    //   2326: istore 14
    //   2328: iload 13
    //   2330: iconst_5
    //   2331: irem
    //   2332: tableswitch	default:+32 -> 2364, 0:+53->2385, 1:+60->2392, 2:+67->2399, 3:+74->2406
    //   2365: ldc2_w 13839
    //   2368: aload 11
    //   2370: iload 13
    //   2372: iload 15
    //   2374: iload 14
    //   2376: ixor
    //   2377: i2c
    //   2378: castore
    //   2379: iinc 13 1
    //   2382: goto -2294 -> 88
    //   2385: bipush 63
    //   2387: istore 15
    //   2389: goto -21 -> 2368
    //   2392: bipush 75
    //   2394: istore 15
    //   2396: goto -28 -> 2368
    //   2399: bipush 64
    //   2401: istore 15
    //   2403: goto -35 -> 2368
    //   2406: bipush 102
    //   2408: istore 15
    //   2410: goto -42 -> 2368
    //   2413: aload 16
    //   2415: iload 18
    //   2417: caload
    //   2418: istore 19
    //   2420: iload 18
    //   2422: iconst_5
    //   2423: irem
    //   2424: tableswitch	default:+32 -> 2456, 0:+53->2477, 1:+60->2484, 2:+67->2491, 3:+74->2498
    //   2457: ldc2_w 13844
    //   2460: aload 16
    //   2462: iload 18
    //   2464: iload 20
    //   2466: iload 19
    //   2468: ixor
    //   2469: i2c
    //   2470: castore
    //   2471: iinc 18 1
    //   2474: goto -2349 -> 125
    //   2477: bipush 63
    //   2479: istore 20
    //   2481: goto -21 -> 2460
    //   2484: bipush 75
    //   2486: istore 20
    //   2488: goto -28 -> 2460
    //   2491: bipush 64
    //   2493: istore 20
    //   2495: goto -35 -> 2460
    //   2498: bipush 102
    //   2500: istore 20
    //   2502: goto -42 -> 2460
    //   2505: aload 21
    //   2507: iload 23
    //   2509: caload
    //   2510: istore 24
    //   2512: iload 23
    //   2514: iconst_5
    //   2515: irem
    //   2516: tableswitch	default:+32 -> 2548, 0:+53->2569, 1:+60->2576, 2:+67->2583, 3:+74->2590
    //   2549: ldc2_w 13849
    //   2552: aload 21
    //   2554: iload 23
    //   2556: iload 25
    //   2558: iload 24
    //   2560: ixor
    //   2561: i2c
    //   2562: castore
    //   2563: iinc 23 1
    //   2566: goto -2404 -> 162
    //   2569: bipush 63
    //   2571: istore 25
    //   2573: goto -21 -> 2552
    //   2576: bipush 75
    //   2578: istore 25
    //   2580: goto -28 -> 2552
    //   2583: bipush 64
    //   2585: istore 25
    //   2587: goto -35 -> 2552
    //   2590: bipush 102
    //   2592: istore 25
    //   2594: goto -42 -> 2552
    //   2597: aload 26
    //   2599: iload 28
    //   2601: caload
    //   2602: istore 29
    //   2604: iload 28
    //   2606: iconst_5
    //   2607: irem
    //   2608: tableswitch	default:+32 -> 2640, 0:+53->2661, 1:+60->2668, 2:+67->2675, 3:+74->2682
    //   2641: ldc2_w 13854
    //   2644: aload 26
    //   2646: iload 28
    //   2648: iload 30
    //   2650: iload 29
    //   2652: ixor
    //   2653: i2c
    //   2654: castore
    //   2655: iinc 28 1
    //   2658: goto -2459 -> 199
    //   2661: bipush 63
    //   2663: istore 30
    //   2665: goto -21 -> 2644
    //   2668: bipush 75
    //   2670: istore 30
    //   2672: goto -28 -> 2644
    //   2675: bipush 64
    //   2677: istore 30
    //   2679: goto -35 -> 2644
    //   2682: bipush 102
    //   2684: istore 30
    //   2686: goto -42 -> 2644
    //   2689: aload 31
    //   2691: iload 33
    //   2693: caload
    //   2694: istore 34
    //   2696: iload 33
    //   2698: iconst_5
    //   2699: irem
    //   2700: tableswitch	default:+32 -> 2732, 0:+53->2753, 1:+60->2760, 2:+67->2767, 3:+74->2774
    //   2733: ldc2_w 13859
    //   2736: aload 31
    //   2738: iload 33
    //   2740: iload 35
    //   2742: iload 34
    //   2744: ixor
    //   2745: i2c
    //   2746: castore
    //   2747: iinc 33 1
    //   2750: goto -2514 -> 236
    //   2753: bipush 63
    //   2755: istore 35
    //   2757: goto -21 -> 2736
    //   2760: bipush 75
    //   2762: istore 35
    //   2764: goto -28 -> 2736
    //   2767: bipush 64
    //   2769: istore 35
    //   2771: goto -35 -> 2736
    //   2774: bipush 102
    //   2776: istore 35
    //   2778: goto -42 -> 2736
    //   2781: aload 36
    //   2783: iload 38
    //   2785: caload
    //   2786: istore 39
    //   2788: iload 38
    //   2790: iconst_5
    //   2791: irem
    //   2792: tableswitch	default:+32 -> 2824, 0:+53->2845, 1:+60->2852, 2:+67->2859, 3:+74->2866
    //   2825: ldc2_w 13864
    //   2828: aload 36
    //   2830: iload 38
    //   2832: iload 40
    //   2834: iload 39
    //   2836: ixor
    //   2837: i2c
    //   2838: castore
    //   2839: iinc 38 1
    //   2842: goto -2568 -> 274
    //   2845: bipush 63
    //   2847: istore 40
    //   2849: goto -21 -> 2828
    //   2852: bipush 75
    //   2854: istore 40
    //   2856: goto -28 -> 2828
    //   2859: bipush 64
    //   2861: istore 40
    //   2863: goto -35 -> 2828
    //   2866: bipush 102
    //   2868: istore 40
    //   2870: goto -42 -> 2828
    //   2873: aload 41
    //   2875: iload 43
    //   2877: caload
    //   2878: istore 44
    //   2880: iload 43
    //   2882: iconst_5
    //   2883: irem
    //   2884: tableswitch	default:+32 -> 2916, 0:+53->2937, 1:+60->2944, 2:+67->2951, 3:+74->2958
    //   2917: ldc2_w 13869
    //   2920: aload 41
    //   2922: iload 43
    //   2924: iload 45
    //   2926: iload 44
    //   2928: ixor
    //   2929: i2c
    //   2930: castore
    //   2931: iinc 43 1
    //   2934: goto -2622 -> 312
    //   2937: bipush 63
    //   2939: istore 45
    //   2941: goto -21 -> 2920
    //   2944: bipush 75
    //   2946: istore 45
    //   2948: goto -28 -> 2920
    //   2951: bipush 64
    //   2953: istore 45
    //   2955: goto -35 -> 2920
    //   2958: bipush 102
    //   2960: istore 45
    //   2962: goto -42 -> 2920
    //   2965: aload 46
    //   2967: iload 48
    //   2969: caload
    //   2970: istore 49
    //   2972: iload 48
    //   2974: iconst_5
    //   2975: irem
    //   2976: tableswitch	default:+32 -> 3008, 0:+53->3029, 1:+60->3036, 2:+67->3043, 3:+74->3050
    //   3009: ldc2_w 13874
    //   3012: aload 46
    //   3014: iload 48
    //   3016: iload 50
    //   3018: iload 49
    //   3020: ixor
    //   3021: i2c
    //   3022: castore
    //   3023: iinc 48 1
    //   3026: goto -2676 -> 350
    //   3029: bipush 63
    //   3031: istore 50
    //   3033: goto -21 -> 3012
    //   3036: bipush 75
    //   3038: istore 50
    //   3040: goto -28 -> 3012
    //   3043: bipush 64
    //   3045: istore 50
    //   3047: goto -35 -> 3012
    //   3050: bipush 102
    //   3052: istore 50
    //   3054: goto -42 -> 3012
    //   3057: aload 51
    //   3059: iload 53
    //   3061: caload
    //   3062: istore 54
    //   3064: iload 53
    //   3066: iconst_5
    //   3067: irem
    //   3068: tableswitch	default:+32 -> 3100, 0:+53->3121, 1:+60->3128, 2:+67->3135, 3:+74->3142
    //   3101: ldc2_w 13879
    //   3104: aload 51
    //   3106: iload 53
    //   3108: iload 55
    //   3110: iload 54
    //   3112: ixor
    //   3113: i2c
    //   3114: castore
    //   3115: iinc 53 1
    //   3118: goto -2730 -> 388
    //   3121: bipush 63
    //   3123: istore 55
    //   3125: goto -21 -> 3104
    //   3128: bipush 75
    //   3130: istore 55
    //   3132: goto -28 -> 3104
    //   3135: bipush 64
    //   3137: istore 55
    //   3139: goto -35 -> 3104
    //   3142: bipush 102
    //   3144: istore 55
    //   3146: goto -42 -> 3104
    //   3149: aload 56
    //   3151: iload 58
    //   3153: caload
    //   3154: istore 59
    //   3156: iload 58
    //   3158: iconst_5
    //   3159: irem
    //   3160: tableswitch	default:+32 -> 3192, 0:+53->3213, 1:+60->3220, 2:+67->3227, 3:+74->3234
    //   3193: ldc2_w 13884
    //   3196: aload 56
    //   3198: iload 58
    //   3200: iload 60
    //   3202: iload 59
    //   3204: ixor
    //   3205: i2c
    //   3206: castore
    //   3207: iinc 58 1
    //   3210: goto -2784 -> 426
    //   3213: bipush 63
    //   3215: istore 60
    //   3217: goto -21 -> 3196
    //   3220: bipush 75
    //   3222: istore 60
    //   3224: goto -28 -> 3196
    //   3227: bipush 64
    //   3229: istore 60
    //   3231: goto -35 -> 3196
    //   3234: bipush 102
    //   3236: istore 60
    //   3238: goto -42 -> 3196
    //   3241: aload 61
    //   3243: iload 63
    //   3245: caload
    //   3246: istore 64
    //   3248: iload 63
    //   3250: iconst_5
    //   3251: irem
    //   3252: tableswitch	default:+32 -> 3284, 0:+53->3305, 1:+60->3312, 2:+67->3319, 3:+74->3326
    //   3285: ldc2_w 13889
    //   3288: aload 61
    //   3290: iload 63
    //   3292: iload 65
    //   3294: iload 64
    //   3296: ixor
    //   3297: i2c
    //   3298: castore
    //   3299: iinc 63 1
    //   3302: goto -2838 -> 464
    //   3305: bipush 63
    //   3307: istore 65
    //   3309: goto -21 -> 3288
    //   3312: bipush 75
    //   3314: istore 65
    //   3316: goto -28 -> 3288
    //   3319: bipush 64
    //   3321: istore 65
    //   3323: goto -35 -> 3288
    //   3326: bipush 102
    //   3328: istore 65
    //   3330: goto -42 -> 3288
    //   3333: aload 66
    //   3335: iload 68
    //   3337: caload
    //   3338: istore 69
    //   3340: iload 68
    //   3342: iconst_5
    //   3343: irem
    //   3344: tableswitch	default:+32 -> 3376, 0:+53->3397, 1:+60->3404, 2:+67->3411, 3:+74->3418
    //   3377: ldc2_w 13894
    //   3380: aload 66
    //   3382: iload 68
    //   3384: iload 70
    //   3386: iload 69
    //   3388: ixor
    //   3389: i2c
    //   3390: castore
    //   3391: iinc 68 1
    //   3394: goto -2892 -> 502
    //   3397: bipush 63
    //   3399: istore 70
    //   3401: goto -21 -> 3380
    //   3404: bipush 75
    //   3406: istore 70
    //   3408: goto -28 -> 3380
    //   3411: bipush 64
    //   3413: istore 70
    //   3415: goto -35 -> 3380
    //   3418: bipush 102
    //   3420: istore 70
    //   3422: goto -42 -> 3380
    //   3425: aload 71
    //   3427: iload 73
    //   3429: caload
    //   3430: istore 74
    //   3432: iload 73
    //   3434: iconst_5
    //   3435: irem
    //   3436: tableswitch	default:+32 -> 3468, 0:+53->3489, 1:+60->3496, 2:+67->3503, 3:+74->3510
    //   3469: ldc2_w 13899
    //   3472: aload 71
    //   3474: iload 73
    //   3476: iload 75
    //   3478: iload 74
    //   3480: ixor
    //   3481: i2c
    //   3482: castore
    //   3483: iinc 73 1
    //   3486: goto -2946 -> 540
    //   3489: bipush 63
    //   3491: istore 75
    //   3493: goto -21 -> 3472
    //   3496: bipush 75
    //   3498: istore 75
    //   3500: goto -28 -> 3472
    //   3503: bipush 64
    //   3505: istore 75
    //   3507: goto -35 -> 3472
    //   3510: bipush 102
    //   3512: istore 75
    //   3514: goto -42 -> 3472
    //   3517: aload 76
    //   3519: iload 78
    //   3521: caload
    //   3522: istore 79
    //   3524: iload 78
    //   3526: iconst_5
    //   3527: irem
    //   3528: tableswitch	default:+32 -> 3560, 0:+53->3581, 1:+60->3588, 2:+67->3595, 3:+74->3602
    //   3561: ldc2_w 13904
    //   3564: aload 76
    //   3566: iload 78
    //   3568: iload 80
    //   3570: iload 79
    //   3572: ixor
    //   3573: i2c
    //   3574: castore
    //   3575: iinc 78 1
    //   3578: goto -3000 -> 578
    //   3581: bipush 63
    //   3583: istore 80
    //   3585: goto -21 -> 3564
    //   3588: bipush 75
    //   3590: istore 80
    //   3592: goto -28 -> 3564
    //   3595: bipush 64
    //   3597: istore 80
    //   3599: goto -35 -> 3564
    //   3602: bipush 102
    //   3604: istore 80
    //   3606: goto -42 -> 3564
    //   3609: aload 81
    //   3611: iload 83
    //   3613: caload
    //   3614: istore 84
    //   3616: iload 83
    //   3618: iconst_5
    //   3619: irem
    //   3620: tableswitch	default:+32 -> 3652, 0:+53->3673, 1:+60->3680, 2:+67->3687, 3:+74->3694
    //   3653: ldc2_w 13909
    //   3656: aload 81
    //   3658: iload 83
    //   3660: iload 85
    //   3662: iload 84
    //   3664: ixor
    //   3665: i2c
    //   3666: castore
    //   3667: iinc 83 1
    //   3670: goto -3054 -> 616
    //   3673: bipush 63
    //   3675: istore 85
    //   3677: goto -21 -> 3656
    //   3680: bipush 75
    //   3682: istore 85
    //   3684: goto -28 -> 3656
    //   3687: bipush 64
    //   3689: istore 85
    //   3691: goto -35 -> 3656
    //   3694: bipush 102
    //   3696: istore 85
    //   3698: goto -42 -> 3656
    //   3701: aload 86
    //   3703: iload 88
    //   3705: caload
    //   3706: istore 89
    //   3708: iload 88
    //   3710: iconst_5
    //   3711: irem
    //   3712: tableswitch	default:+32 -> 3744, 0:+53->3765, 1:+60->3772, 2:+67->3779, 3:+74->3786
    //   3745: ldc2_w 13914
    //   3748: aload 86
    //   3750: iload 88
    //   3752: iload 90
    //   3754: iload 89
    //   3756: ixor
    //   3757: i2c
    //   3758: castore
    //   3759: iinc 88 1
    //   3762: goto -3108 -> 654
    //   3765: bipush 63
    //   3767: istore 90
    //   3769: goto -21 -> 3748
    //   3772: bipush 75
    //   3774: istore 90
    //   3776: goto -28 -> 3748
    //   3779: bipush 64
    //   3781: istore 90
    //   3783: goto -35 -> 3748
    //   3786: bipush 102
    //   3788: istore 90
    //   3790: goto -42 -> 3748
    //   3793: aload 91
    //   3795: iload 93
    //   3797: caload
    //   3798: istore 94
    //   3800: iload 93
    //   3802: iconst_5
    //   3803: irem
    //   3804: tableswitch	default:+32 -> 3836, 0:+53->3857, 1:+60->3864, 2:+67->3871, 3:+74->3878
    //   3837: ldc2_w 13919
    //   3840: aload 91
    //   3842: iload 93
    //   3844: iload 95
    //   3846: iload 94
    //   3848: ixor
    //   3849: i2c
    //   3850: castore
    //   3851: iinc 93 1
    //   3854: goto -3162 -> 692
    //   3857: bipush 63
    //   3859: istore 95
    //   3861: goto -21 -> 3840
    //   3864: bipush 75
    //   3866: istore 95
    //   3868: goto -28 -> 3840
    //   3871: bipush 64
    //   3873: istore 95
    //   3875: goto -35 -> 3840
    //   3878: bipush 102
    //   3880: istore 95
    //   3882: goto -42 -> 3840
    //   3885: aload 96
    //   3887: iload 98
    //   3889: caload
    //   3890: istore 99
    //   3892: iload 98
    //   3894: iconst_5
    //   3895: irem
    //   3896: tableswitch	default:+32 -> 3928, 0:+53->3949, 1:+60->3956, 2:+67->3963, 3:+74->3970
    //   3929: ldc2_w 13924
    //   3932: aload 96
    //   3934: iload 98
    //   3936: iload 100
    //   3938: iload 99
    //   3940: ixor
    //   3941: i2c
    //   3942: castore
    //   3943: iinc 98 1
    //   3946: goto -3216 -> 730
    //   3949: bipush 63
    //   3951: istore 100
    //   3953: goto -21 -> 3932
    //   3956: bipush 75
    //   3958: istore 100
    //   3960: goto -28 -> 3932
    //   3963: bipush 64
    //   3965: istore 100
    //   3967: goto -35 -> 3932
    //   3970: bipush 102
    //   3972: istore 100
    //   3974: goto -42 -> 3932
    //   3977: aload 101
    //   3979: iload 103
    //   3981: caload
    //   3982: istore 104
    //   3984: iload 103
    //   3986: iconst_5
    //   3987: irem
    //   3988: tableswitch	default:+32 -> 4020, 0:+53->4041, 1:+60->4048, 2:+67->4055, 3:+74->4062
    //   4021: ldc2_w 13929
    //   4024: aload 101
    //   4026: iload 103
    //   4028: iload 105
    //   4030: iload 104
    //   4032: ixor
    //   4033: i2c
    //   4034: castore
    //   4035: iinc 103 1
    //   4038: goto -3270 -> 768
    //   4041: bipush 63
    //   4043: istore 105
    //   4045: goto -21 -> 4024
    //   4048: bipush 75
    //   4050: istore 105
    //   4052: goto -28 -> 4024
    //   4055: bipush 64
    //   4057: istore 105
    //   4059: goto -35 -> 4024
    //   4062: bipush 102
    //   4064: istore 105
    //   4066: goto -42 -> 4024
    //   4069: aload 106
    //   4071: iload 108
    //   4073: caload
    //   4074: istore 109
    //   4076: iload 108
    //   4078: iconst_5
    //   4079: irem
    //   4080: tableswitch	default:+32 -> 4112, 0:+53->4133, 1:+60->4140, 2:+67->4147, 3:+74->4154
    //   4113: ldc2_w 13934
    //   4116: aload 106
    //   4118: iload 108
    //   4120: iload 110
    //   4122: iload 109
    //   4124: ixor
    //   4125: i2c
    //   4126: castore
    //   4127: iinc 108 1
    //   4130: goto -3324 -> 806
    //   4133: bipush 63
    //   4135: istore 110
    //   4137: goto -21 -> 4116
    //   4140: bipush 75
    //   4142: istore 110
    //   4144: goto -28 -> 4116
    //   4147: bipush 64
    //   4149: istore 110
    //   4151: goto -35 -> 4116
    //   4154: bipush 102
    //   4156: istore 110
    //   4158: goto -42 -> 4116
    //   4161: aload 111
    //   4163: iload 113
    //   4165: caload
    //   4166: istore 114
    //   4168: iload 113
    //   4170: iconst_5
    //   4171: irem
    //   4172: tableswitch	default:+32 -> 4204, 0:+53->4225, 1:+60->4232, 2:+67->4239, 3:+74->4246
    //   4205: ldc2_w 13939
    //   4208: aload 111
    //   4210: iload 113
    //   4212: iload 115
    //   4214: iload 114
    //   4216: ixor
    //   4217: i2c
    //   4218: castore
    //   4219: iinc 113 1
    //   4222: goto -3378 -> 844
    //   4225: bipush 63
    //   4227: istore 115
    //   4229: goto -21 -> 4208
    //   4232: bipush 75
    //   4234: istore 115
    //   4236: goto -28 -> 4208
    //   4239: bipush 64
    //   4241: istore 115
    //   4243: goto -35 -> 4208
    //   4246: bipush 102
    //   4248: istore 115
    //   4250: goto -42 -> 4208
    //   4253: aload 116
    //   4255: iload 118
    //   4257: caload
    //   4258: istore 119
    //   4260: iload 118
    //   4262: iconst_5
    //   4263: irem
    //   4264: tableswitch	default:+32 -> 4296, 0:+53->4317, 1:+60->4324, 2:+67->4331, 3:+74->4338
    //   4297: ldc2_w 13944
    //   4300: aload 116
    //   4302: iload 118
    //   4304: iload 120
    //   4306: iload 119
    //   4308: ixor
    //   4309: i2c
    //   4310: castore
    //   4311: iinc 118 1
    //   4314: goto -3432 -> 882
    //   4317: bipush 63
    //   4319: istore 120
    //   4321: goto -21 -> 4300
    //   4324: bipush 75
    //   4326: istore 120
    //   4328: goto -28 -> 4300
    //   4331: bipush 64
    //   4333: istore 120
    //   4335: goto -35 -> 4300
    //   4338: bipush 102
    //   4340: istore 120
    //   4342: goto -42 -> 4300
    //   4345: aload 121
    //   4347: iload 123
    //   4349: caload
    //   4350: istore 124
    //   4352: iload 123
    //   4354: iconst_5
    //   4355: irem
    //   4356: tableswitch	default:+32 -> 4388, 0:+53->4409, 1:+60->4416, 2:+67->4423, 3:+74->4430
    //   4389: ldc2_w 13949
    //   4392: aload 121
    //   4394: iload 123
    //   4396: iload 125
    //   4398: iload 124
    //   4400: ixor
    //   4401: i2c
    //   4402: castore
    //   4403: iinc 123 1
    //   4406: goto -3486 -> 920
    //   4409: bipush 63
    //   4411: istore 125
    //   4413: goto -21 -> 4392
    //   4416: bipush 75
    //   4418: istore 125
    //   4420: goto -28 -> 4392
    //   4423: bipush 64
    //   4425: istore 125
    //   4427: goto -35 -> 4392
    //   4430: bipush 102
    //   4432: istore 125
    //   4434: goto -42 -> 4392
    //   4437: aload 126
    //   4439: iload 128
    //   4441: caload
    //   4442: istore 129
    //   4444: iload 128
    //   4446: iconst_5
    //   4447: irem
    //   4448: tableswitch	default:+32 -> 4480, 0:+53->4501, 1:+60->4508, 2:+67->4515, 3:+74->4522
    //   4481: ldc2_w 13954
    //   4484: aload 126
    //   4486: iload 128
    //   4488: iload 130
    //   4490: iload 129
    //   4492: ixor
    //   4493: i2c
    //   4494: castore
    //   4495: iinc 128 1
    //   4498: goto -3540 -> 958
    //   4501: bipush 63
    //   4503: istore 130
    //   4505: goto -21 -> 4484
    //   4508: bipush 75
    //   4510: istore 130
    //   4512: goto -28 -> 4484
    //   4515: bipush 64
    //   4517: istore 130
    //   4519: goto -35 -> 4484
    //   4522: bipush 102
    //   4524: istore 130
    //   4526: goto -42 -> 4484
    //   4529: aload 131
    //   4531: iload 133
    //   4533: caload
    //   4534: istore 134
    //   4536: iload 133
    //   4538: iconst_5
    //   4539: irem
    //   4540: tableswitch	default:+32 -> 4572, 0:+53->4593, 1:+60->4600, 2:+67->4607, 3:+74->4614
    //   4573: ldc2_w 13959
    //   4576: aload 131
    //   4578: iload 133
    //   4580: iload 135
    //   4582: iload 134
    //   4584: ixor
    //   4585: i2c
    //   4586: castore
    //   4587: iinc 133 1
    //   4590: goto -3594 -> 996
    //   4593: bipush 63
    //   4595: istore 135
    //   4597: goto -21 -> 4576
    //   4600: bipush 75
    //   4602: istore 135
    //   4604: goto -28 -> 4576
    //   4607: bipush 64
    //   4609: istore 135
    //   4611: goto -35 -> 4576
    //   4614: bipush 102
    //   4616: istore 135
    //   4618: goto -42 -> 4576
    //   4621: aload 136
    //   4623: iload 138
    //   4625: caload
    //   4626: istore 139
    //   4628: iload 138
    //   4630: iconst_5
    //   4631: irem
    //   4632: tableswitch	default:+32 -> 4664, 0:+53->4685, 1:+60->4692, 2:+67->4699, 3:+74->4706
    //   4665: ldc2_w 13964
    //   4668: aload 136
    //   4670: iload 138
    //   4672: iload 140
    //   4674: iload 139
    //   4676: ixor
    //   4677: i2c
    //   4678: castore
    //   4679: iinc 138 1
    //   4682: goto -3648 -> 1034
    //   4685: bipush 63
    //   4687: istore 140
    //   4689: goto -21 -> 4668
    //   4692: bipush 75
    //   4694: istore 140
    //   4696: goto -28 -> 4668
    //   4699: bipush 64
    //   4701: istore 140
    //   4703: goto -35 -> 4668
    //   4706: bipush 102
    //   4708: istore 140
    //   4710: goto -42 -> 4668
    //   4713: aload 141
    //   4715: iload 143
    //   4717: caload
    //   4718: istore 144
    //   4720: iload 143
    //   4722: iconst_5
    //   4723: irem
    //   4724: tableswitch	default:+32 -> 4756, 0:+53->4777, 1:+60->4784, 2:+67->4791, 3:+74->4798
    //   4757: ldc2_w 13969
    //   4760: aload 141
    //   4762: iload 143
    //   4764: iload 145
    //   4766: iload 144
    //   4768: ixor
    //   4769: i2c
    //   4770: castore
    //   4771: iinc 143 1
    //   4774: goto -3702 -> 1072
    //   4777: bipush 63
    //   4779: istore 145
    //   4781: goto -21 -> 4760
    //   4784: bipush 75
    //   4786: istore 145
    //   4788: goto -28 -> 4760
    //   4791: bipush 64
    //   4793: istore 145
    //   4795: goto -35 -> 4760
    //   4798: bipush 102
    //   4800: istore 145
    //   4802: goto -42 -> 4760
    //   4805: aload 146
    //   4807: iload 148
    //   4809: caload
    //   4810: istore 149
    //   4812: iload 148
    //   4814: iconst_5
    //   4815: irem
    //   4816: tableswitch	default:+32 -> 4848, 0:+53->4869, 1:+60->4876, 2:+67->4883, 3:+74->4890
    //   4849: ldc2_w 13974
    //   4852: aload 146
    //   4854: iload 148
    //   4856: iload 150
    //   4858: iload 149
    //   4860: ixor
    //   4861: i2c
    //   4862: castore
    //   4863: iinc 148 1
    //   4866: goto -3756 -> 1110
    //   4869: bipush 63
    //   4871: istore 150
    //   4873: goto -21 -> 4852
    //   4876: bipush 75
    //   4878: istore 150
    //   4880: goto -28 -> 4852
    //   4883: bipush 64
    //   4885: istore 150
    //   4887: goto -35 -> 4852
    //   4890: bipush 102
    //   4892: istore 150
    //   4894: goto -42 -> 4852
    //   4897: aload 151
    //   4899: iload 153
    //   4901: caload
    //   4902: istore 154
    //   4904: iload 153
    //   4906: iconst_5
    //   4907: irem
    //   4908: tableswitch	default:+32 -> 4940, 0:+53->4961, 1:+60->4968, 2:+67->4975, 3:+74->4982
    //   4941: ldc2_w 13979
    //   4944: aload 151
    //   4946: iload 153
    //   4948: iload 155
    //   4950: iload 154
    //   4952: ixor
    //   4953: i2c
    //   4954: castore
    //   4955: iinc 153 1
    //   4958: goto -3810 -> 1148
    //   4961: bipush 63
    //   4963: istore 155
    //   4965: goto -21 -> 4944
    //   4968: bipush 75
    //   4970: istore 155
    //   4972: goto -28 -> 4944
    //   4975: bipush 64
    //   4977: istore 155
    //   4979: goto -35 -> 4944
    //   4982: bipush 102
    //   4984: istore 155
    //   4986: goto -42 -> 4944
    //   4989: aload 156
    //   4991: iload 158
    //   4993: caload
    //   4994: istore 159
    //   4996: iload 158
    //   4998: iconst_5
    //   4999: irem
    //   5000: tableswitch	default:+32 -> 5032, 0:+53->5053, 1:+60->5060, 2:+67->5067, 3:+74->5074
    //   5033: ldc2_w 13984
    //   5036: aload 156
    //   5038: iload 158
    //   5040: iload 160
    //   5042: iload 159
    //   5044: ixor
    //   5045: i2c
    //   5046: castore
    //   5047: iinc 158 1
    //   5050: goto -3864 -> 1186
    //   5053: bipush 63
    //   5055: istore 160
    //   5057: goto -21 -> 5036
    //   5060: bipush 75
    //   5062: istore 160
    //   5064: goto -28 -> 5036
    //   5067: bipush 64
    //   5069: istore 160
    //   5071: goto -35 -> 5036
    //   5074: bipush 102
    //   5076: istore 160
    //   5078: goto -42 -> 5036
    //   5081: aload 161
    //   5083: iload 163
    //   5085: caload
    //   5086: istore 164
    //   5088: iload 163
    //   5090: iconst_5
    //   5091: irem
    //   5092: tableswitch	default:+32 -> 5124, 0:+53->5145, 1:+60->5152, 2:+67->5159, 3:+74->5166
    //   5125: ldc2_w 13989
    //   5128: aload 161
    //   5130: iload 163
    //   5132: iload 165
    //   5134: iload 164
    //   5136: ixor
    //   5137: i2c
    //   5138: castore
    //   5139: iinc 163 1
    //   5142: goto -3918 -> 1224
    //   5145: bipush 63
    //   5147: istore 165
    //   5149: goto -21 -> 5128
    //   5152: bipush 75
    //   5154: istore 165
    //   5156: goto -28 -> 5128
    //   5159: bipush 64
    //   5161: istore 165
    //   5163: goto -35 -> 5128
    //   5166: bipush 102
    //   5168: istore 165
    //   5170: goto -42 -> 5128
    //   5173: aload 166
    //   5175: iload 168
    //   5177: caload
    //   5178: istore 169
    //   5180: iload 168
    //   5182: iconst_5
    //   5183: irem
    //   5184: tableswitch	default:+32 -> 5216, 0:+53->5237, 1:+60->5244, 2:+67->5251, 3:+74->5258
    //   5217: ldc2_w 13994
    //   5220: aload 166
    //   5222: iload 168
    //   5224: iload 170
    //   5226: iload 169
    //   5228: ixor
    //   5229: i2c
    //   5230: castore
    //   5231: iinc 168 1
    //   5234: goto -3972 -> 1262
    //   5237: bipush 63
    //   5239: istore 170
    //   5241: goto -21 -> 5220
    //   5244: bipush 75
    //   5246: istore 170
    //   5248: goto -28 -> 5220
    //   5251: bipush 64
    //   5253: istore 170
    //   5255: goto -35 -> 5220
    //   5258: bipush 102
    //   5260: istore 170
    //   5262: goto -42 -> 5220
    //   5265: aload 171
    //   5267: iload 173
    //   5269: caload
    //   5270: istore 174
    //   5272: iload 173
    //   5274: iconst_5
    //   5275: irem
    //   5276: tableswitch	default:+32 -> 5308, 0:+53->5329, 1:+60->5336, 2:+67->5343, 3:+74->5350
    //   5309: ldc2_w 13999
    //   5312: aload 171
    //   5314: iload 173
    //   5316: iload 175
    //   5318: iload 174
    //   5320: ixor
    //   5321: i2c
    //   5322: castore
    //   5323: iinc 173 1
    //   5326: goto -4026 -> 1300
    //   5329: bipush 63
    //   5331: istore 175
    //   5333: goto -21 -> 5312
    //   5336: bipush 75
    //   5338: istore 175
    //   5340: goto -28 -> 5312
    //   5343: bipush 64
    //   5345: istore 175
    //   5347: goto -35 -> 5312
    //   5350: bipush 102
    //   5352: istore 175
    //   5354: goto -42 -> 5312
    //   5357: aload 176
    //   5359: iload 178
    //   5361: caload
    //   5362: istore 179
    //   5364: iload 178
    //   5366: iconst_5
    //   5367: irem
    //   5368: tableswitch	default:+32 -> 5400, 0:+53->5421, 1:+60->5428, 2:+67->5435, 3:+74->5442
    //   5401: ldc2_w 14004
    //   5404: aload 176
    //   5406: iload 178
    //   5408: iload 180
    //   5410: iload 179
    //   5412: ixor
    //   5413: i2c
    //   5414: castore
    //   5415: iinc 178 1
    //   5418: goto -4080 -> 1338
    //   5421: bipush 63
    //   5423: istore 180
    //   5425: goto -21 -> 5404
    //   5428: bipush 75
    //   5430: istore 180
    //   5432: goto -28 -> 5404
    //   5435: bipush 64
    //   5437: istore 180
    //   5439: goto -35 -> 5404
    //   5442: bipush 102
    //   5444: istore 180
    //   5446: goto -42 -> 5404
    //   5449: aload 181
    //   5451: iload 183
    //   5453: caload
    //   5454: istore 184
    //   5456: iload 183
    //   5458: iconst_5
    //   5459: irem
    //   5460: tableswitch	default:+32 -> 5492, 0:+53->5513, 1:+60->5520, 2:+67->5527, 3:+74->5534
    //   5493: ldc2_w 14009
    //   5496: aload 181
    //   5498: iload 183
    //   5500: iload 185
    //   5502: iload 184
    //   5504: ixor
    //   5505: i2c
    //   5506: castore
    //   5507: iinc 183 1
    //   5510: goto -4134 -> 1376
    //   5513: bipush 63
    //   5515: istore 185
    //   5517: goto -21 -> 5496
    //   5520: bipush 75
    //   5522: istore 185
    //   5524: goto -28 -> 5496
    //   5527: bipush 64
    //   5529: istore 185
    //   5531: goto -35 -> 5496
    //   5534: bipush 102
    //   5536: istore 185
    //   5538: goto -42 -> 5496
    //   5541: aload 186
    //   5543: iload 188
    //   5545: caload
    //   5546: istore 189
    //   5548: iload 188
    //   5550: iconst_5
    //   5551: irem
    //   5552: tableswitch	default:+32 -> 5584, 0:+53->5605, 1:+60->5612, 2:+67->5619, 3:+74->5626
    //   5585: ldc2_w 14014
    //   5588: aload 186
    //   5590: iload 188
    //   5592: iload 190
    //   5594: iload 189
    //   5596: ixor
    //   5597: i2c
    //   5598: castore
    //   5599: iinc 188 1
    //   5602: goto -4188 -> 1414
    //   5605: bipush 63
    //   5607: istore 190
    //   5609: goto -21 -> 5588
    //   5612: bipush 75
    //   5614: istore 190
    //   5616: goto -28 -> 5588
    //   5619: bipush 64
    //   5621: istore 190
    //   5623: goto -35 -> 5588
    //   5626: bipush 102
    //   5628: istore 190
    //   5630: goto -42 -> 5588
    //   5633: aload 191
    //   5635: iload 193
    //   5637: caload
    //   5638: istore 194
    //   5640: iload 193
    //   5642: iconst_5
    //   5643: irem
    //   5644: tableswitch	default:+32 -> 5676, 0:+53->5697, 1:+60->5704, 2:+67->5711, 3:+74->5718
    //   5677: ldc2_w 14019
    //   5680: aload 191
    //   5682: iload 193
    //   5684: iload 195
    //   5686: iload 194
    //   5688: ixor
    //   5689: i2c
    //   5690: castore
    //   5691: iinc 193 1
    //   5694: goto -4242 -> 1452
    //   5697: bipush 63
    //   5699: istore 195
    //   5701: goto -21 -> 5680
    //   5704: bipush 75
    //   5706: istore 195
    //   5708: goto -28 -> 5680
    //   5711: bipush 64
    //   5713: istore 195
    //   5715: goto -35 -> 5680
    //   5718: bipush 102
    //   5720: istore 195
    //   5722: goto -42 -> 5680
    //   5725: aload 196
    //   5727: iload 198
    //   5729: caload
    //   5730: istore 199
    //   5732: iload 198
    //   5734: iconst_5
    //   5735: irem
    //   5736: tableswitch	default:+32 -> 5768, 0:+53->5789, 1:+60->5796, 2:+67->5803, 3:+74->5810
    //   5769: ldc2_w 14024
    //   5772: aload 196
    //   5774: iload 198
    //   5776: iload 200
    //   5778: iload 199
    //   5780: ixor
    //   5781: i2c
    //   5782: castore
    //   5783: iinc 198 1
    //   5786: goto -4296 -> 1490
    //   5789: bipush 63
    //   5791: istore 200
    //   5793: goto -21 -> 5772
    //   5796: bipush 75
    //   5798: istore 200
    //   5800: goto -28 -> 5772
    //   5803: bipush 64
    //   5805: istore 200
    //   5807: goto -35 -> 5772
    //   5810: bipush 102
    //   5812: istore 200
    //   5814: goto -42 -> 5772
    //   5817: aload 201
    //   5819: iload 203
    //   5821: caload
    //   5822: istore 204
    //   5824: iload 203
    //   5826: iconst_5
    //   5827: irem
    //   5828: tableswitch	default:+32 -> 5860, 0:+53->5881, 1:+60->5888, 2:+67->5895, 3:+74->5902
    //   5861: ldc2_w 14029
    //   5864: aload 201
    //   5866: iload 203
    //   5868: iload 205
    //   5870: iload 204
    //   5872: ixor
    //   5873: i2c
    //   5874: castore
    //   5875: iinc 203 1
    //   5878: goto -4350 -> 1528
    //   5881: bipush 63
    //   5883: istore 205
    //   5885: goto -21 -> 5864
    //   5888: bipush 75
    //   5890: istore 205
    //   5892: goto -28 -> 5864
    //   5895: bipush 64
    //   5897: istore 205
    //   5899: goto -35 -> 5864
    //   5902: bipush 102
    //   5904: istore 205
    //   5906: goto -42 -> 5864
    //   5909: aload 206
    //   5911: iload 208
    //   5913: caload
    //   5914: istore 209
    //   5916: iload 208
    //   5918: iconst_5
    //   5919: irem
    //   5920: tableswitch	default:+32 -> 5952, 0:+53->5973, 1:+60->5980, 2:+67->5987, 3:+74->5994
    //   5953: ldc2_w 14034
    //   5956: aload 206
    //   5958: iload 208
    //   5960: iload 210
    //   5962: iload 209
    //   5964: ixor
    //   5965: i2c
    //   5966: castore
    //   5967: iinc 208 1
    //   5970: goto -4404 -> 1566
    //   5973: bipush 63
    //   5975: istore 210
    //   5977: goto -21 -> 5956
    //   5980: bipush 75
    //   5982: istore 210
    //   5984: goto -28 -> 5956
    //   5987: bipush 64
    //   5989: istore 210
    //   5991: goto -35 -> 5956
    //   5994: bipush 102
    //   5996: istore 210
    //   5998: goto -42 -> 5956
    //   6001: aload 211
    //   6003: iload 213
    //   6005: caload
    //   6006: istore 214
    //   6008: iload 213
    //   6010: iconst_5
    //   6011: irem
    //   6012: tableswitch	default:+32 -> 6044, 0:+53->6065, 1:+60->6072, 2:+67->6079, 3:+74->6086
    //   6045: ldc2_w 14039
    //   6048: aload 211
    //   6050: iload 213
    //   6052: iload 215
    //   6054: iload 214
    //   6056: ixor
    //   6057: i2c
    //   6058: castore
    //   6059: iinc 213 1
    //   6062: goto -4458 -> 1604
    //   6065: bipush 63
    //   6067: istore 215
    //   6069: goto -21 -> 6048
    //   6072: bipush 75
    //   6074: istore 215
    //   6076: goto -28 -> 6048
    //   6079: bipush 64
    //   6081: istore 215
    //   6083: goto -35 -> 6048
    //   6086: bipush 102
    //   6088: istore 215
    //   6090: goto -42 -> 6048
    //   6093: aload 216
    //   6095: iload 218
    //   6097: caload
    //   6098: istore 219
    //   6100: iload 218
    //   6102: iconst_5
    //   6103: irem
    //   6104: tableswitch	default:+32 -> 6136, 0:+53->6157, 1:+60->6164, 2:+67->6171, 3:+74->6178
    //   6137: ldc2_w 14044
    //   6140: aload 216
    //   6142: iload 218
    //   6144: iload 220
    //   6146: iload 219
    //   6148: ixor
    //   6149: i2c
    //   6150: castore
    //   6151: iinc 218 1
    //   6154: goto -4512 -> 1642
    //   6157: bipush 63
    //   6159: istore 220
    //   6161: goto -21 -> 6140
    //   6164: bipush 75
    //   6166: istore 220
    //   6168: goto -28 -> 6140
    //   6171: bipush 64
    //   6173: istore 220
    //   6175: goto -35 -> 6140
    //   6178: bipush 102
    //   6180: istore 220
    //   6182: goto -42 -> 6140
    //   6185: aload 221
    //   6187: iload 223
    //   6189: caload
    //   6190: istore 224
    //   6192: iload 223
    //   6194: iconst_5
    //   6195: irem
    //   6196: tableswitch	default:+32 -> 6228, 0:+53->6249, 1:+60->6256, 2:+67->6263, 3:+74->6270
    //   6229: ldc2_w 14049
    //   6232: aload 221
    //   6234: iload 223
    //   6236: iload 225
    //   6238: iload 224
    //   6240: ixor
    //   6241: i2c
    //   6242: castore
    //   6243: iinc 223 1
    //   6246: goto -4566 -> 1680
    //   6249: bipush 63
    //   6251: istore 225
    //   6253: goto -21 -> 6232
    //   6256: bipush 75
    //   6258: istore 225
    //   6260: goto -28 -> 6232
    //   6263: bipush 64
    //   6265: istore 225
    //   6267: goto -35 -> 6232
    //   6270: bipush 102
    //   6272: istore 225
    //   6274: goto -42 -> 6232
    //   6277: aload 226
    //   6279: iload 228
    //   6281: caload
    //   6282: istore 229
    //   6284: iload 228
    //   6286: iconst_5
    //   6287: irem
    //   6288: tableswitch	default:+32 -> 6320, 0:+53->6341, 1:+60->6348, 2:+67->6355, 3:+74->6362
    //   6321: ldc2_w 14054
    //   6324: aload 226
    //   6326: iload 228
    //   6328: iload 230
    //   6330: iload 229
    //   6332: ixor
    //   6333: i2c
    //   6334: castore
    //   6335: iinc 228 1
    //   6338: goto -4620 -> 1718
    //   6341: bipush 63
    //   6343: istore 230
    //   6345: goto -21 -> 6324
    //   6348: bipush 75
    //   6350: istore 230
    //   6352: goto -28 -> 6324
    //   6355: bipush 64
    //   6357: istore 230
    //   6359: goto -35 -> 6324
    //   6362: bipush 102
    //   6364: istore 230
    //   6366: goto -42 -> 6324
    //   6369: aload 231
    //   6371: iload 233
    //   6373: caload
    //   6374: istore 234
    //   6376: iload 233
    //   6378: iconst_5
    //   6379: irem
    //   6380: tableswitch	default:+32 -> 6412, 0:+53->6433, 1:+60->6440, 2:+67->6447, 3:+74->6454
    //   6413: ldc2_w 14059
    //   6416: aload 231
    //   6418: iload 233
    //   6420: iload 235
    //   6422: iload 234
    //   6424: ixor
    //   6425: i2c
    //   6426: castore
    //   6427: iinc 233 1
    //   6430: goto -4674 -> 1756
    //   6433: bipush 63
    //   6435: istore 235
    //   6437: goto -21 -> 6416
    //   6440: bipush 75
    //   6442: istore 235
    //   6444: goto -28 -> 6416
    //   6447: bipush 64
    //   6449: istore 235
    //   6451: goto -35 -> 6416
    //   6454: bipush 102
    //   6456: istore 235
    //   6458: goto -42 -> 6416
    //   6461: aload 236
    //   6463: iload 238
    //   6465: caload
    //   6466: istore 239
    //   6468: iload 238
    //   6470: iconst_5
    //   6471: irem
    //   6472: tableswitch	default:+32 -> 6504, 0:+53->6525, 1:+60->6532, 2:+67->6539, 3:+74->6546
    //   6505: ldc2_w 14064
    //   6508: aload 236
    //   6510: iload 238
    //   6512: iload 240
    //   6514: iload 239
    //   6516: ixor
    //   6517: i2c
    //   6518: castore
    //   6519: iinc 238 1
    //   6522: goto -4728 -> 1794
    //   6525: bipush 63
    //   6527: istore 240
    //   6529: goto -21 -> 6508
    //   6532: bipush 75
    //   6534: istore 240
    //   6536: goto -28 -> 6508
    //   6539: bipush 64
    //   6541: istore 240
    //   6543: goto -35 -> 6508
    //   6546: bipush 102
    //   6548: istore 240
    //   6550: goto -42 -> 6508
    //   6553: aload 241
    //   6555: iload 243
    //   6557: caload
    //   6558: istore 244
    //   6560: iload 243
    //   6562: iconst_5
    //   6563: irem
    //   6564: tableswitch	default:+32 -> 6596, 0:+53->6617, 1:+60->6624, 2:+67->6631, 3:+74->6638
    //   6597: ldc2_w 14069
    //   6600: aload 241
    //   6602: iload 243
    //   6604: iload 245
    //   6606: iload 244
    //   6608: ixor
    //   6609: i2c
    //   6610: castore
    //   6611: iinc 243 1
    //   6614: goto -4782 -> 1832
    //   6617: bipush 63
    //   6619: istore 245
    //   6621: goto -21 -> 6600
    //   6624: bipush 75
    //   6626: istore 245
    //   6628: goto -28 -> 6600
    //   6631: bipush 64
    //   6633: istore 245
    //   6635: goto -35 -> 6600
    //   6638: bipush 102
    //   6640: istore 245
    //   6642: goto -42 -> 6600
    //   6645: aload 246
    //   6647: iload 248
    //   6649: caload
    //   6650: istore 249
    //   6652: iload 248
    //   6654: iconst_5
    //   6655: irem
    //   6656: tableswitch	default:+32 -> 6688, 0:+53->6709, 1:+60->6716, 2:+67->6723, 3:+74->6730
    //   6689: ldc2_w 14074
    //   6692: aload 246
    //   6694: iload 248
    //   6696: iload 250
    //   6698: iload 249
    //   6700: ixor
    //   6701: i2c
    //   6702: castore
    //   6703: iinc 248 1
    //   6706: goto -4836 -> 1870
    //   6709: bipush 63
    //   6711: istore 250
    //   6713: goto -21 -> 6692
    //   6716: bipush 75
    //   6718: istore 250
    //   6720: goto -28 -> 6692
    //   6723: bipush 64
    //   6725: istore 250
    //   6727: goto -35 -> 6692
    //   6730: bipush 102
    //   6732: istore 250
    //   6734: goto -42 -> 6692
    //   6737: aload 251
    //   6739: iload 253
    //   6741: caload
    //   6742: istore 254
    //   6744: iload 253
    //   6746: iconst_5
    //   6747: irem
    //   6748: tableswitch	default:+32 -> 6780, 0:+53->6801, 1:+60->6808, 2:+67->6815, 3:+74->6822
    //   6781: ldc2_w 14079
    //   6784: aload 251
    //   6786: iload 253
    //   6788: iload 255
    //   6790: iload 254
    //   6792: ixor
    //   6793: i2c
    //   6794: castore
    //   6795: iinc 253 1
    //   6798: goto -4890 -> 1908
    //   6801: bipush 63
    //   6803: istore 255
    //   6805: goto -21 -> 6784
    //   6808: bipush 75
    //   6810: istore 255
    //   6812: goto -28 -> 6784
    //   6815: bipush 64
    //   6817: istore 255
    //   6819: goto -35 -> 6784
    //   6822: bipush 102
    //   6824: istore 255
    //   6826: goto -42 -> 6784
    //   6829: wide
    //   6833: wide
    //   6837: caload
    //   6838: wide
    //   6842: wide
    //   6846: iconst_5
    //   6847: irem
    //   6848: tableswitch	default:+32 -> 6880, 0:+66->6914, 1:+75->6923, 2:+84->6932, 3:+93->6941
    //   6881: ldc2_w -15306
    //   6884: aconst_null
    //   6885: iconst_1
    //   6886: wide
    //   6890: wide
    //   6894: wide
    //   6898: wide
    //   6902: ixor
    //   6903: i2c
    //   6904: castore
    //   6905: wide
    //   6911: goto -4957 -> 1954
    //   6914: bipush 63
    //   6916: wide
    //   6920: goto -34 -> 6886
    //   6923: bipush 75
    //   6925: wide
    //   6929: goto -43 -> 6886
    //   6932: bipush 64
    //   6934: wide
    //   6938: goto -52 -> 6886
    //   6941: bipush 102
    //   6943: wide
    //   6947: goto -61 -> 6886
    //   6950: wide
    //   6954: wide
    //   6958: caload
    //   6959: wide
    //   6963: wide
    //   6967: iconst_5
    //   6968: irem
    //   6969: tableswitch	default:+31 -> 7000, 0:+65->7034, 1:+74->7043, 2:+83->7052, 3:+92->7061
    //   7001: ldc2_w -15306
    //   7004: aconst_null
    //   7005: lconst_0
    //   7006: wide
    //   7010: wide
    //   7014: wide
    //   7018: wide
    //   7022: ixor
    //   7023: i2c
    //   7024: castore
    //   7025: wide
    //   7031: goto -5025 -> 2006
    //   7034: bipush 63
    //   7036: wide
    //   7040: goto -34 -> 7006
    //   7043: bipush 75
    //   7045: wide
    //   7049: goto -43 -> 7006
    //   7052: bipush 64
    //   7054: wide
    //   7058: goto -52 -> 7006
    //   7061: bipush 102
    //   7063: wide
    //   7067: goto -61 -> 7006
    //   7070: wide
    //   7074: wide
    //   7078: caload
    //   7079: wide
    //   7083: wide
    //   7087: iconst_5
    //   7088: irem
    //   7089: tableswitch	default:+31 -> 7120, 0:+65->7154, 1:+74->7163, 2:+83->7172, 3:+92->7181
    //   7121: ldc2_w -15306
    //   7124: aconst_null
    //   7125: dconst_0
    //   7126: wide
    //   7130: wide
    //   7134: wide
    //   7138: wide
    //   7142: ixor
    //   7143: i2c
    //   7144: castore
    //   7145: wide
    //   7151: goto -5093 -> 2058
    //   7154: bipush 63
    //   7156: wide
    //   7160: goto -34 -> 7126
    //   7163: bipush 75
    //   7165: wide
    //   7169: goto -43 -> 7126
    //   7172: bipush 64
    //   7174: wide
    //   7178: goto -52 -> 7126
    //   7181: bipush 102
    //   7183: wide
    //   7187: goto -61 -> 7126
    //   7190: wide
    //   7194: wide
    //   7198: caload
    //   7199: wide
    //   7203: wide
    //   7207: iconst_5
    //   7208: irem
    //   7209: tableswitch	default:+31 -> 7240, 0:+65->7274, 1:+74->7283, 2:+83->7292, 3:+92->7301
    //   7241: ldc2_w -15306
    //   7244: aconst_null
    //   7245: ldc_w -15335
    //   7248: aconst_null
    //   7249: dconst_1
    //   7250: wide
    //   7254: wide
    //   7258: wide
    //   7262: ixor
    //   7263: i2c
    //   7264: castore
    //   7265: wide
    //   7271: goto -5161 -> 2110
    //   7274: bipush 63
    //   7276: wide
    //   7280: goto -34 -> 7246
    //   7283: bipush 75
    //   7285: wide
    //   7289: goto -43 -> 7246
    //   7292: bipush 64
    //   7294: wide
    //   7298: goto -52 -> 7246
    //   7301: bipush 102
    //   7303: wide
    //   7307: goto -61 -> 7246
  }

  public MessageService()
  {
    if (i1 != 0)
      App.wc = 1 + App.wc;
  }

  private void A()
  {
    tc.e(this.f);
  }

  private void B()
  {
    tc.f(this.f);
  }

  public static boolean C()
  {
    return true;
  }

  static ConnectivityManager a(MessageService paramMessageService)
  {
    return paramMessageService.m;
  }

  private String a(NetworkInfo paramNetworkInfo)
  {
    int i1 = C;
    String str5;
    if (paramNetworkInfo == null)
    {
      str5 = D[10];
      return str5;
    }
    label44: String str1;
    label51: label96: String str2;
    label104: String str3;
    switch (paramNetworkInfo.getType())
    {
    default:
      str1 = D[6];
      switch (p.a[paramNetworkInfo.getState().ordinal()])
      {
      default:
        str2 = D[17];
        if (paramNetworkInfo.isAvailable())
        {
          str3 = D[13];
          label119: if (!paramNetworkInfo.isConnected())
            break label303;
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      break;
    case 0:
    case 1:
    }
    label303: for (String str4 = D[13]; ; str4 = D[16])
    {
      str5 = D[21] + str1 + D[15] + str2 + D[14] + str4 + D[18] + str3;
      break;
      str1 = D[9];
      if (i1 == 0)
        break label51;
      str1 = D[11];
      if (i1 == 0)
        break label51;
      break label44;
      str2 = D[12];
      if (i1 == 0)
        break label104;
      str2 = D[7];
      if (i1 == 0)
        break label104;
      str2 = D[8];
      if (i1 == 0)
        break label104;
      str2 = D[19];
      if (i1 == 0)
        break label104;
      str2 = D[20];
      if (i1 == 0)
        break label104;
      break label96;
      str3 = D[16];
      break label119;
    }
  }

  static String a(MessageService paramMessageService, NetworkInfo paramNetworkInfo)
  {
    return paramMessageService.a(paramNetworkInfo);
  }

  private void a()
  {
    if (!c(this));
    for (boolean bool = true; ; bool = false)
    {
      this.u = bool;
      return;
    }
  }

  private void a(int paramInt)
  {
    if (paramInt == this.o);
    while (true)
    {
      return;
      g5.b(D[49] + this.o + D[50] + paramInt);
      if (this.a)
        d.a(this.d, true);
      this.o = paramInt;
    }
  }

  public static void a(Context paramContext)
  {
    paramContext.startService(new Intent(paramContext, MessageService.class).setAction(D[30]));
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    a(paramContext, paramBoolean, false, false, null);
  }

  public static void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, ArrayList<String> paramArrayList)
  {
    paramContext.startService(new Intent(paramContext, MessageService.class).setAction(D[32]).putExtra(D[29], paramBoolean1).putExtra(D[28], paramBoolean2).putExtra(D[34], paramBoolean3).putExtra(D[31], paramArrayList));
  }

  private void a(Message paramMessage)
  {
    if (s.b(paramMessage) == 7)
    {
      d.a(this.d, Message.obtain(paramMessage));
      l();
      c();
      a(true);
      if (C == 0);
    }
    else
    {
      switch (s.b(paramMessage))
      {
      case 4:
      case 6:
      case 7:
      case 8:
      case 9:
      case 11:
      case 12:
      case 15:
      case 18:
      case 21:
      case 23:
      case 24:
      case 25:
      case 26:
      case 31:
      case 32:
      case 33:
      default:
      case 5:
      case 3:
      case 13:
      case 14:
      case 16:
      case 17:
      case 19:
      case 20:
      case 22:
      case 27:
      case 28:
      case 29:
      case 30:
      case 34:
      case 10:
      }
    }
    while (true)
    {
      d.a(this.d, Message.obtain(paramMessage));
      while (true)
      {
        return;
        l();
        if (paramMessage.arg2 != 0)
          break;
      }
      l();
      c();
      a(true);
    }
  }

  private void a(Messenger paramMessenger)
  {
    this.d = paramMessenger;
    this.a = true;
    NetworkInfo localNetworkInfo = this.m.getActiveNetworkInfo();
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
    {
      this.o = localNetworkInfo.getType();
      this.n = true;
    }
    IntentFilter localIntentFilter = new IntentFilter(D[4]);
    registerReceiver(this.A, localIntentFilter);
    a(true);
    if (this.i)
      tc.a(this.f);
  }

  private void a(cg paramcg)
  {
    tc.a(this.f, paramcg);
    this.w = true;
  }

  static void a(MessageService paramMessageService, int paramInt)
  {
    paramMessageService.a(paramInt);
  }

  static void a(MessageService paramMessageService, Message paramMessage)
  {
    paramMessageService.b(paramMessage);
  }

  static void a(MessageService paramMessageService, Messenger paramMessenger)
  {
    paramMessageService.a(paramMessenger);
  }

  static void a(MessageService paramMessageService, cg paramcg)
  {
    paramMessageService.a(paramcg);
  }

  static void a(MessageService paramMessageService, String paramString1, String paramString2)
  {
    paramMessageService.a(paramString1, paramString2);
  }

  static void a(MessageService paramMessageService, String paramString1, String paramString2, Messenger paramMessenger)
  {
    paramMessageService.a(paramString1, paramString2, paramMessenger);
  }

  static void a(MessageService paramMessageService, boolean paramBoolean)
  {
    paramMessageService.b(paramBoolean);
  }

  private void a(String paramString1, String paramString2)
  {
    this.j = paramString1;
    this.k = paramString2;
  }

  private void a(String paramString1, String paramString2, Messenger paramMessenger)
  {
    this.j = paramString1;
    this.k = paramString2;
    this.f = paramMessenger;
    this.i = true;
    a(true);
    if (this.a)
      tc.a(paramMessenger);
  }

  private void b()
  {
    g5.b(D[3]);
    this.p.a();
  }

  public static void b(Context paramContext)
  {
    paramContext.startService(new Intent(paramContext, MessageService.class).setAction(D[27]));
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    paramContext.startService(new Intent(paramContext, MessageService.class).setAction(D[33]).putExtra(D[25], paramBoolean));
  }

  private void b(Message paramMessage)
  {
    b();
    switch (paramMessage.arg1)
    {
    default:
      tc.a(this.f, Message.obtain(paramMessage));
    case 2:
    }
  }

  static void b(MessageService paramMessageService)
  {
    paramMessageService.k();
  }

  static void b(MessageService paramMessageService, Message paramMessage)
  {
    paramMessageService.a(paramMessage);
  }

  static void b(MessageService paramMessageService, boolean paramBoolean)
  {
    paramMessageService.d(paramBoolean);
  }

  private void b(boolean paramBoolean)
  {
    if (this.n != paramBoolean)
    {
      if (paramBoolean == true)
      {
        g5.b(D[35]);
        a(true);
        if (C == 0);
      }
      else
      {
        g5.b(D[36]);
        if (this.a)
          d.a(this.d, true);
      }
      this.n = paramBoolean;
    }
  }

  private void c()
  {
    g5.b(D[41]);
    this.q = 10000L;
    this.r = 20000L;
  }

  static void c(MessageService paramMessageService)
  {
    paramMessageService.p();
  }

  private void c(boolean paramBoolean)
  {
    File localFile = f();
    if (paramBoolean);
    while (true)
    {
      try
      {
        localFile.createNewFile();
        this.h = paramBoolean;
        return;
      }
      catch (IOException localIOException)
      {
        g5.d(localIOException);
        if (C == 0)
          continue;
      }
      localFile.delete();
    }
  }

  public static boolean c(Context paramContext)
  {
    if ((C2DMRegistrar.b(paramContext)) && (App.j(paramContext) < 3) && (C()) && ((Build.VERSION.SDK_INT < 9) || ((Build.VERSION.SDK_INT >= 9) && (!App.k(paramContext)))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private long d()
  {
    long l1 = 172800000L;
    if (this.q > l1);
    while (true)
    {
      return l1;
      this.r += this.q;
      this.q = (this.r - this.q);
      l1 = this.r - this.q;
    }
  }

  static Messenger d(MessageService paramMessageService)
  {
    return paramMessageService.d;
  }

  private void d(boolean paramBoolean)
  {
    tc.d(this.f);
    this.w = true;
    k();
    if (paramBoolean)
    {
      NetworkInfo localNetworkInfo = this.m.getActiveNetworkInfo();
      if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
      {
        q();
        if (C == 0);
      }
      else
      {
        this.u = true;
      }
    }
  }

  private void e()
  {
    int i1 = C;
    g5.b(D[24]);
    if (!this.h);
    while (true)
    {
      return;
      if ((this.i) && (this.a) && (!this.z))
        if (!this.w)
        {
          long l1 = this.p.c();
          g5.b(D[23] + l1);
          if (l1 < 1200000L)
          {
            d.a(this.d, s.d());
            if (i1 == 0);
          }
          else
          {
            d.a(this.d, true);
          }
          if (i1 == 0);
        }
        else
        {
          a(false);
        }
    }
  }

  static void e(MessageService paramMessageService)
  {
    paramMessageService.w();
  }

  private File f()
  {
    return new File(getFilesDir(), D[0]);
  }

  static void f(MessageService paramMessageService)
  {
    paramMessageService.x();
  }

  static void g(MessageService paramMessageService)
  {
    paramMessageService.y();
  }

  private boolean g()
  {
    return f().exists();
  }

  private void h()
  {
    if (g() == true)
    {
      o();
      r();
    }
  }

  static void h(MessageService paramMessageService)
  {
    paramMessageService.z();
  }

  static void i(MessageService paramMessageService)
  {
    paramMessageService.A();
  }

  private boolean i()
  {
    boolean bool1 = true;
    g5.b(D[48]);
    if (this.x == null)
    {
      this.x = this.B;
      if (C == 0);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      if (!this.x.hasMessages(0));
      while (true)
      {
        if (bool1)
          this.x.sendEmptyMessageDelayed(0, 600000L);
        return bool1;
        bool1 = bool2;
      }
    }
  }

  private void j()
  {
    g5.b(D[44]);
    if (this.x == null)
      this.x = this.B;
    this.x.removeMessages(0);
    this.x.sendEmptyMessageDelayed(0, 600000L);
  }

  static void j(MessageService paramMessageService)
  {
    paramMessageService.B();
  }

  private void k()
  {
    g5.b(D[5]);
    if (this.x != null)
    {
      this.x.removeMessages(0);
      this.x = null;
    }
  }

  static void k(MessageService paramMessageService)
  {
    paramMessageService.t();
  }

  static void l(MessageService paramMessageService)
  {
    paramMessageService.u();
  }

  static void m(MessageService paramMessageService)
  {
    paramMessageService.v();
  }

  private boolean m()
  {
    if (this.x != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void n()
  {
    g5.b(D[51]);
    PendingIntent localPendingIntent = PendingIntent.getService(this, 0, new Intent(D[2], null, this, MessageService.class), 0);
    if (this.t);
    for (int i1 = 285000; ; i1 = 585000)
    {
      this.l.setRepeating(2, SystemClock.elapsedRealtime() + i1, i1, localPendingIntent);
      return;
    }
  }

  static boolean n(MessageService paramMessageService)
  {
    return paramMessageService.a;
  }

  static m o(MessageService paramMessageService)
  {
    return paramMessageService.b;
  }

  private void o()
  {
    g5.b(D[1]);
    PendingIntent localPendingIntent = PendingIntent.getService(this, 0, new Intent(D[2], null, this, MessageService.class), 0);
    this.l.cancel(localPendingIntent);
  }

  private void p()
  {
    a();
    n();
  }

  private void r()
  {
    if (this.h == true);
    while (true)
    {
      return;
      g5.b(D[40]);
      c(true);
      this.b = new m(this, this.e);
      this.b.start();
    }
  }

  private void s()
  {
    g5.b(D[39]);
    if (!this.h);
    while (true)
    {
      return;
      c(false);
      if (!this.w)
        tc.d(this.f);
      this.w = true;
      if (this.a)
      {
        unregisterReceiver(this.A);
        d.d(this.d);
        this.a = false;
        if (C == 0);
      }
      else
      {
        this.b.quit();
      }
    }
  }

  private void t()
  {
    App.d(D[37]);
    d.b(this.d);
    l();
    c();
    a(true);
  }

  private void u()
  {
    App.d(D[38]);
    d.a(this.d);
  }

  private void v()
  {
    d.c(this.d);
  }

  private void w()
  {
    tc.b(this.f);
  }

  private void x()
  {
    this.c.a(30000L);
  }

  private void y()
  {
    this.c.a();
  }

  private void z()
  {
    tc.c(this.f);
    if (!c(this))
    {
      n();
      if (C == 0);
    }
    else
    {
      o();
      j();
    }
    c();
    a();
  }

  public void a(boolean paramBoolean)
  {
    a(paramBoolean, false, null);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2, ArrayList<String> paramArrayList)
  {
    int i1 = C;
    if (!this.w)
    {
      if (paramBoolean2)
      {
        g5.b(D[45]);
        d.e(this.d);
      }
      if ((!c(this)) || (m()) || (!i()));
    }
    while (true)
    {
      return;
      if (paramBoolean1)
      {
        this.u = true;
        this.v = true;
        if (i1 == 0);
      }
      else
      {
        if (!this.u)
          continue;
      }
      NetworkInfo localNetworkInfo = this.m.getActiveNetworkInfo();
      if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
      {
        if ((this.u) && (this.v))
        {
          this.v = false;
          g5.b(D[46] + a(localNetworkInfo));
          App.v();
          if (i1 != 0);
        }
      }
      else if ((this.h) && (this.i) && (this.a) && (!this.z))
      {
        boolean bool = App.kb();
        App.f(bool);
        d.a(this.d, this.j, this.k, paramArrayList, bool);
        this.w = false;
      }
    }
  }

  public void l()
  {
    g5.b(D[47]);
    if (this.x != null)
    {
      this.x.removeMessages(0);
      this.x.sendEmptyMessageDelayed(0, 600000L);
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.g.getBinder();
  }

  public void onCreate()
  {
    super.onCreate();
    g5.b(D[54]);
    this.m = ((ConnectivityManager)getSystemService(D[53]));
    this.l = ((AlarmManager)getSystemService(D[52]));
    h();
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(D[22]);
    if (this.h == true)
      s();
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    int i1 = C;
    super.onStart(paramIntent, paramInt);
    if (paramIntent == null)
    {
      r();
      if (i1 == 0);
    }
    else
    {
      String str = paramIntent.getAction();
      if (str == null)
      {
        r();
        if (i1 == 0);
      }
      else if (str.equals(D[26]) == true)
      {
        s();
        q();
        stopSelf();
        if (i1 == 0);
      }
      else if (str.equals(D[27]) == true)
      {
        o();
        s();
        this.z = true;
        stopSelf();
        if (i1 == 0);
      }
      else if (str.equals(D[30]) == true)
      {
        this.z = false;
        r();
        if (i1 == 0);
      }
      else if (str.equals(D[2]) == true)
      {
        r();
        e();
        if (i1 == 0);
      }
      else if (str.equals(D[32]) == true)
      {
        this.y = false;
        r();
        boolean bool1 = paramIntent.getBooleanExtra(D[28], false);
        boolean bool2 = paramIntent.getBooleanExtra(D[29], false);
        boolean bool3 = paramIntent.getBooleanExtra(D[34], false);
        ArrayList localArrayList = paramIntent.getStringArrayListExtra(D[31]);
        if (bool1)
          c();
        a(bool2, bool3, localArrayList);
        if (i1 == 0);
      }
      else if (str.equals(D[33]) == true)
      {
        r();
        if (paramIntent.getBooleanExtra(D[25], false))
          p();
      }
    }
  }

  public void q()
  {
    if (!this.y)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = d();
      long l3 = l2 + l2 / 2L - new Random().nextLong() % l2;
      g5.b(D[42] + l3);
      PendingIntent localPendingIntent = PendingIntent.getService(this, 0, new Intent(this, MessageService.class).setAction(D[32]).putExtra(D[29], true), 0);
      this.l.set(2, l1 + l3, localPendingIntent);
      this.y = true;
      if (C == 0);
    }
    else
    {
      g5.b(D[43]);
    }
  }
}