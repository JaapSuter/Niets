.class Lcom/whatsapp/wj;
.super Ljava/lang/Object;
.source "wj.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/ContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/wj;->a:Lcom/whatsapp/ContactPicker;

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
    iget-object v0, p0, Lcom/whatsapp/wj;->a:Lcom/whatsapp/ContactPicker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPicker;->removeDialog(I)V

    .line 3
    return-void
.end method