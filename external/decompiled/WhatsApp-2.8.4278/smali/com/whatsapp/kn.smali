.class Lcom/whatsapp/kn;
.super Ljava/lang/Object;
.source "kn.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Ljava/util/ArrayList;

.field final b:Lcom/whatsapp/t8;


# direct methods
.method constructor <init>(Lcom/whatsapp/t8;Ljava/util/ArrayList;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iput-object p2, p0, Lcom/whatsapp/kn;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iget-object v0, v0, Lcom/whatsapp/t8;->d:Landroid/app/Activity;

    iget-object v1, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iget v1, v1, Lcom/whatsapp/t8;->e:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/kn;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iget-object v0, v0, Lcom/whatsapp/t8;->d:Landroid/app/Activity;

    iget-object v1, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iget-object v1, v1, Lcom/whatsapp/t8;->a:Lcom/whatsapp/zq;

    iget-object v2, p0, Lcom/whatsapp/kn;->a:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lcom/whatsapp/gp;->a(Landroid/app/Activity;Lcom/whatsapp/zq;Ljava/util/ArrayList;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iget-object v0, v0, Lcom/whatsapp/t8;->d:Landroid/app/Activity;

    iget-object v1, p0, Lcom/whatsapp/kn;->b:Lcom/whatsapp/t8;

    iget v1, v1, Lcom/whatsapp/t8;->f:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->showDialog(I)V

    .line 5
    :cond_1
    return-void
.end method
