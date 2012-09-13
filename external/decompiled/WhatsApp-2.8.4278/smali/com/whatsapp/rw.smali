.class Lcom/whatsapp/rw;
.super Ljava/lang/Object;
.source "rw.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/MediaGallery;


# direct methods
.method constructor <init>(Lcom/whatsapp/MediaGallery;)V
    .locals 0
    .parameter

    .prologue
    .line 10
    iput-object p1, p0, Lcom/whatsapp/rw;->a:Lcom/whatsapp/MediaGallery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter

    .prologue
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 3
    iget-object v0, p0, Lcom/whatsapp/rw;->a:Lcom/whatsapp/MediaGallery;

    invoke-static {v0}, Lcom/whatsapp/MediaGallery;->a(Lcom/whatsapp/MediaGallery;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/rw;->a:Lcom/whatsapp/MediaGallery;

    invoke-static {v1}, Lcom/whatsapp/MediaGallery;->a(Lcom/whatsapp/MediaGallery;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 1
    add-int/lit8 v1, v1, -0x1

    .line 2
    iget-object v5, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v5}, Lcom/whatsapp/uz;->hashCode()I

    move-result v5

    if-ne v5, v3, :cond_0

    move-object v1, v0

    .line 12
    :goto_0
    iget-object v0, v1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 8
    iget-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    if-nez v2, :cond_1

    .line 7
    invoke-static {v1}, Lcom/whatsapp/App;->a(Lcom/whatsapp/sz;)Ljava/io/File;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/rw;->a:Lcom/whatsapp/MediaGallery;

    iget-object v2, p0, Lcom/whatsapp/rw;->a:Lcom/whatsapp/MediaGallery;

    invoke-static {v2}, Lcom/whatsapp/MediaGallery;->b(Lcom/whatsapp/MediaGallery;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/rw;->a:Lcom/whatsapp/MediaGallery;

    invoke-static {v1, v2, v3}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/sz;Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/MediaGallery;->startActivity(Landroid/content/Intent;)V

    .line 9
    return-void

    :cond_2
    move-object v1, v2

    goto :goto_0
.end method
