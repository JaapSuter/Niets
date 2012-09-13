.class Lcom/whatsapp/ne;
.super Landroid/widget/BaseAdapter;
.source "ne.java"

# interfaces
.implements Landroid/widget/Filterable;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field public a:Landroid/widget/Filter;

.field final b:Lcom/whatsapp/Conversations;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x5f

    const/16 v1, 0x58

    const/16 v2, 0x4d

    const/16 v4, 0x48

    const/4 v6, 0x0

    const/4 v0, 0x6

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "xw"

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

    const-string v0, "{z=\u007f\u000eo/"

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

    const-string v0, ";\"1>\t*>+)\u00057#,\u0017\u001e7:p%\u0005+>6&\u000b\u0007?2<3+?<r"

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

    const-string v0, "bm"

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

    const-string v0, "{yj|Ylx"

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

    const-string v0, "4,&\'\u0019,\u00126&\n4,+-\u001e"

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

    sput-object v9, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x6c

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

    const/16 v0, 0x6c

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

    const/16 v0, 0x6c

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

    const/16 v0, 0x6c

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

    const/16 v0, 0x6c

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

    const/16 v0, 0x6c

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

.method constructor <init>(Lcom/whatsapp/Conversations;)V
    .locals 2
    .parameter

    .prologue
    .line 39
    iput-object p1, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 93
    new-instance v0, Lcom/whatsapp/we;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/we;-><init>(Lcom/whatsapp/ne;Lcom/whatsapp/u8;)V

    iput-object v0, p0, Lcom/whatsapp/ne;->a:Landroid/widget/Filter;

    .line 90
    return-void
.end method

