.class Lcom/whatsapp/fz;
.super Ljava/lang/Object;
.source "fz.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/ProfileInfoActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/ProfileInfoActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/fz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x4

    .line 3
    iget-object v0, p0, Lcom/whatsapp/fz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v0}, Lcom/whatsapp/ProfileInfoActivity;->b(Lcom/whatsapp/ProfileInfoActivity;)Lcom/whatsapp/zq;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/zq;->p:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/fz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v0}, Lcom/whatsapp/ProfileInfoActivity;->b(Lcom/whatsapp/ProfileInfoActivity;)Lcom/whatsapp/zq;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/whatsapp/fz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v0}, Lcom/whatsapp/ProfileInfoActivity;->c(Lcom/whatsapp/ProfileInfoActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/fz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v0}, Lcom/whatsapp/ProfileInfoActivity;->d(Lcom/whatsapp/ProfileInfoActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/fz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v0}, Lcom/whatsapp/ProfileInfoActivity;->e(Lcom/whatsapp/ProfileInfoActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 1
    :cond_0
    return-void
.end method
