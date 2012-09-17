.class Lcom/whatsapp/xr;
.super Ljava/lang/Object;
.source "xr.java"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Lcom/whatsapp/yr;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whatsapp/xr;->a:Ljava/lang/String;

    .line 4
    new-instance v0, Lcom/whatsapp/yr;

    invoke-direct {v0, p2, p3}, Lcom/whatsapp/yr;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    .line 1
    iput-object p4, p0, Lcom/whatsapp/xr;->b:Ljava/lang/String;

    .line 10
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 12
    :cond_0
    :goto_0
    return v0

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v1}, Lcom/whatsapp/yr;->hashCode()I

    move-result v1

    check-cast p1, Lcom/whatsapp/xr;

    iget-object v2, p1, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v2}, Lcom/whatsapp/yr;->hashCode()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 11
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v0}, Lcom/whatsapp/yr;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    iget-object v0, v0, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    return-object v0
.end method
