.class Lcom/whatsapp/ai;
.super Ljava/lang/Object;
.source "ai.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Z

.field final b:Lcom/whatsapp/zh;


# direct methods
.method constructor <init>(Lcom/whatsapp/zh;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/ai;->b:Lcom/whatsapp/zh;

    iput-boolean p2, p0, Lcom/whatsapp/ai;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 2
    iget-boolean v0, p0, Lcom/whatsapp/ai;->a:Z

    if-nez v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ai;->b:Lcom/whatsapp/zh;

    iget-object v0, v0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->j()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ai;->b:Lcom/whatsapp/zh;

    iget-object v0, v0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->e(Ljava/lang/String;)V

    .line 5
    return-void
.end method
