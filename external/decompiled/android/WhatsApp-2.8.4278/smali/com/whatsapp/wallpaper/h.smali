.class Lcom/whatsapp/wallpaper/h;
.super Ljava/lang/Object;
.source "h.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:F

.field final b:J

.field final c:F

.field final d:F

.field final e:F

.field final f:F

.field final g:Lcom/whatsapp/wallpaper/ImageViewTouchBase;


# direct methods
.method constructor <init>(Lcom/whatsapp/wallpaper/ImageViewTouchBase;FJFFFF)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/wallpaper/h;->g:Lcom/whatsapp/wallpaper/ImageViewTouchBase;

    iput p2, p0, Lcom/whatsapp/wallpaper/h;->a:F

    iput-wide p3, p0, Lcom/whatsapp/wallpaper/h;->b:J

    iput p5, p0, Lcom/whatsapp/wallpaper/h;->c:F

    iput p6, p0, Lcom/whatsapp/wallpaper/h;->d:F

    iput p7, p0, Lcom/whatsapp/wallpaper/h;->e:F

    iput p8, p0, Lcom/whatsapp/wallpaper/h;->f:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget v2, p0, Lcom/whatsapp/wallpaper/h;->a:F

    iget-wide v3, p0, Lcom/whatsapp/wallpaper/h;->b:J

    sub-long/2addr v0, v3

    long-to-float v0, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 7
    iget v1, p0, Lcom/whatsapp/wallpaper/h;->c:F

    iget v2, p0, Lcom/whatsapp/wallpaper/h;->d:F

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    .line 8
    iget-object v2, p0, Lcom/whatsapp/wallpaper/h;->g:Lcom/whatsapp/wallpaper/ImageViewTouchBase;

    iget v3, p0, Lcom/whatsapp/wallpaper/h;->e:F

    iget v4, p0, Lcom/whatsapp/wallpaper/h;->f:F

    invoke-virtual {v2, v1, v3, v4}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FFF)V

    .line 1
    iget v1, p0, Lcom/whatsapp/wallpaper/h;->a:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/wallpaper/h;->g:Lcom/whatsapp/wallpaper/ImageViewTouchBase;

    iget-object v0, v0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 5
    :cond_0
    return-void
.end method
