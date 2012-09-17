.class public Lcom/whatsapp/t4;
.super Ljava/lang/Object;
.source "t4.java"


# static fields
.field private static final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u001a\u0019~\u0008I.\u0004c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/t4;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x4

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x63

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x60

    goto :goto_1

    :pswitch_2
    const/4 v0, 0x7

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x71

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static a(JJ)I
    .locals 8
    .parameter
    .parameter

    .prologue
    const-wide/32 v6, 0x5265c00

    const-wide/16 v4, 0x3e8

    .line 55
    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    .line 16
    invoke-virtual {v0, p0, p1}, Landroid/text/format/Time;->set(J)V

    .line 15
    iget-wide v1, v0, Landroid/text/format/Time;->gmtoff:J

    mul-long/2addr v1, v4

    add-long/2addr v1, p0

    div-long/2addr v1, v6

    long-to-int v1, v1

    .line 10
    invoke-virtual {v0, p2, p3}, Landroid/text/format/Time;->set(J)V

    .line 27
    iget-wide v2, v0, Landroid/text/format/Time;->gmtoff:J

    mul-long/2addr v2, v4

    add-long/2addr v2, p2

    div-long/2addr v2, v6

    long-to-int v0, v2

    .line 5
    sub-int v0, v1, v0

    return v0
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 21
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 25
    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v2, Lcom/whatsapp/t4;->z:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(J)Ljava/lang/String;
    .locals 12
    .parameter

    .prologue
    const v11, 0x7f0b0001

    const/high16 v10, 0x7f0b

    const-wide/16 v8, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 49
    const-wide/32 v0, 0x36ee80

    div-long v2, p0, v0

    .line 39
    const-wide/32 v0, 0x36ee80

    mul-long/2addr v0, v2

    sub-long v0, p0, v0

    const-wide/32 v4, 0xea60

    div-long/2addr v0, v4

    .line 37
    cmp-long v4, v2, v8

    if-nez v4, :cond_1

    .line 42
    cmp-long v2, v0, v8

    if-nez v2, :cond_0

    .line 11
    const-wide/16 v0, 0x1

    .line 26
    :cond_0
    sget-object v2, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    long-to-int v3, v0

    invoke-virtual {v2, v11, v3}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v6

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 28
    :goto_0
    return-object v0

    .line 1
    :cond_1
    cmp-long v4, v0, v8

    if-nez v4, :cond_2

    .line 23
    sget-object v0, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    long-to-int v1, v2

    invoke-virtual {v0, v10, v1}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v0

    new-array v1, v7, [Ljava/lang/Object;

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 30
    :cond_2
    sget-object v4, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    long-to-int v5, v0

    invoke-virtual {v4, v11, v5}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 51
    sget-object v1, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    long-to-int v4, v2

    invoke-virtual {v1, v10, v4}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v1

    new-array v4, v7, [Ljava/lang/Object;

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v6

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 28
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v3, 0x7f090091

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v6

    aput-object v0, v4, v7

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;J)Ljava/lang/String;
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/whatsapp/t4;->a(JJ)I

    move-result v1

    .line 35
    const v0, 0x80001

    .line 54
    if-lez v1, :cond_1

    .line 45
    const/4 v2, 0x7

    if-ge v1, v2, :cond_0

    .line 2
    const v0, 0x80003

    sget v1, Lcom/whatsapp/g5;->n:I

    if-eqz v1, :cond_1

    .line 17
    :cond_0
    or-int/lit8 v0, v0, 0x10

    .line 19
    :cond_1
    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 29
    const v0, 0x80001

    .line 12
    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(J)Z
    .locals 2
    .parameter

    .prologue
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p0, p1}, Lcom/whatsapp/t4;->a(JJ)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(JJ)Z
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x5

    const/4 v5, 0x2

    const/4 v0, 0x1

    .line 14
    new-instance v1, Ljava/util/GregorianCalendar;

    invoke-direct {v1}, Ljava/util/GregorianCalendar;-><init>()V

    .line 57
    invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 56
    new-instance v2, Ljava/util/GregorianCalendar;

    invoke-direct {v2}, Ljava/util/GregorianCalendar;-><init>()V

    .line 22
    invoke-virtual {v2, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 8
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v2, v6}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 59
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 52
    const v0, 0x80011

    .line 43
    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;J)Ljava/lang/String;
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/whatsapp/t4;->a(JJ)I

    move-result v0

    .line 4
    if-gt v0, v2, :cond_1

    .line 50
    invoke-static {p0, p1, p2}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    .line 9
    if-nez v0, :cond_0

    .line 32
    const v0, 0x7f0900e9

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 47
    :goto_0
    return-object v0

    .line 6
    :cond_0
    if-ne v0, v2, :cond_1

    .line 47
    const v0, 0x7f0900eb

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/whatsapp/t4;->i(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;J)Ljava/lang/String;
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/whatsapp/t4;->a(JJ)I

    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 48
    invoke-static {p0, p1, p2}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 13
    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 7
    const v0, 0x7f0900ec

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/whatsapp/t4;->h(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static f(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 33
    invoke-static {p0, p1, p2}, Lcom/whatsapp/t4;->h(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 40
    const/16 v0, 0x9

    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 41
    const v0, 0x20014

    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static i(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 34
    const v0, 0x20015

    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static j(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 36
    const/16 v0, 0x14

    .line 31
    invoke-static {p0, p1, p2, v0}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
