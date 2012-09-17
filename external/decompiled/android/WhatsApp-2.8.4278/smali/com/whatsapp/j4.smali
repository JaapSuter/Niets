.class public Lcom/whatsapp/j4;
.super Ljava/lang/Object;
.source "j4.java"


# static fields
.field private static a:Lcom/whatsapp/j4;

.field private static final kb:Ljava/lang/String;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:F

.field public O:F

.field public P:F

.field public Q:F

.field public R:F

.field public S:F

.field public T:F

.field public U:F

.field public V:F

.field public W:I

.field public X:I

.field public Y:I

.field public Z:I

.field public ab:F

.field public b:I

.field public bb:I

.field public c:I

.field public cb:I

.field public d:F

.field public db:I

.field public e:I

.field public eb:I

.field public f:I

.field public fb:I

.field public g:F

.field public gb:I

.field public h:F

.field public hb:I

.field public i:F

.field public ib:I

.field public j:F

.field public jb:I

.field public k:F

.field public l:F

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:F

.field public r:F

.field public s:F

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const-string v0, "5L4M\u00005"

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

    sput-object v0, Lcom/whatsapp/j4;->kb:Ljava/lang/String;

    .line 12
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/j4;->a:Lcom/whatsapp/j4;

    return-void

    .line -1
    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x6f

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x42

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x25

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x5a

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x29

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

.method private constructor <init>(Landroid/content/Context;)V
    .locals 9
    .parameter

    .prologue
    const v8, 0x40aaaaab

    const v7, 0x402aaaab

    const/high16 v6, 0x4000

    const v5, 0x3faaaaab

    const v4, 0x40555555

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/j4;->b:I

    .line 69
    const/4 v0, 0x1

    iput v0, p0, Lcom/whatsapp/j4;->c:I

    .line 62
    const/16 v0, 0xff

    const/16 v1, 0xa3

    const/16 v2, 0xd5

    const/16 v3, 0xfc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/j4;->e:I

    .line 67
    const/16 v0, 0xff

    const/16 v1, 0xd5

    const/16 v2, 0xf4

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/j4;->f:I

    .line 1
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v6

    iput v0, p0, Lcom/whatsapp/j4;->g:F

    .line 74
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/whatsapp/j4;->h:F

    .line 100
    const/16 v0, 0x64

    iput v0, p0, Lcom/whatsapp/j4;->X:I

    .line 18
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/whatsapp/j4;->d:F

    .line 68
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/whatsapp/j4;->i:F

    .line 43
    const/high16 v0, 0x4270

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->j:F

    .line 20
    const v0, 0x412aaaab

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->k:F

    .line 98
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v8

    iput v0, p0, Lcom/whatsapp/j4;->l:F

    .line 39
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->m:I

    .line 103
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->n:I

    .line 90
    const/high16 v0, 0x40a0

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->o:I

    .line 104
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v5

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->p:I

    .line 10
    const/high16 v0, 0x4100

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->q:F

    .line 95
    const/high16 v0, 0x4140

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->r:F

    .line 70
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v8

    iput v0, p0, Lcom/whatsapp/j4;->s:F

    .line 93
    const v0, 0x422d5555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->t:I

    .line 83
    const v0, 0x422d5555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->u:I

    .line 53
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v6

    iput v0, p0, Lcom/whatsapp/j4;->g:F

    .line 32
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/whatsapp/j4;->h:F

    .line 27
    const v0, 0x433aaaab

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->v:I

    .line 50
    const v0, 0x42baaaab

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->w:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/j4;->x:I

    .line 48
    const v0, -0x3f2aaaab

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->y:I

    .line 47
    const/high16 v0, 0x40c0

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->z:I

    .line 94
    const/high16 v0, 0x4290

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->A:I

    .line 2
    const v0, 0x41555555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->B:I

    .line 45
    const/16 v0, 0xe

    iput v0, p0, Lcom/whatsapp/j4;->C:I

    .line 33
    const v0, 0x412aaaab

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->D:I

    .line 49
    const/high16 v0, 0x41a0

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->E:I

    .line 7
    const v0, 0x41855555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->F:I

    .line 52
    const/high16 v0, 0x4080

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->G:I

    .line 63
    const/high16 v0, 0x4120

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->H:I

    .line 22
    const/high16 v0, 0x4140

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->I:I

    .line 38
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3fc0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/high16 v0, 0x4250

    :goto_0
    iput v0, p0, Lcom/whatsapp/j4;->J:F

    .line 31
    const/high16 v0, 0x4080

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->K:F

    .line 17
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v6

    iput v0, p0, Lcom/whatsapp/j4;->P:F

    .line 84
    const v0, 0x41755555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->Q:F

    .line 9
    const v0, 0x419aaaab

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->T:F

    .line 30
    const v0, 0x41355555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->R:F

    .line 35
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v8

    iput v0, p0, Lcom/whatsapp/j4;->S:F

    .line 97
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/whatsapp/j4;->U:F

    .line 79
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v6

    iput v0, p0, Lcom/whatsapp/j4;->V:F

    .line 105
    const v0, 0x41d55555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->W:I

    .line 46
    const v0, 0x40955555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->L:F

    .line 28
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/whatsapp/j4;->M:F

    .line 8
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3fc0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const v0, 0x3faa3d71

    :goto_1
    iput v0, p0, Lcom/whatsapp/j4;->N:F

    .line 60
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v6

    const/high16 v1, 0x4040

    div-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/j4;->O:F

    .line 25
    const v0, 0x42855555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->Y:I

    .line 26
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v5

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->Z:I

    .line 56
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/whatsapp/j4;->ab:F

    .line 14
    const v0, 0x42855555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->bb:I

    .line 4
    const v0, 0x41955555

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->hb:I

    .line 40
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->ib:I

    .line 42
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->db:I

    .line 99
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v5

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->cb:I

    .line 36
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->eb:I

    .line 15
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v5

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->fb:I

    .line 23
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v5

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->gb:I

    .line 75
    const/high16 v0, 0x4080

    iget v1, p0, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/j4;->jb:I

    .line 81
    return-void

    .line 38
    :cond_0
    const/high16 v0, 0x4228

    goto/16 :goto_0

    .line 8
    :cond_1
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f80

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    iget v0, p0, Lcom/whatsapp/j4;->d:F

    goto :goto_1

    :cond_2
    const/high16 v0, 0x3f80

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;)Lcom/whatsapp/j4;
    .locals 1
    .parameter

    .prologue
    .line 19
    sget-object v0, Lcom/whatsapp/j4;->a:Lcom/whatsapp/j4;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Lcom/whatsapp/j4;

    invoke-direct {v0, p0}, Lcom/whatsapp/j4;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/whatsapp/j4;->a:Lcom/whatsapp/j4;

    .line 87
    :cond_0
    sget-object v0, Lcom/whatsapp/j4;->a:Lcom/whatsapp/j4;

    return-object v0
