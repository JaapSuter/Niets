.class Lcom/whatsapp/ou;
.super Ljava/lang/Object;
.source "ou.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/nu;


# direct methods
.method constructor <init>(Lcom/whatsapp/nu;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ou;->a:Lcom/whatsapp/nu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/ou;->a:Lcom/whatsapp/nu;

    iget-object v0, v0, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    iget-object v0, v0, Lcom/whatsapp/mu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->c(Lcom/whatsapp/GroupChatMap;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ou;->a:Lcom/whatsapp/nu;

    iget-object v1, v1, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    iget-object v1, v1, Lcom/whatsapp/mu;->a:Lcom/whatsapp/GroupChatMap;

    const v2, 0x7f090282

    invoke-virtual {v1, v2}, Lcom/whatsapp/GroupChatMap;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1
    return-void
.end method
