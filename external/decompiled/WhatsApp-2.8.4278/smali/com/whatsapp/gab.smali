.class Lcom/whatsapp/gab;
.super Ljava/util/TimerTask;
.source "gab.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field a:Lcom/whatsapp/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v2, 0x5d

    const/16 v1, 0x52

    const-string v0, "58/8 31\u001e/7#($.&\r)(07=(5r&+-$g"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    move v4, v3

    move-object v3, v0

    :goto_0
    if-gt v4, v5, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/gab;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v6, v3, v5

    rem-int/lit8 v0, v5, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v1

    :goto_1
    xor-int/2addr v0, v6

    int-to-char v0, v0

    aput-char v0, v3, v5

    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_1

    :pswitch_1
    move v0, v2

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x41

    goto :goto_1

    :pswitch_3
    move v0, v2

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/j2;)V
    .locals 0
    .parameter

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    .line 7
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1
    iget-object v0, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iget-boolean v0, v0, Lcom/whatsapp/j2;->j:Z

    if-eqz v0, :cond_0

    .line 12
    :goto_0
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/gab;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iget v1, v1, Lcom/whatsapp/j2;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iput-boolean v2, v0, Lcom/whatsapp/j2;->i:Z

    .line 5
    iget-object v0, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iget v0, v0, Lcom/whatsapp/j2;->f:I

    packed-switch v0, :pswitch_data_0

    .line 4
    :cond_1
    :goto_1
    sget-object v0, Lcom/whatsapp/j2;->a:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iget-object v1, v1, Lcom/whatsapp/j2;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iget-object v0, v0, Lcom/whatsapp/j2;->e:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    iget-object v0, v0, Lcom/whatsapp/j2;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    sget-object v0, Lcom/whatsapp/j2;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/gab;->a:Lcom/whatsapp/j2;

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 9
    sget-object v1, Lcom/whatsapp/j2;->b:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    .line 5
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
