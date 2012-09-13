.class final Lcom/whatsapp/bi;
.super Ljava/lang/Object;
.source "bi.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/gz;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x73

    const/16 v3, 0x6d

    const/16 v4, 0x2a

    const/16 v1, 0x29

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "[\u0016\u000eO\u0017_\u0016\t\n\u000eA\u001c\u0019E!O\u0006\u0001F!@\u0017MC\u0010_\u0012\u0001C\u001a\u0005S"

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

    const-string v0, "[\u0016\u000eO\u0017_\u0016\t\n\u000eA\u001c\u0019E!]\u001b\u0018G\u001cv\u001a\t\n\u0017G\u0005\u000cF\u0017M_M"

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

    const-string v0, "\t\u0000\u0005E\u000bE\u0017MH\u001b\tMP\n"

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

    sput-object v9, Lcom/whatsapp/bi;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7e

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
    move v0, v4

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x7e

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
    move v0, v4

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x7e

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
    move v0, v4

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

.method constructor <init>(Lcom/whatsapp/zq;Lcom/whatsapp/gz;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iput-object p2, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    iget-object v0, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iget-object v2, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v2, v2, Lcom/whatsapp/gz;->b:[B

    iget-object v4, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v4, v4, Lcom/whatsapp/gz;->c:[B

    invoke-virtual {v0, v2, v4}, Lcom/whatsapp/zq;->a([B[B)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    .line 7
    iget-object v2, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v2, v2, Lcom/whatsapp/gz;->b:[B

    if-eqz v2, :cond_0

    .line 10
    iget-object v0, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v0, v0, Lcom/whatsapp/gz;->d:I

    if-eqz v3, :cond_2

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v2, v2, Lcom/whatsapp/gz;->d:I

    if-eq v0, v2, :cond_2

    .line 20
    iget-object v2, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v2, v2, Lcom/whatsapp/gz;->d:I

    if-ge v2, v0, :cond_1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/bi;->z:[Ljava/lang/String;

    aget-object v4, v4, v1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v4, v4, Lcom/whatsapp/gz;->d:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v4, Lcom/whatsapp/bi;->z:[Ljava/lang/String;

    aget-object v4, v4, v7

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    if-eqz v3, :cond_2

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move v0, v1

    .line 16
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->p:I

    .line 1
    iget-object v4, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v4, v4, Lcom/whatsapp/gz;->c:[B

    if-eqz v4, :cond_3

    .line 15
    iget-object v2, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v2, v2, Lcom/whatsapp/gz;->d:I

    if-eqz v3, :cond_5

    .line 4
    :cond_3
    iget-object v4, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v4, v4, Lcom/whatsapp/gz;->d:I

    if-eq v2, v4, :cond_5

    .line 2
    iget-object v4, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v4, v4, Lcom/whatsapp/gz;->d:I

    if-ge v4, v2, :cond_4

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/bi;->z:[Ljava/lang/String;

    const/4 v6, 0x1

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget v5, v5, Lcom/whatsapp/gz;->d:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lcom/whatsapp/bi;->z:[Ljava/lang/String;

    aget-object v5, v5, v7

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    if-eqz v3, :cond_5

    .line 8
    :cond_4
    iget-object v2, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->h()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move v2, v1

    .line 14
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/zq;->a(II)V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v0, v0, Lcom/whatsapp/gz;->b:[B

    if-eqz v0, :cond_6

    .line 17
    sget-object v0, Lcom/whatsapp/App;->T:Lcom/whatsapp/c5;

    iget-object v1, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/c5;->b(Ljava/lang/Object;)Z

    .line 19
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v0, v0, Lcom/whatsapp/gz;->c:[B

    if-eqz v0, :cond_7

    .line 12
    sget-object v0, Lcom/whatsapp/App;->U:Lcom/whatsapp/c5;

    iget-object v1, p0, Lcom/whatsapp/bi;->a:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/c5;->b(Ljava/lang/Object;)Z

    .line 25
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v0, v0, Lcom/whatsapp/gz;->b:[B

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/bi;->b:Lcom/whatsapp/gz;

    iget-object v0, v0, Lcom/whatsapp/gz;->c:[B

    if-eqz v0, :cond_9

    .line 9
    :cond_8
    sget-object v0, Lcom/whatsapp/App;->Jb:Landroid/os/Handler;

    new-instance v1, Lcom/whatsapp/ci;

    invoke-direct {v1, p0}, Lcom/whatsapp/ci;-><init>(Lcom/whatsapp/bi;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    :cond_9
    return-void
.end method
