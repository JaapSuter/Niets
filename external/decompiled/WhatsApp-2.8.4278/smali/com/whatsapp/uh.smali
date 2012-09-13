.class Lcom/whatsapp/uh;
.super Ljava/lang/Object;
.source "uh.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/Thread$UncaughtExceptionHandler;

.field final b:Lcom/whatsapp/App;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x1c

    const/16 v2, 0x18

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v6, 0x0

    new-array v9, v4, [Ljava/lang/String;

    const-string v0, ":R[CV(TL\"F7_]RW&SV"

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

    const-string v0, ":ry`o\n<lm#\u000cn}cw\n<{pb\u001ct8qf\u0001hqlf\u0003<~ko\n"

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

    const-string v0, "<Y[WQ&HA\"F7_]RW&SV"

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

    aput-object v0, v9, v3

    sput-object v9, Lcom/whatsapp/uh;->z:[Ljava/lang/String;

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
    const/16 v0, 0x6f

    goto :goto_3

    :pswitch_1
    move v0, v1

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
    const/16 v0, 0x6f

    goto :goto_4

    :pswitch_5
    move v0, v1

    goto :goto_4

    :pswitch_6
    move v0, v2

    goto :goto_4

    :pswitch_7
    move v0, v3

    goto :goto_4

    :cond_2
    aget-char v8, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_5
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    const/16 v0, 0x6f

    goto :goto_5

    :pswitch_9
    move v0, v1

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

.method constructor <init>(Lcom/whatsapp/App;)V
    .locals 1
    .parameter

    .prologue
    .line 13
    iput-object p1, p0, Lcom/whatsapp/uh;->b:Lcom/whatsapp/App;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 15
    :try_start_0
    instance-of v0, p2, Ljava/lang/SecurityException;

    if-eqz v0, :cond_2

    .line 12
    sget-object v0, Lcom/whatsapp/uh;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0, p2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    instance-of v0, p2, Lcom/whatsapp/g8;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 1
    check-cast v0, Lcom/whatsapp/g8;

    .line 16
    invoke-virtual {v0}, Lcom/whatsapp/g8;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 3
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    :goto_0
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 20
    :cond_1
    return-void

    .line 21
    :cond_2
    :try_start_1
    sget-object v0, Lcom/whatsapp/uh;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0, p2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 14
    :try_start_2
    invoke-static {}, Lcom/whatsapp/App;->xb()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 22
    :goto_1
    instance-of v0, p2, Lcom/whatsapp/g8;

    if-eqz v0, :cond_3

    move-object v0, p2

    .line 1
    check-cast v0, Lcom/whatsapp/g8;

    .line 16
    invoke-virtual {v0}, Lcom/whatsapp/g8;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 3
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 17
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 4
    :try_start_3
    sget-object v1, Lcom/whatsapp/uh;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    .line 5
    :catch_1
    move-exception v0

    .line 22
    instance-of v0, p2, Lcom/whatsapp/g8;

    if-eqz v0, :cond_4

    move-object v0, p2

    .line 1
    check-cast v0, Lcom/whatsapp/g8;

    .line 16
    invoke-virtual {v0}, Lcom/whatsapp/g8;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 3
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    move-object v1, v0

    instance-of v0, p2, Lcom/whatsapp/g8;

    if-eqz v0, :cond_5

    move-object v0, p2

    .line 1
    check-cast v0, Lcom/whatsapp/g8;

    .line 16
    invoke-virtual {v0}, Lcom/whatsapp/g8;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v2, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0}, Lcom/whatsapp/g8;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 3
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_6

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/uh;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 22
    :cond_6
    throw v1
.end method
