.class Lcom/whatsapp/t9;
.super Ljava/lang/Thread;
.source "t9.java"


# instance fields
.field final a:Lcom/whatsapp/s9;


# direct methods
.method constructor <init>(Lcom/whatsapp/s9;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/t9;->a:Lcom/whatsapp/s9;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/whatsapp/accountsync/PerformSyncManager;->a()V

    .line 2
    return-void
.end method
