.class final Lcom/whatsapp/nb;
.super Lcom/whatsapp/mb;
.source "nb.java"


# instance fields
.field final o:Lcom/whatsapp/fy;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/whatsapp/sz;Lcom/whatsapp/bj;Lcom/whatsapp/fy;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p4, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    invoke-direct {p0, p1, p2, p3}, Lcom/whatsapp/mb;-><init>(Landroid/content/Context;Lcom/whatsapp/sz;Lcom/whatsapp/bj;)V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 3
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    iget-boolean v0, v0, Lcom/whatsapp/fy;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    iget-object v0, v0, Lcom/whatsapp/fy;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    invoke-virtual {v0}, Lcom/whatsapp/fy;->a()V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/nb;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    iget-object v1, v1, Lcom/whatsapp/fy;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    iget-object v0, v0, Lcom/whatsapp/fy;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/whatsapp/nb;->a:Lcom/whatsapp/sz;

    iget-object v2, v1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/nb;->o:Lcom/whatsapp/fy;

    iget-object v2, v2, Lcom/whatsapp/fy;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lcom/whatsapp/mb;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 6
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/nb;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
