.class Lcom/whatsapp/wallpaper/f;
.super Ljava/lang/Object;
.source "f.java"


# instance fields
.field a:Landroid/view/View;

.field b:Z

.field private c:Lcom/whatsapp/wallpaper/c;

.field d:Landroid/graphics/Rect;

.field private e:Landroid/graphics/RectF;

.field f:Landroid/graphics/RectF;

.field g:Landroid/graphics/Matrix;

.field private h:Z

.field private i:F

.field private j:Z

.field private k:I

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:Landroid/graphics/drawable/Drawable;

.field private final n:Landroid/graphics/Paint;

.field private final o:Landroid/graphics/Paint;

.field private final p:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    sget-object v0, Lcom/whatsapp/wallpaper/c;->a:Lcom/whatsapp/wallpaper/c;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->c:Lcom/whatsapp/wallpaper/c;

    .line 59
    iput-boolean v1, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    .line 110
    iput-boolean v1, p0, Lcom/whatsapp/wallpaper/f;->j:Z

    .line 187
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->n:Landroid/graphics/Paint;

    .line 108
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->o:Landroid/graphics/Paint;

    .line 73
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    .line 6
    iput-object p1, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    .line 176
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 40
    const v1, 0x7f020038

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    .line 121
    const v1, 0x7f020037

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    .line 112
    return-void
.end method

.method private d()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 10
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 4
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->g:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 7
    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method


