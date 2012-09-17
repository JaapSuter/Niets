.class final Lcom/whatsapp/o9;
.super Ljava/lang/Thread;
.source "o9.java"


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
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/App;->c(Z)V

    .line 1
    return-void
.end method
