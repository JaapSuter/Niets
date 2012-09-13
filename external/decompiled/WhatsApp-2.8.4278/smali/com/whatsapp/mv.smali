.class public Lcom/whatsapp/mv;
.super Lcom/whatsapp/wu;
.source "mv.java"


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
    .locals 2
    .parameter

    .prologue
    const/4 v0, 0x2

    .line 5
    if-ltz p1, :cond_0

    const/4 v1, 0x1

    if-gt p1, v1, :cond_0

    .line 4
    :goto_0
    return v0

    .line 6
    :cond_0
    if-lt p1, v0, :cond_1

    const/16 v0, 0xa

    if-gt p1, v0, :cond_1

    .line 2
    const/16 v0, 0x8

    goto :goto_0

    .line 4
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
