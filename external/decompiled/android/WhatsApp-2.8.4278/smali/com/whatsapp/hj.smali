.class Lcom/whatsapp/hj;
.super Ljava/lang/Object;
.source "hj.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final a:Lcom/whatsapp/ContactInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/hj;->a:Lcom/whatsapp/ContactInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 3
    add-int/lit8 v0, p3, -0x1

    .line 2
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/whatsapp/hj;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v1}, Lcom/whatsapp/ContactInfo;->b(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/ee;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/ee;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1
    iget-object v1, p0, Lcom/whatsapp/hj;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v1}, Lcom/whatsapp/ContactInfo;->b(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/ee;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/whatsapp/ee;->a(I)Lcom/whatsapp/zq;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/hj;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whatsapp/ContactInfo;->startActivity(Landroid/content/Intent;)V

    .line 6
    :cond_0
    return-void
.end method
