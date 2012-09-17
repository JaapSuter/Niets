.class Lcom/whatsapp/we;
.super Landroid/widget/Filter;
.source "we.java"


# instance fields
.field final a:Lcom/whatsapp/ne;


# direct methods
.method private constructor <init>(Lcom/whatsapp/ne;)V
    .locals 0
    .parameter

    .prologue
    .line 21
    iput-object p1, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/ne;Lcom/whatsapp/u8;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/whatsapp/we;-><init>(Lcom/whatsapp/ne;)V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 6
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    new-instance v3, Landroid/widget/Filter$FilterResults;

    invoke-direct {v3}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 7
    sget-object v1, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    monitor-enter v1

    .line 37
    :try_start_0
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 25
    invoke-interface {v4}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v1

    .line 24
    iget-object v5, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v5, :cond_1

    invoke-virtual {v1}, Lcom/whatsapp/zq;->o()Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_1
    invoke-virtual {v1}, Lcom/whatsapp/zq;->o()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lcom/whatsapp/zq;->p()Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    iget-object v5, v1, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v5, :cond_4

    iget-object v1, v1, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 34
    :cond_3
    invoke-interface {v4}, Ljava/util/ListIterator;->remove()V

    .line 27
    :cond_4
    if-eqz v2, :cond_0

    .line 20
    :cond_5
    iput-object v0, v3, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v3, Landroid/widget/Filter$FilterResults;->count:I

    .line 32
    if-eqz v2, :cond_7

    .line 15
    :cond_6
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    iput-object v0, v3, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 28
    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v3, Landroid/widget/Filter$FilterResults;->count:I

    .line 2
    :cond_7
    return-object v3

    .line 3
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 5
    .parameter
    .parameter

    .prologue
    const v4, 0x7f0d00db

    const/16 v3, 0x8

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 13
    iget v1, p2, Landroid/widget/Filter$FilterResults;->count:I

    if-nez v1, :cond_1

    .line 31
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 1
    iget-object v1, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v1, v1, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v1, v4}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 36
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 35
    iget-object v2, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v2, v2, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-object v2, v2, Lcom/whatsapp/Conversations;->p:Landroid/widget/ListView;

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 29
    iget-object v1, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v1, v1, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    const v2, 0x7f0d00de

    invoke-virtual {v1, v2}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 10
    iget-object v1, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v1, v1, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    const v2, 0x7f0d00dc

    invoke-virtual {v1, v2}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 19
    if-eqz v0, :cond_2

    .line 22
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v1, v1, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v1, v4}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 16
    iget-object v1, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v1, v1, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v1}, Lcom/whatsapp/Conversations;->a()V

    if-eqz v0, :cond_2

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v0, v0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v0, v4}, Lcom/whatsapp/Conversations;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v0, v0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->a()V

    .line 23
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v1, v0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, v1, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    .line 14
    iget-object v0, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v0, v0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    iget-object v0, v0, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    .line 5
    sget-object v1, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    iget-object v2, v0, Lcom/whatsapp/ne;->b:Lcom/whatsapp/Conversations;

    sget-object v0, Lcom/whatsapp/gp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, v2, Lcom/whatsapp/Conversations;->t:Ljava/util/ArrayList;

    .line 9
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/we;->a:Lcom/whatsapp/ne;

    invoke-virtual {v0}, Lcom/whatsapp/ne;->notifyDataSetChanged()V

    .line 18
    return-void

    .line 9
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
