.class public Lcom/whatsapp/VerifyMessageStoreActivity;
.super Lcom/whatsapp/UserFeedbackActivity;
.source "VerifyMessageStoreActivity.java"


# static fields
.field protected static j:Lcom/whatsapp/f;

.field private static final z:[Ljava/lang/String;


# instance fields
.field protected k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v4, 0x3f

    const/16 v1, 0x3c

    const/16 v3, 0x35

    const/16 v2, 0x27

    const/4 v6, 0x0

    const/16 v0, 0x8

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010IT\u001b]VOS\u0011GFUA\u001bMVOS\r\u001a]]D\u0015@OZN\u0012PLZH\u000b[[\u001c"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\u0013P[UF\u001dTMXI\u0011AYSR\u0010Q^OL\u000cPKN^"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\rPKIW"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\u000cPLHH\u000cP[IB\nZZNU\u0011G"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\u0019GPIW\rLQ_"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\u000cPLHH\u000cP"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\u000cPLHH\u000cPYNH\u0013W^_L\u000bE[IB\nZZNU\u0011G\\]U\u001a[PHA\u0011@QXF\r^MYS\u000cL"

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

    const-string v0, "JB\u000c\\YEJ\rRLHH\u000cP\u0010XN\u001fYP[\u0008\u0013FXOS\u0011GZYU\u000cZM"

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

    sput-object v9, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_8

    :pswitch_3
    move v0, v3

    goto :goto_8

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_9

    :pswitch_7
    move v0, v3

    goto :goto_9

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_a

    :pswitch_b
    move v0, v3

    goto :goto_a

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_b

    :pswitch_f
    move v0, v3

    goto :goto_b

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_c

    :pswitch_13
    move v0, v3

    goto :goto_c

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_d

    :pswitch_17
    move v0, v3

    goto :goto_d

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_e

    :pswitch_1b
    move v0, v3

    goto :goto_e

    :cond_7
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

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
    const/16 v0, 0x7e

    goto :goto_f

    :pswitch_1f
    move v0, v3

    goto :goto_f

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
    .line 15
    invoke-direct {p0}, Lcom/whatsapp/UserFeedbackActivity;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    .line 32
    return-void
.end method


# virtual methods
.method protected c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 23
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0}, Lcom/whatsapp/fq;->e()I

    move-result v0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 36
    if-lez v0, :cond_0

    .line 39
    const/16 v0, 0x67

    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->showDialog(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Lcom/whatsapp/ac;

    iget-boolean v1, p0, Lcom/whatsapp/VerifyMessageStoreActivity;->k:Z

    invoke-direct {v0, p0, v3, v1}, Lcom/whatsapp/ac;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;ZZ)V

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ac;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 42
    :cond_1
    return-void
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 38
    return-void
.end method

.method protected e()V
    .locals 0

    .prologue
    .line 11
    return-void
.end method

.method protected f()V
    .locals 0

    .prologue
    .line 27
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 7
    .parameter

    .prologue
    const v6, 0x7f090011

    const v5, 0x7f090010

    const v4, 0x7f09000d

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 26
    packed-switch p1, :pswitch_data_0

    .line 3
    invoke-super {p0, p1}, Lcom/whatsapp/UserFeedbackActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 35
    :goto_0
    return-object v0

    .line 31
    :pswitch_0
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 10
    new-instance v0, Lcom/whatsapp/f;

    invoke-direct {v0, p0}, Lcom/whatsapp/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    .line 6
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    const v1, 0x7f0902a9

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setTitle(Ljava/lang/CharSequence;)V

    .line 30
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    const v1, 0x7f0902aa

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setMessage(Ljava/lang/CharSequence;)V

    .line 4
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    invoke-virtual {v0, v3}, Lcom/whatsapp/f;->setIndeterminate(Z)V

    .line 41
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    invoke-virtual {v0, v3}, Lcom/whatsapp/f;->setCancelable(Z)V

    .line 24
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    invoke-virtual {v0, v2}, Lcom/whatsapp/f;->setProgressStyle(I)V

    .line 28
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->j:Lcom/whatsapp/f;

    goto :goto_0

    .line 16
    :pswitch_1
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 18
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0902ab

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/x5;

    invoke-direct {v2, p0}, Lcom/whatsapp/x5;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 7
    :pswitch_2
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 35
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0900ac

    :goto_1
    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900e4

    new-instance v2, Lcom/whatsapp/b6;

    invoke-direct {v2, p0}, Lcom/whatsapp/b6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09001e

    new-instance v2, Lcom/whatsapp/a6;

    invoke-direct {v2, p0}, Lcom/whatsapp/a6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f0900ad

    goto :goto_1

    .line 19
    :pswitch_3
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f0900b1

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0900ac

    :goto_2
    invoke-virtual {p0, v0}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 33
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900e4

    new-instance v2, Lcom/whatsapp/d6;

    invoke-direct {v2, p0}, Lcom/whatsapp/d6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09001e

    new-instance v2, Lcom/whatsapp/c6;

    invoke-direct {v2, p0}, Lcom/whatsapp/c6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 43
    :cond_1
    const v0, 0x7f0900ad

    goto :goto_2

    .line 25
    :pswitch_4
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 14
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0900ae

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900af

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/f6;

    invoke-direct {v1, p0}, Lcom/whatsapp/f6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v5, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/e6;

    invoke-direct {v1, p0}, Lcom/whatsapp/e6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 12
    :pswitch_5
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f0900b1

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f0900af

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 17
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0900b0

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/h6;

    invoke-direct {v1, p0}, Lcom/whatsapp/h6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v5, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/g6;

    invoke-direct {v1, p0}, Lcom/whatsapp/g6;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 13
    :pswitch_6
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0900b2

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900b3

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900b5

    new-instance v2, Lcom/whatsapp/z5;

    invoke-direct {v2, p0}, Lcom/whatsapp/z5;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900b4

    new-instance v2, Lcom/whatsapp/y5;

    invoke-direct {v2, p0}, Lcom/whatsapp/y5;-><init>(Lcom/whatsapp/VerifyMessageStoreActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 9
    :pswitch_7
    sget-object v0, Lcom/whatsapp/VerifyMessageStoreActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 8
    new-instance v0, Lcom/whatsapp/f;

    invoke-direct {v0, p0}, Lcom/whatsapp/f;-><init>(Landroid/content/Context;)V

    .line 29
    const v1, 0x7f090089

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setTitle(Ljava/lang/CharSequence;)V

    .line 5
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/VerifyMessageStoreActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/f;->setMessage(Ljava/lang/CharSequence;)V

    .line 21
    invoke-virtual {v0, v2}, Lcom/whatsapp/f;->setIndeterminate(Z)V

    .line 22
    invoke-virtual {v0, v3}, Lcom/whatsapp/f;->setCancelable(Z)V

    goto/16 :goto_0

    .line 26
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_7
        :pswitch_5
        :pswitch_6
        :pswitch_3
    .end packed-switch
.end method
