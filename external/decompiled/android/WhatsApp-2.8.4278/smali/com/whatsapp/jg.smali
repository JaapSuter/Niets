.class Lcom/whatsapp/jg;
.super Ljava/lang/Object;
.source "jg.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Advanced;


# direct methods
.method constructor <init>(Lcom/whatsapp/Advanced;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/jg;->a:Lcom/whatsapp/Advanced;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/jg;->a:Lcom/whatsapp/Advanced;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V

    .line 1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/whatsapp/jg;->a:Lcom/whatsapp/Advanced;

    const-class v2, Lcom/whatsapp/EULA;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    iget-object v1, p0, Lcom/whatsapp/jg;->a:Lcom/whatsapp/Advanced;

    invoke-virtual {v1}, Lcom/whatsapp/Advanced;->finish()V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/jg;->a:Lcom/whatsapp/Advanced;

    invoke-virtual {v1, v0}, Lcom/whatsapp/Advanced;->startActivity(Landroid/content/Intent;)V

    .line 6
    return-void
.end method
