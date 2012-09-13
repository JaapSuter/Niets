.class Lcom/whatsapp/ls;
.super Ljava/lang/Object;
.source "ls.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/b;


# direct methods
.method private constructor <init>(Lcom/whatsapp/b;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/b;Lcom/whatsapp/es;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    invoke-direct {p0, p1}, Lcom/whatsapp/ls;-><init>(Lcom/whatsapp/b;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 11
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    invoke-static {v0}, Lcom/whatsapp/b;->a(Lcom/whatsapp/b;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    invoke-static {v1}, Lcom/whatsapp/b;->b(Lcom/whatsapp/b;)Lcom/whatsapp/ms;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/whatsapp/ms;->a(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    invoke-static {v0, v2}, Lcom/whatsapp/b;->a(Lcom/whatsapp/b;Z)Z

    .line 4
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/b;->b:Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    invoke-virtual {v0}, Lcom/whatsapp/b;->dismiss()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    invoke-virtual {v0}, Lcom/whatsapp/b;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    iget v1, v1, Lcom/whatsapp/b;->t:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->d:Landroid/app/Activity;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/app/Activity;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ls;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/method/TextKeyListener;->clear(Landroid/text/Editable;)V

    .line 8
    return-void
.end method
