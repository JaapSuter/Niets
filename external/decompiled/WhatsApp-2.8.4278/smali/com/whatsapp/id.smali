.class Lcom/whatsapp/id;
.super Landroid/os/Handler;
.source "id.java"


# instance fields
.field final a:Lcom/whatsapp/GroupChatInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/id;->a:Lcom/whatsapp/GroupChatInfo;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .parameter

    .prologue
    .line 1
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/App;->b:Z

    .line 4
    iget-object v0, p0, Lcom/whatsapp/id;->a:Lcom/whatsapp/GroupChatInfo;

    iget-object v0, v0, Lcom/whatsapp/GroupChatInfo;->q:Lcom/whatsapp/ie;

    invoke-virtual {v0}, Lcom/whatsapp/ie;->notifyDataSetChanged()V

    .line 2
    return-void
.end method
