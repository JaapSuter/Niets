.class final Lcom/whatsapp/g9;
.super Ljava/lang/Thread;
.source "g9.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 2
    invoke-static {}, Lcom/whatsapp/xp;->j()Z

    move-result v0

    .line 1
    invoke-static {v0}, Lcom/whatsapp/xp;->a(Z)Z

    .line 4
    return-void
.end method
