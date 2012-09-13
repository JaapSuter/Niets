.class Lcom/whatsapp/zi;
.super Ljava/lang/Object;
.source "zi.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/zi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    .line 2
    iget-object v0, p0, Lcom/whatsapp/zi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iput-boolean v4, v0, Lcom/whatsapp/BroadcastMessageComposer;->p:Z

    .line 5
    iget-object v0, p0, Lcom/whatsapp/zi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->b(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/zi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->c(Lcom/whatsapp/BroadcastMessageComposer;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4
    return v4
.end method
