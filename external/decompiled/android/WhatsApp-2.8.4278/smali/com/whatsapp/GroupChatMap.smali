.class public Lcom/whatsapp/GroupChatMap;
.super Lcom/google/android/maps/MapActivity;
.source "GroupChatMap.java"

# interfaces
.implements Lcom/whatsapp/jt;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/maps/MyLocationOverlay;

.field private d:I

.field private e:Lcom/whatsapp/GoogleMapView;

.field private f:Lcom/whatsapp/ff;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/whatsapp/zq;

.field private i:I

.field private j:Landroid/view/View$OnLongClickListener;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/whatsapp/lq;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x69

    const/16 v2, 0x5f

    const/16 v3, 0x45

    const/4 v6, 0x0

    const/16 v4, 0x65

    const/4 v0, 0x7

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0004>5J\u0001\u000c,1\u0017\n\u0010"

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

    const-string v0, "\u001c/!\u0004\u0011\u000c\u007f\'\u0004\t\u00060+\u0016"

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

    const-string v0, "\u0005><\n\u0010\u001d\u0000,\u000b\u0003\u0005>1\u0000\u0017"

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

    const-string v0, "\u000e-*\u0010\u001562$\u0015J\u001b:6\u0010\t\u001dp6\u000e\u000c\u0019p&\n\u000b\u001d>&\u0011E\u000701E\u0004\r; \u0001"

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

    const-string v0, "\u000e-*\u0010\u001562$\u0015J\u001b:6\u0010\t\u001dp&\n\u000b\u001d>&\u0011E\u000701E\u0004\r; \u0001"

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

    const-string v0, "\u0004>5J\u0006\u001b:$\u0011\u0000"

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

    const-string v0, "\u00036!"

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

    sput-object v9, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

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
    move v0, v1

    goto :goto_7

    :pswitch_1
    move v0, v2

    goto :goto_7

    :pswitch_2
    move v0, v3

    goto :goto_7

    :pswitch_3
    move v0, v4

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
    move v0, v1

    goto :goto_8

    :pswitch_5
    move v0, v2

    goto :goto_8

    :pswitch_6
    move v0, v3

    goto :goto_8

    :pswitch_7
    move v0, v4

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
    move v0, v1

    goto :goto_9

    :pswitch_9
    move v0, v2

    goto :goto_9

    :pswitch_a
    move v0, v3

    goto :goto_9

    :pswitch_b
    move v0, v4

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
    move v0, v1

    goto :goto_a

    :pswitch_d
    move v0, v2

    goto :goto_a

    :pswitch_e
    move v0, v3

    goto :goto_a

    :pswitch_f
    move v0, v4

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
    move v0, v1

    goto :goto_b

    :pswitch_11
    move v0, v2

    goto :goto_b

    :pswitch_12
    move v0, v3

    goto :goto_b

    :pswitch_13
    move v0, v4

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
    move v0, v1

    goto :goto_c

    :pswitch_15
    move v0, v2

    goto :goto_c

    :pswitch_16
    move v0, v3

    goto :goto_c

    :pswitch_17
    move v0, v4

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
    move v0, v1

    goto :goto_d

    :pswitch_19
    move v0, v2

    goto :goto_d

    :pswitch_1a
    move v0, v3

    goto :goto_d

    :pswitch_1b
    move v0, v4

    goto :goto_d

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
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 99
    invoke-direct {p0}, Lcom/google/android/maps/MapActivity;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/GroupChatMap;->i:I

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/GroupChatMap;->k:Ljava/util/ArrayList;

    .line 134
    new-instance v0, Lcom/whatsapp/pq;

    invoke-direct {v0, p0}, Lcom/whatsapp/pq;-><init>(Lcom/whatsapp/GroupChatMap;)V

    iput-object v0, p0, Lcom/whatsapp/GroupChatMap;->l:Lcom/whatsapp/lq;

    .line 24
    return-void
.end method

