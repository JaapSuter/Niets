.class public Lcom/whatsapp/GalleryView;
.super Landroid/view/ViewGroup;
.source "GalleryView.java"

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# static fields
.field private static final INVALID_POINTER:I = -0x1

.field private static final INVALID_SCREEN:I = -0x1

.field private static final SNAP_VELOCITY:I = 0xfa

.field private static final SWIPE_MAX_OFF_PATH:I = 0xfa

.field private static final SWIPE_MIN_DISTANCE:I = 0x78

.field private static final SWIPE_THRESHOLD_VELOCITY:I = 0xc8

.field private static final TAB_INDICATOR_HEIGHT_PCT:I = 0x2

.field private static final TOUCH_STATE_REST:I = 0x0

.field private static final TOUCH_STATE_SCROLLING:I = 0x1

.field private static final z:[Ljava/lang/String;


# instance fields
.field private allowLongPress:Z

.field private bar:Landroid/graphics/RectF;

.field bitmap:Landroid/graphics/Bitmap;

.field private canvas:Landroid/graphics/Canvas;

.field private currentScreen:I

.field private defaultScreen:I

.field private eventCallback:Lcom/whatsapp/gt;

.field private gestureDetector:Landroid/view/GestureDetector;

.field private hasTabIndicator:Z

.field private lastMeasuredWidth:I

.field private lastMotionX:F

.field private lastMotionY:F

.field private load:Lcom/whatsapp/ht;

.field private lockHandler:Lcom/whatsapp/gw;

.field locked:Z

.field private mActivePointerId:I

.field private mMaximumVelocity:I

.field private mScreenWidth:I

.field private mScrollInterpolator:Lcom/whatsapp/it;

.field private mVelocityTracker:Landroid/view/VelocityTracker;

.field private nextScreen:I

.field private paint:Landroid/graphics/Paint;

.field public scroller:Landroid/widget/Scroller;

.field private selectedTab:Landroid/graphics/RectF;

.field private selectedTabPaint:Landroid/graphics/Paint;

.field private tabIndicatorBackgroundPaint:Landroid/graphics/Paint;

.field private touchSlop:I

.field private touchState:I

.field private wallpaper:Landroid/graphics/Bitmap;

.field private wallpaperHeight:I

.field private wallpaperLoaded:Z

.field private wallpaperOffset:F

.field private wallpaperWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x21

    const/16 v2, 0x19

    const/4 v3, 0x6

    const/4 v1, 0x5

    const/4 v6, 0x0

    const/16 v0, 0x9

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "dzVrNk9OiSlwKcS%}PqO"

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

    const-string v0, "fxJaIq9^&Bdw\\cM%mPsBm9ZpDkm"

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

    const-string v0, "C_\u000e?\u0010<(\u0006"

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

    const-string v0, "bxSjDw``pH`n\u0010hNZzJtS`wKYWl|H)"

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

    const-string v0, "bxSjDw`\u0012pH`n\u0010iNh#"

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

    const-string v0, "bxSjDw`IoDr6PhL`xLsS`6\u001fqHamWKDdjJtDViZe\u001b"

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

    aput-object v0, v9, v1

    const-string v0, "RvMmRux\\c\u0001fxQ&NkuF&C`9JuDa9Vh\u0001@A~EuI@\u001fkNa|\u0011"

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

    aput-object v0, v9, v3

    const/4 v10, 0x7

    const-string v0, "LwKcSf|OrDa9^&Ujl\\n\u0001`oZhU%4\u001fSq"

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

    const/16 v8, 0x8

    const-string v0, "dzKoNkFOiHkmZt~avHh"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_9

    :pswitch_1
    move v0, v2

    goto :goto_9

    :pswitch_2
    const/16 v0, 0x3f

    goto :goto_9

    :pswitch_3
    move v0, v3

    goto :goto_9

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_a

    :pswitch_5
    move v0, v2

    goto :goto_a

    :pswitch_6
    const/16 v0, 0x3f

    goto :goto_a

    :pswitch_7
    move v0, v3

    goto :goto_a

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_b

    :pswitch_9
    move v0, v2

    goto :goto_b

    :pswitch_a
    const/16 v0, 0x3f

    goto :goto_b

    :pswitch_b
    move v0, v3

    goto :goto_b

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_c

    :pswitch_d
    move v0, v2

    goto :goto_c

    :pswitch_e
    const/16 v0, 0x3f

    goto :goto_c

    :pswitch_f
    move v0, v3

    goto :goto_c

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_d

    :pswitch_11
    move v0, v2

    goto :goto_d

    :pswitch_12
    const/16 v0, 0x3f

    goto :goto_d

    :pswitch_13
    move v0, v3

    goto :goto_d

    :cond_5
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_e
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_e

    :pswitch_15
    move v0, v2

    goto :goto_e

    :pswitch_16
    const/16 v0, 0x3f

    goto :goto_e

    :pswitch_17
    move v0, v3

    goto :goto_e

    :cond_6
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_f
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_f

    :pswitch_19
    move v0, v2

    goto :goto_f

    :pswitch_1a
    const/16 v0, 0x3f

    goto :goto_f

    :pswitch_1b
    move v0, v3

    goto :goto_f

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_10

    :pswitch_1d
    move v0, v2

    goto :goto_10

    :pswitch_1e
    const/16 v0, 0x3f

    goto :goto_10

    :pswitch_1f
    move v0, v3

    goto :goto_10

    :cond_8
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_11
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_11

    :pswitch_21
    move v0, v2

    goto :goto_11

    :pswitch_22
    const/16 v0, 0x3f

    goto :goto_11

    :pswitch_23
    move v0, v3

    goto :goto_11

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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 11
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/whatsapp/GalleryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 324
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 198
    iput v0, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    .line 290
    iput v0, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    .line 182
    iput v1, p0, Lcom/whatsapp/GalleryView;->touchState:I

    .line 99
    iput v1, p0, Lcom/whatsapp/GalleryView;->defaultScreen:I

    .line 292
    invoke-direct {p0}, Lcom/whatsapp/GalleryView;->a()V

    .line 195
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/whatsapp/be;

    invoke-direct {v1, p0}, Lcom/whatsapp/be;-><init>(Lcom/whatsapp/GalleryView;)V

    invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->gestureDetector:Landroid/view/GestureDetector;

    .line 54
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->gestureDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p0}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 224
    return-void
