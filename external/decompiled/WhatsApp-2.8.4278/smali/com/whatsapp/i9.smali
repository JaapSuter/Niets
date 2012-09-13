.class Lcom/whatsapp/i9;
.super Ljava/lang/Thread;
.source "i9.java"


# instance fields
.field public a:Landroid/os/Handler;

.field final b:Lcom/whatsapp/fq;


# direct methods
.method public constructor <init>(Lcom/whatsapp/fq;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    .line 6
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 5
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 7
    new-instance v0, Lcom/whatsapp/cd;

    invoke-direct {v0, p0}, Lcom/whatsapp/cd;-><init>(Lcom/whatsapp/i9;)V

    iput-object v0, p0, Lcom/whatsapp/i9;->a:Landroid/os/Handler;

    .line 4
    invoke-static {}, Landroid/os/Looper;->loop()V

    .line 2
    return-void
.end method
