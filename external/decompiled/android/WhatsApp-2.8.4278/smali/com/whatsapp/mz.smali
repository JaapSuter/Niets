.class public Lcom/whatsapp/mz;
.super Ljava/lang/Object;
.source "mz.java"

# interfaces
.implements Lcom/whatsapp/f1;


# instance fields
.field a:Ljava/io/Writer;

.field b:Lcom/whatsapp/f1;

.field c:Lcom/whatsapp/f1;

.field d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whatsapp/f1;Ljava/io/Writer;Ljava/lang/String;)V
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
    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/whatsapp/mz;->c:Lcom/whatsapp/f1;

    .line 6
    iput-object p2, p0, Lcom/whatsapp/mz;->a:Ljava/io/Writer;

    .line 12
    new-instance v0, Lcom/whatsapp/j1;

    iget-object v1, p0, Lcom/whatsapp/mz;->a:Ljava/io/Writer;

    invoke-direct {v0, v1}, Lcom/whatsapp/j1;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/whatsapp/mz;->b:Lcom/whatsapp/f1;

    .line 7
    iput-object p3, p0, Lcom/whatsapp/mz;->d:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/mz;->c:Lcom/whatsapp/f1;

    invoke-interface {v0}, Lcom/whatsapp/f1;->a()V

    .line 28
    iget-object v0, p0, Lcom/whatsapp/mz;->a:Ljava/io/Writer;

    iget-object v1, p0, Lcom/whatsapp/mz;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/whatsapp/mz;->b:Lcom/whatsapp/f1;

    invoke-interface {v0}, Lcom/whatsapp/f1;->a()V

    .line 8
    return-void
.end method

.method public a(Lcom/whatsapp/c1;)V
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/mz;->c:Lcom/whatsapp/f1;

    invoke-interface {v0, p1}, Lcom/whatsapp/f1;->a(Lcom/whatsapp/c1;)V

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/mz;->a:Ljava/io/Writer;

    iget-object v1, p0, Lcom/whatsapp/mz;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/whatsapp/mz;->b:Lcom/whatsapp/f1;

    invoke-interface {v0, p1}, Lcom/whatsapp/f1;->a(Lcom/whatsapp/c1;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :goto_0
    return-void

    .line 15
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lcom/whatsapp/c1;Z)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/mz;->c:Lcom/whatsapp/f1;

    invoke-interface {v0, p1, p2}, Lcom/whatsapp/f1;->a(Lcom/whatsapp/c1;Z)V

    .line 26
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/mz;->a:Ljava/io/Writer;

    iget-object v1, p0, Lcom/whatsapp/mz;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/mz;->b:Lcom/whatsapp/f1;

    invoke-interface {v0, p1}, Lcom/whatsapp/f1;->a(Lcom/whatsapp/c1;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :goto_0
    return-void

    .line 14
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lcom/whatsapp/g1;)V
    .locals 1
    .parameter

    .prologue
    .line 17
    iget-object v0, p0, Lcom/whatsapp/mz;->c:Lcom/whatsapp/f1;

    invoke-interface {v0, p1}, Lcom/whatsapp/f1;->a(Lcom/whatsapp/g1;)V

    .line 9
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 16
    iget-object v0, p0, Lcom/whatsapp/mz;->c:Lcom/whatsapp/f1;

    invoke-interface {v0, p1, p2}, Lcom/whatsapp/f1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/mz;->a:Ljava/io/Writer;

    iget-object v1, p0, Lcom/whatsapp/mz;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/whatsapp/mz;->b:Lcom/whatsapp/f1;

    invoke-interface {v0, p1, p2}, Lcom/whatsapp/f1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    return-void
.end method
