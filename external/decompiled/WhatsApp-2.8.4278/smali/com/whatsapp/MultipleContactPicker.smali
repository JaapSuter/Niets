.class public Lcom/whatsapp/MultipleContactPicker;
.super Lcom/whatsapp/DialogToastListActivity;
.source "MultipleContactPicker.java"

# interfaces
.implements Lcom/whatsapp/uk;
.implements Lcom/whatsapp/k2;


# static fields
.field private static final D:[Ljava/lang/String;


# instance fields
.field A:I

.field private B:Lcom/whatsapp/pj;

.field final C:Landroid/text/TextWatcher;

.field private g:I

.field h:Landroid/os/Handler;

.field i:Landroid/app/ProgressDialog;

.field j:Lcom/whatsapp/je;

.field k:I

.field l:I

.field m:I

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field r:I

.field s:Landroid/view/inputmethod/InputMethodManager;

.field t:Landroid/widget/EditText;

.field u:Landroid/widget/ImageButton;

.field v:Z

.field w:I

.field x:I

.field y:I

.field z:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x4b

    const/16 v4, 0x3f

    const/16 v3, 0x36

    const/16 v2, 0x12

    const/4 v6, 0x0

    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\'sOP\"?M_Q1\'sBZ%"

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

    const-string v0, "/wEK"

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

    const-string v0, "\"|FJ#\u0014\u007fSK?$v"

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

    const/4 v8, 0x3

    const-string v0, "%}\u001bR6?q^Z$"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/MultipleContactPicker;->D:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x57

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_4

    :pswitch_1
    move v0, v2

    goto :goto_4

    :pswitch_2
    move v0, v3

    goto :goto_4

    :pswitch_3
    move v0, v4

    goto :goto_4

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x57

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_5

    :pswitch_5
    move v0, v2

    goto :goto_5

    :pswitch_6
    move v0, v3

    goto :goto_5

    :pswitch_7
    move v0, v4

    goto :goto_5

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x57

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_6

    :pswitch_9
    move v0, v2

    goto :goto_6

    :pswitch_a
    move v0, v3

    goto :goto_6

    :pswitch_b
    move v0, v4

    goto :goto_6

    :cond_3
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x57

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_7

    :pswitch_d
    move v0, v2

    goto :goto_7

    :pswitch_e
    move v0, v3

    goto :goto_7

    :pswitch_f
    move v0, v4

    goto :goto_7

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
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 104
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->h:Landroid/os/Handler;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    .line 181
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->r:I

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->A:I

    .line 51
    new-instance v0, Lcom/whatsapp/pj;

    invoke-direct {v0}, Lcom/whatsapp/pj;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->B:Lcom/whatsapp/pj;

    .line 12
    new-instance v0, Lcom/whatsapp/px;

    invoke-direct {v0, p0}, Lcom/whatsapp/px;-><init>(Lcom/whatsapp/MultipleContactPicker;)V

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->C:Landroid/text/TextWatcher;

    .line 189
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 6

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 24
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 20
    new-instance v3, Ljava/util/TreeSet;

    invoke-direct {v3}, Ljava/util/TreeSet;-><init>()V

    .line 72
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 165
    iget-boolean v5, v0, Lcom/whatsapp/zq;->l:Z

    if-eqz v5, :cond_1

    .line 36
    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v1, :cond_0

    .line 78
    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v5, ","

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz v1, :cond_3

    .line 71
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 110
    const/4 v0, 0x0

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 9
    :cond_5
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 18
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/MultipleContactPicker;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/whatsapp/MultipleContactPicker;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/widget/TextView;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f090249

    invoke-virtual {p0, v1}, Lcom/whatsapp/MultipleContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    return-void
.end method

.method static a(Lcom/whatsapp/MultipleContactPicker;Landroid/widget/TextView;I)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 58
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/MultipleContactPicker;->a(Landroid/widget/TextView;I)V

    return-void
.end method

.method static a(Lcom/whatsapp/MultipleContactPicker;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 89
    invoke-direct {p0, p1}, Lcom/whatsapp/MultipleContactPicker;->d(Ljava/lang/String;)V

    return-void
.end method

.method private static a(Lcom/whatsapp/zq;)Z
    .locals 2
    .parameter

    .prologue
    .line 137
    sget-object v0, Lcom/whatsapp/MultipleContactPicker;->D:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private b()V
    .locals 8

    .prologue
    const/4 v6, 0x1

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 162
    iget-object v3, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    monitor-enter v3

    .line 40
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 112
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 190
    if-eqz v0, :cond_1

    iget-boolean v5, v0, Lcom/whatsapp/zq;->l:Z

    if-eqz v5, :cond_1

    .line 174
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v2, :cond_0

    .line 158
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 118
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v4, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Lcom/whatsapp/qp;->d(Ljava/util/ArrayList;)V

    .line 182
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 100
    iget-object v4, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/16 v5, 0x14

    if-ge v4, v5, :cond_3

    .line 113
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, v6, :cond_4

    .line 73
    const/4 v4, 0x1

    iput v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 93
    iget-object v4, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v2, :cond_4

    .line 54
    :cond_3
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v4, v6, :cond_4

    .line 119
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0a0015

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 126
    iget-object v4, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    :cond_4
    new-instance v4, Lcom/whatsapp/ej;

    invoke-direct {v4}, Lcom/whatsapp/ej;-><init>()V

    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 130
    iget-object v1, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/zq;

    .line 184
    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    invoke-virtual {v4, v0, v1}, Lcom/whatsapp/ej;->a(Lcom/whatsapp/zq;Lcom/whatsapp/zq;)I

    move-result v7

    if-nez v7, :cond_7

    .line 155
    const/4 v7, 0x1

    iput-boolean v7, v1, Lcom/whatsapp/zq;->l:Z

    .line 163
    if-eqz v2, :cond_6

    :cond_7
    if-eqz v2, :cond_6

    :cond_8
    if-eqz v2, :cond_5

    .line 87
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    new-instance v1, Lcom/whatsapp/ej;

    invoke-direct {v1}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    invoke-direct {p0}, Lcom/whatsapp/MultipleContactPicker;->c()V

    .line 177
    monitor-exit v3

    .line 121
    return-void

    .line 177
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static b(Lcom/whatsapp/MultipleContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 187
    invoke-direct {p0}, Lcom/whatsapp/MultipleContactPicker;->c()V

    return-void
.end method

.method static b(Lcom/whatsapp/zq;)Z
    .locals 1
    .parameter

    .prologue
    .line 1
    invoke-static {p0}, Lcom/whatsapp/MultipleContactPicker;->a(Lcom/whatsapp/zq;)Z

    move-result v0

    return v0
.end method

.method static c(Lcom/whatsapp/MultipleContactPicker;)Lcom/whatsapp/pj;
    .locals 1
    .parameter

    .prologue
    .line 26
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->B:Lcom/whatsapp/pj;

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 176
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 120
    iget-object v3, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_1

    .line 31
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    if-eqz v0, :cond_3

    .line 178
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {v0}, Lcom/whatsapp/je;->notifyDataSetChanged()V

    .line 145
    :cond_3
    return-void
.end method

.method static d(Lcom/whatsapp/MultipleContactPicker;)I
    .locals 1
    .parameter

    .prologue
    .line 38
    iget v0, p0, Lcom/whatsapp/MultipleContactPicker;->g:I

    return v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 6
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 152
    iget-object v2, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    monitor-enter v2

    .line 157
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 86
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 6
    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 29
    iget-object v4, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v1, :cond_0

    .line 52
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 167
    new-instance v0, Lcom/whatsapp/zq;

    sget-object v1, Lcom/whatsapp/MultipleContactPicker;->D:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v1, v1, v3

    invoke-direct {v0, v1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    new-instance v1, Lcom/whatsapp/ej;

    invoke-direct {v1}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 173
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {v0}, Lcom/whatsapp/je;->notifyDataSetChanged()V

    .line 45
    return-void

    .line 148
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static e(Lcom/whatsapp/MultipleContactPicker;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 15
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->o:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/whatsapp/MultipleContactPicker;->b()V

    .line 179
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {v0}, Lcom/whatsapp/je;->notifyDataSetChanged()V

    .line 94
    return-void
.end method

.method public a(Lcom/whatsapp/j2;)V
    .locals 1
    .parameter

    .prologue
    .line 103
    iget-boolean v0, p1, Lcom/whatsapp/j2;->j:Z

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {v0}, Lcom/whatsapp/je;->notifyDataSetChanged()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 49
    :cond_0
    const/16 v0, 0x6c

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->showDialog(I)V

    .line 188
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 129
    invoke-static {p1}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 80
    if-eqz v0, :cond_0

    .line 76
    new-instance v1, Lcom/whatsapp/vq;

    invoke-direct {v1, v0}, Lcom/whatsapp/vq;-><init>(Lcom/whatsapp/zq;)V

    .line 69
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/whatsapp/zq;->a(Ljava/util/List;Lcom/whatsapp/wq;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {v0}, Lcom/whatsapp/je;->notifyDataSetChanged()V

    .line 84
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 192
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter

    .prologue
    .line 34
    :try_start_0
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 95
    :goto_0
    return v0

    .line 168
    :catch_0
    move-exception v0

    .line 95
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 131
    iget-boolean v0, p0, Lcom/whatsapp/MultipleContactPicker;->v:Z

    if-eqz v0, :cond_0

    .line 98
    invoke-direct {p0}, Lcom/whatsapp/MultipleContactPicker;->c()V

    .line 147
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/MultipleContactPicker;->v:Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 66
    :cond_0
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onBackPressed()V

    .line 92
    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .parameter

    .prologue
    .line 180
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 48
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 169
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->w:I

    .line 154
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter

    .prologue
    .line 135
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 134
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getListView()Landroid/widget/ListView;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 16
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 82
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    .line 138
    :goto_0
    return v0

    .line 114
    :pswitch_0
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v1

    if-nez v1, :cond_0

    .line 50
    const v1, 0x7f09010d

    invoke-virtual {p0, v1}, Lcom/whatsapp/MultipleContactPicker;->a(I)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 91
    :cond_0
    const/16 v1, 0x6b

    invoke-virtual {p0, v1}, Lcom/whatsapp/MultipleContactPicker;->showDialog(I)V

    .line 128
    new-instance v1, Lcom/whatsapp/r9;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/r9;-><init>(Lcom/whatsapp/MultipleContactPicker;Lcom/whatsapp/zq;)V

    invoke-virtual {v1}, Lcom/whatsapp/r9;->start()V

    .line 138
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 16
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 108
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 166
    const v0, 0x7f030045

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->setContentView(I)V

    .line 160
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a002d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->x:I

    .line 170
    iget v0, p0, Lcom/whatsapp/MultipleContactPicker;->x:I

    int-to-float v0, v0

    const/high16 v1, 0x4448

    mul-float/2addr v0, v1

    const/high16 v1, 0x43f0

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->y:I

    .line 83
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MultipleContactPicker;->D:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->m:I

    if-ne v0, v4, :cond_0

    .line 85
    const/16 v0, 0x19

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->g:I

    .line 116
    const v0, 0x7f090249

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->k:I

    .line 33
    const v0, 0x7f09024e

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->l:I

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 191
    :cond_0
    sget v0, Lcom/whatsapp/eu;->b:I

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->g:I

    .line 47
    const v0, 0x7f09024a

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->k:I

    .line 151
    const v0, 0x7f090253

    iput v0, p0, Lcom/whatsapp/MultipleContactPicker;->l:I

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getListView()Landroid/widget/ListView;

    move-result-object v1

    .line 107
    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 23
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/MultipleContactPicker;->D:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 146
    const v2, 0x7f030049

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    .line 39
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 30
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    const v2, 0x7f0d0080

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->t:Landroid/widget/EditText;

    .line 25
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->t:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/whatsapp/MultipleContactPicker;->C:Landroid/text/TextWatcher;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 161
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->t:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/whatsapp/MultipleContactPicker;->t:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setGravity(I)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->n:Landroid/view/View;

    const v2, 0x7f0d0081

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->u:Landroid/widget/ImageButton;

    .line 117
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->u:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/mx;

    invoke-direct {v2, p0}, Lcom/whatsapp/mx;-><init>(Lcom/whatsapp/MultipleContactPicker;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    sget-object v0, Lcom/whatsapp/MultipleContactPicker;->D:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->s:Landroid/view/inputmethod/InputMethodManager;

    .line 67
    invoke-direct {p0}, Lcom/whatsapp/MultipleContactPicker;->b()V

    .line 32
    const v0, 0x7f0d0086

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 59
    invoke-virtual {v1, v4}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 141
    invoke-virtual {v1, v4}, Landroid/widget/ListView;->setScrollbarFadingEnabled(Z)V

    .line 124
    const v0, 0x7f0d0141

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->o:Landroid/widget/TextView;

    .line 122
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->o:Landroid/widget/TextView;

    iget v2, p0, Lcom/whatsapp/MultipleContactPicker;->A:I

    invoke-direct {p0, v0, v2}, Lcom/whatsapp/MultipleContactPicker;->a(Landroid/widget/TextView;I)V

    .line 175
    new-instance v0, Lcom/whatsapp/je;

    const v2, 0x7f030047

    iget-object v3, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-direct {v0, p0, p0, v2, v3}, Lcom/whatsapp/je;-><init>(Lcom/whatsapp/MultipleContactPicker;Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    .line 65
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 185
    const v0, 0x7f0d0142

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->z:Landroid/widget/Button;

    .line 164
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->z:Landroid/widget/Button;

    new-instance v2, Lcom/whatsapp/nx;

    invoke-direct {v2, p0}, Lcom/whatsapp/nx;-><init>(Lcom/whatsapp/MultipleContactPicker;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    new-instance v0, Lcom/whatsapp/ox;

    invoke-direct {v0, p0}, Lcom/whatsapp/ox;-><init>(Lcom/whatsapp/MultipleContactPicker;)V

    .line 99
    const v2, 0x7f0d0105

    invoke-virtual {p0, v2}, Lcom/whatsapp/MultipleContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    invoke-virtual {p0, v1}, Lcom/whatsapp/MultipleContactPicker;->registerForContextMenu(Landroid/view/View;)V

    .line 3
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 142
    move-object v0, p3

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 68
    invoke-virtual {p0}, Lcom/whatsapp/MultipleContactPicker;->getListView()Landroid/widget/ListView;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 21
    if-nez v0, :cond_1

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 171
    :cond_1
    invoke-static {v0}, Lcom/whatsapp/MultipleContactPicker;->a(Lcom/whatsapp/zq;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 96
    iget-object v1, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 102
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/DialogToastListActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 105
    const v1, 0x7f090229

    invoke-virtual {p0, v1}, Lcom/whatsapp/MultipleContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v0, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v3, v3, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter

    .prologue
    .line 75
    packed-switch p1, :pswitch_data_0

    .line 19
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 133
    :goto_0
    return-object v0

    .line 43
    :pswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 144
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/MultipleContactPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 22
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 115
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 133
    :pswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0902af

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/qx;

    invoke-direct {v2, p0}, Lcom/whatsapp/qx;-><init>(Lcom/whatsapp/MultipleContactPicker;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 75
    nop

    :pswitch_data_0
    .packed-switch 0x6b
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 42
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 150
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 101
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->B:Lcom/whatsapp/pj;

    invoke-virtual {v0}, Lcom/whatsapp/pj;->a()V

    .line 159
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 64
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 109
    invoke-static {p0}, Lcom/whatsapp/j2;->b(Lcom/whatsapp/k2;)V

    .line 172
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->i:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->i:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->i:Landroid/app/ProgressDialog;

    .line 139
    :cond_0
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onPause()V

    .line 136
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 28
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onResume()V

    .line 10
    invoke-static {p0}, Lcom/whatsapp/j2;->a(Lcom/whatsapp/k2;)V

    .line 106
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 156
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->j:Lcom/whatsapp/je;

    invoke-virtual {v0}, Lcom/whatsapp/je;->notifyDataSetChanged()V

    .line 186
    return-void
.end method

.method public onSearchRequested()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 53
    iget-boolean v0, p0, Lcom/whatsapp/MultipleContactPicker;->v:Z

    if-nez v0, :cond_0

    .line 88
    const v0, 0x7f0d007e

    invoke-virtual {p0, v0}, Lcom/whatsapp/MultipleContactPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->s:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v2, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 35
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->t:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 63
    iget-object v0, p0, Lcom/whatsapp/MultipleContactPicker;->t:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 90
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/MultipleContactPicker;->v:Z

    .line 140
    :cond_0
    return v2
.end method
