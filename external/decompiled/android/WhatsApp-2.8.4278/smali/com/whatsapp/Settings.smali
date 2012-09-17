.class public Lcom/whatsapp/Settings;
.super Landroid/preference/PreferenceActivity;
.source "Settings.java"

# interfaces
.implements Lcom/whatsapp/lr;


# static fields
.field private static g:Landroid/view/Display;

.field static final l:Ljava/text/SimpleDateFormat;

.field static final m:Ljava/text/SimpleDateFormat;

.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/content/pm/PackageManager;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Lcom/whatsapp/ed;

.field private f:Landroid/preference/CheckBoxPreference;

.field private h:Ljava/lang/String;

.field private i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/bq;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field n:Landroid/preference/Preference$OnPreferenceChangeListener;

.field o:Landroid/preference/Preference$OnPreferenceChangeListener;

.field p:Landroid/preference/Preference$OnPreferenceChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x71

    const/16 v4, 0x6d

    const/16 v1, 0x68

    const/4 v6, 0x0

    const/16 v3, 0x18

    const/16 v0, 0x45

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\n\u001dw{\u00067\u001dqk\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v10, 0x1

    const-string v0, "\u001b\u0014ll\u0004\u0006\u0016k7\u001f\r\u0002mu\u0008G\u0006jw\u0003\u000f\\kl\u000c\u001c\u00148"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\u001b\u0014ll\u0004\u0006\u0016k7\u001a\t\u001dth\u000c\u0018\u0014j7\u001f\r\u0002}l"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "\u001b\u0014ll\u0004\u0006\u0016k7\u001a\t\u001dth\u000c\u0018\u0014j7\t\r\u0017ym\u0001\u001c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "\u001f\u0010tt\u001d\t\u0001}jB\u001b\u0014lm\u001dG\u0002j{W"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "\u0006\u001e5k\u001d\t\u0012}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "\u001b\u0012yt\u0008=\u0001Q~#\r\u0014|}\t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "\u001f\u0010tt\u001d\t\u0001}jM\u000e\u0003wuM\u0018\u0016s\""

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "\u0007\u0004lh\u0018\u001c7wj\u0000\t\u0005"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_8
    if-gt v7, v8, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, "\r\u0003jw\u001fE\u001ewu"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_9
    if-gt v7, v8, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xa

    const-string v0, "\u0007\u0004lh\u0018\u001c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_a
    if-gt v7, v8, :cond_a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xb

    const-string v0, "H*"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_b
    if-gt v7, v8, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xc

    const-string v0, "\u000b\u001evn\u0008\u001a\u0002yl\u0004\u0007\u001f7y\u000e\u001c\u0018nq\u0019\u0011\u0003}kB\u0006\u001e5k\u001d\t\u0012}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_c
    if-gt v7, v8, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xd

    const-string v0, "\u001a\u0014|Q\t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_d
    if-gt v7, v8, :cond_d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xe

    const-string v0, "\u0001\u001e5}\u001f\u001a\u001ej"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_e
    if-gt v7, v8, :cond_e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xf

    const-string v0, "\n\u0004{s\u0008\u001c.|q\u001e\u0018\u001dya2\u0006\u0010u}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_f
    if-gt v7, v8, :cond_f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x10

    const-string v0, "\u000b\u001evl\u000c\u000b\u0005"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_10
    if-gt v7, v8, :cond_10

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x11

    const-string v0, "\u0007\u0004lh\u0018\u001c("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_11
    if-gt v7, v8, :cond_11

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x12

    const-string v0, "\u0001\u0002G|\u0008\u000e\u0010mt\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_12
    if-gt v7, v8, :cond_12

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x13

    const-string v0, "\u0001\u0002Gj\u0008\u001b\u0014l"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_13
    if-gt v7, v8, :cond_13

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x14

    const-string v0, "\u001b\u0014ll\u0004\u0006\u0016k7\u001a\t\u001dth\u000c\u0018\u0014j7\u0004\u0006\u0007yt\u0004\u000c.~q\u0001\rK"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_14
    if-gt v7, v8, :cond_14

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x15

    const-string v0, "\u000b\u001evn\u0008\u001a\u0002yl\u0004\u0007\u001f7y\u000e\u001c\u0018nq\u0019\u0011\u0003}kB\u0007\u001eu5\u0008\u001a\u0003wj"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_15
    if-gt v7, v8, :cond_15

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x16

    const-string v0, "\u000b\u0003wh/\u0011>ml\u001d\u001d\u0005Kq\u0017\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_16
    if-gt v7, v8, :cond_16

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x17

    const-string v0, "\u000b\u001evn\u0008\u001a\u0002yl\u0004\u0007\u001f7y\u000e\u001c\u0018nq\u0019\u0011\u0003}k\u0018\u0004\u00057{\u001f\u0007\u0001qu\u000c\u000f\u00147w\u0002\u0005\\}j\u001f\u0007\u0003"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_17
    if-gt v7, v8, :cond_17

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "\u0007\u0004lh\u0018\u001c)"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_18
    if-gt v7, v8, :cond_18

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v3

    const/16 v10, 0x19

    const-string v0, "\u000b\u001evn\u0008\u001a\u0002yl\u0004\u0007\u001f7y\u000e\u001c\u0018nq\u0019\u0011\u0003}kB\u000e\u0010qtB\u0004\u001ey|@\u0001\u001cy\u007f\u0008"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_19
    if-gt v7, v8, :cond_19

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1a

    const-string v0, "\u001b\u0012yt\u0008"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1a
    if-gt v7, v8, :cond_1a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1b

    const-string v0, "\u001f\u0010tt\u001d\t\u0001}jB\u000b\u0003whB\u0000\u0014q\u007f\u0005\u001cK"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1b
    if-gt v7, v8, :cond_1b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1c

    const-string v0, "H\r8"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1c
    if-gt v7, v8, :cond_1c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1d

    const-string v0, "\u0007\u001eu"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1d
    if-gt v7, v8, :cond_1d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1e

    const-string v0, "\u0005\u0002\u007fk\u0019\u0007\u0003}G\u000f\t\u0012sm\u001d7\u001fwo"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1e
    if-gt v7, v8, :cond_1e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1f

    const-string v0, "\u0006\u001elq\u000b\u0011.hw\u001d\u001d\u0001Gu\u0002\u000c\u0014"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1f
    if-gt v7, v8, :cond_1f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x20

    const-string v0, "\r\u001cyq\u00017\u0012py\u00197\u0019qk\u0019\u0007\u0003a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_20
    if-gt v7, v8, :cond_20

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x21

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u001f\r\u0002}l"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_21
    if-gt v7, v8, :cond_21

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x22

    const-string v0, "\u0000\u0014th"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_22
    if-gt v7, v8, :cond_22

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x23

    const-string v0, "\u0006\u001elq\u000b\u0001\u0012yl\u0004\u0007\u001f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_23
    if-gt v7, v8, :cond_23

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x24

    const-string v0, "\u0001\u001fhm\u00197\u0014vl\u0008\u001a.k}\u0003\u000c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_24
    if-gt v7, v8, :cond_24

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x25

    const-string v0, "\u000f\u0014v}\u001f\t\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_25
    if-gt v7, v8, :cond_25

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x26

    const-string v0, "\u000f\u0003wm\u001d7\u001fwl\u0004\u000e\u0008Gh\u0002\u0018\u0004hG\u0000\u0007\u0015}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_26
    if-gt v7, v8, :cond_26

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x27

    const-string v0, "\u0006\u001elq\u000b\u0011.nq\u000f\u001a\u0010l}2\u0004\u0014v\u007f\u0019\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_27
    if-gt v7, v8, :cond_27

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x28

    const-string v0, "\u0010\t``\u0015\u0010\t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_28
    if-gt v7, v8, :cond_28

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x29

    const-string v0, "\t\u0013wm\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_29
    if-gt v7, v8, :cond_29

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2a

    const-string v0, "RQ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2a
    if-gt v7, v8, :cond_2a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2b

    const-string v0, "\u0001\u001fl}\u001f\u000e\u0010{}2\u000e\u001evl2\u001b\u0018b}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2b
    if-gt v7, v8, :cond_2b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2c

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2c
    if-gt v7, v8, :cond_2c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2d

    const-string v0, "\u000f\u0003wm\u001d7\u001fwl\u0004\u000e\u0018{y\u0019\u0001\u001ev"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2d
    if-gt v7, v8, :cond_2d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2e

    const-string v0, "\u000f\u0003wm\u001d7\u001fwl\u0004\u000e\u0008Gt\u0004\u000f\u0019lG\u000e\u0007\u001dwj"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2e
    if-gt v7, v8, :cond_2e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2f

    const-string v0, "\u001b\u0014ll\u0004\u0006\u0016kG\u001a\t\u001dth\u000c\u0018\u0014j"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2f
    if-gt v7, v8, :cond_2f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x30

    const-string v0, "\u000f\u0003wm\u001d7\u001fwl\u0004\u000e\u0008Gn\u0004\n\u0003yl\u00087\u001d}v\n\u001c\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_30
    if-gt v7, v8, :cond_30

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x31

    const-string v0, "\u001b\u0019wo2\t\u001dtG\u000e\u0007\u001fly\u000e\u001c\u0002"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_31
    if-gt v7, v8, :cond_31

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x32

    const-string v0, "\t\u0012{w\u0018\u0006\u0005Gq\u0003\u000e\u001e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_32
    if-gt v7, v8, :cond_32

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x33

    const-string v0, "\u000b\u001evl\u000c\u000b\u0005Gm\u001e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_33
    if-gt v7, v8, :cond_33

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x34

    const-string v0, "\u001b\u0008kl\u0008\u0005.kl\u000c\u001c\u0004k"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_34
    if-gt v7, v8, :cond_34

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x35

    const-string v0, "\u0018\u0004kp2\u0006\u0010u}"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_35
    if-gt v7, v8, :cond_35

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x36

    const-string v0, "\u0006\u001elq\u000b\u0011.tq\n\u0000\u0005G{\u0002\u0004\u001ej"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_36
    if-gt v7, v8, :cond_36

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x37

    const-string v0, "\u0018\u0003w~\u0004\u0004\u0014Gq\u0003\u000e\u001e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_37
    if-gt v7, v8, :cond_37

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x38

    const-string v0, "\u001c\u0014tt2\t.~j\u0004\r\u001f|"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_38
    if-gt v7, v8, :cond_38

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x39

    const-string v0, "\u001b\u0014ll\u0004\u0006\u0016kG\u000e\u0000\u0010l"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_39
    if-gt v7, v8, :cond_39

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3a

    const-string v0, "\t\u0004lw\t\u0007\u0006vt\u0002\t\u0015Gq\u0000\t\u0016}k"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3a
    if-gt v7, v8, :cond_3a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3b

    const-string v0, "\u000c\u0014t}\u0019\r.y{\u000e\u0007\u0004vl"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3b
    if-gt v7, v8, :cond_3b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3c

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0000\r\u0015qy2\n\u0008l}\u001e7\u0002}v\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3c
    if-gt v7, v8, :cond_3c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3d

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0019\u0007\u0005yt2\n\u0008l}\u001e7\u0003}{\u0008\u0001\u0007}|"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3d
    if-gt v7, v8, :cond_3d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3e

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0000\r\u0015qy2\n\u0008l}\u001e7\u0003}{\u0008\u0001\u0007}|"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3e
    if-gt v7, v8, :cond_3e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3f

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0000\r\u0002ky\n\r\u0002Gk\u0008\u0006\u0005"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3f
    if-gt v7, v8, :cond_3f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x40

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0000\r\u0002ky\n\r.za\u0019\r\u0002Gj\u0008\u000b\u0014qn\u0008\u000c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_40
    if-gt v7, v8, :cond_40

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x41

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0000\r\u0002ky\n\r.za\u0019\r\u0002Gk\u0008\u0006\u0005"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_41
    if-gt v7, v8, :cond_41

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x42

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0000\r\u0002ky\n\r\u0002Gj\u0008\u000b\u0014qn\u0008\u000c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_42
    if-gt v7, v8, :cond_42

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x43

    const-string v0, "\u0006\u0014lo\u0002\u001a\u001aGm\u001e\t\u0016}G\u0019\u0007\u0005yt2\n\u0008l}\u001e7\u0002}v\u0019"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_43
    if-gt v7, v8, :cond_43

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x44

    const-string v0, "\u0011\u0008aa@%<U5\t\u000cQPPW\u0005\u001c\"k\u001e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_44
    if-gt v6, v7, :cond_44

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    .line 128
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x44

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whatsapp/Settings;->l:Ljava/text/SimpleDateFormat;

    .line 201
    sget-object v0, Lcom/whatsapp/Settings;->l:Ljava/text/SimpleDateFormat;

    sput-object v0, Lcom/whatsapp/Settings;->m:Ljava/text/SimpleDateFormat;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_45
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_45

    :pswitch_1
    move v0, v2

    goto :goto_45

    :pswitch_2
    move v0, v3

    goto :goto_45

    :pswitch_3
    move v0, v3

    goto :goto_45

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_46

    :pswitch_5
    move v0, v2

    goto :goto_46

    :pswitch_6
    move v0, v3

    goto :goto_46

    :pswitch_7
    move v0, v3

    goto :goto_46

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_47

    :pswitch_9
    move v0, v2

    goto :goto_47

    :pswitch_a
    move v0, v3

    goto :goto_47

    :pswitch_b
    move v0, v3

    goto :goto_47

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_48

    :pswitch_d
    move v0, v2

    goto :goto_48

    :pswitch_e
    move v0, v3

    goto :goto_48

    :pswitch_f
    move v0, v3

    goto :goto_48

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_49

    :pswitch_11
    move v0, v2

    goto :goto_49

    :pswitch_12
    move v0, v3

    goto :goto_49

    :pswitch_13
    move v0, v3

    goto :goto_49

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_4a

    :pswitch_15
    move v0, v2

    goto :goto_4a

    :pswitch_16
    move v0, v3

    goto :goto_4a

    :pswitch_17
    move v0, v3

    goto :goto_4a

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_4b

    :pswitch_19
    move v0, v2

    goto :goto_4b

    :pswitch_1a
    move v0, v3

    goto :goto_4b

    :pswitch_1b
    move v0, v3

    goto :goto_4b

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_4c

    :pswitch_1d
    move v0, v2

    goto :goto_4c

    :pswitch_1e
    move v0, v3

    goto :goto_4c

    :pswitch_1f
    move v0, v3

    goto :goto_4c

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_4d

    :pswitch_21
    move v0, v2

    goto :goto_4d

    :pswitch_22
    move v0, v3

    goto :goto_4d

    :pswitch_23
    move v0, v3

    goto :goto_4d

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_4e

    :pswitch_25
    move v0, v2

    goto :goto_4e

    :pswitch_26
    move v0, v3

    goto :goto_4e

    :pswitch_27
    move v0, v3

    goto :goto_4e

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_4f

    :pswitch_29
    move v0, v2

    goto :goto_4f

    :pswitch_2a
    move v0, v3

    goto :goto_4f

    :pswitch_2b
    move v0, v3

    goto :goto_4f

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_50

    :pswitch_2d
    move v0, v2

    goto :goto_50

    :pswitch_2e
    move v0, v3

    goto :goto_50

    :pswitch_2f
    move v0, v3

    goto :goto_50

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_51

    :pswitch_31
    move v0, v2

    goto :goto_51

    :pswitch_32
    move v0, v3

    goto :goto_51

    :pswitch_33
    move v0, v3

    goto :goto_51

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_52

    :pswitch_35
    move v0, v2

    goto :goto_52

    :pswitch_36
    move v0, v3

    goto :goto_52

    :pswitch_37
    move v0, v3

    goto :goto_52

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_53

    :pswitch_39
    move v0, v2

    goto :goto_53

    :pswitch_3a
    move v0, v3

    goto :goto_53

    :pswitch_3b
    move v0, v3

    goto :goto_53

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_54
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_54

    :pswitch_3d
    move v0, v2

    goto :goto_54

    :pswitch_3e
    move v0, v3

    goto :goto_54

    :pswitch_3f
    move v0, v3

    goto :goto_54

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_55

    :pswitch_41
    move v0, v2

    goto :goto_55

    :pswitch_42
    move v0, v3

    goto :goto_55

    :pswitch_43
    move v0, v3

    goto :goto_55

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_56

    :pswitch_45
    move v0, v2

    goto :goto_56

    :pswitch_46
    move v0, v3

    goto :goto_56

    :pswitch_47
    move v0, v3

    goto :goto_56

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_57

    :pswitch_49
    move v0, v2

    goto :goto_57

    :pswitch_4a
    move v0, v3

    goto :goto_57

    :pswitch_4b
    move v0, v3

    goto :goto_57

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_58

    :pswitch_4d
    move v0, v2

    goto :goto_58

    :pswitch_4e
    move v0, v3

    goto :goto_58

    :pswitch_4f
    move v0, v3

    goto :goto_58

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_59

    :pswitch_51
    move v0, v2

    goto :goto_59

    :pswitch_52
    move v0, v3

    goto :goto_59

    :pswitch_53
    move v0, v3

    goto :goto_59

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_5a

    :pswitch_55
    move v0, v2

    goto :goto_5a

    :pswitch_56
    move v0, v3

    goto :goto_5a

    :pswitch_57
    move v0, v3

    goto :goto_5a

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_5b

    :pswitch_59
    move v0, v2

    goto :goto_5b

    :pswitch_5a
    move v0, v3

    goto :goto_5b

    :pswitch_5b
    move v0, v3

    goto :goto_5b

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_5c

    :pswitch_5d
    move v0, v2

    goto :goto_5c

    :pswitch_5e
    move v0, v3

    goto :goto_5c

    :pswitch_5f
    move v0, v3

    goto :goto_5c

    :cond_18
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_5d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_5d

    :pswitch_61
    move v0, v2

    goto :goto_5d

    :pswitch_62
    move v0, v3

    goto :goto_5d

    :pswitch_63
    move v0, v3

    goto :goto_5d

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_5e

    :pswitch_65
    move v0, v2

    goto :goto_5e

    :pswitch_66
    move v0, v3

    goto :goto_5e

    :pswitch_67
    move v0, v3

    goto :goto_5e

    :cond_1a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_5f

    :pswitch_69
    move v0, v2

    goto :goto_5f

    :pswitch_6a
    move v0, v3

    goto :goto_5f

    :pswitch_6b
    move v0, v3

    goto :goto_5f

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_60

    :pswitch_6d
    move v0, v2

    goto :goto_60

    :pswitch_6e
    move v0, v3

    goto :goto_60

    :pswitch_6f
    move v0, v3

    goto :goto_60

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_61

    :pswitch_71
    move v0, v2

    goto :goto_61

    :pswitch_72
    move v0, v3

    goto :goto_61

    :pswitch_73
    move v0, v3

    goto :goto_61

    :cond_1d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_62

    :pswitch_75
    move v0, v2

    goto :goto_62

    :pswitch_76
    move v0, v3

    goto :goto_62

    :pswitch_77
    move v0, v3

    goto :goto_62

    :cond_1e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_63
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_63

    :pswitch_79
    move v0, v2

    goto :goto_63

    :pswitch_7a
    move v0, v3

    goto :goto_63

    :pswitch_7b
    move v0, v3

    goto :goto_63

    :cond_1f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_64
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_64

    :pswitch_7d
    move v0, v2

    goto :goto_64

    :pswitch_7e
    move v0, v3

    goto :goto_64

    :pswitch_7f
    move v0, v3

    goto :goto_64

    :cond_20
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_65
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_65

    :pswitch_81
    move v0, v2

    goto :goto_65

    :pswitch_82
    move v0, v3

    goto :goto_65

    :pswitch_83
    move v0, v3

    goto :goto_65

    :cond_21
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_66
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_66

    :pswitch_85
    move v0, v2

    goto :goto_66

    :pswitch_86
    move v0, v3

    goto :goto_66

    :pswitch_87
    move v0, v3

    goto :goto_66

    :cond_22
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_67
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_67

    :pswitch_89
    move v0, v2

    goto :goto_67

    :pswitch_8a
    move v0, v3

    goto :goto_67

    :pswitch_8b
    move v0, v3

    goto :goto_67

    :cond_23
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_68
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_68

    :pswitch_8d
    move v0, v2

    goto :goto_68

    :pswitch_8e
    move v0, v3

    goto :goto_68

    :pswitch_8f
    move v0, v3

    goto :goto_68

    :cond_24
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_69
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_69

    :pswitch_91
    move v0, v2

    goto :goto_69

    :pswitch_92
    move v0, v3

    goto :goto_69

    :pswitch_93
    move v0, v3

    goto :goto_69

    :cond_25
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_25

    move v0, v4

    :goto_6a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_6a

    :pswitch_95
    move v0, v2

    goto :goto_6a

    :pswitch_96
    move v0, v3

    goto :goto_6a

    :pswitch_97
    move v0, v3

    goto :goto_6a

    :cond_26
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_26

    move v0, v4

    :goto_6b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_6b

    :pswitch_99
    move v0, v2

    goto :goto_6b

    :pswitch_9a
    move v0, v3

    goto :goto_6b

    :pswitch_9b
    move v0, v3

    goto :goto_6b

    :cond_27
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_27

    move v0, v4

    :goto_6c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_6c

    :pswitch_9d
    move v0, v2

    goto :goto_6c

    :pswitch_9e
    move v0, v3

    goto :goto_6c

    :pswitch_9f
    move v0, v3

    goto :goto_6c

    :cond_28
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_28

    move v0, v4

    :goto_6d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_6d

    :pswitch_a1
    move v0, v2

    goto :goto_6d

    :pswitch_a2
    move v0, v3

    goto :goto_6d

    :pswitch_a3
    move v0, v3

    goto :goto_6d

    :cond_29
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_29

    move v0, v4

    :goto_6e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_6e

    :pswitch_a5
    move v0, v2

    goto :goto_6e

    :pswitch_a6
    move v0, v3

    goto :goto_6e

    :pswitch_a7
    move v0, v3

    goto :goto_6e

    :cond_2a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2a

    move v0, v4

    :goto_6f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_6f

    :pswitch_a9
    move v0, v2

    goto :goto_6f

    :pswitch_aa
    move v0, v3

    goto :goto_6f

    :pswitch_ab
    move v0, v3

    goto :goto_6f

    :cond_2b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2b

    move v0, v4

    :goto_70
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_70

    :pswitch_ad
    move v0, v2

    goto :goto_70

    :pswitch_ae
    move v0, v3

    goto :goto_70

    :pswitch_af
    move v0, v3

    goto :goto_70

    :cond_2c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2c

    move v0, v4

    :goto_71
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_71

    :pswitch_b1
    move v0, v2

    goto :goto_71

    :pswitch_b2
    move v0, v3

    goto :goto_71

    :pswitch_b3
    move v0, v3

    goto :goto_71

    :cond_2d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2d

    move v0, v4

    :goto_72
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_72

    :pswitch_b5
    move v0, v2

    goto :goto_72

    :pswitch_b6
    move v0, v3

    goto :goto_72

    :pswitch_b7
    move v0, v3

    goto :goto_72

    :cond_2e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2e

    move v0, v4

    :goto_73
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_73

    :pswitch_b9
    move v0, v2

    goto :goto_73

    :pswitch_ba
    move v0, v3

    goto :goto_73

    :pswitch_bb
    move v0, v3

    goto :goto_73

    :cond_2f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2f

    move v0, v4

    :goto_74
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_74

    :pswitch_bd
    move v0, v2

    goto :goto_74

    :pswitch_be
    move v0, v3

    goto :goto_74

    :pswitch_bf
    move v0, v3

    goto :goto_74

    :cond_30
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_30

    move v0, v4

    :goto_75
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_75

    :pswitch_c1
    move v0, v2

    goto :goto_75

    :pswitch_c2
    move v0, v3

    goto :goto_75

    :pswitch_c3
    move v0, v3

    goto :goto_75

    :cond_31
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_31

    move v0, v4

    :goto_76
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_31

    :pswitch_c4
    move v0, v1

    goto :goto_76

    :pswitch_c5
    move v0, v2

    goto :goto_76

    :pswitch_c6
    move v0, v3

    goto :goto_76

    :pswitch_c7
    move v0, v3

    goto :goto_76

    :cond_32
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_32

    move v0, v4

    :goto_77
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_32

    :pswitch_c8
    move v0, v1

    goto :goto_77

    :pswitch_c9
    move v0, v2

    goto :goto_77

    :pswitch_ca
    move v0, v3

    goto :goto_77

    :pswitch_cb
    move v0, v3

    goto :goto_77

    :cond_33
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_33

    move v0, v4

    :goto_78
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_33

    :pswitch_cc
    move v0, v1

    goto :goto_78

    :pswitch_cd
    move v0, v2

    goto :goto_78

    :pswitch_ce
    move v0, v3

    goto :goto_78

    :pswitch_cf
    move v0, v3

    goto :goto_78

    :cond_34
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_34

    move v0, v4

    :goto_79
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_34

    :pswitch_d0
    move v0, v1

    goto :goto_79

    :pswitch_d1
    move v0, v2

    goto :goto_79

    :pswitch_d2
    move v0, v3

    goto :goto_79

    :pswitch_d3
    move v0, v3

    goto :goto_79

    :cond_35
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_35

    move v0, v4

    :goto_7a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_35

    :pswitch_d4
    move v0, v1

    goto :goto_7a

    :pswitch_d5
    move v0, v2

    goto :goto_7a

    :pswitch_d6
    move v0, v3

    goto :goto_7a

    :pswitch_d7
    move v0, v3

    goto :goto_7a

    :cond_36
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_36

    move v0, v4

    :goto_7b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_36

    :pswitch_d8
    move v0, v1

    goto :goto_7b

    :pswitch_d9
    move v0, v2

    goto :goto_7b

    :pswitch_da
    move v0, v3

    goto :goto_7b

    :pswitch_db
    move v0, v3

    goto :goto_7b

    :cond_37
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_37

    move v0, v4

    :goto_7c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_37

    :pswitch_dc
    move v0, v1

    goto :goto_7c

    :pswitch_dd
    move v0, v2

    goto :goto_7c

    :pswitch_de
    move v0, v3

    goto :goto_7c

    :pswitch_df
    move v0, v3

    goto :goto_7c

    :cond_38
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_38

    move v0, v4

    :goto_7d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_38

    :pswitch_e0
    move v0, v1

    goto :goto_7d

    :pswitch_e1
    move v0, v2

    goto :goto_7d

    :pswitch_e2
    move v0, v3

    goto :goto_7d

    :pswitch_e3
    move v0, v3

    goto :goto_7d

    :cond_39
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_39

    move v0, v4

    :goto_7e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_39

    :pswitch_e4
    move v0, v1

    goto :goto_7e

    :pswitch_e5
    move v0, v2

    goto :goto_7e

    :pswitch_e6
    move v0, v3

    goto :goto_7e

    :pswitch_e7
    move v0, v3

    goto :goto_7e

    :cond_3a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3a

    move v0, v4

    :goto_7f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3a

    :pswitch_e8
    move v0, v1

    goto :goto_7f

    :pswitch_e9
    move v0, v2

    goto :goto_7f

    :pswitch_ea
    move v0, v3

    goto :goto_7f

    :pswitch_eb
    move v0, v3

    goto :goto_7f

    :cond_3b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3b

    move v0, v4

    :goto_80
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3b

    :pswitch_ec
    move v0, v1

    goto :goto_80

    :pswitch_ed
    move v0, v2

    goto :goto_80

    :pswitch_ee
    move v0, v3

    goto :goto_80

    :pswitch_ef
    move v0, v3

    goto :goto_80

    :cond_3c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3c

    move v0, v4

    :goto_81
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3c

    :pswitch_f0
    move v0, v1

    goto :goto_81

    :pswitch_f1
    move v0, v2

    goto :goto_81

    :pswitch_f2
    move v0, v3

    goto :goto_81

    :pswitch_f3
    move v0, v3

    goto :goto_81

    :cond_3d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3d

    move v0, v4

    :goto_82
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3d

    :pswitch_f4
    move v0, v1

    goto :goto_82

    :pswitch_f5
    move v0, v2

    goto :goto_82

    :pswitch_f6
    move v0, v3

    goto :goto_82

    :pswitch_f7
    move v0, v3

    goto :goto_82

    :cond_3e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3e

    move v0, v4

    :goto_83
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3e

    :pswitch_f8
    move v0, v1

    goto :goto_83

    :pswitch_f9
    move v0, v2

    goto :goto_83

    :pswitch_fa
    move v0, v3

    goto :goto_83

    :pswitch_fb
    move v0, v3

    goto :goto_83

    :cond_3f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3f

    move v0, v4

    :goto_84
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3f

    :pswitch_fc
    move v0, v1

    goto :goto_84

    :pswitch_fd
    move v0, v2

    goto :goto_84

    :pswitch_fe
    move v0, v3

    goto :goto_84

    :pswitch_ff
    move v0, v3

    goto :goto_84

    :cond_40
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_40

    move v0, v4

    :goto_85
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_40

    :pswitch_100
    move v0, v1

    goto :goto_85

    :pswitch_101
    move v0, v2

    goto :goto_85

    :pswitch_102
    move v0, v3

    goto :goto_85

    :pswitch_103
    move v0, v3

    goto :goto_85

    :cond_41
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_41

    move v0, v4

    :goto_86
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_41

    :pswitch_104
    move v0, v1

    goto :goto_86

    :pswitch_105
    move v0, v2

    goto :goto_86

    :pswitch_106
    move v0, v3

    goto :goto_86

    :pswitch_107
    move v0, v3

    goto :goto_86

    :cond_42
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_42

    move v0, v4

    :goto_87
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_42

    :pswitch_108
    move v0, v1

    goto :goto_87

    :pswitch_109
    move v0, v2

    goto :goto_87

    :pswitch_10a
    move v0, v3

    goto :goto_87

    :pswitch_10b
    move v0, v3

    goto :goto_87

    :cond_43
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_43

    move v0, v4

    :goto_88
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_43

    :pswitch_10c
    move v0, v1

    goto :goto_88

    :pswitch_10d
    move v0, v2

    goto :goto_88

    :pswitch_10e
    move v0, v3

    goto :goto_88

    :pswitch_10f
    move v0, v3

    goto :goto_88

    :cond_44
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_44

    move v0, v4

    :goto_89
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_44

    :pswitch_110
    move v0, v1

    goto :goto_89

    :pswitch_111
    move v0, v2

    goto :goto_89

    :pswitch_112
    move v0, v3

    goto :goto_89

    :pswitch_113
    move v0, v3

    goto :goto_89

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_2f
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_30
        :pswitch_31
        :pswitch_32
        :pswitch_33
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_34
        :pswitch_35
        :pswitch_36
        :pswitch_37
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_38
        :pswitch_39
        :pswitch_3a
        :pswitch_3b
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3d
        :pswitch_3e
        :pswitch_3f
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x0
        :pswitch_40
        :pswitch_41
        :pswitch_42
        :pswitch_43
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x0
        :pswitch_44
        :pswitch_45
        :pswitch_46
        :pswitch_47
    .end packed-switch

    :pswitch_data_12
    .packed-switch 0x0
        :pswitch_48
        :pswitch_49
        :pswitch_4a
        :pswitch_4b
    .end packed-switch

    :pswitch_data_13
    .packed-switch 0x0
        :pswitch_4c
        :pswitch_4d
        :pswitch_4e
        :pswitch_4f
    .end packed-switch

    :pswitch_data_14
    .packed-switch 0x0
        :pswitch_50
        :pswitch_51
        :pswitch_52
        :pswitch_53
    .end packed-switch

    :pswitch_data_15
    .packed-switch 0x0
        :pswitch_54
        :pswitch_55
        :pswitch_56
        :pswitch_57
    .end packed-switch

    :pswitch_data_16
    .packed-switch 0x0
        :pswitch_58
        :pswitch_59
        :pswitch_5a
        :pswitch_5b
    .end packed-switch

    :pswitch_data_17
    .packed-switch 0x0
        :pswitch_5c
        :pswitch_5d
        :pswitch_5e
        :pswitch_5f
    .end packed-switch

    :pswitch_data_18
    .packed-switch 0x0
        :pswitch_60
        :pswitch_61
        :pswitch_62
        :pswitch_63
    .end packed-switch

    :pswitch_data_19
    .packed-switch 0x0
        :pswitch_64
        :pswitch_65
        :pswitch_66
        :pswitch_67
    .end packed-switch

    :pswitch_data_1a
    .packed-switch 0x0
        :pswitch_68
        :pswitch_69
        :pswitch_6a
        :pswitch_6b
    .end packed-switch

    :pswitch_data_1b
    .packed-switch 0x0
        :pswitch_6c
        :pswitch_6d
        :pswitch_6e
        :pswitch_6f
    .end packed-switch

    :pswitch_data_1c
    .packed-switch 0x0
        :pswitch_70
        :pswitch_71
        :pswitch_72
        :pswitch_73
    .end packed-switch

    :pswitch_data_1d
    .packed-switch 0x0
        :pswitch_74
        :pswitch_75
        :pswitch_76
        :pswitch_77
    .end packed-switch

    :pswitch_data_1e
    .packed-switch 0x0
        :pswitch_78
        :pswitch_79
        :pswitch_7a
        :pswitch_7b
    .end packed-switch

    :pswitch_data_1f
    .packed-switch 0x0
        :pswitch_7c
        :pswitch_7d
        :pswitch_7e
        :pswitch_7f
    .end packed-switch

    :pswitch_data_20
    .packed-switch 0x0
        :pswitch_80
        :pswitch_81
        :pswitch_82
        :pswitch_83
    .end packed-switch

    :pswitch_data_21
    .packed-switch 0x0
        :pswitch_84
        :pswitch_85
        :pswitch_86
        :pswitch_87
    .end packed-switch

    :pswitch_data_22
    .packed-switch 0x0
        :pswitch_88
        :pswitch_89
        :pswitch_8a
        :pswitch_8b
    .end packed-switch

    :pswitch_data_23
    .packed-switch 0x0
        :pswitch_8c
        :pswitch_8d
        :pswitch_8e
        :pswitch_8f
    .end packed-switch

    :pswitch_data_24
    .packed-switch 0x0
        :pswitch_90
        :pswitch_91
        :pswitch_92
        :pswitch_93
    .end packed-switch

    :pswitch_data_25
    .packed-switch 0x0
        :pswitch_94
        :pswitch_95
        :pswitch_96
        :pswitch_97
    .end packed-switch

    :pswitch_data_26
    .packed-switch 0x0
        :pswitch_98
        :pswitch_99
        :pswitch_9a
        :pswitch_9b
    .end packed-switch

    :pswitch_data_27
    .packed-switch 0x0
        :pswitch_9c
        :pswitch_9d
        :pswitch_9e
        :pswitch_9f
    .end packed-switch

    :pswitch_data_28
    .packed-switch 0x0
        :pswitch_a0
        :pswitch_a1
        :pswitch_a2
        :pswitch_a3
    .end packed-switch

    :pswitch_data_29
    .packed-switch 0x0
        :pswitch_a4
        :pswitch_a5
        :pswitch_a6
        :pswitch_a7
    .end packed-switch

    :pswitch_data_2a
    .packed-switch 0x0
        :pswitch_a8
        :pswitch_a9
        :pswitch_aa
        :pswitch_ab
    .end packed-switch

    :pswitch_data_2b
    .packed-switch 0x0
        :pswitch_ac
        :pswitch_ad
        :pswitch_ae
        :pswitch_af
    .end packed-switch

    :pswitch_data_2c
    .packed-switch 0x0
        :pswitch_b0
        :pswitch_b1
        :pswitch_b2
        :pswitch_b3
    .end packed-switch

    :pswitch_data_2d
    .packed-switch 0x0
        :pswitch_b4
        :pswitch_b5
        :pswitch_b6
        :pswitch_b7
    .end packed-switch

    :pswitch_data_2e
    .packed-switch 0x0
        :pswitch_b8
        :pswitch_b9
        :pswitch_ba
        :pswitch_bb
    .end packed-switch

    :pswitch_data_2f
    .packed-switch 0x0
        :pswitch_bc
        :pswitch_bd
        :pswitch_be
        :pswitch_bf
    .end packed-switch

    :pswitch_data_30
    .packed-switch 0x0
        :pswitch_c0
        :pswitch_c1
        :pswitch_c2
        :pswitch_c3
    .end packed-switch

    :pswitch_data_31
    .packed-switch 0x0
        :pswitch_c4
        :pswitch_c5
        :pswitch_c6
        :pswitch_c7
    .end packed-switch

    :pswitch_data_32
    .packed-switch 0x0
        :pswitch_c8
        :pswitch_c9
        :pswitch_ca
        :pswitch_cb
    .end packed-switch

    :pswitch_data_33
    .packed-switch 0x0
        :pswitch_cc
        :pswitch_cd
        :pswitch_ce
        :pswitch_cf
    .end packed-switch

    :pswitch_data_34
    .packed-switch 0x0
        :pswitch_d0
        :pswitch_d1
        :pswitch_d2
        :pswitch_d3
    .end packed-switch

    :pswitch_data_35
    .packed-switch 0x0
        :pswitch_d4
        :pswitch_d5
        :pswitch_d6
        :pswitch_d7
    .end packed-switch

    :pswitch_data_36
    .packed-switch 0x0
        :pswitch_d8
        :pswitch_d9
        :pswitch_da
        :pswitch_db
    .end packed-switch

    :pswitch_data_37
    .packed-switch 0x0
        :pswitch_dc
        :pswitch_dd
        :pswitch_de
        :pswitch_df
    .end packed-switch

    :pswitch_data_38
    .packed-switch 0x0
        :pswitch_e0
        :pswitch_e1
        :pswitch_e2
        :pswitch_e3
    .end packed-switch

    :pswitch_data_39
    .packed-switch 0x0
        :pswitch_e4
        :pswitch_e5
        :pswitch_e6
        :pswitch_e7
    .end packed-switch

    :pswitch_data_3a
    .packed-switch 0x0
        :pswitch_e8
        :pswitch_e9
        :pswitch_ea
        :pswitch_eb
    .end packed-switch

    :pswitch_data_3b
    .packed-switch 0x0
        :pswitch_ec
        :pswitch_ed
        :pswitch_ee
        :pswitch_ef
    .end packed-switch

    :pswitch_data_3c
    .packed-switch 0x0
        :pswitch_f0
        :pswitch_f1
        :pswitch_f2
        :pswitch_f3
    .end packed-switch

    :pswitch_data_3d
    .packed-switch 0x0
        :pswitch_f4
        :pswitch_f5
        :pswitch_f6
        :pswitch_f7
    .end packed-switch

    :pswitch_data_3e
    .packed-switch 0x0
        :pswitch_f8
        :pswitch_f9
        :pswitch_fa
        :pswitch_fb
    .end packed-switch

    :pswitch_data_3f
    .packed-switch 0x0
        :pswitch_fc
        :pswitch_fd
        :pswitch_fe
        :pswitch_ff
    .end packed-switch

    :pswitch_data_40
    .packed-switch 0x0
        :pswitch_100
        :pswitch_101
        :pswitch_102
        :pswitch_103
    .end packed-switch

    :pswitch_data_41
    .packed-switch 0x0
        :pswitch_104
        :pswitch_105
        :pswitch_106
        :pswitch_107
    .end packed-switch

    :pswitch_data_42
    .packed-switch 0x0
        :pswitch_108
        :pswitch_109
        :pswitch_10a
        :pswitch_10b
    .end packed-switch

    :pswitch_data_43
    .packed-switch 0x0
        :pswitch_10c
        :pswitch_10d
        :pswitch_10e
        :pswitch_10f
    .end packed-switch

    :pswitch_data_44
    .packed-switch 0x0
        :pswitch_110
        :pswitch_111
        :pswitch_112
        :pswitch_113
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 313
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Settings;->a:Landroid/os/Handler;

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/Settings;->c:Z

    .line 73
    iput-object v1, p0, Lcom/whatsapp/Settings;->h:Ljava/lang/String;

    .line 240
    iput-object v1, p0, Lcom/whatsapp/Settings;->j:Ljava/lang/String;

    .line 83
    iput-object v1, p0, Lcom/whatsapp/Settings;->k:Ljava/lang/String;

    .line 147
    new-instance v0, Lcom/whatsapp/v2;

    invoke-direct {v0, p0}, Lcom/whatsapp/v2;-><init>(Lcom/whatsapp/Settings;)V

    iput-object v0, p0, Lcom/whatsapp/Settings;->n:Landroid/preference/Preference$OnPreferenceChangeListener;

    .line 286
    new-instance v0, Lcom/whatsapp/w2;

    invoke-direct {v0, p0}, Lcom/whatsapp/w2;-><init>(Lcom/whatsapp/Settings;)V

    iput-object v0, p0, Lcom/whatsapp/Settings;->o:Landroid/preference/Preference$OnPreferenceChangeListener;

    .line 323
    new-instance v0, Lcom/whatsapp/x2;

    invoke-direct {v0, p0}, Lcom/whatsapp/x2;-><init>(Lcom/whatsapp/Settings;)V

    iput-object v0, p0, Lcom/whatsapp/Settings;->p:Landroid/preference/Preference$OnPreferenceChangeListener;

    .line 319
    return-void
