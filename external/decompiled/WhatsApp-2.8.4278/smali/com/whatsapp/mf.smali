.class public Lcom/whatsapp/mf;
.super Ljava/io/FilterOutputStream;
.source "mf.java"


# instance fields
.field final a:I


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 7
    iput p2, p0, Lcom/whatsapp/mf;->a:I

    .line 8
    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 11
    const-wide/16 v0, 0x1

    iget v2, p0, Lcom/whatsapp/mf;->a:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/e4;->b(JI)V

    .line 9
    invoke-super {p0, p1}, Ljava/io/FilterOutputStream;->write(I)V

    .line 10
    return-void
.end method

.method public write([B)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2
    array-length v0, p1

    int-to-long v0, v0

    iget v2, p0, Lcom/whatsapp/mf;->a:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/e4;->b(JI)V

    .line 4
    invoke-super {p0, p1}, Ljava/io/FilterOutputStream;->write([B)V

    .line 1
    return-void
.end method

.method public write([BII)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 12
    int-to-long v0, p3

    iget v2, p0, Lcom/whatsapp/mf;->a:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/e4;->b(JI)V

    .line 6
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterOutputStream;->write([BII)V

    .line 5
    return-void
.end method
