.class public abstract Lcom/whatsapp/ze;
.super Lcom/whatsapp/ye;
.source "ze.java"


# static fields
.field static A:I

.field static B:I

.field static C:I

.field static D:I

.field private static final F:[Ljava/lang/String;

.field private static x:F

.field private static y:F


# instance fields
.field private final E:Ljava/lang/Runnable;

.field protected final n:Lcom/whatsapp/Conversation;

.field protected o:Lcom/whatsapp/sz;

.field protected final p:Landroid/widget/TextView;

.field protected final q:Landroid/widget/ImageView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/view/View;

.field private t:Z

.field private u:Z

.field private v:J

.field private w:I

.field private z:Landroid/view/View$OnTouchListener;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_(i$VN4f&ZS)X \\Khj;@O.i5lN*s\r@N$="

    invoke-static {v1}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    const/4 v1, 0x1

    const-string v2, "Z."

    invoke-static {v2}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "]5"

    invoke-static {v2}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "\u007f5b3GYgJ7@O&`7\u0013\u007f+h<VO"

    invoke-static {v2}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "\u001c#f&R\u0001"

    invoke-static {v2}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "_(i$VN4f&ZS)(5VH#n3_S n&VQ4( VQ(s7lN\"t=FN$brZOgi\'_Pf\'"

    invoke-static {v2}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    .line 82
    sput v3, Lcom/whatsapp/ze;->x:F

    .line 64
    sput v3, Lcom/whatsapp/ze;->y:F

    .line 91
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/ze;->A:I

    .line 63
    sput v4, Lcom/whatsapp/ze;->B:I

    .line 43
    const-string v0, "\u001fw7b\u0003\u000cw7b"

    .line -1
    invoke-static {v0}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/whatsapp/ze;->C:I

    .line 46
    const-string v0, "\u001f\u0001A\u0014u\u007f\u00047b"

    .line -1
    invoke-static {v0}, Lcom/whatsapp/ze;->z(Ljava/lang/String;)[C

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/ze;->z([C)Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/whatsapp/ze;->D:I

    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V
    .locals 8
    .parameter
    .parameter

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 131
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/ye;-><init>(Landroid/content/Context;Lcom/whatsapp/sz;)V

    .line 78
    iput-boolean v1, p0, Lcom/whatsapp/ze;->t:Z

    .line 41
    new-instance v0, Lcom/whatsapp/pn;

    invoke-direct {v0, p0}, Lcom/whatsapp/pn;-><init>(Lcom/whatsapp/ze;)V

    iput-object v0, p0, Lcom/whatsapp/ze;->E:Ljava/lang/Runnable;

    .line 65
    iput-object p1, p0, Lcom/whatsapp/ze;->n:Lcom/whatsapp/Conversation;

    .line 48
    iget-object v0, p2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {p0}, Lcom/whatsapp/ze;->b()I

    move-result v0

    if-eqz v3, :cond_1

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/ze;->a()I

    move-result v0

    .line 21
    :cond_1
    iget-object v2, p2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v2, v2, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/whatsapp/ze;->l:Z

    .line 97
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-virtual {v2, v0, p0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 154
    sget v0, Lcom/whatsapp/ze;->A:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0a0017

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    sput v0, Lcom/whatsapp/ze;->A:I

    .line 143
    :cond_2
    iget-object v0, p2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_3

    .line 142
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_b

    sget v0, Lcom/whatsapp/ze;->A:I

    :goto_0
    sget v2, Lcom/whatsapp/ze;->A:I

    sget-object v4, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->m:I

    add-int/2addr v4, v2

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_c

    move v2, v1

    :goto_1
    sget v5, Lcom/whatsapp/ze;->A:I

    sget-object v6, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v6, v6, Lcom/whatsapp/j4;->m:I

    add-int/2addr v5, v6

    invoke-virtual {p0, v0, v4, v2, v5}, Lcom/whatsapp/ze;->setPadding(IIII)V

    if-eqz v3, :cond_6

    .line 24
    :cond_3
    iget-boolean v0, p0, Lcom/whatsapp/ze;->l:Z

    if-eqz v0, :cond_4

    .line 86
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_d

    move v0, v1

    :goto_2
    sget v2, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v4, v2, 0x2

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_e

    sget v2, Lcom/whatsapp/ze;->A:I

    :goto_3
    sget v5, Lcom/whatsapp/ze;->A:I

    sget-object v6, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v6, v6, Lcom/whatsapp/j4;->m:I

    add-int/2addr v5, v6

    invoke-virtual {p0, v0, v4, v2, v5}, Lcom/whatsapp/ze;->setPadding(IIII)V

    if-eqz v3, :cond_6

    .line 44
    :cond_4
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_f

    move v0, v1

    :goto_4
    sget v2, Lcom/whatsapp/ze;->A:I

    sget-object v4, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->m:I

    add-int/2addr v2, v4

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v4

    if-eqz v4, :cond_5

    sget v1, Lcom/whatsapp/ze;->A:I

    :cond_5
    sget v4, Lcom/whatsapp/ze;->A:I

    sget-object v5, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v5, v5, Lcom/whatsapp/j4;->m:I

    add-int/2addr v4, v5

    invoke-virtual {p0, v0, v2, v1, v4}, Lcom/whatsapp/ze;->setPadding(IIII)V

    .line 51
    :cond_6
    iget v0, p2, Lcom/whatsapp/sz;->a:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_9

    .line 34
    sget-boolean v0, Lcom/whatsapp/Conversation;->g:Z

    if-nez v0, :cond_7

    iget-object v0, p2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_7

    .line 10
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02040a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v3, :cond_8

    .line 181
    :cond_7
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020412

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    :cond_8
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a001c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setMinimumHeight(I)V

    .line 112
    invoke-virtual {p0, v7}, Lcom/whatsapp/ze;->setLongClickable(Z)V

    .line 13
    :cond_9
    const v0, 0x7f0d00c8

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/ze;->p:Landroid/widget/TextView;

    .line 53
    const v0, 0x7f0d00c9

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whatsapp/ze;->q:Landroid/widget/ImageView;

    .line 25
    invoke-direct {p0, p2}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;)V

    .line 100
    new-instance v0, Lcom/whatsapp/nn;

    invoke-direct {v0, p0}, Lcom/whatsapp/nn;-><init>(Lcom/whatsapp/ze;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/ze;->z:Landroid/view/View$OnTouchListener;

    if-nez v0, :cond_a

    .line 111
    new-instance v0, Lcom/whatsapp/on;

    invoke-direct {v0, p0}, Lcom/whatsapp/on;-><init>(Lcom/whatsapp/ze;)V

    iput-object v0, p0, Lcom/whatsapp/ze;->z:Landroid/view/View$OnTouchListener;

    .line 144
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/ze;->z:Landroid/view/View$OnTouchListener;

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 16
    return-void

    :cond_b
    move v0, v1

    .line 142
    goto/16 :goto_0

    :cond_c
    sget v2, Lcom/whatsapp/ze;->A:I

    goto/16 :goto_1

    .line 86
    :cond_d
    sget v0, Lcom/whatsapp/ze;->A:I

    goto/16 :goto_2

    :cond_e
    move v2, v1

    goto/16 :goto_3

    .line 44
    :cond_f
    sget v0, Lcom/whatsapp/ze;->A:I

    goto/16 :goto_4
.end method

.method private static a(Landroid/content/res/Resources;)F
    .locals 3
    .parameter

    .prologue
    .line 161
    sget v0, Lcom/whatsapp/ze;->x:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 66
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 124
    const v1, 0x7f0a0022

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    div-float v0, v1, v0

    sput v0, Lcom/whatsapp/ze;->x:F

    .line 117
    :cond_0
    const/4 v0, 0x0

    .line 84
    sget v1, Lcom/whatsapp/FontListPreference;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, -0x2

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 119
    :cond_1
    sget v1, Lcom/whatsapp/FontListPreference;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 v0, 0x4

    .line 71
    :cond_2
    sget v1, Lcom/whatsapp/ze;->x:F

    int-to-float v0, v0

    add-float/2addr v0, v1

    return v0
.end method

.method private a(Lcom/whatsapp/sz;)V
    .locals 11
    .parameter

    .prologue
    const v1, 0x7f0203eb

    const/16 v10, 0x8

    const/4 v9, 0x1

    const/4 v8, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 128
    iput-object p1, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    .line 166
    iput-object p1, p0, Lcom/whatsapp/ye;->e:Lcom/whatsapp/sz;

    .line 148
    invoke-virtual {p0, p1}, Lcom/whatsapp/ze;->setTag(Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lcom/whatsapp/ze;->p:Landroid/widget/TextView;

    if-eqz v0, :cond_5

    .line 73
    iget-object v0, p0, Lcom/whatsapp/ze;->n:Lcom/whatsapp/Conversation;

    iget-boolean v0, v0, Lcom/whatsapp/Conversation;->Sb:Z

    if-eqz v0, :cond_3

    .line 38
    iget-boolean v0, p0, Lcom/whatsapp/ze;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/ze;->u:Z

    if-nez v0, :cond_1

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ze;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    iput-boolean v9, p0, Lcom/whatsapp/ze;->u:Z

    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/whatsapp/ze;->t:Z

    if-eqz v0, :cond_2

    iget-wide v4, p1, Lcom/whatsapp/sz;->i:J

    iget-wide v6, p0, Lcom/whatsapp/ze;->v:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_5

    .line 94
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/ze;->p:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, ""

    :goto_0
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-wide v5, p1, Lcom/whatsapp/sz;->i:J

    invoke-static {v0, v5, v6}, Lcom/whatsapp/t4;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, " "

    :goto_1
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-wide v4, p1, Lcom/whatsapp/sz;->i:J

    iput-wide v4, p0, Lcom/whatsapp/ze;->v:J

    if-eqz v3, :cond_5

    .line 58
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/ze;->n:Lcom/whatsapp/Conversation;

    iget-boolean v0, v0, Lcom/whatsapp/Conversation;->Sb:Z

    if-nez v0, :cond_5

    .line 99
    iget-boolean v0, p0, Lcom/whatsapp/ze;->t:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/whatsapp/ze;->u:Z

    if-eqz v0, :cond_5

    .line 83
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/ze;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iput-boolean v8, p0, Lcom/whatsapp/ze;->u:Z

    .line 81
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/ze;->q:Landroid/widget/ImageView;

    if-eqz v0, :cond_b

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Lcom/whatsapp/ze;->t:Z

    if-eqz v0, :cond_6

    iget v0, p1, Lcom/whatsapp/sz;->a:I

    iget v2, p0, Lcom/whatsapp/ze;->w:I

    if-eq v0, v2, :cond_b

    .line 147
    :cond_6
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    const/4 v2, 0x5

    if-lt v0, v2, :cond_7

    .line 18
    const v0, 0x7f0203ea

    if-eqz v3, :cond_9

    .line 26
    :cond_7
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_8

    .line 175
    const v0, 0x7f0203e9

    if-eqz v3, :cond_9

    :cond_8
    move v0, v1

    .line 33
    :cond_9
    sget v2, Lcom/whatsapp/App;->f:I

    const/4 v4, 0x3

    if-ne v2, v4, :cond_a

    iget v2, p1, Lcom/whatsapp/sz;->a:I

    const/4 v4, 0x7

    if-ne v2, v4, :cond_a

    move v0, v1

    .line 109
    :cond_a
    iget-object v1, p0, Lcom/whatsapp/ze;->q:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 170
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    iput v0, p0, Lcom/whatsapp/ze;->w:I

    .line 92
    :cond_b
    const v0, 0x7f0d00c5

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    .line 98
    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_10

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 110
    iget-object v0, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v0, :cond_e

    .line 52
    sget-object v0, Lcom/whatsapp/App;->x:Lcom/whatsapp/eu;

    iget-object v1, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v1, v1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/eu;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/hu;

    move-result-object v1

    .line 118
    const v0, 0x7f0d00c6

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 45
    iget v1, v1, Lcom/whatsapp/hu;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 177
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/ze;->b(Landroid/content/res/Resources;)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 70
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 72
    sget-object v1, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v1

    .line 95
    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    const v0, 0x7f0d00c7

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 77
    iget-object v2, v1, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    invoke-static {v2}, Lhb;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, v1, Lcom/whatsapp/zq;->t:Ljava/lang/String;

    invoke-static {v2}, Lhb;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "~"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v1, v1, Lcom/whatsapp/zq;->t:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/whatsapp/ze;->f:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 125
    if-nez v2, :cond_13

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 168
    if-eqz v3, :cond_d

    .line 12
    :cond_c
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    :cond_d
    if-eqz v3, :cond_f

    .line 103
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    aget-object v1, v1, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 133
    :cond_f
    iget v0, p0, Lcom/whatsapp/ze;->m:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_10

    .line 120
    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 104
    :cond_10
    iput-boolean v9, p0, Lcom/whatsapp/ze;->t:Z

    .line 85
    return-void

    .line 94
    :cond_11
    const-string v0, " "

    goto/16 :goto_0

    :cond_12
    const-string v0, ""

    goto/16 :goto_1

    :cond_13
    move-object v1, v2

    .line 125
    goto :goto_2
.end method

.method static a(Lcom/whatsapp/ze;)V
    .locals 0
    .parameter

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/whatsapp/ze;->g()V

    return-void
.end method

.method static b(Landroid/content/res/Resources;)F
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    .line 89
    sget v0, Lcom/whatsapp/ze;->y:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 116
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 37
    const v1, 0x7f0a0019

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    div-float v0, v1, v0

    sput v0, Lcom/whatsapp/ze;->y:F

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 180
    sget v1, Lcom/whatsapp/FontListPreference;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, -0x2

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 35
    :cond_1
    sget v1, Lcom/whatsapp/FontListPreference;->a:I

    if-ne v1, v4, :cond_2

    const/4 v0, 0x4

    .line 31
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 61
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 47
    :cond_4
    sget v1, Lcom/whatsapp/ze;->y:F

    int-to-float v0, v0

    add-float/2addr v0, v1

    return v0
.end method

.method private g()V
    .locals 7

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/whatsapp/ze;->j()Ljava/util/List;

    move-result-object v0

    .line 20
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 126
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 165
    iget-object v2, p0, Lcom/whatsapp/ze;->n:Lcom/whatsapp/Conversation;

    invoke-virtual {v2}, Lcom/whatsapp/Conversation;->getListView()Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/widget/ListView;->getPositionForView(Landroid/view/View;)I

    move-result v2

    .line 160
    invoke-virtual {p0}, Lcom/whatsapp/ze;->h()Lcom/whatsapp/sz;

    move-result-object v3

    .line 88
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x1090011

    invoke-direct {v4, v5, v6, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    new-instance v5, Lcom/whatsapp/qn;

    invoke-direct {v5, p0, v0, v3, v2}, Lcom/whatsapp/qn;-><init>(Lcom/whatsapp/ze;Ljava/util/List;Lcom/whatsapp/sz;I)V

    invoke-virtual {v1, v4, v5}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 67
    iget-object v0, p0, Lcom/whatsapp/ze;->n:Lcom/whatsapp/Conversation;

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->a(Landroid/app/Dialog;)V

    .line 139
    return-void
.end method

.method private static z([C)Ljava/lang/String;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    if-gt v1, v2, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-char v3, p0, v2

    rem-int/lit8 v0, v2, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x33

    :goto_1
    xor-int/2addr v0, v3

    int-to-char v0, v0

    aput-char v0, p0, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x3c

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x47

    goto :goto_1

    :pswitch_2
    const/4 v0, 0x7

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x52

    goto :goto_1

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

    xor-int/lit8 v2, v2, 0x33

    int-to-char v2, v2

    aput-char v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected abstract a()I
.end method

.method public a(Lcom/whatsapp/sz;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 176
    iget-object v0, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_1

    .line 141
    :cond_0
    invoke-direct {p0, p1}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;)V

    .line 122
    :cond_1
    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/rn;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 30
    return-void
.end method

.method public a(Z)V
    .locals 7
    .parameter

    .prologue
    const v6, 0x7f0d00c3

    const/4 v5, 0x0

    .line 145
    if-eqz p1, :cond_0

    .line 107
    invoke-virtual {p0, v6}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    .line 162
    iget-object v0, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/ze;->f:Landroid/content/Context;

    iget-object v3, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    iget-wide v3, v3, Lcom/whatsapp/sz;->i:J

    invoke-static {v2, v3, v4}, Lcom/whatsapp/t4;->j(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/ze;->a(Landroid/content/res/Resources;)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/ze;->g:Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 164
    :cond_0
    invoke-virtual {p0, v6}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 50
    iput-boolean v5, p0, Lcom/whatsapp/ze;->g:Z

    .line 114
    :cond_1
    return-void
.end method

.method protected abstract b()I
.end method

.method b(Z)V
    .locals 0
    .parameter

    .prologue
    .line 90
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 156
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getHandler()Landroid/os/Handler;

    move-result-object v0

    .line 167
    if-nez v0, :cond_0

    .line 123
    iget-object v1, p0, Lcom/whatsapp/ze;->E:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Lcom/whatsapp/ze;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 174
    iget-object v1, p0, Lcom/whatsapp/ze;->E:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Lcom/whatsapp/ze;->post(Ljava/lang/Runnable;)Z

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 49
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/ze;->E:Ljava/lang/Runnable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 135
    iget-object v1, p0, Lcom/whatsapp/ze;->E:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object v0

    .line 27
    iput v2, v0, Landroid/os/Message;->what:I

    .line 3
    iget-object v1, p0, Lcom/whatsapp/ze;->E:Ljava/lang/Runnable;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 172
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 32
    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    invoke-direct {p0, v0}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;)V

    .line 127
    return-void
.end method

.method public e()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 7
    const v0, 0x7f0d00c5

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    .line 60
    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 87
    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 138
    const/4 v0, -0x1

    iput v0, p0, Lcom/whatsapp/ze;->m:I

    .line 155
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0a001c

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setMinimumHeight(I)V

    .line 132
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    sget v2, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v2, v2, 0x2

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_0

    sget v1, Lcom/whatsapp/ze;->A:I

    :cond_0
    sget v3, Lcom/whatsapp/ze;->A:I

    sget-object v4, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->m:I

    add-int/2addr v3, v4

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/whatsapp/ze;->setPadding(IIII)V

    .line 2
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020412

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 136
    :cond_1
    return-void

    .line 132
    :cond_2
    sget v0, Lcom/whatsapp/ze;->A:I

    goto :goto_0
.end method

.method public f()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 158
    iget v0, p0, Lcom/whatsapp/ze;->m:I

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 106
    :cond_0
    iget v0, p0, Lcom/whatsapp/ze;->m:I

    packed-switch v0, :pswitch_data_0

    .line 36
    :cond_1
    :goto_0
    return-void

    .line 9
    :pswitch_0
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    sget v2, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v4, v2, 0x2

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_4

    sget v2, Lcom/whatsapp/ze;->A:I

    :goto_2
    sget v5, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v5, v5, 0x2

    invoke-virtual {p0, v0, v4, v2, v5}, Lcom/whatsapp/ze;->setPadding(IIII)V

    .line 76
    if-eqz v3, :cond_1

    .line 39
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    :goto_3
    sget v2, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v4, v2, 0x2

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v2

    if-eqz v2, :cond_6

    sget v2, Lcom/whatsapp/ze;->A:I

    :goto_4
    sget v5, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v5, v5, 0x2

    invoke-virtual {p0, v0, v4, v2, v5}, Lcom/whatsapp/ze;->setPadding(IIII)V

    .line 171
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0a001d

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setMinimumHeight(I)V

    .line 169
    if-eqz v3, :cond_1

    .line 54
    :pswitch_2
    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    :goto_5
    sget v2, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v2, v2, 0x2

    invoke-static {}, Lcom/whatsapp/App;->ub()Z

    move-result v3

    if-eqz v3, :cond_2

    sget v1, Lcom/whatsapp/ze;->A:I

    :cond_2
    sget v3, Lcom/whatsapp/ze;->A:I

    div-int/lit8 v3, v3, 0x2

    sget-object v4, Lcom/whatsapp/ze;->c:Lcom/whatsapp/j4;

    iget v4, v4, Lcom/whatsapp/j4;->m:I

    add-int/2addr v3, v4

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/whatsapp/ze;->setPadding(IIII)V

    .line 15
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a001e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->setMinimumHeight(I)V

    goto :goto_0

    .line 9
    :cond_3
    sget v0, Lcom/whatsapp/ze;->A:I

    goto :goto_1

    :cond_4
    move v2, v1

    goto :goto_2

    .line 39
    :cond_5
    sget v0, Lcom/whatsapp/ze;->A:I

    goto :goto_3

    :cond_6
    move v2, v1

    goto :goto_4

    .line 54
    :cond_7
    sget v0, Lcom/whatsapp/ze;->A:I

    goto :goto_5

    .line 106
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method h()Lcom/whatsapp/sz;
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x1

    return v0
.end method

.method j()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/rn;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x3

    const/4 v6, 0x1

    .line 163
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 102
    invoke-virtual {p0}, Lcom/whatsapp/ze;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    new-instance v0, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900fd

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v6}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_0
    new-instance v0, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090018

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v8}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    iget-object v0, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 153
    iget-object v0, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 93
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 140
    iget-object v2, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-nez v2, :cond_1

    .line 108
    new-instance v2, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f09022a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x7

    invoke-direct {v2, v3, v4}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v2, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f09022b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x8

    invoke-direct {v2, v3, v4}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_1
    new-instance v2, Lcom/whatsapp/rn;

    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f09029c

    new-array v5, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v8

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0xe

    invoke-direct {v2, v0, v3}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_3

    .line 115
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    invoke-static {v2}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v0, Lcom/whatsapp/App;->f:I

    if-lt v0, v6, :cond_5

    iget-object v0, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->h:I

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/ze;->o:Lcom/whatsapp/sz;

    invoke-virtual {v3}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 56
    :cond_3
    invoke-virtual {p0, v1}, Lcom/whatsapp/ze;->a(Ljava/util/List;)V

    .line 130
    sget v0, Lcom/whatsapp/App;->f:I

    if-ne v0, v7, :cond_4

    .line 11
    new-instance v0, Lcom/whatsapp/rn;

    sget-object v2, Lcom/whatsapp/ze;->F:[Ljava/lang/String;

    aget-object v2, v2, v7

    invoke-direct {v0, v2, v7}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_4
    return-object v1

    .line 115
    :cond_5
    const-string v0, ""

    goto :goto_0
.end method

.method public k()I
    .locals 2

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 179
    const v0, 0x7f0d00c3

    invoke-virtual {p0, v0}, Lcom/whatsapp/ze;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/ze;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0029

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 157
    iget-object v1, p0, Lcom/whatsapp/ze;->r:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public l()I
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/whatsapp/ze;->s:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 105
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
