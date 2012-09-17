.class public Lcom/whatsapp/accountsync/PerformSyncManager;
.super Landroid/content/BroadcastReceiver;
.source "PerformSyncManager.java"


# static fields
.field static a:I

.field public static b:Z

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x60

    const/16 v1, 0x4b

    const/16 v3, 0x1a

    const/16 v4, 0x18

    const/4 v6, 0x0

    const/16 v0, 0x1e

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0007*\u0014{)"

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

    const-string v0, "\u0007*\u0014{+"

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

    const-string v0, "\u0015%\u00044y\r/\u0012uq\u0007e\u0003oj\u0010$\u00124q\u0017.\r5n\r/Nyw\u000ee\u0017ry\u00178\u0001jhM;\u0012u~\n\'\u0005"

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

    const-string v0, "\u0002(\u0003um\r??ia\r(O{|\u0007\u0014\u0003uv\u0017*\u0003n\"C"

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

    const-string v0, "\u0002(\u0003um\r??ty\u000e."

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

    const-string v0, "\u0000$\r4y\r/\u0012uq\u0007e\u0003uv\u0017*\u0003nk"

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

    const-string v0, "\u0011*\u0017E{\u000c%\u0014{{\u0017\u0014\t~"

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

    const-string v0, "\u0002(\u0003um\r??ia\r(O{|\u0007\"\u000e}G\u0000$\u000eny\u0000?Z:"

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

    const-string v0, "\u0015%\u00044y\r/\u0012uq\u0007e\u0003oj\u0010$\u00124q\u0017.\r5v\u0002&\u0005"

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

    const-string v0, "C7@"

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

    const-string v0, "\u0002(\u0003um\r??na\u0013."

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

    const-string v0, "\u000e\"\r\u007fl\u001a;\u0005"

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

    const-string v0, "\u0007*\u0014{*"

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

    const-string v0, "\u00102\u000ey)"

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

    const-string v0, "\u00179\u0015\u007f"

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

    const-string v0, "<\"\u0004:%\\k"

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

    const-string v0, "\u0000*\u000cv}\u0011\u0014\tiG\u00102\u000eyy\u0007*\u0010n}\u0011"

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

    const-string v0, "\u0000$\r4o\u000b*\u0014iy\u0013;"

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

    const-string v0, "<\"\u0004"

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

    const-string v0, "C7@nq\u000e.@ih\u0006%\u0014 "

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

    const-string v0, "\u0002(\u0003um\r??ia\r(Oj}\u0011-\u000fhu02\u000ey"

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

    const-string v0, "\u0002(\u0003um\r??ia\r(Oj}\u0011-\u000fhu\u00102\u000ey\"C?\u0019j}^"

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

    const-string v0, "0.\u0012l}\u0011\u000b\u00134o\u000b*\u0014iy\u0013;Nt}\u0017"

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

    const-string v0, "\u0002(\u0003um\r??ia\r(O{|\u0007\u0014\u0003uv\u0017*\u0003n7\u0001*\u0014yp<8\t`}Y"

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

    const-string v0, "\u00172\u0010\u007f"

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

    aput-object v0, v9, v4

    const/16 v10, 0x19

    const-string v0, "\u0002(\u0003um\r??ia\r(O{|\u0007\"\u000e}G\u0000$\u000eny\u0000?Osv\u0007.\u0018 "

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

    const-string v0, "\u0011*\u0017E{\u000c%\u0014{{\u0017\u0014\t~)"

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

    aput-object v0, v9, v3

    const/16 v10, 0x1b

    const-string v0, "\u0002(\u0003um\r??ia\r(O{|\u0007\"\u000e}G\u0000$\u000eny\u0000?O"

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

    const-string v0, "\u0011*\u0017E{\u000c%\u0014{{\u0017\u0014\t~*"

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

    const/16 v8, 0x1d

    const-string v0, "\u0002(\u0003um\r??ia\r(Oyp\u0006(\u000b{v\u00078\u0019t{L*\u0004~8\u0002(\u0003um\r?@{m\u0017$@Ia\r("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1d
    if-gt v6, v7, :cond_1d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    .line 38
    const/16 v0, 0x1f4

    sput v0, Lcom/whatsapp/accountsync/PerformSyncManager;->a:I

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x63

    goto :goto_1e

    :pswitch_1
    move v0, v1

    goto :goto_1e

    :pswitch_2
    move v0, v2

    goto :goto_1e

    :pswitch_3
    move v0, v3

    goto :goto_1e

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x63

    goto :goto_1f

    :pswitch_5
    move v0, v1

    goto :goto_1f

    :pswitch_6
    move v0, v2

    goto :goto_1f

    :pswitch_7
    move v0, v3

    goto :goto_1f

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x63

    goto :goto_20

    :pswitch_9
    move v0, v1

    goto :goto_20

    :pswitch_a
    move v0, v2

    goto :goto_20

    :pswitch_b
    move v0, v3

    goto :goto_20

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_21
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x63

    goto :goto_21

    :pswitch_d
    move v0, v1

    goto :goto_21

    :pswitch_e
    move v0, v2

    goto :goto_21

    :pswitch_f
    move v0, v3

    goto :goto_21

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_22
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x63

    goto :goto_22

    :pswitch_11
    move v0, v1

    goto :goto_22

    :pswitch_12
    move v0, v2

    goto :goto_22

    :pswitch_13
    move v0, v3

    goto :goto_22

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_23
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x63

    goto :goto_23

    :pswitch_15
    move v0, v1

    goto :goto_23

    :pswitch_16
    move v0, v2

    goto :goto_23

    :pswitch_17
    move v0, v3

    goto :goto_23

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_24
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x63

    goto :goto_24

    :pswitch_19
    move v0, v1

    goto :goto_24

    :pswitch_1a
    move v0, v2

    goto :goto_24

    :pswitch_1b
    move v0, v3

    goto :goto_24

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_25
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x63

    goto :goto_25

    :pswitch_1d
    move v0, v1

    goto :goto_25

    :pswitch_1e
    move v0, v2

    goto :goto_25

    :pswitch_1f
    move v0, v3

    goto :goto_25

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x63

    goto :goto_26

    :pswitch_21
    move v0, v1

    goto :goto_26

    :pswitch_22
    move v0, v2

    goto :goto_26

    :pswitch_23
    move v0, v3

    goto :goto_26

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x63

    goto :goto_27

    :pswitch_25
    move v0, v1

    goto :goto_27

    :pswitch_26
    move v0, v2

    goto :goto_27

    :pswitch_27
    move v0, v3

    goto :goto_27

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    const/16 v0, 0x63

    goto :goto_28

    :pswitch_29
    move v0, v1

    goto :goto_28

    :pswitch_2a
    move v0, v2

    goto :goto_28

    :pswitch_2b
    move v0, v3

    goto :goto_28

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    const/16 v0, 0x63

    goto :goto_29

    :pswitch_2d
    move v0, v1

    goto :goto_29

    :pswitch_2e
    move v0, v2

    goto :goto_29

    :pswitch_2f
    move v0, v3

    goto :goto_29

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    const/16 v0, 0x63

    goto :goto_2a

    :pswitch_31
    move v0, v1

    goto :goto_2a

    :pswitch_32
    move v0, v2

    goto :goto_2a

    :pswitch_33
    move v0, v3

    goto :goto_2a

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    const/16 v0, 0x63

    goto :goto_2b

    :pswitch_35
    move v0, v1

    goto :goto_2b

    :pswitch_36
    move v0, v2

    goto :goto_2b

    :pswitch_37
    move v0, v3

    goto :goto_2b

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_2c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    const/16 v0, 0x63

    goto :goto_2c

    :pswitch_39
    move v0, v1

    goto :goto_2c

    :pswitch_3a
    move v0, v2

    goto :goto_2c

    :pswitch_3b
    move v0, v3

    goto :goto_2c

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    const/16 v0, 0x63

    goto :goto_2d

    :pswitch_3d
    move v0, v1

    goto :goto_2d

    :pswitch_3e
    move v0, v2

    goto :goto_2d

    :pswitch_3f
    move v0, v3

    goto :goto_2d

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    const/16 v0, 0x63

    goto :goto_2e

    :pswitch_41
    move v0, v1

    goto :goto_2e

    :pswitch_42
    move v0, v2

    goto :goto_2e

    :pswitch_43
    move v0, v3

    goto :goto_2e

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    const/16 v0, 0x63

    goto :goto_2f

    :pswitch_45
    move v0, v1

    goto :goto_2f

    :pswitch_46
    move v0, v2

    goto :goto_2f

    :pswitch_47
    move v0, v3

    goto :goto_2f

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    const/16 v0, 0x63

    goto :goto_30

    :pswitch_49
    move v0, v1

    goto :goto_30

    :pswitch_4a
    move v0, v2

    goto :goto_30

    :pswitch_4b
    move v0, v3

    goto :goto_30

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_31
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    const/16 v0, 0x63

    goto :goto_31

    :pswitch_4d
    move v0, v1

    goto :goto_31

    :pswitch_4e
    move v0, v2

    goto :goto_31

    :pswitch_4f
    move v0, v3

    goto :goto_31

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    const/16 v0, 0x63

    goto :goto_32

    :pswitch_51
    move v0, v1

    goto :goto_32

    :pswitch_52
    move v0, v2

    goto :goto_32

    :pswitch_53
    move v0, v3

    goto :goto_32

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    const/16 v0, 0x63

    goto :goto_33

    :pswitch_55
    move v0, v1

    goto :goto_33

    :pswitch_56
    move v0, v2

    goto :goto_33

    :pswitch_57
    move v0, v3

    goto :goto_33

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    const/16 v0, 0x63

    goto :goto_34

    :pswitch_59
    move v0, v1

    goto :goto_34

    :pswitch_5a
    move v0, v2

    goto :goto_34

    :pswitch_5b
    move v0, v3

    goto :goto_34

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    const/16 v0, 0x63

    goto :goto_35

    :pswitch_5d
    move v0, v1

    goto :goto_35

    :pswitch_5e
    move v0, v2

    goto :goto_35

    :pswitch_5f
    move v0, v3

    goto :goto_35

    :cond_18
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_36
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    const/16 v0, 0x63

    goto :goto_36

    :pswitch_61
    move v0, v1

    goto :goto_36

    :pswitch_62
    move v0, v2

    goto :goto_36

    :pswitch_63
    move v0, v3

    goto :goto_36

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    const/16 v0, 0x63

    goto :goto_37

    :pswitch_65
    move v0, v1

    goto :goto_37

    :pswitch_66
    move v0, v2

    goto :goto_37

    :pswitch_67
    move v0, v3

    goto :goto_37

    :cond_1a
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_38
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    const/16 v0, 0x63

    goto :goto_38

    :pswitch_69
    move v0, v1

    goto :goto_38

    :pswitch_6a
    move v0, v2

    goto :goto_38

    :pswitch_6b
    move v0, v3

    goto :goto_38

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    const/16 v0, 0x63

    goto :goto_39

    :pswitch_6d
    move v0, v1

    goto :goto_39

    :pswitch_6e
    move v0, v2

    goto :goto_39

    :pswitch_6f
    move v0, v3

    goto :goto_39

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    const/16 v0, 0x63

    goto :goto_3a

    :pswitch_71
    move v0, v1

    goto :goto_3a

    :pswitch_72
    move v0, v2

    goto :goto_3a

    :pswitch_73
    move v0, v3

    goto :goto_3a

    :cond_1d
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1d

    :pswitch_74
    const/16 v0, 0x63

    goto :goto_3b

    :pswitch_75
    move v0, v1

    goto :goto_3b

    :pswitch_76
    move v0, v2

    goto :goto_3b

    :pswitch_77
    move v0, v3

    goto :goto_3b

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
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 118
    return-void
