.class Lcom/whatsapp/billing/l;
.super Ljava/lang/Object;
.source "l.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/billing/b;

.field final b:Ljava/lang/String;

.field final c:I

.field final d:J

.field final e:Ljava/lang/String;

.field final f:Lcom/whatsapp/billing/k;


# direct methods
.method constructor <init>(Lcom/whatsapp/billing/k;Lcom/whatsapp/billing/b;Ljava/lang/String;IJLjava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/billing/l;->f:Lcom/whatsapp/billing/k;

    iput-object p2, p0, Lcom/whatsapp/billing/l;->a:Lcom/whatsapp/billing/b;

    iput-object p3, p0, Lcom/whatsapp/billing/l;->b:Ljava/lang/String;

    iput p4, p0, Lcom/whatsapp/billing/l;->c:I

    iput-wide p5, p0, Lcom/whatsapp/billing/l;->d:J

    iput-object p7, p0, Lcom/whatsapp/billing/l;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/billing/l;->f:Lcom/whatsapp/billing/k;

    iget-object v1, p0, Lcom/whatsapp/billing/l;->a:Lcom/whatsapp/billing/b;

    iget-object v2, p0, Lcom/whatsapp/billing/l;->b:Ljava/lang/String;

    iget v3, p0, Lcom/whatsapp/billing/l;->c:I

    iget-wide v4, p0, Lcom/whatsapp/billing/l;->d:J

    iget-object v6, p0, Lcom/whatsapp/billing/l;->e:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/whatsapp/billing/k;->a(Lcom/whatsapp/billing/b;Ljava/lang/String;IJLjava/lang/String;)V

    .line 1
    return-void
.end method
