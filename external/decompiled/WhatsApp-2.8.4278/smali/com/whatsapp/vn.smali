.class Lcom/whatsapp/vn;
.super Ljava/lang/Object;
.source "vn.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/cf;


# direct methods
.method private constructor <init>(Lcom/whatsapp/cf;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/vn;->a:Lcom/whatsapp/cf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/cf;Lcom/whatsapp/un;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0, p1}, Lcom/whatsapp/vn;-><init>(Lcom/whatsapp/cf;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/vn;->a:Lcom/whatsapp/cf;

    invoke-virtual {v0}, Lcom/whatsapp/cf;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/vn;->a:Lcom/whatsapp/cf;

    iget-object v1, v1, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;Lcom/whatsapp/sz;)V

    .line 2
    return-void
.end method
