.class public Lcom/whatsapp/ov;
.super Lcom/whatsapp/wu;
.source "ov.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/whatsapp/wu;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x2

    const/4 v0, 0x1

    .line 1
    if-nez p1, :cond_0

    .line 12
    :goto_0
    return v0

    .line 11
    :cond_0
    if-ne p1, v0, :cond_1

    move v0, v1

    .line 3
    goto :goto_0

    .line 8
    :cond_1
    if-ne p1, v1, :cond_2

    .line 12
    const/4 v0, 0x4

    goto :goto_0

    .line 5
    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 4
    const/16 v0, 0x8

    goto :goto_0

    .line 2
    :cond_3
    const/4 v0, 0x6

    if-ne p1, v0, :cond_4

    .line 10
    const/16 v0, 0x10

    goto :goto_0

    .line 9
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method
