.class Lcom/whatsapp/g0;
.super Lcom/whatsapp/xz;
.source "g0.java"


# instance fields
.field final a:Lcom/whatsapp/qz;


# direct methods
.method constructor <init>(Lcom/whatsapp/qz;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/g0;->a:Lcom/whatsapp/qz;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/g0;->a:Lcom/whatsapp/qz;

    invoke-static {v1, p1, v0}, Lcom/whatsapp/qz;->a(Lcom/whatsapp/qz;Lcom/whatsapp/c1;Ljava/util/Vector;)V

    .line 3
    iget-object v1, p0, Lcom/whatsapp/g0;->a:Lcom/whatsapp/qz;

    iget-object v1, v1, Lcom/whatsapp/qz;->k:Lcom/whatsapp/vz;

    invoke-interface {v1, v0}, Lcom/whatsapp/vz;->a(Ljava/util/Vector;)V

    .line 2
    return-void
.end method
