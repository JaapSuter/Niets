.class Lcom/whatsapp/kx;
.super Ljava/lang/Object;
.source "kx.java"

# interfaces
.implements Lcom/whatsapp/qq;


# instance fields
.field final a:Lcom/whatsapp/sb;


# direct methods
.method constructor <init>(Lcom/whatsapp/sb;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/kx;->a:Lcom/whatsapp/sb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/kx;->a:Lcom/whatsapp/sb;

    invoke-static {v0}, Lcom/whatsapp/sb;->a(Lcom/whatsapp/sb;)Z

    move-result v0

    return v0
.end method
