.class final Lcom/whatsapp/ip;
.super Ljava/lang/Object;
.source "ip.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 8
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v0, -0x1

    .line 1
    invoke-static {}, Lcom/whatsapp/eu;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 19
    :cond_0
    :goto_0
    return v0

    .line 12
    :cond_1
    invoke-static {}, Lcom/whatsapp/eu;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    .line 19
    goto :goto_0

    .line 14
    :cond_2
    sget-object v2, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v2, p1}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v2

    .line 8
    sget-object v3, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v3, p2}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v3

    .line 11
    if-nez v2, :cond_3

    if-nez v3, :cond_3

    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 2
    :cond_3
    if-nez v2, :cond_4

    move v0, v1

    .line 18
    goto :goto_0

    .line 5
    :cond_4
    if-eqz v3, :cond_0

    .line 3
    iget-wide v4, v2, Lcom/whatsapp/sz;->i:J

    iget-wide v6, v3, Lcom/whatsapp/sz;->i:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_5

    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 15
    :cond_5
    iget-wide v4, v2, Lcom/whatsapp/sz;->i:J

    iget-wide v2, v3, Lcom/whatsapp/sz;->i:J

    cmp-long v2, v4, v2

    if-gez v2, :cond_0

    move v0, v1

    .line 16
    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 9
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/ip;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
