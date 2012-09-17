.class Lcom/whatsapp/rx;
.super Ljava/lang/Object;
.source "rx.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/je;


# direct methods
.method constructor <init>(Lcom/whatsapp/je;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9
    .parameter

    .prologue
    const/4 v8, 0x1

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move-object v0, p1

    .line 19
    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 18
    iget-object v4, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 16
    :cond_0
    :goto_0
    return-void

    .line 13
    :cond_1
    if-eqz v1, :cond_3

    .line 5
    iget-object v4, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v4, v4, Lcom/whatsapp/MultipleContactPicker;->A:I

    iget-object v5, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v5, v5, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-static {v5}, Lcom/whatsapp/MultipleContactPicker;->d(Lcom/whatsapp/MultipleContactPicker;)I

    move-result v5

    if-ne v4, v5, :cond_2

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v1, v1, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v4, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v5, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v5, v5, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v5, v5, Lcom/whatsapp/MultipleContactPicker;->l:I

    invoke-virtual {v4, v5}, Lcom/whatsapp/MultipleContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v7, v7, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-static {v7}, Lcom/whatsapp/MultipleContactPicker;->d(Lcom/whatsapp/MultipleContactPicker;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/whatsapp/MultipleContactPicker;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/UnknownFormatConversionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :goto_1
    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    if-eqz v3, :cond_6

    move v1, v2

    .line 17
    :cond_2
    iget-object v4, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v5, v4, Lcom/whatsapp/MultipleContactPicker;->A:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Lcom/whatsapp/MultipleContactPicker;->A:I

    if-eqz v3, :cond_4

    .line 8
    :cond_3
    iget-object v4, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v5, v4, Lcom/whatsapp/MultipleContactPicker;->A:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v4, Lcom/whatsapp/MultipleContactPicker;->A:I

    .line 14
    :cond_4
    :goto_2
    iput-boolean v1, v0, Lcom/whatsapp/zq;->l:Z

    .line 7
    iget-object v0, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v1, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v1, v1, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-static {v1}, Lcom/whatsapp/MultipleContactPicker;->e(Lcom/whatsapp/MultipleContactPicker;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v4, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v4, v4, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v4, v4, Lcom/whatsapp/MultipleContactPicker;->A:I

    invoke-static {v0, v1, v4}, Lcom/whatsapp/MultipleContactPicker;->a(Lcom/whatsapp/MultipleContactPicker;Landroid/widget/TextView;I)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget v0, v0, Lcom/whatsapp/MultipleContactPicker;->A:I

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v0, v0, Lcom/whatsapp/MultipleContactPicker;->z:Landroid/widget/Button;

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setEnabled(Z)V

    if-eqz v3, :cond_0

    .line 4
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v0, v0, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    iget-object v0, v0, Lcom/whatsapp/MultipleContactPicker;->z:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V

    goto/16 :goto_0

    .line 3
    :catch_0
    move-exception v1

    .line 12
    iget-object v1, p0, Lcom/whatsapp/rx;->a:Lcom/whatsapp/je;

    iget-object v1, v1, Lcom/whatsapp/je;->a:Lcom/whatsapp/MultipleContactPicker;

    const v4, 0x7f090265

    invoke-virtual {v1, v4}, Lcom/whatsapp/MultipleContactPicker;->a(I)V

    goto :goto_1

    :cond_6
    move v1, v2

    goto :goto_2
.end method
