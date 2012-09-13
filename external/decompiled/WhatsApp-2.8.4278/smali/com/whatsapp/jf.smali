.class Lcom/whatsapp/jf;
.super Lcom/whatsapp/hf;
.source "jf.java"


# instance fields
.field final h:Lcom/whatsapp/LocationPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/LocationPicker;Landroid/content/Context;Lcom/google/android/maps/MapView;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-direct {p0, p2, p3}, Lcom/whatsapp/hf;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x0

    const/high16 v3, 0x4348

    .line 2
    invoke-super {p0, p1}, Lcom/whatsapp/hf;->onLocationChanged(Landroid/location/Location;)V

    .line 1
    if-eqz p1, :cond_3

    .line 6
    iget-object v0, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/z9;->a:Landroid/location/Location;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->b(Lcom/whatsapp/LocationPicker;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_4

    iget-object v0, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/z9;->a:Landroid/location/Location;

    invoke-virtual {v0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    const/high16 v2, 0x447a

    cmpl-float v0, v0, v2

    if-lez v0, :cond_4

    .line 12
    const/4 v0, 0x1

    .line 8
    iget-object v2, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v2, v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;Z)Z

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v1, p1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;Landroid/location/Location;)Landroid/location/Location;

    .line 5
    iget-object v1, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_3

    :cond_0
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    add-long/2addr v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    invoke-static {v1}, Lcom/whatsapp/LocationPicker;->c(Lcom/whatsapp/LocationPicker;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/jf;->h:Lcom/whatsapp/LocationPicker;

    new-instance v2, Lcom/whatsapp/qv;

    invoke-direct {v2, p0, v0, p1}, Lcom/whatsapp/qv;-><init>(Lcom/whatsapp/jf;ZLandroid/location/Location;)V

    invoke-virtual {v1, v2}, Lcom/whatsapp/LocationPicker;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    :cond_3
    return-void

    :cond_4
    move v0, v1

    goto :goto_0
.end method
