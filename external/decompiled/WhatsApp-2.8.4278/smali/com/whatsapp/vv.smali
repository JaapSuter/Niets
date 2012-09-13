.class Lcom/whatsapp/vv;
.super Ljava/lang/Object;
.source "vv.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final a:Lcom/whatsapp/LocationPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/LocationPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

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
    .line 6
    iget-object v0, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/z9;->size()I

    move-result v0

    if-lt p3, v0, :cond_1

    .line 2
    :cond_0
    :goto_0
    return-void

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

    iget-object v0, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->g(Lcom/whatsapp/LocationPicker;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

    invoke-static {v0}, Lcom/whatsapp/LocationPicker;->a(Lcom/whatsapp/LocationPicker;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/whatsapp/z9;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/fy;

    invoke-static {v1, v2, v0}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;Lcom/whatsapp/fy;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/vv;->a:Lcom/whatsapp/LocationPicker;

    invoke-virtual {v0}, Lcom/whatsapp/LocationPicker;->finish()V

    goto :goto_0
.end method
