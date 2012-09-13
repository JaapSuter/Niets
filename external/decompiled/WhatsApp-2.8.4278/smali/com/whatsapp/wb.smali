.class public Lcom/whatsapp/wb;
.super Landroid/os/AsyncTask;
.source "wb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/Settings;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x60

    const/16 v2, 0x40

    const/16 v3, 0x28

    const/16 v1, 0xf

    const/4 v6, 0x0

    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "|%\\\u0012\ta\'[I\u0003g%K\r\u0013v3\\\u0003\r|4I\u0012\u0015|oF\tM|%Z\u0010\u0005}m[\u0012\u0001{5["

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

    const-string v0, "|%\\\u0012\ta\'[I\u0003g%K\r\u0013v3\\\u0003\r|4I\u0012\u0015|oF\tMl/F\u0008\u0005l4A\u0010\t{9"

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

    const/4 v10, 0x2

    const-string v0, "|%\\\u0012\ta\'[I\u0003g%K\r\u0013v3\\\u0003\r|4I\u0012\u0015|oF\tM|4I\u0012\u0015|mN\t\u0012\"#@\u0007\u0014"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x3

    const-string v0, "l(I\u0012"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/wb;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_4

    :pswitch_1
    move v0, v2

    goto :goto_4

    :pswitch_2
    move v0, v3

    goto :goto_4

    :pswitch_3
    const/16 v0, 0x66

    goto :goto_4

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_5

    :pswitch_5
    move v0, v2

    goto :goto_5

    :pswitch_6
    move v0, v3

    goto :goto_5

    :pswitch_7
    const/16 v0, 0x66

    goto :goto_5

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_6

    :pswitch_9
    move v0, v2

    goto :goto_6

    :pswitch_a
    move v0, v3

    goto :goto_6

    :pswitch_b
    const/16 v0, 0x66

    goto :goto_6

    :cond_3
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_7

    :pswitch_d
    move v0, v2

    goto :goto_7

    :pswitch_e
    move v0, v3

    goto :goto_7

    :pswitch_f
    const/16 v0, 0x66

    goto :goto_7

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

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/Settings;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-static {}, Lcom/whatsapp/yp;->a()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/Settings;->a(Lcom/whatsapp/Settings;Ljava/util/HashMap;)Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 38
    :goto_0
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 37
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-static {v0, v3}, Lcom/whatsapp/Settings;->a(Lcom/whatsapp/Settings;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 4
    :catch_1
    move-exception v0

    .line 26
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-static {v0, v3}, Lcom/whatsapp/Settings;->a(Lcom/whatsapp/Settings;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 13
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 42
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->removeDialog(I)V

    .line 16
    const/4 v1, 0x0

    .line 43
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    sget-object v0, Lcom/whatsapp/wb;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    iget-object v3, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v4, 0x7f09004d

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v8, 0x7f090048

    invoke-virtual {v7, v8}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/whatsapp/Settings;->c(Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-static {v0}, Lcom/whatsapp/Settings;->c(Lcom/whatsapp/Settings;)Ljava/util/HashMap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 34
    sget-object v0, Lcom/whatsapp/wb;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 15
    const/4 v0, 0x1

    if-eqz v2, :cond_b

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-static {v0}, Lcom/whatsapp/Settings;->c(Lcom/whatsapp/Settings;)Ljava/util/HashMap;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/wb;->z:[Ljava/lang/String;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/bq;

    .line 5
    if-eqz v0, :cond_a

    .line 14
    iget-object v3, v0, Lcom/whatsapp/bq;->a:Lcom/whatsapp/vf;

    sget-object v4, Lcom/whatsapp/vf;->b:Lcom/whatsapp/vf;

    if-ne v3, v4, :cond_5

    .line 10
    iget-wide v3, v0, Lcom/whatsapp/bq;->b:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-gtz v1, :cond_4

    .line 29
    const/4 v1, 0x3

    .line 35
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v3, 0x7f0901d0

    invoke-virtual {v0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 40
    :goto_0
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 2
    iget-object v1, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-virtual {v1}, Lcom/whatsapp/Settings;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_3

    .line 36
    iget-object v1, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const/16 v3, 0xc

    invoke-virtual {v1, v3}, Lcom/whatsapp/Settings;->showDialog(I)V

    if-eqz v2, :cond_3

    .line 28
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    invoke-virtual {v1, v0}, Lcom/whatsapp/Settings;->c(Ljava/lang/String;)V

    .line 1
    :cond_3
    return-void

    .line 23
    :cond_4
    const/4 v1, 0x2

    .line 31
    iget-object v3, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v4, 0x7f0901cf

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    iget-wide v8, v0, Lcom/whatsapp/bq;->b:J

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    invoke-static {v7, v8, v9}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 21
    :cond_5
    iget-object v3, v0, Lcom/whatsapp/bq;->a:Lcom/whatsapp/vf;

    sget-object v4, Lcom/whatsapp/vf;->c:Lcom/whatsapp/vf;

    if-eq v3, v4, :cond_6

    iget-object v3, v0, Lcom/whatsapp/bq;->a:Lcom/whatsapp/vf;

    sget-object v4, Lcom/whatsapp/vf;->d:Lcom/whatsapp/vf;

    if-ne v3, v4, :cond_8

    .line 33
    :cond_6
    iget-wide v3, v0, Lcom/whatsapp/bq;->b:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-gtz v1, :cond_7

    .line 25
    const/4 v1, 0x6

    .line 46
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v3, 0x7f090059

    invoke-virtual {v0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_7
    const/4 v1, 0x5

    .line 7
    iget-object v3, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v4, 0x7f090058

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    iget-wide v8, v0, Lcom/whatsapp/bq;->b:J

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    invoke-static {v7, v8, v9}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-virtual {v3, v4, v5}, Lcom/whatsapp/Settings;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 22
    :cond_8
    iget-object v0, v0, Lcom/whatsapp/bq;->a:Lcom/whatsapp/vf;

    sget-object v3, Lcom/whatsapp/vf;->e:Lcom/whatsapp/vf;

    if-ne v0, v3, :cond_9

    .line 3
    const/4 v0, 0x1

    if-eqz v2, :cond_b

    .line 45
    :cond_9
    const/4 v1, 0x4

    .line 17
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const v3, 0x7f0901ce

    invoke-virtual {v0, v3}, Lcom/whatsapp/Settings;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 13
    :cond_a
    sget-object v0, Lcom/whatsapp/wb;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 30
    const/4 v0, 0x1

    move-object v12, v1

    move v1, v0

    move-object v0, v12

    goto/16 :goto_0

    :cond_b
    move-object v12, v1

    move v1, v0

    move-object v0, v12

    goto/16 :goto_0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 9
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/wb;->a([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 19
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/wb;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lcom/whatsapp/wb;->a:Lcom/whatsapp/Settings;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->showDialog(I)V

    .line 24
    return-void
.end method
