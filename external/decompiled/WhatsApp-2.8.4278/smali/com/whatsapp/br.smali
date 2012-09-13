.class Lcom/whatsapp/br;
.super Lcom/whatsapp/zq;
.source "br.java"


# instance fields
.field final v:[B

.field final w:Lcom/whatsapp/ViewSharedContactActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/ViewSharedContactActivity;Ljava/lang/String;[B)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/br;->w:Lcom/whatsapp/ViewSharedContactActivity;

    iput-object p3, p0, Lcom/whatsapp/br;->v:[B

    invoke-direct {p0, p2}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Z)Ljava/io/InputStream;
    .locals 2
    .parameter

    .prologue
    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lcom/whatsapp/br;->v:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
