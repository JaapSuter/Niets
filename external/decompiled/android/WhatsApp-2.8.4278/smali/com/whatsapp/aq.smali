.class public Lcom/whatsapp/aq;
.super Ljava/lang/Object;
.source "aq.java"


# instance fields
.field public a:Lcom/whatsapp/uf;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whatsapp/uf;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whatsapp/aq;->a:Lcom/whatsapp/uf;

    .line 7
    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/uf;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whatsapp/aq;->a:Lcom/whatsapp/uf;

    .line 4
    iput-object p2, p0, Lcom/whatsapp/aq;->b:Ljava/lang/String;

    .line 6
    return-void
.end method
