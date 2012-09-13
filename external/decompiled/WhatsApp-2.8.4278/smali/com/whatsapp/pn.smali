.class Lcom/whatsapp/pn;
.super Ljava/lang/Object;
.source "pn.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/ze;


# direct methods
.method constructor <init>(Lcom/whatsapp/ze;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/pn;->a:Lcom/whatsapp/ze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/pn;->a:Lcom/whatsapp/ze;

    invoke-virtual {v0}, Lcom/whatsapp/ze;->d()V

    .line 3
    return-void
.end method
