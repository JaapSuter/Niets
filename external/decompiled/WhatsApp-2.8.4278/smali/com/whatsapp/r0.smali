.class Lcom/whatsapp/r0;
.super Lcom/whatsapp/xz;
.source "r0.java"


# instance fields
.field final a:Lcom/whatsapp/qz;


# direct methods
.method constructor <init>(Lcom/whatsapp/qz;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/r0;->a:Lcom/whatsapp/qz;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/c1;)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/r0;->a:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->j:Lcom/whatsapp/x0;

    invoke-interface {v0}, Lcom/whatsapp/x0;->a()V

    .line 2
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
    .line 1
    iget-object v0, p0, Lcom/whatsapp/r0;->a:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->j:Lcom/whatsapp/x0;

    invoke-interface {v0}, Lcom/whatsapp/x0;->a()V

    .line 4
    return-void
.end method
