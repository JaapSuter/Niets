.class Lcom/whatsapp/t2;
.super Ljava/lang/Object;
.source "t2.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/Settings;


# direct methods
.method constructor <init>(Lcom/whatsapp/Settings;Lcom/whatsapp/zq;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/t2;->b:Lcom/whatsapp/Settings;

    iput-object p2, p0, Lcom/whatsapp/t2;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .parameter
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/t2;->b:Lcom/whatsapp/Settings;

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->removeDialog(I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/t2;->b:Lcom/whatsapp/Settings;

    iget-object v1, p0, Lcom/whatsapp/t2;->a:Lcom/whatsapp/zq;

    const/4 v2, 0x1

    const/16 v3, 0x11

    const/16 v4, 0x12

    invoke-static {v0, v1, v2, v3, v4}, Lcom/whatsapp/Conversation;->a(Landroid/app/Activity;Lcom/whatsapp/zq;ZII)V

    .line 2
    return-void
.end method
