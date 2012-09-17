.class public Lcom/whatsapp/j5;
.super Ljava/lang/Object;
.source "j5.java"


# static fields
.field private static a:Ljava/io/File;

.field public static b:Landroid/content/Intent;

.field public static c:I

.field public static d:I

.field private static e:I

.field private static f:J

.field private static g:I

.field private static h:I

.field public static i:Landroid/graphics/BitmapFactory$Options;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x73

    const/16 v4, 0x45

    const/16 v2, 0x27

    const/4 v1, 0x6

    const/4 v8, 0x0

    const/16 v0, 0x4e

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "(M\u0003\""

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    const/4 v10, 0x1

    const-string v0, "c_\u0007 \u000chF\u001f\u001a\u0018oK\u0016\u001a\u0017kF\u0014 "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "kB\u0017,\u001fsS\u001a)\r)@\u0016+\u001btF\u0007 \u001b~S\u00167\u0010gK\u001a(\u001faB\u0015,\u0012c\u0008\u0000$\u0008cx\u00037\u001b`T,#\u001foK\u0016!"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "kB\u0017,\u001fYA\u001a)\u001bYD\u001c0\u0010rB\u0001j\u000etH\u0011)\u001bkF\u0007,\u001dYA\u001a)\u001bYI\u0012(\u001b<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "kB\u0017,\u001fYA\u001a)\u001bYD\u001c0\u0010rB\u0001j\u0010i\u0007\u0015,\u0012cTS#\u0011t\u0007\u0007<\u000ec\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "+p2"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_5
    if-gt v6, v7, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "kB\u0017,\u001fYA\u001a)\u001bYD\u001c0\u0010rB\u0001j\u0010`BI"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v1

    const/4 v10, 0x7

    const-string v0, "&[S"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 Q`N\u001f \u0010gJ\u0016e\u0017u\u0007\u001d0\u0012j\u000bS0\u000co\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, "&[S-\u001bo@\u001b1C"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xa

    const-string v0, "aN\u0015"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_a
    if-gt v6, v7, :cond_a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xb

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QjH\u0012!^vI\u0014e\u0011t\u0007\u0014,\u0018"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_b
    if-gt v6, v7, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xc

    const-string v0, "IU\u001a \u0010rF\u0007,\u0011h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_c
    if-gt v6, v7, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xd

    const-string v0, "oJ\u0012\"\u001b&W\u001a&\u0015cC\\"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_d
    if-gt v6, v7, :cond_d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xe

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QvU\u0016#\u001btV\u0006$\u0012oS\nj\u001btU\u001c7^uC\u0018,\u0010r\u001a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_e
    if-gt v6, v7, :cond_e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xf

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QhH,*\u000coB\u001d1\u001frN\u001c+!oI\u0015*P"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_f
    if-gt v6, v7, :cond_f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x10

    const-string v0, "oJ\u0012\"\u001b&W\u001a&\u0015cC\\2\u0017bS\u001bx"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_10
    if-gt v6, v7, :cond_10

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x11

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QiU\u001a \u0010rF\u0007,\u0011h\u0007"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_11
    if-gt v6, v7, :cond_11

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x12

    const-string v0, "&[S*\u000coB\u001d1\u001frN\u001c+C"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_12
    if-gt v6, v7, :cond_12

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x13

    const-string v0, "&[S6\u001fkW\u001f !uN\t C"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_13
    if-gt v6, v7, :cond_13

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x14

    const-string v0, "OJ\u0012\"\u001bJB\u001d\"\nn"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_14
    if-gt v6, v7, :cond_14

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x15

    const-string v0, "iU\u001a \u0010rF\u0007,\u0011h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_15
    if-gt v6, v7, :cond_15

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x16

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QhH\u0007\u001a\u001fYN\u001e$\u0019c\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_16
    if-gt v6, v7, :cond_16

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x17

    const-string v0, "&B\u000b1\u001btI\u0012)!`N\u001f !oJ\u0012\"\u001b<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_17
    if-gt v6, v7, :cond_17

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x18

    const-string v0, "YC\u00121\u001f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_18
    if-gt v6, v7, :cond_18

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x19

    const-string v0, "`N\u001f D"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_19
    if-gt v6, v7, :cond_19

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1a

    const-string v0, "OJ\u0012\"\u001bQN\u00171\u0016"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1a
    if-gt v6, v7, :cond_1a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1b

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QeF\u001db\n&K\u001c$\u001a&N\u001d5\u000brT\u00077\u001bgJ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1b
    if-gt v6, v7, :cond_1b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1c

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 QiR\u0007h\u0011`\n\u001e \u0013iU\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1c
    if-gt v6, v7, :cond_1c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1d

    const-string v0, "uF\u001e5\u0012cx\u0001*\ngS\u0016\u001a\u0017kF\u0014 Q`U\u001c(^sU\u001a\u007f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1d
    if-gt v6, v7, :cond_1d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1e

    const-string v0, "vI\u0014"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1e
    if-gt v6, v7, :cond_1e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x1f

    const-string v0, "`N\u001d$\u0012YT\u001a?\u001b<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1f
    if-gt v6, v7, :cond_1f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x20

    const-string v0, "tH\u0007$\nc"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_20
    if-gt v6, v7, :cond_20

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x21

    const-string v0, "&[S2\u0017bS\u001bx"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_21
    if-gt v6, v7, :cond_21

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x22

    const-string v0, "kB\u0017,\u001f`N\u001f \u000brN\u001f6QaB\u0007,\u0013g@\u0016$\u0010bT\u0016+\u001a)S\u001b0\u0013dx\u0011,\nkF\u0003e\u0017u\u0007\u001d0\u0012j"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_22
    if-gt v6, v7, :cond_22

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x23

    const-string v0, "kB\u0017,\u001f`N\u001f \u000brN\u001f6QaB\u0007,\u0013g@\u0016$\u0010bT\u0016+\u001a)T\u0016&\u000btN\u0007<\u001b~D\u00165\noH\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_23
    if-gt v6, v7, :cond_23

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x24

    const-string v0, "gI\u00177\u0011oC],\u0010rB\u001d1PgD\u0007,\u0011h\t>\u0000:Of,\u0016=Gi=\u0000,Yt0\u00040Ya:\t;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_24
    if-gt v6, v7, :cond_24

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x25

    const-string v0, "oJ\u0012\"\u001b)\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_25
    if-gt v6, v7, :cond_25

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x26

    const-string v0, "gI\u00177\u0011oC],\u0010rB\u001d1Pc_\u00077\u001f(n=\u000c*Of?\u001a7Hs6\u000b*U"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_26
    if-gt v6, v7, :cond_26

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "pN\u0017 \u0011)\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_27
    if-gt v6, v7, :cond_27

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v2

    const/16 v10, 0x28

    const-string v0, "gI\u00177\u0011oC],\u0010rB\u001d1PgD\u0007,\u0011h\t#\u000c=M"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_28
    if-gt v6, v7, :cond_28

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x29

    const-string v0, "hF\u0007,\u0008c\u0007\u001b \u001fv\u0007\u0000,\u0004c\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_29
    if-gt v6, v7, :cond_29

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2a

    const-string v0, "&L1"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2a
    if-gt v6, v7, :cond_2a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2b

    const-string v0, "YN\u0017"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2b
    if-gt v6, v7, :cond_2b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2c

    const-string v0, "&[S)\u001fuS,\"\u001bhx\u0007,\u0013c\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2c
    if-gt v6, v7, :cond_2c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2d

    const-string v0, "`N\u001f !eH\u0006+\ncUI"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2d
    if-gt v6, v7, :cond_2d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2e

    const-string v0, "&[S1\u0011rF\u001f\u007f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2e
    if-gt v6, v7, :cond_2e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x2f

    const-string v0, "&[Se\noJ\u0016\u007f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2f
    if-gt v6, v7, :cond_2f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x30

    const-string v0, "rO\u0006(\u001c&T\u001a?\u001b<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_30
    if-gt v6, v7, :cond_30

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x31

    const-string v0, "`N\u001f "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_31
    if-gt v6, v7, :cond_31

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x32

    const-string v0, "hR\u001f)^eR\u00016\u0011t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_32
    if-gt v6, v7, :cond_32

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x33

    const-string v0, "eO\u0016&\u0015uN\t \u001fhC\u0000 \u0010b\u0008\u0007*\u0011&K\u00127\u0019c\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_33
    if-gt v6, v7, :cond_33

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x34

    const-string v0, ")O\u0016,\u0019nSI"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_34
    if-gt v6, v7, :cond_34

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x35

    const-string v0, "tB\u0000&\u001fjBS1\u0016sJ\u0011e\ni\u0007BuN~\u0016Cu"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_35
    if-gt v6, v7, :cond_35

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x36

    const-string v0, "iU\u001a\"!rO\u0006(\u001chF\u001a)QqN\u00171\u0016<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_36
    if-gt v6, v7, :cond_36

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x37

    const-string v0, "Oj4"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_37
    if-gt v6, v7, :cond_37

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x38

    const-string v0, "Gr7"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_38
    if-gt v6, v7, :cond_38

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x39

    const-string v0, "Pn7"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_39
    if-gt v6, v7, :cond_39

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3a

    const-string v0, "Pn7h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3a
    if-gt v6, v7, :cond_3a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3b

    const-string v0, "Gr7h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3b
    if-gt v6, v7, :cond_3b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3c

    const-string v0, "Oj4h"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3c
    if-gt v6, v7, :cond_3c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3d

    const-string v0, "6\u0017Cu"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3d
    if-gt v6, v7, :cond_3d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3e

    const-string v0, "gI\u00177\u0011oC],\u0010rB\u001d1PgD\u0007,\u0011h\t4\u0000*Yd<\u000b*Ci\'"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3e
    if-gt v6, v7, :cond_3e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x3f

    const-string v0, "gR\u0017,\u0011)\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3f
    if-gt v6, v7, :cond_3f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x40

    const-string v0, "eH\u001ek\tnF\u00076\u001fvW]$\u001drN\u001c+PQo2\u0011-Gw#\u001a,Cd<\u0017:Oi4"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_40
    if-gt v6, v7, :cond_40

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x41

    const-string v0, "gI\u00177\u0011oC](\u001bbN\u0012k\u001feS\u001a*\u0010(n>\u00049Cx0\u0004.Rr!\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_41
    if-gt v6, v7, :cond_41

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x42

    const-string v0, "gI\u00177\u0011oC],\u0010rB\u001d1Pc_\u00077\u001f(Q\u001a!\u001biv\u0006$\u0012oS\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_42
    if-gt v6, v7, :cond_42

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x43

    const-string v0, "kB\u0017,\u001f+A\u001a)\u001b+R\u0007,\u0012u\u0008\u00125\u000e&"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_43
    if-gt v6, v7, :cond_43

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x44

    const-string v0, "gI\u00177\u0011oC]5\u000ciQ\u001a!\u001bt\t> \u001aoF 1\u0011tB] \u0006rU\u0012k3G\u007f,\u0007\'Rb "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_44
    if-gt v6, v7, :cond_44

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "kH\u0007*\u000ciK\u0012k\u001dkW"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_45
    if-gt v6, v7, :cond_45

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v4

    const/16 v10, 0x46

    const-string v0, "pH\u001a&\u001btB\u0010*\u000cbB\u0001"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_46
    if-gt v6, v7, :cond_46

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x47

    const-string v0, "kR\u0000,\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_47
    if-gt v6, v7, :cond_47

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x48

    const-string v0, "gI\u00177\u0011oC],\u0010rB\u001d1Pc_\u00077\u001f(T\u001a?\u001bJN\u001e,\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_48
    if-gt v6, v7, :cond_48

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x49

    const-string v0, "uH\u0006+\u001atB\u0010*\u000cbB\u0001"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_49
    if-gt v6, v7, :cond_49

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x4a

    const-string v0, "gI\u00177\u0011oC](\u001bbN\u0012k\u001feS\u001a*\u0010(q:\u0001;Ix0\u0004.Rr!\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4a
    if-gt v6, v7, :cond_4a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x4b

    const-string v0, "iR\u00075\u000br"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4b
    if-gt v6, v7, :cond_4b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x4c

    const-string v0, "kB\u0017,\u001f`N\u001f \u000brN\u001f6Qc_\u0007 \u000chF\u001f\u001a\u0017kF\u0014 \rYD\u001c0\u0010r\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4c
    if-gt v6, v7, :cond_4c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x4d

    const-string v0, "kB\u0017,\u001f`N\u001f \u000brN\u001f6QoI\u0007 \u000chF\u001f\u001a\u0017kF\u0014 \rYD\u001c0\u0010r\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4d
    if-gt v6, v7, :cond_4d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    .line 466
    sput v8, Lcom/whatsapp/j5;->e:I

    .line 489
    sput v8, Lcom/whatsapp/j5;->h:I

    .line 31
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sput-object v0, Lcom/whatsapp/j5;->i:Landroid/graphics/BitmapFactory$Options;

    .line 311
    sget-object v0, Lcom/whatsapp/j5;->i:Landroid/graphics/BitmapFactory$Options;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 33
    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7e

    :goto_4e
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_4e

    :pswitch_1
    move v0, v2

    goto :goto_4e

    :pswitch_2
    move v0, v3

    goto :goto_4e

    :pswitch_3
    move v0, v4

    goto :goto_4e

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x7e

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_4f

    :pswitch_5
    move v0, v2

    goto :goto_4f

    :pswitch_6
    move v0, v3

    goto :goto_4f

    :pswitch_7
    move v0, v4

    goto :goto_4f

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x7e

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_50

    :pswitch_9
    move v0, v2

    goto :goto_50

    :pswitch_a
    move v0, v3

    goto :goto_50

    :pswitch_b
    move v0, v4

    goto :goto_50

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x7e

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_51

    :pswitch_d
    move v0, v2

    goto :goto_51

    :pswitch_e
    move v0, v3

    goto :goto_51

    :pswitch_f
    move v0, v4

    goto :goto_51

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x7e

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_52

    :pswitch_11
    move v0, v2

    goto :goto_52

    :pswitch_12
    move v0, v3

    goto :goto_52

    :pswitch_13
    move v0, v4

    goto :goto_52

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x7e

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_53

    :pswitch_15
    move v0, v2

    goto :goto_53

    :pswitch_16
    move v0, v3

    goto :goto_53

    :pswitch_17
    move v0, v4

    goto :goto_53

    :cond_6
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x7e

    :goto_54
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_54

    :pswitch_19
    move v0, v2

    goto :goto_54

    :pswitch_1a
    move v0, v3

    goto :goto_54

    :pswitch_1b
    move v0, v4

    goto :goto_54

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x7e

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_55

    :pswitch_1d
    move v0, v2

    goto :goto_55

    :pswitch_1e
    move v0, v3

    goto :goto_55

    :pswitch_1f
    move v0, v4

    goto :goto_55

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    const/16 v0, 0x7e

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_56

    :pswitch_21
    move v0, v2

    goto :goto_56

    :pswitch_22
    move v0, v3

    goto :goto_56

    :pswitch_23
    move v0, v4

    goto :goto_56

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    const/16 v0, 0x7e

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_57

    :pswitch_25
    move v0, v2

    goto :goto_57

    :pswitch_26
    move v0, v3

    goto :goto_57

    :pswitch_27
    move v0, v4

    goto :goto_57

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    const/16 v0, 0x7e

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_58

    :pswitch_29
    move v0, v2

    goto :goto_58

    :pswitch_2a
    move v0, v3

    goto :goto_58

    :pswitch_2b
    move v0, v4

    goto :goto_58

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    const/16 v0, 0x7e

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_59

    :pswitch_2d
    move v0, v2

    goto :goto_59

    :pswitch_2e
    move v0, v3

    goto :goto_59

    :pswitch_2f
    move v0, v4

    goto :goto_59

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    const/16 v0, 0x7e

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_5a

    :pswitch_31
    move v0, v2

    goto :goto_5a

    :pswitch_32
    move v0, v3

    goto :goto_5a

    :pswitch_33
    move v0, v4

    goto :goto_5a

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    const/16 v0, 0x7e

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_5b

    :pswitch_35
    move v0, v2

    goto :goto_5b

    :pswitch_36
    move v0, v3

    goto :goto_5b

    :pswitch_37
    move v0, v4

    goto :goto_5b

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    const/16 v0, 0x7e

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_5c

    :pswitch_39
    move v0, v2

    goto :goto_5c

    :pswitch_3a
    move v0, v3

    goto :goto_5c

    :pswitch_3b
    move v0, v4

    goto :goto_5c

    :cond_f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_f

    const/16 v0, 0x7e

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_5d

    :pswitch_3d
    move v0, v2

    goto :goto_5d

    :pswitch_3e
    move v0, v3

    goto :goto_5d

    :pswitch_3f
    move v0, v4

    goto :goto_5d

    :cond_10
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    const/16 v0, 0x7e

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_5e

    :pswitch_41
    move v0, v2

    goto :goto_5e

    :pswitch_42
    move v0, v3

    goto :goto_5e

    :pswitch_43
    move v0, v4

    goto :goto_5e

    :cond_11
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_11

    const/16 v0, 0x7e

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_5f

    :pswitch_45
    move v0, v2

    goto :goto_5f

    :pswitch_46
    move v0, v3

    goto :goto_5f

    :pswitch_47
    move v0, v4

    goto :goto_5f

    :cond_12
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    const/16 v0, 0x7e

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_60

    :pswitch_49
    move v0, v2

    goto :goto_60

    :pswitch_4a
    move v0, v3

    goto :goto_60

    :pswitch_4b
    move v0, v4

    goto :goto_60

    :cond_13
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    const/16 v0, 0x7e

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_61

    :pswitch_4d
    move v0, v2

    goto :goto_61

    :pswitch_4e
    move v0, v3

    goto :goto_61

    :pswitch_4f
    move v0, v4

    goto :goto_61

    :cond_14
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_14

    const/16 v0, 0x7e

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_62

    :pswitch_51
    move v0, v2

    goto :goto_62

    :pswitch_52
    move v0, v3

    goto :goto_62

    :pswitch_53
    move v0, v4

    goto :goto_62

    :cond_15
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    const/16 v0, 0x7e

    :goto_63
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_63

    :pswitch_55
    move v0, v2

    goto :goto_63

    :pswitch_56
    move v0, v3

    goto :goto_63

    :pswitch_57
    move v0, v4

    goto :goto_63

    :cond_16
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_16

    const/16 v0, 0x7e

    :goto_64
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_64

    :pswitch_59
    move v0, v2

    goto :goto_64

    :pswitch_5a
    move v0, v3

    goto :goto_64

    :pswitch_5b
    move v0, v4

    goto :goto_64

    :cond_17
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_17

    const/16 v0, 0x7e

    :goto_65
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_65

    :pswitch_5d
    move v0, v2

    goto :goto_65

    :pswitch_5e
    move v0, v3

    goto :goto_65

    :pswitch_5f
    move v0, v4

    goto :goto_65

    :cond_18
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_18

    const/16 v0, 0x7e

    :goto_66
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_66

    :pswitch_61
    move v0, v2

    goto :goto_66

    :pswitch_62
    move v0, v3

    goto :goto_66

    :pswitch_63
    move v0, v4

    goto :goto_66

    :cond_19
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    const/16 v0, 0x7e

    :goto_67
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_67

    :pswitch_65
    move v0, v2

    goto :goto_67

    :pswitch_66
    move v0, v3

    goto :goto_67

    :pswitch_67
    move v0, v4

    goto :goto_67

    :cond_1a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    const/16 v0, 0x7e

    :goto_68
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_68

    :pswitch_69
    move v0, v2

    goto :goto_68

    :pswitch_6a
    move v0, v3

    goto :goto_68

    :pswitch_6b
    move v0, v4

    goto :goto_68

    :cond_1b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1b

    const/16 v0, 0x7e

    :goto_69
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_69

    :pswitch_6d
    move v0, v2

    goto :goto_69

    :pswitch_6e
    move v0, v3

    goto :goto_69

    :pswitch_6f
    move v0, v4

    goto :goto_69

    :cond_1c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1c

    const/16 v0, 0x7e

    :goto_6a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_6a

    :pswitch_71
    move v0, v2

    goto :goto_6a

    :pswitch_72
    move v0, v3

    goto :goto_6a

    :pswitch_73
    move v0, v4

    goto :goto_6a

    :cond_1d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    const/16 v0, 0x7e

    :goto_6b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_6b

    :pswitch_75
    move v0, v2

    goto :goto_6b

    :pswitch_76
    move v0, v3

    goto :goto_6b

    :pswitch_77
    move v0, v4

    goto :goto_6b

    :cond_1e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1e

    const/16 v0, 0x7e

    :goto_6c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_6c

    :pswitch_79
    move v0, v2

    goto :goto_6c

    :pswitch_7a
    move v0, v3

    goto :goto_6c

    :pswitch_7b
    move v0, v4

    goto :goto_6c

    :cond_1f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1f

    const/16 v0, 0x7e

    :goto_6d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_6d

    :pswitch_7d
    move v0, v2

    goto :goto_6d

    :pswitch_7e
    move v0, v3

    goto :goto_6d

    :pswitch_7f
    move v0, v4

    goto :goto_6d

    :cond_20
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_20

    const/16 v0, 0x7e

    :goto_6e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_6e

    :pswitch_81
    move v0, v2

    goto :goto_6e

    :pswitch_82
    move v0, v3

    goto :goto_6e

    :pswitch_83
    move v0, v4

    goto :goto_6e

    :cond_21
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_21

    const/16 v0, 0x7e

    :goto_6f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_6f

    :pswitch_85
    move v0, v2

    goto :goto_6f

    :pswitch_86
    move v0, v3

    goto :goto_6f

    :pswitch_87
    move v0, v4

    goto :goto_6f

    :cond_22
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_22

    const/16 v0, 0x7e

    :goto_70
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_70

    :pswitch_89
    move v0, v2

    goto :goto_70

    :pswitch_8a
    move v0, v3

    goto :goto_70

    :pswitch_8b
    move v0, v4

    goto :goto_70

    :cond_23
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    const/16 v0, 0x7e

    :goto_71
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_71

    :pswitch_8d
    move v0, v2

    goto :goto_71

    :pswitch_8e
    move v0, v3

    goto :goto_71

    :pswitch_8f
    move v0, v4

    goto :goto_71

    :cond_24
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    const/16 v0, 0x7e

    :goto_72
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_72

    :pswitch_91
    move v0, v2

    goto :goto_72

    :pswitch_92
    move v0, v3

    goto :goto_72

    :pswitch_93
    move v0, v4

    goto :goto_72

    :cond_25
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_25

    const/16 v0, 0x7e

    :goto_73
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_73

    :pswitch_95
    move v0, v2

    goto :goto_73

    :pswitch_96
    move v0, v3

    goto :goto_73

    :pswitch_97
    move v0, v4

    goto :goto_73

    :cond_26
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_26

    const/16 v0, 0x7e

    :goto_74
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_74

    :pswitch_99
    move v0, v2

    goto :goto_74

    :pswitch_9a
    move v0, v3

    goto :goto_74

    :pswitch_9b
    move v0, v4

    goto :goto_74

    :cond_27
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_27

    const/16 v0, 0x7e

    :goto_75
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_75

    :pswitch_9d
    move v0, v2

    goto :goto_75

    :pswitch_9e
    move v0, v3

    goto :goto_75

    :pswitch_9f
    move v0, v4

    goto :goto_75

    :cond_28
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_28

    const/16 v0, 0x7e

    :goto_76
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_76

    :pswitch_a1
    move v0, v2

    goto :goto_76

    :pswitch_a2
    move v0, v3

    goto :goto_76

    :pswitch_a3
    move v0, v4

    goto :goto_76

    :cond_29
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_29

    const/16 v0, 0x7e

    :goto_77
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_77

    :pswitch_a5
    move v0, v2

    goto :goto_77

    :pswitch_a6
    move v0, v3

    goto :goto_77

    :pswitch_a7
    move v0, v4

    goto :goto_77

    :cond_2a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2a

    const/16 v0, 0x7e

    :goto_78
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_78

    :pswitch_a9
    move v0, v2

    goto :goto_78

    :pswitch_aa
    move v0, v3

    goto :goto_78

    :pswitch_ab
    move v0, v4

    goto :goto_78

    :cond_2b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2b

    const/16 v0, 0x7e

    :goto_79
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_79

    :pswitch_ad
    move v0, v2

    goto :goto_79

    :pswitch_ae
    move v0, v3

    goto :goto_79

    :pswitch_af
    move v0, v4

    goto :goto_79

    :cond_2c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2c

    const/16 v0, 0x7e

    :goto_7a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_7a

    :pswitch_b1
    move v0, v2

    goto :goto_7a

    :pswitch_b2
    move v0, v3

    goto :goto_7a

    :pswitch_b3
    move v0, v4

    goto :goto_7a

    :cond_2d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2d

    const/16 v0, 0x7e

    :goto_7b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_7b

    :pswitch_b5
    move v0, v2

    goto :goto_7b

    :pswitch_b6
    move v0, v3

    goto :goto_7b

    :pswitch_b7
    move v0, v4

    goto :goto_7b

    :cond_2e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2e

    const/16 v0, 0x7e

    :goto_7c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_7c

    :pswitch_b9
    move v0, v2

    goto :goto_7c

    :pswitch_ba
    move v0, v3

    goto :goto_7c

    :pswitch_bb
    move v0, v4

    goto :goto_7c

    :cond_2f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2f

    const/16 v0, 0x7e

    :goto_7d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_7d

    :pswitch_bd
    move v0, v2

    goto :goto_7d

    :pswitch_be
    move v0, v3

    goto :goto_7d

    :pswitch_bf
    move v0, v4

    goto :goto_7d

    :cond_30
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_30

    const/16 v0, 0x7e

    :goto_7e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_7e

    :pswitch_c1
    move v0, v2

    goto :goto_7e

    :pswitch_c2
    move v0, v3

    goto :goto_7e

    :pswitch_c3
    move v0, v4

    goto :goto_7e

    :cond_31
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_31

    const/16 v0, 0x7e

    :goto_7f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_31

    :pswitch_c4
    move v0, v1

    goto :goto_7f

    :pswitch_c5
    move v0, v2

    goto :goto_7f

    :pswitch_c6
    move v0, v3

    goto :goto_7f

    :pswitch_c7
    move v0, v4

    goto :goto_7f

    :cond_32
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_32

    const/16 v0, 0x7e

    :goto_80
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_32

    :pswitch_c8
    move v0, v1

    goto :goto_80

    :pswitch_c9
    move v0, v2

    goto :goto_80

    :pswitch_ca
    move v0, v3

    goto :goto_80

    :pswitch_cb
    move v0, v4

    goto :goto_80

    :cond_33
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_33

    const/16 v0, 0x7e

    :goto_81
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_33

    :pswitch_cc
    move v0, v1

    goto :goto_81

    :pswitch_cd
    move v0, v2

    goto :goto_81

    :pswitch_ce
    move v0, v3

    goto :goto_81

    :pswitch_cf
    move v0, v4

    goto :goto_81

    :cond_34
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_34

    const/16 v0, 0x7e

    :goto_82
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_34

    :pswitch_d0
    move v0, v1

    goto :goto_82

    :pswitch_d1
    move v0, v2

    goto :goto_82

    :pswitch_d2
    move v0, v3

    goto :goto_82

    :pswitch_d3
    move v0, v4

    goto :goto_82

    :cond_35
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_35

    const/16 v0, 0x7e

    :goto_83
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_35

    :pswitch_d4
    move v0, v1

    goto :goto_83

    :pswitch_d5
    move v0, v2

    goto :goto_83

    :pswitch_d6
    move v0, v3

    goto :goto_83

    :pswitch_d7
    move v0, v4

    goto :goto_83

    :cond_36
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_36

    const/16 v0, 0x7e

    :goto_84
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_36

    :pswitch_d8
    move v0, v1

    goto :goto_84

    :pswitch_d9
    move v0, v2

    goto :goto_84

    :pswitch_da
    move v0, v3

    goto :goto_84

    :pswitch_db
    move v0, v4

    goto :goto_84

    :cond_37
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_37

    const/16 v0, 0x7e

    :goto_85
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_37

    :pswitch_dc
    move v0, v1

    goto :goto_85

    :pswitch_dd
    move v0, v2

    goto :goto_85

    :pswitch_de
    move v0, v3

    goto :goto_85

    :pswitch_df
    move v0, v4

    goto :goto_85

    :cond_38
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_38

    const/16 v0, 0x7e

    :goto_86
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_38

    :pswitch_e0
    move v0, v1

    goto :goto_86

    :pswitch_e1
    move v0, v2

    goto :goto_86

    :pswitch_e2
    move v0, v3

    goto :goto_86

    :pswitch_e3
    move v0, v4

    goto :goto_86

    :cond_39
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_39

    const/16 v0, 0x7e

    :goto_87
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_39

    :pswitch_e4
    move v0, v1

    goto :goto_87

    :pswitch_e5
    move v0, v2

    goto :goto_87

    :pswitch_e6
    move v0, v3

    goto :goto_87

    :pswitch_e7
    move v0, v4

    goto :goto_87

    :cond_3a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3a

    const/16 v0, 0x7e

    :goto_88
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3a

    :pswitch_e8
    move v0, v1

    goto :goto_88

    :pswitch_e9
    move v0, v2

    goto :goto_88

    :pswitch_ea
    move v0, v3

    goto :goto_88

    :pswitch_eb
    move v0, v4

    goto :goto_88

    :cond_3b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3b

    const/16 v0, 0x7e

    :goto_89
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3b

    :pswitch_ec
    move v0, v1

    goto :goto_89

    :pswitch_ed
    move v0, v2

    goto :goto_89

    :pswitch_ee
    move v0, v3

    goto :goto_89

    :pswitch_ef
    move v0, v4

    goto :goto_89

    :cond_3c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3c

    const/16 v0, 0x7e

    :goto_8a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3c

    :pswitch_f0
    move v0, v1

    goto :goto_8a

    :pswitch_f1
    move v0, v2

    goto :goto_8a

    :pswitch_f2
    move v0, v3

    goto :goto_8a

    :pswitch_f3
    move v0, v4

    goto :goto_8a

    :cond_3d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3d

    const/16 v0, 0x7e

    :goto_8b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3d

    :pswitch_f4
    move v0, v1

    goto :goto_8b

    :pswitch_f5
    move v0, v2

    goto :goto_8b

    :pswitch_f6
    move v0, v3

    goto :goto_8b

    :pswitch_f7
    move v0, v4

    goto :goto_8b

    :cond_3e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3e

    const/16 v0, 0x7e

    :goto_8c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3e

    :pswitch_f8
    move v0, v1

    goto :goto_8c

    :pswitch_f9
    move v0, v2

    goto :goto_8c

    :pswitch_fa
    move v0, v3

    goto :goto_8c

    :pswitch_fb
    move v0, v4

    goto :goto_8c

    :cond_3f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3f

    const/16 v0, 0x7e

    :goto_8d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3f

    :pswitch_fc
    move v0, v1

    goto :goto_8d

    :pswitch_fd
    move v0, v2

    goto :goto_8d

    :pswitch_fe
    move v0, v3

    goto :goto_8d

    :pswitch_ff
    move v0, v4

    goto :goto_8d

    :cond_40
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_40

    const/16 v0, 0x7e

    :goto_8e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_40

    :pswitch_100
    move v0, v1

    goto :goto_8e

    :pswitch_101
    move v0, v2

    goto :goto_8e

    :pswitch_102
    move v0, v3

    goto :goto_8e

    :pswitch_103
    move v0, v4

    goto :goto_8e

    :cond_41
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_41

    const/16 v0, 0x7e

    :goto_8f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_41

    :pswitch_104
    move v0, v1

    goto :goto_8f

    :pswitch_105
    move v0, v2

    goto :goto_8f

    :pswitch_106
    move v0, v3

    goto :goto_8f

    :pswitch_107
    move v0, v4

    goto :goto_8f

    :cond_42
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_42

    const/16 v0, 0x7e

    :goto_90
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_42

    :pswitch_108
    move v0, v1

    goto :goto_90

    :pswitch_109
    move v0, v2

    goto :goto_90

    :pswitch_10a
    move v0, v3

    goto :goto_90

    :pswitch_10b
    move v0, v4

    goto :goto_90

    :cond_43
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_43

    const/16 v0, 0x7e

    :goto_91
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_43

    :pswitch_10c
    move v0, v1

    goto :goto_91

    :pswitch_10d
    move v0, v2

    goto :goto_91

    :pswitch_10e
    move v0, v3

    goto :goto_91

    :pswitch_10f
    move v0, v4

    goto :goto_91

    :cond_44
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_44

    const/16 v0, 0x7e

    :goto_92
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_44

    :pswitch_110
    move v0, v1

    goto :goto_92

    :pswitch_111
    move v0, v2

    goto :goto_92

    :pswitch_112
    move v0, v3

    goto :goto_92

    :pswitch_113
    move v0, v4

    goto :goto_92

    :cond_45
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_45

    const/16 v0, 0x7e

    :goto_93
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_45

    :pswitch_114
    move v0, v1

    goto :goto_93

    :pswitch_115
    move v0, v2

    goto :goto_93

    :pswitch_116
    move v0, v3

    goto :goto_93

    :pswitch_117
    move v0, v4

    goto :goto_93

    :cond_46
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_46

    const/16 v0, 0x7e

    :goto_94
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_46

    :pswitch_118
    move v0, v1

    goto :goto_94

    :pswitch_119
    move v0, v2

    goto :goto_94

    :pswitch_11a
    move v0, v3

    goto :goto_94

    :pswitch_11b
    move v0, v4

    goto :goto_94

    :cond_47
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_47

    const/16 v0, 0x7e

    :goto_95
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_47

    :pswitch_11c
    move v0, v1

    goto :goto_95

    :pswitch_11d
    move v0, v2

    goto :goto_95

    :pswitch_11e
    move v0, v3

    goto :goto_95

    :pswitch_11f
    move v0, v4

    goto :goto_95

    :cond_48
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_48

    const/16 v0, 0x7e

    :goto_96
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_48

    :pswitch_120
    move v0, v1

    goto :goto_96

    :pswitch_121
    move v0, v2

    goto :goto_96

    :pswitch_122
    move v0, v3

    goto :goto_96

    :pswitch_123
    move v0, v4

    goto :goto_96

    :cond_49
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_49

    const/16 v0, 0x7e

    :goto_97
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_49

    :pswitch_124
    move v0, v1

    goto :goto_97

    :pswitch_125
    move v0, v2

    goto :goto_97

    :pswitch_126
    move v0, v3

    goto :goto_97

    :pswitch_127
    move v0, v4

    goto :goto_97

    :cond_4a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4a

    const/16 v0, 0x7e

    :goto_98
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4a

    :pswitch_128
    move v0, v1

    goto :goto_98

    :pswitch_129
    move v0, v2

    goto :goto_98

    :pswitch_12a
    move v0, v3

    goto :goto_98

    :pswitch_12b
    move v0, v4

    goto :goto_98

    :cond_4b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4b

    const/16 v0, 0x7e

    :goto_99
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4b

    :pswitch_12c
    move v0, v1

    goto :goto_99

    :pswitch_12d
    move v0, v2

    goto :goto_99

    :pswitch_12e
    move v0, v3

    goto :goto_99

    :pswitch_12f
    move v0, v4

    goto :goto_99

    :cond_4c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4c

    const/16 v0, 0x7e

    :goto_9a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4c

    :pswitch_130
    move v0, v1

    goto :goto_9a

    :pswitch_131
    move v0, v2

    goto :goto_9a

    :pswitch_132
    move v0, v3

    goto :goto_9a

    :pswitch_133
    move v0, v4

    goto :goto_9a

    :cond_4d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4d

    const/16 v0, 0x7e

    :goto_9b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4d

    :pswitch_134
    move v0, v1

    goto :goto_9b

    :pswitch_135
    move v0, v2

    goto :goto_9b

    :pswitch_136
    move v0, v3

    goto :goto_9b

    :pswitch_137
    move v0, v4

    goto :goto_9b

    nop

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

    :pswitch_data_45
    .packed-switch 0x0
        :pswitch_114
        :pswitch_115
        :pswitch_116
        :pswitch_117
    .end packed-switch

    :pswitch_data_46
    .packed-switch 0x0
        :pswitch_118
        :pswitch_119
        :pswitch_11a
        :pswitch_11b
    .end packed-switch

    :pswitch_data_47
    .packed-switch 0x0
        :pswitch_11c
        :pswitch_11d
        :pswitch_11e
        :pswitch_11f
    .end packed-switch

    :pswitch_data_48
    .packed-switch 0x0
        :pswitch_120
        :pswitch_121
        :pswitch_122
        :pswitch_123
    .end packed-switch

    :pswitch_data_49
    .packed-switch 0x0
        :pswitch_124
        :pswitch_125
        :pswitch_126
        :pswitch_127
    .end packed-switch

    :pswitch_data_4a
    .packed-switch 0x0
        :pswitch_128
        :pswitch_129
        :pswitch_12a
        :pswitch_12b
    .end packed-switch

    :pswitch_data_4b
    .packed-switch 0x0
        :pswitch_12c
        :pswitch_12d
        :pswitch_12e
        :pswitch_12f
    .end packed-switch

    :pswitch_data_4c
    .packed-switch 0x0
        :pswitch_130
        :pswitch_131
        :pswitch_132
        :pswitch_133
    .end packed-switch

    :pswitch_data_4d
    .packed-switch 0x0
        :pswitch_134
        :pswitch_135
        :pswitch_136
        :pswitch_137
    .end packed-switch
.end method

.method public static a(ILandroid/app/Activity;)I
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x0

    .line 10
    const/4 v6, 0x0

    .line 485
    invoke-static {p0}, Lcom/whatsapp/j5;->e(I)[Ljava/lang/String;

    move-result-object v2

    .line 546
    invoke-static {p0}, Lcom/whatsapp/j5;->f(I)Landroid/net/Uri;

    move-result-object v1

    .line 348
    const-string v3, ""

    const-string v5, ""

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/app/Activity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 427
    if-eqz v1, :cond_0

    .line 107
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    add-int/2addr v0, v6

    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v6, 0x4c

    aget-object v5, v5, v6

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    move v6, v0

    .line 480
    :cond_0
    invoke-static {p0}, Lcom/whatsapp/j5;->g(I)Landroid/net/Uri;

    move-result-object v1

    .line 450
    const-string v3, ""

    const-string v5, ""

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/app/Activity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 63
    if-eqz v0, :cond_1

    .line 292
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    add-int/2addr v6, v1

    .line 306
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x4d

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 224
    :cond_1
    return v6
.end method

.method public static a(ILjava/util/List;)Landroid/content/Intent;
    .locals 5
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Landroid/content/Intent;",
            ">;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/16 v4, 0x28

    sget v2, Lcom/whatsapp/g5;->n:I

    .line 571
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    move-object v0, v1

    .line 212
    :goto_0
    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    .line 183
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    .line 464
    invoke-static {v0, v3}, Lcom/whatsapp/a;->a(Landroid/content/Intent;Ljava/util/List;)V

    if-eqz v2, :cond_0

    .line 44
    :cond_1
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x26

    aget-object v2, v0, v2

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/content/Intent;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/Parcelable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 303
    return-object v1

    .line 51
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v3, v3, v4

    sget-object v4, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 19
    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x25

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 125
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v3, v3, v4

    sget-object v4, Landroid/provider/MediaStore$Video$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 277
    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x27

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 571
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9
    .parameter

    .prologue
    const/4 v8, 0x0

    const-wide/high16 v6, 0x4059

    const/16 v5, 0x64

    .line 228
    const-wide/high16 v0, 0x3ff0

    .line 379
    if-nez p0, :cond_0

    .line 506
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 88
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v5, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-le v2, v5, :cond_2

    .line 351
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v6

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v6

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    .line 327
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v3, v3

    div-double v0, v3, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x1

    invoke-static {p0, v2, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 127
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x30

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 330
    invoke-static {v1, v8, v8, v5, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 419
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0
.end method

.method private static a(Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;
    .locals 11
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 1
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 488
    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 47
    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 227
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 149
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 355
    new-instance v4, Landroid/graphics/RectF;

    int-to-float v0, p1

    int-to-float v5, p1

    invoke-direct {v4, v6, v6, v0, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 239
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    sub-int/2addr v0, v5

    div-int/lit8 v5, v0, 0x2

    .line 440
    if-lez v5, :cond_2

    .line 487
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    sub-int/2addr v6, v5

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-direct {v0, v5, v9, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    sget v6, Lcom/whatsapp/g5;->n:I

    if-eqz v6, :cond_3

    .line 9
    :cond_2
    new-instance v0, Landroid/graphics/Rect;

    neg-int v6, v5

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    add-int/2addr v5, v8

    invoke-direct {v0, v9, v6, v7, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 482
    :cond_3
    invoke-virtual {v3, v10}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 457
    invoke-virtual {v3, v10}, Landroid/graphics/Paint;->setDither(Z)V

    .line 364
    invoke-virtual {v3, v10}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 313
    invoke-virtual {v2, v9, v9, v9, v9}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 13
    const/4 v5, -0x1

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 368
    invoke-virtual {v2, v4, p2, p2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 467
    new-instance v5, Landroid/graphics/PorterDuffXfermode;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 12
    invoke-virtual {v2, p0, v0, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    move-object v0, v1

    .line 444
    goto :goto_0
.end method

.method public static a(Landroid/net/Uri;I)Landroid/graphics/Bitmap;
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 323
    .line 234
    :try_start_0
    sget-object v1, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {v1, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 209
    :try_start_1
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 16
    iput p1, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2
    const/4 v3, 0x1

    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 415
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xa

    if-lt v3, v4, :cond_0

    .line 167
    const/4 v3, 0x1

    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z

    .line 435
    :cond_0
    const/4 v3, 0x0

    invoke-static {v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 399
    if-eqz v2, :cond_1

    .line 78
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 164
    :cond_1
    :goto_0
    return-object v0

    .line 534
    :catch_0
    move-exception v1

    .line 381
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 217
    :catch_1
    move-exception v1

    move-object v2, v0

    .line 188
    :goto_1
    :try_start_3
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 220
    if-eqz v2, :cond_1

    .line 152
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 115
    :catch_2
    move-exception v1

    .line 166
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 537
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_2
    if-eqz v2, :cond_2

    .line 345
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 522
    :cond_2
    :goto_3
    throw v0

    .line 111
    :catch_3
    move-exception v1

    .line 421
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 537
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 217
    :catch_4
    move-exception v1

    goto :goto_1
.end method

.method public static a(Landroid/net/Uri;Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 5
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;,
            Ljava/lang/SecurityException;,
            Lcom/whatsapp/dg;,
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    const/16 v4, 0x64

    .line 441
    .line 56
    invoke-static {p0, p1}, Lcom/whatsapp/j5;->b(Landroid/net/Uri;Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 126
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 391
    if-eqz v1, :cond_0

    .line 17
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 270
    :cond_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 54
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x50

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 121
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 159
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 135
    invoke-static {p0, p1, v4, v4}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;Ljava/io/File;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/net/Uri;Ljava/io/File;II)Landroid/graphics/Bitmap;
    .locals 10
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;,
            Lcom/whatsapp/dg;,
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    sget v7, Lcom/whatsapp/g5;->n:I

    .line 495
    const/4 v0, 0x0

    .line 99
    const/4 v6, 0x0

    .line 516
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x19

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 194
    :cond_0
    if-eqz p0, :cond_4

    .line 504
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 15
    :goto_0
    if-eqz v1, :cond_7

    .line 106
    new-instance v2, Landroid/media/ExifInterface;

    invoke-direct {v2, v1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 174
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v0, v0, v3

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v0

    .line 413
    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x1a

    aget-object v3, v3, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v3

    .line 493
    sget-object v4, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v5, 0x14

    aget-object v4, v4, v5

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v2

    .line 80
    new-instance v4, Ljava/io/FileInputStream;

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 401
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 187
    div-int v6, v3, p2

    div-int v8, v2, p2

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 289
    const/4 v6, 0x1

    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 347
    const/4 v6, 0x0

    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 302
    const/4 v6, 0x0

    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 376
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v6, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 160
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0xa

    if-lt v6, v8, :cond_1

    .line 283
    const/4 v6, 0x1

    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z

    .line 564
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v9, 0xd

    aget-object v8, v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v9, 0x21

    aget-object v8, v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v9, 0x9

    aget-object v8, v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v9, 0x12

    aget-object v8, v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v9, 0x13

    aget-object v8, v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v8, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 372
    if-nez v3, :cond_5

    if-nez v2, :cond_5

    .line 366
    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 309
    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v6, 0x1e

    aget-object v3, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v6, 0xa

    aget-object v3, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 132
    :cond_2
    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    if-eqz v7, :cond_5

    .line 181
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 521
    new-instance v0, Lcom/whatsapp/dg;

    invoke-direct {v0}, Lcom/whatsapp/dg;-><init>()V

    throw v0

    .line 278
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    .line 333
    :cond_5
    const/4 v1, 0x0

    :try_start_0
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 20
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v0

    move-object v0, v1

    .line 502
    :goto_1
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-nez v1, :cond_e

    .line 241
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/whatsapp/dg;

    invoke-direct {v0}, Lcom/whatsapp/dg;-><init>()V

    throw v0

    .line 238
    :catch_0
    move-exception v0

    .line 334
    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 64
    throw v0

    .line 456
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move v2, v6

    goto :goto_1

    .line 538
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x1d

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 215
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {v0, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v8

    .line 210
    if-nez v8, :cond_9

    .line 387
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v1, 0x1b

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 280
    const/4 v0, 0x0

    :goto_2
    return-object v0

    .line 463
    :cond_9
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x18

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    const/4 v0, 0x1

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x15

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    .line 542
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 214
    if-eqz v1, :cond_14

    .line 199
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 141
    invoke-interface {v1}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_13

    .line 259
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v7, :cond_a

    .line 436
    :goto_3
    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 552
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x11

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :goto_4
    if-eqz v1, :cond_b

    .line 252
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 383
    :cond_b
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 325
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 216
    const/4 v2, 0x0

    invoke-static {v8, v2, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 375
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v2, p2

    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v3, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 258
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 255
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 41
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 438
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 439
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x10

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x9

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x13

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 307
    :try_start_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-lt v2, v3, :cond_c

    .line 261
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_1

    .line 86
    :cond_c
    :goto_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 483
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {v2, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 145
    const/4 v3, 0x0

    :try_start_3
    invoke-static {v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 499
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_2

    move v2, v0

    move-object v0, v1

    .line 308
    goto/16 :goto_1

    .line 263
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_d

    .line 533
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_d
    throw v0

    .line 418
    :catch_1
    move-exception v2

    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0xe

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto :goto_5

    .line 150
    :catch_2
    move-exception v0

    .line 385
    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x1c

    aget-object v1, v1, v3

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 388
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 492
    throw v0

    .line 319
    :cond_e
    const/4 v1, 0x0

    .line 29
    sparse-switch v2, :sswitch_data_0

    .line 3
    :cond_f
    :goto_6
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 517
    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_10

    .line 129
    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x20

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 254
    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 272
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 412
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 462
    :cond_10
    if-lez p3, :cond_12

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-gt v1, p3, :cond_11

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le v1, p3, :cond_12

    .line 291
    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 245
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, p2

    div-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, p2

    div-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 155
    new-instance v2, Landroid/graphics/Rect;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v1

    float-to-int v5, v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float v1, v6, v1

    float-to-int v1, v1

    invoke-direct {v2, v3, v4, v5, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 162
    new-instance v3, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-direct {v3, v1, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 218
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 264
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 225
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 189
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 344
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 449
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setDither(Z)V

    .line 331
    invoke-virtual {v4, v0, v3, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 236
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 465
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 118
    :sswitch_0
    const/high16 v1, 0x42b4

    .line 72
    if-eqz v7, :cond_f

    .line 514
    :sswitch_1
    const/high16 v1, 0x4334

    .line 529
    if-eqz v7, :cond_f

    .line 61
    :sswitch_2
    const/high16 v1, 0x4387

    .line 428
    goto/16 :goto_6

    :cond_13
    move v0, v6

    goto/16 :goto_3

    :cond_14
    move v0, v6

    goto/16 :goto_4

    .line 29
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x6 -> :sswitch_0
        0x8 -> :sswitch_2
        0x5a -> :sswitch_0
        0xb4 -> :sswitch_1
        0x10e -> :sswitch_2
    .end sparse-switch
.end method

.method public static a(Lcom/whatsapp/sz;Landroid/widget/ImageView;Landroid/app/Activity;)Landroid/widget/ImageView;
    .locals 16
    .parameter
    .parameter
    .parameter

    .prologue
    sget v2, Lcom/whatsapp/g5;->n:I

    .line 314
    invoke-static/range {p2 .. p2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v3, v1, Lcom/whatsapp/j4;->L:F

    .line 304
    invoke-virtual/range {p2 .. p2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0a000c

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v4, v1

    .line 206
    move-object/from16 v0, p0

    iget-byte v1, v0, Lcom/whatsapp/sz;->l:B

    packed-switch v1, :pswitch_data_0

    .line 414
    :cond_0
    :goto_0
    :pswitch_0
    return-object p1

    .line 256
    :pswitch_1
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 301
    invoke-static/range {p0 .. p0}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 108
    if-eqz v1, :cond_3

    .line 208
    invoke-static {v1, v4, v3}, Lcom/whatsapp/j5;->a(Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 248
    if-eqz v1, :cond_1

    .line 565
    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v2, :cond_2

    .line 445
    :cond_1
    const v1, 0x7f0203da

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 569
    :cond_2
    if-eqz v2, :cond_0

    .line 560
    :cond_3
    const v1, 0x7f0203da

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 501
    if-eqz v2, :cond_0

    .line 452
    :pswitch_2
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 52
    mul-int/lit8 v1, v4, 0x4

    div-int/lit8 v1, v1, 0x3

    .line 470
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 58
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 353
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 409
    new-instance v8, Landroid/graphics/RectF;

    const/4 v9, 0x0

    const/4 v10, 0x0

    int-to-float v1, v1

    int-to-float v11, v4

    invoke-direct {v8, v9, v10, v1, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 112
    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 93
    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 240
    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 402
    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v6, v1, v9, v10, v11}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 403
    const/4 v1, -0x1

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 100
    invoke-virtual {v6, v8, v3, v3, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 532
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v9}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 528
    invoke-static/range {p0 .. p0}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 498
    if-eqz v1, :cond_8

    .line 341
    :goto_1
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 340
    const/high16 v10, 0x3f80

    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v11

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    int-to-float v12, v12

    div-float/2addr v11, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v10

    const/high16 v11, 0x3f80

    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    move-result v12

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v12, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 400
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    div-int/lit8 v11, v11, 0x2

    int-to-float v11, v11

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    div-int/lit8 v12, v12, 0x2

    int-to-float v12, v12

    invoke-virtual {v9, v10, v10, v11, v12}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 285
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v10

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    int-to-float v11, v11

    sub-float/2addr v10, v11

    const/high16 v11, 0x4000

    div-float/2addr v10, v11

    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    move-result v11

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    int-to-float v12, v12

    sub-float/2addr v11, v12

    const/high16 v12, 0x4000

    div-float/2addr v11, v12

    invoke-virtual {v9, v10, v11}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 561
    invoke-virtual {v6, v1, v9, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 131
    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 75
    const/high16 v1, 0x6600

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 249
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 253
    invoke-virtual {v6, v8, v3, v3, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 290
    const v1, 0x41155555

    invoke-static/range {p2 .. p2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v9

    iget v9, v9, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v1, v9

    float-to-int v1, v1

    .line 451
    add-int/lit8 v9, v1, 0x2

    .line 46
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 153
    iget v11, v8, Landroid/graphics/RectF;->left:F

    iget v12, v8, Landroid/graphics/RectF;->bottom:F

    int-to-float v13, v9

    sub-float/2addr v12, v13

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 365
    iget v11, v8, Landroid/graphics/RectF;->right:F

    iget v12, v8, Landroid/graphics/RectF;->bottom:F

    int-to-float v13, v9

    sub-float/2addr v12, v13

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 510
    iget v11, v8, Landroid/graphics/RectF;->right:F

    iget v12, v8, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v12, v3

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 151
    new-instance v11, Landroid/graphics/RectF;

    iget v12, v8, Landroid/graphics/RectF;->right:F

    const/high16 v13, 0x4000

    mul-float/2addr v13, v3

    sub-float/2addr v12, v13

    iget v13, v8, Landroid/graphics/RectF;->bottom:F

    const/high16 v14, 0x4000

    mul-float/2addr v14, v3

    sub-float/2addr v13, v14

    iget v14, v8, Landroid/graphics/RectF;->right:F

    iget v15, v8, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v11, v12, v13, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v12, 0x0

    const/high16 v13, 0x42b4

    invoke-virtual {v10, v11, v12, v13}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 420
    iget v11, v8, Landroid/graphics/RectF;->left:F

    add-float/2addr v11, v3

    iget v12, v8, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 102
    new-instance v11, Landroid/graphics/RectF;

    iget v12, v8, Landroid/graphics/RectF;->left:F

    iget v13, v8, Landroid/graphics/RectF;->bottom:F

    const/high16 v14, 0x4000

    mul-float/2addr v14, v3

    sub-float/2addr v13, v14

    iget v14, v8, Landroid/graphics/RectF;->left:F

    const/high16 v15, 0x4000

    mul-float/2addr v15, v3

    add-float/2addr v14, v15

    iget v15, v8, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v11, v12, v13, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v12, 0x42b4

    const/high16 v13, 0x42b4

    invoke-virtual {v10, v11, v12, v13}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 110
    iget v11, v8, Landroid/graphics/RectF;->left:F

    iget v12, v8, Landroid/graphics/RectF;->bottom:F

    int-to-float v9, v9

    sub-float v9, v12, v9

    invoke-virtual {v10, v11, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 397
    sget-object v9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 549
    invoke-virtual {v6, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 79
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v7, :cond_4

    .line 316
    sget-object v7, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v10, 0x0

    invoke-virtual {v7, v9, v10}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v7

    .line 423
    invoke-virtual {v7}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v7

    .line 116
    new-instance v9, Landroid/text/TextPaint;

    invoke-direct {v9}, Landroid/text/TextPaint;-><init>()V

    .line 494
    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 478
    const/4 v10, -0x1

    invoke-virtual {v9, v10}, Landroid/text/TextPaint;->setColor(I)V

    .line 461
    int-to-float v1, v1

    invoke-virtual {v9, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 369
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v9, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 442
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v9, v1}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 27
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v1

    sub-float/2addr v1, v3

    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v7, v9, v1, v10}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 119
    iget v7, v8, Landroid/graphics/RectF;->left:F

    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v10

    const/high16 v11, 0x4000

    div-float/2addr v10, v11

    add-float/2addr v7, v10

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v9}, Landroid/text/TextPaint;->descent()F

    move-result v10

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    int-to-float v10, v10

    sub-float/2addr v8, v10

    invoke-virtual {v6, v1, v7, v8, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 39
    :cond_4
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 90
    if-eqz v2, :cond_0

    .line 503
    :pswitch_3
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 343
    const v1, 0x7f020008

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 520
    if-eqz v2, :cond_0

    .line 42
    :pswitch_4
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 422
    invoke-static/range {p0 .. p0}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 8
    if-eqz v1, :cond_7

    .line 553
    invoke-static {v1, v4, v3}, Lcom/whatsapp/j5;->a(Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 24
    if-eqz v1, :cond_5

    .line 114
    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v2, :cond_6

    .line 133
    :cond_5
    const v1, 0x7f02000d

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 530
    :cond_6
    if-eqz v2, :cond_0

    .line 349
    :cond_7
    const v1, 0x7f02000d

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_0

    .line 498
    :cond_8
    invoke-static {}, Lcom/whatsapp/d5;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    goto/16 :goto_1

    .line 206
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Landroid/net/Uri;)Ljava/io/File;
    .locals 7
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 393
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x31

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 392
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget v1, Lcom/whatsapp/g5;->n:I

    if-eqz v1, :cond_2

    .line 382
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x18

    aget-object v1, v1, v4

    aput-object v1, v2, v6

    move-object v1, p0

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 266
    if-nez v1, :cond_1

    .line 192
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x32

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 447
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 45
    new-instance v0, Ljava/io/File;

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 559
    :cond_2
    return-object v0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 4
    .parameter

    .prologue
    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 251
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v3, v3, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/mh;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 558
    return-object v0
.end method

.method public static a()V
    .locals 6

    .prologue
    .line 468
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 173
    const/4 v2, 0x0

    sput v2, Lcom/whatsapp/j5;->e:I

    .line 260
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/whatsapp/j5;->a(B)V

    .line 407
    const/4 v2, 0x3

    invoke-static {v2}, Lcom/whatsapp/j5;->a(B)V

    .line 232
    const/4 v2, 0x1

    invoke-static {v2}, Lcom/whatsapp/j5;->a(B)V

    .line 287
    sget v2, Lcom/whatsapp/j5;->e:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/whatsapp/j5;->e:I

    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x2d

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/whatsapp/j5;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x2c

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    sget-wide v4, Lcom/whatsapp/j5;->f:J

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x2f

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long v0, v3, v0

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x2e

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/whatsapp/j5;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 329
    return-void
.end method

.method private static a(B)V
    .locals 14
    .parameter

    .prologue
    const/16 v13, 0x13

    const/4 v12, 0x4

    const/4 v1, 0x0

    sget v3, Lcom/whatsapp/g5;->n:I

    .line 265
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/App;->c:Ljava/io/File;

    invoke-static {p0}, Lcom/whatsapp/et;->a(B)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 231
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 222
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 518
    if-eqz v4, :cond_9

    .line 356
    sget v0, Lcom/whatsapp/j5;->h:I

    array-length v2, v4

    add-int/2addr v0, v2

    sput v0, Lcom/whatsapp/j5;->h:I

    move v0, v1

    .line 200
    :cond_0
    array-length v2, v4

    if-ge v0, v2, :cond_8

    .line 103
    aget-object v5, v4, v0

    .line 235
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 374
    invoke-static {p0}, Lcom/whatsapp/j5;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v7, 0x5

    aget-object v2, v2, v7

    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 32
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v13, :cond_6

    .line 481
    const/16 v2, 0xf

    invoke-virtual {v6, v2, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 48
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 567
    const/4 v2, 0x4

    const/16 v8, 0xc

    invoke-virtual {v6, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 338
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 380
    sget v2, Lcom/whatsapp/j5;->g:I

    if-eqz v2, :cond_1

    sget v2, Lcom/whatsapp/j5;->g:I

    if-gt v2, v8, :cond_5

    .line 247
    :cond_1
    sget v2, Lcom/whatsapp/j5;->g:I

    if-ne v2, v8, :cond_b

    const/4 v2, 0x1

    .line 97
    :goto_0
    sput v8, Lcom/whatsapp/j5;->g:I

    .line 458
    sget v8, Lcom/whatsapp/j5;->e:I

    if-gt v7, v8, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    sget-wide v10, Lcom/whatsapp/j5;->f:J

    cmp-long v8, v8, v10

    if-lez v8, :cond_5

    .line 34
    :cond_2
    if-eqz v2, :cond_3

    sget v2, Lcom/whatsapp/j5;->e:I

    if-gt v2, v7, :cond_4

    .line 177
    :cond_3
    sput v7, Lcom/whatsapp/j5;->e:I

    .line 386
    :cond_4
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    sget-wide v9, Lcom/whatsapp/j5;->f:J

    cmp-long v2, v7, v9

    if-lez v2, :cond_5

    .line 262
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    sput-wide v7, Lcom/whatsapp/j5;->f:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    :cond_5
    :goto_1
    if-eqz v3, :cond_7

    .line 186
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v7, 0x3

    aget-object v5, v5, v7

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 431
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 332
    if-eqz v3, :cond_0

    .line 320
    :cond_8
    if-eqz v3, :cond_a

    .line 509
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v1, v1, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 284
    :cond_a
    return-void

    :cond_b
    move v2, v1

    .line 247
    goto :goto_0

    .line 117
    :catch_0
    move-exception v2

    .line 505
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v7, 0x6

    aget-object v5, v5, v7

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public static a(Lcom/whatsapp/sz;)V
    .locals 3
    .parameter

    .prologue
    .line 417
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/sz;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 526
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 556
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-byte v2, p0, Lcom/whatsapp/sz;->l:B

    invoke-static {v2}, Lcom/whatsapp/j5;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-byte v1, p0, Lcom/whatsapp/sz;->l:B

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Ljava/lang/String;B)Ljava/io/File;

    move-result-object v1

    .line 172
    iget-object v0, p0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 154
    iget-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v2, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 474
    iget-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 23
    iput-object v1, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 363
    return-void
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)V
    .locals 7
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    sget v3, Lcom/whatsapp/g5;->n:I

    .line 82
    const/4 v2, 0x0

    .line 175
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 136
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 257
    :cond_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 476
    const/16 v4, 0x1000

    new-array v4, v4, [B

    .line 120
    :cond_1
    const/4 v5, 0x0

    array-length v6, v4

    invoke-virtual {v1, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-ltz v5, :cond_2

    .line 328
    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 551
    add-int/2addr v0, v5

    if-eqz v3, :cond_1

    .line 293
    :cond_2
    if-eqz v1, :cond_3

    .line 317
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 354
    :cond_3
    return-void

    .line 81
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_4

    .line 202
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_4
    throw v0

    .line 81
    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Intent;Ljava/io/File;)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;,
            Lcom/whatsapp/dg;,
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    .line 547
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0, p2}, Lcom/whatsapp/j5;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/io/File;)V

    .line 490
    return-void

    .line 547
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Landroid/net/Uri;Ljava/io/File;)V
    .locals 5
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;,
            Lcom/whatsapp/dg;,
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 555
    .line 226
    :try_start_0
    invoke-static {p1, p2}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;Ljava/io/File;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 411
    if-nez v0, :cond_0

    .line 213
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v1, 0x22

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 207
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090207

    invoke-static {v0, v1, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 430
    :goto_0
    return-void

    .line 424
    :catch_0
    move-exception v0

    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x23

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 300
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f09020a

    invoke-static {v0, v1, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    goto :goto_0

    .line 96
    :cond_0
    new-instance v1, Lcom/whatsapp/MediaData;

    invoke-direct {v1}, Lcom/whatsapp/MediaData;-><init>()V

    .line 128
    iput-object p2, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 95
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 35
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x50

    invoke-virtual {v0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 429
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 398
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 389
    const/4 v0, 0x1

    invoke-static {p0, v2, v1, v0}, Lcom/whatsapp/App;->a(Ljava/lang/String;[BLcom/whatsapp/MediaData;B)V

    goto :goto_0
.end method

.method public static a([BLjava/io/File;)V
    .locals 3
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 527
    if-eqz p0, :cond_0

    .line 25
    const/4 v2, 0x0

    .line 500
    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 281
    if-eqz v1, :cond_0

    .line 195
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 244
    :cond_0
    :goto_0
    return-void

    .line 171
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_1

    .line 184
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 406
    :cond_1
    :goto_2
    throw v0

    .line 83
    :catch_0
    move-exception v0

    goto :goto_0

    .line 406
    :catch_1
    move-exception v1

    goto :goto_2

    .line 171
    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method public static a(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    sget v7, Lcom/whatsapp/g5;->n:I

    .line 497
    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xc00000

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 315
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x33

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 233
    const v0, 0x7f0901f8

    invoke-interface {p1, v0}, Lcom/whatsapp/lr;->a(I)V

    .line 433
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 324
    :cond_0
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 512
    const-string v0, ""

    .line 358
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 299
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 76
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p4}, Lcom/whatsapp/App;->a(Ljava/lang/String;B)Ljava/io/File;

    move-result-object v0

    .line 312
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 367
    new-instance v8, Lcom/whatsapp/MediaData;

    invoke-direct {v8}, Lcom/whatsapp/MediaData;-><init>()V

    .line 196
    invoke-static {p3, v0}, Lcom/whatsapp/j5;->a(Ljava/io/File;Ljava/io/File;)V

    .line 21
    iput-object v0, v8, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 396
    const/4 v0, 0x3

    if-ne p4, v0, :cond_8

    .line 182
    :try_start_0
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1

    .line 384
    const/4 v1, 0x0

    .line 426
    :try_start_1
    iget-object v2, v8, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 337
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-lt v2, v3, :cond_6

    .line 519
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 242
    :goto_1
    if-eqz v0, :cond_4

    .line 276
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x36

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x34

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 576
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    .line 544
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v3, v1, Lcom/whatsapp/j4;->X:I

    if-ne v2, v3, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, v1, Lcom/whatsapp/j4;->X:I

    if-eq v2, v3, :cond_3

    .line 156
    :cond_2
    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x35

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-le v2, v3, :cond_7

    .line 144
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 176
    iget v1, v1, Lcom/whatsapp/j4;->X:I

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 360
    invoke-virtual {v5, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 123
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 459
    :goto_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 36
    :cond_3
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 350
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x50

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 318
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 60
    invoke-static {p2, v1, v8, p4}, Lcom/whatsapp/App;->a(Ljava/lang/String;[BLcom/whatsapp/MediaData;B)V

    .line 165
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 548
    if-eqz v7, :cond_5

    .line 536
    :cond_4
    const/4 v0, 0x0

    invoke-static {p2, v0, v8, p4}, Lcom/whatsapp/App;->a(Ljava/lang/String;[BLcom/whatsapp/MediaData;B)V
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_1

    .line 98
    :cond_5
    :goto_3
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 142
    :cond_6
    :try_start_3
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->captureFrame()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/j5;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v0

    goto/16 :goto_1

    .line 179
    :catch_0
    move-exception v0

    .line 475
    :try_start_4
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    move-object v0, v1

    goto/16 :goto_1

    .line 469
    :cond_7
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 460
    iget v1, v1, Lcom/whatsapp/j4;->X:I

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 486
    invoke-virtual {v5, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 94
    const/4 v1, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_1

    move-result-object v1

    goto :goto_2

    .line 85
    :catch_1
    move-exception v0

    .line 122
    const/4 v0, 0x0

    invoke-static {p2, v0, v8, p4}, Lcom/whatsapp/App;->a(Ljava/lang/String;[BLcom/whatsapp/MediaData;B)V

    .line 223
    if-eqz v7, :cond_5

    .line 515
    :cond_8
    const/4 v0, 0x0

    invoke-static {p2, v0, v8, p4}, Lcom/whatsapp/App;->a(Ljava/lang/String;[BLcom/whatsapp/MediaData;B)V

    goto :goto_3
.end method

.method public static b(Landroid/net/Uri;Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;,
            Lcom/whatsapp/dg;,
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    .line 146
    const/16 v0, 0x320

    const/16 v1, 0x3e8

    invoke-static {p0, p1, v0, v1}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;Ljava/io/File;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/io/File;
    .locals 3

    .prologue
    .line 513
    sget-object v0, Lcom/whatsapp/j5;->a:Ljava/io/File;

    if-nez v0, :cond_0

    .line 535
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090002

    invoke-virtual {v1, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 362
    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    .line 14
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/whatsapp/j5;->a:Ljava/io/File;

    .line 229
    :cond_0
    sget-object v0, Lcom/whatsapp/j5;->a:Ljava/io/File;

    return-object v0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 6
    .parameter

    .prologue
    .line 305
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 539
    sget-wide v3, Lcom/whatsapp/j5;->f:J

    invoke-static {v3, v4, v1, v2}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 523
    const/4 v0, 0x0

    sput v0, Lcom/whatsapp/j5;->e:I

    .line 545
    :cond_0
    const/4 v0, 0x0

    .line 508
    packed-switch p0, :pswitch_data_0

    .line 157
    :goto_0
    new-instance v3, Ljava/text/DecimalFormat;

    sget-object v4, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v5, 0x3d

    aget-object v4, v4, v5

    invoke-direct {v3, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 404
    sget v4, Lcom/whatsapp/j5;->e:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    .line 554
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/whatsapp/t4;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v5, 0x5

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 273
    sput-wide v1, Lcom/whatsapp/j5;->f:J

    .line 432
    sget v1, Lcom/whatsapp/j5;->e:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/whatsapp/j5;->e:I

    .line 130
    return-object v0

    .line 446
    :pswitch_0
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x3c

    aget-object v0, v0, v3

    goto :goto_0

    .line 7
    :pswitch_1
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x3b

    aget-object v0, v0, v3

    goto :goto_0

    .line 378
    :pswitch_2
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x3a

    aget-object v0, v0, v3

    goto :goto_0

    .line 508
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static b(ILandroid/app/Activity;)V
    .locals 12
    .parameter
    .parameter

    .prologue
    const-wide/32 v7, 0xc00000

    const/16 v11, 0x43

    const/4 v10, 0x7

    const/4 v9, 0x0

    const/4 v6, 0x1

    sget v1, Lcom/whatsapp/g5;->n:I

    .line 410
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 568
    packed-switch p0, :pswitch_data_0

    .line 55
    :cond_0
    :pswitch_0
    invoke-static {p0, v0}, Lcom/whatsapp/j5;->a(ILjava/util/List;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 484
    :goto_0
    return-void

    .line 477
    :pswitch_1
    invoke-static {v6, p1}, Lcom/whatsapp/j5;->a(ILandroid/app/Activity;)I

    move-result v2

    sput v2, Lcom/whatsapp/j5;->c:I

    .line 479
    invoke-static {v6}, Lcom/whatsapp/j5;->d(I)Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    .line 124
    new-instance v3, Landroid/content/Intent;

    sget-object v4, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v5, 0x41

    aget-object v4, v4, v5

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v4, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v5, 0x4b

    aget-object v4, v4, v5

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v2

    .line 65
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    if-eqz v1, :cond_0

    .line 491
    :pswitch_2
    const/4 v2, 0x3

    invoke-static {v2, p1}, Lcom/whatsapp/j5;->a(ILandroid/app/Activity;)I

    move-result v2

    sput v2, Lcom/whatsapp/j5;->d:I

    .line 246
    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x4a

    aget-object v3, v3, v4

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 570
    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x42

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 87
    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x48

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 193
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 434
    if-eqz v1, :cond_0

    .line 448
    :pswitch_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 563
    invoke-static {p0}, Lcom/whatsapp/j5;->h(I)Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x44

    aget-object v3, v3, v4

    invoke-virtual {v0, v3, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object v3

    .line 191
    sget-object v0, Lcom/whatsapp/App;->hb:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v3, v9}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 541
    if-eqz v0, :cond_4

    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 310
    iget-object v5, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 550
    iget-object v6, v5, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v8, v8, v11

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v8, v8, v10

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 321
    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v7, 0x49

    aget-object v5, v5, v7

    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v7, 0x47

    aget-object v5, v5, v7

    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v7, 0x46

    aget-object v5, v5, v7

    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v7, 0x45

    aget-object v5, v5, v7

    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 540
    :cond_2
    new-instance v5, Landroid/util/Pair;

    invoke-direct {v5, v0, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    :cond_3
    if-eqz v1, :cond_1

    .line 66
    :cond_4
    new-instance v0, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x40

    aget-object v3, v3, v4

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v4, 0x3f

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    .line 297
    sget-object v0, Lcom/whatsapp/App;->hb:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v3, v9}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 178
    if-eqz v0, :cond_6

    .line 472
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 443
    iget-object v5, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 352
    iget-object v6, v5, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 425
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v8, v8, v11

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v7, v7, v10

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 371
    new-instance v5, Landroid/util/Pair;

    invoke-direct {v5, v0, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    if-eqz v1, :cond_5

    .line 267
    :cond_6
    new-instance v0, Lcom/whatsapp/a;

    const v1, 0x7f0900f5

    invoke-direct {v0, p1, v1, v2, p0}, Lcom/whatsapp/a;-><init>(Landroid/app/Activity;ILjava/util/List;I)V

    invoke-virtual {v0}, Lcom/whatsapp/a;->show()V

    goto/16 :goto_0

    .line 568
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static b(Landroid/net/Uri;)V
    .locals 3
    .parameter

    .prologue
    .line 169
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x24

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 531
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 89
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 91
    return-void
.end method

.method public static b(Lcom/whatsapp/sz;)V
    .locals 1
    .parameter

    .prologue
    .line 143
    iget-object v0, p0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/j5;->b(Landroid/net/Uri;)V

    .line 322
    return-void
.end method

.method private static c(I)Ljava/lang/String;
    .locals 2
    .parameter

    .prologue
    .line 185
    packed-switch p0, :pswitch_data_0

    .line 573
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 205
    :pswitch_0
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v1, 0x38

    aget-object v0, v0, v1

    goto :goto_0

    .line 524
    :pswitch_1
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v1, 0x39

    aget-object v0, v0, v1

    goto :goto_0

    .line 104
    :pswitch_2
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v1, 0x37

    aget-object v0, v0, v1

    goto :goto_0

    .line 185
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static c()V
    .locals 6

    .prologue
    sget v1, Lcom/whatsapp/g5;->n:I

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x29

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v2

    const-wide/16 v4, 0x400

    div-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x2a

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 147
    sget-object v0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    if-eqz v0, :cond_0

    .line 84
    sget-object v0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    invoke-virtual {v0}, Lcom/whatsapp/MediaGallery;->c()V

    .line 62
    sget-object v0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    invoke-virtual {v0}, Lcom/whatsapp/MediaGallery;->finish()V

    .line 566
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 134
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 373
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v3

    iget-object v3, v3, Lcom/whatsapp/Conversations;->n:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 219
    sget-object v3, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 275
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 454
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 346
    :cond_2
    if-eqz v1, :cond_1

    .line 326
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 40
    sget-object v0, Lcom/whatsapp/App;->xb:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 271
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 357
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->finish()V

    .line 562
    :cond_4
    return-void
.end method

.method private static d(I)Ljava/io/File;
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/whatsapp/App;->a(Ljava/lang/String;B)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/j5;->a:Ljava/io/File;

    .line 390
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090002

    invoke-virtual {v1, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/whatsapp/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 59
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 161
    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    sget-object v2, Lcom/whatsapp/j5;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 268
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 525
    :cond_0
    sget-object v0, Lcom/whatsapp/j5;->a:Ljava/io/File;

    return-object v0
.end method

.method private static e(I)[Ljava/lang/String;
    .locals 4
    .parameter

    .prologue
    const/16 v3, 0x2b

    const/4 v2, 0x0

    const/4 v0, 0x1

    .line 230
    if-ne p0, v0, :cond_0

    .line 288
    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    aput-object v1, v0, v2

    .line 511
    :goto_0
    return-object v0

    :cond_0
    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    aput-object v1, v0, v2

    goto :goto_0
.end method

.method private static f(I)Landroid/net/Uri;
    .locals 1
    .parameter

    .prologue
    .line 197
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 574
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :goto_0
    return-object v0

    .line 250
    :cond_0
    sget-object v0, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0
.end method

.method private static g(I)Landroid/net/Uri;
    .locals 1
    .parameter

    .prologue
    .line 557
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 92
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 269
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Landroid/provider/MediaStore$Video$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0
.end method

.method public static h(I)Landroid/content/Intent;
    .locals 4
    .parameter

    .prologue
    sget v0, Lcom/whatsapp/g5;->n:I

    .line 395
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x3e

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 137
    packed-switch p0, :pswitch_data_0

    .line 361
    :cond_0
    :goto_0
    :pswitch_0
    return-object v1

    .line 49
    :pswitch_1
    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x25

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    if-eqz v0, :cond_0

    .line 294
    :pswitch_2
    sget-object v2, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v3, 0x27

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 204
    if-eqz v0, :cond_0

    .line 370
    :pswitch_3
    sget-object v0, Lcom/whatsapp/j5;->z:[Ljava/lang/String;

    const/16 v2, 0x3f

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 137
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
