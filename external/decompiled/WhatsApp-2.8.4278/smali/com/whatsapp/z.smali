.class public Lcom/whatsapp/z;
.super Landroid/os/AsyncTask;
.source "z.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/whatsapp/wp;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/ContactPickerHelp;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u0000MEfr\u0000VCw\u007f\u0013\rXz|\u0014KEdz\u0010KI~vLAIag\u0002V^a3"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/z;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x13

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x63

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x22

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x2b

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x12

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/ContactPickerHelp;)V
    .locals 0
    .parameter

    .prologue
    .line 32
    iput-object p1, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/whatsapp/wp;
    .locals 1
    .parameter

    .prologue
    .line 23
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/whatsapp/tp;->b(I)Lcom/whatsapp/wp;

    move-result-object v0

    .line 4
    return-object v0
.end method

.method protected a(Lcom/whatsapp/wp;)V
    .locals 7
    .parameter

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 18
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    invoke-virtual {v0, v4}, Lcom/whatsapp/ContactPickerHelp;->removeDialog(I)V

    .line 37
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iput-object p1, v0, Lcom/whatsapp/ContactPickerHelp;->i:Lcom/whatsapp/wp;

    .line 25
    if-eqz p1, :cond_4

    .line 8
    iget v0, p1, Lcom/whatsapp/wp;->a:I

    if-lez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v2, 0x7f0d0091

    invoke-virtual {v0, v2}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/z;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v2, v2, Lcom/whatsapp/ContactPickerHelp;->h:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v2, 0x7f0d0090

    invoke-virtual {v0, v2}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v2, 0x7f0d0093

    invoke-virtual {v0, v2}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v0, v0, Lcom/whatsapp/ContactPickerHelp;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v0, v0, Lcom/whatsapp/ContactPickerHelp;->g:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v3, 0x7f0902ba

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p1, Lcom/whatsapp/wp;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/ContactPickerHelp;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    invoke-virtual {v0}, Lcom/whatsapp/ContactPickerHelp;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setVisibility(I)V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v0, v0, Lcom/whatsapp/ContactPickerHelp;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 35
    iget-object v0, p1, Lcom/whatsapp/wp;->b:Ljava/util/ArrayList;

    new-instance v2, Lcom/whatsapp/ej;

    invoke-direct {v2}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 20
    iget-object v0, p1, Lcom/whatsapp/wp;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 29
    iget-object v3, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v3, v3, Lcom/whatsapp/ContactPickerHelp;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_1

    .line 31
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v0, v0, Lcom/whatsapp/ContactPickerHelp;->j:Lcom/whatsapp/ge;

    invoke-virtual {v0}, Lcom/whatsapp/ge;->notifyDataSetChanged()V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    invoke-virtual {v0}, Lcom/whatsapp/ContactPickerHelp;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 28
    iget v3, p1, Lcom/whatsapp/wp;->a:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    invoke-virtual {v4}, Lcom/whatsapp/ContactPickerHelp;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0a002e

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    mul-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 27
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1
    iget v0, p1, Lcom/whatsapp/wp;->a:I

    if-lez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v2, 0x7f0d008d

    invoke-virtual {v0, v2}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    .line 14
    new-instance v2, Lcom/whatsapp/sk;

    invoke-direct {v2, p0}, Lcom/whatsapp/sk;-><init>(Lcom/whatsapp/z;)V

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    .line 3
    :cond_3
    if-eqz v1, :cond_5

    .line 30
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v1, 0x7f0902bc

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->a(I)V

    .line 19
    :cond_5
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 16
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/z;->a([Ljava/lang/String;)Lcom/whatsapp/wp;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 10
    check-cast p1, Lcom/whatsapp/wp;

    invoke-virtual {p0, p1}, Lcom/whatsapp/z;->a(Lcom/whatsapp/wp;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/16 v2, 0x8

    .line 5
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->showDialog(I)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    iget-object v0, v0, Lcom/whatsapp/ContactPickerHelp;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    invoke-virtual {v0}, Lcom/whatsapp/ContactPickerHelp;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v1, 0x7f0d0091

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v1, 0x7f0d0090

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 34
    iget-object v0, p0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v1, 0x7f0d0093

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    return-void
.end method
