.class final Lcom/whatsapp/hp;
.super Ljava/lang/Object;
.source "hp.java"

# interfaces
.implements Lcom/whatsapp/uk;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 5
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->i()V

    .line 7
    :cond_0
    invoke-static {}, Lcom/whatsapp/Conversation;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1
    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/Conversation;->q()V

    .line 3
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    return-void
.end method
