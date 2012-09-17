.class Lcom/whatsapp/bt;
.super Ljava/lang/Object;
.source "bt.java"

# interfaces
.implements Lorg/apache/http/entity/ContentProducer;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:Lcom/whatsapp/at;


# direct methods
.method constructor <init>(Lcom/whatsapp/at;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iput-object p2, p0, Lcom/whatsapp/bt;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/whatsapp/bt;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public writeTo(Ljava/io/OutputStream;)V
    .locals 7
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 13
    iget-object v0, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget v0, v0, Lcom/whatsapp/at;->d:I

    new-array v2, v0, [B

    .line 9
    iget-object v0, p0, Lcom/whatsapp/bt;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/whatsapp/at;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 23
    new-instance v3, Ljava/io/FileInputStream;

    iget-object v0, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget-object v0, v0, Lcom/whatsapp/at;->b:Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget v0, v0, Lcom/whatsapp/at;->c:I

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Ljava/io/InputStream;->skip(J)J

    .line 8
    iget-object v0, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget v0, v0, Lcom/whatsapp/at;->c:I

    add-int/2addr v0, v6

    .line 14
    :cond_0
    iget-object v4, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget v4, v4, Lcom/whatsapp/at;->d:I

    invoke-virtual {v3, v2, v6, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    .line 1
    if-ltz v4, :cond_1

    .line 2
    add-int/2addr v0, v4

    .line 15
    invoke-virtual {p1, v2, v6, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 18
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 4
    iget-object v5, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget-object v5, v5, Lcom/whatsapp/at;->e:Lcom/whatsapp/ct;

    if-eqz v5, :cond_1

    .line 16
    iget-object v5, p0, Lcom/whatsapp/bt;->c:Lcom/whatsapp/at;

    iget-object v5, v5, Lcom/whatsapp/at;->e:Lcom/whatsapp/ct;

    invoke-interface {v5, v0}, Lcom/whatsapp/ct;->a(I)V

    .line 11
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 10
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 21
    if-eqz v1, :cond_3

    .line 24
    :cond_2
    if-gez v4, :cond_0

    .line 3
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_4

    .line 19
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/bt;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/whatsapp/at;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 5
    :cond_4
    return-void
.end method
