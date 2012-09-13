.class public Lcom/whatsapp/tz;
.super Ljava/lang/Object;
.source "tz.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Lcom/whatsapp/sz;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/String;

.field private h:[B

.field private i:Ljava/lang/Integer;

.field private j:Ljava/lang/Long;

.field private k:Ljava/lang/Boolean;

.field private l:Ljava/lang/Byte;

.field private m:Ljava/lang/Long;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/Integer;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/Double;

.field private t:Ljava/lang/Double;

.field private u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\"g\rD+!i^E\'>{\u0017E\'+.\u000eE-?k\u000cC;ol\u001bQ-=k^^,<z\u001fY6&o\n^,(.\u0010R5og\u0010T-\"g\u0010Pb\"k\rD#(k"

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

    sput-object v0, Lcom/whatsapp/tz;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x42

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x4f

    goto :goto_1

    :pswitch_1
    const/16 v0, 0xe

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x7e

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x37

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(B)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 39
    new-instance v0, Ljava/lang/Byte;

    invoke-direct {v0, p1}, Ljava/lang/Byte;-><init>(B)V

    iput-object v0, p0, Lcom/whatsapp/tz;->l:Ljava/lang/Byte;

    .line 26
    return-object p0
.end method

.method public a(I)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 72
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/tz;->i:Ljava/lang/Integer;

    .line 46
    return-object p0
.end method

.method public a(J)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 40
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    iput-object v0, p0, Lcom/whatsapp/tz;->j:Ljava/lang/Long;

    .line 12
    return-object p0
.end method

.method public a(Lcom/whatsapp/uz;)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 2
    iget-object v0, p1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/whatsapp/tz;->b:Ljava/lang/String;

    .line 14
    iget-boolean v0, p1, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    iput-object v0, p0, Lcom/whatsapp/tz;->d:Ljava/lang/Boolean;

    .line 54
    iget-object v0, p1, Lcom/whatsapp/uz;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/whatsapp/tz;->e:Ljava/lang/String;

    .line 81
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method public a(Ljava/lang/Boolean;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 55
    iput-object p1, p0, Lcom/whatsapp/tz;->k:Ljava/lang/Boolean;

    .line 19
    return-object p0
.end method

.method public a(Ljava/lang/Double;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 82
    iput-object p1, p0, Lcom/whatsapp/tz;->s:Ljava/lang/Double;

    .line 51
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 37
    iput-object p1, p0, Lcom/whatsapp/tz;->c:Ljava/lang/String;

    .line 68
    return-object p0
.end method

.method public a(Z)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 41
    if-eqz p1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    iput-object v0, p0, Lcom/whatsapp/tz;->f:Ljava/lang/Boolean;

    .line 69
    return-object p0

    .line 41
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method public a([B)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 24
    iput-object p1, p0, Lcom/whatsapp/tz;->h:[B

    .line 45
    return-object p0
.end method

.method public a()Ljava/lang/Byte;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/tz;->l:Ljava/lang/Byte;

    return-object v0
.end method

.method public b()Lcom/whatsapp/tz;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation

    .prologue
    .line 21
    iget-object v0, p0, Lcom/whatsapp/tz;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/tz;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/tz;->e:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    sget-object v1, Lcom/whatsapp/tz;->z:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_1
    new-instance v0, Lcom/whatsapp/sz;

    new-instance v1, Lcom/whatsapp/uz;

    iget-object v2, p0, Lcom/whatsapp/tz;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/tz;->d:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/tz;->e:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/whatsapp/uz;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/whatsapp/sz;-><init>(Lcom/whatsapp/uz;)V

    iput-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    .line 4
    return-object p0
.end method

.method public b(I)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 7
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/tz;->o:Ljava/lang/Integer;

    .line 74
    return-object p0
.end method

.method public b(J)Lcom/whatsapp/tz;
    .locals 1
    .parameter

    .prologue
    .line 52
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    iput-object v0, p0, Lcom/whatsapp/tz;->m:Ljava/lang/Long;

    .line 6
    return-object p0
.end method

.method public b(Ljava/lang/Double;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/tz;->t:Ljava/lang/Double;

    .line 29
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 61
    iput-object p1, p0, Lcom/whatsapp/tz;->g:Ljava/lang/String;

    .line 78
    return-object p0
.end method

.method public c()Lcom/whatsapp/sz;
    .locals 5

    .prologue
    .line 18
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    if-nez v0, :cond_0

    .line 47
    const/4 v0, 0x0

    .line 58
    :goto_0
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/tz;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/tz;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/tz;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    new-instance v1, Lcom/whatsapp/uz;

    iget-object v2, p0, Lcom/whatsapp/tz;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/tz;->d:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v4, p0, Lcom/whatsapp/tz;->e:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/whatsapp/uz;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    iput-object v1, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/tz;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 66
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    .line 3
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/tz;->f:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->f:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Lcom/whatsapp/sz;->e:Z

    .line 36
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/tz;->g:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 63
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/sz;->b(Ljava/lang/String;)V

    .line 22
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/tz;->h:[B

    if-eqz v0, :cond_5

    .line 17
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->h:[B

    invoke-virtual {v0, v1}, Lcom/whatsapp/sz;->a([B)V

    .line 13
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/tz;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_6

    .line 67
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->i:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/whatsapp/sz;->h:I

    .line 65
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/tz;->j:Ljava/lang/Long;

    if-eqz v0, :cond_7

    .line 16
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->j:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/sz;->i:J

    .line 23
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/tz;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    .line 49
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->k:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Lcom/whatsapp/sz;->v:Z

    .line 70
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/tz;->l:Ljava/lang/Byte;

    if-eqz v0, :cond_9

    .line 32
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->l:Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    iput-byte v1, v0, Lcom/whatsapp/sz;->l:B

    .line 44
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/tz;->m:Ljava/lang/Long;

    if-eqz v0, :cond_a

    .line 42
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->m:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/sz;->m:J

    .line 71
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/tz;->n:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 48
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->n:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->n:Ljava/lang/String;

    .line 50
    :cond_b
    iget-object v0, p0, Lcom/whatsapp/tz;->o:Ljava/lang/Integer;

    if-eqz v0, :cond_c

    .line 35
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->o:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/whatsapp/sz;->o:I

    .line 38
    :cond_c
    iget-object v0, p0, Lcom/whatsapp/tz;->p:Ljava/lang/String;

    if-eqz v0, :cond_d

    .line 62
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 27
    :cond_d
    iget-object v0, p0, Lcom/whatsapp/tz;->q:Ljava/lang/String;

    if-eqz v0, :cond_e

    .line 56
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->q:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->k:Ljava/lang/String;

    .line 76
    :cond_e
    iget-object v0, p0, Lcom/whatsapp/tz;->r:Ljava/lang/String;

    if-eqz v0, :cond_f

    .line 20
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->r:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 10
    :cond_f
    iget-object v0, p0, Lcom/whatsapp/tz;->s:Ljava/lang/Double;

    if-eqz v0, :cond_10

    .line 64
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->s:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/sz;->q:D

    .line 11
    :cond_10
    iget-object v0, p0, Lcom/whatsapp/tz;->t:Ljava/lang/Double;

    if-eqz v0, :cond_11

    .line 25
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->t:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/sz;->r:D

    .line 33
    :cond_11
    iget-object v0, p0, Lcom/whatsapp/tz;->u:Ljava/lang/String;

    if-eqz v0, :cond_12

    .line 83
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    iget-object v1, p0, Lcom/whatsapp/tz;->u:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/sz;->s:Ljava/lang/String;

    .line 58
    :cond_12
    iget-object v0, p0, Lcom/whatsapp/tz;->a:Lcom/whatsapp/sz;

    goto/16 :goto_0
.end method

.method public c(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 75
    iput-object p1, p0, Lcom/whatsapp/tz;->n:Ljava/lang/String;

    .line 31
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 80
    iput-object p1, p0, Lcom/whatsapp/tz;->p:Ljava/lang/String;

    .line 34
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 30
    iput-object p1, p0, Lcom/whatsapp/tz;->q:Ljava/lang/String;

    .line 57
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 43
    iput-object p1, p0, Lcom/whatsapp/tz;->r:Ljava/lang/String;

    .line 60
    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/whatsapp/tz;
    .locals 0
    .parameter

    .prologue
    .line 15
    iput-object p1, p0, Lcom/whatsapp/tz;->u:Ljava/lang/String;

    .line 73
    return-object p0
.end method
