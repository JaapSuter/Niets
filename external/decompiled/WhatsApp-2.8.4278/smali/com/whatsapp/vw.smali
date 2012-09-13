.class public Lcom/whatsapp/vw;
.super Ljava/lang/Object;
.source "vw.java"

# interfaces
.implements Lcom/whatsapp/b1;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:J

.field final f:Lcom/whatsapp/pb;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x3a

    const/16 v3, 0x29

    const/16 v2, 0x1b

    const/16 v1, 0x9

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "o.tD"

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

    const-string v0, "}3"

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

    const-string v0, "I/5^Rh(hHJyruLN"

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

    sput-object v9, Lcom/whatsapp/vw;->z:[Ljava/lang/String;

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
    const/16 v0, 0x5c

    goto :goto_3

    :pswitch_2
    move v0, v2

    goto :goto_3

    :pswitch_3
    move v0, v3

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
    const/16 v0, 0x5c

    goto :goto_4

    :pswitch_6
    move v0, v2

    goto :goto_4

    :pswitch_7
    move v0, v3

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
    const/16 v0, 0x5c

    goto :goto_5

    :pswitch_a
    move v0, v2

    goto :goto_5

    :pswitch_b
    move v0, v3

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

.method public constructor <init>(Lcom/whatsapp/pb;)V
    .locals 0
    .parameter

    .prologue
    .line 14
    iput-object p1, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v0}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;)Ljava/util/TimerTask;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 3
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/pb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 19
    return-void
.end method

.method public a(Lcom/whatsapp/a1;)V
    .locals 3
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 12
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v0}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;)Ljava/util/TimerTask;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 9
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v0, p1}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;Lcom/whatsapp/a1;)Lcom/whatsapp/a1;

    .line 6
    iget-object v2, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v2, v0}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;Z)Z

    .line 2
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/pb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 16
    return-void

    :cond_0
    move v0, v1

    .line 6
    goto :goto_0
.end method

.method public a(Ljava/lang/String;I)V
    .locals 8
    .parameter
    .parameter

    .prologue
    const/4 v7, 0x0

    .line 15
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v0}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;)Ljava/util/TimerTask;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 7
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    iget-object v6, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    new-instance v0, Lcom/whatsapp/at;

    iget-object v2, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v2}, Lcom/whatsapp/pb;->b(Lcom/whatsapp/pb;)Lcom/whatsapp/MediaData;

    move-result-object v2

    iget-object v2, v2, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    const/16 v4, 0x4000

    new-instance v5, Lcom/whatsapp/ww;

    invoke-direct {v5, p0}, Lcom/whatsapp/ww;-><init>(Lcom/whatsapp/vw;)V

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/at;-><init>(Ljava/net/URL;Ljava/io/File;IILcom/whatsapp/ct;)V

    invoke-static {v6, v0}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;Lcom/whatsapp/at;)Lcom/whatsapp/at;

    .line 11
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v0}, Lcom/whatsapp/pb;->d(Lcom/whatsapp/pb;)Lcom/whatsapp/at;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/vw;->z:[Ljava/lang/String;

    aget-object v1, v1, v7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v3, v3, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/vw;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/at;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v0}, Lcom/whatsapp/pb;->d(Lcom/whatsapp/pb;)Lcom/whatsapp/at;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/vw;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v2}, Lcom/whatsapp/pb;->e(Lcom/whatsapp/pb;)Lcom/whatsapp/sz;

    move-result-object v2

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v2, v2, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/at;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    new-array v1, v7, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/pb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 13
    :goto_0
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 18
    iget-object v0, p0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/pb;->a(Ljava/lang/Boolean;)V

    goto :goto_0
.end method
