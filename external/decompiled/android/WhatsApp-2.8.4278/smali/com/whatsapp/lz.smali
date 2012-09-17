.class public Lcom/whatsapp/lz;
.super Ljava/lang/Object;
.source "lz.java"

# interfaces
.implements Lcom/whatsapp/e1;


# instance fields
.field a:Lcom/whatsapp/e1;

.field b:Ljava/io/Writer;

.field c:Lcom/whatsapp/f1;

.field d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whatsapp/e1;Ljava/io/Writer;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whatsapp/lz;->a:Lcom/whatsapp/e1;

    .line 13
    iput-object p2, p0, Lcom/whatsapp/lz;->b:Ljava/io/Writer;

    .line 17
    new-instance v0, Lcom/whatsapp/j1;

    iget-object v1, p0, Lcom/whatsapp/lz;->b:Ljava/io/Writer;

    invoke-direct {v0, v1}, Lcom/whatsapp/j1;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/whatsapp/lz;->c:Lcom/whatsapp/f1;

    .line 16
    iput-object p3, p0, Lcom/whatsapp/lz;->d:Ljava/lang/String;

    .line 6
    return-void
.end method


# virtual methods
.method public a()Lcom/whatsapp/c1;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/lz;->a:Lcom/whatsapp/e1;

    invoke-interface {v0}, Lcom/whatsapp/e1;->a()Lcom/whatsapp/c1;

    move-result-object v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/whatsapp/lz;->b:Ljava/io/Writer;

    iget-object v2, p0, Lcom/whatsapp/lz;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/whatsapp/lz;->c:Lcom/whatsapp/f1;

    invoke-interface {v1, v0}, Lcom/whatsapp/f1;->a(Lcom/whatsapp/c1;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :goto_0
    return-object v0

    .line 10
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/whatsapp/g1;)V
    .locals 1
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/lz;->a:Lcom/whatsapp/e1;

    invoke-interface {v0, p1}, Lcom/whatsapp/e1;->a(Lcom/whatsapp/g1;)V

    .line 5
    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 12
    iget-object v0, p0, Lcom/whatsapp/lz;->a:Lcom/whatsapp/e1;

    invoke-interface {v0}, Lcom/whatsapp/e1;->b()V

    .line 1
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/whatsapp/lz;->a:Lcom/whatsapp/e1;

    invoke-interface {v0}, Lcom/whatsapp/e1;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
