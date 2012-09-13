.class final Lcom/whatsapp/billing/n;
.super Ljava/lang/Object;
.source "n.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Lcom/whatsapp/billing/b;

.field final e:J

.field final f:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/billing/b;JLjava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/billing/n;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/whatsapp/billing/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/whatsapp/billing/n;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/whatsapp/billing/n;->d:Lcom/whatsapp/billing/b;

    iput-wide p5, p0, Lcom/whatsapp/billing/n;->e:J

    iput-object p7, p0, Lcom/whatsapp/billing/n;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    sget v7, Lcom/whatsapp/billing/i;->b:I

    .line 6
    new-instance v0, Lcom/whatsapp/billing/j;

    iget-object v1, p0, Lcom/whatsapp/billing/n;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/whatsapp/billing/j;-><init>(Landroid/content/Context;)V

    .line 2
    iget-object v1, p0, Lcom/whatsapp/billing/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/billing/n;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/billing/n;->d:Lcom/whatsapp/billing/b;

    iget-wide v4, p0, Lcom/whatsapp/billing/n;->e:J

    iget-object v6, p0, Lcom/whatsapp/billing/n;->f:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/whatsapp/billing/j;->b(Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/billing/b;JLjava/lang/String;)I

    move-result v3

    .line 7
    invoke-virtual {v0}, Lcom/whatsapp/billing/j;->a()V

    .line 4
    const-class v8, Lcom/whatsapp/billing/m;

    monitor-enter v8

    .line 9
    :try_start_0
    invoke-static {}, Lcom/whatsapp/billing/m;->a()Lcom/whatsapp/billing/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/whatsapp/billing/m;->a()Lcom/whatsapp/billing/k;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/billing/n;->d:Lcom/whatsapp/billing/b;

    iget-object v2, p0, Lcom/whatsapp/billing/n;->c:Ljava/lang/String;

    iget-wide v4, p0, Lcom/whatsapp/billing/n;->e:J

    iget-object v6, p0, Lcom/whatsapp/billing/n;->f:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/whatsapp/billing/k;->b(Lcom/whatsapp/billing/b;Ljava/lang/String;IJLjava/lang/String;)V

    .line 3
    :cond_0
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    sget v0, Lcom/whatsapp/App;->wc:I

    if-eqz v0, :cond_1

    add-int/lit8 v0, v7, 0x1

    sput v0, Lcom/whatsapp/billing/i;->b:I

    :cond_1
    return-void

    .line 3
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
