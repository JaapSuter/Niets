.class Lcom/whatsapp/ud;
.super Landroid/os/Handler;
.source "ud.java"


# instance fields
.field final a:Lcom/whatsapp/TouchImageView;


# direct methods
.method constructor <init>(Lcom/whatsapp/TouchImageView;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/ud;->a:Lcom/whatsapp/TouchImageView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .parameter

    .prologue
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x2d

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/whatsapp/ud;->a:Lcom/whatsapp/TouchImageView;

    invoke-static {v2}, Lcom/whatsapp/TouchImageView;->b(Lcom/whatsapp/TouchImageView;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 5
    const/4 v0, 0x2

    sput v0, Lcom/whatsapp/TouchImageView;->m:I

    .line 4
    const/high16 v0, -0x4080

    sput v0, Lcom/whatsapp/TouchImageView;->n:F

    .line 2
    :cond_0
    return-void
.end method
