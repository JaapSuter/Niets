.class Lcom/whatsapp/ci;
.super Ljava/lang/Object;
.source "ci.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/bi;


# direct methods
.method constructor <init>(Lcom/whatsapp/bi;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ci;->a:Lcom/whatsapp/bi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/ci;->a:Lcom/whatsapp/bi;

    iget-object v0, v0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->j()V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ci;->a:Lcom/whatsapp/bi;

    iget-object v0, v0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->e(Ljava/lang/String;)V

    .line 1
    return-void
.end method
