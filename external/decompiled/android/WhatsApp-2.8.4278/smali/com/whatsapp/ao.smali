.class Lcom/whatsapp/ao;
.super Ljava/lang/Object;
.source "ao.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final a:Lcom/whatsapp/df;


# direct methods
.method constructor <init>(Lcom/whatsapp/df;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    invoke-static {v0}, Lcom/whatsapp/df;->a(Lcom/whatsapp/df;)Lcom/whatsapp/MediaData;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    invoke-static {v0}, Lcom/whatsapp/df;->a(Lcom/whatsapp/df;)Lcom/whatsapp/MediaData;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    iget-object v1, v1, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    invoke-static {v1}, Lcom/whatsapp/App;->a(Lcom/whatsapp/sz;)Ljava/io/File;

    move-result-object v1

    iput-object v1, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    invoke-virtual {v0}, Lcom/whatsapp/df;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    invoke-static {v1}, Lcom/whatsapp/df;->a(Lcom/whatsapp/df;)Lcom/whatsapp/MediaData;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    iget-object v2, p0, Lcom/whatsapp/ao;->a:Lcom/whatsapp/df;

    iget-object v2, v2, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-byte v2, v2, Lcom/whatsapp/sz;->l:B

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/io/File;I)V

    .line 1
    const/4 v0, 0x1

    return v0
.end method
