.class Lcom/whatsapp/fs;
.super Ljava/lang/Object;
.source "fs.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/b;


# direct methods
.method constructor <init>(Lcom/whatsapp/b;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 2
    iget-object v0, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->l:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->l:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iget-object v1, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iget-object v1, v1, Lcom/whatsapp/b;->l:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iget-object v2, v2, Lcom/whatsapp/b;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/b;->a(Landroid/view/ViewGroup;Landroid/content/Context;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->l:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/fs;->a:Lcom/whatsapp/b;

    iput-boolean v3, v0, Lcom/whatsapp/b;->k:Z

    .line 7
    :cond_1
    return-void
.end method
