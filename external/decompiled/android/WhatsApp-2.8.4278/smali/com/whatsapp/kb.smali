.class Lcom/whatsapp/kb;
.super Landroid/os/AsyncTask;
.source "kb.java"


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

.field private b:Landroid/graphics/Bitmap;

.field final c:Lcom/whatsapp/LocationPickerPopup;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "s\u000b^\u0014\nm\u0008^\u0014\u000cc\u0011R\u000b\u001ch"

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

    sput-object v0, Lcom/whatsapp/kb;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x55

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x3c

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x5d

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x1b

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x46

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 48
    iput-object p1, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/kb;->b:Landroid/graphics/Bitmap;

    .line 32
    iput-object p2, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    .line 43
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/whatsapp/z9;
    .locals 8
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lcom/whatsapp/mb;->b(DD)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/kb;->b:Landroid/graphics/Bitmap;

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-int v0, v0

    const/16 v2, 0x64

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 35
    invoke-static {}, Lcom/whatsapp/LocationPickerPopup;->a()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    .line 30
    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lcom/whatsapp/z9;->a(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 22
    :try_start_1
    invoke-virtual {v0}, Lcom/whatsapp/z9;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/whatsapp/kb;->z:Ljava/lang/String;

    iget-object v3, v0, Lcom/whatsapp/z9;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/32 v5, 0xdbba00

    add-long/2addr v3, v5

    invoke-static {v3, v4}, Lcom/whatsapp/LocationPickerPopup;->a(J)J

    .line 14
    iget-object v1, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lcom/whatsapp/z9;->b(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 33
    :cond_0
    :goto_0
    return-object v0

    .line 27
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lcom/whatsapp/z9;->b(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_0

    .line 37
    :catch_0
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    .line 15
    :goto_1
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 49
    :catch_1
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    .line 21
    :goto_2
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 49
    :catch_2
    move-exception v1

    goto :goto_2

    .line 37
    :catch_3
    move-exception v1

    goto :goto_1
.end method

.method protected a(Lcom/whatsapp/z9;)V
    .locals 10
    .parameter

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x1

    const/16 v7, 0x8

    const/4 v6, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 7
    invoke-virtual {p0}, Lcom/whatsapp/kb;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_a

    .line 31
    if-eqz p1, :cond_0

    .line 36
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0, p1}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;Lcom/whatsapp/z9;)Lcom/whatsapp/z9;

    .line 4
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    invoke-virtual {v0, v2}, Lcom/whatsapp/z9;->a(Landroid/location/Location;)V

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->hasAccuracy()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->g(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    const v3, 0x7f090192

    new-array v4, v8, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/whatsapp/kb;->a:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getAccuracy()F

    move-result v5

    float-to-int v5, v5

    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/LocationPickerPopup;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->g(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v1, :cond_3

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->g(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v1, :cond_3

    .line 51
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->g(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 45
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/kb;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 39
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->h(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 12
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->K:F

    float-to-int v0, v0

    .line 26
    iget-object v2, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->h(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v0, v0, v0, v0}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 53
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->h(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 16
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->h(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v2, Lcom/whatsapp/o;

    iget-object v3, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    iget-object v4, p0, Lcom/whatsapp/kb;->b:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3, v4}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->h(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/z9;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 28
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->i(Lcom/whatsapp/LocationPickerPopup;)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0d0130

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f090194

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->i(Lcom/whatsapp/LocationPickerPopup;)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0d00e0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 24
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->i(Lcom/whatsapp/LocationPickerPopup;)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0d0131

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 34
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    iget-object v2, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/z9;->h:I

    if-ne v2, v9, :cond_5

    .line 13
    const v2, 0x7f0203fe

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v1, :cond_7

    .line 6
    :cond_5
    iget-object v2, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/z9;->h:I

    if-ne v2, v8, :cond_6

    .line 5
    const v2, 0x7f0203ff

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v1, :cond_7

    .line 29
    :cond_6
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 40
    :cond_7
    if-eqz v1, :cond_9

    .line 47
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->j(Lcom/whatsapp/LocationPickerPopup;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->i(Lcom/whatsapp/LocationPickerPopup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeHeaderView(Landroid/view/View;)Z

    .line 38
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/kb;->c:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->k(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/re;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/re;->notifyDataSetChanged()V

    .line 52
    :cond_a
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 42
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/kb;->a([Ljava/lang/Void;)Lcom/whatsapp/z9;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 25
    check-cast p1, Lcom/whatsapp/z9;

    invoke-virtual {p0, p1}, Lcom/whatsapp/kb;->a(Lcom/whatsapp/z9;)V

    return-void
.end method
