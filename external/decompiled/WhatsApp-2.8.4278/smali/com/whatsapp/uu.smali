.class public Lcom/whatsapp/uu;
.super Ljava/lang/Object;
.source "uu.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/whatsapp/zq;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I
    .locals 8
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x1

    .line 8
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 7
    :goto_0
    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v5, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v1

    .line 18
    :cond_0
    if-nez v0, :cond_2

    if-nez v1, :cond_2

    .line 10
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    .line 3
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 14
    invoke-virtual {v0, v2}, Ljava/text/Collator;->setDecomposition(I)V

    .line 15
    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 16
    :goto_1
    return v0

    :cond_1
    move-object v0, v1

    .line 8
    goto :goto_0

    .line 13
    :cond_2
    if-nez v0, :cond_3

    move v0, v2

    .line 2
    goto :goto_1

    .line 11
    :cond_3
    if-nez v1, :cond_4

    move v0, v3

    .line 5
    goto :goto_1

    .line 17
    :cond_4
    iget-wide v4, v0, Lcom/whatsapp/sz;->i:J

    iget-wide v6, v1, Lcom/whatsapp/sz;->i:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_5

    .line 4
    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    .line 9
    :cond_5
    iget-wide v4, v0, Lcom/whatsapp/sz;->i:J

    iget-wide v0, v1, Lcom/whatsapp/sz;->i:J

    cmp-long v0, v4, v0

    if-gez v0, :cond_6

    move v0, v2

    .line 16
    goto :goto_1

    :cond_6
    move v0, v3

    .line 6
    goto :goto_1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 12
    check-cast p1, Lcom/whatsapp/zq;

    check-cast p2, Lcom/whatsapp/zq;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/uu;->a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I

    move-result v0

    return v0
.end method
