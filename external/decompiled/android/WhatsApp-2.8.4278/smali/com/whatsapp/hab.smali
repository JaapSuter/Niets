.class Lcom/whatsapp/hab;
.super Lorg/apache/http/entity/EntityTemplate;
.source "hab.java"


# instance fields
.field a:J

.field final b:Lcom/whatsapp/at;


# direct methods
.method public constructor <init>(Lcom/whatsapp/at;Lorg/apache/http/entity/ContentProducer;J)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/hab;->b:Lcom/whatsapp/at;

    .line 4
    invoke-direct {p0, p2}, Lorg/apache/http/entity/EntityTemplate;-><init>(Lorg/apache/http/entity/ContentProducer;)V

    .line 1
    iput-wide p3, p0, Lcom/whatsapp/hab;->a:J

    .line 5
    return-void
.end method


# virtual methods
.method public getContentLength()J
    .locals 2

    .prologue
    .line 2
    iget-wide v0, p0, Lcom/whatsapp/hab;->a:J

    return-wide v0
.end method
