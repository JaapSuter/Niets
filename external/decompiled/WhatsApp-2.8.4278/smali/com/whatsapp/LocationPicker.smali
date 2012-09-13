.class public Lcom/whatsapp/LocationPicker;
.super Lcom/google/android/maps/MapActivity;
.source "LocationPicker.java"

# interfaces
.implements Lcom/whatsapp/jt;


# static fields
.field private static m:J

.field private static s:Z

.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/whatsapp/GoogleMapView;

.field private c:Landroid/widget/TextView;

.field private d:Lcom/google/android/maps/MyLocationOverlay;

.field private e:Lcom/whatsapp/gf;

.field private f:Landroid/widget/ProgressBar;

.field private g:Landroid/widget/ListView;

.field private h:Landroid/widget/TextView;

.field private i:Lcom/whatsapp/qe;

.field private j:Lcom/whatsapp/jb;

.field private k:Lcom/whatsapp/z9;

.field private l:Lcom/whatsapp/fy;

.field private n:Landroid/os/Handler;

.field private o:Ljava/lang/Runnable;

.field private p:Z

.field private q:Landroid/location/Location;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x6c

    const/16 v3, 0x55

    const/16 v2, 0x15

    const/4 v4, 0x2

    const/4 v8, 0x0

    const/16 v0, 0xa

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0016z\u00018"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    const/4 v10, 0x1

    const-string v0, "\u0000t\u001a"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "\u0000z\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v4

    const/4 v10, 0x3

    const-string v0, "\r{\n\'m\u0005q@<l\u0018p\u0000!,\rv\u001a<m\u0002;=\u0010C>V&"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "\u001d`\u000b\'{"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "\u000be\u001d"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_5
    if-gt v6, v7, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "\u0002p\u001a\"m\u001e~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "\u0000z\r4v\u0005z\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "\u0000z\r4v\u0005z\u0000%k\u000f~\u000b\'-\u000fg\u000b4v\t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, "\u0006|\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    .line 72
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/whatsapp/LocationPicker;->m:J

    .line 58
    sput-boolean v8, Lcom/whatsapp/LocationPicker;->s:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_a

    :pswitch_1
    move v0, v2

    goto :goto_a

    :pswitch_2
    const/16 v0, 0x6e

    goto :goto_a

    :pswitch_3
    move v0, v3

    goto :goto_a

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_b

    :pswitch_5
    move v0, v2

    goto :goto_b

    :pswitch_6
    const/16 v0, 0x6e

    goto :goto_b

    :pswitch_7
    move v0, v3

    goto :goto_b

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_c
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_c

    :pswitch_9
    move v0, v2

    goto :goto_c

    :pswitch_a
    const/16 v0, 0x6e

    goto :goto_c

    :pswitch_b
    move v0, v3

    goto :goto_c

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_d

    :pswitch_d
    move v0, v2

    goto :goto_d

    :pswitch_e
    const/16 v0, 0x6e

    goto :goto_d

    :pswitch_f
    move v0, v3

    goto :goto_d

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_e

    :pswitch_11
    move v0, v2

    goto :goto_e

    :pswitch_12
    const/16 v0, 0x6e

    goto :goto_e

    :pswitch_13
    move v0, v3

    goto :goto_e

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_f

    :pswitch_15
    move v0, v2

    goto :goto_f

    :pswitch_16
    const/16 v0, 0x6e

    goto :goto_f

    :pswitch_17
    move v0, v3

    goto :goto_f

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_10

    :pswitch_19
    move v0, v2

    goto :goto_10

    :pswitch_1a
    const/16 v0, 0x6e

    goto :goto_10

    :pswitch_1b
    move v0, v3

    goto :goto_10

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_11

    :pswitch_1d
    move v0, v2

    goto :goto_11

    :pswitch_1e
    const/16 v0, 0x6e

    goto :goto_11

    :pswitch_1f
    move v0, v3

    goto :goto_11

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_12

    :pswitch_21
    move v0, v2

    goto :goto_12

    :pswitch_22
    const/16 v0, 0x6e

    goto :goto_12

    :pswitch_23
    move v0, v3

    goto :goto_12

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

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
    const/16 v0, 0x6e

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
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/google/android/maps/MapActivity;-><init>()V

    .line 103
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/LocationPicker;->r:Z

    .line 63
    return-void
