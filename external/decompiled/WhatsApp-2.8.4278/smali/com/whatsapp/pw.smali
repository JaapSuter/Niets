.class Lcom/whatsapp/pw;
.super Ljava/lang/Object;
.source "pw.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/ow;


# direct methods
.method constructor <init>(Lcom/whatsapp/ow;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/pw;->a:Lcom/whatsapp/ow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/pw;->a:Lcom/whatsapp/ow;

    invoke-virtual {v0}, Lcom/whatsapp/ow;->b()V

    .line 3
    return-void
.end method
