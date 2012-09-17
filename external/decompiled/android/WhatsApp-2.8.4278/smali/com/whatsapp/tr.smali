.class Lcom/whatsapp/tr;
.super Ljava/lang/Object;
.source "tr.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x44

    const/16 v3, 0x1d

    const/16 v1, 0x12

    const/16 v4, 0xe

    const/4 v6, 0x0

    const/4 v0, 0x7

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "*`+h~\u0012q6xo9wk|b!2\'r|?w\'i\"m|+if$|#=`(w =z\"2&x..z%si(v"

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

    const-string v0, "*`+h~\u0012q6xo9wknf\"g(y`jfdzamz!okc"

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

    const-string v0, ">w(xm92b=h\"g*y.$|7x|9w "

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

    const-string v0, ">w(xm9"

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

    const-string v0, "*`+h~\u0012q6xo9wkt`>w6ik)26x~!s\'x.:{0u.w2"

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

    const-string v0, "*`+h~\u0012q6xo9wkMA\u001e("

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

    const-string v0, "*`+h~\u0012q6xo9wkt`>w6ik)2\'r|?w\'i"

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

    sput-object v9, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

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
    const/16 v0, 0x4d

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
    const/16 v0, 0x4d

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
    const/16 v0, 0x4d

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
    const/16 v0, 0x4d

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
    const/16 v0, 0x4d

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
    const/16 v0, 0x4d

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
    const/16 v0, 0x4d

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
    .line 32
    iput-object p1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 31
    if-nez p2, :cond_1

    .line 26
    :cond_0
    :goto_0
    return-void

    .line 16
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/xr;

    .line 6
    iget-object v1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v1, v1, Lcom/whatsapp/EditGroupSubject;->z:I

    if-ltz v1, :cond_6

    iget-object v1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v1, v1, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 8
    sget-object v1, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v3, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v3, v3, Lcom/whatsapp/EditGroupSubject;->z:I

    if-le v1, v3, :cond_3

    .line 3
    sget-object v1, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v3, v3, Lcom/whatsapp/EditGroupSubject;->z:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/xr;

    invoke-virtual {v1, v0}, Lcom/whatsapp/xr;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 17
    sget-object v1, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v3, v3, Lcom/whatsapp/EditGroupSubject;->z:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 27
    sget-object v1, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v1, v1, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v3, v3, Lcom/whatsapp/EditGroupSubject;->z:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    iget-object v1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v1, v1, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    sget-boolean v1, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v1, :cond_4

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    if-eqz v2, :cond_4

    .line 22
    :cond_2
    sget-boolean v1, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v1, :cond_4

    .line 1
    sget-object v1, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    if-eqz v2, :cond_4

    .line 19
    :cond_3
    sget-object v1, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v1, v1, Lcom/whatsapp/EditGroupSubject;->v:Ljava/util/ArrayList;

    iget-object v0, v0, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_4

    .line 35
    sget-object v0, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->o:Landroid/widget/ScrollView;

    invoke-virtual {v0, v5, v5}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->d(Lcom/whatsapp/EditGroupSubject;)V

    .line 18
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_5

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget v1, v1, Lcom/whatsapp/EditGroupSubject;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    sget-object v1, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/EditGroupSubject;->a(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->e(Lcom/whatsapp/EditGroupSubject;)V

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    const/4 v1, -0x1

    iput v1, v0, Lcom/whatsapp/EditGroupSubject;->z:I

    goto/16 :goto_0

    .line 28
    :cond_6
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_7

    .line 20
    sget-object v0, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 7
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->o:Landroid/widget/ScrollView;

    invoke-virtual {v0, v5, v5}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 14
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->d(Lcom/whatsapp/EditGroupSubject;)V

    .line 30
    sget-boolean v0, Lcom/whatsapp/EditGroupSubject;->w:Z

    if-eqz v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    sget-object v1, Lcom/whatsapp/tr;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/EditGroupSubject;->a(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/tr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->e(Lcom/whatsapp/EditGroupSubject;)V

    goto/16 :goto_0
.end method
