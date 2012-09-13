.class Lcom/whatsapp/kj;
.super Ljava/lang/Object;
.source "kj.java"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field final d:Lcom/whatsapp/ContactInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactInfo;Lcom/whatsapp/zq;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/kj;->d:Lcom/whatsapp/ContactInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p2}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/kj;->a:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/whatsapp/ContactInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/whatsapp/zq;->a(Landroid/content/res/Resources;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/whatsapp/kj;->b:Ljava/lang/String;

    .line 8
    iget-boolean v0, p2, Lcom/whatsapp/zq;->k:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/whatsapp/kj;->c:Ljava/lang/String;

    .line 9
    :cond_0
    return-void
.end method

.method constructor <init>(Lcom/whatsapp/ContactInfo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/kj;->d:Lcom/whatsapp/ContactInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/whatsapp/kj;->a:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whatsapp/kj;->b:Ljava/lang/String;

    .line 10
    return-void
.end method
