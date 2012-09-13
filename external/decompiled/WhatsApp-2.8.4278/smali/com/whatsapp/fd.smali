.class Lcom/whatsapp/fd;
.super Landroid/os/Handler;
.source "fd.java"


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method constructor <init>(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/fd;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 5
    :cond_0
    :goto_0
    return-void

    .line 2
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/fd;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->a(Lcom/whatsapp/EditGroupSubject;)V

    .line 1
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 4
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/fd;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->i:Landroid/widget/MultiAutoCompleteTextView;

    iget-object v1, p0, Lcom/whatsapp/fd;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v1, v1, Lcom/whatsapp/EditGroupSubject;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 6
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
