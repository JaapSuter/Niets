.class Lcom/whatsapp/p8;
.super Ljava/lang/Thread;
.source "p8.java"


# instance fields
.field final a:Lcom/whatsapp/pj;


# direct methods
.method constructor <init>(Lcom/whatsapp/pj;)V
    .locals 0
    .parameter

    .prologue
    .line 12
    iput-object p1, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-static {v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 19
    iget-object v0, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-static {v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-static {v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 8
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-static {v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 15
    iget-object v0, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-static {v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 18
    :try_start_3
    iget-object v0, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    invoke-static {v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sj;

    .line 10
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 14
    :try_start_4
    iget-object v1, v0, Lcom/whatsapp/sj;->a:Lcom/whatsapp/zq;

    invoke-static {}, Lcom/whatsapp/pj;->b()I

    move-result v2

    invoke-static {}, Lcom/whatsapp/pj;->c()F

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 5
    iget-object v2, v0, Lcom/whatsapp/sj;->b:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Lcom/whatsapp/sj;->a:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 13
    new-instance v2, Lcom/whatsapp/qj;

    iget-object v3, p0, Lcom/whatsapp/p8;->a:Lcom/whatsapp/pj;

    iget-object v4, v0, Lcom/whatsapp/sj;->b:Landroid/widget/ImageView;

    iget-object v5, v0, Lcom/whatsapp/sj;->a:Lcom/whatsapp/zq;

    invoke-virtual {v5}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v1, v4, v5}, Lcom/whatsapp/qj;-><init>(Lcom/whatsapp/pj;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 11
    iget-object v0, v0, Lcom/whatsapp/sj;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 7
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    :goto_0
    return-void

    .line 8
    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    .line 2
    :catch_0
    move-exception v0

    goto :goto_0

    .line 10
    :catchall_1
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v0
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0
.end method