# virtual methods
.method public a(FF)I
    .locals 13
    .parameter
    .parameter

    .prologue
    const/16 v4, 0x20

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v1, 0x1

    const/high16 v11, 0x41a0

    sget-boolean v2, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 162
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->d()Landroid/graphics/Rect;

    move-result-object v5

    .line 44
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/f;->j:Z

    if-eqz v0, :cond_e

    .line 1
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    sub-float v6, p1, v0

    .line 133
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p2, v0

    .line 70
    mul-float v7, v6, v6

    mul-float v8, v0, v0

    add-float/2addr v7, v8

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    double-to-int v7, v7

    .line 90
    iget-object v8, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    .line 83
    sub-int v9, v7, v8

    .line 81
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    int-to-float v9, v9

    cmpg-float v9, v9, v11

    if-gtz v9, :cond_3

    .line 135
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v9

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpl-float v9, v9, v10

    if-lez v9, :cond_1

    .line 82
    cmpg-float v0, v0, v12

    if-gez v0, :cond_0

    .line 168
    const/16 v0, 0x8

    if-eqz v2, :cond_5

    .line 97
    :cond_0
    const/16 v0, 0x10

    if-eqz v2, :cond_5

    .line 159
    :cond_1
    cmpg-float v0, v6, v12

    if-gez v0, :cond_2

    .line 28
    const/4 v0, 0x2

    if-eqz v2, :cond_5

    .line 74
    :cond_2
    const/4 v0, 0x4

    if-eqz v2, :cond_5

    .line 46
    :cond_3
    if-ge v7, v8, :cond_4

    .line 170
    if-eqz v2, :cond_d

    :cond_4
    move v0, v1

    .line 69
    :cond_5
    :goto_0
    if-eqz v2, :cond_b

    .line 11
    :goto_1
    iget v2, v5, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    sub-float/2addr v2, v11

    cmpl-float v2, p2, v2

    if-ltz v2, :cond_c

    iget v2, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    add-float/2addr v2, v11

    cmpg-float v2, p2, v2

    if-gez v2, :cond_c

    move v2, v1

    .line 123
    :goto_2
    iget v6, v5, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    sub-float/2addr v6, v11

    cmpl-float v6, p1, v6

    if-ltz v6, :cond_6

    iget v6, v5, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    add-float/2addr v6, v11

    cmpg-float v6, p1, v6

    if-gez v6, :cond_6

    move v3, v1

    .line 136
    :cond_6
    iget v6, v5, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    sub-float/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v11

    if-gez v6, :cond_7

    if-eqz v2, :cond_7

    .line 154
    or-int/lit8 v0, v0, 0x2

    .line 32
    :cond_7
    iget v6, v5, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    sub-float/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v11

    if-gez v6, :cond_8

    if-eqz v2, :cond_8

    .line 58
    or-int/lit8 v0, v0, 0x4

    .line 35
    :cond_8
    iget v2, v5, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v11

    if-gez v2, :cond_9

    if-eqz v3, :cond_9

    .line 138
    or-int/lit8 v0, v0, 0x8

    .line 47
    :cond_9
    iget v2, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v11

    if-gez v2, :cond_a

    if-eqz v3, :cond_a

    .line 19
    or-int/lit8 v0, v0, 0x10

    .line 174
    :cond_a
    if-ne v0, v1, :cond_b

    float-to-int v1, p1

    float-to-int v2, p2

    invoke-virtual {v5, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-eqz v1, :cond_b

    move v0, v4

    .line 115
    :cond_b
    return v0

    :cond_c
    move v2, v3

    .line 11
    goto :goto_2

    :cond_d
    move v0, v4

    goto :goto_0

    :cond_e
    move v0, v1

    goto :goto_1
.end method

.method a(IFF)V
    .locals 7
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 99
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->d()Landroid/graphics/Rect;

    move-result-object v3

    .line 139
    if-ne p1, v2, :cond_1

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 42
    :cond_1
    const/16 v4, 0x20

    if-ne p1, v4, :cond_3

    .line 31
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 156
    invoke-virtual {v4, p2, p3}, Landroid/graphics/RectF;->offset(FF)V

    .line 191
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    iget-object v6, p0, Lcom/whatsapp/wallpaper/f;->g:Landroid/graphics/Matrix;

    invoke-virtual {v6, v5}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 39
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 98
    :cond_2
    iget v5, v4, Landroid/graphics/RectF;->left:F

    iget-object v6, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->left:F

    sub-float/2addr v5, v6

    iget v4, v4, Landroid/graphics/RectF;->top:F

    iget-object v6, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v6

    invoke-virtual {p0, v5, v4}, Lcom/whatsapp/wallpaper/f;->b(FF)V

    .line 182
    sget-boolean v4, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    if-eqz v4, :cond_0

    .line 192
    :cond_3
    and-int/lit8 v4, p1, 0x6

    if-nez v4, :cond_4

    move p2, v0

    .line 163
    :cond_4
    and-int/lit8 v4, p1, 0x18

    if-nez v4, :cond_5

    move p3, v0

    .line 51
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    mul-float v4, p2, v0

    .line 147
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    mul-float v3, p3, v0

    .line 130
    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_6

    move v0, v1

    :goto_1
    int-to-float v0, v0

    mul-float/2addr v4, v0

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_7

    move v0, v1

    :goto_2
    int-to-float v0, v0

    mul-float/2addr v0, v3

    invoke-virtual {p0, v4, v0}, Lcom/whatsapp/wallpaper/f;->c(FF)V

    goto :goto_0

    :cond_6
    move v0, v2

    goto :goto_1

    :cond_7
    move v0, v2

    goto :goto_2
.end method

.method protected a(Landroid/graphics/Canvas;)V
    .locals 14
    .parameter

    .prologue
    const/high16 v7, 0x4000

    sget-boolean v1, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 169
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 173
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 94
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/f;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    const v3, -0xff0100

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 153
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 140
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 27
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/f;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->n:Landroid/graphics/Paint;

    :goto_0
    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 15
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 56
    if-eqz v1, :cond_3

    .line 12
    :cond_0
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 157
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 114
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/f;->j:Z

    if-eqz v0, :cond_1

    .line 78
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    .line 183
    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    .line 55
    iget-object v5, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    div-float v6, v0, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    div-float/2addr v4, v7

    add-float/2addr v4, v6

    div-float/2addr v0, v7

    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v2, v5, v4, v0, v6}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 186
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    const v4, -0x10fb2a

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 167
    if-eqz v1, :cond_2

    .line 43
    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 103
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    const/16 v1, -0x7600

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    :cond_2
    :try_start_0
    sget-object v0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 87
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/f;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->n:Landroid/graphics/Paint;

    :goto_1
    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 36
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 89
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->c:Lcom/whatsapp/wallpaper/c;

    sget-object v1, Lcom/whatsapp/wallpaper/c;->c:Lcom/whatsapp/wallpaper/c;

    if-ne v0, v1, :cond_3

    .line 18
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    add-int/lit8 v0, v0, 0x1

    .line 189
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/lit8 v1, v1, 0x1

    .line 29
    iget-object v2, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/lit8 v2, v2, 0x4

    .line 22
    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v3, v3, 0x3

    .line 75
    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    .line 155
    iget-object v5, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    .line 23
    iget-object v6, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    .line 68
    iget-object v7, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    .line 129
    iget-object v8, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    iget-object v9, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->right:I

    iget-object v10, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->left:I

    sub-int/2addr v9, v10

    div-int/lit8 v9, v9, 0x2

    add-int/2addr v8, v9

    .line 8
    iget-object v9, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    iget-object v10, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    iget-object v11, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    iget v11, v11, Landroid/graphics/Rect;->top:I

    sub-int/2addr v10, v11

    div-int/lit8 v10, v10, 0x2

    add-int/2addr v9, v10

    .line 194
    iget-object v10, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    sub-int v11, v0, v4

    sub-int v12, v9, v5

    add-int/2addr v0, v4

    add-int v13, v9, v5

    invoke-virtual {v10, v11, v12, v0, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 61
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    sub-int v10, v1, v4

    sub-int v11, v9, v5

    add-int/2addr v1, v4

    add-int v4, v9, v5

    invoke-virtual {v0, v10, v11, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 122
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 85
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    sub-int v1, v8, v7

    sub-int v4, v2, v6

    add-int v5, v8, v7

    add-int/2addr v2, v6

    invoke-virtual {v0, v1, v4, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 71
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    sub-int v1, v8, v7

    sub-int v2, v3, v6

    add-int v4, v8, v7

    add-int/2addr v3, v6

    invoke-virtual {v0, v1, v2, v4, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 65
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 141
    :cond_3
    return-void

    .line 27
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->o:Landroid/graphics/Paint;

    goto/16 :goto_0

    .line 87
    :cond_5
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->o:Landroid/graphics/Paint;
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    .line 91
    :catch_0
    move-exception v0

    goto/16 :goto_2
.end method

.method public a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZZI)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v5, 0x32

    const/4 v0, 0x1

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 53
    if-eqz p4, :cond_0

    move p5, v0

    .line 96
    :cond_0
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v1, p0, Lcom/whatsapp/wallpaper/f;->g:Landroid/graphics/Matrix;

    .line 5
    iput-object p3, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    .line 63
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, p2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iput-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    .line 64
    if-nez p5, :cond_1

    if-eqz p6, :cond_3

    :cond_1
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    .line 92
    iput-boolean p4, p0, Lcom/whatsapp/wallpaper/f;->j:Z

    .line 50
    iput p7, p0, Lcom/whatsapp/wallpaper/f;->k:I

    .line 128
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v1, v4

    iput v1, p0, Lcom/whatsapp/wallpaper/f;->i:F

    .line 180
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->d()Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    .line 151
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->n:Landroid/graphics/Paint;

    const/16 v4, 0x7d

    invoke-virtual {v1, v4, v5, v5, v5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 164
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 34
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    const/high16 v4, 0x4040

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 102
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 111
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 116
    sget-object v1, Lcom/whatsapp/wallpaper/c;->a:Lcom/whatsapp/wallpaper/c;

    iput-object v1, p0, Lcom/whatsapp/wallpaper/f;->c:Lcom/whatsapp/wallpaper/c;

    .line 3
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->a()V

    .line 113
    sget v1, Lcom/whatsapp/App;->wc:I

    if-eqz v1, :cond_2

    if-eqz v3, :cond_4

    :goto_1
    sput-boolean v2, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    :cond_2
    return-void

    :cond_3
    move v1, v2

    .line 64
    goto :goto_0

    :cond_4
    move v2, v0

    .line 113
    goto :goto_1
.end method

.method public a(Lcom/whatsapp/wallpaper/c;)V
    .locals 1
    .parameter

    .prologue
    .line 26
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->c:Lcom/whatsapp/wallpaper/c;

    if-eq p1, v0, :cond_0

    .line 190
    iput-object p1, p0, Lcom/whatsapp/wallpaper/f;->c:Lcom/whatsapp/wallpaper/c;

    .line 76
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 150
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0
    .parameter

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/whatsapp/wallpaper/f;->b:Z

    .line 179
    return-void
.end method

.method b(FF)V
    .locals 7
    .parameter
    .parameter

    .prologue
    const/16 v6, -0xa

    const/4 v5, 0x0

    .line 14
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    invoke-direct {v0, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 37
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 165
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v3

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 21
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v3

    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 166
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->d()Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    .line 45
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 38
    invoke-virtual {v0, v6, v6}, Landroid/graphics/Rect;->inset(II)V

    .line 54
    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 181
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 17
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/f;->b:Z

    return v0
.end method

.method public c()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 88
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget-object v2, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    float-to-int v2, v2

    iget-object v3, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    float-to-int v3, v3

    iget-object v4, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method c(FF)V
    .locals 9
    .parameter
    .parameter

    .prologue
    const/high16 v2, 0x41c8

    const/high16 v8, 0x4000

    const/4 v7, 0x0

    sget-boolean v3, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 13
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    if-eqz v0, :cond_1

    .line 119
    cmpl-float v0, p1, v7

    if-eqz v0, :cond_0

    .line 16
    iget v0, p0, Lcom/whatsapp/wallpaper/f;->i:F

    div-float p2, p1, v0

    if-eqz v3, :cond_1

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    .line 143
    :cond_0
    cmpl-float v0, p2, v7

    if-eqz v0, :cond_1

    .line 175
    iget v0, p0, Lcom/whatsapp/wallpaper/f;->i:F

    mul-float p1, p2, v0

    .line 84
    :cond_1
    new-instance v4, Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-direct {v4, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 193
    cmpl-float v0, p1, v7

    if-lez v0, :cond_e

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v0

    mul-float v1, v8, p1

    add-float/2addr v0, v1

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_e

    .line 185
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v1

    sub-float/2addr v0, v1

    div-float p1, v0, v8

    .line 117
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    if-eqz v0, :cond_e

    .line 145
    iget v0, p0, Lcom/whatsapp/wallpaper/f;->i:F

    div-float p2, p1, v0

    move v0, p2

    move v1, p1

    .line 86
    :goto_0
    cmpl-float v5, v0, v7

    if-lez v5, :cond_2

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v5

    mul-float v6, v8, v0

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    cmpl-float v5, v5, v6

    if-lez v5, :cond_2

    .line 131
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v5

    sub-float/2addr v0, v5

    div-float/2addr v0, v8

    .line 105
    iget-boolean v5, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    if-eqz v5, :cond_2

    .line 126
    iget v1, p0, Lcom/whatsapp/wallpaper/f;->i:F

    mul-float/2addr v1, v0

    .line 142
    :cond_2
    iget v5, p0, Lcom/whatsapp/wallpaper/f;->k:I

    if-lez v5, :cond_6

    .line 109
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v5

    mul-float v6, v8, v1

    add-float/2addr v5, v6

    iget v6, p0, Lcom/whatsapp/wallpaper/f;->k:I

    int-to-float v6, v6

    cmpg-float v5, v5, v6

    if-gez v5, :cond_3

    .line 184
    iget v1, p0, Lcom/whatsapp/wallpaper/f;->k:I

    int-to-float v1, v1

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v5

    sub-float/2addr v1, v5

    div-float/2addr v1, v8

    .line 2
    :cond_3
    iget-boolean v5, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    if-eqz v5, :cond_4

    .line 146
    iget v0, p0, Lcom/whatsapp/wallpaper/f;->i:F

    div-float v0, v1, v0

    .line 118
    :cond_4
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v5

    mul-float v6, v8, v0

    add-float/2addr v5, v6

    iget v6, p0, Lcom/whatsapp/wallpaper/f;->k:I

    int-to-float v6, v6

    cmpg-float v5, v5, v6

    if-gez v5, :cond_5

    .line 20
    iget v0, p0, Lcom/whatsapp/wallpaper/f;->k:I

    int-to-float v0, v0

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v5

    sub-float/2addr v0, v5

    div-float/2addr v0, v8

    .line 80
    :cond_5
    iget-boolean v5, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    if-eqz v5, :cond_6

    .line 148
    iget v1, p0, Lcom/whatsapp/wallpaper/f;->i:F

    mul-float/2addr v1, v0

    .line 134
    :cond_6
    neg-float v1, v1

    neg-float v0, v0

    invoke-virtual {v4, v1, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 125
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_7

    .line 158
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v0

    sub-float v0, v2, v0

    neg-float v0, v0

    div-float/2addr v0, v8

    invoke-virtual {v4, v0, v7}, Landroid/graphics/RectF;->inset(FF)V

    .line 178
    :cond_7
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/f;->h:Z

    if-eqz v0, :cond_d

    iget v0, p0, Lcom/whatsapp/wallpaper/f;->i:F

    div-float v0, v2, v0

    .line 9
    :goto_1
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v1, v1, v0

    if-gez v1, :cond_8

    .line 104
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v1

    sub-float/2addr v0, v1

    neg-float v0, v0

    div-float/2addr v0, v8

    invoke-virtual {v4, v7, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 100
    :cond_8
    iget v0, v4, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 33
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget v1, v4, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    invoke-virtual {v4, v0, v7}, Landroid/graphics/RectF;->offset(FF)V

    if-eqz v3, :cond_a

    .line 137
    :cond_9
    iget v0, v4, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    .line 120
    iget v0, v4, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    neg-float v0, v0

    invoke-virtual {v4, v0, v7}, Landroid/graphics/RectF;->offset(FF)V

    .line 93
    :cond_a
    iget v0, v4, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_b

    .line 144
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget v1, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v1

    invoke-virtual {v4, v7, v0}, Landroid/graphics/RectF;->offset(FF)V

    if-eqz v3, :cond_c

    .line 124
    :cond_b
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_c

    .line 79
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/whatsapp/wallpaper/f;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    neg-float v0, v0

    invoke-virtual {v4, v7, v0}, Landroid/graphics/RectF;->offset(FF)V

    .line 95
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v0, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 60
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->d()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    .line 172
    iget-object v0, p0, Lcom/whatsapp/wallpaper/f;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 101
    return-void

    :cond_d
    move v0, v2

    .line 178
    goto :goto_1

    :cond_e
    move v0, p2

    move v1, p1

    goto/16 :goto_0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/f;->d()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    .line 107
    return-void
.end method
