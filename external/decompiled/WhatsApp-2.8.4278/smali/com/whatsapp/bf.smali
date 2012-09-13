.class public Lcom/whatsapp/bf;
.super Lcom/whatsapp/ze;
.source "bf.java"


# static fields
.field private static G:F

.field private static final H:[Ljava/lang/String;


# instance fields
.field private final F:Lcom/whatsapp/DividerView;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x39

    const/16 v1, 0x29

    const/16 v2, 0xd

    const/4 v4, 0x3

    const/4 v6, 0x0

    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "M\n{PgL\u0011RKl^L\u007fK>"

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

    const-string v0, "\t\td]>"

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

    const-string v0, "i\u0010#NkH\u0017~XsYMc\\w"

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

    const-string v0, "\t\u00100"

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

    aput-object v0, v9, v4

    const/4 v8, 0x4

    const-string v0, "M\n{PgL\u0011RKl^L`PpZ\nc^\\[\u000eyfp[\u00007"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/bf;->H:[Ljava/lang/String;

    .line 41
    const/4 v0, 0x0

    sput v0, Lcom/whatsapp/bf;->G:F

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_5

    :pswitch_1
    const/16 v0, 0x63

    goto :goto_5

    :pswitch_2
    move v0, v2

    goto :goto_5

    :pswitch_3
    move v0, v3

    goto :goto_5

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_6

    :pswitch_5
    const/16 v0, 0x63

    goto :goto_6

    :pswitch_6
    move v0, v2

    goto :goto_6

    :pswitch_7
    move v0, v3

    goto :goto_6

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_7

    :pswitch_9
    const/16 v0, 0x63

    goto :goto_7

    :pswitch_a
    move v0, v2

    goto :goto_7

    :pswitch_b
    move v0, v3

    goto :goto_7

    :cond_3
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_8
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_8

    :pswitch_d
    const/16 v0, 0x63

    goto :goto_8

    :pswitch_e
    move v0, v2

    goto :goto_8

    :pswitch_f
    move v0, v3

    goto :goto_8

    :cond_4
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_9

    :pswitch_11
    const/16 v0, 0x63

    goto :goto_9

    :pswitch_12
    move v0, v2

    goto :goto_9

    :pswitch_13
    move v0, v3

    goto :goto_9

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
.end method

.method constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/ze;-><init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V

    .line 57
    invoke-virtual {p0, v0}, Lcom/whatsapp/bf;->setClickable(Z)V

    .line 87
    invoke-virtual {p0, v0}, Lcom/whatsapp/bf;->setLongClickable(Z)V

    .line 79
    const v0, 0x7f0d007c

    invoke-virtual {p0, v0}, Lcom/whatsapp/bf;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/DividerView;

    iput-object v0, p0, Lcom/whatsapp/bf;->F:Lcom/whatsapp/DividerView;

    .line 14
    invoke-direct {p0, p2}, Lcom/whatsapp/bf;->b(Lcom/whatsapp/sz;)V

    .line 61
    return-void
.end method

.method private b(Lcom/whatsapp/sz;)V
    .locals 14
    .parameter

    .prologue
    const/4 v5, -0x1

    const/4 v13, 0x2

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v12, 0x1

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 82
    iget-object v0, p0, Lcom/whatsapp/bf;->F:Lcom/whatsapp/DividerView;

    invoke-virtual {p0}, Lcom/whatsapp/bf;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/bf;->c(Landroid/content/res/Resources;)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/DividerView;->setTextSize(F)V

    .line 70
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    if-ne v0, v5, :cond_1

    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    if-ne v0, v5, :cond_1

    .line 54
    iget-object v0, p0, Lcom/whatsapp/bf;->F:Lcom/whatsapp/DividerView;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f09012d

    invoke-virtual {v1, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/DividerView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 50
    :cond_1
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 32
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 65
    :goto_1
    if-eqz v2, :cond_5

    array-length v0, v2

    if-ne v0, v13, :cond_5

    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-wide v5, v0, Lcom/whatsapp/sz;->m:J

    long-to-int v0, v5

    if-ne v0, v12, :cond_5

    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    aget-object v0, v2, v1

    sget-object v5, Lcom/whatsapp/bf;->H:[Ljava/lang/String;

    aget-object v5, v5, v13

    invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    aget-object v0, v2, v12

    const-string v5, "\""

    invoke-virtual {v0, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    aget-object v5, v2, v12

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-le v0, v5, :cond_5

    .line 52
    :cond_2
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    aget-object v5, v2, v1

    invoke-virtual {v0, v5, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 10
    aget-object v5, v2, v12

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 24
    aget-object v6, v2, v12

    const-string v7, "\""

    invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6

    .line 4
    if-gt v6, v5, :cond_3

    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/whatsapp/bf;->H:[Ljava/lang/String;

    aget-object v8, v8, v1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v8, v8, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/bf;->H:[Ljava/lang/String;

    aget-object v8, v8, v12

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    aget-object v8, v2, v1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v8, Lcom/whatsapp/bf;->H:[Ljava/lang/String;

    const/4 v9, 0x3

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    aget-object v8, v2, v12

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 69
    :cond_3
    sget-object v7, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v8, 0x7f090258

    new-array v9, v13, [Ljava/lang/Object;

    sget-object v10, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    aget-object v11, v2, v1

    invoke-virtual {v10, v11, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u202a"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, "\u202c"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_4
    aput-object v0, v9, v1

    aget-object v0, v2, v12

    add-int/lit8 v2, v5, 0x1

    invoke-virtual {v0, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v12

    invoke-virtual {v7, v8, v9}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 46
    iget-object v2, p0, Lcom/whatsapp/bf;->f:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 7
    iget-object v5, p0, Lcom/whatsapp/bf;->F:Lcom/whatsapp/DividerView;

    if-nez v2, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v5, v0}, Lcom/whatsapp/DividerView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    if-eqz v4, :cond_0

    .line 53
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-nez v0, :cond_6

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/bf;->H:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v2, v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    if-eqz v4, :cond_18

    .line 78
    :cond_6
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    .line 76
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v4, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v4, v4, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 39
    :goto_3
    iget-object v4, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-wide v4, v4, Lcom/whatsapp/sz;->m:J

    long-to-int v4, v4

    packed-switch v4, :pswitch_data_0

    :pswitch_0
    move-object v0, v3

    .line 86
    :goto_4
    iget-object v1, p0, Lcom/whatsapp/bf;->f:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 63
    iget-object v2, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-wide v2, v2, Lcom/whatsapp/sz;->m:J

    const-wide/16 v4, 0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_7

    .line 30
    iget-object v2, p0, Lcom/whatsapp/bf;->n:Lcom/whatsapp/Conversation;

    iget-object v2, v2, Lcom/whatsapp/Conversation;->sb:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/whatsapp/ef;->a(Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 43
    :cond_7
    iget-object v2, p0, Lcom/whatsapp/bf;->F:Lcom/whatsapp/DividerView;

    if-nez v1, :cond_17

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v2, v0}, Lcom/whatsapp/DividerView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 7
    :cond_8
    const-string v0, " "

    invoke-virtual {v2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    goto/16 :goto_2

    .line 2
    :pswitch_1
    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 73
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f090258

    new-array v5, v13, [Ljava/lang/Object;

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u202a"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u202c"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_9
    aput-object v2, v5, v1

    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    invoke-virtual {v0}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v12

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 58
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    invoke-virtual {v0}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 59
    iget-object v2, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    invoke-virtual {v2}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    .line 75
    if-nez v0, :cond_b

    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    invoke-virtual {v3}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_b

    if-eq v0, v2, :cond_b

    .line 74
    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    invoke-virtual {v3}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 55
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v3, 0x7f090257

    new-array v4, v12, [Ljava/lang/Object;

    aput-object v0, v4, v1

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 36
    :cond_b
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090257

    new-array v3, v12, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    invoke-virtual {v4}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 16
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v0, :cond_11

    .line 13
    iget-object v0, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 22
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_c

    .line 66
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f090180

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 84
    :cond_c
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f09017f

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 28
    :cond_d
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 19
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v4, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v4, v4, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 34
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_f

    .line 60
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f09017e

    new-array v5, v12, [Ljava/lang/Object;

    if-eqz v2, :cond_e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u202a"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u202c"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_e
    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 77
    :cond_f
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f09017d

    new-array v5, v12, [Ljava/lang/Object;

    if-eqz v2, :cond_10

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u202a"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u202c"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_10
    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 5
    :cond_11
    const-string v0, ""

    goto/16 :goto_4

    .line 51
    :pswitch_3
    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v3, :cond_12

    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 21
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f09025a

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 40
    :cond_12
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f090259

    new-array v5, v12, [Ljava/lang/Object;

    if-eqz v0, :cond_13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u202a"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u202c"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_13
    aput-object v2, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 42
    :pswitch_4
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f09025d

    new-array v5, v12, [Ljava/lang/Object;

    if-eqz v0, :cond_14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u202a"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u202c"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_14
    aput-object v2, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 89
    :pswitch_5
    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v3, :cond_15

    iget-object v3, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 81
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f09025c

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 48
    :cond_15
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f09025b

    new-array v5, v12, [Ljava/lang/Object;

    if-eqz v0, :cond_16

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u202a"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u202c"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_16
    aput-object v2, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 9
    :pswitch_6
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f09025e

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 43
    :cond_17
    const-string v0, " "

    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    goto/16 :goto_5

    :cond_18
    move v0, v1

    move-object v2, v3

    goto/16 :goto_3

    :cond_19
    move-object v2, v3

    goto/16 :goto_1

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static c(Landroid/content/res/Resources;)F
    .locals 3
    .parameter

    .prologue
    .line 11
    sget v0, Lcom/whatsapp/bf;->G:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 38
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 71
    const v1, 0x7f0a0022

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    div-float v0, v1, v0

    sput v0, Lcom/whatsapp/bf;->G:F

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 18
    sget v1, Lcom/whatsapp/FontListPreference;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, -0x2

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 56
    :cond_1
    sget v1, Lcom/whatsapp/FontListPreference;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 v0, 0x4

    .line 72
    :cond_2
    sget v1, Lcom/whatsapp/bf;->G:F

    int-to-float v0, v0

    add-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 37
    const v0, 0x7f03001c

    return v0
.end method

.method public a(Lcom/whatsapp/sz;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 29
    iget-object v0, p0, Lcom/whatsapp/bf;->o:Lcom/whatsapp/sz;

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_1

    .line 45
    :cond_0
    iput-object p1, p0, Lcom/whatsapp/bf;->o:Lcom/whatsapp/sz;

    iput-object p1, p0, Lcom/whatsapp/bf;->e:Lcom/whatsapp/sz;

    .line 85
    invoke-direct {p0, p1}, Lcom/whatsapp/bf;->b(Lcom/whatsapp/sz;)V

    .line 3
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;Z)V

    .line 20
    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 0
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
    .line 23
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 8
    const v0, 0x7f03001c

    return v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/whatsapp/bf;->o:Lcom/whatsapp/sz;

    invoke-direct {p0, v0}, Lcom/whatsapp/bf;->b(Lcom/whatsapp/sz;)V

    .line 44
    invoke-super {p0}, Lcom/whatsapp/ze;->d()V

    .line 25
    return-void
.end method
