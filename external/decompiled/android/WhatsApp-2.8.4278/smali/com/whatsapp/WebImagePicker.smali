.class public Lcom/whatsapp/WebImagePicker;
.super Lcom/whatsapp/DialogToastListActivity;
.source "WebImagePicker.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private g:Lcom/whatsapp/q5;

.field private h:Landroid/widget/TextView;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/w7;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/whatsapp/te;

.field private k:Lcom/whatsapp/d8;

.field private l:I

.field private m:I

.field private n:Lcom/whatsapp/j4;

.field private o:Landroid/view/View$OnClickListener;

.field private p:Landroid/net/Uri;

.field private q:Lcom/whatsapp/gc;

.field private final r:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x4c

    const/16 v2, 0x49

    const/16 v1, 0x39

    const/16 v3, 0xf

    const/4 v6, 0x0

    const/16 v0, 0xa

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "N*+f!X(,|)X=*gcZ.\'l)U\u0010 b-^*\u0016k#N!%`-]\u0010=n?R"

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

    const-string v0, "N*+f!X(,|)X=*gcZ.\'l)U\u0010-f-U ."

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

    const-string v0, "N*+f!X(,|)X=*gc]*:{>V6"

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

    const-string v0, "P!9z8f\",{$V+"

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

    const-string v0, "m\'<b.J"

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

    const-string v0, "V:=\u007f9M"

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

    const-string v0, "H:,}5"

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

    const-string v0, "T <a8\\+"

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

    const-string v0, "T <a8\\+\u0016}#"

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

    const-string v0, "N*+f!X(,|)X=*gcZ=,n8\\"

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

    sput-object v9, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

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
    const/16 v0, 0x4f

    goto :goto_a

    :pswitch_2
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_b

    :pswitch_6
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_c

    :pswitch_a
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_d

    :pswitch_e
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_e

    :pswitch_12
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_f

    :pswitch_16
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_10

    :pswitch_1a
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_11

    :pswitch_1e
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_12

    :pswitch_22
    move v0, v2

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
    const/16 v0, 0x4f

    goto :goto_13

    :pswitch_26
    move v0, v2

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

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 56
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->i:Ljava/util/ArrayList;

    .line 34
    new-instance v0, Lcom/whatsapp/d8;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/whatsapp/d8;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->k:Lcom/whatsapp/d8;

    .line 31
    iput v3, p0, Lcom/whatsapp/WebImagePicker;->l:I

    .line 23
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getCacheDir()Ljava/io/File;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->r:Ljava/io/File;

    .line 44
    return-void
.end method

.method static a(Lcom/whatsapp/WebImagePicker;)Landroid/net/Uri;
    .locals 1
    .parameter

    .prologue
    .line 33
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->p:Landroid/net/Uri;

    return-object v0
.end method

.method static a(Lcom/whatsapp/WebImagePicker;Lcom/whatsapp/d8;)Lcom/whatsapp/d8;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 78
    iput-object p1, p0, Lcom/whatsapp/WebImagePicker;->k:Lcom/whatsapp/d8;

    return-object p1
.end method

.method static a(Lcom/whatsapp/WebImagePicker;Lcom/whatsapp/gc;)Lcom/whatsapp/gc;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 87
    iput-object p1, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    return-object p1
.end method

.method static a(Lcom/whatsapp/WebImagePicker;Lcom/whatsapp/q5;)Lcom/whatsapp/q5;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 32
    iput-object p1, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    return-object p1
.end method

.method private a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 85
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 20
    const-string v0, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f09018b

    invoke-virtual {p0, v2}, Lcom/whatsapp/WebImagePicker;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 63
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v2, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 14
    iget-object v2, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 41
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->j:Lcom/whatsapp/te;

    invoke-static {v0, v1}, Lcom/whatsapp/te;->a(Lcom/whatsapp/te;Ljava/lang/String;)V

    .line 9
    :cond_1
    return-void
.end method

