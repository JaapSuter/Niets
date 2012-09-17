.class public Lcom/whatsapp/kq;
.super Ljava/lang/Object;
.source "kq.java"


# instance fields
.field public a:J

.field public b:Lcom/whatsapp/sz;


# direct methods
.method public constructor <init>(Lcom/whatsapp/sz;J)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whatsapp/kq;->b:Lcom/whatsapp/sz;

    .line 1
    iput-wide p2, p0, Lcom/whatsapp/kq;->a:J

    .line 4
    return-void
.end method
