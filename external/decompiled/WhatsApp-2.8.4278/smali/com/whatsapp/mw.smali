.class Lcom/whatsapp/mw;
.super Ljava/lang/Object;
.source "mw.java"

# interfaces
.implements Landroid/location/LocationListener;


# instance fields
.field final a:Lcom/whatsapp/mb;


# direct methods
.method constructor <init>(Lcom/whatsapp/mb;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/mw;->a:Lcom/whatsapp/mb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/mw;->a:Lcom/whatsapp/mb;

    iget v1, v0, Lcom/whatsapp/mb;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/whatsapp/mb;->k:I

    .line 4
    iget-object v0, p0, Lcom/whatsapp/mw;->a:Lcom/whatsapp/mb;

    iput-object p1, v0, Lcom/whatsapp/mb;->l:Landroid/location/Location;

    .line 10
    iget-object v0, p0, Lcom/whatsapp/mw;->a:Lcom/whatsapp/mb;

    iget v0, v0, Lcom/whatsapp/mb;->k:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    const/high16 v1, 0x4348

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/mw;->a:Lcom/whatsapp/mb;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/whatsapp/mb;->n:Z

    .line 8
    iget-object v0, p0, Lcom/whatsapp/mw;->a:Lcom/whatsapp/mb;

    const/4 v1, 0x0

    iput v1, v0, Lcom/whatsapp/mb;->k:I

    .line 9
    :cond_1
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    return-void
.end method