.method static a(Lcom/whatsapp/GroupChatMap;I)I
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 40
    iput p1, p0, Lcom/whatsapp/GroupChatMap;->d:I

    return p1
.end method

.method static a(Lcom/whatsapp/GroupChatMap;)Lcom/google/android/maps/MyLocationOverlay;
    .locals 1
    .parameter

    .prologue
    .line 179
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    return-object v0
.end method

.method static a(Lcom/whatsapp/GroupChatMap;Ljava/lang/String;)Lcom/whatsapp/sz;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lcom/whatsapp/GroupChatMap;->a(Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lcom/whatsapp/sz;
    .locals 4
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 193
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 155
    iget-object v3, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 81
    :goto_0
    return-object v0

    .line 41
    :cond_1
    if-eqz v1, :cond_0

    .line 81
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/GroupChatMap;Lcom/whatsapp/zq;)Lcom/whatsapp/zq;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 140
    iput-object p1, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    return-object p1
.end method

.method private a()V
    .locals 9

    .prologue
    const/16 v8, 0x11

    const/4 v7, 0x0

    const/4 v1, -0x1

    const-wide v5, 0x412e848000000000L

    .line 120
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->d:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->getMyLocation()Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    if-nez v0, :cond_0

    .line 119
    iput v7, p0, Lcom/whatsapp/GroupChatMap;->d:I

    .line 177
    :cond_0
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->d:I

    if-ne v0, v1, :cond_1

    .line 23
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v1}, Lcom/google/android/maps/MyLocationOverlay;->getMyLocation()Lcom/google/android/maps/GeoPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    .line 46
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/maps/MapController;->setZoom(I)I

    .line 53
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->g:Landroid/widget/TextView;

    const v1, 0x7f090282

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatMap;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 109
    :cond_1
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->d:I

    iget-object v1, p0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 113
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    iget v1, p0, Lcom/whatsapp/GroupChatMap;->d:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 3
    new-instance v1, Lcom/google/android/maps/GeoPoint;

    iget-wide v2, v0, Lcom/whatsapp/sz;->q:D

    mul-double/2addr v2, v5

    double-to-int v2, v2

    iget-wide v3, v0, Lcom/whatsapp/sz;->r:D

    mul-double/2addr v3, v5

    double-to-int v0, v3

    invoke-direct {v1, v2, v0}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 108
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    .line 188
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/maps/MapController;->setZoom(I)I

    .line 5
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->g:Landroid/widget/TextView;

    const v1, 0x7f090281

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/whatsapp/GroupChatMap;->d:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v7

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatMap;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    :cond_2
    return-void
.end method

.method private a(Landroid/view/View;Lcom/whatsapp/sz;)V
    .locals 5
    .parameter
    .parameter

    .prologue
    .line 136
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v1

    .line 90
    const v0, 0x7f0d007c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 158
    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    const v0, 0x7f0d007d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 112
    iget-wide v2, p2, Lcom/whatsapp/sz;->i:J

    invoke-static {p0, v2, v3}, Lcom/whatsapp/t4;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    const v0, 0x7f0d007b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 107
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0004

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v3}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->L:F

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 83
    if-eqz v2, :cond_0

    .line 101
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v2, :cond_1

    .line 66
    :cond_0
    invoke-virtual {v1}, Lcom/whatsapp/zq;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 152
    :cond_1
    iget-object v0, p2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 153
    return-void
.end method

