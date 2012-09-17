.class public Lcom/whatsapp/DescribeProblemActivity;
.super Lcom/whatsapp/DialogToastActivity;
.source "DescribeProblemActivity.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Landroid/widget/EditText;

.field private k:I

.field private final l:Landroid/text/TextWatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x3c

    const/16 v1, 0x2e

    const/16 v3, 0x26

    const/4 v4, 0x3

    const/4 v6, 0x0

    const/4 v0, 0x7

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "JYU)s\\SDesOIU/"

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

    const-string v0, "JYU)s\\SDegKOR8lW"

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

    const-string v0, "JYU)s\\SDeqKOS\'f"

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

    const-string v0, "JYU)s\\SD&fC\u0013E8fOHC"

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

    const/4 v10, 0x4

    const-string v0, "MSKdtF]R9b^L\u0008\u000ef]_T#aKlT%aBYK\u000b`ZUP#wW\u0012U/qXYT9wOHS9"

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

    const-string v0, "MSKdtF]R9b^L\u0008\u000ef]_T#aKlT%aBYK\u000b`ZUP#wW\u0012@8lC"

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

    const/4 v8, 0x6

    const-string v0, "MSKdtF]R9b^L\u0008\u000ef]_T#aKlT%aBYK\u000b`ZUP#wW\u0012R3sK"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_7

    :pswitch_1
    move v0, v2

    goto :goto_7

    :pswitch_2
    move v0, v3

    goto :goto_7

    :pswitch_3
    const/16 v0, 0x4a

    goto :goto_7

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_8

    :pswitch_5
    move v0, v2

    goto :goto_8

    :pswitch_6
    move v0, v3

    goto :goto_8

    :pswitch_7
    const/16 v0, 0x4a

    goto :goto_8

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_9

    :pswitch_9
    move v0, v2

    goto :goto_9

    :pswitch_a
    move v0, v3

    goto :goto_9

    :pswitch_b
    const/16 v0, 0x4a

    goto :goto_9

    :cond_3
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_a

    :pswitch_d
    move v0, v2

    goto :goto_a

    :pswitch_e
    move v0, v3

    goto :goto_a

    :pswitch_f
    const/16 v0, 0x4a

    goto :goto_a

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_b

    :pswitch_11
    move v0, v2

    goto :goto_b

    :pswitch_12
    move v0, v3

    goto :goto_b

    :pswitch_13
    const/16 v0, 0x4a

    goto :goto_b

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_c

    :pswitch_15
    move v0, v2

    goto :goto_c

    :pswitch_16
    move v0, v3

    goto :goto_c

    :pswitch_17
    const/16 v0, 0x4a

    goto :goto_c

    :cond_6
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_d

    :pswitch_19
    move v0, v2

    goto :goto_d

    :pswitch_1a
    move v0, v3

    goto :goto_d

    :pswitch_1b
    const/16 v0, 0x4a

    goto :goto_d

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
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 42
    new-instance v0, Lcom/whatsapp/kr;

    invoke-direct {v0, p0}, Lcom/whatsapp/kr;-><init>(Lcom/whatsapp/DescribeProblemActivity;)V

    iput-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->l:Landroid/text/TextWatcher;

    .line 20
    return-void
.end method

.method static a(Lcom/whatsapp/DescribeProblemActivity;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 41
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method static b(Lcom/whatsapp/DescribeProblemActivity;)Landroid/widget/EditText;
    .locals 1
    .parameter

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->j:Landroid/widget/EditText;

    return-object v0
.end method

.method static c(Lcom/whatsapp/DescribeProblemActivity;)Landroid/widget/Button;
    .locals 1
    .parameter

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->g:Landroid/widget/Button;

    return-object v0
.end method

.method static d(Lcom/whatsapp/DescribeProblemActivity;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->i:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .parameter

    .prologue
    .line 26
    sget-object v0, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 29
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    const v0, 0x7f03002f

    invoke-virtual {p0, v0}, Lcom/whatsapp/DescribeProblemActivity;->setContentView(I)V

    .line 37
    const v0, 0x7f0d00fd

    invoke-virtual {p0, v0}, Lcom/whatsapp/DescribeProblemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->j:Landroid/widget/EditText;

    .line 27
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->j:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/DescribeProblemActivity;->l:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 38
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->j:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/DescribeProblemActivity;->j:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 40
    const v0, 0x7f0d00fe

    invoke-virtual {p0, v0}, Lcom/whatsapp/DescribeProblemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->f:Landroid/widget/Button;

    .line 22
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->f:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/ir;

    invoke-direct {v1, p0}, Lcom/whatsapp/ir;-><init>(Lcom/whatsapp/DescribeProblemActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    const v0, 0x7f0d00fc

    invoke-virtual {p0, v0}, Lcom/whatsapp/DescribeProblemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->g:Landroid/widget/Button;

    .line 21
    iget-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->g:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/jr;

    invoke-direct {v1, p0}, Lcom/whatsapp/jr;-><init>(Lcom/whatsapp/DescribeProblemActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    invoke-virtual {p0}, Lcom/whatsapp/DescribeProblemActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 39
    sget-object v0, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->h:Ljava/lang/String;

    .line 11
    sget-object v0, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/DescribeProblemActivity;->i:Ljava/lang/String;

    .line 18
    const v0, 0x7f0d00fb

    invoke-virtual {p0, v0}, Lcom/whatsapp/DescribeProblemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 28
    sget-object v2, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/whatsapp/DescribeProblemActivity;->k:I

    .line 17
    iget v1, p0, Lcom/whatsapp/DescribeProblemActivity;->k:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 35
    const v1, 0x7f0902e2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 19
    :cond_0
    const v1, 0x7f0902e1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 34
    :cond_1
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 2
    .parameter

    .prologue
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 25
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 6
    const v1, 0x7f090051

    invoke-virtual {p0, v1}, Lcom/whatsapp/DescribeProblemActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 12
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 32
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 30
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 10
    sget-object v0, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 15
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 23
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onPause()V

    .line 33
    sget-object v0, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 7
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 2
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onResume()V

    .line 3
    sget-object v0, Lcom/whatsapp/DescribeProblemActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 1
    return-void
.end method
