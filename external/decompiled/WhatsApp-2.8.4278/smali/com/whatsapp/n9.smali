.class Lcom/whatsapp/n9;
.super Ljava/lang/Thread;
.source "n9.java"


# instance fields
.field a:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/whatsapp/n9;->a:Landroid/os/Handler;

    .line 3
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 5
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    invoke-static {v0}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    iget-object v0, p0, Lcom/whatsapp/n9;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 8
    :goto_0
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/n9;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
