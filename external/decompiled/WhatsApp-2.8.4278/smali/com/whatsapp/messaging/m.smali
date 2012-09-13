.class public Lcom/whatsapp/messaging/m;
.super Landroid/os/HandlerThread;
.source "m.java"


# static fields
.field private static final D:[Ljava/lang/String;

.field public static final a:[I

.field public static y:I

.field public static z:Z


# instance fields
.field final A:Ljava/lang/String;

.field private final B:Lcom/whatsapp/messaging/t;

.field private C:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/whatsapp/messaging/x;

.field private c:Lcom/whatsapp/messaging/n;

.field private final d:Landroid/os/Messenger;

.field private e:Landroid/os/Messenger;

.field private f:Landroid/os/Messenger;

.field private g:Landroid/os/Messenger;

.field private h:Landroid/os/Messenger;

.field private i:Lcom/whatsapp/messaging/b;

.field private j:Lcom/whatsapp/messaging/e;

.field private k:Lcom/whatsapp/messaging/c;

.field private l:Lcom/whatsapp/messaging/a;

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lcom/whatsapp/qz;

.field private r:Ljava/net/Socket;

.field private final s:Landroid/content/Context;

.field private final t:Ljava/lang/String;

.field private final u:Lcom/whatsapp/jz;

.field private v:I

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end field

.field private x:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x59

    const/16 v1, 0x47

    const/16 v3, 0x19

    const/16 v4, 0xc

    const/4 v8, 0x0

    const/16 v0, 0x25

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0006\u0015\'KA\u0018\u001a*PI\t\r9IE\t\u001e9ME\n\u001c)LX"

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

    const-string v0, "&5\u0007ka"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh5\t~e)"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh:\twb\":\u00126b(-Kx`+6\u0011|hh*\t\u007fx08\u0014|!\"!\u0016p~\"="

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh:\twb\":\u00126b(-Kx`+6\u0011|hh5\t~e)t\u0000xe+<\u0002"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-Iz`(*\u0003}"

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

    const/4 v10, 0x6

    const-string v0, ")6Fwc):\u00039e)y\u0005qm+5\u0003wk\""

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

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-Iwi?-Kic5-Izc5+\u0013ixj*\u0012ki&4K|t$<\u0016me(7F"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh.\u0014px\"v\u0005ue\"7\u0012Fo(7\u0000pkh>\u0003m"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh.\u0014px\"v\u0004uc$2\np\u007f3v\u0001|x"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-Izc)7\u0003zx\"="

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh:\twb\":\u0012"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh5\t~e)v\u0000xe+,\u0014|,"

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

    aput-object v0, v9, v4

    const/16 v10, 0xd

    const-string v0, "\u0015\u001c%O,"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-Izc)7\u0003zx.7\u00019"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-Iwi?-Kic5-Ipcj<\u001ezi7-\u000fvb"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh:\twb\":\u00126b(-Kx`+6\u0011|hh:\nvo,"

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

    const-string v0, "4w\u0011qm3*\u0007i|i7\u0003m"

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

    const-string v0, "%8\u00029b(7\u0005|,.7Fzd&5\n|b <"

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

    const-string v0, "\u0014\u001c(],"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-I}e4:\twb\":\u00129"

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

    const-string v0, "$w\u0011qm3*\u0007i|i7\u0003m\""

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

    const-string v0, ")<\u001emS$19}m38"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh5\t~e)v\u0000xe+,\u0014|#)<\u001emS$19}m38Izc*4\u000fm"

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

    const-string v0, "\u001bw"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh>\u0003m!.)K\u007fm.5\u0003}"

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

    aput-object v0, v9, v3

    const/16 v10, 0x1a

    const-string v0, "\n\u001dS"

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

    const-string v0, "$8\u00089b(-Fky)y\u0011px/6\u0013m,*=S"

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

    const-string v0, "?4\u0016iS$6\u0008wi$-\u000fvb\u0018-\u000eki&="

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh(\u0013px"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh5\t~e)v\u0012pa\"6\u0013m"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh:\nv\u007f\"\n\tzg\"-F"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh*\tzg\"-Iz`(*\u0003"

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

    const-string v0, ")6Fp|g8\u0002}~\"*\u0015|\u007fg?\tlb#y\u0000v~g"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh)\u000fwk30\u000b|c2-I|t70\u0014|hh0\u0001wc5<"

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

    const-string v0, "?4\u0016i#$6\u0008wi$-\u000fvbh)\u000fwk30\u000b|c2-I|t70\u0014|h"

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

    const-string v0, "-0\u0002"

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

    sput-object v9, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    .line 227
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/whatsapp/messaging/m;->a:[I

    .line 278
    sput v8, Lcom/whatsapp/messaging/m;->y:I

    .line 318
    sput-boolean v8, Lcom/whatsapp/messaging/m;->z:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_25
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_25

    :pswitch_1
    move v0, v2

    goto :goto_25

    :pswitch_2
    const/16 v0, 0x66

    goto :goto_25

    :pswitch_3
    move v0, v3

    goto :goto_25

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_26

    :pswitch_5
    move v0, v2

    goto :goto_26

    :pswitch_6
    const/16 v0, 0x66

    goto :goto_26

    :pswitch_7
    move v0, v3

    goto :goto_26

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_27

    :pswitch_9
    move v0, v2

    goto :goto_27

    :pswitch_a
    const/16 v0, 0x66

    goto :goto_27

    :pswitch_b
    move v0, v3

    goto :goto_27

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_28

    :pswitch_d
    move v0, v2

    goto :goto_28

    :pswitch_e
    const/16 v0, 0x66

    goto :goto_28

    :pswitch_f
    move v0, v3

    goto :goto_28

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_29

    :pswitch_11
    move v0, v2

    goto :goto_29

    :pswitch_12
    const/16 v0, 0x66

    goto :goto_29

    :pswitch_13
    move v0, v3

    goto :goto_29

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_2a

    :pswitch_15
    move v0, v2

    goto :goto_2a

    :pswitch_16
    const/16 v0, 0x66

    goto :goto_2a

    :pswitch_17
    move v0, v3

    goto :goto_2a

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_2b

    :pswitch_19
    move v0, v2

    goto :goto_2b

    :pswitch_1a
    const/16 v0, 0x66

    goto :goto_2b

    :pswitch_1b
    move v0, v3

    goto :goto_2b

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_2c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_2c

    :pswitch_1d
    move v0, v2

    goto :goto_2c

    :pswitch_1e
    const/16 v0, 0x66

    goto :goto_2c

    :pswitch_1f
    move v0, v3

    goto :goto_2c

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_2d

    :pswitch_21
    move v0, v2

    goto :goto_2d

    :pswitch_22
    const/16 v0, 0x66

    goto :goto_2d

    :pswitch_23
    move v0, v3

    goto :goto_2d

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_2e

    :pswitch_25
    move v0, v2

    goto :goto_2e

    :pswitch_26
    const/16 v0, 0x66

    goto :goto_2e

    :pswitch_27
    move v0, v3

    goto :goto_2e

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_2f

    :pswitch_29
    move v0, v2

    goto :goto_2f

    :pswitch_2a
    const/16 v0, 0x66

    goto :goto_2f

    :pswitch_2b
    move v0, v3

    goto :goto_2f

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_30

    :pswitch_2d
    move v0, v2

    goto :goto_30

    :pswitch_2e
    const/16 v0, 0x66

    goto :goto_30

    :pswitch_2f
    move v0, v3

    goto :goto_30

    :cond_c
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_31
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_31

    :pswitch_31
    move v0, v2

    goto :goto_31

    :pswitch_32
    const/16 v0, 0x66

    goto :goto_31

    :pswitch_33
    move v0, v3

    goto :goto_31

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_32

    :pswitch_35
    move v0, v2

    goto :goto_32

    :pswitch_36
    const/16 v0, 0x66

    goto :goto_32

    :pswitch_37
    move v0, v3

    goto :goto_32

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_33

    :pswitch_39
    move v0, v2

    goto :goto_33

    :pswitch_3a
    const/16 v0, 0x66

    goto :goto_33

    :pswitch_3b
    move v0, v3

    goto :goto_33

    :cond_f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_34

    :pswitch_3d
    move v0, v2

    goto :goto_34

    :pswitch_3e
    const/16 v0, 0x66

    goto :goto_34

    :pswitch_3f
    move v0, v3

    goto :goto_34

    :cond_10
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_35

    :pswitch_41
    move v0, v2

    goto :goto_35

    :pswitch_42
    const/16 v0, 0x66

    goto :goto_35

    :pswitch_43
    move v0, v3

    goto :goto_35

    :cond_11
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_36
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_36

    :pswitch_45
    move v0, v2

    goto :goto_36

    :pswitch_46
    const/16 v0, 0x66

    goto :goto_36

    :pswitch_47
    move v0, v3

    goto :goto_36

    :cond_12
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_37

    :pswitch_49
    move v0, v2

    goto :goto_37

    :pswitch_4a
    const/16 v0, 0x66

    goto :goto_37

    :pswitch_4b
    move v0, v3

    goto :goto_37

    :cond_13
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_38

    :pswitch_4d
    move v0, v2

    goto :goto_38

    :pswitch_4e
    const/16 v0, 0x66

    goto :goto_38

    :pswitch_4f
    move v0, v3

    goto :goto_38

    :cond_14
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_39

    :pswitch_51
    move v0, v2

    goto :goto_39

    :pswitch_52
    const/16 v0, 0x66

    goto :goto_39

    :pswitch_53
    move v0, v3

    goto :goto_39

    :cond_15
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_3a

    :pswitch_55
    move v0, v2

    goto :goto_3a

    :pswitch_56
    const/16 v0, 0x66

    goto :goto_3a

    :pswitch_57
    move v0, v3

    goto :goto_3a

    :cond_16
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_3b

    :pswitch_59
    move v0, v2

    goto :goto_3b

    :pswitch_5a
    const/16 v0, 0x66

    goto :goto_3b

    :pswitch_5b
    move v0, v3

    goto :goto_3b

    :cond_17
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_3c

    :pswitch_5d
    move v0, v2

    goto :goto_3c

    :pswitch_5e
    const/16 v0, 0x66

    goto :goto_3c

    :pswitch_5f
    move v0, v3

    goto :goto_3c

    :cond_18
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_3d

    :pswitch_61
    move v0, v2

    goto :goto_3d

    :pswitch_62
    const/16 v0, 0x66

    goto :goto_3d

    :pswitch_63
    move v0, v3

    goto :goto_3d

    :cond_19
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_3e
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_3e

    :pswitch_65
    move v0, v2

    goto :goto_3e

    :pswitch_66
    const/16 v0, 0x66

    goto :goto_3e

    :pswitch_67
    move v0, v3

    goto :goto_3e

    :cond_1a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_3f

    :pswitch_69
    move v0, v2

    goto :goto_3f

    :pswitch_6a
    const/16 v0, 0x66

    goto :goto_3f

    :pswitch_6b
    move v0, v3

    goto :goto_3f

    :cond_1b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_40

    :pswitch_6d
    move v0, v2

    goto :goto_40

    :pswitch_6e
    const/16 v0, 0x66

    goto :goto_40

    :pswitch_6f
    move v0, v3

    goto :goto_40

    :cond_1c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_41

    :pswitch_71
    move v0, v2

    goto :goto_41

    :pswitch_72
    const/16 v0, 0x66

    goto :goto_41

    :pswitch_73
    move v0, v3

    goto :goto_41

    :cond_1d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_42

    :pswitch_75
    move v0, v2

    goto :goto_42

    :pswitch_76
    const/16 v0, 0x66

    goto :goto_42

    :pswitch_77
    move v0, v3

    goto :goto_42

    :cond_1e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_43

    :pswitch_79
    move v0, v2

    goto :goto_43

    :pswitch_7a
    const/16 v0, 0x66

    goto :goto_43

    :pswitch_7b
    move v0, v3

    goto :goto_43

    :cond_1f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_44

    :pswitch_7d
    move v0, v2

    goto :goto_44

    :pswitch_7e
    const/16 v0, 0x66

    goto :goto_44

    :pswitch_7f
    move v0, v3

    goto :goto_44

    :cond_20
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_45

    :pswitch_81
    move v0, v2

    goto :goto_45

    :pswitch_82
    const/16 v0, 0x66

    goto :goto_45

    :pswitch_83
    move v0, v3

    goto :goto_45

    :cond_21
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_46

    :pswitch_85
    move v0, v2

    goto :goto_46

    :pswitch_86
    const/16 v0, 0x66

    goto :goto_46

    :pswitch_87
    move v0, v3

    goto :goto_46

    :cond_22
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_47

    :pswitch_89
    move v0, v2

    goto :goto_47

    :pswitch_8a
    const/16 v0, 0x66

    goto :goto_47

    :pswitch_8b
    move v0, v3

    goto :goto_47

    :cond_23
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_48

    :pswitch_8d
    move v0, v2

    goto :goto_48

    :pswitch_8e
    const/16 v0, 0x66

    goto :goto_48

    :pswitch_8f
    move v0, v3

    goto :goto_48

    :cond_24
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_49
    xor-int/2addr v0, v11

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
    const/16 v0, 0x66

    goto :goto_49

    :pswitch_93
    move v0, v3

    goto :goto_49

    .line 227
    :array_0
    .array-data 0x4
        0xbbt 0x1t 0x0t 0x0t
        0x66t 0x14t 0x0t 0x0t
    .end array-data

    .line -1
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

.method public constructor <init>(Landroid/content/Context;Landroid/os/Messenger;)V
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 7
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-direct {p0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 223
    iput-boolean v4, p0, Lcom/whatsapp/messaging/m;->n:Z

    .line 211
    iput-boolean v4, p0, Lcom/whatsapp/messaging/m;->o:Z

    .line 104
    iput-boolean v4, p0, Lcom/whatsapp/messaging/m;->p:Z

    .line 69
    const/4 v1, -0x1

    iput v1, p0, Lcom/whatsapp/messaging/m;->v:I

    .line 317
    iput-object v3, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    .line 62
    iput-object v3, p0, Lcom/whatsapp/messaging/m;->x:Landroid/content/SharedPreferences;

    .line 251
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    iput-object v1, p0, Lcom/whatsapp/messaging/m;->A:Ljava/lang/String;

    .line 43
    new-instance v1, Lcom/whatsapp/messaging/u;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/u;-><init>(Lcom/whatsapp/messaging/m;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/m;->B:Lcom/whatsapp/messaging/t;

    .line 173
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/whatsapp/messaging/m;->C:Ljava/util/HashSet;

    .line 92
    iput-object p2, p0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    .line 51
    iput-object p1, p0, Lcom/whatsapp/messaging/m;->s:Landroid/content/Context;

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f090005

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f090004

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/messaging/m;->t:Ljava/lang/String;

    .line 34
    :try_start_0
    new-instance v1, Lcom/whatsapp/jz;

    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whatsapp/jz;-><init>(Ljava/security/MessageDigest;)V

    iput-object v1, p0, Lcom/whatsapp/messaging/m;->u:Lcom/whatsapp/jz;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    const v1, 0x7f090002

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/messaging/m;->x:Landroid/content/SharedPreferences;

    .line 57
    sget v1, Lcom/whatsapp/App;->wc:I

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/messaging/MessageService;->C:I

    :cond_0
    return-void

    .line 300
    :catch_0
    move-exception v0

    .line 135
    new-instance v0, Ljava/lang/InternalError;

    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static a(I)B
    .locals 4
    .parameter

    .prologue
    const/4 v0, 0x0

    sget v2, Lcom/whatsapp/messaging/MessageService;->C:I

    move v1, v0

    .line 256
    :cond_0
    const/16 v3, 0x8

    if-ge v1, v3, :cond_2

    .line 218
    shl-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    .line 165
    and-int/lit16 v3, p0, 0x80

    if-lez v3, :cond_1

    .line 257
    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    .line 285
    :cond_1
    shl-int/lit8 p0, p0, 0x1

    .line 270
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    .line 275
    :cond_2
    return v0
.end method

.method static a(Lcom/whatsapp/messaging/m;)Landroid/os/Messenger;
    .locals 1
    .parameter

    .prologue
    .line 82
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/net/InetAddress;
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 287
    iget v0, p0, Lcom/whatsapp/messaging/m;->v:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/whatsapp/messaging/m;->v:I

    .line 240
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/whatsapp/messaging/m;->v:I

    iget-object v1, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 46
    :cond_0
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    .line 108
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 213
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x21

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/messaging/m;->v:I

    .line 29
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->w:Ljava/util/List;

    iget v1, p0, Lcom/whatsapp/messaging/m;->v:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/InetAddress;

    return-object v0
.end method

.method private a(Landroid/os/Message;)V
    .locals 4
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 136
    invoke-static {p1}, Lcom/whatsapp/messaging/s;->a(Landroid/os/Message;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 203
    :goto_0
    return-void

    .line 310
    :sswitch_0
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->B:Lcom/whatsapp/messaging/t;

    invoke-static {v0, p1}, Lcom/whatsapp/messaging/s;->a(Lcom/whatsapp/messaging/t;Landroid/os/Message;)V

    .line 63
    if-eqz v1, :cond_0

    .line 33
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    .line 205
    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x24

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    iget-object v2, p0, Lcom/whatsapp/messaging/m;->l:Lcom/whatsapp/messaging/a;

    invoke-virtual {v2, v0}, Lcom/whatsapp/messaging/a;->a(Ljava/lang/String;)V

    .line 130
    if-eqz v1, :cond_0

    .line 202
    :sswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 103
    iget-object v1, p0, Lcom/whatsapp/messaging/m;->l:Lcom/whatsapp/messaging/a;

    invoke-virtual {v1, v0}, Lcom/whatsapp/messaging/a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 136
    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_1
        0x15 -> :sswitch_2
    .end sparse-switch
.end method

.method private a(Landroid/os/Messenger;)V
    .locals 2
    .parameter

    .prologue
    .line 188
    iput-object p1, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    .line 303
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/whatsapp/messaging/m;->e:Landroid/os/Messenger;

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Landroid/os/Messenger;)V

    .line 72
    return-void
.end method

.method static a(Lcom/whatsapp/messaging/m;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 225
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->a(Landroid/os/Message;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/m;Landroid/os/Messenger;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->a(Landroid/os/Messenger;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/m;Lcom/whatsapp/qz;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 283
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->a(Lcom/whatsapp/qz;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/m;Lcom/whatsapp/sz;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 272
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->a(Lcom/whatsapp/sz;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/m;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 253
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whatsapp/messaging/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/m;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->c(Z)V

    return-void
.end method

.method private a(Lcom/whatsapp/qz;)V
    .locals 1
    .parameter

    .prologue
    .line 47
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    if-ne p1, v0, :cond_0

    .line 247
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whatsapp/messaging/m;->a(Z)V

    .line 141
    :cond_0
    return-void
.end method

.method private a(Lcom/whatsapp/sz;)V
    .locals 3
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->k:Lcom/whatsapp/messaging/c;

    const-wide/32 v1, 0xafc8

    invoke-virtual {v0, p1, v1, v2}, Lcom/whatsapp/messaging/c;->a(Lcom/whatsapp/sz;J)V

    .line 265
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V
    .locals 16
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    sget v14, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 191
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v1, :cond_1

    .line 267
    :cond_0
    :goto_0
    return-void

    .line 263
    :cond_1
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->I()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 187
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 153
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->e(Landroid/os/Messenger;)V

    goto :goto_0

    .line 235
    :cond_2
    invoke-static {}, Lcom/whatsapp/App;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 100
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 260
    :cond_3
    invoke-static {}, Lcom/whatsapp/App;->J()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 167
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 201
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->f(Landroid/os/Messenger;)V

    goto :goto_0

    .line 243
    :cond_4
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 84
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;)V

    .line 237
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    if-eqz v1, :cond_5

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_5

    .line 61
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->b()V

    .line 296
    :cond_5
    const/4 v13, 0x0

    .line 132
    const/4 v12, 0x0

    .line 111
    const/4 v11, 0x0

    .line 315
    :try_start_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    .line 120
    const/4 v2, 0x0

    .line 214
    if-eqz p3, :cond_29

    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_29

    .line 241
    const/4 v1, 0x0

    .line 306
    sget-boolean v3, Lcom/whatsapp/messaging/m;->z:Z

    if-eqz v3, :cond_e

    .line 140
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_6

    .line 298
    const/4 v1, 0x1

    move-object/from16 v0, p3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 160
    :cond_6
    :goto_1
    if-eqz v1, :cond_29

    .line 30
    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/whatsapp/messaging/m;->b(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1

    .line 16
    :goto_2
    if-nez v1, :cond_7

    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0x15

    aget-object v1, v1, v2

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/whatsapp/messaging/m;->a(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1

    .line 208
    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->c()I

    move-result v2

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v5, 0xe

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 123
    new-instance v3, Ljava/net/InetSocketAddress;

    invoke-direct {v3, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 295
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    const/16 v2, 0x7530

    invoke-virtual {v1, v3, v2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 261
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    const/16 v2, 0x7530

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 9
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 70
    new-instance v1, Lcom/whatsapp/messaging/e;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/whatsapp/messaging/e;-><init>(Lcom/whatsapp/messaging/m;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    .line 166
    new-instance v1, Landroid/os/Messenger;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    invoke-direct {v1, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/messaging/m;->h:Landroid/os/Messenger;

    .line 80
    new-instance v8, Lcom/whatsapp/messaging/q;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->h:Landroid/os/Messenger;

    invoke-direct {v8, v1}, Lcom/whatsapp/messaging/q;-><init>(Landroid/os/Messenger;)V

    .line 157
    new-instance v4, Lcom/whatsapp/mf;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v4, v1, v2}, Lcom/whatsapp/mf;-><init>(Ljava/io/OutputStream;I)V

    .line 276
    new-instance v1, Lcom/whatsapp/lf;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/whatsapp/lf;-><init>(Ljava/io/InputStream;I)V

    .line 234
    new-instance v2, Lcom/whatsapp/oz;

    sget-object v3, Lcom/whatsapp/nz;->a:[Ljava/lang/String;

    invoke-direct {v2, v1, v3}, Lcom/whatsapp/oz;-><init>(Ljava/io/InputStream;[Ljava/lang/String;)V

    .line 163
    sget v1, Lcom/whatsapp/App;->f:I

    const/4 v3, 0x1

    if-lt v1, v3, :cond_28

    .line 83
    new-instance v1, Lcom/whatsapp/lz;

    new-instance v3, Lcom/whatsapp/rf;

    invoke-direct {v3}, Lcom/whatsapp/rf;-><init>()V

    sget-object v5, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v6, 0xd

    aget-object v5, v5, v6

    invoke-direct {v1, v2, v3, v5}, Lcom/whatsapp/lz;-><init>(Lcom/whatsapp/e1;Ljava/io/Writer;Ljava/lang/String;)V

    move-object v3, v1

    .line 183
    :goto_3
    new-instance v2, Lcom/whatsapp/pz;

    sget-object v1, Lcom/whatsapp/nz;->a:[Ljava/lang/String;

    invoke-direct {v2, v4, v1}, Lcom/whatsapp/pz;-><init>(Ljava/io/OutputStream;[Ljava/lang/String;)V

    .line 60
    sget v1, Lcom/whatsapp/App;->f:I

    const/4 v4, 0x1

    if-lt v1, v4, :cond_27

    .line 117
    new-instance v1, Lcom/whatsapp/mz;

    new-instance v4, Lcom/whatsapp/rf;

    invoke-direct {v4}, Lcom/whatsapp/rf;-><init>()V

    sget-object v5, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v6, 0x13

    aget-object v5, v5, v6

    invoke-direct {v1, v2, v4, v5}, Lcom/whatsapp/mz;-><init>(Lcom/whatsapp/f1;Ljava/io/Writer;Ljava/lang/String;)V

    .line 131
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->a()[B

    move-result-object v4

    .line 207
    new-instance v2, Lcom/whatsapp/z0;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/whatsapp/messaging/m;->u:Lcom/whatsapp/jz;

    invoke-direct {v2, v3, v1, v5, v4}, Lcom/whatsapp/z0;-><init>(Lcom/whatsapp/e1;Lcom/whatsapp/f1;Lcom/whatsapp/i1;[B)V

    .line 23
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->s:Landroid/content/Context;

    invoke-static {v1}, Lcom/whatsapp/App;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 284
    new-instance v10, Lcom/whatsapp/messaging/o;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lcom/whatsapp/messaging/o;-><init>(Lcom/whatsapp/messaging/m;)V

    .line 44
    new-instance v1, Lcom/whatsapp/qz;

    sget-object v3, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v4, 0x11

    aget-object v3, v3, v4

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/whatsapp/messaging/m;->t:Ljava/lang/String;

    sget-object v9, Lcom/whatsapp/App;->x:Lcom/whatsapp/eu;

    move-object/from16 v5, p1

    move-object/from16 v7, p2

    invoke-direct/range {v1 .. v10}, Lcom/whatsapp/qz;-><init>(Lcom/whatsapp/y0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/x0;Lcom/whatsapp/vz;Lcom/whatsapp/h1;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    .line 291
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-virtual {v2, v1}, Lcom/whatsapp/z0;->a(Lcom/whatsapp/qz;)V

    .line 78
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/whatsapp/qz;->a(Z)V

    .line 182
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {}, Lcom/whatsapp/App;->o()Z

    move-result v3

    invoke-virtual {v1, v3}, Lcom/whatsapp/qz;->b(Z)V

    .line 65
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {}, Lcom/whatsapp/App;->p()Z

    move-result v3

    invoke-virtual {v1, v3}, Lcom/whatsapp/qz;->c(Z)V

    .line 106
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/whatsapp/qz;->d(Z)V

    .line 178
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v1, v1, v3

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 198
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->b(Landroid/os/Messenger;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/whatsapp/bg; {:try_start_0 .. :try_end_0} :catch_2

    .line 27
    const/4 v4, 0x1

    .line 215
    :try_start_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    move/from16 v0, p4

    invoke-virtual {v1, v0}, Lcom/whatsapp/qz;->e(Z)V

    .line 175
    iget-object v1, v2, Lcom/whatsapp/z0;->g:[B

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/messaging/m;->a([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Lcom/whatsapp/cg; {:try_start_1 .. :try_end_1} :catch_0

    .line 190
    const/4 v2, 0x0

    .line 143
    :try_start_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->c(Landroid/os/Messenger;)V

    .line 170
    invoke-static {}, Lcom/whatsapp/App;->f()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 210
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v1, v1, v3

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 314
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-virtual {v1}, Lcom/whatsapp/qz;->f()V

    .line 229
    :cond_8
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v1, v1, v3

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 48
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-virtual {v1}, Lcom/whatsapp/qz;->c()V

    .line 87
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    iget-wide v3, v1, Lcom/whatsapp/qz;->w:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_9

    .line 8
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    iget-wide v3, v1, Lcom/whatsapp/qz;->w:J

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    invoke-static {v3, v4}, Lcom/whatsapp/eg;->a(J)V

    .line 85
    :cond_9
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    iget v1, v1, Lcom/whatsapp/qz;->v:I

    invoke-static {v1}, Lcom/whatsapp/eg;->a(I)V

    .line 238
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    iget v1, v1, Lcom/whatsapp/qz;->v:I

    invoke-static {v1}, Lcom/whatsapp/eg;->c(I)V

    .line 116
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    const v3, 0xf9060

    invoke-virtual {v1, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 176
    new-instance v1, Lcom/whatsapp/messaging/x;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-direct {v1, v3, v8}, Lcom/whatsapp/messaging/x;-><init>(Lcom/whatsapp/qz;Lcom/whatsapp/messaging/q;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/messaging/m;->b:Lcom/whatsapp/messaging/x;

    .line 126
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->b:Lcom/whatsapp/messaging/x;

    invoke-virtual {v1}, Lcom/whatsapp/messaging/x;->start()V

    .line 139
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/whatsapp/messaging/m;->n:Z

    .line 192
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/whatsapp/bg; {:try_start_2 .. :try_end_2} :catch_2

    .line 134
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v1, :cond_a

    .line 12
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->d(Landroid/os/Messenger;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {v1, v2}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V

    if-eqz v14, :cond_0

    .line 91
    :cond_a
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    if-eqz v1, :cond_c

    .line 312
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_b

    .line 290
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->b()V

    if-eqz v14, :cond_c

    .line 264
    :cond_b
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 185
    :cond_c
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    if-eqz v1, :cond_d

    .line 58
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    invoke-virtual {v1}, Lcom/whatsapp/messaging/e;->a()V

    .line 142
    :cond_d
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    :goto_5
    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Z)V

    goto/16 :goto_0

    .line 180
    :cond_e
    const/4 v1, 0x0

    :try_start_3
    move-object/from16 v0, p3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lcom/whatsapp/bg; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_1

    .line 252
    :catch_0
    move-exception v1

    .line 277
    :try_start_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v5, 0xc

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v1, Lcom/whatsapp/cg;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 36
    const/4 v3, 0x1

    .line 143
    :try_start_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v2}, Lcom/whatsapp/messaging/i;->c(Landroid/os/Messenger;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Lcom/whatsapp/bg; {:try_start_5 .. :try_end_5} :catch_3

    .line 134
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v2, :cond_f

    .line 12
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v2}, Lcom/whatsapp/messaging/i;->d(Landroid/os/Messenger;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {v2, v3}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V

    if-eqz v14, :cond_0

    .line 91
    :cond_f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    if-eqz v2, :cond_11

    .line 312
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_10

    .line 290
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->b()V

    if-eqz v14, :cond_11

    .line 264
    :cond_10
    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 185
    :cond_11
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    if-eqz v2, :cond_12

    .line 58
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    invoke-virtual {v2}, Lcom/whatsapp/messaging/e;->a()V

    .line 309
    :cond_12
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v2, v1}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Lcom/whatsapp/cg;)V

    if-eqz v14, :cond_0

    .line 142
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    goto/16 :goto_5

    .line 143
    :catchall_0
    move-exception v1

    :try_start_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v2}, Lcom/whatsapp/messaging/i;->c(Landroid/os/Messenger;)V

    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Lcom/whatsapp/bg; {:try_start_6 .. :try_end_6} :catch_2

    .line 5
    :catch_1
    move-exception v1

    move-object v2, v11

    move v3, v12

    .line 259
    :goto_6
    :try_start_7
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    .line 206
    sget-object v6, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v7, 0x12

    aget-object v6, v6, v7

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    sget-object v6, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v7, 0x6

    aget-object v6, v6, v7

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 54
    :cond_13
    const/4 v5, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/whatsapp/messaging/m;->a([B)V

    .line 244
    :cond_14
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v7, 0x14

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 147
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v1, :cond_15

    if-eqz v4, :cond_16

    .line 35
    :cond_15
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v4, 0xf

    aget-object v1, v1, v4

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 148
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->d()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 134
    :cond_16
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v1, :cond_17

    .line 12
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->d(Landroid/os/Messenger;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {v1, v4}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V

    if-eqz v14, :cond_0

    .line 91
    :cond_17
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    if-eqz v1, :cond_19

    .line 312
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_18

    .line 290
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->b()V

    if-eqz v14, :cond_19

    .line 264
    :cond_18
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v1, v1, v4

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 185
    :cond_19
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    if-eqz v1, :cond_1a

    .line 58
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    invoke-virtual {v1}, Lcom/whatsapp/messaging/e;->a()V

    .line 219
    :cond_1a
    if-eqz v3, :cond_1b

    .line 309
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1, v2}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Lcom/whatsapp/cg;)V

    if-eqz v14, :cond_0

    .line 142
    :cond_1b
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    goto/16 :goto_5

    .line 105
    :catch_2
    move-exception v1

    .line 133
    :goto_7
    :try_start_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whatsapp/bg;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 50
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->d()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 134
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v1, :cond_1c

    .line 12
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1}, Lcom/whatsapp/messaging/i;->d(Landroid/os/Messenger;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {v1, v2}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V

    if-eqz v14, :cond_0

    .line 91
    :cond_1c
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    if-eqz v1, :cond_1e

    .line 312
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_1d

    .line 290
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->b()V

    if-eqz v14, :cond_1e

    .line 264
    :cond_1d
    sget-object v1, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 185
    :cond_1e
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    if-eqz v1, :cond_1f

    .line 58
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    invoke-virtual {v1}, Lcom/whatsapp/messaging/e;->a()V

    .line 219
    :cond_1f
    if-eqz v12, :cond_20

    .line 309
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v1, v11}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Lcom/whatsapp/cg;)V

    if-eqz v14, :cond_0

    .line 142
    :cond_20
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    goto/16 :goto_5

    .line 134
    :catchall_1
    move-exception v1

    :goto_8
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v2, :cond_21

    .line 12
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v2}, Lcom/whatsapp/messaging/i;->d(Landroid/os/Messenger;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/whatsapp/messaging/m;->q:Lcom/whatsapp/qz;

    invoke-static {v2, v3}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V

    if-eqz v14, :cond_26

    .line 91
    :cond_21
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    if-eqz v2, :cond_23

    .line 312
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_22

    .line 290
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/messaging/m;->b()V

    if-eqz v14, :cond_23

    .line 264
    :cond_22
    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 185
    :cond_23
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    if-eqz v2, :cond_24

    .line 58
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->j:Lcom/whatsapp/messaging/e;

    invoke-virtual {v2}, Lcom/whatsapp/messaging/e;->a()V

    .line 219
    :cond_24
    if-eqz v12, :cond_25

    .line 309
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v2, v11}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Lcom/whatsapp/cg;)V

    if-eqz v14, :cond_26

    .line 142
    :cond_25
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Z)V

    .line 134
    :cond_26
    throw v1

    :catchall_2
    move-exception v1

    move-object v11, v2

    move v12, v3

    goto :goto_8

    :catchall_3
    move-exception v2

    move-object v11, v1

    move v12, v3

    move-object v1, v2

    goto :goto_8

    .line 105
    :catch_3
    move-exception v2

    move-object v11, v1

    move v12, v3

    move-object v1, v2

    goto/16 :goto_7

    .line 5
    :catch_4
    move-exception v1

    move-object v2, v11

    move v3, v12

    move v4, v13

    goto/16 :goto_6

    :catch_5
    move-exception v1

    move v3, v12

    move v4, v2

    move-object v2, v11

    goto/16 :goto_6

    :catch_6
    move-exception v2

    move-object v15, v2

    move-object v2, v1

    move-object v1, v15

    goto/16 :goto_6

    :cond_27
    move-object v1, v2

    goto/16 :goto_4

    :cond_28
    move-object v3, v2

    goto/16 :goto_3

    :cond_29
    move-object v1, v2

    goto/16 :goto_2
.end method

.method private a(Z)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 282
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->k:Lcom/whatsapp/messaging/c;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/c;->a()V

    .line 307
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->l:Lcom/whatsapp/messaging/a;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/a;->a()V

    .line 71
    iget-boolean v0, p0, Lcom/whatsapp/messaging/m;->n:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/whatsapp/messaging/m;->o:Z

    if-nez v0, :cond_2

    .line 25
    if-eqz p1, :cond_0

    .line 10
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->b()V

    .line 159
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;)V

    .line 281
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v0, v3}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Z)V

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/messaging/m;->n:Z

    .line 41
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->f()V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->i:Lcom/whatsapp/messaging/b;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/messaging/b;->a(J)V

    .line 297
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {}, Lcom/whatsapp/messaging/s;->h()Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 76
    :cond_1
    iput-boolean v3, p0, Lcom/whatsapp/messaging/m;->o:Z

    .line 304
    :cond_2
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/net/InetAddress;
    .locals 5
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    sget v2, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 172
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x18

    aget-object v0, v0, v3

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 311
    if-eqz v3, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/whatsapp/g5;->b(Z)V

    .line 161
    array-length v0, v3

    new-array v0, v0, [B

    .line 90
    :cond_0
    :try_start_0
    array-length v4, v3

    if-ge v1, v4, :cond_1

    .line 274
    aget-object v4, v3, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lcom/whatsapp/messaging/m;->a(I)B

    move-result v4

    aput-byte v4, v0, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 280
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    .line 233
    :cond_1
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_2
    move v0, v1

    .line 311
    goto :goto_0

    .line 186
    :catch_0
    move-exception v0

    .line 217
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 21
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private b()V
    .locals 4

    .prologue
    .line 273
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x20

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 301
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->shutdownOutput()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 239
    :cond_0
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_1

    .line 152
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    :cond_1
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    .line 13
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->r:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 200
    :cond_2
    :goto_2
    return-void

    .line 156
    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 155
    :catch_1
    move-exception v0

    goto :goto_1

    .line 89
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method private b(Landroid/os/Message;)V
    .locals 4
    .parameter

    .prologue
    .line 59
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 246
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 31
    iget-object v1, p0, Lcom/whatsapp/messaging/m;->l:Lcom/whatsapp/messaging/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast v0, Ljava/lang/String;

    const-wide/16 v2, 0x7d00

    invoke-virtual {v1, v0, v2, v3}, Lcom/whatsapp/messaging/a;->a(Ljava/lang/String;J)V

    .line 146
    :cond_0
    return-void
.end method

.method static b(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 125
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->i()V

    return-void
.end method

.method static b(Lcom/whatsapp/messaging/m;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 292
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->b(Landroid/os/Message;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 293
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whatsapp/messaging/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 230
    return-void
.end method

.method private b(Z)V
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 102
    iput-boolean v0, p0, Lcom/whatsapp/messaging/m;->n:Z

    .line 114
    iput-boolean v0, p0, Lcom/whatsapp/messaging/m;->o:Z

    .line 258
    iget-boolean v0, p0, Lcom/whatsapp/messaging/m;->p:Z

    if-nez v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->i:Lcom/whatsapp/messaging/b;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/b;->a()V

    .line 115
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {v0}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;)V

    .line 26
    iget-boolean v0, p0, Lcom/whatsapp/messaging/m;->m:Z

    if-eqz v0, :cond_0

    .line 232
    const/4 p1, 0x1

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->d:Landroid/os/Messenger;

    invoke-static {v0, p1}, Lcom/whatsapp/messaging/i;->a(Landroid/os/Messenger;Z)V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_2

    .line 37
    :cond_1
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 305
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->c:Lcom/whatsapp/messaging/n;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/n;->quit()Z

    .line 75
    invoke-virtual {p0}, Lcom/whatsapp/messaging/m;->quit()Z

    .line 249
    :cond_2
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->f()V

    .line 20
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->k:Lcom/whatsapp/messaging/c;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/c;->a()V

    .line 184
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->l:Lcom/whatsapp/messaging/a;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/a;->a()V

    .line 212
    return-void
.end method

.method private c()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 3
    sget v0, Lcom/whatsapp/messaging/m;->y:I

    sget-object v1, Lcom/whatsapp/messaging/m;->a:[I

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 79
    const/4 v0, 0x0

    sput v0, Lcom/whatsapp/messaging/m;->y:I

    .line 99
    :cond_0
    sget-object v0, Lcom/whatsapp/messaging/m;->a:[I

    sget v1, Lcom/whatsapp/messaging/m;->y:I

    aget v0, v0, v1

    return v0
.end method

.method private c(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 221
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->e()V

    .line 250
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {}, Lcom/whatsapp/messaging/s;->i()Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 113
    return-void
.end method

.method static c(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 122
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->j()V

    return-void
.end method

.method static c(Lcom/whatsapp/messaging/m;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->c(Landroid/os/Message;)V

    return-void
.end method

.method private c(Z)V
    .locals 0
    .parameter

    .prologue
    .line 164
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->a(Z)V

    .line 193
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 17
    sget v0, Lcom/whatsapp/messaging/m;->y:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/messaging/m;->y:I

    .line 150
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 0
    .parameter

    .prologue
    .line 216
    invoke-virtual {p0}, Lcom/whatsapp/messaging/m;->g()V

    .line 302
    return-void
.end method

.method static d(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 197
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->f()V

    return-void
.end method

.method static d(Lcom/whatsapp/messaging/m;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/m;->d(Landroid/os/Message;)V

    return-void
.end method

.method private e()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 316
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 95
    const/16 v0, 0xd

    const/16 v2, 0x20

    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->add(II)V

    .line 269
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    aget-object v3, v3, v5

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v5, v2, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 313
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v3, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    aget-object v3, v3, v6

    invoke-virtual {v0, v3}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 53
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-virtual {v0, v5, v3, v4, v2}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 38
    iput-boolean v6, p0, Lcom/whatsapp/messaging/m;->m:Z

    .line 224
    return-void
.end method

.method static e(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->m()V

    return-void
.end method

.method private f()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 88
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x2000

    invoke-static {v0, v4, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 74
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 98
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 52
    :cond_0
    iput-boolean v4, p0, Lcom/whatsapp/messaging/m;->m:Z

    .line 101
    return-void
.end method

.method static f(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 137
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->n()V

    return-void
.end method

.method static g(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 138
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->l()V

    return-void
.end method

.method static h(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 268
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->k()V

    return-void
.end method

.method static i(Lcom/whatsapp/messaging/m;)Ljava/util/HashSet;
    .locals 1
    .parameter

    .prologue
    .line 195
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->C:Ljava/util/HashSet;

    return-object v0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 271
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->b()V

    .line 204
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/messaging/m;->b(Z)V

    .line 168
    return-void
.end method

.method private j()V
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->b()V

    .line 97
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whatsapp/messaging/m;->b(Z)V

    .line 15
    return-void
.end method

.method private k()V
    .locals 0

    .prologue
    .line 299
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->b()V

    .line 151
    return-void
.end method

.method private l()V
    .locals 1

    .prologue
    .line 220
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/messaging/m;->p:Z

    .line 144
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/messaging/m;->a(Z)V

    .line 231
    return-void
.end method

.method private m()V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {}, Lcom/whatsapp/messaging/s;->j()Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 73
    return-void
.end method

.method private n()V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->f:Landroid/os/Messenger;

    invoke-static {}, Lcom/whatsapp/messaging/s;->k()Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 145
    return-void
.end method


# virtual methods
.method a([B)V
    .locals 4
    .parameter

    .prologue
    .line 129
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 68
    :goto_0
    iget-object v1, p0, Lcom/whatsapp/messaging/m;->x:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1
    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 196
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 286
    :cond_0
    return-void

    .line 129
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-static {p1}, Lwb;->a([B)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method a()[B
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 294
    iget-object v1, p0, Lcom/whatsapp/messaging/m;->x:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 279
    iget-object v1, p0, Lcom/whatsapp/messaging/m;->x:Landroid/content/SharedPreferences;

    sget-object v2, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v3, 0x16

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 81
    if-nez v1, :cond_0

    .line 112
    :goto_0
    return-object v0

    .line 66
    :cond_0
    invoke-static {v1}, Lwb;->a(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_0
.end method

.method public g()V
    .locals 2

    .prologue
    .line 64
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 226
    iget-boolean v0, p0, Lcom/whatsapp/messaging/m;->m:Z

    if-eqz v0, :cond_0

    .line 289
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whatsapp/messaging/m;->c(Z)V

    sget v0, Lcom/whatsapp/messaging/MessageService;->C:I

    if-eqz v0, :cond_1

    .line 254
    :cond_0
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x22

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 169
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/messaging/m;->m:Z

    .line 162
    return-void
.end method

.method h()V
    .locals 2

    .prologue
    .line 255
    sget-object v0, Lcom/whatsapp/messaging/m;->D:[Ljava/lang/String;

    const/16 v1, 0x1e

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 209
    invoke-direct {p0}, Lcom/whatsapp/messaging/m;->b()V

    .line 109
    return-void
.end method

.method protected onLooperPrepared()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 107
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/whatsapp/messaging/d;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/d;-><init>(Lcom/whatsapp/messaging/m;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->e:Landroid/os/Messenger;

    .line 39
    new-instance v0, Lcom/whatsapp/messaging/b;

    invoke-direct {v0, p0, v2}, Lcom/whatsapp/messaging/b;-><init>(Lcom/whatsapp/messaging/m;Lcom/whatsapp/messaging/u;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->i:Lcom/whatsapp/messaging/b;

    .line 67
    new-instance v0, Lcom/whatsapp/messaging/c;

    invoke-direct {v0, p0, v2}, Lcom/whatsapp/messaging/c;-><init>(Lcom/whatsapp/messaging/m;Lcom/whatsapp/messaging/u;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->k:Lcom/whatsapp/messaging/c;

    .line 154
    new-instance v0, Lcom/whatsapp/messaging/a;

    invoke-direct {v0, p0, v2}, Lcom/whatsapp/messaging/a;-><init>(Lcom/whatsapp/messaging/m;Lcom/whatsapp/messaging/u;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->l:Lcom/whatsapp/messaging/a;

    .line 158
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/whatsapp/messaging/f;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/f;-><init>(Lcom/whatsapp/messaging/m;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->g:Landroid/os/Messenger;

    .line 189
    new-instance v0, Lcom/whatsapp/messaging/n;

    iget-object v1, p0, Lcom/whatsapp/messaging/m;->g:Landroid/os/Messenger;

    invoke-direct {v0, v1}, Lcom/whatsapp/messaging/n;-><init>(Landroid/os/Messenger;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/m;->c:Lcom/whatsapp/messaging/n;

    .line 19
    iget-object v0, p0, Lcom/whatsapp/messaging/m;->c:Lcom/whatsapp/messaging/n;

    invoke-virtual {v0}, Lcom/whatsapp/messaging/n;->start()V

    .line 288
    return-void
.end method