.method static a(Lcom/whatsapp/WebImagePicker;Lcom/whatsapp/w7;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 91
    invoke-direct {p0, p1}, Lcom/whatsapp/WebImagePicker;->a(Lcom/whatsapp/w7;)V

    return-void
.end method

.method private a(Lcom/whatsapp/w7;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/gc;->cancel(Z)Z

    .line 40
    :cond_0
    new-instance v0, Lcom/whatsapp/gc;

    invoke-direct {v0, p0, p1}, Lcom/whatsapp/gc;-><init>(Lcom/whatsapp/WebImagePicker;Lcom/whatsapp/w7;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    .line 92
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/gc;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 95
    return-void
.end method

.method static b(Lcom/whatsapp/WebImagePicker;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 27
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    .line 89
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->n:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->Y:I

    iget-object v1, p0, Lcom/whatsapp/WebImagePicker;->n:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->Z:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/whatsapp/WebImagePicker;->n:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->ab:F

    float-to-int v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/WebImagePicker;->m:I

    .line 36
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/whatsapp/WebImagePicker;->m:I

    div-int/2addr v1, v2

    iput v1, p0, Lcom/whatsapp/WebImagePicker;->l:I

    .line 81
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iget v1, p0, Lcom/whatsapp/WebImagePicker;->l:I

    div-int/2addr v0, v1

    iget-object v1, p0, Lcom/whatsapp/WebImagePicker;->n:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->ab:F

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/WebImagePicker;->m:I

    .line 38
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    invoke-virtual {v0}, Lcom/whatsapp/q5;->a()V

    .line 48
    new-instance v0, Lcom/whatsapp/q5;

    const v1, 0x7f0203be

    const v2, 0x7f0203f8

    iget v3, p0, Lcom/whatsapp/WebImagePicker;->m:I

    iget-object v4, p0, Lcom/whatsapp/WebImagePicker;->r:Ljava/io/File;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/whatsapp/q5;-><init>(IIILjava/io/File;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    .line 65
    return-void
.end method

.method static c(Lcom/whatsapp/WebImagePicker;)V
    .locals 0
    .parameter

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/whatsapp/WebImagePicker;->a()V

    return-void
.end method

.method static d(Lcom/whatsapp/WebImagePicker;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 93
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method static e(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/gc;
    .locals 1
    .parameter

    .prologue
    .line 29
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    return-object v0
.end method

.method static f(Lcom/whatsapp/WebImagePicker;)I
    .locals 1
    .parameter

    .prologue
    .line 83
    iget v0, p0, Lcom/whatsapp/WebImagePicker;->l:I

    return v0
.end method

.method static g(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/j4;
    .locals 1
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->n:Lcom/whatsapp/j4;

    return-object v0
.end method

.method static h(Lcom/whatsapp/WebImagePicker;)I
    .locals 1
    .parameter

    .prologue
    .line 74
    iget v0, p0, Lcom/whatsapp/WebImagePicker;->m:I

    return v0
.end method

.method static i(Lcom/whatsapp/WebImagePicker;)Landroid/view/View$OnClickListener;
    .locals 1
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->o:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method static j(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/q5;
    .locals 1
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    return-object v0
.end method

.method static k(Lcom/whatsapp/WebImagePicker;)Ljava/io/File;
    .locals 1
    .parameter

    .prologue
    .line 70
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->r:Ljava/io/File;

    return-object v0
.end method

.method static l(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/d8;
    .locals 1
    .parameter

    .prologue
    .line 57
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->k:Lcom/whatsapp/d8;

    return-object v0
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .parameter

    .prologue
    .line 69
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 25
    invoke-direct {p0}, Lcom/whatsapp/WebImagePicker;->b()V

    .line 53
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->j:Lcom/whatsapp/te;

    invoke-virtual {v0}, Lcom/whatsapp/te;->notifyDataSetChanged()V

    .line 67
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .parameter

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x0

    .line 61
    sget-object v0, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 4
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->n:Lcom/whatsapp/j4;

    .line 8
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->r:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 97
    new-instance v0, Lcom/whatsapp/q5;

    const v1, 0x7f0203be

    const v2, 0x7f0203f8

    const/16 v3, 0x48

    iget-object v4, p0, Lcom/whatsapp/WebImagePicker;->r:Ljava/io/File;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/whatsapp/q5;-><init>(IIILjava/io/File;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    .line 12
    invoke-static {}, Lcom/whatsapp/d8;->a()V

    .line 50
    const v0, 0x7f03005e

    invoke-virtual {p0, v0}, Lcom/whatsapp/WebImagePicker;->setContentView(I)V

    .line 98
    const v0, 0x7f0d0198

    invoke-virtual {p0, v0}, Lcom/whatsapp/WebImagePicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    .line 60
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    if-eqz v0, :cond_5

    .line 86
    invoke-static {v0}, Lcom/whatsapp/v4;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 96
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 68
    if-eqz v0, :cond_0

    .line 49
    sget-object v2, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->p:Landroid/net/Uri;

    .line 55
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/widget/ListView;->requestFocus()Z

    .line 82
    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setClickable(Z)V

    .line 84
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 26
    new-instance v0, Lcom/whatsapp/te;

    invoke-direct {v0, p0, p0}, Lcom/whatsapp/te;-><init>(Lcom/whatsapp/WebImagePicker;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->j:Lcom/whatsapp/te;

    .line 18
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->j:Lcom/whatsapp/te;

    invoke-virtual {p0, v0}, Lcom/whatsapp/WebImagePicker;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 16
    new-instance v0, Lcom/whatsapp/x7;

    invoke-direct {v0, p0}, Lcom/whatsapp/x7;-><init>(Lcom/whatsapp/WebImagePicker;)V

    iput-object v0, p0, Lcom/whatsapp/WebImagePicker;->o:Landroid/view/View$OnClickListener;

    .line 35
    const v0, 0x7f0d0197

    invoke-virtual {p0, v0}, Lcom/whatsapp/WebImagePicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/whatsapp/y7;

    invoke-direct {v2, p0}, Lcom/whatsapp/y7;-><init>(Lcom/whatsapp/WebImagePicker;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    new-instance v2, Lcom/whatsapp/z7;

    invoke-direct {v2, p0}, Lcom/whatsapp/z7;-><init>(Lcom/whatsapp/WebImagePicker;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 77
    const v0, 0x7f0d0081

    invoke-virtual {p0, v0}, Lcom/whatsapp/WebImagePicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 72
    new-instance v2, Lcom/whatsapp/a8;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/a8;-><init>(Lcom/whatsapp/WebImagePicker;Landroid/widget/ImageButton;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    new-instance v2, Lcom/whatsapp/b8;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/b8;-><init>(Lcom/whatsapp/WebImagePicker;Landroid/widget/ImageButton;)V

    .line 66
    iget-object v3, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 62
    iget-object v2, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/whatsapp/WebImagePicker;->h:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 51
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 17
    invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setVisibility(I)V

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v2, :cond_2

    .line 37
    :cond_1
    invoke-virtual {v0, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 80
    :cond_2
    invoke-direct {p0}, Lcom/whatsapp/WebImagePicker;->b()V

    .line 24
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 59
    sget-object v2, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 21
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f0900b6

    :goto_1
    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 43
    invoke-virtual {p0}, Lcom/whatsapp/WebImagePicker;->finish()V

    .line 75
    :goto_2
    return-void

    .line 21
    :cond_3
    const v0, 0x7f0900b7

    goto :goto_1

    .line 39
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->j:Lcom/whatsapp/te;

    invoke-static {v0, v1}, Lcom/whatsapp/te;->a(Lcom/whatsapp/te;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v1, v0

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 79
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 30
    sget-object v0, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 45
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    invoke-virtual {v0}, Lcom/whatsapp/q5;->a()V

    .line 64
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->g:Lcom/whatsapp/q5;

    invoke-virtual {v0}, Lcom/whatsapp/q5;->b()V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    if-eqz v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    invoke-virtual {v0, v2}, Lcom/whatsapp/gc;->cancel(Z)Z

    .line 15
    sget-object v0, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    invoke-static {v0}, Lcom/whatsapp/gc;->a(Lcom/whatsapp/gc;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lcom/whatsapp/WebImagePicker;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    invoke-static {v0}, Lcom/whatsapp/gc;->a(Lcom/whatsapp/gc;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 19
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    invoke-static {v0, v3}, Lcom/whatsapp/gc;->a(Lcom/whatsapp/gc;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 6
    :cond_0
    iput-object v3, p0, Lcom/whatsapp/WebImagePicker;->q:Lcom/whatsapp/gc;

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/WebImagePicker;->j:Lcom/whatsapp/te;

    invoke-static {v0}, Lcom/whatsapp/te;->a(Lcom/whatsapp/te;)V

    .line 73
    return-void
.end method
