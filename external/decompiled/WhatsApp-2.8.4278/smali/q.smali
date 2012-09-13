.class public Lq;
.super Ljava/lang/Object;
.source "q.java"

# interfaces
.implements Lf;


# static fields
.field public static a:Ljava/lang/String;

.field private static final z:[Ljava/lang/String;


# instance fields
.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lr;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Lr;

.field private e:Le;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\\XR*\tI M,\u0005CY\\<\u0000H"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "ih~\u0011(hO|\r);9\'.\u0004BYR"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Klt\u0012)i-i\u0011lhc~\u0011(h7=\u001d$l\u007fn\u001b80"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "\u0000\u0007"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "Klt\u0012)i-i\u0011lih~\u0011(h-l\u000b#yhyS<\u007fds\n-oaxDl"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "0\u0004"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "0-"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "OLN;z9"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "YTM;"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "}\u007fr\u000e)\u007fyd.-\u007flp(-axxQ\"byB\r8b\u007fxD"

    invoke-static {v2}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lq;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lq;->z:[Ljava/lang/String;

    .line 13
    const-string v0, "XY[St"

    .line -1
    invoke-static {v0}, Lq;->z(Ljava/lang/String;)[C

    move-result-object v0

    invoke-static {v0}, Lq;->z([C)Ljava/lang/String;

    move-result-object v0

    .line 13
    sput-object v0, Lq;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 63
    sget-object v0, Lq;->a:Ljava/lang/String;

    sget-object v1, Lq;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lq;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 74
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Le;->g:Z

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lq;->b:Ljava/util/List;

    .line 101
    const/4 v1, 0x0

    iput v1, p0, Lq;->c:I

    .line 33
    if-eqz p1, :cond_0

    .line 64
    iput-object p1, p0, Lq;->g:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 105
    :cond_0
    sget-object v1, Lq;->a:Ljava/lang/String;

    iput-object v1, p0, Lq;->g:Ljava/lang/String;

    .line 11
    :cond_1
    if-eqz p2, :cond_2

    .line 70
    iput-object p2, p0, Lq;->h:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 112
    :cond_2
    sget-object v0, Lq;->a:Ljava/lang/String;

    iput-object v0, p0, Lq;->h:Ljava/lang/String;

    .line 55
    :cond_3
    iput-boolean p3, p0, Lq;->i:Z

    .line 110
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lq;->g:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    :goto_0
    return-object p1

    .line 86
    :cond_0
    iget-object v0, p0, Lq;->g:Ljava/lang/String;

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    .line 118
    invoke-virtual {v0, p1}, Ljava/nio/charset/Charset;->encode(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    .line 38
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 81
    :try_start_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lq;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 119
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v10, 0xa

    const/4 v9, 0x2

    const/4 v3, 0x0

    sget-boolean v4, Le;->g:Z

    .line 36
    if-eqz p3, :cond_a

    .line 76
    sget-object v0, Lq;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "B"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    :cond_0
    sget-object v0, Lq;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lq;->e:Le;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lorg/apache/commons/codec/binary/Base64;->decodeBase64([B)[B

    move-result-object v1

    iput-object v1, v0, Le;->d:[B

    .line 133
    :goto_0
    return-object p1

    .line 42
    :cond_1
    sget-object v0, Lq;->z:[Ljava/lang/String;

    aget-object v0, v0, v3

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 117
    sget-object v0, Lq;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lq;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    const-string v2, "\t"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 127
    iget-boolean v0, p0, Lq;->i:Z

    if-eqz v0, :cond_2

    .line 10
    sget-object v0, Lq;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v4, :cond_7

    .line 75
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    .line 48
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v0, v3

    .line 46
    :goto_1
    if-ge v0, v5, :cond_f

    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 100
    if-ne v7, v10, :cond_3

    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v4, :cond_e

    .line 82
    :cond_3
    const/16 v8, 0xd

    if-ne v7, v8, :cond_5

    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    add-int/lit8 v8, v5, -0x1

    if-ge v0, v8, :cond_d

    .line 6
    add-int/lit8 v8, v0, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 91
    if-ne v8, v10, :cond_4

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 51
    :cond_4
    if-eqz v4, :cond_d

    .line 92
    :cond_5
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v11, v0

    move-object v0, v1

    move v1, v11

    .line 85
    :goto_2
    add-int/lit8 v1, v1, 0x1

    if-eqz v4, :cond_c

    .line 8
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    .line 45
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_6
    new-array v0, v3, [Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 72
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    array-length v6, v0

    move v2, v3

    :goto_4
    if-ge v2, v6, :cond_9

    aget-object v1, v0, v2

    .line 39
    const-string v7, "="

    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v1, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 21
    :cond_8
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    add-int/lit8 v1, v2, 0x1

    if-eqz v4, :cond_b

    .line 89
    :cond_9
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lq;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 31
    :goto_5
    :try_start_1
    invoke-static {v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->decodeQuotedPrintable([B)[B
    :try_end_1
    .catch Lorg/apache/commons/codec/DecoderException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 35
    :try_start_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 22
    :catch_0
    move-exception v1

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lq;->z:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 133
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([B)V

    goto/16 :goto_0

    .line 25
    :catch_1
    move-exception v0

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lq;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lq;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_5

    .line 83
    :catch_2
    move-exception v0

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lq;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 114
    const-string p1, ""

    goto/16 :goto_0

    .line 106
    :cond_a
    invoke-direct {p0, p1, p2}, Lq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_b
    move v2, v1

    goto/16 :goto_4

    :cond_c
    move v11, v1

    move-object v1, v0

    move v0, v11

    goto/16 :goto_1

    :cond_d
    move v11, v0

    move-object v0, v1

    move v1, v11

    goto/16 :goto_2

    :cond_e
    move v11, v0

    move-object v0, v1

    move v1, v11

    goto/16 :goto_2

    :cond_f
    move-object v0, v1

    goto/16 :goto_3
.end method

.method private a(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v5, 0x0

    sget-boolean v1, Le;->g:Z

    .line 124
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 95
    if-le v0, v2, :cond_3

    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    .line 7
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    .line 15
    if-lez v0, :cond_2

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    const/16 v3, 0x3b

    if-ne v1, v3, :cond_2

    .line 41
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v5, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 59
    :goto_0
    return-object v0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 67
    :cond_3
    if-ne v0, v2, :cond_4

    .line 16
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 17
    :cond_4
    const-string v0, ""

    goto :goto_0
.end method

.method private static z([C)Ljava/lang/String;
    .locals 5

    const/16 v1, 0xd

    array-length v0, p0

    const/4 v2, 0x0

    move v3, v2

    move v2, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-char v4, p0, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x4c

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, p0, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_1

    :pswitch_1
    move v0, v1

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x1d

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x7e

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static z(Ljava/lang/String;)[C
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit8 v2, v2, 0x4c

    int-to-char v2, v2

    aput-char v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 90
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x1

    sget-boolean v2, Le;->g:Z

    .line 26
    new-instance v0, Lr;

    invoke-direct {v0}, Lr;-><init>()V

    .line 3
    iput v1, v0, Lr;->c:I

    .line 94
    iput-object p1, v0, Lr;->a:Ljava/lang/String;

    .line 34
    iget-object v3, p0, Lq;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    iget-object v0, p0, Lq;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lq;->c:I

    .line 132
    iget-object v0, p0, Lq;->b:Ljava/util/List;

    iget v3, p0, Lq;->c:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr;

    iput-object v0, p0, Lq;->d:Lr;

    .line 1
    sget v0, Lcom/whatsapp/App;->wc:I

    if-eqz v0, :cond_0

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Le;->g:Z

    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    sget-boolean v2, Le;->g:Z

    .line 4
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 129
    :cond_0
    iget-object v0, p0, Lq;->e:Le;

    iput-object v5, v0, Le;->d:[B

    .line 123
    iget-object v0, p0, Lq;->e:Le;

    iget-object v0, v0, Le;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 109
    iget-object v0, p0, Lq;->e:Le;

    iget-object v0, v0, Le;->c:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v0, p0, Lq;->e:Le;

    const-string v1, ""

    iput-object v1, v0, Le;->b:Ljava/lang/String;

    .line 120
    :goto_0
    return-void

    .line 107
    :cond_1
    sget-object v0, Lq;->a:Ljava/lang/String;

    .line 5
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_5

    .line 49
    :cond_2
    iget-object v0, p0, Lq;->h:Ljava/lang/String;

    move-object v1, v0

    .line 77
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 99
    iget-object v4, p0, Lq;->e:Le;

    iget-object v4, v4, Le;->c:Ljava/util/List;

    invoke-direct {p0, v0, v1, v5}, Lq;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_3

    .line 131
    :cond_4
    iget-object v0, p0, Lq;->e:Le;

    iget-object v1, p0, Lq;->e:Le;

    iget-object v1, v1, Le;->c:Ljava/util/List;

    invoke-direct {p0, v1}, Lq;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Le;->b:Ljava/lang/String;

    goto :goto_0

    :cond_5
    move-object v1, v0

    goto :goto_1
.end method

.method public b()V
    .locals 0

    .prologue
    .line 23
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 108
    iget-object v0, p0, Lq;->e:Le;

    iget-object v0, v0, Le;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lq;->b:Ljava/util/List;

    iget v1, p0, Lq;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr;

    .line 71
    const/4 v1, 0x0

    iput v1, v0, Lr;->c:I

    .line 53
    :cond_0
    iget v0, p0, Lq;->c:I

    if-lez v0, :cond_1

    .line 29
    iget v0, p0, Lq;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lq;->c:I

    .line 121
    iget-object v0, p0, Lq;->b:Ljava/util/List;

    iget v1, p0, Lq;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr;

    iget v0, v0, Lr;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 52
    :cond_1
    iget-object v0, p0, Lq;->b:Ljava/util/List;

    iget v1, p0, Lq;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr;

    iput-object v0, p0, Lq;->d:Lr;

    .line 28
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 24
    iget-object v0, p0, Lq;->e:Le;

    iput-object p1, v0, Le;->a:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 116
    new-instance v0, Le;

    invoke-direct {v0}, Le;-><init>()V

    iput-object v0, p0, Lq;->e:Le;

    .line 47
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 54
    iput-object p1, p0, Lq;->f:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lq;->d:Lr;

    iget-object v0, v0, Lr;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lq;->e:Le;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    .line 9
    iget-object v0, p0, Lq;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq;->f:Ljava/lang/String;

    sget-object v1, Lq;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    :cond_0
    iget-object v0, p0, Lq;->e:Le;

    iget-object v0, v0, Le;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-boolean v0, Le;->g:Z

    if-eqz v0, :cond_2

    .line 96
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lq;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 122
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lq;->f:Ljava/lang/String;

    .line 19
    return-void
.end method
