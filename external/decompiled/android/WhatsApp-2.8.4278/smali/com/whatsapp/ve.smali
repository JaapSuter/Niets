.class Lcom/whatsapp/ve;
.super Landroid/widget/Filter;
.source "ve.java"


# instance fields
.field final a:Lcom/whatsapp/fe;


# direct methods
.method private constructor <init>(Lcom/whatsapp/fe;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/ve;->a:Lcom/whatsapp/fe;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/fe;Lcom/whatsapp/tj;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0, p1}, Lcom/whatsapp/ve;-><init>(Lcom/whatsapp/fe;)V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 1
    .parameter

    .prologue
    .line 4
    new-instance v0, Landroid/widget/Filter$FilterResults;

    invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 5
    return-object v0
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ve;->a:Lcom/whatsapp/fe;

    iget-object v0, v0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/ContactPicker;->a(Lcom/whatsapp/ContactPicker;Ljava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ve;->a:Lcom/whatsapp/fe;

    iget-object v0, v0, Lcom/whatsapp/fe;->d:Lcom/whatsapp/ContactPicker;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/ContactPicker;->a(Lcom/whatsapp/ContactPicker;Ljava/lang/String;)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/ve;->a:Lcom/whatsapp/fe;

    invoke-virtual {v0}, Lcom/whatsapp/fe;->notifyDataSetChanged()V

    .line 7
    return-void
.end method
