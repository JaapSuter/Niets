.class Lcom/whatsapp/y;
.super Landroid/os/AsyncTask;
.source "y.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/ContactInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x60

    const/16 v4, 0x4c

    const/16 v2, 0x35

    const/16 v3, 0x2b

    const/4 v6, 0x0

    const/16 v0, 0xa

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0003Z\u0008_-\u0003A\u000fE*\u000f\u001a\u0013[(\u0001A\u0003O"

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

    const-string v0, "?\\\u0002"

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

    const-string v0, "\u0004T\u0012J\u007f"

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

    const-string v0, "\u0004T\u0012J}"

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

    const/4 v10, 0x4

    const-string v0, "<q"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "\u0012T\u0011t/\u000f[\u0012J/\u0014j\u000fOq_\u0015\'e\u0008@X\u000fF)\u0014L\u0016NqGC\u0008Ob\u0001[\u0002Y#\tQHH9\u0012F\tYb\tA\u0003Fc\u0010]\tE)?CT\u000c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "\u0004T\u0012J~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "\u0003Z\u0008_-\u0003A9B("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "\u0012T\u0011t/\u000f[\u0012J/\u0014j\u000fO"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_8
    if-gt v7, v8, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x9

    const-string v0, "\u0003Z\u0008_-\u0003A9B(]\nFj\u0002$\u0015\u000bB!\u0005A\u001f[)]\u0012\u0010E(NT\u0008O>\u000f\\\u0002\u0005/\u0015G\u0015D>N\\\u0012N!OE\u000eD\"\u0005j\u0010\u0019k"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_a

    :pswitch_1
    move v0, v2

    goto :goto_a

    :pswitch_2
    const/16 v0, 0x66

    goto :goto_a

    :pswitch_3
    move v0, v3

    goto :goto_a

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_b

    :pswitch_5
    move v0, v2

    goto :goto_b

    :pswitch_6
    const/16 v0, 0x66

    goto :goto_b

    :pswitch_7
    move v0, v3

    goto :goto_b

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_c

    :pswitch_9
    move v0, v2

    goto :goto_c

    :pswitch_a
    const/16 v0, 0x66

    goto :goto_c

    :pswitch_b
    move v0, v3

    goto :goto_c

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_d

    :pswitch_d
    move v0, v2

    goto :goto_d

    :pswitch_e
    const/16 v0, 0x66

    goto :goto_d

    :pswitch_f
    move v0, v3

    goto :goto_d

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_e

    :pswitch_11
    move v0, v2

    goto :goto_e

    :pswitch_12
    const/16 v0, 0x66

    goto :goto_e

    :pswitch_13
    move v0, v3

    goto :goto_e

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_f

    :pswitch_15
    move v0, v2

    goto :goto_f

    :pswitch_16
    const/16 v0, 0x66

    goto :goto_f

    :pswitch_17
    move v0, v3

    goto :goto_f

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_10

    :pswitch_19
    move v0, v2

    goto :goto_10

    :pswitch_1a
    const/16 v0, 0x66

    goto :goto_10

    :pswitch_1b
    move v0, v3

    goto :goto_10

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_11

    :pswitch_1d
    move v0, v2

    goto :goto_11

    :pswitch_1e
    const/16 v0, 0x66

    goto :goto_11

    :pswitch_1f
    move v0, v3

    goto :goto_11

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_12

    :pswitch_21
    move v0, v2

    goto :goto_12

    :pswitch_22
    const/16 v0, 0x66

    goto :goto_12

    :pswitch_23
    move v0, v3

    goto :goto_12

    :cond_9
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_13
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_13

    :pswitch_25
    move v0, v2

    goto :goto_13

    :pswitch_26
    const/16 v0, 0x66

    goto :goto_13

    :pswitch_27
    move v0, v3

    goto :goto_13

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

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/ContactInfo;)V
    .locals 0
    .parameter

    .prologue
    .line 14
    iput-object p1, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private a()V
    .locals 12

    .prologue
    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 7
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-virtual {v0}, Lcom/whatsapp/ContactInfo;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v5, 0x1

    aget-object v4, v4, v5

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v5, 0x7

    aget-object v4, v4, v5

    aput-object v4, v2, v3

    sget-object v3, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v3, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v7, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v7}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whatsapp/zq;->a()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 72
    const/4 v0, 0x0

    .line 87
    if-eqz v1, :cond_12

    .line 52
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 18
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 55
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 43
    const/4 v1, 0x0

    move-object v5, v0

    move-object v0, v1

    .line 15
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 36
    new-instance v8, Lcom/whatsapp/kj;

    iget-object v1, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    iget-object v2, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v2}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v2

    invoke-direct {v8, v1, v2}, Lcom/whatsapp/kj;-><init>(Lcom/whatsapp/ContactInfo;Lcom/whatsapp/zq;)V

    .line 71
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    if-eqz v5, :cond_11

    .line 37
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-virtual {v0}, Lcom/whatsapp/ContactInfo;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v9, 0x1

    aget-object v4, v4, v9

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/16 v9, 0x8

    aget-object v4, v4, v9

    aput-object v4, v2, v3

    const/4 v3, 0x2

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v9, 0x3

    aget-object v4, v4, v9

    aput-object v4, v2, v3

    const/4 v3, 0x3

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v9, 0x6

    aget-object v4, v4, v9

    aput-object v4, v2, v3

    const/4 v3, 0x4

    sget-object v4, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v9, 0x2

    aget-object v4, v4, v9

    aput-object v4, v2, v3

    sget-object v3, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/16 v4, 0x9

    aget-object v3, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v5, v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v2, v0

    .line 30
    :goto_1
    if-eqz v2, :cond_c

    .line 8
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 39
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 64
    if-nez v1, :cond_2

    .line 16
    if-eqz v6, :cond_1

    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    if-eqz v6, :cond_b

    .line 49
    :cond_3
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v0, v0, v3

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 73
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v5, 0x6

    aget-object v0, v0, v5

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 34
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v9, 0x2

    aget-object v0, v0, v9

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 63
    if-nez v5, :cond_4

    if-nez v0, :cond_5

    .line 24
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-virtual {v0}, Lcom/whatsapp/ContactInfo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v5}, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->getTypeLabelResource(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 84
    :cond_5
    new-instance v5, Lcom/whatsapp/kj;

    iget-object v9, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-direct {v5, v9, v1, v0}, Lcom/whatsapp/kj;-><init>(Lcom/whatsapp/ContactInfo;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    sget-object v9, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    new-instance v10, Lcom/whatsapp/uq;

    invoke-static {v1}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v3, v4, v11}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    invoke-virtual {v9, v10}, Lcom/whatsapp/qp;->a(Lcom/whatsapp/uq;)Lcom/whatsapp/zq;

    move-result-object v3

    .line 77
    if-eqz v3, :cond_7

    .line 70
    iget-boolean v4, v3, Lcom/whatsapp/zq;->k:Z

    if-eqz v4, :cond_6

    .line 42
    iget-object v4, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iput-object v4, v5, Lcom/whatsapp/kj;->c:Ljava/lang/String;

    .line 67
    :cond_6
    iget-wide v3, v3, Lcom/whatsapp/zq;->f:J

    iget-object v9, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v9}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v9

    iget-wide v9, v9, Lcom/whatsapp/zq;->f:J

    cmp-long v3, v3, v9

    if-nez v3, :cond_7

    .line 13
    iput-object v1, v8, Lcom/whatsapp/kj;->a:Ljava/lang/String;

    .line 62
    iput-object v0, v8, Lcom/whatsapp/kj;->b:Ljava/lang/String;

    .line 5
    :cond_7
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v0, v0, v3

    const-string v3, ""

    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 32
    const/4 v0, 0x1

    .line 12
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/kj;

    .line 38
    iget-object v0, v0, Lcom/whatsapp/kj;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v9, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v10, 0x4

    aget-object v9, v9, v10

    const-string v10, ""

    invoke-virtual {v0, v9, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 59
    :cond_8
    const/4 v0, 0x0

    .line 86
    if-eqz v6, :cond_9

    .line 53
    :goto_3
    if-eqz v6, :cond_e

    .line 50
    :cond_9
    :goto_4
    if-eqz v0, :cond_a

    .line 88
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_a
    if-eqz v6, :cond_1

    .line 60
    :cond_b
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 33
    :cond_c
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_d

    .line 75
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    new-instance v1, Lcom/whatsapp/lj;

    invoke-direct {v1, p0, v7}, Lcom/whatsapp/lj;-><init>(Lcom/whatsapp/y;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactInfo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 90
    :cond_d
    return-void

    :cond_e
    move v1, v0

    goto :goto_2

    :cond_f
    move v0, v1

    goto :goto_3

    :cond_10
    move v0, v1

    goto :goto_4

    :cond_11
    move-object v2, v0

    goto/16 :goto_1

    :cond_12
    move-object v5, v0

    move-object v0, v1

    goto/16 :goto_0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 47
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v1}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 56
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 76
    iget-object v1, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    new-instance v2, Lcom/whatsapp/mj;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/mj;-><init>(Lcom/whatsapp/y;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Lcom/whatsapp/ContactInfo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 81
    :cond_0
    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    .line 9
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0010

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v1, v0

    .line 58
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->L:F

    float-to-int v0, v0

    .line 44
    iget-object v2, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v2}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v2

    int-to-float v0, v0

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v0, v3}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 25
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v0}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->l()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 85
    if-eqz v0, :cond_0

    .line 11
    const/4 v2, 0x1

    invoke-static {v0, v1, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 28
    iget-object v1, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    new-instance v2, Lcom/whatsapp/nj;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/nj;-><init>(Lcom/whatsapp/y;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Lcom/whatsapp/ContactInfo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 66
    :cond_1
    return-void
.end method

.method private d()V
    .locals 6

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 48
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 89
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 51
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1
    if-eqz v1, :cond_3

    .line 79
    :cond_1
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Lcom/whatsapp/zq;->p()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 10
    iget-object v4, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/whatsapp/eu;->i(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v4

    .line 29
    if-eqz v4, :cond_2

    iget-object v5, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v5}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/ContactInfo;)Lcom/whatsapp/zq;

    move-result-object v5

    iget-object v5, v5, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 6
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_2
    if-eqz v1, :cond_0

    .line 46
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 4
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    new-instance v1, Lcom/whatsapp/oj;

    invoke-direct {v1, p0, v2}, Lcom/whatsapp/oj;-><init>(Lcom/whatsapp/y;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/ContactInfo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 35
    :cond_4
    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1
    .parameter

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    invoke-direct {p0}, Lcom/whatsapp/y;->c()V

    .line 68
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    invoke-direct {p0}, Lcom/whatsapp/y;->b()V

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 20
    invoke-direct {p0}, Lcom/whatsapp/y;->d()V

    .line 3
    :cond_2
    invoke-virtual {p0}, Lcom/whatsapp/y;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 57
    invoke-direct {p0}, Lcom/whatsapp/y;->a()V

    .line 61
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/Void;)V
    .locals 2
    .parameter

    .prologue
    .line 21
    iget-object v0, p0, Lcom/whatsapp/y;->a:Lcom/whatsapp/ContactInfo;

    invoke-static {v0}, Lcom/whatsapp/ContactInfo;->c(Lcom/whatsapp/ContactInfo;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 74
    sget-object v0, Lcom/whatsapp/y;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 41
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/y;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 78
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/y;->a(Ljava/lang/Void;)V

    return-void
.end method
