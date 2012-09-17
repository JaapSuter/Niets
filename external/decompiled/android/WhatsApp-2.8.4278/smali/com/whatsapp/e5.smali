.class public final Lcom/whatsapp/e5;
.super Ljava/lang/Object;
.source "e5.java"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static m:I

.field private static final z:[Ljava/lang/String;


# instance fields
.field private final a:Ljava/io/Reader;

.field private b:Z

.field private final c:[C

.field private d:I

.field private e:I

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zf;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/whatsapp/ag;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x35

    const/16 v4, 0x32

    const/16 v3, 0x22

    const/16 v2, 0x20

    const/4 v6, 0x0

    const/16 v0, 0x1b

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001cTLQW"

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

    const-string v0, "\u000eGUG"

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

    const-string v0, "\u0014@LN"

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

    const-string v0, "ZWUV\u0012\rTS\u0002"

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

    const-string v0, "?MPGQ\u000ePD\u0002"

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

    const-string v0, "?MPGQ\u000ePD\u0002SZFTP[\u0014R\u0000@G\u000e\u0015WCAZ"

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

    const-string v0, "Z[EC@Z"

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

    const-string v0, "0FOL`\u001fTDG@Z\\S\u0002Q\u0016ZSGV"

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

    const-string v0, "?MPGQ\u000ePD\u0002x)zn\u0002V\u0015VUOW\u0014A\u0000V]ZFTC@\u000e\u0015WKF\u0012\u0015\u0007y\u0015ZZR\u0002\u0015\u0001\u0012\u0000@G\u000e\u0015WCAZ"

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

    const-string v0, "pWUD\u000f"

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

    const-string v0, "?MPGQ\u000ePD\u0002SZWOM^\u001fTN\u0002P\u000fA\u0000US\t\u0015"

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

    const-string v0, "\u0013[\u0000\u001f\u000fZ[UN^"

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

    const-string v0, "/[TG@\u0017\\NCF\u001fQ\u0000GA\u0019TPG\u0012\tPQWW\u0014VE"

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

    const-string v0, "?MPGQ\u000ePD\u0002\\\u001bXE"

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

    const-string v0, "/[TG@\u0017\\NCF\u001fQ\u0000MP\u0010PCV"

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

    const-string v0, "\u0010FOL@\u001fTDG@UVLMA\u001f\u001aEP@\u0015G\u0000"

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

    const-string v0, "/FE\u0002x\tZNpW\u001bQEP\u001c\tPTnW\u0014\\ELFRARWWS\u0015TM\u0012\u001bVCGB\u000e\u0015MC^\u001cZROW\u001e\u0015jq}4"

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

    const-string v0, "/[TG@\u0017\\NCF\u001fQ\u0000QF\u0008\\NE"

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

    const-string v0, "\t^IRB\u001fQ\u0001"

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

    const-string v0, "?MPGQ\u000ePD\u0002SZ[AOWZWUV\u0012\rTS\u0002"

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

    const-string v0, "/[TG@\u0017\\NCF\u001fQ\u0000C@\u0008TY"

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

    const-string v0, "?MPGQ\u000ePD\u0002\u0015@\u0012"

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

    const-string v0, "?MPGQ\u000ePD\u0002^\u0013AEPS\u0016\u0015VC^\u000fP"

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

    const-string v0, "?MPGQ\u000ePD\u0002S\u0014\u0015ILFZWUV\u0012\rTS\u0002"

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

    const-string v0, "?[D\u0002]\u001c\u0015ILB\u000fA"

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

    const-string v0, "/[TG@\u0017\\NCF\u001fQ\u0000A]\u0017XELF"

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

    const/16 v8, 0x1a

    const-string v0, "P\u001a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1a
    if-gt v6, v7, :cond_1a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x7a

    goto :goto_1b

    :pswitch_1
    move v0, v1

    goto :goto_1b

    :pswitch_2
    move v0, v2

    goto :goto_1b

    :pswitch_3
    move v0, v3

    goto :goto_1b

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x7a

    goto :goto_1c

    :pswitch_5
    move v0, v1

    goto :goto_1c

    :pswitch_6
    move v0, v2

    goto :goto_1c

    :pswitch_7
    move v0, v3

    goto :goto_1c

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x7a

    goto :goto_1d

    :pswitch_9
    move v0, v1

    goto :goto_1d

    :pswitch_a
    move v0, v2

    goto :goto_1d

    :pswitch_b
    move v0, v3

    goto :goto_1d

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x7a

    goto :goto_1e

    :pswitch_d
    move v0, v1

    goto :goto_1e

    :pswitch_e
    move v0, v2

    goto :goto_1e

    :pswitch_f
    move v0, v3

    goto :goto_1e

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x7a

    goto :goto_1f

    :pswitch_11
    move v0, v1

    goto :goto_1f

    :pswitch_12
    move v0, v2

    goto :goto_1f

    :pswitch_13
    move v0, v3

    goto :goto_1f

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x7a

    goto :goto_20

    :pswitch_15
    move v0, v1

    goto :goto_20

    :pswitch_16
    move v0, v2

    goto :goto_20

    :pswitch_17
    move v0, v3

    goto :goto_20

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_21
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x7a

    goto :goto_21

    :pswitch_19
    move v0, v1

    goto :goto_21

    :pswitch_1a
    move v0, v2

    goto :goto_21

    :pswitch_1b
    move v0, v3

    goto :goto_21

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_22
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x7a

    goto :goto_22

    :pswitch_1d
    move v0, v1

    goto :goto_22

    :pswitch_1e
    move v0, v2

    goto :goto_22

    :pswitch_1f
    move v0, v3

    goto :goto_22

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_23
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x7a

    goto :goto_23

    :pswitch_21
    move v0, v1

    goto :goto_23

    :pswitch_22
    move v0, v2

    goto :goto_23

    :pswitch_23
    move v0, v3

    goto :goto_23

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_24
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x7a

    goto :goto_24

    :pswitch_25
    move v0, v1

    goto :goto_24

    :pswitch_26
    move v0, v2

    goto :goto_24

    :pswitch_27
    move v0, v3

    goto :goto_24

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_25
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    const/16 v0, 0x7a

    goto :goto_25

    :pswitch_29
    move v0, v1

    goto :goto_25

    :pswitch_2a
    move v0, v2

    goto :goto_25

    :pswitch_2b
    move v0, v3

    goto :goto_25

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    const/16 v0, 0x7a

    goto :goto_26

    :pswitch_2d
    move v0, v1

    goto :goto_26

    :pswitch_2e
    move v0, v2

    goto :goto_26

    :pswitch_2f
    move v0, v3

    goto :goto_26

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    const/16 v0, 0x7a

    goto :goto_27

    :pswitch_31
    move v0, v1

    goto :goto_27

    :pswitch_32
    move v0, v2

    goto :goto_27

    :pswitch_33
    move v0, v3

    goto :goto_27

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    const/16 v0, 0x7a

    goto :goto_28

    :pswitch_35
    move v0, v1

    goto :goto_28

    :pswitch_36
    move v0, v2

    goto :goto_28

    :pswitch_37
    move v0, v3

    goto :goto_28

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    const/16 v0, 0x7a

    goto :goto_29

    :pswitch_39
    move v0, v1

    goto :goto_29

    :pswitch_3a
    move v0, v2

    goto :goto_29

    :pswitch_3b
    move v0, v3

    goto :goto_29

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    const/16 v0, 0x7a

    goto :goto_2a

    :pswitch_3d
    move v0, v1

    goto :goto_2a

    :pswitch_3e
    move v0, v2

    goto :goto_2a

    :pswitch_3f
    move v0, v3

    goto :goto_2a

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    const/16 v0, 0x7a

    goto :goto_2b

    :pswitch_41
    move v0, v1

    goto :goto_2b

    :pswitch_42
    move v0, v2

    goto :goto_2b

    :pswitch_43
    move v0, v3

    goto :goto_2b

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_2c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    const/16 v0, 0x7a

    goto :goto_2c

    :pswitch_45
    move v0, v1

    goto :goto_2c

    :pswitch_46
    move v0, v2

    goto :goto_2c

    :pswitch_47
    move v0, v3

    goto :goto_2c

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_2d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    const/16 v0, 0x7a

    goto :goto_2d

    :pswitch_49
    move v0, v1

    goto :goto_2d

    :pswitch_4a
    move v0, v2

    goto :goto_2d

    :pswitch_4b
    move v0, v3

    goto :goto_2d

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_2e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    const/16 v0, 0x7a

    goto :goto_2e

    :pswitch_4d
    move v0, v1

    goto :goto_2e

    :pswitch_4e
    move v0, v2

    goto :goto_2e

    :pswitch_4f
    move v0, v3

    goto :goto_2e

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_2f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    const/16 v0, 0x7a

    goto :goto_2f

    :pswitch_51
    move v0, v1

    goto :goto_2f

    :pswitch_52
    move v0, v2

    goto :goto_2f

    :pswitch_53
    move v0, v3

    goto :goto_2f

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_30
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    const/16 v0, 0x7a

    goto :goto_30

    :pswitch_55
    move v0, v1

    goto :goto_30

    :pswitch_56
    move v0, v2

    goto :goto_30

    :pswitch_57
    move v0, v3

    goto :goto_30

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_31
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    const/16 v0, 0x7a

    goto :goto_31

    :pswitch_59
    move v0, v1

    goto :goto_31

    :pswitch_5a
    move v0, v2

    goto :goto_31

    :pswitch_5b
    move v0, v3

    goto :goto_31

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    const/16 v0, 0x7a

    goto :goto_32

    :pswitch_5d
    move v0, v1

    goto :goto_32

    :pswitch_5e
    move v0, v2

    goto :goto_32

    :pswitch_5f
    move v0, v3

    goto :goto_32

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    const/16 v0, 0x7a

    goto :goto_33

    :pswitch_61
    move v0, v1

    goto :goto_33

    :pswitch_62
    move v0, v2

    goto :goto_33

    :pswitch_63
    move v0, v3

    goto :goto_33

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    const/16 v0, 0x7a

    goto :goto_34

    :pswitch_65
    move v0, v1

    goto :goto_34

    :pswitch_66
    move v0, v2

    goto :goto_34

    :pswitch_67
    move v0, v3

    goto :goto_34

    :cond_1a
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_35
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1a

    :pswitch_68
    const/16 v0, 0x7a

    goto :goto_35

    :pswitch_69
    move v0, v1

    goto :goto_35

    :pswitch_6a
    move v0, v2

    goto :goto_35

    :pswitch_6b
    move v0, v3

    goto :goto_35

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
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    sget v0, Lcom/whatsapp/e5;->m:I

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-boolean v2, p0, Lcom/whatsapp/e5;->b:Z

    .line 61
    const/16 v1, 0x400

    new-array v1, v1, [C

    iput-object v1, p0, Lcom/whatsapp/e5;->c:[C

    .line 175
    iput v2, p0, Lcom/whatsapp/e5;->d:I

    .line 43
    iput v2, p0, Lcom/whatsapp/e5;->e:I

    .line 117
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    .line 49
    sget-object v1, Lcom/whatsapp/zf;->f:Lcom/whatsapp/zf;

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/zf;)V

    .line 311
    iput-boolean v2, p0, Lcom/whatsapp/e5;->l:Z

    .line 132
    if-nez p1, :cond_0

    .line 251
    new-instance v0, Ljava/lang/NullPointerException;

    sget-object v1, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 284
    :cond_0
    iput-object p1, p0, Lcom/whatsapp/e5;->a:Ljava/io/Reader;

    .line 339
    if-eqz v0, :cond_1

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_1
    return-void
.end method

.method private a(Z)Lcom/whatsapp/ag;
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v0, Lcom/whatsapp/e5;->m:I

    .line 141
    if-eqz p1, :cond_0

    .line 120
    sget-object v1, Lcom/whatsapp/zf;->b:Lcom/whatsapp/zf;

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->b(Lcom/whatsapp/zf;)V

    if-eqz v0, :cond_2

    .line 212
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 287
    :cond_1
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 21
    :sswitch_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->n()Lcom/whatsapp/zf;

    .line 249
    sget-object v0, Lcom/whatsapp/ag;->b:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    .line 330
    :goto_0
    return-object v0

    .line 170
    :sswitch_1
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 55
    :sswitch_2
    if-nez v0, :cond_1

    .line 303
    :cond_2
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 133
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/whatsapp/e5;->d:I

    .line 22
    invoke-direct {p0}, Lcom/whatsapp/e5;->p()Lcom/whatsapp/ag;

    move-result-object v0

    goto :goto_0

    .line 60
    :sswitch_3
    if-eqz p1, :cond_3

    .line 293
    invoke-direct {p0}, Lcom/whatsapp/e5;->n()Lcom/whatsapp/zf;

    .line 330
    sget-object v0, Lcom/whatsapp/ag;->b:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 36
    :cond_3
    :sswitch_4
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 291
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/whatsapp/e5;->d:I

    .line 35
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 147
    sget-object v0, Lcom/whatsapp/ag;->i:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 212
    nop

    :sswitch_data_0
    .sparse-switch
        0x2c -> :sswitch_2
        0x3b -> :sswitch_1
        0x5d -> :sswitch_0
    .end sparse-switch

    .line 303
    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_4
        0x3b -> :sswitch_4
        0x5d -> :sswitch_3
    .end sparse-switch
.end method

.method private a([CII)Lcom/whatsapp/ag;
    .locals 8
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v6, 0x2d

    const/16 v5, 0x39

    const/16 v4, 0x30

    sget v2, Lcom/whatsapp/e5;->m:I

    .line 295
    aget-char v0, p1, p2

    .line 145
    if-ne v0, v6, :cond_d

    .line 306
    add-int/lit8 v1, p2, 0x1

    aget-char v0, p1, v1

    .line 244
    :goto_0
    if-ne v0, v4, :cond_0

    .line 214
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    if-eqz v2, :cond_3

    .line 81
    :cond_0
    const/16 v3, 0x31

    if-lt v0, v3, :cond_2

    if-gt v0, v5, :cond_2

    .line 271
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 73
    :cond_1
    if-lt v0, v4, :cond_3

    if-gt v0, v5, :cond_3

    .line 167
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    if-eqz v2, :cond_1

    .line 312
    :cond_2
    sget-object v0, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    :goto_1
    return-object v0

    .line 285
    :cond_3
    const/16 v3, 0x2e

    if-ne v0, v3, :cond_5

    .line 75
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 13
    :cond_4
    if-lt v0, v4, :cond_5

    if-gt v0, v5, :cond_5

    .line 191
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    if-eqz v2, :cond_4

    :cond_5
    move v7, v0

    move v0, v1

    move v1, v7

    .line 64
    const/16 v3, 0x65

    if-eq v1, v3, :cond_6

    const/16 v3, 0x45

    if-ne v1, v3, :cond_a

    .line 188
    :cond_6
    add-int/lit8 v1, v0, 0x1

    aget-char v0, p1, v1

    .line 201
    const/16 v3, 0x2b

    if-eq v0, v3, :cond_7

    if-ne v0, v6, :cond_8

    .line 333
    :cond_7
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 335
    :cond_8
    if-lt v0, v4, :cond_9

    if-gt v0, v5, :cond_9

    .line 39
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    move v7, v0

    move v0, v1

    move v1, v7

    .line 337
    :goto_2
    if-lt v1, v4, :cond_a

    if-gt v1, v5, :cond_a

    .line 62
    add-int/lit8 v1, v0, 0x1

    aget-char v0, p1, v1

    if-eqz v2, :cond_c

    .line 278
    :cond_9
    sget-object v0, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    goto :goto_1

    .line 2
    :cond_a
    add-int v1, p2, p3

    if-ne v0, v1, :cond_b

    .line 203
    sget-object v0, Lcom/whatsapp/ag;->g:Lcom/whatsapp/ag;

    goto :goto_1

    .line 128
    :cond_b
    sget-object v0, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    goto :goto_1

    :cond_c
    move v7, v0

    move v0, v1

    move v1, v7

    goto :goto_2

    :cond_d
    move v1, p2

    goto :goto_0
.end method

.method private a(C)Ljava/lang/String;
    .locals 7
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v2, Lcom/whatsapp/e5;->m:I

    .line 243
    const/4 v1, 0x0

    .line 336
    :goto_0
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    move v6, v0

    move-object v0, v1

    move v1, v6

    .line 106
    :goto_1
    iget v3, p0, Lcom/whatsapp/e5;->d:I

    iget v4, p0, Lcom/whatsapp/e5;->e:I

    if-ge v3, v4, :cond_4

    .line 290
    iget-object v3, p0, Lcom/whatsapp/e5;->c:[C

    iget v4, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/whatsapp/e5;->d:I

    aget-char v3, v3, v4

    .line 194
    if-ne v3, p1, :cond_2

    .line 102
    iget-boolean v2, p0, Lcom/whatsapp/e5;->l:Z

    if-eqz v2, :cond_0

    .line 338
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    :goto_2
    return-object v0

    .line 247
    :cond_0
    if-nez v0, :cond_1

    .line 114
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    goto :goto_2

    .line 169
    :cond_1
    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v2, v1, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 302
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 86
    :cond_2
    const/16 v4, 0x5c

    if-ne v3, v4, :cond_7

    .line 210
    if-nez v0, :cond_3

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    :cond_3
    iget-object v3, p0, Lcom/whatsapp/e5;->c:[C

    iget v4, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v4, v1

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v3, v1, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 205
    invoke-direct {p0}, Lcom/whatsapp/e5;->t()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    move v6, v1

    move-object v1, v0

    move v0, v6

    .line 48
    :goto_3
    if-eqz v2, :cond_8

    move v6, v0

    move-object v0, v1

    move v1, v6

    .line 213
    :cond_4
    if-nez v0, :cond_5

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    :cond_5
    iget-object v3, p0, Lcom/whatsapp/e5;->c:[C

    iget v4, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v4, v1

    invoke-virtual {v0, v3, v1, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 281
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(I)Z

    move-result v1

    if-nez v1, :cond_6

    .line 178
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_6
    move-object v1, v0

    goto/16 :goto_0

    :cond_7
    move v6, v1

    move-object v1, v0

    move v0, v6

    goto :goto_3

    :cond_8
    move v6, v0

    move-object v0, v1

    move v1, v6

    goto/16 :goto_1
.end method

.method private a(Lcom/whatsapp/ag;)V
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 316
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 340
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    if-eq v0, p1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->g()Lcom/whatsapp/ag;

    .line 238
    return-void
.end method

.method private a(Lcom/whatsapp/zf;)V
    .locals 1
    .parameter

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    return-void
.end method

.method private a(I)Z
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    sget v1, Lcom/whatsapp/e5;->m:I

    .line 263
    iget v2, p0, Lcom/whatsapp/e5;->e:I

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    if-eq v2, v3, :cond_0

    .line 296
    iget v2, p0, Lcom/whatsapp/e5;->e:I

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/whatsapp/e5;->e:I

    .line 96
    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    iget-object v4, p0, Lcom/whatsapp/e5;->c:[C

    iget v5, p0, Lcom/whatsapp/e5;->e:I

    invoke-static {v2, v3, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v1, :cond_1

    .line 297
    :cond_0
    iput v0, p0, Lcom/whatsapp/e5;->e:I

    .line 85
    :cond_1
    iput v0, p0, Lcom/whatsapp/e5;->d:I

    .line 27
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/e5;->a:Ljava/io/Reader;

    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->e:I

    iget-object v4, p0, Lcom/whatsapp/e5;->c:[C

    array-length v4, v4

    iget v5, p0, Lcom/whatsapp/e5;->e:I

    sub-int/2addr v4, v5

    invoke-virtual {v1, v2, v3, v4}, Ljava/io/Reader;->read([CII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    .line 221
    iget v2, p0, Lcom/whatsapp/e5;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/whatsapp/e5;->e:I

    .line 155
    iget v1, p0, Lcom/whatsapp/e5;->e:I

    if-lt v1, p1, :cond_2

    .line 261
    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 5
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    sget v2, Lcom/whatsapp/e5;->m:I

    .line 30
    :cond_0
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v0, v3

    iget v3, p0, Lcom/whatsapp/e5;->e:I

    if-lt v0, v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_1
    move v0, v1

    .line 116
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 286
    iget-object v3, p0, Lcom/whatsapp/e5;->c:[C

    iget v4, p0, Lcom/whatsapp/e5;->d:I

    add-int/2addr v4, v0

    aget-char v3, v3, v4

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_3

    .line 192
    if-eqz v2, :cond_6

    .line 165
    :cond_3
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_2

    .line 78
    :cond_4
    const/4 v1, 0x1

    :cond_5
    :goto_0
    return v1

    .line 198
    :cond_6
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/whatsapp/e5;->d:I

    if-eqz v2, :cond_0

    goto :goto_0
.end method

.method private b(Z)Lcom/whatsapp/ag;
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v0, Lcom/whatsapp/e5;->m:I

    .line 157
    if-eqz p1, :cond_0

    .line 131
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 342
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/whatsapp/e5;->d:I

    if-eqz v0, :cond_2

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 318
    :cond_1
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 283
    :pswitch_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->n()Lcom/whatsapp/zf;

    .line 76
    sget-object v0, Lcom/whatsapp/ag;->d:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    :goto_0
    return-object v0

    .line 31
    :sswitch_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->n()Lcom/whatsapp/zf;

    .line 46
    sget-object v0, Lcom/whatsapp/ag;->d:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 130
    :sswitch_1
    if-nez v0, :cond_1

    .line 288
    :cond_2
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v1

    .line 193
    sparse-switch v1, :sswitch_data_1

    .line 88
    :cond_3
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 8
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/whatsapp/e5;->d:I

    .line 160
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->c(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/e5;->h:Ljava/lang/String;

    .line 56
    iget-object v0, p0, Lcom/whatsapp/e5;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 127
    :sswitch_2
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 216
    :sswitch_3
    int-to-char v1, v1

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(C)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/e5;->h:Ljava/lang/String;

    .line 272
    if-nez v0, :cond_3

    .line 58
    :cond_4
    sget-object v0, Lcom/whatsapp/zf;->d:Lcom/whatsapp/zf;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->b(Lcom/whatsapp/zf;)V

    .line 66
    sget-object v0, Lcom/whatsapp/ag;->e:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 131
    nop

    :pswitch_data_0
    .packed-switch 0x7d
        :pswitch_0
    .end packed-switch

    .line 6
    :sswitch_data_0
    .sparse-switch
        0x2c -> :sswitch_1
        0x3b -> :sswitch_1
        0x7d -> :sswitch_0
    .end sparse-switch

    .line 193
    :sswitch_data_1
    .sparse-switch
        0x22 -> :sswitch_3
        0x27 -> :sswitch_2
    .end sparse-switch
.end method

.method private b(Lcom/whatsapp/zf;)V
    .locals 2
    .parameter

    .prologue
    .line 322
    iget-object v0, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 196
    return-void
.end method

.method private c(Z)Ljava/lang/String;
    .locals 7
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    sget v4, Lcom/whatsapp/e5;->m:I

    .line 37
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/e5;->j:I

    .line 101
    iput v2, p0, Lcom/whatsapp/e5;->k:I

    move v1, v2

    move-object v0, v3

    .line 266
    :cond_0
    :goto_0
    iget v5, p0, Lcom/whatsapp/e5;->d:I

    add-int/2addr v5, v1

    iget v6, p0, Lcom/whatsapp/e5;->e:I

    if-ge v5, v6, :cond_1

    .line 40
    iget-object v5, p0, Lcom/whatsapp/e5;->c:[C

    iget v6, p0, Lcom/whatsapp/e5;->d:I

    add-int/2addr v6, v1

    aget-char v5, v5, v6

    sparse-switch v5, :sswitch_data_0

    .line 59
    :goto_1
    add-int/lit8 v1, v1, 0x1

    if-eqz v4, :cond_0

    .line 320
    :cond_1
    iget-object v5, p0, Lcom/whatsapp/e5;->c:[C

    array-length v5, v5

    if-ge v1, v5, :cond_3

    .line 319
    add-int/lit8 v5, v1, 0x1

    invoke-direct {p0, v5}, Lcom/whatsapp/e5;->a(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 207
    if-eqz v4, :cond_0

    .line 224
    :cond_2
    iget-object v5, p0, Lcom/whatsapp/e5;->c:[C

    iget v6, p0, Lcom/whatsapp/e5;->e:I

    aput-char v2, v5, v6

    .line 41
    if-eqz v4, :cond_5

    .line 310
    :cond_3
    if-nez v0, :cond_4

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    :cond_4
    iget-object v5, p0, Lcom/whatsapp/e5;->c:[C

    iget v6, p0, Lcom/whatsapp/e5;->d:I

    invoke-virtual {v0, v5, v6, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 138
    iget v5, p0, Lcom/whatsapp/e5;->k:I

    add-int/2addr v5, v1

    iput v5, p0, Lcom/whatsapp/e5;->k:I

    .line 332
    iget v5, p0, Lcom/whatsapp/e5;->d:I

    add-int/2addr v1, v5

    iput v1, p0, Lcom/whatsapp/e5;->d:I

    .line 137
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(I)Z

    move-result v1

    if-nez v1, :cond_a

    move v1, v2

    .line 239
    :cond_5
    if-eqz p1, :cond_6

    if-nez v0, :cond_6

    .line 217
    iget v2, p0, Lcom/whatsapp/e5;->d:I

    iput v2, p0, Lcom/whatsapp/e5;->j:I

    .line 301
    if-eqz v4, :cond_9

    .line 181
    :cond_6
    iget-boolean v2, p0, Lcom/whatsapp/e5;->l:Z

    if-eqz v2, :cond_7

    .line 140
    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0x12

    aget-object v3, v2, v3

    if-eqz v4, :cond_9

    .line 57
    :cond_7
    if-nez v0, :cond_8

    .line 199
    new-instance v3, Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v5, p0, Lcom/whatsapp/e5;->d:I

    invoke-direct {v3, v2, v5, v1}, Ljava/lang/String;-><init>([CII)V

    if-eqz v4, :cond_9

    .line 173
    :cond_8
    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 264
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 186
    :cond_9
    iget v0, p0, Lcom/whatsapp/e5;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/e5;->k:I

    .line 184
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/e5;->d:I

    .line 33
    return-object v3

    .line 124
    :sswitch_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 308
    :sswitch_1
    if-eqz v4, :cond_5

    goto :goto_1

    :cond_a
    move v1, v2

    goto/16 :goto_0

    .line 40
    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0xa -> :sswitch_1
        0xc -> :sswitch_1
        0xd -> :sswitch_1
        0x20 -> :sswitch_1
        0x23 -> :sswitch_0
        0x2c -> :sswitch_1
        0x2f -> :sswitch_0
        0x3a -> :sswitch_1
        0x3b -> :sswitch_0
        0x3d -> :sswitch_0
        0x5b -> :sswitch_1
        0x5c -> :sswitch_0
        0x5d -> :sswitch_1
        0x7b -> :sswitch_1
        0x7d -> :sswitch_1
    .end sparse-switch
.end method

.method private g()Lcom/whatsapp/ag;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 248
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 135
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    .line 144
    iput-object v1, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    .line 294
    iput-object v1, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 52
    iput-object v1, p0, Lcom/whatsapp/e5;->h:Ljava/lang/String;

    .line 98
    return-object v0
.end method

.method private m()Lcom/whatsapp/zf;
    .locals 2

    .prologue
    .line 126
    iget-object v0, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zf;

    return-object v0
.end method

.method private n()Lcom/whatsapp/zf;
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zf;

    return-object v0
.end method

.method private o()Lcom/whatsapp/ag;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v0, Lcom/whatsapp/e5;->m:I

    .line 90
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 280
    :cond_0
    :pswitch_0
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 105
    :pswitch_1
    if-eqz v0, :cond_2

    .line 187
    :pswitch_2
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 118
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    iget v2, p0, Lcom/whatsapp/e5;->e:I

    if-lt v1, v2, :cond_1

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->d:I

    aget-char v1, v1, v2

    const/16 v2, 0x3e

    if-ne v1, v2, :cond_2

    .line 109
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/whatsapp/e5;->d:I

    if-nez v0, :cond_0

    .line 17
    :cond_2
    sget-object v0, Lcom/whatsapp/zf;->e:Lcom/whatsapp/zf;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->b(Lcom/whatsapp/zf;)V

    .line 83
    invoke-direct {p0}, Lcom/whatsapp/e5;->p()Lcom/whatsapp/ag;

    move-result-object v0

    return-object v0

    .line 90
    :pswitch_data_0
    .packed-switch 0x3a
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private p()Lcom/whatsapp/ag;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 329
    invoke-direct {p0}, Lcom/whatsapp/e5;->q()I

    move-result v0

    .line 274
    sparse-switch v0, :sswitch_data_0

    .line 100
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/whatsapp/e5;->d:I

    .line 275
    invoke-direct {p0}, Lcom/whatsapp/e5;->u()Lcom/whatsapp/ag;

    move-result-object v0

    :goto_0
    return-object v0

    .line 245
    :sswitch_0
    sget-object v0, Lcom/whatsapp/zf;->c:Lcom/whatsapp/zf;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/zf;)V

    .line 143
    sget-object v0, Lcom/whatsapp/ag;->c:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 304
    :sswitch_1
    sget-object v0, Lcom/whatsapp/zf;->a:Lcom/whatsapp/zf;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/zf;)V

    .line 223
    sget-object v0, Lcom/whatsapp/ag;->a:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 148
    :sswitch_2
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 240
    :sswitch_3
    int-to-char v0, v0

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 219
    sget-object v0, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 274
    nop

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_3
        0x27 -> :sswitch_2
        0x5b -> :sswitch_1
        0x7b -> :sswitch_0
    .end sparse-switch
.end method

.method private q()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    sget v1, Lcom/whatsapp/e5;->m:I

    .line 309
    :cond_0
    iget v0, p0, Lcom/whatsapp/e5;->d:I

    iget v2, p0, Lcom/whatsapp/e5;->e:I

    if-lt v0, v2, :cond_1

    invoke-direct {p0, v4}, Lcom/whatsapp/e5;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/whatsapp/e5;->d:I

    aget-char v0, v0, v2

    .line 341
    sparse-switch v0, :sswitch_data_0

    .line 279
    :cond_2
    :goto_0
    return v0

    .line 107
    :sswitch_0
    if-eqz v1, :cond_0

    .line 5
    :sswitch_1
    iget v2, p0, Lcom/whatsapp/e5;->d:I

    iget v3, p0, Lcom/whatsapp/e5;->e:I

    if-ne v2, v3, :cond_3

    invoke-direct {p0, v4}, Lcom/whatsapp/e5;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 84
    :cond_3
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 292
    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    aget-char v2, v2, v3

    .line 208
    sparse-switch v2, :sswitch_data_1

    goto :goto_0

    .line 229
    :sswitch_2
    iget v2, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/whatsapp/e5;->d:I

    .line 72
    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-direct {p0, v2}, Lcom/whatsapp/e5;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 327
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 265
    :cond_4
    iget v2, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v2, v2, 0x2

    iput v2, p0, Lcom/whatsapp/e5;->d:I

    .line 34
    if-eqz v1, :cond_0

    .line 70
    :sswitch_3
    iget v2, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/whatsapp/e5;->d:I

    .line 150
    invoke-direct {p0}, Lcom/whatsapp/e5;->s()V

    .line 323
    if-eqz v1, :cond_0

    goto :goto_0

    .line 315
    :sswitch_4
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 29
    invoke-direct {p0}, Lcom/whatsapp/e5;->s()V

    .line 325
    if-eqz v1, :cond_0

    goto :goto_0

    .line 53
    :cond_5
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 341
    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x20 -> :sswitch_0
        0x23 -> :sswitch_4
        0x2f -> :sswitch_1
    .end sparse-switch

    .line 208
    :sswitch_data_1
    .sparse-switch
        0x2a -> :sswitch_2
        0x2f -> :sswitch_3
    .end sparse-switch
.end method

.method private r()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 220
    iget-boolean v0, p0, Lcom/whatsapp/e5;->b:Z

    if-nez v0, :cond_0

    .line 234
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 152
    :cond_0
    return-void
.end method

.method private s()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v0, Lcom/whatsapp/e5;->m:I

    .line 74
    :cond_0
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    iget v2, p0, Lcom/whatsapp/e5;->e:I

    if-lt v1, v2, :cond_1

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 18
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/whatsapp/e5;->d:I

    aget-char v1, v1, v2

    .line 209
    const/16 v2, 0xd

    if-eq v1, v2, :cond_3

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    .line 97
    if-eqz v0, :cond_3

    .line 260
    :cond_2
    if-eqz v0, :cond_0

    .line 91
    :cond_3
    return-void
.end method

.method private t()C
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x4

    const/16 v0, 0xc

    .line 230
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    iget v2, p0, Lcom/whatsapp/e5;->e:I

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/whatsapp/e5;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 328
    sget-object v1, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/whatsapp/e5;->d:I

    aget-char v1, v1, v2

    .line 204
    sparse-switch v1, :sswitch_data_0

    move v0, v1

    .line 324
    :goto_0
    :sswitch_0
    return v0

    .line 326
    :sswitch_1
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v1, v1, 0x4

    iget v2, p0, Lcom/whatsapp/e5;->e:I

    if-le v1, v2, :cond_1

    invoke-direct {p0, v4}, Lcom/whatsapp/e5;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 254
    sget-object v1, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 87
    :cond_1
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->d:I

    invoke-direct {v0, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    .line 112
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/whatsapp/e5;->d:I

    .line 142
    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    goto :goto_0

    .line 176
    :sswitch_2
    const/16 v0, 0x9

    goto :goto_0

    .line 225
    :sswitch_3
    const/16 v0, 0x8

    goto :goto_0

    .line 324
    :sswitch_4
    const/16 v0, 0xa

    goto :goto_0

    .line 190
    :sswitch_5
    const/16 v0, 0xd

    goto :goto_0

    .line 204
    :sswitch_data_0
    .sparse-switch
        0x62 -> :sswitch_3
        0x66 -> :sswitch_0
        0x6e -> :sswitch_4
        0x72 -> :sswitch_5
        0x74 -> :sswitch_2
        0x75 -> :sswitch_1
    .end sparse-switch
.end method

.method private u()Lcom/whatsapp/ag;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 227
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->c(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 235
    iget v0, p0, Lcom/whatsapp/e5;->k:I

    if-nez v0, :cond_0

    .line 233
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v1, 0x16

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/e5;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 177
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->v()Lcom/whatsapp/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    .line 195
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    if-ne v0, v1, :cond_1

    .line 307
    invoke-direct {p0}, Lcom/whatsapp/e5;->r()V

    .line 267
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    return-object v0
.end method

.method private v()Lcom/whatsapp/ag;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v7, 0x55

    const/16 v6, 0x45

    const/4 v5, 0x4

    const/16 v4, 0x6c

    const/16 v3, 0x4c

    .line 299
    iget v0, p0, Lcom/whatsapp/e5;->j:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 125
    sget-object v0, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    .line 273
    :goto_0
    return-object v0

    .line 282
    :cond_0
    iget v0, p0, Lcom/whatsapp/e5;->k:I

    if-ne v0, v5, :cond_5

    const/16 v0, 0x6e

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_1

    const/16 v0, 0x4e

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_5

    :cond_1
    const/16 v0, 0x75

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    if-ne v7, v0, :cond_5

    :cond_2
    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-eq v4, v0, :cond_3

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-eq v4, v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_5

    .line 93
    :cond_4
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 273
    sget-object v0, Lcom/whatsapp/ag;->i:Lcom/whatsapp/ag;

    goto :goto_0

    .line 122
    :cond_5
    iget v0, p0, Lcom/whatsapp/e5;->k:I

    if-ne v0, v5, :cond_a

    const/16 v0, 0x74

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_6

    const/16 v0, 0x54

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_a

    :cond_6
    const/16 v0, 0x72

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_7

    const/16 v0, 0x52

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_a

    :cond_7
    const/16 v0, 0x75

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x2

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_8

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v7, v0, :cond_a

    :cond_8
    const/16 v0, 0x65

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v6, v0, :cond_a

    .line 202
    :cond_9
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 10
    sget-object v0, Lcom/whatsapp/ag;->h:Lcom/whatsapp/ag;

    goto/16 :goto_0

    .line 50
    :cond_a
    iget v0, p0, Lcom/whatsapp/e5;->k:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_10

    const/16 v0, 0x66

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_b

    const/16 v0, 0x46

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_10

    :cond_b
    const/16 v0, 0x61

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_c

    const/16 v0, 0x41

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_10

    :cond_c
    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-eq v4, v0, :cond_d

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_10

    :cond_d
    const/16 v0, 0x73

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_e

    const/16 v0, 0x53

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_10

    :cond_e
    const/16 v0, 0x65

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v2, v2, 0x4

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_f

    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    add-int/lit8 v1, v1, 0x4

    aget-char v0, v0, v1

    if-ne v6, v0, :cond_10

    .line 255
    :cond_f
    sget-object v0, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 161
    sget-object v0, Lcom/whatsapp/ag;->h:Lcom/whatsapp/ag;

    goto/16 :goto_0

    .line 200
    :cond_10
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/e5;->c:[C

    iget v2, p0, Lcom/whatsapp/e5;->j:I

    iget v3, p0, Lcom/whatsapp/e5;->k:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 123
    iget-object v0, p0, Lcom/whatsapp/e5;->c:[C

    iget v1, p0, Lcom/whatsapp/e5;->j:I

    iget v2, p0, Lcom/whatsapp/e5;->k:I

    invoke-direct {p0, v0, v1, v2}, Lcom/whatsapp/e5;->a([CII)Lcom/whatsapp/ag;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private w()Ljava/lang/CharSequence;
    .locals 5

    .prologue
    const/16 v4, 0x14

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    iget v1, p0, Lcom/whatsapp/e5;->d:I

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 172
    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 237
    iget v1, p0, Lcom/whatsapp/e5;->e:I

    iget v2, p0, Lcom/whatsapp/e5;->d:I

    sub-int/2addr v1, v2

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 250
    iget-object v2, p0, Lcom/whatsapp/e5;->c:[C

    iget v3, p0, Lcom/whatsapp/e5;->d:I

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 19
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 222
    sget-object v0, Lcom/whatsapp/ag;->a:Lcom/whatsapp/ag;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/ag;)V

    .line 174
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/io/IOException;
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 12
    new-instance v0, Lcom/whatsapp/of;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/whatsapp/e5;->w()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/e5;->c:[C

    const/4 v4, 0x0

    iget v5, p0, Lcom/whatsapp/e5;->e:I

    invoke-direct {v2, v3, v4, v5}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/of;-><init>(Ljava/lang/String;Lcom/whatsapp/f5;)V

    throw v0
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 45
    sget-object v0, Lcom/whatsapp/ag;->b:Lcom/whatsapp/ag;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/ag;)V

    .line 185
    return-void
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 119
    sget-object v0, Lcom/whatsapp/ag;->c:Lcom/whatsapp/ag;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/ag;)V

    .line 151
    return-void
.end method

.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 171
    iput-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 231
    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    .line 20
    iget-object v0, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 139
    iget-object v0, p0, Lcom/whatsapp/e5;->f:Ljava/util/List;

    sget-object v1, Lcom/whatsapp/zf;->h:Lcom/whatsapp/zf;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/e5;->a:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_0
    .catch Ljavax/net/ssl/SSLProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1
    :goto_0
    return-void

    .line 331
    :catch_0
    move-exception v0

    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljavax/net/ssl/SSLProtocolException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 228
    sget-object v0, Lcom/whatsapp/ag;->d:Lcom/whatsapp/ag;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->a(Lcom/whatsapp/ag;)V

    .line 68
    return-void
.end method

.method public e()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 189
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->d:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->b:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Lcom/whatsapp/ag;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 180
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    if-eqz v0, :cond_1

    .line 232
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    .line 317
    :cond_0
    :goto_0
    return-object v0

    .line 164
    :cond_1
    sget-object v0, Lcom/whatsapp/f5;->a:[I

    invoke-direct {p0}, Lcom/whatsapp/e5;->m()Lcom/whatsapp/zf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/zf;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 89
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 241
    :pswitch_0
    sget-object v0, Lcom/whatsapp/zf;->g:Lcom/whatsapp/zf;

    invoke-direct {p0, v0}, Lcom/whatsapp/e5;->b(Lcom/whatsapp/zf;)V

    .line 334
    invoke-direct {p0}, Lcom/whatsapp/e5;->p()Lcom/whatsapp/ag;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v2, Lcom/whatsapp/ag;->a:Lcom/whatsapp/ag;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v2, Lcom/whatsapp/ag;->c:Lcom/whatsapp/ag;

    if-eq v1, v2, :cond_0

    .line 276
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :pswitch_1
    invoke-direct {p0, v3}, Lcom/whatsapp/e5;->a(Z)Lcom/whatsapp/ag;

    move-result-object v0

    goto :goto_0

    .line 15
    :pswitch_2
    invoke-direct {p0, v2}, Lcom/whatsapp/e5;->a(Z)Lcom/whatsapp/ag;

    move-result-object v0

    goto :goto_0

    .line 99
    :pswitch_3
    invoke-direct {p0, v3}, Lcom/whatsapp/e5;->b(Z)Lcom/whatsapp/ag;

    move-result-object v0

    goto :goto_0

    .line 153
    :pswitch_4
    invoke-direct {p0}, Lcom/whatsapp/e5;->o()Lcom/whatsapp/ag;

    move-result-object v0

    goto :goto_0

    .line 317
    :pswitch_5
    invoke-direct {p0, v2}, Lcom/whatsapp/e5;->b(Z)Lcom/whatsapp/ag;

    move-result-object v0

    goto :goto_0

    .line 313
    :pswitch_6
    sget-object v0, Lcom/whatsapp/ag;->j:Lcom/whatsapp/ag;

    iput-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    goto :goto_0

    .line 305
    :pswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    sget-object v1, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 164
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public h()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 268
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 77
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->e:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    .line 3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/e5;->h:Ljava/lang/String;

    .line 269
    invoke-direct {p0}, Lcom/whatsapp/e5;->g()Lcom/whatsapp/ag;

    .line 166
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 121
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 4
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->g:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    .line 298
    invoke-direct {p0}, Lcom/whatsapp/e5;->g()Lcom/whatsapp/ag;

    .line 44
    return-object v0
.end method

.method public j()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 242
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 94
    iget-object v1, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v2, Lcom/whatsapp/ag;->h:Lcom/whatsapp/ag;

    if-eq v1, v2, :cond_0

    .line 24
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-ne v1, v2, :cond_1

    .line 289
    :goto_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->g()Lcom/whatsapp/ag;

    .line 65
    return v0

    .line 108
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public k()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 314
    invoke-virtual {p0}, Lcom/whatsapp/e5;->f()Lcom/whatsapp/ag;

    .line 179
    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->f:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    sget-object v1, Lcom/whatsapp/ag;->g:Lcom/whatsapp/ag;

    if-eq v0, v1, :cond_0

    .line 183
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/e5;->g:Lcom/whatsapp/ag;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 26
    :cond_1
    invoke-direct {p0}, Lcom/whatsapp/e5;->g()Lcom/whatsapp/ag;

    .line 163
    return v0

    .line 206
    :catch_0
    move-exception v0

    .line 159
    iget-object v0, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 300
    double-to-int v0, v1

    .line 28
    int-to-double v3, v0

    cmpl-double v1, v3, v1

    if-eqz v1, :cond_1

    .line 182
    new-instance v0, Ljava/lang/NumberFormatException;

    iget-object v1, p0, Lcom/whatsapp/e5;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    sget v2, Lcom/whatsapp/e5;->m:I

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/e5;->l:Z

    move v0, v1

    .line 162
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/whatsapp/e5;->g()Lcom/whatsapp/ag;

    move-result-object v3

    .line 226
    sget-object v4, Lcom/whatsapp/ag;->a:Lcom/whatsapp/ag;

    if-eq v3, v4, :cond_1

    sget-object v4, Lcom/whatsapp/ag;->c:Lcom/whatsapp/ag;

    if-ne v3, v4, :cond_2

    .line 80
    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_4

    .line 113
    :cond_2
    sget-object v4, Lcom/whatsapp/ag;->b:Lcom/whatsapp/ag;

    if-eq v3, v4, :cond_3

    sget-object v4, Lcom/whatsapp/ag;->d:Lcom/whatsapp/ag;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v4, :cond_4

    .line 156
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 215
    :cond_4
    if-nez v0, :cond_0

    .line 111
    iput-boolean v1, p0, Lcom/whatsapp/e5;->l:Z

    .line 11
    sget v0, Lcom/whatsapp/App;->wc:I

    if-eqz v0, :cond_5

    add-int/lit8 v0, v2, 0x1

    sput v0, Lcom/whatsapp/e5;->m:I

    :cond_5
    return-void

    .line 111
    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lcom/whatsapp/e5;->l:Z

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/e5;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/whatsapp/e5;->w()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
