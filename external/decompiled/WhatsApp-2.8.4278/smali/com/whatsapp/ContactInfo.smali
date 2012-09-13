.class public Lcom/whatsapp/ContactInfo;
.super Lcom/whatsapp/DialogToastActivity;
.source "ContactInfo.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private f:Lcom/whatsapp/zq;

.field private g:Lcom/whatsapp/ee;

.field private h:Landroid/widget/ImageButton;

.field private i:Landroid/view/View;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private k:Landroid/view/View;

.field private l:Lcom/whatsapp/y;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x37

    const/16 v3, 0x22

    const/16 v1, 0x20

    const/16 v4, 0x1f

    const/4 v6, 0x0

    const/16 v0, 0x8

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "J^F"

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

    const-string v0, "\u0000\u0017"

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

    const-string v0, "CXLkYCCKq^O\u0018Wo\\ACG"

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

    const/4 v10, 0x3

    const-string v0, "CXLkYCCKq^O\u0018FzKTEMf"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "CXLkYCCKq^O\u0018Am]ACG"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "LV[pMThKq^LVVzJ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "AYFmWIS\u000cvVTRLk\u0016ATVvWN\u0019tV}w"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x7

    const-string v0, "CXLi]RDCkQOY\rpHT\u0017QfKTRO?[OYV~[T\u0017NvKT\u0017ApMLS\u0002qWT\u0017DpMNS"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x38

    :goto_8
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_8

    :pswitch_1
    move v0, v2

    goto :goto_8

    :pswitch_2
    move v0, v3

    goto :goto_8

    :pswitch_3
    move v0, v4

    goto :goto_8

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x38

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_9

    :pswitch_5
    move v0, v2

    goto :goto_9

    :pswitch_6
    move v0, v3

    goto :goto_9

    :pswitch_7
    move v0, v4

    goto :goto_9

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x38

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_a

    :pswitch_9
    move v0, v2

    goto :goto_a

    :pswitch_a
    move v0, v3

    goto :goto_a

    :pswitch_b
    move v0, v4

    goto :goto_a

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x38

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_b

    :pswitch_d
    move v0, v2

    goto :goto_b

    :pswitch_e
    move v0, v3

    goto :goto_b

    :pswitch_f
    move v0, v4

    goto :goto_b

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x38

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_c

    :pswitch_11
    move v0, v2

    goto :goto_c

    :pswitch_12
    move v0, v3

    goto :goto_c

    :pswitch_13
    move v0, v4

    goto :goto_c

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x38

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_d

    :pswitch_15
    move v0, v2

    goto :goto_d

    :pswitch_16
    move v0, v3

    goto :goto_d

    :pswitch_17
    move v0, v4

    goto :goto_d

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x38

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_e

    :pswitch_19
    move v0, v2

    goto :goto_e

    :pswitch_1a
    move v0, v3

    goto :goto_e

    :pswitch_1b
    move v0, v4

    goto :goto_e

    :cond_7
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x38

    :goto_f
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_f

    :pswitch_1d
    move v0, v2

    goto :goto_f

    :pswitch_1e
    move v0, v3

    goto :goto_f

    :pswitch_1f
    move v0, v4

    goto :goto_f

    nop

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

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ContactInfo;->j:Ljava/util/ArrayList;

    .line 30
    return-void
.end method

