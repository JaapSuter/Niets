.class public Lcom/whatsapp/ej;
.super Ljava/lang/Object;
.source "ej.java"

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
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v2, -0x1

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    .line 21
    :cond_0
    :goto_0
    return v0

    .line 6
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    move v0, v1

    .line 11
    goto :goto_0

    .line 17
    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    :cond_4
    move v0, v2

    .line 9
    goto :goto_0

    .line 2
    :cond_5
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v3

    .line 20
    invoke-virtual {v3, v0}, Ljava/text/Collator;->setStrength(I)V

    .line 10
    invoke-virtual {v3, v1}, Ljava/text/Collator;->setDecomposition(I)V

    .line 13
    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 19
    if-nez v3, :cond_9

    .line 4
    iget-object v3, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-nez v3, :cond_6

    iget-object v3, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 1
    :cond_6
    iget-object v0, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-nez v0, :cond_7

    move v0, v1

    .line 18
    goto :goto_0

    .line 12
    :cond_7
    iget-object v0, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-nez v0, :cond_8

    move v0, v2

    .line 21
    goto :goto_0

    .line 15
    :cond_8
    iget-object v0, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v1, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_9
    move v0, v3

    .line 8
    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 3
    check-cast p1, Lcom/whatsapp/zq;

    check-cast p2, Lcom/whatsapp/zq;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/ej;->a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I

    move-result v0

    return v0
.end method
