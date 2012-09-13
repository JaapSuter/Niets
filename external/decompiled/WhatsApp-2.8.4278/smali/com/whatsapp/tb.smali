.class public Lcom/whatsapp/tb;
.super Landroid/os/AsyncTask;
.source "tb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field final b:Lcom/whatsapp/RegisterPhone;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x5d

    const/16 v1, 0x51

    const/16 v2, 0x4e

    const/16 v4, 0x13

    const/4 v6, 0x0

    const/4 v0, 0x6

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u00134)4`\u00154<rc\t> 8<\u00029+>x\u00134\'3`\u00150\"1v\u0005~+/a\u000e#n"

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

    const-string v0, "\u00134)4`\u00154<rc\t> 8<\u00029+>x\u00134\'3`\u00150\"1v\u0005~\'2v\u0013#!/3"

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

    const-string v0, "A#+;f\u00124*"

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

    const-string v0, "\u00134)4`\u00154<rc\t> 8<\u000f49pz\u000f\":<\u007f\r0:4|\u000f"

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

    const-string v0, "\u00134)4`\u00154<rc\t> 8<\u00134\'3`\u00150\"1v\u0005"

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

    const-string v0, "\u00134)4`\u00154<rc\t> 8<\u0003=!>x\u00045"

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

    sput-object v9, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

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
    const/16 v0, 0x61

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
    const/16 v0, 0x61

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
    const/16 v0, 0x61

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
    const/16 v0, 0x61

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
    const/16 v0, 0x61

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
    const/16 v0, 0x61

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

.method protected constructor <init>(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 19
    iput-object p1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Integer;
    .locals 9
    .parameter

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x2

    const/4 v5, 0x1

    .line 48
    const/4 v0, 0x3

    :try_start_0
    aget-object v0, p1, v0

    .line 4
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    .line 25
    const/4 v0, 0x0

    .line 54
    :cond_0
    const/4 v2, 0x0

    aget-object v2, p1, v2

    const/4 v3, 0x1

    aget-object v3, p1, v3

    const/4 v4, 0x2

    aget-object v4, p1, v4

    invoke-static {v2, v3, v4, v0}, Lcom/whatsapp/yp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/zp;

    move-result-object v0

    .line 37
    iget-object v2, v0, Lcom/whatsapp/zp;->a:Lcom/whatsapp/tf;

    sget-object v3, Lcom/whatsapp/tf;->a:Lcom/whatsapp/tf;

    if-ne v2, v3, :cond_1

    .line 49
    iget-object v0, v0, Lcom/whatsapp/zp;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/whatsapp/tb;->a:Ljava/lang/String;

    .line 28
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 29
    :goto_0
    return-object v0

    .line 41
    :cond_1
    iget-object v2, v0, Lcom/whatsapp/zp;->a:Lcom/whatsapp/tf;

    sget-object v3, Lcom/whatsapp/tf;->b:Lcom/whatsapp/tf;

    if-ne v2, v3, :cond_4

    .line 29
    iget-object v0, v0, Lcom/whatsapp/zp;->b:Lcom/whatsapp/sf;

    sget-object v2, Lcom/whatsapp/sf;->b:Lcom/whatsapp/sf;

    if-ne v0, v2, :cond_2

    const/4 v0, 0x5

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    .line 50
    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 11
    if-eqz v0, :cond_3

    sget-object v2, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 26
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 12
    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 20
    :catch_1
    move-exception v0

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 22
    :cond_4
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/16 v3, 0x9

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 30
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    iput-boolean v6, v1, Lcom/whatsapp/RegisterPhone;->A:Z

    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_0

    .line 24
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1, v3}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 10
    sget-object v1, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

    aget-object v1, v1, v7

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 6
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-object v2, p0, Lcom/whatsapp/tb;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/whatsapp/App;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-static {v1, v6}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;Z)V

    if-eqz v0, :cond_5

    .line 53
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    .line 21
    sget-object v1, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 44
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    sget-object v2, Lcom/whatsapp/VerifyNumber;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/whatsapp/RegisterPhone;->e(Ljava/lang/String;)V

    .line 45
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1}, Lcom/whatsapp/RegisterPhone;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 34
    new-instance v1, Lcom/whatsapp/ub;

    iget-object v2, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-direct {v1, v2}, Lcom/whatsapp/ub;-><init>(Lcom/whatsapp/RegisterPhone;)V

    new-array v2, v6, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/whatsapp/ub;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    if-eqz v0, :cond_5

    .line 33
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1, v3}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 27
    const/16 v1, 0xf

    invoke-static {v1}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 23
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-static {v1}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    iget-boolean v1, v1, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    .line 51
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    const/16 v2, 0x15

    invoke-virtual {v1, v2}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v0, :cond_5

    .line 42
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_3

    .line 1
    sget-object v1, Lcom/whatsapp/tb;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 32
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    iput-boolean v4, v1, Lcom/whatsapp/RegisterPhone;->A:Z

    .line 7
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1, v3}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 9
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    iget-boolean v1, v1, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    .line 46
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    const/16 v2, 0x17

    invoke-virtual {v1, v2}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v0, :cond_5

    .line 36
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v7, :cond_4

    .line 39
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1, v3}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 14
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    iget-boolean v1, v1, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v1}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    .line 17
    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    const/16 v2, 0x6d

    invoke-virtual {v1, v2}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v0, :cond_5

    .line 47
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v5, :cond_5

    .line 15
    iget-object v0, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0, v3}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 16
    iget-object v0, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    const v2, 0x7f09004d

    new-array v3, v4, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    const v5, 0x7f090048

    invoke-virtual {v4, v5}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    .line 8
    :cond_5
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 18
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/tb;->a([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 13
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/tb;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/tb;->b:Lcom/whatsapp/RegisterPhone;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    .line 40
    return-void
.end method
