.class final Lcom/whatsapp/e9;
.super Ljava/lang/Thread;
.source "e9.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/whatsapp/accountsync/PerformSyncManager;->a()V

    .line 3
    return-void
.end method
