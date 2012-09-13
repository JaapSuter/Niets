.class Lcom/whatsapp/o6;
.super Ljava/lang/Object;
.source "o6.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/VerifyMessageStoreListActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifyMessageStoreListActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/o6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/o6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->removeDialog(I)V

    .line 2
    new-instance v0, Lcom/whatsapp/bc;

    iget-object v1, p0, Lcom/whatsapp/o6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    invoke-direct {v0, v1, v2, v2}, Lcom/whatsapp/bc;-><init>(Lcom/whatsapp/VerifyMessageStoreListActivity;ZZ)V

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/whatsapp/bc;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 4
    return-void
.end method
