.class Lcom/whatsapp/yj;
.super Ljava/lang/Object;
.source "yj.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/ContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/yj;->a:Lcom/whatsapp/ContactPicker;

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
    iget-object v0, p0, Lcom/whatsapp/yj;->a:Lcom/whatsapp/ContactPicker;

    iget-object v1, p0, Lcom/whatsapp/yj;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->s(Lcom/whatsapp/ContactPicker;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPicker;->startActivity(Landroid/content/Intent;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/yj;->a:Lcom/whatsapp/ContactPicker;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPicker;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/yj;->a:Lcom/whatsapp/ContactPicker;

    invoke-virtual {v0}, Lcom/whatsapp/ContactPicker;->finish()V

    .line 4
    return-void
.end method
