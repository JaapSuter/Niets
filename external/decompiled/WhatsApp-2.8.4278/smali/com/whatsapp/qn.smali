.class Lcom/whatsapp/qn;
.super Ljava/lang/Object;
.source "qn.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Ljava/util/List;

.field final b:Lcom/whatsapp/sz;

.field final c:I

.field final d:Lcom/whatsapp/ze;


# direct methods
.method constructor <init>(Lcom/whatsapp/ze;Ljava/util/List;Lcom/whatsapp/sz;I)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/qn;->d:Lcom/whatsapp/ze;

    iput-object p2, p0, Lcom/whatsapp/qn;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/whatsapp/qn;->b:Lcom/whatsapp/sz;

    iput p4, p0, Lcom/whatsapp/qn;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/qn;->d:Lcom/whatsapp/ze;

    iget-object v1, v0, Lcom/whatsapp/ze;->n:Lcom/whatsapp/Conversation;

    iget-object v0, p0, Lcom/whatsapp/qn;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/rn;

    iget v2, v0, Lcom/whatsapp/rn;->b:I

    iget-object v0, p0, Lcom/whatsapp/qn;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/rn;

    iget-object v0, v0, Lcom/whatsapp/rn;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/qn;->b:Lcom/whatsapp/sz;

    iget v4, p0, Lcom/whatsapp/qn;->c:I

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/whatsapp/Conversation;->a(ILjava/lang/String;Lcom/whatsapp/sz;I)Z

    .line 1
    return-void
.end method
