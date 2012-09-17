.class Lcom/whatsapp/xk;
.super Ljava/lang/Object;
.source "xk.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/xk;->a:Lcom/whatsapp/Conversation;

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
    iget-object v0, p0, Lcom/whatsapp/xk;->a:Lcom/whatsapp/Conversation;

    invoke-static {v0, v2}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;I)I

    .line 4
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/xk;->a:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/xk;->a:Lcom/whatsapp/Conversation;

    invoke-virtual {v0, v2}, Lcom/whatsapp/Conversation;->removeDialog(I)V

    .line 5
    return-void
.end method
