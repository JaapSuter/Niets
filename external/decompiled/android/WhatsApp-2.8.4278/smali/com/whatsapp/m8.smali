.class Lcom/whatsapp/m8;
.super Ljava/lang/Thread;
.source "m8.java"


# instance fields
.field final a:Lcom/whatsapp/g;


# direct methods
.method constructor <init>(Lcom/whatsapp/g;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/m8;->a:Lcom/whatsapp/g;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Lcom/whatsapp/tp;->a(Z)I

    move-result v0

    .line 3
    if-eqz v0, :cond_0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/m8;->a:Lcom/whatsapp/g;

    invoke-virtual {v1, v2}, Lcom/whatsapp/g;->c(Z)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 5
    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/whatsapp/m8;->a:Lcom/whatsapp/g;

    invoke-virtual {v0, v2}, Lcom/whatsapp/g;->b(Z)V

    .line 2
    :cond_2
    return-void
.end method
