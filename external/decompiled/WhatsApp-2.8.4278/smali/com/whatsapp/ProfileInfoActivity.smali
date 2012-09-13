.class public Lcom/whatsapp/ProfileInfoActivity;
.super Lcom/whatsapp/DialogToastActivity;
.source "ProfileInfoActivity.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageButton;

.field private h:Landroid/widget/Button;

.field private i:Landroid/view/View;

.field private j:Landroid/widget/ImageButton;

.field private k:Lcom/whatsapp/zq;

.field private l:Landroid/os/Handler;

.field private m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x4f

    const/16 v1, 0x43

    const/16 v4, 0x28

    const/16 v3, 0x1a

    const/4 v6, 0x0

    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\"!\u001dhG*+WsF7*\u0017n\u0006\",\rsG-a8N|\u0002\u000c1El\u0002\u001b8"

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

    const/4 v10, 0x1

    const-string v0, "3=\u0016|A/*\u0010tN,`\u001ahM\";\u001c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "3=\u0016|A/*\u0010tN,`\u001d\u007f[7=\u0016c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x3

    const-string v0, "*<&hM0*\r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ProfileInfoActivity;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_4

    :pswitch_1
    move v0, v2

    goto :goto_4

    :pswitch_2
    const/16 v0, 0x79

    goto :goto_4

    :pswitch_3
    move v0, v3

    goto :goto_4

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_5
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_5

    :pswitch_5
    move v0, v2

    goto :goto_5

    :pswitch_6
    const/16 v0, 0x79

    goto :goto_5

    :pswitch_7
    move v0, v3

    goto :goto_5

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_6

    :pswitch_9
    move v0, v2

    goto :goto_6

    :pswitch_a
    const/16 v0, 0x79

    goto :goto_6

    :pswitch_b
    move v0, v3

    goto :goto_6

    :cond_3
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_7

    :pswitch_d
    move v0, v2

    goto :goto_7

    :pswitch_e
    const/16 v0, 0x79

    goto :goto_7

    :pswitch_f
    move v0, v3

    goto :goto_7

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

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    return-void
.end method

.method static a(Lcom/whatsapp/ProfileInfoActivity;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 12
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static b(Lcom/whatsapp/ProfileInfoActivity;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    return-object v0
.end method

.method private b()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/high16 v8, 0x4000

    const/16 v2, 0x8

    const/4 v7, 0x0

    const/4 v6, 0x4

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 83
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 20
    invoke-static {}, Lcom/whatsapp/App;->o()Z

    move-result v1

    if-nez v1, :cond_1

    .line 70
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 39
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/whatsapp/hz;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 88
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 59
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 72
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/widget/Button;->setVisibility(I)V

    if-eqz v0, :cond_0

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    invoke-virtual {p0}, Lcom/whatsapp/ProfileInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a000d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v3}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->L:F

    mul-float/2addr v3, v8

    invoke-virtual {v1, v2, v3, v7}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 55
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->K:F

    float-to-int v2, v2

    .line 27
    iget-object v3, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v3, v2, v2, v2, v2}, Landroid/widget/ImageButton;->setPadding(IIII)V

    .line 30
    if-nez v1, :cond_6

    .line 22
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->p:I

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->o:I

    if-nez v2, :cond_4

    .line 52
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/widget/Button;->setVisibility(I)V

    .line 86
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->l:Landroid/os/Handler;

    if-nez v2, :cond_3

    .line 43
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->l:Landroid/os/Handler;

    .line 45
    new-instance v2, Lcom/whatsapp/fz;

    invoke-direct {v2, p0}, Lcom/whatsapp/fz;-><init>(Lcom/whatsapp/ProfileInfoActivity;)V

    iput-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->m:Ljava/lang/Runnable;

    .line 57
    :cond_3
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->l:Landroid/os/Handler;

    iget-object v3, p0, Lcom/whatsapp/ProfileInfoActivity;->m:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 33
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->l:Landroid/os/Handler;

    iget-object v3, p0, Lcom/whatsapp/ProfileInfoActivity;->m:Ljava/lang/Runnable;

    const-wide/16 v4, 0x7530

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    if-eqz v0, :cond_5

    .line 17
    :cond_4
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v2, v7}, Landroid/widget/Button;->setVisibility(I)V

    .line 73
    :cond_5
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v2, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 3
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->j:Landroid/widget/ImageButton;

    invoke-virtual {v2, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    if-eqz v0, :cond_0

    .line 23
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setVisibility(I)V

    .line 75
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v7}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 34
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    new-instance v2, Lcom/whatsapp/p;

    invoke-virtual {p0}, Lcom/whatsapp/ProfileInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v4

    iget v4, v4, Lcom/whatsapp/j4;->L:F

    mul-float/2addr v4, v8

    const/4 v5, 0x0

    invoke-direct {v2, v3, v1, v4, v5}, Lcom/whatsapp/p;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;FLjava/lang/CharSequence;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 82
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 84
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v7}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method static c(Lcom/whatsapp/ProfileInfoActivity;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    return-object v0
.end method

.method static d(Lcom/whatsapp/ProfileInfoActivity;)Landroid/widget/Button;
    .locals 1
    .parameter

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    return-object v0
.end method

.method static e(Lcom/whatsapp/ProfileInfoActivity;)Landroid/widget/ImageButton;
    .locals 1
    .parameter

    .prologue
    .line 51
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 90
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 78
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    .line 48
    invoke-direct {p0}, Lcom/whatsapp/ProfileInfoActivity;->b()V

    .line 46
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 49
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x0

    const/4 v3, 0x4

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 29
    packed-switch p1, :pswitch_data_0

    .line 62
    :cond_0
    :goto_0
    return-void

    .line 81
    :pswitch_0
    if-ne p2, v5, :cond_0

    .line 40
    if-eqz p3, :cond_1

    sget-object v1, Lcom/whatsapp/ProfileInfoActivity;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {p3, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 47
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 61
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 77
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->b(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    if-eqz v0, :cond_0

    .line 80
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    const/16 v2, 0xd

    invoke-static {p3, v1, p0, v2, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/zq;Landroid/app/Activity;ILcom/whatsapp/lr;)V

    if-eqz v0, :cond_0

    .line 37
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/iz;->a()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 41
    if-ne p2, v5, :cond_2

    .line 66
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 44
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 76
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 35
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setVisibility(I)V

    if-eqz v0, :cond_0

    .line 38
    :cond_2
    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    .line 2
    invoke-static {p3, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/lr;)V

    goto :goto_0

    .line 29
    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    .line 87
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 53
    const v0, 0x7f03004f

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->setContentView(I)V

    .line 4
    sget-object v0, Lcom/whatsapp/ProfileInfoActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 79
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    .line 24
    const v0, 0x7f0d015a

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->f:Landroid/widget/TextView;

    .line 32
    invoke-static {p0}, Lcom/whatsapp/App;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-static {v0, p0}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 19
    iget-object v2, p0, Lcom/whatsapp/ProfileInfoActivity;->f:Landroid/widget/TextView;

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    const v0, 0x7f0d015c

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/bz;

    invoke-direct {v1, p0}, Lcom/whatsapp/bz;-><init>(Lcom/whatsapp/ProfileInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    const v0, 0x7f0d0116

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    .line 42
    const v0, 0x7f0d0117

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    .line 85
    new-instance v0, Lcom/whatsapp/dz;

    invoke-direct {v0, p0}, Lcom/whatsapp/dz;-><init>(Lcom/whatsapp/ProfileInfoActivity;)V

    .line 89
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->h:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    const v0, 0x7f0d0159

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->j:Landroid/widget/ImageButton;

    .line 26
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->j:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/ez;

    invoke-direct {v1, p0}, Lcom/whatsapp/ez;-><init>(Lcom/whatsapp/ProfileInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    const v0, 0x7f0d00a6

    invoke-virtual {p0, v0}, Lcom/whatsapp/ProfileInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->i:Landroid/view/View;

    .line 58
    invoke-direct {p0}, Lcom/whatsapp/ProfileInfoActivity;->b()V

    .line 18
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 1
    sget-object v0, Lcom/whatsapp/ProfileInfoActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/whatsapp/ProfileInfoActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/whatsapp/ProfileInfoActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->k:Lcom/whatsapp/zq;

    const/16 v2, 0xd

    invoke-static {v0, v1, p0, v2, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/zq;Landroid/app/Activity;ILcom/whatsapp/lr;)V

    .line 56
    :cond_0
    return-void

    :cond_1
    move-object v0, v1

    .line 19
    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 21
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 36
    sget-object v0, Lcom/whatsapp/ProfileInfoActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 25
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 31
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->l:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/whatsapp/ProfileInfoActivity;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/ProfileInfoActivity;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 50
    :cond_0
    return-void
.end method
