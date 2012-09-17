.class Lcom/whatsapp/ur;
.super Ljava/lang/Object;
.source "ur.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method constructor <init>(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 11
    sput-boolean v3, Lcom/whatsapp/EditGroupSubject;->x:Z

    .line 14
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->p:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->r:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 13
    :cond_1
    sput-boolean v2, Lcom/whatsapp/EditGroupSubject;->x:Z

    .line 7
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->r:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V

    .line 15
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->p:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 2
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/ur;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0, p1}, Lcom/whatsapp/EditGroupSubject;->a(Lcom/whatsapp/EditGroupSubject;Ljava/lang/CharSequence;)V

    .line 1
    return-void
.end method
