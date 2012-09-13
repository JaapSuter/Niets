.class Lcom/whatsapp/jb;
.super Landroid/os/AsyncTask;
.source "jb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/whatsapp/z9;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Landroid/location/Location;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Z

.field final e:Lcom/whatsapp/LocationPicker;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\'Df%T9Gf%R7^j:B<"

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

    sput-object v0, Lcom/whatsapp/jb;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xb

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x68

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x12

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x23

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x77

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/LocationPicker;Landroid/location/Location;ILjava/lang/String;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 48
    iput-object p2, p0, Lcom/whatsapp/jb;->a:Landroid/location/Location;

    .line 25
    iput-object p4, p0, Lcom/whatsapp/jb;->b:Ljava/lang/String;

    .line 14
    iput p3, p0, Lcom/whatsapp/jb;->c:I

    .line 1
    iput-boolean p5, p0, Lcom/whatsapp/jb;->d:Z

    .line 56
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/whatsapp/z9;
    .locals 7
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 43
    .line 52
    :try_start_0
    invoke-static {}, Lcom/whatsapp/LocationPicker;->c()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    invoke-static {}, Lcom/whatsapp/LocationPicker;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 23
    iget-object v0, p0, Lcom/whatsapp/jb;->a:Landroid/location/Location;

    iget v2, p0, Lcom/whatsapp/jb;->c:I

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/whatsapp/jb;->b:Ljava/lang/String;

    invoke-static {v0, v2, v3, v4}, Lcom/whatsapp/z9;->a(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 51
    :try_start_1
    invoke-virtual {v0}, Lcom/whatsapp/z9;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/whatsapp/jb;->z:Ljava/lang/String;

    iget-object v2, v0, Lcom/whatsapp/z9;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xdbba00

    add-long/2addr v1, v3

    invoke-static {v1, v2}, Lcom/whatsapp/LocationPicker;->a(J)J

    .line 16
    iget-object v1, p0, Lcom/whatsapp/jb;->a:Landroid/location/Location;

    iget v2, p0, Lcom/whatsapp/jb;->c:I

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/whatsapp/jb;->b:Ljava/lang/String;

    invoke-static {v1, v2, v3, v4}, Lcom/whatsapp/z9;->b(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 49
    :cond_0
    :goto_0
    return-object v0

    .line 50
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/whatsapp/jb;->a:Landroid/location/Location;

    iget v2, p0, Lcom/whatsapp/jb;->c:I

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/whatsapp/jb;->b:Ljava/lang/String;

    invoke-static {v0, v2, v3, v4}, Lcom/whatsapp/z9;->b(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_0

    .line 2
    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 35
    :goto_1
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 5
    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 55
    :goto_2
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 5
    :catch_2
    move-exception v1

    goto :goto_2

    .line 2
    :catch_3
    move-exception v1

    goto :goto_1
.end method

.method protected a(Lcom/whatsapp/z9;)V
    .locals 24
    .parameter

    .prologue
    sget-boolean v10, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 53
    invoke-virtual/range {p0 .. p0}, Lcom/whatsapp/jb;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_6

    .line 29
    if-eqz p1, :cond_0

    .line 12
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    move-object/from16 v0, p1

    invoke-static {v1, v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;Lcom/whatsapp/z9;)Lcom/whatsapp/z9;

    .line 3
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->a:Landroid/location/Location;

    invoke-virtual {v1, v2}, Lcom/whatsapp/z9;->a(Landroid/location/Location;)V

    .line 34
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->i(Lcom/whatsapp/LocationPicker;)Landroid/widget/ProgressBar;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 41
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/z9;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-virtual {v1}, Lcom/whatsapp/LocationPicker;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    const v3, 0x7f090199

    invoke-virtual {v2, v3}, Lcom/whatsapp/LocationPicker;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 44
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    const v2, 0x7f0d012c

    invoke-virtual {v1, v2}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz v10, :cond_2

    .line 36
    :cond_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    const v2, 0x7f0d012c

    invoke-virtual {v1, v2}, Lcom/whatsapp/LocationPicker;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 26
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->j(Lcom/whatsapp/LocationPicker;)V

    .line 18
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->k(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/qe;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/qe;->notifyDataSetChanged()V

    .line 22
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->l(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/gf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/gf;->a()V

    .line 45
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->e(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/GoogleMapView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/GoogleMapView;->invalidate()V

    .line 33
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v1, ""

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v2}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v2

    iget-object v2, v2, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 32
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->m(Lcom/whatsapp/LocationPicker;)Landroid/widget/TextView;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    const v3, 0x7f090197

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v6}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v6

    iget-object v6, v6, Lcom/whatsapp/z9;->d:Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/LocationPicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v10, :cond_4

    .line 8
    :cond_3
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->m(Lcom/whatsapp/LocationPicker;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f090196

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 11
    :cond_4
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whatsapp/jb;->d:Z

    if-eqz v1, :cond_6

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/z9;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 19
    const-wide v7, 0x4056800000000000L

    .line 20
    const-wide v5, -0x3fa9800000000000L

    .line 10
    const-wide v3, 0x4066800000000000L

    .line 40
    const-wide v1, -0x3f99800000000000L

    .line 24
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v9}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whatsapp/z9;->iterator()Ljava/util/Iterator;

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

    if-eqz v1, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/fy;

    .line 13
    iget-wide v12, v1, Lcom/whatsapp/fy;->e:D

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    .line 31
    iget-wide v12, v1, Lcom/whatsapp/fy;->e:D

    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    .line 54
    iget-wide v12, v1, Lcom/whatsapp/fy;->f:D

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    .line 46
    iget-wide v12, v1, Lcom/whatsapp/fy;->f:D

    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    if-eqz v10, :cond_7

    .line 27
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

    .line 17
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v11}, Lcom/whatsapp/LocationPicker;->e(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/GoogleMapView;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v11

    invoke-virtual {v11, v3}, Lcom/google/android/maps/MapController;->setCenter(Lcom/google/android/maps/GeoPoint;)V

    .line 15
    sub-double/2addr v6, v8

    const-wide v8, 0x3ff3333333333333L

    mul-double/2addr v6, v8

    const-wide v8, 0x412e848000000000L

    mul-double/2addr v6, v8

    double-to-int v3, v6

    .line 4
    sub-double/2addr v1, v4

    const-wide v4, 0x3ff3333333333333L

    mul-double/2addr v1, v4

    const-wide v4, 0x412e848000000000L

    mul-double/2addr v1, v4

    double-to-int v1, v1

    .line 38
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v2}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/z9;->size()I

    move-result v2

    const/4 v4, 0x1

    if-gt v2, v4, :cond_5

    .line 47
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v2}, Lcom/whatsapp/LocationPicker;->e(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/GoogleMapView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v2

    const/16 v4, 0x12

    invoke-virtual {v2, v4}, Lcom/google/android/maps/MapController;->setZoom(I)I

    if-eqz v10, :cond_6

    .line 39
    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whatsapp/jb;->e:Lcom/whatsapp/LocationPicker;

    invoke-static {v2}, Lcom/whatsapp/LocationPicker;->e(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/GoogleMapView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Lcom/google/android/maps/MapController;->zoomToSpan(II)V

    .line 42
    :cond_6
    return-void

    :cond_7
    move-wide v2, v1

    goto/16 :goto_0

    :cond_8
    move-wide v1, v2

    goto :goto_1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 21
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/jb;->a([Ljava/lang/Void;)Lcom/whatsapp/z9;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 28
    check-cast p1, Lcom/whatsapp/z9;

    invoke-virtual {p0, p1}, Lcom/whatsapp/jb;->a(Lcom/whatsapp/z9;)V

    return-void
.end method
