.class public Lcom/whatsapp/VerifySms;
.super Lcom/whatsapp/VerifyNumber;
.source "VerifySms.java"


# static fields
.field private static A:Ljava/lang/String;

.field private static B:S

.field private static C:Ljava/lang/String;

.field private static O:Z

.field private static final ab:[Ljava/lang/String;

.field private static q:I

.field private static r:I

.field private static s:Landroid/os/CountDownTimer;

.field private static t:J

.field private static u:J

.field private static v:Landroid/content/BroadcastReceiver;

.field private static w:Landroid/content/BroadcastReceiver;

.field private static x:Landroid/content/BroadcastReceiver;

.field private static y:Ljava/lang/String;

.field private static z:Ljava/lang/String;


# instance fields
.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Landroid/widget/ProgressBar;

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/EditText;

.field private J:Landroid/widget/Button;

.field private K:Landroid/widget/Button;

.field private L:J

.field private M:J

.field private N:J

.field private P:Ljava/lang/String;

.field private Q:Z

.field private R:Landroid/os/CountDownTimer;

.field private S:Landroid/os/CountDownTimer;

.field private T:J

.field private U:J

.field V:Z

.field W:Landroid/app/ProgressDialog;

.field X:Landroid/content/BroadcastReceiver;

.field Y:Landroid/content/BroadcastReceiver;

.field Z:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x6d

    const/16 v2, 0x5a

    const/16 v4, 0x14

    const/16 v3, 0x9

    const/4 v8, 0x0

    const/16 v0, 0x45

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u000c4m\u0007{\u0004>\'\u0005f\u0002,`\u0011q\u001ft]\u0010x\u0008*a\u001az\u0014tZ8G2\u0008L6Q$\u000cL1"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\t?z\u0001f\u0002#"

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

    const-string v0, "\u001b?{\u001cr\u0014wz\u0018g"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000c(n\u0010z\u00193g\u0014;\u0018)lXp\u0008<h\u0000x\u0019"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000c(n\u0010z\u00193g\u0014;\u000e9)\u0013u\u00046l\u00114\u00015f\u001ea\u001d\u0019h\u0019x\u00044n6{\t?)\u0013f\u00027)6{\u00184}\u0007m=2f\u001bq$4o\u001a"

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

    const-string v0, "Xn"

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

    const-string v0, "^b8"

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

    const-string v0, "_l="

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

    const-string v0, "^o:"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000c(n\u0010z\u00193g\u0014;\u00005k\u001cx\u0008z"

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

    aput-object v0, v9, v3

    const/16 v10, 0xa

    const-string v0, "^b>"

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

    const-string v0, "_c0"

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

    const-string v0, "_i"

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

    const-string v0, "^b<"

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

    const-string v0, "_h9"

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

    const-string v0, "^n;"

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

    const-string v0, "^n:"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000c(n\u0010z\u00193g\u0014y\u00028`\u0019qB8h\u0006qB4f\u00019\u001b;e\u001cp@4|\u0018v\u0008()"

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

    const-string v0, "_l8"

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

    const-string v0, "_c>"

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

    const-string v0, "^n<"

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

    aput-object v0, v9, v4

    const/16 v10, 0x15

    const-string v0, "_h:"

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

    const-string v0, "^n8"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000c(n\u0010z\u00193g\u0014y\u00028`\u0019qB4f\u00019\u001b;e\u001cp@4|\u0018v\u0008()"

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

    const-string v0, "^o1"

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

    const-string v0, "^o8"

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

    const-string v0, "_c8"

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

    const-string v0, "_h8"

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

    const-string v0, "\\k"

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

    const-string v0, "^b1"

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

    const-string v0, "\\o"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001a(f\u001bs@)}\u0014`\u0008zk\u001aa\u00039lU`\u0002zd\u0014}\u0003z"

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

    const-string v0, "\u000e9"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000e(l\u0014`\u0008um\u001cg\u001d6h\u000c9\u001f5h\u0018}\u0003="

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

    const-string v0, "\u000e5d[c\u0005;}\u0006u\u001d*\'#q\u001f3o\u000cG\u0000)\'\u0007{\u000c7`\u001bs"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000e(l\u0014`\u0008"

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

    const-string v0, "\u000e5d[c\u0005;}\u0006u\u001d*\'#q\u001f3o\u000cG\u0000)\'\u0006q\u001f,l\u0007g\u00084m"

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

    const-string v0, "]k;F Xl>M-\u000c8j\u0011q\u000b=a\u001c~\u00066d\u001b{\u001d+{\u0006`\u0018,~\rm\u0017\u001bK6P(\u001cN=]\'\u0011E8Z\"\nX\'G9\u000f_\"L4\u0000"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000e(l\u0014`\u0008uj\u00164\u0002()\u001ba\u0000z`\u00064\u00003z\u0006}\u0003=%Uv\u0002/g\u0016qM.fUf\u0008=y\u001d{\u0003?"

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

    const-string v0, "\u001d2"

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

    const-string v0, "\u001b?{\u001cr\u0014w\u007f\u001a}\u000e?="

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

    const-string v0, "\u000e5d[c\u0005;}\u0006u\u001d*\'#q\u001f3o\u000cG\u0000)\'\u0003q\u001f3o\u001cw\u000c.`\u001az2)}\u0014`\u0008"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001d;|\u0006qM"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001d;|\u0006qB9f\u0018y\u0004.)\u0013u\u00046l\u0011"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000e2h\u0019x\u00084n\u0010;\u000b;`\u0019q\twn\u001a9\u00195$\u001bq\u0015."

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000e2h\u0019x\u00084n\u0010;\u001e?g\u00014"

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

    const-string v0, "\u000e5d[c\u0005;}\u0006u\u001d*\'&Y>\u0005Z0Z9"

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

    const-string v0, "\u001e?e\u00139\u001e?g\u00119\u001e?g\u00119\u000b;`\u0019a\u001f?"

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

    const-string v0, "Zi=E "

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

    const-string v0, ";?{\u001cr\u0014\td\u0006;\u001e;\u007f\u0010g\u0019;}\u0010;\u000e5d\u0018}\u0019zo\u0014}\u0001?m"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001f?z\u0000y\u0008z"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001f?z\u0000y\u0008u|\u001b\u007f\u00035~\u001b9\u001e.h\u0001q"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001f?z\u0000y\u0008uj\u00164\u0002()\u001ba\u0000z`\u00064\u00003z\u0006}\u0003=%Uv\u0002/g\u0016qM.fUf\u0008=y\u001d{\u0003?"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001a;`\u0001}\u0003=&\u0017{\u00184j\u00109\u00195$\u0007q\n*a\u001az\u0008"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u000e;g\u001b{\u0019wz\u0018g@=fXb\u00023j\u0010"

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

    const-string v0, "\u000e5d[c\u0005;}\u0006u\u001d*\'\'q\n3z\u0001q\u001f\na\u001az\u0008tj\u0019q\u000c(V\u0005|\u00024l*z\u00187k\u0010f"

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

    const-string v0, "\u001e7z"

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

    const-string v0, "\u000c4m\u0007{\u0004>\'\u001cz\u0019?g\u0001:\u000c9}\u001c{\u0003tM4@,\u0005Z8G2\u0008L6Q$\u000cL1"

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

    const-string v0, "M\ra\u0014`\u001e\u001by\u00054\u00044}\u0010f\u0003;eUa\u001e?)X4\u001e;o\u00104\u00195)\u0011}\u001e9h\u0007p"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u00184b\u001b{\u001a4$\u0006`\u000c.lU"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u0003/d\u0017q\u001fu`\u001b9\u001a(f\u001bs@)}\u0014`\u0008zk\u001aa\u00039lU`\u0002z{\u0010s\u001d2f\u001bq"

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

    const-string v0, ":2h\u0001g,*yU"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001e?g\u0011;"

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

    const-string v0, "\u00044y\u0000`27l\u0001|\u0002>"

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

    const-string v0, "\u001b?{\u001cr\u0014)d\u0006;\u001f?x\u0000q\u001e.$\u0006y\u001e"

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

    const-string v0, "\u001b?{\u001cr\u0014w\u007f\u001a}\u000e?"

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

    const-string v0, "\u001b?{\u001cr\u0014,f\u001cw\u0008u|\u001b\u007f\u00035~\u001b9\u001e.h\u0001qM"

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

    const-string v0, "\u000e5d[c\u0005;}\u0006u\u001d*\'\u0003q\u001f3o\u000cz\u00187k\u0010fC>`\u0014x\u0002="

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

    const-string v0, "\u0000;{\u001eq\u0019"

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

    sput-object v9, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    .line 249
    const/16 v0, 0xa

    sput v0, Lcom/whatsapp/VerifySms;->q:I

    .line 408
    sput v8, Lcom/whatsapp/VerifySms;->r:I

    .line 468
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    .line 315
    const-wide/32 v0, 0x493e0

    sput-wide v0, Lcom/whatsapp/VerifySms;->t:J

    .line 342
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/whatsapp/VerifySms;->u:J

    .line 179
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    .line 38
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    .line 101
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    .line 213
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    .line 91
    const-string v0, ""

    sput-object v0, Lcom/whatsapp/VerifySms;->z:Ljava/lang/String;

    .line 78
    const-string v0, ""

    sput-object v0, Lcom/whatsapp/VerifySms;->A:Ljava/lang/String;

    .line 433
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->C:Ljava/lang/String;

    .line 143
    sput-boolean v8, Lcom/whatsapp/VerifySms;->O:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_45
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_45

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_46

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_47

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_48

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_49

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_4a

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_4b

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_4c

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_4d

    :cond_9
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_4e
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_4e

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_4f

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_50

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_51

    :cond_d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_52

    :cond_e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_53

    :cond_f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_54
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_54

    :cond_10
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_55

    :cond_11
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_56

    :cond_12
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_57

    :cond_13
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_58

    :cond_14
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_59
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_59

    :cond_15
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_5a

    :cond_16
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_5b

    :cond_17
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_5c

    :cond_18
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_5d

    :cond_19
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_5e

    :cond_1a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_5f

    :cond_1b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_60

    :cond_1c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_61

    :cond_1d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_62

    :cond_1e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_63
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_63

    :cond_1f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_64
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_64

    :cond_20
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_65
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_65

    :cond_21
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_66
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_66

    :cond_22
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_67
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_67

    :cond_23
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_68
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_68

    :cond_24
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_69
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_69

    :cond_25
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_25

    move v0, v4

    :goto_6a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_6a

    :cond_26
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_26

    move v0, v4

    :goto_6b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_6b

    :cond_27
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_27

    move v0, v4

    :goto_6c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_6c

    :cond_28
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_28

    move v0, v4

    :goto_6d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_6d

    :cond_29
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_29

    move v0, v4

    :goto_6e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_6e

    :cond_2a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2a

    move v0, v4

    :goto_6f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_6f

    :cond_2b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2b

    move v0, v4

    :goto_70
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_70

    :cond_2c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2c

    move v0, v4

    :goto_71
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_71

    :cond_2d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2d

    move v0, v4

    :goto_72
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_72

    :cond_2e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2e

    move v0, v4

    :goto_73
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_73

    :cond_2f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2f

    move v0, v4

    :goto_74
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_74

    :cond_30
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_30

    move v0, v4

    :goto_75
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_75

    :cond_31
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_31

    move v0, v4

    :goto_76
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_76

    :cond_32
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_32

    move v0, v4

    :goto_77
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_77

    :cond_33
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_33

    move v0, v4

    :goto_78
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_78

    :cond_34
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_34

    move v0, v4

    :goto_79
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_79

    :cond_35
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_35

    move v0, v4

    :goto_7a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_7a

    :cond_36
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_36

    move v0, v4

    :goto_7b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_7b

    :cond_37
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_37

    move v0, v4

    :goto_7c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_7c

    :cond_38
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_38

    move v0, v4

    :goto_7d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_7d

    :cond_39
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_39

    move v0, v4

    :goto_7e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_7e

    :cond_3a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3a

    move v0, v4

    :goto_7f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_7f

    :cond_3b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3b

    move v0, v4

    :goto_80
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_80

    :cond_3c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3c

    move v0, v4

    :goto_81
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_81

    :cond_3d
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3d

    move v0, v4

    :goto_82
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_82

    :cond_3e
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3e

    move v0, v4

    :goto_83
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_83

    :cond_3f
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3f

    move v0, v4

    :goto_84
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_84

    :cond_40
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_40

    move v0, v4

    :goto_85
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_85

    :cond_41
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_41

    move v0, v4

    :goto_86
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_86

    :cond_42
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_42

    move v0, v4

    :goto_87
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_87

    :cond_43
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_43

    move v0, v4

    :goto_88
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

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
    const/16 v0, 0x75

    goto :goto_88

    :cond_44
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_44

    move v0, v4

    :goto_89
    xor-int/2addr v0, v11

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
    const/16 v0, 0x75

    goto :goto_89

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
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 170
    invoke-direct {p0}, Lcom/whatsapp/VerifyNumber;-><init>()V

    .line 288
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->P:Ljava/lang/String;

    .line 242
    iput-boolean v2, p0, Lcom/whatsapp/VerifySms;->Q:Z

    .line 384
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    .line 480
    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/whatsapp/VerifySms;->T:J

    .line 229
    const-wide/32 v0, 0xea60

    iput-wide v0, p0, Lcom/whatsapp/VerifySms;->U:J

    .line 364
    iput-boolean v2, p0, Lcom/whatsapp/VerifySms;->V:Z

    .line 306
    new-instance v0, Lcom/whatsapp/VerifySms$1;

    invoke-direct {v0, p0}, Lcom/whatsapp/VerifySms$1;-><init>(Lcom/whatsapp/VerifySms;)V

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->X:Landroid/content/BroadcastReceiver;

    .line 185
    new-instance v0, Lcom/whatsapp/VerifySms$2;

    invoke-direct {v0, p0}, Lcom/whatsapp/VerifySms$2;-><init>(Lcom/whatsapp/VerifySms;)V

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->Y:Landroid/content/BroadcastReceiver;

    .line 381
    new-instance v0, Lcom/whatsapp/VerifySms$3;

    invoke-direct {v0, p0}, Lcom/whatsapp/VerifySms$3;-><init>(Lcom/whatsapp/VerifySms;)V

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->Z:Landroid/content/BroadcastReceiver;

    .line 438
    return-void
.end method

.method static A()I
    .locals 1

    .prologue
    .line 93
    sget v0, Lcom/whatsapp/VerifySms;->q:I

    return v0
.end method

.method static a(I)I
    .locals 0
    .parameter

    .prologue
    .line 250
    sput p0, Lcom/whatsapp/VerifySms;->r:I

    return p0
.end method

.method static a(Lcom/whatsapp/VerifySms;J)J
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 256
    iput-wide p1, p0, Lcom/whatsapp/VerifySms;->M:J

    return-wide p1
.end method

.method private a(J)V
    .locals 10
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 430
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 476
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 182
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    .line 396
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->I:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 252
    const v0, 0x7f0d0181

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 512
    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    .line 349
    const v0, 0x7f0d0182

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ProgressBar;

    .line 350
    invoke-virtual {v6, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 416
    new-instance v0, Lcom/whatsapp/jc;

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    move-wide v2, p1

    move-wide v7, p1

    invoke-direct/range {v0 .. v9}, Lcom/whatsapp/jc;-><init>(Lcom/whatsapp/VerifySms;JJLandroid/widget/ProgressBar;JLandroid/view/View;)V

    invoke-virtual {v0}, Lcom/whatsapp/jc;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    .line 11
    return-void
.end method

.method private a(Landroid/telephony/SmsManager;Ljava/lang/String;)V
    .locals 8
    .parameter
    .parameter

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 129
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f090074

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    sput v6, Lcom/whatsapp/VerifySms;->r:I

    .line 325
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->m()V

    .line 121
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x2e

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v5, v0, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 294
    :try_start_0
    sget v0, Lcom/whatsapp/App;->f:I

    if-ne v0, v7, :cond_1

    .line 248
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/VerifySms;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 459
    if-nez v1, :cond_0

    .line 453
    sget-object v1, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    .line 449
    :cond_0
    const/4 v2, 0x0

    sget-short v3, Lcom/whatsapp/VerifySms;->B:S

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroid/telephony/SmsManager;->sendDataMessage(Ljava/lang/String;Ljava/lang/String;S[BLandroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 190
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 62
    :cond_1
    sget-object v1, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    const/4 v2, 0x0

    sget-short v3, Lcom/whatsapp/VerifySms;->B:S

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroid/telephony/SmsManager;->sendDataMessage(Ljava/lang/String;Ljava/lang/String;S[BLandroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 95
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x2d

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 302
    :goto_0
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 429
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x2c

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 241
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x2f

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    .line 68
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->d()V

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 483
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->k()V

    return-void
.end method

.method static a(Lcom/whatsapp/VerifySms;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 236
    invoke-direct {p0, p1}, Lcom/whatsapp/VerifySms;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2
    .parameter

    .prologue
    .line 57
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const/4 v0, 0x0

    sput v0, Lcom/whatsapp/VerifySms;->r:I

    .line 51
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->l()V

    .line 220
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/VerifySms;->l:Z

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->a()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 164
    :cond_0
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 46
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/RegisterName;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->startActivity(Landroid/content/Intent;)V

    .line 376
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->finish()V

    .line 126
    return-void
.end method

.method static a(Lcom/whatsapp/VerifySms;Ljava/lang/String;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 482
    invoke-direct {p0, p1}, Lcom/whatsapp/VerifySms;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 285
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    move v0, v1

    .line 474
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 345
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_2

    .line 346
    :cond_1
    :goto_0
    return v1

    .line 54
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 135
    :cond_3
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private b(J)V
    .locals 6
    .parameter

    .prologue
    .line 142
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 316
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    .line 426
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 124
    new-instance v0, Lcom/whatsapp/kc;

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/kc;-><init>(Lcom/whatsapp/VerifySms;JJ)V

    invoke-virtual {v0}, Lcom/whatsapp/kc;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    .line 36
    return-void
.end method

.method static b(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->d()V

    return-void
.end method

.method static b(Lcom/whatsapp/VerifySms;J)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/VerifySms;->b(J)V

    return-void
.end method

.method static b(Z)Z
    .locals 0
    .parameter

    .prologue
    .line 320
    sput-boolean p0, Lcom/whatsapp/VerifySms;->O:Z

    return p0
.end method

.method static c(J)J
    .locals 0
    .parameter

    .prologue
    .line 264
    sput-wide p0, Lcom/whatsapp/VerifySms;->u:J

    return-wide p0
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x5

    .line 494
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 421
    :cond_0
    :goto_0
    return-object v0

    .line 77
    :cond_1
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 231
    sget-object v1, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v1

    .line 332
    if-eqz v1, :cond_2

    .line 200
    :try_start_0
    invoke-static {v1}, Lcom/whatsapp/jp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 230
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 317
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 421
    sget-object v0, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    goto :goto_0

    .line 290
    :catch_0
    move-exception v1

    .line 138
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-static {v2, v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 411
    :cond_2
    invoke-static {p1}, Lcom/whatsapp/VerifySms;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 363
    :cond_3
    sget-object v0, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    goto :goto_0
.end method

.method static c(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 502
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->l()V

    return-void
.end method

.method static c(Lcom/whatsapp/VerifySms;J)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 427
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/VerifySms;->a(J)V

    return-void
.end method

.method static d(Lcom/whatsapp/VerifySms;J)J
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 167
    iput-wide p1, p0, Lcom/whatsapp/VerifySms;->T:J

    return-wide p1
.end method

.method static d(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 278
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .parameter

    .prologue
    const/4 v12, 0x5

    const/16 v11, 0x8

    const/4 v1, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x4

    sget-boolean v5, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 49
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0xa

    if-ge v0, v2, :cond_1

    .line 274
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x17

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 174
    const/4 v0, 0x0

    .line 311
    :goto_0
    return-object v0

    .line 186
    :cond_1
    const-string v0, "9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 330
    const/4 v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    if-eqz v5, :cond_3

    :cond_2
    move-object v0, p0

    .line 435
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v6, 0xa

    if-eq v2, v6, :cond_4

    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 311
    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v6, v2, -0x30

    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v7, v2, -0x30

    .line 238
    const/16 v2, 0x9

    new-array v8, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v9, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v10, 0x1b

    aget-object v9, v9, v10

    aput-object v9, v8, v2

    const/4 v2, 0x1

    sget-object v9, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v10, 0x15

    aget-object v9, v9, v10

    aput-object v9, v8, v2

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0x12

    aget-object v2, v2, v9

    aput-object v2, v8, v1

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0x1a

    aget-object v2, v2, v9

    aput-object v2, v8, v3

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0xb

    aget-object v2, v2, v9

    aput-object v2, v8, v4

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0x16

    aget-object v2, v2, v9

    aput-object v2, v8, v12

    const/4 v2, 0x6

    sget-object v9, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v10, 0xf

    aget-object v9, v9, v10

    aput-object v9, v8, v2

    const/4 v2, 0x7

    sget-object v9, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v10, 0x19

    aget-object v9, v9, v10

    aput-object v9, v8, v2

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v9, 0x6

    aget-object v2, v2, v9

    aput-object v2, v8, v11

    .line 344
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0x1c

    aget-object v2, v2, v9

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 422
    if-eqz v5, :cond_14

    .line 96
    :cond_5
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0xe

    aget-object v2, v2, v9

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 176
    if-ne v7, v1, :cond_15

    move v2, v4

    :goto_1
    if-eqz v5, :cond_21

    .line 445
    :cond_6
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v9, 0xc

    aget-object v2, v2, v9

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 436
    const/4 v2, 0x7

    if-ne v6, v2, :cond_16

    move v2, v3

    :goto_2
    if-eqz v5, :cond_21

    .line 394
    :cond_7
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v6, 0x7

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 99
    const/4 v2, 0x6

    if-lt v7, v2, :cond_17

    if-gt v7, v11, :cond_17

    move v2, v4

    :goto_3
    if-eqz v5, :cond_21

    .line 130
    :cond_8
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v6, 0x13

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 23
    if-ne v7, v1, :cond_18

    move v2, v4

    :goto_4
    if-eqz v5, :cond_21

    .line 354
    :cond_9
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v6, 0x10

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 413
    if-lt v7, v12, :cond_19

    if-gt v7, v11, :cond_19

    move v2, v4

    :goto_5
    if-eqz v5, :cond_21

    .line 72
    :cond_a
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v6, 0x14

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 515
    if-lt v7, v4, :cond_b

    const/4 v2, 0x6

    if-le v7, v2, :cond_c

    :cond_b
    if-ne v7, v11, :cond_1a

    :cond_c
    move v2, v4

    :goto_6
    if-eqz v5, :cond_21

    .line 488
    :cond_d
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v2, v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 14
    if-lt v7, v1, :cond_1b

    if-gt v7, v4, :cond_1b

    move v2, v4

    :goto_7
    if-eqz v5, :cond_21

    .line 187
    :cond_e
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v6, 0x18

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 195
    if-lt v7, v1, :cond_1c

    if-gt v7, v12, :cond_1c

    move v1, v4

    :goto_8
    if-eqz v5, :cond_14

    .line 451
    :cond_f
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 338
    if-lt v7, v4, :cond_1d

    if-gt v7, v11, :cond_1d

    move v1, v4

    :goto_9
    if-eqz v5, :cond_14

    .line 50
    :cond_10
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 171
    if-lt v7, v12, :cond_1e

    if-gt v7, v11, :cond_1e

    move v1, v4

    :goto_a
    if-eqz v5, :cond_14

    .line 27
    :cond_11
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x1d

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 110
    if-lt v7, v4, :cond_1f

    const/4 v1, 0x7

    if-gt v7, v1, :cond_1f

    move v1, v4

    :goto_b
    if-eqz v5, :cond_14

    .line 90
    :cond_12
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 210
    if-eqz v5, :cond_20

    :cond_13
    move v1, v4

    .line 151
    :cond_14
    :goto_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v4, 0x1e

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_15
    move v2, v3

    .line 176
    goto/16 :goto_1

    :cond_16
    move v2, v4

    .line 436
    goto/16 :goto_2

    :cond_17
    move v2, v3

    .line 99
    goto/16 :goto_3

    :cond_18
    move v2, v3

    .line 23
    goto/16 :goto_4

    :cond_19
    move v2, v3

    .line 413
    goto/16 :goto_5

    :cond_1a
    move v2, v3

    .line 515
    goto/16 :goto_6

    :cond_1b
    move v2, v3

    .line 14
    goto/16 :goto_7

    :cond_1c
    move v1, v3

    .line 195
    goto/16 :goto_8

    :cond_1d
    move v1, v3

    .line 338
    goto/16 :goto_9

    :cond_1e
    move v1, v3

    .line 171
    goto :goto_a

    :cond_1f
    move v1, v3

    .line 110
    goto :goto_b

    :cond_20
    move v1, v3

    goto :goto_c

    :cond_21
    move v1, v2

    goto :goto_c
.end method

.method private d()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    .line 443
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->k()V

    .line 116
    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lcom/whatsapp/VerifySms;->N:J

    .line 442
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f090074

    new-array v3, v6, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->t()V

    .line 402
    return-void
.end method

.method static e(Lcom/whatsapp/VerifySms;J)J
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 403
    iput-wide p1, p0, Lcom/whatsapp/VerifySms;->U:J

    return-wide p1
.end method

.method static e(Lcom/whatsapp/VerifySms;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 199
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 76
    const/4 v0, 0x0

    sput v0, Lcom/whatsapp/VerifySms;->r:I

    .line 423
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->l()V

    .line 181
    invoke-static {p0, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 162
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->P:Ljava/lang/String;

    .line 159
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/RegisterPhone;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 455
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x37

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 216
    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->startActivity(Landroid/content/Intent;)V

    .line 244
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->finish()V

    .line 340
    return-void
.end method

.method static f(Lcom/whatsapp/VerifySms;)J
    .locals 2
    .parameter

    .prologue
    .line 398
    iget-wide v0, p0, Lcom/whatsapp/VerifySms;->N:J

    return-wide v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 246
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->X:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x2e

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/VerifySms;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 299
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->X:Landroid/content/BroadcastReceiver;

    sput-object v0, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x39

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 492
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x38

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 70
    const-string v1, "*"

    sget-short v2, Lcom/whatsapp/VerifySms;->B:S

    invoke-static {v2}, Ljava/lang/Short;->toString(S)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/IntentFilter;->addDataAuthority(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    iget-object v1, p0, Lcom/whatsapp/VerifySms;->Z:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/VerifySms;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 519
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->Z:Landroid/content/BroadcastReceiver;

    sput-object v0, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    .line 228
    :cond_0
    return-void
.end method

.method static g(Lcom/whatsapp/VerifySms;)J
    .locals 2
    .parameter

    .prologue
    .line 469
    iget-wide v0, p0, Lcom/whatsapp/VerifySms;->M:J

    return-wide v0
.end method

.method private g()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 69
    sget-object v0, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 239
    sget-object v0, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 261
    sput-object v1, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    .line 475
    :cond_0
    sget-object v0, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_1

    .line 221
    sget-object v0, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 284
    sput-object v1, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    .line 283
    :cond_1
    return-void
.end method

.method static h(Lcom/whatsapp/VerifySms;)J
    .locals 2
    .parameter

    .prologue
    .line 272
    iget-wide v0, p0, Lcom/whatsapp/VerifySms;->L:J

    return-wide v0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 467
    sget-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->Y:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/VerifySms;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 397
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->Y:Landroid/content/BroadcastReceiver;

    sput-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    .line 477
    :cond_0
    return-void
.end method

.method static i(Lcom/whatsapp/VerifySms;)Landroid/widget/ProgressBar;
    .locals 1
    .parameter

    .prologue
    .line 361
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->F:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 499
    sget-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 327
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    .line 367
    :cond_0
    return-void
.end method

.method static j(Lcom/whatsapp/VerifySms;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 377
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->H:Landroid/widget/TextView;

    return-object v0
.end method

.method private j()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 234
    sget-object v0, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 310
    sget-object v0, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 255
    sput-object v1, Lcom/whatsapp/VerifySms;->v:Landroid/content/BroadcastReceiver;

    .line 56
    :cond_0
    sget-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_1

    .line 15
    sget-object v0, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 79
    sput-object v1, Lcom/whatsapp/VerifySms;->w:Landroid/content/BroadcastReceiver;

    .line 265
    :cond_1
    sget-object v0, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_2

    .line 516
    sget-object v0, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 262
    sput-object v1, Lcom/whatsapp/VerifySms;->x:Landroid/content/BroadcastReceiver;

    .line 424
    :cond_2
    return-void
.end method

.method private k()V
    .locals 1

    .prologue
    .line 192
    sget-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 478
    sget-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 254
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    .line 235
    :cond_0
    return-void
.end method

.method static k(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 428
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->o()V

    return-void
.end method

.method static l(Lcom/whatsapp/VerifySms;)Landroid/widget/EditText;
    .locals 1
    .parameter

    .prologue
    .line 405
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->I:Landroid/widget/EditText;

    return-object v0
.end method

.method private l()V
    .locals 3

    .prologue
    .line 447
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 441
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x29

    aget-object v1, v1, v2

    sget v2, Lcom/whatsapp/VerifySms;->r:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 510
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x31

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 223
    :cond_0
    return-void
.end method

.method static m(Lcom/whatsapp/VerifySms;)Landroid/widget/Button;
    .locals 1
    .parameter

    .prologue
    .line 266
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    return-object v0
.end method

.method private m()V
    .locals 6

    .prologue
    .line 39
    sget-wide v2, Lcom/whatsapp/VerifySms;->t:J

    .line 434
    sget-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 267
    sget-wide v2, Lcom/whatsapp/VerifySms;->u:J

    .line 31
    sget-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 65
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    .line 34
    :cond_0
    new-instance v0, Lcom/whatsapp/ic;

    const-wide/16 v4, 0x3e8

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/ic;-><init>(Lcom/whatsapp/VerifySms;JJ)V

    invoke-virtual {v0}, Lcom/whatsapp/ic;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    .line 471
    return-void
.end method

.method private n()V
    .locals 6

    .prologue
    const v5, 0x7f0d017b

    const v4, 0x7f0d017a

    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 495
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/VerifySms;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 355
    const v0, 0x7f0d0175

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->F:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 366
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 83
    const v0, 0x7f0d0176

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 119
    const v0, 0x7f0d017e

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 75
    const v0, 0x7f0d0172

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 207
    const v0, 0x7f0d0179

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f090073

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 511
    invoke-virtual {p0, v4}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    invoke-virtual {p0, v4}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 240
    invoke-virtual {p0, v5}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    invoke-virtual {p0, v5}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    const v0, 0x7f0d0178

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 280
    const v0, 0x7f0d0173

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 300
    return-void
.end method

.method static n(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 417
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->e()V

    return-void
.end method

.method private o()V
    .locals 10

    .prologue
    const v9, 0x7f0d017b

    const v8, 0x7f0d017a

    const/16 v7, 0x8

    const/4 v6, 0x0

    .line 118
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/VerifySms;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 323
    const v1, 0x7f090078

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 335
    const v2, 0x7f090079

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const v4, 0x7f09007a

    invoke-virtual {p0, v4}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    const/4 v4, 0x1

    const/4 v5, 0x3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-static {v0, v0}, Lcom/whatsapp/VerifySms;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 479
    const v0, 0x7f0d0179

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    invoke-virtual {p0, v8}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 464
    invoke-virtual {p0, v8}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 289
    invoke-virtual {p0, v9}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    invoke-virtual {p0, v9}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 513
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->F:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 297
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setVisibility(I)V

    .line 391
    const v0, 0x7f0d0176

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 382
    const v0, 0x7f0d0172

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 84
    const v0, 0x7f0d0178

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 319
    const v0, 0x7f0d0173

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 198
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->u()V

    .line 490
    return-void
.end method

.method static o(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 165
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->p()V

    return-void
.end method

.method private p()V
    .locals 8

    .prologue
    const v7, 0x7f0d017b

    const v6, 0x7f0d017a

    const/4 v5, 0x0

    const/16 v4, 0x8

    .line 270
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/VerifySms;->Q:Z

    .line 372
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/VerifySms;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 400
    const v1, 0x7f090095

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 29
    const v2, 0x7f090096

    invoke-virtual {p0, v2}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-static {v0, v0}, Lcom/whatsapp/VerifySms;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 112
    const v0, 0x7f0d0179

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    invoke-virtual {p0, v6}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    invoke-virtual {p0, v6}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 486
    invoke-virtual {p0, v7}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    invoke-virtual {p0, v7}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->F:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 219
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 380
    const v0, 0x7f0d0176

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 473
    const v0, 0x7f0d0172

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 120
    const v0, 0x7f0d0173

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    return-void
.end method

.method static p(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 322
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->m()V

    return-void
.end method

.method private q()V
    .locals 2

    .prologue
    .line 360
    iget-boolean v0, p0, Lcom/whatsapp/VerifySms;->Q:Z

    if-eqz v0, :cond_0

    .line 103
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x28

    aget-object v0, v0, v1

    invoke-super {p0, v0}, Lcom/whatsapp/VerifyNumber;->a(Ljava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->P:Ljava/lang/String;

    invoke-super {p0, v0}, Lcom/whatsapp/VerifyNumber;->a(Ljava/lang/String;)V

    .line 232
    :cond_1
    return-void
.end method

.method static q(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 371
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->h()V

    return-void
.end method

.method private r()V
    .locals 3

    .prologue
    .line 113
    sget-object v0, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x30

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 313
    :goto_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x3e80

    int-to-short v0, v0

    sput-short v0, Lcom/whatsapp/VerifySms;->B:S

    .line 98
    :cond_0
    return-void

    .line 401
    :cond_1
    const/4 v0, 0x0

    sput-short v0, Lcom/whatsapp/VerifySms;->B:S

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    goto :goto_0
.end method

.method static r(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 301
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->i()V

    return-void
.end method

.method private s()V
    .locals 10

    .prologue
    const-wide/32 v8, 0x493e0

    const-wide/16 v6, 0x0

    const/4 v3, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 343
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x3f

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 485
    invoke-virtual {v0, v3, v3}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x3d

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/whatsapp/mh;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whatsapp/VerifySms;->A:Ljava/lang/String;

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x3a

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 347
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    move-result-object v2

    .line 168
    iget-object v3, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v4, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-virtual {p0, v3, v4}, Lcom/whatsapp/VerifySms;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    .line 452
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v5, 0x3e

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 466
    sget v3, Lcom/whatsapp/VerifySms;->r:I

    sparse-switch v3, :sswitch_data_0

    .line 457
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x3b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/whatsapp/VerifySms;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 147
    :cond_0
    return-void

    .line 73
    :cond_1
    sget-object v0, Lcom/whatsapp/VerifySms;->z:Ljava/lang/String;

    goto :goto_0

    .line 508
    :sswitch_0
    iput-wide v6, p0, Lcom/whatsapp/VerifySms;->M:J

    .line 71
    iput-wide v6, p0, Lcom/whatsapp/VerifySms;->N:J

    .line 484
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->d()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lcom/whatsapp/VerifySms;->C:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 145
    const-wide/32 v3, 0x927c0

    iput-wide v3, p0, Lcom/whatsapp/VerifySms;->L:J

    .line 504
    invoke-direct {p0, v2, v0}, Lcom/whatsapp/VerifySms;->a(Landroid/telephony/SmsManager;Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 373
    :cond_2
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 222
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 304
    iput-wide v8, p0, Lcom/whatsapp/VerifySms;->L:J

    .line 341
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->t()V

    if-eqz v1, :cond_0

    .line 461
    :cond_3
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x3c

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 487
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->e()V

    .line 87
    if-eqz v1, :cond_0

    .line 432
    :sswitch_1
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    iput-wide v8, p0, Lcom/whatsapp/VerifySms;->L:J

    .line 425
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->t()V

    .line 61
    if-eqz v1, :cond_0

    goto :goto_1

    .line 466
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method static s(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->u()V

    return-void
.end method

.method static t(Lcom/whatsapp/VerifySms;)J
    .locals 2
    .parameter

    .prologue
    .line 166
    iget-wide v0, p0, Lcom/whatsapp/VerifySms;->T:J

    return-wide v0
.end method

.method private t()V
    .locals 2

    .prologue
    .line 1
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x40

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->g()V

    .line 328
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifySms;->C:Ljava/lang/String;

    .line 462
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/VerifySms;->C:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 419
    new-instance v0, Lcom/whatsapp/cc;

    invoke-direct {v0, p0}, Lcom/whatsapp/cc;-><init>(Lcom/whatsapp/VerifySms;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/cc;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 82
    return-void
.end method

.method static u(Lcom/whatsapp/VerifySms;)J
    .locals 2
    .parameter

    .prologue
    .line 351
    iget-wide v0, p0, Lcom/whatsapp/VerifySms;->U:J

    return-wide v0
.end method

.method private u()V
    .locals 8

    .prologue
    const/16 v7, 0x41

    const v6, 0x7f09007a

    const/16 v5, 0x8

    const/4 v4, 0x0

    const v3, 0x7f0d017e

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 233
    sget v0, Lcom/whatsapp/VerifySms;->r:I

    packed-switch v0, :pswitch_data_0

    .line 440
    :goto_0
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x42

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/whatsapp/VerifySms;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 133
    :pswitch_1
    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 184
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    invoke-virtual {p0, v6}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 359
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v0, v0, v7

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->P:Ljava/lang/String;

    .line 269
    :cond_0
    return-void

    .line 257
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->I:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 286
    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 32
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    invoke-virtual {p0, v6}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 268
    if-eqz v1, :cond_0

    .line 387
    :pswitch_3
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->I:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 271
    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 500
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    invoke-virtual {p0, v6}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 217
    if-eqz v1, :cond_0

    .line 209
    :pswitch_4
    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    const v2, 0x7f0900e4

    invoke-virtual {p0, v2}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 160
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v0, v0, v7

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->P:Ljava/lang/String;

    .line 393
    if-eqz v1, :cond_0

    .line 439
    :pswitch_5
    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 458
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 97
    if-eqz v1, :cond_0

    goto/16 :goto_0

    .line 233
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_2
    .end packed-switch
.end method

.method static v()Ljava/lang/String;
    .locals 1

    .prologue
    .line 489
    sget-object v0, Lcom/whatsapp/VerifySms;->y:Ljava/lang/String;

    return-object v0
.end method

.method static w()Ljava/lang/String;
    .locals 1

    .prologue
    .line 507
    sget-object v0, Lcom/whatsapp/VerifySms;->z:Ljava/lang/String;

    return-object v0
.end method

.method static x()J
    .locals 2

    .prologue
    .line 295
    sget-wide v0, Lcom/whatsapp/VerifySms;->t:J

    return-wide v0
.end method

.method static y()I
    .locals 1

    .prologue
    .line 131
    sget v0, Lcom/whatsapp/VerifySms;->r:I

    return v0
.end method

.method static z()I
    .locals 1

    .prologue
    .line 178
    sget v0, Lcom/whatsapp/VerifySms;->q:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/whatsapp/VerifySms;->q:I

    return v0
.end method


# virtual methods
.method protected a(Landroid/telephony/ServiceState;)V
    .locals 2
    .parameter

    .prologue
    .line 385
    const v0, 0x7f0d0171

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iget-boolean v0, p0, Lcom/whatsapp/VerifySms;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 470
    return-void

    .line 385
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 389
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9
    .parameter

    .prologue
    const/4 v5, 0x0

    const/16 v8, 0x20

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 362
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x23

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 243
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyNumber;->onCreate(Landroid/os/Bundle;)V

    .line 305
    const v0, 0x7f030057

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->setContentView(I)V

    .line 134
    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v0

    .line 218
    const/4 v3, 0x4

    if-eq v0, v3, :cond_0

    .line 276
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x1f

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 163
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->startActivity(Landroid/content/Intent;)V

    .line 169
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->finish()V

    .line 412
    :goto_0
    return-void

    .line 89
    :cond_0
    iput-boolean v1, p0, Lcom/whatsapp/VerifySms;->Q:Z

    .line 375
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->r()V

    .line 339
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 245
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v4, 0x24

    aget-object v3, v3, v4

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 203
    const/4 v0, 0x5

    sput v0, Lcom/whatsapp/VerifySms;->r:I

    .line 497
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->l()V

    .line 104
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v4, 0x22

    aget-object v3, v3, v4

    iget-boolean v4, p0, Lcom/whatsapp/VerifySms;->k:Z

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/whatsapp/VerifySms;->k:Z

    if-eqz v0, :cond_3

    .line 141
    :cond_2
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x21

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 88
    const v0, 0x7f0d0171

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 503
    :cond_3
    const v0, 0x7f090002

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/VerifySms;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 81
    sget-object v3, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v3, v3, v8

    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    .line 205
    sget-object v3, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v4, 0x27

    aget-object v3, v3, v4

    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    .line 326
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 109
    :cond_4
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x26

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->e()V

    goto/16 :goto_0

    .line 212
    :cond_5
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 336
    sget-object v0, Lcom/whatsapp/VerifySms;->z:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_7

    .line 509
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x25

    aget-object v3, v0, v3

    .line 410
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    .line 16
    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    move v0, v1

    .line 172
    :cond_6
    if-ge v0, v8, :cond_7

    .line 108
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/VerifySms;->z:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v5, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    sput-object v6, Lcom/whatsapp/VerifySms;->z:Ljava/lang/String;

    .line 251
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/VerifySms;->A:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v5, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    sput-object v6, Lcom/whatsapp/VerifySms;->A:Ljava/lang/String;

    .line 348
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_6

    .line 117
    :cond_7
    sget-object v0, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    iget-object v2, p0, Lcom/whatsapp/VerifySms;->p:Landroid/telephony/PhoneStateListener;

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 175
    const v0, 0x7f0d005c

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->F:Landroid/widget/ProgressBar;

    .line 85
    const v0, 0x7f0d017d

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->G:Landroid/widget/TextView;

    .line 158
    const v0, 0x7f0d017c

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->H:Landroid/widget/TextView;

    .line 214
    const v0, 0x7f0d0180

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->I:Landroid/widget/EditText;

    .line 388
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->I:Landroid/widget/EditText;

    new-instance v2, Lcom/whatsapp/h7;

    invoke-direct {v2, p0}, Lcom/whatsapp/h7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 127
    const v0, 0x7f0d0184

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    .line 273
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->J:Landroid/widget/Button;

    new-instance v2, Lcom/whatsapp/i7;

    invoke-direct {v2, p0}, Lcom/whatsapp/i7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    const v0, 0x7f0d0185

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/VerifySms;->K:Landroid/widget/Button;

    .line 379
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->K:Landroid/widget/Button;

    const v2, 0x7f09007c

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u202a"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    iget-object v6, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    invoke-static {v5, v6}, Lcom/whatsapp/VerifySms;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\u202c"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 136
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->K:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/j7;

    invoke-direct {v1, p0}, Lcom/whatsapp/j7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->n()V

    .line 60
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->f()V

    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 8
    .parameter

    .prologue
    const v7, 0x7f09000c

    const/4 v4, 0x3

    const v6, 0x7f09000e

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 59
    packed-switch p1, :pswitch_data_0

    .line 197
    :pswitch_0
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyNumber;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 498
    :goto_0
    return-object v0

    .line 6
    :pswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09000d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090080

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/k7;

    invoke-direct {v1, p0}, Lcom/whatsapp/k7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 37
    :pswitch_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09004d

    new-array v2, v3, [Ljava/lang/Object;

    const v3, 0x7f090048

    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/l7;

    invoke-direct {v1, p0}, Lcom/whatsapp/l7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 374
    :pswitch_3
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090086

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/m7;

    invoke-direct {v1, p0}, Lcom/whatsapp/m7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 7
    :pswitch_4
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09008c

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/x6;

    invoke-direct {v1, p0}, Lcom/whatsapp/x6;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 378
    :pswitch_5
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09008d

    new-array v3, v3, [Ljava/lang/Object;

    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v4, 0x44

    aget-object v0, v0, v4

    sget-object v4, Lcom/whatsapp/App;->m:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f09008e

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/y6;

    invoke-direct {v1, p0}, Lcom/whatsapp/y6;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f09008f

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 10
    :pswitch_6
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09000d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090081

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/z6;

    invoke-direct {v1, p0}, Lcom/whatsapp/z6;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 514
    :pswitch_7
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 324
    const v1, 0x7f09004f

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 390
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 128
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 30
    iput-object v0, p0, Lcom/whatsapp/VerifySms;->W:Landroid/app/ProgressDialog;

    goto/16 :goto_0

    .line 52
    :pswitch_8
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 194
    const v1, 0x7f090060

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 446
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 275
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 149
    iput-object v0, p0, Lcom/whatsapp/VerifySms;->W:Landroid/app/ProgressDialog;

    goto/16 :goto_0

    .line 287
    :pswitch_9
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 298
    const v1, 0x7f09005f

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 395
    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 314
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 404
    iput-object v0, p0, Lcom/whatsapp/VerifySms;->W:Landroid/app/ProgressDialog;

    goto/16 :goto_0

    .line 4
    :pswitch_a
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090085

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090050

    new-instance v2, Lcom/whatsapp/b7;

    invoke-direct {v2, p0}, Lcom/whatsapp/b7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/a7;

    invoke-direct {v1, p0}, Lcom/whatsapp/a7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v7, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 356
    :pswitch_b
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090093

    new-array v2, v3, [Ljava/lang/Object;

    const v3, 0x7f0900be

    invoke-virtual {p0, v3}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090050

    new-instance v2, Lcom/whatsapp/d7;

    invoke-direct {v2, p0}, Lcom/whatsapp/d7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/c7;

    invoke-direct {v1, p0}, Lcom/whatsapp/c7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v7, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 204
    :pswitch_c
    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 420
    new-array v1, v3, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, v4}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v1, v5

    .line 308
    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setInputType(I)V

    .line 123
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 47
    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 498
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09005b

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09005c

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/f7;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/f7;-><init>(Lcom/whatsapp/VerifySms;Landroid/widget/EditText;)V

    invoke-virtual {v1, v6, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/e7;

    invoke-direct {v1, p0}, Lcom/whatsapp/e7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v7, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 21
    :pswitch_d
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090061

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/g7;

    invoke-direct {v1, p0}, Lcom/whatsapp/g7;-><init>(Lcom/whatsapp/VerifySms;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 59
    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_3
    .end packed-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 407
    const v0, 0x7f090050

    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 150
    const v1, 0x7f0203c6

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 25
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 491
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 202
    sget-object v0, Lcom/whatsapp/App;->db:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->p:Landroid/telephony/PhoneStateListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 309
    iput-boolean v4, p0, Lcom/whatsapp/VerifySms;->V:Z

    .line 196
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->j()V

    .line 337
    sget-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 358
    sget-object v0, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 370
    sput-object v3, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    .line 460
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 253
    iput-object v3, p0, Lcom/whatsapp/VerifySms;->S:Landroid/os/CountDownTimer;

    .line 177
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_2

    .line 282
    iget-object v0, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 321
    iput-object v3, p0, Lcom/whatsapp/VerifySms;->R:Landroid/os/CountDownTimer;

    .line 156
    :cond_2
    invoke-super {p0}, Lcom/whatsapp/VerifyNumber;->onDestroy()V

    .line 154
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 3
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 431
    invoke-super {p0, p1}, Lcom/whatsapp/VerifyNumber;->onNewIntent(Landroid/content/Intent;)V

    .line 331
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x43

    aget-object v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 114
    sparse-switch v1, :sswitch_data_0

    .line 201
    :cond_0
    :goto_0
    return-void

    .line 157
    :sswitch_0
    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 237
    if-eqz v0, :cond_0

    .line 333
    :sswitch_1
    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 189
    if-eqz v0, :cond_0

    .line 42
    :sswitch_2
    const/16 v1, 0x15

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 506
    if-eqz v0, :cond_0

    .line 161
    :sswitch_3
    const/16 v1, 0x17

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 12
    if-eqz v0, :cond_0

    .line 386
    :sswitch_4
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    goto :goto_0

    .line 114
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x7 -> :sswitch_0
        0x15 -> :sswitch_2
        0x16 -> :sswitch_4
        0x17 -> :sswitch_3
    .end sparse-switch
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x1

    .line 472
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 132
    const/4 v0, 0x0

    .line 211
    :goto_0
    return v0

    .line 33
    :pswitch_0
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->q()V

    goto :goto_0

    .line 45
    :pswitch_1
    const/16 v1, 0x1c

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    goto :goto_0

    .line 472
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onPause()V
    .locals 3

    .prologue
    .line 188
    invoke-super {p0}, Lcom/whatsapp/VerifyNumber;->onPause()V

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x2a

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/whatsapp/VerifySms;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 437
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifySms;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 9
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x29

    aget-object v1, v1, v2

    sget v2, Lcom/whatsapp/VerifySms;->r:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 180
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x2b

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 263
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/VerifySms;->C:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 493
    sget-boolean v0, Lcom/whatsapp/VerifySms;->O:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    if-nez v0, :cond_0

    .line 465
    const v0, 0x7f09007e

    invoke-interface {p1, v1, v2, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 100
    const v1, 0x7f0203df

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 28
    :cond_0
    return v2
.end method

.method public onResume()V
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 312
    invoke-super {p0}, Lcom/whatsapp/VerifyNumber;->onResume()V

    .line 208
    invoke-virtual {p0, v4}, Lcom/whatsapp/VerifySms;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 414
    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x29

    aget-object v2, v2, v3

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lcom/whatsapp/VerifySms;->r:I

    .line 501
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v1}, Lcom/whatsapp/App;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/whatsapp/VerifySms;->C:Ljava/lang/String;

    .line 292
    iget-object v1, p0, Lcom/whatsapp/VerifySms;->D:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whatsapp/VerifySms;->E:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 247
    :cond_0
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x34

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 102
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->e()V

    .line 334
    :goto_0
    return-void

    .line 105
    :cond_1
    invoke-static {p0, v5}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 173
    invoke-virtual {p0}, Lcom/whatsapp/VerifySms;->e()Z

    move-result v1

    if-nez v1, :cond_2

    .line 40
    sget v1, Lcom/whatsapp/VerifySms;->r:I

    if-nez v1, :cond_2

    .line 224
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x36

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 463
    const/4 v1, 0x3

    sput v1, Lcom/whatsapp/VerifySms;->r:I

    .line 352
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->l()V

    .line 454
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v3, 0x32

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/whatsapp/VerifySms;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 277
    sget v1, Lcom/whatsapp/VerifySms;->r:I

    packed-switch v1, :pswitch_data_0

    .line 456
    :goto_1
    sget-object v0, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v1, 0x33

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 448
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->gb:Landroid/app/NotificationManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_0

    .line 153
    :pswitch_0
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->n()V

    .line 399
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->s()V

    .line 226
    if-eqz v0, :cond_3

    .line 152
    :pswitch_1
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->o()V

    .line 318
    if-eqz v0, :cond_3

    .line 353
    :pswitch_2
    sget-object v1, Lcom/whatsapp/VerifySms;->s:Landroid/os/CountDownTimer;

    if-nez v1, :cond_3

    .line 63
    sget-object v1, Lcom/whatsapp/VerifySms;->ab:[Ljava/lang/String;

    const/16 v2, 0x35

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 215
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->e()V

    if-eqz v0, :cond_3

    .line 357
    :pswitch_3
    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 517
    if-eqz v0, :cond_3

    .line 5
    :pswitch_4
    invoke-virtual {p0, v5}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 66
    if-eqz v0, :cond_3

    .line 43
    :pswitch_5
    const/16 v1, 0x15

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 148
    if-eqz v0, :cond_3

    .line 26
    :pswitch_6
    const/16 v1, 0x17

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 115
    if-eqz v0, :cond_3

    .line 92
    :pswitch_7
    const/16 v1, 0x16

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 259
    if-eqz v0, :cond_3

    .line 406
    :pswitch_8
    invoke-direct {p0}, Lcom/whatsapp/VerifySms;->p()V

    .line 279
    if-eqz v0, :cond_3

    goto :goto_1

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_7
        :pswitch_1
        :pswitch_1
        :pswitch_8
        :pswitch_1
    .end packed-switch
.end method
