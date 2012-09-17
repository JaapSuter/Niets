.class final Lcom/whatsapp/o5;
.super Ljava/lang/Object;
.source "o5.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/o5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/o5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->d(Ljava/lang/String;)V

    .line 4
    :cond_0
    return-void
.end method
