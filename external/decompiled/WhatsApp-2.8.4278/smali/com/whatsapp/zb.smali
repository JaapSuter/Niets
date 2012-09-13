.class public Lcom/whatsapp/zb;
.super Landroid/os/AsyncTask;
.source "zb.java"


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
.field final a:Lcom/whatsapp/UserFeedbackActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x66

    const/16 v1, 0x58

    const/16 v3, 0x42

    const/16 v2, 0x33

    const/4 v6, 0x0

    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "6\\o\u000f\t6]\'\u000f\u00121E+\u0018\u001f"

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

    const-string v0, "*V%A"

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

    const-string v0, "R9"

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

    const/4 v10, 0x3

    const-string v0, "*V%\u0005\u0015,A#\u0018\u000f7]"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x4

    const-string v0, "9E#\u0005\n9Q.\t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/zb;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_5

    :pswitch_1
    move v0, v2

    goto :goto_5

    :pswitch_2
    move v0, v3

    goto :goto_5

    :pswitch_3
    const/16 v0, 0x6c

    goto :goto_5

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_6

    :pswitch_5
    move v0, v2

    goto :goto_6

    :pswitch_6
    move v0, v3

    goto :goto_6

    :pswitch_7
    const/16 v0, 0x6c

    goto :goto_6

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_7

    :pswitch_9
    move v0, v2

    goto :goto_7

    :pswitch_a
    move v0, v3

    goto :goto_7

    :pswitch_b
    const/16 v0, 0x6c

    goto :goto_7

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_8

    :pswitch_d
    move v0, v2

    goto :goto_8

    :pswitch_e
    move v0, v3

    goto :goto_8

    :pswitch_f
    const/16 v0, 0x6c

    goto :goto_8

    :cond_4
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_9

    :pswitch_11
    move v0, v2

    goto :goto_9

    :pswitch_12
    move v0, v3

    goto :goto_9

    :pswitch_13
    const/16 v0, 0x6c

    goto :goto_9

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

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/UserFeedbackActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 16
    iput-object p1, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

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

    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {}, Lcom/whatsapp/yp;->a()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/UserFeedbackActivity;->a(Lcom/whatsapp/UserFeedbackActivity;Ljava/util/HashMap;)Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 3
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 31
    :goto_0
    return-object v0

    .line 23
    :catch_0
    move-exception v0

    .line 29
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v0, v3}, Lcom/whatsapp/UserFeedbackActivity;->a(Lcom/whatsapp/UserFeedbackActivity;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 24
    :catch_1
    move-exception v0

    .line 15
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v0, v3}, Lcom/whatsapp/UserFeedbackActivity;->a(Lcom/whatsapp/UserFeedbackActivity;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 10
    .parameter

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 13
    iget-object v3, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    const/16 v4, 0xc8

    invoke-virtual {v3, v4}, Lcom/whatsapp/UserFeedbackActivity;->removeDialog(I)V

    .line 4
    iget-object v3, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    sget-object v4, Lcom/whatsapp/zb;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    iget-object v5, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v5}, Lcom/whatsapp/UserFeedbackActivity;->c(Lcom/whatsapp/UserFeedbackActivity;)Ljava/util/HashMap;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/whatsapp/UserFeedbackActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)Lcom/whatsapp/q4;

    move-result-object v3

    .line 19
    iget-object v4, v3, Lcom/whatsapp/q4;->a:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 20
    iget-object v4, v3, Lcom/whatsapp/q4;->b:Ljava/lang/String;

    sget-object v5, Lcom/whatsapp/zb;->z:[Ljava/lang/String;

    aget-object v5, v5, v0

    if-ne v4, v5, :cond_1

    .line 5
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    const/16 v1, 0xca

    invoke-virtual {v0, v1}, Lcom/whatsapp/UserFeedbackActivity;->showDialog(I)V

    .line 26
    :cond_0
    :goto_0
    return-void

    .line 27
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v3, Lcom/whatsapp/q4;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lcom/whatsapp/zb;->z:[Ljava/lang/String;

    const/4 v6, 0x2

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    const v6, 0x7f09005a

    new-array v7, v1, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    const v9, 0x7f090020

    invoke-virtual {v8, v9}, Lcom/whatsapp/UserFeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v0

    invoke-virtual {v5, v6, v7}, Lcom/whatsapp/UserFeedbackActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/whatsapp/q4;->a:Ljava/lang/String;

    .line 32
    :cond_2
    iget-object v4, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    iget-object v5, v3, Lcom/whatsapp/q4;->a:Ljava/lang/String;

    invoke-static {v4, v5}, Lcom/whatsapp/UserFeedbackActivity;->a(Lcom/whatsapp/UserFeedbackActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    iget-object v4, v3, Lcom/whatsapp/q4;->b:Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 11
    iget-object v4, v3, Lcom/whatsapp/q4;->b:Ljava/lang/String;

    sget-object v5, Lcom/whatsapp/zb;->z:[Ljava/lang/String;

    const/4 v6, 0x4

    aget-object v5, v5, v6

    if-ne v4, v5, :cond_3

    move v0, v1

    .line 33
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/zb;->z:[Ljava/lang/String;

    aget-object v1, v5, v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, v3, Lcom/whatsapp/q4;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Lcom/whatsapp/q4;->b:Ljava/lang/String;

    .line 30
    :cond_4
    iget-object v1, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    if-eqz v0, :cond_6

    move-object v0, v2

    :goto_1
    invoke-static {v1, v0}, Lcom/whatsapp/UserFeedbackActivity;->b(Lcom/whatsapp/UserFeedbackActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-virtual {v0}, Lcom/whatsapp/UserFeedbackActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v0}, Lcom/whatsapp/UserFeedbackActivity;->d(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    const/16 v1, 0xc9

    invoke-virtual {v0, v1}, Lcom/whatsapp/UserFeedbackActivity;->showDialog(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    iget-object v1, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v1}, Lcom/whatsapp/UserFeedbackActivity;->a(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    invoke-static {v3}, Lcom/whatsapp/UserFeedbackActivity;->b(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3, v2}, Lcom/whatsapp/UserFeedbackActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    goto/16 :goto_0

    .line 30
    :cond_6
    iget-object v0, v3, Lcom/whatsapp/q4;->b:Ljava/lang/String;

    goto :goto_1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 28
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/zb;->a([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/zb;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 25
    iget-object v0, p0, Lcom/whatsapp/zb;->a:Lcom/whatsapp/UserFeedbackActivity;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/whatsapp/UserFeedbackActivity;->showDialog(I)V

    .line 10
    return-void
.end method
