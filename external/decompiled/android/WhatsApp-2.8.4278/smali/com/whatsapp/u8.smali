.class Lcom/whatsapp/u8;
.super Ljava/lang/Thread;
.source "u8.java"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/whatsapp/Conversations;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversations;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/u8;->b:Lcom/whatsapp/Conversations;

    iput-object p2, p0, Lcom/whatsapp/u8;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/u8;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :goto_0
    return-void

    .line 1
    :catch_0
    move-exception v0

    goto :goto_0
.end method
