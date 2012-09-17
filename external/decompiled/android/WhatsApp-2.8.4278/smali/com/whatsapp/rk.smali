.class Lcom/whatsapp/rk;
.super Ljava/lang/Object;
.source "rk.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/ContactPickerHelp;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPickerHelp;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/rk;->a:Lcom/whatsapp/ContactPickerHelp;

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
    iget-object v0, p0, Lcom/whatsapp/rk;->a:Lcom/whatsapp/ContactPickerHelp;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->removeDialog(I)V

    .line 1
    return-void
.end method
