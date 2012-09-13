.class Lcom/whatsapp/qy;
.super Ljava/lang/Object;
.source "qy.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/qy;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter

    .prologue
    .line 1
    sget-object v0, Lcom/whatsapp/App;->oc:Landroid/media/AsyncPlayer;

    invoke-virtual {v0}, Landroid/media/AsyncPlayer;->stop()V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/qy;->a:Lcom/whatsapp/PopupNotification;

    invoke-virtual {v0}, Lcom/whatsapp/PopupNotification;->finish()V

    .line 2
    return-void
.end method
