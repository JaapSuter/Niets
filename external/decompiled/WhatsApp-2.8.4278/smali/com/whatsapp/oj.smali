.class Lcom/whatsapp/oj;
.super Ljava/lang/Object;
.source "oj.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Ljava/util/List;

.field final b:Lcom/whatsapp/y;


# direct methods
.method constructor <init>(Lcom/whatsapp/y;Ljava/util/List;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/oj;->b:Lcom/whatsapp/y;

    iput-object p2, p0, Lcom/whatsapp/oj;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/oj;->b:Lcom/whatsapp/y;

    invoke-virtual {v0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/oj;->b:Lcom/whatsapp/y;

    iget-object v0, v0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    iget-object v1, p0, Lcom/whatsapp/oj;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;Ljava/util/List;)V

    .line 2
    :cond_0
    return-void
.end method
