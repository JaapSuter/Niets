.class public Lcom/whatsapp/TouchImageView;
.super Lcom/whatsapp/wallpaper/ImageViewTouchBase;
.source "TouchImageView.java"


# static fields
.field private static l:F

.field public static m:I

.field public static n:F

.field public static o:Landroid/graphics/Rect;

.field public static p:Landroid/graphics/Rect;

.field public static q:Landroid/graphics/Paint;

.field private static final z:[Ljava/lang/String;


# instance fields
.field b:F

.field c:F

.field d:Z

.field e:I

.field f:J

.field g:Z

.field h:Z

.field i:Z

.field j:Z

.field k:Lcom/whatsapp/j4;

.field private r:J

.field private s:Landroid/os/Handler;

.field protected t:Z

.field public u:F


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v4, 0x3e

    const/16 v1, 0x27

    const/16 v2, 0xe

    const/4 v3, 0x1

    const/4 v8, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "9HgoJ,U.tN"

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

    const-string v0, "<W"

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

    aput-object v0, v9, v3

    const/4 v10, 0x2

    const-string v0, "(\u0007}pK(Uk!W$Fid\u0001"

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

    sput-object v9, Lcom/whatsapp/TouchImageView;->z:[Ljava/lang/String;

    .line 133
    const/high16 v0, 0x4040

    sput v0, Lcom/whatsapp/TouchImageView;->l:F

    .line 15
    sput v8, Lcom/whatsapp/TouchImageView;->m:I

    .line 106
    const/high16 v0, -0x4080

    sput v0, Lcom/whatsapp/TouchImageView;->n:F

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, Lcom/whatsapp/TouchImageView;->q:Landroid/graphics/Paint;

    .line 118
    sget-object v0, Lcom/whatsapp/TouchImageView;->q:Landroid/graphics/Paint;

    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x49

    goto :goto_3

    :pswitch_1
    move v0, v1

    goto :goto_3

    :pswitch_2
    move v0, v2

    goto :goto_3

    :pswitch_3
    move v0, v3

    goto :goto_3

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x49

    goto :goto_4

    :pswitch_5
    move v0, v1

    goto :goto_4

    :pswitch_6
    move v0, v2

    goto :goto_4

    :pswitch_7
    move v0, v3

    goto :goto_4

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    const/16 v0, 0x49

    goto :goto_5

    :pswitch_9
    move v0, v1

    goto :goto_5

    :pswitch_a
    move v0, v2

    goto :goto_5

    :pswitch_b
    move v0, v3

    goto :goto_5

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;-><init>(Landroid/content/Context;)V

    .line 111
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 29
    iput v0, p0, Lcom/whatsapp/TouchImageView;->e:I

    .line 144
    iput-boolean v1, p0, Lcom/whatsapp/TouchImageView;->g:Z

    .line 54
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->h:Z

    .line 107
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->i:Z

    .line 123
    iput-boolean v1, p0, Lcom/whatsapp/TouchImageView;->j:Z

    .line 64
    new-instance v0, Lcom/whatsapp/ud;

    invoke-direct {v0, p0}, Lcom/whatsapp/ud;-><init>(Lcom/whatsapp/TouchImageView;)V

    iput-object v0, p0, Lcom/whatsapp/TouchImageView;->s:Landroid/os/Handler;

    .line 171
    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/whatsapp/TouchImageView;->u:F

    .line 71
    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/TouchImageView;->k:Lcom/whatsapp/j4;

    .line 65
    new-instance v0, Lcom/whatsapp/h4;

    invoke-direct {v0, p0}, Lcom/whatsapp/h4;-><init>(Lcom/whatsapp/TouchImageView;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->a(Lcom/whatsapp/wallpaper/i;)V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 108
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 153
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 81
    iput v0, p0, Lcom/whatsapp/TouchImageView;->e:I

    .line 146
    iput-boolean v1, p0, Lcom/whatsapp/TouchImageView;->g:Z

    .line 60
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->h:Z

    .line 92
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->i:Z

    .line 173
    iput-boolean v1, p0, Lcom/whatsapp/TouchImageView;->j:Z

    .line 138
    new-instance v0, Lcom/whatsapp/ud;

    invoke-direct {v0, p0}, Lcom/whatsapp/ud;-><init>(Lcom/whatsapp/TouchImageView;)V

    iput-object v0, p0, Lcom/whatsapp/TouchImageView;->s:Landroid/os/Handler;

    .line 191
    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/whatsapp/TouchImageView;->u:F

    .line 125
    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/TouchImageView;->k:Lcom/whatsapp/j4;

    .line 53
    new-instance v0, Lcom/whatsapp/i4;

    invoke-direct {v0, p0}, Lcom/whatsapp/i4;-><init>(Lcom/whatsapp/TouchImageView;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->a(Lcom/whatsapp/wallpaper/i;)V

    .line 67
    return-void
.end method

.method private b(Landroid/view/MotionEvent;)F
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 88
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    sub-float/2addr v0, v1

    .line 184
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    sub-float/2addr v1, v2

    .line 51
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    return v0
.end method

.method static b(Lcom/whatsapp/TouchImageView;)J
    .locals 2
    .parameter

    .prologue
    .line 101
    iget-wide v0, p0, Lcom/whatsapp/TouchImageView;->r:J

    return-wide v0
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a(FF)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 61
    invoke-super {p0, p1, p2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FF)V

    .line 148
    return-void
.end method

.method public a(FFF)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 103
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FFF)V

    .line 8
    return-void
.end method

.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->j:Z

    .line 77
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 181
    const v0, 0x7f020006

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setImageResource(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 124
    :cond_0
    const v0, 0x7f020005

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setImageResource(I)V

    .line 174
    :cond_1
    return-void
.end method

.method public a(Lcom/whatsapp/TouchImageView;)V
    .locals 3
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 129
    iget-object v2, p1, Lcom/whatsapp/TouchImageView;->mSuppMatrix:Landroid/graphics/Matrix;

    .line 115
    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 96
    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    :goto_1
    return-void

    .line 115
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 177
    invoke-virtual {p0, v1, v1}, Lcom/whatsapp/TouchImageView;->a(ZZ)V

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0
    .parameter

    .prologue
    .line 34
    iput-boolean p1, p0, Lcom/whatsapp/TouchImageView;->g:Z

    .line 134
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 11
    .parameter

    .prologue
    const/high16 v10, -0x4080

    const/high16 v9, 0x3f80

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 121
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v3

    .line 190
    :goto_0
    return v0

    .line 91
    :pswitch_1
    iget v0, p0, Lcom/whatsapp/TouchImageView;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/whatsapp/TouchImageView;->e:I

    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/TouchImageView;->b:F

    .line 156
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/TouchImageView;->c:F

    move v0, v3

    .line 50
    goto :goto_0

    .line 180
    :pswitch_2
    sget-object v0, Lcom/whatsapp/TouchImageView;->z:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/TouchImageView;->f:J

    move v0, v3

    .line 190
    goto :goto_0

    .line 117
    :pswitch_3
    sget-object v0, Lcom/whatsapp/TouchImageView;->z:[Ljava/lang/String;

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move v0, v3

    .line 113
    goto :goto_0

    .line 62
    :pswitch_4
    iput v3, p0, Lcom/whatsapp/TouchImageView;->e:I

    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-le v0, v4, :cond_0

    .line 2
    iput-boolean v4, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 37
    sput v4, Lcom/whatsapp/TouchImageView;->m:I

    if-eqz v6, :cond_2

    .line 57
    :cond_0
    sget v0, Lcom/whatsapp/TouchImageView;->m:I

    if-ne v0, v4, :cond_1

    .line 161
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/TouchImageView;->b:F

    .line 141
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/TouchImageView;->c:F

    .line 3
    :cond_1
    const/4 v0, 0x2

    sput v0, Lcom/whatsapp/TouchImageView;->m:I

    .line 150
    sput v10, Lcom/whatsapp/TouchImageView;->n:F

    .line 187
    :cond_2
    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->h:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 122
    sget v0, Lcom/whatsapp/TouchImageView;->m:I

    if-eq v0, v4, :cond_5

    .line 47
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->d()Landroid/graphics/Matrix;

    move-result-object v0

    .line 116
    new-instance v7, Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v2}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v5, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v5}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-direct {v7, v1, v1, v2, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 120
    invoke-virtual {v0, v7}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 167
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    move-result v2

    .line 20
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    move-result v0

    .line 16
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v5

    int-to-float v5, v5

    cmpg-float v0, v0, v5

    if-gez v0, :cond_b

    move v0, v1

    .line 164
    :goto_1
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v5

    int-to-float v5, v5

    cmpg-float v2, v2, v5

    if-gez v2, :cond_c

    move v2, v1

    .line 100
    :goto_2
    cmpl-float v5, v0, v1

    if-lez v5, :cond_3

    .line 87
    iget v5, v7, Landroid/graphics/RectF;->left:F

    add-float/2addr v5, v0

    cmpl-float v5, v5, v1

    if-lez v5, :cond_10

    .line 109
    iget v0, v7, Landroid/graphics/RectF;->left:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    if-eqz v6, :cond_10

    .line 26
    :cond_3
    cmpg-float v5, v0, v1

    if-gez v5, :cond_10

    .line 59
    iget v5, v7, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v0

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v8

    int-to-float v8, v8

    cmpg-float v5, v5, v8

    if-gez v5, :cond_10

    .line 185
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v5, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v5

    move v5, v0

    .line 166
    :goto_3
    cmpl-float v0, v2, v1

    if-lez v0, :cond_f

    .line 44
    iget v0, v7, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_e

    .line 127
    iget v0, v7, Landroid/graphics/RectF;->top:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    if-eqz v6, :cond_4

    .line 13
    :goto_4
    cmpg-float v1, v0, v1

    if-gez v1, :cond_4

    .line 1
    iget v1, v7, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v1, v0

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    .line 137
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, v7, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    .line 93
    :cond_4
    :goto_5
    invoke-virtual {p0, v5, v0}, Lcom/whatsapp/TouchImageView;->b(FF)V

    .line 97
    if-eqz v6, :cond_a

    .line 110
    :cond_5
    sget v0, Lcom/whatsapp/TouchImageView;->n:F

    cmpl-float v0, v0, v10

    if-nez v0, :cond_6

    .line 90
    invoke-direct {p0, p1}, Lcom/whatsapp/TouchImageView;->b(Landroid/view/MotionEvent;)F

    move-result v0

    sput v0, Lcom/whatsapp/TouchImageView;->n:F

    if-eqz v6, :cond_a

    .line 41
    :cond_6
    sget v0, Lcom/whatsapp/TouchImageView;->n:F

    const/high16 v1, 0x4120

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 176
    invoke-direct {p0, p1}, Lcom/whatsapp/TouchImageView;->b(Landroid/view/MotionEvent;)F

    move-result v1

    .line 82
    sget v0, Lcom/whatsapp/TouchImageView;->n:F

    div-float v0, v1, v0

    .line 105
    sub-float/2addr v0, v9

    const/high16 v2, 0x4000

    mul-float/2addr v0, v2

    const/high16 v2, 0x4040

    div-float/2addr v0, v2

    add-float/2addr v0, v9

    .line 55
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->c()F

    move-result v2

    .line 136
    mul-float v5, v2, v0

    iget v7, p0, Lcom/whatsapp/TouchImageView;->u:F

    cmpl-float v5, v5, v7

    if-lez v5, :cond_7

    .line 102
    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->c(F)V

    if-eqz v6, :cond_8

    .line 168
    :cond_7
    div-float v0, v9, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->c(F)V

    .line 63
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/GalleryView;

    invoke-virtual {v0}, Lcom/whatsapp/GalleryView;->e()V

    .line 149
    iput-boolean v3, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 147
    :cond_8
    sput v1, Lcom/whatsapp/TouchImageView;->n:F

    .line 66
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->s:Landroid/os/Handler;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/TouchImageView;->r:J

    .line 99
    if-eqz v6, :cond_a

    .line 38
    :cond_9
    invoke-direct {p0, p1}, Lcom/whatsapp/TouchImageView;->b(Landroid/view/MotionEvent;)F

    move-result v0

    sput v0, Lcom/whatsapp/TouchImageView;->n:F

    .line 42
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/TouchImageView;->b:F

    .line 130
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/TouchImageView;->c:F

    .line 189
    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    if-eqz v0, :cond_d

    move v0, v4

    .line 28
    goto/16 :goto_0

    .line 16
    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v5, p0, Lcom/whatsapp/TouchImageView;->b:F

    sub-float/2addr v0, v5

    goto/16 :goto_1

    .line 164
    :cond_c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v5, p0, Lcom/whatsapp/TouchImageView;->c:F

    sub-float/2addr v2, v5

    goto/16 :goto_2

    :cond_d
    move v0, v3

    .line 36
    goto/16 :goto_0

    :cond_e
    move v0, v2

    goto/16 :goto_5

    :cond_f
    move v0, v2

    goto/16 :goto_4

    :cond_10
    move v5, v0

    goto/16 :goto_3

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public b()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    const/4 v0, 0x0

    .line 32
    iget-object v1, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 56
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0, v2}, Lcom/whatsapp/wallpaper/k;->a(Landroid/graphics/Bitmap;)V

    .line 78
    const/4 v0, 0x1

    .line 25
    :cond_0
    invoke-virtual {p0, v2}, Lcom/whatsapp/TouchImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    return v0
.end method

.method public c(F)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 154
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v0, p1, p1, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 152
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 83
    invoke-virtual {p0, v3, v3}, Lcom/whatsapp/TouchImageView;->a(ZZ)V

    .line 22
    return-void
.end method

.method protected c(FF)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 119
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/whatsapp/TouchImageView;->a(FFFF)V

    .line 4
    return-void
.end method

.method public d()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/high16 v7, 0x437a

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 31
    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 170
    iget v0, p0, Lcom/whatsapp/TouchImageView;->u:F

    iget v2, p0, Lcom/whatsapp/TouchImageView;->mMaxZoom:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_6

    .line 23
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 162
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 151
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getWidth()I

    move-result v4

    .line 72
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v5

    .line 89
    invoke-direct {p0}, Lcom/whatsapp/TouchImageView;->c()Z

    move-result v0

    if-nez v0, :cond_0

    if-le v2, v3, :cond_0

    .line 165
    int-to-float v0, v3

    int-to-float v6, v4

    mul-float/2addr v0, v6

    int-to-float v6, v2

    div-float/2addr v0, v6

    .line 80
    int-to-float v6, v5

    div-float v0, v6, v0

    .line 69
    if-eqz v1, :cond_4

    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/TouchImageView;->c()Z

    move-result v0

    if-nez v0, :cond_1

    if-le v3, v2, :cond_1

    .line 145
    sget v0, Lcom/whatsapp/TouchImageView;->l:F

    if-eqz v1, :cond_4

    .line 158
    :cond_1
    invoke-direct {p0}, Lcom/whatsapp/TouchImageView;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    if-le v2, v3, :cond_2

    .line 10
    sget v0, Lcom/whatsapp/TouchImageView;->l:F

    if-eqz v1, :cond_4

    .line 160
    :cond_2
    invoke-direct {p0}, Lcom/whatsapp/TouchImageView;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    if-le v3, v2, :cond_3

    .line 139
    int-to-float v0, v2

    int-to-float v2, v5

    mul-float/2addr v0, v2

    int-to-float v2, v3

    div-float/2addr v0, v2

    .line 188
    int-to-float v2, v4

    div-float v0, v2, v0

    .line 94
    if-eqz v1, :cond_4

    .line 178
    :cond_3
    sget v0, Lcom/whatsapp/TouchImageView;->l:F

    .line 33
    sget-object v2, Lcom/whatsapp/TouchImageView;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 126
    :cond_4
    invoke-virtual {p0, v0, v7}, Lcom/whatsapp/TouchImageView;->c(FF)V

    .line 14
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 175
    if-eqz v1, :cond_6

    .line 46
    :cond_5
    iget v0, p0, Lcom/whatsapp/TouchImageView;->u:F

    invoke-virtual {p0, v0, v7}, Lcom/whatsapp/TouchImageView;->c(FF)V

    .line 24
    iput-boolean v8, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 79
    :cond_6
    iput v8, p0, Lcom/whatsapp/TouchImageView;->e:I

    .line 12
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 182
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 169
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 73
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 40
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->j:Z

    .line 84
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 19
    const v0, 0x7f02000d

    invoke-virtual {p0, v0}, Lcom/whatsapp/TouchImageView;->setImageResource(I)V

    .line 157
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 140
    invoke-super {p0, p1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->onDraw(Landroid/graphics/Canvas;)V

    .line 142
    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->h:Z

    if-eqz v0, :cond_0

    .line 192
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 131
    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setDither(Z)V

    .line 21
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020421

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 132
    new-instance v2, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 159
    iget-object v3, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v3}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 183
    new-array v3, v7, [F

    iget-object v4, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v4}, Lcom/whatsapp/wallpaper/k;->f()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    aput v4, v3, v5

    iget-object v4, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v4}, Lcom/whatsapp/wallpaper/k;->e()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    aput v4, v3, v6

    .line 135
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 114
    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    aget v3, v3, v5

    add-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lcom/whatsapp/TouchImageView;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 155
    :cond_0
    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->t:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    if-nez v0, :cond_3

    sget v0, Lcom/whatsapp/MediaView;->M:I

    if-eq v0, v7, :cond_3

    .line 163
    sget-object v0, Lcom/whatsapp/TouchImageView;->p:Landroid/graphics/Rect;

    if-nez v0, :cond_1

    .line 49
    new-instance v0, Landroid/graphics/Rect;

    sget-object v1, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/whatsapp/TouchImageView;->k:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->jb:I

    sub-int/2addr v1, v2

    sget-object v2, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v2

    sget-object v3, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v3}, Landroid/view/Display;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    sput-object v0, Lcom/whatsapp/TouchImageView;->p:Landroid/graphics/Rect;

    .line 186
    :cond_1
    sget-object v0, Lcom/whatsapp/TouchImageView;->o:Landroid/graphics/Rect;

    if-nez v0, :cond_2

    .line 58
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/whatsapp/TouchImageView;->k:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->jb:I

    sget-object v2, Lcom/whatsapp/MediaView;->B:Landroid/view/Display;

    invoke-virtual {v2}, Landroid/view/Display;->getHeight()I

    move-result v2

    invoke-direct {v0, v5, v5, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    sput-object v0, Lcom/whatsapp/TouchImageView;->o:Landroid/graphics/Rect;

    .line 143
    :cond_2
    sget-object v0, Lcom/whatsapp/TouchImageView;->p:Landroid/graphics/Rect;

    sget-object v1, Lcom/whatsapp/TouchImageView;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 48
    sget-object v0, Lcom/whatsapp/TouchImageView;->o:Landroid/graphics/Rect;

    sget-object v1, Lcom/whatsapp/TouchImageView;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 74
    :cond_3
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 104
    invoke-super/range {p0 .. p5}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->onLayout(ZIIII)V

    .line 172
    iget-object v0, p0, Lcom/whatsapp/TouchImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter

    .prologue
    .line 85
    const/4 v0, 0x0

    return v0
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1
    .parameter

    .prologue
    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 86
    invoke-super {p0, p1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 30
    return-void
.end method
