.class Lcom/whatsapp/x9;
.super Ljava/lang/Thread;
.source "x9.java"


# instance fields
.field final a:Lcom/whatsapp/w5;


# direct methods
.method constructor <init>(Lcom/whatsapp/w5;)V
    .locals 1
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/x9;->a:Lcom/whatsapp/w5;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 5
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/x9;->setPriority(I)V

    .line 4
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/x9;->a:Lcom/whatsapp/w5;

    invoke-virtual {v0}, Lcom/whatsapp/w5;->e()V

    .line 2
    return-void
.end method
