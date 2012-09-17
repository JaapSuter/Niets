.class Lcom/whatsapp/nn;
.super Ljava/lang/Object;
.source "nn.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final a:Lcom/whatsapp/ze;


# direct methods
.method constructor <init>(Lcom/whatsapp/ze;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/nn;->a:Lcom/whatsapp/ze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/nn;->a:Lcom/whatsapp/ze;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/whatsapp/ze;->d:Z

    .line 4
    iget-object v0, p0, Lcom/whatsapp/nn;->a:Lcom/whatsapp/ze;

    invoke-static {v0}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/ze;)V

    .line 1
    const/4 v0, 0x1

    return v0
.end method
