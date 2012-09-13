.class Lcom/whatsapp/ry;
.super Ljava/lang/Object;
.source "ry.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    .line 2
    sget-object v0, Lcom/whatsapp/App;->oc:Landroid/media/AsyncPlayer;

    invoke-virtual {v0}, Landroid/media/AsyncPlayer;->stop()V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->c(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/sz;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->g(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/ConversationTextEntry;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/ConversationTextEntry;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v2}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 7
    sget-object v2, Lcom/whatsapp/Conversation;->m:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v3}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v3

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-virtual {v1, v0}, Lcom/whatsapp/PopupNotification;->startActivity(Landroid/content/Intent;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ry;->a:Lcom/whatsapp/PopupNotification;

    invoke-virtual {v0}, Lcom/whatsapp/PopupNotification;->finish()V

    .line 5
    return-void
.end method
