.class public Lcom/whatsapp/ev;
.super Lcom/whatsapp/wu;
.source "ev.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Lcom/whatsapp/wu;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 7
    .parameter

    .prologue
    const/16 v6, 0x13

    const/16 v5, 0xb

    const/4 v0, 0x2

    sget v1, Lcom/whatsapp/wu;->b:I

    .line 4
    rem-int/lit8 v2, p1, 0x64

    .line 7
    rem-int/lit8 v3, p1, 0xa

    .line 2
    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    if-lt v2, v5, :cond_0

    if-le v2, v6, :cond_1

    .line 8
    :cond_0
    :goto_0
    return v0

    .line 3
    :cond_1
    if-lt v3, v0, :cond_3

    const/16 v0, 0x9

    if-gt v3, v0, :cond_3

    if-lt v2, v5, :cond_2

    if-le v2, v6, :cond_3

    .line 1
    :cond_2
    const/16 v0, 0x8

    goto :goto_0

    .line 8
    :cond_3
    const/4 v0, 0x0

    if-eqz v1, :cond_0

    sget v1, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/whatsapp/App;->wc:I

    goto :goto_0
.end method
