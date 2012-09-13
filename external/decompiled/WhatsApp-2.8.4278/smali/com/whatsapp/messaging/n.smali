.class public Lcom/whatsapp/messaging/n;
.super Landroid/os/HandlerThread;
.source "n.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private final a:Landroid/os/Messenger;

.field private b:Landroid/os/Messenger;

.field private c:Lcom/whatsapp/qz;

.field private final d:Lcom/whatsapp/l5;

.field private final e:Lcom/whatsapp/k5;

.field private f:Landroid/os/Handler;

.field private g:Landroid/os/Handler;

.field private h:Landroid/os/Handler;

.field private i:Landroid/os/Handler;

.field private j:Landroid/os/Handler;

.field private k:Landroid/os/Handler;

.field private l:Landroid/os/Handler;

.field private m:Landroid/os/Handler;

.field private n:Landroid/os/Handler;

.field private o:Landroid/os/Handler;

.field private p:Landroid/os/Handler;

.field private q:Landroid/os/Handler;

.field private r:Landroid/os/Handler;

.field private s:Landroid/os/Handler;

.field private t:Landroid/os/Handler;

.field private u:Landroid/os/Handler;

.field private v:Landroid/os/Handler;

.field private w:Landroid/os/Handler;

.field private x:Landroid/os/Handler;