.end method

.method static a(J)J
    .locals 0
    .parameter

    .prologue
    .line 91
    sput-wide p0, Lcom/whatsapp/LocationPicker;->m:J

    return-wide p0
.end method

.method static a(Lcom/whatsapp/LocationPicker;Landroid/location/Location;)Landroid/location/Location;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 50
    iput-object p1, p0, Lcom/whatsapp/LocationPicker;->q:Landroid/location/Location;

    return-object p1
.end method

.method static a(Lcom/whatsapp/LocationPicker;Lcom/whatsapp/fy;)Lcom/whatsapp/fy;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 87
    iput-object p1, p0, Lcom/whatsapp/LocationPicker;->l:Lcom/whatsapp/fy;

    return-object p1
.end method

.method static a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;
    .locals 1
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    return-object v0
.end method

.method static a(Lcom/whatsapp/LocationPicker;Lcom/whatsapp/z9;)Lcom/whatsapp/z9;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 36
    iput-object p1, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    return-object p1
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 27
    .line 125
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    if-eqz v0, :cond_2

    .line 30
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget v0, v0, Lcom/whatsapp/z9;->h:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 111
    const v0, 0x7f09019a

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 126
    :goto_0
    iget-object v2, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    .line 70
    if-eqz v0, :cond_0

    .line 7
    iget-object v2, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 71
    :cond_0
    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v0, v0, Lcom/whatsapp/z9;->e:Ljava/lang/String;

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Landroid/location/Location;ILjava/lang/String;Z)V
    .locals 7
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x0

    .line 33
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->n:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/LocationPicker;->o:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 60
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v6}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    .line 134
    new-instance v0, Lcom/whatsapp/z9;

    invoke-direct {v0}, Lcom/whatsapp/z9;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    .line 88
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->i:Lcom/whatsapp/qe;

    invoke-virtual {v0}, Lcom/whatsapp/qe;->notifyDataSetChanged()V

    .line 93
    new-instance v0, Lcom/whatsapp/jb;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/jb;-><init>(Lcom/whatsapp/LocationPicker;Landroid/location/Location;ILjava/lang/String;Z)V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->j:Lcom/whatsapp/jb;

    .line 44
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->j:Lcom/whatsapp/jb;

    new-array v1, v6, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/jb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 68
    return-void
.end method

