.class Lcom/whatsapp/q8;
.super Ljava/lang/Thread;
.source "q8.java"


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/ContactPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/ContactPicker;Lcom/whatsapp/zq;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/q8;->b:Lcom/whatsapp/ContactPicker;

    iput-object p2, p0, Lcom/whatsapp/q8;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 5
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/q8;->b:Lcom/whatsapp/ContactPicker;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whatsapp/q8;->a:Lcom/whatsapp/zq;

    iget-object v2, v2, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/app/Activity;ZLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1
    :goto_0
    return-void

    .line 3
    :catch_0
    move-exception v0

    goto :goto_0
.end method
