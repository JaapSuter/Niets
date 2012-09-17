.class public Lcom/whatsapp/MediaGalleryImageView;
.super Landroid/widget/ImageView;
.source "MediaGalleryImageView.java"


# static fields
.field private static focusPaint:Landroid/graphics/Paint;

.field static lock:Ljava/lang/Object;

.field private static normalPaint:Landroid/graphics/Paint;

.field public static taskList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/tw;",
            ">;"
        }
    .end annotation
.end field

.field static tempBitmaps:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/whatsapp/uz;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field debug:Z

.field position:I

.field private final viewDrawingRect:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/whatsapp/MediaGalleryImageView;->taskList:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/whatsapp/MediaGalleryImageView;->lock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 5
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/MediaGalleryImageView;->debug:Z

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MediaGalleryImageView;->viewDrawingRect:Landroid/graphics/Rect;

    .line 17
    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    .line 37
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    if-nez v1, :cond_0

    .line 35
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    sput-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    .line 8
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    const v2, -0x660f8000

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/whatsapp/j4;->Z:I

    mul-int/lit8 v2, v2, 0x3

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 31
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 38
    :cond_0
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    if-nez v1, :cond_1

    .line 23
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    sput-object v1, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    .line 24
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    const/high16 v2, 0x7d00

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    iget v0, v0, Lcom/whatsapp/j4;->Z:I

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    :cond_1
    return-void
.end method

.method public static a()V
    .locals 4

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 36
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    .line 2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 27
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->clear()V

    .line 12
    :cond_1
    if-eqz v2, :cond_0

    .line 1
    :cond_2
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;ILandroid/net/Uri;I)V
    .locals 8
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 11
    sget-object v6, Lcom/whatsapp/MediaGalleryImageView;->lock:Ljava/lang/Object;

    monitor-enter v6

    .line 15
    :try_start_0
    sget-object v7, Lcom/whatsapp/MediaGalleryImageView;->taskList:Ljava/util/ArrayList;

    new-instance v0, Lcom/whatsapp/tw;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/tw;-><init>(Lcom/whatsapp/MediaGalleryImageView;Lcom/whatsapp/sz;ILandroid/net/Uri;I)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    monitor-exit v6

    .line 25
    return-void

    .line 20
    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .parameter

    .prologue
    .line 28
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 14
    iget-object v0, p0, Lcom/whatsapp/MediaGalleryImageView;->viewDrawingRect:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaGalleryImageView;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 9
    invoke-virtual {p0}, Lcom/whatsapp/MediaGalleryImageView;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/whatsapp/MediaGalleryImageView;->viewDrawingRect:Landroid/graphics/Rect;

    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->focusPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/MediaGalleryImageView;->viewDrawingRect:Landroid/graphics/Rect;

    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->normalPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 34
    :cond_1
    return-void
.end method