.method static a(Lcom/whatsapp/LocationPicker;Landroid/location/Location;ILjava/lang/String;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whatsapp/LocationPicker;->a(Landroid/location/Location;ILjava/lang/String;Z)V

    return-void
.end method

.method static a(Lcom/whatsapp/LocationPicker;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 34
    iput-boolean p1, p0, Lcom/whatsapp/LocationPicker;->r:Z

    return p1
.end method

.method static a(Z)Z
    .locals 0
    .parameter

    .prologue
    .line 10
    sput-boolean p0, Lcom/whatsapp/LocationPicker;->s:Z

    return p0
.end method

.method static b()Z
    .locals 1

    .prologue
    .line 48
    sget-boolean v0, Lcom/whatsapp/LocationPicker;->s:Z

    return v0
.end method

.method static b(Lcom/whatsapp/LocationPicker;)Z
    .locals 1
    .parameter

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/whatsapp/LocationPicker;->r:Z

    return v0
.end method

.method static b(Lcom/whatsapp/LocationPicker;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 136
    iput-boolean p1, p0, Lcom/whatsapp/LocationPicker;->p:Z

    return p1
.end method

.method static c()J
    .locals 2

    .prologue
    .line 42
    sget-wide v0, Lcom/whatsapp/LocationPicker;->m:J

    return-wide v0
.end method

.method static c(Lcom/whatsapp/LocationPicker;)Z
    .locals 1
    .parameter

    .prologue
    .line 4
    iget-boolean v0, p0, Lcom/whatsapp/LocationPicker;->p:Z

    return v0
.end method

.method static d(Lcom/whatsapp/LocationPicker;)Lcom/google/android/maps/MyLocationOverlay;
    .locals 1
    .parameter

    .prologue
    .line 82
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->d:Lcom/google/android/maps/MyLocationOverlay;

    return-object v0
.end method

.method static e(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/GoogleMapView;
    .locals 1
    .parameter

    .prologue
    .line 22
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    return-object v0
.end method

.method static f(Lcom/whatsapp/LocationPicker;)Landroid/location/Location;
    .locals 1
    .parameter

    .prologue
    .line 112
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->q:Landroid/location/Location;

    return-object v0
.end method

.method static g(Lcom/whatsapp/LocationPicker;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 108
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->a:Ljava/lang/String;

    return-object v0
.end method

.method static h(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/fy;
    .locals 1
    .parameter

    .prologue
    .line 25
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->l:Lcom/whatsapp/fy;

    return-object v0
.end method

.method static i(Lcom/whatsapp/LocationPicker;)Landroid/widget/ProgressBar;
    .locals 1
    .parameter

    .prologue
    .line 132
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->f:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static j(Lcom/whatsapp/LocationPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/whatsapp/LocationPicker;->a()V

    return-void
.end method

.method static k(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/qe;
    .locals 1
    .parameter

    .prologue
    .line 18
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->i:Lcom/whatsapp/qe;

    return-object v0
.end method

.method static l(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/gf;
    .locals 1
    .parameter

    .prologue
    .line 52
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->e:Lcom/whatsapp/gf;

    return-object v0
.end method

.method static m(Lcom/whatsapp/LocationPicker;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 80
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static n(Lcom/whatsapp/LocationPicker;)Landroid/widget/ListView;
    .locals 1
    .parameter

    .prologue
    .line 20
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/maps/GeoPoint;II)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 13
    return-void
.end method

.method protected isRouteDisplayed()Z
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9
    .parameter

    .prologue
    const/16 v2, 0x8

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 39
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreate(Landroid/os/Bundle;)V

    .line 85
    sget-object v0, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 128
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-nez v0, :cond_1

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/LocationPicker;->finish()V

    .line 64
    :cond_0
    :goto_0
    return-void

    .line 74
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/LocationPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/16 v5, 0x9

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->a:Ljava/lang/String;

    .line 79
    invoke-virtual {p0}, Lcom/whatsapp/LocationPicker;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/z9;

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    .line 31
    const v0, 0x7f03003e

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->setContentView(I)V

    .line 16
    const v0, 0x7f0d012a

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->c:Landroid/widget/TextView;

    .line 8
    const v0, 0x7f0d0123

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/GoogleMapView;

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    .line 37
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0, p0}, Lcom/whatsapp/GoogleMapView;->a(Lcom/whatsapp/jt;)V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0, v1}, Lcom/whatsapp/GoogleMapView;->setBuiltInZoomControls(Z)V

    .line 73
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    const/16 v4, 0x12

    invoke-virtual {v0, v4}, Lcom/google/android/maps/MapController;->setZoom(I)I

    .line 137
    new-instance v0, Lcom/whatsapp/jf;

    iget-object v4, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-direct {v0, p0, p0, v4}, Lcom/whatsapp/jf;-><init>(Lcom/whatsapp/LocationPicker;Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->d:Lcom/google/android/maps/MyLocationOverlay;

    .line 86
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->n:Landroid/os/Handler;

    .line 120
    new-instance v0, Lcom/whatsapp/sv;

    invoke-direct {v0, p0}, Lcom/whatsapp/sv;-><init>(Lcom/whatsapp/LocationPicker;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->o:Ljava/lang/Runnable;

    .line 139
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    if-nez v0, :cond_2

    .line 129
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->d:Lcom/google/android/maps/MyLocationOverlay;

    new-instance v4, Lcom/whatsapp/tv;

    invoke-direct {v4, p0}, Lcom/whatsapp/tv;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v4}, Lcom/google/android/maps/MyLocationOverlay;->runOnFirstFix(Ljava/lang/Runnable;)Z

    .line 110
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->n:Landroid/os/Handler;

    iget-object v4, p0, Lcom/whatsapp/LocationPicker;->o:Ljava/lang/Runnable;

    const-wide/16 v5, 0x3a98

    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    if-eqz v3, :cond_7

    .line 61
    :cond_2
    if-eqz p1, :cond_4

    .line 75
    sget-object v0, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 98
    if-lez v0, :cond_3

    .line 124
    new-instance v4, Lcom/google/android/maps/GeoPoint;

    sget-object v5, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    aget-object v5, v5, v7

    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    sget-object v6, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    aget-object v6, v6, v8

    invoke-virtual {p1, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v4, v5, v6}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 123
    iget-object v5, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v5}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/maps/MapController;->setCenter(Lcom/google/android/maps/GeoPoint;)V

    .line 24
    iget-object v4, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v4}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/android/maps/MapController;->setZoom(I)I

    .line 109
    :cond_3
    if-eqz v3, :cond_5

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v0, v0, Lcom/whatsapp/z9;->a:Landroid/location/Location;

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    iget-object v4, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v4, v4, Lcom/whatsapp/z9;->a:Landroid/location/Location;

    invoke-static {v4}, Lcom/whatsapp/GoogleMapView;->a(Landroid/location/Location;)Lcom/google/android/maps/GeoPoint;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/whatsapp/GoogleMapView;->b(Lcom/google/android/maps/GeoPoint;)V

    .line 32
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v0, v0, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, ""

    iget-object v4, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v4, v4, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 57
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->c:Landroid/widget/TextView;

    const v4, 0x7f090197

    new-array v5, v7, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v6, v6, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    aput-object v6, v5, v1

    invoke-virtual {p0, v4, v5}, Lcom/whatsapp/LocationPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v3, :cond_7

    .line 5
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->c:Landroid/widget/TextView;

    const v3, 0x7f090196

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 6
    :cond_7
    new-instance v0, Lcom/whatsapp/gf;

    invoke-direct {v0, p0}, Lcom/whatsapp/gf;-><init>(Lcom/whatsapp/LocationPicker;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->e:Lcom/whatsapp/gf;

    .line 117
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->e:Lcom/whatsapp/gf;

    invoke-virtual {v0}, Lcom/whatsapp/gf;->a()V

    .line 113
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->e:Lcom/whatsapp/gf;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->d:Lcom/google/android/maps/MyLocationOverlay;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    const v0, 0x7f0d0129

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/whatsapp/uv;

    invoke-direct {v3, p0}, Lcom/whatsapp/uv;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    new-instance v0, Lcom/whatsapp/qe;

    invoke-direct {v0, p0, p0}, Lcom/whatsapp/qe;-><init>(Lcom/whatsapp/LocationPicker;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->i:Lcom/whatsapp/qe;

    .line 140
    const v0, 0x7f0d012b

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    .line 77
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    .line 90
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 115
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    const/16 v3, 0x11

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 56
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->J:F

    float-to-int v3, v3

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v4

    iget v4, v4, Lcom/whatsapp/j4;->J:F

    float-to-int v4, v4

    invoke-virtual {v0, v3, v1, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 95
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    invoke-virtual {v0, v7}, Landroid/widget/ListView;->setFooterDividersEnabled(Z)V

    .line 47
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->h:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v7}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 46
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->i:Lcom/whatsapp/qe;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 67
    invoke-direct {p0}, Lcom/whatsapp/LocationPicker;->a()V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->g:Landroid/widget/ListView;

    new-instance v3, Lcom/whatsapp/vv;

    invoke-direct {v3, p0}, Lcom/whatsapp/vv;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 99
    const v0, 0x7f0d0122

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/whatsapp/wv;

    invoke-direct {v3, p0}, Lcom/whatsapp/wv;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    const v0, 0x7f0d0085

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/whatsapp/yv;

    invoke-direct {v3, p0}, Lcom/whatsapp/yv;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    const v0, 0x7f0d00e0

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->f:Landroid/widget/ProgressBar;

    .line 89
    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->f:Landroid/widget/ProgressBar;

    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    if-nez v0, :cond_9

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 17
    const v0, 0x7f0d0128

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 94
    new-instance v1, Lcom/whatsapp/zv;

    invoke-direct {v1, p0}, Lcom/whatsapp/zv;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    sget v1, Lcom/whatsapp/App;->f:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_8

    .line 62
    new-instance v1, Lcom/whatsapp/aw;

    invoke-direct {v1, p0}, Lcom/whatsapp/aw;-><init>(Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 11
    :cond_8
    if-nez p1, :cond_0

    .line 107
    sget-object v0, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/LocationPicker;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    .line 78
    sget-object v1, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    invoke-virtual {p0, v8}, Lcom/whatsapp/LocationPicker;->showDialog(I)V

    goto/16 :goto_0

    :cond_9
    move v0, v2

    .line 89
    goto :goto_1
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter

    .prologue
    .line 121
    packed-switch p1, :pswitch_data_0

    .line 38
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 43
    :pswitch_0
    new-instance v0, Lcom/whatsapp/rv;

    invoke-direct {v0, p0}, Lcom/whatsapp/rv;-><init>(Lcom/whatsapp/LocationPicker;)V

    .line 1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09010e

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09010f

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09000e

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 121
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 3
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onDestroy()V

    .line 96
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->n:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->n:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/LocationPicker;->o:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->j:Lcom/whatsapp/jb;

    if-eqz v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->j:Lcom/whatsapp/jb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/jb;->cancel(Z)Z

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/LocationPicker;->j:Lcom/whatsapp/jb;

    .line 104
    :cond_1
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 4
    .parameter

    .prologue
    .line 23
    sget-object v0, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    sget-object v0, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    iget-object v1, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->c()Landroid/location/Location;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v2}, Lcom/whatsapp/GoogleMapView;->b()I

    move-result v2

    const/16 v3, 0x5dc

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {p0, v1, v2, v0, v3}, Lcom/whatsapp/LocationPicker;->a(Landroid/location/Location;ILjava/lang/String;Z)V

    .line 49
    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 76
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onPause()V

    .line 135
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->d:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->disableMyLocation()V

    .line 133
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 116
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onResume()V

    .line 21
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->d:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->enableMyLocation()Z

    .line 97
    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    return-object v0
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    .line 127
    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 69
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getMapCenter()Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    .line 105
    sget-object v1, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 131
    sget-object v1, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 14
    sget-object v0, Lcom/whatsapp/LocationPicker;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->getZoomLevel()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 130
    return-void
.end method

.method public onSearchRequested()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x1

    .line 100
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v3, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v3}, Lcom/whatsapp/GoogleMapView;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/LocationPicker;->b:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v4}, Lcom/whatsapp/GoogleMapView;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Lcom/whatsapp/GoogleMapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {p0, v0, v5, v1, v2}, Lcom/whatsapp/LocationPicker;->startSearch(Ljava/lang/String;ZLandroid/os/Bundle;Z)V

    .line 106
    return v5

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/LocationPicker;->k:Lcom/whatsapp/z9;

    iget-object v0, v0, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    goto :goto_0
.end method