.end method

.method static a(Lcom/whatsapp/GalleryView;)I
    .locals 1
    .parameter

    .prologue
    .line 19
    iget v0, p0, Lcom/whatsapp/GalleryView;->touchState:I

    return v0
.end method

.method static a(Landroid/graphics/Bitmap;IILandroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 7
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/high16 v6, 0x4000

    .line 147
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 153
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 92
    if-lt v3, p1, :cond_0

    if-ge v1, p2, :cond_1

    .line 7
    :cond_0
    sget-object v0, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    const/16 v2, 0x10

    invoke-static {v0, v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 319
    if-ge v3, p1, :cond_2

    move v2, p1

    :goto_0
    if-ge v1, p2, :cond_3

    move v0, p2

    :goto_1
    sget-object v5, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v0, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 84
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 32
    invoke-virtual {v2, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 151
    sub-int v3, p1, v3

    int-to-float v3, v3

    div-float/2addr v3, v6

    sub-int v1, p2, v1

    int-to-float v1, v1

    div-float/2addr v1, v6

    const/4 v4, 0x0

    invoke-virtual {v2, p0, v3, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    move-object p0, v0

    .line 296
    :cond_1
    return-object p0

    :cond_2
    move v2, v3

    .line 319
    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method private a()V
    .locals 3

    .prologue
    .line 65
    new-instance v0, Lcom/whatsapp/it;

    invoke-direct {v0}, Lcom/whatsapp/it;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->mScrollInterpolator:Lcom/whatsapp/it;

    .line 289
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/GalleryView;->mScrollInterpolator:Lcom/whatsapp/it;

    invoke-direct {v0, v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    .line 300
    iget v0, p0, Lcom/whatsapp/GalleryView;->defaultScreen:I

    iput v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    .line 328
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->paint:Landroid/graphics/Paint;

    .line 79
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 247
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 312
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/GalleryView;->touchSlop:I

    .line 255
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->mMaximumVelocity:I

    .line 35
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->selectedTabPaint:Landroid/graphics/Paint;

    .line 94
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->selectedTabPaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 305
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->selectedTabPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->tabIndicatorBackgroundPaint:Landroid/graphics/Paint;

    .line 162
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->tabIndicatorBackgroundPaint:Landroid/graphics/Paint;

    const v1, -0x777778

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 197
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->tabIndicatorBackgroundPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 212
    new-instance v0, Lcom/whatsapp/ft;

    invoke-direct {v0, p0}, Lcom/whatsapp/ft;-><init>(Lcom/whatsapp/GalleryView;)V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->lockHandler:Lcom/whatsapp/gw;

    .line 163
    return-void
.end method

.method private a(IZ)V
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 141
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    if-eq p1, v0, :cond_2

    const/4 v0, 0x1

    .line 316
    :goto_0
    iput p1, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    .line 323
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getFocusedChild()Landroid/view/View;

    move-result-object v1

    .line 234
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-ne v1, v0, :cond_0

    .line 273
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 199
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getWidth()I

    move-result v0

    mul-int/2addr v0, p1

    .line 260
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v1

    sub-int v3, v0, v1

    .line 204
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v1

    if-eqz p2, :cond_3

    move v5, v2

    :goto_1
    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 209
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_1

    .line 44
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0, p1}, Lcom/whatsapp/gt;->a(I)V

    .line 221
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->invalidate()V

    .line 186
    return-void

    :cond_2
    move v0, v2

    .line 141
    goto :goto_0

    .line 204
    :cond_3
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v4

    mul-int/lit8 v5, v4, 0x2

    goto :goto_1
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 6
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 155
    iget v0, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 191
    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    .line 150
    :cond_0
    :goto_0
    return-void

    .line 230
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    .line 298
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    .line 254
    iget v3, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    sub-float v3, v4, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-int v3, v3

    .line 136
    iget v5, p0, Lcom/whatsapp/GalleryView;->lastMotionY:F

    sub-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v5, v0

    .line 320
    iget v0, p0, Lcom/whatsapp/GalleryView;->touchSlop:I

    if-le v3, v0, :cond_4

    move v0, v1

    .line 202
    :goto_1
    iget v3, p0, Lcom/whatsapp/GalleryView;->touchSlop:I

    if-le v5, v3, :cond_5

    move v3, v1

    .line 284
    :goto_2
    if-nez v0, :cond_2

    if-eqz v3, :cond_0

    .line 103
    :cond_2
    if-eqz v0, :cond_3

    if-nez v3, :cond_3

    .line 30
    iput v1, p0, Lcom/whatsapp/GalleryView;->touchState:I

    .line 301
    iput v4, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    .line 78
    :cond_3
    iget-boolean v0, p0, Lcom/whatsapp/GalleryView;->allowLongPress:Z

    if-eqz v0, :cond_0

    .line 26
    iput-boolean v2, p0, Lcom/whatsapp/GalleryView;->allowLongPress:Z

    .line 215
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 242
    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->cancelLongPress()V

    goto :goto_0

    :cond_4
    move v0, v2

    .line 320
    goto :goto_1

    :cond_5
    move v3, v2

    .line 202
    goto :goto_2
.end method

.method static b(Lcom/whatsapp/GalleryView;)I
    .locals 1
    .parameter

    .prologue
    .line 148
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    return v0
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 3
    .parameter

    .prologue
    .line 217
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    .line 252
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 41
    iget v2, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    if-ne v1, v2, :cond_0

    .line 2
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 294
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    .line 263
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    iput v1, p0, Lcom/whatsapp/GalleryView;->lastMotionY:F

    .line 135
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    .line 278
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 16
    :cond_0
    return-void

    .line 2
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 114
    iget-boolean v0, p0, Lcom/whatsapp/GalleryView;->hasTabIndicator:Z

    if-eqz v0, :cond_0

    .line 142
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getMeasuredWidth()I

    move-result v0

    .line 180
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getMeasuredHeight()I

    move-result v1

    .line 87
    new-instance v2, Landroid/graphics/RectF;

    int-to-float v3, v0

    mul-int/lit8 v4, v1, 0x2

    div-int/lit8 v4, v4, 0x64

    int-to-float v4, v4

    invoke-direct {v2, v6, v6, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/whatsapp/GalleryView;->bar:Landroid/graphics/RectF;

    .line 130
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v3

    div-int/2addr v2, v3

    .line 52
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v4, v2

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v5

    div-int v5, v0, v5

    add-int/2addr v2, v5

    int-to-float v2, v2

    mul-int/lit8 v5, v1, 0x2

    div-int/lit8 v5, v5, 0x64

    int-to-float v5, v5

    invoke-direct {v3, v4, v6, v2, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v3, p0, Lcom/whatsapp/GalleryView;->selectedTab:Landroid/graphics/RectF;

    .line 69
    mul-int/lit8 v1, v1, 0x2

    :try_start_0
    div-int/lit8 v1, v1, 0x64

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->bitmap:Landroid/graphics/Bitmap;

    .line 91
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/whatsapp/GalleryView;->bitmap:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->canvas:Landroid/graphics/Canvas;

    .line 256
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->canvas:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/whatsapp/GalleryView;->bar:Landroid/graphics/RectF;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/whatsapp/GalleryView;->tabIndicatorBackgroundPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 308
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->canvas:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/whatsapp/GalleryView;->selectedTab:Landroid/graphics/RectF;

    const/high16 v2, 0x40a0

    const/high16 v3, 0x40a0

    iget-object v4, p0, Lcom/whatsapp/GalleryView;->selectedTabPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :cond_0
    :goto_0
    return-void

    .line 71
    :catch_0
    move-exception v0

    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c(Landroid/view/MotionEvent;)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 93
    iget v1, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    .line 9
    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 145
    :cond_0
    :goto_0
    return-void

    .line 227
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    .line 207
    iget v2, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    sub-float/2addr v2, v1

    float-to-int v2, v2

    .line 154
    iput v1, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    .line 226
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v1, :cond_2

    .line 110
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v1}, Lcom/whatsapp/gt;->a()V

    .line 307
    :cond_2
    if-gez v2, :cond_4

    .line 314
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v1

    if-lez v1, :cond_3

    .line 96
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v1

    neg-int v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0, v1, v4}, Lcom/whatsapp/GalleryView;->scrollBy(II)V

    if-eqz v0, :cond_0

    .line 158
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 90
    :cond_4
    if-lez v2, :cond_7

    .line 235
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getWidth()I

    move-result v3

    sub-int/2addr v1, v3

    .line 131
    if-lez v1, :cond_5

    .line 132
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p0, v1, v4}, Lcom/whatsapp/GalleryView;->scrollBy(II)V

    if-eqz v0, :cond_6

    .line 206
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v1, :cond_6

    .line 211
    :cond_6
    if-eqz v0, :cond_0

    .line 102
    :cond_7
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->awakenScrollBars()Z

    goto :goto_0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 223
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getWidth()I

    move-result v0

    .line 304
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v1

    div-int/lit8 v2, v0, 0x2

    add-int/2addr v1, v2

    div-int v0, v1, v0

    .line 112
    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->c(I)V

    .line 205
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0
    .parameter

    .prologue
    .line 113
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getWidth()I

    move-result p1

    :cond_0
    iput p1, p0, Lcom/whatsapp/GalleryView;->mScreenWidth:I

    .line 139
    return-void
.end method

.method public a(II)V
    .locals 2
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 104
    invoke-virtual {p0, p2}, Lcom/whatsapp/GalleryView;->a(I)V

    .line 31
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 184
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    .line 164
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    mul-int/2addr v0, p2

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/GalleryView;->scrollTo(II)V

    .line 276
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_1

    .line 1
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0, p1}, Lcom/whatsapp/gt;->a(I)V

    .line 231
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->invalidate()V

    .line 159
    return-void
.end method

.method public a(Lcom/whatsapp/gt;)V
    .locals 0
    .parameter

    .prologue
    .line 245
    iput-object p1, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    .line 56
    return-void
.end method

.method public a(Z)V
    .locals 0
    .parameter

    .prologue
    .line 18
    iput-boolean p1, p0, Lcom/whatsapp/GalleryView;->hasTabIndicator:Z

    .line 138
    return-void
.end method

.method b()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    return v0
.end method

.method public b(I)V
    .locals 1
    .parameter

    .prologue
    .line 75
    iget v0, p0, Lcom/whatsapp/GalleryView;->mScreenWidth:I

    invoke-virtual {p0, p1, v0}, Lcom/whatsapp/GalleryView;->a(II)V

    .line 115
    return-void
.end method

.method public c(I)V
    .locals 1
    .parameter

    .prologue
    .line 149
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/whatsapp/GalleryView;->a(IZ)V

    .line 80
    return-void
.end method

.method public computeScroll()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 24
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/GalleryView;->scrollTo(II)V

    .line 85
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->postInvalidate()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 280
    :cond_0
    iget v0, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    if-eq v0, v3, :cond_1

    .line 213
    const/4 v0, 0x0

    iget v1, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    .line 269
    iput v3, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    .line 170
    :cond_1
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .parameter

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 169
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->wallpaper:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 236
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    iget v4, p0, Lcom/whatsapp/GalleryView;->wallpaperOffset:F

    mul-float/2addr v0, v4

    .line 264
    iget v4, p0, Lcom/whatsapp/GalleryView;->wallpaperWidth:I

    int-to-float v4, v4

    add-float/2addr v4, v0

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getRight()I

    move-result v5

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getLeft()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    cmpg-float v4, v4, v5

    if-gez v4, :cond_0

    .line 188
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getLeft()I

    move-result v4

    sub-int/2addr v0, v4

    iget v4, p0, Lcom/whatsapp/GalleryView;->wallpaperWidth:I

    sub-int/2addr v0, v4

    int-to-float v0, v0

    .line 116
    :cond_0
    iget-object v4, p0, Lcom/whatsapp/GalleryView;->wallpaper:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getBottom()I

    move-result v5

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getTop()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, p0, Lcom/whatsapp/GalleryView;->wallpaperHeight:I

    sub-int/2addr v5, v6

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    iget-object v6, p0, Lcom/whatsapp/GalleryView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 123
    :cond_1
    iget v0, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-eq v0, v2, :cond_9

    iget v0, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_9

    move v0, v2

    .line 315
    :goto_0
    if-eqz v0, :cond_4

    .line 122
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_2

    .line 285
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getDrawingTime()J

    move-result-wide v4

    invoke-virtual {p0, p1, v0, v4, v5}, Lcom/whatsapp/GalleryView;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    if-eqz v3, :cond_3

    .line 23
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v4, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_3

    .line 291
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0}, Lcom/whatsapp/gt;->b()V

    .line 167
    :cond_3
    if-eqz v3, :cond_7

    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getDrawingTime()J

    move-result-wide v4

    .line 175
    iget v0, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    if-ltz v0, :cond_5

    iget v0, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v6

    if-ge v0, v6, :cond_5

    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    iget v6, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    sub-int/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 250
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1, v0, v4, v5}, Lcom/whatsapp/GalleryView;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 303
    iget v0, p0, Lcom/whatsapp/GalleryView;->nextScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1, v0, v4, v5}, Lcom/whatsapp/GalleryView;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    if-eqz v3, :cond_7

    .line 13
    :cond_5
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v2

    move v0, v1

    .line 232
    :cond_6
    if-ge v0, v2, :cond_7

    .line 20
    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v4, v5}, Lcom/whatsapp/GalleryView;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 129
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_6

    .line 25
    :cond_7
    iget-boolean v0, p0, Lcom/whatsapp/GalleryView;->hasTabIndicator:Z

    if-eqz v0, :cond_8

    .line 275
    invoke-direct {p0}, Lcom/whatsapp/GalleryView;->c()V

    .line 187
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getMeasuredHeight()I

    move-result v2

    mul-int/lit8 v2, v2, 0x62

    div-int/lit8 v2, v2, 0x64

    int-to-float v2, v2

    iget-object v3, p0, Lcom/whatsapp/GalleryView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 225
    :cond_8
    return-void

    :cond_9
    move v0, v1

    .line 123
    goto/16 :goto_0
