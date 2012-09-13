.class Lcom/whatsapp/co;
.super Ljava/lang/Object;
.source "co.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/v8;


# direct methods
.method constructor <init>(Lcom/whatsapp/v8;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/co;->a:Lcom/whatsapp/v8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/co;->a:Lcom/whatsapp/v8;

    iget-object v0, v0, Lcom/whatsapp/v8;->a:Lcom/whatsapp/bo;

    iget-object v0, v0, Lcom/whatsapp/bo;->a:Lcom/whatsapp/Conversations;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->removeDialog(I)V

    .line 1
    return-void
.end method
