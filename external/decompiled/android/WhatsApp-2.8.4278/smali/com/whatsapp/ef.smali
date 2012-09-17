.class public Lcom/whatsapp/ef;
.super Lcom/whatsapp/ze;
.source "ef.java"


# static fields
.field private static final G:[Ljava/lang/String;


# instance fields
.field private final F:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v2, 0x66

    const/16 v3, 0x3d

    const/16 v1, 0x33

    const/16 v4, 0x9

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001aV\n"

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

    const-string v0, "\u0003R\u000fQ}\u0001"

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

    sput-object v9, Lcom/whatsapp/ef;->G:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x6e

    goto :goto_2

    :pswitch_1
    move v0, v1

    goto :goto_2

    :pswitch_2
    move v0, v2

    goto :goto_2

    :pswitch_3
    move v0, v3

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x6e

    goto :goto_3

    :pswitch_5
    move v0, v1

    goto :goto_3

    :pswitch_6
    move v0, v2

    goto :goto_3

    :pswitch_7
    move v0, v3

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

.method constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/ze;-><init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V

    .line 20
    const v0, 0x7f0d00d7

    invoke-virtual {p0, v0}, Lcom/whatsapp/ef;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    .line 10
    invoke-direct {p0, p2}, Lcom/whatsapp/ef;->b(Lcom/whatsapp/sz;)V

    .line 37
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;
    .locals 8
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 52
    invoke-static {p1}, Lhb;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lhb;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move-object v0, p2

    .line 57
    :cond_1
    :goto_0
    return-object v0

    .line 32
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    move v1, v0

    move-object v0, p2

    .line 19
    :cond_3
    if-ltz v1, :cond_1

    .line 36
    if-nez v0, :cond_4

    .line 11
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 17
    :cond_4
    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    const/16 v6, -0x100

    invoke-direct {v5, v6}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v1

    const/16 v7, 0x21

    invoke-virtual {v0, v5, v1, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 12
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v4, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    if-eqz v2, :cond_3

    goto :goto_0
.end method

.method private b(Lcom/whatsapp/sz;)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x2

    const/4 v3, 0x4

    const/4 v2, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 58
    iget-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 35
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    if-eqz v4, :cond_1

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x13

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 7
    :cond_1
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ef;->f:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 55
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v5, p0, Lcom/whatsapp/ef;->n:Lcom/whatsapp/Conversation;

    iget-object v5, v5, Lcom/whatsapp/Conversation;->sb:Ljava/lang/String;

    invoke-static {v1, v5, v0}, Lcom/whatsapp/ef;->a(Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    :cond_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whatsapp/ef;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/ef;->b(Landroid/content/res/Resources;)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 24
    const v0, 0x7f0d00c9

    invoke-virtual {p0, v0}, Lcom/whatsapp/ef;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 16
    iget v1, p1, Lcom/whatsapp/sz;->a:I

    if-ne v1, v3, :cond_3

    .line 5
    iget-object v5, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v1

    if-eqz v1, :cond_7

    move v1, v2

    :goto_1
    invoke-virtual {v5, v1, v2, v3, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 48
    if-eqz v0, :cond_5

    .line 22
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v1

    if-eqz v1, :cond_8

    move v1, v3

    :goto_2
    invoke-virtual {v0, v1, v2, v2, v6}, Landroid/widget/ImageView;->setPadding(IIII)V

    if-eqz v4, :cond_5

    .line 21
    :cond_3
    iget-object v1, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v2, v3, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 54
    if-eqz v0, :cond_5

    .line 8
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v1

    if-eqz v1, :cond_9

    move v1, v3

    :goto_3
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v4

    if-eqz v4, :cond_4

    move v3, v2

    :cond_4
    invoke-virtual {v0, v1, v2, v3, v6}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 27
    :cond_5
    return-void

    .line 30
    :cond_6
    const/16 v0, 0x15

    goto :goto_0

    :cond_7
    move v1, v3

    .line 5
    goto :goto_1

    :cond_8
    move v1, v2

    .line 22
    goto :goto_2

    :cond_9
    move v1, v2

    .line 8
    goto :goto_3
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 33
    const v0, 0x7f030022

    return v0
.end method

.method public a(Lcom/whatsapp/sz;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 51
    iget-object v0, p0, Lcom/whatsapp/ef;->o:Lcom/whatsapp/sz;

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_1

    .line 42
    :cond_0
    invoke-direct {p0, p1}, Lcom/whatsapp/ef;->b(Lcom/whatsapp/sz;)V

    .line 4
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;Z)V

    .line 47
    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 12
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
    const v11, 0x7f0900c3

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 34
    new-instance v0, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/ef;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f09000b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 39
    iget-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getUrls()[Landroid/text/style/URLSpan;

    move-result-object v3

    .line 46
    array-length v4, v3

    move v0, v1

    :cond_0
    if-ge v0, v4, :cond_3

    aget-object v5, v3, v0

    .line 29
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/whatsapp/ef;->G:[Ljava/lang/String;

    aget-object v7, v7, v1

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 28
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v6

    .line 56
    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 13
    new-instance v7, Lcom/whatsapp/rn;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/ef;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0900c2

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xb

    invoke-direct {v7, v8, v9, v6}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {p1, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    new-instance v7, Lcom/whatsapp/rn;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/ef;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xa

    invoke-direct {v7, v8, v9, v6}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {p1, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 15
    :cond_1
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/whatsapp/ef;->G:[Ljava/lang/String;

    const/4 v8, 0x1

    aget-object v7, v7, v8

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 14
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v5

    const-string v7, ":"

    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v6, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 6
    new-instance v6, Lcom/whatsapp/rn;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/whatsapp/ef;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x9

    invoke-direct {v6, v7, v8, v5}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {p1, v1, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 26
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 50
    :cond_3
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 45
    const v0, 0x7f030023

    return v0
.end method

.method b(Z)V
    .locals 2
    .parameter

    .prologue
    .line 40
    if-eqz p1, :cond_0

    .line 38
    iget-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    const v1, -0xffff01

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ef;->F:Landroid/widget/TextView;

    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/whatsapp/ef;->o:Lcom/whatsapp/sz;

    invoke-direct {p0, v0}, Lcom/whatsapp/ef;->b(Lcom/whatsapp/sz;)V

    .line 31
    invoke-super {p0}, Lcom/whatsapp/ze;->d()V

    .line 9
    return-void
.end method
