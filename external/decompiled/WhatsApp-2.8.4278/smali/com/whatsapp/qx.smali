.class Lcom/whatsapp/qx;
.super Ljava/lang/Object;
.source "qx.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/MultipleContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/MultipleContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/qx;->a:Lcom/whatsapp/MultipleContactPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/qx;->a:Lcom/whatsapp/MultipleContactPicker;

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Lcom/whatsapp/MultipleContactPicker;->removeDialog(I)V

    .line 1
    return-void
.end method
