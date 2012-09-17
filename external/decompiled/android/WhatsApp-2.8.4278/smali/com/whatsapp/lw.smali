.class Lcom/whatsapp/lw;
.super Ljava/lang/Object;
.source "lw.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Main;


# direct methods
.method constructor <init>(Lcom/whatsapp/Main;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/lw;->a:Lcom/whatsapp/Main;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/lw;->a:Lcom/whatsapp/Main;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/Main;->removeDialog(I)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/lw;->a:Lcom/whatsapp/Main;

    invoke-virtual {v0}, Lcom/whatsapp/Main;->finish()V

    .line 4
    return-void
.end method
