.class Lcom/whatsapp/jr;
.super Ljava/lang/Object;
.source "jr.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/DescribeProblemActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/DescribeProblemActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/jr;->a:Lcom/whatsapp/DescribeProblemActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    .line 3
    new-instance v0, Lcom/whatsapp/ib;

    iget-object v1, p0, Lcom/whatsapp/jr;->a:Lcom/whatsapp/DescribeProblemActivity;

    iget-object v2, p0, Lcom/whatsapp/jr;->a:Lcom/whatsapp/DescribeProblemActivity;

    invoke-static {v2}, Lcom/whatsapp/DescribeProblemActivity;->a(Lcom/whatsapp/DescribeProblemActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/jr;->a:Lcom/whatsapp/DescribeProblemActivity;

    invoke-static {v3}, Lcom/whatsapp/DescribeProblemActivity;->b(Lcom/whatsapp/DescribeProblemActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whatsapp/ib;-><init>(Lcom/whatsapp/DescribeProblemActivity;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ib;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 1
    return-void
.end method
