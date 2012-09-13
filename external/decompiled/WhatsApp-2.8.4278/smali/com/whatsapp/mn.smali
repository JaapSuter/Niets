.class Lcom/whatsapp/mn;
.super Ljava/lang/Object;
.source "mn.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final a:Lcom/whatsapp/me;


# direct methods
.method constructor <init>(Lcom/whatsapp/me;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/mn;->a:Lcom/whatsapp/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    const/4 v0, 0x1

    return v0
.end method
