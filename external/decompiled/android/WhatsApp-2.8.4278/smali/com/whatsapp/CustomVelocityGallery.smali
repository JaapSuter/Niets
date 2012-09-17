.class public Lcom/whatsapp/CustomVelocityGallery;
.super Landroid/widget/Gallery;
.source "CustomVelocityGallery.java"


# instance fields
.field private adVelocity:Lcom/whatsapp/pp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    invoke-direct {p0, p1, p2}, Landroid/widget/Gallery;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/pp;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/CustomVelocityGallery;->adVelocity:Lcom/whatsapp/pp;

    .line 7
    return-void
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/CustomVelocityGallery;->adVelocity:Lcom/whatsapp/pp;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/CustomVelocityGallery;->adVelocity:Lcom/whatsapp/pp;

    invoke-interface {v0, p3}, Lcom/whatsapp/pp;->a(F)F

    move-result p3

    .line 2
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Gallery;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    return v0
.end method
