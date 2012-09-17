.class public abstract Lsb;
.super Ljava/lang/Object;
.source "sb.java"


# instance fields
.field protected a:[B

.field protected b:[B

.field protected c:I


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    return-void
.end method


# virtual methods
.method public abstract a(I)Ljb;
.end method

.method public a([B[BI)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    sget v0, Lac;->a:I

    .line 4
    iput-object p1, p0, Lsb;->a:[B

    .line 3
    iput-object p2, p0, Lsb;->b:[B

    .line 2
    iput p3, p0, Lsb;->c:I

    .line 1
    if-eqz v0, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_0
    return-void
.end method
