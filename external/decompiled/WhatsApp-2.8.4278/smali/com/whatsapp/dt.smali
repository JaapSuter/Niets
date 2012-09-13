.class Lcom/whatsapp/dt;
.super Ljava/lang/Object;
.source "dt.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field final c:Lcom/whatsapp/at;


# direct methods
.method public constructor <init>(Lcom/whatsapp/at;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/dt;->c:Lcom/whatsapp/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iput-object p2, p0, Lcom/whatsapp/dt;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whatsapp/dt;->b:Ljava/lang/String;

    .line 2
    return-void
.end method
