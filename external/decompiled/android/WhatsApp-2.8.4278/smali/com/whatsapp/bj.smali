.class Lcom/whatsapp/bj;
.super Ljava/lang/Object;
.source "bj.java"


# instance fields
.field a:Z

.field final b:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 1
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/bj;->a:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 21
    iget-boolean v0, p0, Lcom/whatsapp/bj;->a:Z

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->showDialog(I)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->a(Lcom/whatsapp/BroadcastMessageComposer;)V

    .line 16
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    const v1, 0x7f0d005c

    invoke-virtual {v0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 18
    return-void
.end method

.method public a(Lcom/whatsapp/sz;)V
    .locals 8
    .parameter

    .prologue
    const v7, 0x7f0d0058

    const/16 v6, 0x3c

    const/4 v5, 0x5

    const/4 v4, 0x0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    if-eq v0, v5, :cond_2

    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    iget-wide v2, p1, Lcom/whatsapp/sz;->m:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    invoke-static {v1, v4, v0}, Lcom/whatsapp/BroadcastMessageComposer;->a(Lcom/whatsapp/BroadcastMessageComposer;ZLjava/lang/Long;)V

    .line 3
    sput-object p1, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 15
    iget-byte v0, p1, Lcom/whatsapp/sz;->l:B

    if-ne v0, v5, :cond_1

    .line 7
    iget-object v0, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-virtual {v0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 17
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v2}, Lcom/whatsapp/BroadcastMessageComposer;->f(Lcom/whatsapp/BroadcastMessageComposer;)F

    move-result v2

    const/high16 v3, 0x3f80

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    .line 19
    iput v6, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 24
    iput v6, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    :cond_0
    iget v0, p1, Lcom/whatsapp/sz;->h:I

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 20
    :goto_1
    array-length v1, v0

    invoke-static {v0, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 22
    iget-object v0, p0, Lcom/whatsapp/bj;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-virtual {v0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1
    :cond_1
    return-void

    .line 4
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {p1}, Lcom/whatsapp/sz;->c()[B

    move-result-object v0

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0
    .parameter

    .prologue
    .line 10
    iput-boolean p1, p0, Lcom/whatsapp/bj;->a:Z

    .line 11
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 12
    iget-boolean v0, p0, Lcom/whatsapp/bj;->a:Z

    return v0
.end method
