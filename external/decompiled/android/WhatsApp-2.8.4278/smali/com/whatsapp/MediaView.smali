.class public Lcom/whatsapp/MediaView;
.super Lcom/whatsapp/DialogToastActivity;
.source "MediaView.java"


# static fields
.field public static B:Landroid/view/Display;

.field public static L:Lcom/whatsapp/MediaView;

.field public static M:I

.field private static final Z:[Ljava/lang/String;

.field public static w:I


# instance fields
.field private A:Ljava/lang/String;

.field private C:Landroid/net/Uri;

.field D:Z

.field private E:Landroid/os/Handler;

.field private F:I

.field private G:I

.field private H:Landroid/widget/Button;

.field private I:Z

.field private J:Z

.field private K:Landroid/view/View$OnTouchListener;

.field N:J

.field O:I

.field P:I

.field Q:Landroid/os/Handler;

.field R:I

.field S:Z

.field T:Z

.field U:I

.field V:Z

.field W:Lcom/whatsapp/sb;

.field X:Landroid/view/View$OnClickListener;

.field Y:Landroid/os/Handler;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Lcom/whatsapp/TouchImageView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/SeekBar;

.field private l:Landroid/media/MediaPlayer;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/view/View;

.field private r:Lcom/whatsapp/GalleryView;

.field private s:Landroid/view/View;

.field private t:Landroid/widget/LinearLayout;

.field private u:Lcom/whatsapp/j4;

.field private v:Landroid/net/Uri;

.field x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x62

    const/16 v2, 0x4b

    const/16 v1, 0x3c

    const/16 v4, 0x28

    const/4 v6, 0x0

    const/16 v0, 0x3b

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001c7B"

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

    const-string v0, "_$\u000fW[S%\u001b\u001cZU(\u0011\nGRe\u0005\u0018DP.\u0010\u0000"

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

    const-string v0, "_$\u000fW[S%\u001b\u001cZU(\u0011\nGRe\u0005\u0018DP.\u0010\u0000\u0006q$\u0014\u0010Mj\"\u0007\u000e"

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

    const-string v0, "o$\u000c\u0000"

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

    const-string v0, "J\"\u0006\u001cG\u0013a"

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

    const-string v0, "]%\u0006\u000bGU/L\u0010FH.\u000c\r\u0006](\u0016\u0010GRe40mk"

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

    const-string v0, "K*\u000e\u0015X];\u0007\u000b\u0007_9\r\t\u0007T.\u000b\u001e@Hq"

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

    const-string v0, "O(\u0003\u0015Mi;+\u001ffY.\u0006\u001cL"

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

    const-string v0, "S>\u0016\t]H\u0013"

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

    const-string v0, "S>\u0016\t]H\u0012"

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

    const-string v0, "]%\u0006\u000bGU/L\u0010FH.\u000c\r\u0006](\u0016\u0010GRe20kw"

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

    const-string v0, "O(\u0003\u0015M"

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

    const-string v0, "S>\u0016\t]H\r\r\u000bE]?"

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

    const-string v0, "U&\u0003\u001eM\u0013a"

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

    const-string v0, "_9\r\tjE\u0004\u0017\rXI?1\u0010RY"

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

    const-string v0, "S>\u0016\t]H"

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

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007S%\u0011\rGLd\u0010\u001cKE(\u000e\u001c\u0007H$\u0017\u001a@c\"\u000f\u0018OY\u0014\u0014\u0010MK"

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

    const-string v0, "s\u0019+<fh\n60grk!1ir\u000c\'"

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

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007S%\u0006\u001c[H9\r\u0000"

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

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007Z\"\u000e\u0015^U.\u0015VJU?\u000f\u0018X\u0013%\u0017\u0015D"

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

    const-string v0, "}>\u0006\u0010G"

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

    const-string v0, "u&\u0003\u001eM"

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

    const-string v0, "[*\u000e\u0015MN2O\u001fAP\'\u0014\u0010MKd"

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

    const-string v0, "Z\"\u000e\u0015^U.\u0015"

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

    const-string v0, "N.\u0016\u000cZRf\u0006\u0018\\]"

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

    const-string v0, "N*\u0015&KS%\u0016\u0018KH\u0014\u000b\u001d\u0012"

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

    const-string v0, "L#\r\rG"

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

    const-string v0, "c\"\u0006"

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

    const-string v0, "X*\u0016\u0018"

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

    const-string v0, "]=\u0003\rIN\u0014\u0015\u0010LH#X"

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

    const-string v0, "_$\u000c\rI_?=\u0010L\u0001t"

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

    const-string v0, "]>\u0006\u0010G\u001c/\u0017\u000bIH\"\r\u0017\u0012"

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

    const-string v0, "]>\u0006\u0010G\u0013a"

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

    const-string v0, "]%\u0006\u000bGU/L\u0010FH.\u000c\r\u0006](\u0016\u0010GRe1<fx"

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

    const-string v0, "]%\u0006\u000bGU/L\u0010FH.\u000c\r\u0006Y3\u0016\u000bI\u0012\u00186+m}\u0006"

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

    const-string v0, "\u001c  "

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

    const-string v0, "r*\u0016\u0010^Yk\n\u001cILk\u0011\u0010RYk\u0003\u001f\\Y9B\u001aDY*\u000c\u000cX\u0006"

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

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007T*\u000c\u001dDYf\r\u000c\\\u0011$\u0004TEY&\r\u000bQ\u00139\u0007\u001aQ_\'\u0007C"

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

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007T*\u000c\u001dDY\u0004\u0017\rgZ\u0006\u0007\u0014GN2M4IDk44\u0008T.\u0003\t\u0008O\"\u0018\u001c\u0015"

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

    const-string v0, "r*\u0016\u0010^Yk\n\u001cILk\u0011\u0010RYk\u0000\u001cNS9\u0007YKP.\u0003\u0017]Lq"

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

    const-string v0, "w\t"

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

    aput-object v0, v9, v4

    const/16 v10, 0x29

    const-string v0, "N*\u0015&KS%\u0016\u0018KH\u0014\u000b\u001d\u0008\u0001k"

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

    const-string v0, "X*\u0016\u0018\u0019\t"

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

    const-string v0, "c\"\u0006Y\u0015\u001c"

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

    const-string v0, "N*\u0015&KS%\u0016\u0018KH\u0014\u000b\u001d"

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

    const-string v0, "U8=\n]L.\u0010&XN\"\u000f\u0018ZE"

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

    const-string v0, "\u001c\n,=\u0008"

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

    const-string v0, "Q\"\u000f\u001c\\E;\u0007"

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

    const-string v0, "\u0001vE"

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

    const-string v0, "J%\u0006WIR/\u0010\u0016AXe\u0001\u000cZO$\u0010WAH.\u000fVXT$\u0016\u0016"

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

    const-string v0, "V\"\u0006"

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

    const-string v0, "W.\u001b"

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

    const-string v0, "_$\u000fW_T*\u0016\nIL;L\u0014MX\"\u0003\u000fAY<L\nAR,\u000e\u001c^U.\u0015"

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

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007L\'\u0003\u0000J](\t&NU\'\u0007C"

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

    const/16 v10, 0x36

    const-string v0, "O.\u0016\nK]\'\u0007C"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_36
    if-gt v7, v8, :cond_36

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x37

    const-string v0, "L$\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_37
    if-gt v7, v8, :cond_37

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x38

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007S%\u0001\u000bM]?\u0007VGS&M\u0011M];B\nAF.X"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_38
    if-gt v7, v8, :cond_38

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x39

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007J\"\u0007\u000e\u0008Q.\u0011\nI[.X"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_39
    if-gt v7, v8, :cond_39

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x3a

    const-string v0, "Q.\u0006\u0010IJ\"\u0007\u000e\u0007_9\u0007\u0018\\Y"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_3a
    if-gt v6, v7, :cond_3a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_3b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_3b

    :pswitch_1
    move v0, v2

    goto :goto_3b

    :pswitch_2
    move v0, v3

    goto :goto_3b

    :pswitch_3
    const/16 v0, 0x79

    goto :goto_3b

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3c

    :pswitch_5
    move v0, v2

    goto :goto_3c

    :pswitch_6
    move v0, v3

    goto :goto_3c

    :pswitch_7
    const/16 v0, 0x79

    goto :goto_3c

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_3d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_3d

    :pswitch_9
    move v0, v2

    goto :goto_3d

    :pswitch_a
    move v0, v3

    goto :goto_3d

    :pswitch_b
    const/16 v0, 0x79

    goto :goto_3d

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_3e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_3e

    :pswitch_d
    move v0, v2

    goto :goto_3e

    :pswitch_e
    move v0, v3

    goto :goto_3e

    :pswitch_f
    const/16 v0, 0x79

    goto :goto_3e

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_3f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_3f

    :pswitch_11
    move v0, v2

    goto :goto_3f

    :pswitch_12
    move v0, v3

    goto :goto_3f

    :pswitch_13
    const/16 v0, 0x79

    goto :goto_3f

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_40
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_40

    :pswitch_15
    move v0, v2

    goto :goto_40

    :pswitch_16
    move v0, v3

    goto :goto_40

    :pswitch_17
    const/16 v0, 0x79

    goto :goto_40

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_41
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_41

    :pswitch_19
    move v0, v2

    goto :goto_41

    :pswitch_1a
    move v0, v3

    goto :goto_41

    :pswitch_1b
    const/16 v0, 0x79

    goto :goto_41

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_42
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_42

    :pswitch_1d
    move v0, v2

    goto :goto_42

    :pswitch_1e
    move v0, v3

    goto :goto_42

    :pswitch_1f
    const/16 v0, 0x79

    goto :goto_42

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_43
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_43

    :pswitch_21
    move v0, v2

    goto :goto_43

    :pswitch_22
    move v0, v3

    goto :goto_43

    :pswitch_23
    const/16 v0, 0x79

    goto :goto_43

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_44
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_44

    :pswitch_25
    move v0, v2

    goto :goto_44

    :pswitch_26
    move v0, v3

    goto :goto_44

    :pswitch_27
    const/16 v0, 0x79

    goto :goto_44

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_45
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_45

    :pswitch_29
    move v0, v2

    goto :goto_45

    :pswitch_2a
    move v0, v3

    goto :goto_45

    :pswitch_2b
    const/16 v0, 0x79

    goto :goto_45

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_46
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_46

    :pswitch_2d
    move v0, v2

    goto :goto_46

    :pswitch_2e
    move v0, v3

    goto :goto_46

    :pswitch_2f
    const/16 v0, 0x79

    goto :goto_46

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_47
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_47

    :pswitch_31
    move v0, v2

    goto :goto_47

    :pswitch_32
    move v0, v3

    goto :goto_47

    :pswitch_33
    const/16 v0, 0x79

    goto :goto_47

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_48
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_48

    :pswitch_35
    move v0, v2

    goto :goto_48

    :pswitch_36
    move v0, v3

    goto :goto_48

    :pswitch_37
    const/16 v0, 0x79

    goto :goto_48

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_49
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_49

    :pswitch_39
    move v0, v2

    goto :goto_49

    :pswitch_3a
    move v0, v3

    goto :goto_49

    :pswitch_3b
    const/16 v0, 0x79

    goto :goto_49

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_4a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_4a

    :pswitch_3d
    move v0, v2

    goto :goto_4a

    :pswitch_3e
    move v0, v3

    goto :goto_4a

    :pswitch_3f
    const/16 v0, 0x79

    goto :goto_4a

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_4b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_4b

    :pswitch_41
    move v0, v2

    goto :goto_4b

    :pswitch_42
    move v0, v3

    goto :goto_4b

    :pswitch_43
    const/16 v0, 0x79

    goto :goto_4b

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_4c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_4c

    :pswitch_45
    move v0, v2

    goto :goto_4c

    :pswitch_46
    move v0, v3

    goto :goto_4c

    :pswitch_47
    const/16 v0, 0x79

    goto :goto_4c

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_4d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_4d

    :pswitch_49
    move v0, v2

    goto :goto_4d

    :pswitch_4a
    move v0, v3

    goto :goto_4d

    :pswitch_4b
    const/16 v0, 0x79

    goto :goto_4d

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_4e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_4e

    :pswitch_4d
    move v0, v2

    goto :goto_4e

    :pswitch_4e
    move v0, v3

    goto :goto_4e

    :pswitch_4f
    const/16 v0, 0x79

    goto :goto_4e

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_4f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_4f

    :pswitch_51
    move v0, v2

    goto :goto_4f

    :pswitch_52
    move v0, v3

    goto :goto_4f

    :pswitch_53
    const/16 v0, 0x79

    goto :goto_4f

    :cond_15
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_50
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_50

    :pswitch_55
    move v0, v2

    goto :goto_50

    :pswitch_56
    move v0, v3

    goto :goto_50

    :pswitch_57
    const/16 v0, 0x79

    goto :goto_50

    :cond_16
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_16

    move v0, v4

    :goto_51
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_16

    :pswitch_58
    move v0, v1

    goto :goto_51

    :pswitch_59
    move v0, v2

    goto :goto_51

    :pswitch_5a
    move v0, v3

    goto :goto_51

    :pswitch_5b
    const/16 v0, 0x79

    goto :goto_51

    :cond_17
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_17

    move v0, v4

    :goto_52
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_17

    :pswitch_5c
    move v0, v1

    goto :goto_52

    :pswitch_5d
    move v0, v2

    goto :goto_52

    :pswitch_5e
    move v0, v3

    goto :goto_52

    :pswitch_5f
    const/16 v0, 0x79

    goto :goto_52

    :cond_18
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_18

    move v0, v4

    :goto_53
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_18

    :pswitch_60
    move v0, v1

    goto :goto_53

    :pswitch_61
    move v0, v2

    goto :goto_53

    :pswitch_62
    move v0, v3

    goto :goto_53

    :pswitch_63
    const/16 v0, 0x79

    goto :goto_53

    :cond_19
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_19

    move v0, v4

    :goto_54
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_19

    :pswitch_64
    move v0, v1

    goto :goto_54

    :pswitch_65
    move v0, v2

    goto :goto_54

    :pswitch_66
    move v0, v3

    goto :goto_54

    :pswitch_67
    const/16 v0, 0x79

    goto :goto_54

    :cond_1a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1a

    move v0, v4

    :goto_55
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1a

    :pswitch_68
    move v0, v1

    goto :goto_55

    :pswitch_69
    move v0, v2

    goto :goto_55

    :pswitch_6a
    move v0, v3

    goto :goto_55

    :pswitch_6b
    const/16 v0, 0x79

    goto :goto_55

    :cond_1b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1b

    move v0, v4

    :goto_56
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1b

    :pswitch_6c
    move v0, v1

    goto :goto_56

    :pswitch_6d
    move v0, v2

    goto :goto_56

    :pswitch_6e
    move v0, v3

    goto :goto_56

    :pswitch_6f
    const/16 v0, 0x79

    goto :goto_56

    :cond_1c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1c

    move v0, v4

    :goto_57
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1c

    :pswitch_70
    move v0, v1

    goto :goto_57

    :pswitch_71
    move v0, v2

    goto :goto_57

    :pswitch_72
    move v0, v3

    goto :goto_57

    :pswitch_73
    const/16 v0, 0x79

    goto :goto_57

    :cond_1d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1d

    move v0, v4

    :goto_58
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1d

    :pswitch_74
    move v0, v1

    goto :goto_58

    :pswitch_75
    move v0, v2

    goto :goto_58

    :pswitch_76
    move v0, v3

    goto :goto_58

    :pswitch_77
    const/16 v0, 0x79

    goto :goto_58

    :cond_1e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1e

    move v0, v4

    :goto_59
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1e

    :pswitch_78
    move v0, v1

    goto :goto_59

    :pswitch_79
    move v0, v2

    goto :goto_59

    :pswitch_7a
    move v0, v3

    goto :goto_59

    :pswitch_7b
    const/16 v0, 0x79

    goto :goto_59

    :cond_1f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1f

    move v0, v4

    :goto_5a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1f

    :pswitch_7c
    move v0, v1

    goto :goto_5a

    :pswitch_7d
    move v0, v2

    goto :goto_5a

    :pswitch_7e
    move v0, v3

    goto :goto_5a

    :pswitch_7f
    const/16 v0, 0x79

    goto :goto_5a

    :cond_20
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_20

    move v0, v4

    :goto_5b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_20

    :pswitch_80
    move v0, v1

    goto :goto_5b

    :pswitch_81
    move v0, v2

    goto :goto_5b

    :pswitch_82
    move v0, v3

    goto :goto_5b

    :pswitch_83
    const/16 v0, 0x79

    goto :goto_5b

    :cond_21
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_21

    move v0, v4

    :goto_5c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_21

    :pswitch_84
    move v0, v1

    goto :goto_5c

    :pswitch_85
    move v0, v2

    goto :goto_5c

    :pswitch_86
    move v0, v3

    goto :goto_5c

    :pswitch_87
    const/16 v0, 0x79

    goto :goto_5c

    :cond_22
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_22

    move v0, v4

    :goto_5d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_22

    :pswitch_88
    move v0, v1

    goto :goto_5d

    :pswitch_89
    move v0, v2

    goto :goto_5d

    :pswitch_8a
    move v0, v3

    goto :goto_5d

    :pswitch_8b
    const/16 v0, 0x79

    goto :goto_5d

    :cond_23
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_23

    move v0, v4

    :goto_5e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_23

    :pswitch_8c
    move v0, v1

    goto :goto_5e

    :pswitch_8d
    move v0, v2

    goto :goto_5e

    :pswitch_8e
    move v0, v3

    goto :goto_5e

    :pswitch_8f
    const/16 v0, 0x79

    goto :goto_5e

    :cond_24
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_24

    move v0, v4

    :goto_5f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_24

    :pswitch_90
    move v0, v1

    goto :goto_5f

    :pswitch_91
    move v0, v2

    goto :goto_5f

    :pswitch_92
    move v0, v3

    goto :goto_5f

    :pswitch_93
    const/16 v0, 0x79

    goto :goto_5f

    :cond_25
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_25

    move v0, v4

    :goto_60
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_25

    :pswitch_94
    move v0, v1

    goto :goto_60

    :pswitch_95
    move v0, v2

    goto :goto_60

    :pswitch_96
    move v0, v3

    goto :goto_60

    :pswitch_97
    const/16 v0, 0x79

    goto :goto_60

    :cond_26
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_26

    move v0, v4

    :goto_61
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_26

    :pswitch_98
    move v0, v1

    goto :goto_61

    :pswitch_99
    move v0, v2

    goto :goto_61

    :pswitch_9a
    move v0, v3

    goto :goto_61

    :pswitch_9b
    const/16 v0, 0x79

    goto :goto_61

    :cond_27
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_27

    move v0, v4

    :goto_62
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_27

    :pswitch_9c
    move v0, v1

    goto :goto_62

    :pswitch_9d
    move v0, v2

    goto :goto_62

    :pswitch_9e
    move v0, v3

    goto :goto_62

    :pswitch_9f
    const/16 v0, 0x79

    goto :goto_62

    :cond_28
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_28

    move v0, v4

    :goto_63
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_28

    :pswitch_a0
    move v0, v1

    goto :goto_63

    :pswitch_a1
    move v0, v2

    goto :goto_63

    :pswitch_a2
    move v0, v3

    goto :goto_63

    :pswitch_a3
    const/16 v0, 0x79

    goto :goto_63

    :cond_29
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_29

    move v0, v4

    :goto_64
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_29

    :pswitch_a4
    move v0, v1

    goto :goto_64

    :pswitch_a5
    move v0, v2

    goto :goto_64

    :pswitch_a6
    move v0, v3

    goto :goto_64

    :pswitch_a7
    const/16 v0, 0x79

    goto :goto_64

    :cond_2a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2a

    move v0, v4

    :goto_65
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2a

    :pswitch_a8
    move v0, v1

    goto :goto_65

    :pswitch_a9
    move v0, v2

    goto :goto_65

    :pswitch_aa
    move v0, v3

    goto :goto_65

    :pswitch_ab
    const/16 v0, 0x79

    goto :goto_65

    :cond_2b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2b

    move v0, v4

    :goto_66
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2b

    :pswitch_ac
    move v0, v1

    goto :goto_66

    :pswitch_ad
    move v0, v2

    goto :goto_66

    :pswitch_ae
    move v0, v3

    goto :goto_66

    :pswitch_af
    const/16 v0, 0x79

    goto :goto_66

    :cond_2c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2c

    move v0, v4

    :goto_67
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2c

    :pswitch_b0
    move v0, v1

    goto :goto_67

    :pswitch_b1
    move v0, v2

    goto :goto_67

    :pswitch_b2
    move v0, v3

    goto :goto_67

    :pswitch_b3
    const/16 v0, 0x79

    goto :goto_67

    :cond_2d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2d

    move v0, v4

    :goto_68
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2d

    :pswitch_b4
    move v0, v1

    goto :goto_68

    :pswitch_b5
    move v0, v2

    goto :goto_68

    :pswitch_b6
    move v0, v3

    goto :goto_68

    :pswitch_b7
    const/16 v0, 0x79

    goto :goto_68

    :cond_2e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2e

    move v0, v4

    :goto_69
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2e

    :pswitch_b8
    move v0, v1

    goto :goto_69

    :pswitch_b9
    move v0, v2

    goto :goto_69

    :pswitch_ba
    move v0, v3

    goto :goto_69

    :pswitch_bb
    const/16 v0, 0x79

    goto :goto_69

    :cond_2f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2f

    move v0, v4

    :goto_6a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2f

    :pswitch_bc
    move v0, v1

    goto :goto_6a

    :pswitch_bd
    move v0, v2

    goto :goto_6a

    :pswitch_be
    move v0, v3

    goto :goto_6a

    :pswitch_bf
    const/16 v0, 0x79

    goto :goto_6a

    :cond_30
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_30

    move v0, v4

    :goto_6b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_30

    :pswitch_c0
    move v0, v1

    goto :goto_6b

    :pswitch_c1
    move v0, v2

    goto :goto_6b

    :pswitch_c2
    move v0, v3

    goto :goto_6b

    :pswitch_c3
    const/16 v0, 0x79

    goto :goto_6b

    :cond_31
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_31

    move v0, v4

    :goto_6c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_31

    :pswitch_c4
    move v0, v1

    goto :goto_6c

    :pswitch_c5
    move v0, v2

    goto :goto_6c

    :pswitch_c6
    move v0, v3

    goto :goto_6c

    :pswitch_c7
    const/16 v0, 0x79

    goto :goto_6c

    :cond_32
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_32

    move v0, v4

    :goto_6d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_32

    :pswitch_c8
    move v0, v1

    goto :goto_6d

    :pswitch_c9
    move v0, v2

    goto :goto_6d

    :pswitch_ca
    move v0, v3

    goto :goto_6d

    :pswitch_cb
    const/16 v0, 0x79

    goto :goto_6d

    :cond_33
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_33

    move v0, v4

    :goto_6e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_33

    :pswitch_cc
    move v0, v1

    goto :goto_6e

    :pswitch_cd
    move v0, v2

    goto :goto_6e

    :pswitch_ce
    move v0, v3

    goto :goto_6e

    :pswitch_cf
    const/16 v0, 0x79

    goto :goto_6e

    :cond_34
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_34

    move v0, v4

    :goto_6f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_34

    :pswitch_d0
    move v0, v1

    goto :goto_6f

    :pswitch_d1
    move v0, v2

    goto :goto_6f

    :pswitch_d2
    move v0, v3

    goto :goto_6f

    :pswitch_d3
    const/16 v0, 0x79

    goto :goto_6f

    :cond_35
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_35

    move v0, v4

    :goto_70
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_35

    :pswitch_d4
    move v0, v1

    goto :goto_70

    :pswitch_d5
    move v0, v2

    goto :goto_70

    :pswitch_d6
    move v0, v3

    goto :goto_70

    :pswitch_d7
    const/16 v0, 0x79

    goto :goto_70

    :cond_36
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_36

    move v0, v4

    :goto_71
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_36

    :pswitch_d8
    move v0, v1

    goto :goto_71

    :pswitch_d9
    move v0, v2

    goto :goto_71

    :pswitch_da
    move v0, v3

    goto :goto_71

    :pswitch_db
    const/16 v0, 0x79

    goto :goto_71

    :cond_37
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_37

    move v0, v4

    :goto_72
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_37

    :pswitch_dc
    move v0, v1

    goto :goto_72

    :pswitch_dd
    move v0, v2

    goto :goto_72

    :pswitch_de
    move v0, v3

    goto :goto_72

    :pswitch_df
    const/16 v0, 0x79

    goto :goto_72

    :cond_38
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_38

    move v0, v4

    :goto_73
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_38

    :pswitch_e0
    move v0, v1

    goto :goto_73

    :pswitch_e1
    move v0, v2

    goto :goto_73

    :pswitch_e2
    move v0, v3

    goto :goto_73

    :pswitch_e3
    const/16 v0, 0x79

    goto :goto_73

    :cond_39
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_39

    move v0, v4

    :goto_74
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_39

    :pswitch_e4
    move v0, v1

    goto :goto_74

    :pswitch_e5
    move v0, v2

    goto :goto_74

    :pswitch_e6
    move v0, v3

    goto :goto_74

    :pswitch_e7
    const/16 v0, 0x79

    goto :goto_74

    :cond_3a
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3a

    move v0, v4

    :goto_75
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3a

    :pswitch_e8
    move v0, v1

    goto :goto_75

    :pswitch_e9
    move v0, v2

    goto :goto_75

    :pswitch_ea
    move v0, v3

    goto :goto_75

    :pswitch_eb
    const/16 v0, 0x79

    goto :goto_75

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
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 200
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 259
    iput-boolean v0, p0, Lcom/whatsapp/MediaView;->I:Z

    .line 214
    iput v0, p0, Lcom/whatsapp/MediaView;->R:I

    .line 68
    iput-boolean v0, p0, Lcom/whatsapp/MediaView;->S:Z

    .line 464
    iput-boolean v0, p0, Lcom/whatsapp/MediaView;->T:Z

    .line 450
    iput-boolean v0, p0, Lcom/whatsapp/MediaView;->V:Z

    .line 135
    new-instance v0, Lcom/whatsapp/bx;

    invoke-direct {v0, p0}, Lcom/whatsapp/bx;-><init>(Lcom/whatsapp/MediaView;)V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->X:Landroid/view/View$OnClickListener;

    .line 458
    new-instance v0, Lcom/whatsapp/kd;

    invoke-direct {v0, p0}, Lcom/whatsapp/kd;-><init>(Lcom/whatsapp/MediaView;)V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->Y:Landroid/os/Handler;

    .line 128
    return-void
.end method

.method private a(I)I
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x4

    .line 31
    if-ge p1, v0, :cond_1

    .line 111
    const/4 v0, 0x1

    .line 469
    :cond_0
    :goto_0
    return v0

    .line 244
    :cond_1
    const/4 v1, 0x7

    if-ge p1, v1, :cond_0

    .line 361
    const/4 v0, 0x2

    goto :goto_0
.end method

.method public static a(Lcom/whatsapp/sz;Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    .line 296
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/whatsapp/MediaView;

    invoke-direct {v1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 78
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 154
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x33

    aget-object v0, v0, v3

    iget-object v3, p0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v3}, Lcom/whatsapp/uz;->hashCode()I

    move-result v3

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 257
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x32

    aget-object v0, v0, v3

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 436
    iget-object v0, p0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    iget-object v0, p0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    iget-object v0, p0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x34

    aget-object v0, v0, v3

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 307
    return-object v1

    .line 175
    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/MediaView;)Landroid/media/MediaPlayer;
    .locals 1
    .parameter

    .prologue
    .line 267
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method static a(Lcom/whatsapp/MediaView;Lcom/whatsapp/TouchImageView;)Lcom/whatsapp/TouchImageView;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 419
    iput-object p1, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    return-object p1
.end method

.method private a()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 150
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 84
    :cond_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    .line 264
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/whatsapp/yw;

    invoke-direct {v1, p0}, Lcom/whatsapp/yw;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 96
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/whatsapp/zw;

    invoke-direct {v1, p0}, Lcom/whatsapp/zw;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 367
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0x1f

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x5

    iput v0, p0, Lcom/whatsapp/MediaView;->G:I

    .line 350
    iget-object v0, p0, Lcom/whatsapp/MediaView;->j:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f090222

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/MediaView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    iget-object v0, p0, Lcom/whatsapp/MediaView;->k:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 527
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/MediaView;->k:Landroid/widget/SeekBar;

    invoke-virtual {v0, v6}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 529
    iget-object v0, p0, Lcom/whatsapp/MediaView;->H:Landroid/widget/Button;

    const v1, 0x7f0901f4

    invoke-virtual {p0, v1}, Lcom/whatsapp/MediaView;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 218
    return-void

    .line 73
    :catch_0
    move-exception v0

    .line 279
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 398
    const v0, 0x7f090210

    new-instance v1, Lcom/whatsapp/ax;

    invoke-direct {v1, p0}, Lcom/whatsapp/ax;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/nr;)V

    goto :goto_0
