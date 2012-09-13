.class Lcom/whatsapp/es;
.super Ljava/lang/Object;
.source "es.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/b;


# direct methods
.method constructor <init>(Lcom/whatsapp/b;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/es;->a:Lcom/whatsapp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/es;->a:Lcom/whatsapp/b;

    invoke-static {v0}, Lcom/whatsapp/b;->a(Lcom/whatsapp/b;)V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/es;->a:Lcom/whatsapp/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/b;->a(Lcom/whatsapp/b;Z)Z

    .line 6
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/b;->b:Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/whatsapp/es;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->d:Landroid/app/Activity;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/app/Activity;->removeDialog(I)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/es;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/method/TextKeyListener;->clear(Landroid/text/Editable;)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/es;->a:Lcom/whatsapp/b;

    invoke-virtual {v0}, Lcom/whatsapp/b;->dismiss()V

    .line 2
    return-void
.end method
