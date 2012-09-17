package com.whatsapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlarmManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.AsyncPlayer;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.Contacts;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import wb;

public class App extends Application
{
  public static boolean A;
  static ArrayList<uk> Ab;
  public static w5 B;
  private static long Bb;
  public static w5 C;
  static int Cb;
  public static String D;
  private static PhoneStateListener Db;
  public static String E;
  static long Eb;
  public static int F;
  static Handler Fb;
  private static boolean G;
  static long Gb;
  static Date H;
  static Notification Hb;
  private static int I;
  public static Handler Ib;
  private static boolean J;
  public static Handler Jb;
  private static final Uri K;
  private static final Handler Kb;
  private static Integer L;
  private static final String[] Lb = arrayOfString2;
  private static long M;
  public static App Mb = null;
  private static boolean N;
  static int Nb;
  private static boolean O;
  static int Ob;
  private static boolean P;
  static int Pb;
  private static lr Q;
  public static boolean R;
  public static c5<String> S;
  public static c5<String> T;
  public static c5<String> U;
  public static HashMap<String, Message> V;
  static String Vb = z(z("^-\013,P@ \034?TS \b2X@5\0033XP4\036"));
  private static long W;
  public static vu Z;
  public static String a;
  private static final lq ab;
  static boolean b;
  public static App.Me bb;
  public static final File c;
  public static String cb;
  private static File d;
  public static TelephonyManager db;
  private static final File e;
  public static ConnectivityManager eb;
  public static int f;
  public static ActivityManager fb;
  public static int g;
  public static NotificationManager gb;
  public static boolean h;
  public static PackageManager hb;
  public static String i;
  public static ContentResolver ib;
  public static int ic = 0;
  public static String j;
  public static AudioManager jb;
  private static final Object jc = new Object();
  public static String k;
  static boolean kb;
  static Handler kc = new mc();
  public static String l;
  public static boolean lb;
  public static g lc = new g();
  public static String m;
  public static boolean mb;
  public static Handler mc = new nc();
  public static String n;
  public static boolean nb;
  private static final com.whatsapp.messaging.t nc = new lx();
  static Date o;
  public static boolean ob;
  public static AsyncPlayer oc = new AsyncPlayer(xc[338]);
  static boolean p;
  public static boolean pb;
  private static boolean pc = false;
  static int q;
  public static boolean qb;
  private static boolean qc = false;
  static boolean r;
  public static final p5 rb;
  private static Messenger rc = null;
  static int s;
  public static int sb;
  private static final Messenger sc = new Messenger(new tc());
  static boolean t;
  public static boolean tb;
  private static final ServiceConnection tc = new fi();
  static boolean u;
  private static boolean ub;
  static Handler uc;
  static TimeZone v;
  private static boolean vb;
  public static Handler vc = new oc();
  public static qp w;
  public static HashMap<String, SoftReference<Bitmap>> wb;
  public static int wc;
  public static eu x;
  public static HashMap<String, SoftReference<Bitmap>> xb;
  private static final String[] xc;
  public static yy y;
  static Hashtable<String, String> yb;
  public static fq z;
  static TextView zb;
  StringBuffer Qb;
  String Rb;
  String Sb;
  String Tb;
  String Ub;
  BroadcastReceiver Wb;
  private ow X;
  BroadcastReceiver Xb;
  private boolean Y = true;
  BroadcastReceiver Yb;
  BroadcastReceiver Zb;
  BroadcastReceiver ac;
  BroadcastReceiver bc;
  BroadcastReceiver cc;
  BroadcastReceiver dc;
  BroadcastReceiver ec;
  BroadcastReceiver fc;
  BroadcastReceiver gc;
  private SharedPreferences.OnSharedPreferenceChangeListener hc;

