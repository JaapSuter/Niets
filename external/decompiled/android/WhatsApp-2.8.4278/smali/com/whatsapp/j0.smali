.class Lcom/whatsapp/j0;
.super Lcom/whatsapp/xz;
.source "j0.java"


# instance fields
.field final a:Ljava/lang/Runnable;

.field final b:Lcom/whatsapp/wz;

.field final c:Lcom/whatsapp/qz;


# direct methods
.method constructor <init>(Lcom/whatsapp/qz;Ljava/lang/Runnable;Lcom/whatsapp/wz;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/j0;->c:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/j0;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/whatsapp/j0;->b:Lcom/whatsapp/wz;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/j0;->b:Lcom/whatsapp/wz;

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/whatsapp/j0;->b:Lcom/whatsapp/wz;

    invoke-interface {v0, p1}, Lcom/whatsapp/wz;->a(I)V

    .line 3
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/j0;->c:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->k:Lcom/whatsapp/vz;

    invoke-interface {v0, p2}, Lcom/whatsapp/vz;->a(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/j0;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/j0;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 7
    :cond_0
    return-void
.end method
