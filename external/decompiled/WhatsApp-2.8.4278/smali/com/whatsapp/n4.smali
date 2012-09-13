.class Lcom/whatsapp/n4;
.super Ljava/lang/Object;
.source "n4.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/UserFeedbackActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/UserFeedbackActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/n4;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/n4;->a:Lcom/whatsapp/UserFeedbackActivity;

    const/16 v1, 0xc9

    invoke-virtual {v0, v1}, Lcom/whatsapp/UserFeedbackActivity;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/n4;->a:Lcom/whatsapp/UserFeedbackActivity;

    iget-object v1, p0, Lcom/whatsapp/n4;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v1}, Lcom/whatsapp/UserFeedbackActivity;->a(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/n4;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v2}, Lcom/whatsapp/UserFeedbackActivity;->b(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/whatsapp/UserFeedbackActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2
    return-void
.end method
