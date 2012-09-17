.class Lcom/whatsapp/sd;
.super Landroid/os/Handler;
.source "sd.java"


# instance fields
.field final a:Lcom/whatsapp/SetStatus;


# direct methods
.method constructor <init>(Lcom/whatsapp/SetStatus;)V
    .locals 0
    .parameter

    .prologue
    .line 8
    iput-object p1, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7
    .parameter

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_2

    .line 3
    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    invoke-virtual {v1}, Lcom/whatsapp/SetStatus;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    iget-object v1, v1, Lcom/whatsapp/SetStatus;->f:Landroid/widget/TextView;

    if-nez v0, :cond_0

    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    sget-object v0, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 11
    sget-object v6, Lcom/whatsapp/App;->a:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    if-eqz v4, :cond_5

    move v0, v3

    :goto_1
    if-eqz v4, :cond_4

    .line 4
    :goto_2
    if-nez v0, :cond_1

    .line 7
    sget-object v0, Lcom/whatsapp/SetStatus;->g:Ljava/util/ArrayList;

    sget-object v1, Lcom/whatsapp/App;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    iget-object v0, v0, Lcom/whatsapp/SetStatus;->h:Lcom/whatsapp/ke;

    invoke-virtual {v0}, Lcom/whatsapp/ke;->notifyDataSetInvalidated()V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    invoke-static {v0}, Lcom/whatsapp/SetStatus;->a(Lcom/whatsapp/SetStatus;)V

    .line 17
    if-eqz v4, :cond_3

    .line 10
    :cond_2
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f090152

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/SetStatus;->removeDialog(I)V

    .line 18
    iget-object v0, p0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    invoke-static {v0}, Lcom/whatsapp/SetStatus;->b(Lcom/whatsapp/SetStatus;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/l2;

    invoke-direct {v1, p0}, Lcom/whatsapp/l2;-><init>(Lcom/whatsapp/sd;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    return-void

    :cond_4
    move v1, v0

    goto :goto_0

    :cond_5
    move v0, v3

    goto :goto_2

    :cond_6
    move v0, v1

    goto :goto_1

    :cond_7
    move v0, v1

    goto :goto_2
.end method
