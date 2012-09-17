.class Lcom/whatsapp/dab;
.super Ljava/util/TimerTask;
.source "dab.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field a:Lcom/whatsapp/ju;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u000f\u0017\u00009$\u0005\u0002\u001dc3\u001a\n\u001a<\u000b\u001a\u0000\u001e91\u001b\u0011@8=\u0005\u0000\u00009 G\u0011\u0016<1R"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/dab;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x54

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x68

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x65

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x6f

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x4c

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/ju;)V
    .locals 0
    .parameter

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    .line 21
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/dab;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget v2, v2, Lcom/whatsapp/ju;->e:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-boolean v0, v0, Lcom/whatsapp/ju;->h:Z

    if-eqz v0, :cond_0

    .line 9
    :goto_0
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/whatsapp/ju;->g:Z

    .line 3
    iget-object v0, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget v0, v0, Lcom/whatsapp/ju;->e:I

    sparse-switch v0, :sswitch_data_0

    .line 25
    :cond_1
    :goto_1
    sget-object v0, Lcom/whatsapp/eu;->p:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v1, v1, Lcom/whatsapp/ju;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 7
    :sswitch_0
    iget-object v0, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v0, v0, Lcom/whatsapp/ju;->d:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 23
    iget-object v3, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v3, v3, Lcom/whatsapp/ju;->b:Ljava/lang/String;

    invoke-static {v3, v0}, Lcom/whatsapp/eu;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    if-eqz v1, :cond_2

    .line 1
    :cond_3
    sget-object v0, Lcom/whatsapp/eu;->o:Landroid/os/Handler;

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v3, v3, Lcom/whatsapp/ju;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 17
    sget-object v2, Lcom/whatsapp/eu;->o:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 19
    if-eqz v1, :cond_1

    .line 5
    :sswitch_1
    sget-object v0, Lcom/whatsapp/eu;->o:Landroid/os/Handler;

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v3, v3, Lcom/whatsapp/ju;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 20
    sget-object v2, Lcom/whatsapp/eu;->o:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 22
    if-eqz v1, :cond_1

    .line 2
    :sswitch_2
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v1, v1, Lcom/whatsapp/ju;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/Conversations;->a(Ljava/lang/String;Z)V

    .line 15
    :cond_4
    sget-object v0, Lcom/whatsapp/eu;->o:Landroid/os/Handler;

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whatsapp/dab;->a:Lcom/whatsapp/ju;

    iget-object v2, v2, Lcom/whatsapp/ju;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 11
    sget-object v1, Lcom/whatsapp/eu;->o:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    .line 3
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x10 -> :sswitch_2
        0x22 -> :sswitch_1
    .end sparse-switch
.end method
