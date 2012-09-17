.class public Lcom/whatsapp/xu;
.super Lcom/whatsapp/wu;
.source "xu.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/whatsapp/wu;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 3
    .parameter

    .prologue
    const/4 v1, 0x2

    const/4 v0, 0x1

    .line 5
    rem-int/lit8 v2, p1, 0x64

    .line 11
    if-nez p1, :cond_0

    .line 13
    :goto_0
    return v0

    .line 9
    :cond_0
    if-ne p1, v0, :cond_1

    move v0, v1

    .line 2
    goto :goto_0

    .line 1
    :cond_1
    if-ne p1, v1, :cond_2

    .line 10
    const/4 v0, 0x4

    goto :goto_0

    .line 6
    :cond_2
    const/4 v0, 0x3

    if-lt v2, v0, :cond_3

    const/16 v0, 0xa

    if-gt v2, v0, :cond_3

    .line 3
    const/16 v0, 0x8

    goto :goto_0

    .line 7
    :cond_3
    const/16 v0, 0xb

    if-lt v2, v0, :cond_4

    const/16 v0, 0x63

    if-gt v2, v0, :cond_4

    .line 13
    const/16 v0, 0x10

    goto :goto_0

    .line 4
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method
