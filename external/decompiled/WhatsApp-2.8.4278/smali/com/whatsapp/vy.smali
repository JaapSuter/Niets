.class Lcom/whatsapp/vy;
.super Ljava/lang/Object;
.source "vy.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final a:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 8
    invoke-static {}, Lcom/whatsapp/App;->mb()V

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    const v3, 0x7f0d00af

    invoke-virtual {v2, v3}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 5
    :cond_0
    iget-object v3, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v3}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v3}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whatsapp/zq;->o()Z

    move-result v3

    if-nez v3, :cond_2

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 16
    iget-object v3, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v3}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v3

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v4, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    iget-object v5, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v5}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v5

    iget-object v5, v5, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/yy;->b(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v3, v4}, Lcom/whatsapp/App;->a(Ljava/lang/String;Z)V

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v3, :cond_2

    .line 1
    :cond_1
    iget-object v3, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v3}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v3

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v4, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    iget-object v5, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v5}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v5

    iget-object v5, v5, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/yy;->b(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v3, v4}, Lcom/whatsapp/App;->b(Ljava/lang/String;Z)V

    .line 13
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 11
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 14
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->g(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/ConversationTextEntry;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/vy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->g(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/ConversationTextEntry;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/ConversationTextEntry;->setGravity(I)V

    .line 9
    :cond_0
    return-void
.end method
