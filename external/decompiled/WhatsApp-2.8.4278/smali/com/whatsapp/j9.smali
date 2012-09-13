.class Lcom/whatsapp/j9;
.super Ljava/lang/Thread;
.source "j9.java"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:Ljava/util/Vector;

.field final d:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method constructor <init>(Lcom/whatsapp/EditGroupSubject;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/j9;->d:Lcom/whatsapp/EditGroupSubject;

    iput-object p2, p0, Lcom/whatsapp/j9;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/whatsapp/j9;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/whatsapp/j9;->c:Ljava/util/Vector;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 2
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 1
    new-instance v0, Lcom/whatsapp/ju;

    iget-object v1, p0, Lcom/whatsapp/j9;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/j9;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/j9;->c:Ljava/util/Vector;

    const/16 v4, 0xd

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/whatsapp/ju;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;I)V

    .line 6
    invoke-static {v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/ju;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :goto_0
    return-void

    .line 5
    :catch_0
    move-exception v0

    goto :goto_0
.end method
