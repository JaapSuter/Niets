.class final Lcom/whatsapp/ph;
.super Ljava/lang/Object;
.source "ph.java"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0}, Lcom/whatsapp/App;->a(ZZ)V

    .line 1
    return-void
.end method
