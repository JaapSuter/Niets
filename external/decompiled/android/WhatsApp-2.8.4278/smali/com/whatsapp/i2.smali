.class Lcom/whatsapp/i2;
.super Ljava/lang/Object;
.source "i2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/RegisterPhone;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x52

    const/16 v1, 0x47

    const/16 v4, 0x37

    const/16 v3, 0x27

    const/4 v6, 0x0

    const/16 v0, 0xa

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "57\u0017ND37\u0002\u0008G/=\u001eB\u0018$:\u0015D\\57\u0019ID33\u001cK\u0018)=]DX)<\u0015DC.$\u0019SN"

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

    const-string v0, "gz"

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

    const-string v0, "57\u0017ND37\u0002W_(<\u0015\u0008D\"&\u001eRZ%7\u0002T\u0018$=\u001dJ^3r\u0016F^+7\u0014"

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

    const-string v0, "57\u0017ND37\u0002W_(<\u0015\u0008T$r\u0016F^+7\u0014\u0007C5;\u001dkR&6\u0019IP\u001d7\u0002H\u0017! \u001fJ\u0017\u0004=\u0005IC5+ OX)79IQ("

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

    const-string v0, "57\u0017ND37\u0002\u0008G/=\u001eB\u0018$:\u0015D\\!=\u0002UR.<\u0003SV+>"

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

    const-string v0, "$=\u001d\t@/3\u0004TV7\"^uR ;\u0003SR5\u0002\u0018HY\"|\u0000OX)7/IB*0\u0015U"

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

    const-string v0, "57\u0017ND37\u0002\u0008G/=\u001eB\u0018$1M"

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

    const/4 v10, 0x7

    const-string v0, "h<\u0005JU\" M"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "\u001b\u0016"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_8
    if-gt v7, v8, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x9

    const-string v0, "$=\u001d\t@/3\u0004TV7\"^uR ;\u0003SR5\u0002\u0018HY\"|\u0013HB)&\u0002^h$=\u0014B"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_a

    :pswitch_1
    move v0, v2

    goto :goto_a

    :pswitch_2
    const/16 v0, 0x70

    goto :goto_a

    :pswitch_3
    move v0, v3

    goto :goto_a

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_b

    :pswitch_5
    move v0, v2

    goto :goto_b

    :pswitch_6
    const/16 v0, 0x70

    goto :goto_b

    :pswitch_7
    move v0, v3

    goto :goto_b

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_c

    :pswitch_9
    move v0, v2

    goto :goto_c

    :pswitch_a
    const/16 v0, 0x70

    goto :goto_c

    :pswitch_b
    move v0, v3

    goto :goto_c

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_d

    :pswitch_d
    move v0, v2

    goto :goto_d

    :pswitch_e
    const/16 v0, 0x70

    goto :goto_d

    :pswitch_f
    move v0, v3

    goto :goto_d

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_e

    :pswitch_11
    move v0, v2

    goto :goto_e

    :pswitch_12
    const/16 v0, 0x70

    goto :goto_e

    :pswitch_13
    move v0, v3

    goto :goto_e

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_f

    :pswitch_15
    move v0, v2

    goto :goto_f

    :pswitch_16
    const/16 v0, 0x70

    goto :goto_f

    :pswitch_17
    move v0, v3

    goto :goto_f

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_10

    :pswitch_19
    move v0, v2

    goto :goto_10

    :pswitch_1a
    const/16 v0, 0x70

    goto :goto_10

    :pswitch_1b
    move v0, v3

    goto :goto_10

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_11

    :pswitch_1d
    move v0, v2

    goto :goto_11

    :pswitch_1e
    const/16 v0, 0x70

    goto :goto_11

    :pswitch_1f
    move v0, v3

    goto :goto_11

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_12

    :pswitch_21
    move v0, v2

    goto :goto_12

    :pswitch_22
    const/16 v0, 0x70

    goto :goto_12

    :pswitch_23
    move v0, v3

    goto :goto_12

    :cond_9
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_13
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_13

    :pswitch_25
    move v0, v2

    goto :goto_13

    :pswitch_26
    const/16 v0, 0x70

    goto :goto_13

    :pswitch_27
    move v0, v3

    goto :goto_13

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

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 21
    iput-object p1, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11
    .parameter

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x7

    const/4 v7, 0x1

    const/4 v6, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 51
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 27
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v2, v0}, Lcom/whatsapp/RegisterPhone;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 23
    packed-switch v3, :pswitch_data_0

    .line 5
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 20
    sget-object v4, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    const/16 v5, 0x8

    aget-object v4, v4, v5

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 17
    :try_start_0
    invoke-static {v3, v0}, Lcom/whatsapp/jp;->a(ILjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 50
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    const/4 v5, 0x6

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    aget-object v4, v4, v8

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    aget-object v4, v4, v7

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/whatsapp/VerifyNumber;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 24
    iget-object v3, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v3}, Lcom/whatsapp/RegisterPhone;->d(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v3}, Lcom/whatsapp/RegisterPhone;->e(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 44
    :cond_1
    sget-object v3, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-static {v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 45
    invoke-static {v8}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 39
    :cond_2
    invoke-static {v2}, Lcom/whatsapp/RegisterPhone;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->f(Lcom/whatsapp/RegisterPhone;)V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->g(Lcom/whatsapp/RegisterPhone;)V

    .line 29
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0, v6}, Lcom/whatsapp/RegisterPhone;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 12
    sget-object v2, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->m()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 6
    sget-object v2, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->n()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 14
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_3

    .line 9
    sget-object v0, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    aget-object v0, v0, v9

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 58
    :cond_3
    invoke-static {}, Lcom/whatsapp/u4;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 19
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v1, 0x7f090232

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->d(I)V

    .line 59
    :cond_4
    :goto_1
    return-void

    .line 25
    :pswitch_0
    if-eqz v1, :cond_0

    .line 36
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v1, 0x7f090066

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->d(I)V

    .line 53
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 43
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v1, 0x7f090064

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->d(I)V

    .line 32
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 46
    :pswitch_3
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v1, 0x7f090067

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->d(I)V

    .line 52
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 47
    :pswitch_4
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v2, 0x7f090069

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v4, v4, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 40
    :pswitch_5
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v2, 0x7f09006a

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v4, v4, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 49
    :pswitch_6
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v2, 0x7f090068

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v4, v4, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->D:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    goto/16 :goto_1

    .line 60
    :catch_0
    move-exception v3

    .line 37
    sget-object v4, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    aget-object v4, v4, v10

    invoke-static {v4, v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 2
    :cond_5
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-nez v0, :cond_6

    .line 18
    sget-object v0, Lcom/whatsapp/i2;->z:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v2, 0x7f09004d

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const v5, 0x7f090048

    invoke-virtual {v4, v5}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 8
    :cond_6
    invoke-static {}, Lcom/whatsapp/RegisterPhone;->o()I

    move-result v0

    if-ne v0, v8, :cond_7

    .line 54
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->h(Lcom/whatsapp/RegisterPhone;)V

    .line 13
    new-instance v0, Lcom/whatsapp/tb;

    iget-object v2, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-direct {v0, v2}, Lcom/whatsapp/tb;-><init>(Lcom/whatsapp/RegisterPhone;)V

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->m()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->n()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {}, Lcom/whatsapp/u4;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/mh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v9

    invoke-static {}, Lcom/whatsapp/VerifyNumber;->f()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v10

    invoke-virtual {v0, v2}, Lcom/whatsapp/tb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    if-eqz v1, :cond_4

    .line 15
    :cond_7
    invoke-static {}, Lcom/whatsapp/RegisterPhone;->o()I

    move-result v0

    const/16 v2, 0xe

    if-ne v0, v2, :cond_8

    .line 1
    new-instance v0, Lcom/whatsapp/ub;

    iget-object v2, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-direct {v0, v2}, Lcom/whatsapp/ub;-><init>(Lcom/whatsapp/RegisterPhone;)V

    new-array v2, v6, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/whatsapp/ub;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    if-eqz v1, :cond_4

    .line 3
    :cond_8
    const/16 v0, 0xf

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 28
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    iget-boolean v0, v0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/whatsapp/i2;->a:Lcom/whatsapp/RegisterPhone;

    const/16 v1, 0x15

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    goto/16 :goto_1

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
