.class Lcom/whatsapp/jy;
.super Ljava/lang/Object;
.source "jy.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/whatsapp/sz;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/jy;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;Lcom/whatsapp/sz;)I
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 5
    iget-wide v0, p1, Lcom/whatsapp/sz;->i:J

    iget-wide v2, p2, Lcom/whatsapp/sz;->i:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2
    const/4 v0, 0x0

    .line 6
    :goto_0
    return v0

    .line 7
    :cond_0
    iget-wide v0, p1, Lcom/whatsapp/sz;->i:J

    iget-wide v2, p2, Lcom/whatsapp/sz;->i:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 6
    const/4 v0, 0x1

    goto :goto_0

    .line 3
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    check-cast p1, Lcom/whatsapp/sz;

    check-cast p2, Lcom/whatsapp/sz;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/jy;->a(Lcom/whatsapp/sz;Lcom/whatsapp/sz;)I

    move-result v0

    return v0
.end method
