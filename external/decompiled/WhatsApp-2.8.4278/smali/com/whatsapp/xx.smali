.class Lcom/whatsapp/xx;
.super Ljava/lang/Object;
.source "xx.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/OverlayAlert;


# direct methods
.method constructor <init>(Lcom/whatsapp/OverlayAlert;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/xx;->a:Lcom/whatsapp/OverlayAlert;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/xx;->a:Lcom/whatsapp/OverlayAlert;

    invoke-virtual {v0}, Lcom/whatsapp/OverlayAlert;->finish()V

    .line 3
    return-void
.end method
