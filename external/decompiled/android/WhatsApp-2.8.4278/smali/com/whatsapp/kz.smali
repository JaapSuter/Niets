.class public Lcom/whatsapp/kz;
.super Ljava/lang/Object;
.source "kz.java"

# interfaces
.implements Lcom/whatsapp/g1;


# instance fields
.field private a:Lub;

.field private b:Lpb;

.field private c:Lub;

.field private d:Lpb;


# direct methods
.method public constructor <init>([B[B)V
    .locals 9
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    const/16 v3, 0x100

    const/4 v2, 0x0

    sget-boolean v7, Lcom/whatsapp/nz;->b:Z

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v0, p0, Lcom/whatsapp/kz;->a:Lub;

    .line 15
    iput-object v0, p0, Lcom/whatsapp/kz;->b:Lpb;

    .line 30
    iput-object v0, p0, Lcom/whatsapp/kz;->c:Lub;

    .line 34
    iput-object v0, p0, Lcom/whatsapp/kz;->d:Lpb;

    .line 11
    const/16 v0, 0x10

    const/16 v1, 0x14

    invoke-static {p1, p2, v0, v1}, Lcom/whatsapp/kz;->a([B[BII)[B

    move-result-object v8

    .line 21
    new-array v1, v3, [B

    .line 29
    new-instance v0, Lnb;

    invoke-direct {v0}, Lnb;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/kz;->c:Lub;

    .line 2
    iget-object v0, p0, Lcom/whatsapp/kz;->c:Lub;

    new-instance v4, Lrb;

    invoke-direct {v4, v8}, Lrb;-><init>([B)V

    invoke-interface {v0, v6, v4}, Lub;->a(ZLjb;)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/kz;->c:Lub;

    move-object v4, v1

    move v5, v2

    invoke-interface/range {v0 .. v5}, Lub;->a([BII[BI)V

    .line 36
    new-instance v0, Lqb;

    new-instance v1, Lmb;

    invoke-direct {v1}, Lmb;-><init>()V

    invoke-direct {v0, v1}, Lqb;-><init>(Lkb;)V

    iput-object v0, p0, Lcom/whatsapp/kz;->d:Lpb;

    .line 8
    iget-object v0, p0, Lcom/whatsapp/kz;->d:Lpb;

    new-instance v1, Lrb;

    invoke-direct {v1, v8}, Lrb;-><init>([B)V

    invoke-interface {v0, v1}, Lpb;->a(Ljb;)V

    .line 25
    new-array v1, v3, [B

    .line 9
    new-instance v0, Lnb;

    invoke-direct {v0}, Lnb;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/kz;->a:Lub;

    .line 37
    iget-object v0, p0, Lcom/whatsapp/kz;->a:Lub;

    new-instance v4, Lrb;

    invoke-direct {v4, v8}, Lrb;-><init>([B)V

    invoke-interface {v0, v6, v4}, Lub;->a(ZLjb;)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/kz;->a:Lub;

    move-object v4, v1

    move v5, v2

    invoke-interface/range {v0 .. v5}, Lub;->a([BII[BI)V

    .line 24
    new-instance v0, Lqb;

    new-instance v1, Lmb;

    invoke-direct {v1}, Lmb;-><init>()V

    invoke-direct {v0, v1}, Lqb;-><init>(Lkb;)V

    iput-object v0, p0, Lcom/whatsapp/kz;->b:Lpb;

    .line 7
    iget-object v0, p0, Lcom/whatsapp/kz;->b:Lpb;

    new-instance v1, Lrb;

    invoke-direct {v1, v8}, Lrb;-><init>([B)V

    invoke-interface {v0, v1}, Lpb;->a(Ljb;)V

    .line 14
    sget v0, Lcom/whatsapp/App;->wc:I

    if-eqz v0, :cond_0

    if-eqz v7, :cond_1

    :goto_0
    sput-boolean v2, Lcom/whatsapp/nz;->b:Z

    :cond_0
    return-void

    :cond_1
    move v2, v6

    goto :goto_0
.end method

.method private static a([B[BII)[B
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 10
    new-instance v0, Ltb;

    invoke-direct {v0}, Ltb;-><init>()V

    .line 33
    invoke-virtual {v0, p0, p1, p2}, Lsb;->a([B[BI)V

    .line 26
    mul-int/lit8 v1, p3, 0x8

    invoke-virtual {v0, v1}, Lsb;->a(I)Ljb;

    move-result-object v0

    check-cast v0, Lrb;

    .line 27
    invoke-virtual {v0}, Lrb;->a()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a([BII)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 19
    iget-object v0, p0, Lcom/whatsapp/kz;->a:Lub;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p1

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lub;->a([BII[BI)V

    .line 35
    iget-object v0, p0, Lcom/whatsapp/kz;->b:Lpb;

    invoke-interface {v0, p1, p2, p3}, Lpb;->a([BII)V

    .line 20
    return-void
.end method

.method public a()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/kz;->b:Lpb;

    invoke-interface {v0}, Lpb;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 6
    iget-object v1, p0, Lcom/whatsapp/kz;->b:Lpb;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lpb;->a([BI)I

    .line 3
    return-object v0
.end method

.method public b([BII)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 16
    iget-object v0, p0, Lcom/whatsapp/kz;->d:Lpb;

    invoke-interface {v0, p1, p2, p3}, Lpb;->a([BII)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/kz;->c:Lub;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p1

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lub;->a([BII[BI)V

    .line 17
    return-void
.end method

.method public b()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 22
    iget-object v0, p0, Lcom/whatsapp/kz;->d:Lpb;

    invoke-interface {v0}, Lpb;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 5
    iget-object v1, p0, Lcom/whatsapp/kz;->d:Lpb;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lpb;->a([BI)I

    .line 23
    return-object v0
.end method
