.class public Lcom/whatsapp/sb;
.super Landroid/os/AsyncTask;
.source "sb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lcom/whatsapp/MediaView;


# direct methods
.method public constructor <init>(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method static a(Lcom/whatsapp/sb;)Z
    .locals 1
    .parameter

    .prologue
    .line 5
    iget-boolean v0, p0, Lcom/whatsapp/sb;->a:Z

    return v0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 6
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 24
    new-instance v2, Lcom/whatsapp/kx;

    invoke-direct {v2, p0}, Lcom/whatsapp/kx;-><init>(Lcom/whatsapp/sb;)V

    .line 31
    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v5, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v5}, Lcom/whatsapp/MediaView;->t(Lcom/whatsapp/MediaView;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Lcom/whatsapp/fq;->a(Ljava/lang/String;Lcom/whatsapp/qq;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/whatsapp/sb;->b:Ljava/util/ArrayList;

    move-object v2, v1

    move v1, v0

    .line 42
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/sb;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 26
    iget-object v0, p0, Lcom/whatsapp/sb;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 39
    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0}, Lcom/whatsapp/uz;->hashCode()I

    move-result v0

    iget-object v4, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget v4, v4, Lcom/whatsapp/MediaView;->U:I

    if-ne v0, v4, :cond_0

    .line 18
    iget-object v0, p0, Lcom/whatsapp/sb;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 4
    if-eqz v3, :cond_1

    .line 44
    :cond_0
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_2

    .line 15
    :cond_1
    return-object v2

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/whatsapp/sb;->a:Z

    .line 7
    invoke-virtual {p0, v0}, Lcom/whatsapp/sb;->cancel(Z)Z

    .line 32
    return-void
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x0

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 25
    iget-object v0, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 12
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v4, p0, Lcom/whatsapp/sb;->b:Ljava/util/ArrayList;

    iput-object v4, v1, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    .line 14
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v4, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v4, v4, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v1, v4}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;I)I

    .line 28
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v4}, Lcom/whatsapp/MediaView;->e(Lcom/whatsapp/MediaView;I)I

    .line 38
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    const/4 v4, 0x1

    iput-boolean v4, v1, Lcom/whatsapp/MediaView;->V:Z

    .line 20
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/GalleryView;->removeAllViews()V

    move v1, v2

    .line 40
    :cond_0
    iget-object v4, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v4, v4, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_1

    .line 2
    new-instance v4, Lcom/whatsapp/TouchImageView;

    iget-object v5, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-direct {v4, v5}, Lcom/whatsapp/TouchImageView;-><init>(Landroid/content/Context;)V

    .line 10
    sget-object v5, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v5}, Lcom/whatsapp/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/whatsapp/TouchImageView;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v5, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v5}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/whatsapp/GalleryView;->addView(Landroid/view/View;)V

    .line 13
    add-int/lit8 v1, v1, 0x1

    if-eqz v3, :cond_0

    .line 11
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v1

    if-nez v1, :cond_2

    .line 35
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->v(Lcom/whatsapp/MediaView;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v3, :cond_3

    .line 45
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->v(Lcom/whatsapp/MediaView;)Landroid/widget/ImageView;

    move-result-object v1

    const v4, 0x7f020411

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    :cond_3
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v1

    iget-object v4, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v4, v4, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v1, v4, :cond_4

    .line 30
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->w(Lcom/whatsapp/MediaView;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v3, :cond_5

    .line 23
    :cond_4
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->w(Lcom/whatsapp/MediaView;)Landroid/widget/ImageView;

    move-result-object v1

    const v3, 0x7f020410

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 43
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v1, v1, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 34
    iget-object v3, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    iget-object v4, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v4}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/TouchImageView;

    invoke-static {v3, v1}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;Lcom/whatsapp/TouchImageView;)Lcom/whatsapp/TouchImageView;

    .line 33
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iget-object v3, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v3}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v4}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v4

    invoke-static {v1, v3, v4, v0, v2}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;ILcom/whatsapp/TouchImageView;Lcom/whatsapp/TouchImageView;Z)V

    .line 37
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v1

    iget-object v3, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v3}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/whatsapp/GalleryView;->b(I)V

    .line 22
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v1

    iget-boolean v1, v1, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v1

    iget-boolean v1, v1, Lcom/whatsapp/TouchImageView;->h:Z

    if-nez v1, :cond_6

    .line 21
    iget-object v1, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/whatsapp/TouchImageView;->a(Lcom/whatsapp/TouchImageView;)V

    .line 27
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    const v1, 0x7f0d0139

    invoke-virtual {v0, v1}, Lcom/whatsapp/MediaView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->n(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    iget-object v0, p0, Lcom/whatsapp/sb;->c:Lcom/whatsapp/MediaView;

    iput-boolean v2, v0, Lcom/whatsapp/MediaView;->V:Z

    .line 1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 9
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/sb;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 29
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/sb;->a(Ljava/lang/Integer;)V

    return-void
.end method
