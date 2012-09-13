.class Lcom/whatsapp/eab;
.super Ljava/util/TimerTask;
.source "eab.java"


# instance fields
.field final a:Lcom/whatsapp/pb;


# direct methods
.method constructor <init>(Lcom/whatsapp/pb;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/eab;->a:Lcom/whatsapp/pb;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/eab;->a:Lcom/whatsapp/pb;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/pb;->a(Ljava/lang/Boolean;)V

    .line 3
    return-void
.end method
