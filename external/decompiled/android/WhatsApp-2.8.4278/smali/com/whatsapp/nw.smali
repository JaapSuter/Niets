.class Lcom/whatsapp/nw;
.super Ljava/lang/Object;
.source "nw.java"

# interfaces
.implements Landroid/location/LocationListener;


# instance fields
.field final a:Lcom/whatsapp/mb;


# direct methods
.method constructor <init>(Lcom/whatsapp/mb;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/nw;->a:Lcom/whatsapp/mb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/nw;->a:Lcom/whatsapp/mb;

    iput-object p1, v0, Lcom/whatsapp/mb;->m:Landroid/location/Location;

    .line 4
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    return-void
.end method
