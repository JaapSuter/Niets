.class Lcom/whatsapp/rj;
.super Ljava/lang/Object;
.source "rj.java"


# instance fields
.field private a:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Lcom/whatsapp/sj;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lcom/whatsapp/pj;


# direct methods
.method constructor <init>(Lcom/whatsapp/pj;)V
    .locals 1
    .parameter

    .prologue
    .line 8
    iput-object p1, p0, Lcom/whatsapp/rj;->b:Lcom/whatsapp/pj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/rj;->a:Ljava/util/Stack;

    return-void
.end method

.method static a(Lcom/whatsapp/rj;)Ljava/util/Stack;
    .locals 1
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/rj;->a:Ljava/util/Stack;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;)V
    .locals 3
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 4
    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/rj;->a:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/whatsapp/rj;->a:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sj;

    iget-object v0, v0, Lcom/whatsapp/sj;->b:Landroid/widget/ImageView;

    if-ne v0, p1, :cond_1

    .line 7
    iget-object v0, p0, Lcom/whatsapp/rj;->a:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->remove(I)Ljava/lang/Object;

    if-eqz v2, :cond_0

    .line 3
    :cond_1
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_3

    .line 1
    :cond_2
    return-void

    :cond_3
    move v1, v0

    goto :goto_0
.end method
