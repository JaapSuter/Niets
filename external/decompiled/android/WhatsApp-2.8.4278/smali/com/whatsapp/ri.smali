.class Lcom/whatsapp/ri;
.super Ljava/lang/Object;
.source "ri.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ri;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2
    .parameter

    .prologue
    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/whatsapp/eg;->b(J)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ri;->a:Lcom/whatsapp/BroadcastMessageComposer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->removeDialog(I)V

    .line 4
    return-void
.end method
