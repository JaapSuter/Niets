.class Lcom/whatsapp/q9;
.super Ljava/lang/Thread;
.source "q9.java"


# instance fields
.field a:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/q9;->a:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 6
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/q9;->a:Z

    .line 20
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 16
    :try_start_0
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->taskList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 10
    monitor-exit v1

    .line 7
    return-void

    .line 10
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 6

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/whatsapp/q9;->a:Z

    if-nez v0, :cond_3

    .line 11
    const-wide/16 v0, 0x32

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 15
    :cond_1
    :goto_0
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->taskList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/q9;->a:Z

    if-nez v0, :cond_0

    sget v0, Lcom/whatsapp/MediaGallery;->q:I

    if-nez v0, :cond_0

    .line 1
    const/4 v1, 0x0

    .line 14
    :try_start_1
    sget-object v3, Lcom/whatsapp/MediaGalleryImageView;->lock:Ljava/lang/Object;

    monitor-enter v3
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 9
    :try_start_2
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->taskList:Ljava/util/ArrayList;

    sget-object v4, Lcom/whatsapp/MediaGalleryImageView;->taskList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/tw;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 13
    :goto_1
    if-eqz v0, :cond_2

    .line 19
    invoke-virtual {v0}, Lcom/whatsapp/tw;->run()V

    .line 22
    :cond_2
    if-eqz v2, :cond_1

    .line 8
    :cond_3
    return-void

    .line 21
    :catchall_0
    move-exception v0

    :goto_2
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_0

    .line 2
    :catch_0
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_1

    .line 4
    :catch_1
    move-exception v0

    goto :goto_0

    .line 21
    :catchall_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_2
.end method
