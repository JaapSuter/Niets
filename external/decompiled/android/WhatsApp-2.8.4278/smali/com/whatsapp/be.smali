.class Lcom/whatsapp/be;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "be.java"


# instance fields
.field final a:Lcom/whatsapp/GalleryView;


# direct methods
.method constructor <init>(Lcom/whatsapp/GalleryView;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    const/high16 v5, 0x4348

    const/high16 v4, 0x42f0

    const/4 v2, 0x1

    .line 15
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x437a

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    move v0, v1

    .line 14
    :goto_0
    return v0

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v0, v3

    cmpl-float v0, v0, v4

    if-lez v0, :cond_1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v5

    if-lez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v0}, Lcom/whatsapp/GalleryView;->a(Lcom/whatsapp/GalleryView;)I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    iget-object v3, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v3}, Lcom/whatsapp/GalleryView;->b(Lcom/whatsapp/GalleryView;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->d:Z

    if-nez v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v0}, Lcom/whatsapp/GalleryView;->b(Lcom/whatsapp/GalleryView;)I

    move-result v0

    iget-object v3, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-virtual {v3}, Lcom/whatsapp/GalleryView;->getChildCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_2

    .line 10
    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    iget-object v3, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v3}, Lcom/whatsapp/GalleryView;->b(Lcom/whatsapp/GalleryView;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Lcom/whatsapp/GalleryView;->c(I)V

    move v0, v2

    .line 6
    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v0, v3

    cmpl-float v0, v0, v4

    if-lez v0, :cond_2

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v5

    if-lez v0, :cond_2

    .line 16
    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v0}, Lcom/whatsapp/GalleryView;->a(Lcom/whatsapp/GalleryView;)I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    iget-object v3, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v3}, Lcom/whatsapp/GalleryView;->b(Lcom/whatsapp/GalleryView;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->d:Z

    if-nez v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v0}, Lcom/whatsapp/GalleryView;->b(Lcom/whatsapp/GalleryView;)I

    move-result v0

    if-lez v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    iget-object v3, p0, Lcom/whatsapp/be;->a:Lcom/whatsapp/GalleryView;

    invoke-static {v3}, Lcom/whatsapp/GalleryView;->b(Lcom/whatsapp/GalleryView;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Lcom/whatsapp/GalleryView;->c(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v2

    .line 13
    goto/16 :goto_0

    .line 7
    :catch_0
    move-exception v0

    :cond_2
    move v0, v1

    .line 1
    goto/16 :goto_0
.end method
