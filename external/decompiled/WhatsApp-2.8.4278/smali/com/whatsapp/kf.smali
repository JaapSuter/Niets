.class public Lcom/whatsapp/kf;
.super Ljava/io/ByteArrayOutputStream;
.source "kf.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 2
    iget v0, p0, Lcom/whatsapp/kf;->count:I

    return v0
.end method

.method public b()[B
    .locals 1

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/kf;->buf:[B

    return-object v0
.end method
