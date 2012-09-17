.class public Lcom/whatsapp/pj;
.super Ljava/lang/Object;
.source "pj.java"


# static fields
.field private static c:I

.field private static d:F


# instance fields
.field private a:Lcom/whatsapp/p8;

.field private b:Lcom/whatsapp/rj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/pj;->c:I

    .line 39
    const/high16 v0, -0x4080

    sput v0, Lcom/whatsapp/pj;->d:F

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    .line 7
    new-instance v0, Lcom/whatsapp/rj;

    invoke-direct {v0, p0}, Lcom/whatsapp/rj;-><init>(Lcom/whatsapp/pj;)V

    iput-object v0, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    .line 3
    sget v0, Lcom/whatsapp/pj;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 36
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0004

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    sput v0, Lcom/whatsapp/pj;->c:I

    .line 19
    :cond_0
    sget v0, Lcom/whatsapp/pj;->d:F

    const/high16 v1, -0x4080

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->L:F

    sput v0, Lcom/whatsapp/pj;->d:F

    .line 28
    :cond_1
    return-void
.end method

.method static a(Lcom/whatsapp/pj;)Lcom/whatsapp/rj;
    .locals 1
    .parameter

    .prologue
    .line 15
    iget-object v0, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    return-object v0
.end method

.method static b()I
    .locals 1

    .prologue
    .line 27
    sget v0, Lcom/whatsapp/pj;->c:I

    return v0
.end method

.method private b(Lcom/whatsapp/zq;Landroid/widget/ImageView;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 20
    iget-object v0, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    invoke-virtual {v0, p2}, Lcom/whatsapp/rj;->a(Landroid/widget/ImageView;)V

    .line 8
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    new-instance v0, Lcom/whatsapp/sj;

    invoke-direct {v0, p0, p1, p2}, Lcom/whatsapp/sj;-><init>(Lcom/whatsapp/pj;Lcom/whatsapp/zq;Landroid/widget/ImageView;)V

    .line 1
    iget-object v1, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    invoke-static {v1}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1

    .line 26
    :try_start_1
    iget-object v2, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    invoke-static {v2}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/util/Stack;->add(ILjava/lang/Object;)V

    .line 33
    iget-object v0, p0, Lcom/whatsapp/pj;->b:Lcom/whatsapp/rj;

    invoke-static {v0}, Lcom/whatsapp/rj;->a(Lcom/whatsapp/rj;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 42
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    iget-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    if-nez v0, :cond_0

    .line 12
    new-instance v0, Lcom/whatsapp/p8;

    invoke-direct {v0, p0}, Lcom/whatsapp/p8;-><init>(Lcom/whatsapp/pj;)V

    iput-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    .line 11
    iget-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/whatsapp/p8;->setPriority(I)V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    invoke-virtual {v0}, Lcom/whatsapp/p8;->start()V

    .line 22
    :cond_0
    return-void

    .line 8
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 42
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method static c()F
    .locals 1

    .prologue
    .line 38
    sget v0, Lcom/whatsapp/pj;->d:F

    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    invoke-virtual {v0}, Lcom/whatsapp/p8;->interrupt()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/pj;->a:Lcom/whatsapp/p8;

    .line 18
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/zq;Landroid/widget/ImageView;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 35
    invoke-virtual {p1}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 13
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whatsapp/zq;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 43
    :cond_0
    :goto_0
    return-void

    .line 40
    :cond_1
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 24
    sget-object v1, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 37
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 21
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 6
    :cond_2
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whatsapp/zq;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    iget-boolean v0, p1, Lcom/whatsapp/zq;->n:Z

    if-eqz v0, :cond_0

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/pj;->b(Lcom/whatsapp/zq;Landroid/widget/ImageView;)V

    goto :goto_0
.end method
