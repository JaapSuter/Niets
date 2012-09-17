.class public Lcom/whatsapp/cf;
.super Lcom/whatsapp/ze;
.source "cf.java"


# static fields
.field private static final P:[Ljava/lang/String;


# instance fields
.field private F:Lcom/whatsapp/MediaData;

.field private final G:Landroid/widget/TextView;

.field private final H:Landroid/view/View;

.field private final I:Landroid/widget/ImageButton;

.field private final J:Landroid/widget/TextView;

.field private final K:Landroid/widget/TextView;

.field private final L:Landroid/view/View;

.field private final M:Landroid/view/View;

.field private N:Z

.field private O:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x51

    const/16 v3, 0x4d

    const/16 v1, 0x2f

    const/16 v4, 0x2a

    const/4 v6, 0x0

    const/4 v0, 0x6

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0013~,\u0014"

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

    const-string v0, "s\"f"

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

    const-string v0, "\u00130mB/J7p\u0008"

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

    const-string v0, "\ro"

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

    const-string v0, "G%9Zg\u0000~ K-\\\u007f*E2H=(\u0004>@<bG<_\"r[`"

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

    const/4 v8, 0x5

    const-string v0, "\t\"!F`"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_5
    if-gt v6, v7, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x5d

    :goto_6
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_6

    :pswitch_1
    move v0, v2

    goto :goto_6

    :pswitch_2
    move v0, v3

    goto :goto_6

    :pswitch_3
    move v0, v4

    goto :goto_6

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x5d

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_7

    :pswitch_5
    move v0, v2

    goto :goto_7

    :pswitch_6
    move v0, v3

    goto :goto_7

    :pswitch_7
    move v0, v4

    goto :goto_7

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x5d

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_8

    :pswitch_9
    move v0, v2

    goto :goto_8

    :pswitch_a
    move v0, v3

    goto :goto_8

    :pswitch_b
    move v0, v4

    goto :goto_8

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x5d

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_9

    :pswitch_d
    move v0, v2

    goto :goto_9

    :pswitch_e
    move v0, v3

    goto :goto_9

    :pswitch_f
    move v0, v4

    goto :goto_9

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x5d

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_a

    :pswitch_11
    move v0, v2

    goto :goto_a

    :pswitch_12
    move v0, v3

    goto :goto_a

    :pswitch_13
    move v0, v4

    goto :goto_a

    :cond_5
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x5d

    :goto_b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_b

    :pswitch_15
    move v0, v2

    goto :goto_b

    :pswitch_16
    move v0, v3

    goto :goto_b

    :pswitch_17
    move v0, v4

    goto :goto_b

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
.end method

.method constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/ze;-><init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    .line 92
    const v0, 0x7f0d007b

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    .line 18
    const v0, 0x7f0d00cf

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    .line 80
    const v0, 0x7f0d00cc

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    .line 30
    const v0, 0x7f0d00cd

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    .line 71
    const v0, 0x7f0d00ce

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    .line 88
    const v0, 0x7f0d00d1

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    .line 53
    const v0, 0x7f0d0057

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/cf;->M:Landroid/view/View;

    .line 20
    invoke-direct {p0, p2}, Lcom/whatsapp/cf;->b(Lcom/whatsapp/sz;)V

    .line 77
    return-void
.end method

.method private b(Lcom/whatsapp/sz;)V
    .locals 12
    .parameter

    .prologue
    const/4 v11, 0x2

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/16 v8, 0x8

    const/4 v7, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 89
    iget-wide v0, p1, Lcom/whatsapp/sz;->r:D

    const-wide/16 v3, 0x0

    cmpl-double v0, v0, v3

    if-eqz v0, :cond_0

    iget-wide v0, p1, Lcom/whatsapp/sz;->q:D

    const-wide/16 v3, 0x0

    cmpl-double v0, v0, v3

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/wn;

    invoke-direct {v1, p0, v10}, Lcom/whatsapp/wn;-><init>(Lcom/whatsapp/cf;Lcom/whatsapp/un;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    :cond_0
    iget-object v0, p1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    iput-object v0, p0, Lcom/whatsapp/cf;->F:Lcom/whatsapp/MediaData;

    .line 72
    iget-object v0, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, ""

    iget-object v1, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 103
    iget-object v0, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v2, :cond_9

    .line 98
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 33
    iget-object v0, p1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, ""

    iget-object v1, p1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 7
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    sget-object v4, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    aget-object v4, v4, v9

    const-string v5, "+"

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v4, p1, Lcom/whatsapp/sz;->q:D

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v4, p1, Lcom/whatsapp/sz;->r:D

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_5

    .line 2
    :cond_4
    iget-object v0, p1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 65
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    aget-object v4, v4, v11

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v4, v3, v7

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/cf;->P:[Ljava/lang/String;

    aget-object v4, v4, v7

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    .line 70
    aget-object v4, v3, v7

    iget-object v5, p0, Lcom/whatsapp/cf;->n:Lcom/whatsapp/Conversation;

    iget-object v5, v5, Lcom/whatsapp/Conversation;->sb:Ljava/lang/String;

    new-instance v6, Landroid/text/SpannableStringBuilder;

    invoke-direct {v6, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v4, v5, v6}, Lcom/whatsapp/ef;->a(Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 61
    iget-object v4, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    array-length v1, v3

    if-le v1, v9, :cond_7

    const-string v1, ""

    aget-object v4, v3, v9

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 23
    iget-object v1, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 56
    aget-object v1, v3, v9

    iget-object v4, p0, Lcom/whatsapp/cf;->n:Lcom/whatsapp/Conversation;

    iget-object v4, v4, Lcom/whatsapp/Conversation;->sb:Ljava/lang/String;

    invoke-static {v1, v4, v10}, Lcom/whatsapp/ef;->a(Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 60
    iget-object v4, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    if-nez v1, :cond_6

    aget-object v1, v3, v9

    :cond_6
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    if-eqz v2, :cond_8

    .line 16
    :cond_7
    iget-object v1, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    :cond_8
    new-instance v1, Lcom/whatsapp/un;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/un;-><init>(Lcom/whatsapp/cf;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    iget-object v0, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 44
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    if-eqz v0, :cond_a

    .line 97
    iget-object v0, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 21
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/cf;->F:Lcom/whatsapp/MediaData;

    iget-boolean v0, v0, Lcom/whatsapp/MediaData;->transferring:Z

    if-eqz v0, :cond_f

    .line 52
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_d

    .line 48
    iget-object v0, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    if-eqz v0, :cond_b

    .line 102
    iget-object v0, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 84
    :cond_b
    iget-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/whatsapp/cf;->O:I

    if-eqz v0, :cond_1c

    .line 43
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 104
    iget-object v0, p0, Lcom/whatsapp/cf;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lcom/whatsapp/cf;->K:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 36
    iget-object v0, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    invoke-virtual {v0, v10}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    iput v7, p0, Lcom/whatsapp/cf;->O:I

    if-eqz v2, :cond_1c

    .line 57
    :cond_d
    iget-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    if-eqz v0, :cond_e

    iget v0, p0, Lcom/whatsapp/cf;->O:I

    if-eqz v0, :cond_1c

    .line 79
    :cond_e
    iget-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 40
    iput v7, p0, Lcom/whatsapp/cf;->O:I

    if-eqz v2, :cond_1c

    .line 96
    :cond_f
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/whatsapp/cf;->F:Lcom/whatsapp/MediaData;

    iget-boolean v0, v0, Lcom/whatsapp/MediaData;->transferred:Z

    if-eqz v0, :cond_16

    .line 87
    :cond_10
    iget-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    if-eqz v0, :cond_11

    iget v0, p0, Lcom/whatsapp/cf;->O:I

    if-eq v0, v9, :cond_1c

    .line 24
    :cond_11
    iget-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    if-eqz v0, :cond_12

    iget v0, p0, Lcom/whatsapp/cf;->O:I

    if-eq v0, v11, :cond_15

    .line 90
    :cond_12
    iget-object v0, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    if-eqz v0, :cond_13

    const-string v0, ""

    iget-object v1, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 63
    :cond_13
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 95
    :cond_14
    iget-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    if-eqz v0, :cond_15

    .line 78
    iget-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 13
    :cond_15
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    new-instance v1, Lcom/whatsapp/wn;

    invoke-direct {v1, p0, v10}, Lcom/whatsapp/wn;-><init>(Lcom/whatsapp/cf;Lcom/whatsapp/un;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    const v1, 0x7f090100

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 81
    iput v9, p0, Lcom/whatsapp/cf;->O:I

    if-eqz v2, :cond_1c

    .line 22
    :cond_16
    iget-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    if-eqz v0, :cond_17

    iget v0, p0, Lcom/whatsapp/cf;->O:I

    if-eq v0, v11, :cond_1c

    .line 49
    :cond_17
    iget-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    if-eqz v0, :cond_18

    iget v0, p0, Lcom/whatsapp/cf;->O:I

    if-eq v0, v11, :cond_1b

    .line 59
    :cond_18
    iget-object v0, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    if-eqz v0, :cond_19

    const-string v0, ""

    iget-object v1, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 31
    :cond_19
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    :cond_1a
    iget-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    if-eqz v0, :cond_1b

    .line 83
    iget-object v0, p0, Lcom/whatsapp/cf;->H:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 86
    :cond_1b
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    const v1, 0x7f0900e4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 55
    iget-object v0, p0, Lcom/whatsapp/cf;->G:Landroid/widget/TextView;

    new-instance v1, Lcom/whatsapp/vn;

    invoke-direct {v1, p0, v10}, Lcom/whatsapp/vn;-><init>(Lcom/whatsapp/cf;Lcom/whatsapp/un;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    invoke-virtual {v0, v10}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    iput v11, p0, Lcom/whatsapp/cf;->O:I

    .line 82
    :cond_1c
    iget-object v0, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    invoke-virtual {v0, v10}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 58
    iget-object v0, p0, Lcom/whatsapp/cf;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    .line 46
    iget-object v1, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 73
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 66
    if-eqz v0, :cond_1d

    .line 74
    iget-object v1, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    new-instance v3, Lcom/whatsapp/o;

    iget-object v4, p0, Lcom/whatsapp/cf;->f:Landroid/content/Context;

    invoke-direct {v3, v4, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v3}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_1e

    .line 11
    :cond_1d
    iget-object v0, p0, Lcom/whatsapp/cf;->I:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/o;

    iget-object v2, p0, Lcom/whatsapp/cf;->f:Landroid/content/Context;

    invoke-static {}, Lcom/whatsapp/d5;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    :cond_1e
    iput-boolean v9, p0, Lcom/whatsapp/cf;->N:Z

    .line 6
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 101
    const v0, 0x7f03001e

    return v0
.end method

.method public a(Lcom/whatsapp/sz;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_1

    .line 76
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/cf;->N:Z

    .line 12
    invoke-direct {p0, p1}, Lcom/whatsapp/cf;->b(Lcom/whatsapp/sz;)V

    .line 39
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;Z)V

    .line 93
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 1
    const v0, 0x7f03001f

    return v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    invoke-direct {p0, v0}, Lcom/whatsapp/cf;->b(Lcom/whatsapp/sz;)V

    .line 51
    invoke-super {p0}, Lcom/whatsapp/ze;->d()V

    .line 69
    return-void
.end method

.method public i()Z
    .locals 2

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 5
    .parameter
    .parameter

    .prologue
    const/16 v4, 0x8

    .line 25
    iget-object v0, p0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_1

    .line 42
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/cf;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v2, -0x2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 32
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->onMeasure(II)V

    .line 34
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 67
    iget-object v1, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v4, :cond_0

    .line 41
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v3, p0, Lcom/whatsapp/cf;->L:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/cf;->M:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v4, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v2, p0, Lcom/whatsapp/cf;->M:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 68
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->onMeasure(II)V

    .line 26
    return-void
.end method
