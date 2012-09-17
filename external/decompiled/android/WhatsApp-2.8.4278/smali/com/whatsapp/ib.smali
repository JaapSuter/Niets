.class public Lcom/whatsapp/ib;
.super Landroid/os/AsyncTask;
.source "ib.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field final c:Lcom/whatsapp/DescribeProblemActivity;


# direct methods
.method protected constructor <init>(Lcom/whatsapp/DescribeProblemActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 13
    iput-object p1, p0, Lcom/whatsapp/ib;->c:Lcom/whatsapp/DescribeProblemActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 1
    iput-object p2, p0, Lcom/whatsapp/ib;->a:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/whatsapp/ib;->b:Ljava/lang/String;

    .line 5
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .parameter

    .prologue
    .line 9
    invoke-static {}, Lcom/whatsapp/g5;->b()Z

    .line 14
    invoke-static {}, Lcom/whatsapp/g5;->c()Ljava/io/File;

    .line 3
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 4
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/ib;->c:Lcom/whatsapp/DescribeProblemActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/DescribeProblemActivity;->removeDialog(I)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/ib;->c:Lcom/whatsapp/DescribeProblemActivity;

    iget-object v1, p0, Lcom/whatsapp/ib;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/ib;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/ib;->c:Lcom/whatsapp/DescribeProblemActivity;

    invoke-static {v3}, Lcom/whatsapp/DescribeProblemActivity;->d(Lcom/whatsapp/DescribeProblemActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/whatsapp/ds;->a(Lcom/whatsapp/DialogToastActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 10
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ib;->a([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ib;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/ib;->c:Lcom/whatsapp/DescribeProblemActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/DescribeProblemActivity;->showDialog(I)V

    .line 2
    return-void
.end method
