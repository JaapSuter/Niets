.class Lcom/whatsapp/eo;
.super Ljava/lang/Object;
.source "eo.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversations;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversations;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/eo;->a:Lcom/whatsapp/Conversations;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/eo;->a:Lcom/whatsapp/Conversations;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->showDialog(I)V

    .line 2
    new-instance v0, Lcom/whatsapp/w8;

    invoke-direct {v0, p0}, Lcom/whatsapp/w8;-><init>(Lcom/whatsapp/eo;)V

    invoke-virtual {v0}, Lcom/whatsapp/w8;->start()V

    .line 3
    return-void
.end method
