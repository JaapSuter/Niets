.class Lcom/whatsapp/vr;
.super Ljava/lang/Object;
.source "vr.java"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x1c

    const/16 v1, 0x1b

    const/16 v3, 0x9

    const/4 v2, 0x4

    const/4 v6, 0x0

    const/4 v0, 0x7

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "jbtl"

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

    const-string v0, ">!$"

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

    const-string v0, "1iayp\u007fxa&"

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

    const-string v0, "yik|lAxvl}j~+osku`)rqo$d}jxl&"

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

    const-string v0, "yik|lAxvl}j~+gyi;pf<rrw}3"

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

    aput-object v0, v9, v2

    const/4 v10, 0x5

    const-string v0, ">;$"

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

    const-string v0, "l~w|pj!"

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

    sput-object v9, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

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
    const/16 v0, 0x1e

    goto :goto_7

    :pswitch_1
    move v0, v1

    goto :goto_7

    :pswitch_2
    move v0, v2

    goto :goto_7

    :pswitch_3
    move v0, v3

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
    const/16 v0, 0x1e

    goto :goto_8

    :pswitch_5
    move v0, v1

    goto :goto_8

    :pswitch_6
    move v0, v2

    goto :goto_8

    :pswitch_7
    move v0, v3

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
    const/16 v0, 0x1e

    goto :goto_9

    :pswitch_9
    move v0, v1

    goto :goto_9

    :pswitch_a
    move v0, v2

    goto :goto_9

    :pswitch_b
    move v0, v3

    goto :goto_9

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x1e

    goto :goto_a

    :pswitch_d
    move v0, v1

    goto :goto_a

    :pswitch_e
    move v0, v2

    goto :goto_a

    :pswitch_f
    move v0, v3

    goto :goto_a

    :cond_4
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x1e

    goto :goto_b

    :pswitch_11
    move v0, v1

    goto :goto_b

    :pswitch_12
    move v0, v2

    goto :goto_b

    :pswitch_13
    move v0, v3

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
    const/16 v0, 0x1e

    goto :goto_c

    :pswitch_15
    move v0, v1

    goto :goto_c

    :pswitch_16
    move v0, v2

    goto :goto_c

    :pswitch_17
    move v0, v3

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
    const/16 v0, 0x1e

    goto :goto_d

    :pswitch_19
    move v0, v1

    goto :goto_d

    :pswitch_1a
    move v0, v2

    goto :goto_d

    :pswitch_1b
    move v0, v3

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

