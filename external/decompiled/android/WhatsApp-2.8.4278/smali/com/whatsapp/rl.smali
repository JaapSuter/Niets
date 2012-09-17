.class Lcom/whatsapp/rl;
.super Ljava/lang/Object;
.source "rl.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/rl;->a:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .parameter
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/rl;->a:Lcom/whatsapp/Conversation;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->removeDialog(I)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/rl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/rl;->a:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, 0x6

    invoke-static {v0, v1, v2, v3, v4}, Lcom/whatsapp/Conversation;->a(Landroid/app/Activity;Lcom/whatsapp/zq;ZII)V

    .line 2
    return-void
.end method