.method private a(Lcom/whatsapp/zq;Lcom/whatsapp/sz;)I
    .locals 2
    .parameter
    .parameter

    .prologue
    const v0, 0x7f0203ee

    .line 147
    iget-object v1, p2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v1, v1, Lcom/whatsapp/uz;->b:Z

    if-eqz v1, :cond_0

    .line 154
    iget v1, p2, Lcom/whatsapp/sz;->a:I

    packed-switch v1, :pswitch_data_0

    .line 158
    :goto_0
    :pswitch_0
    return v0

    .line 79
    :pswitch_1
    const v0, 0x7f0203f1

    goto :goto_0

    .line 12
    :pswitch_2
    const v0, 0x7f0203ed

    goto :goto_0

    .line 41
    :cond_0
    iget v0, p1, Lcom/whatsapp/zq;->a:I

    if-nez v0, :cond_1

    .line 1
    const v0, 0x7f0203ef

    goto :goto_0

    .line 158
    :cond_1
    const v0, 0x7f0203f2

    goto :goto_0

    .line 154
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 121
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-object v0, v0, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final a(Landroid/view/View;Lcom/whatsapp/zq;ZLcom/whatsapp/fp;)V
    .locals 11
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 142
    if-eqz p3, :cond_3

    .line 56
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 55
    iget-object v1, p4, Lcom/whatsapp/fp;->a:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v2}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v2

    iget-object v2, v2, Lcom/whatsapp/ep;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    if-eqz v0, :cond_0

    iget-wide v0, v0, Lcom/whatsapp/sz;->m:J

    const-wide/16 v2, -0x2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 71
    :cond_0
    iget-object v0, p4, Lcom/whatsapp/fp;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v1}, Lcom/whatsapp/Conversations;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080011

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    iget-object v0, p4, Lcom/whatsapp/fp;->c:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    if-eqz v4, :cond_2

    .line 156
    :cond_1
    iget-object v0, p4, Lcom/whatsapp/fp;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v1}, Lcom/whatsapp/Conversations;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080005

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 138
    iget-object v0, p4, Lcom/whatsapp/fp;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 145
    :cond_2
    :goto_0
    return-void

    .line 2
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->i(Lcom/whatsapp/Conversations;)Lcom/whatsapp/pj;

    move-result-object v0

    iget-object v1, p4, Lcom/whatsapp/fp;->d:Lcom/whatsapp/LoadPhotoImageView;

    invoke-virtual {v0, p2, v1}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/zq;Landroid/widget/ImageView;)V

    .line 31
    const-string v1, ""

    .line 40
    const-string v2, ""

    .line 67
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v3, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v5

    .line 122
    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v3}, Lcom/whatsapp/Conversations;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    iget-object v6, p4, Lcom/whatsapp/fp;->b:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v6

    invoke-static {v0, v3, v6}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 46
    iget-object v3, p4, Lcom/whatsapp/fp;->b:Landroid/widget/TextView;

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    :cond_4
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    if-eqz v5, :cond_6

    iget-byte v0, v5, Lcom/whatsapp/sz;->l:B

    if-nez v0, :cond_6

    iget-wide v6, v5, Lcom/whatsapp/sz;->m:J

    const-wide/16 v8, 0x2

    cmp-long v0, v6, v8

    if-eqz v0, :cond_5

    iget-wide v6, v5, Lcom/whatsapp/sz;->m:J

    const-wide/16 v8, 0x3

    cmp-long v0, v6, v8

    if-nez v0, :cond_6

    .line 4
    :cond_5
    iget-object v0, p4, Lcom/whatsapp/fp;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v3}, Lcom/whatsapp/Conversations;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f080005

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz v4, :cond_7

    .line 114
    :cond_6
    iget-object v0, p4, Lcom/whatsapp/fp;->b:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v3}, Lcom/whatsapp/Conversations;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f080001

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    :cond_7
    iget v0, p2, Lcom/whatsapp/zq;->a:I

    if-lez v0, :cond_8

    .line 43
    iget-object v0, p4, Lcom/whatsapp/fp;->g:Lcom/whatsapp/UnreadMsgIndicator;

    iget v3, p2, Lcom/whatsapp/zq;->a:I

    invoke-virtual {v0, v3}, Lcom/whatsapp/UnreadMsgIndicator;->a(I)V

    .line 27
    iget-object v0, p4, Lcom/whatsapp/fp;->g:Lcom/whatsapp/UnreadMsgIndicator;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/whatsapp/UnreadMsgIndicator;->setVisibility(I)V

    if-eqz v4, :cond_9

    .line 14
    :cond_8
    iget-object v0, p4, Lcom/whatsapp/fp;->g:Lcom/whatsapp/UnreadMsgIndicator;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/whatsapp/UnreadMsgIndicator;->setVisibility(I)V

    .line 96
    :cond_9
    iget-object v0, p4, Lcom/whatsapp/fp;->c:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 54
    iget-object v0, p4, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    iget-object v0, p4, Lcom/whatsapp/fp;->i:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    if-eqz v5, :cond_2b

    .line 45
    iget-byte v2, v5, Lcom/whatsapp/sz;->l:B

    .line 21
    if-nez v2, :cond_b

    .line 8
    iget v0, v5, Lcom/whatsapp/sz;->a:I

    const/4 v3, 0x6

    if-eq v0, v3, :cond_2a

    .line 118
    invoke-virtual {v5}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v4, :cond_12

    .line 151
    :goto_1
    iget-wide v6, v5, Lcom/whatsapp/sz;->m:J

    long-to-int v1, v6

    packed-switch v1, :pswitch_data_0

    .line 10
    :cond_a
    :goto_2
    iget-object v1, p4, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz v4, :cond_12

    .line 92
    :cond_b
    const/4 v0, 0x1

    if-ne v2, v0, :cond_c

    .line 143
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->o:Ljava/lang/String;

    if-eqz v4, :cond_12

    .line 168
    :cond_c
    const/4 v0, 0x2

    if-ne v2, v0, :cond_d

    .line 97
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->p:Ljava/lang/String;

    if-eqz v4, :cond_12

    .line 85
    :cond_d
    const/4 v0, 0x3

    if-ne v2, v0, :cond_e

    .line 157
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->q:Ljava/lang/String;

    if-eqz v4, :cond_12

    .line 128
    :cond_e
    const/4 v0, 0x4

    if-ne v2, v0, :cond_f

    .line 6
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->s:Ljava/lang/String;

    if-eqz v4, :cond_12

    .line 70
    :cond_f
    const/4 v0, 0x5

    if-ne v2, v0, :cond_11

    .line 117
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->r:Ljava/lang/String;

    .line 50
    iget-object v1, v5, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    if-eqz v1, :cond_10

    iget-object v1, v5, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_10

    .line 146
    iget-object v1, v5, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 25
    array-length v2, v1

    if-lez v2, :cond_10

    const/4 v2, 0x0

    aget-object v2, v1, v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_10

    .line 9
    const/4 v0, 0x0

    aget-object v0, v1, v0

    .line 162
    :cond_10
    iget-object v1, p4, Lcom/whatsapp/fp;->i:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    iget-object v1, p4, Lcom/whatsapp/fp;->i:Landroid/widget/ImageView;

    const v2, 0x7f0203d8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v4, :cond_12

    .line 81
    :cond_11
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    const v1, 0x7f090201

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 66
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-wide v6, v5, Lcom/whatsapp/sz;->i:J

    invoke-static {v2, v6, v7}, Lcom/whatsapp/t4;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-direct {p0, p2, v5}, Lcom/whatsapp/ne;->a(Lcom/whatsapp/zq;Lcom/whatsapp/sz;)I

    move-result v2

    .line 127
    if-eqz v2, :cond_14

    .line 62
    iget v3, v5, Lcom/whatsapp/sz;->a:I

    const/4 v6, 0x6

    if-ne v3, v6, :cond_13

    .line 153
    iget-object v3, p4, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v4, :cond_15

    .line 18
    :cond_13
    iget-object v3, p4, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v4, :cond_15

    .line 34
    :cond_14
    iget-object v2, p4, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 139
    :cond_15
    if-eqz v4, :cond_16

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    .line 22
    :goto_3
    iget-object v2, p4, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    move-object v10, v0

    move-object v0, v1

    move-object v1, v10

    .line 155
    :cond_16
    iget-object v2, p4, Lcom/whatsapp/fp;->j:Landroid/widget/ImageView;

    if-eqz v2, :cond_17

    .line 95
    iget-object v3, p4, Lcom/whatsapp/fp;->j:Landroid/widget/ImageView;

    iget-object v2, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/whatsapp/n5;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    const/4 v2, 0x0

    :goto_4
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 172
    :cond_17
    iget-object v2, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 83
    invoke-virtual {p2}, Lcom/whatsapp/zq;->o()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1f

    .line 161
    iget-object v2, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v2, :cond_1e

    .line 173
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v3

    .line 134
    iget-object v2, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 100
    iget-object v2, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v2}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v2

    iget-object v2, v2, Lcom/whatsapp/ep;->t:Ljava/lang/String;

    if-eqz v4, :cond_19

    .line 148
    :cond_18
    invoke-virtual {v3}, Lcom/whatsapp/zq;->d()Ljava/lang/String;

    move-result-object v2

    .line 170
    :cond_19
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-static {v2}, Lcom/whatsapp/TextEmojiLabel;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1b

    :cond_1a
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-nez v3, :cond_1c

    invoke-static {v2}, Lcom/whatsapp/TextEmojiLabel;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1c

    .line 113
    :cond_1b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v6, 0x3

    aget-object v3, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v4, :cond_1d

    .line 59
    :cond_1c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v7, 0x0

    aget-object v6, v6, v7

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 135
    :cond_1d
    iget-object v3, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v3}, Lcom/whatsapp/Conversations;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 38
    iget-object v6, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    if-nez v3, :cond_28

    :goto_5
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    iget-object v2, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 150
    if-eqz v4, :cond_1f

    .line 74
    :cond_1e
    iget-object v2, v5, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v2, v2, Lcom/whatsapp/uz;->b:Z

    if-nez v2, :cond_1f

    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v6, 0x2

    aget-object v3, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v5}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 36
    :cond_1f
    iget-object v2, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v2}, Lcom/whatsapp/Conversations;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 112
    iget-object v3, p4, Lcom/whatsapp/fp;->e:Landroid/widget/TextView;

    if-nez v2, :cond_29

    :goto_6
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v0, p4, Lcom/whatsapp/fp;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    iget v0, p2, Lcom/whatsapp/zq;->a:I

    if-lez v0, :cond_20

    .line 124
    iget-object v0, p4, Lcom/whatsapp/fp;->e:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    iget-object v0, p4, Lcom/whatsapp/fp;->e:Landroid/widget/TextView;

    sget-object v1, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    iget-object v0, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 87
    iget-object v0, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    sget-object v1, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz v4, :cond_2

    .line 166
    :cond_20
    iget-object v0, p4, Lcom/whatsapp/fp;->e:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 108
    iget-object v0, p4, Lcom/whatsapp/fp;->e:Landroid/widget/TextView;

    sget-object v1, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 111
    iget-object v0, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 125
    iget-object v0, p4, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    sget-object v1, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 169
    :pswitch_0
    iget-object v0, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 84
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->b:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 42
    :cond_21
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->c:Ljava/lang/String;

    .line 164
    if-eqz v4, :cond_a

    .line 72
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->f:Ljava/lang/String;

    .line 104
    if-eqz v4, :cond_a

    .line 159
    :pswitch_2
    iget-object v0, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 88
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->d:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 82
    :cond_22
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->e:Ljava/lang/String;

    .line 86
    if-eqz v4, :cond_a

    .line 141
    :pswitch_3
    iget-object v1, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v1, :cond_a

    .line 107
    iget-object v0, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 63
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->g:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 91
    :cond_23
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->h:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 32
    :pswitch_4
    iget-object v1, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v1, :cond_a

    .line 20
    iget-object v0, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 77
    invoke-virtual {v5}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_24

    .line 17
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->l:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 75
    :cond_24
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->k:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 24
    :cond_25
    invoke-virtual {v5}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_26

    .line 126
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->j:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 51
    :cond_26
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->i:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 48
    :pswitch_5
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->m:Ljava/lang/String;

    .line 152
    iget-object v1, p4, Lcom/whatsapp/fp;->c:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 129
    if-eqz v4, :cond_a

    .line 136
    :pswitch_6
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->h(Lcom/whatsapp/Conversations;)Lcom/whatsapp/ep;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ep;->n:Ljava/lang/String;

    .line 133
    iget-object v1, p4, Lcom/whatsapp/fp;->c:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 95
    :cond_27
    const/16 v2, 0x8

    goto/16 :goto_4

    :cond_28
    move-object v2, v3

    .line 38
    goto/16 :goto_5

    :cond_29
    move-object v0, v2

    .line 112
    goto/16 :goto_6

    :cond_2a
    move-object v0, v1

    goto/16 :goto_1

    :cond_2b
    move-object v0, v2

    goto/16 :goto_3

    .line 151
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-object v0, v0, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/whatsapp/ne;->a:Landroid/widget/Filter;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/whatsapp/ne;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-object v0, v0, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x0

    const v10, 0x7f0d00e0

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-boolean v5, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    invoke-virtual {p0, p1}, Lcom/whatsapp/ne;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v6

    .line 33
    iget-object v0, v6, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/App;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    .line 37
    if-nez p2, :cond_8

    .line 103
    if-eqz v5, :cond_7

    move v1, v2

    .line 105
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fp;

    .line 165
    iget-object v8, v0, Lcom/whatsapp/fp;->l:Ljava/lang/String;

    sget-object v9, Lcom/whatsapp/App;->E:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    .line 163
    if-eq v7, v8, :cond_6

    .line 76
    if-eqz v5, :cond_5

    :goto_1
    move-object v1, p2

    .line 49
    :goto_2
    if-eqz v2, :cond_1

    .line 149
    iget-object v0, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    sget-object v1, Lcom/whatsapp/ne;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 101
    new-instance v2, Lcom/whatsapp/fp;

    invoke-direct {v2}, Lcom/whatsapp/fp;-><init>()V

    .line 109
    if-eqz v7, :cond_0

    .line 131
    const v1, 0x7f030026

    invoke-virtual {v0, v1, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 58
    const v1, 0x7f0d00df

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v2, Lcom/whatsapp/fp;->a:Landroid/widget/TextView;

    .line 80
    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v2, Lcom/whatsapp/fp;->c:Landroid/view/View;

    if-eqz v5, :cond_4

    .line 65
    :cond_0
    const v1, 0x7f030027

    invoke-virtual {v0, v1, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 61
    const v0, 0x7f0d00e2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/whatsapp/fp;->b:Landroid/widget/TextView;

    .line 47
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/whatsapp/fp;->c:Landroid/view/View;

    .line 64
    const v0, 0x7f0d00e1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/LoadPhotoImageView;

    iput-object v0, v2, Lcom/whatsapp/fp;->d:Lcom/whatsapp/LoadPhotoImageView;

    .line 23
    const v0, 0x7f0d00e7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/whatsapp/fp;->e:Landroid/widget/TextView;

    .line 73
    const v0, 0x7f0d00e5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/whatsapp/fp;->f:Landroid/widget/TextView;

    .line 68
    const v0, 0x7f0d00e9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/UnreadMsgIndicator;

    iput-object v0, v2, Lcom/whatsapp/fp;->g:Lcom/whatsapp/UnreadMsgIndicator;

    .line 28
    const v0, 0x7f0d00e4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/whatsapp/fp;->h:Landroid/widget/ImageView;

    .line 140
    const v0, 0x7f0d00e6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/whatsapp/fp;->i:Landroid/widget/ImageView;

    .line 106
    const v0, 0x7f0d00e8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/whatsapp/fp;->j:Landroid/widget/ImageView;

    .line 78
    const v0, 0x7f0d00e3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/whatsapp/fp;->k:Landroid/widget/TextView;

    move-object v0, v2

    .line 115
    :cond_1
    :goto_3
    iget-object v2, v6, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iput-object v2, v0, Lcom/whatsapp/fp;->l:Ljava/lang/String;

    .line 110
    iget-object v2, p0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-static {v2}, Lcom/whatsapp/Conversations;->g(Lcom/whatsapp/Conversations;)Ljava/util/HashMap;

    move-result-object v2

    iget-object v3, v0, Lcom/whatsapp/fp;->l:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0, v1, v6, v7, v0}, Lcom/whatsapp/ne;->a(Landroid/view/View;Lcom/whatsapp/zq;ZLcom/whatsapp/fp;)V

    .line 16
    rem-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_2

    .line 57
    const v0, 0x7f020414

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz v5, :cond_3

    .line 44
    :cond_2
    const v0, 0x7f020416

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 130
    :cond_3
    return-object v1

    :cond_4
    move-object v0, v2

    move-object v1, v4

    goto :goto_3

    :cond_5
    move-object v1, v4

    goto/16 :goto_2

    :cond_6
    move v2, v1

    goto/16 :goto_1

    :cond_7
    move-object v0, v4

    move-object v1, v4

    goto/16 :goto_2

    :cond_8
    move v1, v3

    goto/16 :goto_0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x1

    return v0
.end method
