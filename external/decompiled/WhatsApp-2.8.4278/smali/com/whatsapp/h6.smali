.class Lcom/whatsapp/h6;
.super Ljava/lang/Object;
.source "h6.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/VerifyMessageStoreActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/h6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/h6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->removeDialog(I)V

    .line 1
    new-instance v0, Lcom/whatsapp/ac;

    iget-object v1, p0, Lcom/whatsapp/h6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whatsapp/h6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    iget-boolean v3, v3, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/whatsapp/ac;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;ZZ)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ac;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 2
    return-void
.end method
