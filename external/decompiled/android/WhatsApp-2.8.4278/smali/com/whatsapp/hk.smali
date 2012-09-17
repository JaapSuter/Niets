.class Lcom/whatsapp/hk;
.super Ljava/lang/Object;
.source "hk.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final a:Lcom/whatsapp/ContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 9
    iget-object v1, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1, p3}, Lcom/whatsapp/ContactPicker;->b(Lcom/whatsapp/ContactPicker;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    iget-object v2, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1, v2}, Lcom/whatsapp/App;->a(Landroid/app/Activity;Lcom/whatsapp/lr;)V

    if-eqz v0, :cond_2

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1, p3}, Lcom/whatsapp/ContactPicker;->c(Lcom/whatsapp/ContactPicker;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->l(Lcom/whatsapp/ContactPicker;)V

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v0, p3}, Lcom/whatsapp/ContactPicker;->d(Lcom/whatsapp/ContactPicker;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    :cond_2
    :goto_0
    return-void

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    iget-object v1, p0, Lcom/whatsapp/hk;->a:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->i(Lcom/whatsapp/ContactPicker;)Lcom/whatsapp/fe;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/whatsapp/fe;->a(I)Lcom/whatsapp/zq;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/ContactPicker;->a(Lcom/whatsapp/ContactPicker;Lcom/whatsapp/zq;)Z

    goto :goto_0
.end method
