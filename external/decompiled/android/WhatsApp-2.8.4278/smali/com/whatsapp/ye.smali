.class public Lcom/whatsapp/ye;
.super Landroid/widget/RelativeLayout;
.source "ye.java"


# static fields
.field private static a:I

.field static b:Landroid/graphics/Paint;

.field static c:Lcom/whatsapp/j4;

.field private static final z:[Ljava/lang/String;


# instance fields
.field d:Z

.field e:Lcom/whatsapp/sz;

.field f:Landroid/content/Context;

.field g:Z

.field h:I

.field i:I

.field j:I

.field k:I

.field l:Z

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x39

    const/16 v2, 0x2f

    const/16 v3, 0x25

    const/16 v4, 0x9

    const/4 v6, 0x0

    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "[ZGk9\\\u0000Wl6M\u000fKf!\u0019FK`!PNQl1\u0019V@}{\u0003"

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

    const-string v0, "[ZGk9\\pWV9XVJ|!\u0016HWh,fMPk7UJ"

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

    const-string v0, "[ZGk9\\pWV9XVJ|!\u0016HWl0WpG|7[C@&"

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

    const/4 v8, 0x3

    const-string v0, "\u001al\u0015Jaz\u001f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ye;->z:[Ljava/lang/String;

    .line 105
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/ye;->a:I

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x55

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_4

    :pswitch_1
    move v0, v2

    goto :goto_4

    :pswitch_2
    move v0, v3

    goto :goto_4

    :pswitch_3
    move v0, v4

    goto :goto_4

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x55

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_5

    :pswitch_5
    move v0, v2

    goto :goto_5

    :pswitch_6
    move v0, v3

    goto :goto_5

    :pswitch_7
    move v0, v4

    goto :goto_5

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x55

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_6

    :pswitch_9
    move v0, v2

    goto :goto_6

    :pswitch_a
    move v0, v3

    goto :goto_6

    :pswitch_b
    move v0, v4

    goto :goto_6

    :cond_3
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x55

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_7

    :pswitch_d
    move v0, v2

    goto :goto_7

    :pswitch_e
    move v0, v3

    goto :goto_7

    :pswitch_f
    move v0, v4

    goto :goto_7

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter

    .prologue
    .line 139
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/ye;->g:Z

    .line 11
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/ye;->m:I

    .line 56
    iput-object p1, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 75
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/ye;->g:Z

    .line 138
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/ye;->m:I

    .line 109
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/whatsapp/sz;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v3, -0x1

    .line 30
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/ye;->g:Z

    .line 85
    iput v3, p0, Lcom/whatsapp/ye;->m:I

    .line 53
    iput-object p2, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    .line 1
    iput-object p1, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    .line 125
    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    if-nez v0, :cond_0

    .line 31
    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    .line 25
    :cond_0
    sget-object v0, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    if-nez v0, :cond_1

    .line 114
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    .line 55
    sget-object v0, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    sget-object v1, Lcom/whatsapp/ye;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    sget-object v0, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->V:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    :cond_1
    sget v0, Lcom/whatsapp/ye;->a:I

    if-ne v0, v3, :cond_2

    .line 118
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0028

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    sput v0, Lcom/whatsapp/ye;->a:I

    .line 8
    :cond_2
    return-void
.end method

.method private a()F
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 112
    iput v4, p0, Lcom/whatsapp/ye;->k:I

    .line 5
    invoke-virtual {p0, v3}, Lcom/whatsapp/ye;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/ye;->j:I

    .line 61
    iget-object v1, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v1, v1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/whatsapp/ye;->l:Z

    .line 121
    iget-boolean v1, p0, Lcom/whatsapp/ye;->l:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v1, v1, Lcom/whatsapp/uz;->b:Z

    if-nez v1, :cond_2

    .line 59
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iput v2, p0, Lcom/whatsapp/ye;->i:I

    .line 116
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getId()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 42
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/ye;->h:I

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 81
    :cond_0
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/ye;->h:I

    .line 115
    :cond_1
    iget v1, p0, Lcom/whatsapp/ye;->k:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/ye;->k:I

    .line 82
    iget v0, p0, Lcom/whatsapp/ye;->k:I

    int-to-float v0, v0

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->q:F

    add-float/2addr v0, v1

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->l:F

    add-float/2addr v0, v1

    .line 99
    :goto_0
    return v0

    .line 113
    :pswitch_0
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/ye;->h:I

    .line 99
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->q:F

    add-float/2addr v0, v1

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->l:F

    add-float/2addr v0, v1

    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/ye;->k:I

    .line 92
    iget v0, p0, Lcom/whatsapp/ye;->k:I

    int-to-float v0, v0

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->q:F

    add-float/2addr v0, v1

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->l:F

    add-float/2addr v0, v1

    goto :goto_0

    .line 116
    :pswitch_data_0
    .packed-switch 0x7f0d00d5
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13
    .parameter

    .prologue
    const/high16 v12, 0x3f80

    const/4 v8, 0x1

    const/4 v11, -0x1

    const/4 v1, 0x0

    sget-boolean v9, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 16
    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    if-eq v0, v11, :cond_3c

    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    const/4 v2, 0x6

    if-eq v0, v2, :cond_3c

    sget-boolean v0, Lcom/whatsapp/Conversation;->g:Z

    if-eqz v0, :cond_3c

    .line 32
    invoke-direct {p0}, Lcom/whatsapp/ye;->a()F

    move-result v0

    float-to-int v4, v0

    .line 50
    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-eqz v0, :cond_16

    .line 6
    new-instance v5, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->o:I

    sub-int/2addr v0, v2

    :goto_0
    iget-boolean v2, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v2, :cond_14

    iget v2, p0, Lcom/whatsapp/ye;->j:I

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->z:I

    sub-int/2addr v2, v3

    :goto_1
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v3

    :goto_2
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v6

    sget-object v7, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v7, v7, Lcom/whatsapp/j4;->n:I

    sub-int/2addr v6, v7

    invoke-direct {v5, v0, v2, v3, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v5

    .line 29
    :goto_3
    :try_start_0
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203b4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 28
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 4
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 38
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    :cond_0
    :goto_4
    if-eqz v9, :cond_e

    .line 43
    :cond_1
    iget v0, p0, Lcom/whatsapp/ye;->m:I

    if-eq v0, v11, :cond_d

    .line 111
    sget-object v0, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 110
    sget-object v0, Lcom/whatsapp/Conversation;->Q:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    sget v2, Lcom/whatsapp/ye;->a:I

    sub-int v2, v0, v2

    .line 65
    sget-object v0, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/dj;

    .line 93
    invoke-static {v0}, Lcom/whatsapp/dj;->a(Lcom/whatsapp/dj;)I

    move-result v3

    if-le v3, v2, :cond_2

    .line 101
    if-eqz v9, :cond_3b

    move v4, v2

    .line 86
    :cond_2
    invoke-static {v0}, Lcom/whatsapp/dj;->a(Lcom/whatsapp/dj;)I

    move-result v2

    if-ge v2, v4, :cond_a

    .line 134
    invoke-static {v0}, Lcom/whatsapp/dj;->a(Lcom/whatsapp/dj;)I

    move-result v2

    if-lt v2, v4, :cond_3

    .line 12
    invoke-static {v0}, Lcom/whatsapp/dj;->a(Lcom/whatsapp/dj;)I

    move-result v4

    if-eqz v9, :cond_3a

    .line 15
    :cond_3
    invoke-virtual {v0, v4}, Lcom/whatsapp/dj;->a(I)V

    move v2, v8

    .line 27
    :goto_5
    if-eqz v2, :cond_9

    .line 88
    iget-object v2, v0, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    .line 48
    :cond_4
    if-eqz v2, :cond_6

    .line 69
    invoke-virtual {v2, v4}, Lcom/whatsapp/dj;->a(I)V

    .line 131
    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v3

    iget-object v3, v3, Lcom/whatsapp/Conversation;->Ib:Landroid/widget/ListView;

    iget-object v5, v2, Lcom/whatsapp/dj;->d:Lcom/whatsapp/sz;

    invoke-virtual {v3, v5}, Landroid/widget/ListView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3

    .line 21
    if-eqz v3, :cond_5

    .line 133
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 66
    :cond_5
    iget-object v2, v2, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    .line 84
    if-eqz v9, :cond_4

    .line 34
    :cond_6
    iget-object v2, v0, Lcom/whatsapp/dj;->e:Lcom/whatsapp/dj;

    .line 80
    :cond_7
    if-eqz v2, :cond_9

    .line 36
    invoke-virtual {v2, v4}, Lcom/whatsapp/dj;->a(I)V

    .line 9
    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v3

    iget-object v3, v3, Lcom/whatsapp/Conversation;->Ib:Landroid/widget/ListView;

    iget-object v5, v2, Lcom/whatsapp/dj;->d:Lcom/whatsapp/sz;

    invoke-virtual {v3, v5}, Landroid/widget/ListView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3

    .line 120
    if-eqz v3, :cond_8

    .line 140
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 103
    :cond_8
    iget-object v2, v2, Lcom/whatsapp/dj;->e:Lcom/whatsapp/dj;

    .line 100
    if-eqz v9, :cond_7

    .line 129
    :cond_9
    if-eqz v9, :cond_b

    .line 20
    :cond_a
    invoke-static {v0}, Lcom/whatsapp/dj;->a(Lcom/whatsapp/dj;)I

    move-result v4

    .line 132
    :cond_b
    :goto_6
    if-eqz v9, :cond_d

    .line 63
    :cond_c
    iput v11, p0, Lcom/whatsapp/ye;->m:I

    .line 45
    :cond_d
    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-eqz v0, :cond_1e

    .line 74
    new-instance v5, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_1a

    move v0, v1

    :goto_7
    iget-boolean v2, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v2, :cond_1c

    iget v3, p0, Lcom/whatsapp/ye;->j:I

    iget-boolean v2, p0, Lcom/whatsapp/ye;->l:Z

    if-eqz v2, :cond_1b

    move v2, v1

    :goto_8
    sub-int v2, v3, v2

    :goto_9
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_1d

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->o:I

    sub-int v3, v4, v3

    :goto_a
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v6

    sget-object v7, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v7, v7, Lcom/whatsapp/j4;->n:I

    sub-int/2addr v6, v7

    invoke-direct {v5, v0, v2, v3, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v5

    .line 19
    :goto_b
    const/4 v3, 0x0

    .line 7
    iget v2, p0, Lcom/whatsapp/ye;->m:I

    packed-switch v2, :pswitch_data_0

    .line 78
    :try_start_1
    iget-object v2, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0203b0

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 13
    :goto_c
    if-eqz v2, :cond_e

    .line 17
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 58
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 130
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_e
    move v6, v4

    .line 60
    :goto_d
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 128
    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    if-eq v0, v11, :cond_12

    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_12

    iget-boolean v0, p0, Lcom/whatsapp/ye;->l:Z

    if-eqz v0, :cond_12

    .line 52
    iget-boolean v0, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v0, :cond_30

    iget v0, p0, Lcom/whatsapp/ye;->j:I

    iget-boolean v2, p0, Lcom/whatsapp/ye;->l:Z

    if-eqz v2, :cond_2f

    :goto_e
    sub-int/2addr v0, v1

    int-to-float v0, v0

    :goto_f
    iget v1, p0, Lcom/whatsapp/ye;->i:I

    int-to-float v1, v1

    add-float v2, v0, v1

    .line 124
    iget-object v0, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 96
    iget v10, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 24
    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->R:F

    iget v1, p0, Lcom/whatsapp/ye;->h:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    div-int/lit8 v1, v6, 0x2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_31

    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->S:F

    iget v1, p0, Lcom/whatsapp/ye;->h:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    move v7, v0

    .line 33
    :goto_10
    iget-object v0, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-nez v0, :cond_11

    .line 10
    iget v0, p0, Lcom/whatsapp/ye;->m:I

    if-ne v0, v11, :cond_f

    .line 76
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_32

    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v0, Lcom/whatsapp/j4;->Q:F

    :goto_11
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_33

    move v3, v7

    :goto_12
    sget-object v5, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    move-object v0, p1

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-eqz v9, :cond_12

    .line 70
    :cond_f
    iget v0, p0, Lcom/whatsapp/ye;->m:I

    if-ne v0, v8, :cond_10

    .line 62
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_34

    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v0, Lcom/whatsapp/j4;->Q:F

    :goto_13
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_35

    move v3, v7

    :goto_14
    sget-object v5, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    move-object v0, p1

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-eqz v9, :cond_12

    .line 35
    :cond_10
    sget-object v0, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/dj;

    .line 40
    int-to-float v0, v6

    const/high16 v1, 0x3e80

    mul-float/2addr v0, v1

    .line 119
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v1

    if-eqz v1, :cond_36

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v4, v1, Lcom/whatsapp/j4;->Q:F

    :goto_15
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v1

    if-eqz v1, :cond_37

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->Q:F

    add-float v6, v1, v0

    :goto_16
    sget-object v8, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    move-object v3, p1

    move v5, v12

    move v7, v12

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 22
    if-eqz v9, :cond_12

    .line 136
    :cond_11
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_38

    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v0, Lcom/whatsapp/j4;->T:F

    :goto_17
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_39

    iget v0, p0, Lcom/whatsapp/ye;->h:I

    int-to-float v0, v0

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->U:F

    add-float/2addr v3, v0

    :goto_18
    sget-object v5, Lcom/whatsapp/ye;->b:Landroid/graphics/Paint;

    move-object v0, p1

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 57
    :cond_12
    return-void

    :cond_13
    move v0, v1

    .line 6
    goto/16 :goto_0

    :cond_14
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->m:I

    goto/16 :goto_1

    :cond_15
    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->o:I

    add-int/2addr v3, v4

    goto/16 :goto_2

    .line 91
    :cond_16
    new-instance v5, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    :goto_19
    iget-boolean v2, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v2, :cond_18

    iget v2, p0, Lcom/whatsapp/ye;->j:I

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->z:I

    sub-int/2addr v2, v3

    :goto_1a
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v3

    :goto_1b
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v6

    sget-object v7, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v7, v7, Lcom/whatsapp/j4;->m:I

    sub-int/2addr v6, v7

    invoke-direct {v5, v0, v2, v3, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v5

    goto/16 :goto_3

    :cond_17
    move v0, v1

    goto :goto_19

    :cond_18
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->m:I

    goto :goto_1a

    :cond_19
    move v3, v4

    goto :goto_1b

    .line 94
    :catch_0
    move-exception v0

    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ye;->z:[Ljava/lang/String;

    const/4 v5, 0x2

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 122
    invoke-static {}, Lcom/whatsapp/j5;->c()V

    goto/16 :goto_4

    .line 74
    :cond_1a
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->o:I

    add-int/2addr v0, v2

    goto/16 :goto_7

    :cond_1b
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->z:I

    goto/16 :goto_8

    :cond_1c
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->m:I

    goto/16 :goto_9

    :cond_1d
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v3

    goto/16 :goto_a

    .line 39
    :cond_1e
    iget v0, p0, Lcom/whatsapp/ye;->m:I

    if-ne v0, v11, :cond_23

    .line 71
    new-instance v5, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_1f

    move v0, v1

    :goto_1c
    iget-boolean v2, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v2, :cond_21

    iget v3, p0, Lcom/whatsapp/ye;->j:I

    iget-boolean v2, p0, Lcom/whatsapp/ye;->l:Z

    if-eqz v2, :cond_20

    move v2, v1

    :goto_1d
    sub-int v2, v3, v2

    :goto_1e
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_22

    move v3, v4

    :goto_1f
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v6

    sget-object v7, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v7, v7, Lcom/whatsapp/j4;->m:I

    sub-int/2addr v6, v7

    invoke-direct {v5, v0, v2, v3, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v5

    goto/16 :goto_b

    :cond_1f
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_1c

    :cond_20
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->z:I

    goto :goto_1d

    :cond_21
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->m:I

    goto :goto_1e

    :cond_22
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v3

    goto :goto_1f

    .line 98
    :cond_23
    iget v0, p0, Lcom/whatsapp/ye;->m:I

    packed-switch v0, :pswitch_data_1

    .line 54
    new-instance v5, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_2b

    move v0, v1

    :goto_20
    iget-boolean v2, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v2, :cond_2d

    iget v3, p0, Lcom/whatsapp/ye;->j:I

    iget-boolean v2, p0, Lcom/whatsapp/ye;->l:Z

    if-eqz v2, :cond_2c

    move v2, v1

    :goto_21
    sub-int v2, v3, v2

    :goto_22
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_2e

    move v3, v4

    :goto_23
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v6

    sget-object v7, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v7, v7, Lcom/whatsapp/j4;->m:I

    sub-int/2addr v6, v7

    invoke-direct {v5, v0, v2, v3, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ye;->z:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/whatsapp/ye;->m:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move-object v0, v5

    goto/16 :goto_b

    .line 44
    :pswitch_0
    new-instance v5, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_24

    move v0, v1

    :goto_24
    iget-boolean v2, p0, Lcom/whatsapp/ye;->g:Z

    if-eqz v2, :cond_25

    iget v2, p0, Lcom/whatsapp/ye;->j:I

    :goto_25
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_26

    move v3, v4

    :goto_26
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-direct {v5, v0, v2, v3, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v5

    .line 26
    goto/16 :goto_b

    .line 44
    :cond_24
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_24

    :cond_25
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->m:I

    goto :goto_25

    :cond_26
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v3

    goto :goto_26

    .line 37
    :pswitch_1
    new-instance v3, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_27

    move v0, v1

    :goto_27
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_28

    move v2, v4

    :goto_28
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-direct {v3, v0, v11, v2, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v3

    .line 49
    goto/16 :goto_b

    .line 37
    :cond_27
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_27

    :cond_28
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v2

    goto :goto_28

    .line 117
    :pswitch_2
    new-instance v3, Landroid/graphics/Rect;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_29

    move v0, v1

    :goto_29
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_2a

    move v2, v4

    :goto_2a
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getHeight()I

    move-result v5

    sget-object v6, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v6, v6, Lcom/whatsapp/j4;->m:I

    sub-int/2addr v5, v6

    invoke-direct {v3, v0, v11, v2, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v0, v3

    .line 47
    goto/16 :goto_b

    .line 117
    :cond_29
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_29

    :cond_2a
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v2

    goto :goto_2a

    .line 54
    :cond_2b
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v0

    sub-int/2addr v0, v4

    goto/16 :goto_20

    :cond_2c
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->z:I

    goto/16 :goto_21

    :cond_2d
    sget-object v2, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->m:I

    goto/16 :goto_22

    :cond_2e
    invoke-virtual {p0}, Lcom/whatsapp/ye;->getWidth()I

    move-result v3

    goto/16 :goto_23

    .line 2
    :pswitch_3
    iget-object v2, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203b3

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto/16 :goto_c

    .line 107
    :pswitch_4
    iget-object v2, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203b1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto/16 :goto_c

    .line 123
    :pswitch_5
    iget-object v2, p0, Lcom/whatsapp/ye;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203b2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto/16 :goto_c

    .line 77
    :catch_1
    move-exception v2

    .line 3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ye;->z:[Ljava/lang/String;

    aget-object v6, v6, v8

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move-object v2, v3

    .line 64
    invoke-static {}, Lcom/whatsapp/j5;->c()V

    goto/16 :goto_c

    .line 52
    :cond_2f
    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->z:I

    goto/16 :goto_e

    :cond_30
    sget-object v0, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->P:F

    goto/16 :goto_f

    .line 24
    :cond_31
    div-int/lit8 v0, v6, 0x2

    int-to-float v0, v0

    move v7, v0

    goto/16 :goto_10

    .line 76
    :cond_32
    int-to-float v0, v10

    sub-float v1, v0, v7

    goto/16 :goto_11

    :cond_33
    int-to-float v0, v10

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->Q:F

    sub-float v3, v0, v3

    goto/16 :goto_12

    .line 62
    :cond_34
    int-to-float v0, v10

    sub-float v1, v0, v7

    goto/16 :goto_13

    :cond_35
    int-to-float v0, v10

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->Q:F

    sub-float v3, v0, v3

    goto/16 :goto_14

    .line 119
    :cond_36
    int-to-float v1, v10

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->Q:F

    sub-float/2addr v1, v3

    sub-float v4, v1, v0

    goto/16 :goto_15

    :cond_37
    int-to-float v0, v10

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->Q:F

    sub-float v6, v0, v1

    goto/16 :goto_16

    .line 136
    :cond_38
    iget v0, p0, Lcom/whatsapp/ye;->h:I

    sub-int v0, v10, v0

    int-to-float v0, v0

    sget-object v1, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->U:F

    sub-float v1, v0, v1

    goto/16 :goto_17

    :cond_39
    int-to-float v0, v10

    sget-object v3, Lcom/whatsapp/ye;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->T:F

    sub-float v3, v0, v3

    goto/16 :goto_18

    :cond_3a
    move v2, v1

    goto/16 :goto_5

    :cond_3b
    move v4, v2

    goto/16 :goto_6

    :cond_3c
    move v6, v1

    goto/16 :goto_d

    .line 7
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 98
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
