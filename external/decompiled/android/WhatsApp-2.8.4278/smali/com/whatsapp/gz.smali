.class public Lcom/whatsapp/gz;
.super Ljava/lang/Object;
.source "gz.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/String;

.field public b:[B

.field public c:[B

.field public d:I

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v3, 0x63

    const/16 v1, 0x36

    const/16 v2, 0x15

    const/4 v4, 0x2

    const/4 v6, 0x0

    new-array v9, v4, [Ljava/lang/String;

    const-string v0, "_x\u0002\rg"

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

    const/4 v8, 0x1

    const-string v0, "Fg\u0006\u001ckSb"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/gz;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    move v0, v3

    goto :goto_2

    :pswitch_3
    const/16 v0, 0x6a

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    move v0, v3

    goto :goto_3

    :pswitch_7
    const/16 v0, 0x6a

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

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/whatsapp/gz;->a:Ljava/lang/String;

    .line 12
    iput p2, p0, Lcom/whatsapp/gz;->d:I

    .line 16
    iput p3, p0, Lcom/whatsapp/gz;->e:I

    .line 3
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B[BI)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whatsapp/gz;->a:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/whatsapp/gz;->b:[B

    .line 7
    iput-object p3, p0, Lcom/whatsapp/gz;->c:[B

    .line 8
    iput p4, p0, Lcom/whatsapp/gz;->d:I

    .line 1
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 11
    iget v0, p0, Lcom/whatsapp/gz;->e:I

    if-ne v0, v3, :cond_0

    .line 2
    sget-object v0, Lcom/whatsapp/gz;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    .line 14
    :goto_0
    return-object v0

    .line 6
    :cond_0
    iget v0, p0, Lcom/whatsapp/gz;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 14
    sget-object v0, Lcom/whatsapp/gz;->z:[Ljava/lang/String;

    aget-object v0, v0, v3

    goto :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/whatsapp/gz;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    goto :goto_0
.end method
