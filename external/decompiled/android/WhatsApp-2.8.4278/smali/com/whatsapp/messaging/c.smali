.class Lcom/whatsapp/messaging/c;
.super Landroid/os/Handler;
.source "c.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/messaging/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "cx\nX\u0002xz\u0014FHxa\u0013GC4x\tO_~v\u001fA]o:\u0014GC~"

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

    sput-object v0, Lcom/whatsapp/messaging/c;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2d

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x1b

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x15

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x7a

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x28

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private constructor <init>(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 12
    iput-object p1, p0, Lcom/whatsapp/messaging/c;->a:Lcom/whatsapp/messaging/m;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/messaging/m;Lcom/whatsapp/messaging/u;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 6
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/c;-><init>(Lcom/whatsapp/messaging/m;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/c;->removeMessages(I)V

    .line 14
    return-void
.end method

.method public a(Lcom/whatsapp/sz;J)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 3
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 8
    invoke-virtual {p0, v0, p2, p3}, Lcom/whatsapp/messaging/c;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 9
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 10
    :cond_0
    :goto_0
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    .line 11
    iget v0, v0, Lcom/whatsapp/sz;->a:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 13
    sget-object v0, Lcom/whatsapp/messaging/c;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 4
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/c;->removeMessages(I)V

    .line 15
    iget-object v0, p0, Lcom/whatsapp/messaging/c;->a:Lcom/whatsapp/messaging/m;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/m;->a(Lcom/whatsapp/messaging/m;Z)V

    goto :goto_0

    .line 9
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
