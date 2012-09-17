.class Lcom/whatsapp/ie;
.super Landroid/widget/ArrayAdapter;
.source "ie.java"


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
.field public a:Landroid/view/LayoutInflater;

.field final b:Lcom/whatsapp/GroupChatInfo;


# direct methods
.method public constructor <init>(Lcom/whatsapp/GroupChatInfo;Landroid/content/Context;ILjava/util/List;)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 40
    iput-object p1, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    .line 46
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ie;->a:Landroid/view/LayoutInflater;

    .line 44
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .prologue
    .line 23
    iget-object v0, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v0, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-boolean v0, v0, Lcom/whatsapp/zq;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .parameter
    .parameter
    .parameter

    .prologue
    const v9, 0x7f080005

    const v8, 0x7f080001

    const/4 v7, 0x1

    const v5, 0x7f0d014d

    const v6, 0x7f0d00e1

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 7
    if-nez p2, :cond_0

    .line 52
    iget-object v0, p0, Lcom/whatsapp/ie;->a:Landroid/view/LayoutInflater;

    const v1, 0x7f03004c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v4, :cond_f

    .line 51
    :cond_0
    :goto_0
    const v0, 0x7f0d00e0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    invoke-virtual {p0}, Lcom/whatsapp/ie;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->t:Lcom/whatsapp/zq;

    iget-boolean v0, v0, Lcom/whatsapp/zq;->k:Z

    if-eqz v0, :cond_6

    .line 17
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 32
    iget-object v1, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    const v2, 0x7f090262

    invoke-virtual {v1, v2}, Lcom/whatsapp/GroupChatInfo;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    sget-boolean v0, Lcom/whatsapp/App;->b:Z

    if-nez v0, :cond_1

    .line 37
    iget-object v0, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v0}, Lcom/whatsapp/GroupChatInfo;->k()V

    if-eqz v4, :cond_3

    .line 48
    :cond_1
    sget-object v0, Lcom/whatsapp/App;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v1}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 31
    const v0, 0x7f0d014e

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez v1, :cond_2

    sget-object v1, Lcom/whatsapp/App;->a:Ljava/lang/String;

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    :cond_3
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v1}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 39
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v1}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-static {v2}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/GroupChatInfo;)I

    move-result v2

    iget-object v3, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-static {v3}, Lcom/whatsapp/GroupChatInfo;->b(Lcom/whatsapp/GroupChatInfo;)F

    move-result v3

    invoke-virtual {v1, v2, v3, v7}, Lcom/whatsapp/ar;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 34
    if-nez v1, :cond_4

    .line 4
    const v2, 0x7f020012

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v4, :cond_5

    .line 47
    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 9
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 25
    if-eqz v4, :cond_c

    .line 14
    :cond_6
    invoke-virtual {p0, p1}, Lcom/whatsapp/ie;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 43
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 30
    const v2, 0x7f0d014e

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 13
    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    iget-object v3, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    iget-object v3, v3, Lcom/whatsapp/GroupChatInfo;->s:Ljava/util/HashMap;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 27
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v5, 0x7f0203c7

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 45
    iget-object v3, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v3}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    iget-object v3, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v3}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    const v3, 0x7f090274

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    if-eqz v4, :cond_b

    .line 41
    :cond_7
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 12
    iget-object v5, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-static {v5}, Lcom/whatsapp/GroupChatInfo;->a(Lcom/whatsapp/GroupChatInfo;)I

    move-result v5

    iget-object v6, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-static {v6}, Lcom/whatsapp/GroupChatInfo;->b(Lcom/whatsapp/GroupChatInfo;)F

    move-result v6

    invoke-virtual {v0, v5, v6, v7}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 29
    if-nez v5, :cond_8

    .line 33
    invoke-virtual {v0}, Lcom/whatsapp/zq;->k()I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v4, :cond_9

    .line 28
    :cond_8
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 3
    :cond_9
    iget-object v3, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v3}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    if-eqz v2, :cond_b

    .line 38
    iget-object v1, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v1}, Lcom/whatsapp/GroupChatInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f080003

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 36
    iget-object v1, v0, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/ie;->b:Lcom/whatsapp/GroupChatInfo;

    invoke-virtual {v3}, Lcom/whatsapp/GroupChatInfo;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 26
    if-nez v1, :cond_a

    .line 24
    iget-object v3, v0, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    if-eqz v4, :cond_b

    .line 15
    :cond_a
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    const/16 v1, 0x30

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 22
    :cond_b
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    :cond_c
    rem-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_d

    .line 5
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz v4, :cond_e

    .line 16
    :cond_d
    const v0, 0x7f020416

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 50
    :cond_e
    return-object p2

    :cond_f
    move-object p2, v0

    goto/16 :goto_0
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x1

    return v0
.end method
