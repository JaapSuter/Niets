.class public Lcom/whatsapp/messaging/MessageService;
.super Landroid/app/Service;
.source "MessageService.java"


# static fields
.field public static C:I

.field private static final D:[Ljava/lang/String;


# instance fields
.field private A:Landroid/content/BroadcastReceiver;

.field private B:Landroid/os/Handler;

.field private a:Z

.field private b:Lcom/whatsapp/messaging/m;

.field private final c:Lcom/whatsapp/messaging/j;

.field private d:Landroid/os/Messenger;

.field private final e:Landroid/os/Messenger;

.field private f:Landroid/os/Messenger;

.field private g:Landroid/os/Messenger;

.field private h:Z

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Landroid/app/AlarmManager;

.field private m:Landroid/net/ConnectivityManager;

.field private n:Z

.field private o:I

.field private final p:Lcom/whatsapp/p5;

.field private q:J

.field private r:J

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Landroid/os/Handler;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x4b

    const/16 v3, 0x40

    const/16 v1, 0x3f

    const/16 v4, 0x14

    const/4 v6, 0x0

    const/16 v0, 0x37

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "r.3\u0015uX.\u0013\u0003fI\"#\u0003:O\"$"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\rqZ;!\n}I.o\u0015`P;"

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

    const-string v0, "\\$-HcW*4\u0015uO;n+qL8!\u0001ql.2\u0010}\\.n-Qz\u001b\u001f\'Xv\u001d\u0005"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0016}Q,o\u0014qL.4"

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

    const-string v0, "^%$\u0014{V/n\u0008qKe#\tzQe\u0003)Zq\u000e\u00032]i\u0002\u0014?K|\u0003\u0001(Sz"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\n{X$5\u00129K\"-\u0003f\u0010/)\u0015u]\'%"

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

    const-string v0, "P?(\u0003f"

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

    const-string v0, "\\$.\u0008q\\?)\u0008s"

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

    const-string v0, "[\"3\u0005{Q%%\u0005`V%\'"

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

    const-string v0, "R$\"\u000fxZ"

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

    const-string v0, "\u0017%5\nx\u0016"

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

    const-string v0, "H\"&\u000f"

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

    const-string v0, "\\$.\u0008q\\?%\u0002"

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

    const-string v0, "K95\u0003"

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

    const-string v0, "\u001f(/\u0008zZ(4\u0003p\u0002"

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

    const-string v0, "\u001f84\u0007`Zv"

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

    const-string v0, "Y*,\u0015q"

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

    const-string v0, "J%+\u0008{H%"

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

    const-string v0, "\u001f*6\u0007}S*\"\nq\u0002"

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

    const-string v0, "[\"3\u0005{Q%%\u0005`Z/"

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

    const-string v0, "L>3\u0016qQ/%\u0002"

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

    aput-object v0, v9, v4

    const/16 v10, 0x15

    const-string v0, "K20\u0003)"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0002qL?2\tm"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0015{\\ %\u0012;T.%\u0016uS\"6\u00034"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\rqZ;!\n}I."

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

    const-string v0, "S$.\u0001K\\$.\u0008q\\?"

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

    const-string v0, "\\$-HcW*4\u0015uO;n+qL8!\u0001ql.2\u0010}\\.n5@p\u001b"

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

    const-string v0, "\\$-HcW*4\u0015uO;n+qL8!\u0001ql.2\u0010}\\.n5@p\u001b\u001f([`\u0019\u00055@~\u0019\u0014"

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

    const-string v0, "M.3\u0003`"

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

    const-string v0, "Y$2\u0005q"

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

    const-string v0, "\\$-HcW*4\u0015uO;n+qL8!\u0001ql.2\u0010}\\.n5@~\u0019\u0014"

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

    const-string v0, "V;\u001f\u0007p[9%\u0015g"

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

    const-string v0, "\\$-HcW*4\u0015uO;n+qL8!\u0001ql.2\u0010}\\.n4Q|\u0004\u000e(Q|\u001f"

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

    const-string v0, "\\$-HcW*4\u0015uO;n+qL8!\u0001ql.2\u0010}\\.n5Qk\u0014\u0003)Zq\u000e\u00032]p\u0005\u001f2Mo\u000e"

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

    const-string v0, "\\#%\u0005\u007f`(/\u0008zZ(4\u000f{Q"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0008qK</\u0014\u007f\u0010>0"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0008qK</\u0014\u007f\u0010//\u0011z"

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

    const-string v0, "L.3\u0015}P%`\u0007wK\"6\u0003"

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

    const-string v0, "L.3\u0015}P%`\u000fz^(4\u000fbZ"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0015`P;"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0015`^94"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0004u\\ \u001f\trYd2\u0003gZ?"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0014qK99I"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0014qK99IdZ%$\u000fzX"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\n{X$5\u00129K\"-\u0003f\u0010..\u0007vS."

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0014q\\$.\u0008q\\?o\u0008{K\u0014$\u000fg\\$.\u0008q\\?%\u0002;\\#%\u0005\u007f`(/\u0008zZ(4\u000fbV?9"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0008qK</\u0014\u007f\u0010\"\'\u0008{M.`"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\n{X$5\u00129K\"-\u0003f\u00109%\u0015qK"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\n{X$5\u00129K\"-\u0003f\u001084\u0007fK\"&\u0008q\\.3\u0015uM2"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0008qK</\u0014\u007f\u001087\u000f`\\#`\tx[v"

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

    const-string v0, "\u001f%%\u0011)"

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

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\rqZ;!\n}I.o\u0015`^94"

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

    const-string v0, "^\'!\u0014y"

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

    const-string v0, "\\$.\u0008q\\?)\u0010}K2"

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

    const/16 v8, 0x36

    const-string v0, "G&0\u0016;L.2\u0010}\\.o\u0005fZ*4\u0003"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_36
    if-gt v6, v7, :cond_36

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_37
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_37

    :pswitch_1
    move v0, v2

    goto :goto_37

    :pswitch_2
    move v0, v3

    goto :goto_37

    :pswitch_3
    const/16 v0, 0x66

    goto :goto_37

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_38

    :pswitch_5
    move v0, v2

    goto :goto_38

    :pswitch_6
    move v0, v3

    goto :goto_38

    :pswitch_7
    const/16 v0, 0x66

    goto :goto_38

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_39

    :pswitch_9
    move v0, v2

    goto :goto_39

    :pswitch_a
    move v0, v3

    goto :goto_39

    :pswitch_b
    const/16 v0, 0x66

    goto :goto_39

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_3a

    :pswitch_d
    move v0, v2

    goto :goto_3a

    :pswitch_e
    move v0, v3

    goto :goto_3a

    :pswitch_f
    const/16 v0, 0x66

    goto :goto_3a

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_3b

    :pswitch_11
    move v0, v2

    goto :goto_3b

    :pswitch_12
    move v0, v3

    goto :goto_3b

    :pswitch_13
    const/16 v0, 0x66

    goto :goto_3b

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_3c

    :pswitch_15
    move v0, v2

    goto :goto_3c

    :pswitch_16
    move v0, v3

    goto :goto_3c

    :pswitch_17
    const/16 v0, 0x66

    goto :goto_3c

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_3d

    :pswitch_19
    move v0, v2

    goto :goto_3d

    :pswitch_1a
    move v0, v3

    goto :goto_3d

    :pswitch_1b
    const/16 v0, 0x66

    goto :goto_3d

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_3e

    :pswitch_1d
    move v0, v2

    goto :goto_3e

    :pswitch_1e
    move v0, v3

    goto :goto_3e

    :pswitch_1f
    const/16 v0, 0x66

    goto :goto_3e

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_3f

    :pswitch_21
    move v0, v2

    goto :goto_3f

    :pswitch_22
    move v0, v3

    goto :goto_3f

    :pswitch_23
    const/16 v0, 0x66

    goto :goto_3f

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_40

    :pswitch_25
    move v0, v2

    goto :goto_40

    :pswitch_26
    move v0, v3

    goto :goto_40

    :pswitch_27
    const/16 v0, 0x66

    goto :goto_40

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_41

    :pswitch_29
    move v0, v2

    goto :goto_41

    :pswitch_2a
    move v0, v3

    goto :goto_41

    :pswitch_2b
    const/16 v0, 0x66

    goto :goto_41

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_42

    :pswitch_2d
    move v0, v2

    goto :goto_42

    :pswitch_2e
    move v0, v3

    goto :goto_42

    :pswitch_2f
    const/16 v0, 0x66

    goto :goto_42

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_43

    :pswitch_31
    move v0, v2

    goto :goto_43

    :pswitch_32
    move v0, v3

    goto :goto_43

    :pswitch_33
    const/16 v0, 0x66

    goto :goto_43

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_44

    :pswitch_35
    move v0, v2

    goto :goto_44

    :pswitch_36
    move v0, v3

    goto :goto_44

    :pswitch_37
    const/16 v0, 0x66

    goto :goto_44

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_45

    :pswitch_39
    move v0, v2

    goto :goto_45

    :pswitch_3a
    move v0, v3

    goto :goto_45

    :pswitch_3b
    const/16 v0, 0x66

    goto :goto_45

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_46

    :pswitch_3d
    move v0, v2

    goto :goto_46

    :pswitch_3e
    move v0, v3

    goto :goto_46

    :pswitch_3f
    const/16 v0, 0x66

    goto :goto_46

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_47

    :pswitch_41
    move v0, v2

    goto :goto_47

    :pswitch_42
    move v0, v3

    goto :goto_47

    :pswitch_43
    const/16 v0, 0x66

    goto :goto_47

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_48

    :pswitch_45
    move v0, v2

    goto :goto_48

    :pswitch_46
    move v0, v3

    goto :goto_48

    :pswitch_47
    const/16 v0, 0x66

    goto :goto_48

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_49

    :pswitch_49
    move v0, v2

    goto :goto_49

    :pswitch_4a
    move v0, v3

    goto :goto_49

    :pswitch_4b
    const/16 v0, 0x66

    goto :goto_49

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_4a

    :pswitch_4d
    move v0, v2

    goto :goto_4a

    :pswitch_4e
    move v0, v3

    goto :goto_4a

    :pswitch_4f
    const/16 v0, 0x66

    goto :goto_4a

    :cond_14
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_4b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_4b

    :pswitch_51
    move v0, v2

    goto :goto_4b

    :pswitch_52
    move v0, v3

    goto :goto_4b

    :pswitch_53
    const/16 v0, 0x66

    goto :goto_4b

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_4c

    :pswitch_55
    move v0, v2

    goto :goto_4c

    :pswitch_56
    move v0, v3

    goto :goto_4c

    :pswitch_57
    const/16 v0, 0x66

    goto :goto_4c

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_4d

    :pswitch_59
    move v0, v2

    goto :goto_4d

    :pswitch_5a
    move v0, v3

    goto :goto_4d

    :pswitch_5b
    const/16 v0, 0x66

    goto :goto_4d

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_4e

    :pswitch_5d
    move v0, v2

    goto :goto_4e

    :pswitch_5e
    move v0, v3

    goto :goto_4e

    :pswitch_5f
    const/16 v0, 0x66

    goto :goto_4e

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_4f

    :pswitch_61
    move v0, v2

    goto :goto_4f

    :pswitch_62
    move v0, v3

    goto :goto_4f

    :pswitch_63
    const/16 v0, 0x66

    goto :goto_4f

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_50

    :pswitch_65
    move v0, v2

    goto :goto_50

    :pswitch_66
    move v0, v3

    goto :goto_50

    :pswitch_67
    const/16 v0, 0x66

    goto :goto_50

    :cond_1a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_51

    :pswitch_69
    move v0, v2

    goto :goto_51

    :pswitch_6a
    move v0, v3

    goto :goto_51

    :pswitch_6b
    const/16 v0, 0x66

    goto :goto_51

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_52

    :pswitch_6d
    move v0, v2

    goto :goto_52

    :pswitch_6e
    move v0, v3

    goto :goto_52

    :pswitch_6f
    const/16 v0, 0x66

    goto :goto_52

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_53

    :pswitch_71
    move v0, v2

    goto :goto_53

    :pswitch_72
    move v0, v3

    goto :goto_53

    :pswitch_73
    const/16 v0, 0x66

    goto :goto_53

    :cond_1d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_54
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_54

    :pswitch_75
    move v0, v2

    goto :goto_54

    :pswitch_76
    move v0, v3

    goto :goto_54

    :pswitch_77
    const/16 v0, 0x66

    goto :goto_54

    :cond_1e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_55

    :pswitch_79
    move v0, v2

    goto :goto_55

    :pswitch_7a
    move v0, v3

    goto :goto_55

    :pswitch_7b
    const/16 v0, 0x66

    goto :goto_55

    :cond_1f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_56

    :pswitch_7d
    move v0, v2

    goto :goto_56

    :pswitch_7e
    move v0, v3

    goto :goto_56

    :pswitch_7f
    const/16 v0, 0x66

    goto :goto_56

    :cond_20
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_57

    :pswitch_81
    move v0, v2

    goto :goto_57

    :pswitch_82
    move v0, v3

    goto :goto_57

    :pswitch_83
    const/16 v0, 0x66

    goto :goto_57

    :cond_21
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_58

    :pswitch_85
    move v0, v2

    goto :goto_58

    :pswitch_86
    move v0, v3

    goto :goto_58

    :pswitch_87
    const/16 v0, 0x66

    goto :goto_58

    :cond_22
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_59

    :pswitch_89
    move v0, v2

    goto :goto_59

    :pswitch_8a
    move v0, v3

    goto :goto_59

    :pswitch_8b
    const/16 v0, 0x66

    goto :goto_59

    :cond_23
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_5a

    :pswitch_8d
    move v0, v2

    goto :goto_5a

    :pswitch_8e
    move v0, v3

    goto :goto_5a

    :pswitch_8f
    const/16 v0, 0x66

    goto :goto_5a

    :cond_24
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_5b

    :pswitch_91
    move v0, v2

    goto :goto_5b

    :pswitch_92
    move v0, v3

    goto :goto_5b

    :pswitch_93
    const/16 v0, 0x66

    goto :goto_5b

    :cond_25
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_25

    move v0, v4

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_5c

    :pswitch_95
    move v0, v2

    goto :goto_5c

    :pswitch_96
    move v0, v3

    goto :goto_5c

    :pswitch_97
    const/16 v0, 0x66

    goto :goto_5c

    :cond_26
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_26

    move v0, v4

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_5d

    :pswitch_99
    move v0, v2

    goto :goto_5d

    :pswitch_9a
    move v0, v3

    goto :goto_5d

    :pswitch_9b
    const/16 v0, 0x66

    goto :goto_5d

    :cond_27
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_27

    move v0, v4

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_5e

    :pswitch_9d
    move v0, v2

    goto :goto_5e

    :pswitch_9e
    move v0, v3

    goto :goto_5e

    :pswitch_9f
    const/16 v0, 0x66

    goto :goto_5e

    :cond_28
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_28

    move v0, v4

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_5f

    :pswitch_a1
    move v0, v2

    goto :goto_5f

    :pswitch_a2
    move v0, v3

    goto :goto_5f

    :pswitch_a3
    const/16 v0, 0x66

    goto :goto_5f

    :cond_29
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_29

    move v0, v4

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_60

    :pswitch_a5
    move v0, v2

    goto :goto_60

    :pswitch_a6
    move v0, v3

    goto :goto_60

    :pswitch_a7
    const/16 v0, 0x66

    goto :goto_60

    :cond_2a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2a

    move v0, v4

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_61

    :pswitch_a9
    move v0, v2

    goto :goto_61

    :pswitch_aa
    move v0, v3

    goto :goto_61

    :pswitch_ab
    const/16 v0, 0x66

    goto :goto_61

    :cond_2b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2b

    move v0, v4

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_62

    :pswitch_ad
    move v0, v2

    goto :goto_62

    :pswitch_ae
    move v0, v3

    goto :goto_62

    :pswitch_af
    const/16 v0, 0x66

    goto :goto_62

    :cond_2c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2c

    move v0, v4

    :goto_63
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_63

    :pswitch_b1
    move v0, v2

    goto :goto_63

    :pswitch_b2
    move v0, v3

    goto :goto_63

    :pswitch_b3
    const/16 v0, 0x66

    goto :goto_63

    :cond_2d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2d

    move v0, v4

    :goto_64
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_64

    :pswitch_b5
    move v0, v2

    goto :goto_64

    :pswitch_b6
    move v0, v3

    goto :goto_64

    :pswitch_b7
    const/16 v0, 0x66

    goto :goto_64

    :cond_2e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2e

    move v0, v4

    :goto_65
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_65

    :pswitch_b9
    move v0, v2

    goto :goto_65

    :pswitch_ba
    move v0, v3

    goto :goto_65

    :pswitch_bb
    const/16 v0, 0x66

    goto :goto_65

    :cond_2f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2f

    move v0, v4

    :goto_66
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_66

    :pswitch_bd
    move v0, v2

    goto :goto_66

    :pswitch_be
    move v0, v3

    goto :goto_66

    :pswitch_bf
    const/16 v0, 0x66

    goto :goto_66

    :cond_30
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_30

    move v0, v4

    :goto_67
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_67

    :pswitch_c1
    move v0, v2

    goto :goto_67

    :pswitch_c2
    move v0, v3

    goto :goto_67

    :pswitch_c3
    const/16 v0, 0x66

    goto :goto_67

    :cond_31
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_31

    move v0, v4

    :goto_68
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_31

    :pswitch_c4
    move v0, v1

    goto :goto_68

    :pswitch_c5
    move v0, v2

    goto :goto_68

    :pswitch_c6
    move v0, v3

    goto :goto_68

    :pswitch_c7
    const/16 v0, 0x66

    goto :goto_68

    :cond_32
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_32

    move v0, v4

    :goto_69
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_32

    :pswitch_c8
    move v0, v1

    goto :goto_69

    :pswitch_c9
    move v0, v2

    goto :goto_69

    :pswitch_ca
    move v0, v3

    goto :goto_69

    :pswitch_cb
    const/16 v0, 0x66

    goto :goto_69

    :cond_33
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_33

    move v0, v4

    :goto_6a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_33

    :pswitch_cc
    move v0, v1

    goto :goto_6a

    :pswitch_cd
    move v0, v2

    goto :goto_6a

    :pswitch_ce
    move v0, v3

    goto :goto_6a

    :pswitch_cf
    const/16 v0, 0x66

    goto :goto_6a

    :cond_34
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_34

    move v0, v4

    :goto_6b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_34

    :pswitch_d0
    move v0, v1

    goto :goto_6b

    :pswitch_d1
    move v0, v2

    goto :goto_6b

    :pswitch_d2
    move v0, v3

    goto :goto_6b

    :pswitch_d3
    const/16 v0, 0x66

    goto :goto_6b

    :cond_35
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_35

    move v0, v4

    :goto_6c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_35

    :pswitch_d4
    move v0, v1

    goto :goto_6c

    :pswitch_d5
    move v0, v2

    goto :goto_6c

    :pswitch_d6
    move v0, v3

    goto :goto_6c

    :pswitch_d7
    const/16 v0, 0x66

    goto :goto_6c

    :cond_36
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_36

    move v0, v4

    :goto_6d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_36

    :pswitch_d8
    move v0, v1

    goto :goto_6d

    :pswitch_d9
    move v0, v2

    goto :goto_6d

    :pswitch_da
    move v0, v3

    goto :goto_6d

    :pswitch_db
    const/16 v0, 0x66

    goto :goto_6d

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
.end method

.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 58
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 159
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    .line 108
    new-instance v1, Lcom/whatsapp/messaging/j;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/j;-><init>(Lcom/whatsapp/messaging/MessageService;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->c:Lcom/whatsapp/messaging/j;

    .line 46
    new-instance v1, Landroid/os/Messenger;

    new-instance v2, Lcom/whatsapp/messaging/i;

    invoke-direct {v2, p0}, Lcom/whatsapp/messaging/i;-><init>(Lcom/whatsapp/messaging/MessageService;)V

    invoke-direct {v1, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->e:Landroid/os/Messenger;

    .line 352
    new-instance v1, Landroid/os/Messenger;

    new-instance v2, Lcom/whatsapp/messaging/h;

    invoke-direct {v2, p0}, Lcom/whatsapp/messaging/h;-><init>(Lcom/whatsapp/messaging/MessageService;)V

    invoke-direct {v1, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->g:Landroid/os/Messenger;

    .line 4
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->i:Z

    .line 142
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->n:Z

    .line 35
    const/4 v1, -0x1

    iput v1, p0, Lcom/whatsapp/messaging/MessageService;->o:I

    .line 99
    new-instance v1, Lcom/whatsapp/p5;

    invoke-direct {v1, v4}, Lcom/whatsapp/p5;-><init>(Z)V

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->p:Lcom/whatsapp/p5;

    .line 110
    const-wide/16 v1, 0x2710

    iput-wide v1, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    .line 378
    const-wide/16 v1, 0x4e20

    iput-wide v1, p0, Lcom/whatsapp/messaging/MessageService;->r:J

    .line 146
    iput-boolean v4, p0, Lcom/whatsapp/messaging/MessageService;->s:Z

    .line 169
    iput-boolean v4, p0, Lcom/whatsapp/messaging/MessageService;->t:Z

    .line 98
    iput-boolean v4, p0, Lcom/whatsapp/messaging/MessageService;->u:Z

    .line 310
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->v:Z

    .line 161
    iput-boolean v4, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    .line 246
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    .line 43
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->y:Z

    .line 89
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->z:Z

    .line 87
    new-instance v1, Lcom/whatsapp/messaging/MessageService$1;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/MessageService$1;-><init>(Lcom/whatsapp/messaging/MessageService;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->A:Landroid/content/BroadcastReceiver;

    .line 326
    new-instance v1, Lcom/whatsapp/messaging/g;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/g;-><init>(Lcom/whatsapp/messaging/MessageService;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/MessageService;->B:Landroid/os/Handler;

    .line 72
    if-eqz v0, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_0
    return-void
.end method

.method private A()V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->e(Landroid/os/Messenger;)V

    .line 213
    return-void
.end method

.method private B()V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->f(Landroid/os/Messenger;)V

    .line 114
    return-void
.end method

.method public static C()Z
    .locals 1

    .prologue
    .line 241
    const/4 v0, 0x1

    return v0
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;)Landroid/net/ConnectivityManager;
    .locals 1
    .parameter

    .prologue
    .line 22
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->m:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method private a(Landroid/net/NetworkInfo;)Ljava/lang/String;
    .locals 7
    .parameter

    .prologue
    const/16 v5, 0x10

    const/16 v4, 0xd

    sget v2, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 145
    if-nez p1, :cond_0

    .line 37
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    .line 123
    :goto_0
    return-object v0

    .line 379
    :cond_0
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 109
    :goto_1
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    .line 152
    :cond_1
    sget-object v1, Lcom/whatsapp/messaging/p;->a:[I

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/NetworkInfo$State;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_1

    .line 80
    :goto_2
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    .line 248
    :cond_2
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    aget-object v2, v2, v4

    .line 283
    :goto_3
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    aget-object v3, v3, v4

    .line 3
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v6, 0x15

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v5, 0xf

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v4, 0xe

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x12

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 78
    :pswitch_0
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    .line 187
    if-eqz v2, :cond_1

    .line 76
    :pswitch_1
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    .line 319
    if-eqz v2, :cond_1

    goto :goto_1

    .line 235
    :pswitch_2
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v1, v1, v3

    .line 315
    if-eqz v2, :cond_2

    .line 321
    :pswitch_3
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v1, v1, v3

    .line 323
    if-eqz v2, :cond_2

    .line 369
    :pswitch_4
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v1, v1, v3

    .line 311
    if-eqz v2, :cond_2

    .line 367
    :pswitch_5
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x13

    aget-object v1, v1, v3

    .line 256
    if-eqz v2, :cond_2

    .line 150
    :pswitch_6
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x14

    aget-object v1, v1, v3

    .line 172
    if-eqz v2, :cond_2

    goto/16 :goto_2

    .line 248
    :cond_3
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    aget-object v2, v2, v5

    goto/16 :goto_3

    .line 283
    :cond_4
    sget-object v3, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    aget-object v3, v3, v5

    goto/16 :goto_4

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 152
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Landroid/net/NetworkInfo;)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 265
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/net/NetworkInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 11
    invoke-static {p0}, Lcom/whatsapp/messaging/MessageService;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->u:Z

    .line 176
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(I)V
    .locals 3
    .parameter

    .prologue
    .line 291
    iget v0, p0, Lcom/whatsapp/messaging/MessageService;->o:I

    if-ne p1, v0, :cond_0

    .line 231
    :goto_0
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x31

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/whatsapp/messaging/MessageService;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x32

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 19
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Z)V

    .line 36
    :cond_1
    iput p1, p0, Lcom/whatsapp/messaging/MessageService;->o:I

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3
    .parameter

    .prologue
    .line 131
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x1e

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 182
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 206
    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 2
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 94
    const/4 v0, 0x0

    invoke-static {p0, p1, v1, v1, v0}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/content/Context;ZZZLjava/util/ArrayList;)V

    .line 117
    return-void
.end method

.method public static a(Landroid/content/Context;ZZZLjava/util/ArrayList;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "ZZZ",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 242
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x20

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x1d

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x22

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x1f

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    .line 349
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 56
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 270
    invoke-static {p1}, Lcom/whatsapp/messaging/s;->b(Landroid/os/Message;)I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    .line 220
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 195
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->l()V

    .line 28
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->c()V

    .line 107
    invoke-virtual {p0, v2}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_2

    .line 384
    :cond_0
    invoke-static {p1}, Lcom/whatsapp/messaging/s;->b(Landroid/os/Message;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 97
    :cond_1
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 168
    :cond_2
    :goto_1
    return-void

    .line 30
    :pswitch_1
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->l()V

    .line 307
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_1

    goto :goto_1

    .line 34
    :pswitch_2
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->l()V

    .line 269
    :pswitch_3
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->c()V

    .line 318
    invoke-virtual {p0, v2}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    goto :goto_0

    .line 384
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private a(Landroid/os/Messenger;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 31
    iput-object p1, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    .line 113
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    .line 166
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->m:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 124
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 39
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/messaging/MessageService;->o:I

    .line 308
    iput-boolean v3, p0, Lcom/whatsapp/messaging/MessageService;->n:Z

    .line 63
    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 90
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->A:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/messaging/MessageService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 106
    invoke-virtual {p0, v3}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    .line 331
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->i:Z

    if-eqz v0, :cond_1

    .line 68
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->a(Landroid/os/Messenger;)V

    .line 364
    :cond_1
    return-void
.end method

.method private a(Lcom/whatsapp/cg;)V
    .locals 1
    .parameter

    .prologue
    .line 10
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0, p1}, Lcom/whatsapp/tc;->a(Landroid/os/Messenger;Lcom/whatsapp/cg;)V

    .line 280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    .line 165
    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 342
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->a(I)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 273
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->b(Landroid/os/Message;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Landroid/os/Messenger;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 267
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/os/Messenger;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Lcom/whatsapp/cg;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 365
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->a(Lcom/whatsapp/cg;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 341
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/messaging/MessageService;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Ljava/lang/String;Ljava/lang/String;Landroid/os/Messenger;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 202
    invoke-direct {p0, p1, p2, p3}, Lcom/whatsapp/messaging/MessageService;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Messenger;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/MessageService;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 125
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->b(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 44
    iput-object p1, p0, Lcom/whatsapp/messaging/MessageService;->j:Ljava/lang/String;

    .line 320
    iput-object p2, p0, Lcom/whatsapp/messaging/MessageService;->k:Ljava/lang/String;

    .line 137
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Messenger;)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x1

    .line 215
    iput-object p1, p0, Lcom/whatsapp/messaging/MessageService;->j:Ljava/lang/String;

    .line 162
    iput-object p2, p0, Lcom/whatsapp/messaging/MessageService;->k:Ljava/lang/String;

    .line 71
    iput-object p3, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    .line 153
    iput-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->i:Z

    .line 337
    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    .line 303
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    if-eqz v0, :cond_0

    .line 111
    invoke-static {p3}, Lcom/whatsapp/tc;->a(Landroid/os/Messenger;)V

    .line 385
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 41
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 290
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->p:Lcom/whatsapp/p5;

    invoke-virtual {v0}, Lcom/whatsapp/p5;->a()V

    .line 54
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3
    .parameter

    .prologue
    .line 286
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 261
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 188
    return-void
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 149
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x21

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x19

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    .line 272
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 164
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 259
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->b()V

    .line 177
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    .line 151
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/tc;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 298
    :pswitch_0
    return-void

    .line 177
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method static b(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 210
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->k()V

    return-void
.end method

.method static b(Lcom/whatsapp/messaging/MessageService;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 67
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/os/Message;)V

    return-void
.end method

.method static b(Lcom/whatsapp/messaging/MessageService;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 301
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/MessageService;->d(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 77
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->n:Z

    if-eq v0, p1, :cond_2

    .line 304
    if-ne p1, v2, :cond_0

    .line 85
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, v2}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_1

    .line 189
    :cond_0
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x24

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 377
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    if-eqz v0, :cond_1

    .line 343
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {v0, v2}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Z)V

    .line 327
    :cond_1
    iput-boolean p1, p0, Lcom/whatsapp/messaging/MessageService;->n:Z

    .line 157
    :cond_2
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 158
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x29

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 178
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    .line 83
    const-wide/16 v0, 0x4e20

    iput-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->r:J

    .line 21
    return-void
.end method

.method static c(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 383
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->p()V

    return-void
.end method

.method private c(Z)V
    .locals 2
    .parameter

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->f()Ljava/io/File;

    move-result-object v0

    .line 24
    if-eqz p1, :cond_1

    .line 375
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :cond_0
    :goto_0
    iput-boolean p1, p0, Lcom/whatsapp/messaging/MessageService;->h:Z

    .line 224
    return-void

    .line 23
    :catch_0
    move-exception v1

    .line 26
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 232
    sget v1, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v1, :cond_0

    .line 314
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 3
    .parameter

    .prologue
    const/16 v2, 0x9

    .line 294
    invoke-static {p0}, Lcom/whatsapp/c2dm/C2DMRegistrar;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/whatsapp/App;->j(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    invoke-static {}, Lcom/whatsapp/messaging/MessageService;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v2, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v2, :cond_1

    invoke-static {p0}, Lcom/whatsapp/App;->k(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 296
    :goto_0
    return v0

    .line 294
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()J
    .locals 4

    .prologue
    const-wide/32 v0, 0xa4cb800

    .line 249
    iget-wide v2, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    cmp-long v2, v2, v0

    if-lez v2, :cond_0

    .line 144
    :goto_0
    return-wide v0

    .line 227
    :cond_0
    iget-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->r:J

    iget-wide v2, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->r:J

    .line 332
    iget-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->r:J

    iget-wide v2, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    .line 144
    iget-wide v0, p0, Lcom/whatsapp/messaging/MessageService;->r:J

    iget-wide v2, p0, Lcom/whatsapp/messaging/MessageService;->q:J

    sub-long/2addr v0, v2

    goto :goto_0
.end method

.method static d(Lcom/whatsapp/messaging/MessageService;)Landroid/os/Messenger;
    .locals 1
    .parameter

    .prologue
    .line 347
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    return-object v0
.end method

.method private d(Z)V
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 141
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->d(Landroid/os/Messenger;)V

    .line 207
    iput-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    .line 91
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->k()V

    .line 25
    if-eqz p1, :cond_1

    .line 135
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->m:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->q()V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_1

    .line 324
    :cond_0
    iput-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->u:Z

    .line 156
    :cond_1
    return-void
.end method

.method private e()V
    .locals 6

    .prologue
    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 211
    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 122
    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->h:Z

    if-nez v1, :cond_1

    .line 334
    :cond_0
    :goto_0
    return-void

    .line 305
    :cond_1
    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->i:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->z:Z

    if-nez v1, :cond_0

    .line 255
    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    if-nez v1, :cond_4

    .line 382
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->p:Lcom/whatsapp/p5;

    invoke-virtual {v1}, Lcom/whatsapp/p5;->c()J

    move-result-wide v1

    .line 348
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v5, 0x17

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 155
    const-wide/32 v3, 0x124f80

    cmp-long v1, v1, v3

    if-gez v1, :cond_2

    .line 101
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {}, Lcom/whatsapp/messaging/s;->d()Landroid/os/Message;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    if-eqz v0, :cond_3

    .line 223
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Z)V

    .line 262
    :cond_3
    if-eqz v0, :cond_0

    .line 284
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    goto :goto_0
.end method

.method static e(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 336
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->w()V

    return-void
.end method

.method private f()Ljava/io/File;
    .locals 4

    .prologue
    .line 335
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 345
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method static f(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 196
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->x()V

    return-void
.end method

.method static g(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 325
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->y()V

    return-void
.end method

.method private g()Z
    .locals 1

    .prologue
    .line 356
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->f()Ljava/io/File;

    move-result-object v0

    .line 313
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 86
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->g()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 104
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->o()V

    .line 243
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    .line 297
    :cond_0
    return-void
.end method

.method static h(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 197
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->z()V

    return-void
.end method

.method static i(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 143
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->A()V

    return-void
.end method

.method private i()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 355
    .line 285
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x30

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    if-nez v0, :cond_3

    .line 282
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->B:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    .line 258
    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_0

    move v0, v1

    .line 316
    :goto_0
    iget-object v3, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v3

    if-nez v3, :cond_2

    .line 346
    :cond_0
    :goto_1
    if-eqz v1, :cond_1

    .line 119
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    const-wide/32 v3, 0x927c0

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 73
    :cond_1
    return v1

    :cond_2
    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method private j()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x2c

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->B:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 299
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 381
    return-void
.end method

.method static j(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 251
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->B()V

    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 359
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 350
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    .line 29
    :cond_0
    return-void
.end method

.method static k(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->t()V

    return-void
.end method

.method static l(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 173
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->u()V

    return-void
.end method

.method static m(Lcom/whatsapp/messaging/MessageService;)V
    .locals 0
    .parameter

    .prologue
    .line 140
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->v()V

    return-void
.end method

.method private m()Z
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private n()V
    .locals 9

    .prologue
    const/4 v1, 0x2

    const/4 v5, 0x0

    .line 218
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x33

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 9
    new-instance v0, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    aget-object v2, v2, v1

    const/4 v3, 0x0

    const-class v4, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v0, v2, v3, p0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 75
    invoke-static {p0, v5, v0, v5}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 5
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->t:Z

    if-eqz v0, :cond_0

    const v0, 0x45948

    move v4, v0

    .line 288
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->l:Landroid/app/AlarmManager;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    int-to-long v7, v4

    add-long/2addr v2, v7

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    .line 128
    return-void

    .line 5
    :cond_0
    const v0, 0x8ed28

    move v4, v0

    goto :goto_0
.end method

.method static n(Lcom/whatsapp/messaging/MessageService;)Z
    .locals 1
    .parameter

    .prologue
    .line 81
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    return v0
.end method

.method static o(Lcom/whatsapp/messaging/MessageService;)Lcom/whatsapp/messaging/m;
    .locals 1
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->b:Lcom/whatsapp/messaging/m;

    return-object v0
.end method

.method private o()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 191
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 236
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    const/4 v2, 0x0

    const-class v3, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v0, v1, v2, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    .line 278
    invoke-static {p0, v4, v0, v4}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 70
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->l:Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 95
    return-void
.end method

.method private p()V
    .locals 0

    .prologue
    .line 234
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->a()V

    .line 292
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->n()V

    .line 7
    return-void
.end method

.method private r()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 185
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->h:Z

    if-ne v0, v2, :cond_0

    .line 370
    :goto_0
    return-void

    .line 309
    :cond_0
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x28

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, v2}, Lcom/whatsapp/messaging/MessageService;->c(Z)V

    .line 17
    new-instance v0, Lcom/whatsapp/messaging/m;

    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->e:Landroid/os/Messenger;

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/messaging/m;-><init>(Landroid/content/Context;Landroid/os/Messenger;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/MessageService;->b:Lcom/whatsapp/messaging/m;

    .line 230
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->b:Lcom/whatsapp/messaging/m;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/m;->start()V

    goto :goto_0
.end method

.method private s()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 138
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x27

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 193
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->h:Z

    if-nez v0, :cond_1

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 287
    :cond_1
    invoke-direct {p0, v2}, Lcom/whatsapp/messaging/MessageService;->c(Z)V

    .line 42
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    if-nez v0, :cond_2

    .line 20
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->d(Landroid/os/Messenger;)V

    .line 293
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    .line 200
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    if-eqz v0, :cond_3

    .line 363
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->A:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/MessageService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 361
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/d;->d(Landroid/os/Messenger;)V

    .line 55
    iput-boolean v2, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_0

    .line 264
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->b:Lcom/whatsapp/messaging/m;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/m;->quit()Z

    goto :goto_0
.end method

.method private t()V
    .locals 2

    .prologue
    .line 212
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x25

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/App;->d(Ljava/lang/String;)V

    .line 376
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/d;->b(Landroid/os/Messenger;)V

    .line 62
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->l()V

    .line 92
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->c()V

    .line 15
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/MessageService;->a(Z)V

    .line 171
    return-void
.end method

.method private u()V
    .locals 2

    .prologue
    .line 216
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x26

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/App;->d(Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;)V

    .line 302
    return-void
.end method

.method private v()V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/d;->c(Landroid/os/Messenger;)V

    .line 16
    return-void
.end method

.method private w()V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->b(Landroid/os/Messenger;)V

    .line 186
    return-void
.end method

.method private x()V
    .locals 3

    .prologue
    .line 154
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->c:Lcom/whatsapp/messaging/j;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/messaging/j;->a(J)V

    .line 198
    return-void
.end method

.method private y()V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->c:Lcom/whatsapp/messaging/j;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/j;->a()V

    .line 380
    return-void
.end method

.method private z()V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/tc;->c(Landroid/os/Messenger;)V

    .line 194
    invoke-static {p0}, Lcom/whatsapp/messaging/MessageService;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->n()V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_1

    .line 209
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->o()V

    .line 192
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->j()V

    .line 203
    :cond_1
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->c()V

    .line 112
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->a()V

    .line 362
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2
    .parameter

    .prologue
    .line 204
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/whatsapp/messaging/MessageService;->a(ZZLjava/util/ArrayList;)V

    .line 33
    return-void
.end method

.method public a(ZZLjava/util/ArrayList;)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v5, 0x0

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 50
    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    if-nez v1, :cond_2

    .line 6
    if-eqz p2, :cond_0

    .line 179
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x2d

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 222
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/d;->e(Landroid/os/Messenger;)V

    .line 357
    :cond_0
    invoke-static {p0}, Lcom/whatsapp/messaging/MessageService;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->m()Z

    move-result v0

    if-nez v0, :cond_1

    .line 281
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 338
    :cond_1
    :goto_0
    return-void

    .line 40
    :cond_2
    if-eqz p1, :cond_3

    .line 175
    iput-boolean v2, p0, Lcom/whatsapp/messaging/MessageService;->u:Z

    .line 353
    iput-boolean v2, p0, Lcom/whatsapp/messaging/MessageService;->v:Z

    if-eqz v0, :cond_4

    .line 214
    :cond_3
    iget-boolean v1, p0, Lcom/whatsapp/messaging/MessageService;->u:Z

    if-eqz v1, :cond_1

    .line 317
    :cond_4
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->m:Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 74
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-nez v2, :cond_6

    .line 306
    :cond_5
    iget-boolean v2, p0, Lcom/whatsapp/messaging/MessageService;->u:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/whatsapp/messaging/MessageService;->v:Z

    if-eqz v2, :cond_1

    .line 268
    iput-boolean v5, p0, Lcom/whatsapp/messaging/MessageService;->v:Z

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v4, 0x2e

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, v1}, Lcom/whatsapp/messaging/MessageService;->a(Landroid/net/NetworkInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 247
    invoke-static {}, Lcom/whatsapp/App;->v()V

    if-nez v0, :cond_1

    .line 13
    :cond_6
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->h:Z

    if-eqz v0, :cond_1

    .line 47
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->i:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->a:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->z:Z

    if-nez v0, :cond_1

    .line 102
    invoke-static {}, Lcom/whatsapp/App;->kb()Z

    move-result v0

    .line 373
    invoke-static {v0}, Lcom/whatsapp/App;->f(Z)V

    .line 121
    iget-object v1, p0, Lcom/whatsapp/messaging/MessageService;->d:Landroid/os/Messenger;

    iget-object v2, p0, Lcom/whatsapp/messaging/MessageService;->j:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/messaging/MessageService;->k:Ljava/lang/String;

    invoke-static {v1, v2, v3, p3, v0}, Lcom/whatsapp/messaging/d;->a(Landroid/os/Messenger;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 93
    iput-boolean v5, p0, Lcom/whatsapp/messaging/MessageService;->w:Z

    goto :goto_0
.end method

.method public l()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 18
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x2f

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 339
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->x:Landroid/os/Handler;

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 199
    :cond_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .parameter

    .prologue
    .line 240
    iget-object v0, p0, Lcom/whatsapp/messaging/MessageService;->g:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 333
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 160
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x36

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 132
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x35

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/MessageService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lcom/whatsapp/messaging/MessageService;->m:Landroid/net/ConnectivityManager;

    .line 340
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x34

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/MessageService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/whatsapp/messaging/MessageService;->l:Landroid/app/AlarmManager;

    .line 64
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->h()V

    .line 48
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 237
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 190
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 244
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->h:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 205
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->s()V

    .line 260
    :cond_0
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 9
    .parameter
    .parameter

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 266
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    .line 59
    if-nez p1, :cond_0

    .line 233
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    if-eqz v0, :cond_8

    .line 351
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 27
    if-nez v1, :cond_1

    .line 127
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    if-eqz v0, :cond_8

    .line 134
    :cond_1
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, v7, :cond_2

    .line 252
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->s()V

    .line 100
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->q()V

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->stopSelf()V

    if-eqz v0, :cond_8

    .line 170
    :cond_2
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, v7, :cond_3

    .line 275
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->o()V

    .line 354
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->s()V

    .line 279
    iput-boolean v7, p0, Lcom/whatsapp/messaging/MessageService;->z:Z

    .line 277
    invoke-virtual {p0}, Lcom/whatsapp/messaging/MessageService;->stopSelf()V

    if-eqz v0, :cond_8

    .line 225
    :cond_3
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x1e

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, v7, :cond_4

    .line 371
    iput-boolean v8, p0, Lcom/whatsapp/messaging/MessageService;->z:Z

    .line 116
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    if-eqz v0, :cond_8

    .line 118
    :cond_4
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, v7, :cond_5

    .line 344
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    .line 295
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->e()V

    if-eqz v0, :cond_8

    .line 66
    :cond_5
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x20

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, v7, :cond_7

    .line 372
    iput-boolean v8, p0, Lcom/whatsapp/messaging/MessageService;->y:Z

    .line 289
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    .line 245
    sget-object v2, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v3, 0x1c

    aget-object v2, v2, v3

    invoke-virtual {p1, v2, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 274
    sget-object v3, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v4, 0x1d

    aget-object v3, v3, v4

    invoke-virtual {p1, v3, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 115
    sget-object v4, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v5, 0x22

    aget-object v4, v4, v5

    invoke-virtual {p1, v4, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 366
    sget-object v5, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v6, 0x1f

    aget-object v5, v5, v6

    invoke-virtual {p1, v5}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 360
    if-eqz v2, :cond_6

    .line 174
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->c()V

    .line 329
    :cond_6
    invoke-virtual {p0, v3, v4, v5}, Lcom/whatsapp/messaging/MessageService;->a(ZZLjava/util/ArrayList;)V

    .line 238
    if-eqz v0, :cond_8

    :cond_7
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v2, 0x21

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v7, :cond_8

    .line 136
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->r()V

    .line 181
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-virtual {p1, v0, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 229
    if-eqz v0, :cond_8

    .line 322
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->p()V

    .line 184
    :cond_8
    return-void
.end method

.method public q()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 328
    iget-boolean v0, p0, Lcom/whatsapp/messaging/MessageService;->y:Z

    if-nez v0, :cond_0

    .line 180
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 374
    invoke-direct {p0}, Lcom/whatsapp/messaging/MessageService;->d()J

    move-result-wide v2

    .line 221
    const-wide/16 v4, 0x2

    div-long v4, v2, v4

    add-long/2addr v4, v2

    new-instance v6, Ljava/util/Random;

    invoke-direct {v6}, Ljava/util/Random;-><init>()V

    invoke-virtual {v6}, Ljava/util/Random;->nextLong()J

    move-result-wide v6

    rem-long v2, v6, v2

    sub-long v2, v4, v2

    .line 120
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v6, 0x2a

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 250
    new-instance v4, Landroid/content/Intent;

    const-class v5, Lcom/whatsapp/messaging/MessageService;

    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v5, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v6, 0x20

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    sget-object v5, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v6, 0x1d

    aget-object v5, v5, v6

    invoke-virtual {v4, v5, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v4

    .line 133
    invoke-static {p0, v8, v4, v8}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 263
    iget-object v5, p0, Lcom/whatsapp/messaging/MessageService;->l:Landroid/app/AlarmManager;

    const/4 v6, 0x2

    add-long/2addr v0, v2

    invoke-virtual {v5, v6, v0, v1, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 57
    iput-boolean v9, p0, Lcom/whatsapp/messaging/MessageService;->y:Z

    .line 254
    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_1

    .line 12
    :cond_0
    sget-object v0, Lcom/whatsapp/messaging/MessageService;->D:[Ljava/lang/String;

    const/16 v1, 0x2b

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 219
    :cond_1
    return-void
.end method
