package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;

public class RegisterPhone extends VerifyNumber
{
  private static final String[] F;
  private static String q;
  private static String r;
  private static int s;
  private static String t;
  boolean A = false;
  EditText B;
  EditText C;
  EditText D;
  ProgressDialog E;
  private TextWatcher u;
  private TextWatcher v;
  private String w;
  boolean x = false;
  boolean y = false;
  boolean z = false;

  static
  {
    // Byte code:
    //   0: bipush 55
    //   2: anewarray 31	java/lang/String
    //   5: astore_0
    //   6: ldc 33
    //   8: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   11: astore_1
    //   12: aload_1
    //   13: arraylength
    //   14: istore_2
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_2
    //   18: iload_3
    //   19: if_icmpgt +2142 -> 2161
    //   22: aload_0
    //   23: iconst_0
    //   24: new 31	java/lang/String
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 41	java/lang/String:<init>	([C)V
    //   32: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   35: aastore
    //   36: ldc 47
    //   38: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   41: astore 6
    //   43: aload 6
    //   45: arraylength
    //   46: istore 7
    //   48: iconst_0
    //   49: istore 8
    //   51: iload 7
    //   53: iload 8
    //   55: if_icmpgt +2192 -> 2247
    //   58: aload_0
    //   59: iconst_1
    //   60: new 31	java/lang/String
    //   63: dup
    //   64: aload 6
    //   66: invokespecial 41	java/lang/String:<init>	([C)V
    //   69: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   72: aastore
    //   73: ldc 49
    //   75: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   78: astore 11
    //   80: aload 11
    //   82: arraylength
    //   83: istore 12
    //   85: iconst_0
    //   86: istore 13
    //   88: iload 12
    //   90: iload 13
    //   92: if_icmpgt +2245 -> 2337
    //   95: aload_0
    //   96: iconst_2
    //   97: new 31	java/lang/String
    //   100: dup
    //   101: aload 11
    //   103: invokespecial 41	java/lang/String:<init>	([C)V
    //   106: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   109: aastore
    //   110: ldc 51
    //   112: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   115: astore 16
    //   117: aload 16
    //   119: arraylength
    //   120: istore 17
    //   122: iconst_0
    //   123: istore 18
    //   125: iload 17
    //   127: iload 18
    //   129: if_icmpgt +2300 -> 2429
    //   132: aload_0
    //   133: iconst_3
    //   134: new 31	java/lang/String
    //   137: dup
    //   138: aload 16
    //   140: invokespecial 41	java/lang/String:<init>	([C)V
    //   143: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   146: aastore
    //   147: ldc 53
    //   149: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   152: astore 21
    //   154: aload 21
    //   156: arraylength
    //   157: istore 22
    //   159: iconst_0
    //   160: istore 23
    //   162: iload 22
    //   164: iload 23
    //   166: if_icmpgt +2355 -> 2521
    //   169: aload_0
    //   170: iconst_4
    //   171: new 31	java/lang/String
    //   174: dup
    //   175: aload 21
    //   177: invokespecial 41	java/lang/String:<init>	([C)V
    //   180: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   183: aastore
    //   184: ldc 55
    //   186: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   189: astore 26
    //   191: aload 26
    //   193: arraylength
    //   194: istore 27
    //   196: iconst_0
    //   197: istore 28
    //   199: iload 27
    //   201: iload 28
    //   203: if_icmpgt +2410 -> 2613
    //   206: aload_0
    //   207: iconst_5
    //   208: new 31	java/lang/String
    //   211: dup
    //   212: aload 26
    //   214: invokespecial 41	java/lang/String:<init>	([C)V
    //   217: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   220: aastore
    //   221: ldc 57
    //   223: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   226: astore 31
    //   228: aload 31
    //   230: arraylength
    //   231: istore 32
    //   233: iconst_0
    //   234: istore 33
    //   236: iload 32
    //   238: iload 33
    //   240: if_icmpgt +2465 -> 2705
    //   243: aload_0
    //   244: bipush 6
    //   246: new 31	java/lang/String
    //   249: dup
    //   250: aload 31
    //   252: invokespecial 41	java/lang/String:<init>	([C)V
    //   255: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   258: aastore
    //   259: ldc 59
    //   261: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   264: astore 36
    //   266: aload 36
    //   268: arraylength
    //   269: istore 37
    //   271: iconst_0
    //   272: istore 38
    //   274: iload 37
    //   276: iload 38
    //   278: if_icmpgt +2519 -> 2797
    //   281: aload_0
    //   282: bipush 7
    //   284: new 31	java/lang/String
    //   287: dup
    //   288: aload 36
    //   290: invokespecial 41	java/lang/String:<init>	([C)V
    //   293: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   296: aastore
    //   297: ldc 61
    //   299: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   302: astore 41
    //   304: aload 41
    //   306: arraylength
    //   307: istore 42
    //   309: iconst_0
    //   310: istore 43
    //   312: iload 42
    //   314: iload 43
    //   316: if_icmpgt +2573 -> 2889
    //   319: aload_0
    //   320: bipush 8
    //   322: new 31	java/lang/String
    //   325: dup
    //   326: aload 41
    //   328: invokespecial 41	java/lang/String:<init>	([C)V
    //   331: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   334: aastore
    //   335: ldc 63
    //   337: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   340: astore 46
    //   342: aload 46
    //   344: arraylength
    //   345: istore 47
    //   347: iconst_0
    //   348: istore 48
    //   350: iload 47
    //   352: iload 48
    //   354: if_icmpgt +2627 -> 2981
    //   357: aload_0
    //   358: bipush 9
    //   360: new 31	java/lang/String
    //   363: dup
    //   364: aload 46
    //   366: invokespecial 41	java/lang/String:<init>	([C)V
    //   369: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   372: aastore
    //   373: ldc 65
    //   375: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   378: astore 51
    //   380: aload 51
    //   382: arraylength
    //   383: istore 52
    //   385: iconst_0
    //   386: istore 53
    //   388: iload 52
    //   390: iload 53
    //   392: if_icmpgt +2681 -> 3073
    //   395: aload_0
    //   396: bipush 10
    //   398: new 31	java/lang/String
    //   401: dup
    //   402: aload 51
    //   404: invokespecial 41	java/lang/String:<init>	([C)V
    //   407: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   410: aastore
    //   411: ldc 67
    //   413: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   416: astore 56
    //   418: aload 56
    //   420: arraylength
    //   421: istore 57
    //   423: iconst_0
    //   424: istore 58
    //   426: iload 57
    //   428: iload 58
    //   430: if_icmpgt +2735 -> 3165
    //   433: aload_0
    //   434: bipush 11
    //   436: new 31	java/lang/String
    //   439: dup
    //   440: aload 56
    //   442: invokespecial 41	java/lang/String:<init>	([C)V
    //   445: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   448: aastore
    //   449: ldc 69
    //   451: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   454: astore 61
    //   456: aload 61
    //   458: arraylength
    //   459: istore 62
    //   461: iconst_0
    //   462: istore 63
    //   464: iload 62
    //   466: iload 63
    //   468: if_icmpgt +2789 -> 3257
    //   471: aload_0
    //   472: bipush 12
    //   474: new 31	java/lang/String
    //   477: dup
    //   478: aload 61
    //   480: invokespecial 41	java/lang/String:<init>	([C)V
    //   483: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   486: aastore
    //   487: ldc 71
    //   489: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   492: astore 66
    //   494: aload 66
    //   496: arraylength
    //   497: istore 67
    //   499: iconst_0
    //   500: istore 68
    //   502: iload 67
    //   504: iload 68
    //   506: if_icmpgt +2843 -> 3349
    //   509: aload_0
    //   510: bipush 13
    //   512: new 31	java/lang/String
    //   515: dup
    //   516: aload 66
    //   518: invokespecial 41	java/lang/String:<init>	([C)V
    //   521: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   524: aastore
    //   525: ldc 73
    //   527: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   530: astore 71
    //   532: aload 71
    //   534: arraylength
    //   535: istore 72
    //   537: iconst_0
    //   538: istore 73
    //   540: iload 72
    //   542: iload 73
    //   544: if_icmpgt +2897 -> 3441
    //   547: aload_0
    //   548: bipush 14
    //   550: new 31	java/lang/String
    //   553: dup
    //   554: aload 71
    //   556: invokespecial 41	java/lang/String:<init>	([C)V
    //   559: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   562: aastore
    //   563: ldc 75
    //   565: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   568: astore 76
    //   570: aload 76
    //   572: arraylength
    //   573: istore 77
    //   575: iconst_0
    //   576: istore 78
    //   578: iload 77
    //   580: iload 78
    //   582: if_icmpgt +2951 -> 3533
    //   585: aload_0
    //   586: bipush 15
    //   588: new 31	java/lang/String
    //   591: dup
    //   592: aload 76
    //   594: invokespecial 41	java/lang/String:<init>	([C)V
    //   597: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   600: aastore
    //   601: ldc 77
    //   603: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   606: astore 81
    //   608: aload 81
    //   610: arraylength
    //   611: istore 82
    //   613: iconst_0
    //   614: istore 83
    //   616: iload 82
    //   618: iload 83
    //   620: if_icmpgt +3005 -> 3625
    //   623: aload_0
    //   624: bipush 16
    //   626: new 31	java/lang/String
    //   629: dup
    //   630: aload 81
    //   632: invokespecial 41	java/lang/String:<init>	([C)V
    //   635: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   638: aastore
    //   639: ldc 79
    //   641: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   644: astore 86
    //   646: aload 86
    //   648: arraylength
    //   649: istore 87
    //   651: iconst_0
    //   652: istore 88
    //   654: iload 87
    //   656: iload 88
    //   658: if_icmpgt +3059 -> 3717
    //   661: aload_0
    //   662: bipush 17
    //   664: new 31	java/lang/String
    //   667: dup
    //   668: aload 86
    //   670: invokespecial 41	java/lang/String:<init>	([C)V
    //   673: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   676: aastore
    //   677: ldc 81
    //   679: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   682: astore 91
    //   684: aload 91
    //   686: arraylength
    //   687: istore 92
    //   689: iconst_0
    //   690: istore 93
    //   692: iload 92
    //   694: iload 93
    //   696: if_icmpgt +3113 -> 3809
    //   699: aload_0
    //   700: bipush 18
    //   702: new 31	java/lang/String
    //   705: dup
    //   706: aload 91
    //   708: invokespecial 41	java/lang/String:<init>	([C)V
    //   711: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   714: aastore
    //   715: ldc 83
    //   717: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   720: astore 96
    //   722: aload 96
    //   724: arraylength
    //   725: istore 97
    //   727: iconst_0
    //   728: istore 98
    //   730: iload 97
    //   732: iload 98
    //   734: if_icmpgt +3167 -> 3901
    //   737: aload_0
    //   738: bipush 19
    //   740: new 31	java/lang/String
    //   743: dup
    //   744: aload 96
    //   746: invokespecial 41	java/lang/String:<init>	([C)V
    //   749: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   752: aastore
    //   753: ldc 85
    //   755: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   758: astore 101
    //   760: aload 101
    //   762: arraylength
    //   763: istore 102
    //   765: iconst_0
    //   766: istore 103
    //   768: iload 102
    //   770: iload 103
    //   772: if_icmpgt +3221 -> 3993
    //   775: aload_0
    //   776: bipush 20
    //   778: new 31	java/lang/String
    //   781: dup
    //   782: aload 101
    //   784: invokespecial 41	java/lang/String:<init>	([C)V
    //   787: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   790: aastore
    //   791: ldc 87
    //   793: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   796: astore 106
    //   798: aload 106
    //   800: arraylength
    //   801: istore 107
    //   803: iconst_0
    //   804: istore 108
    //   806: iload 107
    //   808: iload 108
    //   810: if_icmpgt +3275 -> 4085
    //   813: aload_0
    //   814: bipush 21
    //   816: new 31	java/lang/String
    //   819: dup
    //   820: aload 106
    //   822: invokespecial 41	java/lang/String:<init>	([C)V
    //   825: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   828: aastore
    //   829: ldc 89
    //   831: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   834: astore 111
    //   836: aload 111
    //   838: arraylength
    //   839: istore 112
    //   841: iconst_0
    //   842: istore 113
    //   844: iload 112
    //   846: iload 113
    //   848: if_icmpgt +3329 -> 4177
    //   851: aload_0
    //   852: bipush 22
    //   854: new 31	java/lang/String
    //   857: dup
    //   858: aload 111
    //   860: invokespecial 41	java/lang/String:<init>	([C)V
    //   863: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   866: aastore
    //   867: ldc 91
    //   869: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   872: astore 116
    //   874: aload 116
    //   876: arraylength
    //   877: istore 117
    //   879: iconst_0
    //   880: istore 118
    //   882: iload 117
    //   884: iload 118
    //   886: if_icmpgt +3383 -> 4269
    //   889: aload_0
    //   890: bipush 23
    //   892: new 31	java/lang/String
    //   895: dup
    //   896: aload 116
    //   898: invokespecial 41	java/lang/String:<init>	([C)V
    //   901: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   904: aastore
    //   905: ldc 93
    //   907: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   910: astore 121
    //   912: aload 121
    //   914: arraylength
    //   915: istore 122
    //   917: iconst_0
    //   918: istore 123
    //   920: iload 122
    //   922: iload 123
    //   924: if_icmpgt +3437 -> 4361
    //   927: aload_0
    //   928: bipush 24
    //   930: new 31	java/lang/String
    //   933: dup
    //   934: aload 121
    //   936: invokespecial 41	java/lang/String:<init>	([C)V
    //   939: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   942: aastore
    //   943: ldc 95
    //   945: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   948: astore 126
    //   950: aload 126
    //   952: arraylength
    //   953: istore 127
    //   955: iconst_0
    //   956: istore 128
    //   958: iload 127
    //   960: iload 128
    //   962: if_icmpgt +3491 -> 4453
    //   965: aload_0
    //   966: bipush 25
    //   968: new 31	java/lang/String
    //   971: dup
    //   972: aload 126
    //   974: invokespecial 41	java/lang/String:<init>	([C)V
    //   977: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   980: aastore
    //   981: ldc 97
    //   983: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   986: astore 131
    //   988: aload 131
    //   990: arraylength
    //   991: istore 132
    //   993: iconst_0
    //   994: istore 133
    //   996: iload 132
    //   998: iload 133
    //   1000: if_icmpgt +3545 -> 4545
    //   1003: aload_0
    //   1004: bipush 26
    //   1006: new 31	java/lang/String
    //   1009: dup
    //   1010: aload 131
    //   1012: invokespecial 41	java/lang/String:<init>	([C)V
    //   1015: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1018: aastore
    //   1019: ldc 99
    //   1021: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1024: astore 136
    //   1026: aload 136
    //   1028: arraylength
    //   1029: istore 137
    //   1031: iconst_0
    //   1032: istore 138
    //   1034: iload 137
    //   1036: iload 138
    //   1038: if_icmpgt +3599 -> 4637
    //   1041: aload_0
    //   1042: bipush 27
    //   1044: new 31	java/lang/String
    //   1047: dup
    //   1048: aload 136
    //   1050: invokespecial 41	java/lang/String:<init>	([C)V
    //   1053: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1056: aastore
    //   1057: ldc 101
    //   1059: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1062: astore 141
    //   1064: aload 141
    //   1066: arraylength
    //   1067: istore 142
    //   1069: iconst_0
    //   1070: istore 143
    //   1072: iload 142
    //   1074: iload 143
    //   1076: if_icmpgt +3653 -> 4729
    //   1079: aload_0
    //   1080: bipush 28
    //   1082: new 31	java/lang/String
    //   1085: dup
    //   1086: aload 141
    //   1088: invokespecial 41	java/lang/String:<init>	([C)V
    //   1091: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1094: aastore
    //   1095: ldc 103
    //   1097: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1100: astore 146
    //   1102: aload 146
    //   1104: arraylength
    //   1105: istore 147
    //   1107: iconst_0
    //   1108: istore 148
    //   1110: iload 147
    //   1112: iload 148
    //   1114: if_icmpgt +3707 -> 4821
    //   1117: aload_0
    //   1118: bipush 29
    //   1120: new 31	java/lang/String
    //   1123: dup
    //   1124: aload 146
    //   1126: invokespecial 41	java/lang/String:<init>	([C)V
    //   1129: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1132: aastore
    //   1133: ldc 105
    //   1135: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1138: astore 151
    //   1140: aload 151
    //   1142: arraylength
    //   1143: istore 152
    //   1145: iconst_0
    //   1146: istore 153
    //   1148: iload 152
    //   1150: iload 153
    //   1152: if_icmpgt +3761 -> 4913
    //   1155: aload_0
    //   1156: bipush 30
    //   1158: new 31	java/lang/String
    //   1161: dup
    //   1162: aload 151
    //   1164: invokespecial 41	java/lang/String:<init>	([C)V
    //   1167: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1170: aastore
    //   1171: ldc 107
    //   1173: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1176: astore 156
    //   1178: aload 156
    //   1180: arraylength
    //   1181: istore 157
    //   1183: iconst_0
    //   1184: istore 158
    //   1186: iload 157
    //   1188: iload 158
    //   1190: if_icmpgt +3815 -> 5005
    //   1193: aload_0
    //   1194: bipush 31
    //   1196: new 31	java/lang/String
    //   1199: dup
    //   1200: aload 156
    //   1202: invokespecial 41	java/lang/String:<init>	([C)V
    //   1205: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1208: aastore
    //   1209: ldc 109
    //   1211: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1214: astore 161
    //   1216: aload 161
    //   1218: arraylength
    //   1219: istore 162
    //   1221: iconst_0
    //   1222: istore 163
    //   1224: iload 162
    //   1226: iload 163
    //   1228: if_icmpgt +3869 -> 5097
    //   1231: aload_0
    //   1232: bipush 32
    //   1234: new 31	java/lang/String
    //   1237: dup
    //   1238: aload 161
    //   1240: invokespecial 41	java/lang/String:<init>	([C)V
    //   1243: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1246: aastore
    //   1247: ldc 111
    //   1249: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1252: astore 166
    //   1254: aload 166
    //   1256: arraylength
    //   1257: istore 167
    //   1259: iconst_0
    //   1260: istore 168
    //   1262: iload 167
    //   1264: iload 168
    //   1266: if_icmpgt +3923 -> 5189
    //   1269: aload_0
    //   1270: bipush 33
    //   1272: new 31	java/lang/String
    //   1275: dup
    //   1276: aload 166
    //   1278: invokespecial 41	java/lang/String:<init>	([C)V
    //   1281: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1284: aastore
    //   1285: ldc 113
    //   1287: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1290: astore 171
    //   1292: aload 171
    //   1294: arraylength
    //   1295: istore 172
    //   1297: iconst_0
    //   1298: istore 173
    //   1300: iload 172
    //   1302: iload 173
    //   1304: if_icmpgt +3977 -> 5281
    //   1307: aload_0
    //   1308: bipush 34
    //   1310: new 31	java/lang/String
    //   1313: dup
    //   1314: aload 171
    //   1316: invokespecial 41	java/lang/String:<init>	([C)V
    //   1319: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1322: aastore
    //   1323: ldc 115
    //   1325: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1328: astore 176
    //   1330: aload 176
    //   1332: arraylength
    //   1333: istore 177
    //   1335: iconst_0
    //   1336: istore 178
    //   1338: iload 177
    //   1340: iload 178
    //   1342: if_icmpgt +4031 -> 5373
    //   1345: aload_0
    //   1346: bipush 35
    //   1348: new 31	java/lang/String
    //   1351: dup
    //   1352: aload 176
    //   1354: invokespecial 41	java/lang/String:<init>	([C)V
    //   1357: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1360: aastore
    //   1361: ldc 117
    //   1363: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1366: astore 181
    //   1368: aload 181
    //   1370: arraylength
    //   1371: istore 182
    //   1373: iconst_0
    //   1374: istore 183
    //   1376: iload 182
    //   1378: iload 183
    //   1380: if_icmpgt +4085 -> 5465
    //   1383: aload_0
    //   1384: bipush 36
    //   1386: new 31	java/lang/String
    //   1389: dup
    //   1390: aload 181
    //   1392: invokespecial 41	java/lang/String:<init>	([C)V
    //   1395: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1398: aastore
    //   1399: ldc 119
    //   1401: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1404: astore 186
    //   1406: aload 186
    //   1408: arraylength
    //   1409: istore 187
    //   1411: iconst_0
    //   1412: istore 188
    //   1414: iload 187
    //   1416: iload 188
    //   1418: if_icmpgt +4139 -> 5557
    //   1421: aload_0
    //   1422: bipush 37
    //   1424: new 31	java/lang/String
    //   1427: dup
    //   1428: aload 186
    //   1430: invokespecial 41	java/lang/String:<init>	([C)V
    //   1433: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1436: aastore
    //   1437: ldc 121
    //   1439: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1442: astore 191
    //   1444: aload 191
    //   1446: arraylength
    //   1447: istore 192
    //   1449: iconst_0
    //   1450: istore 193
    //   1452: iload 192
    //   1454: iload 193
    //   1456: if_icmpgt +4193 -> 5649
    //   1459: aload_0
    //   1460: bipush 38
    //   1462: new 31	java/lang/String
    //   1465: dup
    //   1466: aload 191
    //   1468: invokespecial 41	java/lang/String:<init>	([C)V
    //   1471: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1474: aastore
    //   1475: ldc 123
    //   1477: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1480: astore 196
    //   1482: aload 196
    //   1484: arraylength
    //   1485: istore 197
    //   1487: iconst_0
    //   1488: istore 198
    //   1490: iload 197
    //   1492: iload 198
    //   1494: if_icmpgt +4247 -> 5741
    //   1497: aload_0
    //   1498: bipush 39
    //   1500: new 31	java/lang/String
    //   1503: dup
    //   1504: aload 196
    //   1506: invokespecial 41	java/lang/String:<init>	([C)V
    //   1509: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1512: aastore
    //   1513: ldc 125
    //   1515: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1518: astore 201
    //   1520: aload 201
    //   1522: arraylength
    //   1523: istore 202
    //   1525: iconst_0
    //   1526: istore 203
    //   1528: iload 202
    //   1530: iload 203
    //   1532: if_icmpgt +4301 -> 5833
    //   1535: aload_0
    //   1536: bipush 40
    //   1538: new 31	java/lang/String
    //   1541: dup
    //   1542: aload 201
    //   1544: invokespecial 41	java/lang/String:<init>	([C)V
    //   1547: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1550: aastore
    //   1551: ldc 127
    //   1553: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1556: astore 206
    //   1558: aload 206
    //   1560: arraylength
    //   1561: istore 207
    //   1563: iconst_0
    //   1564: istore 208
    //   1566: iload 207
    //   1568: iload 208
    //   1570: if_icmpgt +4355 -> 5925
    //   1573: aload_0
    //   1574: bipush 41
    //   1576: new 31	java/lang/String
    //   1579: dup
    //   1580: aload 206
    //   1582: invokespecial 41	java/lang/String:<init>	([C)V
    //   1585: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1588: aastore
    //   1589: ldc 129
    //   1591: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1594: astore 211
    //   1596: aload 211
    //   1598: arraylength
    //   1599: istore 212
    //   1601: iconst_0
    //   1602: istore 213
    //   1604: iload 212
    //   1606: iload 213
    //   1608: if_icmpgt +4409 -> 6017
    //   1611: aload_0
    //   1612: bipush 42
    //   1614: new 31	java/lang/String
    //   1617: dup
    //   1618: aload 211
    //   1620: invokespecial 41	java/lang/String:<init>	([C)V
    //   1623: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1626: aastore
    //   1627: ldc 131
    //   1629: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1632: astore 216
    //   1634: aload 216
    //   1636: arraylength
    //   1637: istore 217
    //   1639: iconst_0
    //   1640: istore 218
    //   1642: iload 217
    //   1644: iload 218
    //   1646: if_icmpgt +4463 -> 6109
    //   1649: aload_0
    //   1650: bipush 43
    //   1652: new 31	java/lang/String
    //   1655: dup
    //   1656: aload 216
    //   1658: invokespecial 41	java/lang/String:<init>	([C)V
    //   1661: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1664: aastore
    //   1665: ldc 133
    //   1667: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1670: astore 221
    //   1672: aload 221
    //   1674: arraylength
    //   1675: istore 222
    //   1677: iconst_0
    //   1678: istore 223
    //   1680: iload 222
    //   1682: iload 223
    //   1684: if_icmpgt +4517 -> 6201
    //   1687: aload_0
    //   1688: bipush 44
    //   1690: new 31	java/lang/String
    //   1693: dup
    //   1694: aload 221
    //   1696: invokespecial 41	java/lang/String:<init>	([C)V
    //   1699: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1702: aastore
    //   1703: ldc 135
    //   1705: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1708: astore 226
    //   1710: aload 226
    //   1712: arraylength
    //   1713: istore 227
    //   1715: iconst_0
    //   1716: istore 228
    //   1718: iload 227
    //   1720: iload 228
    //   1722: if_icmpgt +4571 -> 6293
    //   1725: aload_0
    //   1726: bipush 45
    //   1728: new 31	java/lang/String
    //   1731: dup
    //   1732: aload 226
    //   1734: invokespecial 41	java/lang/String:<init>	([C)V
    //   1737: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1740: aastore
    //   1741: ldc 137
    //   1743: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1746: astore 231
    //   1748: aload 231
    //   1750: arraylength
    //   1751: istore 232
    //   1753: iconst_0
    //   1754: istore 233
    //   1756: iload 232
    //   1758: iload 233
    //   1760: if_icmpgt +4625 -> 6385
    //   1763: aload_0
    //   1764: bipush 46
    //   1766: new 31	java/lang/String
    //   1769: dup
    //   1770: aload 231
    //   1772: invokespecial 41	java/lang/String:<init>	([C)V
    //   1775: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1778: aastore
    //   1779: ldc 139
    //   1781: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1784: astore 236
    //   1786: aload 236
    //   1788: arraylength
    //   1789: istore 237
    //   1791: iconst_0
    //   1792: istore 238
    //   1794: iload 237
    //   1796: iload 238
    //   1798: if_icmpgt +4679 -> 6477
    //   1801: aload_0
    //   1802: bipush 47
    //   1804: new 31	java/lang/String
    //   1807: dup
    //   1808: aload 236
    //   1810: invokespecial 41	java/lang/String:<init>	([C)V
    //   1813: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1816: aastore
    //   1817: ldc 141
    //   1819: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1822: astore 241
    //   1824: aload 241
    //   1826: arraylength
    //   1827: istore 242
    //   1829: iconst_0
    //   1830: istore 243
    //   1832: iload 242
    //   1834: iload 243
    //   1836: if_icmpgt +4733 -> 6569
    //   1839: aload_0
    //   1840: bipush 48
    //   1842: new 31	java/lang/String
    //   1845: dup
    //   1846: aload 241
    //   1848: invokespecial 41	java/lang/String:<init>	([C)V
    //   1851: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1854: aastore
    //   1855: ldc 143
    //   1857: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1860: astore 246
    //   1862: aload 246
    //   1864: arraylength
    //   1865: istore 247
    //   1867: iconst_0
    //   1868: istore 248
    //   1870: iload 247
    //   1872: iload 248
    //   1874: if_icmpgt +4787 -> 6661
    //   1877: aload_0
    //   1878: bipush 49
    //   1880: new 31	java/lang/String
    //   1883: dup
    //   1884: aload 246
    //   1886: invokespecial 41	java/lang/String:<init>	([C)V
    //   1889: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1892: aastore
    //   1893: ldc 145
    //   1895: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1898: astore 251
    //   1900: aload 251
    //   1902: arraylength
    //   1903: istore 252
    //   1905: iconst_0
    //   1906: istore 253
    //   1908: iload 252
    //   1910: iload 253
    //   1912: if_icmpgt +4841 -> 6753
    //   1915: aload_0
    //   1916: bipush 50
    //   1918: new 31	java/lang/String
    //   1921: dup
    //   1922: aload 251
    //   1924: invokespecial 41	java/lang/String:<init>	([C)V
    //   1927: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1930: aastore
    //   1931: ldc 147
    //   1933: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1936: wide
    //   1940: wide
    //   1944: arraylength
    //   1945: wide
    //   1949: iconst_0
    //   1950: wide
    //   1954: wide
    //   1958: wide
    //   1962: if_icmpgt +4883 -> 6845
    //   1965: aload_0
    //   1966: bipush 51
    //   1968: new 31	java/lang/String
    //   1971: dup
    //   1972: wide
    //   1976: invokespecial 41	java/lang/String:<init>	([C)V
    //   1979: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   1982: aastore
    //   1983: ldc 149
    //   1985: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   1988: wide
    //   1992: wide
    //   1996: arraylength
    //   1997: wide
    //   2001: iconst_0
    //   2002: wide
    //   2006: wide
    //   2010: wide
    //   2014: if_icmpgt +4952 -> 6966
    //   2017: aload_0
    //   2018: bipush 52
    //   2020: new 31	java/lang/String
    //   2023: dup
    //   2024: wide
    //   2028: invokespecial 41	java/lang/String:<init>	([C)V
    //   2031: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   2034: aastore
    //   2035: ldc 151
    //   2037: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   2040: wide
    //   2044: wide
    //   2048: arraylength
    //   2049: wide
    //   2053: iconst_0
    //   2054: wide
    //   2058: wide
    //   2062: wide
    //   2066: if_icmpgt +5020 -> 7086
    //   2069: aload_0
    //   2070: bipush 53
    //   2072: new 31	java/lang/String
    //   2075: dup
    //   2076: wide
    //   2080: invokespecial 41	java/lang/String:<init>	([C)V
    //   2083: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   2086: aastore
    //   2087: ldc 153
    //   2089: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   2092: wide
    //   2096: wide
    //   2100: arraylength
    //   2101: wide
    //   2105: iconst_0
    //   2106: wide
    //   2110: wide
    //   2114: wide
    //   2118: if_icmpgt +5088 -> 7206
    //   2121: aload_0
    //   2122: bipush 54
    //   2124: new 31	java/lang/String
    //   2127: dup
    //   2128: wide
    //   2132: invokespecial 41	java/lang/String:<init>	([C)V
    //   2135: invokevirtual 45	java/lang/String:intern	()Ljava/lang/String;
    //   2138: aastore
    //   2139: aload_0
    //   2140: putstatic 155	com/whatsapp/RegisterPhone:F	[Ljava/lang/String;
    //   2143: aconst_null
    //   2144: putstatic 157	com/whatsapp/RegisterPhone:q	Ljava/lang/String;
    //   2147: aconst_null
    //   2148: putstatic 159	com/whatsapp/RegisterPhone:r	Ljava/lang/String;
    //   2151: bipush 7
    //   2153: putstatic 161	com/whatsapp/RegisterPhone:s	I
    //   2156: aconst_null
    //   2157: putstatic 163	com/whatsapp/RegisterPhone:t	Ljava/lang/String;
    //   2160: return
    //   2161: aload_1
    //   2162: iload_3
    //   2163: caload
    //   2164: istore 4
    //   2166: iload_3
    //   2167: iconst_5
    //   2168: irem
    //   2169: tableswitch	default:+31 -> 2200, 0:+50->2219, 1:+57->2226, 2:+64->2233, 3:+71->2240
    //   2201: lload_3
    //   2202: istore 5
    //   2204: aload_1
    //   2205: iload_3
    //   2206: iload 5
    //   2208: iload 4
    //   2210: ixor
    //   2211: i2c
    //   2212: castore
    //   2213: iinc 3 1
    //   2216: goto -2199 -> 17
    //   2219: bipush 87
    //   2221: istore 5
    //   2223: goto -19 -> 2204
    //   2226: bipush 55
    //   2228: istore 5
    //   2230: goto -26 -> 2204
    //   2233: bipush 119
    //   2235: istore 5
    //   2237: goto -33 -> 2204
    //   2240: bipush 113
    //   2242: istore 5
    //   2244: goto -40 -> 2204
    //   2247: aload 6
    //   2249: iload 8
    //   2251: caload
    //   2252: istore 9
    //   2254: iload 8
    //   2256: iconst_5
    //   2257: irem
    //   2258: tableswitch	default:+30 -> 2288, 0:+51->2309, 1:+58->2316, 2:+65->2323, 3:+72->2330
    //   2289: lload_3
    //   2290: istore 10
    //   2292: aload 6
    //   2294: iload 8
    //   2296: iload 10
    //   2298: iload 9
    //   2300: ixor
    //   2301: i2c
    //   2302: castore
    //   2303: iinc 8 1
    //   2306: goto -2255 -> 51
    //   2309: bipush 87
    //   2311: istore 10
    //   2313: goto -21 -> 2292
    //   2316: bipush 55
    //   2318: istore 10
    //   2320: goto -28 -> 2292
    //   2323: bipush 119
    //   2325: istore 10
    //   2327: goto -35 -> 2292
    //   2330: bipush 113
    //   2332: istore 10
    //   2334: goto -42 -> 2292
    //   2337: aload 11
    //   2339: iload 13
    //   2341: caload
    //   2342: istore 14
    //   2344: iload 13
    //   2346: iconst_5
    //   2347: irem
    //   2348: tableswitch	default:+32 -> 2380, 0:+53->2401, 1:+60->2408, 2:+67->2415, 3:+74->2422
    //   2381: lload_3
    //   2382: istore 15
    //   2384: aload 11
    //   2386: iload 13
    //   2388: iload 15
    //   2390: iload 14
    //   2392: ixor
    //   2393: i2c
    //   2394: castore
    //   2395: iinc 13 1
    //   2398: goto -2310 -> 88
    //   2401: bipush 87
    //   2403: istore 15
    //   2405: goto -21 -> 2384
    //   2408: bipush 55
    //   2410: istore 15
    //   2412: goto -28 -> 2384
    //   2415: bipush 119
    //   2417: istore 15
    //   2419: goto -35 -> 2384
    //   2422: bipush 113
    //   2424: istore 15
    //   2426: goto -42 -> 2384
    //   2429: aload 16
    //   2431: iload 18
    //   2433: caload
    //   2434: istore 19
    //   2436: iload 18
    //   2438: iconst_5
    //   2439: irem
    //   2440: tableswitch	default:+32 -> 2472, 0:+53->2493, 1:+60->2500, 2:+67->2507, 3:+74->2514
    //   2473: lload_3
    //   2474: istore 20
    //   2476: aload 16
    //   2478: iload 18
    //   2480: iload 20
    //   2482: iload 19
    //   2484: ixor
    //   2485: i2c
    //   2486: castore
    //   2487: iinc 18 1
    //   2490: goto -2365 -> 125
    //   2493: bipush 87
    //   2495: istore 20
    //   2497: goto -21 -> 2476
    //   2500: bipush 55
    //   2502: istore 20
    //   2504: goto -28 -> 2476
    //   2507: bipush 119
    //   2509: istore 20
    //   2511: goto -35 -> 2476
    //   2514: bipush 113
    //   2516: istore 20
    //   2518: goto -42 -> 2476
    //   2521: aload 21
    //   2523: iload 23
    //   2525: caload
    //   2526: istore 24
    //   2528: iload 23
    //   2530: iconst_5
    //   2531: irem
    //   2532: tableswitch	default:+32 -> 2564, 0:+53->2585, 1:+60->2592, 2:+67->2599, 3:+74->2606
    //   2565: lload_3
    //   2566: istore 25
    //   2568: aload 21
    //   2570: iload 23
    //   2572: iload 25
    //   2574: iload 24
    //   2576: ixor
    //   2577: i2c
    //   2578: castore
    //   2579: iinc 23 1
    //   2582: goto -2420 -> 162
    //   2585: bipush 87
    //   2587: istore 25
    //   2589: goto -21 -> 2568
    //   2592: bipush 55
    //   2594: istore 25
    //   2596: goto -28 -> 2568
    //   2599: bipush 119
    //   2601: istore 25
    //   2603: goto -35 -> 2568
    //   2606: bipush 113
    //   2608: istore 25
    //   2610: goto -42 -> 2568
    //   2613: aload 26
    //   2615: iload 28
    //   2617: caload
    //   2618: istore 29
    //   2620: iload 28
    //   2622: iconst_5
    //   2623: irem
    //   2624: tableswitch	default:+32 -> 2656, 0:+53->2677, 1:+60->2684, 2:+67->2691, 3:+74->2698
    //   2657: lload_3
    //   2658: istore 30
    //   2660: aload 26
    //   2662: iload 28
    //   2664: iload 30
    //   2666: iload 29
    //   2668: ixor
    //   2669: i2c
    //   2670: castore
    //   2671: iinc 28 1
    //   2674: goto -2475 -> 199
    //   2677: bipush 87
    //   2679: istore 30
    //   2681: goto -21 -> 2660
    //   2684: bipush 55
    //   2686: istore 30
    //   2688: goto -28 -> 2660
    //   2691: bipush 119
    //   2693: istore 30
    //   2695: goto -35 -> 2660
    //   2698: bipush 113
    //   2700: istore 30
    //   2702: goto -42 -> 2660
    //   2705: aload 31
    //   2707: iload 33
    //   2709: caload
    //   2710: istore 34
    //   2712: iload 33
    //   2714: iconst_5
    //   2715: irem
    //   2716: tableswitch	default:+32 -> 2748, 0:+53->2769, 1:+60->2776, 2:+67->2783, 3:+74->2790
    //   2749: lload_3
    //   2750: istore 35
    //   2752: aload 31
    //   2754: iload 33
    //   2756: iload 35
    //   2758: iload 34
    //   2760: ixor
    //   2761: i2c
    //   2762: castore
    //   2763: iinc 33 1
    //   2766: goto -2530 -> 236
    //   2769: bipush 87
    //   2771: istore 35
    //   2773: goto -21 -> 2752
    //   2776: bipush 55
    //   2778: istore 35
    //   2780: goto -28 -> 2752
    //   2783: bipush 119
    //   2785: istore 35
    //   2787: goto -35 -> 2752
    //   2790: bipush 113
    //   2792: istore 35
    //   2794: goto -42 -> 2752
    //   2797: aload 36
    //   2799: iload 38
    //   2801: caload
    //   2802: istore 39
    //   2804: iload 38
    //   2806: iconst_5
    //   2807: irem
    //   2808: tableswitch	default:+32 -> 2840, 0:+53->2861, 1:+60->2868, 2:+67->2875, 3:+74->2882
    //   2841: lload_3
    //   2842: istore 40
    //   2844: aload 36
    //   2846: iload 38
    //   2848: iload 40
    //   2850: iload 39
    //   2852: ixor
    //   2853: i2c
    //   2854: castore
    //   2855: iinc 38 1
    //   2858: goto -2584 -> 274
    //   2861: bipush 87
    //   2863: istore 40
    //   2865: goto -21 -> 2844
    //   2868: bipush 55
    //   2870: istore 40
    //   2872: goto -28 -> 2844
    //   2875: bipush 119
    //   2877: istore 40
    //   2879: goto -35 -> 2844
    //   2882: bipush 113
    //   2884: istore 40
    //   2886: goto -42 -> 2844
    //   2889: aload 41
    //   2891: iload 43
    //   2893: caload
    //   2894: istore 44
    //   2896: iload 43
    //   2898: iconst_5
    //   2899: irem
    //   2900: tableswitch	default:+32 -> 2932, 0:+53->2953, 1:+60->2960, 2:+67->2967, 3:+74->2974
    //   2933: lload_3
    //   2934: istore 45
    //   2936: aload 41
    //   2938: iload 43
    //   2940: iload 45
    //   2942: iload 44
    //   2944: ixor
    //   2945: i2c
    //   2946: castore
    //   2947: iinc 43 1
    //   2950: goto -2638 -> 312
    //   2953: bipush 87
    //   2955: istore 45
    //   2957: goto -21 -> 2936
    //   2960: bipush 55
    //   2962: istore 45
    //   2964: goto -28 -> 2936
    //   2967: bipush 119
    //   2969: istore 45
    //   2971: goto -35 -> 2936
    //   2974: bipush 113
    //   2976: istore 45
    //   2978: goto -42 -> 2936
    //   2981: aload 46
    //   2983: iload 48
    //   2985: caload
    //   2986: istore 49
    //   2988: iload 48
    //   2990: iconst_5
    //   2991: irem
    //   2992: tableswitch	default:+32 -> 3024, 0:+53->3045, 1:+60->3052, 2:+67->3059, 3:+74->3066
    //   3025: lload_3
    //   3026: istore 50
    //   3028: aload 46
    //   3030: iload 48
    //   3032: iload 50
    //   3034: iload 49
    //   3036: ixor
    //   3037: i2c
    //   3038: castore
    //   3039: iinc 48 1
    //   3042: goto -2692 -> 350
    //   3045: bipush 87
    //   3047: istore 50
    //   3049: goto -21 -> 3028
    //   3052: bipush 55
    //   3054: istore 50
    //   3056: goto -28 -> 3028
    //   3059: bipush 119
    //   3061: istore 50
    //   3063: goto -35 -> 3028
    //   3066: bipush 113
    //   3068: istore 50
    //   3070: goto -42 -> 3028
    //   3073: aload 51
    //   3075: iload 53
    //   3077: caload
    //   3078: istore 54
    //   3080: iload 53
    //   3082: iconst_5
    //   3083: irem
    //   3084: tableswitch	default:+32 -> 3116, 0:+53->3137, 1:+60->3144, 2:+67->3151, 3:+74->3158
    //   3117: lload_3
    //   3118: istore 55
    //   3120: aload 51
    //   3122: iload 53
    //   3124: iload 55
    //   3126: iload 54
    //   3128: ixor
    //   3129: i2c
    //   3130: castore
    //   3131: iinc 53 1
    //   3134: goto -2746 -> 388
    //   3137: bipush 87
    //   3139: istore 55
    //   3141: goto -21 -> 3120
    //   3144: bipush 55
    //   3146: istore 55
    //   3148: goto -28 -> 3120
    //   3151: bipush 119
    //   3153: istore 55
    //   3155: goto -35 -> 3120
    //   3158: bipush 113
    //   3160: istore 55
    //   3162: goto -42 -> 3120
    //   3165: aload 56
    //   3167: iload 58
    //   3169: caload
    //   3170: istore 59
    //   3172: iload 58
    //   3174: iconst_5
    //   3175: irem
    //   3176: tableswitch	default:+32 -> 3208, 0:+53->3229, 1:+60->3236, 2:+67->3243, 3:+74->3250
    //   3209: lload_3
    //   3210: istore 60
    //   3212: aload 56
    //   3214: iload 58
    //   3216: iload 60
    //   3218: iload 59
    //   3220: ixor
    //   3221: i2c
    //   3222: castore
    //   3223: iinc 58 1
    //   3226: goto -2800 -> 426
    //   3229: bipush 87
    //   3231: istore 60
    //   3233: goto -21 -> 3212
    //   3236: bipush 55
    //   3238: istore 60
    //   3240: goto -28 -> 3212
    //   3243: bipush 119
    //   3245: istore 60
    //   3247: goto -35 -> 3212
    //   3250: bipush 113
    //   3252: istore 60
    //   3254: goto -42 -> 3212
    //   3257: aload 61
    //   3259: iload 63
    //   3261: caload
    //   3262: istore 64
    //   3264: iload 63
    //   3266: iconst_5
    //   3267: irem
    //   3268: tableswitch	default:+32 -> 3300, 0:+53->3321, 1:+60->3328, 2:+67->3335, 3:+74->3342
    //   3301: lload_3
    //   3302: istore 65
    //   3304: aload 61
    //   3306: iload 63
    //   3308: iload 65
    //   3310: iload 64
    //   3312: ixor
    //   3313: i2c
    //   3314: castore
    //   3315: iinc 63 1
    //   3318: goto -2854 -> 464
    //   3321: bipush 87
    //   3323: istore 65
    //   3325: goto -21 -> 3304
    //   3328: bipush 55
    //   3330: istore 65
    //   3332: goto -28 -> 3304
    //   3335: bipush 119
    //   3337: istore 65
    //   3339: goto -35 -> 3304
    //   3342: bipush 113
    //   3344: istore 65
    //   3346: goto -42 -> 3304
    //   3349: aload 66
    //   3351: iload 68
    //   3353: caload
    //   3354: istore 69
    //   3356: iload 68
    //   3358: iconst_5
    //   3359: irem
    //   3360: tableswitch	default:+32 -> 3392, 0:+53->3413, 1:+60->3420, 2:+67->3427, 3:+74->3434
    //   3393: lload_3
    //   3394: istore 70
    //   3396: aload 66
    //   3398: iload 68
    //   3400: iload 70
    //   3402: iload 69
    //   3404: ixor
    //   3405: i2c
    //   3406: castore
    //   3407: iinc 68 1
    //   3410: goto -2908 -> 502
    //   3413: bipush 87
    //   3415: istore 70
    //   3417: goto -21 -> 3396
    //   3420: bipush 55
    //   3422: istore 70
    //   3424: goto -28 -> 3396
    //   3427: bipush 119
    //   3429: istore 70
    //   3431: goto -35 -> 3396
    //   3434: bipush 113
    //   3436: istore 70
    //   3438: goto -42 -> 3396
    //   3441: aload 71
    //   3443: iload 73
    //   3445: caload
    //   3446: istore 74
    //   3448: iload 73
    //   3450: iconst_5
    //   3451: irem
    //   3452: tableswitch	default:+32 -> 3484, 0:+53->3505, 1:+60->3512, 2:+67->3519, 3:+74->3526
    //   3485: lload_3
    //   3486: istore 75
    //   3488: aload 71
    //   3490: iload 73
    //   3492: iload 75
    //   3494: iload 74
    //   3496: ixor
    //   3497: i2c
    //   3498: castore
    //   3499: iinc 73 1
    //   3502: goto -2962 -> 540
    //   3505: bipush 87
    //   3507: istore 75
    //   3509: goto -21 -> 3488
    //   3512: bipush 55
    //   3514: istore 75
    //   3516: goto -28 -> 3488
    //   3519: bipush 119
    //   3521: istore 75
    //   3523: goto -35 -> 3488
    //   3526: bipush 113
    //   3528: istore 75
    //   3530: goto -42 -> 3488
    //   3533: aload 76
    //   3535: iload 78
    //   3537: caload
    //   3538: istore 79
    //   3540: iload 78
    //   3542: iconst_5
    //   3543: irem
    //   3544: tableswitch	default:+32 -> 3576, 0:+53->3597, 1:+60->3604, 2:+67->3611, 3:+74->3618
    //   3577: lload_3
    //   3578: istore 80
    //   3580: aload 76
    //   3582: iload 78
    //   3584: iload 80
    //   3586: iload 79
    //   3588: ixor
    //   3589: i2c
    //   3590: castore
    //   3591: iinc 78 1
    //   3594: goto -3016 -> 578
    //   3597: bipush 87
    //   3599: istore 80
    //   3601: goto -21 -> 3580
    //   3604: bipush 55
    //   3606: istore 80
    //   3608: goto -28 -> 3580
    //   3611: bipush 119
    //   3613: istore 80
    //   3615: goto -35 -> 3580
    //   3618: bipush 113
    //   3620: istore 80
    //   3622: goto -42 -> 3580
    //   3625: aload 81
    //   3627: iload 83
    //   3629: caload
    //   3630: istore 84
    //   3632: iload 83
    //   3634: iconst_5
    //   3635: irem
    //   3636: tableswitch	default:+32 -> 3668, 0:+53->3689, 1:+60->3696, 2:+67->3703, 3:+74->3710
    //   3669: lload_3
    //   3670: istore 85
    //   3672: aload 81
    //   3674: iload 83
    //   3676: iload 85
    //   3678: iload 84
    //   3680: ixor
    //   3681: i2c
    //   3682: castore
    //   3683: iinc 83 1
    //   3686: goto -3070 -> 616
    //   3689: bipush 87
    //   3691: istore 85
    //   3693: goto -21 -> 3672
    //   3696: bipush 55
    //   3698: istore 85
    //   3700: goto -28 -> 3672
    //   3703: bipush 119
    //   3705: istore 85
    //   3707: goto -35 -> 3672
    //   3710: bipush 113
    //   3712: istore 85
    //   3714: goto -42 -> 3672
    //   3717: aload 86
    //   3719: iload 88
    //   3721: caload
    //   3722: istore 89
    //   3724: iload 88
    //   3726: iconst_5
    //   3727: irem
    //   3728: tableswitch	default:+32 -> 3760, 0:+53->3781, 1:+60->3788, 2:+67->3795, 3:+74->3802
    //   3761: lload_3
    //   3762: istore 90
    //   3764: aload 86
    //   3766: iload 88
    //   3768: iload 90
    //   3770: iload 89
    //   3772: ixor
    //   3773: i2c
    //   3774: castore
    //   3775: iinc 88 1
    //   3778: goto -3124 -> 654
    //   3781: bipush 87
    //   3783: istore 90
    //   3785: goto -21 -> 3764
    //   3788: bipush 55
    //   3790: istore 90
    //   3792: goto -28 -> 3764
    //   3795: bipush 119
    //   3797: istore 90
    //   3799: goto -35 -> 3764
    //   3802: bipush 113
    //   3804: istore 90
    //   3806: goto -42 -> 3764
    //   3809: aload 91
    //   3811: iload 93
    //   3813: caload
    //   3814: istore 94
    //   3816: iload 93
    //   3818: iconst_5
    //   3819: irem
    //   3820: tableswitch	default:+32 -> 3852, 0:+53->3873, 1:+60->3880, 2:+67->3887, 3:+74->3894
    //   3853: lload_3
    //   3854: istore 95
    //   3856: aload 91
    //   3858: iload 93
    //   3860: iload 95
    //   3862: iload 94
    //   3864: ixor
    //   3865: i2c
    //   3866: castore
    //   3867: iinc 93 1
    //   3870: goto -3178 -> 692
    //   3873: bipush 87
    //   3875: istore 95
    //   3877: goto -21 -> 3856
    //   3880: bipush 55
    //   3882: istore 95
    //   3884: goto -28 -> 3856
    //   3887: bipush 119
    //   3889: istore 95
    //   3891: goto -35 -> 3856
    //   3894: bipush 113
    //   3896: istore 95
    //   3898: goto -42 -> 3856
    //   3901: aload 96
    //   3903: iload 98
    //   3905: caload
    //   3906: istore 99
    //   3908: iload 98
    //   3910: iconst_5
    //   3911: irem
    //   3912: tableswitch	default:+32 -> 3944, 0:+53->3965, 1:+60->3972, 2:+67->3979, 3:+74->3986
    //   3945: lload_3
    //   3946: istore 100
    //   3948: aload 96
    //   3950: iload 98
    //   3952: iload 100
    //   3954: iload 99
    //   3956: ixor
    //   3957: i2c
    //   3958: castore
    //   3959: iinc 98 1
    //   3962: goto -3232 -> 730
    //   3965: bipush 87
    //   3967: istore 100
    //   3969: goto -21 -> 3948
    //   3972: bipush 55
    //   3974: istore 100
    //   3976: goto -28 -> 3948
    //   3979: bipush 119
    //   3981: istore 100
    //   3983: goto -35 -> 3948
    //   3986: bipush 113
    //   3988: istore 100
    //   3990: goto -42 -> 3948
    //   3993: aload 101
    //   3995: iload 103
    //   3997: caload
    //   3998: istore 104
    //   4000: iload 103
    //   4002: iconst_5
    //   4003: irem
    //   4004: tableswitch	default:+32 -> 4036, 0:+53->4057, 1:+60->4064, 2:+67->4071, 3:+74->4078
    //   4037: lload_3
    //   4038: istore 105
    //   4040: aload 101
    //   4042: iload 103
    //   4044: iload 105
    //   4046: iload 104
    //   4048: ixor
    //   4049: i2c
    //   4050: castore
    //   4051: iinc 103 1
    //   4054: goto -3286 -> 768
    //   4057: bipush 87
    //   4059: istore 105
    //   4061: goto -21 -> 4040
    //   4064: bipush 55
    //   4066: istore 105
    //   4068: goto -28 -> 4040
    //   4071: bipush 119
    //   4073: istore 105
    //   4075: goto -35 -> 4040
    //   4078: bipush 113
    //   4080: istore 105
    //   4082: goto -42 -> 4040
    //   4085: aload 106
    //   4087: iload 108
    //   4089: caload
    //   4090: istore 109
    //   4092: iload 108
    //   4094: iconst_5
    //   4095: irem
    //   4096: tableswitch	default:+32 -> 4128, 0:+53->4149, 1:+60->4156, 2:+67->4163, 3:+74->4170
    //   4129: lload_3
    //   4130: istore 110
    //   4132: aload 106
    //   4134: iload 108
    //   4136: iload 110
    //   4138: iload 109
    //   4140: ixor
    //   4141: i2c
    //   4142: castore
    //   4143: iinc 108 1
    //   4146: goto -3340 -> 806
    //   4149: bipush 87
    //   4151: istore 110
    //   4153: goto -21 -> 4132
    //   4156: bipush 55
    //   4158: istore 110
    //   4160: goto -28 -> 4132
    //   4163: bipush 119
    //   4165: istore 110
    //   4167: goto -35 -> 4132
    //   4170: bipush 113
    //   4172: istore 110
    //   4174: goto -42 -> 4132
    //   4177: aload 111
    //   4179: iload 113
    //   4181: caload
    //   4182: istore 114
    //   4184: iload 113
    //   4186: iconst_5
    //   4187: irem
    //   4188: tableswitch	default:+32 -> 4220, 0:+53->4241, 1:+60->4248, 2:+67->4255, 3:+74->4262
    //   4221: lload_3
    //   4222: istore 115
    //   4224: aload 111
    //   4226: iload 113
    //   4228: iload 115
    //   4230: iload 114
    //   4232: ixor
    //   4233: i2c
    //   4234: castore
    //   4235: iinc 113 1
    //   4238: goto -3394 -> 844
    //   4241: bipush 87
    //   4243: istore 115
    //   4245: goto -21 -> 4224
    //   4248: bipush 55
    //   4250: istore 115
    //   4252: goto -28 -> 4224
    //   4255: bipush 119
    //   4257: istore 115
    //   4259: goto -35 -> 4224
    //   4262: bipush 113
    //   4264: istore 115
    //   4266: goto -42 -> 4224
    //   4269: aload 116
    //   4271: iload 118
    //   4273: caload
    //   4274: istore 119
    //   4276: iload 118
    //   4278: iconst_5
    //   4279: irem
    //   4280: tableswitch	default:+32 -> 4312, 0:+53->4333, 1:+60->4340, 2:+67->4347, 3:+74->4354
    //   4313: lload_3
    //   4314: istore 120
    //   4316: aload 116
    //   4318: iload 118
    //   4320: iload 120
    //   4322: iload 119
    //   4324: ixor
    //   4325: i2c
    //   4326: castore
    //   4327: iinc 118 1
    //   4330: goto -3448 -> 882
    //   4333: bipush 87
    //   4335: istore 120
    //   4337: goto -21 -> 4316
    //   4340: bipush 55
    //   4342: istore 120
    //   4344: goto -28 -> 4316
    //   4347: bipush 119
    //   4349: istore 120
    //   4351: goto -35 -> 4316
    //   4354: bipush 113
    //   4356: istore 120
    //   4358: goto -42 -> 4316
    //   4361: aload 121
    //   4363: iload 123
    //   4365: caload
    //   4366: istore 124
    //   4368: iload 123
    //   4370: iconst_5
    //   4371: irem
    //   4372: tableswitch	default:+32 -> 4404, 0:+53->4425, 1:+60->4432, 2:+67->4439, 3:+74->4446
    //   4405: lload_3
    //   4406: istore 125
    //   4408: aload 121
    //   4410: iload 123
    //   4412: iload 125
    //   4414: iload 124
    //   4416: ixor
    //   4417: i2c
    //   4418: castore
    //   4419: iinc 123 1
    //   4422: goto -3502 -> 920
    //   4425: bipush 87
    //   4427: istore 125
    //   4429: goto -21 -> 4408
    //   4432: bipush 55
    //   4434: istore 125
    //   4436: goto -28 -> 4408
    //   4439: bipush 119
    //   4441: istore 125
    //   4443: goto -35 -> 4408
    //   4446: bipush 113
    //   4448: istore 125
    //   4450: goto -42 -> 4408
    //   4453: aload 126
    //   4455: iload 128
    //   4457: caload
    //   4458: istore 129
    //   4460: iload 128
    //   4462: iconst_5
    //   4463: irem
    //   4464: tableswitch	default:+32 -> 4496, 0:+53->4517, 1:+60->4524, 2:+67->4531, 3:+74->4538
    //   4497: lload_3
    //   4498: istore 130
    //   4500: aload 126
    //   4502: iload 128
    //   4504: iload 130
    //   4506: iload 129
    //   4508: ixor
    //   4509: i2c
    //   4510: castore
    //   4511: iinc 128 1
    //   4514: goto -3556 -> 958
    //   4517: bipush 87
    //   4519: istore 130
    //   4521: goto -21 -> 4500
    //   4524: bipush 55
    //   4526: istore 130
    //   4528: goto -28 -> 4500
    //   4531: bipush 119
    //   4533: istore 130
    //   4535: goto -35 -> 4500
    //   4538: bipush 113
    //   4540: istore 130
    //   4542: goto -42 -> 4500
    //   4545: aload 131
    //   4547: iload 133
    //   4549: caload
    //   4550: istore 134
    //   4552: iload 133
    //   4554: iconst_5
    //   4555: irem
    //   4556: tableswitch	default:+32 -> 4588, 0:+53->4609, 1:+60->4616, 2:+67->4623, 3:+74->4630
    //   4589: lload_3
    //   4590: istore 135
    //   4592: aload 131
    //   4594: iload 133
    //   4596: iload 135
    //   4598: iload 134
    //   4600: ixor
    //   4601: i2c
    //   4602: castore
    //   4603: iinc 133 1
    //   4606: goto -3610 -> 996
    //   4609: bipush 87
    //   4611: istore 135
    //   4613: goto -21 -> 4592
    //   4616: bipush 55
    //   4618: istore 135
    //   4620: goto -28 -> 4592
    //   4623: bipush 119
    //   4625: istore 135
    //   4627: goto -35 -> 4592
    //   4630: bipush 113
    //   4632: istore 135
    //   4634: goto -42 -> 4592
    //   4637: aload 136
    //   4639: iload 138
    //   4641: caload
    //   4642: istore 139
    //   4644: iload 138
    //   4646: iconst_5
    //   4647: irem
    //   4648: tableswitch	default:+32 -> 4680, 0:+53->4701, 1:+60->4708, 2:+67->4715, 3:+74->4722
    //   4681: lload_3
    //   4682: istore 140
    //   4684: aload 136
    //   4686: iload 138
    //   4688: iload 140
    //   4690: iload 139
    //   4692: ixor
    //   4693: i2c
    //   4694: castore
    //   4695: iinc 138 1
    //   4698: goto -3664 -> 1034
    //   4701: bipush 87
    //   4703: istore 140
    //   4705: goto -21 -> 4684
    //   4708: bipush 55
    //   4710: istore 140
    //   4712: goto -28 -> 4684
    //   4715: bipush 119
    //   4717: istore 140
    //   4719: goto -35 -> 4684
    //   4722: bipush 113
    //   4724: istore 140
    //   4726: goto -42 -> 4684
    //   4729: aload 141
    //   4731: iload 143
    //   4733: caload
    //   4734: istore 144
    //   4736: iload 143
    //   4738: iconst_5
    //   4739: irem
    //   4740: tableswitch	default:+32 -> 4772, 0:+53->4793, 1:+60->4800, 2:+67->4807, 3:+74->4814
    //   4773: lload_3
    //   4774: istore 145
    //   4776: aload 141
    //   4778: iload 143
    //   4780: iload 145
    //   4782: iload 144
    //   4784: ixor
    //   4785: i2c
    //   4786: castore
    //   4787: iinc 143 1
    //   4790: goto -3718 -> 1072
    //   4793: bipush 87
    //   4795: istore 145
    //   4797: goto -21 -> 4776
    //   4800: bipush 55
    //   4802: istore 145
    //   4804: goto -28 -> 4776
    //   4807: bipush 119
    //   4809: istore 145
    //   4811: goto -35 -> 4776
    //   4814: bipush 113
    //   4816: istore 145
    //   4818: goto -42 -> 4776
    //   4821: aload 146
    //   4823: iload 148
    //   4825: caload
    //   4826: istore 149
    //   4828: iload 148
    //   4830: iconst_5
    //   4831: irem
    //   4832: tableswitch	default:+32 -> 4864, 0:+53->4885, 1:+60->4892, 2:+67->4899, 3:+74->4906
    //   4865: lload_3
    //   4866: istore 150
    //   4868: aload 146
    //   4870: iload 148
    //   4872: iload 150
    //   4874: iload 149
    //   4876: ixor
    //   4877: i2c
    //   4878: castore
    //   4879: iinc 148 1
    //   4882: goto -3772 -> 1110
    //   4885: bipush 87
    //   4887: istore 150
    //   4889: goto -21 -> 4868
    //   4892: bipush 55
    //   4894: istore 150
    //   4896: goto -28 -> 4868
    //   4899: bipush 119
    //   4901: istore 150
    //   4903: goto -35 -> 4868
    //   4906: bipush 113
    //   4908: istore 150
    //   4910: goto -42 -> 4868
    //   4913: aload 151
    //   4915: iload 153
    //   4917: caload
    //   4918: istore 154
    //   4920: iload 153
    //   4922: iconst_5
    //   4923: irem
    //   4924: tableswitch	default:+32 -> 4956, 0:+53->4977, 1:+60->4984, 2:+67->4991, 3:+74->4998
    //   4957: lload_3
    //   4958: istore 155
    //   4960: aload 151
    //   4962: iload 153
    //   4964: iload 155
    //   4966: iload 154
    //   4968: ixor
    //   4969: i2c
    //   4970: castore
    //   4971: iinc 153 1
    //   4974: goto -3826 -> 1148
    //   4977: bipush 87
    //   4979: istore 155
    //   4981: goto -21 -> 4960
    //   4984: bipush 55
    //   4986: istore 155
    //   4988: goto -28 -> 4960
    //   4991: bipush 119
    //   4993: istore 155
    //   4995: goto -35 -> 4960
    //   4998: bipush 113
    //   5000: istore 155
    //   5002: goto -42 -> 4960
    //   5005: aload 156
    //   5007: iload 158
    //   5009: caload
    //   5010: istore 159
    //   5012: iload 158
    //   5014: iconst_5
    //   5015: irem
    //   5016: tableswitch	default:+32 -> 5048, 0:+53->5069, 1:+60->5076, 2:+67->5083, 3:+74->5090
    //   5049: lload_3
    //   5050: istore 160
    //   5052: aload 156
    //   5054: iload 158
    //   5056: iload 160
    //   5058: iload 159
    //   5060: ixor
    //   5061: i2c
    //   5062: castore
    //   5063: iinc 158 1
    //   5066: goto -3880 -> 1186
    //   5069: bipush 87
    //   5071: istore 160
    //   5073: goto -21 -> 5052
    //   5076: bipush 55
    //   5078: istore 160
    //   5080: goto -28 -> 5052
    //   5083: bipush 119
    //   5085: istore 160
    //   5087: goto -35 -> 5052
    //   5090: bipush 113
    //   5092: istore 160
    //   5094: goto -42 -> 5052
    //   5097: aload 161
    //   5099: iload 163
    //   5101: caload
    //   5102: istore 164
    //   5104: iload 163
    //   5106: iconst_5
    //   5107: irem
    //   5108: tableswitch	default:+32 -> 5140, 0:+53->5161, 1:+60->5168, 2:+67->5175, 3:+74->5182
    //   5141: lload_3
    //   5142: istore 165
    //   5144: aload 161
    //   5146: iload 163
    //   5148: iload 165
    //   5150: iload 164
    //   5152: ixor
    //   5153: i2c
    //   5154: castore
    //   5155: iinc 163 1
    //   5158: goto -3934 -> 1224
    //   5161: bipush 87
    //   5163: istore 165
    //   5165: goto -21 -> 5144
    //   5168: bipush 55
    //   5170: istore 165
    //   5172: goto -28 -> 5144
    //   5175: bipush 119
    //   5177: istore 165
    //   5179: goto -35 -> 5144
    //   5182: bipush 113
    //   5184: istore 165
    //   5186: goto -42 -> 5144
    //   5189: aload 166
    //   5191: iload 168
    //   5193: caload
    //   5194: istore 169
    //   5196: iload 168
    //   5198: iconst_5
    //   5199: irem
    //   5200: tableswitch	default:+32 -> 5232, 0:+53->5253, 1:+60->5260, 2:+67->5267, 3:+74->5274
    //   5233: lload_3
    //   5234: istore 170
    //   5236: aload 166
    //   5238: iload 168
    //   5240: iload 170
    //   5242: iload 169
    //   5244: ixor
    //   5245: i2c
    //   5246: castore
    //   5247: iinc 168 1
    //   5250: goto -3988 -> 1262
    //   5253: bipush 87
    //   5255: istore 170
    //   5257: goto -21 -> 5236
    //   5260: bipush 55
    //   5262: istore 170
    //   5264: goto -28 -> 5236
    //   5267: bipush 119
    //   5269: istore 170
    //   5271: goto -35 -> 5236
    //   5274: bipush 113
    //   5276: istore 170
    //   5278: goto -42 -> 5236
    //   5281: aload 171
    //   5283: iload 173
    //   5285: caload
    //   5286: istore 174
    //   5288: iload 173
    //   5290: iconst_5
    //   5291: irem
    //   5292: tableswitch	default:+32 -> 5324, 0:+53->5345, 1:+60->5352, 2:+67->5359, 3:+74->5366
    //   5325: lload_3
    //   5326: istore 175
    //   5328: aload 171
    //   5330: iload 173
    //   5332: iload 175
    //   5334: iload 174
    //   5336: ixor
    //   5337: i2c
    //   5338: castore
    //   5339: iinc 173 1
    //   5342: goto -4042 -> 1300
    //   5345: bipush 87
    //   5347: istore 175
    //   5349: goto -21 -> 5328
    //   5352: bipush 55
    //   5354: istore 175
    //   5356: goto -28 -> 5328
    //   5359: bipush 119
    //   5361: istore 175
    //   5363: goto -35 -> 5328
    //   5366: bipush 113
    //   5368: istore 175
    //   5370: goto -42 -> 5328
    //   5373: aload 176
    //   5375: iload 178
    //   5377: caload
    //   5378: istore 179
    //   5380: iload 178
    //   5382: iconst_5
    //   5383: irem
    //   5384: tableswitch	default:+32 -> 5416, 0:+53->5437, 1:+60->5444, 2:+67->5451, 3:+74->5458
    //   5417: lload_3
    //   5418: istore 180
    //   5420: aload 176
    //   5422: iload 178
    //   5424: iload 180
    //   5426: iload 179
    //   5428: ixor
    //   5429: i2c
    //   5430: castore
    //   5431: iinc 178 1
    //   5434: goto -4096 -> 1338
    //   5437: bipush 87
    //   5439: istore 180
    //   5441: goto -21 -> 5420
    //   5444: bipush 55
    //   5446: istore 180
    //   5448: goto -28 -> 5420
    //   5451: bipush 119
    //   5453: istore 180
    //   5455: goto -35 -> 5420
    //   5458: bipush 113
    //   5460: istore 180
    //   5462: goto -42 -> 5420
    //   5465: aload 181
    //   5467: iload 183
    //   5469: caload
    //   5470: istore 184
    //   5472: iload 183
    //   5474: iconst_5
    //   5475: irem
    //   5476: tableswitch	default:+32 -> 5508, 0:+53->5529, 1:+60->5536, 2:+67->5543, 3:+74->5550
    //   5509: lload_3
    //   5510: istore 185
    //   5512: aload 181
    //   5514: iload 183
    //   5516: iload 185
    //   5518: iload 184
    //   5520: ixor
    //   5521: i2c
    //   5522: castore
    //   5523: iinc 183 1
    //   5526: goto -4150 -> 1376
    //   5529: bipush 87
    //   5531: istore 185
    //   5533: goto -21 -> 5512
    //   5536: bipush 55
    //   5538: istore 185
    //   5540: goto -28 -> 5512
    //   5543: bipush 119
    //   5545: istore 185
    //   5547: goto -35 -> 5512
    //   5550: bipush 113
    //   5552: istore 185
    //   5554: goto -42 -> 5512
    //   5557: aload 186
    //   5559: iload 188
    //   5561: caload
    //   5562: istore 189
    //   5564: iload 188
    //   5566: iconst_5
    //   5567: irem
    //   5568: tableswitch	default:+32 -> 5600, 0:+53->5621, 1:+60->5628, 2:+67->5635, 3:+74->5642
    //   5601: lload_3
    //   5602: istore 190
    //   5604: aload 186
    //   5606: iload 188
    //   5608: iload 190
    //   5610: iload 189
    //   5612: ixor
    //   5613: i2c
    //   5614: castore
    //   5615: iinc 188 1
    //   5618: goto -4204 -> 1414
    //   5621: bipush 87
    //   5623: istore 190
    //   5625: goto -21 -> 5604
    //   5628: bipush 55
    //   5630: istore 190
    //   5632: goto -28 -> 5604
    //   5635: bipush 119
    //   5637: istore 190
    //   5639: goto -35 -> 5604
    //   5642: bipush 113
    //   5644: istore 190
    //   5646: goto -42 -> 5604
    //   5649: aload 191
    //   5651: iload 193
    //   5653: caload
    //   5654: istore 194
    //   5656: iload 193
    //   5658: iconst_5
    //   5659: irem
    //   5660: tableswitch	default:+32 -> 5692, 0:+53->5713, 1:+60->5720, 2:+67->5727, 3:+74->5734
    //   5693: lload_3
    //   5694: istore 195
    //   5696: aload 191
    //   5698: iload 193
    //   5700: iload 195
    //   5702: iload 194
    //   5704: ixor
    //   5705: i2c
    //   5706: castore
    //   5707: iinc 193 1
    //   5710: goto -4258 -> 1452
    //   5713: bipush 87
    //   5715: istore 195
    //   5717: goto -21 -> 5696
    //   5720: bipush 55
    //   5722: istore 195
    //   5724: goto -28 -> 5696
    //   5727: bipush 119
    //   5729: istore 195
    //   5731: goto -35 -> 5696
    //   5734: bipush 113
    //   5736: istore 195
    //   5738: goto -42 -> 5696
    //   5741: aload 196
    //   5743: iload 198
    //   5745: caload
    //   5746: istore 199
    //   5748: iload 198
    //   5750: iconst_5
    //   5751: irem
    //   5752: tableswitch	default:+32 -> 5784, 0:+53->5805, 1:+60->5812, 2:+67->5819, 3:+74->5826
    //   5785: lload_3
    //   5786: istore 200
    //   5788: aload 196
    //   5790: iload 198
    //   5792: iload 200
    //   5794: iload 199
    //   5796: ixor
    //   5797: i2c
    //   5798: castore
    //   5799: iinc 198 1
    //   5802: goto -4312 -> 1490
    //   5805: bipush 87
    //   5807: istore 200
    //   5809: goto -21 -> 5788
    //   5812: bipush 55
    //   5814: istore 200
    //   5816: goto -28 -> 5788
    //   5819: bipush 119
    //   5821: istore 200
    //   5823: goto -35 -> 5788
    //   5826: bipush 113
    //   5828: istore 200
    //   5830: goto -42 -> 5788
    //   5833: aload 201
    //   5835: iload 203
    //   5837: caload
    //   5838: istore 204
    //   5840: iload 203
    //   5842: iconst_5
    //   5843: irem
    //   5844: tableswitch	default:+32 -> 5876, 0:+53->5897, 1:+60->5904, 2:+67->5911, 3:+74->5918
    //   5877: lload_3
    //   5878: istore 205
    //   5880: aload 201
    //   5882: iload 203
    //   5884: iload 205
    //   5886: iload 204
    //   5888: ixor
    //   5889: i2c
    //   5890: castore
    //   5891: iinc 203 1
    //   5894: goto -4366 -> 1528
    //   5897: bipush 87
    //   5899: istore 205
    //   5901: goto -21 -> 5880
    //   5904: bipush 55
    //   5906: istore 205
    //   5908: goto -28 -> 5880
    //   5911: bipush 119
    //   5913: istore 205
    //   5915: goto -35 -> 5880
    //   5918: bipush 113
    //   5920: istore 205
    //   5922: goto -42 -> 5880
    //   5925: aload 206
    //   5927: iload 208
    //   5929: caload
    //   5930: istore 209
    //   5932: iload 208
    //   5934: iconst_5
    //   5935: irem
    //   5936: tableswitch	default:+32 -> 5968, 0:+53->5989, 1:+60->5996, 2:+67->6003, 3:+74->6010
    //   5969: lload_3
    //   5970: istore 210
    //   5972: aload 206
    //   5974: iload 208
    //   5976: iload 210
    //   5978: iload 209
    //   5980: ixor
    //   5981: i2c
    //   5982: castore
    //   5983: iinc 208 1
    //   5986: goto -4420 -> 1566
    //   5989: bipush 87
    //   5991: istore 210
    //   5993: goto -21 -> 5972
    //   5996: bipush 55
    //   5998: istore 210
    //   6000: goto -28 -> 5972
    //   6003: bipush 119
    //   6005: istore 210
    //   6007: goto -35 -> 5972
    //   6010: bipush 113
    //   6012: istore 210
    //   6014: goto -42 -> 5972
    //   6017: aload 211
    //   6019: iload 213
    //   6021: caload
    //   6022: istore 214
    //   6024: iload 213
    //   6026: iconst_5
    //   6027: irem
    //   6028: tableswitch	default:+32 -> 6060, 0:+53->6081, 1:+60->6088, 2:+67->6095, 3:+74->6102
    //   6061: lload_3
    //   6062: istore 215
    //   6064: aload 211
    //   6066: iload 213
    //   6068: iload 215
    //   6070: iload 214
    //   6072: ixor
    //   6073: i2c
    //   6074: castore
    //   6075: iinc 213 1
    //   6078: goto -4474 -> 1604
    //   6081: bipush 87
    //   6083: istore 215
    //   6085: goto -21 -> 6064
    //   6088: bipush 55
    //   6090: istore 215
    //   6092: goto -28 -> 6064
    //   6095: bipush 119
    //   6097: istore 215
    //   6099: goto -35 -> 6064
    //   6102: bipush 113
    //   6104: istore 215
    //   6106: goto -42 -> 6064
    //   6109: aload 216
    //   6111: iload 218
    //   6113: caload
    //   6114: istore 219
    //   6116: iload 218
    //   6118: iconst_5
    //   6119: irem
    //   6120: tableswitch	default:+32 -> 6152, 0:+53->6173, 1:+60->6180, 2:+67->6187, 3:+74->6194
    //   6153: lload_3
    //   6154: istore 220
    //   6156: aload 216
    //   6158: iload 218
    //   6160: iload 220
    //   6162: iload 219
    //   6164: ixor
    //   6165: i2c
    //   6166: castore
    //   6167: iinc 218 1
    //   6170: goto -4528 -> 1642
    //   6173: bipush 87
    //   6175: istore 220
    //   6177: goto -21 -> 6156
    //   6180: bipush 55
    //   6182: istore 220
    //   6184: goto -28 -> 6156
    //   6187: bipush 119
    //   6189: istore 220
    //   6191: goto -35 -> 6156
    //   6194: bipush 113
    //   6196: istore 220
    //   6198: goto -42 -> 6156
    //   6201: aload 221
    //   6203: iload 223
    //   6205: caload
    //   6206: istore 224
    //   6208: iload 223
    //   6210: iconst_5
    //   6211: irem
    //   6212: tableswitch	default:+32 -> 6244, 0:+53->6265, 1:+60->6272, 2:+67->6279, 3:+74->6286
    //   6245: lload_3
    //   6246: istore 225
    //   6248: aload 221
    //   6250: iload 223
    //   6252: iload 225
    //   6254: iload 224
    //   6256: ixor
    //   6257: i2c
    //   6258: castore
    //   6259: iinc 223 1
    //   6262: goto -4582 -> 1680
    //   6265: bipush 87
    //   6267: istore 225
    //   6269: goto -21 -> 6248
    //   6272: bipush 55
    //   6274: istore 225
    //   6276: goto -28 -> 6248
    //   6279: bipush 119
    //   6281: istore 225
    //   6283: goto -35 -> 6248
    //   6286: bipush 113
    //   6288: istore 225
    //   6290: goto -42 -> 6248
    //   6293: aload 226
    //   6295: iload 228
    //   6297: caload
    //   6298: istore 229
    //   6300: iload 228
    //   6302: iconst_5
    //   6303: irem
    //   6304: tableswitch	default:+32 -> 6336, 0:+53->6357, 1:+60->6364, 2:+67->6371, 3:+74->6378
    //   6337: lload_3
    //   6338: istore 230
    //   6340: aload 226
    //   6342: iload 228
    //   6344: iload 230
    //   6346: iload 229
    //   6348: ixor
    //   6349: i2c
    //   6350: castore
    //   6351: iinc 228 1
    //   6354: goto -4636 -> 1718
    //   6357: bipush 87
    //   6359: istore 230
    //   6361: goto -21 -> 6340
    //   6364: bipush 55
    //   6366: istore 230
    //   6368: goto -28 -> 6340
    //   6371: bipush 119
    //   6373: istore 230
    //   6375: goto -35 -> 6340
    //   6378: bipush 113
    //   6380: istore 230
    //   6382: goto -42 -> 6340
    //   6385: aload 231
    //   6387: iload 233
    //   6389: caload
    //   6390: istore 234
    //   6392: iload 233
    //   6394: iconst_5
    //   6395: irem
    //   6396: tableswitch	default:+32 -> 6428, 0:+53->6449, 1:+60->6456, 2:+67->6463, 3:+74->6470
    //   6429: lload_3
    //   6430: istore 235
    //   6432: aload 231
    //   6434: iload 233
    //   6436: iload 235
    //   6438: iload 234
    //   6440: ixor
    //   6441: i2c
    //   6442: castore
    //   6443: iinc 233 1
    //   6446: goto -4690 -> 1756
    //   6449: bipush 87
    //   6451: istore 235
    //   6453: goto -21 -> 6432
    //   6456: bipush 55
    //   6458: istore 235
    //   6460: goto -28 -> 6432
    //   6463: bipush 119
    //   6465: istore 235
    //   6467: goto -35 -> 6432
    //   6470: bipush 113
    //   6472: istore 235
    //   6474: goto -42 -> 6432
    //   6477: aload 236
    //   6479: iload 238
    //   6481: caload
    //   6482: istore 239
    //   6484: iload 238
    //   6486: iconst_5
    //   6487: irem
    //   6488: tableswitch	default:+32 -> 6520, 0:+53->6541, 1:+60->6548, 2:+67->6555, 3:+74->6562
    //   6521: lload_3
    //   6522: istore 240
    //   6524: aload 236
    //   6526: iload 238
    //   6528: iload 240
    //   6530: iload 239
    //   6532: ixor
    //   6533: i2c
    //   6534: castore
    //   6535: iinc 238 1
    //   6538: goto -4744 -> 1794
    //   6541: bipush 87
    //   6543: istore 240
    //   6545: goto -21 -> 6524
    //   6548: bipush 55
    //   6550: istore 240
    //   6552: goto -28 -> 6524
    //   6555: bipush 119
    //   6557: istore 240
    //   6559: goto -35 -> 6524
    //   6562: bipush 113
    //   6564: istore 240
    //   6566: goto -42 -> 6524
    //   6569: aload 241
    //   6571: iload 243
    //   6573: caload
    //   6574: istore 244
    //   6576: iload 243
    //   6578: iconst_5
    //   6579: irem
    //   6580: tableswitch	default:+32 -> 6612, 0:+53->6633, 1:+60->6640, 2:+67->6647, 3:+74->6654
    //   6613: lload_3
    //   6614: istore 245
    //   6616: aload 241
    //   6618: iload 243
    //   6620: iload 245
    //   6622: iload 244
    //   6624: ixor
    //   6625: i2c
    //   6626: castore
    //   6627: iinc 243 1
    //   6630: goto -4798 -> 1832
    //   6633: bipush 87
    //   6635: istore 245
    //   6637: goto -21 -> 6616
    //   6640: bipush 55
    //   6642: istore 245
    //   6644: goto -28 -> 6616
    //   6647: bipush 119
    //   6649: istore 245
    //   6651: goto -35 -> 6616
    //   6654: bipush 113
    //   6656: istore 245
    //   6658: goto -42 -> 6616
    //   6661: aload 246
    //   6663: iload 248
    //   6665: caload
    //   6666: istore 249
    //   6668: iload 248
    //   6670: iconst_5
    //   6671: irem
    //   6672: tableswitch	default:+32 -> 6704, 0:+53->6725, 1:+60->6732, 2:+67->6739, 3:+74->6746
    //   6705: lload_3
    //   6706: istore 250
    //   6708: aload 246
    //   6710: iload 248
    //   6712: iload 250
    //   6714: iload 249
    //   6716: ixor
    //   6717: i2c
    //   6718: castore
    //   6719: iinc 248 1
    //   6722: goto -4852 -> 1870
    //   6725: bipush 87
    //   6727: istore 250
    //   6729: goto -21 -> 6708
    //   6732: bipush 55
    //   6734: istore 250
    //   6736: goto -28 -> 6708
    //   6739: bipush 119
    //   6741: istore 250
    //   6743: goto -35 -> 6708
    //   6746: bipush 113
    //   6748: istore 250
    //   6750: goto -42 -> 6708
    //   6753: aload 251
    //   6755: iload 253
    //   6757: caload
    //   6758: istore 254
    //   6760: iload 253
    //   6762: iconst_5
    //   6763: irem
    //   6764: tableswitch	default:+32 -> 6796, 0:+53->6817, 1:+60->6824, 2:+67->6831, 3:+74->6838
    //   6797: lload_3
    //   6798: istore 255
    //   6800: aload 251
    //   6802: iload 253
    //   6804: iload 255
    //   6806: iload 254
    //   6808: ixor
    //   6809: i2c
    //   6810: castore
    //   6811: iinc 253 1
    //   6814: goto -4906 -> 1908
    //   6817: bipush 87
    //   6819: istore 255
    //   6821: goto -21 -> 6800
    //   6824: bipush 55
    //   6826: istore 255
    //   6828: goto -28 -> 6800
    //   6831: bipush 119
    //   6833: istore 255
    //   6835: goto -35 -> 6800
    //   6838: bipush 113
    //   6840: istore 255
    //   6842: goto -42 -> 6800
    //   6845: wide
    //   6849: wide
    //   6853: caload
    //   6854: wide
    //   6858: wide
    //   6862: iconst_5
    //   6863: irem
    //   6864: tableswitch	default:+32 -> 6896, 0:+66->6930, 1:+75->6939, 2:+84->6948, 3:+93->6957
    //   6897: lload_3
    //   6898: wide
    //   6902: wide
    //   6906: wide
    //   6910: wide
    //   6914: wide
    //   6918: ixor
    //   6919: i2c
    //   6920: castore
    //   6921: wide
    //   6927: goto -4973 -> 1954
    //   6930: bipush 87
    //   6932: wide
    //   6936: goto -34 -> 6902
    //   6939: bipush 55
    //   6941: wide
    //   6945: goto -43 -> 6902
    //   6948: bipush 119
    //   6950: wide
    //   6954: goto -52 -> 6902
    //   6957: bipush 113
    //   6959: wide
    //   6963: goto -61 -> 6902
    //   6966: wide
    //   6970: wide
    //   6974: caload
    //   6975: wide
    //   6979: wide
    //   6983: iconst_5
    //   6984: irem
    //   6985: tableswitch	default:+31 -> 7016, 0:+65->7050, 1:+74->7059, 2:+83->7068, 3:+92->7077
    //   7017: lload_3
    //   7018: wide
    //   7022: wide
    //   7026: wide
    //   7030: wide
    //   7034: wide
    //   7038: ixor
    //   7039: i2c
    //   7040: castore
    //   7041: wide
    //   7047: goto -5041 -> 2006
    //   7050: bipush 87
    //   7052: wide
    //   7056: goto -34 -> 7022
    //   7059: bipush 55
    //   7061: wide
    //   7065: goto -43 -> 7022
    //   7068: bipush 119
    //   7070: wide
    //   7074: goto -52 -> 7022
    //   7077: bipush 113
    //   7079: wide
    //   7083: goto -61 -> 7022
    //   7086: wide
    //   7090: wide
    //   7094: caload
    //   7095: wide
    //   7099: wide
    //   7103: iconst_5
    //   7104: irem
    //   7105: tableswitch	default:+31 -> 7136, 0:+65->7170, 1:+74->7179, 2:+83->7188, 3:+92->7197
    //   7137: lload_3
    //   7138: wide
    //   7142: wide
    //   7146: wide
    //   7150: wide
    //   7154: wide
    //   7158: ixor
    //   7159: i2c
    //   7160: castore
    //   7161: wide
    //   7167: goto -5109 -> 2058
    //   7170: bipush 87
    //   7172: wide
    //   7176: goto -34 -> 7142
    //   7179: bipush 55
    //   7181: wide
    //   7185: goto -43 -> 7142
    //   7188: bipush 119
    //   7190: wide
    //   7194: goto -52 -> 7142
    //   7197: bipush 113
    //   7199: wide
    //   7203: goto -61 -> 7142
    //   7206: wide
    //   7210: wide
    //   7214: caload
    //   7215: wide
    //   7219: wide
    //   7223: iconst_5
    //   7224: irem
    //   7225: tableswitch	default:+31 -> 7256, 0:+65->7290, 1:+74->7299, 2:+83->7308, 3:+92->7317
    //   7257: lload_3
    //   7258: wide
    //   7262: wide
    //   7266: wide
    //   7270: wide
    //   7274: wide
    //   7278: ixor
    //   7279: i2c
    //   7280: castore
    //   7281: wide
    //   7287: goto -5177 -> 2110
    //   7290: bipush 87
    //   7292: wide
    //   7296: goto -34 -> 7262
    //   7299: bipush 55
    //   7301: wide
    //   7305: goto -43 -> 7262
    //   7308: bipush 119
    //   7310: wide
    //   7314: goto -52 -> 7262
    //   7317: bipush 113
    //   7319: wide
    //   7323: goto -61 -> 7262
  }

  static int a(int paramInt)
  {
    s = paramInt;
    return paramInt;
  }

  public static int a(EditText paramEditText)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    int j;
    if (!paramEditText.isFocused())
      j = -1;
    while (true)
    {
      return j;
      String str = paramEditText.getText().toString();
      j = 0;
      if ((i < paramEditText.getSelectionEnd()) && ((i <= str.length()) || (bool)))
      {
        if ((str.charAt(i) <= '9') && (str.charAt(i) >= '0'))
          j++;
        i++;
        if (!bool)
          break;
      }
    }
  }

