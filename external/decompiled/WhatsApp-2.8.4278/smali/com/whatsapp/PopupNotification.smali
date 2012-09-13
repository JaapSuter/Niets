.class public Lcom/whatsapp/PopupNotification;
.super Landroid/app/Activity;
.source "PopupNotification.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field private static final F:[Ljava/lang/String;

.field public static a:Lcom/whatsapp/PopupNotification;

.field private static v:I


# instance fields
.field private A:Landroid/os/Handler;

.field private B:Ljava/lang/Runnable;

.field private C:Landroid/os/Handler;

.field private D:Ljava/lang/Runnable;

.field private E:Ljava/lang/String;

.field private b:Z

.field private c:Lcom/whatsapp/j4;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/whatsapp/zq;

.field private f:Lcom/whatsapp/sz;

.field private g:Landroid/view/View$OnClickListener;

.field private h:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/whatsapp/uz;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/whatsapp/uz;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/whatsapp/GalleryView;

.field private l:Lcom/whatsapp/ConversationTextEntry;

.field private m:Landroid/widget/Button;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/view/View;

.field private r:Landroid/view/View;

.field private s:Landroid/view/View;

.field private t:Landroid/view/View;

.field private u:Landroid/os/PowerManager$WakeLock;

.field private w:Landroid/hardware/SensorManager;

.field private x:Landroid/hardware/Sensor;

.field private y:Landroid/hardware/SensorEventListener;

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x57

    const/16 v4, 0x4d

    const/16 v3, 0x29

    const/16 v1, 0x13

    const/4 v6, 0x0

    const/16 v0, 0x1e

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0019| L?"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xJ?\u000cr#L"

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

    const-string v0, "\u001av9Z\"\u001b"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xM$\u0008\u007f8N`\u001a|1]:\u0008a2\u0004,\u000b|\"]`\u001d|zL5\u0019z%L"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xM$\u0008\u007f8Nm\u001da.@#\u000e3#Fm\u001a{8^m-Z\u0016e\u0002.L\u0000h\u001f\"L\u0004l\u001f?Z\u0014l\u0012,K\u0007`\u001f(G\u001ef\u0003E35\\9I~2Z>\u0008t2\t=\u0008a6D(\u001dv%\t$\u001a39\\!\u00052"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xJ!\u000cr%G\"\u001dz1@.\u0008g>F#\u001a)"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xD>\u000e)"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xZ9\u0006c"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}x^,\u0002v\"Y$\u000f}2L)\u000cw"

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

    const-string v0, "I~2Z>\u0008t2Zc\u001az-Lw"

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

    const-string v0, "I~2Z>\u0008t2v=\u0006`m"

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

    const-string v0, "\u0000}\'\\96~2]%\u0006w"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xZ(\u0007w2G9\u001bjxL \u0019g.\t9\u000ck#\t"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xZ(\u0007w2G9\u001bjx\t>\na2L#6c8Zw"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xJ\"\u0007g6J9Dg?\\ \u000b<5H>\u000c%c\u0004)\u000cp8M(Fv%[\"\u001b"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xZ9\u0008a#"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xD$\u001a`>G*6a:]\u0012\u001aa4\u0013"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xY,\u001c`2"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xM(\u001ag%F4"

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

    aput-object v0, v9, v1

    const/16 v10, 0x14

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}x^,\u0002v\"Y"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}x@#\u0000g\'F=\u001cc"

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

    const-string v0, "\u0019|\'\\=\u0007|#@+\u0000p6]$\u0006}xJ\"\u001c}#\u0013"

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

    const-string v0, "UrwA?\u000cuj\u000b"

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

    const-string v0, "U<6\u0017"

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

    const-string v0, "5`|"

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

    const-string v0, "K-"

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

    const-string v0, "\u0005r.F8\u001dL>G+\u0005r#L?"

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

    const-string v0, "O`;Ep"

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

    const-string v0, "\u0001g#YwF<:H=\u001a=0F\"\u000e\u007f2\u0007.\u0006~xD,\u0019`hXp"

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

    sput-object v9, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    .line 203
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/PopupNotification;->a:Lcom/whatsapp/PopupNotification;

    .line 371
    const/16 v0, 0xc8

    sput v0, Lcom/whatsapp/PopupNotification;->v:I

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_31
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_36
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_38
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 529
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 300
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/PopupNotification;->b:Z

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    .line 213
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    .line 454
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->i:Ljava/util/HashSet;

    .line 535
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->j:Ljava/util/HashSet;

    .line 499
    iput-object v1, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    .line 271
    const/high16 v0, 0x40a0

    iput v0, p0, Lcom/whatsapp/PopupNotification;->z:F

    .line 56
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->A:Landroid/os/Handler;

    .line 216
    new-instance v0, Lcom/whatsapp/ly;

    invoke-direct {v0, p0}, Lcom/whatsapp/ly;-><init>(Lcom/whatsapp/PopupNotification;)V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->B:Ljava/lang/Runnable;

    .line 169
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->C:Landroid/os/Handler;

    .line 425
    new-instance v0, Lcom/whatsapp/my;

    invoke-direct {v0, p0}, Lcom/whatsapp/my;-><init>(Lcom/whatsapp/PopupNotification;)V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->D:Ljava/lang/Runnable;

    .line 302
    iput-object v1, p0, Lcom/whatsapp/PopupNotification;->E:Ljava/lang/String;

    return-void
