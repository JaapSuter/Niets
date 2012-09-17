.class public Lcom/whatsapp/Help;
.super Landroid/app/Activity;
.source "Help.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .parameter

    .prologue
    .line 5
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    const v0, 0x7f03003c

    invoke-virtual {p0, v0}, Lcom/whatsapp/Help;->setContentView(I)V

    .line 7
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 6
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/App;->a(Landroid/widget/TextView;)V

    .line 3
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 4
    return-void
.end method
