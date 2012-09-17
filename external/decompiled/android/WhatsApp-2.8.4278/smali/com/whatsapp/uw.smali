.class Lcom/whatsapp/uw;
.super Ljava/lang/Object;
.source "uw.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Landroid/graphics/Bitmap;

.field final b:Lcom/whatsapp/tw;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v4, 0x4e

    const/16 v1, 0x4c

    const/16 v2, 0x24

    const/4 v3, 0x2

    const/4 v6, 0x0

    new-array v9, v3, [Ljava/lang/String;

    const-string v0, "!Af\';\u0013Cc\"6)V{\u00113!Ee+u/El 58\u0004d\'4(\u0004t\'?;\u001e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v8, 0x1

    const-string v0, "?Avn,%Aut"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/uw;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x5a

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    move v0, v3

    goto :goto_2

    :pswitch_3
    move v0, v4

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x5a

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    move v0, v3

    goto :goto_3

    :pswitch_7
    move v0, v4

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/tw;Landroid/graphics/Bitmap;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iput-object p2, p0, Lcom/whatsapp/uw;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v5, 0x1

    .line 2
    iget-object v0, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget-object v0, v0, Lcom/whatsapp/tw;->e:Lcom/whatsapp/MediaGalleryImageView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaGalleryImageView;->debug:Z

    if-eqz v0, :cond_0

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/uw;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget v1, v1, Lcom/whatsapp/tw;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 10
    :cond_0
    sget-object v0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    if-eqz v0, :cond_1

    .line 8
    sget-object v0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    iget-object v0, v0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget v1, v1, Lcom/whatsapp/tw;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 5
    if-nez v0, :cond_2

    .line 19
    :cond_1
    :goto_0
    return-void

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget-object v1, v1, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v1}, Lcom/whatsapp/uz;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/MediaGalleryImageView;

    .line 9
    if-nez v0, :cond_3

    .line 1
    iget-object v0, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget-object v0, v0, Lcom/whatsapp/tw;->e:Lcom/whatsapp/MediaGalleryImageView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaGalleryImageView;->debug:Z

    if-eqz v0, :cond_1

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/uw;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget v1, v1, Lcom/whatsapp/tw;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 20
    :cond_3
    iget-object v1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget-object v1, v1, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    iget-byte v1, v1, Lcom/whatsapp/sz;->l:B

    const/4 v2, 0x3

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget-object v1, v1, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    iget-wide v1, v1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_6

    .line 13
    iget-object v1, p0, Lcom/whatsapp/uw;->a:Landroid/graphics/Bitmap;

    .line 6
    sget-object v2, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    invoke-static {v2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    .line 16
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget v4, v2, Lcom/whatsapp/j4;->X:I

    if-ne v3, v4, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget v4, v2, Lcom/whatsapp/j4;->X:I

    if-eq v3, v4, :cond_5

    .line 21
    :cond_4
    iget v3, v2, Lcom/whatsapp/j4;->X:I

    iget v2, v2, Lcom/whatsapp/j4;->X:I

    invoke-static {v1, v3, v2, v5}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 12
    :cond_5
    new-instance v2, Lcom/whatsapp/VideoBitmapDrawable;

    sget-object v3, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-object v5, p0, Lcom/whatsapp/uw;->b:Lcom/whatsapp/tw;

    iget-object v5, v5, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    iget-wide v5, v5, Lcom/whatsapp/sz;->m:J

    invoke-static {v4, v5, v6}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v2, v3, v1, v4, v5}, Lcom/whatsapp/VideoBitmapDrawable;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;F)V

    .line 22
    invoke-virtual {v0, v2}, Lcom/whatsapp/MediaGalleryImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 14
    :cond_6
    iget-object v1, p0, Lcom/whatsapp/uw;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/whatsapp/MediaGalleryImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0
.end method
