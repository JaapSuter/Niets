.class public Lcom/whatsapp/cq;
.super Ljava/lang/Object;
.source "cq.java"


# instance fields
.field public a:Lcom/whatsapp/wf;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whatsapp/wf;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whatsapp/cq;->a:Lcom/whatsapp/wf;

    .line 2
    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/wf;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whatsapp/cq;->a:Lcom/whatsapp/wf;

    .line 1
    iput-object p2, p0, Lcom/whatsapp/cq;->b:Ljava/lang/String;

    .line 5
    return-void
.end method
