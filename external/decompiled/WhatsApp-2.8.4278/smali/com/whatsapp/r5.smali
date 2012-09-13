.class Lcom/whatsapp/r5;
.super Ljava/lang/Object;
.source "r5.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Landroid/widget/ImageView;

.field private c:Ljava/lang/String;

.field final d:Lcom/whatsapp/q5;


# direct methods
.method public constructor <init>(Lcom/whatsapp/q5;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/r5;->d:Lcom/whatsapp/q5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p2, p0, Lcom/whatsapp/r5;->a:Landroid/graphics/Bitmap;

    .line 11
    iput-object p3, p0, Lcom/whatsapp/r5;->b:Landroid/widget/ImageView;

    .line 10
    iput-object p4, p0, Lcom/whatsapp/r5;->c:Ljava/lang/String;

    .line 5
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    sget v0, Lcom/whatsapp/g5;->n:I

    .line 12
    iget-object v1, p0, Lcom/whatsapp/r5;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/whatsapp/r5;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/r5;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    iget-object v1, p0, Lcom/whatsapp/r5;->a:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/r5;->b:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/whatsapp/r5;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v0, :cond_2

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/r5;->d:Lcom/whatsapp/q5;

    invoke-static {v1}, Lcom/whatsapp/q5;->b(Lcom/whatsapp/q5;)I

    move-result v1

    if-eqz v1, :cond_1

    .line 1
    iget-object v1, p0, Lcom/whatsapp/r5;->b:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/whatsapp/r5;->d:Lcom/whatsapp/q5;

    invoke-static {v2}, Lcom/whatsapp/q5;->b(Lcom/whatsapp/q5;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v0, :cond_2

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/r5;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    :cond_2
    return-void
.end method
