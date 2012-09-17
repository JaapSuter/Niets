.class Lcom/whatsapp/sh;
.super Ljava/lang/Object;
.source "sh.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/App$15;


# direct methods
.method constructor <init>(Lcom/whatsapp/App$15;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/sh;->a:Lcom/whatsapp/App$15;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/sh;->a:Lcom/whatsapp/App$15;

    iget-object v0, v0, Lcom/whatsapp/App$15;->a:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->y()V

    .line 3
    return-void
.end method
