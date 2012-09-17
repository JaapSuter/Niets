.class Lcom/whatsapp/js;
.super Ljava/lang/Object;
.source "js.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/b;


# direct methods
.method constructor <init>(Lcom/whatsapp/b;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->l:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 7
    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-static {v1, v0}, Lcom/whatsapp/v4;->b(II)C

    move-result v2

    .line 2
    iget-object v0, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 8
    iget-object v1, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v1, v1, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    .line 4
    if-le v0, v1, :cond_2

    .line 13
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v4, v4, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-static {v2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1, v0, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    iget-object v0, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget v0, v0, Lcom/whatsapp/b;->r:I

    if-lez v0, :cond_1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    iget-object v2, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget v2, v2, Lcom/whatsapp/b;->r:I

    if-le v0, v2, :cond_1

    .line 14
    :cond_0
    :goto_1
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/whatsapp/js;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_1

    :cond_2
    move v5, v1

    move v1, v0

    move v0, v5

    goto :goto_0
.end method
