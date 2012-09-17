.class Lcom/whatsapp/gf;
.super Lcom/google/android/maps/ItemizedOverlay;
.source "gf.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/maps/ItemizedOverlay",
        "<",
        "Lcom/google/android/maps/OverlayItem;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lcom/whatsapp/LocationPicker;


# direct methods
.method public constructor <init>(Lcom/whatsapp/LocationPicker;)V
    .locals 2
    .parameter

    .prologue
    .line 21
    iput-object p1, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    .line 10
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020419

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/gf;->boundCenter(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/maps/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 3
    new-instance v0, Lcom/whatsapp/bw;

    invoke-direct {v0, p0, p1}, Lcom/whatsapp/bw;-><init>(Lcom/whatsapp/gf;Lcom/whatsapp/LocationPicker;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/gf;->setOnFocusChangeListener(Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;)V

    .line 2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 7
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/gf;->setLastFocusedIndex(I)V

    .line 12
    invoke-virtual {p0}, Lcom/whatsapp/gf;->populate()V

    .line 18
    return-void
.end method

.method protected createItem(I)Lcom/google/android/maps/OverlayItem;
    .locals 7
    .parameter

    .prologue
    const-wide v5, 0x412e848000000000L

    .line 20
    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/z9;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fy;

    .line 25
    new-instance v1, Lcom/google/android/maps/GeoPoint;

    iget-wide v2, v0, Lcom/whatsapp/fy;->e:D

    mul-double/2addr v2, v5

    double-to-int v2, v2

    iget-wide v3, v0, Lcom/whatsapp/fy;->f:D

    mul-double/2addr v3, v5

    double-to-int v0, v3

    invoke-direct {v1, v2, v0}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 16
    new-instance v0, Lcom/google/android/maps/OverlayItem;

    const-string v2, ""

    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/maps/OverlayItem;-><init>(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020419

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/gf;->boundCenter(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/OverlayItem;->setMarker(Landroid/graphics/drawable/Drawable;)V

    .line 15
    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 9
    if-eqz p3, :cond_0

    .line 24
    :goto_0
    return-void

    .line 14
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/maps/ItemizedOverlay;->draw(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Z)V

    goto :goto_0
.end method

.method protected onTap(I)Z
    .locals 2
    .parameter

    .prologue
    .line 5
    iget-object v1, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/z9;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fy;

    invoke-static {v1, v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;Lcom/whatsapp/fy;)Lcom/whatsapp/fy;

    .line 4
    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->k(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/qe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/qe;->notifyDataSetChanged()V

    .line 19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 11
    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->n(Lcom/whatsapp/LocationPicker;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->n(Lcom/whatsapp/LocationPicker;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V

    .line 8
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    if-nez v0, :cond_0

    .line 13
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/z9;->size()I

    move-result v0

    goto :goto_0
.end method
