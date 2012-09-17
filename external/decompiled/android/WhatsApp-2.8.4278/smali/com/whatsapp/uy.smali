.class Lcom/whatsapp/uy;
.super Ljava/lang/Object;
.source "uy.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    const v1, 0x7f0d00af

    invoke-virtual {v0, v1}, Lcom/whatsapp/PopupNotification;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 9
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    invoke-static {}, Lcom/whatsapp/App;->mb()V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->c(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/sz;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->d(Lcom/whatsapp/PopupNotification;)Ljava/util/HashSet;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->c(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/sz;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->f(Lcom/whatsapp/PopupNotification;)Ljava/util/HashSet;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/uy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v1}, Lcom/whatsapp/PopupNotification;->e(Lcom/whatsapp/PopupNotification;)Lcom/whatsapp/zq;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_1
    return-void
.end method