.end method

.method static a(Lcom/whatsapp/PopupNotification;F)F
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 407
    iput p1, p0, Lcom/whatsapp/PopupNotification;->z:F

    return p1
.end method

.method static a(Lcom/whatsapp/PopupNotification;I)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 469
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->c(I)I

    move-result v0

    return v0
.end method

.method static a(Lcom/whatsapp/PopupNotification;Landroid/hardware/SensorEventListener;)Landroid/hardware/SensorEventListener;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 478
    iput-object p1, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    return-object p1
.end method

.method private a(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 11
    .parameter

    .prologue
    const/16 v10, 0x11

    const/4 v1, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 465
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 40
    const-string v2, ""

    .line 297
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    const/4 v5, 0x6

    if-ne v0, v5, :cond_2

    .line 382
    iget-object v0, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    aget-object v5, v5, v10

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    if-eqz v3, :cond_9

    .line 100
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v5, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 195
    :goto_0
    iget-wide v5, p1, Lcom/whatsapp/sz;->m:J

    long-to-int v5, v5

    packed-switch v5, :pswitch_data_0

    :cond_1
    :pswitch_0
    move-object v0, v2

    .line 524
    :goto_1
    if-eqz v3, :cond_3

    .line 289
    :cond_2
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    .line 344
    :cond_3
    invoke-static {v0, p0}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 372
    if-nez v1, :cond_8

    :goto_2
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/ze;->b(Landroid/content/res/Resources;)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 395
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 114
    const/high16 v0, -0x100

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 128
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->i:F

    float-to-int v0, v0

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->i:F

    float-to-int v1, v1

    invoke-virtual {v4, v0, v8, v1, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 151
    return-object v4

    .line 457
    :pswitch_1
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v5, 0x7f090258

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v8

    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v9

    invoke-virtual {v2, v5, v6}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 121
    if-eqz v3, :cond_1

    .line 472
    :pswitch_2
    iget-object v5, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 178
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v5, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v2, v5, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    .line 111
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    .line 69
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v5, 0x7f09017e

    new-array v6, v9, [Ljava/lang/Object;

    aput-object v1, v6, v8

    invoke-virtual {v2, v5, v6}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v3, :cond_5

    .line 377
    :cond_4
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v5, 0x7f09017d

    new-array v6, v9, [Ljava/lang/Object;

    aput-object v1, v6, v8

    invoke-virtual {v2, v5, v6}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 460
    :cond_5
    if-eqz v3, :cond_1

    .line 298
    :pswitch_3
    iget-object v1, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v1, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 323
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f09025a

    invoke-virtual {v1, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v3, :cond_1

    .line 351
    :cond_6
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090259

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v0, v5, v8

    invoke-virtual {v1, v2, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 72
    if-eqz v3, :cond_1

    .line 263
    :pswitch_4
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090266

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v0, v5, v8

    invoke-virtual {v1, v2, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 429
    if-eqz v3, :cond_1

    .line 141
    :pswitch_5
    iget-object v1, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v1, :cond_7

    iget-object v1, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 205
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f09025c

    invoke-virtual {v1, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v3, :cond_1

    .line 6
    :cond_7
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f09025b

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v0, v5, v8

    invoke-virtual {v1, v2, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v0, v2

    goto/16 :goto_1

    :cond_8
    move-object v0, v1

    .line 372
    goto/16 :goto_2

    :cond_9
    move-object v0, v1

    goto/16 :goto_0

    .line 195
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_5
    .end packed-switch
.end method

.method static a(Lcom/whatsapp/PopupNotification;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 145
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a(Z)Z
    .locals 1
    .parameter

    .prologue
    .line 294
    invoke-static {p0, p1}, Lcom/whatsapp/eg;->a(Landroid/app/Activity;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->E:Ljava/lang/String;

    .line 285
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->E:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 449
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->showDialog(I)V

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->E:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(I)I
    .locals 2
    .parameter

    .prologue
    .line 242
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 47
    add-int/lit8 p1, p1, -0x1

    .line 211
    :cond_0
    return p1
.end method

.method private b(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 2
    .parameter

    .prologue
    .line 168
    new-instance v0, Landroid/widget/ImageButton;

    invoke-direct {v0, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    .line 38
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 321
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 422
    const v1, 0x7f02000e

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 380
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->g:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    return-object v0
.end method

.method static b(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/GalleryView;
    .locals 1
    .parameter

    .prologue
    .line 311
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    return-object v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 365
    invoke-static {}, Lcom/whatsapp/App;->mb()V

    .line 441
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, v1, :cond_1

    .line 396
    :goto_0
    return-void

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 461
    add-int/lit8 v0, v0, -0x1

    .line 387
    if-gez v0, :cond_2

    .line 68
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 448
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 415
    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 161
    new-instance v3, Landroid/view/animation/TranslateAnimation;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    neg-int v4, v4

    mul-int/2addr v0, v4

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-direct {v3, v0, v5, v5, v5}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 127
    sget v0, Lcom/whatsapp/PopupNotification;->v:I

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 281
    invoke-virtual {v3, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 49
    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 161
    :cond_3
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private c(I)I
    .locals 2
    .parameter

    .prologue
    .line 95
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 525
    add-int/lit8 p1, p1, 0x1

    :cond_0
    return p1
.end method

.method private c(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 5
    .parameter

    .prologue
    .line 230
    new-instance v0, Landroid/widget/ImageButton;

    invoke-direct {v0, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    .line 287
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 174
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 431
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->K:F

    float-to-int v1, v1

    .line 79
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 201
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 78
    if-eqz v1, :cond_0

    .line 333
    new-instance v2, Lcom/whatsapp/o;

    invoke-direct {v2, p0, v1}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 109
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->O:F

    const/high16 v4, 0x42c8

    mul-float/2addr v3, v4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v3, v1

    invoke-virtual {v2, v1}, Lcom/whatsapp/o;->a(F)V

    .line 391
    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 329
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 445
    :cond_0
    const v1, 0x1080004

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 417
    const v1, 0x7f0203da

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 27
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->g:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    return-object v0
.end method

.method static c(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/sz;
    .locals 1
    .parameter

    .prologue
    .line 392
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    return-object v0
.end method

.method private c()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 156
    invoke-static {}, Lcom/whatsapp/App;->mb()V

    .line 126
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 359
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, v1, :cond_1

    .line 295
    :goto_0
    return-void

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 416
    add-int/lit8 v0, v0, 0x1

    .line 430
    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_2

    .line 316
    const/4 v0, 0x0

    .line 366
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 207
    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 436
    new-instance v3, Landroid/view/animation/TranslateAnimation;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    mul-int/2addr v0, v4

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-direct {v3, v0, v5, v5, v5}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 408
    sget v0, Lcom/whatsapp/PopupNotification;->v:I

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 90
    invoke-virtual {v3, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 162
    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 436
    :cond_3
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private d(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 9
    .parameter

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 459
    new-instance v2, Landroid/widget/ImageButton;

    invoke-direct {v2, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    .line 131
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 442
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 494
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    .line 337
    invoke-virtual {v2, v0, v0, v0, v0}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 330
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 265
    if-eqz v0, :cond_4

    .line 301
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->X:I

    if-ne v3, v4, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->X:I

    if-eq v3, v4, :cond_1

    .line 485
    :cond_0
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->X:I

    const/4 v5, 0x1

    invoke-static {v0, v3, v4, v5}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 368
    :cond_1
    iget-wide v3, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    .line 304
    new-instance v3, Lcom/whatsapp/VideoBitmapDrawable;

    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-wide v5, p1, Lcom/whatsapp/sz;->m:J

    invoke-static {v4, v5, v6}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v5, v5, Lcom/whatsapp/j4;->M:F

    invoke-direct {v3, p0, v0, v4, v5}, Lcom/whatsapp/VideoBitmapDrawable;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;F)V

    .line 409
    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->O:F

    invoke-virtual {v3, v4}, Lcom/whatsapp/VideoBitmapDrawable;->a(F)V

    .line 101
    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 353
    if-eqz v1, :cond_3

    .line 470
    :cond_2
    new-instance v3, Lcom/whatsapp/o;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 288
    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->O:F

    invoke-virtual {v3, v4}, Lcom/whatsapp/o;->a(F)V

    .line 235
    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->g:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    return-object v2

    .line 518
    :catch_0
    move-exception v3

    .line 20
    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 220
    if-eqz v1, :cond_3

    .line 32
    :cond_4
    const/16 v0, 0x9

    invoke-virtual {v2, v8, v7, v7, v0}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 533
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 491
    const v0, 0x1080004

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 451
    const v0, 0x7f02000d

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0
.end method

.method static d(Lcom/whatsapp/PopupNotification;)Ljava/util/HashSet;
    .locals 1
    .parameter

    .prologue
    .line 116
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    return-object v0
.end method

.method private e(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 13
    .parameter

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    const/16 v10, 0x8

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 132
    new-instance v4, Landroid/widget/RelativeLayout;

    invoke-direct {v4, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 375
    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 17
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v2, 0x1b

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 308
    const v1, 0x7f03001e

    invoke-virtual {v0, v1, v4, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 171
    const v0, 0x7f0d00cf

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 455
    const v0, 0x7f0d00c8

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 24
    const v0, 0x7f0d00cd

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 73
    const v1, 0x7f0d00ce

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 270
    iget-object v2, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    if-eqz v2, :cond_0

    const-string v2, ""

    iget-object v6, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 208
    :cond_0
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 383
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v3, :cond_7

    .line 296
    :cond_1
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 443
    iget-object v2, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    const-string v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 160
    iget-object v2, p1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    if-eqz v2, :cond_2

    const-string v2, ""

    iget-object v7, p1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 367
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v8, 0x1d

    aget-object v7, v7, v8

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v7, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    sget-object v8, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v9, 0x19

    aget-object v8, v8, v9

    const-string v9, "+"

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v7, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v8, 0x1c

    aget-object v7, v7, v8

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v7, p1, Lcom/whatsapp/sz;->q:D

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, ","

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v7, p1, Lcom/whatsapp/sz;->r:D

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v3, :cond_4

    .line 492
    :cond_3
    iget-object v2, p1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 513
    :cond_4
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    .line 283
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v9, 0x17

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v9, 0x1a

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    aget-object v8, v6, v11

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v9, 0x18

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 508
    array-length v7, v6

    if-le v7, v12, :cond_5

    const-string v7, ""

    aget-object v8, v6, v12

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 519
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 509
    aget-object v6, v6, v12

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v3, :cond_6

    .line 453
    :cond_5
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 447
    :cond_6
    new-instance v6, Lcom/whatsapp/iy;

    invoke-direct {v6, p0, v2}, Lcom/whatsapp/iy;-><init>(Lcom/whatsapp/PopupNotification;Ljava/lang/String;)V

    .line 328
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    :cond_7
    const v0, 0x7f0d007b

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 274
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 222
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->K:F

    float-to-int v1, v1

    .line 108
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 334
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 273
    if-eqz v2, :cond_8

    .line 2
    new-instance v1, Lcom/whatsapp/o;

    invoke-direct {v1, p0, v2}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    if-eqz v3, :cond_9

    .line 215
    :cond_8
    new-instance v1, Lcom/whatsapp/o;

    invoke-static {}, Lcom/whatsapp/d5;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 231
    :cond_9
    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->O:F

    invoke-virtual {v1, v2}, Lcom/whatsapp/o;->a(F)V

    .line 476
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->g:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 512
    return-object v4
.end method

.method static e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 292
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    return-object v0
.end method

.method private f(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 8
    .parameter

    .prologue
    const/16 v7, 0x11

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 172
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 44
    iget-object v0, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/ze;->b(Landroid/content/res/Resources;)F

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 483
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 397
    const/high16 v0, -0x100

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    :try_start_0
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg;->b(Ljava/lang/String;)Lg;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lb; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    .line 11
    :goto_0
    if-eqz v0, :cond_2

    iget-object v3, v0, Lg;->f:[B

    if-eqz v3, :cond_2

    iget-object v3, v0, Lg;->f:[B

    array-length v3, v3

    if-lez v3, :cond_2

    .line 477
    :try_start_1
    iget-object v0, v0, Lg;->f:[B

    invoke-static {v0}, Lwb;->b([B)[B

    move-result-object v0

    .line 91
    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 260
    :goto_1
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f02041c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 514
    if-eqz v0, :cond_0

    .line 147
    new-instance v4, Lcom/whatsapp/o;

    invoke-direct {v4, p0, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 414
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-virtual {v4, v6, v6, v0, v5}, Lcom/whatsapp/o;->setBounds(IIII)V

    .line 167
    invoke-virtual {v2, v4, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 520
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 258
    :cond_0
    invoke-virtual {v2, v3, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 148
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 228
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->K:F

    float-to-int v1, v1

    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->K:F

    float-to-int v3, v3

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->K:F

    float-to-int v4, v4

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 247
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 400
    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 255
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 225
    return-object v0

    .line 467
    :catch_0
    move-exception v0

    .line 257
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 166
    goto :goto_0

    .line 435
    :catch_1
    move-exception v0

    .line 124
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 65
    goto :goto_0

    .line 424
    :catch_2
    move-exception v0

    .line 52
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0

    .line 94
    :catch_3
    move-exception v0

    .line 473
    sget-object v3, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    aget-object v3, v3, v5

    invoke-static {v3, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 419
    goto :goto_1

    .line 291
    :catch_4
    move-exception v0

    .line 5
    sget-object v3, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    aget-object v3, v3, v5

    invoke-static {v3, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method static f(Lcom/whatsapp/PopupNotification;)Ljava/util/HashSet;
    .locals 1
    .parameter

    .prologue
    .line 15
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->j:Ljava/util/HashSet;

    return-object v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 486
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 93
    const/high16 v0, 0x40a0

    iput v0, p0, Lcom/whatsapp/PopupNotification;->z:F

    .line 471
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->C:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 480
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->C:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->D:Ljava/lang/Runnable;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 305
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->x:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    .line 62
    new-instance v0, Lcom/whatsapp/ny;

    invoke-direct {v0, p0}, Lcom/whatsapp/ny;-><init>(Lcom/whatsapp/PopupNotification;)V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    .line 246
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->w:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->x:Landroid/hardware/Sensor;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 143
    :cond_0
    return-void
.end method

.method private g(Lcom/whatsapp/sz;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 87
    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    packed-switch v0, :pswitch_data_0

    .line 527
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0

    .line 107
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->a(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 83
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->b(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 437
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->c(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 501
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->d(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 202
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 63
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/whatsapp/PopupNotification;->f(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 87
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method static g(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/ConversationTextEntry;
    .locals 1
    .parameter

    .prologue
    .line 267
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 248
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v1, 0x14

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 343
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->A:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->B:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 403
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->A:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->B:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 349
    return-void
.end method

.method private h()V
    .locals 4

    .prologue
    .line 218
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    if-eqz v0, :cond_0

    .line 446
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a0005

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->L:F

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 262
    if-nez v0, :cond_1

    .line 516
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->l()Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v1, v0

    .line 404
    :goto_0
    const v0, 0x7f0d0148

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 112
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 51
    :cond_0
    return-void

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method

.method static h(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 345
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->c()V

    return-void
.end method

.method private i()V
    .locals 10

    .prologue
    const/4 v4, -0x1

    const/4 v9, 0x0

    const/16 v8, 0x8

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 80
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    if-nez v0, :cond_1

    .line 532
    :cond_0
    :goto_0
    return-void

    .line 89
    :cond_1
    invoke-direct {p0, v1}, Lcom/whatsapp/PopupNotification;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 254
    const/16 v0, 0x6a

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->showDialog(I)V

    goto :goto_0

    .line 154
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    invoke-virtual {v0}, Lcom/whatsapp/ConversationTextEntry;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_3

    .line 192
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-static {v3, v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/zq;Ljava/lang/String;)V

    .line 322
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    invoke-virtual {v0}, Lcom/whatsapp/ConversationTextEntry;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/method/TextKeyListener;->clear(Landroid/text/Editable;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_4

    .line 378
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 496
    :cond_4
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v3, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v5, 0xc

    aget-object v3, v3, v5

    invoke-virtual {v0, v3}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 493
    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isFullscreenMode()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 30
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    invoke-virtual {v3}, Lcom/whatsapp/ConversationTextEntry;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 354
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v5

    .line 379
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/PopupNotification;->b(I)I

    move-result v3

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v7, 0xe

    aget-object v6, v6, v7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v6, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v7, 0xb

    aget-object v6, v6, v7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v6, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v7, 0xa

    aget-object v6, v6, v7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v6, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 510
    iget-object v6, p0, Lcom/whatsapp/PopupNotification;->i:Ljava/util/HashSet;

    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v6, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 475
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 106
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 456
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->finish()V

    goto/16 :goto_0

    .line 269
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v5}, Lcom/whatsapp/GalleryView;->removeViewAt(I)V

    .line 374
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v3, v0, :cond_c

    .line 369
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    move v0, v1

    .line 158
    :goto_1
    iget-object v5, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v5, v1, :cond_b

    .line 115
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    iget-object v5, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v5}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v3, v5}, Lcom/whatsapp/GalleryView;->removeViewAt(I)V

    .line 55
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v3, v2}, Lcom/whatsapp/GalleryView;->removeViewAt(I)V

    .line 64
    const v3, 0x7f0d0155

    invoke-virtual {p0, v3}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 439
    const v3, 0x7f0d0154

    invoke-virtual {p0, v3}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 411
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->r:Landroid/view/View;

    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 500
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->t:Landroid/view/View;

    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 186
    :goto_2
    invoke-direct {p0, v2}, Lcom/whatsapp/PopupNotification;->c(I)I

    move-result v2

    .line 163
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v3, v2}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 70
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    if-eqz v3, :cond_7

    .line 226
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    iget-object v5, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v5, v5, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_7
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    if-eqz v3, :cond_8

    .line 214
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->j:Ljava/util/HashSet;

    iget-object v5, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    iget-object v5, v5, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 138
    :cond_8
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v3, v2}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 240
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_9

    move v2, v1

    :goto_3
    if-eqz v0, :cond_a

    move v0, v4

    :goto_4
    mul-int/2addr v0, v2

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-direct {v5, v0, v9, v9, v9}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 58
    sget v0, Lcom/whatsapp/PopupNotification;->v:I

    int-to-long v6, v0

    invoke-virtual {v5, v6, v7}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 489
    invoke-virtual {v5, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 381
    invoke-virtual {v3, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    :cond_9
    move v2, v4

    .line 240
    goto :goto_3

    :cond_a
    move v0, v1

    goto :goto_4

    :cond_b
    move v2, v3

    goto :goto_2

    :cond_c
    move v0, v2

    goto/16 :goto_1
.end method

.method static i(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 317
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->b()V

    return-void
.end method

.method static j()I
    .locals 1

    .prologue
    .line 488
    sget v0, Lcom/whatsapp/PopupNotification;->v:I

    return v0
.end method

.method static j(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 290
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->i()V

    return-void
.end method

.method static k(Lcom/whatsapp/PopupNotification;)Landroid/os/PowerManager$WakeLock;
    .locals 1
    .parameter

    .prologue
    .line 144
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    return-object v0
.end method

.method static l(Lcom/whatsapp/PopupNotification;)Landroid/hardware/SensorEventListener;
    .locals 1
    .parameter

    .prologue
    .line 125
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    return-object v0
.end method

.method static m(Lcom/whatsapp/PopupNotification;)Landroid/hardware/SensorManager;
    .locals 1
    .parameter

    .prologue
    .line 421
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->w:Landroid/hardware/SensorManager;

    return-object v0
.end method

.method static n(Lcom/whatsapp/PopupNotification;)Landroid/hardware/Sensor;
    .locals 1
    .parameter

    .prologue
    .line 502
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->x:Landroid/hardware/Sensor;

    return-object v0
.end method

.method static o(Lcom/whatsapp/PopupNotification;)F
    .locals 1
    .parameter

    .prologue
    .line 54
    iget v0, p0, Lcom/whatsapp/PopupNotification;->z:F

    return v0
.end method

.method static p(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 390
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->g()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 507
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/PopupNotification;->b(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->a(I)V

    .line 42
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 9
    .parameter

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 440
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    .line 196
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    .line 123
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    if-nez v0, :cond_1

    .line 484
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    invoke-static {}, Lcom/whatsapp/App;->kb()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-static {v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/zq;)V

    .line 497
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v7, :cond_3

    invoke-static {}, Lcom/whatsapp/App;->kb()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 530
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 276
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->j:Ljava/util/HashSet;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 341
    :cond_4
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->h()V

    .line 394
    const v0, 0x7f090100

    .line 199
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-byte v1, v1, Lcom/whatsapp/sz;->l:B

    if-ne v1, v8, :cond_5

    .line 324
    const v0, 0x7f090299

    if-eqz v2, :cond_6

    .line 241
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-byte v1, v1, Lcom/whatsapp/sz;->l:B

    const/4 v3, 0x3

    if-ne v1, v3, :cond_6

    .line 188
    const v0, 0x7f09029a

    .line 14
    :cond_6
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->m:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(I)V

    .line 159
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 528
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 325
    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->n:Landroid/widget/TextView;

    if-nez v1, :cond_a

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 272
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v4, v4, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_8

    .line 190
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->p:Landroid/widget/TextView;

    const v1, 0x7f090227

    new-array v3, v8, [Ljava/lang/Object;

    add-int/lit8 v4, p1, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {p0, v1, v3}, Lcom/whatsapp/PopupNotification;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    const v0, 0x7f0d00af

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 423
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    invoke-virtual {v1}, Lcom/whatsapp/ConversationTextEntry;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_9

    .line 361
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 105
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v2, :cond_0

    .line 236
    :cond_9
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 88
    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    goto/16 :goto_0

    :cond_a
    move-object v0, v1

    .line 325
    goto/16 :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 466
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->h()V

    .line 82
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    .line 183
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->e:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 135
    iget-boolean v0, p0, Lcom/whatsapp/PopupNotification;->b:Z

    return v0
.end method

.method public e()V
    .locals 14

    .prologue
    const/4 v13, -0x1

    const/4 v12, -0x2

    const/16 v11, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-boolean v5, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 10
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 176
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->e(Z)I

    move-result v6

    .line 1
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0, v3}, Lcom/whatsapp/App;->e(Z)I

    move-result v7

    .line 157
    if-nez v6, :cond_1

    if-nez v7, :cond_1

    .line 490
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->finish()V

    .line 515
    :cond_0
    :goto_0
    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/PopupNotification;->b(I)I

    move-result v0

    if-nez v0, :cond_9

    const v0, 0x7f0d00af

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_9

    move v1, v2

    .line 506
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    .line 393
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 249
    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 264
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 84
    if-nez v6, :cond_4

    .line 8
    if-eqz v5, :cond_2

    .line 219
    :cond_3
    if-nez v7, :cond_4

    .line 406
    if-eqz v5, :cond_2

    .line 221
    :cond_4
    iget v8, v0, Lcom/whatsapp/zq;->a:I

    if-lez v8, :cond_7

    .line 356
    sget-object v8, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v9, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget v0, v0, Lcom/whatsapp/zq;->a:I

    invoke-virtual {v8, v9, v0}, Lcom/whatsapp/fq;->b(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 251
    iget-object v9, p0, Lcom/whatsapp/PopupNotification;->i:Ljava/util/HashSet;

    iget-object v10, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    .line 279
    iget-object v9, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz v5, :cond_5

    .line 536
    :cond_7
    if-eqz v5, :cond_2

    .line 18
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v8, 0x16

    aget-object v4, v4, v8

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 402
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 522
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->finish()V

    goto/16 :goto_0

    :cond_9
    move v1, v3

    .line 36
    goto/16 :goto_1

    .line 170
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_b

    .line 363
    const v0, 0x7f0d0155

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 458
    const v0, 0x7f0d0154

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 434
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->r:Landroid/view/View;

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 45
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->t:Landroid/view/View;

    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    if-eqz v5, :cond_c

    .line 427
    :cond_b
    const v0, 0x7f0d0155

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 212
    const v0, 0x7f0d0154

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->r:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->t:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 360
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    new-instance v4, Lcom/whatsapp/jy;

    invoke-direct {v4, p0}, Lcom/whatsapp/jy;-><init>(Lcom/whatsapp/PopupNotification;)V

    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 444
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->removeAllViews()V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v2, :cond_d

    .line 261
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 336
    const/16 v4, 0x11

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 386
    new-instance v4, Landroid/widget/RelativeLayout;

    invoke-direct {v4, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 28
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v8, v13, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 326
    const/16 v9, 0xd

    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 146
    invoke-virtual {v4, v0, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 209
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v4}, Lcom/whatsapp/GalleryView;->addView(Landroid/view/View;)V

    .line 498
    :cond_d
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 31
    invoke-direct {p0, v0}, Lcom/whatsapp/PopupNotification;->g(Lcom/whatsapp/sz;)Landroid/view/View;

    move-result-object v0

    .line 140
    new-instance v8, Landroid/widget/RelativeLayout;

    invoke-direct {v8, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 81
    new-instance v9, Landroid/widget/ScrollView;

    invoke-direct {v9, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 217
    new-instance v10, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v10, v13, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 319
    const/16 v11, 0xd

    invoke-virtual {v10, v11}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 130
    invoke-virtual {v9, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 19
    invoke-virtual {v8, v9, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 373
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v8}, Lcom/whatsapp/GalleryView;->addView(Landroid/view/View;)V

    .line 352
    if-eqz v5, :cond_e

    .line 184
    :cond_f
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v2, :cond_10

    .line 282
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 149
    const/16 v4, 0x11

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 256
    new-instance v4, Landroid/widget/RelativeLayout;

    invoke-direct {v4, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 232
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v8, v13, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 7
    const/16 v9, 0xd

    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 293
    invoke-virtual {v4, v0, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v4}, Lcom/whatsapp/GalleryView;->addView(Landroid/view/View;)V

    .line 253
    :cond_10
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    if-eqz v0, :cond_1a

    .line 320
    if-eqz v1, :cond_11

    .line 197
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 23
    new-instance v4, Lcom/whatsapp/ky;

    invoke-direct {v4, p0}, Lcom/whatsapp/ky;-><init>(Lcom/whatsapp/PopupNotification;)V

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 234
    if-eqz v5, :cond_1a

    .line 210
    :cond_11
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v4, v3

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 521
    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v9, p0, Lcom/whatsapp/PopupNotification;->f:Lcom/whatsapp/sz;

    iget-object v9, v9, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v9}, Lcom/whatsapp/uz;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 41
    if-eqz v5, :cond_13

    .line 401
    :cond_12
    add-int/lit8 v0, v4, 0x1

    if-eqz v5, :cond_19

    move v4, v0

    .line 266
    :cond_13
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v4, v0, :cond_14

    move v4, v3

    .line 129
    :cond_14
    :goto_3
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    invoke-direct {p0, v4}, Lcom/whatsapp/PopupNotification;->c(I)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 59
    const v0, 0x7f040001

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v4

    .line 314
    if-eqz v1, :cond_18

    move v0, v2

    :goto_4
    sget v1, Lcom/whatsapp/PopupNotification;->v:I

    mul-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {v4, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 37
    invoke-virtual {v4, v2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 150
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 388
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 342
    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 399
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 405
    const/4 v0, 0x2

    if-eq v6, v0, :cond_15

    const/4 v0, 0x3

    if-ne v6, v0, :cond_0

    .line 306
    :cond_15
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 468
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->f()V

    if-eqz v5, :cond_0

    .line 426
    :cond_16
    const/4 v0, 0x2

    if-eq v7, v0, :cond_17

    const/4 v0, 0x3

    if-ne v7, v0, :cond_0

    .line 299
    :cond_17
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 531
    invoke-direct {p0}, Lcom/whatsapp/PopupNotification;->f()V

    goto/16 :goto_0

    .line 314
    :cond_18
    const/4 v0, 0x2

    goto :goto_4

    :cond_19
    move v4, v0

    goto/16 :goto_2

    :cond_1a
    move v4, v3

    goto :goto_3
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 389
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    invoke-virtual {p0, v2}, Lcom/whatsapp/PopupNotification;->requestWindowFeature(I)Z

    .line 259
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->w:Landroid/hardware/SensorManager;

    .line 185
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->w:Landroid/hardware/SensorManager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->x:Landroid/hardware/Sensor;

    .line 57
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 479
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 77
    if-eqz v0, :cond_0

    .line 517
    const v1, 0x1000000a

    sget-object v2, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    .line 438
    :cond_0
    const v0, 0x7f03004e

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->setContentView(I)V

    .line 495
    sput-object p0, Lcom/whatsapp/PopupNotification;->a:Lcom/whatsapp/PopupNotification;

    .line 487
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->c:Lcom/whatsapp/j4;

    .line 332
    const v0, 0x7f0d0135

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/GalleryView;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    .line 534
    const v0, 0x7f0d00ae

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/ConversationTextEntry;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    .line 327
    const v0, 0x7f0d0158

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->m:Landroid/widget/Button;

    .line 250
    const v0, 0x7f0d0153

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->n:Landroid/widget/TextView;

    .line 280
    const v0, 0x7f0d0043

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->o:Landroid/widget/TextView;

    .line 413
    const v0, 0x7f0d0156

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->p:Landroid/widget/TextView;

    .line 164
    const v0, 0x7f0d0126

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->q:Landroid/view/View;

    .line 137
    const v0, 0x7f0d0151

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->r:Landroid/view/View;

    .line 482
    const v0, 0x7f0d0125

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->s:Landroid/view/View;

    .line 523
    const v0, 0x7f0d0150

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->t:Landroid/view/View;

    .line 9
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->k:Lcom/whatsapp/GalleryView;

    new-instance v1, Lcom/whatsapp/hy;

    invoke-direct {v1, p0}, Lcom/whatsapp/hy;-><init>(Lcom/whatsapp/PopupNotification;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->a(Lcom/whatsapp/gt;)V

    .line 60
    const v0, 0x7f0d0157

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/qy;

    invoke-direct {v1, p0}, Lcom/whatsapp/qy;-><init>(Lcom/whatsapp/PopupNotification;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    new-instance v0, Lcom/whatsapp/ry;

    invoke-direct {v0, p0}, Lcom/whatsapp/ry;-><init>(Lcom/whatsapp/PopupNotification;)V

    iput-object v0, p0, Lcom/whatsapp/PopupNotification;->g:Landroid/view/View$OnClickListener;

    .line 347
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->m:Landroid/widget/Button;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->g:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    new-instance v0, Lcom/whatsapp/sy;

    invoke-direct {v0, p0}, Lcom/whatsapp/sy;-><init>(Lcom/whatsapp/PopupNotification;)V

    .line 113
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->q:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->r:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 433
    new-instance v0, Lcom/whatsapp/ty;

    invoke-direct {v0, p0}, Lcom/whatsapp/ty;-><init>(Lcom/whatsapp/PopupNotification;)V

    .line 110
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->s:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->t:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 503
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    new-instance v1, Lcom/whatsapp/uy;

    invoke-direct {v1, p0}, Lcom/whatsapp/uy;-><init>(Lcom/whatsapp/PopupNotification;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/ConversationTextEntry;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 339
    new-instance v0, Lcom/whatsapp/vy;

    invoke-direct {v0, p0}, Lcom/whatsapp/vy;-><init>(Lcom/whatsapp/PopupNotification;)V

    .line 239
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    invoke-virtual {v1, v0}, Lcom/whatsapp/ConversationTextEntry;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 313
    new-instance v0, Lcom/whatsapp/wy;

    invoke-direct {v0, p0}, Lcom/whatsapp/wy;-><init>(Lcom/whatsapp/PopupNotification;)V

    .line 224
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->l:Lcom/whatsapp/ConversationTextEntry;

    invoke-virtual {v1, v0}, Lcom/whatsapp/ConversationTextEntry;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 134
    const v0, 0x7f0d00af

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 307
    new-instance v1, Lcom/whatsapp/xy;

    invoke-direct {v1, p0}, Lcom/whatsapp/xy;-><init>(Lcom/whatsapp/PopupNotification;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 418
    invoke-virtual {p0}, Lcom/whatsapp/PopupNotification;->e()V

    .line 268
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 526
    invoke-static {}, Lcom/whatsapp/App;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    const/16 v0, 0x73

    invoke-virtual {p0, v0}, Lcom/whatsapp/PopupNotification;->showDialog(I)V

    .line 173
    :cond_1
    return-void
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 5
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 165
    sparse-switch p1, :sswitch_data_0

    .line 104
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 412
    :goto_0
    return-object v0

    .line 312
    :sswitch_0
    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->E:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 191
    new-instance v1, Lcom/whatsapp/oy;

    invoke-direct {v1, p0}, Lcom/whatsapp/oy;-><init>(Lcom/whatsapp/PopupNotification;)V

    .line 76
    new-instance v2, Lcom/whatsapp/py;

    invoke-direct {v2, p0}, Lcom/whatsapp/py;-><init>(Lcom/whatsapp/PopupNotification;)V

    .line 376
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/whatsapp/PopupNotification;->E:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    const v4, 0x7f090010

    invoke-virtual {v3, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v3, 0x7f090011

    invoke-virtual {v1, v3, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 364
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 463
    :cond_0
    sget-object v1, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 35
    :sswitch_1
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 412
    invoke-static {p0}, Lcom/whatsapp/eg;->a(Landroid/app/Activity;)Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0

    .line 165
    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x73 -> :sswitch_1
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 428
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 278
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 34
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->A:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->B:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 340
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->C:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 119
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->u:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    if-eqz v0, :cond_1

    .line 309
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->w:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/whatsapp/PopupNotification;->y:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 189
    :cond_1
    sget-object v0, Lcom/whatsapp/PopupNotification;->a:Lcom/whatsapp/PopupNotification;

    if-ne v0, p0, :cond_2

    .line 462
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/PopupNotification;->a:Lcom/whatsapp/PopupNotification;

    .line 277
    :cond_2
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 175
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 139
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 310
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 450
    invoke-static {}, Lcom/whatsapp/App;->nb()V

    .line 53
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 452
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 66
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/PopupNotification;->b:Z

    .line 318
    return-void
.end method

.method public onStop()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 464
    sget-object v0, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 155
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 358
    iput-boolean v8, p0, Lcom/whatsapp/PopupNotification;->b:Z

    .line 46
    sget-object v0, Lcom/whatsapp/PopupNotification;->a:Lcom/whatsapp/PopupNotification;

    if-ne v0, p0, :cond_5

    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/PopupNotification;->j:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->j:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 331
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v4

    .line 26
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/uz;

    .line 346
    iget-object v6, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iget-object v7, v4, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 71
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v1, :cond_1

    .line 50
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/PopupNotification;->F:[Ljava/lang/String;

    const/4 v6, 0x7

    aget-object v5, v5, v6

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v5, v4, Lcom/whatsapp/zq;->a:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 286
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v5, v4, Lcom/whatsapp/zq;->a:I

    if-ne v0, v5, :cond_4

    .line 315
    invoke-static {v4, v8}, Lcom/whatsapp/App;->a(Lcom/whatsapp/zq;Z)V

    .line 122
    iget-object v0, p0, Lcom/whatsapp/PopupNotification;->h:Ljava/util/HashSet;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 244
    :cond_4
    if-eqz v1, :cond_0

    .line 193
    :cond_5
    invoke-static {v8, v8}, Lcom/whatsapp/App;->a(ZZ)V

    .line 357
    return-void
.end method
