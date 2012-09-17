.class Lcom/whatsapp/s5;
.super Ljava/lang/Object;
.source "s5.java"


# instance fields
.field private a:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Lcom/whatsapp/t5;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lcom/whatsapp/q5;


# direct methods
.method constructor <init>(Lcom/whatsapp/q5;)V
    .locals 1
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/s5;->b:Lcom/whatsapp/q5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/s5;->a:Ljava/util/Stack;

    return-void
.end method

.method static a(Lcom/whatsapp/s5;)Ljava/util/Stack;
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/s5;->a:Ljava/util/Stack;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;)V
    .locals 3
    .parameter

    .prologue
    sget v2, Lcom/whatsapp/g5;->n:I

    .line 8
    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/s5;->a:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1
    iget-object v0, p0, Lcom/whatsapp/s5;->a:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/t5;

    iget-object v0, v0, Lcom/whatsapp/t5;->c:Landroid/widget/ImageView;

    if-ne v0, p1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/whatsapp/s5;->a:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->remove(I)Ljava/lang/Object;

    if-eqz v2, :cond_0

    .line 7
    :cond_1
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_3

    .line 5
    :cond_2
    return-void

    :cond_3
    move v1, v0

    goto :goto_0
.end method
