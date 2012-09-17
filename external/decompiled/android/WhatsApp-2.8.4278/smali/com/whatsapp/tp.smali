.class public Lcom/whatsapp/tp;
.super Ljava/lang/Object;
.source "tp.java"


# static fields
.field public static a:Z

.field static final b:Ljava/lang/Object;

.field static c:J

.field static d:Z

.field static e:Lcom/whatsapp/vp;

.field static f:I

.field static g:Z

.field private static h:I

.field private static i:Z

.field private static j:Z

.field private static final k:[Ljava/lang/String;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v4, 0x76

    const/16 v1, 0x34

    const/16 v2, 0x23

    const/16 v3, 0x19

    const/4 v8, 0x0

    const/16 v0, 0x31

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "xd\\"

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

    const-string v0, "ZVt\u001a\u0013F"

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

    const-string v0, "FF~\u0011\u0005@Fk\u000b\u000fZ@6\u001f\u0013@|j\u0001\u0018W|{\u0019\u0002WK6\u0014\u0011Q\u000c|\n\u0004[Q"

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

    const-string v0, "]MF\u000e\u001fGJ{\u0014\u0013kDk\u0017\u0003D\u0003$XI"

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

    const-string v0, "PBm\u0019D"

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

    const-string v0, "FF~\u0011\u0005@Fk\u000b\u000fZ@6\u000b\u0002UQmW\u0011QWF\u000b\u000fZ@F\u001a\u0017@@q"

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

    const-string v0, "FF~\u0011\u0005@Fk\u000b\u000fZ@6\u000b\u0002UQmW\u0011QWF\u000b\u000fZ@F\u001a\u0017@@qW\u0015[Vw\u000cV"

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

    const-string v0, "FF~\u0011\u0005@Fk\u000b\u000fZ@6\u001f\u0013@|j\u0001\u0018W|{\u0019\u0002WK6\u0014\u0011Q"

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

    const-string v0, "PJj\u0008\u001aUZF\u0016\u0017YF"

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

    const-string v0, "ZBt\u001d"

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

    const-string v0, "FBn\'\u0015[Mm\u0019\u0015@|p\u001c"

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

    const-string v0, "PBm\u0019G"

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

    const-string v0, "WLw\u000c\u0013ZW#WY]@zW\u0017PM"

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

    const-string v0, "]MF\u000e\u001fGJ{\u0014\u0013kDk\u0017\u0003D"

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

    const-string v0, "PBm\u0019E"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO"

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

    const-string v0, "GZw\u001bY]PF\u0019\u001aFFx\u001c\u000fkQl\u0016\u0018]M~W\u0005_Ji"

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

    const-string v0, "GZw\u001bYGWx\n\u0002\u001a\r7P\u0015[Vw\u000cK"

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

    const-string v0, "GZw\u001bY@Jt\u001d)GJw\u001b\u0013kOx\u000b\u0002kP`\u0016\u0015\u000e\u0003"

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

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019"

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

    const-string v0, "GZw\u001bYU@z\u000c)Q[i\u0011\u0004QG6\u000b\u001d]SF\u000b\u000fZ@"

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

    const-string v0, "FFt\u0017\u0000Q|u\u0011\u0005@"

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

    const-string v0, "AS}\u0019\u0002Q"

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

    const-string v0, "FFt\u0017\u0000Q"

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

    const-string v0, "GZw\u001bYGFi\u0019\u0004UW|W\u001aSF6\u001d\u0004FLkX"

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

    const-string v0, "Q[m\n\u0017"

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

    const-string v0, "Q[m\n\u0017kP`\u0016\u0015kOp\u000b\u0002"

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

    const-string v0, "AS}\u0019\u0002Q|u\u0011\u0005@"

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

    const-string v0, "GZw\u001bYGFi\u0019\u0004UW|W\u001aSF"

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

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019YUOu\'\u0015[Mm\u0019\u0015@PF\u0014\u001fGW"

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

    const-string v0, "GZw\u001bYRBp\u0014\u0003FF6\u001c\u0013XWx"

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

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019YWVk\u000b\u0019F\u000cz\u0017\u0003ZW9"

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

    const-string v0, "UOu"

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

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019YQQk\u0017\u0004\u0014"

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

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019V\u0019\u0003m\u0011\u001bQ\u0003j\u0008\u0013ZW#"

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

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019Y"

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

    aput-object v0, v9, v2

    const/16 v10, 0x24

    const-string v0, "GZw\u001bYGZw\u001b2QOm\u0019YZL9\t\u0003QQ`"

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

    const-string v0, "\u0014\u000b|\n\u0004[Q0"

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

    const-string v0, "WLtV\u0017ZGk\u0017\u001fP\rz\u0017\u0018@Bz\u000c\u0005"

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

    const/16 v10, 0x27

    const-string v0, "GZw\u001bY\\Bj\u001b\u0003FQ|\u0016\u0002GZw\u001bY@Zi\u001dK"

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

    aput-object v0, v9, v10

    const/16 v10, 0x28

    const-string v0, "WLtV\u0001\\Bm\u000b\u0017DS"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO6"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO6\u001b\u0003FPv\nYWLl\u0016\u0002\u0014"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO9UV@Jt\u001dVGS|\u0016\u0002\u000e"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO6\u0019\u001aX|z\u0017\u0018@Bz\u000c\u0005kOp\u000b\u0002"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO6\u0011\u0018@Fk\n\u0003DW|\u001c\u0013FQv\nV"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO6\u0011\u0018BJj\u0011\u0014XF6\u001b\u0003FPv\nYWLl\u0016\u0002\u0014"

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

    const-string v0, "GZw\u001bYGZw\u001b7XO6\u0016\u0019\u0014Rl\u001d\u0004M"

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

    const-string v0, "SFm\u0011\u0018BJj\u0011\u0014XF6\u001b\u0003FPv\nYWLl\u0016\u0002\u0014"

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

    sput-object v9, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    .line 288
    sput-boolean v8, Lcom/whatsapp/tp;->a:Z

    .line 378
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/whatsapp/tp;->b:Ljava/lang/Object;

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/whatsapp/tp;->c:J

    .line 181
    sput-boolean v8, Lcom/whatsapp/tp;->d:Z

    .line 54
    new-instance v0, Lcom/whatsapp/up;

    invoke-direct {v0}, Lcom/whatsapp/up;-><init>()V

    sput-object v0, Lcom/whatsapp/tp;->e:Lcom/whatsapp/vp;

    .line 294
    sput v8, Lcom/whatsapp/tp;->f:I

    .line 386
    sput-boolean v8, Lcom/whatsapp/tp;->g:Z

    .line 318
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/tp;->h:I

    .line 283
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/tp;->i:Z

    .line 368
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/tp;->j:Z

    .line 15
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    aput-object v1, v0, v8

    const/4 v1, 0x1

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/tp;->k:[Ljava/lang/String;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_31
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_31

    :pswitch_1
    move v0, v2

    goto :goto_31

    :pswitch_2
    move v0, v3

    goto :goto_31

    :pswitch_3
    const/16 v0, 0x78

    goto :goto_31

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_32
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_32

    :pswitch_5
    move v0, v2

    goto :goto_32

    :pswitch_6
    move v0, v3

    goto :goto_32

    :pswitch_7
    const/16 v0, 0x78

    goto :goto_32

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_33
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_33

    :pswitch_9
    move v0, v2

    goto :goto_33

    :pswitch_a
    move v0, v3

    goto :goto_33

    :pswitch_b
    const/16 v0, 0x78

    goto :goto_33

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_34
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_34

    :pswitch_d
    move v0, v2

    goto :goto_34

    :pswitch_e
    move v0, v3

    goto :goto_34

    :pswitch_f
    const/16 v0, 0x78

    goto :goto_34

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_35
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_35

    :pswitch_11
    move v0, v2

    goto :goto_35

    :pswitch_12
    move v0, v3

    goto :goto_35

    :pswitch_13
    const/16 v0, 0x78

    goto :goto_35

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_36
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_36

    :pswitch_15
    move v0, v2

    goto :goto_36

    :pswitch_16
    move v0, v3

    goto :goto_36

    :pswitch_17
    const/16 v0, 0x78

    goto :goto_36

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_37
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_37

    :pswitch_19
    move v0, v2

    goto :goto_37

    :pswitch_1a
    move v0, v3

    goto :goto_37

    :pswitch_1b
    const/16 v0, 0x78

    goto :goto_37

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_38

    :pswitch_1d
    move v0, v2

    goto :goto_38

    :pswitch_1e
    move v0, v3

    goto :goto_38

    :pswitch_1f
    const/16 v0, 0x78

    goto :goto_38

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_39
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_39

    :pswitch_21
    move v0, v2

    goto :goto_39

    :pswitch_22
    move v0, v3

    goto :goto_39

    :pswitch_23
    const/16 v0, 0x78

    goto :goto_39

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_3a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_3a

    :pswitch_25
    move v0, v2

    goto :goto_3a

    :pswitch_26
    move v0, v3

    goto :goto_3a

    :pswitch_27
    const/16 v0, 0x78

    goto :goto_3a

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_3b

    :pswitch_29
    move v0, v2

    goto :goto_3b

    :pswitch_2a
    move v0, v3

    goto :goto_3b

    :pswitch_2b
    const/16 v0, 0x78

    goto :goto_3b

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_3c

    :pswitch_2d
    move v0, v2

    goto :goto_3c

    :pswitch_2e
    move v0, v3

    goto :goto_3c

    :pswitch_2f
    const/16 v0, 0x78

    goto :goto_3c

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_3d

    :pswitch_31
    move v0, v2

    goto :goto_3d

    :pswitch_32
    move v0, v3

    goto :goto_3d

    :pswitch_33
    const/16 v0, 0x78

    goto :goto_3d

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_3e

    :pswitch_35
    move v0, v2

    goto :goto_3e

    :pswitch_36
    move v0, v3

    goto :goto_3e

    :pswitch_37
    const/16 v0, 0x78

    goto :goto_3e

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_3f

    :pswitch_39
    move v0, v2

    goto :goto_3f

    :pswitch_3a
    move v0, v3

    goto :goto_3f

    :pswitch_3b
    const/16 v0, 0x78

    goto :goto_3f

    :cond_f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_40

    :pswitch_3d
    move v0, v2

    goto :goto_40

    :pswitch_3e
    move v0, v3

    goto :goto_40

    :pswitch_3f
    const/16 v0, 0x78

    goto :goto_40

    :cond_10
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_41

    :pswitch_41
    move v0, v2

    goto :goto_41

    :pswitch_42
    move v0, v3

    goto :goto_41

    :pswitch_43
    const/16 v0, 0x78

    goto :goto_41

    :cond_11
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_42

    :pswitch_45
    move v0, v2

    goto :goto_42

    :pswitch_46
    move v0, v3

    goto :goto_42

    :pswitch_47
    const/16 v0, 0x78

    goto :goto_42

    :cond_12
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_43

    :pswitch_49
    move v0, v2

    goto :goto_43

    :pswitch_4a
    move v0, v3

    goto :goto_43

    :pswitch_4b
    const/16 v0, 0x78

    goto :goto_43

    :cond_13
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_44

    :pswitch_4d
    move v0, v2

    goto :goto_44

    :pswitch_4e
    move v0, v3

    goto :goto_44

    :pswitch_4f
    const/16 v0, 0x78

    goto :goto_44

    :cond_14
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_45

    :pswitch_51
    move v0, v2

    goto :goto_45

    :pswitch_52
    move v0, v3

    goto :goto_45

    :pswitch_53
    const/16 v0, 0x78

    goto :goto_45

    :cond_15
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_46

    :pswitch_55
    move v0, v2

    goto :goto_46

    :pswitch_56
    move v0, v3

    goto :goto_46

    :pswitch_57
    const/16 v0, 0x78

    goto :goto_46

    :cond_16
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_47

    :pswitch_59
    move v0, v2

    goto :goto_47

    :pswitch_5a
    move v0, v3

    goto :goto_47

    :pswitch_5b
    const/16 v0, 0x78

    goto :goto_47

    :cond_17
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_48

    :pswitch_5d
    move v0, v2

    goto :goto_48

    :pswitch_5e
    move v0, v3

    goto :goto_48

    :pswitch_5f
    const/16 v0, 0x78

    goto :goto_48

    :cond_18
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_49

    :pswitch_61
    move v0, v2

    goto :goto_49

    :pswitch_62
    move v0, v3

    goto :goto_49

    :pswitch_63
    const/16 v0, 0x78

    goto :goto_49

    :cond_19
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_4a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_4a

    :pswitch_65
    move v0, v2

    goto :goto_4a

    :pswitch_66
    move v0, v3

    goto :goto_4a

    :pswitch_67
    const/16 v0, 0x78

    goto :goto_4a

    :cond_1a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_4b

    :pswitch_69
    move v0, v2

    goto :goto_4b

    :pswitch_6a
    move v0, v3

    goto :goto_4b

    :pswitch_6b
    const/16 v0, 0x78

    goto :goto_4b

    :cond_1b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_4c

    :pswitch_6d
    move v0, v2

    goto :goto_4c

    :pswitch_6e
    move v0, v3

    goto :goto_4c

    :pswitch_6f
    const/16 v0, 0x78

    goto :goto_4c

    :cond_1c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_4d

    :pswitch_71
    move v0, v2

    goto :goto_4d

    :pswitch_72
    move v0, v3

    goto :goto_4d

    :pswitch_73
    const/16 v0, 0x78

    goto :goto_4d

    :cond_1d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_4e

    :pswitch_75
    move v0, v2

    goto :goto_4e

    :pswitch_76
    move v0, v3

    goto :goto_4e

    :pswitch_77
    const/16 v0, 0x78

    goto :goto_4e

    :cond_1e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_4f

    :pswitch_79
    move v0, v2

    goto :goto_4f

    :pswitch_7a
    move v0, v3

    goto :goto_4f

    :pswitch_7b
    const/16 v0, 0x78

    goto :goto_4f

    :cond_1f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_50

    :pswitch_7d
    move v0, v2

    goto :goto_50

    :pswitch_7e
    move v0, v3

    goto :goto_50

    :pswitch_7f
    const/16 v0, 0x78

    goto :goto_50

    :cond_20
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_51

    :pswitch_81
    move v0, v2

    goto :goto_51

    :pswitch_82
    move v0, v3

    goto :goto_51

    :pswitch_83
    const/16 v0, 0x78

    goto :goto_51

    :cond_21
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_52

    :pswitch_85
    move v0, v2

    goto :goto_52

    :pswitch_86
    move v0, v3

    goto :goto_52

    :pswitch_87
    const/16 v0, 0x78

    goto :goto_52

    :cond_22
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_53

    :pswitch_89
    move v0, v2

    goto :goto_53

    :pswitch_8a
    move v0, v3

    goto :goto_53

    :pswitch_8b
    const/16 v0, 0x78

    goto :goto_53

    :cond_23
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_54
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_54

    :pswitch_8d
    move v0, v2

    goto :goto_54

    :pswitch_8e
    move v0, v3

    goto :goto_54

    :pswitch_8f
    const/16 v0, 0x78

    goto :goto_54

    :cond_24
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_55

    :pswitch_91
    move v0, v2

    goto :goto_55

    :pswitch_92
    move v0, v3

    goto :goto_55

    :pswitch_93
    const/16 v0, 0x78

    goto :goto_55

    :cond_25
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_25

    move v0, v4

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_56

    :pswitch_95
    move v0, v2

    goto :goto_56

    :pswitch_96
    move v0, v3

    goto :goto_56

    :pswitch_97
    const/16 v0, 0x78

    goto :goto_56

    :cond_26
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_26

    move v0, v4

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_57

    :pswitch_99
    move v0, v2

    goto :goto_57

    :pswitch_9a
    move v0, v3

    goto :goto_57

    :pswitch_9b
    const/16 v0, 0x78

    goto :goto_57

    :cond_27
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_27

    move v0, v4

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_58

    :pswitch_9d
    move v0, v2

    goto :goto_58

    :pswitch_9e
    move v0, v3

    goto :goto_58

    :pswitch_9f
    const/16 v0, 0x78

    goto :goto_58

    :cond_28
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_28

    move v0, v4

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_59

    :pswitch_a1
    move v0, v2

    goto :goto_59

    :pswitch_a2
    move v0, v3

    goto :goto_59

    :pswitch_a3
    const/16 v0, 0x78

    goto :goto_59

    :cond_29
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_29

    move v0, v4

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_5a

    :pswitch_a5
    move v0, v2

    goto :goto_5a

    :pswitch_a6
    move v0, v3

    goto :goto_5a

    :pswitch_a7
    const/16 v0, 0x78

    goto :goto_5a

    :cond_2a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2a

    move v0, v4

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_5b

    :pswitch_a9
    move v0, v2

    goto :goto_5b

    :pswitch_aa
    move v0, v3

    goto :goto_5b

    :pswitch_ab
    const/16 v0, 0x78

    goto :goto_5b

    :cond_2b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2b

    move v0, v4

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_5c

    :pswitch_ad
    move v0, v2

    goto :goto_5c

    :pswitch_ae
    move v0, v3

    goto :goto_5c

    :pswitch_af
    const/16 v0, 0x78

    goto :goto_5c

    :cond_2c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2c

    move v0, v4

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_5d

    :pswitch_b1
    move v0, v2

    goto :goto_5d

    :pswitch_b2
    move v0, v3

    goto :goto_5d

    :pswitch_b3
    const/16 v0, 0x78

    goto :goto_5d

    :cond_2d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2d

    move v0, v4

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_5e

    :pswitch_b5
    move v0, v2

    goto :goto_5e

    :pswitch_b6
    move v0, v3

    goto :goto_5e

    :pswitch_b7
    const/16 v0, 0x78

    goto :goto_5e

    :cond_2e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2e

    move v0, v4

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_5f

    :pswitch_b9
    move v0, v2

    goto :goto_5f

    :pswitch_ba
    move v0, v3

    goto :goto_5f

    :pswitch_bb
    const/16 v0, 0x78

    goto :goto_5f

    :cond_2f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2f

    move v0, v4

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_60

    :pswitch_bd
    move v0, v2

    goto :goto_60

    :pswitch_be
    move v0, v3

    goto :goto_60

    :pswitch_bf
    const/16 v0, 0x78

    goto :goto_60

    :cond_30
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_30

    move v0, v4

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_61

    :pswitch_c1
    move v0, v2

    goto :goto_61

    :pswitch_c2
    move v0, v3

    goto :goto_61

    :pswitch_c3
    const/16 v0, 0x78

    goto :goto_61

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
.end method

.method public static a(Z)I
    .locals 7
    .parameter

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x12

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v5, Lcom/whatsapp/tp;->c:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "s"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 139
    invoke-static {}, Lcom/whatsapp/tp;->a()Z

    move-result v2

    if-nez v2, :cond_0

    .line 375
    :goto_0
    return v0

    .line 19
    :cond_0
    sget-object v2, Lcom/whatsapp/tp;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 22
    :try_start_0
    sget-boolean v3, Lcom/whatsapp/tp;->a:Z

    .line 341
    const/4 v4, 0x1

    sput-boolean v4, Lcom/whatsapp/tp;->a:Z

    .line 391
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    if-eqz v3, :cond_1

    .line 286
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 68
    sput-boolean v1, Lcom/whatsapp/tp;->d:Z

    .line 92
    const/4 v0, 0x2

    goto :goto_0

    .line 391
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 199
    :cond_1
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v2

    if-nez v2, :cond_2

    .line 105
    sget-object v1, Lcom/whatsapp/tp;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 137
    const/4 v0, 0x0

    :try_start_2
    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 108
    monitor-exit v1

    .line 375
    const/4 v0, 0x3

    goto :goto_0

    .line 108
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 81
    :cond_2
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x11

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v3}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/App;->h(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 334
    sget-boolean v2, Lcom/whatsapp/g;->d:Z

    if-eqz v2, :cond_3

    .line 398
    const/4 v2, 0x1

    sput-boolean v2, Lcom/whatsapp/g;->e:Z

    .line 247
    :cond_3
    const/4 v2, 0x0

    sput v2, Lcom/whatsapp/tp;->f:I

    .line 6
    if-eqz p0, :cond_4

    .line 66
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 291
    sget-object v2, Lcom/whatsapp/tp;->e:Lcom/whatsapp/vp;

    invoke-static {v2}, Lcom/whatsapp/tp;->a(Lcom/whatsapp/vp;)Z

    move-result v2

    sput-boolean v2, Lcom/whatsapp/tp;->g:Z

    sget v2, Lcom/whatsapp/yq;->e:I

    if-eqz v2, :cond_5

    .line 4
    :cond_4
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 13
    sget-object v2, Lcom/whatsapp/tp;->e:Lcom/whatsapp/vp;

    invoke-static {v2}, Lcom/whatsapp/tp;->b(Lcom/whatsapp/vp;)Z

    move-result v2

    sput-boolean v2, Lcom/whatsapp/tp;->g:Z

    .line 315
    :cond_5
    const/4 v2, 0x0

    sput-boolean v2, Lcom/whatsapp/tp;->d:Z

    .line 45
    sget-boolean v2, Lcom/whatsapp/tp;->g:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v2, :cond_7

    .line 333
    sget-object v1, Lcom/whatsapp/tp;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 136
    :try_start_4
    sget-boolean v2, Lcom/whatsapp/tp;->g:Z

    if-eqz v2, :cond_6

    .line 218
    sget v2, Lcom/whatsapp/tp;->h:I

    invoke-static {v2}, Lcom/whatsapp/g;->a(I)V

    .line 103
    :cond_6
    const/4 v2, 0x0

    sput-boolean v2, Lcom/whatsapp/tp;->a:Z

    .line 161
    monitor-exit v1

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    .line 220
    :cond_7
    sget-object v2, Lcom/whatsapp/tp;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 324
    :try_start_5
    sget-boolean v0, Lcom/whatsapp/tp;->g:Z

    if-eqz v0, :cond_8

    .line 32
    sget v0, Lcom/whatsapp/tp;->h:I

    invoke-static {v0}, Lcom/whatsapp/g;->a(I)V

    .line 107
    :cond_8
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 177
    monitor-exit v2

    move v0, v1

    goto/16 :goto_0

    :catchall_3
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    .line 424
    :catch_0
    move-exception v0

    .line 74
    :try_start_6
    invoke-static {}, Lcom/whatsapp/b5;->a()V

    .line 230
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 18
    :catchall_4
    move-exception v0

    sget-object v1, Lcom/whatsapp/tp;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 44
    :try_start_7
    sget-boolean v2, Lcom/whatsapp/tp;->g:Z

    if-eqz v2, :cond_9

    .line 411
    sget v2, Lcom/whatsapp/tp;->h:I

    invoke-static {v2}, Lcom/whatsapp/g;->a(I)V

    .line 148
    :cond_9
    const/4 v2, 0x0

    sput-boolean v2, Lcom/whatsapp/tp;->a:Z

    .line 126
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw v0

    :catchall_5
    move-exception v0

    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw v0
.end method

.method private static a(Landroid/database/Cursor;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 10
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Ljava/util/HashMap",
            "<",
            "Lcom/whatsapp/uq;",
            "Lcom/whatsapp/zq;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Ljava/util/HashMap",
            "<",
            "Lcom/whatsapp/uq;",
            "Lcom/whatsapp/zq;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    sget v8, Lcom/whatsapp/yq;->e:I

    .line 328
    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 379
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 86
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 134
    new-instance v2, Lcom/whatsapp/uq;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-direct {v2, v3, v4, v1}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    .line 316
    invoke-virtual {p4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 259
    if-nez v0, :cond_3

    .line 203
    invoke-static {v1}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 242
    new-instance v1, Lcom/whatsapp/zq;

    const/4 v3, 0x1

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x4

    invoke-interface {p0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/whatsapp/zq;-><init>(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V

    .line 30
    sget v2, Lcom/whatsapp/App;->f:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 297
    const/4 v2, 0x5

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 244
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v8, :cond_2

    .line 37
    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    :cond_2
    if-eqz v8, :cond_8

    .line 309
    :cond_3
    const/4 v1, 0x1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 256
    const/4 v2, 0x3

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 82
    const/4 v3, 0x4

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 100
    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-nez v4, :cond_4

    if-nez v1, :cond_6

    :cond_4
    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v4, :cond_5

    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    iget-object v4, v0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_6

    if-nez v2, :cond_7

    iget-object v4, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    if-eqz v4, :cond_7

    iget-object v4, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 267
    :cond_6
    iput-object v1, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 170
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 144
    iput-object v3, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 175
    invoke-virtual {v0}, Lcom/whatsapp/zq;->c()V

    .line 275
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    :cond_7
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_8
    if-eqz v8, :cond_0

    .line 229
    :cond_9
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 237
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 268
    const/4 v6, 0x0

    .line 176
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 31
    :cond_a
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 65
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 202
    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(I)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 217
    new-instance v0, Lcom/whatsapp/uq;

    const-wide/16 v2, -0x2

    invoke-direct {v0, v2, v3, v1}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    .line 122
    invoke-virtual {p4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 399
    if-nez v0, :cond_b

    .line 393
    invoke-static {v1}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 153
    new-instance v0, Lcom/whatsapp/zq;

    const-wide/16 v2, -0x2

    sget-object v4, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x9

    aget-object v4, v4, v5

    invoke-interface {v7, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v7, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    sget-object v6, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v9, 0x7f090174

    invoke-virtual {v6, v9}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    .line 51
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v8, :cond_f

    .line 145
    :cond_b
    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 246
    iget-object v2, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-nez v2, :cond_c

    if-nez v1, :cond_d

    :cond_c
    iget-object v2, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 349
    :cond_d
    iput-object v1, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 41
    invoke-virtual {v0}, Lcom/whatsapp/zq;->c()V

    .line 127
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_e
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 346
    :cond_f
    if-eqz v8, :cond_a

    .line 183
    :cond_10
    if-eqz v7, :cond_11

    .line 284
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 7
    :cond_11
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0x1a

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0x19

    aget-object v1, v1, v2

    invoke-static {p1, v0, v1}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    invoke-static {p3, v0, v1}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 262
    iget-object v0, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {p4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v8, :cond_12

    .line 338
    :cond_13
    invoke-virtual {p4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    return-void

    .line 374
    :catch_0
    move-exception v0

    move-object v1, v6

    .line 116
    :goto_1
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x18

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 325
    if-eqz v1, :cond_11

    .line 135
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    .line 219
    :catchall_0
    move-exception v0

    move-object v7, v6

    :goto_2
    if-eqz v7, :cond_14

    .line 25
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_14
    throw v0

    .line 219
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v7, v1

    goto :goto_2

    .line 374
    :catch_1
    move-exception v0

    move-object v1, v7

    goto :goto_1
.end method

.method static a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 397
    invoke-static {v0}, Lcom/whatsapp/eg;->a(Z)I

    move-result v1

    if-nez v1, :cond_0

    .line 59
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 167
    const/4 v0, 0x0

    .line 221
    :cond_0
    return v0
.end method

.method private static a(I)Z
    .locals 1
    .parameter

    .prologue
    .line 358
    const/4 v0, 0x5

    if-lt p0, v0, :cond_0

    const/16 v0, 0x14

    if-le p0, v0, :cond_1

    .line 157
    :cond_0
    const/4 v0, 0x0

    .line 365
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static a(Lcom/whatsapp/vp;)Z
    .locals 21
    .parameter

    .prologue
    sget v9, Lcom/whatsapp/yq;->e:I

    .line 419
    const/4 v2, 0x1

    sput-boolean v2, Lcom/whatsapp/tp;->i:Z

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 344
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 361
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 97
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 413
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 99
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 422
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v3, 0x0

    invoke-virtual {v2, v15, v3}, Lcom/whatsapp/qp;->b(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 169
    invoke-virtual {v15}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x2c

    aget-object v3, v3, v4

    sget-object v4, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x20

    aget-object v4, v4, v5

    invoke-static {v2, v3, v4}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const/4 v2, 0x5

    new-array v0, v2, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/4 v2, 0x0

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v3, v3, v4

    aput-object v3, v17, v2

    const/4 v2, 0x1

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x8

    aget-object v3, v3, v4

    aput-object v3, v17, v2

    const/4 v2, 0x2

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xb

    aget-object v3, v3, v4

    aput-object v3, v17, v2

    const/4 v2, 0x3

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    aput-object v3, v17, v2

    const/4 v2, 0x4

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xe

    aget-object v3, v3, v4

    aput-object v3, v17, v2

    .line 164
    const/4 v2, 0x6

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0xa

    aget-object v3, v3, v5

    aput-object v3, v4, v2

    const/4 v2, 0x1

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x8

    aget-object v3, v3, v5

    aput-object v3, v4, v2

    const/4 v2, 0x2

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0xb

    aget-object v3, v3, v5

    aput-object v3, v4, v2

    const/4 v2, 0x3

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v3, v3, v5

    aput-object v3, v4, v2

    const/4 v2, 0x4

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0xe

    aget-object v3, v3, v5

    aput-object v3, v4, v2

    const/4 v2, 0x5

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0xd

    aget-object v3, v3, v5

    aput-object v3, v4, v2

    .line 301
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v18, v2, v3

    .line 360
    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "1"

    aput-object v3, v6, v2

    .line 347
    const/4 v8, 0x0

    .line 273
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v2}, Lcom/whatsapp/qp;->e()I

    move-result v19

    .line 119
    :try_start_0
    sget v2, Lcom/whatsapp/App;->f:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 91
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v3, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 225
    :goto_0
    if-nez v2, :cond_3

    .line 162
    :try_start_1
    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x2f

    aget-object v3, v3, v4

    invoke-static {v3}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    const/4 v3, 0x0

    .line 2
    if-eqz v2, :cond_0

    .line 55
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 380
    :cond_0
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 110
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 209
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 305
    invoke-virtual {v14}, Ljava/util/HashMap;->clear()V

    .line 83
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    move v2, v3

    .line 248
    :goto_1
    return v2

    .line 208
    :cond_1
    :try_start_2
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v2}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 280
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v3, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, v17

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    goto :goto_0

    .line 249
    :cond_2
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v3, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v7, 0x0

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v2

    goto :goto_0

    .line 404
    :cond_3
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x2a

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 350
    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x29

    aget-object v7, v3, v4

    move-object v3, v13

    move-object v4, v14

    move-object v5, v12

    move-object v6, v15

    invoke-static/range {v2 .. v7}, Lcom/whatsapp/tp;->a(Landroid/database/Cursor;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 111
    new-instance v4, Lcom/whatsapp/c9;

    move-object/from16 v0, p0

    invoke-direct {v4, v13, v0}, Lcom/whatsapp/c9;-><init>(Ljava/util/ArrayList;Lcom/whatsapp/vp;)V

    .line 290
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 129
    invoke-virtual {v14}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whatsapp/zq;

    .line 232
    iget-object v6, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-virtual {v0, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v9, :cond_4

    .line 355
    :cond_5
    new-instance v3, Lcom/whatsapp/d9;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v3, v14, v0, v1, v13}, Lcom/whatsapp/d9;-><init>(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/whatsapp/vp;Ljava/util/ArrayList;)V

    .line 320
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 53
    invoke-virtual {v4}, Ljava/lang/Thread;->join()V

    .line 89
    invoke-virtual {v3}, Ljava/lang/Thread;->join()V

    .line 94
    sget-boolean v3, Lcom/whatsapp/tp;->i:Z

    if-eqz v3, :cond_7

    .line 207
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_6

    .line 191
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v4, 0x0

    invoke-virtual {v3, v12, v4}, Lcom/whatsapp/qp;->a(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 34
    :cond_6
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v3}, Lcom/whatsapp/qp;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 46
    invoke-virtual {v15}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 373
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_7

    .line 121
    sget-object v4, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Lcom/whatsapp/qp;->a(Ljava/util/Collection;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 394
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x2b

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v10

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-boolean v3, Lcom/whatsapp/tp;->i:Z

    if-eqz v3, :cond_9

    const-string v3, ""

    :goto_2
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 348
    sget-boolean v3, Lcom/whatsapp/tp;->i:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    if-nez v3, :cond_a

    .line 401
    const/4 v3, 0x0

    .line 264
    if-eqz v2, :cond_8

    .line 403
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 133
    :cond_8
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 331
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 9
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 415
    invoke-virtual {v14}, Ljava/util/HashMap;->clear()V

    .line 248
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    move v2, v3

    goto/16 :goto_1

    .line 394
    :cond_9
    :try_start_4
    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x25

    aget-object v3, v3, v5

    goto :goto_2

    .line 114
    :cond_a
    if-eqz p0, :cond_b

    .line 362
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v15}, Ljava/util/HashMap;->size()I

    move-result v4

    add-int/2addr v3, v4

    move-object/from16 v0, p0

    invoke-interface {v0, v3}, Lcom/whatsapp/vp;->a(I)V

    .line 168
    :cond_b
    sget v3, Lcom/whatsapp/tp;->f:I

    if-lez v3, :cond_c

    .line 20
    sget-object v3, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 427
    :cond_c
    sget-object v3, Lcom/whatsapp/App;->vc:Landroid/os/Handler;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    .line 265
    if-eqz v2, :cond_d

    .line 329
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 396
    :cond_d
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 409
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 5
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 238
    invoke-virtual {v14}, Ljava/util/HashMap;->clear()V

    .line 395
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    .line 258
    :goto_3
    sget v2, Lcom/whatsapp/App;->f:I

    const/4 v3, 0x1

    if-lt v2, v3, :cond_17

    .line 435
    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "0"

    aput-object v3, v6, v2

    .line 335
    const/4 v8, 0x0

    .line 400
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v3, 0x0

    invoke-virtual {v2, v15, v3}, Lcom/whatsapp/qp;->b(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 180
    :try_start_5
    sget-object v2, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v3, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v7, 0x0

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v3

    .line 436
    if-nez v3, :cond_12

    .line 234
    if-eqz p0, :cond_e

    .line 11
    :try_start_6
    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-interface {v0, v1}, Lcom/whatsapp/vp;->b(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 190
    :cond_e
    const/4 v2, 0x1

    .line 382
    if-eqz v3, :cond_f

    .line 198
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_f
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    goto/16 :goto_1

    .line 392
    :catch_0
    move-exception v2

    move-object v3, v8

    .line 77
    :goto_4
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v6, 0x2d

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 363
    if-eqz v3, :cond_10

    .line 23
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 43
    :cond_10
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 437
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 431
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 245
    invoke-virtual {v14}, Ljava/util/HashMap;->clear()V

    .line 432
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    goto :goto_3

    .line 109
    :catchall_0
    move-exception v2

    :goto_5
    if-eqz v8, :cond_11

    .line 240
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 263
    :cond_11
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 319
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 61
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 179
    invoke-virtual {v14}, Ljava/util/HashMap;->clear()V

    .line 276
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->clear()V

    throw v2

    .line 185
    :cond_12
    :try_start_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x2e

    aget-object v4, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 418
    :cond_13
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 307
    const/4 v2, 0x2

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 85
    if-eqz v4, :cond_14

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lcom/whatsapp/tp;->a(I)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 423
    new-instance v5, Lcom/whatsapp/uq;

    const/4 v2, 0x0

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-direct {v5, v6, v7, v4}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    .line 367
    invoke-virtual {v15, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whatsapp/zq;

    .line 173
    if-nez v2, :cond_14

    .line 381
    invoke-static {v4}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 69
    new-instance v2, Lcom/whatsapp/zq;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x3

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    const/4 v7, 0x4

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v5, v4, v6, v7}, Lcom/whatsapp/zq;-><init>(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 302
    :cond_14
    if-eqz v9, :cond_13

    .line 410
    :cond_15
    if-eqz v3, :cond_16

    .line 426
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 159
    :cond_16
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    .line 260
    :cond_17
    sget-boolean v2, Lcom/whatsapp/tp;->i:Z

    if-eqz v2, :cond_18

    if-eqz p0, :cond_18

    .line 359
    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-interface {v0, v1}, Lcom/whatsapp/vp;->b(I)V

    .line 195
    :cond_18
    sget-boolean v2, Lcom/whatsapp/tp;->i:Z

    goto/16 :goto_1

    .line 271
    :catchall_1
    move-exception v2

    move-object v3, v8

    :goto_6
    if-eqz v3, :cond_19

    .line 154
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 73
    :cond_19
    invoke-virtual {v15}, Ljava/util/HashMap;->clear()V

    throw v2

    .line 271
    :catchall_2
    move-exception v2

    goto :goto_6

    .line 109
    :catchall_3
    move-exception v3

    move-object v8, v2

    move-object v2, v3

    goto/16 :goto_5

    :catchall_4
    move-exception v2

    move-object v8, v3

    goto/16 :goto_5

    .line 392
    :catch_1
    move-exception v3

    move-object/from16 v20, v3

    move-object v3, v2

    move-object/from16 v2, v20

    goto/16 :goto_4
.end method

.method public static a(Ljava/util/HashMap;Landroid/content/ContentResolver;)Z
    .locals 12
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/LinkedList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;>;",
            "Landroid/content/ContentResolver;",
            ")Z"
        }
    .end annotation

    .prologue
    const/4 v3, 0x3

    const/4 v11, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    sget v10, Lcom/whatsapp/yq;->e:I

    .line 430
    const/4 v0, 0x6

    new-array v2, v0, [Ljava/lang/String;

    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    aput-object v0, v2, v6

    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    aput-object v0, v2, v7

    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    aput-object v0, v2, v11

    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    aput-object v0, v2, v3

    const/4 v0, 0x4

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    const/4 v0, 0x5

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    .line 104
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 152
    new-array v4, v7, [Ljava/lang/String;

    const-string v0, "1"

    aput-object v0, v4, v6

    .line 160
    :try_start_0
    sget v0, Lcom/whatsapp/App;->f:I

    if-ne v0, v11, :cond_1

    .line 214
    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v9

    .line 123
    :goto_0
    if-nez v9, :cond_3

    .line 98
    if-eqz v9, :cond_0

    .line 239
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_0
    move v0, v6

    :goto_1
    return v0

    .line 201
    :cond_1
    :try_start_1
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/tp;->k:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    goto :goto_0

    .line 14
    :cond_2
    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/tp;->k:[Ljava/lang/String;

    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v3, v0, v3

    const/4 v5, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result-object v9

    goto :goto_0

    .line 124
    :cond_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 70
    :cond_4
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 215
    const/4 v0, 0x2

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 384
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 17
    new-instance v0, Lcom/whatsapp/zq;

    const/4 v2, 0x0

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-interface {v9, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    invoke-interface {v9, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    const/4 v6, 0x4

    invoke-interface {v9, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    .line 251
    sget v1, Lcom/whatsapp/App;->f:I

    if-ne v1, v11, :cond_5

    .line 151
    const/4 v1, 0x5

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-eq v1, v7, :cond_5

    .line 184
    if-eqz v10, :cond_4

    .line 308
    :cond_5
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v1, v1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedList;

    if-eqz v1, :cond_6

    .line 300
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v2, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/uq;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 140
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v1, v1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz v10, :cond_7

    .line 194
    :cond_6
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 383
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 231
    iget-object v0, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    :cond_7
    if-eqz v10, :cond_4

    .line 42
    :cond_8
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 40
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 274
    :try_start_3
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v8

    .line 36
    :cond_9
    :try_start_4
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 390
    sget-object v0, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 206
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(I)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 330
    new-instance v0, Lcom/whatsapp/zq;

    const-wide/16 v2, -0x2

    sget-object v4, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v5, 0x9

    aget-object v4, v4, v5

    invoke-interface {v8, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v8, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    sget-object v6, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v11, 0x7f090174

    invoke-virtual {v6, v11}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    .line 253
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v1, v1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedList;

    if-eqz v1, :cond_a

    .line 24
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v2, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/uq;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 224
    iget-object v1, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v1, v1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz v10, :cond_b

    .line 102
    :cond_a
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 115
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 343
    iget-object v0, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 357
    :cond_b
    if-eqz v10, :cond_9

    .line 292
    :cond_c
    if-eqz v8, :cond_d

    .line 417
    :try_start_5
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 323
    :cond_d
    :goto_2
    if-eqz v9, :cond_e

    .line 1
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_e
    move v0, v7

    goto/16 :goto_1

    .line 87
    :catch_0
    move-exception v0

    move-object v1, v8

    .line 313
    :goto_3
    :try_start_6
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 442
    if-eqz v1, :cond_d

    .line 200
    :try_start_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_2

    .line 33
    :catchall_0
    move-exception v0

    move-object v8, v9

    :goto_4
    if-eqz v8, :cond_f

    .line 113
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_f
    throw v0

    .line 241
    :catchall_1
    move-exception v0

    :goto_5
    if-eqz v8, :cond_10

    .line 298
    :try_start_8
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_10
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 33
    :catchall_2
    move-exception v0

    goto :goto_4

    .line 241
    :catchall_3
    move-exception v0

    move-object v8, v1

    goto :goto_5

    .line 87
    :catch_1
    move-exception v0

    move-object v1, v8

    goto :goto_3
.end method

.method public static b(I)Lcom/whatsapp/wp;
    .locals 13
    .parameter

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v7, 0x0

    sget v8, Lcom/whatsapp/yq;->e:I

    .line 402
    new-array v4, v0, [Ljava/lang/String;

    const-string v2, "0"

    aput-object v2, v4, v1

    .line 405
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 128
    if-gez p0, :cond_1

    move v6, v0

    .line 3
    :goto_0
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0, v9, v7}, Lcom/whatsapp/qp;->b(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 438
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/tp;->k:[Ljava/lang/String;

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v3, v3, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 84
    if-nez v1, :cond_2

    .line 340
    if-eqz v1, :cond_0

    .line 216
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 187
    :cond_0
    invoke-virtual {v9}, Ljava/util/HashMap;->clear()V

    move-object v0, v7

    :goto_1
    return-object v0

    :cond_1
    move v6, v1

    .line 128
    goto :goto_0

    .line 356
    :cond_2
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    .line 303
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x30

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 352
    new-instance v3, Ljava/util/ArrayList;

    if-eqz v6, :cond_9

    move v0, v2

    :goto_2
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 339
    :cond_3
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_7

    if-nez v6, :cond_4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v0, p0, :cond_7

    .line 78
    :cond_4
    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 223
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 376
    new-instance v5, Lcom/whatsapp/uq;

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    invoke-direct {v5, v10, v11, v4}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    .line 416
    invoke-virtual {v9, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 212
    if-nez v0, :cond_5

    .line 295
    invoke-static {v4}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 56
    new-instance v7, Lcom/whatsapp/zq;

    const/4 v10, 0x1

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x3

    invoke-interface {v1, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v11

    const/4 v12, 0x4

    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v7, v5, v10, v11, v12}, Lcom/whatsapp/zq;-><init>(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V

    .line 353
    iput-object v4, v7, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    .line 171
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    if-eqz v8, :cond_6

    .line 95
    :cond_5
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 155
    :cond_6
    if-eqz v8, :cond_3

    .line 197
    :cond_7
    if-eqz v1, :cond_8

    .line 8
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 407
    :cond_8
    invoke-virtual {v9}, Ljava/util/HashMap;->clear()V

    .line 142
    new-instance v0, Lcom/whatsapp/wp;

    invoke-direct {v0, v2, v3}, Lcom/whatsapp/wp;-><init>(ILjava/util/ArrayList;)V

    goto/16 :goto_1

    :cond_9
    move v0, p0

    .line 352
    goto :goto_2

    .line 27
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v7, :cond_a

    .line 49
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 125
    :cond_a
    invoke-virtual {v9}, Ljava/util/HashMap;->clear()V

    throw v0

    .line 27
    :catchall_1
    move-exception v0

    move-object v7, v1

    goto :goto_3
.end method

.method public static b()Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    sget v3, Lcom/whatsapp/yq;->e:I

    .line 252
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v2

    .line 112
    invoke-virtual {v2}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v4

    .line 282
    array-length v5, v4

    move v2, v1

    :cond_0
    if-ge v2, v5, :cond_4

    aget-object v6, v4, v2

    .line 189
    iget-object v7, v6, Landroid/accounts/Account;->type:Ljava/lang/String;

    sget-object v8, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v9, 0x28

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    sget-object v7, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v8, 0x26

    aget-object v7, v7, v8

    invoke-static {v6, v7}, Landroid/content/ContentResolver;->isSyncActive(Landroid/accounts/Account;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 178
    sget v1, Lcom/whatsapp/App;->f:I

    if-lt v1, v0, :cond_1

    .line 261
    if-eqz v3, :cond_2

    .line 314
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x27

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v6, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 364
    :cond_2
    :goto_0
    return v0

    .line 351
    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-eqz v3, :cond_0

    :cond_4
    move v0, v1

    .line 364
    goto :goto_0
.end method

.method private static b(Lcom/whatsapp/vp;)Z
    .locals 17
    .parameter

    .prologue
    .line 60
    const/4 v1, 0x1

    sput-boolean v1, Lcom/whatsapp/tp;->j:Z

    .line 196
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 93
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 63
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 441
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 277
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 90
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v2, 0x0

    invoke-virtual {v1, v13, v2}, Lcom/whatsapp/qp;->b(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 146
    invoke-virtual {v13}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x20

    aget-object v3, v3, v4

    invoke-static {v1, v2, v3}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const/4 v1, 0x5

    new-array v14, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    aput-object v2, v14, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    aput-object v2, v14, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    aput-object v2, v14, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    aput-object v2, v14, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    aput-object v2, v14, v1

    .line 186
    const/4 v1, 0x6

    new-array v3, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v2, v2, v4

    aput-object v2, v3, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x8

    aget-object v2, v2, v4

    aput-object v2, v3, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xb

    aget-object v2, v2, v4

    aput-object v2, v3, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v2, v2, v4

    aput-object v2, v3, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xe

    aget-object v2, v2, v4

    aput-object v2, v3, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0xd

    aget-object v2, v2, v4

    aput-object v2, v3, v1

    .line 278
    sget-object v1, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v4, v1, v2

    .line 296
    const/4 v1, 0x1

    new-array v5, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "1"

    aput-object v2, v5, v1

    .line 35
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v1}, Lcom/whatsapp/qp;->e()I

    move-result v15

    .line 12
    const/4 v7, 0x0

    .line 369
    :try_start_0
    sget v1, Lcom/whatsapp/App;->f:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 429
    sget-object v1, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v2, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v1

    .line 443
    :goto_0
    if-nez v1, :cond_3

    .line 332
    :try_start_1
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x24

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 64
    const/4 v2, 0x0

    .line 387
    if-eqz v1, :cond_0

    .line 117
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 310
    :cond_0
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 270
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 345
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    move v1, v2

    :goto_1
    return v1

    .line 434
    :cond_1
    :try_start_2
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v1}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 299
    sget-object v1, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v2, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v14

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    goto :goto_0

    .line 182
    :cond_2
    sget-object v1, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v2, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v6, 0x0

    move-object v3, v14

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v1

    goto :goto_0

    .line 158
    :cond_3
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x1f

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 96
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v3, 0x23

    aget-object v6, v2, v3

    move-object v2, v11

    move-object v3, v12

    move-object v4, v10

    move-object v5, v13

    invoke-static/range {v1 .. v6}, Lcom/whatsapp/tp;->a(Landroid/database/Cursor;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 257
    :try_start_4
    sget-object v2, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    move-object/from16 v0, p0

    invoke-static {v2, v11, v0}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;Ljava/util/ArrayList;Lcom/whatsapp/vp;)V

    .line 445
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 281
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v3, 0x0

    invoke-virtual {v2, v10, v3}, Lcom/whatsapp/qp;->a(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 250
    :cond_4
    invoke-virtual {v13}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 337
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v13}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/qp;->a(Ljava/util/Collection;Landroid/database/sqlite/SQLiteTransactionListener;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_4 .. :try_end_4} :catch_1

    .line 326
    :cond_5
    :goto_2
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x22

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v8

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-boolean v2, Lcom/whatsapp/tp;->j:Z

    if-eqz v2, :cond_9

    const-string v2, ""

    :goto_3
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 172
    sget-boolean v2, Lcom/whatsapp/tp;->j:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    if-nez v2, :cond_a

    .line 47
    const/4 v2, 0x0

    .line 312
    if-eqz v1, :cond_6

    .line 210
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 342
    :cond_6
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 205
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 272
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    move v1, v2

    goto/16 :goto_1

    .line 16
    :catch_0
    move-exception v2

    .line 428
    :try_start_6
    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x1e

    aget-object v3, v3, v4

    invoke-static {v3, v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    if-eqz p0, :cond_7

    .line 266
    invoke-interface/range {p0 .. p0}, Lcom/whatsapp/vp;->a()V

    .line 377
    :cond_7
    const/4 v2, 0x0

    sput-boolean v2, Lcom/whatsapp/tp;->j:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_2

    .line 440
    :catch_1
    move-exception v2

    move-object/from16 v16, v2

    move-object v2, v1

    move-object/from16 v1, v16

    .line 29
    :goto_4
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 321
    :catchall_0
    move-exception v1

    move-object v7, v2

    :goto_5
    if-eqz v7, :cond_8

    .line 58
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 204
    :cond_8
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 48
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 132
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    throw v1

    .line 326
    :cond_9
    :try_start_8
    sget-object v2, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x25

    aget-object v2, v2, v4

    goto :goto_3

    .line 388
    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v13}, Ljava/util/HashMap;->size()I

    move-result v3

    add-int/2addr v2, v3

    move-object/from16 v0, p0

    invoke-interface {v0, v2}, Lcom/whatsapp/vp;->a(I)V

    .line 254
    sget v2, Lcom/whatsapp/tp;->f:I

    if-lez v2, :cond_b

    .line 354
    sget-object v2, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 38
    :cond_b
    sget-object v2, Lcom/whatsapp/App;->vc:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 420
    if-eqz v1, :cond_c

    .line 193
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 76
    :cond_c
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 143
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 192
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 188
    :goto_6
    sget-boolean v1, Lcom/whatsapp/tp;->j:Z

    if-eqz v1, :cond_d

    if-eqz p0, :cond_d

    .line 439
    move-object/from16 v0, p0

    invoke-interface {v0, v15}, Lcom/whatsapp/vp;->b(I)V

    .line 279
    :cond_d
    sget-boolean v1, Lcom/whatsapp/tp;->j:Z

    goto/16 :goto_1

    .line 72
    :catch_2
    move-exception v1

    .line 211
    :goto_7
    :try_start_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/16 v4, 0x21

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 366
    if-eqz p0, :cond_e

    .line 222
    invoke-interface/range {p0 .. p0}, Lcom/whatsapp/vp;->a()V

    .line 163
    :cond_e
    const/4 v1, 0x0

    sput-boolean v1, Lcom/whatsapp/tp;->j:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 414
    if-eqz v7, :cond_f

    .line 269
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 406
    :cond_f
    invoke-virtual {v13}, Ljava/util/HashMap;->clear()V

    .line 371
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 370
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    goto :goto_6

    .line 321
    :catchall_1
    move-exception v1

    goto/16 :goto_5

    :catchall_2
    move-exception v2

    move-object v7, v1

    move-object v1, v2

    goto/16 :goto_5

    .line 72
    :catch_3
    move-exception v2

    move-object v7, v1

    move-object v1, v2

    goto :goto_7

    .line 440
    :catch_4
    move-exception v1

    move-object v2, v7

    goto/16 :goto_4
.end method

.method static b(Z)Z
    .locals 0
    .parameter

    .prologue
    .line 166
    sput-boolean p0, Lcom/whatsapp/tp;->i:Z

    return p0
.end method

.method public static c(I)Ljava/lang/Integer;
    .locals 7
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v6, 0x0

    .line 57
    new-array v4, v2, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "0"

    aput-object v1, v4, v0

    .line 149
    if-ne p0, v2, :cond_1

    .line 317
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/tp;->k:[Ljava/lang/String;

    sget-object v3, Lcom/whatsapp/tp;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v3, v3, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 327
    :goto_0
    if-nez v1, :cond_2

    .line 243
    if-eqz v1, :cond_0

    .line 236
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    move-object v0, v6

    .line 287
    :goto_1
    return-object v0

    .line 141
    :cond_1
    :try_start_1
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/tp;->k:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_0

    .line 118
    :cond_2
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v0

    .line 372
    if-eqz v1, :cond_3

    .line 227
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 287
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    .line 255
    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v6, :cond_4

    .line 213
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    .line 255
    :catchall_1
    move-exception v0

    move-object v6, v1

    goto :goto_2
.end method

.method public static c()V
    .locals 2

    .prologue
    .line 21
    new-instance v0, Lcom/whatsapp/e9;

    invoke-direct {v0}, Lcom/whatsapp/e9;-><init>()V

    .line 50
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 62
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 444
    return-void
.end method

.method static d(I)I
    .locals 0
    .parameter

    .prologue
    .line 150
    sput p0, Lcom/whatsapp/tp;->h:I

    return p0
.end method
