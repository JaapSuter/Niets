.class public Lcom/whatsapp/lp;
.super Ljava/lang/Object;
.source "lp.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:[I

.field public final e:[I

.field public final f:[Ljava/lang/String;


# direct methods
.method private constructor <init>([Ljava/lang/String;)V
    .locals 7
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    array-length v0, p1

    const/4 v2, 0x7

    if-ge v0, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 37
    :cond_0
    const/4 v0, 0x0

    aget-object v0, p1, v0

    .line 12
    const/4 v2, 0x1

    aget-object v2, p1, v2

    .line 10
    const/4 v3, 0x2

    aget-object v3, p1, v3

    .line 7
    const/4 v4, 0x3

    aget-object v4, p1, v4

    .line 18
    const/4 v5, 0x4

    aget-object v5, p1, v5

    .line 41
    const/4 v6, 0x5

    aget-object v6, p1, v6

    .line 11
    if-eqz v2, :cond_1

    if-nez v3, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 32
    :cond_2
    iput-object v2, p0, Lcom/whatsapp/lp;->a:Ljava/lang/String;

    .line 39
    iput-object v0, p0, Lcom/whatsapp/lp;->b:Ljava/lang/String;

    .line 4
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/lp;->c:I

    .line 2
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    invoke-static {v4}, Lcom/whatsapp/jp;->g(Ljava/lang/String;)[I

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/whatsapp/lp;->d:[I

    .line 34
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    invoke-static {v5}, Lcom/whatsapp/jp;->g(Ljava/lang/String;)[I

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/whatsapp/lp;->e:[I

    .line 14
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    const-string v0, ","

    invoke-static {v6, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-object v1, p0, Lcom/whatsapp/lp;->f:[Ljava/lang/String;

    .line 9
    return-void

    :cond_4
    move-object v0, v1

    .line 2
    goto :goto_0

    :cond_5
    move-object v0, v1

    .line 34
    goto :goto_1
.end method

.method constructor <init>([Ljava/lang/String;Lcom/whatsapp/kp;)V
    .locals 0
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/whatsapp/lp;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 15
    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    array-length v0, v0

    if-nez v0, :cond_2

    :cond_0
    const/16 v1, 0xe

    .line 23
    :cond_1
    :goto_0
    return v1

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    .line 36
    const/4 v0, 0x1

    :cond_3
    iget-object v3, p0, Lcom/whatsapp/lp;->e:[I

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 24
    iget-object v3, p0, Lcom/whatsapp/lp;->e:[I

    aget v3, v3, v0

    if-le v3, v1, :cond_4

    iget-object v1, p0, Lcom/whatsapp/lp;->e:[I

    aget v1, v1, v0

    .line 8
    :cond_4
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_3

    goto :goto_0
.end method

.method public a(I)I
    .locals 5
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 19
    invoke-virtual {p0}, Lcom/whatsapp/lp;->b()I

    move-result v0

    if-ge p1, v0, :cond_1

    const/4 v1, -0x1

    .line 27
    :cond_0
    :goto_0
    return v1

    .line 22
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/lp;->a()I

    move-result v0

    if-le p1, v0, :cond_2

    move v1, v2

    goto :goto_0

    .line 27
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    array-length v0, v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 33
    :cond_3
    iget-object v4, p0, Lcom/whatsapp/lp;->e:[I

    array-length v4, v4

    if-ge v0, v4, :cond_4

    .line 17
    iget-object v4, p0, Lcom/whatsapp/lp;->e:[I

    aget v4, v4, v0

    if-eq v4, p1, :cond_0

    .line 6
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_3

    :cond_4
    move v1, v2

    .line 16
    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move v0, v1

    .line 35
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 29
    iget-object v2, p0, Lcom/whatsapp/lp;->f:[Ljava/lang/String;

    if-nez v2, :cond_2

    .line 38
    :cond_1
    :goto_0
    return-object p1

    :cond_2
    move v2, v1

    move v3, v1

    .line 31
    :cond_3
    iget-object v5, p0, Lcom/whatsapp/lp;->f:[Ljava/lang/String;

    array-length v5, v5

    if-ge v2, v5, :cond_5

    if-nez v3, :cond_5

    .line 20
    iget-object v5, p0, Lcom/whatsapp/lp;->f:[Ljava/lang/String;

    aget-object v5, v5, v2

    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v5, v6, :cond_4

    const/4 v3, 0x1

    .line 26
    :cond_4
    add-int/lit8 v2, v2, 0x1

    if-eqz v4, :cond_3

    .line 38
    :cond_5
    if-nez v3, :cond_6

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 30
    :cond_6
    add-int/lit8 v0, v0, 0x1

    if-eqz v4, :cond_0

    goto :goto_0
.end method

.method public b()I
    .locals 4

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 5
    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    array-length v0, v0

    if-nez v0, :cond_2

    :cond_0
    const/4 v1, 0x5

    .line 21
    :cond_1
    :goto_0
    return v1

    .line 45
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/lp;->e:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    .line 1
    const/4 v0, 0x1

    :cond_3
    iget-object v3, p0, Lcom/whatsapp/lp;->e:[I

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 3
    iget-object v3, p0, Lcom/whatsapp/lp;->e:[I

    aget v3, v3, v0

    if-ge v3, v1, :cond_4

    iget-object v1, p0, Lcom/whatsapp/lp;->e:[I

    aget v1, v1, v0

    .line 43
    :cond_4
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_3

    goto :goto_0
.end method
