.class Lcom/whatsapp/bw;
.super Ljava/lang/Object;
.source "bw.java"

# interfaces
.implements Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;


# instance fields
.field final a:Lcom/whatsapp/LocationPicker;

.field final b:Lcom/whatsapp/gf;


# direct methods
.method constructor <init>(Lcom/whatsapp/gf;Lcom/whatsapp/LocationPicker;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/bw;->b:Lcom/whatsapp/gf;

    iput-object p2, p0, Lcom/whatsapp/bw;->a:Lcom/whatsapp/LocationPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChanged(Lcom/google/android/maps/ItemizedOverlay;Lcom/google/android/maps/OverlayItem;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    if-nez p2, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/bw;->b:Lcom/whatsapp/gf;

    iget-object v0, v0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;Lcom/whatsapp/fy;)Lcom/whatsapp/fy;

    .line 3
    iget-object v0, p0, Lcom/whatsapp/bw;->b:Lcom/whatsapp/gf;

    iget-object v0, v0, Lcom/whatsapp/gf;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->k(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/qe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/qe;->notifyDataSetChanged()V

    .line 4
    :cond_0
    return-void
.end method
