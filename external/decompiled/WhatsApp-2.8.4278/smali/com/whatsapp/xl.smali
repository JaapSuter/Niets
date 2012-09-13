.class Lcom/whatsapp/xl;
.super Ljava/lang/Object;
.source "xl.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 10
    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->removeDialog(I)V

    .line 2
    sget-object v0, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->u(Lcom/whatsapp/Conversation;)Lcom/whatsapp/sz;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->v(Lcom/whatsapp/Conversation;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->u(Lcom/whatsapp/Conversation;)Lcom/whatsapp/sz;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/Conversation;->l:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;Ljava/util/ArrayList;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->w(Lcom/whatsapp/Conversation;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->b(I)V

    .line 6
    invoke-static {}, Lcom/whatsapp/App;->n()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->w(Lcom/whatsapp/Conversation;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->b(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->u(Lcom/whatsapp/Conversation;)Lcom/whatsapp/sz;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/App;->e(Lcom/whatsapp/sz;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/xl;->a:Lcom/whatsapp/Conversation;

    const v1, 0x7f090101

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 7
    return-void
.end method