.method constructor <init>(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 49
    iput-object p1, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0
    .parameter

    .prologue
    .line 16
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 67
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 11
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 42
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setGravity(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-boolean v0, v0, Lcom/whatsapp/EditGroupSubject;->C:Z

    if-eqz v0, :cond_1

    .line 68
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/whatsapp/EditGroupSubject;->C:Z

    .line 41
    :goto_0
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->o:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v2, v2, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v2}, Landroid/widget/MultiAutoCompleteTextView;->getBottom()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 54
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 28
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    const v1, 0x7f0d010a

    invoke-virtual {v0, v1}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v3, :cond_3

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    const v1, 0x7f0d010a

    invoke-virtual {v0, v1}, Lcom/whatsapp/EditGroupSubject;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 37
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 61
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v1, v0}, Lcom/whatsapp/EditGroupSubject;->b(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 31
    sget-boolean v1, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v1, :cond_4

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v2, v2, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v6, 0x1

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v5}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v6, 0x5

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v2, v2, Lcom/whatsapp/EditGroupSubject;->n:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v6, 0x1

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 65
    :cond_4
    const/4 v1, 0x0

    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_1
    array-length v0, v5

    if-lt v2, v0, :cond_5

    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_15

    .line 71
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_e

    array-length v0, v5

    if-ge v2, v0, :cond_e

    .line 56
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    aget-object v6, v5, v2

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lcom/whatsapp/EditGroupSubject;->c(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 55
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/yr;

    iget-object v0, v0, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 45
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    if-eqz v0, :cond_a

    .line 52
    iget-object v0, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_6

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v8, 0x3

    aget-object v7, v7, v8

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v7, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v8, 0x2

    aget-object v7, v7, v8

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 19
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v0, v0, Lcom/whatsapp/EditGroupSubject;->z:I

    const/4 v7, -0x1

    if-ne v0, v7, :cond_7

    .line 66
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iput v2, v0, Lcom/whatsapp/EditGroupSubject;->z:I

    .line 57
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 24
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const/high16 v9, -0x100

    invoke-direct {v8, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v9, v0

    const/16 v10, 0x21

    invoke-interface {v7, v8, v0, v9, v10}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 62
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v0, v8

    invoke-virtual {v7, v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 7
    :cond_8
    const/4 v7, -0x1

    if-le v0, v7, :cond_9

    .line 10
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const/high16 v9, -0x100

    invoke-direct {v8, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v9, v0

    const/16 v10, 0x21

    invoke-interface {v7, v8, v0, v9, v10}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 2
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v0, v8

    invoke-virtual {v7, v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-eqz v3, :cond_8

    .line 30
    :cond_9
    if-eqz v3, :cond_b

    .line 17
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 29
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const v9, -0x777778

    invoke-direct {v8, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v0

    const/16 v9, 0x21

    invoke-interface {v7, v8, v0, v6, v9}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 35
    :cond_b
    if-eqz v3, :cond_d

    .line 53
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_d
    if-eqz v3, :cond_14

    .line 48
    :cond_e
    array-length v0, v5

    if-ge v2, v0, :cond_14

    .line 14
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    aget-object v6, v5, v2

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lcom/whatsapp/EditGroupSubject;->c(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 69
    sget-object v0, Lcom/whatsapp/EditGroupSubject;->s:Ljava/util/HashMap;

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    if-eqz v0, :cond_13

    .line 51
    iget-object v0, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v0, v0, Lcom/whatsapp/EditGroupSubject;->z:I

    const/4 v7, -0x1

    if-ne v0, v7, :cond_f

    .line 32
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iput v2, v0, Lcom/whatsapp/EditGroupSubject;->z:I

    .line 20
    :cond_f
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_10

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v8, 0x4

    aget-object v7, v7, v8

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v7, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v8, 0x2

    aget-object v7, v7, v8

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 27
    :cond_10
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 13
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const/high16 v9, -0x100

    invoke-direct {v8, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v9, v0

    const/16 v10, 0x21

    invoke-interface {v7, v8, v0, v9, v10}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 26
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v0, v8

    invoke-virtual {v7, v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 47
    :cond_11
    const/4 v7, -0x1

    if-le v0, v7, :cond_12

    .line 9
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const/high16 v9, -0x100

    invoke-direct {v8, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v9, v0

    const/16 v10, 0x21

    invoke-interface {v7, v8, v0, v9, v10}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 43
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v0, v8

    invoke-virtual {v7, v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-eqz v3, :cond_11

    .line 15
    :cond_12
    if-eqz v3, :cond_14

    .line 40
    :cond_13
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 46
    iget-object v7, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v7, v7, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v7

    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    const v9, -0x777778

    invoke-direct {v8, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v0

    const/16 v9, 0x21

    invoke-interface {v7, v8, v0, v6, v9}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 22
    :cond_14
    add-int/lit8 v0, v1, 0x1

    .line 60
    add-int/lit8 v1, v2, 0x1

    if-eqz v3, :cond_17

    .line 39
    :cond_15
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/whatsapp/EditGroupSubject;->D:Ljava/lang/String;

    .line 44
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 36
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 34
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->f(Lcom/whatsapp/EditGroupSubject;)V

    .line 59
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_16

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    sget-object v1, Lcom/whatsapp/vr;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/EditGroupSubject;->a(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->e(Lcom/whatsapp/EditGroupSubject;)V

    .line 50
    :cond_16
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->invalidate()V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/vr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->d(Lcom/whatsapp/EditGroupSubject;)V

    goto/16 :goto_0

    :cond_17
    move v2, v1

    move v1, v0

    goto/16 :goto_1
.end method