  static
  {
    String[] arrayOfString1 = new String[339];
    arrayOfString1[0] = z(z("~\017.\frv\005d\fxl\016?\f~z[eQ~p\fd\tu~\0259\037moNxO..QsG+*Q"));
    arrayOfString1[1] = z(z("g\f:\0162l\0048\bt|\004e\fxl\004>Soz\006#\riz\023/\0322j\021.\037iz\021+\f|r\022"));
    arrayOfString1[2] = z(z("~\021:Qer\021:Qoz\002<Qu~\017.\022x@\0218\021{v\r/!mw\016>\021Bs\0169\n2u\b.^"));
    arrayOfString1[3] = z(z("0\007+\027qz\005"));
    arrayOfString1[4] = z(z("f\0303\007PR\005."));
    arrayOfString1[5] = z(z("~\r+\fp"));
    arrayOfString1[6] = z(z("~\021:Q|s��8\0232{\003(\037~t\024:Qnk��8\n="));
    arrayOfString1[7] = z(z("r\016?\020iz\005"));
    arrayOfString1[8] = z(z("r\016?\020iz\005\025\fr"));
    arrayOfString1[9] = z(z("y��#\022x{A>\021=p\021/\020=^\025%\023t|'#\022xP\024>\016hk2>\fx~\fj\030rmA'\033yv��j\032rh\017&\021|{"));
    arrayOfString1[10] = z(z("~\021:Qyp\026$\022r~\005'\033yv��e\033om\0168Qsp\025\025\nuz>9\032B|��8\032Br\016?\020i@\022>\037iz"));
    arrayOfString1[11] = z(z("|\016'Pzp\016-\022x1��$\032op\b.Pp~\0219PP~\021\013\035iv\027#\nd"));
    arrayOfString1[12] = z(z("~\021:Qoz��.\022|l\025,\013qs\0223\020~y\023%\023{v\r/Qtp\0048\frmA"));
    arrayOfString1[13] = z(z("~\021:Qoz��.\022|l\025,\013qs\0223\020~y\023%\023{v\r/Q{~\b&^"));
    arrayOfString1[14] = z(z("y\024&\022nf\017)Py~\025"));
    arrayOfString1[15] = z(z("~\021:Qhl\0048S|x\004$\n2m\004&\033|l\004j"));
    arrayOfString1[16] = z(z("~\021:Qhl\0048S|x\004$\n2r\016.\033q?"));
    arrayOfString1[17] = z(z("?%/\bt|\004e"));
    arrayOfString1[18] = z(z("~\021:Qhl\0048S|x\004$\n2r��$\013{~\002>\013oz\023j"));
    arrayOfString1[19] = z(z("j\017!\020rh\017"));
    arrayOfString1[20] = z(z("~\021:Qnz\017.-xk&8\021ho2?\034wz\002>"));
    arrayOfString1[21] = z(z("o\0249\026Bq��'\033"));
    arrayOfString1[22] = z(z("~\021:Qqp\026'\033pp\0233"));
    arrayOfString1[23] = z(z("~\021:Qyp\026$\022r~\005'\033yv��e\020r@\0248\022"));
    arrayOfString1[24] = z(z("g\f:\0162l\0048\bt|\004e\034tq\005"));
    arrayOfString1[25] = z(z("~\021:Qhq\023/\031tl\025/\fnz\023<\027~z\022"));
    arrayOfString1[26] = z(z("S&\017SQJSyN-"));
    arrayOfString1[27] = z(z("k\0042\n2o\r+\027s"));
    arrayOfString1[28] = z(z("\025k"));
    arrayOfString1[29] = z(z("|\016'Pzp\016-\022x1��$\032op\b.P|o\0219Pms\0249"));
    arrayOfString1[30] = z(z("|\016'Py~\025+\bteO9\n|m\006+\nx"));
    arrayOfString1[31] = z(z("}\r?\033ip\016>\026"));
    arrayOfString1[32] = z(z("~\017.\frv\005d\027sk\004$\n3z\031>\f|15\017&I"));
    arrayOfString1[33] = z(z("|\016'Pzp\016-\022x1��$\032op\b.P|o\0219Pzp\016-\022xi\016#\035x"));
    arrayOfString1[34] = z(z("i\017.P|q\0058\021t{L.\027o0\f'\r0l\f9"));
    arrayOfString1[35] = z(z("|\016'Pzp\016-\022x1\0332\027sxO)\022tz\017>P|q\0058\021t{"));
    arrayOfString1[36] = z(z("|\016'P{~\002/\034rp\nd\025|k��$\037"));
    arrayOfString1[37] = z(z("|\016'PqxO<\037qs\004d\016up\017/L~w\023%\023x"));
    arrayOfString1[38] = z(z("~\021:Qiz\r&Qsp\017/"));
    arrayOfString1[39] = z(z("~\017.\frv\005d\027sk\004$\n3z\031>\f|12\037<WZ\"\036"));
    arrayOfString1[40] = z(z("|\016'Pnz\002d\037s{\023%\027y1��:\0163Y\b&\033Im��$\r{z\023\t\022tz\017>"));
    arrayOfString1[41] = z(z("|\016'Pjw��>\r|o\021"));
    arrayOfString1[42] = z(z("s��d\032op\b.Plm"));
    arrayOfString1[43] = z(z("r\016(\0273n\b9\r3o\r?\fl"));
    arrayOfString1[44] = z(z("l\f9!p\0053"));
    arrayOfString1[45] = z(z("?\035j"));
    arrayOfString1[46] = z(z("~\021:Qm~\002!\037zz\005#\020iz\017>\r2{\004<\027~zA"));
    arrayOfString1[47] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\0347XH"));
    arrayOfString1[48] = z(z("|\016'Pym\016:\034rgO+\020ym\016#\032"));
    arrayOfString1[49] = z(z("|\016'Piw\004.\033~tO+\020ym\016#\0323~\021:"));
    arrayOfString1[50] = z(z("k\026d\037s{\005/\b3~\021&\013ot"));
    arrayOfString1[51] = z(z("|\016'Pih\b>\nxmO+\020ym\016#\032"));
    arrayOfString1[52] = z(z("w\025>\016'0N=\026|k\022+\016m1\002%\0232{\016=\020qp��."));
    arrayOfString1[53] = z(z("|\016'P|q\0058\021t{O+\016mlO>\037z"));
    arrayOfString1[54] = z(z("~\021:Qiz\r&Qri\0048\ft{\004"));
    arrayOfString1[55] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\031;S["));
    arrayOfString1[56] = z(z("|\016'Pxi\0048\020rk\004"));
    arrayOfString1[57] = z(z("~\021:Qiz\r&^"));
    arrayOfString1[58] = z(z("|\016'P{~\002/\034rp\nd\021o|��"));
    arrayOfString1[59] = z(z("|\016'Piw\023/\033~\017+\020|1\017%\nxl"));
    arrayOfString1[60] = z(z("|\016'Puk\002d\rr|\b+\022sz\025=\021otO:\022hm\n"));
    arrayOfString1[61] = z(z("~\017.\frv\005d\027sk\004$\n3z\031>\f|1$\007?TS"));
    arrayOfString1[62] = z(z("|\016'Ppp\025%\frs��d\034qj\023d\rr|\b+\022nw��8\033"));
    arrayOfString1[63] = z(z("|\016'Pqx\004d\023xl\022+\031x1��)\nti\b>\0073|\016'\016rl\004d=rr\021%\rxR\0049\r|x\004\013\035iv\027#\nd"));
    arrayOfString1[64] = z(z("|\016'P|q\0058\033jl\t?P|q\0058\021t{O8\033y{\b>"));
    arrayOfString1[65] = z(z("|\016'Pqv\017!\033yv\017d\037s{\023%\027y"));
    arrayOfString1[66] = z(z("m\004-\027nk\023+\ntp\017\025\024t{"));
    arrayOfString1[67] = z(z("|\023+\ru2\r%\0312h\t+\nn~\021:Qho\r%\037y"));
    arrayOfString1[68] = z(z("~\021:Qtq\b>"));
    arrayOfString1[69] = z(z("~\021:Qtq\b>Qjm\b>\037s\004g\023x{\b+"));
    arrayOfString1[70] = z(z("y\023%\023"));
    arrayOfString1[71] = z(z("|\023+\ru2\r%\0312y��#\022x{A"));
    arrayOfString1[72] = z(z("|\023+\ru2\r%\0312h\t+\nn~\021:Qsp>,\027qz"));
    arrayOfString1[73] = z(z(".UzF(*T{N-/"));
    arrayOfString1[74] = z(z("C6"));
    arrayOfString1[75] = z(z("~\021:Qtq\b>\027|s\b0\0332{\004<\027~z\b.Qxm\023%\f="));
    arrayOfString1[76] = z(z("|\023+\ru2\r%\0312h\t+\nn~\021:Qop\025+\nx"));
    arrayOfString1[77] = z(z("q\004=S"));
    arrayOfString1[78] = z(z("~\021:Qnz\025/\020iz\023g\027n2\022/\020y0\007+\027qz\005"));
    arrayOfString1[79] = z(z("v\017:\013i@\004$\nxm>9\033s{"));
    arrayOfString1[80] = z(z("m\004-\027nk\023+\ntp\017\025\035r{\004"));
    arrayOfString1[81] = z(z("~\021:Qnz\0258\033z|\016.\0332y��#\022x{"));
    arrayOfString1[82] = z(z("~\021:Qi~\022!Svv\r&\033o?"));
    arrayOfString1[83] = z(z("~\021:Qu~\017.\022xl\016,\nj~\023/\033eo\b8\033y"));
    arrayOfString1[84] = z(z("~\021:Qnt\b:^nz\017.9xk&8\021ho($\030r"));
    arrayOfString1[85] = z(z("~\021:Qnz\017.9xk&8\021ho($\030r"));
    arrayOfString1[86] = z(z("~\021:Qnz\025:\013nw\017+\023x0\007+\027qz\005"));
    arrayOfString1[87] = z(z("L\0048\bxm!9Pjw��>\r|o\021d\020xk"));
    arrayOfString1[88] = z(z("0,/\032t~N\003\023|x\0049"));
    arrayOfString1[89] = z(z("S\016-\r"));
    arrayOfString1[90] = z(z("r\004.\027|0\023/\037y2\016$\022d"));
    arrayOfString1[91] = z(z("|\016'Pjw��>\r|o\021p\035rq\025+\035il"));
    arrayOfString1[92] = z(z("0,/\032t~N\013\013yv\016"));
    arrayOfString1[93] = z(z("o\016=\033o"));
    arrayOfString1[94] = z(z("i\0048\rtp\017"));
    arrayOfString1[95] = z(z("x\023%\013m@\017%\nty\030\025\bt}\023+\nx"));
    arrayOfString1[96] = z(z("y\016&\032xm>8\033s~\f#\020z0��?\032tp"));
    arrayOfString1[97] = z(z("~\017.\frv\005d\020xkO)\021sqO\b?^T&\0301HQ%\025:\\K \025-XK5\0030Z@\"\002?SX$\016"));
    arrayOfString1[98] = z(z("~\021:Qrq\0028\033|k\004e\020rk>'\037tq>:\fr|\0049\r2l\025%\016Bw\0048\03331"));
    arrayOfString1[99] = z(z("q\016>\027{v\002+\ntp\017"));
    arrayOfString1[100] = z(z("q\004/\032By\b2!pl\006\025\f|h>.\037i~A9\033i?\025%^im\024/^{~\b&\033y"));
    arrayOfString1[101] = z(z("|\023+\ru@\022/\020iv\017/\022"));
    arrayOfString1[102] = z(z("~\021:Qsp\025#\030d@\027#\034o~\025/^ho\005+\nx?\007+\027qz\005"));
    arrayOfString1[103] = z(z("0,/\032t~N\035?=H��&\022m~\021/\f"));
    arrayOfString1[104] = z(z("/OzP-"));
    arrayOfString1[105] = z(z("~\021:Qnz\025>\027sxN(\037~t\0068\021hq\005g\032|k��j"));
    arrayOfString1[106] = z(z("|\016'Pjw��>\r|o\021p\037hk\t"));
    arrayOfString1[107] = z(z("h\b$\032rh"));
    arrayOfString1[108] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\013=IV.\004!NW4\036:RH/"));
    arrayOfString1[109] = z(z("r��8\025xk"));
    arrayOfString1[110] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\002;\\[2\017*BO-\0379"));
    arrayOfString1[111] = z(z("~\021:Qtq\025/\fs~\r9\nrm��-\0332~\027+\027q?"));
    arrayOfString1[112] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\007;YV \0253RJ/\036;Y"));
    arrayOfString1[113] = z(z("{\004<\027~z>#\032"));
    arrayOfString1[114] = z(z("1\0258\037nw"));
    arrayOfString1[115] = z(z("~\021:Q~m\004+\nx0\017%\np~\b$^"));
    arrayOfString1[116] = z(z("|\016$\020x|\025#\btk\030"));
    arrayOfString1[117] = z(z("i\0048\rtp\017j\013m{��>\033=y��#\022x{"));
    arrayOfString1[118] = z(z("~\021:Q~m\004+\nx0\r%\031tq\007+\027qz\005"));
    arrayOfString1[119] = z(z("p\r.^j~\r&\016|o\0048^{p\r.\033o?\005/\022xk\004."));
    arrayOfString1[120] = z(z("y\b&\033'0N"));
    arrayOfString1[121] = z(z("~\021:Qpl\0069\nrm\004.\0342w\004+\022iw\030"));
    arrayOfString1[122] = z(z("h\004(\rtk\004"));
    arrayOfString1[123] = z(z("~\002>\027kv\0253"));
    arrayOfString1[124] = z(z("~\021:Q~m\004+\nx"));
    arrayOfString1[125] = z(z("0,/\032t~N\035\037qs\021+\016xm"));
    arrayOfString1[126] = z(z("~\021:Qrq\0028\033|k\004j\030|v\r/\032=k\016j\031xkA$\021iv\0073!kv\0038\037iz"));
    arrayOfString1[127] = z(z("m\004&"));
    arrayOfString1[''] = z(z("~\021:Q~m\004+\nx0\b.Qsp\017/"));
    arrayOfString1[''] = z(z("q\004/\032By\b2!pl\006\025\f|h>.\037i~"));
    arrayOfString1[''] = z(z("y\016&\032xm>8\033s~\f#\020z0\b'\037zz\022"));
    arrayOfString1[''] = z(z("y\016&\032xm>8\033s~\f#\020z0\026+\022qo��:\033o"));
    arrayOfString1[''] = z(z("~\021:Q~m\004+\nx0\022/\nn|\023/\033ss\016)\025x{N/\fop\023j"));
    arrayOfString1[''] = z(z("o\t%\020x"));
    arrayOfString1[''] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\031=OZ$\004!RY'"));
    arrayOfString1[''] = z(z("r\004.\027|0\024$\037k~\b&\037s\004j"));
    arrayOfString1[''] = z(z("p\r.^|j\005#\021=y\016&\032xmA.\033qz\025/\032"));
    arrayOfString1[''] = z(z("{\003\025\tov\025/"));
    arrayOfString1[''] = z(z("~\024.\027r"));
    arrayOfString1[''] = z(z("^-\013,P@\"\0067XQ5\025.TQ&\025*TR$\005+I"));
    arrayOfString1[''] = z(z("q\016>\027{f><\027m��>\033Bs\004$\031iw"));
    arrayOfString1[''] = z(z("x\023%\013m@\017%\nty\030\025\bt}\023+\nx@\r/\020zk\t"));
    arrayOfString1[''] = z(z("y\016&\032xm>8\033s~\f#\020z0\027#\032xp"));
    arrayOfString1[''] = z(z("{\004(\013z"));
    arrayOfString1[''] = z(z("~\021:Qrq\0028\033|k\004j\030|v\r/\032=k\016j\031xkA-\frj\021\025\020rk\b,\007Bi\b(\f|k\004"));
    arrayOfString1[''] = z(z("0,/\032t~N\034\027yz\016"));
    arrayOfString1[''] = z(z("~\021:Q|s\r)\021sk��)\nn0"));
    arrayOfString1[''] = z(z("~\021:Q~m\004+\nx0\b.Qxm\023%\f="));
    arrayOfString1[''] = z(z("q\016>\027{f><\027m��>\033"));
    arrayOfString1[''] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\b?IK$\030'B\\)\0130ZZ%"));
    arrayOfString1[''] = z(z("{\004<"));
    arrayOfString1[''] = z(z("k\0049\n"));
    arrayOfString1[''] = z(z("v\0179\n|s\r\025\020rq>'\037ot\004>!|o\0219"));
    arrayOfString1[''] = z(z("~\017.\frv\005d\027sk\004$\n3~\002>\027rqO\031=OZ$\004!RQ"));
    arrayOfString1[''] = z(z("~\024>\021yp\026$\022r~\005\025\027p~\006/\r"));
    arrayOfString1[''] = z(z("~\021:Qnz\0259\007s|\002%\013skN,\037ts\004."));
    arrayOfString1[''] = z(z("l\030$\035B|\016?\020i"));
    arrayOfString1[''] = z(z("~\021:Qnz\017.9xk1+\fiv\002#\016|q\0259D"));
    arrayOfString1[''] = z(z("~\021:Q~w\004)\025ty\023/\023ri��(\022x0\0048\frmA"));
    arrayOfString1[''] = z(z("~\021:Qyv\022:\022|f\022%\030ih��8\033xg\021#\fx{N$\021iv\007#\035|k\b%\020="));
    arrayOfString1[' '] = z(z("x\023%\013ml"));
    arrayOfString1['¡'] = z(z("w��$\032qz.$:tm\0253R=|��&\022=p\017\031\033s{&/\nZm\016?\016n"));
    arrayOfString1['¢'] = z(z("~\021:Qnz\0258\033zu\b.Q{~\b&\033y"));
    arrayOfString1['£'] = z(z("~\021:Qnz\017.?y{1+\fiv\002#\016|q\0259"));
    arrayOfString1['¤'] = z(z("~\021:Qnz\017.-xk18\021{v\r/.up\025%"));
    arrayOfString1['¥'] = z(z("q\004>\trm\ne\027sy\016"));
    arrayOfString1['¦'] = z(z("3A9\013k\030:\033'?"));
    arrayOfString1['§'] = z(z("q\004>\trm\ne\027sy\016e\013s~\027+\027q~\003&\033"));
    arrayOfString1['¨'] = z(z("3A>\007mz[j"));
    arrayOfString1['©'] = z(z("~\021:Qer\021:Qoz\002<Qu~\017.\022x@��<\037ts��(\022x?"));
    arrayOfString1['ª'] = z(z("~\021:Q{~\b&\033y0\022+\bx?\r%\031tq>,\037ts\004."));
    arrayOfString1['«'] = z(z("s\016-\027s@\007+\027qz\005"));
    arrayOfString1['¬'] = z(z("m\004-\027nk\023+\ntp\017\025\030|v\r?\fx@\023/\037np\017"));
    arrayOfString1['­'] = z(z("~\021:Qnz\025,\037ts\023/\037np\017e\030|v\r/\032"));
    arrayOfString1['®'] = z(z("~\021:Qnz\017.,xr\016<\033M~\023>\027~v\021+\020il"));
    arrayOfString1['¯'] = z(z("q\016>\027{f2/\fkv\002/;ek\004$\032x{Ag^hl\0048^sp\025#\030t|��>\027rq"));
    arrayOfString1['°'] = z(z("~\023"));
    arrayOfString1['±'] = z(z("w��9!u~\005\025\034||\n-\frj\017.!y~\025+!yv\022+\034qz\005"));
    arrayOfString1['²'] = z(z("~\021:Qnz\017.9xk&8\021ho18\021ml"));
    arrayOfString1['³'] = z(z("?\007#\022x@\r/\020zk\tp"));
    arrayOfString1['´'] = z(z("j\022/\f\\|\025#\021sY\0168\t|m\005\007\033nl��-\0332r\004.\027|@\005+\n|1\007#\022x?\b9^sj\r&"));
    arrayOfString1['µ'] = z(z("j\022/\f\\|\025#\021sY\0168\t|m\005\007\033nl��-\0332r\004.\027|@\005+\n|?\b9^sj\r&"));
    arrayOfString1['¶'] = z(z("j\022/\f\\|\025#\021sY\0168\t|m\005\007\033nl��-\0332r\004.\027|@\022#\004x%"));
    arrayOfString1['·'] = z(z("j\022/\f\\|\025#\021sY\0168\t|m\005\007\033nl��-\0332}��9\033++L.\033~p\005/Qxm\023%\f"));
    arrayOfString1['¸'] = z(z("s\016-\027sl>=\027iw>'\033nl��-\033n"));
    arrayOfString1['¹'] = z(z("~\021:Q|s��8\0232m\016>\037izL&\021zlN9\n|m\025j"));
    arrayOfString1['º'] = z(z("?\013#\032'"));
    arrayOfString1['»'] = z(z("~\021:Qnz\017.9xk18\021{v\r/.up\025%Vpz\0229\037zz>9\033oi\b)\033BQ.\036!oz��.\0074?\021\"\021ip>#\032'"));
    arrayOfString1['¼'] = z(z("?\0253\016x%"));
    arrayOfString1['½'] = z(z("~\021:Qnz\017.9xk18\021{v\r/.up\025%^mw\016>\021Bv\005p"));
    arrayOfString1['¾'] = z(z("\\��$Yi?\006/\n={\004<\027~z>#\032=y\023%\023=k\t/^mw\016$\0333"));
    arrayOfString1['¿'] = z(z("{\004<\027~zN'\033pp\0233^mm\016)\033nl\0049C"));
    arrayOfString1['À'] = z(z("?\t/\037qk\tw"));
    arrayOfString1['Á'] = z(z("?\021&\013zx\004.C"));
    arrayOfString1['Â'] = z(z("?\025%\n|s\\"));
    arrayOfString1['Ã'] = z(z("{\004<\027~zN(\037ik\0048\007=s\004<\033q\""));
    arrayOfString1['Ä'] = z(z("{\004<\027~zN:\fr|\0049\rxlN/\fop\023j"));
    arrayOfString1['Å'] = z(z("?\022\"\037oz\005\025\032tm\0253C"));
    arrayOfString1['Æ'] = z(z("{\004<\027~zN'\033pp\0233^mm\b<\037iz>.\027ok\030w"));
    arrayOfString1['Ç'] = z(z("{\004<\027~zN:\fr|\0049\rxlN$\021sz"));
    arrayOfString1['È'] = z(z("t#"));
    arrayOfString1['É'] = z(z("?\0219\r "));
    arrayOfString1['Ê'] = z(z("q\016>\027{f>:\021mj\021\025\023r{\004"));
    arrayOfString1['Ë'] = z(z("x\023%\013m@\017%\nty\030\025\016ro\024:"));
    arrayOfString1['Ì'] = z(z("2P"));
    arrayOfString1['Í'] = z(z("q\016>\027{f>:\021mj\021"));
    arrayOfString1['Î'] = z(z("x\023%\013m@\017%\nty\030\025\016ro\024:!pp\005/"));
    arrayOfString1['Ï'] = z(z("~\021:Qnz\017.9xk&8\021ho\022"));
    arrayOfString1['Ð'] = z(z("~\021:Qnz\017.2x~\027/9op\024:"));
    arrayOfString1['Ñ'] = z(z("~\021:Qnz\017.=qz��8:tm\0253"));
    arrayOfString1['Ò'] = z(z("|\002"));
    arrayOfString1['Ó'] = z(z("o\t"));
    arrayOfString1['Ô'] = z(z("m\004-\027nk\023+\ntp\017\025\ri~\025/"));
    arrayOfString1['Õ'] = z(z("~\021:Qnz\0258\033zi\0048\027{v\004.Q{~\b&\033y"));
    arrayOfString1['Ö'] = z(z("i\b.\033r0K"));
    arrayOfString1['×'] = z(z("5N`"));
    arrayOfString1['Ø'] = z(z("~\024.\027r0K"));
    arrayOfString1['Ù'] = z(z("v\f+\031x0K"));
    arrayOfString1['Ú'] = z(z("~\021:Qnz\025&\021zv\017)\021hq\025=\027iw\f9\031n0\007+\027qz\005"));
    arrayOfString1['Û'] = z(z("~\021:Qiz\023'\027s~\025/"));
    arrayOfString1['Ü'] = z(z("~\021:Qnz\017.\fxr\016<\033||\002%\013sk"));
    arrayOfString1['Ý'] = z(z("~\021:Q{~\b&\033y?\r%\031tq>,\037ts\004."));
    arrayOfString1['Þ'] = z(z("~\021:Qqp��.\022rx\b$\030|v\r/\0322q\016$\033"));
    arrayOfString1['ß'] = z(z("~\021:Qnz\0258\033zl\025+\nx0\007+\027qz\005"));
    arrayOfString1['à'] = z(z("~\021:Qqp\006:\fr|\0049\r2o\023%\035tq\007%^"));
    arrayOfString1['á'] = z(z("~\021:Qqp\006:\fr|\0049\r2z\0238\021o?"));
    arrayOfString1['â'] = z(z("~\021:Qnk\0168\033q~\022>\030hs\r9\007s|\025%\030ts\004e\033om\0168^"));
    arrayOfString1['ã'] = z(z("?\017%\n=y\016?\020y"));
    arrayOfString1['ä'] = z(z("~\021:Qer\021:Qoz\002<Qpz\0229\037zzN9\n|k\0249Qsp\025g\nxg\025"));
    arrayOfString1['å'] = z(z(".UzF(*T{L,-!9Pjw��>\r|o\021d\020xk"));
    arrayOfString1['æ'] = z(z("_\022d\013n"));
    arrayOfString1['ç'] = z(z("~\021:Qer\021:Qoz\002<Qpz\0229\037zzN9\n|k\0249QpzA"));
    arrayOfString1['è'] = z(z("~\021:Qer\021:Qoz\002<Qpz\0229\037zzN9\n|k\0249Qwv\005e"));
    arrayOfString1['é'] = z(z("_\022d\tu~\0259\037moO$\033i"));
    arrayOfString1['ê'] = z(z("~\021:Qer\021:Qoz\002<Qpz\0229\037zzA"));
    arrayOfString1['ë'] = z(z("?I"));
    arrayOfString1['ì'] = z(z("~\021:Q~w\004)\025mz\023'\027nl\b%\020n0\0048\frmA"));
    arrayOfString1['í'] = z(z("~\021:Qmz\023'\027nl\b%\020n0"));
    arrayOfString1['î'] = z(z("r\022-\rip\023/Py}"));
    arrayOfString1['ï'] = z(z("?\022/\n=h\\"));
    arrayOfString1['ð'] = z(z("~\021:Q~w\004)\025mz\023'\027nl\b%\020n0\017%\023xk\t%\032="));
    arrayOfString1['ñ'] = z(z("?\026w"));
    arrayOfString1['ò'] = z(z("\025kgS0\025"));
    arrayOfString1['ó'] = z(z("~\017.\frv\005d\031p"));
    arrayOfString1['ô'] = z(z("r\f9"));
    arrayOfString1['õ'] = z(z("r\0049\r|x\004e\f{|YxL"));
    arrayOfString1['ö'] = z(z("~\017.\frv\005d\027sk\004$\n3z\031>\f|12\036,X^,"));
    arrayOfString1['÷'] = z(z("~\021:Qm~\002!\037zz\005#\020iz\017>\r2p\027/\fov\005/"));
    arrayOfString1['ø'] = z(z("~\017.\frv\005d\027sk\004$\n3z\031>\f|1(\0047IV \006!TQ5\0170IL"));
    arrayOfString1['ù'] = z(z("^-\013,P@3\017.RM5\025-DQ\"\031"));
    arrayOfString1['ú'] = z(z("^-\013,P@ \t*TP/"));
    arrayOfString1['û'] = z(z("^-\013,P@3\005*\\K$\0252RX2"));
    arrayOfString1['ü'] = z(z("^-\013,P@,\017-N^&\017-B[#\025<\\\\*\037."));
    arrayOfString1['ý'] = z(z("|\0249\nrr>8\027sx\025%\020x"));
    arrayOfString1['þ'] = z(z("~\021:Qu~\017.\022x|\r%\035vh\023%\020z"));
    arrayOfString1['ÿ'] = z(z("r\004"));
    arrayOfString1[256] = z(z("~\021:Q~m\004+\nx0\023/\037y@\f/Qtp>/\fop\023"));
    arrayOfString1[257] = z(z("~\021:Q~m\004+\nx0\023/\037y@\f/Qnz\023#\037qv\033+\ntp\017\025\033om\0168"));
    arrayOfString1[258] = z(z("~\021:Qqp��.\023x"));
    arrayOfString1[259] = z(z("/QzN-/"));
    arrayOfString1[260] = z(z("x\023%\013m@\017%\nty\030\025\022tx\t>!~p\r%\f"));
    arrayOfString1[261] = z(z("x\023%\013m@\017%\nty\030\025\nrq\004"));
    arrayOfString1[262] = z(z("Y'\f8[Y"));
    arrayOfString1[263] = z(z("q\016>\027{f>8\027sx\025%\020x"));
    arrayOfString1[264] = z(z("q\016>\027{f>&\027zw\025\025\035rs\0168"));
    arrayOfString1[265] = z(z("~\021:Qho\005+\nx|\f+\020y{\f=\021ot\0048Qy}>#\020tk"));
    arrayOfString1[266] = z(z("~\021:Qnz\017.=oz��>\033Zm\016?\016^w��>"));
    arrayOfString1[267] = z(z("~\021:Qy}>#\020tkN,\021o|\004,\013qs\0223\020~"));
    arrayOfString1[268] = z(z("l\030$\035Bq\004/\032x{"));
    arrayOfString1[269] = z(z("~\021:Qy}>#\020tkN9\007s|>$\033x{\004.^"));
    arrayOfString1[270] = z(z("?\025%\020x\"\002%\020kz\0239\037iv\016$"));
    arrayOfString1[271] = z(z("?\002%\022rm\\$\013qs"));
    arrayOfString1[272] = z(z("~\021:Qoz\0078\033nw\022>\037ij\022(\037o0\0218\033kr\022-Qsj\r&^"));
    arrayOfString1[273] = z(z("~\017.\frv\005d\fxl\016?\f~z[eQ~p\fd\tu~\0259\037moNxO..QsG++X"));
    arrayOfString1[274] = z(z("?\022)\fxz\017\025\022r|\nw"));
    arrayOfString1[275] = z(z("o\016:\013mq\016>\027{v\002+\ntp\017e\034||\n-\frj\017."));
    arrayOfString1[276] = z(z("~\021:Qoz\0078\033nw\022>\037ij\022(\037o?\017/\t "));
    arrayOfString1[277] = z(z("?\f/\rn~\006/C"));
    arrayOfString1[278] = z(z("q\016>\027{f>&\027zw\025"));
    arrayOfString1[279] = z(z("?\r#\031uk\\"));
    arrayOfString1[280] = z(z("?\022%\013s{\\"));
    arrayOfString1[281] = z(z("?\002%\022rm\\"));
    arrayOfString1[282] = z(z("o\016:\013mq\016>\027{v\002+\ntp\017e\030rm\004-\frj\017."));
    arrayOfString1[283] = z(z("?\002%\013sk\\"));
    arrayOfString1[284] = z(z("x\023%\013m@\017%\nty\030\025\022tx\t>"));
    arrayOfString1[285] = z(z("~\021:Qsp\025#\030d"));
    arrayOfString1[286] = z(z("?\027#\034o~\025/C"));
    arrayOfString1[287] = z(z("h\b&\022=m\004:\033|kA$\021iv\007#\035|k\b%\0201?\017/\033y?\025\"\013p}"));
    arrayOfString1[288] = z(z("?\025%\020x\"\017%\nty\b)\037iv\016$"));
    arrayOfString1[289] = z(z("?\020?\027xk\\"));
    arrayOfString1[290] = z(z("{\005j3PRA3\007df"));
    arrayOfString1[291] = z(z("~\021:Qoz\0078\033nw\022>\037ij\022(\037o0\002?\fpl\006e\020hs\rj"));
    arrayOfString1[292] = z(z("q\016>\027{v\002+\ntp\017\025\035|q\002/\022B~\007>\033o@\023/\037y"));
    arrayOfString1[293] = z(z("?\002?\rip\f"));
    arrayOfString1[294] = z(z("t\0043\031h~\023."));
    arrayOfString1[295] = z(z("Q\004=^Y~\025/D="));
    arrayOfString1[296] = z(z("~\021:Q~m\004+\nx0\r%\031{v\r/Qxm\023%\f="));
    arrayOfString1[297] = z(z("?\n\b^5a"));
    arrayOfString1[298] = z(z("?\n\bQ|s\r%\035|k\004.^"));
    arrayOfString1[299] = z(z("{\004<\027~zN'\033pp\0233Qs~\025#\bx0\022#\004x?"));
    arrayOfString1[300] = z(z("?\n\b"));
    arrayOfString1[301] = z(z("{\004<\027~zN'\033pp\0233Qnf\022>\033p0��<\037ts��(\022x?"));
    arrayOfString1[302] = z(z("?,\bW"));
    arrayOfString1[303] = z(z("{\004<\027~zN'\033pp\0233Qy~\r<\027v0\022#\004x?"));
    arrayOfString1[304] = z(z("{\004<\027~zN'\033pp\0233Qp~\031j"));
    arrayOfString1[305] = z(z("6A&\021jR\004'\021of\\"));
    arrayOfString1[306] = z(z("{\004<\027~zN'\033pp\0233Q|i��#\022|}\r/^"));
    arrayOfString1[307] = z(z("?\n\bQ{m\004/^"));
    arrayOfString1[308] = z(z("~\021:Qnz\017.\027s~\002>\027kzN=\022"));
    arrayOfString1[309] = z(z("l\004$\032tq��)\nti\004"));
    arrayOfString1[310] = z(z("~\021:Qnz\025g\026|lL\"\037y2\003!\031s{L%\030{0\007+\027qz\005"));
    arrayOfString1[311] = z(z("~\021:Q|s��8\0232m\004:\021ok\0223\020~0\022>\037okA"));
    arrayOfString1[312] = z(z("g\f:\0162l\0048\bt|\004e\fx~\0053Qnz\017.^iw\024'\034=m\004;\013xl\0259D="));
    arrayOfString1[313] = z(z("x\023%\013ml>9\033oi\0048!mm\016:\rBs��9\nBm\004,\fxl\t\025\ntr\004"));
    arrayOfString1[314] = z(z("g\f:\0162l\0048\bt|\004e\fx~\0053Qzm\016?\016Bl\030$\035Bm\004;\013tm\004."));
    arrayOfString1[315] = z(z("g\f:\0162l\0048\bt|\004e\fx~\0053"));
    arrayOfString1[316] = z(z("~\021:Qyv\022:\022|f\002&\021~t\0268\021sxN$\021iv\007#\035|k\b%\020="));
    arrayOfString1[317] = z(z("Q\016>^~p\017$\033~k\004."));
    arrayOfString1[318] = z(z("l\0048\bxmA.\027n|\016$\020x|\025/\032"));
    arrayOfString1[319] = z(z("l\0048\bxmA)\021sq\004)\ntq\006"));
    arrayOfString1[320] = z(z("\\\016$\020x|\025#\020z"));
    arrayOfString1[321] = z(z("l\0048\bxmA)\021sq\004)\nx{"));
    arrayOfString1[322] = z(z("\\\016$\020x|\025/\032"));
    arrayOfString1[323] = z(z("l\0258\027sx\b."));
    arrayOfString1[324] = z(z("~\021:Qqp\006#\020{~\b&\033y0\021%\016ho"));
    arrayOfString1[325] = z(z("~\021:Qnz\025+\022q|\016$\n||\0259Q{~\b&\033y"));
    arrayOfString1[326] = z(z("l\t%\tB~\r&!~p\017>\037~k\022"));
    arrayOfString1[327] = z(z("g\f:\0162l\0048\bt|\004e\013s}\016?\020y"));
    arrayOfString1[328] = z(z("~\021:Qmm\016)\033nl\0049Qmm\016)\027sy\016j"));
    arrayOfString1[329] = z(z("~\021:Qmm\016)\035xl\022/\r2o\023%\035="));
    arrayOfString1[330] = z(z("~\021:Qmm\016)\033nl\0049Q|s\r:\fr|\022"));
    arrayOfString1[331] = z(z("~\021:Qmm\016)\033nl\0049Qmm\016)Qnz\r,^"));
    arrayOfString1[332] = z(z("~\021:Qtq\022>\037qs\004.^"));
    arrayOfString1[333] = z(z("~\021:Qtq\022>\037qs\004."));
    arrayOfString1[334] = z(z("~\021:Qer\021:Qoz\002<Qnk��>\013nz\0238\021o0\024$\026|q\005&\033y0\b.^"));
    arrayOfString1[335] = z(z("lO?\r"));
    arrayOfString1[336] = z(z("?\0048\frm\\"));
    arrayOfString1[337] = z(z("H\t+\nn^\021:"));
    arrayOfString1[338] = z(z("^\0223\020~O\r+\007xm"));
    xc = arrayOfString1;
    a = z(z("5K`^spA9\n|k\0249^75K"));
    b = false;
    c = new File(Environment.getExternalStorageDirectory(), xc[337]);
    e = new File(c, xc[101]);
    f = -1;
    g = -1;
    h = true;
    i = null;
    j = null;
    k = null;
    l = null;
    m = null;
    n = null;
    p = false;
    q = -1;
    r = false;
    s = 0;
    t = false;
    u = false;
    v = TimeZone.getDefault();
    E = z(z("x\023%\013m@\017%\nt|\004\n\nxr\021"));
    F = 0;
    G = false;
    H = null;
    I = 3;
    J = false;
    K = Uri.parse("");
    L = Integer.valueOf(-1);
    M = -1L;
    N = false;
    O = false;
    P = false;
    Q = null;
    R = false;
    S = new c5(60000L);
    T = new c5(60000L);
    U = new c5(60000L);
    V = new HashMap();
    ab = new mq();
    kb = false;
    nb = false;
    ob = false;
    rb = new p5(true);
    sb = 0;
    tb = false;
    ub = false;
    vb = false;
    wb = new HashMap();
    xb = new HashMap();
    yb = new Hashtable();
    Ab = new ArrayList();
    Bb = -1L;
    Cb = 0;
    Db = new wd();
    Eb = 200L;
    Fb = new pc();
    Gb = System.currentTimeMillis() - Eb;
    Ib = new qc();
    Jb = new rc();
    Kb = new sc();
    String[] arrayOfString2 = new String[5];
    arrayOfString2[0] = z(z("|\016'Poz\002\"\027q{O+\032k~\017)\033yk��9\025vv\r&\033o"));
    arrayOfString2[1] = z(z("|\016'P|m\023%\0203k��9\025P~\017+\031xm"));
    arrayOfString2[2] = z(z("|\016'P|{��%P|q\0058\021t{O+\np"));
    arrayOfString2[3] = z(z("|\016'Piq\bd*|l*#\022qz\023"));
    arrayOfString2[4] = z(z("r\016(\0273v\017,\021qv\007/Pi~\022!\023|q��-\033o"));
  }

  public App()
  {
    Thread.setDefaultUncaughtExceptionHandler(new uh(this));
    this.Qb = new StringBuffer();
    this.Rb = xc['ú'];
    this.Sb = xc['û'];
    this.Tb = xc['ü'];
    this.Ub = xc['ù'];
    this.Wb = new App.13(this);
    this.Xb = new App.14(this);
    this.Yb = new App.15(this);
    this.Zb = new App.16(this);
    this.ac = new App.17(this);
    this.bc = new App.18(this);
    this.cc = new App.19(this);
    this.dc = new App.20(this);
    this.ec = new App.21(this);
    this.fc = new App.22(this);
    this.gc = new App.23(this);
    this.hc = new wh(this);
  }

  static boolean Ab()
  {
    return E();
  }

  public static void B()
  {
    boolean bool = DialogToastListActivity.f;
    if ((bb != null) && (w.g()))
    {
      xp.b();
      C();
      if (!bool);
    }
    else if (bb != null)
    {
      g5.b(xc[265]);
      xp.a();
      if (!bool);
    }
    else
    {
      xp.b();
    }
  }

  static void Bb()
  {
    D();
  }

  private static void C()
  {
    String str = Mb.getString(2131296258);
    if (str != null)
    {
      SharedPreferences localSharedPreferences = Mb.getSharedPreferences(str, 0);
      if (localSharedPreferences != null)
      {
        int i1 = localSharedPreferences.getInt(xc[268], 0);
        g5.b(xc[269] + i1);
        if (i1 == 1)
        {
          g5.b(xc[267]);
          D();
          if (!DialogToastListActivity.f);
        }
        else
        {
          j8 localj8 = new j8();
          localj8.setPriority(1);
          localj8.start();
        }
      }
    }
  }

  static int Cb()
  {
    return I;
  }

  private static void D()
  {
    Thread localThread = new Thread(new xh());
    localThread.setPriority(1);
    localThread.start();
  }

  static void Db()
  {
    pb();
  }

  private static boolean E()
  {
    int i1 = 1;
    if ((N) && (u) && (!lb) && (!mb) && ((Pb == i1) || (Pb == 2) || (Nb >= 20)));
    while (true)
    {
      return i1;
      int i2 = 0;
    }
  }

  static void Eb()
  {
    Z();
  }

  private void F()
  {
    int i1 = 0;
    boolean bool = DialogToastListActivity.f;
    try
    {
      File[] arrayOfFile = new File[4];
      arrayOfFile[0] = Mb.getFilesDir().getParentFile();
      arrayOfFile[1] = Mb.getFilesDir();
      arrayOfFile[2] = new File(Mb.getFilesDir(), xc[89]);
      arrayOfFile[3] = getDatabasePath(xc['î']).getParentFile();
      int i2 = arrayOfFile.length;
      do
      {
        if (i1 >= i2)
          break;
        File localFile = arrayOfFile[i1];
        g5.b(xc['í'] + localFile.getName() + xc['ñ'] + localFile.canWrite());
        if ((!localFile.canWrite()) && (Build.VERSION.SDK_INT >= 9))
          g5.b(xc['í'] + localFile.getName() + xc['ï'] + localFile.setWritable(true, true));
        i1++;
      }
      while (!bool);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g5.b(xc['ì'] + localException.toString());
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      while (true)
        g5.b(xc['ð'] + localNoSuchMethodError.toString() + xc['ë'] + Build.VERSION.SDK_INT + ")");
    }
  }

  static void Fb()
  {
    X();
  }

  static void Gb()
  {
    Y();
  }

  private void H()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(xc[4]);
    Date localDate = new Date();
    try
    {
      o = localSimpleDateFormat.parse(getApplicationContext().getString(2131296262));
      if (localDate.after(o))
        p = true;
      return;
    }
    catch (ParseException localParseException)
    {
      while (true)
      {
        p = false;
        localDate.setYear(9999);
        o = localDate;
      }
    }
  }

  static void Hb()
  {
    cb();
  }

  static void Ib()
  {
    db();
  }

  public static boolean J()
  {
    if (p);
    for (boolean bool = true; ; bool = p)
    {
      return bool;
      p = new Date().after(o);
    }
  }

  static void Jb()
  {
    eb();
  }

  public static boolean K()
  {
    q = eg.a(Mb);
    if (q > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static void Kb()
  {
    fb();
  }

  static void Lb()
  {
    gb();
  }

  static void Mb()
  {
    W();
  }

  private void Q()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(13, 15);
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(Vb), 0);
    ((AlarmManager)getSystemService(xc[5])).set(0, localCalendar.getTimeInMillis(), localPendingIntent);
  }

  private void R()
  {
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(Vb), 536870912);
    if (localPendingIntent != null)
      ((AlarmManager)getSystemService(xc[5])).cancel(localPendingIntent);
  }