.field private final y:Lcom/whatsapp/messaging/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "me[`-a`Yu\u0013q"

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

    sput-object v0, Lcom/whatsapp/messaging/n;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x72

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x15

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x8

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x2b

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x10

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Landroid/os/Messenger;)V
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 36
    sget-object v0, Lcom/whatsapp/messaging/n;->z:Ljava/lang/String;

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 34
    new-instance v0, Lcom/whatsapp/l5;

    invoke-direct {v0, v1}, Lcom/whatsapp/l5;-><init>(Z)V

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->d:Lcom/whatsapp/l5;

    .line 42
    new-instance v0, Lcom/whatsapp/k5;

    invoke-direct {v0, v1}, Lcom/whatsapp/k5;-><init>(Z)V

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->e:Lcom/whatsapp/k5;

    .line 41
    new-instance v0, Lcom/whatsapp/messaging/w;

    invoke-direct {v0, p0}, Lcom/whatsapp/messaging/w;-><init>(Lcom/whatsapp/messaging/n;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->y:Lcom/whatsapp/messaging/v;

    .line 16
    iput-object p1, p0, Lcom/whatsapp/messaging/n;->a:Landroid/os/Messenger;

    .line 30
    return-void
.end method

.method static a(Lcom/whatsapp/messaging/n;)Lcom/whatsapp/qz;
    .locals 1
    .parameter

    .prologue
    .line 20
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->c:Lcom/whatsapp/qz;

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->d:Lcom/whatsapp/l5;

    invoke-virtual {v0}, Lcom/whatsapp/l5;->a()V

    .line 44
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->e:Lcom/whatsapp/k5;

    invoke-virtual {v0}, Lcom/whatsapp/k5;->a()V

    .line 46
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 2
    invoke-direct {p0}, Lcom/whatsapp/messaging/n;->a()V

    .line 1
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 47
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->a:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/whatsapp/messaging/n;->c:Lcom/whatsapp/qz;

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/f;->a(Landroid/os/Messenger;Lcom/whatsapp/qz;)V

    .line 48
    return-void
.end method

.method static a(Lcom/whatsapp/messaging/n;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 8
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/n;->a(Landroid/os/Message;)V

    return-void
.end method

.method static a(Lcom/whatsapp/messaging/n;Lcom/whatsapp/qz;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/n;->a(Lcom/whatsapp/qz;)V

    return-void
.end method

.method private a(Lcom/whatsapp/qz;)V
    .locals 1
    .parameter

    .prologue
    .line 31
    iput-object p1, p0, Lcom/whatsapp/messaging/n;->c:Lcom/whatsapp/qz;

    .line 45
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->d:Lcom/whatsapp/l5;

    invoke-virtual {v0}, Lcom/whatsapp/l5;->b()V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->e:Lcom/whatsapp/k5;

    invoke-virtual {v0}, Lcom/whatsapp/k5;->b()V

    .line 19
    return-void
.end method

.method static b(Lcom/whatsapp/messaging/n;)Landroid/os/Messenger;
    .locals 1
    .parameter

    .prologue
    .line 49
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->a:Landroid/os/Messenger;

    return-object v0
.end method

.method private b(Landroid/os/Message;)V
    .locals 1
    .parameter

    .prologue
    .line 9
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->y:Lcom/whatsapp/messaging/v;

    invoke-static {v0, p1}, Lcom/whatsapp/messaging/s;->a(Lcom/whatsapp/messaging/v;Landroid/os/Message;)V

    .line 10
    return-void
.end method

.method static b(Lcom/whatsapp/messaging/n;Landroid/os/Message;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/n;->b(Landroid/os/Message;)V

    return-void
.end method

.method static c(Lcom/whatsapp/messaging/n;)V
    .locals 0
    .parameter

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/whatsapp/messaging/n;->a()V

    return-void
.end method

.method static d(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static e(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 40
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->n:Landroid/os/Handler;

    return-object v0
.end method

.method static f(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static g(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static h(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 32
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->h:Landroid/os/Handler;

    return-object v0
.end method

.method static i(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 11
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->q:Landroid/os/Handler;

    return-object v0
.end method

.method static j(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 39
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->r:Landroid/os/Handler;

    return-object v0
.end method

.method static k(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->o:Landroid/os/Handler;

    return-object v0
.end method

.method static l(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 24
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->i:Landroid/os/Handler;

    return-object v0
.end method

.method static m(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 17
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->j:Landroid/os/Handler;

    return-object v0
.end method

.method static n(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 43
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->k:Landroid/os/Handler;

    return-object v0
.end method

.method static o(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 37
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->l:Landroid/os/Handler;

    return-object v0
.end method

.method static p(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 35
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->s:Landroid/os/Handler;

    return-object v0
.end method

.method static q(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 12
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->t:Landroid/os/Handler;

    return-object v0
.end method

.method static r(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->u:Landroid/os/Handler;

    return-object v0
.end method

.method static s(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 23
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->v:Landroid/os/Handler;

    return-object v0
.end method

.method static t(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 26
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->w:Landroid/os/Handler;

    return-object v0
.end method

.method static u(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 15
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static v(Lcom/whatsapp/messaging/n;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 27
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->x:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method protected onLooperPrepared()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lcom/whatsapp/messaging/l;

    iget-object v1, p0, Lcom/whatsapp/messaging/n;->d:Lcom/whatsapp/l5;

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/messaging/l;-><init>(Lcom/whatsapp/messaging/n;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->w:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->m:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->l:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->k:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->j:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->i:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->h:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->g:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->f:Landroid/os/Handler;

    .line 5
    new-instance v0, Lcom/whatsapp/messaging/l;

    iget-object v1, p0, Lcom/whatsapp/messaging/n;->e:Lcom/whatsapp/k5;

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/messaging/l;-><init>(Lcom/whatsapp/messaging/n;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->x:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->v:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->u:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->t:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->s:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->r:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->q:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->p:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->o:Landroid/os/Handler;

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->n:Landroid/os/Handler;

    .line 38
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/whatsapp/messaging/k;

    invoke-direct {v1, p0}, Lcom/whatsapp/messaging/k;-><init>(Lcom/whatsapp/messaging/n;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/whatsapp/messaging/n;->b:Landroid/os/Messenger;

    .line 6
    iget-object v0, p0, Lcom/whatsapp/messaging/n;->a:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/whatsapp/messaging/n;->b:Landroid/os/Messenger;

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/f;->a(Landroid/os/Messenger;Landroid/os/Messenger;)V

    .line 13
    return-void
.end method
