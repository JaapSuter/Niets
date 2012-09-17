.class Lcom/whatsapp/dw;
.super Ljava/lang/Object;
.source "dw.java"

# interfaces
.implements Landroid/location/LocationListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/LocationPickerPopup;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v2, 0x79

    const/16 v1, 0x60

    const/16 v3, 0x5a

    const/16 v4, 0x1d

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001c\u0010\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v8, 0x1

    const-string v0, "\u0015\u0005\r-r\t\u000b"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/dw;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x7b

    goto :goto_2

    :pswitch_1
    move v0, v1

    goto :goto_2

    :pswitch_2
    move v0, v2

    goto :goto_2

    :pswitch_3
    move v0, v3

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x7b

    goto :goto_3

    :pswitch_5
    move v0, v1

    goto :goto_3

    :pswitch_6
    move v0, v2

    goto :goto_3

    :pswitch_7
    move v0, v3

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/LocationPickerPopup;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 5
    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v1

    if-nez v1, :cond_3

    .line 6
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    const/high16 v2, 0x4348

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    .line 1
    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->d(Lcom/whatsapp/LocationPickerPopup;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->c(Lcom/whatsapp/LocationPickerPopup;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1, p1}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)V

    if-eqz v0, :cond_3

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v1

    if-nez v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1, p1}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)Landroid/location/Location;

    if-eqz v0, :cond_3

    .line 4
    :cond_1
    sget-object v1, Lcom/whatsapp/dw;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 15
    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1, p1}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)Landroid/location/Location;

    if-eqz v0, :cond_3

    .line 2
    :cond_2
    sget-object v0, Lcom/whatsapp/dw;->z:[Ljava/lang/String;

    aget-object v0, v0, v3

    iget-object v1, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v1}, Lcom/whatsapp/LocationPickerPopup;->a(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whatsapp/dw;->z:[Ljava/lang/String;

    aget-object v0, v0, v3

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14
    iget-object v0, p0, Lcom/whatsapp/dw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0, p1}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)Landroid/location/Location;

    .line 7
    :cond_3
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 10
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
    .line 11
    return-void
.end method
