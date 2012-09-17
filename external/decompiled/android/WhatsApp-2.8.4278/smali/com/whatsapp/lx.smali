.class final Lcom/whatsapp/lx;
.super Lcom/whatsapp/messaging/t;
.source "lx.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/whatsapp/messaging/t;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 10
    invoke-static {}, Lcom/whatsapp/App;->V()V

    .line 41
    return-void
.end method

.method public a(I)V
    .locals 0
    .parameter

    .prologue
    .line 31
    invoke-static {p1}, Lcom/whatsapp/App;->c(I)V

    .line 17
    return-void
.end method

.method public a(IJ)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 42
    invoke-static {p1, p2, p3}, Lcom/whatsapp/App;->a(IJ)V

    .line 1
    return-void
.end method

.method protected a(Lcom/whatsapp/gz;)V
    .locals 2
    .parameter

    .prologue
    .line 11
    iget v0, p1, Lcom/whatsapp/gz;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 23
    iget-object v0, p1, Lcom/whatsapp/gz;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->o(Ljava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 12
    :cond_0
    invoke-static {p1}, Lcom/whatsapp/App;->a(Lcom/whatsapp/gz;)V

    .line 37
    :cond_1
    return-void
.end method

.method public a(Lcom/whatsapp/sz;)V
    .locals 0
    .parameter

    .prologue
    .line 15
    invoke-static {p1}, Lcom/whatsapp/App;->j(Lcom/whatsapp/sz;)V

    .line 4
    return-void
.end method

.method public a(Lcom/whatsapp/uz;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 16
    invoke-static {p1, p2}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uz;I)V

    .line 7
    return-void
.end method

.method protected a(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 27
    invoke-static {p1, p2}, Lcom/whatsapp/App;->a(Ljava/lang/String;I)V

    .line 20
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    invoke-static {p1, p2, p3}, Lcom/whatsapp/App;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    return-void
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 9
    invoke-static {p1, p2}, Lcom/whatsapp/App;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    return-void
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 32
    invoke-static {p1, p2, p3, p4, p5}, Lcom/whatsapp/App;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    .line 35
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 8
    invoke-static {p1, p2}, Lcom/whatsapp/App;->d(Ljava/lang/String;Z)V

    .line 29
    return-void
.end method

.method public a(Ljava/util/Hashtable;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    invoke-static {p1}, Lcom/whatsapp/App;->a(Ljava/util/Hashtable;)V

    .line 26
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 28
    invoke-static {}, Lcom/whatsapp/App;->U()V

    .line 14
    return-void
.end method

.method public b(Lcom/whatsapp/uz;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 25
    invoke-static {p1, p2}, Lcom/whatsapp/App;->c(Lcom/whatsapp/uz;I)V

    .line 38
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 22
    invoke-static {p1}, Lcom/whatsapp/App;->n(Ljava/lang/String;)V

    .line 40
    return-void
.end method

.method protected b(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 36
    invoke-static {p1, p2}, Lcom/whatsapp/App;->b(Ljava/lang/String;I)V

    .line 39
    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 19
    invoke-static {p1, p2}, Lcom/whatsapp/App;->e(Ljava/lang/String;Z)V

    .line 24
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 30
    invoke-static {}, Lcom/whatsapp/App;->T()V

    .line 18
    return-void
.end method

.method public c(Lcom/whatsapp/uz;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    invoke-static {p1, p2}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uz;I)V

    .line 43
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    invoke-static {p1}, Lcom/whatsapp/App;->p(Ljava/lang/String;)V

    .line 13
    return-void
.end method
