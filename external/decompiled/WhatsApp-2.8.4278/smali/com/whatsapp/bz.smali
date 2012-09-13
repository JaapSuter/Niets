.class Lcom/whatsapp/bz;
.super Ljava/lang/Object;
.source "bz.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/ProfileInfoActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/ProfileInfoActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/bz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8
    .parameter

    .prologue
    .line 6
    new-instance v4, Lcom/whatsapp/cz;

    invoke-direct {v4, p0}, Lcom/whatsapp/cz;-><init>(Lcom/whatsapp/bz;)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/bz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v0}, Lcom/whatsapp/App;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 4
    new-instance v0, Lcom/whatsapp/b;

    iget-object v1, p0, Lcom/whatsapp/bz;->a:Lcom/whatsapp/ProfileInfoActivity;

    const v2, 0x7f0901b5

    const/16 v5, 0x19

    const/4 v6, 0x0

    const v7, 0x7f0902a3

    invoke-direct/range {v0 .. v7}, Lcom/whatsapp/b;-><init>(Landroid/app/Activity;ILjava/lang/String;Lcom/whatsapp/ms;III)V

    .line 2
    invoke-virtual {v0}, Lcom/whatsapp/b;->show()V

    .line 3
    return-void
.end method
