.class public Lcom/whatsapp/EditStatus;
.super Landroid/app/Activity;
.source "EditStatus.java"


# static fields
.field static b:Ljava/lang/CharSequence;


# instance fields
.field a:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .parameter

    .prologue
    .line 8
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 7
    const v0, 0x7f030031

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditStatus;->setContentView(I)V

    .line 2
    const v0, 0x7f0d00ff

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    .line 9
    iget-object v0, p0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    new-instance v1, Lcom/whatsapp/bs;

    invoke-direct {v1, p0}, Lcom/whatsapp/bs;-><init>(Lcom/whatsapp/EditStatus;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 5
    sget-object v0, Lcom/whatsapp/EditStatus;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/EditStatus;->a:Landroid/widget/EditText;

    sget-object v1, Lcom/whatsapp/EditStatus;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 6
    :cond_0
    const v0, 0x7f0d00ee

    invoke-virtual {p0, v0}, Lcom/whatsapp/EditStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 10
    new-instance v1, Lcom/whatsapp/cs;

    invoke-direct {v1, p0}, Lcom/whatsapp/cs;-><init>(Lcom/whatsapp/EditStatus;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1
    return-void
.end method
