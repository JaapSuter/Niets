.class public Lcom/whatsapp/zq;
.super Lcom/whatsapp/yq;
.source "zq.java"


# static fields
.field private static final u:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:[Ljava/lang/String;


# instance fields
.field public f:J

.field public g:Lcom/whatsapp/uq;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/Integer;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Ljava/lang/String;

.field public transient n:Z

.field public o:I

.field public p:I

.field public q:J

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x56

    const/16 v4, 0x54

    const/16 v2, 0x11

    const/16 v3, 0xf

    const/4 v6, 0x0

    const/16 v0, 0x25

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "ye\u0007{5:<\u000b`!8eH"

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

    const-string v0, "yr\u0007c83r\u001cf;8<\u000b`!8eH"

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

    const-string v0, "\u0016bFx<7e\u001bn$&?\u0006j "

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

    const-string v0, "&c\u0007m83|\t{=51\u000b`:\"p\u000b{n"

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

    const-string v0, "va\u0000`:3,"

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

    const-string v0, "$~\u001fP=2,"

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

    const-string v0, "vz\rvi"

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

    const-string v0, "~\u007f\u001dc8\u007f"

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

    const-string v0, "v{\u0001ki"

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

    const-string v0, "vx\u001bx5k"

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

    const-string v0, "yr\u0007z:\"1"

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

    const-string v0, "\"t\u0005\u007f"

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

    const-string v0, "5d\u001b{;;N\u001af:1e\u0007a1"

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

    const-string v0, "v\u007f\tb1k"

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

    const-string v0, "vb\u001cn #bU"

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

    const-string v0, "\u0017g\t{5$b"

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

    aput-object v0, v9, v3

    const/16 v10, 0x10

    const-string v0, "x{"

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

    const-string v0, "!p\u000b`:\"p\u000b{{1t\u001c\u007f<9e\u0007i5%eG`!\"<\u0007iy;t\u0005`&/1"

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

    aput-object v0, v9, v2

    const/16 v10, 0x12

    const-string v0, "vu\rl;2t;{&3p\u0005/&3e\u001d}:%1\u0006z8:"

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

    const-string v0, "vt\u001a};$1\u000bc;%x\u0006ht%e\u001aj5;"

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

    const-string v0, "vb\u001c}17|Hf\'v\u007f\u001dc8"

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

    const-string v0, "!p\u000b`:\"p\u000b{{1t\u001c\u007f<9e\u0007i5%eG"

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

    const-string v0, "!p\u000b`:\"p\u000b{{1t\u001c\u007f<9e\u0007i5%eGj&$~\u001a/"

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

    const-string v0, "$p\u001fP79\u007f\u001cn7\"N\u0001ktk1W/\u0015\u0018UHb=;t\u001cv$3,W"

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

    const/16 v10, 0x18

    const-string v0, "2p\u001cng"

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

    aput-object v0, v9, v10

    const/16 v10, 0x19

    const-string v0, "2p\u001cnf"

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

    const-string v0, " \u007f\u000c!58u\u001a`=2?\u000bz&%~\u001a!=\"t\u0005 :7|\r"

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

    const-string v0, "#a\u000cn 3A\u0000` 9W\u0001c1%"

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

    const-string v0, "9a\ra\u00179\u007f\u001cn7\"A\u0000` 9X\u0006\u007f!\"B\u001c}17|"

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

    const-string v0, "ve\u0000z941\u000ef831\u0005f\'%x\u0006ht?uR"

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

    const-string v0, "!p\u000b`:\"p\u000b{{1t\u001c\u007f<9e\u0007| $t\tb{"

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

    const-string v0, "vw\u001dc8vw\u0001c1v|\u0001|\'?\u007f\u000f/=2+"

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

    const-string v0, ";~\u001da 3u"

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

    const-string v0, ";~\u001da 3u7};"

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

    const-string v0, "x\u007f\u0007b12x\t"

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

    const-string v0, "x{\u0018h"

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

    const/16 v8, 0x24

    const-string v0, "\u0006c\u0007i=:tH_=5e\u001d}1%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_24
    if-gt v6, v7, :cond_24

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    .line 248
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whatsapp/zq;->u:Ljava/util/HashMap;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_25
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_25

    :pswitch_1
    move v0, v2

    goto :goto_25

    :pswitch_2
    const/16 v0, 0x68

    goto :goto_25

    :pswitch_3
    move v0, v3

    goto :goto_25

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_26

    :pswitch_5
    move v0, v2

    goto :goto_26

    :pswitch_6
    const/16 v0, 0x68

    goto :goto_26

    :pswitch_7
    move v0, v3

    goto :goto_26

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_27

    :pswitch_9
    move v0, v2

    goto :goto_27

    :pswitch_a
    const/16 v0, 0x68

    goto :goto_27

    :pswitch_b
    move v0, v3

    goto :goto_27

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_28

    :pswitch_d
    move v0, v2

    goto :goto_28

    :pswitch_e
    const/16 v0, 0x68

    goto :goto_28

    :pswitch_f
    move v0, v3

    goto :goto_28

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_29

    :pswitch_11
    move v0, v2

    goto :goto_29

    :pswitch_12
    const/16 v0, 0x68

    goto :goto_29

    :pswitch_13
    move v0, v3

    goto :goto_29

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_2a

    :pswitch_15
    move v0, v2

    goto :goto_2a

    :pswitch_16
    const/16 v0, 0x68

    goto :goto_2a

    :pswitch_17
    move v0, v3

    goto :goto_2a

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_2b

    :pswitch_19
    move v0, v2

    goto :goto_2b

    :pswitch_1a
    const/16 v0, 0x68

    goto :goto_2b

    :pswitch_1b
    move v0, v3

    goto :goto_2b

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_2c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_2c

    :pswitch_1d
    move v0, v2

    goto :goto_2c

    :pswitch_1e
    const/16 v0, 0x68

    goto :goto_2c

    :pswitch_1f
    move v0, v3

    goto :goto_2c

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_2d

    :pswitch_21
    move v0, v2

    goto :goto_2d

    :pswitch_22
    const/16 v0, 0x68

    goto :goto_2d

    :pswitch_23
    move v0, v3

    goto :goto_2d

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_2e

    :pswitch_25
    move v0, v2

    goto :goto_2e

    :pswitch_26
    const/16 v0, 0x68

    goto :goto_2e

    :pswitch_27
    move v0, v3

    goto :goto_2e

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_2f

    :pswitch_29
    move v0, v2

    goto :goto_2f

    :pswitch_2a
    const/16 v0, 0x68

    goto :goto_2f

    :pswitch_2b
    move v0, v3

    goto :goto_2f

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_30

    :pswitch_2d
    move v0, v2

    goto :goto_30

    :pswitch_2e
    const/16 v0, 0x68

    goto :goto_30

    :pswitch_2f
    move v0, v3

    goto :goto_30

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_31
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_31

    :pswitch_31
    move v0, v2

    goto :goto_31

    :pswitch_32
    const/16 v0, 0x68

    goto :goto_31

    :pswitch_33
    move v0, v3

    goto :goto_31

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_32

    :pswitch_35
    move v0, v2

    goto :goto_32

    :pswitch_36
    const/16 v0, 0x68

    goto :goto_32

    :pswitch_37
    move v0, v3

    goto :goto_32

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_33

    :pswitch_39
    move v0, v2

    goto :goto_33

    :pswitch_3a
    const/16 v0, 0x68

    goto :goto_33

    :pswitch_3b
    move v0, v3

    goto :goto_33

    :cond_f
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_34
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_34

    :pswitch_3d
    move v0, v2

    goto :goto_34

    :pswitch_3e
    const/16 v0, 0x68

    goto :goto_34

    :pswitch_3f
    move v0, v3

    goto :goto_34

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_35

    :pswitch_41
    move v0, v2

    goto :goto_35

    :pswitch_42
    const/16 v0, 0x68

    goto :goto_35

    :pswitch_43
    move v0, v3

    goto :goto_35

    :cond_11
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_36
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_36

    :pswitch_45
    move v0, v2

    goto :goto_36

    :pswitch_46
    const/16 v0, 0x68

    goto :goto_36

    :pswitch_47
    move v0, v3

    goto :goto_36

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_37

    :pswitch_49
    move v0, v2

    goto :goto_37

    :pswitch_4a
    const/16 v0, 0x68

    goto :goto_37

    :pswitch_4b
    move v0, v3

    goto :goto_37

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_38

    :pswitch_4d
    move v0, v2

    goto :goto_38

    :pswitch_4e
    const/16 v0, 0x68

    goto :goto_38

    :pswitch_4f
    move v0, v3

    goto :goto_38

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_39

    :pswitch_51
    move v0, v2

    goto :goto_39

    :pswitch_52
    const/16 v0, 0x68

    goto :goto_39

    :pswitch_53
    move v0, v3

    goto :goto_39

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_3a

    :pswitch_55
    move v0, v2

    goto :goto_3a

    :pswitch_56
    const/16 v0, 0x68

    goto :goto_3a

    :pswitch_57
    move v0, v3

    goto :goto_3a

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_3b

    :pswitch_59
    move v0, v2

    goto :goto_3b

    :pswitch_5a
    const/16 v0, 0x68

    goto :goto_3b

    :pswitch_5b
    move v0, v3

    goto :goto_3b

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_3c

    :pswitch_5d
    move v0, v2

    goto :goto_3c

    :pswitch_5e
    const/16 v0, 0x68

    goto :goto_3c

    :pswitch_5f
    move v0, v3

    goto :goto_3c

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_3d

    :pswitch_61
    move v0, v2

    goto :goto_3d

    :pswitch_62
    const/16 v0, 0x68

    goto :goto_3d

    :pswitch_63
    move v0, v3

    goto :goto_3d

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_3e

    :pswitch_65
    move v0, v2

    goto :goto_3e

    :pswitch_66
    const/16 v0, 0x68

    goto :goto_3e

    :pswitch_67
    move v0, v3

    goto :goto_3e

    :cond_1a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_3f

    :pswitch_69
    move v0, v2

    goto :goto_3f

    :pswitch_6a
    const/16 v0, 0x68

    goto :goto_3f

    :pswitch_6b
    move v0, v3

    goto :goto_3f

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_40

    :pswitch_6d
    move v0, v2

    goto :goto_40

    :pswitch_6e
    const/16 v0, 0x68

    goto :goto_40

    :pswitch_6f
    move v0, v3

    goto :goto_40

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_41

    :pswitch_71
    move v0, v2

    goto :goto_41

    :pswitch_72
    const/16 v0, 0x68

    goto :goto_41

    :pswitch_73
    move v0, v3

    goto :goto_41

    :cond_1d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_42

    :pswitch_75
    move v0, v2

    goto :goto_42

    :pswitch_76
    const/16 v0, 0x68

    goto :goto_42

    :pswitch_77
    move v0, v3

    goto :goto_42

    :cond_1e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_43

    :pswitch_79
    move v0, v2

    goto :goto_43

    :pswitch_7a
    const/16 v0, 0x68

    goto :goto_43

    :pswitch_7b
    move v0, v3

    goto :goto_43

    :cond_1f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_44

    :pswitch_7d
    move v0, v2

    goto :goto_44

    :pswitch_7e
    const/16 v0, 0x68

    goto :goto_44

    :pswitch_7f
    move v0, v3

    goto :goto_44

    :cond_20
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_45

    :pswitch_81
    move v0, v2

    goto :goto_45

    :pswitch_82
    const/16 v0, 0x68

    goto :goto_45

    :pswitch_83
    move v0, v3

    goto :goto_45

    :cond_21
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_46

    :pswitch_85
    move v0, v2

    goto :goto_46

    :pswitch_86
    const/16 v0, 0x68

    goto :goto_46

    :pswitch_87
    move v0, v3

    goto :goto_46

    :cond_22
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_47

    :pswitch_89
    move v0, v2

    goto :goto_47

    :pswitch_8a
    const/16 v0, 0x68

    goto :goto_47

    :pswitch_8b
    move v0, v3

    goto :goto_47

    :cond_23
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_48

    :pswitch_8d
    move v0, v2

    goto :goto_48

    :pswitch_8e
    const/16 v0, 0x68

    goto :goto_48

    :pswitch_8f
    move v0, v3

    goto :goto_48

    :cond_24
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_49
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_49

    :pswitch_91
    move v0, v2

    goto :goto_49

    :pswitch_92
    const/16 v0, 0x68

    goto :goto_49

    :pswitch_93
    move v0, v3

    goto :goto_49

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
.end method

.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x5

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 67
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/whatsapp/yq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/whatsapp/zq;->f:J

    .line 91
    iput-object v4, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 318
    iput-object v4, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 356
    iput-boolean v1, p0, Lcom/whatsapp/zq;->l:Z

    .line 329
    iput-object v4, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 240
    iput-boolean v0, p0, Lcom/whatsapp/zq;->n:Z

    .line 119
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/whatsapp/zq;->f:J

    .line 3
    const/4 v2, 0x7

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 391
    const/16 v2, 0x8

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 365
    const/16 v2, 0x9

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 158
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 214
    const/4 v3, 0x6

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 237
    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-gtz v5, :cond_0

    const-wide/16 v5, -0x2

    cmp-long v5, v3, v5

    if-nez v5, :cond_1

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v5, v7, :cond_1

    .line 179
    new-instance v5, Lcom/whatsapp/uq;

    invoke-direct {v5, v3, v4, v2}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    iput-object v5, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    sget v3, Lcom/whatsapp/yq;->e:I

    if-eqz v3, :cond_2

    .line 396
    :cond_1
    if-eqz v2, :cond_2

    .line 242
    iput-object v2, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 347
    :cond_2
    const/4 v2, 0x2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    if-ne v2, v0, :cond_3

    :goto_0
    iput-boolean v0, p0, Lcom/whatsapp/zq;->k:Z

    .line 161
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/zq;->a:I

    .line 170
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/zq;->o:I

    .line 285
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/zq;->p:I

    .line 313
    const/16 v0, 0xd

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/zq;->q:J

    .line 349
    const/16 v0, 0xe

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    .line 53
    const/16 v0, 0xf

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/zq;->s:Ljava/lang/String;

    .line 397
    const/16 v0, 0x10

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/zq;->t:Ljava/lang/String;

    .line 20
    return-void

    :cond_3
    move v0, v1

    .line 347
    goto :goto_0
.end method

.method public constructor <init>(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 283
    invoke-direct {p0}, Lcom/whatsapp/yq;-><init>()V

    .line 383
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/whatsapp/zq;->f:J

    .line 193
    iput-object v2, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 363
    iput-object v2, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/zq;->l:Z

    .line 176
    iput-object v2, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 184
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/zq;->n:Z

    .line 100
    iput-object p1, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 205
    iput-object p2, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 316
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 97
    iput-object p4, p0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 346
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 334
    invoke-direct {p0, p1}, Lcom/whatsapp/yq;-><init>(Ljava/lang/String;)V

    .line 359
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/whatsapp/zq;->f:J

    .line 247
    iput-object v2, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 98
    iput-object v2, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 222
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/zq;->l:Z

    .line 371
    iput-object v2, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 120
    iput-boolean v3, p0, Lcom/whatsapp/zq;->n:Z

    .line 337
    iput-boolean v3, p0, Lcom/whatsapp/zq;->k:Z

    .line 31
    iput-object v2, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 354
    invoke-direct {p0}, Lcom/whatsapp/yq;-><init>()V

    .line 366
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/whatsapp/zq;->f:J

    .line 2
    iput-object v2, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 364
    iput-object v2, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/zq;->l:Z

    .line 267
    iput-object v2, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/zq;->n:Z

    .line 400
    iput-object p4, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 5
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 253
    iput-object p6, p0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 86
    new-instance v0, Lcom/whatsapp/uq;

    invoke-direct {v0, p2, p3, p1}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 314
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 165
    invoke-direct {p0}, Lcom/whatsapp/yq;-><init>()V

    .line 81
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/whatsapp/zq;->f:J

    .line 188
    iput-object v2, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 93
    iput-object v2, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/zq;->l:Z

    .line 384
    iput-object v2, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 10
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/zq;->n:Z

    .line 405
    iput-object p1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    .line 94
    iput-boolean p2, p0, Lcom/whatsapp/zq;->k:Z

    .line 178
    iput-object p6, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 255
    new-instance v0, Lcom/whatsapp/uq;

    invoke-direct {v0, p4, p5, p3}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 171
    return-void
.end method

.method public static a(Landroid/database/Cursor;)Lcom/whatsapp/zq;
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x0

    const/4 v2, 0x1

    .line 195
    new-instance v0, Lcom/whatsapp/zq;

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-ne v3, v2, :cond_0

    :goto_0
    const/4 v3, 0x3

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    const/4 v6, 0x5

    invoke-interface {p0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;)V

    .line 409
    invoke-interface {p0, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/zq;->f:J

    .line 319
    return-object v0

    :cond_0
    move v2, v7

    .line 195
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/io/File;
    .locals 5
    .parameter

    .prologue
    .line 343
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/whatsapp/App;->c:Ljava/io/File;

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x24

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 109
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 168
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 14
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x22

    aget-object v2, v2, v3

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 103
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :cond_0
    :goto_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    const-string v4, "@"

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x23

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1

    .line 352
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Ljava/util/Collection;Ljava/lang/String;)V
    .locals 6
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/LinkedList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    sget v3, Lcom/whatsapp/yq;->e:I

    .line 368
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    .line 227
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 312
    sget v1, Lcom/whatsapp/App;->f:I

    if-ge v1, v5, :cond_0

    .line 226
    :goto_0
    return-void

    .line 130
    :cond_0
    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_5

    .line 175
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedList;

    .line 77
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v5

    add-int/2addr v1, v5

    .line 73
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    if-eqz v3, :cond_2

    :cond_3
    if-eqz v3, :cond_1

    .line 243
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v2, v3, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move v1, v2

    goto :goto_1
.end method

.method public static a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 302
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    .line 389
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 72
    sget v2, Lcom/whatsapp/App;->f:I

    const/4 v3, 0x1

    if-ge v2, v3, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 306
    :cond_1
    const/16 v2, 0x1388

    if-ge v0, v2, :cond_0

    .line 322
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 380
    if-eqz v1, :cond_2

    goto :goto_0
.end method

.method public static a(Ljava/util/List;Lcom/whatsapp/wq;)Z
    .locals 4
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Lcom/whatsapp/wq;",
            ")Z"
        }
    .end annotation

    .prologue
    sget v2, Lcom/whatsapp/yq;->e:I

    .line 116
    const/4 v0, 0x0

    .line 110
    if-eqz p0, :cond_0

    .line 374
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 18
    invoke-interface {p1, v0}, Lcom/whatsapp/wq;->a(Lcom/whatsapp/zq;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    const/4 v0, 0x1

    :goto_1
    if-eqz v2, :cond_1

    .line 250
    :cond_0
    :goto_2
    return v0

    :cond_1
    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method public static b(Ljava/lang/String;)Ljava/io/File;
    .locals 5
    .parameter

    .prologue
    .line 225
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getFilesDir()Ljava/io/File;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 245
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 83
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 197
    :cond_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x10

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 3
    .parameter

    .prologue
    .line 212
    const-string v0, "@"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v0, :cond_0

    .line 113
    const-wide/16 v0, 0x0

    .line 189
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v0, v0, Lcom/whatsapp/uq;->a:J

    goto :goto_0
.end method

.method public a(IFZ)Landroid/graphics/Bitmap;
    .locals 12
    .parameter
    .parameter
    .parameter

    .prologue
    sget v4, Lcom/whatsapp/yq;->e:I

    .line 393
    sget-object v0, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 307
    const/16 v1, 0x90

    if-lt p1, v1, :cond_a

    const/4 v1, 0x1

    move v3, v1

    .line 89
    :goto_0
    if-eqz p3, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_19

    .line 411
    :cond_0
    const/4 v2, 0x0

    .line 190
    const/4 v1, 0x0

    .line 167
    :try_start_0
    iget-boolean v0, p0, Lcom/whatsapp/zq;->n:Z

    if-eqz v0, :cond_1

    .line 340
    invoke-virtual {p0, v3}, Lcom/whatsapp/zq;->b(Z)Ljava/io/InputStream;

    move-result-object v1

    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/whatsapp/App;->p()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_2
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/whatsapp/zq;->p()Z

    move-result v0

    if-nez v0, :cond_7

    .line 263
    :cond_3
    if-eqz v3, :cond_5

    .line 310
    iget v0, p0, Lcom/whatsapp/zq;->o:I

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/zq;->c(Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 164
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget v5, p0, Lcom/whatsapp/zq;->o:I

    const/4 v6, 0x1

    invoke-static {v0, v5, v6}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    if-eqz v4, :cond_7

    .line 71
    :cond_5
    iget v0, p0, Lcom/whatsapp/zq;->p:I

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/zq;->c(Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 122
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget v5, p0, Lcom/whatsapp/zq;->p:I

    const/4 v6, 0x2

    invoke-static {v0, v5, v6}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    .line 133
    :cond_7
    if-eqz v1, :cond_13

    .line 305
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 379
    const/4 v5, 0x1

    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 7
    const/4 v5, 0x0

    invoke-static {v1, v5, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    .line 369
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    .line 1
    :try_start_2
    invoke-virtual {p0, v3}, Lcom/whatsapp/zq;->b(Z)Ljava/io/InputStream;

    move-result-object v1

    .line 157
    if-nez v1, :cond_c

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x15

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x14

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 406
    const/4 v0, 0x0

    .line 303
    if-eqz v1, :cond_8

    .line 15
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_8
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 406
    :cond_9
    :goto_1
    return-object v0

    .line 307
    :cond_a
    const/4 v1, 0x0

    move v3, v1

    goto/16 :goto_0

    .line 85
    :catch_0
    move-exception v0

    .line 166
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v5, 0x15

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v5, 0x13

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 381
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3

    .line 320
    const/4 v0, 0x0

    .line 303
    if-eqz v1, :cond_b

    .line 15
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_b
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    .line 224
    :catch_1
    move-exception v1

    goto :goto_1

    .line 25
    :cond_c
    :try_start_6
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v3, p1

    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v5, p1

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 201
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 52
    const/4 v3, 0x0

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 199
    const/4 v3, 0x0

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 249
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v3, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 191
    const/4 v3, 0x0

    invoke-static {v1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 26
    if-nez v2, :cond_e

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x15

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x12

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_3

    .line 8
    const/4 v0, 0x0

    .line 303
    if-eqz v1, :cond_d

    .line 15
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_d
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    goto/16 :goto_1

    .line 82
    :cond_e
    :try_start_8
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 182
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 159
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 111
    new-instance v3, Landroid/graphics/RectF;

    const/4 v7, 0x0

    const/4 v8, 0x0

    int-to-float v9, p1

    int-to-float v10, p1

    invoke-direct {v3, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 66
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 50
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setDither(Z)V

    .line 40
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 297
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual {v5, v7, v8, v9, v10}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 206
    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 192
    invoke-virtual {v5, v3, p2, p2, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 169
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v7}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 106
    new-instance v7, Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/4 v8, 0x0

    int-to-float v9, p1

    int-to-float v10, p1

    invoke-direct {v7, v3, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 311
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    sub-int/2addr v3, v8

    div-int/lit8 v8, v3, 0x2

    .line 270
    if-lez v8, :cond_f

    .line 290
    new-instance v3, Landroid/graphics/Rect;

    const/4 v9, 0x0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    sub-int/2addr v10, v8

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    invoke-direct {v3, v8, v9, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    if-eqz v4, :cond_10

    .line 123
    :cond_f
    new-instance v3, Landroid/graphics/Rect;

    const/4 v4, 0x0

    neg-int v9, v8

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    add-int/2addr v8, v11

    invoke-direct {v3, v4, v9, v10, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 235
    :cond_10
    invoke-virtual {v5, v2, v3, v7, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 387
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 294
    if-eqz p3, :cond_11

    .line 36
    sget-object v3, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/ref/SoftReference;

    invoke-direct {v5, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_3

    .line 303
    :cond_11
    if-eqz v1, :cond_12

    .line 15
    :try_start_9
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_12
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_1

    .line 64
    :cond_13
    const/4 v0, 0x0

    :try_start_a
    iput-boolean v0, p0, Lcom/whatsapp/zq;->n:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_3

    .line 254
    const/4 v0, 0x0

    .line 303
    if-eqz v1, :cond_14

    .line 15
    :try_start_b
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_14
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1

    goto/16 :goto_1

    .line 204
    :catch_2
    move-exception v0

    .line 330
    :try_start_c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v5, 0x16

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 4
    const/4 v0, 0x0

    .line 303
    if-eqz v1, :cond_15

    .line 15
    :try_start_d
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_15
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1

    goto/16 :goto_1

    .line 162
    :catch_3
    move-exception v0

    .line 78
    :try_start_e
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v5, 0x11

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 262
    const/4 v0, 0x0

    .line 303
    if-eqz v1, :cond_16

    .line 15
    :try_start_f
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_16
    if-eqz v2, :cond_9

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1

    goto/16 :goto_1

    .line 348
    :catchall_0
    move-exception v0

    .line 303
    if-eqz v1, :cond_17

    .line 15
    :try_start_10
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 138
    :cond_17
    if-eqz v2, :cond_18

    .line 220
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_4

    .line 348
    :cond_18
    :goto_2
    throw v0

    .line 203
    :cond_19
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    goto/16 :goto_1

    .line 224
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public a(Landroid/content/ContentResolver;)Landroid/net/Uri;
    .locals 1
    .parameter

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/whatsapp/zq;->e()Landroid/net/Uri;

    move-result-object v0

    .line 300
    if-nez v0, :cond_0

    .line 65
    const/4 v0, 0x0

    .line 278
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/zq;->e()Landroid/net/Uri;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/provider/ContactsContract$RawContacts;->getContactLookupUri(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Landroid/content/ContentResolver;Z)Ljava/io/InputStream;
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 345
    invoke-virtual {p0, p1}, Lcom/whatsapp/zq;->b(Landroid/content/ContentResolver;)Landroid/net/Uri;

    move-result-object v1

    .line 105
    if-eqz v1, :cond_0

    .line 268
    if-eqz p2, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_1

    .line 244
    :try_start_0
    const-class v0, Landroid/provider/ContactsContract$Contacts;

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x1c

    aget-object v2, v2, v3

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Landroid/content/ContentResolver;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Landroid/net/Uri;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 246
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 202
    const/4 v2, 0x0

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 284
    :cond_0
    :goto_0
    return-object v0

    .line 181
    :catch_0
    move-exception v0

    .line 218
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 284
    :cond_1
    :goto_1
    invoke-static {p1, v1}, Landroid/provider/ContactsContract$Contacts;->openContactPhotoInputStream(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    .line 228
    :catch_1
    move-exception v0

    .line 360
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 265
    :catch_2
    move-exception v0

    .line 134
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 148
    :catch_3
    move-exception v0

    .line 76
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 107
    :catch_4
    move-exception v0

    .line 69
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected a(Z)Ljava/io/InputStream;
    .locals 10
    .parameter

    .prologue
    sget v7, Lcom/whatsapp/yq;->e:I

    .line 233
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    .line 239
    invoke-virtual {p0, v8, p1}, Lcom/whatsapp/zq;->a(Landroid/content/ContentResolver;Z)Ljava/io/InputStream;

    move-result-object v0

    .line 238
    if-nez v0, :cond_2

    .line 309
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v1, p0}, Lcom/whatsapp/qp;->f(Lcom/whatsapp/zq;)Ljava/util/ArrayList;

    move-result-object v1

    .line 186
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Long;

    .line 129
    new-instance v0, Lcom/whatsapp/zq;

    iget-object v1, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v1, v1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    .line 355
    invoke-virtual {v0, v8, p1}, Lcom/whatsapp/zq;->a(Landroid/content/ContentResolver;Z)Ljava/io/InputStream;

    move-result-object v0

    .line 221
    if-eqz v0, :cond_1

    .line 121
    if-eqz v7, :cond_2

    :cond_1
    if-eqz v7, :cond_0

    .line 344
    :cond_2
    return-object v0
.end method

.method public a(Landroid/content/res/Resources;)Ljava/lang/CharSequence;
    .locals 1
    .parameter

    .prologue
    .line 259
    iget-object v0, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 324
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->getTypeLabelResource(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 144
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(II)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 99
    iput p1, p0, Lcom/whatsapp/zq;->o:I

    .line 372
    iput p2, p0, Lcom/whatsapp/zq;->p:I

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/zq;->q:J

    .line 62
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/whatsapp/qp;->g(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 114
    return-void
.end method

.method public a([B[B)V
    .locals 3
    .parameter
    .parameter

    .prologue
    const/16 v2, 0x1b

    .line 280
    if-eqz p1, :cond_0

    .line 331
    :try_start_0
    invoke-virtual {p0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/whatsapp/j5;->a([BLjava/io/File;)V

    .line 274
    :cond_0
    if-eqz p2, :cond_1

    .line 231
    invoke-virtual {p0}, Lcom/whatsapp/zq;->h()Ljava/io/File;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/whatsapp/j5;->a([BLjava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 117
    :cond_1
    :goto_0
    return-void

    .line 338
    :catch_0
    move-exception v0

    .line 43
    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 236
    :catch_1
    move-exception v0

    .line 34
    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public b(Landroid/content/ContentResolver;)Landroid/net/Uri;
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 289
    invoke-virtual {p0, p1}, Lcom/whatsapp/zq;->a(Landroid/content/ContentResolver;)Landroid/net/Uri;

    move-result-object v1

    .line 135
    if-eqz v1, :cond_0

    .line 141
    :try_start_0
    invoke-static {p1, v1}, Landroid/provider/ContactsContract$Contacts;->lookupContact(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 388
    :cond_0
    :goto_0
    return-object v0

    .line 361
    :catch_0
    move-exception v1

    .line 49
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 315
    :catch_1
    move-exception v1

    .line 95
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public b(Z)Ljava/io/InputStream;
    .locals 6
    .parameter

    .prologue
    const/16 v5, 0x1e

    const/4 v4, 0x0

    .line 211
    const/4 v0, 0x0

    .line 22
    iget-boolean v1, p0, Lcom/whatsapp/zq;->n:Z

    if-eqz v1, :cond_2

    .line 54
    invoke-virtual {p0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/whatsapp/App;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 30
    :cond_0
    if-eqz p1, :cond_3

    .line 288
    invoke-virtual {p0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 102
    invoke-virtual {p0}, Lcom/whatsapp/zq;->h()Ljava/io/File;

    move-result-object v0

    .line 410
    iget v1, p0, Lcom/whatsapp/zq;->o:I

    if-lez v1, :cond_1

    .line 151
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    .line 38
    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x20

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x21

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/whatsapp/zq;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 261
    iput v4, p0, Lcom/whatsapp/zq;->o:I

    .line 216
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 281
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 33
    :cond_2
    :goto_1
    return-object v0

    .line 92
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/zq;->h()Ljava/io/File;

    move-result-object v0

    .line 367
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 273
    invoke-virtual {p0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    .line 90
    iget v1, p0, Lcom/whatsapp/zq;->p:I

    if-lez v1, :cond_1

    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/whatsapp/zq;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 104
    iput v4, p0, Lcom/whatsapp/zq;->p:I

    goto :goto_0

    .line 362
    :catch_0
    move-exception v0

    .line 45
    invoke-virtual {p0, p1}, Lcom/whatsapp/zq;->a(Z)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_1

    .line 332
    :cond_4
    invoke-virtual {p0, p1}, Lcom/whatsapp/zq;->a(Z)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_1

    .line 272
    :cond_5
    invoke-virtual {p0, p1}, Lcom/whatsapp/zq;->a(Z)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    :goto_0
    return-object v0

    .line 174
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public c()V
    .locals 11

    .prologue
    const/16 v10, 0x19

    const/16 v9, 0x18

    const/4 v5, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 373
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_1

    .line 287
    new-array v2, v5, [Ljava/lang/String;

    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v10

    aput-object v0, v2, v7

    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v9

    aput-object v0, v2, v8

    .line 146
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    sget-object v3, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v4, 0x17

    aget-object v3, v3, v4

    new-array v4, v5, [Ljava/lang/String;

    iget-object v5, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v5, v5, Lcom/whatsapp/uq;->a:J

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    sget-object v5, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v6, 0x1a

    aget-object v5, v5, v6

    aput-object v5, v4, v8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 234
    if-eqz v0, :cond_1

    .line 213
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 209
    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v1, v1, v10

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    .line 96
    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/zq;->s:Ljava/lang/String;

    .line 353
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 154
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 321
    const-string v0, ""

    iput-object v0, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    .line 402
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/zq;->s:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/whatsapp/zq;->s:Ljava/lang/String;

    .line 194
    :cond_3
    return-void
.end method

.method public c(Z)Z
    .locals 4
    .parameter

    .prologue
    .line 398
    iget-wide v0, p0, Lcom/whatsapp/zq;->q:J

    const-wide/32 v2, 0xf731400

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/whatsapp/zq;->r:Ljava/lang/String;

    :goto_0
    return-object v0

    .line 376
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Landroid/net/Uri;
    .locals 4

    .prologue
    .line 291
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v0, v0, Lcom/whatsapp/uq;->a:J

    const-wide/16 v2, -0x2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v0, v0, Lcom/whatsapp/uq;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 232
    :cond_0
    const/4 v0, 0x0

    .line 256
    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    iget-object v1, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v1, v1, Lcom/whatsapp/uq;->a:J

    invoke-static {v0, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 127
    check-cast p1, Lcom/whatsapp/zq;

    .line 299
    if-nez p1, :cond_1

    .line 399
    :cond_0
    :goto_0
    return v0

    .line 143
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v1, :cond_0

    .line 377
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v1, :cond_0

    .line 200
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/zq;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/whatsapp/zq;->hashCode()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {v0}, Lcom/whatsapp/uq;->toString()Ljava/lang/String;

    move-result-object v0

    .line 132
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public g()Ljava/io/File;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/zq;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/io/File;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/zq;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {v0}, Lcom/whatsapp/uq;->hashCode()I

    move-result v0

    :goto_0
    return v0

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public i()V
    .locals 1

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 336
    invoke-virtual {p0}, Lcom/whatsapp/zq;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 215
    return-void
.end method

.method public j()V
    .locals 2

    .prologue
    .line 153
    sget-object v0, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    sget-object v0, Lcom/whatsapp/App;->xb:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/zq;->n:Z

    .line 333
    return-void
.end method

.method public k()I
    .locals 3

    .prologue
    .line 115
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const v0, 0x7f020010

    .line 404
    :goto_0
    return v0

    :cond_0
    const v0, 0x7f020011

    goto :goto_0

    .line 351
    :cond_1
    const v0, 0x7f02000f

    goto :goto_0
.end method

.method public l()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 251
    invoke-virtual {p0}, Lcom/whatsapp/zq;->k()I

    move-result v1

    .line 269
    sget-object v0, Lcom/whatsapp/zq;->u:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 112
    if-eqz v0, :cond_0

    .line 187
    :goto_0
    return-object v0

    .line 335
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 196
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 403
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-virtual {v2, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 118
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 260
    sget-object v2, Lcom/whatsapp/zq;->u:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public m()Ljava/lang/String;
    .locals 5

    .prologue
    .line 252
    sget-object v0, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/yy;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f0901f9

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 390
    :goto_0
    return-object v0

    .line 298
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/yy;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 208
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    .line 219
    const-string v0, ""

    goto :goto_0

    .line 6
    :cond_1
    const-wide/16 v2, 0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_2

    .line 149
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f0901fb

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 390
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f0901fa

    invoke-virtual {v3, v4}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v3, v0, v1}, Lcom/whatsapp/t4;->d(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public n()Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 140
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/zq;->b(Landroid/content/ContentResolver;)Landroid/net/Uri;

    move-result-object v1

    .line 295
    if-eqz v1, :cond_0

    .line 88
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 395
    if-eqz v1, :cond_0

    .line 51
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v0, v0, v2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 21
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 183
    :goto_0
    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 382
    :catch_0
    move-exception v0

    .line 230
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    move-object v0, v6

    .line 35
    goto :goto_0

    .line 21
    :cond_1
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1
.end method

.method public o()Z
    .locals 6

    .prologue
    const/4 v4, 0x7

    .line 296
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 210
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 185
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Lcom/whatsapp/zq;->f:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 342
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-nez v0, :cond_3

    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v4

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 145
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 74
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v0, :cond_0

    .line 326
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget v0, Lcom/whatsapp/yq;->e:I

    if-eqz v0, :cond_1

    .line 401
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v2, v0, Lcom/whatsapp/uq;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v2, v2, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 128
    :cond_1
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 75
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v2, p0, Lcom/whatsapp/zq;->k:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 84
    iget-wide v2, p0, Lcom/whatsapp/zq;->f:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    .line 378
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 147
    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 342
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1
.end method

.method public p()Z
    .locals 3

    .prologue
    .line 163
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const-string v2, "@"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 5

    .prologue
    .line 241
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    iget-object v0, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    :goto_0
    return-object v0

    .line 57
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 59
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0xd

    const/4 v5, 0x7

    sget v1, Lcom/whatsapp/yq;->e:I

    .line 207
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 24
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v3, p0, Lcom/whatsapp/zq;->f:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 282
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-nez v0, :cond_4

    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 198
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 341
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v0, :cond_0

    .line 101
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz v1, :cond_1

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-wide v3, v0, Lcom/whatsapp/uq;->a:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v3, "-"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v3, v3, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 323
    :cond_1
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 87
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v3, p0, Lcom/whatsapp/zq;->k:Z

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 136
    invoke-virtual {p0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 328
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 160
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz v1, :cond_3

    .line 79
    :cond_2
    sget v0, Lcom/whatsapp/App;->f:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    .line 375
    sget-object v0, Lcom/whatsapp/zq;->z:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 131
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 282
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    goto/16 :goto_0
.end method
