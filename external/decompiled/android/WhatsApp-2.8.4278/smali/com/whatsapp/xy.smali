.class Lcom/whatsapp/xy;
.super Ljava/lang/Object;
.source "xy.java"

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
    iput-object p1, p0, Lcom/whatsapp/xy;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/xy;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->j(Lcom/whatsapp/PopupNotification;)V

    .line 2
    return-void
.end method
