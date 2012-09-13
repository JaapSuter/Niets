.class Lcom/whatsapp/oi;
.super Ljava/lang/Object;
.source "oi.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMediaPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMediaPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/oi;->a:Lcom/whatsapp/BroadcastMediaPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/oi;->a:Lcom/whatsapp/BroadcastMediaPicker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/BroadcastMediaPicker;->removeDialog(I)V

    .line 2
    return-void
.end method
