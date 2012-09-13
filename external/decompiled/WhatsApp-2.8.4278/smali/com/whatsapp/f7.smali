.class Lcom/whatsapp/f7;
.super Ljava/lang/Object;
.source "f7.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Landroid/widget/EditText;

.field final b:Lcom/whatsapp/VerifySms;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifySms;Landroid/widget/EditText;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/f7;->b:Lcom/whatsapp/VerifySms;

    iput-object p2, p0, Lcom/whatsapp/f7;->a:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter
    .parameter

    .prologue
    const/16 v3, 0x1c

    .line 3
    iget-object v0, p0, Lcom/whatsapp/f7;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    const-string v1, ""

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/f7;->b:Lcom/whatsapp/VerifySms;

    invoke-virtual {v1, v3}, Lcom/whatsapp/VerifySms;->removeDialog(I)V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/f7;->b:Lcom/whatsapp/VerifySms;

    const/16 v2, 0x1d

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/f7;->b:Lcom/whatsapp/VerifySms;

    invoke-virtual {v1, v3}, Lcom/whatsapp/VerifySms;->removeDialog(I)V

    .line 8
    new-instance v1, Lcom/whatsapp/fc;

    iget-object v2, p0, Lcom/whatsapp/f7;->b:Lcom/whatsapp/VerifySms;

    invoke-direct {v1, v2}, Lcom/whatsapp/fc;-><init>(Lcom/whatsapp/VerifySms;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/fc;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 1
    :cond_2
    return-void
.end method
