.class public Lcom/whatsapp/BroadcastMediaPicker;
.super Lcom/whatsapp/DialogToastActivity;
.source "BroadcastMediaPicker.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x76

    const/16 v3, 0x3d

    const/16 v1, 0xa

    const/16 v4, 0x8

    const/4 v6, 0x0

    const/4 v0, 0x7

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "b\u0017NW\tb\u0019Sm&d\u0003Pj\u001cx"

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

    const-string v0, "U\u001fY"

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

    const-string v0, "n\u001fNx\u0015k\u000fbf\u0018g\u0013"

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

    const-string v0, "e\u0019P"

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

    const-string v0, "l\u001fQm"

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

    const-string v0, "d\u0003QdYi\u0003O{\u0016x"

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

    const/4 v8, 0x6

    const-string v0, "U\u0012\\|\u0018"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x79

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_7

    :pswitch_1
    move v0, v2

    goto :goto_7

    :pswitch_2
    move v0, v3

    goto :goto_7

    :pswitch_3
    move v0, v4

    goto :goto_7

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x79

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_8

    :pswitch_5
    move v0, v2

    goto :goto_8

    :pswitch_6
    move v0, v3

    goto :goto_8

    :pswitch_7
    move v0, v4

    goto :goto_8

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x79

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_9

    :pswitch_9
    move v0, v2

    goto :goto_9

    :pswitch_a
    move v0, v3

    goto :goto_9

    :pswitch_b
    move v0, v4

    goto :goto_9

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x79

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_a

    :pswitch_d
    move v0, v2

    goto :goto_a

    :pswitch_e
    move v0, v3

    goto :goto_a

    :pswitch_f
    move v0, v4

    goto :goto_a

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x79

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_b

    :pswitch_11
    move v0, v2

    goto :goto_b

    :pswitch_12
    move v0, v3

    goto :goto_b

    :pswitch_13
    move v0, v4

    goto :goto_b

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x79

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_c

    :pswitch_15
    move v0, v2

    goto :goto_c

    :pswitch_16
    move v0, v3

    goto :goto_c

    :pswitch_17
    move v0, v4

    goto :goto_c

    :cond_6
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x79

    :goto_d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_d

    :pswitch_19
    move v0, v2

    goto :goto_d

    :pswitch_1a
    move v0, v3

    goto :goto_d

    :pswitch_1b
    move v0, v4

    goto :goto_d

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
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    return-void
.end method

