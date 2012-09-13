.class public Lcom/whatsapp/du;
.super Ljava/lang/Object;
.source "du.java"

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
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1
    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 9
    :goto_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    move-result v5

    if-eqz v5, :cond_0

    move v2, v1

    .line 2
    :cond_0
    if-ne v0, v2, :cond_3

    .line 10
    invoke-virtual {v3, v4}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v1

    :cond_1
    :goto_1
    return v1

    :cond_2
    move v0, v2

    .line 11
    goto :goto_0

    .line 8
    :cond_3
    if-eqz v0, :cond_1

    .line 6
    const/4 v1, -0x1

    goto :goto_1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 4
    check-cast p1, Lcom/whatsapp/zq;

    check-cast p2, Lcom/whatsapp/zq;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/du;->a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I

    move-result v0

    return v0
.end method