.end method


# virtual methods
.method public a(F)F
    .locals 3
    .parameter

    .prologue
    const v2, 0x3f4ccccd

    .line 80
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3fc0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 92
    const v0, 0x3f47ae14

    mul-float/2addr p1, v0

    :cond_0
    :goto_0
    return p1

    .line 71
    :cond_1
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f80

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 5
    mul-float/2addr p1, v2

    goto :goto_0

    .line 37
    :cond_2
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f40

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 55
    mul-float/2addr p1, v2

    goto :goto_0
.end method

.method public a(Landroid/widget/EditText;)V
    .locals 3
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 101
    iget v1, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v2, 0x3fc0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_0

    .line 58
    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    if-eqz v0, :cond_2

    .line 13
    :cond_0
    iget v1, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v2, 0x3f80

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_1

    .line 51
    const/4 v1, 0x5

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    if-eqz v0, :cond_2

    .line 82
    :cond_1
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 11
    :cond_2
    return-void
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 21
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f40

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3fc0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(F)F
    .locals 3
    .parameter

    .prologue
    const v2, 0x3f19999a

    .line 76
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3fc0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 78
    const v0, 0x3f170a3d

    mul-float/2addr p1, v0

    .line 89
    :cond_0
    :goto_0
    return p1

    .line 72
    :cond_1
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f80

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 3
    mul-float/2addr p1, v2

    goto :goto_0

    .line 24
    :cond_2
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f40

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 89
    mul-float/2addr p1, v2

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 41
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f40

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(F)F
    .locals 3
    .parameter

    .prologue
    const v2, 0x3f0f5c29

    .line 61
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3fc0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 54
    const v0, 0x3f0ccccd

    mul-float/2addr v0, p1

    .line 91
    :goto_0
    return v0

    .line 102
    :cond_0
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f80

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 88
    mul-float v0, p1, v2

    goto :goto_0

    .line 96
    :cond_1
    iget v0, p0, Lcom/whatsapp/j4;->d:F

    const/high16 v1, 0x3f40

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 64
    const v0, 0x3f0a3d71

    mul-float/2addr v0, p1

    goto :goto_0

    .line 91
    :cond_2
    mul-float v0, p1, v2

    goto :goto_0
.end method

.method public c()I
    .locals 3

    .prologue
    .line 85
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 6
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v2, Lcom/whatsapp/j4;->kb:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 29
    iget v0, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v2, 0xf0

    if-lt v0, v2, :cond_0

    .line 34
    const/16 v0, 0x26

    .line 73
    :goto_0
    return v0

    .line 65
    :cond_0
    iget v0, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v1, 0xa0

    if-lt v0, v1, :cond_1

    .line 73
    const/16 v0, 0x19

    goto :goto_0

    .line 44
    :cond_1
    const/16 v0, 0x13

    goto :goto_0
.end method
