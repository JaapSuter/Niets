.class Lcom/whatsapp/or;
.super Ljava/lang/Object;
.source "or.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/DialogToastListActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/DialogToastListActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/or;->a:Lcom/whatsapp/DialogToastListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/or;->a:Lcom/whatsapp/DialogToastListActivity;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lcom/whatsapp/DialogToastListActivity;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/or;->a:Lcom/whatsapp/DialogToastListActivity;

    invoke-static {v0}, Lcom/whatsapp/DialogToastListActivity;->a(Lcom/whatsapp/DialogToastListActivity;)Lcom/whatsapp/nr;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/or;->a:Lcom/whatsapp/DialogToastListActivity;

    invoke-static {v0}, Lcom/whatsapp/DialogToastListActivity;->a(Lcom/whatsapp/DialogToastListActivity;)Lcom/whatsapp/nr;

    move-result-object v0

    invoke-interface {v0}, Lcom/whatsapp/nr;->a()V

    .line 4
    :cond_0
    return-void
.end method
