.class Lcom/whatsapp/ku;
.super Ljava/lang/Object;
.source "ku.java"

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
.field final a:Lcom/whatsapp/GroupChatMap;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ku;->a:Lcom/whatsapp/GroupChatMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;Lcom/whatsapp/sz;)I
    .locals 6
    .parameter
    .parameter

    .prologue
    const-wide v4, 0x412e848000000000L

    .line 3
    iget-wide v0, p2, Lcom/whatsapp/sz;->q:D

    mul-double/2addr v0, v4

    iget-wide v2, p1, Lcom/whatsapp/sz;->q:D

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    check-cast p1, Lcom/whatsapp/sz;

    check-cast p2, Lcom/whatsapp/sz;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/ku;->a(Lcom/whatsapp/sz;Lcom/whatsapp/sz;)I

    move-result v0

    return v0
.end method
