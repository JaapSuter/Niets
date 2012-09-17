.class final Lcom/whatsapp/t8;
.super Ljava/lang/Thread;
.source "t8.java"


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Z

.field final c:Landroid/os/Handler;

.field final d:Landroid/app/Activity;

.field final e:I

.field final f:I


# direct methods
.method constructor <init>(Lcom/whatsapp/zq;ZLandroid/os/Handler;Landroid/app/Activity;II)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/t8;->a:Lcom/whatsapp/zq;

    iput-boolean p2, p0, Lcom/whatsapp/t8;->b:Z

    iput-object p3, p0, Lcom/whatsapp/t8;->c:Landroid/os/Handler;

    iput-object p4, p0, Lcom/whatsapp/t8;->d:Landroid/app/Activity;

    iput p5, p0, Lcom/whatsapp/t8;->e:I

    iput p6, p0, Lcom/whatsapp/t8;->f:I

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 2
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/t8;->a:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whatsapp/t8;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/fq;->a(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/t8;->c:Landroid/os/Handler;

    new-instance v2, Lcom/whatsapp/kn;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/kn;-><init>(Lcom/whatsapp/t8;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1
    return-void
.end method
