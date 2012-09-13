.class Lcom/whatsapp/ee;
.super Landroid/widget/ArrayAdapter;
.source "ee.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/whatsapp/zq;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field protected b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lcom/whatsapp/ContactInfo;


# direct methods
.method public constructor <init>(Lcom/whatsapp/ContactInfo;Landroid/content/Context;I)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/ee;->c:Lcom/whatsapp/ContactInfo;

    .line 30
    const/4 v0, 0x0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, p2, p3, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 7
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ee;->a:Landroid/view/LayoutInflater;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/ee;->b:Ljava/util/List;

    .line 21
    return-void
.end method


# virtual methods
.method public a(I)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/ee;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    return-object v0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    iput-object p1, p0, Lcom/whatsapp/ee;->b:Ljava/util/List;

    .line 28
    invoke-virtual {p0}, Lcom/whatsapp/ee;->notifyDataSetChanged()V

    .line 23
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/whatsapp/ee;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ee;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 29
    invoke-virtual {p0, p1}, Lcom/whatsapp/ee;->a(I)Lcom/whatsapp/zq;

    move-result-object v0

    return-object v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 32
    if-nez p2, :cond_0

    .line 15
    iget-object v0, p0, Lcom/whatsapp/ee;->a:Landroid/view/LayoutInflater;

    const v1, 0x7f03004c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v3, :cond_6

    .line 2
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lcom/whatsapp/ee;->a(I)Lcom/whatsapp/zq;

    move-result-object v4

    .line 18
    const v0, 0x7f0d014d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 12
    const v1, 0x7f0d014e

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 27
    invoke-virtual {v4}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/whatsapp/ee;->c:Lcom/whatsapp/ContactInfo;

    invoke-static {v2, v5}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    invoke-virtual {v4}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, v4, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    const v0, 0x7f0d00e1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 26
    iget-object v1, p0, Lcom/whatsapp/ee;->c:Lcom/whatsapp/ContactInfo;

    invoke-virtual {v1}, Lcom/whatsapp/ContactInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a0004

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 1
    iget-object v2, p0, Lcom/whatsapp/ee;->c:Lcom/whatsapp/ContactInfo;

    invoke-static {v2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->L:F

    .line 31
    const/4 v5, 0x1

    invoke-virtual {v4, v1, v2, v5}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 11
    if-nez v1, :cond_2

    .line 33
    invoke-virtual {v4}, Lcom/whatsapp/zq;->k()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v3, :cond_3

    .line 14
    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 13
    :cond_3
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    rem-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_4

    .line 6
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz v3, :cond_5

    .line 22
    :cond_4
    const v0, 0x7f020416

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 8
    :cond_5
    return-object p2

    :cond_6
    move-object p2, v0

    goto :goto_0
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 19
    const/4 v0, 0x1

    return v0
.end method
