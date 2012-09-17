.class Lcom/whatsapp/no;
.super Ljava/lang/Object;
.source "no.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/Conversations;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversations;Lcom/whatsapp/zq;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/no;->b:Lcom/whatsapp/Conversations;

    iput-object p2, p0, Lcom/whatsapp/no;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/no;->b:Lcom/whatsapp/Conversations;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->removeDialog(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/no;->b:Lcom/whatsapp/Conversations;

    iget-object v1, p0, Lcom/whatsapp/no;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x1

    const/4 v3, 0x5

    const/16 v4, 0x9

    invoke-static {v0, v1, v2, v3, v4}, Lcom/whatsapp/Conversation;->a(Landroid/app/Activity;Lcom/whatsapp/zq;ZII)V

    .line 2
    return-void
.end method
