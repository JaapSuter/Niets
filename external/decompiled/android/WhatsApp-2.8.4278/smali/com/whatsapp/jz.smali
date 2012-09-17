.class public Lcom/whatsapp/jz;
.super Ljava/lang/Object;
.source "jz.java"

# interfaces
.implements Lcom/whatsapp/i1;


# instance fields
.field a:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whatsapp/jz;->a:Ljava/security/MessageDigest;

    .line 4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/jz;->a:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 8
    return-void
.end method

.method public a([B)V
    .locals 1
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/jz;->a:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 2
    return-void
.end method

.method public b()[B
    .locals 1

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/jz;->a:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    return-object v0
.end method
