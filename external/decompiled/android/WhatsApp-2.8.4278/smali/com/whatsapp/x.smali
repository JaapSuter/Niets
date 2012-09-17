.class Lcom/whatsapp/x;
.super Landroid/os/AsyncTask;
.source "x.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/ArrayList",
        "<",
        "Lcom/whatsapp/zq;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "6@"

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

    sput-object v0, Lcom/whatsapp/x;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x79

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x1a

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x60

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x10

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x58

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 11
    iput-object p1, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/x;->b:Ljava/util/ArrayList;

    .line 27
    iput-object p2, p0, Lcom/whatsapp/x;->a:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/util/ArrayList;
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 2
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->e(Lcom/whatsapp/BroadcastMessageComposer;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 33
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->e(Lcom/whatsapp/BroadcastMessageComposer;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 25
    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/x;->b:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v3}, Lcom/whatsapp/BroadcastMessageComposer;->e(Lcom/whatsapp/BroadcastMessageComposer;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 32
    :cond_0
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_2

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/x;->b:Ljava/util/ArrayList;

    return-object v0

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 8
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 23
    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/x;->z:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 10
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 29
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v3, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    const v4, 0x7f090206

    new-array v5, v7, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/BroadcastMessageComposer;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 21
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->e(Lcom/whatsapp/BroadcastMessageComposer;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 6
    iget-object v3, p0, Lcom/whatsapp/x;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    .line 4
    new-instance v3, Lcom/whatsapp/sz;

    iget-object v4, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/whatsapp/x;->a:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v4, v3}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 18
    :cond_4
    sget-object v3, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    if-eqz v3, :cond_5

    .line 5
    iget-object v3, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v3, v0}, Lcom/whatsapp/BroadcastMessageComposer;->a(Lcom/whatsapp/BroadcastMessageComposer;Lcom/whatsapp/zq;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 20
    sget-object v3, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v3, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 16
    :cond_5
    if-eqz v1, :cond_3

    .line 13
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/method/TextKeyListener;->clear(Landroid/text/Editable;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-virtual {v0, v7}, Lcom/whatsapp/BroadcastMessageComposer;->removeDialog(I)V

    .line 28
    iget-object v0, p0, Lcom/whatsapp/x;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-virtual {v0}, Lcom/whatsapp/BroadcastMessageComposer;->finish()V

    .line 14
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 26
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/x;->a([Ljava/lang/Void;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 24
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/whatsapp/x;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onPreExecute()V
    .locals 0

    .prologue
    .line 30
    return-void
.end method
