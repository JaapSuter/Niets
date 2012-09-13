.class public Lrb;
.super Ljava/lang/Object;
.source "rb.java"

# interfaces
.implements Ljb;


# static fields
.field public static b:Z


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 3
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v1, Lrb;->b:Z

    .line 4
    array-length v2, p1

    invoke-direct {p0, p1, v0, v2}, Lrb;-><init>([BII)V

    .line 7
    sget v2, Lcom/whatsapp/App;->wc:I

    if-eqz v2, :cond_0

    if-eqz v1, :cond_1

    :goto_0
    sput-boolean v0, Lrb;->b:Z

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public constructor <init>([BII)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lrb;->b:Z

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-array v1, p3, [B

    iput-object v1, p0, Lrb;->a:[B

    .line 6
    iget-object v1, p0, Lrb;->a:[B

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    if-eqz v0, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_0
    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lrb;->a:[B

    return-object v0
.end method
