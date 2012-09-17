.class Lcom/whatsapp/si;
.super Ljava/lang/Object;
.source "si.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 10
    iput-object p1, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter

    .prologue
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 12
    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-static {v1, v0}, Lcom/whatsapp/v4;->b(II)C

    move-result v2

    .line 3
    iget-object v0, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 17
    iget-object v1, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v1, v1, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    .line 16
    if-le v0, v1, :cond_1

    .line 2
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v4, v4, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1
    invoke-static {v2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1, v0, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    iget-object v0, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-boolean v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->p:Z

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/si;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->d(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 6
    :cond_0
    return-void

    :cond_1
    move v5, v1

    move v1, v0

    move v0, v5

    goto :goto_0
.end method
