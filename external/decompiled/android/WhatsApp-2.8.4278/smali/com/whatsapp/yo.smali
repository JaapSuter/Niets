.class Lcom/whatsapp/yo;
.super Ljava/lang/Object;
.source "yo.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/Conversations;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x5c

    const/16 v1, 0x31

    const/16 v4, 0x30

    const/16 v2, 0x1e

    const/4 v6, 0x0

    const/4 v0, 0x6

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001aCq)@>Y\u007f(\u0010\u0013^j5S8\u0010^(U0A"

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

    const-string v0, ">^p*U/B\u007f(Y2_msS1X}7\u001f7Xz|"

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

    const-string v0, ">^p*U/B\u007f(Y2_msS1X}7\u001f3Dr0\u001f-^m|"

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

    const-string v0, "q\u0011r5C)\u000c"

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

    const-string v0, "}Aq/\r"

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

    const-string v0, ">^p*U/B\u007f(Y2_msS1X}7\u001f3^j|C<\\{|Z4U?|F4Tia"

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

    sput-object v9, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_6
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x5d

    goto :goto_6

    :pswitch_1
    move v0, v1

    goto :goto_6

    :pswitch_2
    move v0, v2

    goto :goto_6

    :pswitch_3
    move v0, v3

    goto :goto_6

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x5d

    goto :goto_7

    :pswitch_5
    move v0, v1

    goto :goto_7

    :pswitch_6
    move v0, v2

    goto :goto_7

    :pswitch_7
    move v0, v3

    goto :goto_7

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x5d

    goto :goto_8

    :pswitch_9
    move v0, v1

    goto :goto_8

    :pswitch_a
    move v0, v2

    goto :goto_8

    :pswitch_b
    move v0, v3

    goto :goto_8

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x5d

    goto :goto_9

    :pswitch_d
    move v0, v1

    goto :goto_9

    :pswitch_e
    move v0, v2

    goto :goto_9

    :pswitch_f
    move v0, v3

    goto :goto_9

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x5d

    goto :goto_a

    :pswitch_11
    move v0, v1

    goto :goto_a

    :pswitch_12
    move v0, v2

    goto :goto_a

    :pswitch_13
    move v0, v3

    goto :goto_a

    :cond_5
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x5d

    goto :goto_b

    :pswitch_15
    move v0, v1

    goto :goto_b

    :pswitch_16
    move v0, v2

    goto :goto_b

    :pswitch_17
    move v0, v3

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
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/yo;->a:Lcom/whatsapp/Conversations;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 10
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const v9, 0x7f090271

    const/4 v8, 0x2

    const/4 v7, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fp;

    .line 28
    if-nez v0, :cond_1

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    aget-object v1, v1, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 33
    :cond_0
    :goto_0
    return-void

    .line 14
    :cond_1
    iget-object v3, v0, Lcom/whatsapp/fp;->l:Ljava/lang/String;

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    const/4 v5, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 24
    iget-object v1, p0, Lcom/whatsapp/yo;->a:Lcom/whatsapp/Conversations;

    iget-object v1, v1, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    const/4 v6, 0x5

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 27
    :cond_2
    invoke-static {v1}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v3

    .line 5
    iget-object v0, v0, Lcom/whatsapp/fp;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    sget-object v0, Lcom/whatsapp/App;->E:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/whatsapp/yo;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 8
    if-eqz v0, :cond_4

    iget-wide v4, v0, Lcom/whatsapp/sz;->m:J

    long-to-int v0, v4

    const/4 v4, -0x2

    if-ne v0, v4, :cond_0

    .line 18
    :cond_4
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 25
    invoke-static {}, Lcom/whatsapp/eu;->b()V

    .line 9
    new-instance v0, Lcom/whatsapp/y8;

    invoke-direct {v0, p0}, Lcom/whatsapp/y8;-><init>(Lcom/whatsapp/yo;)V

    invoke-virtual {v0}, Lcom/whatsapp/y8;->start()V

    if-eqz v2, :cond_6

    .line 29
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/yo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v0, v9, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    if-nez v2, :cond_0

    .line 10
    :cond_6
    if-eqz v2, :cond_0

    :cond_7
    invoke-static {v1}, Lcom/whatsapp/zq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 30
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 32
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->j(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v4

    .line 7
    if-eqz v4, :cond_0

    .line 12
    sget-object v5, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v4}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v6

    iget-object v0, v4, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/Vector;

    invoke-static {v1, v6, v0, v8}, Lcom/whatsapp/eu;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)Lcom/whatsapp/sz;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 19
    new-instance v0, Lcom/whatsapp/z8;

    invoke-direct {v0, p0, v1, v4}, Lcom/whatsapp/z8;-><init>(Lcom/whatsapp/yo;Ljava/lang/String;Lcom/whatsapp/sz;)V

    invoke-virtual {v0}, Lcom/whatsapp/z8;->start()V

    .line 22
    if-eqz v2, :cond_0

    .line 34
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/yo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v0, v9, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    if-eqz v2, :cond_0

    .line 23
    :cond_9
    invoke-virtual {v3}, Lcom/whatsapp/zq;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/whatsapp/yo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v3}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method
