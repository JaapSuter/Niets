.class Lcom/whatsapp/kd;
.super Landroid/os/Handler;
.source "kd.java"


# instance fields
.field final a:Lcom/whatsapp/MediaView;


# direct methods
.method constructor <init>(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/kd;->a:Lcom/whatsapp/MediaView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/kd;->a:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/kd;->a:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->e()V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/kd;->a:Lcom/whatsapp/MediaView;

    iget-object v1, p0, Lcom/whatsapp/kd;->a:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/kd;->a:Lcom/whatsapp/MediaView;

    invoke-static {v2}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V

    .line 5
    :cond_0
    return-void
.end method
