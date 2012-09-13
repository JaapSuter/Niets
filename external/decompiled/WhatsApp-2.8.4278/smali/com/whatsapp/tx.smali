.class public abstract Lcom/whatsapp/tx;
.super Ljava/lang/Object;
.source "tx.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/whatsapp/tx;
    .locals 2
    .parameter

    .prologue
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_0

    .line 5
    new-instance v0, Lcom/whatsapp/wx;

    invoke-direct {v0, p0}, Lcom/whatsapp/wx;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lcom/whatsapp/vx;

    invoke-direct {v0, p0}, Lcom/whatsapp/vx;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 1
    :cond_1
    new-instance v0, Lcom/whatsapp/ux;

    invoke-direct {v0, p0}, Lcom/whatsapp/ux;-><init>(Landroid/content/Context;)V

    goto :goto_0
.end method


# virtual methods
.method public abstract a()Landroid/app/Notification;
.end method

.method public abstract a(I)Lcom/whatsapp/tx;
.end method

.method public abstract a(III)Lcom/whatsapp/tx;
.end method

.method public abstract a(J)Lcom/whatsapp/tx;
.end method

.method public abstract a(Landroid/app/PendingIntent;)Lcom/whatsapp/tx;
.end method

.method public abstract a(Landroid/graphics/Bitmap;)Lcom/whatsapp/tx;
.end method

.method public abstract a(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
.end method

.method public abstract a([J)Lcom/whatsapp/tx;
.end method

.method public abstract b(I)Lcom/whatsapp/tx;
.end method

.method public abstract b(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
.end method

.method public abstract c(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
.end method
