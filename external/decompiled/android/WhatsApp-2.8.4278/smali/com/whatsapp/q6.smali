.class Lcom/whatsapp/q6;
.super Ljava/lang/Object;
.source "q6.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/VerifyMessageStoreListActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifyMessageStoreListActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/q6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/q6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->removeDialog(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/q6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreListActivity;->showDialog(I)V

    .line 3
    return-void
.end method