.end method

.method static a(Lcom/whatsapp/Settings;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 148
    iget-object v0, p0, Lcom/whatsapp/Settings;->j:Ljava/lang/String;

    return-object v0
.end method

.method static a(Lcom/whatsapp/Settings;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 95
    iput-object p1, p0, Lcom/whatsapp/Settings;->k:Ljava/lang/String;

    return-object p1
.end method

.method static a(Lcom/whatsapp/Settings;Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 183
    iput-object p1, p0, Lcom/whatsapp/Settings;->i:Ljava/util/HashMap;

    return-object p1
.end method

.method private a()V
    .locals 6

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 328
    invoke-static {}, Lcom/whatsapp/App;->g()J

    move-result-wide v2

    .line 34
    const-string v0, ""

    .line 5
    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 216
    const v0, 0x7f090014

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_2

    .line 187
    :cond_0
    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    .line 214
    const v0, 0x7f090013

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_2

    .line 312
    :cond_1
    invoke-static {p0, v2, v3}, Lcom/whatsapp/t4;->i(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    .line 48
    :cond_2
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x1e

    aget-object v1, v1, v2

    const v2, 0x7f0901b2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 338
    return-void
.end method

.method private a(Landroid/net/Uri;III)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 19
    if-nez p1, :cond_0

    .line 159
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p2, v1, p3, p4}, Lcom/whatsapp/wallpaper/l;->a(ZILandroid/net/Uri;II)Landroid/graphics/drawable/Drawable;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 33
    :cond_0
    const/4 v0, -0x1

    invoke-static {v2, v0, p1, v2, v2}, Lcom/whatsapp/wallpaper/l;->a(ZILandroid/net/Uri;II)Landroid/graphics/drawable/Drawable;

    .line 218
    :cond_1
    invoke-static {p1}, Lcom/whatsapp/j5;->b(Landroid/net/Uri;)V

    .line 228
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090145

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 118
    return-void
.end method

.method private a(Ljava/lang/String;IJ)V
    .locals 5
    .parameter
    .parameter
    .parameter

    .prologue
    .line 296
    invoke-virtual {p0, p1}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    long-to-int v2, p3

    invoke-virtual {v1, p2, v2}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 322
    return-void
.end method

.method private varargs a(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 244
    invoke-virtual {p0, p1}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 92
    return-void
.end method

.method private a(Ljava/lang/String;J)V
    .locals 8
    .parameter
    .parameter

    .prologue
    const-wide/high16 v6, 0x4090

    const/4 v1, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 29
    long-to-double v2, p2

    move v0, v1

    .line 153
    :cond_0
    const/4 v5, 0x3

    if-ge v0, v5, :cond_1

    cmpl-double v5, v2, v6

    if-lez v5, :cond_1

    .line 199
    div-double/2addr v2, v6

    .line 136
    add-int/lit8 v0, v0, 0x1

    if-eqz v4, :cond_0

    .line 215
    :cond_1
    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 182
    :cond_2
    :goto_0
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-direct {p0, p1, v0, v4}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 302
    :goto_1
    return-void

    .line 277
    :pswitch_0
    const v0, 0x7f0b000b

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;IJ)V

    goto :goto_1

    .line 28
    :pswitch_1
    const v0, 0x7f0901eb

    .line 51
    if-eqz v4, :cond_2

    .line 111
    :pswitch_2
    const v0, 0x7f0901ec

    .line 59
    if-eqz v4, :cond_2

    .line 223
    :pswitch_3
    const v0, 0x7f0901ed

    goto :goto_0

    .line 215
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static b(Lcom/whatsapp/Settings;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 174
    iput-object p1, p0, Lcom/whatsapp/Settings;->j:Ljava/lang/String;

    return-object p1
.end method

.method static b(Lcom/whatsapp/Settings;)V
    .locals 0
    .parameter

    .prologue
    .line 145
    invoke-direct {p0}, Lcom/whatsapp/Settings;->a()V

    return-void
.end method

.method static c(Lcom/whatsapp/Settings;)Ljava/util/HashMap;
    .locals 1
    .parameter

    .prologue
    .line 87
    iget-object v0, p0, Lcom/whatsapp/Settings;->i:Ljava/util/HashMap;

    return-object v0
.end method

.method public static c()V
    .locals 2

    .prologue
    .line 180
    invoke-static {}, Lcom/whatsapp/App;->jb()Lcom/whatsapp/lr;

    move-result-object v0

    .line 127
    instance-of v1, v0, Lcom/whatsapp/Settings;

    if-eqz v1, :cond_0

    .line 298
    check-cast v0, Lcom/whatsapp/Settings;

    .line 222
    invoke-direct {v0}, Lcom/whatsapp/Settings;->a()V

    .line 257
    :cond_0
    return-void
.end method

.method static d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;
    .locals 1
    .parameter

    .prologue
    .line 287
    iget-object v0, p0, Lcom/whatsapp/Settings;->f:Landroid/preference/CheckBoxPreference;

    return-object v0
.end method

.method static e(Lcom/whatsapp/Settings;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 76
    iget-object v0, p0, Lcom/whatsapp/Settings;->k:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 333
    invoke-virtual {p0, p1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/Settings;->d:Ljava/lang/String;

    .line 140
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->showDialog(I)V

    .line 330
    :cond_0
    return-void
.end method

.method b()V
    .locals 10

    .prologue
    const v4, 0x7f0b000a

    const v9, 0x7f0901ef

    const/16 v8, 0x21

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 339
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    .line 20
    if-eqz v0, :cond_1

    .line 198
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x3f

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->b()J

    move-result-wide v2

    invoke-direct {p0, v1, v4, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;IJ)V

    .line 93
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x42

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->a()J

    move-result-wide v2

    invoke-direct {p0, v1, v4, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;IJ)V

    .line 25
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x3c

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->d()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;J)V

    .line 285
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x3e

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->c()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;J)V

    .line 220
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x41

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->f()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;J)V

    .line 36
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x40

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->e()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;J)V

    .line 40
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x43

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->h()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;J)V

    .line 291
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x3d

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->g()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;J)V

    .line 270
    invoke-virtual {v0}, Lcom/whatsapp/Statistics$Data;->i()J

    move-result-wide v0

    .line 297
    const-wide/high16 v2, -0x8000

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 191
    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v2, v2, v8

    new-array v3, v7, [Ljava/lang/Object;

    sget-object v4, Lcom/whatsapp/Settings;->m:Ljava/text/SimpleDateFormat;

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v6

    invoke-direct {p0, v2, v9, v3}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 1
    :cond_0
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v0, v0, v8

    new-array v1, v7, [Ljava/lang/Object;

    const v2, 0x7f090014

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-direct {p0, v0, v9, v1}, Lcom/whatsapp/Settings;->a(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 137
    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 205
    iput-object p1, p0, Lcom/whatsapp/Settings;->d:Ljava/lang/String;

    .line 27
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->showDialog(I)V

    .line 152
    :cond_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 9
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v8, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 326
    if-nez p2, :cond_2

    if-eqz p3, :cond_2

    .line 289
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 157
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f0902d4

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;Ljava/lang/String;)V

    .line 6
    :cond_0
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f0902db

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;Ljava/lang/String;)V

    .line 78
    :cond_1
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 278
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 245
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f0902dc

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;Ljava/lang/String;)V

    .line 272
    :cond_2
    sparse-switch p1, :sswitch_data_0

    .line 11
    :cond_3
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/preference/PreferenceActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 221
    :cond_4
    :goto_1
    return-void

    .line 70
    :sswitch_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_5

    .line 284
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 225
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/whatsapp/Settings;->a(Landroid/net/Uri;III)V

    if-eqz v8, :cond_3

    .line 15
    :cond_5
    if-eqz p3, :cond_3

    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->showDialog(I)V

    if-eqz v8, :cond_3

    .line 274
    :sswitch_1
    const/4 v0, -0x1

    if-ne p2, v0, :cond_3

    .line 188
    if-eqz p3, :cond_3

    .line 213
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 261
    sget-object v0, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    invoke-virtual {v2}, Lcom/whatsapp/j4;->c()I

    move-result v1

    sub-int/2addr v0, v1

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0a0015

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sub-int v1, v0, v1

    .line 273
    sget-object v0, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    if-eqz v8, :cond_f

    .line 42
    :cond_6
    sget-object v0, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    invoke-virtual {v2}, Lcom/whatsapp/j4;->c()I

    move-result v1

    sub-int/2addr v0, v1

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a0015

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sub-int v1, v0, v1

    .line 16
    sget-object v0, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    move v6, v0

    move v7, v1

    .line 150
    :goto_2
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 185
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 231
    if-eqz v1, :cond_7

    .line 22
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 295
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v0, v0, v2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 132
    if-ltz v0, :cond_7

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/et;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 38
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 263
    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :try_start_1
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 179
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    sget-object v3, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    invoke-virtual {v3}, Landroid/view/Display;->getWidth()I

    move-result v3

    if-ne v2, v3, :cond_7

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v0, v7, :cond_7

    .line 276
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v0, v2, v3, v4}, Lcom/whatsapp/Settings;->a(Landroid/net/Uri;III)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    if-eqz v1, :cond_4

    .line 221
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_1

    .line 229
    :catch_0
    move-exception v0

    .line 300
    :try_start_2
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    :cond_7
    if-eqz v1, :cond_8

    .line 250
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 246
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 88
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/wallpaper/CropImage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 89
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 249
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 45
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x1a

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 124
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 335
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 234
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 325
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-static {}, Lcom/whatsapp/wallpaper/l;->c()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 195
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v2}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    const/16 v1, 0x12

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/Settings;->startActivityForResult(Landroid/content/Intent;I)V

    .line 14
    if-eqz v8, :cond_d

    .line 44
    :cond_9
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 172
    if-eqz v0, :cond_a

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 74
    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, v6, v7}, Lcom/whatsapp/Settings;->a(Landroid/net/Uri;III)V

    if-eqz v8, :cond_d

    .line 230
    :cond_a
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 308
    invoke-static {p0}, Lcom/whatsapp/wallpaper/l;->a(Landroid/content/Context;)V

    .line 144
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090146

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 32
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    if-eqz v8, :cond_d

    .line 320
    :cond_b
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 86
    invoke-static {}, Lcom/whatsapp/wallpaper/l;->a()V

    .line 175
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090145

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 62
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    if-eqz v8, :cond_d

    .line 9
    :cond_c
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0902de

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x14

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 318
    :cond_d
    if-eqz v8, :cond_3

    .line 158
    :sswitch_2
    const/4 v0, -0x1

    if-ne p2, v0, :cond_3

    .line 248
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/Settings;->h:Ljava/lang/String;

    .line 235
    const/16 v0, 0x13

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->showDialog(I)V

    goto/16 :goto_0

    .line 290
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_e

    .line 126
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_e
    throw v0

    :cond_f
    move v6, v0

    move v7, v1

    goto/16 :goto_2

    .line 272
    nop

    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_1
        0x12 -> :sswitch_0
        0x68 -> :sswitch_2
    .end sparse-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .parameter

    .prologue
    .line 224
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 97
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    .line 293
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9
    .parameter

    .prologue
    const v8, 0x7f0901bf

    const/16 v4, 0x35

    const/16 v7, 0x20

    const/4 v6, 0x1

    const/4 v5, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 282
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    new-instance v0, Lcom/whatsapp/ed;

    invoke-direct {v0}, Lcom/whatsapp/ed;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/Settings;->e:Lcom/whatsapp/ed;

    .line 18
    const v0, 0x7f050004

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->addPreferencesFromResource(I)V

    .line 37
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getContentResolver()Landroid/content/ContentResolver;

    .line 260
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/Settings;->b:Landroid/content/pm/PackageManager;

    .line 211
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/Settings;->g:Landroid/view/Display;

    .line 206
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x22

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 306
    new-instance v2, Lcom/whatsapp/y2;

    invoke-direct {v2, p0}, Lcom/whatsapp/y2;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 171
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x38

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 56
    new-instance v2, Lcom/whatsapp/z2;

    invoke-direct {v2, p0}, Lcom/whatsapp/z2;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 133
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x29

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 242
    new-instance v2, Lcom/whatsapp/a3;

    invoke-direct {v2, p0}, Lcom/whatsapp/a3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 91
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x33

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 64
    new-instance v2, Lcom/whatsapp/c3;

    invoke-direct {v2, p0}, Lcom/whatsapp/c3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 84
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x37

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 90
    invoke-static {}, Lcom/whatsapp/App;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    new-instance v0, Lcom/whatsapp/d3;

    invoke-direct {v0, p0}, Lcom/whatsapp/d3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v2, v0}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    if-eqz v1, :cond_1

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    .line 12
    :cond_0
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x25

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/PreferenceGroup;

    invoke-virtual {v0, v2}, Landroid/preference/PreferenceGroup;->removePreference(Landroid/preference/Preference;)Z

    .line 237
    :cond_1
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 47
    invoke-static {}, Lcom/whatsapp/App;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x39

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/PreferenceGroup;

    invoke-virtual {v0, v2}, Landroid/preference/PreferenceGroup;->removePreference(Landroid/preference/Preference;)Z

    if-eqz v1, :cond_4

    .line 267
    :cond_2
    invoke-virtual {v2}, Landroid/preference/Preference;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 35
    if-eqz v0, :cond_3

    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f0901b3

    invoke-virtual {p0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v3, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v4, 0x2a

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-static {v0, p0}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 164
    if-nez v1, :cond_8

    :goto_0
    invoke-virtual {v2, v0}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 233
    :cond_3
    new-instance v0, Lcom/whatsapp/e3;

    invoke-direct {v0, p0, v2}, Lcom/whatsapp/e3;-><init>(Lcom/whatsapp/Settings;Landroid/preference/Preference;)V

    invoke-virtual {v2, v0}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 241
    :cond_4
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x32

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 219
    new-instance v1, Lcom/whatsapp/g3;

    invoke-direct {v1, p0}, Lcom/whatsapp/g3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 200
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x24

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    .line 122
    new-instance v1, Lcom/whatsapp/h3;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/h3;-><init>(Lcom/whatsapp/Settings;Landroid/preference/CheckBoxPreference;)V

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 239
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x3a

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    .line 75
    if-eqz v0, :cond_5

    .line 120
    new-instance v1, Lcom/whatsapp/i3;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/i3;-><init>(Lcom/whatsapp/Settings;Landroid/preference/CheckBoxPreference;)V

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 310
    :cond_5
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x2b

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/ListPreference;

    .line 82
    const v1, 0x7f0901d9

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    .line 269
    new-instance v1, Lcom/whatsapp/j3;

    invoke-direct {v1, p0}, Lcom/whatsapp/j3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 24
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x2f

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 181
    new-instance v1, Lcom/whatsapp/k3;

    invoke-direct {v1, p0}, Lcom/whatsapp/k3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 259
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 264
    new-instance v1, Lcom/whatsapp/l3;

    invoke-direct {v1, p0}, Lcom/whatsapp/l3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 332
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x34

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/whatsapp/m3;

    invoke-direct {v1, p0}, Lcom/whatsapp/m3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 99
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 71
    new-instance v1, Lcom/whatsapp/o3;

    invoke-direct {v1, p0}, Lcom/whatsapp/o3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 116
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x2c

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/p3;

    invoke-direct {v1, p0}, Lcom/whatsapp/p3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 155
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x21

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/DialogPreference;

    new-instance v1, Lcom/whatsapp/q3;

    invoke-direct {v1, p0}, Lcom/whatsapp/q3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/DialogPreference;->a(Landroid/content/DialogInterface$OnClickListener;)V

    .line 337
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x36

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/ListPreference;

    .line 309
    const v1, 0x7f0901c8

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v1, p0, Lcom/whatsapp/Settings;->n:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 210
    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x2e

    aget-object v1, v1, v2

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    check-cast v1, Landroid/preference/ListPreference;

    .line 192
    const v2, 0x7f0901c8

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    .line 61
    iget-object v2, p0, Lcom/whatsapp/Settings;->n:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v1, v2}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 271
    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x27

    aget-object v2, v2, v3

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/ListPreference;

    .line 72
    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v8, v3}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v3, p0, Lcom/whatsapp/Settings;->o:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 292
    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x30

    aget-object v2, v2, v3

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/ListPreference;

    .line 251
    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v8, v3}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    .line 226
    iget-object v3, p0, Lcom/whatsapp/Settings;->o:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 281
    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/ListPreference;

    .line 8
    invoke-virtual {v2}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setSummary(Ljava/lang/CharSequence;)V

    .line 324
    iget-object v3, p0, Lcom/whatsapp/Settings;->p:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 288
    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x26

    aget-object v2, v2, v3

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/ListPreference;

    .line 41
    invoke-virtual {v2}, Landroid/preference/ListPreference;->getEntry()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setSummary(Ljava/lang/CharSequence;)V

    .line 340
    iget-object v3, p0, Lcom/whatsapp/Settings;->p:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v2, v3}, Landroid/preference/ListPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 173
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const/16 v3, 0x5f

    invoke-virtual {v2, v7, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    .line 43
    sget-object v3, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v4, 0x28

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 311
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v2

    .line 68
    if-eqz v2, :cond_7

    .line 262
    sget-object v2, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v3, 0x23

    aget-object v2, v2, v3

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/PreferenceCategory;

    .line 52
    if-eqz v2, :cond_6

    .line 98
    invoke-virtual {v2, v0}, Landroid/preference/PreferenceCategory;->removePreference(Landroid/preference/Preference;)Z

    .line 236
    :cond_6
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v2, 0x2d

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/PreferenceCategory;

    .line 167
    if-eqz v0, :cond_7

    .line 67
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->removePreference(Landroid/preference/Preference;)Z

    .line 165
    :cond_7
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x31

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    iput-object v0, p0, Lcom/whatsapp/Settings;->f:Landroid/preference/CheckBoxPreference;

    .line 178
    iget-object v0, p0, Lcom/whatsapp/Settings;->f:Landroid/preference/CheckBoxPreference;

    new-instance v1, Lcom/whatsapp/r3;

    invoke-direct {v1, p0}, Lcom/whatsapp/r3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 81
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x1e

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/s3;

    invoke-direct {v1, p0}, Lcom/whatsapp/s3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 112
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    const/16 v1, 0x3b

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 102
    new-instance v1, Lcom/whatsapp/t3;

    invoke-direct {v1, p0}, Lcom/whatsapp/t3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 255
    return-void

    :cond_8
    move-object v0, v1

    .line 164
    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 11
    .parameter

    .prologue
    const v10, 0x7f09000c

    const v3, 0x7f09008a

    const v9, 0x7f09000e

    const/4 v8, 0x1

    const/4 v7, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 107
    sparse-switch p1, :sswitch_data_0

    .line 194
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 336
    :cond_0
    :goto_0
    return-object v0

    .line 60
    :sswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0901de

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/q2;

    invoke-direct {v1, p0}, Lcom/whatsapp/q2;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 162
    if-eqz v2, :cond_0

    .line 163
    :sswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/whatsapp/Settings;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/b3;

    invoke-direct {v1, p0}, Lcom/whatsapp/b3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 334
    :sswitch_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 50
    const/16 v0, 0xe

    invoke-virtual {v3, v0, v7}, Ljava/util/Calendar;->set(II)V

    .line 58
    const/16 v0, 0xd

    invoke-virtual {v3, v0, v7}, Ljava/util/Calendar;->set(II)V

    .line 207
    const/16 v0, 0xc

    invoke-virtual {v3, v0, v7}, Ljava/util/Calendar;->set(II)V

    .line 304
    const/16 v0, 0xb

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 268
    new-instance v1, Lcom/whatsapp/f;

    invoke-direct {v1, p0}, Lcom/whatsapp/f;-><init>(Landroid/content/Context;)V

    .line 149
    const v0, 0x7f0902a7

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whatsapp/f;->setTitle(Ljava/lang/CharSequence;)V

    .line 197
    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0901e0

    :goto_1
    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    invoke-static {p0, v5, v6}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v7

    invoke-virtual {p0, v0, v4}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whatsapp/f;->setMessage(Ljava/lang/CharSequence;)V

    .line 299
    invoke-virtual {v1, v8}, Lcom/whatsapp/f;->setIndeterminate(Z)V

    .line 108
    invoke-virtual {v1, v7}, Lcom/whatsapp/f;->setCancelable(Z)V

    .line 315
    if-eqz v2, :cond_5

    .line 55
    :sswitch_3
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0902ac

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0900aa

    :goto_2
    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/n3;

    invoke-direct {v1, p0}, Lcom/whatsapp/n3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 247
    if-eqz v2, :cond_0

    .line 329
    :sswitch_4
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0902ac

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f0900a8

    :goto_3
    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/u3;

    invoke-direct {v1, p0}, Lcom/whatsapp/u3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 258
    if-eqz v2, :cond_0

    .line 117
    :sswitch_5
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 314
    const v1, 0x7f09004f

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 104
    invoke-virtual {v0, v8}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 151
    invoke-virtual {v0, v7}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 131
    if-eqz v2, :cond_0

    .line 142
    :sswitch_6
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0901d1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090010

    new-instance v3, Lcom/whatsapp/w3;

    invoke-direct {v3, p0}, Lcom/whatsapp/w3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/v3;

    invoke-direct {v1, p0}, Lcom/whatsapp/v3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v10, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 305
    if-eqz v2, :cond_0

    .line 186
    :sswitch_7
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 113
    const v1, 0x7f090051

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {v0, v8}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 280
    invoke-virtual {v0, v7}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto/16 :goto_0

    .line 197
    :cond_1
    const v0, 0x7f0901e1

    goto/16 :goto_1

    .line 55
    :cond_2
    const v0, 0x7f0900ab

    goto/16 :goto_2

    .line 329
    :cond_3
    const v0, 0x7f0900a9

    goto :goto_3

    .line 109
    :sswitch_8
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090047

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090052

    new-array v2, v8, [Ljava/lang/Object;

    const v3, 0x7f090048

    invoke-virtual {p0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/x3;

    invoke-direct {v1, p0}, Lcom/whatsapp/x3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 3
    :sswitch_9
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 256
    invoke-virtual {p0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 176
    invoke-virtual {v0, v8}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 294
    invoke-virtual {v0, v7}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto/16 :goto_0

    .line 146
    :sswitch_a
    new-instance v0, Lcom/whatsapp/f;

    invoke-direct {v0, p0}, Lcom/whatsapp/f;-><init>(Landroid/content/Context;)V

    .line 77
    const v1, 0x7f090089

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setTitle(Ljava/lang/CharSequence;)V

    .line 31
    invoke-virtual {p0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setMessage(Ljava/lang/CharSequence;)V

    .line 316
    invoke-virtual {v0, v8}, Lcom/whatsapp/f;->setIndeterminate(Z)V

    .line 79
    invoke-virtual {v0, v7}, Lcom/whatsapp/f;->setCancelable(Z)V

    goto/16 :goto_0

    .line 336
    :sswitch_b
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090047

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090052

    new-array v2, v8, [Ljava/lang/Object;

    const v3, 0x7f090048

    invoke-virtual {p0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/y3;

    invoke-direct {v1, p0}, Lcom/whatsapp/y3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 208
    :sswitch_c
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090053

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090020

    new-instance v2, Lcom/whatsapp/r2;

    invoke-direct {v2, p0}, Lcom/whatsapp/r2;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/z3;

    invoke-direct {v1, p0}, Lcom/whatsapp/z3;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v10, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 121
    :sswitch_d
    iget-object v0, p0, Lcom/whatsapp/Settings;->h:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 265
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 252
    if-eqz v2, :cond_0

    .line 266
    :cond_4
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/Settings;->h:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 154
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090131

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090132

    new-instance v3, Lcom/whatsapp/t2;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/t2;-><init>(Lcom/whatsapp/Settings;Lcom/whatsapp/zq;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090133

    new-instance v3, Lcom/whatsapp/s2;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/s2;-><init>(Lcom/whatsapp/Settings;Lcom/whatsapp/zq;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 301
    :sswitch_e
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 156
    const v1, 0x7f090089

    invoke-virtual {p0, v1}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 49
    invoke-virtual {p0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 203
    invoke-virtual {v0, v8}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 327
    invoke-virtual {v0, v7}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto/16 :goto_0

    .line 105
    :sswitch_f
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090124

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/u2;

    invoke-direct {v1, p0}, Lcom/whatsapp/u2;-><init>(Lcom/whatsapp/Settings;)V

    invoke-virtual {v0, v9, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    move-object v0, v1

    goto/16 :goto_0

    .line 107
    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
        0x8 -> :sswitch_2
        0x9 -> :sswitch_3
        0xa -> :sswitch_4
        0xb -> :sswitch_5
        0xc -> :sswitch_6
        0xd -> :sswitch_7
        0xf -> :sswitch_8
        0x10 -> :sswitch_9
        0x11 -> :sswitch_e
        0x12 -> :sswitch_f
        0x13 -> :sswitch_d
        0x65 -> :sswitch_a
        0x66 -> :sswitch_b
        0x67 -> :sswitch_c
        0x1f4 -> :sswitch_1
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 204
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    .line 119
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/App;->a(Landroid/widget/TextView;)V

    .line 134
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 253
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onPause()V

    .line 46
    iput-boolean v1, p0, Lcom/whatsapp/Settings;->c:Z

    .line 21
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/lr;)V

    .line 106
    iget-object v0, p0, Lcom/whatsapp/Settings;->e:Lcom/whatsapp/ed;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ed;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/whatsapp/Settings;->e:Lcom/whatsapp/ed;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ed;->removeMessages(I)V

    .line 275
    :cond_0
    invoke-static {}, Lcom/whatsapp/App;->nb()V

    .line 227
    return-void
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 254
    packed-switch p1, :pswitch_data_0

    .line 115
    :cond_0
    :goto_0
    return-void

    .line 135
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/Settings;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 125
    check-cast p2, Landroid/app/AlertDialog;

    .line 232
    iget-object v0, p0, Lcom/whatsapp/Settings;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 254
    :pswitch_data_0
    .packed-switch 0x67
        :pswitch_0
    .end packed-switch
.end method

.method protected onResume()V
    .locals 6

    .prologue
    const v5, 0x7f0901ca

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 168
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onResume()V

    .line 94
    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 307
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->startActivity(Landroid/content/Intent;)V

    .line 143
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->finish()V

    .line 196
    :goto_0
    return-void

    .line 110
    :cond_0
    iput-boolean v4, p0, Lcom/whatsapp/Settings;->c:Z

    .line 238
    invoke-virtual {p0}, Lcom/whatsapp/Settings;->b()V

    .line 169
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;)V

    .line 170
    iget-object v0, p0, Lcom/whatsapp/Settings;->e:Lcom/whatsapp/ed;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v3, v1, v2}, Lcom/whatsapp/ed;->sendEmptyMessageDelayed(IJ)Z

    .line 283
    invoke-direct {p0}, Lcom/whatsapp/Settings;->a()V

    .line 317
    sget-object v0, Lcom/whatsapp/Settings;->z:[Ljava/lang/String;

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, Lcom/whatsapp/Settings;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    .line 66
    sget-object v0, Lcom/whatsapp/App;->yb:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    .line 190
    if-lez v0, :cond_1

    .line 184
    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-virtual {p0, v5, v2}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v2, :cond_2

    .line 39
    :cond_1
    new-array v0, v4, [Ljava/lang/Object;

    const v2, 0x7f090022

    invoke-virtual {p0, v2}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-virtual {p0, v5, v0}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 279
    :cond_2
    invoke-virtual {v1, v0}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
