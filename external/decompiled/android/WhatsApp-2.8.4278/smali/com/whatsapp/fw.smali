.class Lcom/whatsapp/fw;
.super Ljava/lang/Object;
.source "fw.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final a:Lcom/whatsapp/LocationPickerPopup;


# direct methods
.method constructor <init>(Lcom/whatsapp/LocationPickerPopup;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/fw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/fw;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-virtual {v0}, Lcom/whatsapp/LocationPickerPopup;->finish()V

    .line 2
    return-void
.end method
