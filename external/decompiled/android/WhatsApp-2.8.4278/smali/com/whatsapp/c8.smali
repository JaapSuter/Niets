.class Lcom/whatsapp/c8;
.super Ljava/lang/Object;
.source "c8.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final a:Lcom/whatsapp/gc;


# direct methods
.method constructor <init>(Lcom/whatsapp/gc;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    invoke-static {v0}, Lcom/whatsapp/gc;->a(Lcom/whatsapp/gc;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    invoke-static {v0}, Lcom/whatsapp/gc;->a(Lcom/whatsapp/gc;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    invoke-static {v0, v2}, Lcom/whatsapp/gc;->a(Lcom/whatsapp/gc;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 4
    iget-object v0, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/gc;->cancel(Z)Z

    .line 1
    iget-object v0, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    iget-object v0, v0, Lcom/whatsapp/gc;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0}, Lcom/whatsapp/WebImagePicker;->e(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/gc;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/whatsapp/c8;->a:Lcom/whatsapp/gc;

    iget-object v0, v0, Lcom/whatsapp/gc;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0, v2}, Lcom/whatsapp/WebImagePicker;->a(Lcom/whatsapp/WebImagePicker;Lcom/whatsapp/gc;)Lcom/whatsapp/gc;

    .line 2
    :cond_1
    return-void
.end method
