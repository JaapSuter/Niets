.class Lcom/whatsapp/vd;
.super Landroid/os/Handler;
.source "vd.java"


# instance fields
.field final a:Lcom/whatsapp/ViewProfilePhoto;


# direct methods
.method constructor <init>(Lcom/whatsapp/ViewProfilePhoto;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/vd;->a:Lcom/whatsapp/ViewProfilePhoto;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    .line 2
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-object v0, p0, Lcom/whatsapp/vd;->a:Lcom/whatsapp/ViewProfilePhoto;

    invoke-static {v0}, Lcom/whatsapp/ViewProfilePhoto;->a(Lcom/whatsapp/ViewProfilePhoto;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f090182

    :goto_0
    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/vd;->a:Lcom/whatsapp/ViewProfilePhoto;

    const v1, 0x7f0d005c

    invoke-virtual {v0, v1}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    return-void

    .line 2
    :cond_0
    const v0, 0x7f090183

    goto :goto_0
.end method
