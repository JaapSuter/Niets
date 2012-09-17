.class Lcom/whatsapp/l0;
.super Lcom/whatsapp/xz;
.source "l0.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Ljava/lang/Runnable;

.field final b:Lcom/whatsapp/wz;

.field final c:Lcom/whatsapp/qz;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "?A7\u0006\\("

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

    sput-object v0, Lcom/whatsapp/l0;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2a

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x4d

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x24

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x5a

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x69

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/qz;Ljava/lang/Runnable;Lcom/whatsapp/wz;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/l0;->c:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/l0;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/whatsapp/l0;->b:Lcom/whatsapp/wz;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/l0;->b:Lcom/whatsapp/wz;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/l0;->b:Lcom/whatsapp/wz;

    invoke-interface {v0, p1}, Lcom/whatsapp/wz;->a(I)V

    .line 4
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 4
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 8
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    .line 9
    iget-object v2, p0, Lcom/whatsapp/l0;->c:Lcom/whatsapp/qz;

    sget-object v3, Lcom/whatsapp/l0;->z:Ljava/lang/String;

    invoke-static {v2, p1, v0, v1, v3}, Lcom/whatsapp/qz;->a(Lcom/whatsapp/qz;Lcom/whatsapp/c1;Ljava/util/Vector;Ljava/util/Hashtable;Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lcom/whatsapp/l0;->c:Lcom/whatsapp/qz;

    iget-object v2, v2, Lcom/whatsapp/qz;->k:Lcom/whatsapp/vz;

    invoke-interface {v2, p2, v0, v1}, Lcom/whatsapp/vz;->b(Ljava/lang/String;Ljava/util/Vector;Ljava/util/Hashtable;)V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/l0;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/l0;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 11
    :cond_0
    return-void
.end method