.method static a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 35
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    return-object v0
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    const/16 v1, 0x8

    const/4 v4, 0x1

    .line 22
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->i:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    invoke-static {}, Lcom/whatsapp/App;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 94
    :cond_0
    :goto_0
    return-void

    .line 159
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    .line 33
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 52
    if-eqz p1, :cond_0

    .line 126
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->L:F

    float-to-int v0, v0

    .line 74
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/p;

    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    int-to-float v0, v0

    invoke-direct {v2, v3, p1, v0, v5}, Lcom/whatsapp/p;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;FLjava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 79
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/ContactInfo;Landroid/graphics/Bitmap;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactInfo;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static a(Lcom/whatsapp/ContactInfo;Ljava/util/ArrayList;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 146
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactInfo;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method static a(Lcom/whatsapp/ContactInfo;Ljava/util/List;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 112
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactInfo;->a(Ljava/util/List;)V

    return-void
.end method

.method public static a(Lcom/whatsapp/zq;Landroid/app/Activity;)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 46
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/ContactInfo;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    sget-object v1, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 106
    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 13
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/kj;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v12, 0x8

    const/4 v5, 0x0

    sget-boolean v7, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 65
    const v0, 0x102000a

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    .line 68
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v4, v5

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whatsapp/kj;

    .line 66
    iget-object v3, p0, Lcom/whatsapp/ContactInfo;->j:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v4, v3, :cond_5

    .line 116
    const v3, 0x7f03000c

    invoke-virtual {v1, v3, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 49
    const/4 v6, 0x0

    invoke-virtual {v0, v3, v6, v5}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 129
    iget-object v6, p0, Lcom/whatsapp/ContactInfo;->j:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v6, v3

    .line 131
    :goto_1
    const v3, 0x7f0d0067

    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 160
    const v9, 0x7f0d006c

    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 99
    if-eqz v4, :cond_0

    .line 31
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    if-eqz v7, :cond_1

    .line 72
    :cond_0
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 15
    :cond_1
    iget-object v3, v2, Lcom/whatsapp/kj;->c:Ljava/lang/String;

    if-nez v3, :cond_2

    .line 20
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    if-eqz v7, :cond_3

    .line 141
    :cond_2
    invoke-virtual {v9, v5}, Landroid/view/View;->setVisibility(I)V

    .line 145
    new-instance v3, Lcom/whatsapp/ij;

    invoke-direct {v3, p0, v2}, Lcom/whatsapp/ij;-><init>(Lcom/whatsapp/ContactInfo;Lcom/whatsapp/kj;)V

    invoke-virtual {v9, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    :cond_3
    const v3, 0x7f0d006a

    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 81
    iget-object v9, v2, Lcom/whatsapp/kj;->a:Ljava/lang/String;

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    const v3, 0x7f0d0069

    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 118
    const v9, 0x7f09029e

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    iget-object v11, v2, Lcom/whatsapp/kj;->b:Ljava/lang/String;

    aput-object v11, v10, v5

    invoke-virtual {p0, v9, v10}, Lcom/whatsapp/ContactInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    const v3, 0x7f0d0068

    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v6, Lcom/whatsapp/jj;

    invoke-direct {v6, p0, v2}, Lcom/whatsapp/jj;-><init>(Lcom/whatsapp/ContactInfo;Lcom/whatsapp/kj;)V

    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    add-int/lit8 v2, v4, 0x1

    .line 17
    if-eqz v7, :cond_6

    .line 138
    :cond_4
    return-void

    .line 39
    :cond_5
    iget-object v3, p0, Lcom/whatsapp/ContactInfo;->j:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    move-object v6, v3

    goto :goto_1

    :cond_6
    move v4, v2

    goto/16 :goto_0
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    const v2, 0x7f0d0079

    .line 86
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    invoke-virtual {v0, p1}, Lcom/whatsapp/ee;->a(Ljava/util/List;)V

    .line 58
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    invoke-virtual {v0}, Lcom/whatsapp/ee;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 130
    invoke-virtual {p0, v2}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 42
    :cond_0
    invoke-virtual {p0, v2}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 156
    :cond_1
    return-void
.end method

.method static b(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/ee;
    .locals 1
    .parameter

    .prologue
    .line 61
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    return-object v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 161
    sget-object v0, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    .line 152
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0010

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 154
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->l()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1, v0, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/ContactInfo;->a(Landroid/graphics/Bitmap;)V

    .line 104
    const v0, 0x7f0d0044

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 47
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 144
    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    const v0, 0x7f0d0043

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 115
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    const v0, 0x7f0d0072

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 111
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 87
    :goto_0
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 80
    if-nez v2, :cond_3

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->l:Lcom/whatsapp/y;

    if-eqz v0, :cond_1

    .line 153
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->l:Lcom/whatsapp/y;

    invoke-virtual {v0, v4}, Lcom/whatsapp/y;->cancel(Z)Z

    .line 133
    :cond_1
    new-instance v0, Lcom/whatsapp/y;

    invoke-direct {v0, p0}, Lcom/whatsapp/y;-><init>(Lcom/whatsapp/ContactInfo;)V

    iput-object v0, p0, Lcom/whatsapp/ContactInfo;->l:Lcom/whatsapp/y;

    .line 151
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->l:Lcom/whatsapp/y;

    new-array v1, v5, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/y;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 77
    return-void

    .line 111
    :cond_2
    sget-object v1, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    goto :goto_0

    :cond_3
    move-object v1, v2

    .line 80
    goto :goto_1
.end method

.method static b(Lcom/whatsapp/ContactInfo;Ljava/util/ArrayList;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lcom/whatsapp/ContactInfo;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 11
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v10, 0x2

    const/4 v7, 0x1

    const/16 v9, 0x8

    const/4 v8, 0x3

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 147
    const v0, 0x7f0d0074

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 162
    const v0, 0x7f0d0073

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 71
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 38
    :cond_0
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 136
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    if-eqz v3, :cond_9

    .line 100
    :cond_1
    const v4, 0x7f09028b

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {p0, v4, v5}, Lcom/whatsapp/ContactInfo;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 120
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 165
    new-array v4, v8, [Landroid/widget/ImageView;

    const v0, 0x7f0d0077

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v2

    const v0, 0x7f0d0076

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v7

    const v0, 0x7f0d0075

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v4, v10

    .line 157
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 84
    iget-byte v7, v0, Lcom/whatsapp/sz;->l:B

    if-ne v7, v10, :cond_3

    .line 103
    if-eqz v3, :cond_b

    move-object v1, v0

    .line 45
    :cond_3
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v8, :cond_4

    .line 140
    if-eqz v3, :cond_5

    :cond_4
    :goto_0
    if-eqz v3, :cond_2

    .line 78
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    .line 7
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    move v1, v2

    .line 29
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    array-length v6, v4

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 83
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    aget-object v6, v4, v1

    invoke-static {v0, v6, p0}, Lcom/whatsapp/j5;->a(Lcom/whatsapp/sz;Landroid/widget/ImageView;Landroid/app/Activity;)Landroid/widget/ImageView;

    .line 97
    aget-object v0, v4, v1

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 132
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_a

    .line 123
    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_8
    array-length v1, v4

    if-ge v0, v1, :cond_9

    .line 143
    aget-object v1, v4, v0

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 101
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_8

    .line 125
    :cond_9
    return-void

    :cond_a
    move v1, v0

    goto :goto_1

    :cond_b
    move-object v1, v0

    goto :goto_0
.end method

.method static c(Lcom/whatsapp/ContactInfo;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 48
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->k:Landroid/view/View;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0}, Lcom/whatsapp/ContactInfo;->b()V

    .line 105
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    .line 110
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-direct {p0}, Lcom/whatsapp/ContactInfo;->b()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 88
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 164
    if-eqz v0, :cond_1

    .line 3
    new-instance v1, Lcom/whatsapp/vq;

    invoke-direct {v1, v0}, Lcom/whatsapp/vq;-><init>(Lcom/whatsapp/zq;)V

    .line 85
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    iget-object v0, v0, Lcom/whatsapp/ee;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/whatsapp/zq;->a(Ljava/util/List;Lcom/whatsapp/wq;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    invoke-virtual {v0}, Lcom/whatsapp/ee;->notifyDataSetChanged()V

    .line 5
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const v0, 0x7f0d0043

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 32
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 137
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    const v0, 0x7f03000b

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->setContentView(I)V

    .line 14
    sget-object v0, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 19
    const v0, 0x102000a

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 142
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    .line 93
    const v2, 0x7f03000d

    invoke-virtual {v1, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 70
    const v1, 0x7f0d006f

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    .line 36
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->h:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/fj;

    invoke-direct {v2, p0}, Lcom/whatsapp/fj;-><init>(Lcom/whatsapp/ContactInfo;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    const v1, 0x7f0d006e

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/ContactInfo;->i:Landroid/view/View;

    .line 9
    const v1, 0x7f0d0074

    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/gj;

    invoke-direct {v2, p0}, Lcom/whatsapp/gj;-><init>(Lcom/whatsapp/ContactInfo;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 102
    new-instance v1, Lcom/whatsapp/hj;

    invoke-direct {v1, p0}, Lcom/whatsapp/hj;-><init>(Lcom/whatsapp/ContactInfo;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 107
    new-instance v1, Lcom/whatsapp/ee;

    const v2, 0x7f03004c

    invoke-direct {v1, p0, p0, v2}, Lcom/whatsapp/ee;-><init>(Lcom/whatsapp/ContactInfo;Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    .line 96
    iget-object v1, p0, Lcom/whatsapp/ContactInfo;->g:Lcom/whatsapp/ee;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 117
    invoke-direct {p0, v5}, Lcom/whatsapp/ContactInfo;->a(Ljava/util/List;)V

    .line 59
    invoke-direct {p0, v5}, Lcom/whatsapp/ContactInfo;->b(Ljava/util/ArrayList;)V

    .line 89
    const v0, 0x7f0d005c

    invoke-virtual {p0, v0}, Lcom/whatsapp/ContactInfo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ContactInfo;->k:Landroid/view/View;

    .line 28
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->k:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 124
    invoke-direct {p0}, Lcom/whatsapp/ContactInfo;->b()V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/m5;->b(Ljava/lang/String;)V

    .line 34
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 18
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 40
    const v0, 0x7f09028a

    invoke-interface {p1, v1, v2, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 26
    const v1, 0x7f0203c1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 163
    return v2
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 128
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 148
    sget-object v0, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->l:Lcom/whatsapp/y;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->l:Lcom/whatsapp/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/y;->cancel(Z)Z

    .line 91
    :cond_0
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 76
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/m5;->c(Ljava/lang/String;)V

    .line 37
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4
    .parameter

    .prologue
    .line 113
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 82
    const/4 v0, 0x0

    .line 98
    :goto_0
    return v0

    .line 43
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v0, :cond_1

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/zq;->a(Landroid/content/ContentResolver;)Landroid/net/Uri;

    move-result-object v0

    .line 121
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 41
    invoke-virtual {p0}, Lcom/whatsapp/ContactInfo;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 119
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {p0, v1}, Lcom/whatsapp/ContactInfo;->startActivity(Landroid/content/Intent;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 95
    :cond_0
    sget-object v0, Lcom/whatsapp/ContactInfo;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 127
    invoke-static {}, Lcom/whatsapp/App;->h()V

    .line 98
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 113
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 11
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onResume()V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/ContactInfo;->f:Lcom/whatsapp/zq;

    invoke-static {v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/zq;)V

    .line 108
    return-void
.end method
