.class Lcom/whatsapp/h0;
.super Lcom/whatsapp/xz;
.source "h0.java"


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
    .line 5
    iput-object p1, p0, Lcom/whatsapp/h0;->c:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/h0;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/whatsapp/h0;->b:Lcom/whatsapp/wz;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/h0;->b:Lcom/whatsapp/wz;

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/h0;->b:Lcom/whatsapp/wz;

    invoke-interface {v0, p1}, Lcom/whatsapp/wz;->a(I)V

    .line 8
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 10
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/whatsapp/h0;->c:Lcom/whatsapp/qz;

    invoke-static {v1, p1, v0}, Lcom/whatsapp/qz;->a(Lcom/whatsapp/qz;Lcom/whatsapp/c1;Ljava/util/Vector;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/h0;->c:Lcom/whatsapp/qz;

    iget-object v1, v1, Lcom/whatsapp/qz;->k:Lcom/whatsapp/vz;

    invoke-interface {v1, v0}, Lcom/whatsapp/vz;->b(Ljava/util/Vector;)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/h0;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/h0;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 9
    :cond_0
    return-void
.end method
