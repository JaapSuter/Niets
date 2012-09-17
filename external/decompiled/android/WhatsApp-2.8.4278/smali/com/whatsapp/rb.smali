.class Lcom/whatsapp/rb;
.super Lcom/whatsapp/qb;
.source "rb.java"


# instance fields
.field final b:Lcom/whatsapp/pb;


# direct methods
.method constructor <init>(Lcom/whatsapp/pb;Ljava/io/File;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/rb;->b:Lcom/whatsapp/pb;

    invoke-direct {p0, p2}, Lcom/whatsapp/qb;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 6
    if-nez p1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/rb;->b:Lcom/whatsapp/pb;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/pb;->a(Ljava/lang/Boolean;)V

    .line 4
    :goto_0
    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/rb;->b:Lcom/whatsapp/pb;

    invoke-static {v0, p1}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/rb;->a(Ljava/lang/String;)V

    return-void
.end method
