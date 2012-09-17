.class Lcom/whatsapp/ln;
.super Ljava/lang/Object;
.source "ln.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/whatsapp/bb;


# direct methods
.method constructor <init>(Lcom/whatsapp/bb;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ln;->b:Lcom/whatsapp/bb;

    iput-object p2, p0, Lcom/whatsapp/ln;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/ln;->b:Lcom/whatsapp/bb;

    invoke-static {v0}, Lcom/whatsapp/bb;->a(Lcom/whatsapp/bb;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ln;->b:Lcom/whatsapp/bb;

    iget-object v1, v1, Lcom/whatsapp/bb;->e:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ln;->b:Lcom/whatsapp/bb;

    iget-object v0, v0, Lcom/whatsapp/bb;->e:Lcom/whatsapp/Conversation;

    iget-object v0, v0, Lcom/whatsapp/Conversation;->Nb:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/ln;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_0
    return-void
.end method
