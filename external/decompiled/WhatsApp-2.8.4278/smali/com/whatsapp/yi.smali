.class Lcom/whatsapp/yi;
.super Ljava/lang/Object;
.source "yi.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 6
    iget-object v0, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->b(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->c(Lcom/whatsapp/BroadcastMessageComposer;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->d(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/yi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iput-boolean v3, v0, Lcom/whatsapp/BroadcastMessageComposer;->p:Z

    .line 3
    :cond_1
    return-void
.end method
