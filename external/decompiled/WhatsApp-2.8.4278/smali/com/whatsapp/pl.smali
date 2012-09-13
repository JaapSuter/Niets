.class Lcom/whatsapp/pl;
.super Ljava/lang/Object;
.source "pl.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/pl;->a:Lcom/whatsapp/Conversation;

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
    iget-object v0, p0, Lcom/whatsapp/pl;->a:Lcom/whatsapp/Conversation;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/pl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/pl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->p:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/Conversation;Ljava/lang/String;)V

    .line 3
    return-void
.end method
