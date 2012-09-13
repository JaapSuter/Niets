.class public Lcom/whatsapp/wallpaper/CropImage;
.super Landroid/app/Activity;
.source "CropImage.java"


# static fields
.field public static final a:[Ljava/lang/String;

.field private static final z:[Ljava/lang/String;


# instance fields
.field private b:Landroid/graphics/Bitmap$CompressFormat;

.field private c:Landroid/net/Uri;

.field private d:I

.field private e:I

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:Z

.field l:Z

.field private m:I

.field public n:Z

.field private o:Lcom/whatsapp/wallpaper/CropImageView;

.field private p:Landroid/graphics/Bitmap;

.field private q:I

.field protected r:Lcom/whatsapp/wallpaper/f;

.field protected s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v0, 0x24

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "[^\u0008#\'UM\u00006a[M\t=!Ls\u00156=YA\u0017?+\u0002\u000c"

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "QB\u000b: ]\u0001\u00032:Y"

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "JI\u0013&<V\u0001\u00032:Y"

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "[^\u0008#\'UM\u00006a[M\t=!L\u000c\u0004?!KIG7;JE\t4nJI\u00142#H@\u0002in"

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "\\M\u00132"

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "gE\u0003n"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "JI\u0004\'"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "VCJ >YO\u0002"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "vCG >YO\u0002"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "[^\u0008#\'UM\u00006a[M\t=!L\u000c\u001428]\u0016G"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "QCJ6<JC\u0015"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "[^\u0008#\'UM\u00006aWC\n|:JUG /U\\\u000b6nKE\u001d6t\u000b"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "UE\t\u0010<W\\"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "Y_\u00176-Lu"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "KO\u0006?+m\\.5\u0000]I\u00036*"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "w^\u000e6 LM\u0013:!V"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "[^\u0008#\u000cAc\u0012\'>MX4:4]"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "]^\u0015<<\u0015C\u0008>"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "[^\u0008#\'UM\u00006"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "[^\u0008#aWB\u0004!+YX\u0002"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "[^\u0008#\'UM\u00006aWC\n|+VHJ\'<AE\t4"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "WY\u0013#;Lt"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "VC\u0013~/\u0015E\n2)]"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "UM\u001f\u0015\'TI4:4]"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "[^\u0008#aWB\u0004!+YX\u0002|+VH"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "[^\u0008#\'UM\u00006aVC\u0013~/\u0015E\n2)]"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "Y_\u00176-Lt"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "[E\u00150\"]o\u0015<>"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    const-string v2, "[^\u0008#\'UM\u00006aWC\n|:JUG /U\\\u000b6nKE\u001d6t\n"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    const-string v2, "WY\u0013#;Lj\u0008!#YX"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    const-string v2, "^E\u000b6"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    const-string v2, "KO\u0006?+"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x20

    const-string v2, "WY\u0013#;Lu"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x21

    const-string v2, "WY\u0013#;L"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x22

    const-string v2, "[C\t\'+VX"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x23

    const-string v2, "[^\u0008#aWB\u00036=L^\u0008*"

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    .line 7
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "gE\u0003"

    .line -1
    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 7
    aput-object v1, v0, v3

    const-string v1, "LE\u0013?+"

    .line -1
    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 7
    aput-object v1, v0, v4

    const-string v1, "UE\n6\u0011LU\u00176"

    .line -1
    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 7
    aput-object v1, v0, v5

    const-string v1, "TM\u0013::MH\u0002"

    .line -1
    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 7
    aput-object v1, v0, v6

    const-string v1, "TC\t4\'LY\u00036"

    .line -1
    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 7
    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "\\M\u00136:YG\u0002="

    .line -1
    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    .line 7
    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "\\M\u00136\u0011YH\u00036*"

    .line -1
    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    .line 7
    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "\\M\u00136\u0011UC\u0003:(QI\u0003"

    .line -1
    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    .line 7
    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "gH\u0006\'/"

    .line -1
    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    .line 7
    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "W^\u000e6 LM\u0013:!V"

    .line -1
    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    .line 7
    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "ZY\u00048+Ls\u000e7"

    .line -1
    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/wallpaper/CropImage;->z([C)Ljava/lang/String;

    move-result-object v2

    .line 7
    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/wallpaper/CropImage;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 232
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 228
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->b:Landroid/graphics/Bitmap$CompressFormat;

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    .line 9
    iput-boolean v1, p0, Lcom/whatsapp/wallpaper/CropImage;->f:Z

    .line 75
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->k:Z

    .line 203
    iput v1, p0, Lcom/whatsapp/wallpaper/CropImage;->q:I

    return-void
.end method

.method public static a(I)F
    .locals 1
    .parameter

    .prologue
    .line 81
    const/4 v0, 0x6

    if-ne p0, v0, :cond_0

    .line 70
    const/high16 v0, 0x42b4

    .line 145
    :goto_0
    return v0

    .line 168
    :cond_0
    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    .line 145
    const/high16 v0, 0x4334

    goto :goto_0

    .line 33
    :cond_1
    const/16 v0, 0x8

    if-ne p0, v0, :cond_2

    .line 72
    const/high16 v0, 0x4387

    goto :goto_0

    .line 128
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;I)Lcom/whatsapp/wallpaper/j;
    .locals 9
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x0

    .line 66
    .line 65
    :try_start_0
    invoke-static {p1}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v7

    .line 202
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 281
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 138
    if-nez p2, :cond_0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 51
    :goto_0
    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->a:[Ljava/lang/String;

    .line 148
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 208
    if-eqz v3, :cond_2

    .line 184
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 169
    new-instance v2, Lcom/whatsapp/wallpaper/j;

    invoke-direct {v2}, Lcom/whatsapp/wallpaper/j;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "/"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v3, v1}, Lcom/whatsapp/wallpaper/CropImage;->a(Lcom/whatsapp/wallpaper/j;Landroid/content/ContentResolver;Landroid/database/Cursor;Ljava/lang/String;)V

    .line 53
    iput-wide v7, v2, Lcom/whatsapp/wallpaper/j;->b:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v2

    .line 279
    :goto_1
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 15
    :goto_2
    return-object v0

    .line 138
    :cond_0
    :try_start_3
    sget-object v1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 130
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, v6

    .line 212
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 130
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_3

    :catch_2
    move-exception v1

    goto :goto_3

    :cond_1
    move-object v0, v6

    goto :goto_1

    :cond_2
    move-object v0, v6

    goto :goto_2
.end method

.method private a()V
    .locals 15

    .prologue
    const/4 v4, 0x0

    const/4 v14, 0x4

    const/4 v13, 0x3

    const/4 v12, 0x1

    const/4 v11, 0x0

    sget-boolean v5, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 127
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->r:Lcom/whatsapp/wallpaper/f;

    if-nez v0, :cond_1

    .line 180
    :cond_0
    :goto_0
    return-void

    .line 28
    :cond_1
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->n:Z

    if-nez v0, :cond_0

    .line 115
    iput-boolean v12, p0, Lcom/whatsapp/wallpaper/CropImage;->n:Z

    .line 123
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 247
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 234
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 64
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setDither(Z)V

    .line 55
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->r:Lcom/whatsapp/wallpaper/f;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->c()Landroid/graphics/Rect;

    move-result-object v7

    .line 58
    iget v0, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    if-eqz v0, :cond_8

    iget v0, p0, Lcom/whatsapp/wallpaper/CropImage;->i:I

    if-eqz v0, :cond_8

    .line 74
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    .line 80
    iget v0, p0, Lcom/whatsapp/wallpaper/CropImage;->i:I

    .line 278
    iget-boolean v2, p0, Lcom/whatsapp/wallpaper/CropImage;->k:Z

    if-nez v2, :cond_2

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v2

    iget v3, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    if-ge v2, v3, :cond_2

    .line 265
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 174
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 194
    :cond_2
    const/high16 v2, 0x3f80

    .line 173
    iget-boolean v3, p0, Lcom/whatsapp/wallpaper/CropImage;->s:Z

    if-nez v3, :cond_4

    .line 111
    iget-object v3, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/2addr v3, v1

    iget-object v8, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    div-int/2addr v8, v0

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 205
    if-le v3, v12, :cond_4

    .line 216
    iget-object v8, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    .line 153
    iget-object v9, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V

    .line 25
    new-instance v9, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v9}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 8
    iput v3, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 22
    iput-boolean v12, v9, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 262
    iput-boolean v11, v9, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 270
    iput-boolean v11, v9, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 179
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0xa

    if-lt v3, v10, :cond_3

    .line 167
    iput-boolean v12, v9, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z

    .line 52
    :cond_3
    :try_start_0
    sget-object v3, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->getIntent()Landroid/content/Intent;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v10

    invoke-virtual {v3, v10}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v4

    .line 158
    const/4 v3, 0x0

    invoke-static {v4, v3, v9}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    .line 151
    iget-object v3, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v8

    .line 154
    if-eqz v4, :cond_4

    .line 240
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 30
    :cond_4
    :goto_1
    iget-object v3, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v3

    .line 48
    if-nez v3, :cond_5

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_5
    invoke-static {v1, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 3
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 82
    iget v8, v7, Landroid/graphics/Rect;->left:I

    int-to-float v8, v8

    mul-float/2addr v8, v2

    float-to-int v8, v8

    iput v8, v7, Landroid/graphics/Rect;->left:I

    .line 175
    iget v8, v7, Landroid/graphics/Rect;->right:I

    int-to-float v8, v8

    mul-float/2addr v8, v2

    float-to-int v8, v8

    iput v8, v7, Landroid/graphics/Rect;->right:I

    .line 56
    iget v8, v7, Landroid/graphics/Rect;->top:I

    int-to-float v8, v8

    mul-float/2addr v8, v2

    float-to-int v8, v8

    iput v8, v7, Landroid/graphics/Rect;->top:I

    .line 23
    iget v8, v7, Landroid/graphics/Rect;->bottom:I

    int-to-float v8, v8

    mul-float/2addr v2, v8

    float-to-int v2, v2

    iput v2, v7, Landroid/graphics/Rect;->bottom:I

    .line 170
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v11, v11, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 236
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->j:Z

    if-eqz v0, :cond_6

    .line 90
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 274
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->q:I

    rem-int/lit16 v1, v1, 0x168

    int-to-float v1, v1

    iget v8, v2, Landroid/graphics/Rect;->left:I

    iget v9, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v8, v9

    div-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    iget v9, v2, Landroid/graphics/Rect;->top:I

    iget v10, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v9, v10

    div-int/lit8 v9, v9, 0x2

    int-to-float v9, v9

    invoke-virtual {v0, v1, v8, v9}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 149
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 38
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 280
    invoke-virtual {v4, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 141
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v4, v0, v7, v1, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 260
    if-eqz v5, :cond_7

    .line 296
    :cond_6
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    .line 235
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v8

    sub-int/2addr v1, v8

    div-int/lit8 v1, v1, 0x2

    .line 181
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/graphics/Rect;->inset(II)V

    .line 229
    neg-int v0, v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    neg-int v1, v1

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->inset(II)V

    .line 159
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v4, v0, v7, v2, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 6
    :cond_7
    if-eqz v5, :cond_d

    .line 269
    :cond_8
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 268
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v2

    .line 143
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->f:Z

    if-eqz v0, :cond_b

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_2
    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 190
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 286
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4, v11, v11, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 20
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v1, v7, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 124
    :goto_3
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/CropImageView;->a()V

    .line 297
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 21
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 290
    if-eqz v1, :cond_c

    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v2, v2, v14

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    if-nez v2, :cond_9

    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 16
    :cond_9
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 233
    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v2, v2, v14

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 209
    const/4 v0, -0x1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    sget-object v3, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v3, v3, v12

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 108
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->finish()V

    goto/16 :goto_0

    .line 146
    :catch_0
    move-exception v3

    .line 221
    :try_start_2
    sget-object v8, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v9, 0x0

    aget-object v8, v8, v9

    invoke-static {v8, v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    if-eqz v4, :cond_4

    .line 240
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    .line 107
    :catch_1
    move-exception v3

    .line 256
    sget-object v4, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v4, v4, v13

    :goto_4
    invoke-static {v4, v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 154
    :catchall_0
    move-exception v0

    if-eqz v4, :cond_a

    .line 240
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 154
    :cond_a
    :goto_5
    throw v0

    .line 143
    :cond_b
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto/16 :goto_2

    .line 289
    :cond_c
    invoke-direct {p0, v0}, Lcom/whatsapp/wallpaper/CropImage;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 107
    :catch_2
    move-exception v1

    .line 256
    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v2, v2, v13

    invoke-static {v2, v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    .line 107
    :catch_3
    move-exception v3

    .line 256
    sget-object v4, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v4, v4, v13

    goto :goto_4

    :cond_d
    move-object v0, v3

    goto/16 :goto_3
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 11
    .parameter

    .prologue
    const/4 v10, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    sget-boolean v4, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 125
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    if-eqz v0, :cond_4

    .line 178
    new-instance v5, Ljava/io/File;

    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 91
    const/16 v0, 0x4b

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 222
    :try_start_0
    sget-object v6, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    iget-object v7, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    invoke-virtual {v6, v7}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v1

    .line 135
    if-eqz v1, :cond_1

    .line 177
    iget-object v6, p0, Lcom/whatsapp/wallpaper/CropImage;->b:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1, v6, v0, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :cond_1
    add-int/lit8 v0, v0, -0xa

    .line 101
    invoke-static {v1}, Lcom/whatsapp/d5;->a(Ljava/io/Closeable;)V

    .line 144
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->m:I

    if-eqz v1, :cond_2

    if-lez v0, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v6

    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->m:I

    int-to-long v8, v1

    cmp-long v1, v6, v8

    if-gtz v1, :cond_0

    :cond_2
    move v0, v2

    .line 119
    :goto_0
    if-nez v0, :cond_3

    .line 50
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 132
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 199
    invoke-virtual {p0, v10, v0}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 300
    :cond_3
    if-eqz v4, :cond_5

    .line 220
    :cond_4
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 215
    sget-object v1, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/wallpaper/CropImage;->r:Lcom/whatsapp/wallpaper/f;

    invoke-virtual {v2}, Lcom/whatsapp/wallpaper/f;->c()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 239
    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 189
    invoke-virtual {p0, v10, v1}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 185
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 231
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->finish()V

    .line 253
    return-void

    .line 116
    :catch_0
    move-exception v0

    .line 224
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x9

    aget-object v5, v5, v6

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v5, 0x8

    aget-object v2, v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14
    const/4 v0, 0x0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    sget-object v5, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v6, 0x7

    aget-object v5, v5, v6

    const/4 v6, 0x1

    invoke-virtual {v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    if-eqz v4, :cond_7

    .line 68
    :cond_6
    const/4 v0, 0x0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    sget-object v5, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0xa

    aget-object v5, v5, v6

    const/4 v6, 0x1

    invoke-virtual {v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :cond_7
    invoke-static {v1}, Lcom/whatsapp/d5;->a(Ljava/io/Closeable;)V

    move v0, v3

    .line 17
    goto/16 :goto_0

    .line 101
    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/whatsapp/d5;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method static a(Lcom/whatsapp/wallpaper/CropImage;)V
    .locals 0
    .parameter

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/CropImage;->a()V

    return-void
.end method

.method public static final a(Lcom/whatsapp/wallpaper/j;Landroid/content/ContentResolver;Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 198
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->b:J

    .line 36
    const/4 v0, 0x1

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/j;->c:Ljava/lang/String;

    .line 171
    const/4 v0, 0x2

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/j;->e:Ljava/lang/String;

    .line 219
    const/4 v0, 0x3

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->g:D

    .line 57
    const/4 v0, 0x4

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->h:D

    .line 248
    const/4 v0, 0x5

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->i:J

    .line 285
    const/4 v0, 0x6

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->l:J

    .line 292
    const/4 v0, 0x7

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->k:J

    .line 110
    iget-wide v0, p0, Lcom/whatsapp/wallpaper/j;->i:J

    iget-wide v2, p0, Lcom/whatsapp/wallpaper/j;->k:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 273
    iget-wide v0, p0, Lcom/whatsapp/wallpaper/j;->k:J

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whatsapp/wallpaper/j;->i:J

    .line 54
    :cond_0
    const/16 v0, 0x8

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/j;->q:Ljava/lang/String;

    .line 275
    if-eqz p3, :cond_1

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/whatsapp/wallpaper/j;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/j;->d:Ljava/lang/String;

    .line 206
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/j;->a()I

    move-result v0

    .line 155
    const/16 v1, 0x9

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 71
    if-nez v0, :cond_2

    .line 293
    int-to-float v0, v1

    iput v0, p0, Lcom/whatsapp/wallpaper/j;->p:F

    sget-boolean v0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    if-eqz v0, :cond_3

    .line 195
    :cond_2
    iput v1, p0, Lcom/whatsapp/wallpaper/j;->m:I

    .line 13
    :cond_3
    return-void
.end method

.method private b()V
    .locals 11

    .prologue
    const/high16 v10, 0x4000

    const/4 v6, 0x0

    sget-boolean v5, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 266
    new-instance v0, Lcom/whatsapp/wallpaper/f;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    invoke-direct {v0, v1}, Lcom/whatsapp/wallpaper/f;-><init>(Landroid/view/View;)V

    .line 93
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 89
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 166
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v6, v6, v7, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 95
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    div-int/lit8 v3, v1, 0x5

    .line 210
    iget-boolean v1, p0, Lcom/whatsapp/wallpaper/CropImage;->l:Z

    if-eqz v1, :cond_8

    .line 223
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    if-ge v1, v3, :cond_0

    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->i:I

    if-ge v1, v3, :cond_0

    .line 211
    int-to-float v1, v3

    iget v8, p0, Lcom/whatsapp/wallpaper/CropImage;->i:I

    int-to-float v8, v8

    mul-float/2addr v1, v8

    iget v8, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    int-to-float v8, v8

    div-float/2addr v1, v8

    float-to-int v1, v1

    if-eqz v5, :cond_1

    .line 299
    :cond_0
    iget v3, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    .line 85
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->i:I

    .line 254
    :cond_1
    :goto_0
    iget v8, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    if-eqz v8, :cond_3

    iget v8, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    if-eqz v8, :cond_3

    .line 230
    iget v8, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    iget v9, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    if-le v8, v9, :cond_2

    .line 163
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    mul-int/2addr v1, v3

    iget v8, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    div-int/2addr v1, v8

    if-eqz v5, :cond_3

    .line 109
    :cond_2
    iget v3, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    mul-int/2addr v3, v1

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    div-int/2addr v3, v5

    .line 156
    :cond_3
    if-le v1, v4, :cond_4

    .line 197
    int-to-float v1, v1

    int-to-float v5, v4

    div-float/2addr v1, v5

    .line 164
    int-to-float v3, v3

    div-float v1, v3, v1

    float-to-int v1, v1

    move v3, v1

    move v1, v4

    .line 120
    :cond_4
    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    if-lez v5, :cond_7

    .line 32
    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    if-ge v3, v5, :cond_5

    .line 276
    iget v3, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    .line 139
    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    if-eqz v5, :cond_5

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    if-eqz v5, :cond_5

    .line 207
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    mul-int/2addr v1, v3

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    div-int/2addr v1, v5

    .line 126
    :cond_5
    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    if-ge v1, v5, :cond_7

    .line 298
    iget v1, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    .line 37
    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    if-eqz v5, :cond_7

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    if-eqz v5, :cond_7

    .line 255
    iget v3, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    mul-int/2addr v3, v1

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    div-int/2addr v3, v5

    move v5, v3

    .line 92
    :goto_1
    sub-int v3, v7, v5

    div-int/lit8 v7, v3, 0x2

    .line 150
    sub-int v3, v4, v1

    div-int/lit8 v4, v3, 0x2

    .line 200
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v8, v7

    int-to-float v9, v4

    add-int/2addr v5, v7

    int-to-float v5, v5

    add-int/2addr v1, v4

    int-to-float v1, v1

    invoke-direct {v3, v8, v9, v5, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 217
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 172
    iget v4, p0, Lcom/whatsapp/wallpaper/CropImage;->q:I

    rem-int/lit16 v4, v4, 0x168

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/RectF;->left:F

    iget v7, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v7

    div-float/2addr v5, v10

    iget v7, v3, Landroid/graphics/RectF;->top:F

    iget v8, v3, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v7, v8

    div-float/2addr v7, v10

    invoke-virtual {v1, v4, v5, v7}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 186
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 129
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    iget-boolean v4, p0, Lcom/whatsapp/wallpaper/CropImage;->f:Z

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    if-eqz v5, :cond_6

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    if-eqz v5, :cond_6

    const/4 v5, 0x1

    :goto_2
    iget-boolean v6, p0, Lcom/whatsapp/wallpaper/CropImage;->l:Z

    iget v7, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    invoke-virtual/range {v0 .. v7}, Lcom/whatsapp/wallpaper/f;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZZI)V

    .line 134
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    invoke-virtual {v1, v0}, Lcom/whatsapp/wallpaper/CropImageView;->c(Lcom/whatsapp/wallpaper/f;)V

    .line 100
    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->r:Lcom/whatsapp/wallpaper/f;

    .line 182
    return-void

    :cond_6
    move v5, v6

    .line 129
    goto :goto_2

    :cond_7
    move v5, v3

    goto :goto_1

    :cond_8
    move v1, v3

    goto/16 :goto_0
.end method

.method private static z([C)Ljava/lang/String;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    if-gt v1, v2, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-char v3, p0, v2

    rem-int/lit8 v0, v2, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x4e

    :goto_1
    xor-int/2addr v0, v3

    int-to-char v0, v0

    aput-char v0, p0, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x38

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x2c

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x67

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x53

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static z(Ljava/lang/String;)[C
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit8 v2, v2, 0x4e

    int-to-char v2, v2

    aput-char v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 10
    .parameter

    .prologue
    const/16 v9, 0x11

    const/4 v2, 0x0

    const/4 v1, 0x1

    sget-boolean v3, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 19
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v4, 0x13

    aget-object v0, v0, v4

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 88
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 237
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 44
    invoke-virtual {p0, v1}, Lcom/whatsapp/wallpaper/CropImage;->requestWindowFeature(I)Z

    .line 226
    const v0, 0x7f03002b

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/CropImage;->setContentView(I)V

    .line 87
    const v0, 0x7f0d00a0

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/CropImage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/CropImageView;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    .line 284
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 69
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 59
    if-eqz v5, :cond_2

    .line 122
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x1b

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 283
    iput-boolean v1, p0, Lcom/whatsapp/wallpaper/CropImage;->f:Z

    .line 29
    iput v1, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    .line 84
    iput v1, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    .line 114
    :cond_0
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x21

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    .line 47
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->c:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 295
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x1d

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 264
    invoke-static {v0}, Landroid/graphics/Bitmap$CompressFormat;->valueOf(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->b:Landroid/graphics/Bitmap$CompressFormat;

    .line 251
    :cond_1
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v6, 0x4

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    .line 113
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x1a

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->d:I

    .line 67
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0xd

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->e:I

    .line 263
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x15

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->h:I

    .line 77
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x20

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->i:I

    .line 35
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0xc

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->g:I

    .line 117
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    sget-object v6, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v7, 0x10

    aget-object v6, v6, v7

    invoke-virtual {v5, v6, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    iput-boolean v6, p0, Lcom/whatsapp/wallpaper/CropImage;->l:Z

    iput-boolean v6, v0, Lcom/whatsapp/wallpaper/CropImageView;->cropByOutputSize:Z

    .line 271
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x1f

    aget-object v0, v0, v6

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->j:Z

    .line 201
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0xe

    aget-object v0, v0, v6

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->k:Z

    .line 94
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x17

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->m:I

    .line 214
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImage;->s:Z

    .line 250
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    if-nez v0, :cond_5

    .line 213
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 43
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    .line 11
    const/4 v0, 0x0

    .line 162
    if-eqz v6, :cond_3

    sget-object v7, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v8, 0x22

    aget-object v7, v7, v8

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 165
    invoke-static {p0, v5, v2}, Lcom/whatsapp/wallpaper/CropImage;->a(Landroid/content/Context;Landroid/net/Uri;I)Lcom/whatsapp/wallpaper/j;

    move-result-object v0

    .line 39
    :cond_3
    if-eqz v0, :cond_4

    .line 40
    :try_start_0
    sget-object v7, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v7

    iput-object v7, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    .line 238
    iget v0, v0, Lcom/whatsapp/wallpaper/j;->p:F

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->q:I

    if-eqz v3, :cond_5

    .line 218
    :cond_4
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    .line 60
    if-eqz v6, :cond_5

    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v4, 0x1e

    aget-object v0, v0, v4

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 98
    new-instance v0, Landroid/media/ExifInterface;

    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 97
    sget-object v4, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0xf

    aget-object v4, v4, v6

    const/4 v6, 0x1

    invoke-virtual {v0, v4, v6}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/wallpaper/CropImage;->a(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImage;->q:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 157
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-nez v0, :cond_a

    .line 193
    :cond_6
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v3, 0x19

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 258
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v3, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v4, 0x16

    aget-object v3, v3, v4

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 288
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->finish()V

    .line 257
    :goto_2
    return-void

    :cond_7
    move v0, v2

    .line 214
    goto/16 :goto_0

    .line 49
    :catch_0
    move-exception v0

    .line 83
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v6, 0x8

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 4
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    sget-object v5, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/4 v6, 0x7

    aget-object v5, v5, v6

    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {p0, v2, v4}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    if-eqz v3, :cond_9

    .line 261
    :cond_8
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    sget-object v4, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v5, 0xa

    aget-object v4, v4, v5

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 62
    :cond_9
    sget-object v1, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->finish()V

    goto :goto_2

    .line 160
    :catch_1
    move-exception v0

    .line 34
    :try_start_1
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v3, 0x1c

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 246
    const/4 v0, 0x2

    invoke-static {v5, v0}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_1

    .line 282
    :catch_2
    move-exception v0

    .line 249
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 242
    const/4 v0, 0x3

    :try_start_2
    invoke-static {v5, v0}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    goto/16 :goto_1

    .line 61
    :catch_3
    move-exception v0

    .line 183
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v3, 0x14

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 131
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v3, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v3, v3, v9

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 142
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->finish()V

    goto/16 :goto_2

    .line 225
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    new-instance v3, Lcom/whatsapp/wallpaper/k;

    iget-object v4, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/whatsapp/wallpaper/CropImage;->q:I

    invoke-direct {v3, v4, v5}, Lcom/whatsapp/wallpaper/k;-><init>(Landroid/graphics/Bitmap;I)V

    invoke-virtual {v0, v3, v1}, Lcom/whatsapp/wallpaper/CropImageView;->a(Lcom/whatsapp/wallpaper/k;Z)V

    .line 252
    :try_start_3
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/CropImage;->b()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4

    .line 245
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 267
    const v0, 0x7f0d00ef

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/CropImage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/wallpaper/d;

    invoke-direct {v1, p0}, Lcom/whatsapp/wallpaper/d;-><init>(Lcom/whatsapp/wallpaper/CropImage;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    const v0, 0x7f0d00ee

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/CropImage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/wallpaper/e;

    invoke-direct {v1, p0}, Lcom/whatsapp/wallpaper/e;-><init>(Lcom/whatsapp/wallpaper/CropImage;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v1, 0x18

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lcom/whatsapp/App;->z()V

    goto/16 :goto_2

    .line 137
    :catch_4
    move-exception v0

    .line 31
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v3, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    aget-object v3, v3, v9

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/whatsapp/wallpaper/CropImage;->setResult(ILandroid/content/Intent;)V

    .line 78
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImage;->finish()V

    goto/16 :goto_2
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 12
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->o:Lcom/whatsapp/wallpaper/CropImageView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/whatsapp/wallpaper/CropImageView;->isRecycle:Z

    .line 241
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImage;->p:Landroid/graphics/Bitmap;

    .line 176
    :cond_0
    sget-object v0, Lcom/whatsapp/wallpaper/CropImage;->z:[Ljava/lang/String;

    const/16 v1, 0x23

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 46
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 188
    return-void
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 76
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 244
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 2
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 272
    return-void
.end method
