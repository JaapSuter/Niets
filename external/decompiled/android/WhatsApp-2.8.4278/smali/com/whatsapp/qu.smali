.class Lcom/whatsapp/qu;
.super Ljava/lang/Object;
.source "qu.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/GroupChatMap;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/qu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/qu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->h(Lcom/whatsapp/GroupChatMap;)I

    .line 1
    iget-object v0, p0, Lcom/whatsapp/qu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->e(Lcom/whatsapp/GroupChatMap;)I

    move-result v0

    iget-object v1, p0, Lcom/whatsapp/qu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->f(Lcom/whatsapp/GroupChatMap;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/qu;->a:Lcom/whatsapp/GroupChatMap;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/whatsapp/GroupChatMap;->a(Lcom/whatsapp/GroupChatMap;I)I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/qu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->g(Lcom/whatsapp/GroupChatMap;)V

    .line 2
    return-void
.end method
