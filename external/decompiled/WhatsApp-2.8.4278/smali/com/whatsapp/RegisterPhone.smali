.class public Lcom/whatsapp/RegisterPhone;
.super Lcom/whatsapp/VerifyNumber;
.source "RegisterPhone.java"


# static fields
.field private static final F:[Ljava/lang/String;

.field private static q:Ljava/lang/String;

.field private static r:Ljava/lang/String;

.field private static s:I

.field private static t:Ljava/lang/String;


# instance fields
.field A:Z

.field B:Landroid/widget/EditText;

.field C:Landroid/widget/EditText;

.field D:Landroid/widget/EditText;

.field E:Landroid/app/ProgressDialog;

.field private u:Landroid/text/TextWatcher;

.field private v:Landroid/text/TextWatcher;

.field private w:Ljava/lang/String;

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x71

    const/16 v1, 0x57

    const/16 v2, 0x37

    const/16 v4, 0x21

    const/4 v6, 0x0

    new-array v9, v2, [Ljava/lang/String;

    const-string v0, "wG\u001f\u001eO2\n"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e4TX\u0013@3\u001a\u001b\u0014O0C\u001fQB4\n"

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

    const-string v0, "wG\u001fL"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e9B\u001a^D%E\u0018\u0003\u000e2Z\u0007\u0005XwT\u0014L"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e4TX\u0013@3\u001a\u0019\u0010L2\u0017"

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

    const-string v0, "\u000bs"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e9B\u001a^D%E\u0018\u0003\u000e>Y\u0001\u0010M>SW\u0012Bj"

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

    const-string v0, "wE\u0012\u0002\u001c"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e2E\u0005\u001eSwC\u0005\u0018L\u001bR\u0016\u0015H9P-\u0014S8\u0017\u0018\u0003\u0001;X\u0018\u001aT\'t\u0018\u0004O#E\u000e?@:RW\u0017S8ZW2N\"Y\u0003\u0003X\u0007_\u0018\u001fD\u001eY\u0011\u001e\u0001\u001ex2\tB2G\u0003\u0018N9"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e9B\u001a^D%E\u0018\u0003\u000e;R\u0019\u0016U?\u0017\u0014\u0012\u001c"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\\Q?X\u0019\u0014"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\\Q?X\u0019\u0014\u0015"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e1X\u0005\u001c@#C\u0012\u0003\u000c2O\u0014\u0014Q#^\u0018\u001f"

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

    const-string v0, "wKW"

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

    const-string v0, "wQ\u0016\u0018M2SW\u0005Nw[\u0018\u001eJ\"G4\u001eT9C\u0005\u0008`5U\u00053X\u0019V\u001a\u0014\u00011E\u0018\u001c\u0001\u0014X\u0002\u001fU%N\'\u0019N9R>\u001fG8"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e4X\u0002\u001fU%NM"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e%R\u0004\u0014UzD\u0003\u0010U2"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\u0001I8Y\u0012^@4C\u0005\u0014R\"[\u0003^B8Z\u001a\u0018UwQ\u0016\u0018M2S"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0014\u001eT9C\u0005\u0008~4X\u0013\u0014~\'X\u0004\u0018U>X\u0019"

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

    const-string v0, "4T"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u001e\u001fQ\"C(\u0012N\"Y\u0003\u0003X\u0008T\u0018\u0015D"

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

    const-string v0, "4X\u0002\u001fU%N(\u001f@:R"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0007\u0019N9R(\u001fT:U\u0012\u0003~\'X\u0004\u0018U>X\u0019"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0014\u001eT9C\u0005\u0008~4X\u0013\u0014"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0007\u0003D!h\u0014\u001eT9C\u0005\u0008~4X\u0013\u0014"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\u0001I8Y\u0012^Q6B\u0004\u0014\u000e4X\u001a\u001cH#\u0017\u0011\u0010H;R\u0013"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0007\u0019N9R(\u001fT:U\u0012\u0003"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0019\u001e~$R\u001b\u0017~$R\u0019\u0015"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e\'V\u0002\u0002Dw"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0001\u0014S>Q\u001e\u0012@#^\u0018\u001f~$C\u0016\u0005D"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u001e\u001fQ\"C(\u0001I8Y\u0012.O\"Z\u0015\u0014S"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\u0001I8Y\u0012^R6A\u0012\u0001S2A\u0007\u0019N9R\u0019\u0004LxT\u0018\u001cL>CW\u0017@>[\u0012\u0015"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0007\u0003D!h\u0007\u0019N9R(\u001fT:U\u0012\u0003"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e%R\u0004\u0004L2\u0017"

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

    aput-object v0, v9, v4

    const/16 v10, 0x22

    const-string v0, "%R\u0010\u0018R#R\u0005\u0001I8Y\u0012^R6A\u0012\u0002D%A\u0012\u0003Q2E\u001a\u0018R$^\u0018\u001f\u000e4X\u001a\u001cH#\u0017\u0011\u0010H;R\u0013"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\u0001I8Y\u0012^R6A\u0012\u0001S2A\u0014\u0012\u000e4X\u001a\u001cH#\u0017\u0011\u0010H;R\u0013"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e8Y3\u0014R#E\u0018\u0008\t~"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e>D\u0018K\u0001"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0005\u0014R2C\u0004\u0005@#R"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e4E\u0012\u0010U2\u0018\u0000\u0003N9PZ\u0002U6C\u0012QC8B\u0019\u0012DwC\u0018QL6^\u0019"

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

    const-string v0, "4X\u001a_V?V\u0003\u0002@\'GY#D0^\u0004\u0005D%g\u001f\u001eO2\u0019\u0014\u001dD6E(\u0001I8Y\u0012.O\"Z\u0015\u0014S"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e>Y\u0007\u0004U\u0008T\u0014^B8Z\u001a\u0018UwQ\u0016\u0018M2S"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e4[\u0018\u0012Jz@\u0005\u001eO0"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e8Y4\u0003D6C\u0012Y\u0008"

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

    const-string v0, "wQ\u0016\u0018M2SW\u0005Nw[\u0018\u001eJ\"G4\u0010M;^\u0019\u0016b8S\u0012QG%X\u001aQb8B\u0019\u0005S.g\u001f\u001eO2~\u0019\u0017N"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\\Q?X\u0019\u0014\u0013"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e3^\u0016\u001dN0\u0018\u0014\u001dN4\\Z\u0006S8Y\u0010"

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

    const-string v0, "]="

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

    const-string v0, "f\u0002BD\u0014e\u0006O@\u0012b"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\\Q?X\u0019\u0014\u0012"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e3^\u0016\u001dN0\u0018\u0002\u001fS2T\u0018\u0007D%V\u0015\u001dDzR\u0005\u0003N%"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e\"Y\u0005\u0014B8A\u0012\u0003@5[\u0012^Q8D\u0004\u0018C;RZ\u0005@5[\u0012\u0005"

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

    const-string v0, "d\u0006GH\u0018b\u0007GA\u0011g\u0007GA\u0011"

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

    const-string v0, "%R\u0010\u0018R#R\u0005^Q?X\u0019\u0014\u000e3^\u0016\u001dN0\u0018\u0015\u0010O"

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

    const-string v0, "%R\u0010\u0018R#R\u0005\u0001I8Y\u0012^R6A\u0012\u0002U6C\u0012^B8Z\u001a\u0018UwQ\u0016\u0018M2S"

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

    sput-object v9, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    .line 257
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    .line 255
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    .line 126
    const/4 v0, 0x7

    sput v0, Lcom/whatsapp/RegisterPhone;->s:I

    .line 119
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    return-void

    .line -1
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
    const/16 v0, 0x77

    goto :goto_37

    :pswitch_3
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_38

    :pswitch_7
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_39

    :pswitch_b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_3a

    :pswitch_f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_3b

    :pswitch_13
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_3c

    :pswitch_17
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_3d

    :pswitch_1b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_3e

    :pswitch_1f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_3f

    :pswitch_23
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_40

    :pswitch_27
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_41

    :pswitch_2b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_42

    :pswitch_2f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_43

    :pswitch_33
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_44

    :pswitch_37
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_45

    :pswitch_3b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_46

    :pswitch_3f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_47

    :pswitch_43
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_48

    :pswitch_47
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_49

    :pswitch_4b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_4a

    :pswitch_4f
    move v0, v3

    goto :goto_4a

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_4b
    xor-int/2addr v0, v11

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
    const/16 v0, 0x77

    goto :goto_4b

    :pswitch_53
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_4c

    :pswitch_57
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_4d

    :pswitch_5b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_4e

    :pswitch_5f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_4f

    :pswitch_63
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_50

    :pswitch_67
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_51

    :pswitch_6b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_52

    :pswitch_6f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_53

    :pswitch_73
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_54

    :pswitch_77
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_55

    :pswitch_7b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_56

    :pswitch_7f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_57

    :pswitch_83
    move v0, v3

    goto :goto_57

    :cond_21
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_58
    xor-int/2addr v0, v10

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
    const/16 v0, 0x77

    goto :goto_58

    :pswitch_87
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_59

    :pswitch_8b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_5a

    :pswitch_8f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_5b

    :pswitch_93
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_5c

    :pswitch_97
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_5d

    :pswitch_9b
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_5e

    :pswitch_9f
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_5f

    :pswitch_a3
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_60

    :pswitch_a7
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_61

    :pswitch_ab
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_62

    :pswitch_af
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_63

    :pswitch_b3
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_64

    :pswitch_b7
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_65

    :pswitch_bb
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_66

    :pswitch_bf
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_67

    :pswitch_c3
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_68

    :pswitch_c7
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_69

    :pswitch_cb
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_6a

    :pswitch_cf
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_6b

    :pswitch_d3
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_6c

    :pswitch_d7
    move v0, v3

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
    const/16 v0, 0x77

    goto :goto_6d

    :pswitch_db
    move v0, v3

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
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 33
    invoke-direct {p0}, Lcom/whatsapp/VerifyNumber;-><init>()V

    .line 275
    iput-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->x:Z

    .line 186
    iput-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->y:Z

    .line 194
    iput-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->z:Z

    .line 54
    iput-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->A:Z

    .line 298
    return-void
.end method

.method static a(I)I
    .locals 0
    .parameter

    .prologue
    .line 245
    sput p0, Lcom/whatsapp/RegisterPhone;->s:I

    return p0
.end method

.method public static a(Landroid/widget/EditText;)I
    .locals 6
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 241
    invoke-virtual {p0}, Landroid/widget/EditText;->isFocused()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    const/4 v1, -0x1

    .line 109
    :cond_0
    :goto_0
    return v1

    .line 196
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move v1, v0

    .line 252
    :cond_2
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v4

    if-ge v0, v4, :cond_0

    .line 311
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    .line 268
    if-eqz v2, :cond_0

    .line 180
    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x39

    if-gt v4, v5, :cond_4

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-lt v4, v5, :cond_4

    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 17
    :cond_4
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_2

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 8
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x7

    const/4 v0, 0x5

    const/4 v1, 0x3

    const/4 v2, 0x1

    .line 250
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v5, v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v1, :cond_2

    .line 208
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    move v0, v4

    .line 258
    :cond_1
    :goto_0
    return v0

    .line 290
    :cond_2
    invoke-static {p0}, Lcom/whatsapp/jp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v2, v2, v4

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    move v0, v1

    .line 258
    goto :goto_0

    .line 151
    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v1, v1, v4

    const-string v4, ""

    invoke-virtual {p1, v1, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_5

    .line 226
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 22
    const/4 v0, 0x4

    goto :goto_0

    .line 20
    :cond_5
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 218
    sget-object v4, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v5, 0x5

    aget-object v4, v4, v5

    const-string v5, ""

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/whatsapp/jp;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 125
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v1, v5}, Lcom/whatsapp/jp;->a(II)I

    move-result v5

    .line 301
    if-eqz v5, :cond_6

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v7, 0x6

    aget-object v6, v6, v7

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v6, 0x0

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 93
    if-ltz v5, :cond_1

    const/4 v0, 0x6

    goto/16 :goto_0

    .line 280
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0xf

    if-gt v0, v1, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x8

    if-ge v0, v1, :cond_8

    .line 131
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v3

    .line 201
    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 230
    goto/16 :goto_0

    .line 279
    :catch_0
    move-exception v0

    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x8

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move v0, v3

    .line 170
    goto/16 :goto_0
.end method

.method private static a(Landroid/widget/EditText;I)V
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 303
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move v1, v0

    .line 248
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_2

    if-lez p1, :cond_2

    .line 304
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x39

    if-gt v4, v5, :cond_1

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-lt v4, v5, :cond_1

    .line 271
    add-int/lit8 p1, p1, -0x1

    .line 238
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 162
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 254
    :cond_2
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 159
    return-void
.end method

.method static a(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 216
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->d()V

    return-void
.end method

.method static a(Lcom/whatsapp/RegisterPhone;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/whatsapp/RegisterPhone;->b(Ljava/lang/String;)V

    return-void
.end method

.method static a(Lcom/whatsapp/RegisterPhone;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 185
    invoke-direct {p0, p1}, Lcom/whatsapp/RegisterPhone;->b(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3
    .parameter

    .prologue
    .line 200
    iput-boolean p1, p0, Lcom/whatsapp/RegisterPhone;->y:Z

    .line 173
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 42
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    iget-boolean v2, p0, Lcom/whatsapp/RegisterPhone;->y:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 55
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x22

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 24
    :cond_0
    return-void
.end method

.method static b(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 58
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->w:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/widget/EditText;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 223
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    .line 287
    const/4 v2, -0x1

    if-le p1, v2, :cond_0

    if-gt p1, v1, :cond_0

    .line 77
    invoke-virtual {p0}, Landroid/widget/EditText;->requestFocus()Z

    .line 292
    invoke-static {p0, p1}, Lcom/whatsapp/RegisterPhone;->a(Landroid/widget/EditText;I)V

    if-eqz v0, :cond_2

    .line 110
    :cond_0
    if-le p1, v1, :cond_1

    .line 284
    invoke-virtual {p0}, Landroid/widget/EditText;->requestFocus()Z

    .line 101
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V

    if-eqz v0, :cond_2

    .line 112
    :cond_1
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 137
    :cond_2
    return-void
.end method

.method static b(Lcom/whatsapp/RegisterPhone;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 168
    invoke-direct {p0, p1}, Lcom/whatsapp/RegisterPhone;->a(Z)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5
    .parameter

    .prologue
    const/16 v3, 0xf

    const/16 v4, 0xc

    .line 195
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/whatsapp/jp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->v:Landroid/text/TextWatcher;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->v:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 146
    :cond_0
    new-instance v0, Lcom/whatsapp/zx;

    invoke-static {p1}, Lcom/whatsapp/jp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whatsapp/zx;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->v:Landroid/text/TextWatcher;

    .line 225
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->v:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 161
    :goto_1
    return-void

    .line 265
    :catch_0
    move-exception v0

    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 272
    :catch_1
    move-exception v0

    .line 71
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 183
    :catch_2
    move-exception v0

    .line 299
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private b(Z)V
    .locals 2
    .parameter

    .prologue
    .line 240
    sget-object v0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const/4 v0, 0x7

    sput v0, Lcom/whatsapp/RegisterPhone;->s:I

    .line 85
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->d()V

    .line 263
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->a()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 49
    :cond_0
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 99
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/RegisterName;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->startActivity(Landroid/content/Intent;)V

    .line 197
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->finish()V

    .line 190
    return-void
.end method

.method static c(Lcom/whatsapp/RegisterPhone;)Landroid/text/TextWatcher;
    .locals 1
    .parameter

    .prologue
    .line 237
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->u:Landroid/text/TextWatcher;

    return-object v0
.end method

.method static d(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter

    .prologue
    .line 107
    sput-object p0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    return-object p0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 264
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 184
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1d

    aget-object v1, v1, v2

    sget v2, Lcom/whatsapp/RegisterPhone;->s:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 43
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 228
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x36

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 213
    :cond_0
    return-void
.end method

.method static e(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 274
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter

    .prologue
    .line 296
    sput-object p0, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    return-object p0
.end method

.method private e()V
    .locals 3

    .prologue
    .line 21
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 28
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x20

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 121
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 205
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x1f

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 165
    :cond_0
    return-void
.end method

.method static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter

    .prologue
    .line 7
    sput-object p0, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    return-object p0
.end method

.method static f(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 124
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->e()V

    return-void
.end method

.method private g()Ljava/lang/String;
    .locals 3

    .prologue
    .line 217
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 160
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x20

    aget-object v1, v1, v2

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 273
    return-object v0
.end method

.method static g(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 295
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->i()V

    return-void
.end method

.method private h()Ljava/lang/String;
    .locals 3

    .prologue
    .line 211
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 144
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v1, v1, v2

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 123
    return-object v0
.end method

.method static h(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 221
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->l()V

    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 3
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 188
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x18

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 174
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 306
    :cond_0
    return-void
.end method

.method private j()Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 127
    invoke-virtual {p0, v3}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 83
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 65
    return v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->A:Z

    if-eqz v0, :cond_0

    .line 73
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-super {p0, v0}, Lcom/whatsapp/VerifyNumber;->a(Ljava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 259
    :cond_0
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-super {p0, v0}, Lcom/whatsapp/VerifyNumber;->a(Ljava/lang/String;)V

    .line 128
    :cond_1
    return-void
.end method

.method private l()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 51
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 307
    const/4 v0, 0x7

    sput v0, Lcom/whatsapp/RegisterPhone;->s:I

    .line 282
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->d()V

    .line 210
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->e(Ljava/lang/String;)V

    .line 198
    sput-object v2, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/RegisterPhone;->a(Z)V

    .line 270
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/RegisterPhone;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 305
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0, v2}, Lcom/whatsapp/App;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method static m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    sget-object v0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    return-object v0
.end method

.method static n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    return-object v0
.end method

.method static o()I
    .locals 1

    .prologue
    .line 88
    sget v0, Lcom/whatsapp/RegisterPhone;->s:I

    return v0
.end method

.method static p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v5, 0x16

    const/4 v4, -0x1

    .line 157
    if-nez p1, :cond_1

    .line 75
    if-ne p2, v4, :cond_1

    .line 6
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    .line 66
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->w:Ljava/lang/String;

    .line 52
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    sget-object v1, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 220
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 286
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->w:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whatsapp/RegisterPhone;->b(Ljava/lang/String;)V

    .line 288
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 39
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 179
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    sget-object v3, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 214
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    sget-object v3, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 69
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v4, :cond_0

    .line 12
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v0, v0, v5

    const v2, 0x7fffffff

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 219
    :cond_0
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x12

    aget-object v0, v0, v2

    invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 31
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->u:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 231
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9
    .parameter

    .prologue
    const/4 v1, 0x0

    const/16 v8, 0x14

    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v5, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 30
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x2b

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 163
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyNumber;->onCreate(Landroid/os/Bundle;)V

    .line 297
    const v2, 0x7f030053

    invoke-virtual {p0, v2}, Lcom/whatsapp/RegisterPhone;->setContentView(I)V

    .line 203
    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v2

    .line 177
    if-eq v2, v6, :cond_1

    .line 44
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x27

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 53
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->startActivity(Landroid/content/Intent;)V

    .line 236
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->finish()V

    .line 277
    :cond_0
    :goto_0
    return-void

    .line 133
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 302
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x26

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 154
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->l()V

    .line 193
    :cond_2
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x28

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 153
    iput-boolean v6, p0, Lcom/whatsapp/RegisterPhone;->z:Z

    if-eqz v0, :cond_5

    .line 132
    :cond_3
    iput-boolean v5, p0, Lcom/whatsapp/RegisterPhone;->z:Z

    if-eqz v0, :cond_5

    .line 78
    :cond_4
    iput-boolean v5, p0, Lcom/whatsapp/RegisterPhone;->z:Z

    .line 80
    :cond_5
    sget-object v0, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->p:Landroid/telephony/PhoneStateListener;

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 138
    const v0, 0x7f0d00f7

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    .line 244
    const v0, 0x7f0d00f5

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    .line 63
    const v0, 0x7f0d00f8

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    .line 118
    const v0, 0x7f0d00f3

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f09006e

    invoke-virtual {p0, v2}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    const v0, 0x7f0d00f6

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f09006d

    invoke-virtual {p0, v2}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    new-array v0, v6, [Landroid/text/InputFilter;

    .line 143
    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, v7}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v0, v5

    .line 261
    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 62
    const/16 v0, 0x11

    .line 135
    new-array v2, v6, [Landroid/text/InputFilter;

    .line 36
    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v3, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v3, v2, v5

    .line 147
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 212
    invoke-virtual {p0, v5}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 16
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    if-nez v0, :cond_6

    .line 111
    sget-object v0, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_6

    .line 26
    :try_start_0
    invoke-static {v0}, Lcom/whatsapp/jp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 134
    :goto_1
    if-eqz v0, :cond_6

    .line 60
    invoke-virtual {p0, v5}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 289
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 166
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_6

    .line 253
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x29

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 242
    :cond_6
    new-instance v0, Lcom/whatsapp/g2;

    invoke-direct {v0, p0}, Lcom/whatsapp/g2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->u:Landroid/text/TextWatcher;

    .line 114
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->u:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 178
    new-instance v0, Lcom/whatsapp/h2;

    invoke-direct {v0, p0}, Lcom/whatsapp/h2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    .line 113
    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 94
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0, v6}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 120
    const v0, 0x7f0d00f9

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 108
    new-instance v1, Lcom/whatsapp/i2;

    invoke-direct {v1, p0}, Lcom/whatsapp/i2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    sget-object v0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 145
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    sget-object v1, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 262
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 247
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_8

    .line 294
    invoke-direct {p0, v0}, Lcom/whatsapp/RegisterPhone;->b(Ljava/lang/String;)V

    .line 209
    :cond_8
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->j()Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->y:Z

    .line 308
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    const/16 v1, 0x1e0

    if-gt v0, v1, :cond_9

    .line 267
    invoke-virtual {p0}, Lcom/whatsapp/RegisterPhone;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 72
    :cond_9
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x2a

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 164
    const/16 v0, 0x71

    invoke-static {p0, v0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;I)V

    goto/16 :goto_0

    .line 67
    :catch_0
    move-exception v2

    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x25

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x2c

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move-object v0, v1

    goto/16 :goto_1
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 8
    .parameter

    .prologue
    const v7, 0x7f09000e

    const/16 v6, 0x21

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 189
    sparse-switch p1, :sswitch_data_0

    .line 276
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyNumber;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 309
    :goto_0
    return-object v0

    .line 41
    :sswitch_0
    const v0, 0x7f090070

    new-array v1, v5, [Ljava/lang/Object;

    sget-object v2, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    sget-object v3, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/whatsapp/RegisterPhone;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 249
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 141
    new-instance v2, Landroid/text/style/StyleSpan;

    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v2, v4, v0, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 117
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0, v7}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 187
    new-instance v2, Landroid/text/style/StyleSpan;

    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    invoke-virtual {v0, v2, v4, v3, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 175
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/c2;

    invoke-direct {v2, p0}, Lcom/whatsapp/c2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09008b

    new-instance v2, Lcom/whatsapp/b2;

    invoke-direct {v2, p0}, Lcom/whatsapp/b2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 215
    :sswitch_1
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 136
    const v1, 0x7f09004f

    invoke-virtual {p0, v1}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 23
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 8
    invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 235
    iput-object v0, p0, Lcom/whatsapp/RegisterPhone;->E:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 104
    :sswitch_2
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x32

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 96
    const v0, 0x7f090085

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 251
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x2d

    aget-object v0, v0, v2

    .line 199
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x30

    aget-object v2, v2, v3

    invoke-static {}, Lcom/whatsapp/VerifyNumber;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x34

    aget-object v2, v2, v3

    sget-object v3, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x2f

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f090033

    invoke-virtual {p0, v1}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 142
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x33

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 97
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x31

    aget-object v0, v0, v2

    .line 98
    :cond_0
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090050

    new-instance v3, Lcom/whatsapp/e2;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/e2;-><init>(Lcom/whatsapp/RegisterPhone;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000c

    new-instance v2, Lcom/whatsapp/d2;

    invoke-direct {v2, p0}, Lcom/whatsapp/d2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 82
    :sswitch_3
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x35

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 13
    sget-object v0, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/VerifyNumber;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 234
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f090095

    invoke-virtual {p0, v2}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f090096

    invoke-virtual {p0, v1}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/f2;

    invoke-direct {v1, p0}, Lcom/whatsapp/f2;-><init>(Lcom/whatsapp/RegisterPhone;)V

    invoke-virtual {v0, v7, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 38
    :sswitch_4
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x2e

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 309
    invoke-static {p0}, Lcom/whatsapp/Conversations;->a(Landroid/app/Activity;)Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 189
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0x15 -> :sswitch_0
        0x16 -> :sswitch_2
        0x17 -> :sswitch_3
        0x71 -> :sswitch_4
    .end sparse-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 122
    const v0, 0x7f090050

    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 57
    const v1, 0x7f0203c6

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 130
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 246
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x24

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 50
    sget-object v0, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/whatsapp/RegisterPhone;->p:Landroid/telephony/PhoneStateListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/RegisterPhone;->x:Z

    .line 171
    invoke-super {p0}, Lcom/whatsapp/VerifyNumber;->onDestroy()V

    .line 35
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1
    .parameter

    .prologue
    .line 227
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 25
    const/4 v0, 0x0

    .line 310
    :goto_0
    return v0

    .line 278
    :pswitch_0
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->k()V

    .line 310
    const/4 v0, 0x1

    goto :goto_0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 3

    .prologue
    .line 84
    invoke-super {p0}, Lcom/whatsapp/VerifyNumber;->onPause()V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1c

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/whatsapp/RegisterPhone;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 81
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 266
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x17

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 89
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1a

    aget-object v1, v1, v2

    sget-object v2, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 169
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1d

    aget-object v1, v1, v2

    sget v2, Lcom/whatsapp/RegisterPhone;->s:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 148
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1e

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 100
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x14

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 202
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    iget-boolean v2, p0, Lcom/whatsapp/RegisterPhone;->y:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 293
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    invoke-static {v2}, Lcom/whatsapp/RegisterPhone;->a(Landroid/widget/EditText;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 102
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x16

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-static {v2}, Lcom/whatsapp/RegisterPhone;->a(Landroid/widget/EditText;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 156
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    sget-object v0, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v1, 0x19

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 285
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/RegisterPhone;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method public onResume()V
    .locals 9

    .prologue
    const/4 v8, 0x7

    const/4 v7, 0x1

    const/4 v6, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 64
    invoke-super {p0}, Lcom/whatsapp/VerifyNumber;->onResume()V

    .line 115
    invoke-virtual {p0, v4}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 150
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x17

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    .line 87
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    .line 204
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    sput v2, Lcom/whatsapp/RegisterPhone;->s:I

    .line 129
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v2}, Lcom/whatsapp/App;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/RegisterPhone;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/whatsapp/RegisterPhone;->t:Ljava/lang/String;

    .line 182
    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whatsapp/RegisterPhone;->y:Z

    .line 149
    iget-boolean v2, p0, Lcom/whatsapp/RegisterPhone;->z:Z

    if-eqz v2, :cond_0

    .line 191
    iput-boolean v4, p0, Lcom/whatsapp/RegisterPhone;->z:Z

    .line 37
    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz v0, :cond_1

    .line 207
    :cond_0
    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x1e

    aget-object v3, v3, v4

    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 91
    :cond_1
    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x14

    aget-object v3, v3, v4

    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x16

    aget-object v3, v3, v4

    invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v2, v3}, Lcom/whatsapp/RegisterPhone;->b(Landroid/widget/EditText;I)V

    .line 243
    iget-object v2, p0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    sget-object v3, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v4, 0x12

    aget-object v3, v3, v4

    invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v2, v1}, Lcom/whatsapp/RegisterPhone;->b(Landroid/widget/EditText;I)V

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v3, 0x21

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/whatsapp/RegisterPhone;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 34
    sget v1, Lcom/whatsapp/RegisterPhone;->s:I

    packed-switch v1, :pswitch_data_0

    .line 283
    :cond_2
    :goto_0
    sget-object v0, Lcom/whatsapp/App;->gb:Landroid/app/NotificationManager;

    invoke-virtual {v0, v7}, Landroid/app/NotificationManager;->cancel(I)V

    .line 106
    invoke-static {p0, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 260
    invoke-static {}, Lcom/whatsapp/gp;->b()V

    .line 239
    return-void

    .line 256
    :pswitch_0
    sget-object v1, Lcom/whatsapp/RegisterPhone;->q:Ljava/lang/String;

    if-eqz v1, :cond_3

    sget-object v1, Lcom/whatsapp/RegisterPhone;->r:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 172
    :cond_3
    sget-object v1, Lcom/whatsapp/RegisterPhone;->F:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 95
    sput v8, Lcom/whatsapp/RegisterPhone;->s:I

    .line 90
    invoke-direct {p0}, Lcom/whatsapp/RegisterPhone;->d()V

    if-eqz v0, :cond_2

    .line 233
    :cond_4
    const/16 v0, 0x15

    invoke-virtual {p0, v0}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    goto :goto_0

    .line 34
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method
