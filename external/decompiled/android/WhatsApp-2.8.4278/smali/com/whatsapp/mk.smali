.class Lcom/whatsapp/mk;
.super Ljava/lang/Object;
.source "mk.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:I

.field final b:Lcom/whatsapp/lk;


# direct methods
.method constructor <init>(Lcom/whatsapp/lk;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 15
    iput-object p1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iput p2, p0, Lcom/whatsapp/mk;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->o(Lcom/whatsapp/ContactPicker;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->o(Lcom/whatsapp/ContactPicker;)Landroid/widget/ProgressBar;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 18
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->p(Lcom/whatsapp/ContactPicker;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->i(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/fe;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 13
    :cond_0
    iget v1, p0, Lcom/whatsapp/mk;->a:I

    if-ne v1, v4, :cond_1

    .line 3
    sget-object v1, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    invoke-virtual {v1, v4}, Lcom/whatsapp/g;->b(Z)V

    .line 4
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/App;->b(J)V

    .line 1
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    const v2, 0x7f090165

    invoke-static {v1, v2, v5}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    if-eqz v0, :cond_5

    .line 17
    :cond_1
    iget v1, p0, Lcom/whatsapp/mk;->a:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 8
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-boolean v1, v1, Lcom/whatsapp/lk;->b:Z

    if-eqz v1, :cond_2

    .line 19
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->o(Lcom/whatsapp/ContactPicker;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 12
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    const v2, 0x7f090167

    invoke-virtual {v1, v2}, Lcom/whatsapp/ContactPicker;->a(I)V

    if-eqz v0, :cond_5

    .line 7
    :cond_3
    iget v1, p0, Lcom/whatsapp/mk;->a:I

    if-nez v1, :cond_4

    .line 2
    iget-object v1, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v1, v1, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    const v2, 0x7f090166

    invoke-virtual {v1, v2}, Lcom/whatsapp/ContactPicker;->a(I)V

    .line 5
    sget-object v1, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    invoke-virtual {v1, v4}, Lcom/whatsapp/g;->c(Z)V

    if-eqz v0, :cond_5

    .line 16
    :cond_4
    iget v0, p0, Lcom/whatsapp/mk;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 14
    iget-object v0, p0, Lcom/whatsapp/mk;->b:Lcom/whatsapp/lk;

    iget-object v0, v0, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    const v1, 0x7f090168

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPicker;->a(I)V

    .line 9
    :cond_5
    return-void
.end method
