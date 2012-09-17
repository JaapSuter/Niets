.class Lcom/whatsapp/m2;
.super Ljava/lang/Object;
.source "m2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/td;


# direct methods
.method constructor <init>(Lcom/whatsapp/td;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/m2;->a:Lcom/whatsapp/td;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/m2;->a:Lcom/whatsapp/td;

    iget-object v0, v0, Lcom/whatsapp/td;->a:Lcom/whatsapp/SetStatus;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lcom/whatsapp/SetStatus;->showDialog(I)V

    .line 2
    return-void
.end method
