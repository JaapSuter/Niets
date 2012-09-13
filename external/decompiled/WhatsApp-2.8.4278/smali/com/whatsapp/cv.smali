.class public Lcom/whatsapp/cv;
.super Lcom/whatsapp/wu;
.source "cv.java"


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

    .line 6
    if-nez p1, :cond_1

    .line 2
    const/4 v0, 0x1

    .line 4
    :cond_0
    :goto_0
    return v0

    .line 5
    :cond_1
    if-lez p1, :cond_2

    if-lt p1, v0, :cond_0

    .line 1
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
