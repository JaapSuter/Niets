.class public Lcom/whatsapp/lf;
.super Ljava/io/FilterInputStream;
.source "lf.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v4, 0x68

    const/16 v2, 0x42

    const/4 v3, 0x4

    const/4 v6, 0x0

    const/16 v1, 0x54

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "&\'w1\u001ct!e8\u00041&$=\u0006t\u000fa\'\u001b5%a\u001d\u0006$7p\u0007\u001c&\'e9"

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

    const/4 v8, 0x1

    const-string v0, "9#v?H7#h8\r0bm:H\u0019\'w\'\t3\'M:\u0018!6W \u001a1#i"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/lf;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    move v0, v3

    goto :goto_2

    :pswitch_3
    move v0, v1

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    move v0, v3

    goto :goto_3

    :pswitch_7
    move v0, v1

    goto :goto_3

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
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 9
    iput p2, p0, Lcom/whatsapp/lf;->a:I

    .line 18
    return-void
.end method


# virtual methods
.method public mark(I)V
    .locals 2
    .parameter

    .prologue
    .line 16
    sget-object v0, Lcom/whatsapp/lf;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public markSupported()Z
    .locals 1

    .prologue
    .line 2
    const/4 v0, 0x0

    return v0
.end method

.method public read()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    .line 6
    const-wide/16 v1, 0x1

    iget v3, p0, Lcom/whatsapp/lf;->a:I

    invoke-static {v1, v2, v3}, Lcom/whatsapp/e4;->a(JI)V

    .line 5
    return v0
.end method

.method public read([B)I
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 15
    invoke-super {p0, p1}, Ljava/io/FilterInputStream;->read([B)I

    move-result v0

    .line 10
    int-to-long v1, v0

    iget v3, p0, Lcom/whatsapp/lf;->a:I

    invoke-static {v1, v2, v3}, Lcom/whatsapp/e4;->a(JI)V

    .line 13
    return v0
.end method

.method public read([BII)I
    .locals 4
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 14
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result v0

    .line 20
    int-to-long v1, v0

    iget v3, p0, Lcom/whatsapp/lf;->a:I

    invoke-static {v1, v2, v3}, Lcom/whatsapp/e4;->a(JI)V

    .line 8
    return v0
.end method

.method public declared-synchronized reset()V
    .locals 2

    .prologue
    .line 11
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/whatsapp/lf;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    .line 11
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public skip(J)J
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 12
    invoke-super {p0, p1, p2}, Ljava/io/FilterInputStream;->skip(J)J

    move-result-wide v0

    .line 7
    iget v2, p0, Lcom/whatsapp/lf;->a:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/e4;->a(JI)V

    .line 17
    return-wide v0
.end method
