.class public Lcom/whatsapp/uq;
.super Ljava/lang/Object;
.source "uq.java"


# instance fields
.field final a:J

.field final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide p1, p0, Lcom/whatsapp/uq;->a:J

    .line 4
    iput-object p3, p0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    .line 2
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 11
    check-cast p1, Lcom/whatsapp/uq;

    .line 12
    if-nez p1, :cond_1

    .line 17
    :cond_0
    :goto_0
    return v0

    .line 16
    :cond_1
    iget-object v2, p0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 3
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-nez v2, :cond_3

    iget-object v2, p1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 5
    :cond_3
    iget-wide v2, p0, Lcom/whatsapp/uq;->a:J

    iget-wide v4, p1, Lcom/whatsapp/uq;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-nez v2, :cond_4

    iget-object v2, p1, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-nez v2, :cond_4

    move v0, v1

    .line 9
    goto :goto_0

    .line 15
    :cond_4
    invoke-virtual {p0}, Lcom/whatsapp/uq;->hashCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/whatsapp/uq;->hashCode()I

    move-result v3

    if-ne v2, v3, :cond_0

    move v0, v1

    .line 13
    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 7
    invoke-virtual {p0}, Lcom/whatsapp/uq;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lcom/whatsapp/uq;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