.end method

.method public dispatchUnhandledMove(Landroid/view/View;I)Z
    .locals 3
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x1

    .line 58
    const/16 v1, 0x11

    if-ne p2, v1, :cond_0

    .line 15
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v1

    if-lez v1, :cond_1

    .line 100
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/whatsapp/GalleryView;->c(I)V

    .line 325
    :goto_0
    return v0

    .line 82
    :cond_0
    const/16 v1, 0x42

    if-ne p2, v1, :cond_1

    .line 168
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v1

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    .line 244
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->b()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Lcom/whatsapp/GalleryView;->c(I)V

    goto :goto_0

    .line 203
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->dispatchUnhandledMove(Landroid/view/View;I)Z

    move-result v0

    goto :goto_0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/GalleryView;->locked:Z

    .line 279
    return-void
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2
    .parameter

    .prologue
    .line 229
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    iget-object v1, p0, Lcom/whatsapp/GalleryView;->lockHandler:Lcom/whatsapp/gw;

    invoke-interface {v0, v1}, Lcom/whatsapp/gt;->a(Lcom/whatsapp/gw;)V

    .line 286
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter

    .prologue
    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 119
    iget-boolean v0, p0, Lcom/whatsapp/GalleryView;->locked:Z

    if-eqz v0, :cond_1

    .line 172
    :cond_0
    :goto_0
    return v2

    .line 157
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 282
    const/4 v0, 0x2

    if-ne v4, v0, :cond_2

    iget v0, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-nez v0, :cond_0

    .line 271
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_3

    .line 196
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 239
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 288
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/whatsapp/TouchImageView;

    if-eqz v0, :cond_4

    .line 45
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-le v0, v2, :cond_4

    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v0, :cond_4

    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->h:Z

    if-nez v0, :cond_4

    .line 237
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    iput-boolean v2, v0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 156
    sput v2, Lcom/whatsapp/TouchImageView;->m:I

    .line 259
    iput-boolean v2, p0, Lcom/whatsapp/GalleryView;->locked:Z

    .line 179
    :cond_4
    packed-switch v4, :pswitch_data_0

    .line 172
    :cond_5
    :goto_1
    :pswitch_0
    iget v0, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    .line 265
    :pswitch_1
    sget v0, Lcom/whatsapp/TouchImageView;->m:I

    if-ne v0, v2, :cond_6

    .line 60
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_5

    .line 241
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0, p1}, Lcom/whatsapp/gt;->a(Landroid/view/MotionEvent;)V

    if-eqz v3, :cond_5

    .line 321
    :cond_6
    invoke-direct {p0, p1}, Lcom/whatsapp/GalleryView;->a(Landroid/view/MotionEvent;)V

    .line 89
    if-eqz v3, :cond_5

    .line 29
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 146
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 70
    iput v0, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    .line 249
    iput v4, p0, Lcom/whatsapp/GalleryView;->lastMotionY:F

    .line 222
    iput-boolean v2, p0, Lcom/whatsapp/GalleryView;->allowLongPress:Z

    .line 108
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    .line 293
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    :goto_2
    iput v0, p0, Lcom/whatsapp/GalleryView;->touchState:I

    .line 214
    if-eqz v3, :cond_5

    .line 10
    :pswitch_3
    sget-object v0, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v0, v0, v4

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 140
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    .line 55
    iput-boolean v1, p0, Lcom/whatsapp/GalleryView;->allowLongPress:Z

    .line 34
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_7

    .line 240
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 59
    :cond_7
    iput v1, p0, Lcom/whatsapp/GalleryView;->touchState:I

    .line 12
    if-eqz v3, :cond_5

    .line 262
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/whatsapp/GalleryView;->b(Landroid/view/MotionEvent;)V

    .line 309
    if-eqz v3, :cond_5

    .line 38
    :pswitch_5
    sget-object v0, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move v0, v2

    .line 293
    goto :goto_2

    .line 179
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 17
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v4

    move v1, v2

    move v0, v2

    .line 228
    :cond_0
    if-ge v1, v4, :cond_2

    .line 98
    invoke-virtual {p0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 322
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_1

    .line 106
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 258
    add-int v7, v0, v6

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v5, v0, v2, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 174
    add-int/2addr v0, v6

    .line 121
    :cond_1
    add-int/lit8 v1, v1, 0x1

    if-eqz v3, :cond_0

    .line 326
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->load:Lcom/whatsapp/ht;

    if-eqz v0, :cond_3

    .line 28
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->load:Lcom/whatsapp/ht;

    invoke-interface {v0}, Lcom/whatsapp/ht;->a()V

    .line 317
    :cond_3
    return-void
.end method

.method protected onMeasure(II)V
    .locals 9
    .parameter
    .parameter

    .prologue
    const/high16 v7, 0x4000

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 200
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 6
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 219
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 40
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 177
    if-eq v0, v7, :cond_0

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/4 v6, 0x5

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 299
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    .line 238
    if-eq v6, v7, :cond_1

    .line 173
    new-instance v0, Ljava/lang/IllegalStateException;

    sget-object v1, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v7

    move v1, v2

    .line 181
    :goto_0
    if-ge v1, v7, :cond_2

    .line 37
    iget-boolean v0, p0, Lcom/whatsapp/GalleryView;->hasTabIndicator:Z

    if-eqz v0, :cond_5

    const/16 v0, 0x62

    .line 248
    :goto_1
    mul-int/2addr v0, v5

    div-int/lit8 v0, v0, 0x64

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 50
    invoke-virtual {p0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, p1, v0}, Landroid/view/View;->measure(II)V

    .line 43
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_7

    .line 144
    :cond_2
    iget-boolean v0, p0, Lcom/whatsapp/GalleryView;->wallpaperLoaded:Z

    if-eqz v0, :cond_3

    .line 101
    iput-boolean v2, p0, Lcom/whatsapp/GalleryView;->wallpaperLoaded:Z

    .line 246
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->wallpaper:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v4, v5, v1}, Lcom/whatsapp/GalleryView;->a(Landroid/graphics/Bitmap;IILandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/GalleryView;->wallpaper:Landroid/graphics/Bitmap;

    .line 268
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->wallpaper:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->wallpaperWidth:I

    .line 165
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->wallpaper:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GalleryView;->wallpaperHeight:I

    .line 274
    :cond_3
    iget v0, p0, Lcom/whatsapp/GalleryView;->wallpaperWidth:I

    if-le v0, v4, :cond_6

    mul-int v0, v7, v4

    iget v1, p0, Lcom/whatsapp/GalleryView;->wallpaperWidth:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    add-int/lit8 v1, v7, -0x1

    int-to-float v1, v1

    int-to-float v3, v4

    mul-float/2addr v1, v3

    div-float/2addr v0, v1

    :goto_2
    iput v0, p0, Lcom/whatsapp/GalleryView;->wallpaperOffset:F

    .line 257
    iget v0, p0, Lcom/whatsapp/GalleryView;->lastMeasuredWidth:I

    if-eq v0, v4, :cond_4

    .line 193
    iput v4, p0, Lcom/whatsapp/GalleryView;->lastMeasuredWidth:I

    .line 185
    iget v0, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    mul-int/2addr v0, v4

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/GalleryView;->scrollTo(II)V

    .line 72
    invoke-virtual {p0, v4}, Lcom/whatsapp/GalleryView;->a(I)V

    .line 233
    :cond_4
    invoke-direct {p0}, Lcom/whatsapp/GalleryView;->c()V

    .line 105
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->invalidate()V

    .line 86
    return-void

    .line 37
    :cond_5
    const/16 v0, 0x64

    goto :goto_1

    .line 274
    :cond_6
    const/high16 v0, 0x3f80

    goto :goto_2

    :cond_7
    move v1, v0

    goto :goto_0
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 134
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0, v1}, Lcom/whatsapp/gt;->b(I)V

    .line 253
    :cond_0
    return v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7
    .parameter

    .prologue
    const/4 v6, -0x1

    const/4 v5, 0x0

    const/4 v4, 0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 49
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->gestureDetector:Landroid/view/GestureDetector;

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 22
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v1, :cond_0

    .line 194
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 161
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    .line 327
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 318
    packed-switch v1, :pswitch_data_0

    .line 310
    :cond_1
    :goto_0
    :pswitch_0
    return v4

    .line 118
    :pswitch_1
    iget-boolean v1, p0, Lcom/whatsapp/GalleryView;->locked:Z

    if-eqz v1, :cond_2

    .line 14
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_1

    .line 251
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0, p1}, Lcom/whatsapp/gt;->a(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 166
    :cond_2
    iget v1, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-eqz v1, :cond_1

    .line 311
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_3

    .line 281
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 306
    :cond_3
    iput v2, p0, Lcom/whatsapp/GalleryView;->lastMotionX:F

    .line 61
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    if-eqz v0, :cond_1

    .line 190
    :pswitch_2
    iget-boolean v1, p0, Lcom/whatsapp/GalleryView;->locked:Z

    if-eqz v1, :cond_4

    .line 287
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    invoke-interface {v0, p1}, Lcom/whatsapp/gt;->a(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 266
    :cond_4
    iget v1, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-ne v1, v4, :cond_5

    .line 137
    invoke-direct {p0, p1}, Lcom/whatsapp/GalleryView;->c(Landroid/view/MotionEvent;)V

    if-eqz v0, :cond_1

    .line 176
    :cond_5
    invoke-virtual {p0, p1}, Lcom/whatsapp/GalleryView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-ne v1, v4, :cond_1

    .line 267
    invoke-direct {p0, p1}, Lcom/whatsapp/GalleryView;->c(Landroid/view/MotionEvent;)V

    if-eqz v0, :cond_1

    .line 3
    :pswitch_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 171
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->eventCallback:Lcom/whatsapp/gt;

    if-eqz v1, :cond_6

    .line 66
    :cond_6
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 277
    const/16 v2, 0x3e8

    iget v3, p0, Lcom/whatsapp/GalleryView;->mMaximumVelocity:I

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 74
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v1

    float-to-int v1, v1

    .line 5
    iget v2, p0, Lcom/whatsapp/GalleryView;->touchState:I

    if-ne v2, v4, :cond_a

    iget-boolean v2, p0, Lcom/whatsapp/GalleryView;->locked:Z

    if-nez v2, :cond_a

    .line 160
    const/16 v2, 0xfa

    if-le v1, v2, :cond_7

    iget v2, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    if-lez v2, :cond_7

    .line 111
    iget v2, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, Lcom/whatsapp/GalleryView;->c(I)V

    if-eqz v0, :cond_9

    .line 210
    :cond_7
    const/16 v2, -0xfa

    if-ge v1, v2, :cond_8

    iget v1, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_8

    .line 295
    iget v1, p0, Lcom/whatsapp/GalleryView;->currentScreen:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Lcom/whatsapp/GalleryView;->c(I)V

    if-eqz v0, :cond_9

    .line 126
    :cond_8
    invoke-direct {p0}, Lcom/whatsapp/GalleryView;->d()V

    .line 73
    :cond_9
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_a

    .line 313
    iget-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 21
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whatsapp/GalleryView;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 302
    :cond_a
    iput v5, p0, Lcom/whatsapp/GalleryView;->touchState:I

    .line 124
    iput v6, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    .line 117
    if-eqz v0, :cond_1

    .line 47
    :pswitch_4
    iget-boolean v1, p0, Lcom/whatsapp/GalleryView;->locked:Z

    if-nez v1, :cond_1

    .line 125
    sget-object v1, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 220
    iput v5, p0, Lcom/whatsapp/GalleryView;->touchState:I

    .line 208
    iput v6, p0, Lcom/whatsapp/GalleryView;->mActivePointerId:I

    .line 127
    if-eqz v0, :cond_1

    .line 83
    :pswitch_5
    iget-boolean v1, p0, Lcom/whatsapp/GalleryView;->locked:Z

    if-nez v1, :cond_1

    .line 81
    const/4 v1, 0x2

    sput v1, Lcom/whatsapp/TouchImageView;->m:I

    .line 120
    const/high16 v1, -0x4080

    sput v1, Lcom/whatsapp/TouchImageView;->n:F

    .line 297
    invoke-direct {p0, p1}, Lcom/whatsapp/GalleryView;->b(Landroid/view/MotionEvent;)V

    .line 201
    if-eqz v0, :cond_1

    .line 8
    :pswitch_6
    sget-object v0, Lcom/whatsapp/GalleryView;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 318
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 4
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 48
    invoke-virtual {p0}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v2

    .line 216
    const/4 v0, 0x0

    :cond_0
    if-ge v0, v2, :cond_1

    .line 270
    invoke-virtual {p0, v0}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 46
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 51
    :cond_1
    return-void
.end method
