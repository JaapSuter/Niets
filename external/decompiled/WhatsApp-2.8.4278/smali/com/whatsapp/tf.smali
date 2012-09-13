.class public final enum Lcom/whatsapp/tf;
.super Ljava/lang/Enum;
.source "tf.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/whatsapp/tf;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/whatsapp/tf;

.field public static final enum b:Lcom/whatsapp/tf;

.field private static final c:[Lcom/whatsapp/tf;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    const/16 v2, 0x32

    const/16 v3, 0x19

    const/4 v1, 0x2

    const/4 v10, 0x1

    const/4 v7, 0x0

    new-array v8, v1, [Ljava/lang/String;

    const-string v0, "sC\u001f~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v4, v0

    move v5, v4

    move v6, v7

    move-object v4, v0

    :goto_0
    if-gt v5, v6, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v8, v7

    const-string v0, "lG\u0005"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v4, v0

    move v5, v4

    move v6, v7

    move-object v4, v0

    :goto_1
    if-gt v5, v6, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v8, v10

    sput-object v8, Lcom/whatsapp/tf;->z:[Ljava/lang/String;

    .line 6
    new-instance v0, Lcom/whatsapp/tf;

    sget-object v2, Lcom/whatsapp/tf;->z:[Ljava/lang/String;

    aget-object v2, v2, v10

    invoke-direct {v0, v2, v7}, Lcom/whatsapp/tf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/tf;->a:Lcom/whatsapp/tf;

    .line 1
    new-instance v0, Lcom/whatsapp/tf;

    sget-object v2, Lcom/whatsapp/tf;->z:[Ljava/lang/String;

    aget-object v2, v2, v7

    invoke-direct {v0, v2, v10}, Lcom/whatsapp/tf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/tf;->b:Lcom/whatsapp/tf;

    .line 3
    new-array v0, v1, [Lcom/whatsapp/tf;

    sget-object v1, Lcom/whatsapp/tf;->a:Lcom/whatsapp/tf;

    aput-object v1, v0, v7

    sget-object v1, Lcom/whatsapp/tf;->b:Lcom/whatsapp/tf;

    aput-object v1, v0, v10

    sput-object v0, Lcom/whatsapp/tf;->c:[Lcom/whatsapp/tf;

    return-void

    .line -1
    :cond_0
    aget-char v9, v4, v6

    rem-int/lit8 v0, v6, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v3

    :goto_2
    xor-int/2addr v0, v9

    int-to-char v0, v0

    aput-char v0, v4, v6

    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x35

    goto :goto_2

    :pswitch_1
    move v0, v1

    goto :goto_2

    :pswitch_2
    const/16 v0, 0x56

    goto :goto_2

    :pswitch_3
    move v0, v2

    goto :goto_2

    :cond_1
    aget-char v9, v4, v6

    rem-int/lit8 v0, v6, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v3

    :goto_3
    xor-int/2addr v0, v9

    int-to-char v0, v0

    aput-char v0, v4, v6

    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x35

    goto :goto_3

    :pswitch_5
    move v0, v1

    goto :goto_3

    :pswitch_6
    const/16 v0, 0x56

    goto :goto_3

    :pswitch_7
    move v0, v2

    goto :goto_3

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
    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/whatsapp/tf;
    .locals 1
    .parameter

    .prologue
    .line 2
    const-class v0, Lcom/whatsapp/tf;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/tf;

    return-object v0
.end method

.method public static a()[Lcom/whatsapp/tf;
    .locals 1

    .prologue
    .line 5
    sget-object v0, Lcom/whatsapp/tf;->c:[Lcom/whatsapp/tf;

    invoke-virtual {v0}, [Lcom/whatsapp/tf;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whatsapp/tf;

    return-object v0
.end method
