.class Lcom/whatsapp/ti;
.super Ljava/lang/Object;
.source "ti.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    .line 1
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 8
    monitor-enter v1

    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_0

    sget-object v2, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    if-eqz v2, :cond_2

    :cond_0
    iget-object v2, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/whatsapp/BroadcastMessageComposer;->a(Lcom/whatsapp/BroadcastMessageComposer;Z)Z

    move-result v2

    if-nez v2, :cond_2

    .line 12
    iget-object v2, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v2, v2, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Landroid/text/method/TextKeyListener;->clear(Landroid/text/Editable;)V

    .line 2
    iget-object v2, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v2, v2, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v2, v2, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v2, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/whatsapp/BroadcastMessageComposer;->showDialog(I)V

    .line 11
    new-instance v2, Lcom/whatsapp/x;

    iget-object v3, p0, Lcom/whatsapp/ti;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {v2, v3, v0}, Lcom/whatsapp/x;-><init>(Lcom/whatsapp/BroadcastMessageComposer;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Lcom/whatsapp/x;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 13
    :cond_2
    monitor-exit v1

    .line 3
    return-void

    .line 13
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