  public static void S()
  {
    new s().execute(new Void[0]);
  }

  public static void T()
  {
    SetStatus localSetStatus = SetStatus.f();
    if (localSetStatus != null)
      localSetStatus.a();
  }

  public static void U()
  {
    DeleteAccountConfirmation.a();
  }

  public static void V()
  {
    yb.clear();
    Bb = System.currentTimeMillis();
  }

  private static void W()
  {
    g5.b(xc[327]);
    qc = false;
    pc = false;
  }

  private static void X()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(xc[315]);
    qc = true;
    if (eu.h)
    {
      g5.b(xc[314]);
      eu.f = true;
      c(true);
    }
    if (86400000L + Mb.getSharedPreferences(Mb.getString(2131296258), 0).getLong(xc[313], 0L) < System.currentTimeMillis())
      t();
    synchronized (V)
    {
      g5.b(xc[312] + V.size());
      Iterator localIterator = V.values().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        Message localMessage = (Message)localIterator.next();
        h.a(rc, localMessage);
      }
      while (!bool);
      V.clear();
      return;
    }
  }

  private static void Y()
  {
    qb = true;
    sb = 1 + sb;
    l();
  }

  private static void Z()
  {
    if ((Conversation.a()) && (!Conversation.b().isFinishing()))
      Conversation.b().showDialog(110);
    while (true)
    {
      return;
      if ((Conversations.a()) && (jb() == Conversations.b()))
      {
        Conversations.b().f();
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.b(xc[324]);
        Intent localIntent = new Intent(Mb.getApplicationContext(), OverlayAlert.class);
        localIntent.putExtra(xc[323], 2131296413);
        localIntent.setFlags(268697600);
        Mb.startActivity(localIntent);
      }
    }
  }

  private static int a(SharedPreferences paramSharedPreferences, boolean paramBoolean)
  {
    int i1 = 1;
    String str2;
    if (paramBoolean)
      str2 = paramSharedPreferences.getString(xc['Î'], xc['Ì']);
    try
    {
      int i4 = Integer.parseInt(str2);
      i2 = i4;
      if (i2 == -1)
      {
        if (paramSharedPreferences.getBoolean(xc['Ë'], false))
        {
          i2 = i1;
          SharedPreferences.Editor localEditor2 = paramSharedPreferences.edit();
          localEditor2.putString(xc['Î'], Integer.toString(i2));
          localEditor2.commit();
        }
      }
      else if (DialogToastListActivity.f)
        str1 = paramSharedPreferences.getString(xc['Ê'], xc['Ì']);
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      try
      {
        while (true)
        {
          String str1;
          int i3 = Integer.parseInt(str1);
          i2 = i3;
          if (i2 == -1)
          {
            if (!paramSharedPreferences.getBoolean(xc['Í'], false))
              break;
            SharedPreferences.Editor localEditor1 = paramSharedPreferences.edit();
            localEditor1.putString(xc['Ê'], Integer.toString(i1));
            localEditor1.commit();
            i2 = i1;
          }
          return i2;
          localNumberFormatException2 = localNumberFormatException2;
          i2 = 0;
        }
        i2 = 0;
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        while (true)
        {
          int i2 = 0;
          continue;
          i1 = 0;
        }
      }
    }
  }

  static Intent a(PackageManager paramPackageManager, String paramString1, String paramString2, String paramString3, Uri paramUri)
  {
    boolean bool = DialogToastListActivity.f;
    HashSet localHashSet = new HashSet();
    Intent localIntent1 = new Intent(xc[55]);
    localIntent1.setType(xc['õ']);
    List localList1 = paramPackageManager.queryIntentActivities(localIntent1, 0);
    int i1 = localList1.size();
    int i8;
    for (int i2 = 0; ; i2 = i8)
      if (i2 < i1)
      {
        localHashSet.add(((ResolveInfo)localList1.get(i2)).activityInfo.name);
        i8 = i2 + 1;
        if (!bool);
      }
      else
      {
        Object localObject1 = new Intent(xc[55]);
        ((Intent)localObject1).setType(paramString3);
        List localList2 = paramPackageManager.queryIntentActivities((Intent)localObject1, 0);
        int i3 = localList2.size();
        ArrayList localArrayList = new ArrayList();
        Object localObject2 = null;
        int i4 = 0;
        while (true)
        {
          Object localObject3;
          Object localObject4;
          int i7;
          if (i4 < i3)
          {
            ResolveInfo localResolveInfo = (ResolveInfo)localList2.get(i4);
            if (!localResolveInfo.activityInfo.name.contains(xc['ô']))
            {
              ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
              g5.b(localActivityInfo.applicationInfo.packageName + xc[45] + localActivityInfo.name);
              if (!localHashSet.contains(localActivityInfo.name))
              {
                ComponentName localComponentName = new ComponentName(localActivityInfo.applicationInfo.packageName, localActivityInfo.name);
                localObject1 = new Intent(xc[55]);
                ((Intent)localObject1).setType(paramString3);
                ((Intent)localObject1).setComponent(localComponentName);
                if ((localResolveInfo.activityInfo.packageName.contains(xc['ó'])) && (!bool))
                  break label708;
                ((Intent)localObject1).putExtra(xc[39], paramString1);
                ((Intent)localObject1).putExtra(xc[44], paramString1);
                ((Intent)localObject1).putExtra(xc[32], paramString2);
                ((Intent)localObject1).putExtra(xc['ö'], paramUri);
                localArrayList.add(localObject1);
              }
              if (localResolveInfo.activityInfo.name.equals(xc[63]))
              {
                localObject3 = localObject1;
                localObject4 = localObject1;
                i7 = i4 + 1;
                if (!bool)
                  break label726;
              }
            }
          }
          while (true)
          {
            String str1 = Build.MANUFACTURER.replace(' ', '_');
            String str2 = Build.MODEL.replace(' ', '_');
            String str3 = str1 + "-" + str2;
            g5.b(xc[46] + str3);
            if (str3.equals(xc[26]))
            {
              g5.b(xc['÷']);
              return localObject3;
            }
            Parcelable[] arrayOfParcelable = new Parcelable[localArrayList.size()];
            int i6;
            for (int i5 = 0; ; i5 = i6)
              if (i5 < arrayOfParcelable.length)
              {
                arrayOfParcelable[i5] = ((Parcelable)localArrayList.get(i5));
                i6 = i5 + 1;
                if (!bool);
              }
              else
              {
                Intent localIntent2 = new Intent(xc[55]);
                localIntent2.setType(xc['õ']);
                localIntent2.putExtra(xc[39], paramString1);
                localIntent2.putExtra(xc[32], paramString2);
                localIntent2.putExtra(xc['ö'], paramUri);
                localObject3 = Intent.createChooser(localIntent2, null);
                ((Intent)localObject3).putExtra(xc['ø'], arrayOfParcelable);
                break;
              }
            localObject3 = localObject2;
            localObject4 = localObject1;
            break;
            label708: localObject3 = localObject2;
            localObject4 = localObject1;
            break;
            localObject3 = localObject2;
          }
          label726: i4 = i7;
          localObject1 = localObject4;
          localObject2 = localObject3;
        }
      }
  }

  public static File a(sz paramsz)
  {
    String str = paramsz.p;
    if (str == null)
      if (paramsz.j != null)
      {
        str = new File(paramsz.j).getName();
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.d(xc[23]);
      }
    for (File localFile = null; ; localFile = a(str, paramsz.l))
      return localFile;
  }

  public static File a(String paramString, byte paramByte)
  {
    File localFile = new File(c, et.a(paramByte));
    int i1 = 0;
    if (localFile.exists())
      if (localFile.isFile())
      {
        localFile.delete();
        if (!DialogToastListActivity.f);
      }
      else if (localFile.isDirectory())
      {
        i1 = 1;
      }
    if (i1 == 0)
      localFile.mkdir();
    return new File(localFile, paramString);
  }

  private static String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = Mb.getResources().getString(2131296540);
    case 2:
    case 3:
    case 1:
    }
    while (true)
    {
      return str;
      str = Mb.getResources().getString(2131296536);
      continue;
      str = Mb.getResources().getString(2131296538);
      continue;
      str = Mb.getResources().getString(2131296537);
    }
  }

  private static String a(SharedPreferences paramSharedPreferences, zq paramzq)
  {
    if ((paramSharedPreferences.getBoolean(xc['ý'], false)) && (paramzq != null) && (paramzq.g != null));
    for (String str = paramzq.n(); ; str = null)
      return str;
  }

  public static void a(int paramInt, long paramLong)
  {
    eg.a(1000L * paramLong);
    eg.a(paramInt);
    eg.c(paramInt);
  }

  static void a(long paramLong)
  {
    g5.b(xc['¯']);
    eg.d = true;
    a(true, false);
  }

  public static void a(Activity paramActivity)
  {
    boolean bool = DialogToastListActivity.f;
    int i1 = gp.a.size();
    int i2 = 0;
    int i3 = 0;
    int i4;
    label63: int i5;
    if (i2 < i1)
    {
      zq localzq = gp.a((String)gp.a.get(i2));
      if (!localzq.b.contains(E))
      {
        a(localzq, paramActivity);
        if (!bool);
      }
      else
      {
        i4 = 1;
        i5 = i2 + 1;
        if (!bool);
      }
    }
    while (true)
    {
      z.o();
      paramActivity.runOnUiThread(new ph());
      if (i4 != 0)
        eu.a();
      return;
      i2 = i5;
      i3 = i4;
      break;
      i4 = i3;
      break label63;
      i4 = i3;
    }
  }

  static void a(Activity paramActivity, lr paramlr)
  {
    boolean bool = DialogToastListActivity.f;
    PackageManager localPackageManager = paramActivity.getPackageManager();
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Intent localIntent1 = new Intent(xc[47]).setType(xc[34]).putExtra(xc[44], paramActivity.getString(2131296464));
    Intent localIntent2 = new Intent(xc[55]).setType(xc[27]).putExtra(xc[61], " ").putExtra(xc[32], paramActivity.getString(2131296463) + xc[28]).putExtra(xc[39], paramActivity.getString(2131296462));
    Intent[] arrayOfIntent = new Intent[2];
    arrayOfIntent[0] = localIntent1;
    arrayOfIntent[1] = localIntent2;
    int i1 = 0;
    Object localObject1 = null;
    Intent localIntent3;
    Iterator localIterator;
    if (i1 < arrayOfIntent.length)
    {
      localIntent3 = arrayOfIntent[i1];
      List localList = localPackageManager.queryIntentActivities(localIntent3, 0);
      if (localList != null)
        localIterator = localList.iterator();
    }
    label692: label747: label1011: for (Object localObject3 = localObject1; ; localObject3 = localObject1)
    {
      Intent localIntent4;
      while (true)
        if (localIterator.hasNext())
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
          ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
          String str4 = localActivityInfo.name;
          String str5 = localActivityInfo.applicationInfo.packageName;
          g5.b(xc[57] + i1 + xc[45] + str5 + xc[45] + str4);
          ComponentName localComponentName = new ComponentName(str5, str4);
          localIntent4 = ((Intent)localIntent3.clone()).setComponent(localComponentName);
          if ((!str5.contains(xc[31])) && (!str5.equals(xc[40])) && (!str5.equals(xc[59])) && (!str5.equals(xc[56])) && (!str5.equals(xc[53])) && (!str5.equals(xc[64])) && (!str5.equals(xc[30])) && (!str5.equals(xc[48])) && (!str5.equals(xc[35])) && (!str5.equals(xc[37])) && (!str5.equals(xc[62])) && (!str5.equals(xc[41])) && (!str5.equals(xc[42])))
            if ((!str5.equals(xc[43])) && (!str5.equals(xc[60])) && (!str5.equals(xc[58])) && (!str5.equals(xc[29])) && (!str5.equals(xc[33])) && (!str5.equals(xc[65])) && (!str5.equals(xc[49])) && (!str5.equals(xc[51])) && (!str5.equals(xc[50])))
            {
              if (str5.equals(xc[36]))
                localIntent4.putExtra(xc[32], xc[52]);
              if (localHashSet.contains(str5))
                break label997;
              localArrayList.add(new Pair(localResolveInfo, localIntent4));
              localHashSet.add(str5);
              if (!str4.equals(xc[63]))
                break label997;
              localObject1 = localIntent4;
              if (!bool)
                break label1011;
            }
        }
      for (Object localObject2 = localObject1; ; localObject2 = localObject3)
      {
        int i2 = i1 + 1;
        if (bool)
          while (true)
          {
            if (localArrayList.size() == 0)
            {
              g5.c(xc[38]);
              paramlr.a(2131296992);
              if (!bool);
            }
            else
            {
              String str1 = Build.MANUFACTURER.replace(' ', '_');
              String str2 = Build.MODEL.replace(' ', '_');
              String str3 = str1 + "-" + str2;
              g5.b(xc[46] + str3);
              if (str3.equals(xc[26]))
              {
                if (localObject2 == null)
                {
                  g5.c(xc[38]);
                  paramlr.a(2131296992);
                  if (!bool);
                }
                else
                {
                  g5.b(xc[54]);
                  paramActivity.startActivity(localObject2);
                  if (!bool);
                }
              }
              else
                new a(paramActivity, 2131296501, localArrayList).show();
            }
            return;
            localIntent4.putExtra(xc[32], paramActivity.getString(2131296464));
            if (!bool)
              break label692;
            break;
            localObject2 = localObject1;
          }
        i1 = i2;
        localObject1 = localObject2;
        break;
        localObject1 = localObject3;
        break label747;
      }
    }
  }

  public static void a(Activity paramActivity, sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    MediaData localMediaData = (MediaData)paramsz.t;
    localMediaData.file = a(paramsz);
    try
    {
      localMediaData.downloader = new ob(paramsz, paramActivity);
      ob localob = localMediaData.downloader;
      OutputStream[] arrayOfOutputStream = new OutputStream[1];
      arrayOfOutputStream[0] = new pf(B, localMediaData.file);
      localob.execute(arrayOfOutputStream);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.b(xc[9], localIOException);
        String str = Environment.getExternalStorageState();
        if (str.equals(xc[8]))
        {
          if (!paramActivity.isFinishing())
          {
            paramActivity.showDialog(104);
            if (!bool);
          }
        }
        else if (!str.equals(xc[7]))
        {
          if (!paramActivity.isFinishing())
          {
            paramActivity.showDialog(103);
            if (!bool);
          }
        }
        else
          g5.d(xc[10]);
      }
    }
  }

  public static void a(Activity paramActivity, boolean paramBoolean, String paramString)
  {
    if (qc)
    {
      Hashtable localHashtable = new Hashtable(yb);
      if (paramBoolean)
      {
        localHashtable.put(paramString, paramString);
        if (!DialogToastListActivity.f);
      }
      else
      {
        localHashtable.remove(paramString);
      }
      h.a(rc, com.whatsapp.messaging.s.a(new j2(paramActivity, paramString, 3, localHashtable, paramBoolean)));
    }
  }

  public static void a(Context paramContext, int paramInt)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putInt(xc['Ô'], paramInt);
    if (!localEditor.commit())
      g5.d(xc['ß']);
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2)
  {
    Toast localToast = Toast.makeText(paramContext, paramContext.getString(paramInt1), paramInt2);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }

  public static void a(Context paramContext, sz paramsz)
  {
    new mb(paramContext, paramsz, null).execute(new Void[0]);
  }

  public static void a(Context paramContext, File paramFile, int paramInt)
  {
    PackageManager localPackageManager = Mb.getPackageManager();
    App localApp = Mb;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = b(Mb);
    arrayOfObject[1] = a(paramInt);
    paramContext.startActivity(a(localPackageManager, localApp.getString(2131296534, arrayOfObject), xc['ò'] + Mb.getString(2131296535), b(paramInt), Uri.fromFile(paramFile)));
  }

  public static void a(Context paramContext, String paramString)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putString(xc[80], paramString);
    if (!localEditor.commit())
      g5.d(xc[81]);
  }

  public static void a(Context paramContext, String paramString, int paramInt)
  {
    Toast localToast = Toast.makeText(paramContext, paramString, paramInt);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }

  public static void a(Context paramContext, String paramString, Location paramLocation)
  {
    a(paramContext, paramString, paramLocation, mb.h);
  }

  public static void a(Context paramContext, String paramString, Location paramLocation, int paramInt)
  {
    sz localsz = new sz(gp.a(paramString).b, (byte[])null, new MediaData());
    localsz.h = 1;
    localsz.l = 5;
    if (paramLocation != null)
    {
      localsz.q = paramLocation.getLatitude();
      localsz.r = paramLocation.getLongitude();
    }
    z.a(localsz, 2);
    mb localmb = new mb(paramContext, localsz, null);
    localmb.e = paramInt;
    localmb.execute(new Void[0]);
  }

  public static void a(Context paramContext, String paramString, fy paramfy)
  {
    sz localsz = new sz(gp.a(paramString).b, (byte[])null, new MediaData());
    localsz.h = 1;
    localsz.l = 5;
    localsz.q = paramfy.e;
    localsz.r = paramfy.f;
    localsz.j = paramfy.g;
    localsz.p = paramfy.a;
    if (paramfy.i != null)
      localsz.p = (localsz.p + "\n" + paramfy.i);
    z.a(localsz, 2);
    new nb(paramContext, localsz, null, paramfy).execute(new Void[0]);
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putInt(xc['Ô'], 2);
    localEditor.putString(xc['Ò'], paramString1);
    localEditor.putString(xc['Ó'], paramString2);
    if (!localEditor.commit())
      g5.d(xc['Õ']);
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putBoolean(xc[326], paramBoolean);
    if (!localEditor.commit())
      g5.d(xc[325]);
  }

  public static void a(Uri paramUri)
  {
    if (paramUri.compareTo(K) == 0);
    while (true)
    {
      return;
      Fb.removeMessages(99);
      Fb.sendEmptyMessageDelayed(99, 10000L);
      oc.stop();
      if (A)
      {
        AudioManager localAudioManager = (AudioManager)Mb.getSystemService(xc['']);
        if ((localAudioManager == null) || (localAudioManager.getStreamVolume(5) > 0))
          oc.play(Mb.getApplicationContext(), paramUri, false, 3);
        if (!DialogToastListActivity.f);
      }
      else
      {
        oc.play(Mb.getApplicationContext(), paramUri, false, 5);
      }
    }
  }

  private static void a(Message paramMessage)
  {
    com.whatsapp.messaging.s.a(nc, paramMessage);
  }

  private static void a(Messenger paramMessenger)
  {
    rc = paramMessenger;
    pc = true;
    h.a(paramMessenger, bb.jabber_id, cb, sc);
  }

  static void a(TextView paramTextView)
  {
    zb = paramTextView;
    if (paramTextView != null)
      l();
  }

  private static void a(cg paramcg)
  {
    if (paramcg.a == 0)
    {
      a(true);
      Z();
      if (!DialogToastListActivity.f);
    }
    else
    {
      eg.c = true;
      eg.a(1000L * paramcg.b);
    }
  }

  public static void a(gz paramgz)
  {
    a(new bi(w.a(paramgz.a, null), paramgz));
  }

  public static void a(hz paramhz)
  {
    if ((qc) && (o()) && (q()))
    {
      g5.c(xc['¤']);
      h.a(rc, com.whatsapp.messaging.s.a(paramhz));
    }
  }

  public static void a(ju paramju)
  {
    if (qc)
    {
      g5.c(xc[266]);
      h.a(rc, com.whatsapp.messaging.s.a(paramju));
    }
  }

  public static void a(lr paramlr)
  {
    Q = paramlr;
  }

  public static void a(lr paramlr, String paramString)
  {
    if (paramlr != null)
    {
      paramlr.c(paramString);
      if (!DialogToastListActivity.f);
    }
    else
    {
      b(Mb.getApplicationContext(), paramString, 0);
    }
  }

  public static void a(qw paramqw)
  {
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.a(paramqw));
  }

  public static void a(sz paramsz, zq paramzq)
  {
    boolean bool = DialogToastListActivity.f;
    MediaData localMediaData;
    if (paramsz.t != null)
    {
      localMediaData = new MediaData((MediaData)paramsz.t);
      if (paramsz.l == 5)
        localMediaData.transferred = true;
    }
    while (true)
    {
      sz localsz = new sz(paramzq.b, paramsz.c(), localMediaData);
      if ((paramsz.l == 2) || (paramsz.l == 1) || (paramsz.l == 3))
      {
        if (ob.b(paramsz.j))
        {
          localsz.a = 1;
          if (!bool);
        }
        else
        {
          localsz.a = 2;
          if (!bool);
        }
      }
      else
        localsz.a = 0;
      localsz.h = paramsz.h;
      localsz.j = paramsz.j;
      localsz.l = paramsz.l;
      localsz.k = paramsz.k;
      localsz.m = paramsz.m;
      localsz.p = paramsz.p;
      localsz.n = paramsz.n;
      localsz.q = paramsz.q;
      localsz.r = paramsz.r;
      if (((localsz.l != 1) && (localsz.l != 3) && (localsz.l != 5)) || (localsz.h != 0) || (localsz.b() != null));
      try
      {
        localsz.a(wb.a(localsz.b()));
        localsz.h = 1;
        if ((paramsz.l == 2) || (paramsz.l == 1) || (paramsz.l == 3))
        {
          if (localsz.a == 2)
          {
            z.a(localsz);
            if (!bool);
          }
          else
          {
            if (localMediaData == null)
            {
              g5.d(xc['µ']);
              b(Mb, Mb.getString(2131296515), 1);
            }
            if (localMediaData.file == null)
            {
              g5.d(xc['´']);
              b(Mb, Mb.getString(2131296515), 1);
              if (!bool);
            }
            else if (localsz.m != localMediaData.file.length())
            {
              g5.c(xc['¶'] + localsz.m + xc['³'] + localMediaData.file.length());
              b(Mb, Mb.getString(2131296515), 1);
              if (!bool);
            }
            else
            {
              z.a(localsz, 1);
              localMediaData.uploader = new pb(localsz, true, null);
              localMediaData.uploader.a();
              if (!bool);
            }
          }
        }
        else
          z.a(localsz);
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        while (true)
        {
          localsz.a((byte[])null);
          g5.b(xc['·'], localArrayIndexOutOfBoundsException);
        }
      }
      catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException)
      {
        while (true)
        {
          localsz.a((byte[])null);
          g5.b(xc['·'], localStringIndexOutOfBoundsException);
        }
      }
      localMediaData = null;
    }
  }

  static void a(uk paramuk)
  {
    if (!Ab.contains(paramuk))
      Ab.add(paramuk);
  }

  public static void a(uz paramuz, int paramInt)
  {
    z.a(paramuz, paramInt);
    if ((paramInt == 4) && (Conversation.a()) && (!u) && (Conversation.b().p.equals(paramuz.a)) && (Conversation.s))
      a(Uri.parse(xc[0]));
  }

  public static void a(vw paramvw)
  {
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.a(paramvw));
  }

  public static void a(zq paramzq)
  {
    if ((!y.d(paramzq.b)) && (!paramzq.o()) && (!paramzq.b.equals(xc[87])) && (qc))
    {
      h.a(rc, com.whatsapp.messaging.s.j(paramzq.b));
      h.a(rc, com.whatsapp.messaging.s.i(paramzq.b));
      y.c(paramzq.b, true);
    }
  }

  public static void a(zq paramzq, Activity paramActivity)
  {
    if (paramzq.a > 0)
    {
      paramzq.a = 0;
      w.d(paramzq, null);
      paramActivity.runOnUiThread(new yh(paramzq));
    }
  }

  public static void a(zq paramzq, String paramString)
  {
    sz localsz = new sz(paramzq.b, paramString, null);
    z.a(localsz);
  }

  public static void a(zq paramzq, boolean paramBoolean)
  {
    if ((paramzq.a > 0) || (paramBoolean))
    {
      paramzq.a = 0;
      w.d(paramzq, null);
      if (Conversations.a())
        Conversations.b().d(paramzq.b);
    }
  }

  public static void a(Runnable paramRunnable)
  {
    uc.post(paramRunnable);
  }

  public static void a(String paramString, int paramInt)
  {
    zq localzq = w.a(paramString, null);
    if ((localzq != null) && ((localzq.o != paramInt) || (localzq.p != paramInt)))
      if (paramInt == -1)
      {
        o(paramString);
        if (!DialogToastListActivity.f);
      }
      else
      {
        a(new di(localzq, paramInt));
      }
  }

  public static void a(String paramString, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    if ((o()) && (q()))
    {
      int i2 = 0;
      if (((paramInt2 & 0x1) != 0) && (T.a(paramString)))
        i2 = i1;
      if (((paramInt2 & 0x2) != 0) && (U.a(paramString)));
      while (i1 != 0)
      {
        if (qc)
        {
          g5.b(xc['½'] + paramInt1 + xc['¼'] + paramInt2 + xc['º'] + paramString);
          h.a(rc, com.whatsapp.messaging.s.a(paramString, paramInt1, paramInt2));
          if (!DialogToastListActivity.f)
            break;
        }
        g5.b(xc['»'] + paramInt1 + xc['¼'] + paramInt2 + xc['º'] + paramString);
        synchronized (V)
        {
          V.put(paramString, com.whatsapp.messaging.s.a(paramString, paramInt1, paramInt2));
        }
        i1 = i2;
      }
    }
  }

  public static void a(String paramString1, int paramInt, String paramString2)
  {
    if (!y.b(paramString1))
    {
      y.a(paramString1, System.currentTimeMillis() - 1000L * paramInt);
      f(paramString1);
    }
  }

  private static void a(String paramString, sz paramsz)
  {
    g5.b(paramString + paramsz.b.c + " " + bb.jabber_id + " " + paramsz.b.a + " " + paramsz.e);
  }

  public static void a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
      h.a(rc, com.whatsapp.messaging.s.e(new sz(new uz(paramString2, false, paramString1))));
  }

  public static void a(String paramString1, String paramString2, String paramString3)
  {
    sz localsz = new sz(gp.a(paramString1).b, paramString3, null);
    localsz.h = 0;
    localsz.l = 4;
    localsz.p = paramString2;
    z.a(localsz);
  }

  public static void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    boolean bool = DialogToastListActivity.f;
    zq localzq = w.a(paramString2, null);
    if ((paramString3 == null) || (!paramString3.startsWith(c())))
      a(paramString2, paramInt1);
    sz localsz1;
    if (localzq.o())
    {
      if (paramString1 != null)
      {
        localsz1 = new sz(new uz(paramString2, true, paramString1));
        localsz1.e = true;
        if (!bool);
      }
      else
      {
        localsz1 = new sz(paramString2, (byte[])null, null);
      }
      if (paramInt1 != -1)
        break label233;
    }
    label233: for (String str = (String)null; ; str = Integer.toString(paramInt1))
    {
      localsz1.b(str);
      localsz1.a = 6;
      localsz1.m = 6L;
      localsz1.c = paramString3;
      localsz1.i = (1000L * paramInt2);
      sz localsz2 = z.j(paramString2);
      if ((localsz2 == null) || (localsz2.a != 6) || (localsz2.m != 6L) || (!paramString3.equals(localsz2.c)) || (localsz1.a() != localsz2.a()))
      {
        z.a(localsz1);
        if (!bool);
      }
      else
      {
        a(paramString1, paramString2);
      }
      if (bool)
        a(paramString1, paramString2);
      return;
    }
  }

  public static void a(String paramString, boolean paramBoolean)
  {
    Handler localHandler = Kb;
    if (paramBoolean);
    for (int i1 = 1; ; i1 = 0)
    {
      localHandler.obtainMessage(0, i1, 0, paramString).sendToTarget();
      return;
    }
  }

  public static void a(String paramString, byte[] paramArrayOfByte, MediaData paramMediaData, byte paramByte)
  {
    sz localsz = new sz(gp.a(paramString).b, paramArrayOfByte, paramMediaData);
    localsz.h = 1;
    localsz.l = paramByte;
    localsz.p = paramMediaData.file.getName();
    localsz.m = paramMediaData.file.length();
    localsz.a = 1;
    z.a(localsz, 1);
    paramMediaData.uploader = new pb(localsz, false, null);
    paramMediaData.uploader.a();
  }

  public static void a(Hashtable paramHashtable)
  {
    if (paramHashtable.containsKey(xc[' ']))
    {
      g5.b(xc['¡']);
      synchronized (x)
      {
        eu.h = true;
        if ((!eu.j) && (!eu.i))
        {
          eu.i = true;
          eu.a(0);
        }
      }
    }
  }

  public static void a(List<ActivityManager.RunningAppProcessInfo> paramList)
  {
    boolean bool = DialogToastListActivity.f;
    int i1;
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo2;
    String str1;
    label211: StringBuilder localStringBuilder2;
    if (paramList != null)
    {
      g5.b(xc[329] + Process.myPid() + " " + paramList.size());
      Iterator localIterator1 = paramList.iterator();
      i1 = 0;
      if (localIterator1.hasNext())
      {
        localRunningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo)localIterator1.next();
        if ((localRunningAppProcessInfo2.processName != null) && (localRunningAppProcessInfo2.processName.startsWith(xc[41])))
        {
          g5.b(xc[328] + localRunningAppProcessInfo2.processName + " " + localRunningAppProcessInfo2.pid + " " + localRunningAppProcessInfo2.importance);
          i1++;
        }
        if (localRunningAppProcessInfo2.pid == Process.myPid())
        {
          StringBuilder localStringBuilder1 = new StringBuilder().append(xc[331]);
          if (localRunningAppProcessInfo2.processName != null)
            break label390;
          str1 = "?";
          localStringBuilder2 = localStringBuilder1.append(str1).append(" ").append(localRunningAppProcessInfo2.importance).append(" ").append(localRunningAppProcessInfo2.importanceReasonCode).append(" ");
          if (localRunningAppProcessInfo2.importanceReasonComponent != null)
            break label400;
        }
      }
    }
    label390: label400: for (String str2 = "?"; ; str2 = localRunningAppProcessInfo2.importanceReasonComponent.flattenToString())
    {
      g5.b(str2);
      if (!bool)
        break;
      if (i1 == 0)
      {
        g5.c(xc[330]);
        if (paramList != null)
        {
          Iterator localIterator2 = paramList.iterator();
          do
          {
            if (!localIterator2.hasNext())
              break;
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo1 = (ActivityManager.RunningAppProcessInfo)localIterator2.next();
            if (localRunningAppProcessInfo1.processName != null)
              g5.c(localRunningAppProcessInfo1.processName + xc['ë'] + localRunningAppProcessInfo1.pid + ")");
          }
          while (!bool);
        }
      }
      return;
      str1 = localRunningAppProcessInfo2.processName;
      break label211;
    }
  }

  public static void a(boolean paramBoolean)
  {
    if (G != paramBoolean)
    {
      G = paramBoolean;
      b();
    }
  }

  static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramBoolean1, paramBoolean2, R);
  }

  static void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool1 = DialogToastListActivity.f;
    Object localObject1 = null;
    Object localObject2 = null;
    StringBuilder localStringBuilder1 = new StringBuilder();
    String str1 = Mb.getString(2131296258);
    SharedPreferences localSharedPreferences = Mb.getSharedPreferences(str1, 0);
    String str16;
    int i1;
    int i2;
    label106: zq localzq;
    int i15;
    int i16;
    Object localObject7;
    label194: Object localObject6;
    label251: int i14;
    int i13;
    label352: int i4;
    int i3;
    label364: int i5;
    int i6;
    Object localObject3;
    Object localObject4;
    String str3;
    if (eg.d)
    {
      if (eg.e)
      {
        str16 = Mb.getString(2131296423);
        if (!bool1);
      }
      else
      {
        str16 = Mb.getString(2131296422);
        if (!bool1);
      }
    }
    else
    {
      if (b(localSharedPreferences));
      while (true)
      {
        return;
        Iterator localIterator = gp.a.iterator();
        i1 = 0;
        i2 = 0;
        if (!localIterator.hasNext())
          break label2371;
        String str15 = (String)localIterator.next();
        localzq = w.a(str15, null);
        if (localzq.a <= 0)
          break label2360;
        i15 = i1 + localzq.a;
        i16 = i2 + 1;
        if (localObject2 != null)
          break label2353;
        localObject2 = z.l(localzq.b);
        if (localObject2 == null)
          break label2346;
        if (!bool1)
          break label2331;
        localObject7 = localzq;
        g5.c(xc[272] + localzq.b + " " + localzq.a);
        if (!bool1)
          break label2393;
        localObject1 = localObject7;
        localObject6 = localObject2;
        localObject2 = z.l(localzq.b);
        if (localObject2 != null)
        {
          if (localObject6.i < ((sz)localObject2).i)
          {
            if (!bool1)
              break label2331;
            localObject6 = localObject2;
            localObject1 = localzq;
          }
        }
        else
          g5.c(xc[291] + localzq.b + " " + localzq.a);
        localObject2 = localObject6;
        i14 = i16;
        i13 = i15;
        if (!bool1)
          break label2382;
        i4 = i14;
        i3 = i13;
        if ((i4 != 0) && (localObject1 != null))
          break;
        gb.cancel(1);
      }
      String str2 = n5.a((sz)localObject2, localObject1);
      i5 = i3;
      i6 = i4;
      localObject3 = localObject1;
      localObject4 = localObject2;
      str3 = str2;
    }
    while (true)
    {
      if ((localObject3 != null) || (bool1));
      label905: label2191: for (int i7 = a(localSharedPreferences, localObject3.o()); ; i7 = 0)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        String str10;
        String str4;
        if (!eg.d)
          if (i6 == 1)
          {
            str10 = v4.b(localObject3.b());
            if (i5 == 1)
            {
              localStringBuilder2.append(v4.b(n5.a(localObject4, localObject3, false)));
              if (!bool1)
                break label791;
            }
            String str14 = Z.a(2131427332, i5);
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = Integer.valueOf(i5);
            localStringBuilder2.append(String.format(str14, arrayOfObject3));
            str4 = str10;
          }
        label791: label2205: label2249: 
        while (true)
        {
          tx localtx = tx.a(Mb);
          if (!paramBoolean1)
            break;
          if ((Build.VERSION.SDK_INT >= 11) && (localObject3 != null) && (!eg.d) && (i6 == 1))
          {
            int i11 = Mb.getResources().getDimensionPixelSize(17104901);
            int i12 = Mb.getResources().getDimensionPixelSize(17104902);
            SoftReference localSoftReference = (SoftReference)xb.get(localObject3.f());
            if ((localSoftReference != null) && (localSoftReference.get() != null))
            {
              localtx.a((Bitmap)localSoftReference.get());
              if (!bool1);
            }
            else if (localObject3.n)
            {
              g5.b(xc[287]);
              new r(localObject3, Math.min(i11, i12), paramBoolean2, paramBoolean3).execute(new Void[0]);
              break;
              str10 = Mb.getString(2131296256);
              String str11 = Z.a(2131427330, i5);
              Object[] arrayOfObject1 = new Object[1];
              arrayOfObject1[0] = Integer.valueOf(i5);
              String str12 = String.format(str11, arrayOfObject1);
              String str13 = Z.a(2131427331, i6);
              Object[] arrayOfObject2 = new Object[2];
              arrayOfObject2[0] = str12;
              arrayOfObject2[1] = Integer.valueOf(i6);
              localStringBuilder2.append(String.format(str13, arrayOfObject2));
              str4 = str10;
              continue;
            }
          }
          long l1 = System.currentTimeMillis();
          long l2 = l1 - Gb;
          localtx.a(2130838516);
          localtx.a(str3);
          localtx.a(l1);
          String str7;
          Object localObject5;
          boolean bool3;
          if ((l2 > Eb) && (!paramBoolean2))
          {
            str7 = "0";
            if ((localObject3 != null) && ((!localObject3.o()) || (!n5.e(localObject3.b))))
            {
              if (!localObject3.o())
                break label2009;
              str7 = localSharedPreferences.getString(xc[''], "1");
            }
            localStringBuilder1.append(xc[286]).append(str7);
            if ((str7.equals("1")) && (jb.shouldVibrate(0)))
            {
              localtx.b(2);
              if (!bool1);
            }
            else if (str7.equals("2"))
            {
              long[] arrayOfLong2 = new long[5];
              arrayOfLong2[0] = 0L;
              arrayOfLong2[1] = 300L;
              arrayOfLong2[2] = 200L;
              arrayOfLong2[3] = 300L;
              arrayOfLong2[4] = 200L;
              localtx.a(arrayOfLong2);
              if (!bool1);
            }
            else if (str7.equals("3"))
            {
              long[] arrayOfLong1 = new long[5];
              arrayOfLong1[0] = 0L;
              arrayOfLong1[1] = 750L;
              arrayOfLong1[2] = 250L;
              arrayOfLong1[3] = 750L;
              arrayOfLong1[4] = 250L;
              localtx.a(arrayOfLong1);
            }
            if ((Cb == 0) && (localObject3 != null))
            {
              localObject5 = null;
              if ((u) || (!j()) || (!Conversation.a()) || (!Conversation.b().p.equals(localObject3.b)))
                break label2031;
              if (Conversation.s)
              {
                localStringBuilder1.append(xc[270]);
                localObject5 = xc[273];
              }
              if (localObject5 != null)
              {
                Uri localUri = Uri.parse((String)localObject5);
                localStringBuilder1.append(xc[280]).append(localUri);
                if ((localUri != null) && ((!localObject3.o()) || (!n5.e(localObject3.b))))
                  a(localUri);
              }
            }
            if (localObject3 == null)
              break label2313;
            if (!localObject3.o())
              break label2123;
            bool3 = localSharedPreferences.getBoolean(xc[284], true);
          }
          label1239: for (boolean bool2 = bool3; ; bool2 = false)
            while (true)
            {
              String str8;
              if ((bool2) && (u))
              {
                if (!localObject3.o())
                  break label2143;
                str8 = localSharedPreferences.getString(xc[260], xc[262]);
                if (str8 == null);
              }
              try
              {
                int i10 = Integer.parseInt(str8, 16);
                i8 = i10;
                int i9 = i8 | 0xFF000000;
                if (i9 != -16777216)
                {
                  localtx.a(i9, 1000, 4000);
                  localStringBuilder1.append(xc[281]).append(Integer.toHexString(i9));
                }
                if (bool1)
                  localStringBuilder1.append(xc[271]);
                if (bool1)
                  localStringBuilder1.append(xc[279]).append(bool2).append(xc[274]).append(u);
                if (bool1)
                  break;
                if (i6 == 1)
                {
                  localIntent1 = Conversation.a(localObject3);
                  localtx.a(PendingIntent.getActivity(Mb, 0, localIntent1, 268435456));
                  if (!eg.d)
                    break label2205;
                  SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(xc[290]);
                  localIntent1.putExtra(xc[292], true);
                  if (eg.e)
                    break label2191;
                  str5 = Mb.getString(2131296420);
                  localtx.b(Mb.getString(2131296256) + " " + str5);
                  localtx.c(xc[295] + localSimpleDateFormat.format(new Date(eg.f)));
                  Gb = System.currentTimeMillis();
                  g5.b(xc[285] + localStringBuilder1.toString());
                  if ((!paramBoolean1) && (!paramBoolean2))
                    g5.b(xc[276] + paramBoolean1 + xc[289] + paramBoolean2 + xc[283] + i6);
                  Hb = localtx.a();
                  gb.notify(1, Hb);
                  if (Conversation.a())
                  {
                    String str6 = null;
                    if (localObject3 != null)
                      str6 = localObject3.b;
                    Conversation.b().d(str6);
                    if (!bool1);
                  }
                  else
                  {
                    Conversation.r();
                  }
                  if ((Cb == 0) && (localObject3 != null) && (i7 != 0) && (!paramBoolean3) && ((!localObject3.o()) || (!n5.a(localObject3.b))))
                  {
                    KeyguardManager localKeyguardManager = (KeyguardManager)Mb.getSystemService(xc[294]);
                    PowerManager localPowerManager = (PowerManager)Mb.getSystemService(xc[93]);
                    if ((!j()) || (localKeyguardManager.inKeyguardRestrictedInputMode()) || (!localPowerManager.isScreenOn()))
                    {
                      g5.b(xc[275]);
                      if (((!localKeyguardManager.inKeyguardRestrictedInputMode()) && (localPowerManager.isScreenOn())) || ((i7 != 2) && (i7 != 3)))
                        break label2249;
                      if ((PopupNotification.a != null) && (!(PopupNotification.a instanceof PopupNotificationLocked)))
                      {
                        PopupNotification.a.finish();
                        PopupNotification.a = null;
                      }
                      localIntent2 = new Intent(Mb.getApplicationContext(), PopupNotificationLocked.class);
                      if (localIntent2 != null)
                      {
                        localIntent2.setFlags(268697600);
                        Mb.startActivity(localIntent2);
                      }
                      if (PopupNotification.a != null)
                        PopupNotification.a.e();
                      if (!bool1);
                    }
                    else if ((PopupNotification.a != null) && (PopupNotification.a.d()))
                    {
                      g5.b(xc[282]);
                      PopupNotification.a.e();
                    }
                  }
                  if ((!paramBoolean1) || (localObject3 == null) || (!localObject3.o()))
                    break;
                  n5.d(localObject3.b);
                  break;
                  label2009: str7 = localSharedPreferences.getString(xc[''], "1");
                  break label905;
                  label2031: localStringBuilder1.append(xc[288]);
                  if (localObject3.o());
                  for (localObject5 = localSharedPreferences.getString(xc[261], null); ; localObject5 = localSharedPreferences.getString(xc[263], null))
                  {
                    String str9 = a(localSharedPreferences, localObject3);
                    if (str9 == null)
                      break;
                    localStringBuilder1.append(xc[293]);
                    localObject5 = str9;
                    break;
                  }
                  bool3 = localSharedPreferences.getBoolean(xc[278], true);
                  break label1239;
                  label2143: str8 = localSharedPreferences.getString(xc[264], null);
                }
              }
              catch (NumberFormatException localNumberFormatException)
              {
                while (true)
                {
                  Intent localIntent2;
                  int i8 = 16777215;
                  continue;
                  Intent localIntent1 = new Intent(Mb, Conversations.class);
                  continue;
                  String str5 = Mb.getString(2131296421);
                  continue;
                  localtx.b(str4);
                  localtx.c(localStringBuilder2);
                  if (f >= 1)
                  {
                    localStringBuilder1.append(xc[277]).append(localStringBuilder2);
                    continue;
                    if ((!j()) && (i7 != 3))
                    {
                      if ((PopupNotification.a != null) && ((PopupNotification.a instanceof PopupNotificationLocked)))
                      {
                        PopupNotification.a.finish();
                        PopupNotification.a = null;
                      }
                      localIntent2 = new Intent(Mb.getApplicationContext(), PopupNotification.class);
                    }
                    else
                    {
                      localIntent2 = null;
                    }
                  }
                }
              }
            }
          label2123: str4 = null;
        }
      }
      label2313: label2331: localObject1 = localzq;
      i13 = i15;
      i14 = i16;
      break label352;
      label2346: localObject7 = localObject1;
      break label194;
      label2353: localObject6 = localObject2;
      break label251;
      label2360: i13 = i1;
      i14 = i2;
      break label352;
      label2371: i3 = i1;
      i4 = i2;
      break label364;
      label2382: i1 = i13;
      i2 = i14;
      break label106;
      label2393: localObject1 = localObject7;
      i14 = i16;
      i13 = i15;
      break label352;
      i5 = 0;
      i6 = 0;
      localObject4 = null;
      str3 = str16;
      localObject3 = null;
    }
  }

  public static boolean a()
  {
    return G;
  }

  // ERROR //
  public static boolean a(Context paramContext)
  {
    // Byte code:
    //   0: new 878	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 2506	android/content/Context:getFilesDir	()Ljava/io/File;
    //   8: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   11: sipush 171
    //   14: aaload
    //   15: invokespecial 888	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   18: invokevirtual 1710	java/io/File:exists	()Z
    //   21: ifeq +47 -> 68
    //   24: aconst_null
    //   25: astore_1
    //   26: new 2508	java/io/DataInputStream
    //   29: dup
    //   30: getstatic 1090	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   33: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   36: sipush 171
    //   39: aaload
    //   40: invokevirtual 2512	com/whatsapp/App:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   43: invokespecial 2515	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   46: astore_2
    //   47: aload_2
    //   48: invokevirtual 2518	java/io/DataInputStream:readBoolean	()Z
    //   51: putstatic 938	com/whatsapp/App:G	Z
    //   54: aload_2
    //   55: ifnull +7 -> 62
    //   58: aload_2
    //   59: invokevirtual 2521	java/io/DataInputStream:close	()V
    //   62: getstatic 1248	com/whatsapp/DialogToastListActivity:f	Z
    //   65: ifeq +17 -> 82
    //   68: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   71: sipush 222
    //   74: aaload
    //   75: invokestatic 1266	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   78: iconst_0
    //   79: putstatic 938	com/whatsapp/App:G	Z
    //   82: getstatic 938	com/whatsapp/App:G	Z
    //   85: ireturn
    //   86: astore 8
    //   88: aconst_null
    //   89: astore_2
    //   90: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   93: sipush 221
    //   96: aaload
    //   97: invokestatic 1806	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   100: iconst_0
    //   101: putstatic 938	com/whatsapp/App:G	Z
    //   104: aload_2
    //   105: ifnull -43 -> 62
    //   108: aload_2
    //   109: invokevirtual 2521	java/io/DataInputStream:close	()V
    //   112: goto -50 -> 62
    //   115: astore 7
    //   117: goto -55 -> 62
    //   120: astore 5
    //   122: aload_1
    //   123: ifnull +7 -> 130
    //   126: aload_1
    //   127: invokevirtual 2521	java/io/DataInputStream:close	()V
    //   130: aload 5
    //   132: athrow
    //   133: astore 6
    //   135: goto -5 -> 130
    //   138: astore 4
    //   140: aload_2
    //   141: astore_1
    //   142: aload 4
    //   144: astore 5
    //   146: goto -24 -> 122
    //   149: astore_3
    //   150: goto -60 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   26	47	86	java/io/IOException
    //   58	62	115	java/io/IOException
    //   108	112	115	java/io/IOException
    //   26	47	120	finally
    //   126	130	133	java/io/IOException
    //   47	54	138	finally
    //   90	104	138	finally
    //   47	54	149	java/io/IOException
  }

  private static boolean a(SharedPreferences paramSharedPreferences)
  {
    boolean bool = true;
    if ((a(paramSharedPreferences, bool) == 0) && (a(paramSharedPreferences, bool) == 0) && (r(paramSharedPreferences.getString(xc[261], null))) && (r(paramSharedPreferences.getString(xc[263], null))) && (paramSharedPreferences.getString(xc[260], xc[262]).equals(xc[259])) && (paramSharedPreferences.getString(xc[264], xc[262]).equals(xc[259])) && (paramSharedPreferences.getString(xc[''], "1").equals("0")) && (paramSharedPreferences.getString(xc[''], "1").equals("0")));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private static void ab()
  {
    if ((Conversation.a()) && (!Conversation.b().isFinishing()))
      Conversation.b().showDialog(113);
    while (true)
    {
      return;
      if ((Conversations.a()) && (jb() == Conversations.b()))
      {
        Conversations.b().showDialog(113);
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.c(xc[316] + new Date().toString() + " " + System.currentTimeMillis());
        b5.a(Mb.getString(2131296415));
        R = true;
      }
    }
  }

  public static File b(String paramString)
  {
    File localFile1 = new File(c, et.f);
    int i1 = 0;
    if (localFile1.exists())
      if (localFile1.isFile())
      {
        localFile1.delete();
        if (!DialogToastListActivity.f);
      }
      else if (localFile1.isDirectory())
      {
        i1 = 1;
      }
    if (i1 == 0)
      localFile1.mkdirs();
    if (paramString != null);
    for (File localFile2 = new File(localFile1, paramString); ; localFile2 = localFile1)
      return localFile2;
  }

  private static String b(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = xc['×'];
    case 2:
    case 3:
    case 1:
    }
    while (true)
    {
      return str;
      str = xc['Ø'];
      continue;
      str = xc['Ö'];
      continue;
      str = xc['Ù'];
    }
  }

  public static String b(Context paramContext)
  {
    String str = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getString(xc[21], "*");
    if ((str == null) || (str.length() == 0))
      str = "*";
    return str;
  }

  // ERROR //
  public static void b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new 2541	java/io/DataOutputStream
    //   5: dup
    //   6: getstatic 1090	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   9: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   12: sipush 171
    //   15: aaload
    //   16: iconst_0
    //   17: invokevirtual 2545	com/whatsapp/App:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   20: invokespecial 2548	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   23: astore_1
    //   24: aload_1
    //   25: getstatic 938	com/whatsapp/App:G	Z
    //   28: invokevirtual 2551	java/io/DataOutputStream:writeBoolean	(Z)V
    //   31: aload_1
    //   32: ifnull +7 -> 39
    //   35: aload_1
    //   36: invokevirtual 2552	java/io/DataOutputStream:close	()V
    //   39: return
    //   40: astore 7
    //   42: aconst_null
    //   43: astore_1
    //   44: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   47: sipush 170
    //   50: aaload
    //   51: invokestatic 1806	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   54: aload_1
    //   55: ifnull -16 -> 39
    //   58: aload_1
    //   59: invokevirtual 2552	java/io/DataOutputStream:close	()V
    //   62: goto -23 -> 39
    //   65: astore 6
    //   67: goto -28 -> 39
    //   70: astore 4
    //   72: aload_0
    //   73: ifnull +7 -> 80
    //   76: aload_0
    //   77: invokevirtual 2552	java/io/DataOutputStream:close	()V
    //   80: aload 4
    //   82: athrow
    //   83: astore 5
    //   85: goto -5 -> 80
    //   88: astore_3
    //   89: aload_1
    //   90: astore_0
    //   91: aload_3
    //   92: astore 4
    //   94: goto -22 -> 72
    //   97: astore_2
    //   98: goto -54 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   2	24	40	java/io/IOException
    //   35	39	65	java/io/IOException
    //   58	62	65	java/io/IOException
    //   2	24	70	finally
    //   76	80	83	java/io/IOException
    //   24	31	88	finally
    //   44	54	88	finally
    //   24	31	97	java/io/IOException
  }

  public static void b(Activity paramActivity)
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList1 = (ArrayList)gp.a.clone();
    ArrayList localArrayList2 = new ArrayList();
    int i1 = 0;
    Iterator localIterator = localArrayList1.iterator();
    int i2;
    if (localIterator.hasNext())
    {
      zq localzq = gp.a((String)localIterator.next());
      if (localzq != null)
        if (!localzq.b.contains(E))
        {
          a(localzq, paramActivity);
          if ((!localzq.o()) && (localzq.g == null))
          {
            localArrayList2.add(localzq);
            if (!bool);
          }
        }
        else
        {
          i2 = 1;
          label111: if (!bool);
        }
    }
    while (true)
    {
      w.a(localArrayList2);
      z.q();
      paramActivity.runOnUiThread(new qh());
      if (i2 != 0)
        eu.a();
      return;
      i1 = i2;
      break;
      i2 = i1;
      break label111;
      i2 = i1;
    }
  }

  public static void b(Context paramContext, int paramInt)
  {
    synchronized (L)
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
      localEditor.putInt(xc[''], paramInt);
      if (!localEditor.commit())
        g5.d(xc['']);
      L = Integer.valueOf(paramInt);
      return;
    }
  }

  public static void b(Context paramContext, String paramString)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putString(xc['¬'], paramString);
    if (!localEditor.commit())
      g5.d(xc['­']);
  }

  public static void b(Context paramContext, String paramString, int paramInt)
  {
    if (Q != null)
    {
      Q.c(paramString);
      if (!DialogToastListActivity.f);
    }
    else
    {
      a(paramContext, paramString, paramInt);
    }
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putBoolean(xc[79], paramBoolean);
    if (!localEditor.commit())
      g5.d(xc[78]);
  }

  static void b(Message paramMessage)
  {
    a(paramMessage);
  }

  static void b(Messenger paramMessenger)
  {
    a(paramMessenger);
  }

  static void b(cg paramcg)
  {
    a(paramcg);
  }

  public static void b(ju paramju)
  {
    if (qc)
    {
      g5.c(xc['£']);
      h.a(rc, com.whatsapp.messaging.s.b(paramju));
    }
  }

  public static void b(lr paramlr)
  {
    if (Q == paramlr)
      Q = null;
  }

  private static void b(sz paramsz)
  {
    if (paramsz.e)
      h.a(rc, com.whatsapp.messaging.s.c(paramsz));
  }

  static void b(uk paramuk)
  {
    Ab.remove(paramuk);
  }

  public static void b(uz paramuz, int paramInt)
  {
    if ((paramInt == 401) && (eu.f(paramuz.a)))
      z.a(eu.e(paramuz.a));
  }

  public static void b(String paramString, int paramInt)
  {
    if ((paramInt == 500) || (paramInt == 501) || (paramInt == 503))
      W = 3600000L + System.currentTimeMillis();
  }

  static void b(String paramString, sz paramsz)
  {
    a(paramString, paramsz);
  }

  public static void b(String paramString1, String paramString2)
  {
    if (qc)
    {
      g5.c(xc[20]);
      h.a(rc, com.whatsapp.messaging.s.b(paramString1, paramString2));
    }
  }

  public static void b(String paramString, boolean paramBoolean)
  {
    Handler localHandler = Kb;
    if (paramBoolean);
    for (int i1 = 1; ; i1 = 0)
    {
      localHandler.obtainMessage(1, i1, 0, paramString).sendToTarget();
      return;
    }
  }

  private static boolean b(SharedPreferences paramSharedPreferences)
  {
    if (P);
    for (boolean bool = O; ; bool = a(paramSharedPreferences))
      return bool;
  }

  private static void bb()
  {
    if ((Conversation.a()) && (!Conversation.b().isFinishing()))
      Conversation.b().showDialog(114);
    do
    {
      return;
      if ((!Conversations.a()) || (jb() != Conversations.b()))
        break;
      Conversations.b().showDialog(114);
    }
    while (!DialogToastListActivity.f);
    g5.c(xc[''] + new Date().toString() + " " + System.currentTimeMillis());
    App localApp = Mb;
    if (g == 0);
    for (int i1 = 2131296419; ; i1 = 2131296418)
    {
      b5.a(localApp.getString(i1));
      R = true;
      break;
    }
  }

  public static int c(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getInt(xc['Ô'], 0);
  }

  private long c(long paramLong)
  {
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(Mb.getFilesDir(), xc[14])));
      localObjectOutputStream.writeLong(paramLong);
      localObjectOutputStream.close();
      return paramLong;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(xc['â'] + localIOException.toString());
    }
  }

  public static File c(String paramString)
  {
    File localFile1 = new File(c, et.d);
    int i1 = 0;
    if (localFile1.exists())
      if (localFile1.isFile())
      {
        localFile1.delete();
        if (!DialogToastListActivity.f);
      }
      else if (localFile1.isDirectory())
      {
        i1 = 1;
      }
    if (i1 == 0)
      localFile1.mkdirs();
    if (paramString != null);
    for (File localFile2 = new File(localFile1, paramString); ; localFile2 = localFile1)
      return localFile2;
  }

  public static String c()
  {
    if (bb == null);
    for (String str = null; ; str = bb.jabber_id)
      return str;
  }

  public static void c(int paramInt)
  {
    if (Mb.X != null)
      Mb.X.b();
  }

  public static void c(Context paramContext, int paramInt)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putInt(xc['¸'], paramInt);
    if (!localEditor.commit())
      g5.d(xc['Ú']);
  }

  public static void c(Context paramContext, String paramString)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putString(xc[66], paramString);
    if (!localEditor.commit())
      g5.d(xc['¢']);
  }

  public static void c(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).edit();
    localEditor.putBoolean(xc['±'], paramBoolean);
    if (!localEditor.commit())
      g5.d(xc[310]);
  }

  public static void c(ju paramju)
  {
    if (qc)
    {
      g5.c(xc['®']);
      h.a(rc, com.whatsapp.messaging.s.c(paramju));
    }
  }

  public static void c(sz paramsz)
  {
    if (paramsz.e)
      h.a(rc, com.whatsapp.messaging.s.d(paramsz));
  }

  public static void c(uz paramuz, int paramInt)
  {
    if (xc[335].equals(paramuz.a))
    {
      SetStatus localSetStatus = SetStatus.f();
      if (localSetStatus != null)
        localSetStatus.c();
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.c(xc[334] + paramuz.a + xc[336] + paramInt);
    }
  }

  // ERROR //
  public static void c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokestatic 2248	com/whatsapp/App:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: aload_1
    //   8: invokestatic 2622	com/whatsapp/hz:a	(Ljava/lang/String;)Z
    //   11: ifne +152 -> 163
    //   14: getstatic 1252	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   17: invokevirtual 2625	com/whatsapp/qp:b	()Lcom/whatsapp/ar;
    //   20: astore_3
    //   21: aload_1
    //   22: aload_3
    //   23: getfield 1765	com/whatsapp/zq:b	Ljava/lang/String;
    //   26: invokevirtual 1663	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   29: ifeq +134 -> 163
    //   32: aload_3
    //   33: invokevirtual 2627	com/whatsapp/zq:g	()Ljava/io/File;
    //   36: astore 4
    //   38: aload_3
    //   39: invokevirtual 2629	com/whatsapp/zq:h	()Ljava/io/File;
    //   42: astore 5
    //   44: aload 4
    //   46: invokevirtual 1710	java/io/File:exists	()Z
    //   49: ifeq +114 -> 163
    //   52: aload 5
    //   54: invokevirtual 1710	java/io/File:exists	()Z
    //   57: ifeq +106 -> 163
    //   60: new 2631	java/io/FileInputStream
    //   63: dup
    //   64: aload 5
    //   66: invokespecial 2632	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   69: astore 6
    //   71: aload 5
    //   73: invokevirtual 2118	java/io/File:length	()J
    //   76: l2i
    //   77: newarray byte
    //   79: astore 14
    //   81: aload 6
    //   83: aload 14
    //   85: invokevirtual 2636	java/io/FileInputStream:read	([B)I
    //   88: pop
    //   89: new 2631	java/io/FileInputStream
    //   92: dup
    //   93: aload 4
    //   95: invokespecial 2632	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   98: astore 8
    //   100: aload 4
    //   102: invokevirtual 2118	java/io/File:length	()J
    //   105: l2i
    //   106: newarray byte
    //   108: astore 16
    //   110: aload 8
    //   112: aload 16
    //   114: invokevirtual 2636	java/io/FileInputStream:read	([B)I
    //   117: pop
    //   118: new 2621	com/whatsapp/hz
    //   121: dup
    //   122: aload_1
    //   123: aload 16
    //   125: aload 14
    //   127: invokespecial 2639	com/whatsapp/hz:<init>	(Ljava/lang/String;[B[B)V
    //   130: astore 18
    //   132: aload 18
    //   134: iconst_1
    //   135: putfield 2641	com/whatsapp/hz:k	Z
    //   138: aload 18
    //   140: invokestatic 2643	com/whatsapp/App:a	(Lcom/whatsapp/hz;)V
    //   143: aload 6
    //   145: ifnull +8 -> 153
    //   148: aload 6
    //   150: invokevirtual 2644	java/io/FileInputStream:close	()V
    //   153: aload 8
    //   155: ifnull +8 -> 163
    //   158: aload 8
    //   160: invokevirtual 2644	java/io/FileInputStream:close	()V
    //   163: return
    //   164: astore 7
    //   166: aconst_null
    //   167: astore 8
    //   169: new 1287	java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial 1288	java/lang/StringBuilder:<init>	()V
    //   176: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   179: iconst_2
    //   180: aaload
    //   181: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: aload_1
    //   185: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   191: iconst_3
    //   192: aaload
    //   193: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 1299	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: aload 7
    //   201: invokestatic 1854	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   204: aload_2
    //   205: ifnull +7 -> 212
    //   208: aload_2
    //   209: invokevirtual 2644	java/io/FileInputStream:close	()V
    //   212: aload 8
    //   214: ifnull -51 -> 163
    //   217: aload 8
    //   219: invokevirtual 2644	java/io/FileInputStream:close	()V
    //   222: goto -59 -> 163
    //   225: astore 12
    //   227: goto -64 -> 163
    //   230: astore 9
    //   232: aconst_null
    //   233: astore 8
    //   235: aload_2
    //   236: ifnull +7 -> 243
    //   239: aload_2
    //   240: invokevirtual 2644	java/io/FileInputStream:close	()V
    //   243: aload 8
    //   245: ifnull +8 -> 253
    //   248: aload 8
    //   250: invokevirtual 2644	java/io/FileInputStream:close	()V
    //   253: aload 9
    //   255: athrow
    //   256: astore 11
    //   258: goto -15 -> 243
    //   261: astore 10
    //   263: goto -10 -> 253
    //   266: astore 13
    //   268: goto -56 -> 212
    //   271: astore 19
    //   273: goto -120 -> 153
    //   276: astore 9
    //   278: aconst_null
    //   279: astore 8
    //   281: aload 6
    //   283: astore_2
    //   284: goto -49 -> 235
    //   287: astore 9
    //   289: aload 6
    //   291: astore_2
    //   292: goto -57 -> 235
    //   295: astore 9
    //   297: goto -62 -> 235
    //   300: astore 7
    //   302: aconst_null
    //   303: astore 8
    //   305: aload 6
    //   307: astore_2
    //   308: goto -139 -> 169
    //   311: astore 7
    //   313: aload 6
    //   315: astore_2
    //   316: goto -147 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   60	71	164	java/io/IOException
    //   158	163	225	java/io/IOException
    //   217	222	225	java/io/IOException
    //   60	71	230	finally
    //   239	243	256	java/io/IOException
    //   248	253	261	java/io/IOException
    //   208	212	266	java/io/IOException
    //   148	153	271	java/io/IOException
    //   71	100	276	finally
    //   100	143	287	finally
    //   169	204	295	finally
    //   71	100	300	java/io/IOException
    //   100	143	311	java/io/IOException
  }

  public static void c(String paramString, boolean paramBoolean)
  {
    if ((qc) || (paramBoolean))
    {
      g5.c(xc[''] + paramString);
      h.a(rc, com.whatsapp.messaging.s.l(paramString));
    }
  }

  public static void c(boolean paramBoolean)
  {
    if ((qc) || (paramBoolean))
    {
      g5.c(xc['Ï']);
      h.a(rc, com.whatsapp.messaging.s.f());
    }
  }

  static boolean c(SharedPreferences paramSharedPreferences)
  {
    return a(paramSharedPreferences);
  }

  private static void cb()
  {
    rb.a();
    qb = false;
    pb = true;
    tb = false;
    ub = false;
    vb = false;
    l();
    S();
    if ((Conversation.a()) && (I != 3))
      a(Conversation.b().Qb);
    if (lb() != kb())
      if (kb())
      {
        ob();
        if (!DialogToastListActivity.f);
      }
      else if (I == 3)
      {
        pb();
      }
  }

  static int d(int paramInt)
  {
    I = paramInt;
    return paramInt;
  }

  public static App.Me d(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0);
    return new App.Me(localSharedPreferences.getString(xc['Ò'], null), localSharedPreferences.getString(xc['Ó'], null));
  }

  private static void d()
  {
    String str1 = j.replace(' ', '_');
    String str2 = k.replace(' ', '_');
    String str3 = i.replace(' ', '_');
    Object localObject1 = xc[19];
    Object localObject2 = xc[19];
    Object localObject3 = xc[19];
    try
    {
      String str6 = Build.VERSION.RELEASE.replace(' ', '_');
      localObject1 = str6;
    }
    catch (NoSuchFieldError localNoSuchFieldError2)
    {
      try
      {
        String str5 = Build.MANUFACTURER.replace(' ', '_');
        localObject2 = str5;
      }
      catch (NoSuchFieldError localNoSuchFieldError2)
      {
        try
        {
          while (true)
          {
            String str4 = Build.MODEL.replace(' ', '_');
            localObject3 = str4;
            n = str3 + "/" + str1 + " " + str2 + "/" + (String)localObject1 + xc[17] + (String)localObject2 + "-" + (String)localObject3;
            return;
            localNoSuchFieldError1 = localNoSuchFieldError1;
            g5.d(xc[15] + localNoSuchFieldError1.toString());
            continue;
            localNoSuchFieldError2 = localNoSuchFieldError2;
            g5.d(xc[18] + localNoSuchFieldError2.toString());
          }
        }
        catch (NoSuchFieldError localNoSuchFieldError3)
        {
          while (true)
            g5.d(xc[16] + localNoSuchFieldError3.toString());
        }
      }
    }
  }

  public static void d(Context paramContext, String paramString)
  {
    g5.d(paramString);
    Toast localToast = Toast.makeText(paramContext, paramContext.getString(2131296979), 1);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }

  public static void d(sz paramsz)
  {
    if (paramsz.e)
      h.a(rc, com.whatsapp.messaging.s.e(paramsz));
  }

  public static void d(String paramString)
  {
    if (f != 3);
    while (true)
    {
      return;
      Toast localToast = Toast.makeText(Mb, paramString, 0);
      localToast.setGravity(85, 0, 0);
      localToast.show();
    }
  }

  public static void d(String paramString, boolean paramBoolean)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(xc['©'] + paramString + " " + paramBoolean);
    int i1 = paramString.indexOf('/');
    if ((i1 != -1) || (bool))
      paramString = paramString.substring(0, i1);
    gp.a(paramString);
    if (paramBoolean)
    {
      y.a(paramString, true);
      y.c(paramString, true);
      if (!bool);
    }
    else
    {
      y.a(paramString, false);
    }
    f(paramString);
  }

  public static void d(boolean paramBoolean)
  {
    Object localObject1 = jc;
    if (paramBoolean);
    try
    {
      if (ic == 0)
      {
        g.h = true;
        Mb.getContentResolver().unregisterContentObserver(lc);
      }
      ic = 1 + ic;
      if (DialogToastListActivity.f)
      {
        ic = -1 + ic;
        if (ic == 0)
        {
          g.h = false;
          mc.sendEmptyMessageDelayed(1, 5000L);
        }
      }
      return;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }

  private static void db()
  {
    boolean bool = pb;
    qb = false;
    pb = false;
    l();
    v();
    gp.c();
    S.a();
    T.a();
    U.a();
    if (I == 2)
    {
      Mb.R();
      I = 3;
      if (!DialogToastListActivity.f);
    }
    else if ((I == 1) && (bool))
    {
      ob();
    }
  }

  public static String e(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getString(xc[80], null);
  }

  public static void e(Context paramContext, String paramString)
  {
    a(paramContext, paramString, (Location)null);
  }

  public static void e(sz paramsz)
  {
    if (w.a(paramsz.b.a, null) != null)
      z.e(paramsz);
  }

  static void e(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = Ab.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((uk)localIterator.next()).a(paramString);
    }
    while (!bool);
  }

  public static void e(String paramString, boolean paramBoolean)
  {
    y.b(paramString, paramBoolean);
    f(paramString);
  }

  public static boolean e()
  {
    try
    {
      Class.forName(xc[11]);
      bool = true;
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.d(localException);
        boolean bool = false;
      }
    }
  }

  private static void eb()
  {
    gp.c();
  }

  public static String f(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getString(xc['¬'], "");
  }

  static void f(sz paramsz)
  {
    Kb.removeMessages(0);
    Kb.removeMessages(1);
    Kb.removeMessages(2);
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.b(paramsz));
  }

  static void f(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = Ab.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((uk)localIterator.next()).b(paramString);
    }
    while (!bool);
  }

  public static void f(boolean paramBoolean)
  {
    J = paramBoolean;
  }

  public static boolean f()
  {
    if ((Bb == -1L) || (System.currentTimeMillis() - Bb >= 86400000L));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void fb()
  {
    g5.b(xc['þ']);
    ab();
  }

  public static long g()
  {
    long l1 = z.g();
    if (l1 != -1L);
    return l1;
  }

  public static String g(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getString(xc[66], null);
  }

  public static void g(sz paramsz)
  {
    MediaData localMediaData = (MediaData)paramsz.t;
    localMediaData.uploader = new pb(paramsz, false, null);
    localMediaData.uploader.a();
  }

  public static boolean g(String paramString)
  {
    return yb.contains(paramString);
  }

  static boolean g(boolean paramBoolean)
  {
    ub = paramBoolean;
    return paramBoolean;
  }

  private static void gb()
  {
    g5.b(xc[83]);
    bb();
  }

  public static int h(Context paramContext)
  {
    synchronized (L)
    {
      if (L.intValue() == -1)
        L = Integer.valueOf(paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getInt(xc[''], 0));
      int i1 = L.intValue();
      return i1;
    }
  }

  static void h()
  {
    a(Mb, 2131296285, 0);
  }

  public static void h(sz paramsz)
  {
    z.a(paramsz, true, 4);
  }

  public static void h(String paramString)
  {
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.g(paramString));
  }

  static boolean h(boolean paramBoolean)
  {
    vb = paramBoolean;
    return paramBoolean;
  }

  static void i()
  {
    a(Mb, 2131296287, 0);
  }

  public static void i(sz paramsz)
  {
    if (paramsz.l != 0)
      paramsz.t = new MediaData();
  }

  public static void i(String paramString)
  {
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.f(paramString));
  }

  public static boolean i(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getBoolean(xc[326], false);
  }

  static boolean i(boolean paramBoolean)
  {
    N = paramBoolean;
    return paramBoolean;
  }

  // ERROR //
  private long ib()
  {
    // Byte code:
    //   0: ldc2_w 963
    //   3: lstore_1
    //   4: lload_1
    //   5: invokestatic 2751	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   8: astore_3
    //   9: new 878	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokevirtual 1335	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   17: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   20: bipush 14
    //   22: aaload
    //   23: invokespecial 888	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   26: astore 4
    //   28: aload 4
    //   30: invokevirtual 1710	java/io/File:exists	()Z
    //   33: ifne +5 -> 38
    //   36: lload_1
    //   37: lreturn
    //   38: aconst_null
    //   39: astore 5
    //   41: new 2753	java/io/ObjectInputStream
    //   44: dup
    //   45: new 2631	java/io/FileInputStream
    //   48: dup
    //   49: aload 4
    //   51: invokespecial 2632	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   54: invokespecial 2754	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   57: astore 6
    //   59: aload 6
    //   61: invokevirtual 2757	java/io/ObjectInputStream:readLong	()J
    //   64: invokestatic 2751	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   67: astore 12
    //   69: aload 12
    //   71: invokevirtual 2760	java/lang/Long:longValue	()J
    //   74: lstore 13
    //   76: lload 13
    //   78: lstore_1
    //   79: aload 6
    //   81: ifnull -45 -> 36
    //   84: aload 6
    //   86: invokevirtual 2761	java/io/ObjectInputStream:close	()V
    //   89: goto -53 -> 36
    //   92: astore 15
    //   94: new 1287	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 1288	java/lang/StringBuilder:<init>	()V
    //   101: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   104: bipush 12
    //   106: aaload
    //   107: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: aload 15
    //   112: invokevirtual 2606	java/io/IOException:toString	()Ljava/lang/String;
    //   115: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: invokevirtual 1299	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: invokestatic 1697	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   124: goto -88 -> 36
    //   127: astore 7
    //   129: aload_3
    //   130: astore 8
    //   132: new 1287	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 1288	java/lang/StringBuilder:<init>	()V
    //   139: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   142: bipush 13
    //   144: aaload
    //   145: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload 7
    //   150: invokevirtual 2606	java/io/IOException:toString	()Ljava/lang/String;
    //   153: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 1299	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokestatic 1697	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   162: aload 5
    //   164: ifnull +8 -> 172
    //   167: aload 5
    //   169: invokevirtual 2761	java/io/ObjectInputStream:close	()V
    //   172: aload 8
    //   174: invokevirtual 2760	java/lang/Long:longValue	()J
    //   177: lstore_1
    //   178: goto -142 -> 36
    //   181: astore 9
    //   183: aload 5
    //   185: ifnull +8 -> 193
    //   188: aload 5
    //   190: invokevirtual 2761	java/io/ObjectInputStream:close	()V
    //   193: aload 9
    //   195: athrow
    //   196: astore 10
    //   198: new 1287	java/lang/StringBuilder
    //   201: dup
    //   202: invokespecial 1288	java/lang/StringBuilder:<init>	()V
    //   205: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   208: bipush 12
    //   210: aaload
    //   211: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload 10
    //   216: invokevirtual 2606	java/io/IOException:toString	()Ljava/lang/String;
    //   219: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: invokevirtual 1299	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: invokestatic 1697	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   228: goto -35 -> 193
    //   231: astore 11
    //   233: new 1287	java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial 1288	java/lang/StringBuilder:<init>	()V
    //   240: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   243: bipush 12
    //   245: aaload
    //   246: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: aload 11
    //   251: invokevirtual 2606	java/io/IOException:toString	()Ljava/lang/String;
    //   254: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual 1299	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: invokestatic 1697	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   263: goto -91 -> 172
    //   266: astore 9
    //   268: aload 6
    //   270: astore 5
    //   272: goto -89 -> 183
    //   275: astore 7
    //   277: aload 6
    //   279: astore 5
    //   281: aload_3
    //   282: astore 8
    //   284: goto -152 -> 132
    //   287: astore 7
    //   289: aload 12
    //   291: astore 8
    //   293: aload 6
    //   295: astore 5
    //   297: goto -165 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   84	89	92	java/io/IOException
    //   41	59	127	java/io/IOException
    //   41	59	181	finally
    //   132	162	181	finally
    //   188	193	196	java/io/IOException
    //   167	172	231	java/io/IOException
    //   59	69	266	finally
    //   69	76	266	finally
    //   59	69	275	java/io/IOException
    //   69	76	287	java/io/IOException
  }

  public static int j(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getInt(xc['¸'], 0);
  }

  public static void j(sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    long l1 = y.a(paramsz.b.a);
    if ((l1 != 1L) && ((l1 == 0L) || (l1 < paramsz.i)))
      y.a(paramsz.b.a, paramsz.i);
    if (paramsz.b.a.endsWith(xc['æ']))
    {
      if (paramsz.l == 0)
      {
        String str2 = paramsz.b.a.substring(0, paramsz.b.a.length() - xc['æ'].length()) + xc['é'];
        zq localzq2 = w.a(str2, null);
        if (localzq2 == null)
        {
          g5.c(xc['è'] + str2 + xc['ã']);
          if (!bool);
        }
        else if (str2.equals(bb.jabber_id))
        {
          a = paramsz.b();
          g5.d(xc['ç'] + a);
          SetStatus localSetStatus = SetStatus.f();
          if (localSetStatus != null)
            localSetStatus.b();
          if (!bool);
        }
        else
        {
          localzq2.c = paramsz.b();
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(localzq2);
          t localt = new t();
          ArrayList[] arrayOfArrayList = new ArrayList[1];
          arrayOfArrayList[0] = localArrayList;
          localt.execute(arrayOfArrayList);
        }
        if (!bool);
      }
      else
      {
        g5.c(xc['ä']);
      }
      b(paramsz);
    }
    while (true)
    {
      return;
      String str1 = paramsz.b.a;
      zq localzq1 = gp.a(str1);
      g5.b(xc['ê'] + paramsz.b.c + " " + paramsz.i + " " + System.currentTimeMillis());
      if (xc['å'].equals(str1))
        paramsz.i = System.currentTimeMillis();
      i(paramsz);
      z.a(paramsz);
      if (Mb.Y)
        if (paramsz.l == 1)
        {
          if (Mb.X == null)
            Mb.X = new ow();
          Mb.X.a(paramsz);
          if (!bool);
        }
        else if ((Mb.X != null) && (Mb.X.c))
        {
          if (paramsz.v)
          {
            Mb.X.c();
            if (!bool);
          }
          else
          {
            Mb.X.b();
          }
        }
      if (!localzq1.k)
      {
        localzq1.k = true;
        l8 locall8 = new l8(localzq1);
        locall8.setPriority(1);
        locall8.start();
      }
      if ((paramsz.l == 5) && (!paramsz.a()))
      {
        ((MediaData)paramsz.t).transferring = true;
        new u(paramsz).execute(new Void[0]);
      }
      e4.a(paramsz);
    }
  }

  public static void j(String paramString)
  {
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.n(paramString));
  }

  static boolean j()
  {
    boolean bool = false;
    if (fb == null);
    while (true)
    {
      return bool;
      List localList = fb.getRunningTasks(1);
      if ((localList != null) && (localList.size() != 0))
        bool = ((ActivityManager.RunningTaskInfo)localList.get(0)).baseActivity.toString().contains(xc[41]);
    }
  }

  static boolean j(boolean paramBoolean)
  {
    O = paramBoolean;
    return paramBoolean;
  }

  public static lr jb()
  {
    return Q;
  }

  public static long k()
  {
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    return localStatFs.getBlockSize() * localStatFs.getAvailableBlocks();
  }

  static void k(sz paramsz)
  {
    b(paramsz);
  }

  public static void k(String paramString)
  {
    if (qc)
    {
      g5.c(xc['Ð']);
      ju localju = new ju(paramString, null, null, 16);
      h.a(rc, com.whatsapp.messaging.s.d(localju));
    }
  }

  public static boolean k(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getBoolean(xc['±'], false);
  }

  public static boolean kb()
  {
    int i1 = 1;
    if (I == i1);
    while (true)
    {
      return i1;
      int i2 = 0;
    }
  }

  static void l()
  {
    boolean bool = DialogToastListActivity.f;
    String str;
    if (pb)
    {
      d(xc[321]);
      str = xc[322];
      if (!bool);
    }
    else if (qb)
    {
      d(xc[319]);
      str = xc[320];
      if (!bool);
    }
    else
    {
      d(xc[318]);
      str = xc[317];
    }
    if (zb != null)
      zb.setText(str);
  }

  public static void l(Context paramContext)
  {
    boolean bool1 = DialogToastListActivity.f;
    if (lb);
    while (true)
    {
      return;
      p5 localp51 = new p5();
      p5 localp52 = new p5();
      localp52.b(xc[68]);
      if (!mb)
        et.a();
      if ((!mb) && (!nb))
      {
        nb = true;
        g5.b(xc[69]);
        if ((!r) || (f > 1));
      }
      try
      {
        if (bb != null)
        {
          localObject = bb.jabber_id;
          if (!bool1);
        }
        else
        {
          str1 = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).getString(xc[21], xc[73]).toLowerCase().replaceAll(xc[74], "-");
          boolean bool2 = str1.equals(xc[73]);
          if (!bool2)
            break label460;
        }
        try
        {
          String str3 = db.getDeviceId();
          str2 = str3;
          if ((str2 != null) && (str2.length() >= 6))
          {
            localObject = xc[77] + str2.substring(-6 + str2.length(), str2.length());
            localp51.b(xc[76]);
            if (g5.b())
            {
              File localFile = g5.c();
              if (localFile != null)
              {
                localp51.a(xc[67]);
                at localat = new at(new URL(f8.c), localFile, 16384, null);
                localat.a(xc[70], (String)localObject);
                localat.a();
                g5.e();
                if (!bool1);
              }
              else
              {
                g5.c(xc[72]);
              }
            }
            localp51.b();
            B.f();
            if (!ob)
              ob = true;
            Settings.c();
            if (E())
              new w(null).execute(new Void[0]);
            localp52.b();
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            g5.c(xc[75] + localException2.toString());
            String str2 = null;
          }
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          String str1;
          g5.d(xc[71] + localException1.toString());
          continue;
          label460: Object localObject = str1;
        }
      }
    }
  }

  public static void l(String paramString)
  {
    if (qc)
      if ((eu.f) || (eu.h) || (!S.a(paramString)))
      {
        g5.c(xc[84]);
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.c(xc[85]);
        h.a(rc, com.whatsapp.messaging.s.m(paramString));
      }
  }

  private static boolean lb()
  {
    return J;
  }

  public static void m()
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = Ab.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((uk)localIterator.next()).a();
    }
    while (!bool);
  }

  public static void m(Context paramContext)
  {
    if (bb != null)
    {
      g5.b(xc[24]);
      paramContext.bindService(new Intent(paramContext, MessageService.class), tc, 1);
    }
  }

  public static void m(String paramString)
  {
    zq localzq = gp.a(paramString);
    z.e(paramString);
    if (localzq != null)
    {
      a(localzq, true);
      a(false, false);
      if ((localzq.g == null) || (localzq.o()))
        a(new rh(localzq));
    }
  }

  static void mb()
  {
    if (I != 1)
      if (I == 2)
      {
        Mb.R();
        I = 1;
        if (!DialogToastListActivity.f);
      }
      else
      {
        I = 1;
        if (!qb)
          break label41;
      }
    while (true)
    {
      return;
      label41: ob();
    }
  }

  public static void n()
  {
    z.f((sz)Conversation.l.get(0));
  }

  public static void n(Context paramContext)
  {
    if ((bb != null) && (rc != null))
    {
      g5.b(xc[1]);
      cb = mh.c(u4.a());
      h.a(rc, bb.jabber_id, cb);
    }
  }

  public static void n(String paramString)
  {
    C2DMRegistrar.a(Mb, paramString);
  }

  static void nb()
  {
    if (I == 1)
    {
      I = 2;
      Mb.Q();
    }
  }

  private static void o(Context paramContext)
  {
    MessageService.b(paramContext, true);
    MessageService.a(paramContext, true);
  }

  public static void o(String paramString)
  {
    a(new zh(w.a(paramString, null)));
  }

  public static boolean o()
  {
    return true;
  }

  private static void ob()
  {
    if (qc)
      h.a(rc);
  }

  static void p(Context paramContext)
  {
    o(paramContext);
  }

  public static void p(String paramString)
  {
    yb.put(paramString, paramString);
  }

  public static boolean p()
  {
    return true;
  }

  private static void pb()
  {
    if (qc)
    {
      PowerManager localPowerManager = (PowerManager)Mb.getSystemService(xc[93]);
      if (localPowerManager != null)
      {
        PowerManager.WakeLock localWakeLock = localPowerManager.newWakeLock(1, xc[309]);
        if (localWakeLock != null)
        {
          localWakeLock.acquire(3000L);
          g5.b(xc[308]);
        }
      }
      h.b(rc);
    }
    eb();
  }

  private static void q(String paramString)
  {
    boolean bool1 = DialogToastListActivity.f;
    boolean bool2;
    if (paramString != null)
      bool2 = true;
    while (true)
    {
      g5.b(bool2);
      try
      {
        List localList = fb.getRunningAppProcesses();
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          do
          {
            if (!localIterator.hasNext())
              break;
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if ((localRunningAppProcessInfo.processName != null) && (localRunningAppProcessInfo.processName.equals(paramString)))
            {
              g5.b(xc['à'] + localRunningAppProcessInfo.processName + " " + localRunningAppProcessInfo.pid);
              if (!bool1)
                break;
            }
          }
          while (!bool1);
        }
        return;
        bool2 = false;
      }
      catch (Exception localException)
      {
        while (true)
          g5.c(xc['á'] + localException.toString());
      }
    }
  }

  public static boolean q()
  {
    if (W < System.currentTimeMillis());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void qb()
  {
    new v(this).execute(new Void[0]);
  }

  public static void r()
  {
    if (qc)
    {
      g5.b(xc['Ü']);
      h.a(rc, com.whatsapp.messaging.s.e());
    }
  }

  static boolean r(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  // ERROR //
  private void rb()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 878	java/io/File
    //   5: dup
    //   6: getstatic 1090	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   9: invokevirtual 1335	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   12: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   15: bipush 89
    //   17: aaload
    //   18: invokespecial 888	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   21: invokevirtual 2973	java/io/File:listFiles	()[Ljava/io/File;
    //   24: astore_2
    //   25: aload_2
    //   26: arraylength
    //   27: istore_3
    //   28: iconst_0
    //   29: istore 4
    //   31: iload 4
    //   33: iload_3
    //   34: if_icmpge +14 -> 48
    //   37: aload_2
    //   38: iload 4
    //   40: aaload
    //   41: pop
    //   42: iinc 4 1
    //   45: goto -14 -> 31
    //   48: invokestatic 1857	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   51: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   54: bipush 7
    //   56: aaload
    //   57: invokevirtual 1663	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   60: ifeq +218 -> 278
    //   63: aload_2
    //   64: arraylength
    //   65: istore 5
    //   67: iconst_0
    //   68: istore 6
    //   70: aconst_null
    //   71: astore 7
    //   73: iload 6
    //   75: iload 5
    //   77: if_icmpge +201 -> 278
    //   80: aload_2
    //   81: iload 6
    //   83: aaload
    //   84: astore 8
    //   86: getstatic 890	com/whatsapp/App:c	Ljava/io/File;
    //   89: invokevirtual 1710	java/io/File:exists	()Z
    //   92: ifne +10 -> 102
    //   95: getstatic 890	com/whatsapp/App:c	Ljava/io/File;
    //   98: invokevirtual 2535	java/io/File:mkdirs	()Z
    //   101: pop
    //   102: new 878	java/io/File
    //   105: dup
    //   106: getstatic 890	com/whatsapp/App:c	Ljava/io/File;
    //   109: aload 8
    //   111: invokevirtual 1345	java/io/File:getName	()Ljava/lang/String;
    //   114: invokespecial 888	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   117: astore 9
    //   119: new 1845	com/whatsapp/pf
    //   122: dup
    //   123: getstatic 1847	com/whatsapp/App:B	Lcom/whatsapp/w5;
    //   126: aload 9
    //   128: invokespecial 1850	com/whatsapp/pf:<init>	(Lcom/whatsapp/w5;Ljava/io/File;)V
    //   131: invokestatic 2979	java/nio/channels/Channels:newChannel	(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    //   134: astore 7
    //   136: new 2631	java/io/FileInputStream
    //   139: dup
    //   140: aload 8
    //   142: invokespecial 2632	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   145: invokevirtual 2983	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   148: astore 17
    //   150: aload 17
    //   152: astore 15
    //   154: aload 15
    //   156: aload 7
    //   158: invokestatic 2988	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   161: aload 15
    //   163: ifnull +8 -> 171
    //   166: aload 15
    //   168: invokevirtual 2991	java/nio/channels/FileChannel:close	()V
    //   171: aload 7
    //   173: ifnull +10 -> 183
    //   176: aload 7
    //   178: invokeinterface 2994 1 0
    //   183: iinc 6 1
    //   186: aload 15
    //   188: astore_1
    //   189: goto -116 -> 73
    //   192: astore 10
    //   194: aload_1
    //   195: astore 11
    //   197: aload 7
    //   199: astore 12
    //   201: aload 11
    //   203: astore 13
    //   205: aload 13
    //   207: ifnull +8 -> 215
    //   210: aload 13
    //   212: invokevirtual 2991	java/nio/channels/FileChannel:close	()V
    //   215: aload 12
    //   217: ifnull +10 -> 227
    //   220: aload 12
    //   222: invokeinterface 2994 1 0
    //   227: aload 10
    //   229: athrow
    //   230: astore 14
    //   232: aload 13
    //   234: astore 15
    //   236: aload 12
    //   238: astore 7
    //   240: aload 14
    //   242: astore 16
    //   244: new 1287	java/lang/StringBuilder
    //   247: dup
    //   248: invokespecial 1288	java/lang/StringBuilder:<init>	()V
    //   251: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   254: sipush 296
    //   257: aaload
    //   258: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload 16
    //   263: invokevirtual 2606	java/io/IOException:toString	()Ljava/lang/String;
    //   266: invokevirtual 1292	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: invokevirtual 1299	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: invokestatic 1806	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   275: goto -92 -> 183
    //   278: return
    //   279: astore 16
    //   281: goto -37 -> 244
    //   284: astore 18
    //   286: aload 7
    //   288: astore 12
    //   290: aload 15
    //   292: astore 13
    //   294: aload 18
    //   296: astore 10
    //   298: goto -93 -> 205
    //
    // Exception table:
    //   from	to	target	type
    //   119	150	192	finally
    //   210	230	230	java/io/IOException
    //   166	183	279	java/io/IOException
    //   154	161	284	finally
  }

  public static void s()
  {
    if (qc)
    {
      g5.c(xc['Ñ']);
      h.a(rc, com.whatsapp.messaging.s.k(xc[' ']));
    }
  }

  static void s(String paramString)
  {
    q(paramString);
  }

  public static boolean sb()
  {
    boolean bool = false;
    if (eb == null);
    while (true)
    {
      return bool;
      NetworkInfo localNetworkInfo = eb.getActiveNetworkInfo();
      if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
        bool = true;
    }
  }

  public static void t()
  {
    if (qc)
    {
      g5.c(xc['²']);
      h.a(rc, com.whatsapp.messaging.s.g());
    }
  }

  public static boolean tb()
  {
    boolean bool1 = true;
    if (Build.VERSION.SDK_INT >= 9);
    try
    {
      boolean bool2 = Environment.isExternalStorageRemovable();
      bool1 = bool2;
      return bool1;
    }
    catch (Exception localException)
    {
      while (true)
        g5.c(xc[''] + localException.toString());
    }
  }

  public static void u()
  {
    if (qc)
      h.a(rc, com.whatsapp.messaging.s.h());
  }

  public static boolean ub()
  {
    if (Locale.getDefault().getLanguage().equals(xc['°']));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static void v()
  {
    boolean bool = DialogToastListActivity.f;
    NetworkInfo[] arrayOfNetworkInfo = eb.getAllNetworkInfo();
    StringBuilder localStringBuilder = new StringBuilder(xc['¥']);
    if (arrayOfNetworkInfo != null)
    {
      int i1 = arrayOfNetworkInfo.length;
      int i2 = 0;
      do
      {
        if (i2 >= i1)
          break;
        NetworkInfo localNetworkInfo = arrayOfNetworkInfo[i2];
        localStringBuilder.append("\n").append(localNetworkInfo.toString()).append(xc['¨']).append(localNetworkInfo.getType()).append(xc['¦']).append(localNetworkInfo.getSubtype());
        i2++;
      }
      while (!bool);
      g5.b(localStringBuilder.toString());
      if (!bool);
    }
    else
    {
      g5.d(xc['§']);
    }
  }

  static boolean vb()
  {
    return ub;
  }

  static String w()
  {
    Object localObject = null;
    PackageManager localPackageManager = Mb.getPackageManager();
    if (localPackageManager == null);
    while (true)
    {
      return localObject;
      String[] arrayOfString = Lb;
      int i1 = arrayOfString.length;
      int i2 = 0;
      label25: if (i2 >= i1)
        continue;
      String str = arrayOfString[i2];
      try
      {
        localPackageManager.getApplicationInfo(str, 0);
        g5.b(xc[82] + str);
        localObject = str;
      }
      catch (RuntimeException localRuntimeException)
      {
        g5.d(xc[82] + localRuntimeException.getMessage());
        int i3 = i2 + 1;
        if (DialogToastListActivity.f)
          continue;
        i2 = i3;
        break label25;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        label110: break label110;
      }
    }
  }

  static boolean wb()
  {
    return vb;
  }

  static void x()
  {
    boolean bool = DialogToastListActivity.f;
    try
    {
      PackageManager localPackageManager = Mb.getPackageManager();
      if (localPackageManager != null)
      {
        List localList = localPackageManager.getInstalledApplications(1152);
        if (localList != null)
        {
          StringBuilder localStringBuilder = new StringBuilder(xc[333]);
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator1 = localList.iterator();
          do
          {
            if (!localIterator1.hasNext())
              break;
            localArrayList.add(((ApplicationInfo)localIterator1.next()).packageName);
          }
          while (!bool);
          Collections.sort(localArrayList);
          Iterator localIterator2 = localArrayList.iterator();
          do
          {
            if (!localIterator2.hasNext())
              break;
            String str = (String)localIterator2.next();
            localStringBuilder.append(" ").append(str);
          }
          while (!bool);
        }
      }
    }
    catch (Exception localException)
    {
      g5.d(xc[332] + localException.toString());
    }
  }

  static File xb()
  {
    return d;
  }

  static boolean yb()
  {
    return qc;
  }

  private static String z(char[] paramArrayOfChar)
  {
    int i1 = paramArrayOfChar.length;
    int i2 = 0;
    if (i1 <= i2)
      return new String(paramArrayOfChar).intern();
    int i3 = paramArrayOfChar[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 29;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 31;
      continue;
      i4 = 97;
      continue;
      i4 = 74;
      continue;
      i4 = 126;
    }
  }

  public static void z()
  {
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    fb.getMemoryInfo(localMemoryInfo);
    g5.b(xc[301] + Formatter.formatFileSize(Mb.getApplicationContext(), localMemoryInfo.availMem) + xc['ë'] + Formatter.formatFileSize(Mb.getApplicationContext(), localMemoryInfo.threshold) + xc[305] + localMemoryInfo.lowMemory);
    long l1 = Runtime.getRuntime().freeMemory();
    long l2 = Runtime.getRuntime().totalMemory();
    long l3 = l2 - l1;
    long l4 = Debug.getNativeHeapFreeSize();
    long l5 = Debug.getNativeHeapAllocatedSize();
    long l6 = l4 + l5;
    long l7 = Runtime.getRuntime().maxMemory();
    g5.b(xc[304] + l7 / 1024L + xc[297] + fb.getMemoryClass() + xc[302]);
    g5.b(xc[299] + l6 / 1024L + xc[298] + l5 / 1024L + xc[307] + l4 / 1024L + xc[300]);
    g5.b(xc[303] + l2 / 1024L + xc[298] + l3 / 1024L + xc[307] + l1 / 1024L + xc[300]);
    g5.b(xc[306] + (l7 - l5 - l3) / 1024L + xc[300]);
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x1D ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  static Messenger zb()
  {
    return rc;
  }

  public void A()
  {
    g5.b(xc[258]);
    try
    {
      if (new File(getFilesDir(), xc['ÿ']).exists())
      {
        ObjectInputStream localObjectInputStream = new ObjectInputStream(openFileInput(xc['ÿ']));
        bb = (App.Me)localObjectInputStream.readObject();
        localObjectInputStream.close();
      }
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        g5.c(xc[257] + localClassNotFoundException.toString());
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(xc[256] + localIOException.toString());
    }
  }

  // ERROR //
  String G()
  {
    // Byte code:
    //   0: new 878	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 1335	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   8: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   11: bipush 113
    //   13: aaload
    //   14: invokespecial 888	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   17: invokevirtual 1710	java/io/File:exists	()Z
    //   20: ifeq +38 -> 58
    //   23: new 2753	java/io/ObjectInputStream
    //   26: dup
    //   27: aload_0
    //   28: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   31: bipush 113
    //   33: aaload
    //   34: invokevirtual 2512	com/whatsapp/App:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   37: invokespecial 2754	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: astore 6
    //   42: aload 6
    //   44: invokevirtual 3125	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   47: checkcast 184	java/lang/String
    //   50: astore_2
    //   51: aload 6
    //   53: invokevirtual 2761	java/io/ObjectInputStream:close	()V
    //   56: aload_2
    //   57: areturn
    //   58: getstatic 870	com/whatsapp/App:xc	[Ljava/lang/String;
    //   61: sipush 190
    //   64: aaload
    //   65: invokestatic 1697	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   68: aconst_null
    //   69: astore_2
    //   70: goto -14 -> 56
    //   73: astore 4
    //   75: aconst_null
    //   76: astore_2
    //   77: aload 4
    //   79: astore 5
    //   81: aload 5
    //   83: invokestatic 2721	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   86: goto -30 -> 56
    //   89: astore_1
    //   90: aconst_null
    //   91: astore_2
    //   92: aload_1
    //   93: astore_3
    //   94: aload_3
    //   95: invokestatic 2721	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   98: goto -42 -> 56
    //   101: astore_3
    //   102: goto -8 -> 94
    //   105: astore 5
    //   107: goto -26 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   0	51	73	java/lang/ClassNotFoundException
    //   58	68	73	java/lang/ClassNotFoundException
    //   0	51	89	java/io/IOException
    //   58	68	89	java/io/IOException
    //   51	56	101	java/io/IOException
    //   51	56	105	java/lang/ClassNotFoundException
  }

  public boolean I()
  {
    boolean bool = true;
    if (H != null);
    while (true)
    {
      return bool;
      Date localDate = new Date();
      if (o == null)
        H();
      if (o != null)
      {
        if (localDate.before(new Date(o.getTime() - 7776000000L - 172800000L)))
        {
          H = localDate;
        }
        else
        {
          bool = localDate.after(new Date(7776000000L + o.getTime()));
          if (bool)
            H = localDate;
        }
      }
      else
        bool = false;
    }
  }

  void L()
  {
    g5.c(xc[25]);
    getApplicationContext().stopService(new Intent(this, MessageService.class));
  }

  void M()
  {
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(this.Rb), 134217728);
    ((AlarmManager)getSystemService(xc[5])).setRepeating(3, 0L, 3600000L, localPendingIntent);
  }

  void N()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(5, 1);
    localCalendar.set(14, 0);
    localCalendar.set(13, 0);
    localCalendar.set(12, 0);
    localCalendar.set(11, 0);
    long l1 = localCalendar.getTimeInMillis();
    Date localDate = new Date(l1);
    g5.b(xc['¹'] + localDate.toString());
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(this.Sb), 134217728);
    ((AlarmManager)getSystemService(xc[5])).setRepeating(0, l1, 86400000L, localPendingIntent);
  }

  void O()
  {
    Calendar localCalendar = Calendar.getInstance();
    if (localCalendar.get(11) >= 4)
      localCalendar.add(5, 1);
    localCalendar.set(14, 0);
    localCalendar.set(13, 0);
    localCalendar.set(12, 0);
    localCalendar.set(11, 4);
    long l1 = localCalendar.getTimeInMillis();
    Date localDate = new Date(l1);
    g5.b(xc[6] + localDate.toString());
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(this.Tb), 134217728);
    ((AlarmManager)getSystemService(xc[5])).setRepeating(0, l1, 86400000L, localPendingIntent);
  }

  void P()
  {
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(this.Ub), 134217728);
    AlarmManager localAlarmManager = (AlarmManager)getSystemService(xc[5]);
    Calendar localCalendar = Calendar.getInstance();
    if (localCalendar.get(11) >= 10)
      localCalendar.add(5, 1);
    localCalendar.set(14, 0);
    localCalendar.set(13, 0);
    localCalendar.set(12, 0);
    localCalendar.set(11, 10);
    long l1 = localCalendar.getTimeInMillis();
    Date localDate = new Date(l1);
    g5.b(xc[311] + localDate.toString());
    localAlarmManager.setRepeating(1, l1, 86400000L, localPendingIntent);
  }

  public void a(String paramString)
  {
    SharedPreferences.Editor localEditor = getSharedPreferences(getString(2131296258), 0).edit();
    localEditor.putString(xc[21], paramString);
    if (!localEditor.commit())
      g5.d(xc[86]);
  }

  public void b(long paramLong)
  {
    M = c(paramLong);
  }

  public void b(boolean paramBoolean)
  {
    this.Y = paramBoolean;
    if ((!paramBoolean) && (this.X != null))
    {
      this.X.a();
      this.X = null;
    }
  }

  public int e(boolean paramBoolean)
  {
    return a(getSharedPreferences(getString(2131296258), 0), paramBoolean);
  }

  public long hb()
  {
    if (M == -1L)
      M = ib();
    return M;
  }

  public void onCreate()
  {
    boolean bool1 = DialogToastListActivity.f;
    super.onCreate();
    Mb = this;
    d = new File(getFilesDir(), xc[101]);
    p5 localp5 = new p5();
    localp5.b(xc[124]);
    B = new w5(new File(c, xc[114]));
    C = new w5(new File(getFilesDir(), xc[114]));
    l = getString(2131296263);
    if (xc[''].equals(l))
      rb();
    m = getString(2131296257);
    j = getString(2131296260);
    i = getString(2131296256);
    k = getString(2131296261);
    h = Boolean.parseBoolean(getString(2131296264));
    a = getString(2131296600);
    d();
    Z = new vu(getResources());
    w5.b(new File(c, xc[89]));
    File localFile1 = new File(c, xc[92]);
    File localFile2 = new File(c, et.a);
    if ((localFile1.exists()) && (localFile1.isDirectory()))
    {
      g5.b(xc[96]);
      localFile1.renameTo(localFile2);
    }
    if (localFile1.delete())
      g5.b(xc['']);
    File localFile3 = new File(c, xc['']);
    File localFile4 = new File(c, et.b);
    if ((localFile3.exists()) && (localFile3.isDirectory()))
    {
      g5.b(xc['']);
      localFile3.renameTo(localFile4);
    }
    if (localFile3.delete())
      g5.b(xc['']);
    File localFile5 = new File(c, xc[88]);
    File localFile6 = new File(c, et.c);
    if ((localFile5.exists()) && (localFile5.isDirectory()))
    {
      g5.b(xc['']);
      localFile5.renameTo(localFile6);
    }
    if (localFile5.delete())
      g5.b(xc['']);
    File localFile7 = new File(c, xc[103]);
    File localFile8 = new File(c, xc[125]);
    if ((localFile7.exists()) && (localFile7.isDirectory()))
    {
      g5.b(xc['']);
      localFile7.renameTo(localFile8);
      sendBroadcast(new Intent(xc[112], Uri.parse(xc[120] + localFile8.getAbsolutePath())));
    }
    if (localFile7.delete())
      g5.b(xc[119]);
    String str1 = Mb.getString(2131296258);
    SharedPreferences localSharedPreferences2;
    SharedPreferences.Editor localEditor3;
    if (str1 != null)
    {
      localSharedPreferences2 = Mb.getSharedPreferences(str1, 0);
      if (localSharedPreferences2 != null)
        if (localSharedPreferences2.contains(xc['']))
          localEditor3 = localSharedPreferences2.edit();
    }
    try
    {
      if (!localSharedPreferences2.getBoolean(xc[''], true))
      {
        localEditor3.putString(xc[''], "0");
        if (!bool1);
      }
      else
      {
        localEditor3.putString(xc[''], "1");
      }
      localEditor3.remove(xc['']);
      if (!localEditor3.commit())
        g5.d(xc[102]);
      if (localSharedPreferences2.contains(xc[95]))
        localEditor2 = localSharedPreferences2.edit();
    }
    catch (ClassCastException localClassCastException2)
    {
      try
      {
        SharedPreferences.Editor localEditor2;
        if (!localSharedPreferences2.getBoolean(xc[95], true))
        {
          localEditor2.putString(xc[''], "0");
          if (!bool1);
        }
        else
        {
          localEditor2.putString(xc[''], "1");
        }
        localEditor2.remove(xc[95]);
        if (!localEditor2.commit())
          g5.d(xc[102]);
        String str2 = Environment.getExternalStorageState();
        if (xc[7].equals(str2))
        {
          lb = false;
          mb = false;
          if (!bool1);
        }
        else if (xc[8].equals(str2))
        {
          lb = false;
          mb = true;
          g5.b(xc[90]);
          if (!bool1);
        }
        else
        {
          lb = true;
          mb = false;
          g5.b(xc[''] + str2);
        }
        if (xc[127].equals(l))
        {
          f = 0;
          if (!bool1);
        }
        else if (xc[''].equals(l))
        {
          f = 1;
          if (!bool1);
        }
        else if (xc[''].equals(l))
        {
          f = 2;
          if (!bool1);
        }
        else if (xc[''].equals(l))
        {
          f = 3;
        }
        if (xc[109].equals(m))
        {
          g = 0;
          if (!bool1);
        }
        else if (xc[122].equals(m))
        {
          g = 1;
          if (!bool1);
        }
        else
        {
          g = 1;
        }
        switch (f)
        {
        default:
          g5.a(5);
          String str3 = getString(2131296258);
          if (str3 != null)
          {
            SharedPreferences localSharedPreferences1 = getSharedPreferences(str3, 0);
            if (localSharedPreferences1 != null)
            {
              n7 localn71 = n7.a(localSharedPreferences1.getString(xc[94], xc[104]));
              if (localn71 != null)
              {
                n7 localn72 = n7.a(j);
                if (localn72 != null)
                {
                  s = localn72.a(localn71);
                  if (s != 0)
                  {
                    k4.h();
                    SharedPreferences.Editor localEditor1 = localSharedPreferences1.edit();
                    if (!localEditor1.putString(xc[94], j).commit())
                      g5.d(xc[117]);
                    if (c(this) < 3)
                      a(this, 0);
                    if ((localn71.a == 2) && (localn71.b == 7) && (localn71.c >= 7026) && (localn71.c <= 8325) && (!localEditor1.putBoolean(xc[''], true).commit()))
                      g5.d(xc[100]);
                  }
                }
              }
              this.Y = localSharedPreferences1.getBoolean(xc[''], true);
              O = a(localSharedPreferences1);
              localSharedPreferences1.registerOnSharedPreferenceChangeListener(this.hc);
              P = true;
            }
          }
          if (d.exists())
          {
            if (s == 0)
            {
              bool4 = true;
              r = bool4;
              d.delete();
            }
          }
          else
          {
            if (e.exists())
              e.delete();
            F();
            fb = (ActivityManager)getSystemService(xc[123]);
            db = (TelephonyManager)getSystemService(xc['']);
            eb = (ConnectivityManager)getSystemService(xc[116]);
            gb = (NotificationManager)getSystemService(xc[99]);
            ib = getContentResolver();
            hb = getPackageManager();
            jb = (AudioManager)getSystemService(xc['']);
            List localList = fb.getRunningAppProcesses();
            if (localList == null)
              break label2905;
            Iterator localIterator = localList.iterator();
            i3 = 1;
            if (!localIterator.hasNext())
              break label2898;
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if ((Process.myPid() != localRunningAppProcessInfo.pid) || (localRunningAppProcessInfo.processName == null) || ((!localRunningAppProcessInfo.processName.equals(xc[91])) && (!localRunningAppProcessInfo.processName.equals(xc[106]))))
              break label2891;
            g5.b(xc[115] + localRunningAppProcessInfo.processName);
            if (!bool1)
              break label2885;
            i1 = 0;
            if (!bool1)
              break label2878;
            if (i1 != 0)
            {
              a(localList);
              if (!bool1)
                break label1812;
            }
            g5.b(xc[98]);
            return;
            localClassCastException2 = localClassCastException2;
            g5.b(xc[126], localClassCastException2);
          }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      catch (ClassCastException localClassCastException1)
      {
        while (true)
        {
          boolean bool4;
          int i3;
          int i1;
          g5.b(xc[''], localClassCastException1);
          continue;
          g5.a(3);
          if (bool1)
          {
            g5.a(4);
            if (bool1)
            {
              g5.a(4);
              if (bool1)
              {
                g5.a(5);
                if (bool1)
                {
                  continue;
                  bool4 = false;
                  continue;
                  label1812: HandlerThread localHandlerThread = new HandlerThread(xc[''], 10);
                  localHandlerThread.start();
                  uc = new Handler(localHandlerThread.getLooper());
                  H();
                  if (f >= 1)
                    x();
                  v();
                  db.listen(Db, 32);
                  String str4 = null;
                  try
                  {
                    str4 = db.getDeviceId();
                    int i2 = f;
                    if (i2 == 2);
                    str5 = str4;
                    if (str5 == null)
                    {
                      str5 = G();
                      if (f != 2);
                    }
                    if (str5 != null)
                    {
                      cb = mh.c(str5);
                      localFile9 = new File(getFilesDir(), xc[113]);
                      if (localFile9.exists());
                    }
                  }
                  catch (Exception localNullPointerException)
                  {
                    try
                    {
                      File localFile9;
                      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(localFile9));
                      localObjectOutputStream.writeObject(str5);
                      localObjectOutputStream.close();
                      if (bool1)
                        g5.d(xc['']);
                      A();
                      e4.a(getFilesDir());
                      g5.b(xc[111] + Formatter.formatFileSize(this, k()));
                      l(this);
                    }
                    catch (IOException localNullPointerException)
                    {
                      try
                      {
                        if (!((PowerManager)getSystemService(xc[93])).isScreenOn())
                        {
                          bool3 = true;
                          u = bool3;
                          z = new fq(this);
                          fq.c();
                          if (c(this) == 6)
                            DeleteAccountConfirmation.a();
                          x = new eu(this);
                          gp.a();
                          z.a(ab);
                          w = new qp(this);
                          y = new yy();
                          if ((bb != null) && (z.d()))
                          {
                            g5.b(xc[121]);
                            z.a();
                            z.a(null);
                            m(this);
                            MessageService.a(this);
                            B();
                            O();
                          }
                          PreferenceManager.setDefaultValues(this, 2131034116, false);
                          getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, lc);
                          qb();
                          gb.cancel(2);
                          IntentFilter localIntentFilter1 = new IntentFilter(xc['']);
                          registerReceiver(this.Wb, localIntentFilter1);
                          IntentFilter localIntentFilter2 = new IntentFilter(xc[97]);
                          registerReceiver(this.Xb, localIntentFilter2);
                          IntentFilter localIntentFilter3 = new IntentFilter(this.Rb);
                          registerReceiver(this.Yb, localIntentFilter3);
                          M();
                          IntentFilter localIntentFilter4 = new IntentFilter(this.Sb);
                          registerReceiver(this.Zb, localIntentFilter4);
                          N();
                          IntentFilter localIntentFilter5 = new IntentFilter(this.Tb);
                          registerReceiver(this.fc, localIntentFilter5);
                          IntentFilter localIntentFilter6 = new IntentFilter(xc['']);
                          localIntentFilter6.addAction(xc['']);
                          registerReceiver(this.gc, localIntentFilter6);
                          IntentFilter localIntentFilter7 = new IntentFilter(xc[110]);
                          registerReceiver(this.ac, localIntentFilter7);
                          IntentFilter localIntentFilter8 = new IntentFilter(xc[108]);
                          registerReceiver(this.bc, localIntentFilter8);
                          IntentFilter localIntentFilter9 = new IntentFilter(this.Ub);
                          registerReceiver(this.cc, localIntentFilter9);
                          P();
                          R();
                          IntentFilter localIntentFilter10 = new IntentFilter(Vb);
                          registerReceiver(this.dc, localIntentFilter10);
                          IntentFilter localIntentFilter11 = new IntentFilter(xc['']);
                          registerReceiver(this.ec, localIntentFilter11);
                          C.f();
                          boolean bool2 = eb.getBackgroundDataSetting();
                          g5.b(xc[105] + bool2);
                          if (!bool2)
                            c(this, true);
                          g5.b(xc[''] + i(this));
                          if (g == 1)
                            if (bb != null)
                              k4.a(bb.jabber_id);
                        }
                      }
                      catch (NullPointerException localNullPointerException)
                      {
                        try
                        {
                          while (true)
                          {
                            if ((ib != null) && (Settings.Secure.getInt(ib, xc['']) == 1))
                              k4.a(this, j);
                            label2675: j5.a();
                            D = w();
                            mh.a(this);
                            a(this);
                            if (a())
                            {
                              g5.b(xc[118]);
                              new Handler().postDelayed(new vh(this), 2600L);
                            }
                            if (f == 3)
                            {
                              DisplayMetrics localDisplayMetrics = new DisplayMetrics();
                              ((WindowManager)getSystemService(xc[107])).getDefaultDisplay().getMetrics(localDisplayMetrics);
                            }
                            localp5.b();
                            break;
                            localException = localException;
                            g5.c(xc[''] + localException.toString());
                            String str5 = str4;
                            continue;
                            localIOException = localIOException;
                            g5.d(localIOException);
                            continue;
                            boolean bool3 = false;
                          }
                          localNullPointerException = localNullPointerException;
                          g5.c(xc[''] + localNullPointerException.toString());
                          u = false;
                        }
                        catch (Settings.SettingNotFoundException localSettingNotFoundException)
                        {
                          break label2675;
                        }
                      }
                    }
                  }
                  label2878: i3 = i1;
                  continue;
                  label2885: i1 = 0;
                  continue;
                  label2891: i1 = i3;
                  continue;
                  label2898: i1 = i3;
                  continue;
                  label2905: i1 = 1;
                }
              }
            }
          }
        }
      }
    }
  }

  public void onLowMemory()
  {
    g5.c(xc[22]);
  }

  public void onTerminate()
  {
    g5.b(xc['Û']);
    super.onTerminate();
  }

  public void y()
  {
    int i1 = 0;
    boolean bool = DialogToastListActivity.f;
    Debug.MemoryInfo localMemoryInfo = new Debug.MemoryInfo();
    Debug.getMemoryInfo(localMemoryInfo);
    g5.b(xc['Æ'] + localMemoryInfo.getTotalPrivateDirty() + xc['È'] + xc['É'] + localMemoryInfo.getTotalPss() + xc['È'] + xc['Å'] + localMemoryInfo.getTotalSharedDirty() + xc['È']);
    List localList = fb.getRunningAppProcesses();
    if (localList == null)
    {
      g5.c(xc['Ç']);
      if (!bool)
        break label283;
    }
    try
    {
      int[] arrayOfInt = new int[localList.size()];
      i2 = 0;
      if (i2 < localList.size())
      {
        arrayOfInt[i2] = ((ActivityManager.RunningAppProcessInfo)localList.get(i2)).pid;
        i4 = i2 + 1;
        if (!bool);
      }
      else
      {
        Debug.MemoryInfo[] arrayOfMemoryInfo = fb.getProcessMemoryInfo(arrayOfInt);
        if (arrayOfMemoryInfo != null)
        {
          int i3 = 0;
          do
          {
            if (i1 >= arrayOfMemoryInfo.length)
              break;
            i3 += arrayOfMemoryInfo[i1].getTotalPss();
            i1++;
          }
          while (!bool);
          g5.b(xc['¿'] + arrayOfMemoryInfo.length + xc['Â'] + i3);
        }
        label283: g5.b(xc['Ã'] + Nb + "%" + xc['À'] + Ob + xc['Á'] + Pb);
        z();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i4;
        g5.b(xc['Ä'] + localException.toString());
        continue;
        int i2 = i4;
      }
    }
  }
}