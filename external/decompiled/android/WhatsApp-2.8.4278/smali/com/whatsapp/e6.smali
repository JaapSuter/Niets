.class Lcom/whatsapp/e6;
.super Ljava/lang/Object;
.source "e6.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/VerifyMessageStoreActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/e6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/e6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->removeDialog(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/e6;->a:Lcom/whatsapp/VerifyMessageStoreActivity;

    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->showDialog(I)V

    .line 3
    return-void
.end method
