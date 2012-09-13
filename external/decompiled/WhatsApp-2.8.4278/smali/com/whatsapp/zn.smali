.class Lcom/whatsapp/zn;
.super Ljava/lang/Object;
.source "zn.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/df;


# direct methods
.method constructor <init>(Lcom/whatsapp/df;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/zn;->a:Lcom/whatsapp/df;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/zn;->a:Lcom/whatsapp/df;

    iget-object v1, p0, Lcom/whatsapp/zn;->a:Lcom/whatsapp/df;

    invoke-virtual {v1}, Lcom/whatsapp/df;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/zn;->a:Lcom/whatsapp/df;

    iget-object v2, v2, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/df;->a(Landroid/content/Context;Lcom/whatsapp/sz;)V

    .line 3
    return-void
.end method
