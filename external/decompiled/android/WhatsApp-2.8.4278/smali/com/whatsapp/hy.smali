.class Lcom/whatsapp/hy;
.super Ljava/lang/Object;
.source "hy.java"

# interfaces
.implements Lcom/whatsapp/gt;


# instance fields
.field a:Z

.field final b:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 21
    iput-object p1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 14
    invoke-static {}, Lcom/whatsapp/App;->mb()V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->c(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/sz;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->d(Lcom/whatsapp/PopupNotification;)Ljava/util/HashSet;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->c(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/sz;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->f(Lcom/whatsapp/PopupNotification;)Ljava/util/HashSet;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_1
    return-void
.end method

.method public a(I)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 27
    iget-boolean v1, p0, Lcom/whatsapp/hy;->a:Z

    if-eqz v1, :cond_0

    .line 10
    :goto_0
    return-void

    .line 24
    :cond_0
    iput-boolean v4, p0, Lcom/whatsapp/hy;->a:Z

    .line 26
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->a(Lcom/whatsapp/PopupNotification;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v4, :cond_1

    .line 2
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-virtual {v1, v3}, Lcom/whatsapp/PopupNotification;->a(I)V

    if-eqz v0, :cond_4

    .line 25
    :cond_1
    if-nez p1, :cond_2

    .line 12
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->b(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v2}, Lcom/whatsapp/PopupNotification;->a(Lcom/whatsapp/PopupNotification;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 15
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->b(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v2}, Lcom/whatsapp/PopupNotification;->a(Lcom/whatsapp/PopupNotification;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/whatsapp/GalleryView;->c(I)V

    .line 1
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    iget-object v2, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v2}, Lcom/whatsapp/PopupNotification;->a(Lcom/whatsapp/PopupNotification;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Lcom/whatsapp/PopupNotification;->a(I)V

    if-eqz v0, :cond_4

    .line 16
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->a(Lcom/whatsapp/PopupNotification;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-ne p1, v1, :cond_3

    .line 22
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->b(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 9
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->b(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/whatsapp/GalleryView;->c(I)V

    .line 3
    iget-object v1, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    invoke-virtual {v1, v3}, Lcom/whatsapp/PopupNotification;->a(I)V

    if-eqz v0, :cond_4

    .line 20
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/hy;->b:Lcom/whatsapp/PopupNotification;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/PopupNotification;->a(I)V

    .line 11
    :cond_4
    iput-boolean v3, p0, Lcom/whatsapp/hy;->a:Z

    goto/16 :goto_0
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 0
    .parameter

    .prologue
    .line 18
    return-void
.end method

.method public a(Lcom/whatsapp/gw;)V
    .locals 0
    .parameter

    .prologue
    .line 17
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 19
    return-void
.end method

.method public b(I)V
    .locals 0
    .parameter

    .prologue
    .line 23
    return-void
.end method
