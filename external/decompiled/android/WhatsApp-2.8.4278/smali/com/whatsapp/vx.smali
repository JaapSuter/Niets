.class public Lcom/whatsapp/vx;
.super Lcom/whatsapp/tx;
.source "vx.java"


# instance fields
.field private a:Landroid/app/Notification$Builder;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/whatsapp/tx;-><init>()V

    .line 15
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Landroid/app/Notification;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 22
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 1
    return-object p0
.end method

.method public a(III)Lcom/whatsapp/tx;
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 24
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 5
    return-object p0
.end method

.method public a(J)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 20
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1, p2}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 4
    return-object p0
.end method

.method public a(Landroid/app/PendingIntent;)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 16
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 2
    return-object p0
.end method

.method public a(Landroid/graphics/Bitmap;)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 21
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 12
    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 10
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 14
    return-object p0
.end method

.method public a([J)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 13
    return-object p0
.end method

.method public b(I)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 9
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 8
    return-object p0
.end method

.method public b(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 11
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 17
    return-object p0
.end method

.method public c(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
    .locals 1
    .parameter

    .prologue
    .line 19
    iget-object v0, p0, Lcom/whatsapp/vx;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 6
    return-object p0
.end method
