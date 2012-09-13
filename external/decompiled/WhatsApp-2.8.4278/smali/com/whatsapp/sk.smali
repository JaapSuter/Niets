.class Lcom/whatsapp/sk;
.super Ljava/lang/Object;
.source "sk.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/z;


# direct methods
.method constructor <init>(Lcom/whatsapp/z;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/sk;->a:Lcom/whatsapp/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/sk;->a:Lcom/whatsapp/z;

    iget-object v0, v0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v1, 0x7f0d008e

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 4
    iget-object v0, p0, Lcom/whatsapp/sk;->a:Lcom/whatsapp/z;

    iget-object v0, v0, Lcom/whatsapp/z;->a:Lcom/whatsapp/ContactPickerHelp;

    const v2, 0x7f0d008d

    invoke-virtual {v0, v2}, Lcom/whatsapp/ContactPickerHelp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    const/4 v2, 0x0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 2
    return-void
.end method
