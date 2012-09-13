.class Lcom/whatsapp/gd;
.super Landroid/os/Handler;
.source "gd.java"


# instance fields
.field final a:Lcom/google/android/maps/MapView;

.field final b:Lcom/whatsapp/hf;


# direct methods
.method constructor <init>(Lcom/whatsapp/hf;Lcom/google/android/maps/MapView;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    iput-object p2, p0, Lcom/whatsapp/gd;->a:Lcom/google/android/maps/MapView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    invoke-static {v0}, Lcom/whatsapp/hf;->a(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    invoke-static {v1}, Lcom/whatsapp/hf;->b(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    iget-object v1, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    invoke-static {v1}, Lcom/whatsapp/hf;->c(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/hf;->a(Lcom/whatsapp/hf;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    iget-object v1, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    invoke-static {v1}, Lcom/whatsapp/hf;->b(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/hf;->a(Lcom/whatsapp/hf;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/gd;->a:Lcom/google/android/maps/MapView;

    iget-object v1, p0, Lcom/whatsapp/gd;->b:Lcom/whatsapp/hf;

    invoke-static {v1}, Lcom/whatsapp/hf;->a(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapView;->invalidate(Landroid/graphics/Rect;)V

    .line 2
    const/4 v0, 0x0

    const-wide/16 v1, 0x1f4

    invoke-virtual {p0, v0, v1, v2}, Lcom/whatsapp/gd;->sendEmptyMessageDelayed(IJ)Z

    .line 7
    return-void
.end method
