.class Lcom/whatsapp/yt;
.super Ljava/lang/Object;
.source "yt.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/GroupChatInfo;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/yt;->a:Lcom/whatsapp/GroupChatInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/yt;->a:Lcom/whatsapp/GroupChatInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/GroupChatInfo;->showDialog(I)V

    .line 3
    return-void
.end method
