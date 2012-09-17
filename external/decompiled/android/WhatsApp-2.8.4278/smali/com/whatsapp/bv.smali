.class public Lcom/whatsapp/bv;
.super Lcom/whatsapp/wu;
.source "bv.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Lcom/whatsapp/wu;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1
    .parameter

    .prologue
    const/4 v0, 0x2

    .line 2
    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 4
    :goto_0
    return v0

    .line 1
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
