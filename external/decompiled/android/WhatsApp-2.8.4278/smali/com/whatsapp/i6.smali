.class Lcom/whatsapp/i6;
.super Ljava/lang/Object;
.source "i6.java"

# interfaces
.implements Lcom/whatsapp/rq;


# instance fields
.field final a:Lcom/whatsapp/ac;


# direct methods
.method constructor <init>(Lcom/whatsapp/ac;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/i6;->a:Lcom/whatsapp/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJII)V
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 4
    int-to-float v0, p6

    long-to-float v1, p1

    long-to-float v2, p3

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 2
    iget-object v1, p0, Lcom/whatsapp/i6;->a:Lcom/whatsapp/ac;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Integer;

    const/4 v3, 0x0

    add-int/2addr v0, p5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/whatsapp/ac;->a(Lcom/whatsapp/ac;[Ljava/lang/Object;)V

    .line 3
    return-void
.end method
