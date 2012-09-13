.class public abstract Llb;
.super Ljava/lang/Object;
.source "lb.java"

# interfaces
.implements Lob;


# static fields
.field public static d:Z


# instance fields
.field private a:[B

.field private b:I

.field private c:J


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Llb;->a:[B

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Llb;->b:I

    .line 26
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 8
    const/16 v0, 0x40

    return v0
.end method

.method public a()V
    .locals 4

    .prologue
    sget-boolean v0, Llb;->d:Z

    .line 5
    iget-wide v1, p0, Llb;->c:J

    const/4 v3, 0x3

    shl-long/2addr v1, v3

    .line 3
    const/16 v3, -0x80

    invoke-virtual {p0, v3}, Llb;->a(B)V

    .line 33
    :cond_0
    iget v3, p0, Llb;->b:I

    if-eqz v3, :cond_1

    .line 32
    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Llb;->a(B)V

    if-eqz v0, :cond_0

    .line 9
    :cond_1
    invoke-virtual {p0, v1, v2}, Llb;->a(J)V

    .line 31
    invoke-virtual {p0}, Llb;->b()V

    .line 2
    return-void
.end method

.method public a(B)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 29
    iget-object v0, p0, Llb;->a:[B

    iget v1, p0, Llb;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Llb;->b:I

    aput-byte p1, v0, v1

    .line 12
    iget v0, p0, Llb;->b:I

    iget-object v1, p0, Llb;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 34
    iget-object v0, p0, Llb;->a:[B

    invoke-virtual {p0, v0, v3}, Llb;->a([BI)V

    .line 27
    iput v3, p0, Llb;->b:I

    .line 25
    :cond_0
    iget-wide v0, p0, Llb;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Llb;->c:J

    .line 10
    return-void
.end method

.method protected abstract a(J)V
.end method

.method protected abstract a([BI)V
.end method

.method public a([BII)V
    .locals 5
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Llb;->d:Z

    .line 20
    :cond_0
    iget v1, p0, Llb;->b:I

    if-eqz v1, :cond_1

    if-lez p3, :cond_1

    .line 28
    aget-byte v1, p1, p2

    invoke-virtual {p0, v1}, Llb;->a(B)V

    .line 37
    add-int/lit8 p2, p2, 0x1

    .line 15
    add-int/lit8 p3, p3, -0x1

    if-eqz v0, :cond_0

    .line 18
    :cond_1
    iget-object v1, p0, Llb;->a:[B

    array-length v1, v1

    if-le p3, v1, :cond_2

    .line 17
    invoke-virtual {p0, p1, p2}, Llb;->a([BI)V

    .line 22
    iget-object v1, p0, Llb;->a:[B

    array-length v1, v1

    add-int/2addr p2, v1

    .line 36
    iget-object v1, p0, Llb;->a:[B

    array-length v1, v1

    sub-int/2addr p3, v1

    .line 16
    iget-wide v1, p0, Llb;->c:J

    iget-object v3, p0, Llb;->a:[B

    array-length v3, v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Llb;->c:J

    if-eqz v0, :cond_1

    .line 1
    :cond_2
    if-lez p3, :cond_3

    .line 38
    aget-byte v1, p1, p2

    invoke-virtual {p0, v1}, Llb;->a(B)V

    .line 21
    add-int/lit8 p2, p2, 0x1

    .line 14
    add-int/lit8 p3, p3, -0x1

    if-eqz v0, :cond_2

    .line 4
    :cond_3
    return-void
.end method

.method protected abstract b()V
.end method

.method public c()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Llb;->d:Z

    .line 7
    const-wide/16 v3, 0x0

    iput-wide v3, p0, Llb;->c:J

    .line 11
    iput v1, p0, Llb;->b:I

    move v0, v1

    .line 13
    :cond_0
    iget-object v3, p0, Llb;->a:[B

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 23
    iget-object v3, p0, Llb;->a:[B

    aput-byte v1, v3, v0

    .line 35
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 19
    :cond_1
    return-void
.end method
