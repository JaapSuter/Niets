.class public Lcom/whatsapp/About;
.super Lcom/whatsapp/DialogToastActivity;
.source "About.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    const/high16 v2, 0x7f0d

    .line 10
    invoke-virtual {p0}, Lcom/whatsapp/About;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 12
    const/high16 v0, 0x7f03

    invoke-virtual {p0, v0}, Lcom/whatsapp/About;->setContentView(I)V

    .line 6
    invoke-virtual {p0, v2}, Lcom/whatsapp/About;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f020013

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 8
    :cond_0
    const v0, 0x7f030001

    invoke-virtual {p0, v0}, Lcom/whatsapp/About;->setContentView(I)V

    .line 2
    invoke-virtual {p0, v2}, Lcom/whatsapp/About;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f020014

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 15
    :cond_1
    const v0, 0x7f0d0003

    invoke-virtual {p0, v0}, Lcom/whatsapp/About;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 11
    const v1, 0x7f0900b9

    invoke-virtual {p0, v1}, Lcom/whatsapp/About;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 17
    const v2, 0x7f090004

    invoke-virtual {p0, v2}, Lcom/whatsapp/About;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 13
    invoke-direct {p0}, Lcom/whatsapp/About;->a()V

    .line 16
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 3
    invoke-direct {p0}, Lcom/whatsapp/About;->a()V

    .line 4
    return-void
.end method
