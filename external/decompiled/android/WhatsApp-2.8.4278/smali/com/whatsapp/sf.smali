.class public final enum Lcom/whatsapp/sf;
.super Ljava/lang/Enum;
.source "sf.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/whatsapp/sf;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/whatsapp/sf;

.field public static final enum b:Lcom/whatsapp/sf;

.field private static final c:[Lcom/whatsapp/sf;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    const/16 v1, 0xb

    const/4 v2, 0x5

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v6, 0x0

    new-array v7, v10, [Ljava/lang/String;

    const-string v0, "M\u0017\u007fWZE\u0019iZFH\u0019cUQ"

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

    const-string v0, "M\u0017\u007fWZ^\u0005sIZI\u001ayXNN\u0012"

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

    sput-object v7, Lcom/whatsapp/sf;->z:[Ljava/lang/String;

    .line 3
    new-instance v0, Lcom/whatsapp/sf;

    sget-object v1, Lcom/whatsapp/sf;->z:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-direct {v0, v1, v6}, Lcom/whatsapp/sf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/sf;->a:Lcom/whatsapp/sf;

    .line 6
    new-instance v0, Lcom/whatsapp/sf;

    sget-object v1, Lcom/whatsapp/sf;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-direct {v0, v1, v9}, Lcom/whatsapp/sf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whatsapp/sf;->b:Lcom/whatsapp/sf;

    .line 2
    new-array v0, v10, [Lcom/whatsapp/sf;

    sget-object v1, Lcom/whatsapp/sf;->a:Lcom/whatsapp/sf;

    aput-object v1, v0, v6

    sget-object v1, Lcom/whatsapp/sf;->b:Lcom/whatsapp/sf;

    aput-object v1, v0, v9

    sput-object v0, Lcom/whatsapp/sf;->c:[Lcom/whatsapp/sf;

    return-void

    .line -1
    :cond_0
    aget-char v8, v3, v5

    rem-int/lit8 v0, v5, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v2

    :goto_2
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v3, v5

    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    const/16 v0, 0x56

    goto :goto_2

    :pswitch_2
    const/16 v0, 0x36

    goto :goto_2

    :pswitch_3
    const/16 v0, 0x1b

    goto :goto_2

    :cond_1
    aget-char v8, v3, v5

    rem-int/lit8 v0, v5, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v2

    :goto_3
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v3, v5

    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    const/16 v0, 0x56

    goto :goto_3

    :pswitch_6
    const/16 v0, 0x36

    goto :goto_3

    :pswitch_7
    const/16 v0, 0x1b

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
    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/whatsapp/sf;
    .locals 1
    .parameter

    .prologue
    .line 5
    const-class v0, Lcom/whatsapp/sf;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sf;

    return-object v0
.end method

.method public static a()[Lcom/whatsapp/sf;
    .locals 1

    .prologue
    .line 4
    sget-object v0, Lcom/whatsapp/sf;->c:[Lcom/whatsapp/sf;

    invoke-virtual {v0}, [Lcom/whatsapp/sf;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whatsapp/sf;

    return-object v0
.end method
