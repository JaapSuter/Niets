.class Lcom/whatsapp/yn;
.super Ljava/lang/Object;
.source "yn.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/df;


# direct methods
.method constructor <init>(Lcom/whatsapp/df;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/yn;->a:Lcom/whatsapp/df;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/yn;->a:Lcom/whatsapp/df;

    iget-object v0, v0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    invoke-static {v0}, Lcom/whatsapp/App;->g(Lcom/whatsapp/sz;)V

    .line 1
    return-void
.end method
