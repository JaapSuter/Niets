.class Lcom/whatsapp/messaging/u;
.super Lcom/whatsapp/messaging/t;
.source "u.java"


# instance fields
.field final a:Lcom/whatsapp/messaging/m;


# direct methods
.method constructor <init>(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/messaging/u;->a:Lcom/whatsapp/messaging/m;

    invoke-direct {p0}, Lcom/whatsapp/messaging/t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/messaging/u;->a:Lcom/whatsapp/messaging/m;

    invoke-static {v0}, Lcom/whatsapp/messaging/m;->a(Lcom/whatsapp/messaging/m;)Landroid/os/Messenger;

    move-result-object v0

    invoke-static {p1}, Lcom/whatsapp/messaging/s;->e(Ljava/lang/String;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/k;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 3
    return-void
.end method