.method static b(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/GoogleMapView;
    .locals 1
    .parameter

    .prologue
    .line 147
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    return-object v0
.end method

.method private b()V
    .locals 25

    .prologue
    sget-boolean v9, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 33
    sget-object v2, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 14
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 85
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v4, v2}, Lcom/whatsapp/GoogleMapView;->removeView(Landroid/view/View;)V

    if-eqz v9, :cond_0

    .line 98
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v2}, Lcom/whatsapp/GoogleMapView;->getWidth()I

    move-result v2

    .line 91
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v3}, Lcom/whatsapp/GoogleMapView;->getHeight()I

    move-result v3

    .line 36
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    div-int/lit8 v2, v2, 0xa

    .line 16
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v3}, Lcom/whatsapp/GoogleMapView;->getZoomLevel()I

    move-result v3

    .line 45
    const-wide/high16 v4, 0x4000

    int-to-double v6, v3

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    const-wide/high16 v5, 0x4070

    mul-double/2addr v3, v5

    const-wide/high16 v5, 0x4000

    div-double/2addr v3, v5

    .line 190
    mul-int/lit16 v2, v2, 0x168

    int-to-double v5, v2

    div-double v4, v5, v3

    .line 30
    const-wide/high16 v2, 0x4000

    div-double v6, v4, v2

    .line 131
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 47
    new-instance v10, Landroid/graphics/Point;

    invoke-direct {v10}, Landroid/graphics/Point;-><init>()V

    .line 127
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whatsapp/sz;

    .line 26
    iget-wide v12, v2, Lcom/whatsapp/sz;->r:D

    .line 172
    iget-wide v14, v2, Lcom/whatsapp/sz;->q:D

    .line 77
    new-instance v3, Lcom/google/android/maps/GeoPoint;

    iget-wide v0, v2, Lcom/whatsapp/sz;->q:D

    move-wide/from16 v16, v0

    const-wide v18, 0x412e848000000000L

    mul-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-int v0, v0

    move/from16 v16, v0

    iget-wide v0, v2, Lcom/whatsapp/sz;->r:D

    move-wide/from16 v17, v0

    const-wide v19, 0x412e848000000000L

    mul-double v17, v17, v19

    move-wide/from16 v0, v17

    double-to-int v0, v0

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-direct {v3, v0, v1}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lcom/whatsapp/GoogleMapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-interface {v0, v3, v10}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v16, 0x4066800000000000L

    add-double v12, v12, v16

    div-double/2addr v12, v4

    double-to-int v12, v12

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v12, " "

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-wide v12, 0x4056800000000000L

    add-double/2addr v12, v14

    div-double/2addr v12, v6

    double-to-int v12, v12

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 135
    invoke-virtual {v8, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    .line 59
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8, v3, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    :cond_3
    invoke-virtual {v8, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 50
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    if-eqz v9, :cond_2

    .line 115
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 111
    new-instance v3, Lcom/whatsapp/tu;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/whatsapp/tu;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 7
    new-instance v11, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 184
    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 88
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v6, 0x40e0

    invoke-static/range {p0 .. p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v7

    iget v7, v7, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v6, v7

    float-to-int v6, v6

    invoke-virtual {v11, v3, v4, v5, v6}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 159
    new-instance v12, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 144
    const/4 v3, 0x1

    invoke-virtual {v12, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 145
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 143
    sget-object v3, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/whatsapp/GroupChatMap;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/LayoutInflater;

    .line 141
    new-instance v4, Lcom/whatsapp/q;

    invoke-direct {v4}, Lcom/whatsapp/q;-><init>()V

    .line 181
    const/high16 v5, 0x4140

    invoke-static/range {p0 .. p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v6

    iget v6, v6, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/whatsapp/q;->a(I)V

    .line 48
    invoke-virtual {v12, v4}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    const-wide/16 v6, 0x0

    .line 70
    const-wide/16 v4, 0x0

    .line 106
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move-wide/from16 v21, v4

    move-wide/from16 v23, v6

    move-wide/from16 v7, v23

    move-wide/from16 v5, v21

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whatsapp/sz;

    .line 103
    const v14, 0x7f03000e

    const/4 v15, 0x0

    invoke-virtual {v3, v14, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v14

    .line 192
    const/4 v15, 0x1

    invoke-virtual {v14, v15}, Landroid/view/View;->setClickable(Z)V

    .line 118
    const v15, 0x7f020412

    invoke-virtual {v14, v15}, Landroid/view/View;->setBackgroundResource(I)V

    .line 96
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v4}, Lcom/whatsapp/GroupChatMap;->a(Landroid/view/View;Lcom/whatsapp/sz;)V

    .line 71
    invoke-virtual {v12, v14}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 43
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/whatsapp/GroupChatMap;->j:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v14, v15}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 125
    iget-wide v14, v4, Lcom/whatsapp/sz;->q:D

    add-double/2addr v7, v14

    .line 139
    iget-wide v14, v4, Lcom/whatsapp/sz;->r:D

    add-double v4, v5, v14

    .line 52
    if-eqz v9, :cond_7

    .line 116
    :goto_1
    new-instance v3, Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    int-to-double v12, v6

    div-double v6, v7, v12

    const-wide v12, 0x412e848000000000L

    mul-double/2addr v6, v12

    double-to-int v6, v6

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    int-to-double v7, v2

    div-double/2addr v4, v7

    const-wide v7, 0x412e848000000000L

    mul-double/2addr v4, v7

    double-to-int v2, v4

    invoke-direct {v3, v6, v2}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    new-instance v4, Lcom/google/android/maps/MapView$LayoutParams;

    const/4 v5, -0x2

    const/4 v6, -0x2

    const/16 v7, 0x51

    invoke-direct {v4, v5, v6, v3, v7}, Lcom/google/android/maps/MapView$LayoutParams;-><init>(IILcom/google/android/maps/GeoPoint;I)V

    invoke-virtual {v2, v11, v4}, Lcom/whatsapp/GoogleMapView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    if-eqz v9, :cond_5

    .line 129
    :cond_6
    return-void

    :cond_7
    move-wide v5, v4

    goto :goto_0

    :cond_8
    move-wide v4, v5

    goto :goto_1
.end method

.method static c(Lcom/whatsapp/GroupChatMap;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 68
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static d(Lcom/whatsapp/GroupChatMap;)I
    .locals 2
    .parameter

    .prologue
    .line 29
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->d:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/whatsapp/GroupChatMap;->d:I

    return v0
.end method

.method static e(Lcom/whatsapp/GroupChatMap;)I
    .locals 1
    .parameter

    .prologue
    .line 128
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->d:I

    return v0
.end method

.method static f(Lcom/whatsapp/GroupChatMap;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 57
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method static g(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 138
    invoke-direct {p0}, Lcom/whatsapp/GroupChatMap;->a()V

    return-void
.end method

.method static h(Lcom/whatsapp/GroupChatMap;)I
    .locals 2
    .parameter

    .prologue
    .line 170
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/whatsapp/GroupChatMap;->d:I

    return v0
.end method

.method static i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 110
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    return-object v0
.end method

.method static j(Lcom/whatsapp/GroupChatMap;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 154
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->a:Ljava/lang/String;

    return-object v0
.end method

.method static k(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/whatsapp/GroupChatMap;->b()V

    return-void
.end method

.method static l(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/ff;
    .locals 1
    .parameter

    .prologue
    .line 80
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->f:Lcom/whatsapp/ff;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/maps/GeoPoint;II)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 121
    iget v0, p0, Lcom/whatsapp/GroupChatMap;->i:I

    iget-object v1, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->getZoomLevel()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 87
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getZoomLevel()I

    move-result v0

    iput v0, p0, Lcom/whatsapp/GroupChatMap;->i:I

    .line 157
    invoke-direct {p0}, Lcom/whatsapp/GroupChatMap;->b()V

    .line 126
    :cond_0
    return-void
.end method

.method protected isRouteDisplayed()Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v4, -0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 105
    packed-switch p1, :pswitch_data_0

    .line 167
    :cond_0
    :goto_0
    return-void

    .line 1
    :pswitch_0
    if-ne p2, v4, :cond_2

    .line 42
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 94
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/qp;->a(Landroid/net/Uri;Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_3

    .line 163
    :cond_1
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_3

    .line 171
    :cond_2
    sget-object v1, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 75
    :cond_3
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    .line 130
    if-eqz v0, :cond_0

    .line 51
    :pswitch_1
    if-ne p2, v4, :cond_4

    .line 13
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;)V

    if-eqz v0, :cond_5

    .line 100
    :cond_4
    sget-object v0, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 18
    :cond_5
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    goto :goto_0

    .line 105
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 24
    .parameter

    .prologue
    sget-boolean v10, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 69
    invoke-super/range {p0 .. p1}, Lcom/google/android/maps/MapActivity;->onCreate(Landroid/os/Bundle;)V

    .line 89
    sget-object v1, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 11
    const v1, 0x7f03003b

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->setContentView(I)V

    .line 92
    invoke-virtual/range {p0 .. p0}, Lcom/whatsapp/GroupChatMap;->getIntent()Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->a:Ljava/lang/String;

    .line 60
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v3

    .line 173
    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whatsapp/GroupChatMap;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 174
    const v1, 0x7f0d0044

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 182
    if-nez v2, :cond_0

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    const v1, 0x7f0d0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/GoogleMapView;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    .line 133
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    move-object/from16 v0, p0

    invoke-virtual {v1, v0}, Lcom/whatsapp/GoogleMapView;->a(Lcom/whatsapp/jt;)V

    .line 194
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/whatsapp/GoogleMapView;->setBuiltInZoomControls(Z)V

    .line 169
    const v1, 0x7f0d00c9

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->g:Landroid/widget/TextView;

    .line 189
    new-instance v1, Lcom/whatsapp/hf;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    move-object/from16 v0, p0

    invoke-direct {v1, v0, v2}, Lcom/whatsapp/hf;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    .line 78
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->getOverlays()Ljava/util/List;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    sget-object v1, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/whatsapp/fq;->p(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    .line 175
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    new-instance v2, Lcom/whatsapp/ku;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/whatsapp/ku;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 10
    new-instance v1, Lcom/whatsapp/lu;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/whatsapp/lu;-><init>(Lcom/whatsapp/GroupChatMap;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->j:Landroid/view/View$OnLongClickListener;

    .line 76
    const-wide v7, 0x4056800000000000L

    .line 162
    const-wide v5, -0x3fa9800000000000L

    .line 19
    const-wide v3, 0x4066800000000000L

    .line 49
    const-wide v1, -0x3f99800000000000L

    .line 123
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-wide/from16 v16, v1

    move-wide/from16 v18, v3

    move-wide/from16 v2, v16

    move-wide/from16 v20, v5

    move-wide/from16 v4, v18

    move-wide/from16 v22, v7

    move-wide/from16 v8, v22

    move-wide/from16 v6, v20

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;

    .line 55
    iget-wide v12, v1, Lcom/whatsapp/sz;->q:D

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    .line 104
    iget-wide v12, v1, Lcom/whatsapp/sz;->q:D

    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    .line 187
    iget-wide v12, v1, Lcom/whatsapp/sz;->r:D

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    .line 82
    iget-wide v12, v1, Lcom/whatsapp/sz;->r:D

    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    if-eqz v10, :cond_4

    .line 166
    :goto_1
    new-instance v3, Lcom/google/android/maps/GeoPoint;

    add-double v11, v8, v6

    const-wide v13, 0x412e848000000000L

    mul-double/2addr v11, v13

    const-wide/high16 v13, 0x4000

    div-double/2addr v11, v13

    double-to-int v11, v11

    add-double v12, v4, v1

    const-wide v14, 0x412e848000000000L

    mul-double/2addr v12, v14

    const-wide/high16 v14, 0x4000

    div-double/2addr v12, v14

    double-to-int v12, v12

    invoke-direct {v3, v11, v12}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 156
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v11}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v11

    invoke-virtual {v11, v3}, Lcom/google/android/maps/MapController;->setCenter(Lcom/google/android/maps/GeoPoint;)V

    .line 56
    sub-double/2addr v6, v8

    const-wide v8, 0x3ff4cccccccccccdL

    mul-double/2addr v6, v8

    const-wide v8, 0x412e848000000000L

    mul-double/2addr v6, v8

    double-to-int v3, v6

    .line 168
    sub-double/2addr v1, v4

    const-wide v4, 0x3ff4cccccccccccdL

    mul-double/2addr v1, v4

    const-wide v4, 0x412e848000000000L

    mul-double/2addr v1, v4

    double-to-int v1, v1

    .line 4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x1

    if-gt v2, v4, :cond_1

    .line 37
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v2}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v2

    const/16 v4, 0x11

    invoke-virtual {v2, v4}, Lcom/google/android/maps/MapController;->setZoom(I)I

    if-eqz v10, :cond_2

    .line 58
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v2}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Lcom/google/android/maps/MapController;->zoomToSpan(II)V

    .line 176
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/whatsapp/GroupChatMap;->b()V

    .line 17
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move-object/from16 v0, p0

    iput v1, v0, Lcom/whatsapp/GroupChatMap;->d:I

    .line 65
    new-instance v1, Lcom/whatsapp/ff;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/whatsapp/ff;-><init>(Lcom/whatsapp/GroupChatMap;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/whatsapp/GroupChatMap;->f:Lcom/whatsapp/ff;

    .line 160
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->f:Lcom/whatsapp/ff;

    invoke-virtual {v1}, Lcom/whatsapp/ff;->a()V

    .line 164
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->getOverlays()Ljava/util/List;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->f:Lcom/whatsapp/ff;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    const v1, 0x7f0d0122

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/mu;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/whatsapp/mu;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    const v1, 0x7f0d0125

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/pu;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/whatsapp/pu;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    const v1, 0x7f0d0126

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/qu;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/whatsapp/qu;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    const v1, 0x7f0d0124

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/ru;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/whatsapp/ru;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/GroupChatMap;->e:Lcom/whatsapp/GoogleMapView;

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->getZoomButtonsController()Landroid/widget/ZoomButtonsController;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ZoomButtonsController;->getZoomControls()Landroid/view/View;

    move-result-object v1

    .line 142
    if-eqz v1, :cond_3

    .line 86
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {p0 .. p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v5

    iget v5, v5, Lcom/whatsapp/j4;->d:F

    const/high16 v6, 0x4240

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    :cond_3
    sget-object v1, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/GroupChatMap;->l:Lcom/whatsapp/lq;

    invoke-virtual {v1, v2}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/lq;)V

    .line 74
    return-void

    :cond_4
    move-wide v2, v1

    goto/16 :goto_0

    :cond_5
    move-wide v1, v2

    goto/16 :goto_1
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 67
    packed-switch p1, :pswitch_data_0

    .line 165
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 95
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    const v1, 0x7f09029c

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatMap;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    const v1, 0x7f09029e

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatMap;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object v1, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v1, :cond_0

    .line 137
    const v1, 0x7f0900ef

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/whatsapp/GroupChatMap;->h:Lcom/whatsapp/zq;

    invoke-virtual {v3}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/GroupChatMap;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 102
    :cond_0
    const v1, 0x7f09022a

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatMap;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    const v1, 0x7f09022b

    invoke-virtual {p0, v1}, Lcom/whatsapp/GroupChatMap;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    .line 93
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 84
    new-instance v2, Lcom/whatsapp/su;

    invoke-direct {v2, p0}, Lcom/whatsapp/su;-><init>(Lcom/whatsapp/GroupChatMap;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 185
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 191
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog;->requestWindowFeature(I)Z

    goto :goto_0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 97
    sget-object v0, Lcom/whatsapp/GroupChatMap;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 149
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onDestroy()V

    .line 20
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/GroupChatMap;->l:Lcom/whatsapp/lq;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->b(Lcom/whatsapp/lq;)V

    .line 34
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 114
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onPause()V

    .line 132
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->disableMyLocation()V

    .line 186
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 148
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onResume()V

    .line 161
    iget-object v0, p0, Lcom/whatsapp/GroupChatMap;->c:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->enableMyLocation()Z

    .line 38
    return-void
.end method
