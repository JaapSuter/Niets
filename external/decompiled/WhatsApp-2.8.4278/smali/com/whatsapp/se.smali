.class public Lcom/whatsapp/se;
.super Landroid/widget/BaseAdapter;
.source "se.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/whatsapp/aab;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lcom/whatsapp/MediaGallery;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u001az0q\u001c\u0010~8t\u0018\u0005f{j\u0012\u0000?7w\u0008\u0019kn"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/se;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7d

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x77

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x1f

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x54

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x18

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/MediaGallery;)V
    .locals 1
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    .line 77
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/se;->a:I

    .line 88
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/se;->b:Landroid/util/SparseArray;

    .line 84
    return-void
.end method

.method private a(I)Landroid/util/Pair;
    .locals 5
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;>;"
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 34
    const/4 v0, 0x0

    .line 41
    iget-object v2, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v2}, Lcom/whatsapp/MediaGallery;->c(Lcom/whatsapp/MediaGallery;)Ljava/util/TreeMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 72
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v4}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    iget-object v4, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v4}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v4

    div-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x1

    .line 28
    if-gt p1, v3, :cond_1

    .line 53
    if-eqz v1, :cond_2

    .line 36
    :cond_1
    sub-int/2addr p1, v3

    .line 64
    if-eqz v1, :cond_0

    .line 55
    :cond_2
    new-instance v1, Landroid/util/Pair;

    add-int/lit8 v2, p1, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/se;->a:I

    .line 6
    iget-object v0, p0, Lcom/whatsapp/se;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v0}, Lcom/whatsapp/MediaGallery;->c(Lcom/whatsapp/MediaGallery;)Ljava/util/TreeMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 19
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/aab;

    .line 7
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 90
    iget-object v4, p0, Lcom/whatsapp/se;->b:Landroid/util/SparseArray;

    iget v5, p0, Lcom/whatsapp/se;->a:I

    invoke-virtual {v4, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 45
    iget v1, p0, Lcom/whatsapp/se;->a:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v4, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v4}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v0, v0, -0x1

    iget-object v4, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v4}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v4

    div-int/2addr v0, v4

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/se;->a:I

    .line 17
    if-eqz v2, :cond_0

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/se;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/whatsapp/se;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 70
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 9
    iget v0, p0, Lcom/whatsapp/se;->a:I

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/whatsapp/se;->a()V

    .line 11
    :cond_0
    iget v0, p0, Lcom/whatsapp/se;->a:I

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 23
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter

    .prologue
    .line 73
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2
    .parameter

    .prologue
    .line 71
    iget-object v0, p0, Lcom/whatsapp/se;->b:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    const/4 v0, 0x1

    .line 86
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v11, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 51
    invoke-virtual {p0, p1}, Lcom/whatsapp/se;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 22
    if-eqz p2, :cond_1

    .line 48
    check-cast p2, Landroid/widget/LinearLayout;

    .line 32
    invoke-virtual {p2, v11}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object v1, v0

    .line 12
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/se;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/aab;

    invoke-virtual {v0}, Lcom/whatsapp/aab;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    :cond_0
    return-object p2

    .line 31
    :cond_1
    new-instance p2, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-direct {p2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 58
    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->db:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->cb:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->cb:I

    invoke-virtual {p2, v0, v1, v11, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 50
    invoke-virtual {p2, v11}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 66
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 8
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 54
    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->gb:I

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 83
    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->gb:I

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 33
    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->eb:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->fb:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->fb:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v4

    iget v4, v4, Lcom/whatsapp/j4;->fb:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 82
    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    const v1, -0x1f1f20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 60
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 67
    invoke-virtual {p2, v11, v11, v11, v11}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    move-object v1, v0

    goto/16 :goto_0

    .line 40
    :cond_2
    if-eqz p2, :cond_5

    .line 46
    check-cast p2, Landroid/widget/LinearLayout;

    .line 75
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 74
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v5

    .line 18
    invoke-direct {p0, p1}, Lcom/whatsapp/se;->a(I)Landroid/util/Pair;

    move-result-object v1

    .line 63
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    .line 87
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 3
    iget-object v1, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v1}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v1

    mul-int/2addr v1, v6

    move v3, v1

    :goto_2
    add-int/lit8 v1, v6, 0x1

    iget-object v2, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v2}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v2

    mul-int/2addr v1, v2

    if-ge v3, v1, :cond_0

    .line 44
    iget-object v1, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v1}, Lcom/whatsapp/MediaGallery;->d(Lcom/whatsapp/MediaGallery;)I

    move-result v1

    mul-int/2addr v1, v6

    sub-int v7, v3, v1

    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_3

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v3

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;

    .line 21
    if-gt v5, v7, :cond_6

    .line 14
    new-instance v2, Lcom/whatsapp/MediaGalleryImageView;

    iget-object v8, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-direct {v2, v8}, Lcom/whatsapp/MediaGalleryImageView;-><init>(Landroid/content/Context;)V

    .line 59
    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v8}, Lcom/whatsapp/MediaGalleryImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 79
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v9, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v9}, Lcom/whatsapp/MediaGallery;->e(Lcom/whatsapp/MediaGallery;)I

    move-result v9

    iget-object v10, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v10}, Lcom/whatsapp/MediaGallery;->e(Lcom/whatsapp/MediaGallery;)I

    move-result v10

    invoke-direct {v8, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4
    invoke-virtual {v2, v8}, Lcom/whatsapp/MediaGalleryImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v9

    iget v9, v9, Lcom/whatsapp/j4;->ab:F

    float-to-int v9, v9

    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 81
    iget-object v8, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v8}, Lcom/whatsapp/MediaGallery;->f(Lcom/whatsapp/MediaGallery;)Landroid/view/View$OnClickListener;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/whatsapp/MediaGalleryImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1
    const v8, 0x7f020415

    invoke-virtual {v2, v8}, Lcom/whatsapp/MediaGalleryImageView;->setBackgroundResource(I)V

    .line 2
    invoke-virtual {p2, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 61
    :goto_3
    iget-object v8, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-static {v8, v1, p1, v2}, Lcom/whatsapp/MediaGallery;->a(Lcom/whatsapp/MediaGallery;Lcom/whatsapp/sz;ILcom/whatsapp/MediaGalleryImageView;)V

    .line 39
    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v1}, Lcom/whatsapp/uz;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/whatsapp/MediaGalleryImageView;->setTag(Ljava/lang/Object;)V

    .line 56
    iput p1, v2, Lcom/whatsapp/MediaGalleryImageView;->position:I

    .line 16
    if-eqz v4, :cond_4

    .line 24
    :cond_3
    if-le v5, v7, :cond_4

    .line 29
    invoke-virtual {p2, v7}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 57
    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    :cond_4
    add-int/lit8 v1, v3, 0x1

    if-nez v4, :cond_0

    move v3, v1

    goto/16 :goto_2

    .line 37
    :cond_5
    new-instance p2, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/whatsapp/se;->c:Lcom/whatsapp/MediaGallery;

    invoke-direct {p2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 15
    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->db:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->cb:I

    invoke-static {}, Lcom/whatsapp/MediaGallery;->d()Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->cb:I

    invoke-virtual {p2, v0, v1, v11, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 38
    invoke-virtual {p2, v11}, Landroid/widget/LinearLayout;->setClickable(Z)V

    goto/16 :goto_1

    .line 27
    :cond_6
    invoke-virtual {p2, v7}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/whatsapp/MediaGalleryImageView;

    .line 52
    invoke-virtual {v2, v11}, Lcom/whatsapp/MediaGalleryImageView;->setVisibility(I)V

    goto :goto_3
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x2

    return v0
.end method
