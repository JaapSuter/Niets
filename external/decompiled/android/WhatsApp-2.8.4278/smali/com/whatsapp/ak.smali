.class Lcom/whatsapp/ak;
.super Ljava/lang/Object;
.source "ak.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final a:Lcom/whatsapp/ContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/ak;->a:Lcom/whatsapp/ContactPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/ak;->a:Lcom/whatsapp/ContactPicker;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPicker;->removeDialog(I)V

    .line 1
    return-void
.end method
