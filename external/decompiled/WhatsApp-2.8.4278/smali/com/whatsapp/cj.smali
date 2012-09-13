.class Lcom/whatsapp/cj;
.super Ljava/lang/Object;
.source "cj.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final a:Lcom/whatsapp/le;


# direct methods
.method constructor <init>(Lcom/whatsapp/le;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/cj;->a:Lcom/whatsapp/le;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 2
    const/4 v0, 0x1

    return v0
.end method
