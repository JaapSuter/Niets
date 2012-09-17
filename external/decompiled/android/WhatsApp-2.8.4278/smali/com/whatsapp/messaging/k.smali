.class public Lcom/whatsapp/messaging/k;
.super Landroid/os/Handler;
.source "k.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private final a:Lcom/whatsapp/messaging/n;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "R1@\u0005\u001c].Y\u0001VXsB\u0010P\\sS\u001a]D9S\u0001VN"

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

    sput-object v0, Lcom/whatsapp/messaging/k;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x33

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x2a

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x5c

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x30

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x75

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/messaging/n;)V
    .locals 0
    .parameter

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/whatsapp/messaging/k;->a:Lcom/whatsapp/messaging/n;

    .line 13
    return-void
.end method

.method public static a(Landroid/os/Messenger;)V
    .locals 2
    .parameter

    .prologue
    .line 5
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-void

    .line 3
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Landroid/os/Messenger;Landroid/os/Message;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 28
    const/4 v0, 0x2

    iput v0, p1, Landroid/os/Message;->what:I

    .line 16
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-void

    .line 19
    :catch_0
    move-exception v0

    .line 20
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 7
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 11
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 17
    :goto_0
    return-void

    .line 2
    :pswitch_0
    sget-object v0, Lcom/whatsapp/messaging/k;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/whatsapp/messaging/k;->a:Lcom/whatsapp/messaging/n;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/qz;

    invoke-static {v1, v0}, Lcom/whatsapp/messaging/n;->a(Lcom/whatsapp/messaging/n;Lcom/whatsapp/qz;)V

    goto :goto_0

    .line 10
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/messaging/k;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->c(Lcom/whatsapp/messaging/n;)V

    goto :goto_0

    .line 14
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/messaging/k;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0, p1}, Lcom/whatsapp/messaging/n;->b(Lcom/whatsapp/messaging/n;Landroid/os/Message;)V

    goto :goto_0

    .line 11
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
