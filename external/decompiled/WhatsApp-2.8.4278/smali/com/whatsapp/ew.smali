.class Lcom/whatsapp/ew;
.super Ljava/lang/Object;
.source "ew.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/LocationPickerPopup;


# direct methods
.method constructor <init>(Lcom/whatsapp/LocationPickerPopup;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 9
    if-nez p2, :cond_1

    .line 5
    iget-object v1, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->e(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    iget-object v2, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->f(Lcom/whatsapp/LocationPickerPopup;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v3}, Lcom/whatsapp/LocationPickerPopup;->e(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;Landroid/location/Location;)V

    if-eqz v0, :cond_2

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    iget-object v2, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->f(Lcom/whatsapp/LocationPickerPopup;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/App;->e(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    add-int/lit8 v1, p2, -0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/z9;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fy;

    .line 6
    iget-object v1, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    iget-object v2, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->f(Lcom/whatsapp/LocationPickerPopup;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;Lcom/whatsapp/fy;)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/ew;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-virtual {v0}, Lcom/whatsapp/LocationPickerPopup;->finish()V

    .line 10
    return-void
.end method
