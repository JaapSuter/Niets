.class final Lcom/whatsapp/t;
.super Landroid/os/AsyncTask;
.source "t.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/util/ArrayList",
        "<",
        "Lcom/whatsapp/zq;",
        ">;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/util/ArrayList;)Ljava/lang/Void;
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 7
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->b(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 4
    return-object v2
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    invoke-static {}, Lcom/whatsapp/App;->m()V

    .line 2
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 1
    check-cast p1, [Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/whatsapp/t;->a([Ljava/util/ArrayList;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/t;->a(Ljava/lang/Void;)V

    return-void
.end method
