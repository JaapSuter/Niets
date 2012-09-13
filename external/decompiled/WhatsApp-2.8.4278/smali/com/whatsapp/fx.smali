.class Lcom/whatsapp/fx;
.super Ljava/lang/Object;
.source "fx.java"

# interfaces
.implements Lcom/whatsapp/gt;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Z

.field private b:I

.field final c:Lcom/whatsapp/MediaView;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x54

    const/16 v2, 0x37

    const/16 v4, 0x12

    const/16 v3, 0x10

    const/4 v6, 0x0

    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "98Sys\"4Rg=7?\u0018cw -Xc=:2\u001ay\u007f5:R"

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

    const/4 v10, 0x1

    const-string v0, "98Sys\"4Rg=7?\u0018cy=-\u0017v{81\u0017``1+\u001762:8Od"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\'8C`}\'4Cy}:"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x3

    const-string v0, "98Sys\"4Rg=7?\u0018`}\'}^~d51^t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/fx;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_4

    :pswitch_1
    const/16 v0, 0x5d

    goto :goto_4

    :pswitch_2
    move v0, v2

    goto :goto_4

    :pswitch_3
    move v0, v3

    goto :goto_4

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_5

    :pswitch_5
    const/16 v0, 0x5d

    goto :goto_5

    :pswitch_6
    move v0, v2

    goto :goto_5

    :pswitch_7
    move v0, v3

    goto :goto_5

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_6

    :pswitch_9
    const/16 v0, 0x5d

    goto :goto_6

    :pswitch_a
    move v0, v2

    goto :goto_6

    :pswitch_b
    move v0, v3

    goto :goto_6

    :cond_3
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_7

    :pswitch_d
    const/16 v0, 0x5d

    goto :goto_7

    :pswitch_e
    move v0, v2

    goto :goto_7

    :pswitch_f
    move v0, v3

    goto :goto_7

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

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/MediaView;)V
    .locals 1
    .parameter

    .prologue
    .line 40
    iput-object p1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/fx;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 71
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->h:Z

    if-eqz v0, :cond_1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->p(Lcom/whatsapp/MediaView;)V

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/MediaView;->a(IZ)V

    .line 47
    return-void
.end method

