.class Lcom/whatsapp/k8;
.super Ljava/lang/Thread;
.source "k8.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/mc;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "*\u0005ooV0\u000f^~|7\u0012hbnv\u000fucy\u0006\u0008i~l8\u0018"

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

    sput-object v0, Lcom/whatsapp/k8;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x9

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x59

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x7c

    goto :goto_1

    :pswitch_2
    const/4 v0, 0x1

    goto :goto_1

    :pswitch_3
    const/16 v0, 0xc

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/mc;)V
    .locals 0
    .parameter

    .prologue
    .line 11
    iput-object p1, p0, Lcom/whatsapp/k8;->a:Lcom/whatsapp/mc;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 13
    :cond_0
    sget v1, Lcom/whatsapp/g;->b:I

    if-lez v1, :cond_4

    .line 16
    sget v1, Lcom/whatsapp/g;->b:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Lcom/whatsapp/g;->b:I

    .line 26
    :try_start_0
    sget v1, Lcom/whatsapp/g;->a:I

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    :goto_0
    sget v1, Lcom/whatsapp/g;->b:I

    if-le v1, v4, :cond_1

    .line 18
    const/4 v1, 0x2

    sput v1, Lcom/whatsapp/g;->b:I

    if-eqz v0, :cond_2

    .line 5
    :cond_1
    const/16 v1, 0x1388

    sput v1, Lcom/whatsapp/g;->a:I

    .line 14
    :cond_2
    sget-boolean v1, Lcom/whatsapp/g;->e:Z

    if-eqz v1, :cond_0

    .line 20
    sget-object v0, Lcom/whatsapp/k8;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 8
    sput-boolean v3, Lcom/whatsapp/g;->d:Z

    .line 7
    sput-boolean v3, Lcom/whatsapp/g;->e:Z

    .line 24
    :cond_3
    :goto_1
    return-void

    .line 23
    :cond_4
    sput-boolean v3, Lcom/whatsapp/g;->d:Z

    .line 17
    sget-boolean v1, Lcom/whatsapp/g;->e:Z

    if-eqz v1, :cond_5

    .line 15
    sget-object v0, Lcom/whatsapp/k8;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 10
    sput-boolean v3, Lcom/whatsapp/g;->e:Z

    goto :goto_1

    .line 12
    :cond_5
    sget-boolean v1, Lcom/whatsapp/tp;->a:Z

    if-nez v1, :cond_3

    .line 25
    sput v3, Lcom/whatsapp/g;->c:I

    .line 2
    invoke-static {v3}, Lcom/whatsapp/tp;->a(Z)I

    move-result v1

    .line 19
    if-eqz v1, :cond_6

    if-ne v1, v4, :cond_7

    .line 1
    :cond_6
    sget-object v2, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    invoke-virtual {v2, v3}, Lcom/whatsapp/g;->c(Z)V

    if-eqz v0, :cond_3

    .line 9
    :cond_7
    const/4 v0, 0x1

    if-ne v1, v0, :cond_3

    .line 6
    sget-object v0, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    invoke-virtual {v0, v3}, Lcom/whatsapp/g;->b(Z)V

    goto :goto_1

    .line 3
    :catch_0
    move-exception v1

    goto :goto_0
.end method
