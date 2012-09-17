.class Lcom/whatsapp/c6;
.super Ljava/lang/Object;
.source "c6.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/VerifyMessageStoreActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/c6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/c6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->removeDialog(I)V

    .line 2
    new-instance v0, Lcom/whatsapp/ac;

    iget-object v1, p0, Lcom/whatsapp/c6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-object v2, p0, Lcom/whatsapp/c6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-boolean v2, v2, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    invoke-direct {v0, v1, v3, v2}, Lcom/whatsapp/ac;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;ZZ)V

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ac;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 3
    return-void
.end method