.method public a(I)V
    .locals 8
    .parameter

    .prologue
    const/4 v5, 0x2

    const/4 v7, 0x1

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 36
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v0, v0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_2

    .line 33
    :cond_0
    sget-object v0, Lcom/whatsapp/fx;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 61
    :cond_1
    return-void

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaView;->T:Z

    if-eqz v0, :cond_3

    .line 1
    sget-object v0, Lcom/whatsapp/fx;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 48
    :cond_3
    iget v0, p0, Lcom/whatsapp/fx;->b:I

    if-ne v0, p1, :cond_4

    if-nez p1, :cond_1

    .line 66
    :cond_4
    iput p1, p0, Lcom/whatsapp/fx;->b:I

    .line 11
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v0, v0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaView;->S:Z

    if-eqz v0, :cond_5

    .line 75
    sget-object v0, Lcom/whatsapp/fx;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    invoke-static {v3, p1, v0}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;ILcom/whatsapp/TouchImageView;)V

    .line 76
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v3}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v3

    invoke-static {v0, v3}, Lcom/whatsapp/MediaView;->c(Lcom/whatsapp/MediaView;I)V

    if-eqz v2, :cond_7

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaView;->V:Z

    if-eqz v0, :cond_6

    .line 69
    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    const/4 v4, 0x0

    invoke-static {v3, p1, v0, v4, v1}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;ILcom/whatsapp/TouchImageView;Lcom/whatsapp/TouchImageView;Z)V

    .line 68
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v3}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v3

    invoke-static {v0, v3}, Lcom/whatsapp/MediaView;->c(Lcom/whatsapp/MediaView;I)V

    .line 16
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0, p1}, Lcom/whatsapp/MediaView;->d(Lcom/whatsapp/MediaView;I)V

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->j(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->k(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->l(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0, p1}, Lcom/whatsapp/MediaView;->e(Lcom/whatsapp/MediaView;I)I

    .line 50
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->n(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    const v4, 0x7f090227

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v6}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    iget-object v6, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v6}, Lcom/whatsapp/MediaView;->m(Lcom/whatsapp/MediaView;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/MediaView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v4}, Lcom/whatsapp/MediaView;->i(Lcom/whatsapp/MediaView;)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    invoke-static {v3, v0}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;Lcom/whatsapp/TouchImageView;)Lcom/whatsapp/TouchImageView;

    .line 26
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 78
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->e()V

    .line 70
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v3}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v3

    iget-object v4, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v4}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whatsapp/TouchImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/TouchImageView;Landroid/graphics/Bitmap;)V

    if-eqz v2, :cond_9

    .line 82
    :cond_8
    sget-object v0, Lcom/whatsapp/fx;->z:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 54
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaView;->V:Z

    if-nez v0, :cond_a

    .line 59
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/MediaView;->a(IZ)V

    .line 55
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 29
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iput-boolean v1, v0, Lcom/whatsapp/TouchImageView;->d:Z

    .line 23
    :cond_b
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;)Landroid/media/MediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-boolean v0, v0, Lcom/whatsapp/MediaView;->V:Z

    if-nez v0, :cond_c

    .line 3
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 35
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-eqz v0, :cond_d

    .line 20
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-virtual {v3}, Lcom/whatsapp/MediaView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v3, v3, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {v0, v3}, Lcom/whatsapp/TouchImageView;->a(I)V

    .line 45
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->c(Lcom/whatsapp/MediaView;)I

    move-result v0

    const/4 v3, 0x5

    if-ne v0, v3, :cond_d

    .line 80
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->d(Lcom/whatsapp/MediaView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    const v4, 0x7f0901f4

    invoke-virtual {v3, v4}, Lcom/whatsapp/MediaView;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 64
    :cond_d
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/GalleryView;->scroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    iget-object v0, v0, Lcom/whatsapp/MediaView;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 4
    add-int/lit8 v0, p1, -0x1

    if-lt v1, v0, :cond_e

    add-int/lit8 v0, p1, 0x1

    if-le v1, v0, :cond_f

    .line 31
    :cond_e
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;)Lcom/whatsapp/GalleryView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GalleryView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/TouchImageView;

    .line 37
    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->b()Z

    .line 53
    :cond_f
    add-int/lit8 v0, v1, 0x1

    if-nez v2, :cond_1

    move v1, v0

    goto :goto_0
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 1
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/TouchImageView;->a(Landroid/view/MotionEvent;)Z

    .line 44
    return-void
.end method

.method public a(Lcom/whatsapp/gw;)V
    .locals 1
    .parameter

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->h:Z

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    :goto_0
    return-void

    .line 79
    :cond_1
    if-eqz p1, :cond_0

    .line 51
    invoke-interface {p1}, Lcom/whatsapp/gw;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->d()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 74
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/TouchImageView;->d()V

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 62
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->q(Lcom/whatsapp/MediaView;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;Z)Z

    .line 60
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    const v1, 0x7f0902d8

    new-instance v2, Lcom/whatsapp/gx;

    invoke-direct {v2, p0}, Lcom/whatsapp/gx;-><init>(Lcom/whatsapp/fx;)V

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/MediaView;->a(ILcom/whatsapp/nr;)V

    .line 5
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 5
    .parameter

    .prologue
    const/high16 v4, 0x3f80

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    .line 63
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0}, Lcom/whatsapp/MediaView;->o(Lcom/whatsapp/MediaView;)Lcom/whatsapp/TouchImageView;

    move-result-object v0

    iget-boolean v0, v0, Lcom/whatsapp/TouchImageView;->h:Z

    if-nez v0, :cond_0

    .line 18
    iget-boolean v0, p0, Lcom/whatsapp/fx;->a:Z

    if-eqz v0, :cond_1

    .line 22
    iput-boolean v3, p0, Lcom/whatsapp/fx;->a:Z

    .line 24
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v1, v4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 34
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->j(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 42
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->k(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->l(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    :goto_0
    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 73
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->j(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 67
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->k(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 58
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->l(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v0, v3}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;I)V

    .line 41
    return-void

    .line 72
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/fx;->a:Z

    .line 57
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v4, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 30
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->j(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->k(Lcom/whatsapp/MediaView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    iget-object v1, p0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-static {v1}, Lcom/whatsapp/MediaView;->l(Lcom/whatsapp/MediaView;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
