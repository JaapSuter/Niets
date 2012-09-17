.class public Lcom/whatsapp/BroadcastMessageComposer;
.super Lcom/whatsapp/DialogToastListActivity;
.source "BroadcastMessageComposer.java"


# static fields
.field private static final F:[Ljava/lang/String;

.field static j:Z

.field static k:Lcom/whatsapp/sz;

.field static l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field private static w:I

.field private static x:F


# instance fields
.field private final A:Landroid/view/View$OnClickListener;

.field final B:Landroid/text/TextWatcher;

.field C:Ljava/lang/String;

.field D:Lcom/whatsapp/bj;

.field E:Landroid/view/View$OnClickListener;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field final h:Landroid/view/inputmethod/InputMethodManager;

.field i:Landroid/widget/EditText;

.field m:Landroid/widget/ImageButton;

.field n:Landroid/widget/Button;

.field o:Landroid/widget/Button;

.field p:Z

.field private q:Landroid/widget/ViewFlipper;

.field r:Landroid/view/View;

.field s:I

.field private t:[Lcom/whatsapp/le;

.field u:Landroid/view/ViewGroup;

.field v:Lcom/whatsapp/de;

.field private y:F

.field private z:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v4, 0x7b

    const/16 v1, 0x3d

    const/16 v3, 0x2c

    const/16 v2, 0x1f

    const/4 v6, 0x0

    const/4 v0, 0x6

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "Im\u0007E\u0015Z?\nC[Nw\u0011[[yV?`4z@)m)v@-i)kV=i$xG.e)|K7c5\u0011?\u001cY\u000f\u001dr\u001b_\u0008\\x\u001b\u000c\u000b\\m\u001fA\u001eIz\u000c\u000c\u0012N?\u0010Y\u0017Q>"

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

    const-string v0, "Jv\u0010H\u0014J"

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

    const-string v0, "Wv\u001a_"

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

    const-string v0, "_m\u0011M\u001f^~\rX6Xl\rM\u001cX\\\u0011A\u000bRl\u001b^TYz\rX\tRf"

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

    const-string v0, "Rp\u0013"

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

    const-string v0, "Tq\u000eY\u000fbr\u001bX\u0013R{"

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

    sput-object v9, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/whatsapp/BroadcastMessageComposer;->l:Ljava/util/ArrayList;

    .line 98
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/BroadcastMessageComposer;->w:I

    .line 142
    const/high16 v0, -0x4080

    sput v0, Lcom/whatsapp/BroadcastMessageComposer;->x:F

    return-void

    .line -1
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
    move v0, v1

    goto :goto_6

    :pswitch_1
    move v0, v2

    goto :goto_6

    :pswitch_2
    const/16 v0, 0x7e

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
    move v0, v1

    goto :goto_7

    :pswitch_5
    move v0, v2

    goto :goto_7

    :pswitch_6
    const/16 v0, 0x7e

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
    move v0, v1

    goto :goto_8

    :pswitch_9
    move v0, v2

    goto :goto_8

    :pswitch_a
    const/16 v0, 0x7e

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
    move v0, v1

    goto :goto_9

    :pswitch_d
    move v0, v2

    goto :goto_9

    :pswitch_e
    const/16 v0, 0x7e

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
    move v0, v1

    goto :goto_a

    :pswitch_11
    move v0, v2

    goto :goto_a

    :pswitch_12
    const/16 v0, 0x7e

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
    move v0, v1

    goto :goto_b

    :pswitch_15
    move v0, v2

    goto :goto_b

    :pswitch_16
    const/16 v0, 0x7e

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

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    .line 284
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->h:Landroid/view/inputmethod/InputMethodManager;

    .line 232
    sget-object v0, Lcom/whatsapp/v4;->d:[I

    array-length v0, v0

    new-array v0, v0, [Lcom/whatsapp/le;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->t:[Lcom/whatsapp/le;

    .line 173
    new-instance v0, Lcom/whatsapp/uc;

    invoke-direct {v0, p0}, Lcom/whatsapp/uc;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->z:Landroid/os/Handler;

    .line 128
    new-instance v0, Lcom/whatsapp/ti;

    invoke-direct {v0, p0}, Lcom/whatsapp/ti;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->A:Landroid/view/View$OnClickListener;

    .line 119
    new-instance v0, Lcom/whatsapp/aj;

    invoke-direct {v0, p0}, Lcom/whatsapp/aj;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->B:Landroid/text/TextWatcher;

    .line 236
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->C:Ljava/lang/String;

    .line 47
    new-instance v0, Lcom/whatsapp/bj;

    invoke-direct {v0, p0}, Lcom/whatsapp/bj;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->D:Lcom/whatsapp/bj;

    .line 230
    new-instance v0, Lcom/whatsapp/si;

    invoke-direct {v0, p0}, Lcom/whatsapp/si;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->E:Landroid/view/View$OnClickListener;

    .line 130
    return-void
.end method

.method static a(Lcom/whatsapp/BroadcastMessageComposer;Lcom/whatsapp/zq;)Lcom/whatsapp/sz;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/whatsapp/BroadcastMessageComposer;->a(Lcom/whatsapp/zq;)Lcom/whatsapp/sz;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/whatsapp/zq;)Lcom/whatsapp/sz;
    .locals 4
    .parameter

    .prologue
    .line 222
    new-instance v1, Lcom/whatsapp/sz;

    iget-object v2, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v0, 0x0

    check-cast v0, [B

    sget-object v3, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    invoke-direct {v1, v2, v0, v3}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;[BLjava/lang/Object;)V

    .line 221
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    iput-byte v0, v1, Lcom/whatsapp/sz;->l:B

    .line 269
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->h:I

    iput v0, v1, Lcom/whatsapp/sz;->h:I

    .line 211
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    invoke-virtual {v0}, Lcom/whatsapp/sz;->c()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whatsapp/sz;->a([B)V

    .line 238
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    iput-object v0, v1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 285
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-wide v2, v0, Lcom/whatsapp/sz;->m:J

    iput-wide v2, v1, Lcom/whatsapp/sz;->m:J

    .line 63
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    iput-object v0, v1, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 199
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    iput-object v0, v1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 166
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->k:Ljava/lang/String;

    iput-object v0, v1, Lcom/whatsapp/sz;->k:Ljava/lang/String;

    .line 139
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    iput v0, v1, Lcom/whatsapp/sz;->a:I

    .line 214
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-wide v2, v0, Lcom/whatsapp/sz;->q:D

    iput-wide v2, v1, Lcom/whatsapp/sz;->q:D

    .line 65
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-wide v2, v0, Lcom/whatsapp/sz;->r:D

    iput-wide v2, v1, Lcom/whatsapp/sz;->r:D

    .line 253
    return-object v1
.end method

.method private a()V
    .locals 3

    .prologue
    .line 162
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->h:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 56
    return-void
.end method

.method static a(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 104
    invoke-direct {p0}, Lcom/whatsapp/BroadcastMessageComposer;->c()V

    return-void
.end method

.method static a(Lcom/whatsapp/BroadcastMessageComposer;ZLjava/lang/Long;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/BroadcastMessageComposer;->a(ZLjava/lang/Long;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 7
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 101
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 256
    array-length v3, v2

    const/4 v0, 0x0

    :cond_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 121
    sget-object v5, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v4

    .line 217
    iget-object v5, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 176
    :cond_1
    return-void
.end method

.method private a(Z)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, -0x2

    const/high16 v5, 0x3f80

    const/16 v4, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 220
    const v0, 0x7f0d0056

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 40
    const v0, 0x7f0d0055

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 182
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v1, :cond_2

    .line 18
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 120
    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 215
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 133
    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 99
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v2, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 271
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 260
    :cond_0
    const v0, 0x7f0d0056

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 255
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v1, :cond_1

    .line 22
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 277
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->length()I

    move-result v3

    if-lez v3, :cond_4

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 125
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 195
    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 243
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v2, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    :cond_1
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 23
    :cond_2
    return-void

    :cond_3
    move v0, v2

    .line 120
    goto :goto_0

    :cond_4
    move v1, v2

    .line 277
    goto :goto_1
.end method

.method private a(ZLjava/lang/Long;)V
    .locals 10
    .parameter
    .parameter

    .prologue
    const v9, 0x7f0d005b

    const/4 v8, -0x2

    const/4 v7, 0x1

    const/16 v6, 0x8

    const/4 v5, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 129
    if-nez p1, :cond_2

    .line 158
    const v0, 0x7f0d005c

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 122
    const v0, 0x7f0d005d

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 165
    invoke-virtual {p0, v9}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 209
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 41
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {p0, v3, v4}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v7, :cond_0

    .line 289
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setEnabled(Z)V

    .line 21
    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 265
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, 0x0

    invoke-direct {v1, v8, v8, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    const v0, 0x7f0d005e

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 206
    const v0, 0x7f0d0054

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 10
    invoke-virtual {v0, v7}, Landroid/widget/EditText;->setMinLines(I)V

    .line 17
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 171
    if-eqz v2, :cond_1

    .line 245
    :cond_0
    const v0, 0x7f0d0055

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 100
    :cond_1
    sput-boolean v5, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    .line 183
    if-eqz v2, :cond_3

    .line 89
    :cond_2
    const v0, 0x7f0d005c

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 287
    const v0, 0x7f0d0058

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 79
    const v0, 0x7f0d005d

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 72
    invoke-virtual {p0, v9}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 82
    const v0, 0x7f0d005e

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 143
    sput-boolean v7, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    .line 83
    :cond_3
    const v0, 0x7f0d0059

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 272
    return-void

    .line 41
    :cond_4
    const-string v1, ""

    goto/16 :goto_0
.end method

.method static a(Lcom/whatsapp/BroadcastMessageComposer;Z)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 223
    invoke-direct {p0, p1}, Lcom/whatsapp/BroadcastMessageComposer;->b(Z)Z

    move-result v0

    return v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->h:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isFullscreenMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->h:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 226
    :cond_0
    return-void
.end method

.method static b(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 105
    invoke-direct {p0}, Lcom/whatsapp/BroadcastMessageComposer;->a()V

    return-void
.end method

.method private b(Z)Z
    .locals 1
    .parameter

    .prologue
    .line 179
    invoke-static {p0, p1}, Lcom/whatsapp/eg;->a(Landroid/app/Activity;Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->C:Ljava/lang/String;

    .line 127
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->C:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 155
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->showDialog(I)V

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->C:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static c(Lcom/whatsapp/BroadcastMessageComposer;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 157
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->z:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 207
    sput-boolean v0, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    .line 88
    invoke-direct {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->a(Z)V

    .line 77
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 66
    return-void
.end method

.method private d()V
    .locals 9

    .prologue
    const v8, 0x7f0d005a

    const/16 v7, 0x8

    const/4 v6, 0x1

    const/4 v5, -0x2

    const/4 v4, 0x0

    .line 43
    const v0, 0x7f0d0054

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 103
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v6, :cond_1

    .line 234
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMinLines(I)V

    .line 248
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 185
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 27
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/widget/Button;->setEnabled(Z)V

    .line 49
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v1, v7}, Landroid/widget/Button;->setVisibility(I)V

    .line 172
    invoke-virtual {p0, v8}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 268
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x3f80

    invoke-direct {v2, v4, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v1, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 11
    const v1, 0x7f0d005e

    invoke-virtual {p0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 175
    :cond_1
    invoke-virtual {v0, v6}, Landroid/widget/EditText;->setMinLines(I)V

    .line 91
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 132
    const v0, 0x7f0d0056

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    sget-boolean v0, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    if-nez v0, :cond_2

    .line 193
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 32
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->isEnabled()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 178
    invoke-virtual {p0, v8}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 80
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, 0x0

    invoke-direct {v1, v5, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setVisibility(I)V

    .line 81
    const v0, 0x7f0d005e

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 251
    :cond_2
    return-void
.end method

.method static d(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/whatsapp/BroadcastMessageComposer;->b()V

    return-void
.end method

.method static e()I
    .locals 1

    .prologue
    .line 37
    sget v0, Lcom/whatsapp/BroadcastMessageComposer;->w:I

    return v0
.end method

.method static e(Lcom/whatsapp/BroadcastMessageComposer;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 189
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method static f()F
    .locals 1

    .prologue
    .line 184
    sget v0, Lcom/whatsapp/BroadcastMessageComposer;->x:F

    return v0
.end method

.method static f(Lcom/whatsapp/BroadcastMessageComposer;)F
    .locals 1
    .parameter

    .prologue
    .line 205
    iget v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->y:F

    return v0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 9
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v5, -0x2

    const v7, 0x7f0d0058

    const/4 v6, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 73
    if-eqz p2, :cond_0

    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    if-nez v0, :cond_2

    .line 203
    :cond_0
    if-eqz p3, :cond_1

    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p3, v0, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f0902d4

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;Ljava/lang/String;)V

    .line 58
    :cond_1
    :goto_0
    return-void

    .line 117
    :cond_2
    invoke-direct {p0, v3}, Lcom/whatsapp/BroadcastMessageComposer;->a(Z)V

    .line 24
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    .line 225
    const v0, 0x7f0d0055

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 112
    invoke-direct {p0, v3, v8}, Lcom/whatsapp/BroadcastMessageComposer;->a(ZLjava/lang/Long;)V

    if-eqz v2, :cond_4

    .line 194
    :cond_3
    const v0, 0x7f0d0059

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 31
    const v0, 0x7f0d005b

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 261
    invoke-virtual {p0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v3, :cond_4

    .line 280
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    .line 69
    const v0, 0x7f0d005a

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 131
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, 0x0

    invoke-direct {v1, v5, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 212
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 274
    const v0, 0x7f0d005e

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 6
    :cond_4
    invoke-virtual {p0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 181
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 169
    iget v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->y:F

    const/high16 v4, 0x3f80

    cmpg-float v1, v1, v4

    if-gez v1, :cond_5

    .line 52
    iput v5, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 85
    iput v5, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 198
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 264
    :cond_5
    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-byte v1, v1, Lcom/whatsapp/sz;->l:B

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 188
    :goto_1
    :pswitch_0
    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget v1, v1, Lcom/whatsapp/sz;->h:I

    if-nez v1, :cond_7

    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    invoke-virtual {v1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 258
    :goto_2
    array-length v4, v1

    invoke-static {v1, v6, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 60
    iget v4, p0, Lcom/whatsapp/BroadcastMessageComposer;->y:F

    const/high16 v5, 0x3f80

    cmpg-float v4, v4, v5

    if-gez v4, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/16 v5, 0x3c

    if-lt v4, v5, :cond_6

    .line 153
    const/16 v4, 0x3c

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 210
    const/16 v4, 0x3c

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 164
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    :cond_6
    invoke-virtual {p0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 34
    new-instance v0, Lcom/whatsapp/pb;

    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->D:Lcom/whatsapp/bj;

    invoke-direct {v0, v1, v6, v3}, Lcom/whatsapp/pb;-><init>(Lcom/whatsapp/sz;ZLcom/whatsapp/bj;)V

    invoke-virtual {v0}, Lcom/whatsapp/pb;->a()V

    .line 145
    if-eqz v2, :cond_1

    .line 286
    :pswitch_1
    invoke-virtual {p0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f02000c

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    new-instance v0, Lcom/whatsapp/mb;

    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->D:Lcom/whatsapp/bj;

    invoke-direct {v0, p0, v1, v3}, Lcom/whatsapp/mb;-><init>(Landroid/content/Context;Lcom/whatsapp/sz;Lcom/whatsapp/bj;)V

    new-array v1, v6, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/mb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 35
    if-eqz v2, :cond_1

    .line 38
    :pswitch_2
    const v0, 0x7f0d0059

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02041c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1, v8, v8, v8}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 29
    const v0, 0x7f0d0059

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 275
    sput-boolean v6, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    goto/16 :goto_0

    .line 87
    :pswitch_3
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f02000e

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    new-instance v1, Lcom/whatsapp/pb;

    sget-object v4, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v5, p0, Lcom/whatsapp/BroadcastMessageComposer;->D:Lcom/whatsapp/bj;

    invoke-direct {v1, v4, v6, v5}, Lcom/whatsapp/pb;-><init>(Lcom/whatsapp/sz;ZLcom/whatsapp/bj;)V

    invoke-virtual {v1}, Lcom/whatsapp/pb;->a()V

    .line 90
    if-eqz v2, :cond_1

    .line 137
    :pswitch_4
    invoke-virtual {p0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f02000d

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    new-instance v1, Lcom/whatsapp/pb;

    sget-object v4, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v5, p0, Lcom/whatsapp/BroadcastMessageComposer;->D:Lcom/whatsapp/bj;

    invoke-direct {v1, v4, v6, v5}, Lcom/whatsapp/pb;-><init>(Lcom/whatsapp/sz;ZLcom/whatsapp/bj;)V

    invoke-virtual {v1}, Lcom/whatsapp/pb;->a()V

    .line 281
    if-eqz v2, :cond_1

    goto/16 :goto_1

    .line 188
    :cond_7
    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    invoke-virtual {v1}, Lcom/whatsapp/sz;->c()[B

    move-result-object v1

    goto/16 :goto_2

    .line 264
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 26
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 84
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 290
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0033

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    sub-float/2addr v0, v2

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->t:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->s:I

    .line 249
    const/4 v0, 0x0

    :cond_0
    iget-object v2, p0, Lcom/whatsapp/BroadcastMessageComposer;->t:[Lcom/whatsapp/le;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 201
    iget-object v2, p0, Lcom/whatsapp/BroadcastMessageComposer;->t:[Lcom/whatsapp/le;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/whatsapp/le;->notifyDataSetChanged()V

    .line 170
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 191
    :cond_1
    invoke-direct {p0}, Lcom/whatsapp/BroadcastMessageComposer;->d()V

    .line 62
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 141
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 186
    iget-object v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->targetView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 273
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 246
    :cond_0
    :goto_0
    return v2

    .line 33
    :pswitch_0
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v2, :cond_1

    .line 36
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 134
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->v:Lcom/whatsapp/de;

    invoke-virtual {v0}, Lcom/whatsapp/de;->notifyDataSetChanged()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 227
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->finish()V

    goto :goto_0

    .line 273
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .parameter

    .prologue
    const/4 v4, 0x3

    const/4 v7, 0x1

    const/4 v6, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 213
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 126
    const v0, 0x7f030008

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->setContentView(I)V

    .line 123
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 50
    const v0, 0x7f0d004e

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->u:Landroid/view/ViewGroup;

    .line 237
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 282
    if-eqz v0, :cond_0

    .line 138
    invoke-direct {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->a(Ljava/lang/String;)V

    .line 160
    :cond_0
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 202
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 96
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 25
    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->y:F

    .line 276
    const v0, 0x7f0d0055

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    .line 161
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->A:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    const v0, 0x7f0d005f

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    .line 2
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->o:Landroid/widget/Button;

    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->A:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    invoke-direct {p0}, Lcom/whatsapp/BroadcastMessageComposer;->d()V

    .line 151
    const v0, 0x7f0d005d

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ui;

    invoke-direct {v1, p0}, Lcom/whatsapp/ui;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 242
    const v0, 0x7f0d0042

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/vi;

    invoke-direct {v1, p0}, Lcom/whatsapp/vi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    const v0, 0x7f0d0054

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    .line 108
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->B:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 146
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 196
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/j4;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 254
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 102
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setMinLines(I)V

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    new-instance v1, Lcom/whatsapp/wi;

    invoke-direct {v1, p0}, Lcom/whatsapp/wi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    new-instance v1, Lcom/whatsapp/xi;

    invoke-direct {v1, p0}, Lcom/whatsapp/xi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 247
    const v0, 0x7f0d0046

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->m:Landroid/widget/ImageButton;

    .line 200
    const v0, 0x7f0d0048

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    .line 67
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->m:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/yi;

    invoke-direct {v1, p0}, Lcom/whatsapp/yi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->m:Landroid/widget/ImageButton;

    invoke-virtual {v0, v7}, Landroid/widget/ImageButton;->setLongClickable(Z)V

    .line 109
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->m:Landroid/widget/ImageButton;

    invoke-virtual {v0, v7}, Landroid/widget/ImageButton;->setHapticFeedbackEnabled(Z)V

    .line 59
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->m:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/zi;

    invoke-direct {v1, p0}, Lcom/whatsapp/zi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 20
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0a0033

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->t:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->s:I

    .line 283
    const v0, 0x7f0d0049

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->q:Landroid/widget/ViewFlipper;

    move v1, v6

    .line 241
    :goto_0
    sget-object v0, Lcom/whatsapp/v4;->d:[I

    array-length v0, v0

    if-ge v1, v0, :cond_2

    .line 3
    sget-object v0, Lcom/whatsapp/v4;->d:[I

    aget v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 156
    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->t:[Lcom/whatsapp/le;

    new-instance v4, Lcom/whatsapp/le;

    invoke-direct {v4, p0, p0, v1}, Lcom/whatsapp/le;-><init>(Lcom/whatsapp/BroadcastMessageComposer;Landroid/content/Context;I)V

    aput-object v4, v3, v1

    .line 229
    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->t:[Lcom/whatsapp/le;

    aget-object v3, v3, v1

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 150
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setClickable(Z)V

    .line 57
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 262
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_5

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->q:Landroid/widget/ViewFlipper;

    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 1
    const v0, 0x7f0d004f

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0d0051

    invoke-virtual {p0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0d0052

    invoke-virtual {p0, v2}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0d0053

    invoke-virtual {p0, v3}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/whatsapp/BroadcastMessageComposer;->q:Landroid/widget/ViewFlipper;

    iget-object v5, p0, Lcom/whatsapp/BroadcastMessageComposer;->u:Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v5}, Lcom/whatsapp/v4;->a(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/ViewFlipper;Landroid/view/ViewGroup;)V

    .line 116
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->u:Landroid/view/ViewGroup;

    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Landroid/view/ViewGroup;I)V

    .line 114
    sget v0, Lcom/whatsapp/BroadcastMessageComposer;->w:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 278
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0004

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    sput v0, Lcom/whatsapp/BroadcastMessageComposer;->w:I

    .line 12
    :cond_3
    sget v0, Lcom/whatsapp/BroadcastMessageComposer;->x:F

    const/high16 v1, -0x4080

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 111
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->L:F

    sput v0, Lcom/whatsapp/BroadcastMessageComposer;->x:F

    .line 239
    :cond_4
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMessageComposer;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 240
    new-instance v1, Lcom/whatsapp/de;

    const v2, 0x7f03004c

    iget-object v3, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    invoke-direct {v1, p0, p0, v2, v3}, Lcom/whatsapp/de;-><init>(Lcom/whatsapp/BroadcastMessageComposer;Landroid/content/Context;ILjava/util/ArrayList;)V

    iput-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->v:Lcom/whatsapp/de;

    .line 115
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->v:Lcom/whatsapp/de;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 252
    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 147
    const v1, 0x7f020412

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelector(I)V

    .line 190
    invoke-virtual {v0, v7}, Landroid/widget/ListView;->setScrollbarFadingEnabled(Z)V

    .line 270
    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMessageComposer;->registerForContextMenu(Landroid/view/View;)V

    .line 124
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 208
    return-void

    :cond_5
    move v1, v0

    goto/16 :goto_0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 74
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/DialogToastListActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 204
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    iget-object v0, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->targetView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 279
    if-nez v0, :cond_1

    .line 218
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 174
    const v0, 0x7f090251

    invoke-interface {p1, v2, v2, v2, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 76
    :cond_2
    const v0, 0x7f090250

    invoke-interface {p1, v2, v2, v2, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto :goto_0
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 6
    .parameter

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 70
    packed-switch p1, :pswitch_data_0

    .line 53
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 244
    :goto_0
    return-object v0

    .line 288
    :pswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 216
    const v1, 0x7f09024d

    invoke-virtual {p0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 144
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 4
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 135
    invoke-virtual {v0, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 15
    :pswitch_1
    new-instance v0, Lcom/whatsapp/pi;

    invoke-direct {v0, p0}, Lcom/whatsapp/pi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 94
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09010e

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09010f

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09000e

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 263
    :pswitch_2
    iget-object v1, p0, Lcom/whatsapp/BroadcastMessageComposer;->C:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 187
    new-instance v1, Lcom/whatsapp/qi;

    invoke-direct {v1, p0}, Lcom/whatsapp/qi;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 71
    new-instance v2, Lcom/whatsapp/ri;

    invoke-direct {v2, p0}, Lcom/whatsapp/ri;-><init>(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 75
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/whatsapp/BroadcastMessageComposer;->C:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    const v4, 0x7f090010

    invoke-virtual {v3, v4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v3, 0x7f090011

    invoke-virtual {v1, v3, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 107
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 28
    :cond_0
    sget-object v1, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 70
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 42
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 154
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->F:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 267
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    .line 257
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 68
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->D:Lcom/whatsapp/bj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/bj;->a(Z)V

    .line 19
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 136
    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 148
    iget-object v0, p0, Lcom/whatsapp/BroadcastMessageComposer;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 233
    :cond_1
    :goto_0
    return v2

    .line 7
    :cond_2
    if-ne p1, v1, :cond_1

    .line 177
    sput-boolean v2, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    .line 266
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 149
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onPause()V

    .line 167
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 9
    return-void
.end method
