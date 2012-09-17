.class public Lcom/whatsapp/vq;
.super Ljava/lang/Object;
.source "vq.java"

# interfaces
.implements Lcom/whatsapp/wq;


# instance fields
.field private a:Lcom/whatsapp/zq;


# direct methods
.method public constructor <init>(Lcom/whatsapp/zq;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    .line 11
    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/zq;)Z
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 3
    .line 4
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    if-ne v2, p1, :cond_0

    .line 6
    :goto_0
    return v1

    .line 1
    :cond_0
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 10
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget-boolean v2, v2, Lcom/whatsapp/zq;->n:Z

    iput-boolean v2, p1, Lcom/whatsapp/zq;->n:Z

    .line 13
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->o:I

    if-lez v2, :cond_1

    iget v2, p1, Lcom/whatsapp/zq;->o:I

    iget-object v3, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->o:I

    if-ne v2, v3, :cond_4

    :cond_1
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->p:I

    if-lez v2, :cond_2

    iget v2, p1, Lcom/whatsapp/zq;->p:I

    iget-object v3, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->p:I

    if-ne v2, v3, :cond_4

    :cond_2
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->o:I

    if-gez v2, :cond_3

    iget v2, p1, Lcom/whatsapp/zq;->o:I

    if-gez v2, :cond_4

    :cond_3
    iget-object v2, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->p:I

    if-gez v2, :cond_5

    iget v2, p1, Lcom/whatsapp/zq;->p:I

    if-ltz v2, :cond_5

    :cond_4
    move v0, v1

    .line 7
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->o:I

    iput v1, p1, Lcom/whatsapp/zq;->o:I

    .line 8
    iget-object v1, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->p:I

    iput v1, p1, Lcom/whatsapp/zq;->p:I

    .line 9
    iget-object v1, p0, Lcom/whatsapp/vq;->a:Lcom/whatsapp/zq;

    iget-wide v1, v1, Lcom/whatsapp/zq;->q:J

    iput-wide v1, p1, Lcom/whatsapp/zq;->q:J

    :cond_6
    move v1, v0

    .line 6
    goto :goto_0
.end method
