.class Lcom/whatsapp/ii;
.super Ljava/lang/Object;
.source "ii.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BlockList;


# direct methods
.method constructor <init>(Lcom/whatsapp/BlockList;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/ii;->a:Lcom/whatsapp/BlockList;

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
    iget-object v0, p0, Lcom/whatsapp/ii;->a:Lcom/whatsapp/BlockList;

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Lcom/whatsapp/BlockList;->removeDialog(I)V

    .line 3
    return-void
.end method
