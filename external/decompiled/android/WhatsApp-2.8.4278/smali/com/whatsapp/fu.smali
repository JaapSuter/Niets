.class Lcom/whatsapp/fu;
.super Ljava/lang/Object;
.source "fu.java"

# interfaces
.implements Lcom/whatsapp/iu;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/whatsapp/eu;


# direct methods
.method constructor <init>(Lcom/whatsapp/eu;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/fu;->b:Lcom/whatsapp/eu;

    iput-object p2, p0, Lcom/whatsapp/fu;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1
    .parameter

    .prologue
    .line 4
    if-nez p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/fu;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->m(Ljava/lang/String;)V

    .line 2
    :cond_0
    return-void
.end method
