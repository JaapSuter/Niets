.class Lcom/whatsapp/bs;
.super Ljava/lang/Object;
.source "bs.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final a:Lcom/whatsapp/EditStatus;


# direct methods
.method constructor <init>(Lcom/whatsapp/EditStatus;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/bs;->a:Lcom/whatsapp/EditStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/bs;->a:Lcom/whatsapp/EditStatus;

    iget-object v0, v0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/whatsapp/bs;->a:Lcom/whatsapp/EditStatus;

    iget-object v0, v0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 4
    :cond_0
    return-void
.end method
