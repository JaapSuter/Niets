.class Lcom/whatsapp/cl;
.super Ljava/lang/Object;
.source "cl.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/cl;->a:Lcom/whatsapp/Conversation;

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
    iget-object v0, p0, Lcom/whatsapp/cl;->a:Lcom/whatsapp/Conversation;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->removeDialog(I)V

    .line 3
    return-void
.end method
