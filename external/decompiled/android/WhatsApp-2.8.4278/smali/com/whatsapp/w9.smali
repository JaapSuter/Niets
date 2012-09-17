.class Lcom/whatsapp/w9;
.super Ljava/lang/Thread;
.source "w9.java"


# instance fields
.field final a:Lcom/whatsapp/q5;


# direct methods
.method constructor <init>(Lcom/whatsapp/q5;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    sget v2, Lcom/whatsapp/g5;->n:I

    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v0, v0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 18
    iget-object v0, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v0, v0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v0, v0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 12
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v0, v0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 1
    iget-object v0, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v0, v0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 6
    :try_start_3
    iget-object v0, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v0, v0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/t5;

    .line 13
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 8
    :try_start_4
    iget-object v1, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    invoke-static {v1, v0}, Lcom/whatsapp/q5;->a(Lcom/whatsapp/q5;Lcom/whatsapp/t5;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 17
    iget-object v1, v0, Lcom/whatsapp/t5;->d:Lcom/whatsapp/u5;

    if-nez v1, :cond_2

    .line 14
    iget-object v1, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    invoke-static {v1}, Lcom/whatsapp/q5;->a(Lcom/whatsapp/q5;)Ljava/util/HashMap;

    move-result-object v1

    monitor-enter v1
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 4
    :try_start_5
    iget-object v4, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    invoke-static {v4}, Lcom/whatsapp/q5;->a(Lcom/whatsapp/q5;)Ljava/util/HashMap;

    move-result-object v4

    iget-object v5, v0, Lcom/whatsapp/t5;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v2, :cond_3

    .line 23
    :cond_2
    :try_start_6
    iget-object v1, v0, Lcom/whatsapp/t5;->d:Lcom/whatsapp/u5;

    invoke-interface {v1, v3}, Lcom/whatsapp/u5;->a(Landroid/graphics/Bitmap;)V

    .line 10
    :cond_3
    iget-object v1, v0, Lcom/whatsapp/t5;->c:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v4, v0, Lcom/whatsapp/t5;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 9
    new-instance v1, Lcom/whatsapp/r5;

    iget-object v4, p0, Lcom/whatsapp/w9;->a:Lcom/whatsapp/q5;

    iget-object v5, v0, Lcom/whatsapp/t5;->c:Landroid/widget/ImageView;

    iget-object v6, v0, Lcom/whatsapp/t5;->a:Ljava/lang/String;

    invoke-direct {v1, v4, v3, v5, v6}, Lcom/whatsapp/r5;-><init>(Lcom/whatsapp/q5;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 2
    iget-object v0, v0, Lcom/whatsapp/t5;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 22
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 19
    :cond_4
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    :goto_0
    return-void

    .line 12
    :catchall_0
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v0
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0

    .line 7
    :catch_0
    move-exception v0

    goto :goto_0

    .line 13
    :catchall_1
    move-exception v0

    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v0
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0

    .line 15
    :catchall_2
    move-exception v0

    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :try_start_c
    throw v0
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_0
.end method
