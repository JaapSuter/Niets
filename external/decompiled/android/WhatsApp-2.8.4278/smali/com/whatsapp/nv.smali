.class public Lcom/whatsapp/nv;
.super Lcom/whatsapp/wu;
.source "nv.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Lcom/whatsapp/wu;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x2

    .line 1
    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 5
    :goto_0
    return v0

    .line 6
    :cond_0
    if-ne p1, v0, :cond_1

    .line 2
    const/4 v0, 0x4

    goto :goto_0

    .line 5
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
