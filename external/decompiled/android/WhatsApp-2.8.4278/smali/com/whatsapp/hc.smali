.class Lcom/whatsapp/hc;
.super Landroid/os/AsyncTask;
.source "hc.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/List",
        "<",
        "Lcom/whatsapp/w7;",
        ">;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/whatsapp/te;


# direct methods
.method constructor <init>(Lcom/whatsapp/te;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/util/List;
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/w7;",
            ">;"
        }
    .end annotation

    .prologue
    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, v0, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0}, Lcom/whatsapp/WebImagePicker;->l(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/d8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/d8;->b()Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 15
    :goto_0
    return-object v0

    .line 18
    :catch_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 15
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 6
    :catch_1
    move-exception v0

    .line 10
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected a(Ljava/util/List;)V
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/w7;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 16
    iget-object v3, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, v0, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0}, Lcom/whatsapp/WebImagePicker;->l(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/d8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/d8;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, v0, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0}, Lcom/whatsapp/WebImagePicker;->b(Lcom/whatsapp/WebImagePicker;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v4, 0x64

    if-ge v0, v4, :cond_3

    move v0, v1

    :goto_0
    invoke-static {v3, v0}, Lcom/whatsapp/te;->a(Lcom/whatsapp/te;Z)Z

    .line 19
    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lcom/whatsapp/te;->a(Lcom/whatsapp/te;Lcom/whatsapp/hc;)Lcom/whatsapp/hc;

    .line 13
    if-eqz p1, :cond_0

    .line 12
    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, v0, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0}, Lcom/whatsapp/WebImagePicker;->b(Lcom/whatsapp/WebImagePicker;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, v0, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v0}, Lcom/whatsapp/WebImagePicker;->b(Lcom/whatsapp/WebImagePicker;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v0, v0, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-virtual {v0}, Lcom/whatsapp/WebImagePicker;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getEmptyView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 17
    if-nez p1, :cond_1

    .line 5
    const v3, 0x7f09018a

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v3, :cond_2

    .line 11
    :cond_1
    iget-object v3, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v3, v3, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    const v4, 0x7f090189

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    iget-object v5, v5, Lcom/whatsapp/te;->c:Lcom/whatsapp/WebImagePicker;

    invoke-static {v5}, Lcom/whatsapp/WebImagePicker;->l(Lcom/whatsapp/WebImagePicker;)Lcom/whatsapp/d8;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whatsapp/d8;->d()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v2

    invoke-virtual {v3, v4, v1}, Lcom/whatsapp/WebImagePicker;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/hc;->a:Lcom/whatsapp/te;

    invoke-virtual {v0}, Lcom/whatsapp/te;->notifyDataSetChanged()V

    .line 3
    return-void

    :cond_3
    move v0, v2

    .line 16
    goto :goto_0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 14
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/hc;->a([Ljava/lang/Void;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 20
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/whatsapp/hc;->a(Ljava/util/List;)V

    return-void
.end method
