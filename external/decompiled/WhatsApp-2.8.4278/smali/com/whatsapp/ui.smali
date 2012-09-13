.class Lcom/whatsapp/ui;
.super Ljava/lang/Object;
.source "ui.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/ui;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/ui;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->a(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ui;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ui;->a:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 2
    :cond_0
    return-void
.end method
