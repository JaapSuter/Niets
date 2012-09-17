.class public Lcom/whatsapp/hf;
.super Lcom/google/android/maps/MyLocationOverlay;
.source "hf.java"


# instance fields
.field private a:Landroid/graphics/Point;

.field private b:Landroid/graphics/Point;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Lcom/google/android/maps/MyLocationOverlay;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    .line 40
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    .line 20
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/hf;->b:Landroid/graphics/Point;

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203e1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/hf;->d:Landroid/graphics/drawable/Drawable;

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203e2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/hf;->e:Landroid/graphics/drawable/Drawable;

    .line 18
    iget-object v0, p0, Lcom/whatsapp/hf;->d:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    .line 38
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    .line 2
    iget-object v0, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 33
    iget-object v0, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    const/high16 v1, 0x4000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    new-instance v0, Lcom/whatsapp/gd;

    invoke-direct {v0, p0, p2}, Lcom/whatsapp/gd;-><init>(Lcom/whatsapp/hf;Lcom/google/android/maps/MapView;)V

    iput-object v0, p0, Lcom/whatsapp/hf;->g:Landroid/os/Handler;

    .line 34
    iget-object v0, p0, Lcom/whatsapp/hf;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 39
    return-void
.end method

.method static a(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .parameter

    .prologue
    .line 37
    iget-object v0, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static a(Lcom/whatsapp/hf;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 10
    iput-object p1, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    return-object p1
.end method

.method static b(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .parameter

    .prologue
    .line 30
    iget-object v0, p0, Lcom/whatsapp/hf;->d:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static c(Lcom/whatsapp/hf;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .parameter

    .prologue
    .line 12
    iget-object v0, p0, Lcom/whatsapp/hf;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method


# virtual methods
.method public disableMyLocation()V
    .locals 2

    .prologue
    .line 8
    invoke-super {p0}, Lcom/google/android/maps/MyLocationOverlay;->disableMyLocation()V

    .line 28
    iget-object v0, p0, Lcom/whatsapp/hf;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 19
    return-void
.end method

.method protected drawMyLocation(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Landroid/location/Location;Lcom/google/android/maps/GeoPoint;J)V
    .locals 14
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 5
    iget-object v1, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v10

    .line 23
    iget-object v1, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v11

    .line 6
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v12

    .line 36
    invoke-virtual/range {p3 .. p3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    .line 3
    invoke-virtual/range {p3 .. p3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    .line 22
    invoke-virtual/range {p3 .. p3}, Landroid/location/Location;->getAccuracy()F

    move-result v13

    .line 1
    const/4 v5, 0x1

    new-array v9, v5, [F

    .line 27
    const-wide/high16 v5, 0x3ff0

    add-double v7, v3, v5

    move-wide v5, v1

    invoke-static/range {v1 .. v9}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    .line 11
    const/4 v5, 0x0

    aget v5, v9, v5

    .line 25
    new-instance v6, Lcom/google/android/maps/GeoPoint;

    const-wide v7, 0x412e848000000000L

    mul-double/2addr v1, v7

    double-to-int v1, v1

    div-float v2, v13, v5

    float-to-double v7, v2

    sub-double v2, v3, v7

    const-wide v4, 0x412e848000000000L

    mul-double/2addr v2, v4

    double-to-int v2, v2

    invoke-direct {v6, v1, v2}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 17
    iget-object v1, p0, Lcom/whatsapp/hf;->b:Landroid/graphics/Point;

    invoke-interface {v12, v6, v1}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 41
    iget-object v1, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    move-object/from16 v0, p4

    invoke-interface {v12, v0, v1}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 32
    iget-object v1, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lcom/whatsapp/hf;->b:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, v2

    .line 24
    iget-object v2, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    const v3, -0x999901

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object v2, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    iget-object v2, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    int-to-float v4, v1

    iget-object v5, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 16
    iget-object v2, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    const v3, 0x186666ff

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    iget-object v2, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 15
    iget-object v2, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    int-to-float v1, v1

    iget-object v4, p0, Lcom/whatsapp/hf;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v1, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 13
    iget-object v1, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    div-int/lit8 v3, v10, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    div-int/lit8 v4, v11, 0x2

    sub-int/2addr v3, v4

    iget-object v4, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    div-int/lit8 v5, v10, 0x2

    add-int/2addr v4, v5

    iget-object v5, p0, Lcom/whatsapp/hf;->a:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    div-int/lit8 v6, v11, 0x2

    add-int/2addr v5, v6

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 9
    iget-object v1, p0, Lcom/whatsapp/hf;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 14
    return-void
.end method
