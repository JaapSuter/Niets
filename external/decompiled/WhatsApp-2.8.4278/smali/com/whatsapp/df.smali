.class public final Lcom/whatsapp/df;
.super Lcom/whatsapp/ze;
.source "df.java"


# static fields
.field static M:Ljava/lang/String;

.field private static final N:[Ljava/lang/String;


# instance fields
.field private F:Lcom/whatsapp/MediaData;

.field private G:I

.field private final H:Landroid/widget/TextView;

.field private final I:Landroid/widget/ImageButton;

.field private final J:Landroid/widget/ProgressBar;

.field private K:I

.field private L:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\u00114I"

    invoke-static {v2}, Lcom/whatsapp/df;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/df;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "\n>C"

    invoke-static {v2}, Lcom/whatsapp/df;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/df;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "\u000b2^"

    invoke-static {v2}, Lcom/whatsapp/df;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/df;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "\u00007_\u0008\u0001"

    invoke-static {v2}, Lcom/whatsapp/df;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/df;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/df;->N:[Ljava/lang/String;

    .line 116
    const-string v0, "-\u001c\u0017*LXk"

    .line -1
    invoke-static {v0}, Lcom/whatsapp/df;->z(Ljava/lang/String;)[C

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/df;->z([C)Ljava/lang/String;

    move-result-object v0

    .line 116
    sput-object v0, Lcom/whatsapp/df;->M:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/ze;-><init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    .line 98
    const v0, 0x7f0d00cf

    invoke-virtual {p0, v0}, Lcom/whatsapp/df;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    .line 21
    const v0, 0x7f0d007b

    invoke-virtual {p0, v0}, Lcom/whatsapp/df;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    .line 59
    const v0, 0x7f0d005c

    invoke-virtual {p0, v0}, Lcom/whatsapp/df;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/whatsapp/df;->J:Landroid/widget/ProgressBar;

    .line 38
    iget-object v0, p0, Lcom/whatsapp/df;->J:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 37
    invoke-direct {p0, p2}, Lcom/whatsapp/df;->b(Lcom/whatsapp/sz;)V

    .line 12
    return-void
.end method

.method private static a(I)I
    .locals 1
    .parameter

    .prologue
    const v0, 0x7f0901f4

    .line 34
    packed-switch p0, :pswitch_data_0

    .line 35
    const v0, 0x7f090100

    .line 124
    :pswitch_0
    return v0

    .line 34
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static a(Lcom/whatsapp/df;)Lcom/whatsapp/MediaData;
    .locals 1
    .parameter

    .prologue
    .line 99
    iget-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    return-object v0
.end method

.method private static b(I)I
    .locals 1
    .parameter

    .prologue
    .line 69
    packed-switch p0, :pswitch_data_0

    .line 13
    const v0, 0x7f0900fc

    .line 107
    :goto_0
    return v0

    .line 10
    :pswitch_0
    const v0, 0x7f0900fa

    goto :goto_0

    .line 107
    :pswitch_1
    const v0, 0x7f0900fb

    goto :goto_0

    .line 69
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Lcom/whatsapp/sz;)V
    .locals 13
    .parameter

    .prologue
    const/16 v12, 0x8

    const v11, 0x1080004

    const/4 v10, 0x2

    const/4 v9, 0x0

    const/4 v8, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 73
    iget-object v2, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    .line 45
    iget v3, p0, Lcom/whatsapp/df;->G:I

    .line 120
    iget-object v0, p1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    iput-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    .line 55
    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    iput v0, p0, Lcom/whatsapp/df;->G:I

    .line 87
    iget-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    iget-boolean v0, v0, Lcom/whatsapp/MediaData;->transferring:Z

    if-eqz v0, :cond_2

    .line 32
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-eqz v0, :cond_1

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/df;->J:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v9}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 48
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    new-instance v4, Lcom/whatsapp/zn;

    invoke-direct {v4, p0}, Lcom/whatsapp/zn;-><init>(Lcom/whatsapp/df;)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iput v9, p0, Lcom/whatsapp/df;->K:I

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/df;->J:Landroid/widget/ProgressBar;

    iget-object v4, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    iget-wide v4, v4, Lcom/whatsapp/MediaData;->progress:J

    long-to-int v4, v4

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    if-eqz v1, :cond_11

    .line 58
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    iget-boolean v0, v0, Lcom/whatsapp/MediaData;->transferred:Z

    if-nez v0, :cond_3

    iget-wide v4, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_9

    iget-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    iget-wide v4, v0, Lcom/whatsapp/MediaData;->progress:J

    iget-wide v6, p1, Lcom/whatsapp/sz;->m:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_9

    .line 126
    :cond_3
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-ne v0, v8, :cond_4

    iget v0, p0, Lcom/whatsapp/df;->G:I

    if-eq v0, v3, :cond_5

    .line 26
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    iget v4, p0, Lcom/whatsapp/df;->G:I

    invoke-static {v4}, Lcom/whatsapp/df;->a(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    .line 50
    :cond_5
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-eq v0, v8, :cond_11

    .line 110
    :cond_6
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-eq v0, v10, :cond_8

    .line 78
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/df;->J:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v12}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 67
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    :cond_8
    new-instance v0, Lcom/whatsapp/zn;

    invoke-direct {v0, p0}, Lcom/whatsapp/zn;-><init>(Lcom/whatsapp/df;)V

    .line 49
    iget-object v4, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    iget-object v4, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v4, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    iput v8, p0, Lcom/whatsapp/df;->K:I

    .line 3
    if-eqz v1, :cond_11

    .line 106
    :cond_9
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_b

    .line 70
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_a

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-ne v0, v10, :cond_a

    iget-wide v4, p1, Lcom/whatsapp/sz;->m:J

    iget-wide v6, v2, Lcom/whatsapp/sz;->m:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_b

    .line 15
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/df;->getContext()Landroid/content/Context;

    move-result-object v4

    iget v5, p0, Lcom/whatsapp/df;->G:I

    invoke-static {v5}, Lcom/whatsapp/df;->b(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-wide v5, p1, Lcom/whatsapp/sz;->m:J

    invoke-static {v4, v5, v6}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    :cond_b
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-eq v0, v10, :cond_11

    .line 122
    :cond_c
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_d

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-eq v0, v8, :cond_e

    .line 42
    :cond_d
    iget-object v0, p0, Lcom/whatsapp/df;->J:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v12}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 128
    :cond_e
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_f

    .line 33
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    const v2, 0x7f0900e4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 44
    iget-object v0, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    new-instance v2, Lcom/whatsapp/yn;

    invoke-direct {v2, p0}, Lcom/whatsapp/yn;-><init>(Lcom/whatsapp/df;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/zn;

    invoke-direct {v2, p0}, Lcom/whatsapp/zn;-><init>(Lcom/whatsapp/df;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v1, :cond_10

    .line 29
    :cond_f
    new-instance v0, Lcom/whatsapp/xn;

    invoke-direct {v0, p0}, Lcom/whatsapp/xn;-><init>(Lcom/whatsapp/df;)V

    .line 82
    iget-object v2, p0, Lcom/whatsapp/df;->H:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v2, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    :cond_10
    iput v10, p0, Lcom/whatsapp/df;->K:I

    .line 97
    :cond_11
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_12

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_13

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-ne v0, v8, :cond_13

    .line 46
    :cond_12
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/ao;

    invoke-direct {v2, p0}, Lcom/whatsapp/ao;-><init>(Lcom/whatsapp/df;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 47
    :cond_13
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/df;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    .line 19
    iget-object v2, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v2, v0, v0, v0, v0}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 68
    iget v0, p0, Lcom/whatsapp/df;->G:I

    packed-switch v0, :pswitch_data_0

    .line 72
    :cond_14
    :goto_0
    iput-boolean v8, p0, Lcom/whatsapp/df;->L:Z

    .line 80
    return-void

    .line 94
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 6
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 51
    if-eqz v0, :cond_15

    .line 117
    iget-object v2, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    new-instance v4, Lcom/whatsapp/o;

    iget-object v5, p0, Lcom/whatsapp/df;->f:Landroid/content/Context;

    invoke-direct {v4, v5, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v4}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v1, :cond_14

    .line 56
    :cond_15
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v0, v11}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 27
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    const v2, 0x7f0203da

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 30
    if-eqz v1, :cond_14

    .line 54
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v0, v11}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 18
    iget-boolean v0, p0, Lcom/whatsapp/df;->L:Z

    if-eqz v0, :cond_16

    if-eq v3, v10, :cond_14

    .line 100
    :cond_16
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    const v2, 0x7f02000e

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    if-eqz v1, :cond_14

    .line 53
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 114
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 95
    if-eqz v0, :cond_1a

    .line 88
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    sget-object v3, Lcom/whatsapp/df;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    if-ne v2, v3, :cond_17

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sget-object v3, Lcom/whatsapp/df;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    if-eq v2, v3, :cond_18

    .line 83
    :cond_17
    sget-object v2, Lcom/whatsapp/df;->c:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->X:I

    sget-object v3, Lcom/whatsapp/df;->c:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    const/4 v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 118
    :cond_18
    iget-wide v2, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_19

    .line 23
    new-instance v2, Lcom/whatsapp/VideoBitmapDrawable;

    iget-object v3, p0, Lcom/whatsapp/df;->f:Landroid/content/Context;

    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-wide v5, p1, Lcom/whatsapp/sz;->m:J

    invoke-static {v4, v5, v6}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/whatsapp/df;->f:Landroid/content/Context;

    invoke-static {v5}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v5

    iget v5, v5, Lcom/whatsapp/j4;->M:F

    invoke-direct {v2, v3, v0, v4, v5}, Lcom/whatsapp/VideoBitmapDrawable;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;F)V

    .line 119
    iget-object v3, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v3, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    if-eqz v1, :cond_14

    .line 90
    :cond_19
    new-instance v2, Lcom/whatsapp/o;

    iget-object v3, p0, Lcom/whatsapp/df;->f:Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 75
    iget-object v3, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v3, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 24
    :catch_0
    move-exception v2

    .line 111
    iget-object v2, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 62
    if-eqz v1, :cond_14

    .line 103
    :cond_1a
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    const/16 v1, 0x9

    invoke-virtual {v0, v8, v9, v9, v1}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 28
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 121
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    invoke-virtual {v0, v11}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 109
    iget-object v0, p0, Lcom/whatsapp/df;->I:Landroid/widget/ImageButton;

    const v1, 0x7f02000d

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto/16 :goto_0

    .line 68
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static z([C)Ljava/lang/String;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    if-gt v1, v2, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-char v3, p0, v2

    rem-int/lit8 v0, v2, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x75

    :goto_1
    xor-int/2addr v0, v3

    int-to-char v0, v0

    aput-char v0, p0, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x61

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x5b

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x3a

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x7a

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static z(Ljava/lang/String;)[C
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit8 v2, v2, 0x75

    int-to-char v2, v2

    aput-char v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 81
    const v0, 0x7f030020

    return v0
.end method

.method public a(Landroid/content/Context;Lcom/whatsapp/sz;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 108
    iget-object v0, p2, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 5
    iget-boolean v1, v0, Lcom/whatsapp/MediaData;->transferring:Z

    if-eqz v1, :cond_0

    .line 113
    :goto_0
    return-void

    .line 92
    :cond_0
    iget-boolean v1, v0, Lcom/whatsapp/MediaData;->transferred:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    if-eqz v1, :cond_1

    .line 127
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 91
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 115
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    const-class v2, Lcom/whatsapp/MediaGallery;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 71
    sget-object v1, Lcom/whatsapp/df;->N:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 36
    sget-object v1, Lcom/whatsapp/df;->N:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 22
    sget-object v1, Lcom/whatsapp/df;->N:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    iget-object v2, v2, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    sget-object v1, Lcom/whatsapp/df;->N:[Ljava/lang/String;

    aget-object v1, v1, v3

    iget-object v2, p2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v2}, Lcom/whatsapp/uz;->hashCode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 79
    iget-object v1, p0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    invoke-virtual {v1, v0}, Lcom/whatsapp/Conversation;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    invoke-static {p2, v1, v2}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/sz;Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public a(Lcom/whatsapp/sz;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_1

    .line 104
    :cond_0
    invoke-direct {p0, p1}, Lcom/whatsapp/df;->b(Lcom/whatsapp/sz;)V

    .line 11
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;Z)V

    .line 1
    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/rn;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 60
    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    if-ne v0, v3, :cond_0

    .line 41
    new-instance v0, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/df;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900fe

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    iget-boolean v0, v0, Lcom/whatsapp/MediaData;->transferring:Z

    if-eqz v0, :cond_1

    .line 123
    new-instance v0, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/df;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900ff

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_3

    iget v0, p0, Lcom/whatsapp/df;->K:I

    if-ne v0, v3, :cond_3

    .line 74
    :cond_2
    new-instance v0, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/df;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09011b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_3
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 84
    const v0, 0x7f030021

    return v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    invoke-direct {p0, v0}, Lcom/whatsapp/df;->b(Lcom/whatsapp/sz;)V

    .line 16
    invoke-super {p0}, Lcom/whatsapp/ze;->d()V

    .line 77
    return-void
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/df;->F:Lcom/whatsapp/MediaData;

    iget-boolean v0, v0, Lcom/whatsapp/MediaData;->transferred:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