.end method

.method private static a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 4
    .parameter

    .prologue
    .line 164
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized a()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 78
    const-class v2, Lcom/whatsapp/accountsync/PerformSyncManager;

    monitor-enter v2

    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 11
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    .line 100
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f09000a

    invoke-virtual {v3, v4}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v3

    .line 128
    array-length v4, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v4, :cond_2

    .line 107
    const/4 v0, 0x0

    :try_start_1
    aget-object v1, v3, v0

    .line 2
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-static {v0}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Landroid/accounts/Account;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/accounts/OperationCanceledException; {:try_start_1 .. :try_end_1} :catch_0

    .line 64
    :cond_0
    :goto_0
    :try_start_2
    sget-object v0, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v0, v0, v3

    invoke-static {v1, v0}, Landroid/content/ContentResolver;->getSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 192
    sget-object v0, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v0, v0, v3

    const/4 v3, 0x1

    invoke-static {v1, v0, v3}, Landroid/content/ContentResolver;->setSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;Z)V

    .line 98
    :cond_1
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/tp;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 5
    monitor-exit v2

    return-void

    .line 84
    :catch_0
    move-exception v0

    .line 196
    :try_start_3
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    .line 39
    :cond_2
    :try_start_4
    new-instance v1, Landroid/accounts/Account;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v5, 0x7f09000a

    invoke-virtual {v4, v5}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v4}, Landroid/accounts/AccountManager;->addAccountExplicitly(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    sget-object v0, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0x1d

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 19
    sget-object v0, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v0, v0, v3

    const/4 v3, 0x1

    invoke-static {v1, v0, v3}, Landroid/content/ContentResolver;->setIsSyncable(Landroid/accounts/Account;Ljava/lang/String;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 74
    :try_start_5
    invoke-static {v1}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Landroid/accounts/Account;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
    .catch Landroid/accounts/OperationCanceledException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_0

    .line 28
    :catch_1
    move-exception v0

    .line 191
    :try_start_6
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0
.end method

.method public static declared-synchronized a(Landroid/accounts/Account;)V
    .locals 23
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/accounts/OperationCanceledException;
        }
    .end annotation

    .prologue
    const-class v9, Lcom/whatsapp/accountsync/PerformSyncManager;

    monitor-enter v9

    :try_start_0
    sget-boolean v10, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z

    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 57
    const/4 v3, 0x1

    invoke-static {v3}, Lcom/whatsapp/App;->d(Z)V

    .line 163
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 162
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v3}, Lcom/whatsapp/qp;->d()Ljava/util/ArrayList;

    move-result-object v14

    .line 36
    if-eqz v14, :cond_0

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_1

    .line 130
    :cond_0
    const/4 v3, 0x0

    invoke-static {v3}, Lcom/whatsapp/App;->d(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    :goto_0
    monitor-exit v9

    return-void

    .line 17
    :cond_1
    :try_start_1
    sget v3, Lcom/whatsapp/App;->f:I

    const/4 v4, 0x1

    if-lt v3, v4, :cond_2

    .line 167
    if-eqz v10, :cond_3

    .line 179
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v5, 0x15

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 146
    :cond_3
    sget-object v3, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v4, v4, v5

    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v5, 0xa

    aget-object v4, v4, v5

    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v4

    .line 142
    sget-object v3, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v5, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v6, 0x4

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v3, v5, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v5, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v6, 0xa

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v3, v5, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v5, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v6, 0x10

    aget-object v5, v5, v6

    sget-object v6, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v7, 0xe

    aget-object v6, v6, v7

    invoke-virtual {v3, v5, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v15

    .line 150
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 87
    sget-object v3, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    sget-object v7, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v8, 0x12

    aget-object v7, v7, v8

    aput-object v7, v5, v6

    const/4 v6, 0x1

    sget-object v7, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v8, 0xd

    aget-object v7, v7, v8

    aput-object v7, v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 32
    if-eqz v4, :cond_7

    .line 71
    :cond_4
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 29
    const/4 v3, 0x0

    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    .line 99
    const/4 v3, 0x1

    invoke-interface {v4, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 59
    new-instance v8, Lcom/whatsapp/accountsync/e;

    invoke-direct {v8, v5, v6, v7}, Lcom/whatsapp/accountsync/e;-><init>(JLjava/lang/String;)V

    .line 182
    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 75
    if-nez v3, :cond_5

    .line 147
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 166
    move-object/from16 v0, v16

    invoke-virtual {v0, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_5
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    if-eqz v10, :cond_4

    .line 89
    :cond_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 61
    :cond_7
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 46
    const/4 v4, 0x1

    if-le v7, v4, :cond_9

    .line 104
    const/4 v4, 0x0

    move v5, v4

    :goto_1
    add-int/lit8 v4, v7, -0x1

    if-ge v5, v4, :cond_9

    .line 161
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whatsapp/accountsync/e;

    .line 20
    sget-object v8, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v17, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v18, 0xf

    aget-object v17, v17, v18

    const/16 v18, 0x1

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    iget-wide v0, v4, Lcom/whatsapp/accountsync/e;->a:J

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v18, v19

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v8, v15, v0, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 48
    add-int/lit8 v4, v5, 0x1

    if-eqz v10, :cond_12

    .line 188
    :cond_9
    if-eqz v10, :cond_8

    .line 141
    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 12
    new-instance v6, Lcom/whatsapp/uq;

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    invoke-direct {v6, v3, v4, v7}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :try_start_2
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whatsapp/zq;

    .line 119
    iget-object v4, v3, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v4, :cond_c

    .line 134
    if-eqz v10, :cond_b

    .line 132
    :cond_c
    iget-boolean v4, v3, Lcom/whatsapp/zq;->k:Z

    if-eqz v4, :cond_10

    invoke-virtual {v3}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-nez v4, :cond_10

    .line 83
    iget-object v4, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v8, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v17, 0x16

    aget-object v8, v8, v17

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    .line 13
    iget-object v4, v3, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {v4, v6}, Lcom/whatsapp/uq;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 174
    iget-object v4, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 31
    if-eqz v4, :cond_e

    .line 122
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whatsapp/accountsync/e;

    .line 72
    sget-object v17, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v18, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v19, 0xf

    aget-object v18, v18, v19

    const/16 v19, 0x1

    move/from16 v0, v19

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v19, v0

    const/16 v20, 0x0

    iget-wide v0, v4, Lcom/whatsapp/accountsync/e;->a:J

    move-wide/from16 v21, v0

    invoke-static/range {v21 .. v22}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v19, v20

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v15, v1, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    if-eqz v10, :cond_d

    .line 55
    :cond_e
    if-eqz v10, :cond_10

    .line 90
    :cond_f
    iget-object v4, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    .line 3
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    if-eqz v10, :cond_b

    .line 30
    :cond_11
    move-object/from16 v0, p0

    invoke-static {v0, v5}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Landroid/accounts/Account;Ljava/util/ArrayList;)V

    .line 144
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v6, 0x17

    aget-object v4, v4, v6

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v6, 0x13

    aget-object v4, v4, v6

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v11

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 49
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    .line 10
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 60
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 27
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 22
    :goto_2
    const/4 v3, 0x0

    invoke-static {v3}, Lcom/whatsapp/App;->d(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line -1
    :catchall_0
    move-exception v3

    monitor-exit v9

    throw v3

    .line 125
    :catch_0
    move-exception v3

    .line 190
    :try_start_4
    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v6, 0x14

    aget-object v4, v4, v6

    invoke-static {v4, v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 186
    :try_start_5
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    .line 157
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 67
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 101
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    .line 115
    :catchall_1
    move-exception v3

    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    .line 170
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 24
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 52
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_12
    move v5, v4

    goto/16 :goto_1
.end method

.method private static a(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v8, 0xb

    const/16 v7, 0x9

    const/4 v6, 0x6

    const/4 v5, 0x0

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v1, v1, v7

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 110
    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    .line 138
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    iget-object v3, p0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 154
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    iget-object v3, p0, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 40
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 53
    invoke-virtual {v1}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    .line 135
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {v1, v2, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 50
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v8

    sget-object v3, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v4, 0x8

    aget-object v3, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 97
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 143
    invoke-virtual {v1}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    .line 77
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {v1, v2, v5}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 15
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v8

    sget-object v3, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 16
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 148
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f090244

    invoke-virtual {v3, v4}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 133
    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "+"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "@"

    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 73
    invoke-virtual {v1}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    :try_start_0
    sget-object v1, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    :goto_0
    return-void

    .line 140
    :catch_0
    move-exception v0

    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    aget-object v2, v2, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a(Landroid/accounts/Account;Ljava/util/ArrayList;)V
    .locals 15
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    sget-boolean v3, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z

    .line 37
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 7
    const/4 v0, 0x0

    .line 21
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 149
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    sget v8, Lcom/whatsapp/accountsync/PerformSyncManager;->a:I

    if-lt v2, v8, :cond_2

    .line 88
    :try_start_0
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v8, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v9, 0x5

    aget-object v8, v8, v9

    invoke-virtual {v2, v8, v4}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    .line 124
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 165
    if-lez v1, :cond_1

    .line 80
    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    invoke-virtual {v5, v2, v8}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :cond_2
    :goto_1
    iget-object v2, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const-string v8, "@"

    invoke-virtual {v2, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_3

    .line 171
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    if-eqz v3, :cond_0

    .line 159
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 136
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0x9

    aget-object v9, v9, v10

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    sget-object v8, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v8}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v8

    .line 92
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v10, 0x4

    aget-object v9, v9, v10

    iget-object v10, p0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 66
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0xa

    aget-object v9, v9, v10

    iget-object v10, p0, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 123
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0xd

    aget-object v9, v9, v10

    iget-object v10, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 68
    invoke-virtual {v8}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    sget-object v8, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v8}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v8

    .line 193
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v10, 0x6

    aget-object v9, v9, v10

    invoke-virtual {v8, v9, v2}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 175
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0xb

    aget-object v9, v9, v10

    sget-object v10, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v11, 0x8

    aget-object v10, v10, v11

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 86
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v10, 0x0

    aget-object v9, v9, v10

    iget-object v10, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 126
    invoke-virtual {v8}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object v8, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v8}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v8

    invoke-static {v8}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v8

    .line 111
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v10, 0x6

    aget-object v9, v9, v10

    invoke-virtual {v8, v9, v2}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 168
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0xb

    aget-object v9, v9, v10

    sget-object v10, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v11, 0x2

    aget-object v10, v10, v11

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 195
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v10, 0x0

    aget-object v9, v9, v10

    iget-object v10, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 153
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0xc

    aget-object v9, v9, v10

    sget-object v10, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v11, 0x7f090244

    invoke-virtual {v10, v11}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 114
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v10, 0x1

    aget-object v9, v9, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "+"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v12, 0x0

    iget-object v13, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const-string v14, "@"

    invoke-virtual {v13, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v11, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 194
    invoke-virtual {v8}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0xe

    if-lt v8, v9, :cond_4

    .line 131
    sget-object v8, Landroid/provider/ContactsContract$AggregationExceptions;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v8}, Landroid/content/ContentProviderOperation;->newUpdate(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v8

    .line 169
    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0x1a

    aget-object v9, v9, v10

    invoke-virtual {v0}, Lcom/whatsapp/zq;->a()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v9, v0}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 1
    sget-object v0, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v9, 0x1c

    aget-object v0, v0, v9

    invoke-virtual {v8, v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 137
    sget-object v0, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v0, v0, v2

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v8, v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 54
    invoke-virtual {v8}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_4
    add-int/lit8 v0, v1, 0x1

    .line 91
    if-eqz v3, :cond_7

    .line 76
    :cond_5
    :try_start_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 62
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    .line 45
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 79
    :cond_6
    const/4 v0, 0x0

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 116
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0, v6}, Lcom/whatsapp/qp;->a(Ljava/util/ArrayList;)V

    .line 102
    :goto_2
    return-void

    .line 26
    :catch_0
    move-exception v2

    .line 156
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v10, 0x19

    aget-object v9, v9, v10

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 105
    :catch_1
    move-exception v0

    .line 44
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0, v6}, Lcom/whatsapp/qp;->a(Ljava/util/ArrayList;)V

    goto :goto_2

    .line 56
    :catchall_0
    move-exception v0

    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v1, v6}, Lcom/whatsapp/qp;->a(Ljava/util/ArrayList;)V

    throw v0

    :cond_7
    move v1, v0

    goto/16 :goto_0
.end method

.method public static declared-synchronized a(Lcom/whatsapp/zq;)V
    .locals 10
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    const-class v3, Lcom/whatsapp/accountsync/PerformSyncManager;

    monitor-enter v3

    :try_start_0
    sget-boolean v4, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z

    .line 187
    const/4 v2, 0x1

    invoke-static {v2}, Lcom/whatsapp/App;->d(Z)V

    .line 65
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v5

    .line 181
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v6, 0x7f09000a

    invoke-virtual {v2, v6}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v6

    .line 155
    array-length v2, v6

    if-gtz v2, :cond_0

    .line 58
    new-instance v2, Landroid/accounts/Account;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v9, 0x7f09000a

    invoke-virtual {v8, v9}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v7, v8}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {v5, v2, v7, v8}, Landroid/accounts/AccountManager;->addAccountExplicitly(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Z

    if-eqz v4, :cond_1

    .line 25
    :cond_0
    const/4 v2, 0x0

    aget-object v2, v6, v2

    .line 70
    :cond_1
    iget-object v5, p0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    iget-object v6, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v2, v5, v6}, Lcom/whatsapp/accountsync/PerformSyncManager;->a(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const/4 v2, 0x0

    invoke-static {v2}, Lcom/whatsapp/App;->d(Z)V

    .line 160
    sget v2, Lcom/whatsapp/App;->wc:I

    if-eqz v2, :cond_2

    if-eqz v4, :cond_3

    :goto_0
    sput-boolean v0, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v3

    return-void

    :cond_3
    move v0, v1

    goto :goto_0

    .line -1
    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0
.end method

.method public static declared-synchronized b()V
    .locals 10

    .prologue
    const-class v6, Lcom/whatsapp/accountsync/PerformSyncManager;

    monitor-enter v6

    :try_start_0
    sget-boolean v7, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z

    .line 177
    sget-object v0, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 109
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v4, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v5, 0x12

    aget-object v4, v4, v5

    aput-object v4, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 129
    if-eqz v0, :cond_2

    .line 51
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 34
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v3, Lcom/whatsapp/accountsync/PerformSyncManager;->z:[Ljava/lang/String;

    const/16 v4, 0xf

    aget-object v3, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v4, v5

    invoke-virtual {v2, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 94
    if-eqz v7, :cond_0

    .line 180
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_2
    monitor-exit v6

    return-void

    .line -1
    :catchall_0
    move-exception v0

    monitor-exit v6

    throw v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 41
    invoke-static {}, Lcom/whatsapp/tp;->c()V

    .line 152
    return-void
.end method
