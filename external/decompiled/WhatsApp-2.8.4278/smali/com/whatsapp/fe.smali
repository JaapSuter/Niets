.class public Lcom/whatsapp/fe;
.super Landroid/widget/ArrayAdapter;
.source "fe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/whatsapp/zq;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/view/LayoutInflater;

.field private c:Landroid/widget/Filter;

.field final d:Lcom/whatsapp/ContactPicker;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u0003W"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/fe;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7d

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x23

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x77

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x5b

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x1b

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/ContactPicker;Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 116
    iput-object p1, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    .line 21
    const v0, 0x7f030014

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 57
    new-instance v0, Lcom/whatsapp/ve;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/ve;-><init>(Lcom/whatsapp/fe;Lcom/whatsapp/tj;)V

    iput-object v0, p0, Lcom/whatsapp/fe;->c:Landroid/widget/Filter;

    .line 22
    iput-object p3, p0, Lcom/whatsapp/fe;->a:Ljava/util/ArrayList;

    .line 28
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    .line 87
    return-void
.end method


# virtual methods
.method public a(I)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 37
    iget-object v0, p0, Lcom/whatsapp/fe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/whatsapp/fe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/whatsapp/fe;->c:Landroid/widget/Filter;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 54
    invoke-virtual {p0, p1}, Lcom/whatsapp/fe;->a(I)Lcom/whatsapp/zq;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter

    .prologue
    .line 70
    mul-int/lit16 v0, p1, 0x400

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 69
    invoke-virtual {p0, p1}, Lcom/whatsapp/fe;->a(I)Lcom/whatsapp/zq;

    move-result-object v7

    .line 100
    invoke-static {v7}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/zq;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/whatsapp/fe;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 47
    iget-object v1, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v2, 0x7f030048

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 91
    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 34
    const v1, 0x7f0d0146

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 77
    const v1, 0x7f020416

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 102
    :goto_0
    return-object v0

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0, p1}, Lcom/whatsapp/ContactPicker;->b(Lcom/whatsapp/ContactPicker;I)Z

    move-result v2

    .line 71
    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0, p1}, Lcom/whatsapp/ContactPicker;->d(Lcom/whatsapp/ContactPicker;I)Z

    move-result v3

    .line 23
    if-nez p2, :cond_7

    .line 113
    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0, p1}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030015

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 118
    if-eqz v2, :cond_2

    .line 67
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    if-eqz v6, :cond_3

    .line 95
    :cond_2
    const v0, 0x7f0d009f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    const v0, 0x7f0d00a1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 30
    const v1, 0x7f0902b0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 40
    const v0, 0x7f0d00a0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0203c6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 107
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 110
    :cond_3
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz v6, :cond_c

    .line 56
    :cond_4
    if-eqz v3, :cond_6

    .line 44
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030013

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 73
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x2

    iget-object v4, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v4}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0a000f

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    invoke-direct {v0, v1, v4}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 31
    const v1, 0x7f0d0097

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1
    const v0, 0x7f0d0098

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 61
    :goto_1
    const v0, 0x7f0d0098

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0900ca

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 42
    :cond_5
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 60
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 53
    if-eqz v6, :cond_c

    .line 20
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030014

    const/4 v4, 0x0

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 115
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    if-eqz v6, :cond_c

    .line 15
    :cond_7
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 35
    if-eqz v2, :cond_8

    .line 64
    const/4 v0, 0x2

    if-eq v4, v0, :cond_c

    .line 38
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030015

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 104
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 33
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    if-eqz v6, :cond_c

    .line 18
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0, p1}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 106
    const/4 v0, 0x4

    if-eq v4, v0, :cond_c

    .line 8
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030015

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 49
    const v0, 0x7f0d00a0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0203c6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 50
    const v0, 0x7f0d009f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    const v0, 0x7f0d00a1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 9
    const v1, 0x7f0902b0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 13
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 17
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 45
    if-eqz v6, :cond_c

    :cond_9
    move-object v0, p2

    .line 120
    if-eqz v3, :cond_19

    .line 79
    const/4 v1, 0x5

    if-eq v4, v1, :cond_a

    .line 41
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030013

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 89
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v5, -0x2

    iget-object v8, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v8}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0a000f

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-direct {v1, v5, v8}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 14
    const v5, 0x7f0d0097

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    const v1, 0x7f0d0098

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Landroid/view/View;->setClickable(Z)V

    .line 5
    const v1, 0x7f020414

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 99
    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_a
    move-object v1, v0

    .line 90
    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    .line 58
    :cond_b
    const v0, 0x7f0d0098

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v5, 0x7f0900ca

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 98
    if-eqz v6, :cond_e

    move-object p2, v1

    .line 25
    :goto_2
    const/4 v0, 0x1

    if-eq v4, v0, :cond_c

    .line 75
    iget-object v0, p0, Lcom/whatsapp/fe;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030014

    const/4 v4, 0x0

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 96
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_c
    move-object v5, p2

    .line 111
    :goto_3
    if-nez v2, :cond_d

    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v0, p1}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;I)Z

    move-result v0

    if-nez v0, :cond_d

    if-eqz v3, :cond_f

    :cond_d
    move-object v0, v5

    .line 102
    goto/16 :goto_0

    .line 93
    :pswitch_0
    const v0, 0x7f0d0098

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0900c8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 36
    if-eqz v6, :cond_5

    .line 16
    :pswitch_1
    const v0, 0x7f0d0098

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0900c9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 76
    if-eqz v6, :cond_5

    .line 108
    :pswitch_2
    const v0, 0x7f0d0098

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0900ca

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 63
    if-eqz v6, :cond_5

    goto/16 :goto_1

    .line 81
    :pswitch_3
    const v0, 0x7f0d0098

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v5, 0x7f0900c8

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 19
    if-eqz v6, :cond_e

    .line 119
    :pswitch_4
    const v0, 0x7f0d0098

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v5, 0x7f0900c9

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 39
    if-eqz v6, :cond_e

    .line 66
    :pswitch_5
    const v0, 0x7f0d0098

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    const v5, 0x7f0900ca

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 68
    if-nez v6, :cond_b

    :cond_e
    move-object v5, v1

    goto/16 :goto_3

    .line 10
    :cond_f
    const v0, 0x7f0d0099

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/LoadPhotoImageView;

    .line 26
    iget-object v1, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->m(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/pj;

    move-result-object v1

    invoke-virtual {v1, v7, v0}, Lcom/whatsapp/pj;->a(Lcom/whatsapp/zq;Landroid/widget/ImageView;)V

    .line 4
    const v0, 0x7f0d009b

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 29
    const v1, 0x7f0d009c

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 82
    const v2, 0x7f0d009a

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 7
    invoke-virtual {v7}, Lcom/whatsapp/zq;->o()Z

    move-result v3

    if-eqz v3, :cond_11

    .line 78
    invoke-virtual {v7}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-static {v3, v4}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 59
    if-nez v3, :cond_10

    invoke-virtual {v7}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    :cond_10
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v3, v7, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/whatsapp/eu;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    const/high16 v3, -0x100

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    const/4 v3, 0x0

    invoke-virtual {v5, v3}, Landroid/view/View;->setLongClickable(Z)V

    .line 24
    if-eqz v6, :cond_14

    .line 92
    :cond_11
    invoke-virtual {v7}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v3, v7, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 105
    const v3, 0x7f09016b

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 43
    const v3, -0x777778

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Landroid/view/View;->setLongClickable(Z)V

    if-eqz v6, :cond_13

    .line 103
    :cond_12
    iget-object v3, v7, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    if-eqz v3, :cond_17

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v7, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/fe;->z:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 6
    :goto_4
    iget-object v4, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v4}, Lcom/whatsapp/ContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v4

    .line 32
    if-nez v4, :cond_18

    :goto_5
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 27
    :cond_13
    iget-object v0, p0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v0}, Lcom/whatsapp/ContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/whatsapp/zq;->a(Landroid/content/res/Resources;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 109
    if-eqz v0, :cond_14

    .line 51
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :cond_14
    rem-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_15

    .line 94
    const v0, 0x7f020414

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz v6, :cond_16

    .line 85
    :cond_15
    const v0, 0x7f020416

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_16
    move-object v0, v5

    .line 52
    goto/16 :goto_0

    .line 103
    :cond_17
    sget-object v3, Lcom/whatsapp/fe;->z:Ljava/lang/String;

    goto :goto_4

    :cond_18
    move-object v3, v4

    .line 32
    goto :goto_5

    :cond_19
    move-object p2, v0

    goto/16 :goto_2

    .line 62
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 90
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 12
    const/4 v0, 0x1

    return v0
.end method
