.class Lcom/whatsapp/xo;
.super Ljava/lang/Object;
.source "xo.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Conversations;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversations;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/xo;->a:Lcom/whatsapp/Conversations;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/xo;->a:Lcom/whatsapp/Conversations;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/whatsapp/Conversations;->s:Z

    .line 3
    iget-object v0, p0, Lcom/whatsapp/xo;->a:Lcom/whatsapp/Conversations;

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->onSearchRequested()Z

    .line 4
    return-void
.end method