.end method

.method private a(ILcom/whatsapp/TouchImageView;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 148
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/TouchImageView;Lcom/whatsapp/TouchImageView;Z)V

    .line 226
    return-void
.end method

.method private a(ILcom/whatsapp/TouchImageView;Lcom/whatsapp/TouchImageView;Z)V
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 483
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->T:Z

    if-eqz v0, :cond_0

    .line 424
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x17

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 199
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 505
    :cond_1
    :goto_0
    return-void

    .line 152
    :cond_2
    invoke-virtual {p0, p1}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v1

    .line 282
    iget-object v0, v1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 49
    iget-object v3, p0, Lcom/whatsapp/MediaView;->s:Landroid/view/View;

    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 254
    iget-object v3, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v3, v3, Lcom/whatsapp/uz;->b:Z

    if-nez v3, :cond_3

    iget-boolean v3, v0, Lcom/whatsapp/MediaData;->transferred:Z

    if-nez v3, :cond_3

    iget-wide v3, v0, Lcom/whatsapp/MediaData;->progress:J

    iget-wide v5, v1, Lcom/whatsapp/sz;->m:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_3

    .line 303
    iget-byte v0, v1, Lcom/whatsapp/sz;->l:B

    invoke-static {v0}, Lcom/whatsapp/MediaView;->g(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;Ljava/lang/String;)V

    goto :goto_0

    .line 405
    :cond_3
    iget-object v1, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    .line 387
    iget-object v1, p0, Lcom/whatsapp/MediaView;->t:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 102
    iget-object v1, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x15

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 331
    invoke-virtual {p2, v7}, Lcom/whatsapp/TouchImageView;->a(Z)V

    .line 65
    :try_start_0
    iget-object v1, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 382
    invoke-virtual {p2, v1, p4}, Lcom/whatsapp/TouchImageView;->a(Landroid/graphics/Bitmap;Z)V

    .line 20
    invoke-virtual {p0, p2, v1}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    :goto_1
    iget v1, p0, Lcom/whatsapp/MediaView;->R:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/whatsapp/MediaView;->R:I

    .line 347
    if-eqz v2, :cond_1

    .line 251
    :cond_4
    invoke-virtual {p2, v8}, Lcom/whatsapp/TouchImageView;->a(Z)V

    .line 525
    iget-object v1, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x14

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 453
    iput-boolean v7, p2, Lcom/whatsapp/TouchImageView;->i:Z

    .line 440
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {p2, v1}, Lcom/whatsapp/TouchImageView;->a(I)V

    if-eqz v2, :cond_1

    .line 426
    :cond_5
    iput-boolean v7, p2, Lcom/whatsapp/TouchImageView;->h:Z

    .line 496
    iget-boolean v1, p0, Lcom/whatsapp/MediaView;->V:Z

    if-eqz v1, :cond_6

    .line 188
    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 291
    invoke-virtual {p3}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/whatsapp/TouchImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 349
    :catch_0
    move-exception v1

    .line 140
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v5, 0x16

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->d()V

    .line 438
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 533
    const/4 v3, 0x2

    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 516
    :try_start_1
    iget-object v3, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 255
    invoke-virtual {p2, v1}, Lcom/whatsapp/TouchImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 427
    invoke-virtual {p0, p2, v1}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 283
    :catch_1
    move-exception v0

    .line 442
    const v0, 0x7f0902d5

    new-instance v1, Lcom/whatsapp/cx;

    invoke-direct {v1, p0}, Lcom/whatsapp/cx;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/nr;)V

    goto/16 :goto_0

    .line 160
    :cond_6
    :try_start_2
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_3

    .line 394
    :try_start_3
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-lt v0, v3, :cond_8

    .line 508
    const-wide/16 v3, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 392
    :goto_2
    if-eqz v0, :cond_7

    .line 375
    invoke-virtual {p0, p2, v0}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V

    .line 17
    invoke-virtual {p2, v0}, Lcom/whatsapp/TouchImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v2, :cond_1

    .line 58
    :cond_7
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x13

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 219
    invoke-virtual {p2}, Lcom/whatsapp/TouchImageView;->f()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_0

    .line 138
    :catch_2
    move-exception v0

    .line 433
    :try_start_4
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 171
    invoke-virtual {p2}, Lcom/whatsapp/TouchImageView;->f()V
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_0

    .line 170
    :catch_3
    move-exception v0

    .line 391
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 122
    invoke-virtual {p2}, Lcom/whatsapp/TouchImageView;->f()V

    goto/16 :goto_0

    .line 368
    :cond_8
    :try_start_5
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->captureFrame()Landroid/graphics/Bitmap;
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_5 .. :try_end_5} :catch_3

    move-result-object v0

    goto :goto_2

    .line 127
    :catch_4
    move-exception v0

    .line 272
    :try_start_6
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 417
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->d()V

    .line 201
    invoke-virtual {p2}, Lcom/whatsapp/TouchImageView;->f()V
    :try_end_6
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_6 .. :try_end_6} :catch_3

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/ContentResolver;[BJ)V
    .locals 10
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v9, 0x31

    const/16 v8, 0x2f

    const/4 v2, 0x0

    .line 52
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 537
    const/4 v6, -0x1

    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x29

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x2e

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v1, v1, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x30

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 280
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    move-object v0, p0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 208
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x1b

    aget-object v0, v0, v3

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 179
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 162
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 406
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 249
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x2c

    aget-object v1, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v7, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 69
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x2d

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 528
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x2a

    aget-object v1, v1, v3

    invoke-virtual {v7, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 365
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v1, v1, v8

    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v3, v3, v9

    invoke-virtual {v7, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    if-ltz v0, :cond_0

    .line 90
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v5, 0x2b

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v7, v0, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 227
    :cond_0
    sget-object v0, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {p0, v0, v7}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 431
    :cond_1
    return-void

    :cond_2
    move v0, v6

    goto :goto_0
.end method

.method private a(Landroid/net/Uri;III)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 223
    if-nez p1, :cond_0

    .line 330
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p2, v1, p3, p4}, Lcom/whatsapp/wallpaper/l;->a(ZILandroid/net/Uri;II)Landroid/graphics/drawable/Drawable;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 88
    :cond_0
    const/4 v0, -0x1

    invoke-static {v2, v0, p1, v2, v2}, Lcom/whatsapp/wallpaper/l;->a(ZILandroid/net/Uri;II)Landroid/graphics/drawable/Drawable;

    .line 276
    :cond_1
    invoke-static {p1}, Lcom/whatsapp/j5;->b(Landroid/net/Uri;)V

    .line 230
    return-void
.end method

.method static a(Lcom/whatsapp/MediaView;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 355
    invoke-direct {p0, p1}, Lcom/whatsapp/MediaView;->c(I)V

    return-void
.end method

.method static a(Lcom/whatsapp/MediaView;ILcom/whatsapp/TouchImageView;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 322
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/TouchImageView;)V

    return-void
.end method

.method static a(Lcom/whatsapp/MediaView;ILcom/whatsapp/TouchImageView;Lcom/whatsapp/TouchImageView;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 341
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/TouchImageView;Lcom/whatsapp/TouchImageView;Z)V

    return-void
.end method

.method static a(Lcom/whatsapp/MediaView;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/whatsapp/MediaView;->I:Z

    return p1
.end method

.method static b(Lcom/whatsapp/MediaView;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 167
    iput p1, p0, Lcom/whatsapp/MediaView;->G:I

    return p1
.end method

.method static b(Lcom/whatsapp/MediaView;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 35
    iget-object v0, p0, Lcom/whatsapp/MediaView;->E:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 512
    iget v1, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {p0, v1}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v1

    .line 324
    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x21

    aget-object v3, v3, v4

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 534
    iget-byte v3, v1, Lcom/whatsapp/sz;->l:B

    packed-switch v3, :pswitch_data_0

    .line 107
    :cond_0
    :goto_0
    iget-object v0, v1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 311
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x22

    aget-object v1, v1, v3

    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 381
    const/4 v0, 0x0

    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->startActivity(Landroid/content/Intent;)V

    .line 541
    return-void

    .line 421
    :pswitch_0
    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x20

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 352
    if-eqz v0, :cond_0

    .line 318
    :pswitch_1
    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    if-eqz v0, :cond_0

    .line 205
    :pswitch_2
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 534
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(I)V
    .locals 2
    .parameter

    .prologue
    .line 56
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->h:Z

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/MediaView;->c()V

    .line 480
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 22
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    if-lez v0, :cond_3

    .line 370
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/whatsapp/MediaView;->y:I

    .line 211
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    iget v1, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->b(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_3

    .line 2
    :cond_2
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    iget v1, p0, Lcom/whatsapp/MediaView;->z:I

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_3

    .line 372
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/whatsapp/MediaView;->y:I

    .line 204
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    iget v1, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 242
    :cond_3
    return-void
.end method

.method static b(Lcom/whatsapp/MediaView;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 260
    iput-boolean p1, p0, Lcom/whatsapp/MediaView;->J:Z

    return p1
.end method

.method static c(Lcom/whatsapp/MediaView;)I
    .locals 1
    .parameter

    .prologue
    .line 202
    iget v0, p0, Lcom/whatsapp/MediaView;->G:I

    return v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 475
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 452
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    .line 189
    :cond_0
    return-void
.end method

.method private c(I)V
    .locals 10
    .parameter

    .prologue
    const/4 v9, 0x4

    const/4 v5, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 258
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v0, v0, v5

    .line 321
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v2

    .line 400
    if-nez v2, :cond_1

    .line 530
    :cond_0
    :goto_0
    return-void

    .line 159
    :cond_1
    iget-object v0, v2, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 184
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    .line 55
    iget-byte v0, v2, Lcom/whatsapp/sz;->l:B

    if-ne v0, v5, :cond_5

    .line 174
    new-instance v3, Landroid/content/Intent;

    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v0, v0, v4

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 472
    iget-object v0, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    sget-object v4, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v4, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 29
    sget-object v0, Lcom/whatsapp/App;->hb:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v3, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 196
    if-eqz v0, :cond_4

    .line 489
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 523
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    sget-object v6, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 12
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    sget-object v5, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v5, v5, v8

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 451
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v5, 0x1

    aget-object v0, v0, v5

    sget-object v5, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v5, v5, v8

    invoke-virtual {v3, v0, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    if-eqz v1, :cond_2

    .line 509
    :cond_4
    invoke-virtual {p0, v3}, Lcom/whatsapp/MediaView;->startActivity(Landroid/content/Intent;)V

    .line 39
    if-eqz v1, :cond_0

    :cond_5
    iget-byte v0, v2, Lcom/whatsapp/sz;->l:B

    if-ne v0, v8, :cond_0

    .line 113
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->D:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    if-nez v0, :cond_7

    .line 389
    :cond_6
    invoke-direct {p0}, Lcom/whatsapp/MediaView;->a()V

    .line 290
    :cond_7
    iput v9, p0, Lcom/whatsapp/MediaView;->G:I

    .line 300
    iget-object v0, p0, Lcom/whatsapp/MediaView;->E:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 34
    iget-object v0, p0, Lcom/whatsapp/MediaView;->H:Landroid/widget/Button;

    const v1, 0x7f09021e

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 329
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 462
    if-lez p1, :cond_0

    .line 42
    iget-object v0, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 232
    iget-object v0, p0, Lcom/whatsapp/MediaView;->k:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0
.end method

.method static c(Lcom/whatsapp/MediaView;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 281
    invoke-direct {p0, p1}, Lcom/whatsapp/MediaView;->f(I)V

    return-void
.end method

.method static d(Lcom/whatsapp/MediaView;)Landroid/widget/Button;
    .locals 1
    .parameter

    .prologue
    .line 393
    iget-object v0, p0, Lcom/whatsapp/MediaView;->H:Landroid/widget/Button;

    return-object v0
.end method

.method static d(Lcom/whatsapp/MediaView;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 149
    invoke-direct {p0, p1}, Lcom/whatsapp/MediaView;->e(I)V

    return-void
.end method

.method static e(Lcom/whatsapp/MediaView;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 408
    iput p1, p0, Lcom/whatsapp/MediaView;->y:I

    return p1
.end method

.method private e(I)V
    .locals 2
    .parameter

    .prologue
    .line 48
    add-int/lit8 v1, p1, -0x1

    .line 358
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    invoke-direct {p0, v1, v0}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/TouchImageView;)V

    .line 388
    add-int/lit8 v1, p1, 0x1

    .line 416
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    invoke-direct {p0, v1, v0}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/TouchImageView;)V

    .line 339
    invoke-direct {p0, p1}, Lcom/whatsapp/MediaView;->f(I)V

    .line 212
    return-void
.end method

.method static e(Lcom/whatsapp/MediaView;)Z
    .locals 1
    .parameter

    .prologue
    .line 143
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->J:Z

    return v0
.end method

.method static f(Lcom/whatsapp/MediaView;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 240
    iput p1, p0, Lcom/whatsapp/MediaView;->F:I

    return p1
.end method

.method static f(Lcom/whatsapp/MediaView;)Landroid/widget/SeekBar;
    .locals 1
    .parameter

    .prologue
    .line 456
    iget-object v0, p0, Lcom/whatsapp/MediaView;->k:Landroid/widget/SeekBar;

    return-object v0
.end method

.method private f(I)V
    .locals 11
    .parameter

    .prologue
    const v10, 0x7f0900ea

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/4 v7, 0x2

    const/4 v6, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 72
    invoke-virtual {p0, p1}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v3

    .line 407
    if-nez v3, :cond_1

    .line 190
    :cond_0
    :goto_0
    return-void

    .line 187
    :cond_1
    iget-object v0, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_2

    .line 333
    iget-object v0, p0, Lcom/whatsapp/MediaView;->h:Landroid/widget/TextView;

    new-array v1, v7, [Ljava/lang/Object;

    const v4, 0x7f090262

    invoke-virtual {p0, v4}, Lcom/whatsapp/MediaView;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v6

    iget-wide v4, v3, Lcom/whatsapp/sz;->i:J

    invoke-static {p0, v4, v5}, Lcom/whatsapp/t4;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v9

    invoke-virtual {p0, v10, v1}, Lcom/whatsapp/MediaView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_4

    .line 428
    :cond_2
    iget-object v0, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 216
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v8}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 403
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 94
    iget-object v4, p0, Lcom/whatsapp/MediaView;->h:Landroid/widget/TextView;

    new-array v5, v7, [Ljava/lang/Object;

    if-nez v1, :cond_9

    :goto_1
    aput-object v0, v5, v6

    iget-wide v0, v3, Lcom/whatsapp/sz;->i:J

    invoke-static {p0, v0, v1}, Lcom/whatsapp/t4;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v9

    invoke-virtual {p0, v10, v5}, Lcom/whatsapp/MediaView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    if-eqz v2, :cond_4

    .line 444
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->A:Ljava/lang/String;

    invoke-virtual {v0, v1, v8}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 522
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 250
    iget-object v4, p0, Lcom/whatsapp/MediaView;->h:Landroid/widget/TextView;

    new-array v5, v7, [Ljava/lang/Object;

    if-nez v1, :cond_a

    :goto_2
    aput-object v0, v5, v6

    iget-wide v0, v3, Lcom/whatsapp/sz;->i:J

    invoke-static {p0, v0, v1}, Lcom/whatsapp/t4;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v9

    invoke-virtual {p0, v10, v5}, Lcom/whatsapp/MediaView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/MediaView;->t:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 225
    iget-byte v0, v3, Lcom/whatsapp/sz;->l:B

    if-ne v0, v7, :cond_5

    .line 248
    iget-object v0, v3, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 24
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x35

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/MediaView;->C:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/whatsapp/MediaView;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 494
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->V:Z

    if-nez v0, :cond_5

    .line 477
    invoke-direct {p0}, Lcom/whatsapp/MediaView;->a()V

    .line 38
    :cond_5
    if-nez p1, :cond_6

    .line 151
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_7

    .line 137
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    const v1, 0x7f020411

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 327
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_8

    .line 535
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_0

    .line 468
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    const v1, 0x7f020410

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_0

    :cond_9
    move-object v0, v1

    .line 94
    goto/16 :goto_1

    :cond_a
    move-object v0, v1

    .line 250
    goto/16 :goto_2
.end method

.method public static g(I)I
    .locals 1
    .parameter

    .prologue
    .line 231
    packed-switch p0, :pswitch_data_0

    .line 445
    const v0, 0x7f09020e

    .line 463
    :goto_0
    return v0

    .line 447
    :pswitch_0
    const v0, 0x7f09020b

    goto :goto_0

    .line 379
    :pswitch_1
    const v0, 0x7f09020d

    goto :goto_0

    .line 463
    :pswitch_2
    const v0, 0x7f09020c

    goto :goto_0

    .line 231
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static g(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 507
    invoke-direct {p0}, Lcom/whatsapp/MediaView;->a()V

    return-void
.end method

.method static g(Lcom/whatsapp/MediaView;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 302
    invoke-direct {p0, p1}, Lcom/whatsapp/MediaView;->b(I)V

    return-void
.end method

.method static h(Lcom/whatsapp/MediaView;I)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 319
    invoke-direct {p0, p1}, Lcom/whatsapp/MediaView;->a(I)I

    move-result v0

    return v0
.end method

.method static h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;
    .locals 1
    .parameter

    .prologue
    .line 498
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    return-object v0
.end method

.method static i(Lcom/whatsapp/MediaView;)I
    .locals 1
    .parameter

    .prologue
    .line 236
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    return v0
.end method

.method static i(Lcom/whatsapp/MediaView;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 27
    iput p1, p0, Lcom/whatsapp/MediaView;->z:I

    return p1
.end method

.method static j(Lcom/whatsapp/MediaView;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 524
    iget-object v0, p0, Lcom/whatsapp/MediaView;->s:Landroid/view/View;

    return-object v0
.end method

.method static k(Lcom/whatsapp/MediaView;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 481
    iget-object v0, p0, Lcom/whatsapp/MediaView;->q:Landroid/view/View;

    return-object v0
.end method

.method static l(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 163
    iget-object v0, p0, Lcom/whatsapp/MediaView;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method static m(Lcom/whatsapp/MediaView;)I
    .locals 1
    .parameter

    .prologue
    .line 519
    iget v0, p0, Lcom/whatsapp/MediaView;->z:I

    return v0
.end method

.method static n(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 112
    iget-object v0, p0, Lcom/whatsapp/MediaView;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;
    .locals 1
    .parameter

    .prologue
    .line 147
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    return-object v0
.end method

.method static p(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 486
    invoke-direct {p0}, Lcom/whatsapp/MediaView;->c()V

    return-void
.end method

.method static q(Lcom/whatsapp/MediaView;)Z
    .locals 1
    .parameter

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->I:Z

    return v0
.end method

.method static r(Lcom/whatsapp/MediaView;)I
    .locals 1
    .parameter

    .prologue
    .line 99
    iget v0, p0, Lcom/whatsapp/MediaView;->F:I

    return v0
.end method

.method static s(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 239
    iget-object v0, p0, Lcom/whatsapp/MediaView;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method static t(Lcom/whatsapp/MediaView;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 156
    iget-object v0, p0, Lcom/whatsapp/MediaView;->A:Ljava/lang/String;

    return-object v0
.end method

.method static u(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 470
    invoke-direct {p0}, Lcom/whatsapp/MediaView;->b()V

    return-void
.end method

.method static v(Lcom/whatsapp/MediaView;)Landroid/widget/ImageView;
    .locals 1
    .parameter

    .prologue
    .line 262
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    return-object v0
.end method

.method static w(Lcom/whatsapp/MediaView;)Landroid/widget/ImageView;
    .locals 1
    .parameter

    .prologue
    .line 241
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public a(IZ)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 362
    add-int/lit8 v0, p1, -0x1

    move v1, v0

    :goto_0
    add-int/lit8 v0, p1, 0x2

    if-ge v1, v0, :cond_4

    .line 81
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 3
    if-eqz v0, :cond_3

    .line 210
    if-ne v1, p1, :cond_0

    .line 425
    iput-boolean p2, v0, Lcom/whatsapp/TouchImageView;->t:Z

    if-eqz v2, :cond_1

    .line 435
    :cond_0
    const/4 v3, 0x1

    iput-boolean v3, v0, Lcom/whatsapp/TouchImageView;->t:Z

    .line 298
    :cond_1
    add-int/lit8 v3, p1, -0x1

    if-eq v1, v3, :cond_2

    add-int/lit8 v3, p1, 0x1

    if-ne v1, v3, :cond_3

    .line 402
    :cond_2
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->e()V

    .line 484
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V

    .line 309
    :cond_3
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_5

    .line 369
    :cond_4
    return-void

    :cond_5
    move v1, v0

    goto :goto_0
.end method

.method public a(Landroid/view/Menu;III)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 74
    invoke-interface {p1, v0, p2, v0, p3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 439
    invoke-interface {v0, p4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 430
    return-void
.end method

.method public a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 213
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->T:Z

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0x36

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whatsapp/TouchImageView;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 437
    :cond_0
    if-nez p2, :cond_2

    .line 118
    iget-boolean v0, p1, Lcom/whatsapp/TouchImageView;->i:Z

    if-eqz v0, :cond_1

    .line 359
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {p1, v0}, Lcom/whatsapp/TouchImageView;->a(I)V

    .line 161
    :cond_1
    :goto_0
    return-void

    .line 215
    :cond_2
    invoke-virtual {p1}, Lcom/whatsapp/TouchImageView;->e()V

    .line 178
    const/high16 v0, 0x3f80

    iput v0, p1, Lcom/whatsapp/TouchImageView;->u:F

    .line 237
    iget-boolean v0, p1, Lcom/whatsapp/TouchImageView;->i:Z

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {p1, v0}, Lcom/whatsapp/TouchImageView;->a(I)V

    goto :goto_0
.end method

.method public d(I)Lcom/whatsapp/sz;
    .locals 2
    .parameter

    .prologue
    .line 410
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 117
    const/4 v0, 0x0

    .line 308
    if-ge p1, v1, :cond_0

    .line 301
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 342
    :cond_0
    return-object v0
.end method

.method public d()V
    .locals 11

    .prologue
    const/16 v10, 0x23

    const/4 v0, 0x0

    const/4 v9, -0x1

    const-wide/16 v7, 0x400

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 120
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    div-long/2addr v1, v7

    .line 209
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v6, 0x26

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x28

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x27

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v4

    div-long/2addr v4, v7

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v2, v2, v10

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 340
    iget v1, p0, Lcom/whatsapp/MediaView;->R:I

    if-nez v1, :cond_0

    .line 334
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/whatsapp/MediaView;->S:Z

    :cond_0
    move v1, v0

    move v2, v0

    .line 109
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 492
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, -0x1

    if-lt v1, v0, :cond_1

    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_2

    .line 532
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 32
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v4, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 471
    invoke-virtual {v0, v4}, Lcom/whatsapp/TouchImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    add-int/lit8 v2, v2, 0x1

    .line 418
    :cond_2
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_5

    .line 234
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x25

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 373
    if-nez v2, :cond_4

    .line 345
    invoke-static {}, Lcom/whatsapp/j5;->c()V

    .line 325
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0x24

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v1

    div-long/2addr v1, v7

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    aget-object v1, v1, v10

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 220
    return-void

    :cond_5
    move v1, v0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 10
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 294
    packed-switch p1, :pswitch_data_0

    .line 429
    :cond_0
    :goto_0
    return-void

    .line 266
    :pswitch_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 336
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/whatsapp/MediaView;->a(Landroid/net/Uri;III)V

    if-eqz v6, :cond_0

    .line 351
    :pswitch_1
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    if-eqz p3, :cond_0

    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/MediaView;->v:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 131
    iget-object v1, p0, Lcom/whatsapp/MediaView;->v:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-static {v1, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 273
    if-eqz v1, :cond_0

    .line 493
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 326
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 123
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 64
    iget-object v0, p0, Lcom/whatsapp/MediaView;->v:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v8

    .line 30
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v4, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v5, 0x1b

    aget-object v4, v4, v5

    aput-object v4, v2, v3

    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x1e

    aget-object v3, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 173
    const/4 v0, 0x0

    .line 76
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 491
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 186
    if-nez v0, :cond_2

    .line 57
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-static {v0, v7, v2, v3}, Lcom/whatsapp/MediaView;->a(Landroid/content/ContentResolver;[BJ)V

    .line 144
    const/4 v0, 0x1

    .line 501
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v8, 0x19

    aget-object v5, v5, v8

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 538
    if-eqz v6, :cond_1

    .line 540
    :cond_3
    if-eqz v6, :cond_0

    .line 364
    :pswitch_2
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    if-eqz p3, :cond_0

    .line 422
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->v:Landroid/net/Uri;

    .line 79
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v0

    .line 521
    iget-object v0, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 172
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 26
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a0004

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 269
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/whatsapp/wallpaper/CropImage;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 482
    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x8

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 134
    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x9

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 432
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 166
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 454
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x18

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 390
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 488
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    invoke-static {}, Lcom/whatsapp/wallpaper/l;->c()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 16
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 443
    const/4 v0, 0x1

    invoke-virtual {p0, v2, v0}, Lcom/whatsapp/MediaView;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 294
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/whatsapp/MediaView;->W:Lcom/whatsapp/sb;

    invoke-virtual {v0}, Lcom/whatsapp/sb;->a()V

    .line 51
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onBackPressed()V

    .line 228
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 89
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 21
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 33
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    sput v0, Lcom/whatsapp/MediaView;->M:I

    .line 510
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->e()V

    .line 415
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    if-nez v0, :cond_4

    move v0, v1

    :goto_0
    move v2, v0

    .line 395
    :goto_1
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, 0x2

    if-ge v2, v0, :cond_1

    .line 320
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v2}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 37
    if-eqz v0, :cond_0

    iget-boolean v4, v0, Lcom/whatsapp/TouchImageView;->j:Z

    if-eqz v4, :cond_0

    .line 473
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {p0, v0, v4}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V

    .line 485
    :cond_0
    add-int/lit8 v0, v2, 0x1

    if-eqz v3, :cond_5

    .line 514
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-eqz v0, :cond_2

    .line 105
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget v2, p1, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {v0, v2}, Lcom/whatsapp/TouchImageView;->a(I)V

    if-eqz v3, :cond_3

    .line 44
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-object v2, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    invoke-virtual {v2}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V

    .line 270
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    iput-boolean v1, v0, Lcom/whatsapp/GalleryView;->locked:Z

    .line 222
    iget-object v0, p0, Lcom/whatsapp/MediaView;->s:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 360
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    iget v2, p0, Lcom/whatsapp/MediaView;->y:I

    sget-object v3, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v3}, Landroid/view/Display;->getWidth()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/GalleryView;->a(II)V

    .line 125
    iget-object v0, p0, Lcom/whatsapp/MediaView;->Y:Landroid/os/Handler;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 332
    return-void

    .line 415
    :cond_4
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    move v2, v0

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 13
    .parameter

    .prologue
    const/4 v12, 0x3

    const/4 v11, 0x2

    const v10, 0x7f020412

    const/4 v9, 0x1

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 285
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x3a

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 25
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 378
    invoke-virtual {p0, v9}, Lcom/whatsapp/MediaView;->requestWindowFeature(I)Z

    .line 50
    const v0, 0x7f030044

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 346
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 466
    if-nez v4, :cond_0

    .line 253
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->finish()V

    .line 409
    :goto_0
    return-void

    .line 8
    :catch_0
    move-exception v0

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0x38

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v1

    const-wide/16 v3, 0x400

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0x23

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 286
    invoke-static {}, Lcom/whatsapp/j5;->c()V

    .line 75
    const v0, 0x7f0902d5

    new-instance v1, Lcom/whatsapp/xw;

    invoke-direct {v1, p0}, Lcom/whatsapp/xw;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/nr;)V

    goto :goto_0

    .line 513
    :cond_0
    sput-object p0, Lcom/whatsapp/MediaView;->L:Lcom/whatsapp/MediaView;

    .line 423
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->u:Lcom/whatsapp/j4;

    .line 383
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x32

    aget-object v0, v0, v1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->A:Ljava/lang/String;

    .line 235
    const v0, 0x7f0d0138

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->g:Landroid/widget/TextView;

    .line 449
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x34

    aget-object v0, v0, v1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 14
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v12, :cond_3

    .line 313
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    .line 506
    sget-object v6, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    new-instance v7, Lcom/whatsapp/uz;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v7, v0, v8, v1}, Lcom/whatsapp/uz;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v6, v7}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/uz;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 295
    iget-object v1, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    iget-object v1, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/MediaView;->z:I

    .line 62
    iget-byte v1, v0, Lcom/whatsapp/sz;->l:B

    if-eq v1, v11, :cond_1

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-ne v0, v12, :cond_2

    .line 4
    :cond_1
    iput-boolean v9, p0, Lcom/whatsapp/MediaView;->D:Z

    .line 146
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/MediaView;->g:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 397
    const v0, 0x7f0d0139

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 275
    new-instance v0, Lcom/whatsapp/sb;

    invoke-direct {v0, p0}, Lcom/whatsapp/sb;-><init>(Lcom/whatsapp/MediaView;)V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->W:Lcom/whatsapp/sb;

    .line 315
    iget-object v0, p0, Lcom/whatsapp/MediaView;->W:Lcom/whatsapp/sb;

    new-array v1, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/sb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 371
    if-eqz v3, :cond_4

    .line 145
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    .line 193
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/MediaView;->z:I

    .line 356
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/MediaView;->u:Lcom/whatsapp/j4;

    invoke-virtual {v0}, Lcom/whatsapp/j4;->c()I

    move-result v0

    sput v0, Lcom/whatsapp/MediaView;->w:I

    .line 487
    const v0, 0x7f0d013c

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->j:Landroid/widget/TextView;

    .line 247
    const v0, 0x7f0d013d

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->k:Landroid/widget/SeekBar;

    .line 337
    iget-object v0, p0, Lcom/whatsapp/MediaView;->k:Landroid/widget/SeekBar;

    new-instance v1, Lcom/whatsapp/dx;

    invoke-direct {v1, p0}, Lcom/whatsapp/dx;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 497
    const v0, 0x7f0d013b

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->t:Landroid/widget/LinearLayout;

    .line 121
    const v0, 0x7f0d0133

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->f:Landroid/widget/TextView;

    .line 40
    const v0, 0x7f0d0126

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    .line 411
    const v0, 0x7f0d0125

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    .line 192
    const v0, 0x7f0d0136

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->h:Landroid/widget/TextView;

    .line 110
    const v0, 0x7f0d013f

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->o:Landroid/widget/ImageView;

    .line 520
    const v0, 0x7f0d0140

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->p:Landroid/widget/ImageView;

    .line 316
    const v0, 0x7f0d013e

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->H:Landroid/widget/Button;

    .line 363
    const v0, 0x7f0d013a

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->s:Landroid/view/View;

    .line 181
    const v0, 0x7f0d0137

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaView;->q:Landroid/view/View;

    .line 299
    iget-object v0, p0, Lcom/whatsapp/MediaView;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 446
    iget-object v0, p0, Lcom/whatsapp/MediaView;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 377
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 343
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 344
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->A:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v0, v1, v6}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 246
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 474
    iget-object v6, p0, Lcom/whatsapp/MediaView;->f:Landroid/widget/TextView;

    if-nez v1, :cond_c

    :goto_1
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    if-nez v5, :cond_d

    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x37

    aget-object v0, v0, v1

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    :goto_2
    iput v0, p0, Lcom/whatsapp/MediaView;->y:I

    .line 6
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x33

    aget-object v0, v0, v1

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/MediaView;->U:I

    .line 455
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v4, 0x39

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/whatsapp/MediaView;->U:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 284
    if-nez v5, :cond_8

    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    move v1, v2

    .line 61
    :goto_3
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 1
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 265
    iget-object v4, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v4}, Lcom/whatsapp/uz;->hashCode()I

    move-result v4

    iget v5, p0, Lcom/whatsapp/MediaView;->U:I

    if-ne v4, v5, :cond_6

    .line 86
    iget-object v4, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v1

    add-int/lit8 v4, v4, -0x1

    iput v4, p0, Lcom/whatsapp/MediaView;->y:I

    .line 293
    iget-byte v4, v0, Lcom/whatsapp/sz;->l:B

    if-eq v4, v11, :cond_5

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-ne v0, v12, :cond_7

    .line 245
    :cond_5
    iput-boolean v9, p0, Lcom/whatsapp/MediaView;->D:Z

    if-eqz v3, :cond_7

    .line 328
    :cond_6
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_e

    .line 157
    :cond_7
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    .line 19
    iput v2, p0, Lcom/whatsapp/MediaView;->y:I

    .line 97
    :cond_8
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    .line 312
    iget-object v0, p0, Lcom/whatsapp/MediaView;->H:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/ex;

    invoke-direct {v1, p0}, Lcom/whatsapp/ex;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    const v0, 0x7f0d0135

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/GalleryView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    .line 53
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v2}, Lcom/whatsapp/GalleryView;->a(Z)V

    .line 448
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    new-instance v1, Lcom/whatsapp/fx;

    invoke-direct {v1, p0}, Lcom/whatsapp/fx;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->a(Lcom/whatsapp/gt;)V

    move v0, v2

    .line 18
    :cond_9
    iget-object v1, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_a

    .line 83
    new-instance v1, Lcom/whatsapp/TouchImageView;

    invoke-direct {v1, p0}, Lcom/whatsapp/TouchImageView;-><init>(Landroid/content/Context;)V

    .line 93
    sget-object v4, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v4}, Lcom/whatsapp/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 233
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/whatsapp/TouchImageView;->setTag(Ljava/lang/Object;)V

    .line 183
    iget-object v4, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v4, v1}, Lcom/whatsapp/GalleryView;->addView(Landroid/view/View;)V

    .line 434
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_9

    .line 203
    :cond_a
    new-instance v0, Lcom/whatsapp/ld;

    invoke-direct {v0, p0}, Lcom/whatsapp/ld;-><init>(Lcom/whatsapp/MediaView;)V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->E:Landroid/os/Handler;

    .line 287
    iget-object v0, p0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 465
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    iget v1, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    iput-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    .line 180
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    iget-object v1, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    invoke-direct {p0, v0, v1}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/TouchImageView;)V

    .line 261
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    iget v1, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 457
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->X:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 536
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->X:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    iget-object v0, p0, Lcom/whatsapp/MediaView;->p:Landroid/widget/ImageView;

    new-instance v1, Lcom/whatsapp/hx;

    invoke-direct {v1, p0}, Lcom/whatsapp/hx;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 502
    iget-boolean v0, p0, Lcom/whatsapp/MediaView;->D:Z

    if-eqz v0, :cond_b

    .line 185
    invoke-direct {p0, v2}, Lcom/whatsapp/MediaView;->c(I)V

    .line 115
    :cond_b
    new-instance v0, Lcom/whatsapp/ix;

    invoke-direct {v0, p0}, Lcom/whatsapp/ix;-><init>(Lcom/whatsapp/MediaView;)V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->K:Landroid/view/View$OnTouchListener;

    .line 63
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->K:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 47
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/whatsapp/MediaView;->K:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 274
    iget-object v0, p0, Lcom/whatsapp/MediaView;->m:Landroid/widget/ImageView;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lcom/whatsapp/MediaView;->n:Landroid/widget/ImageView;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/whatsapp/MediaView;->o:Landroid/widget/ImageView;

    new-instance v1, Lcom/whatsapp/jx;

    invoke-direct {v1, p0}, Lcom/whatsapp/jx;-><init>(Lcom/whatsapp/MediaView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    new-instance v0, Lcom/whatsapp/md;

    invoke-direct {v0, p0}, Lcom/whatsapp/md;-><init>(Lcom/whatsapp/MediaView;)V

    iput-object v0, p0, Lcom/whatsapp/MediaView;->Q:Landroid/os/Handler;

    .line 539
    iget-object v0, p0, Lcom/whatsapp/MediaView;->Y:Landroid/os/Handler;

    const-wide/16 v3, 0x32

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_c
    move-object v0, v1

    .line 474
    goto/16 :goto_1

    :cond_d
    move v0, v2

    .line 141
    goto/16 :goto_2

    :cond_e
    move v1, v0

    goto/16 :goto_3
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 206
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    if-eqz v0, :cond_0

    .line 526
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 87
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->b()Z

    .line 252
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_1

    .line 5
    :cond_0
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 289
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 357
    return-void

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 9
    .parameter

    .prologue
    const v2, 0x7f0a0015

    const/4 v8, 0x0

    const/4 v7, 0x1

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 531
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 399
    :cond_0
    :goto_0
    return v7

    .line 459
    :pswitch_0
    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v7, :cond_1

    .line 124
    sget-object v0, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/whatsapp/MediaView;->u:Lcom/whatsapp/j4;

    invoke-virtual {v1}, Lcom/whatsapp/j4;->c()I

    move-result v1

    sub-int v1, v0, v1

    .line 348
    sget-object v0, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    if-eqz v3, :cond_3

    .line 478
    :cond_1
    sget-object v0, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/whatsapp/MediaView;->u:Lcom/whatsapp/j4;

    invoke-virtual {v1}, Lcom/whatsapp/j4;->c()I

    move-result v1

    sub-int v1, v0, v1

    .line 499
    sget-object v0, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    move v2, v1

    move v1, v0

    .line 467
    :goto_1
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v0

    .line 100
    iget-object v0, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 460
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 413
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v6, 0x6

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 98
    new-instance v4, Landroid/content/Intent;

    const-class v5, Lcom/whatsapp/wallpaper/CropImage;

    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 256
    sget-object v5, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v6, 0x8

    aget-object v5, v5, v6

    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 495
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v5, 0x9

    aget-object v1, v1, v5

    invoke-virtual {v4, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 338
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v4, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 108
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v4, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 292
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-virtual {v4, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 182
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 207
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    invoke-static {}, Lcom/whatsapp/wallpaper/l;->c()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 384
    sget-object v0, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 380
    invoke-virtual {p0, v4, v8}, Lcom/whatsapp/MediaView;->startActivityForResult(Landroid/content/Intent;I)V

    .line 66
    if-eqz v3, :cond_0

    .line 335
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    sget-object v2, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 366
    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/MediaView;->startActivityForResult(Landroid/content/Intent;I)V

    .line 396
    if-eqz v3, :cond_0

    .line 133
    :pswitch_2
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaView;->d(I)Lcom/whatsapp/sz;

    move-result-object v1

    .line 500
    iget-object v0, v1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 490
    iget-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    if-nez v2, :cond_2

    .line 479
    invoke-static {v1}, Lcom/whatsapp/App;->a(Lcom/whatsapp/sz;)Ljava/io/File;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 304
    :cond_2
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 41
    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v3, v3, v4

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 132
    iget-byte v1, v1, Lcom/whatsapp/sz;->l:B

    packed-switch v1, :pswitch_data_1

    .line 10
    :goto_2
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/whatsapp/MediaView;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 517
    :catch_0
    move-exception v0

    .line 277
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090115

    invoke-static {v0, v1, v8}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    .line 461
    :pswitch_3
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v1, v1, v3

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    :cond_3
    move v2, v1

    move v1, v0

    goto/16 :goto_1

    .line 531
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 132
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
    .end packed-switch
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 3
    .parameter

    .prologue
    .line 305
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 15
    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/MediaView;->i:Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->h:Z

    if-nez v0, :cond_0

    .line 511
    const/4 v0, 0x0

    const v1, 0x7f090288

    const v2, 0x7f0203c0

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/whatsapp/MediaView;->a(Landroid/view/Menu;III)V

    .line 119
    const/4 v0, 0x1

    const v1, 0x7f090287

    const v2, 0x7f0203d4

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/whatsapp/MediaView;->a(Landroid/view/Menu;III)V

    .line 297
    const/4 v0, 0x2

    const v1, 0x7f090289

    const v2, 0x7f0203c8

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/whatsapp/MediaView;->a(Landroid/view/Menu;III)V

    .line 323
    :cond_0
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onStop()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 441
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onStop()V

    .line 278
    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 106
    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 92
    iget-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    .line 224
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whatsapp/MediaView;->l:Landroid/media/MediaPlayer;

    .line 288
    iget-object v1, p0, Lcom/whatsapp/MediaView;->s:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 503
    :cond_0
    sget-object v1, Lcom/whatsapp/MediaView;->Z:[Ljava/lang/String;

    const/16 v3, 0x10

    aget-object v1, v1, v3

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 306
    iget-object v1, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    if-eqz v1, :cond_3

    move v1, v0

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 153
    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, -0x1

    if-lt v1, v0, :cond_1

    iget v0, p0, Lcom/whatsapp/MediaView;->y:I

    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_2

    .line 404
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/MediaView;->r:Lcom/whatsapp/GalleryView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 80
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->b()Z

    .line 142
    :cond_2
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_4

    .line 412
    :cond_3
    return-void

    :cond_4
    move v1, v0

    goto :goto_0
.end method
