.class Lcom/whatsapp/u9;
.super Ljava/lang/Thread;
.source "u9.java"


# instance fields
.field final a:Lcom/whatsapp/s9;


# direct methods
.method constructor <init>(Lcom/whatsapp/s9;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/u9;->a:Lcom/whatsapp/s9;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const v5, 0xafc8

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move v0, v1

    .line 6
    :cond_0
    :goto_0
    sget-boolean v3, Lcom/whatsapp/eu;->j:Z

    if-eqz v3, :cond_1

    if-ge v0, v5, :cond_1

    .line 1
    add-int/lit16 v0, v0, 0xc8

    .line 13
    const-wide/16 v3, 0xc8

    :try_start_0
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 9
    :catch_0
    move-exception v3

    .line 11
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 8
    if-eqz v2, :cond_0

    .line 3
    :cond_1
    if-lt v0, v5, :cond_3

    .line 10
    sget-boolean v0, Lcom/whatsapp/eu;->f:Z

    if-eqz v0, :cond_2

    .line 12
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/whatsapp/eu;->a(Z)V

    if-eqz v2, :cond_3

    .line 14
    :cond_2
    invoke-static {v1}, Lcom/whatsapp/eu;->a(Z)V

    .line 4
    :cond_3
    return-void
.end method
