.class Lcom/whatsapp/cw;
.super Ljava/lang/Object;
.source "cw.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/LocationPickerPopup;


# direct methods
.method constructor <init>(Lcom/whatsapp/LocationPickerPopup;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/cw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/cw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/cw;->a:Lcom/whatsapp/LocationPickerPopup;

    iget-object v1, p0, Lcom/whatsapp/cw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)V

    .line 2
    :cond_0
    return-void
.end method
