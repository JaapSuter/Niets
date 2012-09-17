.class public Lcom/whatsapp/FixedViewFlipper;
.super Landroid/widget/ViewFlipper;
.source "FixedViewFlipper.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter

    .prologue
    .line 13
    invoke-direct {p0, p1}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;)V

    .line 7
    return-void
.end method


# virtual methods
.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/widget/ViewFlipper;->onDetachedFromWindow()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :goto_0
    invoke-super {p0}, Landroid/widget/ViewFlipper;->stopFlipping()V

    .line 4
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 5
    invoke-super {p0}, Landroid/widget/ViewFlipper;->stopFlipping()V

    goto :goto_0
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1
    .parameter

    .prologue
    .line 3
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/ViewFlipper;->onWindowVisibilityChanged(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :goto_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 12
    invoke-super {p0}, Landroid/widget/ViewFlipper;->stopFlipping()V

    .line 10
    :cond_0
    return-void

    .line 8
    :catch_0
    move-exception v0

    .line 14
    invoke-super {p0}, Landroid/widget/ViewFlipper;->stopFlipping()V

    goto :goto_0
.end method
