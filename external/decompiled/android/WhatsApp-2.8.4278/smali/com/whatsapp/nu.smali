.class Lcom/whatsapp/nu;
.super Ljava/lang/Object;
.source "nu.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/mu;


# direct methods
.method constructor <init>(Lcom/whatsapp/mu;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    iget-object v0, v0, Lcom/whatsapp/mu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->b(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/GoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    iget-object v1, v1, Lcom/whatsapp/mu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->a(Lcom/whatsapp/GroupChatMap;)Lcom/google/android/maps/MyLocationOverlay;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/maps/MyLocationOverlay;->getMyLocation()Lcom/google/android/maps/GeoPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    iget-object v0, v0, Lcom/whatsapp/mu;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->b(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/GoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapController;->setZoom(I)I

    .line 5
    iget-object v0, p0, Lcom/whatsapp/nu;->a:Lcom/whatsapp/mu;

    iget-object v0, v0, Lcom/whatsapp/mu;->a:Lcom/whatsapp/GroupChatMap;

    new-instance v1, Lcom/whatsapp/ou;

    invoke-direct {v1, p0}, Lcom/whatsapp/ou;-><init>(Lcom/whatsapp/nu;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatMap;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1
    return-void
.end method
