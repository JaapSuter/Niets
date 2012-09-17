.class Lcom/whatsapp/q0;
.super Lcom/whatsapp/xz;
.source "q0.java"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:Lcom/whatsapp/qz;


# direct methods
.method constructor <init>(Lcom/whatsapp/qz;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/q0;->c:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/q0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/whatsapp/q0;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 3
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/q0;->c:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->j:Lcom/whatsapp/x0;

    iget-object v1, p0, Lcom/whatsapp/q0;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/q0;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/whatsapp/x0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    return-void
.end method
