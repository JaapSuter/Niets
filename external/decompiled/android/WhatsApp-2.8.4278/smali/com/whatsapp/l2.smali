.class Lcom/whatsapp/l2;
.super Ljava/lang/Object;
.source "l2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/sd;


# direct methods
.method constructor <init>(Lcom/whatsapp/sd;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/l2;->a:Lcom/whatsapp/sd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/l2;->a:Lcom/whatsapp/sd;

    iget-object v0, v0, Lcom/whatsapp/sd;->a:Lcom/whatsapp/SetStatus;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lcom/whatsapp/SetStatus;->showDialog(I)V

    .line 3
    return-void
.end method
