.class Lcom/whatsapp/om;
.super Ljava/lang/Object;
.source "om.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/om;->a:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/om;->a:Lcom/whatsapp/Conversation;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->i(Lcom/whatsapp/Conversation;Z)V

    .line 2
    return-void
.end method
