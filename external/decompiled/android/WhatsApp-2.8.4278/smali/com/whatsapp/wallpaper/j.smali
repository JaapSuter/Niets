.class public final Lcom/whatsapp/wallpaper/j;
.super Ljava/lang/Object;
.source "j.java"


# static fields
.field public static final a:Ljava/lang/String;

.field private static final z:[Ljava/lang/String;


# instance fields
.field public b:J

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field private f:I

.field public g:D

.field public h:D

.field public i:J

.field public j:Z

.field public k:J

.field public l:J

.field public m:I

.field public n:I

.field public o:I

.field public p:F

.field public q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    const/16 v3, 0x32

    const/16 v1, 0x2f

    const/16 v2, 0x26

    const/4 v10, 0x1

    const/4 v5, 0x0

    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "%\u001bKC]|"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v4, v0

    move v6, v4

    move v7, v5

    move-object v4, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v8, v5

    const-string v0, ":\u0016"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v4, v0

    move v6, v5

    move v5, v4

    move-object v4, v0

    :goto_1
    if-gt v5, v6, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v8, v10

    sput-object v8, Lcom/whatsapp/wallpaper/j;->z:[Ljava/lang/String;

    .line 6
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/whatsapp/wallpaper/j;->z:[Ljava/lang/String;

    aget-object v1, v1, v10

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whatsapp/wallpaper/j;->a:Ljava/lang/String;

    return-void

    .line -1
    :cond_0
    aget-char v9, v4, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v3

    :goto_2
    xor-int/2addr v0, v9

    int-to-char v0, v0

    aput-char v0, v4, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x53

    goto :goto_2

    :pswitch_1
    const/16 v0, 0x72

    goto :goto_2

    :pswitch_2
    move v0, v1

    goto :goto_2

    :pswitch_3
    move v0, v2

    goto :goto_2

    :cond_1
    aget-char v7, v4, v6

    rem-int/lit8 v0, v6, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v3

    :goto_3
    xor-int/2addr v0, v7

    int-to-char v0, v0

    aput-char v0, v4, v6

    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x53

    goto :goto_3

    :pswitch_5
    const/16 v0, 0x72

    goto :goto_3

    :pswitch_6
    move v0, v1

    goto :goto_3

    :pswitch_7
    move v0, v2

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

.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/wallpaper/j;->f:I

    .line 5
    iput-wide v2, p0, Lcom/whatsapp/wallpaper/j;->i:J

    .line 15
    iput-boolean v1, p0, Lcom/whatsapp/wallpaper/j;->j:Z

    .line 12
    iput-wide v2, p0, Lcom/whatsapp/wallpaper/j;->k:J

    .line 9
    iput-wide v2, p0, Lcom/whatsapp/wallpaper/j;->l:J

    .line 11
    iput v1, p0, Lcom/whatsapp/wallpaper/j;->n:I

    .line 10
    iput v1, p0, Lcom/whatsapp/wallpaper/j;->o:I

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/whatsapp/wallpaper/j;->c:Ljava/lang/String;

    .line 3
    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 7
    iget v1, p0, Lcom/whatsapp/wallpaper/j;->f:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 14
    iget-object v1, p0, Lcom/whatsapp/wallpaper/j;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whatsapp/wallpaper/j;->e:Ljava/lang/String;

    sget-object v2, Lcom/whatsapp/wallpaper/j;->z:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lcom/whatsapp/wallpaper/j;->f:I

    .line 1
    :cond_1
    iget v0, p0, Lcom/whatsapp/wallpaper/j;->f:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/wallpaper/j;->c:Ljava/lang/String;

    return-object v0
.end method
