.class Lcom/whatsapp/td;
.super Landroid/os/Handler;
.source "td.java"


# instance fields
.field final a:Lcom/whatsapp/SetStatus;


# direct methods
.method constructor <init>(Lcom/whatsapp/SetStatus;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_1

    .line 10
    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    invoke-virtual {v1}, Lcom/whatsapp/SetStatus;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    iget-object v1, v1, Lcom/whatsapp/SetStatus;->f:Landroid/widget/TextView;

    if-nez v0, :cond_0

    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    sput-boolean v3, Lcom/whatsapp/App;->b:Z

    .line 1
    iget-object v0, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    iget-object v0, v0, Lcom/whatsapp/SetStatus;->h:Lcom/whatsapp/ke;

    invoke-virtual {v0}, Lcom/whatsapp/ke;->notifyDataSetInvalidated()V

    .line 9
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 5
    :cond_1
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f090153

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    const v1, 0x7f0d00e0

    invoke-virtual {v0, v1}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    const v1, 0x7f0d016a

    invoke-virtual {v0, v1}, Lcom/whatsapp/SetStatus;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    invoke-static {v0}, Lcom/whatsapp/SetStatus;->b(Lcom/whatsapp/SetStatus;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/m2;

    invoke-direct {v1, p0}, Lcom/whatsapp/m2;-><init>(Lcom/whatsapp/td;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    return-void
.end method
