.class public final enum Lcom/whatsapp/billing/b;
.super Ljava/lang/Enum;
.source "b.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/whatsapp/billing/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/whatsapp/billing/b;

.field public static final enum b:Lcom/whatsapp/billing/b;

.field public static final enum c:Lcom/whatsapp/billing/b;

.field private static final d:[Lcom/whatsapp/billing/b;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    const/16 v2, 0x27

    const/16 v1, 0xd

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "t\u0017Cdn{\u0013I"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v3, v0

    move v4, v3

    move v5, v6

    move-object v3, v0

    :goto_0
    if-gt v4, v5, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v6

    const-string v0, "e\u0013Kres\u0013I"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v3, v0

    move v4, v3

    move v5, v6

    move-object v3, v0

    :goto_1
    if-gt v4, v5, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v9

    const-string v0, "g\u0003_dcv\u0005Hc"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v3, v0

    move v4, v3

    move v5, v6

    move-object v3, v0

    :goto_2
    if-gt v4, v5, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v10

    sput-object v7, Lcom/whatsapp/billing/b;->z:[Ljava/lang/String;

    .line 11
    new-instance v0, Lcom/whatsapp/billing/b;

    sget-object v1, Lcom/whatsapp/billing/b;->z:[Ljava/lang/String;

    aget-object v1, v1, v10

    invoke-direct {v0, v1, v6}, Lcom/whatsapp/billing/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/billing/b;->a:Lcom/whatsapp/billing/b;

    .line 1
    new-instance v0, Lcom/whatsapp/billing/b;

    sget-object v1, Lcom/whatsapp/billing/b;->z:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-direct {v0, v1, v9}, Lcom/whatsapp/billing/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/billing/b;->b:Lcom/whatsapp/billing/b;

    .line 10
    new-instance v0, Lcom/whatsapp/billing/b;

    sget-object v1, Lcom/whatsapp/billing/b;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-direct {v0, v1, v10}, Lcom/whatsapp/billing/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/billing/b;->c:Lcom/whatsapp/billing/b;

    .line 2
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/whatsapp/billing/b;

    sget-object v1, Lcom/whatsapp/billing/b;->a:Lcom/whatsapp/billing/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/whatsapp/billing/b;->b:Lcom/whatsapp/billing/b;

    aput-object v1, v0, v9

    sget-object v1, Lcom/whatsapp/billing/b;->c:Lcom/whatsapp/billing/b;

    aput-object v1, v0, v10

    sput-object v0, Lcom/whatsapp/billing/b;->d:[Lcom/whatsapp/billing/b;

    return-void

    .line -1
    :cond_0
    aget-char v8, v3, v5

    rem-int/lit8 v0, v5, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2b

    :goto_3
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v3, v5

    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x37

    goto :goto_3

    :pswitch_1
    const/16 v0, 0x56

    goto :goto_3

    :pswitch_2
    move v0, v1

    goto :goto_3

    :pswitch_3
    move v0, v2

    goto :goto_3

    :cond_1
    aget-char v8, v3, v5

    rem-int/lit8 v0, v5, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x2b

    :goto_4
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v3, v5

    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x37

    goto :goto_4

    :pswitch_5
    const/16 v0, 0x56

    goto :goto_4

    :pswitch_6
    move v0, v1

    goto :goto_4

    :pswitch_7
    move v0, v2

    goto :goto_4

    :cond_2
    aget-char v8, v3, v5

    rem-int/lit8 v0, v5, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x2b

    :goto_5
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v3, v5

    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x37

    goto :goto_5

    :pswitch_9
    const/16 v0, 0x56

    goto :goto_5

    :pswitch_a
    move v0, v1

    goto :goto_5

    :pswitch_b
    move v0, v2

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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(I)Lcom/whatsapp/billing/b;
    .locals 2
    .parameter

    .prologue
    .line 6
    invoke-static {}, Lcom/whatsapp/billing/b;->a()[Lcom/whatsapp/billing/b;

    move-result-object v0

    .line 3
    if-ltz p0, :cond_0

    array-length v1, v0

    if-lt p0, v1, :cond_1

    .line 9
    :cond_0
    sget-object v0, Lcom/whatsapp/billing/b;->b:Lcom/whatsapp/billing/b;

    :goto_0
    return-object v0

    .line 4
    :cond_1
    aget-object v0, v0, p0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Lcom/whatsapp/billing/b;
    .locals 1
    .parameter

    .prologue
    .line 7
    const-class v0, Lcom/whatsapp/billing/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/billing/b;

    return-object v0
.end method

.method public static a()[Lcom/whatsapp/billing/b;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/whatsapp/billing/b;->d:[Lcom/whatsapp/billing/b;

    invoke-virtual {v0}, [Lcom/whatsapp/billing/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whatsapp/billing/b;

    return-object v0
.end method
