.class Lcom/whatsapp/ww;
.super Ljava/lang/Object;
.source "ww.java"

# interfaces
.implements Lcom/whatsapp/ct;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/vw;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x5c

    const/16 v2, 0x52

    const/16 v3, 0x47

    const/16 v1, 0x1c

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "i +"

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

    const-string v0, "q;*9\u0012e\"\""

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

    const-string v0, "o;=9"

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

    sput-object v9, Lcom/whatsapp/ww;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x66

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

    const/16 v0, 0x66

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

    const/16 v0, 0x66

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

.method constructor <init>(Lcom/whatsapp/vw;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    iget-object v0, v0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;[Ljava/lang/Object;)V

    .line 11
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4
    .parameter

    .prologue
    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    iget-object v1, v1, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    new-instance v2, Lcom/whatsapp/a1;

    invoke-direct {v2}, Lcom/whatsapp/a1;-><init>()V

    invoke-static {v1, v2}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;Lcom/whatsapp/a1;)Lcom/whatsapp/a1;

    .line 13
    iget-object v1, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    iget-object v1, v1, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v1}, Lcom/whatsapp/pb;->c(Lcom/whatsapp/pb;)Lcom/whatsapp/a1;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ww;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/whatsapp/a1;->b:Ljava/lang/String;

    .line 9
    iget-object v1, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    iget-object v1, v1, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v1}, Lcom/whatsapp/pb;->c(Lcom/whatsapp/pb;)Lcom/whatsapp/a1;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ww;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/whatsapp/a1;->c:Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    iget-object v1, v1, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    invoke-static {v1}, Lcom/whatsapp/pb;->c(Lcom/whatsapp/pb;)Lcom/whatsapp/a1;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ww;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/whatsapp/a1;->d:J

    .line 12
    iget-object v0, p0, Lcom/whatsapp/ww;->a:Lcom/whatsapp/vw;

    iget-object v0, v0, Lcom/whatsapp/vw;->f:Lcom/whatsapp/pb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whatsapp/pb;->a(Lcom/whatsapp/pb;Z)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :goto_0
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