  public static int a(String paramString1, String paramString2)
  {
    int i = 5;
    try
    {
      if ((paramString1.length() < 1) || (paramString1.length() > 3))
      {
        g5.c(F[1] + paramString1);
        i = 2;
      }
      else if (jp.b(paramString1) == null)
      {
        g5.c(F[4] + paramString1);
        i = 3;
      }
      else if ((paramString2 == null) || (paramString2.length() == 0) || (paramString2.replaceAll(F[5], "").length() == 0))
      {
        g5.c(F[3] + paramString1);
        i = 4;
      }
      else
      {
        int j = Integer.parseInt(paramString1);
        String str = jp.a(j, paramString2.replaceAll(F[5], ""));
        int k = jp.a(j, str.length());
        if (k != 0)
        {
          g5.c(F[6] + j + F[0] + str + F[7] + k);
          if (k >= 0)
            i = 6;
        }
        else if ((paramString1.length() + str.length() > 15) || (paramString1.length() + str.length() < 8))
        {
          g5.c(F[9] + paramString1 + F[2] + str);
          i = 7;
        }
        else
        {
          i = 1;
        }
      }
    }
    catch (IOException localIOException)
    {
      g5.d(F[8] + localIOException);
      i = 7;
    }
    return i;
  }

  private static void a(EditText paramEditText, int paramInt)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    String str = paramEditText.getText().toString();
    int j = 0;
    do
    {
      if ((i >= str.length()) || (paramInt <= 0))
        break;
      if ((str.charAt(i) <= '9') && (str.charAt(i) >= '0'))
        paramInt--;
      j++;
      i++;
    }
    while (!bool);
    paramEditText.setSelection(j);
  }

  static void a(RegisterPhone paramRegisterPhone)
  {
    paramRegisterPhone.d();
  }

  static void a(RegisterPhone paramRegisterPhone, String paramString)
  {
    paramRegisterPhone.b(paramString);
  }

  static void a(RegisterPhone paramRegisterPhone, boolean paramBoolean)
  {
    paramRegisterPhone.b(paramBoolean);
  }

  private void a(boolean paramBoolean)
  {
    this.y = paramBoolean;
    SharedPreferences.Editor localEditor = getPreferences(0).edit();
    localEditor.putBoolean(F[27], this.y);
    if (!localEditor.commit())
      g5.c(F[34]);
  }

  static String b(RegisterPhone paramRegisterPhone)
  {
    return paramRegisterPhone.w;
  }

  public static void b(EditText paramEditText, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    int i = paramEditText.getText().length();
    if ((paramInt > -1) && (paramInt <= i))
    {
      paramEditText.requestFocus();
      a(paramEditText, paramInt);
      if (!bool);
    }
    else if (paramInt > i)
    {
      paramEditText.requestFocus();
      paramEditText.setSelection(i);
      if (!bool);
    }
    else
    {
      paramEditText.setSelection(i);
    }
  }

  static void b(RegisterPhone paramRegisterPhone, boolean paramBoolean)
  {
    paramRegisterPhone.a(paramBoolean);
  }

  private void b(String paramString)
  {
    try
    {
      g5.b(F[15] + paramString + F[13] + jp.e(paramString));
    }
    catch (IOException localIOException1)
    {
      try
      {
        while (true)
        {
          if (this.v != null)
            this.D.removeTextChangedListener(this.v);
          this.v = new zx(jp.e(paramString));
          this.D.addTextChangedListener(this.v);
          return;
          localIOException1 = localIOException1;
          g5.b(F[15] + paramString + F[14], localIOException1);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        while (true)
          g5.b(F[12], localNullPointerException);
      }
      catch (IOException localIOException2)
      {
        while (true)
          g5.b(F[12], localIOException2);
      }
    }
  }

  private void b(boolean paramBoolean)
  {
    App.a(this, q, r);
    s = 7;
    d();
    if ((paramBoolean) && (this.l))
    {
      a();
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.a(this, 2);
      startActivity(new Intent(this, RegisterName.class));
    }
    finish();
  }

  static TextWatcher c(RegisterPhone paramRegisterPhone)
  {
    return paramRegisterPhone.u;
  }

  static String d(RegisterPhone paramRegisterPhone)
  {
    return paramRegisterPhone.h();
  }

  static String d(String paramString)
  {
    q = paramString;
    return paramString;
  }

  private void d()
  {
    SharedPreferences.Editor localEditor = getPreferences(0).edit();
    localEditor.putInt(F[29], s);
    if (!localEditor.commit())
      g5.c(F[54]);
  }

  static String e(RegisterPhone paramRegisterPhone)
  {
    return paramRegisterPhone.g();
  }

  static String e(String paramString)
  {
    r = paramString;
    return paramString;
  }

  private void e()
  {
    SharedPreferences.Editor localEditor = getPreferences(0).edit();
    localEditor.putString(F[32], r);
    if (!localEditor.commit())
      g5.c(F[31]);
  }

  static String f(String paramString)
  {
    t = paramString;
    return paramString;
  }

  static void f(RegisterPhone paramRegisterPhone)
  {
    paramRegisterPhone.e();
  }

  private String g()
  {
    return getPreferences(0).getString(F[32], "");
  }

  static void g(RegisterPhone paramRegisterPhone)
  {
    paramRegisterPhone.i();
  }

  private String h()
  {
    return getPreferences(0).getString(F[24], "");
  }

  static void h(RegisterPhone paramRegisterPhone)
  {
    paramRegisterPhone.l();
  }

  private void i()
  {
    SharedPreferences.Editor localEditor = getPreferences(0).edit();
    localEditor.putString(F[24], q);
    if (!localEditor.commit())
      g5.c(F[35]);
  }

  private boolean j()
  {
    return getPreferences(0).getBoolean(F[27], false);
  }

  private void k()
  {
    if (this.A)
    {
      super.a(F[11]);
      if (!DialogToastListActivity.f);
    }
    else
    {
      super.a(F[10]);
    }
  }

  private void l()
  {
    g5.b(F[16]);
    s = 7;
    d();
    e("");
    t = null;
    a(false);
    App.a(App.Mb, b(t));
    App.c(App.Mb, null);
  }

  static String m()
  {
    return q;
  }

  static String n()
  {
    return r;
  }

  static int o()
  {
    return s;
  }

  static String p()
  {
    return t;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (paramInt2 == -1))
    {
      q = paramIntent.getStringExtra(F[19]);
      this.w = paramIntent.getStringExtra(F[21]);
      this.B.setText(q);
      this.C.setText(this.w);
      b(this.w);
      SharedPreferences localSharedPreferences = getPreferences(0);
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putString(F[20], q);
      localEditor.putString(F[23], q);
      if (localSharedPreferences.getInt(F[22], -1) == -1)
        localEditor.putInt(F[22], 2147483647);
      localEditor.putInt(F[18], -1);
      if (!localEditor.commit())
        g5.c(F[17]);
    }
    this.B.addTextChangedListener(this.u);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(F[43]);
    super.onCreate(paramBundle);
    setContentView(2130903123);
    if (App.c(this) != 1)
    {
      g5.d(F[39]);
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      if (getIntent().getExtras() != null)
      {
        if (getIntent().getBooleanExtra(F[38], false))
          l();
        if (getIntent().getBooleanExtra(F[40], false))
        {
          this.z = true;
          if (!bool);
        }
        else
        {
          this.z = false;
          if (!bool);
        }
      }
      else
      {
        this.z = false;
      }
      App.db.listen(this.p, -1);
      this.B = ((EditText)findViewById(2131558647));
      this.C = ((EditText)findViewById(2131558645));
      this.D = ((EditText)findViewById(2131558648));
      ((TextView)findViewById(2131558643)).setText(getString(2131296366).toUpperCase());
      ((TextView)findViewById(2131558646)).setText(getString(2131296365).toUpperCase());
      InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
      arrayOfInputFilter1[0] = new InputFilter.LengthFilter(3);
      this.B.setFilters(arrayOfInputFilter1);
      InputFilter[] arrayOfInputFilter2 = new InputFilter[1];
      arrayOfInputFilter2[0] = new InputFilter.LengthFilter(17);
      this.D.setFilters(arrayOfInputFilter2);
      String str2;
      if (getPreferences(0).getString(F[20], null) == null)
      {
        str2 = App.db.getNetworkCountryIso();
        if (str2 == null);
      }
      try
      {
        String str4 = jp.d(str2);
        str3 = str4;
        if (str3 != null)
        {
          SharedPreferences.Editor localEditor = getPreferences(0).edit();
          localEditor.putString(F[20], str3);
          if (!localEditor.commit())
            g5.c(F[41]);
        }
        this.u = new g2(this);
        this.B.addTextChangedListener(this.u);
        h2 localh2 = new h2(this);
        this.C.setOnClickListener(localh2);
        this.D.requestFocus();
        this.D.setCursorVisible(true);
        ((Button)findViewById(2131558649)).setOnClickListener(new i2(this));
        if (q != null)
          this.B.setText(q);
        String str1 = this.C.getText().toString();
        if ((str1 != null) && (str1.length() > 0))
          b(str1);
        this.y = j();
        if (getWindowManager().getDefaultDisplay().getHeight() <= 480)
          getWindow().setSoftInputMode(3);
        if (!App.Mb.I())
          continue;
        g5.c(F[42]);
        Conversations.a(this, 113);
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          g5.d(F[37] + str2 + F[44]);
          String str3 = null;
        }
      }
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 21:
    case 9:
    case 22:
    case 23:
    case 113:
    }
    while (true)
    {
      return localObject;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = a(q, r);
      String str5 = getString(2131296368, arrayOfObject);
      SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str5);
      localSpannableStringBuilder1.setSpan(new StyleSpan(1), 0, str5.length(), 33);
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(getString(2131296270));
      localSpannableStringBuilder2.setSpan(new StyleSpan(1), 0, localSpannableStringBuilder2.length(), 33);
      localObject = new AlertDialog.Builder(this).setMessage(localSpannableStringBuilder1).setPositiveButton(localSpannableStringBuilder2, new c2(this)).setNeutralButton(2131296395, new b2(this)).create();
      continue;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296335));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      this.E = ((ProgressDialog)localObject);
      continue;
      g5.c(F[50]);
      String str3 = getString(2131296389);
      String str4 = F[45];
      if ((F[48].equals(VerifyNumber.f())) && (F[52].equals(App.db.getSubscriberId())))
      {
        str3 = str3 + F[47] + getString(2131296307);
        g5.b(F[51]);
        str4 = F[49];
      }
      localObject = new AlertDialog.Builder(this).setMessage(str3).setPositiveButton(2131296336, new e2(this, str4)).setNeutralButton(2131296268, new d2(this)).create();
      continue;
      g5.c(F[53]);
      String str1 = VerifyNumber.a(q, r);
      String str2 = getString(2131296405) + "\n" + str1 + "\n" + getString(2131296406);
      localObject = new AlertDialog.Builder(this).setMessage(str2).setNeutralButton(2131296270, new f2(this)).create();
      continue;
      g5.c(F[46]);
      localObject = Conversations.a(this);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 0, 0, 2131296336).setIcon(2130838470);
    return true;
  }

  protected void onDestroy()
  {
    g5.b(F[36]);
    App.db.listen(this.p, 0);
    this.x = true;
    super.onDestroy();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      k();
    }
  }

  public void onPause()
  {
    super.onPause();
    g5.b(F[28] + s);
    SharedPreferences.Editor localEditor = getPreferences(0).edit();
    localEditor.putString(F[23], q);
    localEditor.putString(F[26], r);
    localEditor.putInt(F[29], s);
    localEditor.putString(F[30], this.D.getText().toString());
    localEditor.putString(F[20], this.B.getText().toString());
    localEditor.putBoolean(F[27], this.y);
    localEditor.putInt(F[18], a(this.B));
    localEditor.putInt(F[22], a(this.D));
    if (!localEditor.commit())
      g5.c(F[25]);
    App.a(App.Mb, b(t));
  }

  public void onResume()
  {
    boolean bool = DialogToastListActivity.f;
    super.onResume();
    SharedPreferences localSharedPreferences = getPreferences(0);
    q = localSharedPreferences.getString(F[23], null);
    r = localSharedPreferences.getString(F[26], null);
    s = localSharedPreferences.getInt(F[29], 7);
    t = c(App.e(App.Mb));
    this.y = localSharedPreferences.getBoolean(F[27], false);
    if (this.z)
    {
      this.z = false;
      this.D.setText("");
      if (!bool);
    }
    else
    {
      this.D.setText(localSharedPreferences.getString(F[30], null));
    }
    this.B.setText(localSharedPreferences.getString(F[20], null));
    b(this.D, localSharedPreferences.getInt(F[22], -1));
    b(this.B, localSharedPreferences.getInt(F[18], -1));
    g5.b(F[33] + s);
    switch (s)
    {
    default:
    case 15:
    }
    while (true)
    {
      App.gb.cancel(1);
      App.a(this, 1);
      gp.b();
      return;
      if ((q == null) || (r == null))
      {
        g5.b(F[16]);
        s = 7;
        d();
        if (!bool);
      }
      else
      {
        showDialog(21);
      }
    }
  }
}