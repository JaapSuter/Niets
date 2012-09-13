.class public Lcom/whatsapp/c;
.super Landroid/app/Dialog;
.source "c.java"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 5
    const v0, 0x7f0c0015

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 7
    iput p2, p0, Lcom/whatsapp/c;->a:I

    .line 6
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .parameter

    .prologue
    const/4 v1, -0x1

    .line 4
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget v0, p0, Lcom/whatsapp/c;->a:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/c;->setContentView(I)V

    .line 1
    invoke-virtual {p0}, Lcom/whatsapp/c;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 3
    return-void
.end method
