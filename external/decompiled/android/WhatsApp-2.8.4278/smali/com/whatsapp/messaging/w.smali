.class Lcom/whatsapp/messaging/w;
.super Lcom/whatsapp/messaging/v;
.source "w.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/messaging/n;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x3f

    const/16 v3, 0x3b

    const/16 v1, 0x2b

    const/16 v2, 0xe

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "ScK3\u0010\\|R7ZY!H&QO!W*L_kU&M\u0004mI&^_k\\1P^~X+^_"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v10, 0x1

    const-string v0, "ScK3\u0010\\|R7ZY!H&QO!W*L_kU&M\u0004o_\'OJ|O*\\B~Z-KX"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x2

    const-string v0, "ScK3\u0010\\|R7ZY!H&QO!W*L_kU&M\u0004|^.P]kK\"M_gX*OJ`O0"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/messaging/w;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_3

    :pswitch_1
    move v0, v2

    goto :goto_3

    :pswitch_2
    move v0, v3

    goto :goto_3

    :pswitch_3
    const/16 v0, 0x43

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_4
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_4

    :pswitch_5
    move v0, v2

    goto :goto_4

    :pswitch_6
    move v0, v3

    goto :goto_4

    :pswitch_7
    const/16 v0, 0x43

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_5

    :pswitch_9
    move v0, v2

    goto :goto_5

    :pswitch_a
    move v0, v3

    goto :goto_5

    :pswitch_b
    const/16 v0, 0x43

    goto :goto_5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/messaging/n;)V
    .locals 0
    .parameter

    .prologue
    .line 51
    iput-object p1, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-direct {p0}, Lcom/whatsapp/messaging/v;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 17
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->d(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 27
    return-void
.end method

.method protected a(Lcom/whatsapp/gz;)V
    .locals 2
    .parameter

    .prologue
    .line 24
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->g(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1c

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 56
    return-void
.end method

.method protected a(Lcom/whatsapp/hz;)V
    .locals 2
    .parameter

    .prologue
    .line 31
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->g(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1b

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 78
    return-void
.end method

.method public a(Lcom/whatsapp/j2;)V
    .locals 2
    .parameter

    .prologue
    .line 54
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->g(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 22
    return-void
.end method

.method public a(Lcom/whatsapp/ju;)V
    .locals 2
    .parameter

    .prologue
    .line 70
    sget-object v0, Lcom/whatsapp/messaging/w;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 16
    return-void
.end method

.method public a(Lcom/whatsapp/qw;)V
    .locals 2
    .parameter

    .prologue
    .line 55
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->l(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x24

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 74
    return-void
.end method

.method public a(Lcom/whatsapp/sz;)V
    .locals 2
    .parameter

    .prologue
    .line 72
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->k(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 26
    return-void
.end method

.method public a(Lcom/whatsapp/vw;)V
    .locals 2
    .parameter

    .prologue
    .line 23
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->l(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x23

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 46
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 45
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->e(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 25
    return-void
.end method

.method protected a([Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->g(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 62
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->p(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 42
    return-void
.end method

.method public b(Lcom/whatsapp/ju;)V
    .locals 2
    .parameter

    .prologue
    .line 29
    sget-object v0, Lcom/whatsapp/messaging/w;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 15
    return-void
.end method

.method public b(Lcom/whatsapp/sz;)V
    .locals 2
    .parameter

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->l(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 53
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 43
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->f(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 12
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->q(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 30
    return-void
.end method

.method public c(Lcom/whatsapp/ju;)V
    .locals 2
    .parameter

    .prologue
    .line 5
    sget-object v0, Lcom/whatsapp/messaging/w;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 59
    return-void
.end method

.method protected c(Lcom/whatsapp/sz;)V
    .locals 2
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->l(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1f

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 75
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 50
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->h(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 4
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->r(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x19

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 61
    return-void
.end method

.method public d(Lcom/whatsapp/ju;)V
    .locals 2
    .parameter

    .prologue
    .line 57
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 71
    return-void
.end method

.method protected d(Lcom/whatsapp/sz;)V
    .locals 2
    .parameter

    .prologue
    .line 49
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->l(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 77
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 65
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->i(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 18
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 41
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->s(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 33
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->j(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 64
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->t(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 63
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 32
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->m(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 69
    return-void
.end method

.method public g()V
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 52
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 67
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->n(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 73
    return-void
.end method

.method public h()V
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x15

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 58
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 19
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->o(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 34
    return-void
.end method

.method public i()V
    .locals 2

    .prologue
    .line 11
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 38
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 44
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 47
    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 60
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 68
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 40
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x12

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 35
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x13

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 9
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 48
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x16

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 10
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/messaging/w;->a:Lcom/whatsapp/messaging/n;

    invoke-static {v0}, Lcom/whatsapp/messaging/n;->v(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x21

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 39
    return-void
.end method
