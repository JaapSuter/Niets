.class Lcom/whatsapp/gk;
.super Ljava/lang/Object;
.source "gk.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/ContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter

    .prologue
    const v5, 0x7f020043

    const/4 v4, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 12
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;)I

    move-result v1

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1, v4}, Lcom/whatsapp/ContactPicker;->a(Lcom/whatsapp/ContactPicker;I)I

    .line 5
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->e(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v2}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020044

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->d(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v2}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->f(Lcom/whatsapp/ContactPicker;)Landroid/widget/ImageButton;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v2}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->g(Lcom/whatsapp/ContactPicker;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f09009b

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 14
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->h(Lcom/whatsapp/ContactPicker;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->hasTextFilter()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    iget-object v2, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v2}, Lcom/whatsapp/ContactPicker;->h(Lcom/whatsapp/ContactPicker;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ListView;->getTextFilter()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/ContactPicker;->a(Lcom/whatsapp/ContactPicker;Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->i(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/fe;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    if-eqz v0, :cond_2

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->b(Lcom/whatsapp/ContactPicker;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v2}, Lcom/whatsapp/ContactPicker;->j(Lcom/whatsapp/ContactPicker;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 15
    iget-object v2, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v2}, Lcom/whatsapp/ContactPicker;->b(Lcom/whatsapp/ContactPicker;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz v0, :cond_2

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v0}, Lcom/whatsapp/ContactPicker;->k(Lcom/whatsapp/ContactPicker;)V

    .line 16
    iget-object v0, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v0}, Lcom/whatsapp/ContactPicker;->i(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/fe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/gk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v0}, Lcom/whatsapp/ContactPicker;->h(Lcom/whatsapp/ContactPicker;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setSelection(I)V

    .line 11
    :cond_3
    return-void
.end method
