.class Lcom/whatsapp/j6;
.super Ljava/lang/Object;
.source "j6.java"

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
    iput-object p1, p0, Lcom/whatsapp/j6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/j6;->a:Lcom/whatsapp/VerifyMessageStoreListActivity;

    invoke-virtual {v0}, Lcom/whatsapp/VerifyMessageStoreListActivity;->finish()V

    .line 1
    return-void
.end method
