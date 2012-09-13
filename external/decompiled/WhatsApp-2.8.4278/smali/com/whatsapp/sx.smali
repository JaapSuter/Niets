.class Lcom/whatsapp/sx;
.super Ljava/lang/Object;
.source "sx.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/je;


# direct methods
.method constructor <init>(Lcom/whatsapp/je;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9
    .parameter

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 5
    const v0, 0x7f0d0145

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 12
    invoke-virtual {v0}, Landroid/widget/CheckBox;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/zq;

    .line 11
    iget-object v3, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 22
    :cond_0
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-boolean v3, v1, Lcom/whatsapp/zq;->l:Z

    .line 7
    if-eqz v3, :cond_2

    .line 20
    invoke-virtual {v0, v7}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 17
    iput-boolean v7, v1, Lcom/whatsapp/zq;->l:Z

    .line 18
    iget-object v3, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v3, v3, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v4, v3, Lcom/whatsapp/MultipleContactPicker;->A:I

    add-int/lit8 v4, v4, -0x1

    iput v4, v3, Lcom/whatsapp/MultipleContactPicker;->A:I

    if-eqz v2, :cond_4

    .line 8
    :cond_2
    iget-object v3, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v3, v3, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v3, v3, Lcom/whatsapp/MultipleContactPicker;->A:I

    iget-object v4, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-static {v4}, Lcom/whatsapp/MultipleContactPicker;->d(Lcom/whatsapp/MultipleContactPicker;)I

    move-result v4

    if-ne v3, v4, :cond_3

    .line 4
    iget-object v3, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v3, v3, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v4, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v5, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v5, v5, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v5, v5, Lcom/whatsapp/MultipleContactPicker;->l:I

    invoke-virtual {v4, v5}, Lcom/whatsapp/MultipleContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v8, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v6, v6, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-static {v6}, Lcom/whatsapp/MultipleContactPicker;->d(Lcom/whatsapp/MultipleContactPicker;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/whatsapp/MultipleContactPicker;->c(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0, v7}, Landroid/widget/CheckBox;->setChecked(Z)V

    if-eqz v2, :cond_4

    .line 21
    :cond_3
    iget-object v3, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v3, v3, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v4, v3, Lcom/whatsapp/MultipleContactPicker;->A:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v3, Lcom/whatsapp/MultipleContactPicker;->A:I

    .line 14
    invoke-virtual {v0, v8}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 6
    iput-boolean v8, v1, Lcom/whatsapp/zq;->l:Z

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v1, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v1, v1, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-static {v1}, Lcom/whatsapp/MultipleContactPicker;->e(Lcom/whatsapp/MultipleContactPicker;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v3, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v3, v3, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v3, v3, Lcom/whatsapp/MultipleContactPicker;->A:I

    invoke-static {v0, v1, v3}, Lcom/whatsapp/MultipleContactPicker;->a(Lcom/whatsapp/MultipleContactPicker;Landroid/widget/TextView;I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v0, v0, Lcom/whatsapp/MultipleContactPicker;->A:I

    if-eqz v0, :cond_5

    .line 13
    iget-object v0, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v0, v0, Lcom/whatsapp/MultipleContactPicker;->z:Landroid/widget/Button;

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setEnabled(Z)V

    if-eqz v2, :cond_0

    .line 10
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/sx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v0, v0, Lcom/whatsapp/MultipleContactPicker;->z:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setEnabled(Z)V

    goto/16 :goto_0
.end method