.method public static a(Landroid/net/Uri;)Ljava/io/File;
    .locals 7
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 100
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 7
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v4, 0x6

    aget-object v1, v1, v4

    aput-object v1, v2, v6

    move-object v1, p0

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 41
    if-nez v1, :cond_1

    .line 46
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 107
    new-instance v0, Ljava/io/File;

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_2
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/io/File;BLjava/lang/String;)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    .line 127
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xc00000

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 94
    const v0, 0x7f0901f8

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 138
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/whatsapp/App;->a(Ljava/lang/String;B)Ljava/io/File;

    move-result-object v0

    .line 85
    invoke-static {p1, v0}, Lcom/whatsapp/BroadcastMediaPicker;->a(Ljava/io/File;Ljava/io/File;)V

    .line 101
    new-instance v1, Lcom/whatsapp/MediaData;

    invoke-direct {v1}, Lcom/whatsapp/MediaData;-><init>()V

    .line 48
    iput-object v0, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 102
    new-instance v2, Lcom/whatsapp/sz;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v3, v3, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    check-cast v0, [B

    invoke-direct {v2, v3, v0, v1}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;[BLjava/lang/Object;)V

    sput-object v2, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 111
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iput v5, v0, Lcom/whatsapp/sz;->h:I

    .line 143
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iput-byte p2, v0, Lcom/whatsapp/sz;->l:B

    .line 71
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v2, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 32
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/sz;->m:J

    .line 76
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iput v5, v0, Lcom/whatsapp/sz;->a:I

    .line 142
    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Intent;Ljava/io/File;)V
    .locals 7
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;,
            Ljava/lang/SecurityException;,
            Lcom/whatsapp/dg;,
            Ljava/lang/OutOfMemoryError;
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    .line 30
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, p1}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 91
    if-nez v0, :cond_1

    .line 34
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090207

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 115
    :goto_1
    return-void

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    .line 106
    :cond_1
    new-instance v1, Lcom/whatsapp/MediaData;

    invoke-direct {v1}, Lcom/whatsapp/MediaData;-><init>()V

    .line 122
    iput-object p1, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 90
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 120
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x50

    invoke-virtual {v0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 54
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 79
    new-instance v2, Lcom/whatsapp/sz;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v4, v4, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;[BLjava/lang/Object;)V

    sput-object v2, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 145
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iput v6, v0, Lcom/whatsapp/sz;->h:I

    .line 5
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iput-byte v6, v0, Lcom/whatsapp/sz;->l:B

    .line 136
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v2, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 133
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/sz;->m:J

    .line 64
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iput v6, v0, Lcom/whatsapp/sz;->a:I

    goto :goto_1
.end method

.method static a(Ljava/io/File;Ljava/io/File;)V
    .locals 7
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 55
    const/4 v2, 0x0

    .line 58
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 38
    const/16 v4, 0x1000

    new-array v4, v4, [B

    .line 47
    :cond_0
    const/4 v5, 0x0

    array-length v6, v4

    invoke-virtual {v1, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-ltz v5, :cond_1

    .line 65
    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    add-int/2addr v0, v5

    if-eqz v3, :cond_0

    .line 119
    :cond_1
    if-eqz v1, :cond_2

    .line 61
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 8
    :cond_2
    return-void

    .line 67
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_3

    .line 118
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_3
    throw v0

    .line 67
    :catchall_1
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 7
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x1

    const/4 v6, 0x0

    .line 43
    if-nez p2, :cond_1

    .line 147
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    if-ne p1, v0, :cond_2

    .line 140
    :try_start_0
    invoke-static {}, Lcom/whatsapp/j5;->b()Ljava/io/File;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/whatsapp/BroadcastMediaPicker;->a(Landroid/content/Intent;Ljava/io/File;)V

    .line 28
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/BroadcastMediaPicker;->setResult(ILandroid/content/Intent;)V

    .line 33
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/whatsapp/dg; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    .line 1
    :catch_0
    move-exception v0

    .line 87
    :try_start_1
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_0

    .line 97
    :catch_1
    move-exception v0

    .line 72
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 146
    const v0, 0x7f0901f7

    invoke-static {p0, v0, v6}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 10
    :goto_1
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    goto :goto_0

    .line 3
    :catch_2
    move-exception v0

    .line 121
    const/4 v0, 0x0

    :try_start_2
    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMediaPicker;->showDialog(I)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_0

    .line 108
    :catch_3
    move-exception v0

    .line 135
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 6
    const v0, 0x7f0901f7

    invoke-static {p0, v0, v6}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    goto :goto_1

    .line 24
    :catch_4
    move-exception v0

    .line 73
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 130
    sget-object v1, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 134
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/BroadcastMediaPicker;->setResult(ILandroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    goto :goto_0

    .line 84
    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    .line 31
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 63
    invoke-static {v0}, Lcom/whatsapp/BroadcastMediaPicker;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    .line 98
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/BroadcastMediaPicker;->f:Ljava/lang/String;

    .line 60
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whatsapp/BroadcastMediaPicker;->f:Ljava/lang/String;

    invoke-static {p0, v0, v1, v2}, Lcom/whatsapp/BroadcastMediaPicker;->a(Landroid/content/Context;Ljava/io/File;BLjava/lang/String;)V

    .line 52
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/BroadcastMediaPicker;->setResult(ILandroid/content/Intent;)V

    .line 13
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    goto :goto_0

    .line 69
    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 57
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 68
    invoke-static {v0}, Lcom/whatsapp/BroadcastMediaPicker;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    .line 77
    const/4 v1, 0x3

    invoke-static {v1}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/BroadcastMediaPicker;->f:Ljava/lang/String;

    .line 88
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whatsapp/BroadcastMediaPicker;->f:Ljava/lang/String;

    invoke-static {p0, v0, v1, v2}, Lcom/whatsapp/BroadcastMediaPicker;->a(Landroid/content/Context;Ljava/io/File;BLjava/lang/String;)V

    .line 49
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/BroadcastMediaPicker;->setResult(ILandroid/content/Intent;)V

    .line 15
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    goto/16 :goto_0

    .line 56
    :cond_4
    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    .line 29
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    .line 104
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    sget-object v3, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    aput-object v3, v2, v0

    const/4 v0, 0x1

    sget-object v3, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    aput-object v3, v2, v0

    const/4 v0, 0x2

    sget-object v3, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    aput-object v3, v2, v0

    .line 123
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 89
    new-instance v1, Lg;

    invoke-direct {v1, p0}, Lg;-><init>(Landroid/content/Context;)V

    .line 92
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 9
    sget-object v2, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 114
    iget-object v3, v1, Lg;->c:Lj;

    sget-object v4, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lj;->a:Ljava/lang/String;

    .line 27
    invoke-virtual {v1, v2}, Lg;->c(Ljava/lang/String;)V

    .line 66
    sget-object v3, Lcom/whatsapp/BroadcastMediaPicker;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_5

    .line 40
    invoke-virtual {v1, v2}, Lg;->d(Ljava/lang/String;)V

    .line 14
    :cond_5
    invoke-virtual {v1, v2}, Lg;->e(Ljava/lang/String;)V

    .line 117
    invoke-virtual {v1, v2}, Lg;->f(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1, v2}, Lg;->g(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v1, v2}, Lg;->h(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v1, v2}, Lg;->i(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v1, v2}, Lg;->j(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v1, v2}, Lg;->k(Ljava/lang/String;)V

    .line 113
    :cond_6
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 2
    new-instance v0, Lm;

    invoke-direct {v0}, Lm;-><init>()V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 83
    const/4 v2, 0x2

    :try_start_4
    invoke-virtual {v0, v1, v2}, Lm;->a(Lg;I)Ljava/lang/String;

    move-result-object v0

    .line 132
    new-instance v2, Lcom/whatsapp/sz;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v4, v4, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v0, v4}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v2, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 53
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    const/4 v2, 0x0

    iput v2, v0, Lcom/whatsapp/sz;->h:I

    .line 128
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    const/4 v2, 0x4

    iput-byte v2, v0, Lcom/whatsapp/sz;->l:B

    .line 50
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    iget-object v1, v1, Lg;->c:Lj;

    iget-object v1, v1, Lj;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 39
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/BroadcastMediaPicker;->setResult(ILandroid/content/Intent;)V
    :try_end_4
    .catch Lb; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 23
    :goto_2
    :try_start_5
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    goto/16 :goto_0

    .line 74
    :catch_5
    move-exception v0

    .line 82
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 112
    const v0, 0x7f09022f

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_2
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    const v2, 0x7f0d00b7

    const/4 v1, 0x1

    .line 70
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    invoke-virtual {p0, v1}, Lcom/whatsapp/BroadcastMediaPicker;->requestWindowFeature(I)Z

    .line 141
    const v0, 0x7f03004d

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMediaPicker;->setContentView(I)V

    .line 36
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-nez v0, :cond_0

    .line 129
    invoke-virtual {p0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    .line 124
    :goto_0
    return-void

    .line 35
    :cond_0
    invoke-virtual {p0, v2}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 11
    invoke-virtual {p0, v2}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 96
    invoke-virtual {p0, v2}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ji;

    invoke-direct {v1, p0}, Lcom/whatsapp/ji;-><init>(Lcom/whatsapp/BroadcastMediaPicker;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    const v0, 0x7f0d00b8

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ki;

    invoke-direct {v1, p0}, Lcom/whatsapp/ki;-><init>(Lcom/whatsapp/BroadcastMediaPicker;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    const v0, 0x7f0d00b9

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/li;

    invoke-direct {v1, p0}, Lcom/whatsapp/li;-><init>(Lcom/whatsapp/BroadcastMediaPicker;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    const v0, 0x7f0d00ba

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/mi;

    invoke-direct {v1, p0}, Lcom/whatsapp/mi;-><init>(Lcom/whatsapp/BroadcastMediaPicker;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    const v0, 0x7f0d00bb

    invoke-virtual {p0, v0}, Lcom/whatsapp/BroadcastMediaPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ni;

    invoke-direct {v1, p0}, Lcom/whatsapp/ni;-><init>(Lcom/whatsapp/BroadcastMediaPicker;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter

    .prologue
    .line 144
    packed-switch p1, :pswitch_data_0

    .line 51
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 25
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0902d6

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/oi;

    invoke-direct {v2, p0}, Lcom/whatsapp/oi;-><init>(Lcom/whatsapp/BroadcastMediaPicker;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 144
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
