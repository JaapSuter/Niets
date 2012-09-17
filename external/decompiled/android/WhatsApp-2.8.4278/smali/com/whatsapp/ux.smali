.class public Lcom/whatsapp/ux;
.super Lcom/whatsapp/tx;
.source "ux.java"


# instance fields
.field private a:J

.field private b:I

.field private c:Ljava/lang/CharSequence;

.field private d:Ljava/lang/CharSequence;

.field private e:Ljava/lang/CharSequence;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Landroid/app/PendingIntent;

.field private k:[J

.field private l:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/whatsapp/tx;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/whatsapp/ux;->l:Landroid/content/Context;

    .line 1
    return-void
.end method


# virtual methods
.method public a()Landroid/app/Notification;
    .locals 5

    .prologue
    .line 29
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 39
    iget-wide v1, p0, Lcom/whatsapp/ux;->a:J

    iput-wide v1, v0, Landroid/app/Notification;->when:J

    .line 2
    iget v1, p0, Lcom/whatsapp/ux;->b:I

    iput v1, v0, Landroid/app/Notification;->icon:I

    .line 6
    iget-object v1, p0, Lcom/whatsapp/ux;->j:Landroid/app/PendingIntent;

    iput-object v1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 22
    iget-object v1, p0, Lcom/whatsapp/ux;->c:Ljava/lang/CharSequence;

    iput-object v1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 19
    iget v1, p0, Lcom/whatsapp/ux;->g:I

    iput v1, v0, Landroid/app/Notification;->ledARGB:I

    .line 32
    iget v1, p0, Lcom/whatsapp/ux;->h:I

    iput v1, v0, Landroid/app/Notification;->ledOnMS:I

    .line 35
    iget v1, p0, Lcom/whatsapp/ux;->i:I

    iput v1, v0, Landroid/app/Notification;->ledOffMS:I

    .line 3
    iget v1, p0, Lcom/whatsapp/ux;->f:I

    iput v1, v0, Landroid/app/Notification;->defaults:I

    .line 7
    const/4 v1, 0x0

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 38
    iget-object v1, p0, Lcom/whatsapp/ux;->k:[J

    iput-object v1, v0, Landroid/app/Notification;->vibrate:[J

    .line 14
    iget v1, p0, Lcom/whatsapp/ux;->h:I

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/whatsapp/ux;->i:I

    if-eqz v1, :cond_0

    .line 23
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 21
    :cond_0
    iget v1, p0, Lcom/whatsapp/ux;->f:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_1

    .line 18
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 33
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/ux;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/whatsapp/ux;->d:Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/whatsapp/ux;->e:Ljava/lang/CharSequence;

    iget-object v4, p0, Lcom/whatsapp/ux;->j:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 26
    return-object v0
.end method

.method public a(I)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 36
    iput p1, p0, Lcom/whatsapp/ux;->b:I

    .line 20
    return-object p0
.end method

.method public a(III)Lcom/whatsapp/tx;
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 28
    iput p1, p0, Lcom/whatsapp/ux;->g:I

    .line 8
    iput p2, p0, Lcom/whatsapp/ux;->h:I

    .line 40
    iput p3, p0, Lcom/whatsapp/ux;->i:I

    .line 16
    return-object p0
.end method

.method public a(J)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 15
    iput-wide p1, p0, Lcom/whatsapp/ux;->a:J

    .line 24
    return-object p0
.end method

.method public a(Landroid/app/PendingIntent;)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 31
    iput-object p1, p0, Lcom/whatsapp/ux;->j:Landroid/app/PendingIntent;

    .line 11
    return-object p0
.end method

.method public a(Landroid/graphics/Bitmap;)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 27
    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 10
    iput-object p1, p0, Lcom/whatsapp/ux;->c:Ljava/lang/CharSequence;

    .line 30
    return-object p0
.end method

.method public a([J)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/ux;->k:[J

    .line 17
    return-object p0
.end method

.method public b(I)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 37
    iput p1, p0, Lcom/whatsapp/ux;->f:I

    .line 5
    return-object p0
.end method

.method public b(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 34
    iput-object p1, p0, Lcom/whatsapp/ux;->d:Ljava/lang/CharSequence;

    .line 41
    return-object p0
.end method

.method public c(Ljava/lang/CharSequence;)Lcom/whatsapp/tx;
    .locals 0
    .parameter

    .prologue
    .line 13
    iput-object p1, p0, Lcom/whatsapp/ux;->e:Ljava/lang/CharSequence;

    .line 25
    return-object p0
.end method
