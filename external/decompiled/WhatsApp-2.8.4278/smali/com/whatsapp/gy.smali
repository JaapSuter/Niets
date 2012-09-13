.class Lcom/whatsapp/gy;
.super Ljava/lang/Object;
.source "gy.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/whatsapp/fy;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lcom/whatsapp/z9;


# direct methods
.method constructor <init>(Lcom/whatsapp/z9;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/gy;->a:Lcom/whatsapp/z9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/fy;Lcom/whatsapp/fy;)I
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 1
    iget-wide v0, p1, Lcom/whatsapp/fy;->n:D

    iget-wide v2, p2, Lcom/whatsapp/fy;->n:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 3
    check-cast p1, Lcom/whatsapp/fy;

    check-cast p2, Lcom/whatsapp/fy;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/gy;->a(Lcom/whatsapp/fy;Lcom/whatsapp/fy;)I

    move-result v0

    return v0
.end method
