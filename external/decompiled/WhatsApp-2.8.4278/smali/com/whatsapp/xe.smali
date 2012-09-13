.class Lcom/whatsapp/xe;
.super Landroid/widget/Filter;
.source "xe.java"


# instance fields
.field final a:Lcom/whatsapp/oe;


# direct methods
.method private constructor <init>(Lcom/whatsapp/oe;)V
    .locals 0
    .parameter

    .prologue
    .line 14
    iput-object p1, p0, Lcom/whatsapp/xe;->a:Lcom/whatsapp/oe;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/oe;Lcom/whatsapp/fd;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 7
    invoke-direct {p0, p1}, Lcom/whatsapp/xe;-><init>(Lcom/whatsapp/oe;)V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 7
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 6
    new-instance v3, Landroid/widget/Filter$FilterResults;

    invoke-direct {v3}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 5
    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 4
    iget-object v0, p0, Lcom/whatsapp/xe;->a:Lcom/whatsapp/oe;

    iget-object v0, v0, Lcom/whatsapp/oe;->c:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1
    invoke-interface {v4}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/xr;

    .line 8
    iget-object v5, v1, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    iget-object v5, v5, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lcom/whatsapp/EditGroupSubject;->u:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 10
    :cond_1
    invoke-interface {v4}, Ljava/util/ListIterator;->remove()V

    .line 3
    :cond_2
    if-eqz v2, :cond_0

    .line 15
    :cond_3
    iput-object v0, v3, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v3, Landroid/widget/Filter$FilterResults;->count:I

    .line 13
    :cond_4
    return-object v3
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v1, p0, Lcom/whatsapp/xe;->a:Lcom/whatsapp/oe;

    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, v1, Lcom/whatsapp/oe;->a:Ljava/util/ArrayList;

    .line 11
    iget-object v0, p0, Lcom/whatsapp/xe;->a:Lcom/whatsapp/oe;

    invoke-virtual {v0}, Lcom/whatsapp/oe;->notifyDataSetChanged()V

    .line 16
    return-void
.end method
