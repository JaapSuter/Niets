.class Lcom/whatsapp/cab;
.super Lcom/whatsapp/bab;
.source "cab.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whatsapp/bab",
        "<",
        "Lcom/whatsapp/uz;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final b:Lcom/whatsapp/m5;


# direct methods
.method constructor <init>(Lcom/whatsapp/m5;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/cab;->b:Lcom/whatsapp/m5;

    invoke-direct {p0, p2}, Lcom/whatsapp/bab;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<",
            "Lcom/whatsapp/uz;",
            "Landroid/graphics/Bitmap;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 2
    invoke-super {p0, p1}, Lcom/whatsapp/bab;->removeEldestEntry(Ljava/util/Map$Entry;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/cab;->b:Lcom/whatsapp/m5;

    invoke-static {v0}, Lcom/whatsapp/m5;->a(Lcom/whatsapp/m5;)Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    const/4 v0, 0x1

    .line 4
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
