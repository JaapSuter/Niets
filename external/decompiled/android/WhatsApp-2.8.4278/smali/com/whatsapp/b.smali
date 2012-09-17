.class public Lcom/whatsapp/b;
.super Landroid/app/Dialog;
.source "b.java"


# static fields
.field public static b:Ljava/lang/String;

.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Landroid/view/inputmethod/InputMethodManager;

.field private c:Z

.field d:Landroid/app/Activity;

.field e:Landroid/content/Context;

.field f:Landroid/widget/TextView;

.field private g:Lcom/whatsapp/ms;

.field private h:I

.field i:Landroid/widget/ImageButton;

.field private j:Landroid/widget/ViewFlipper;

.field k:Z

.field l:Landroid/view/ViewGroup;

.field m:Landroid/view/ViewGroup;

.field n:Landroid/view/View;

.field o:I

.field private p:[Lcom/whatsapp/pe;

.field q:Landroid/widget/EditText;

.field r:I

.field s:I

.field t:I

.field u:Ljava/lang/String;

.field final v:Landroid/text/TextWatcher;

.field w:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v4, 0x26

    const/16 v1, 0x25

    const/16 v3, 0x16

    const/16 v2, 0x12

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "L|f\u001cRz\u007fs\u001dNJv"

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

    const-string v0, "@v\u007f\u001duQ`\u007f\u0007A\u001f"

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

    sput-object v9, Lcom/whatsapp/b;->z:[Ljava/lang/String;

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
    const/16 v0, 0x69

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
    const/16 v0, 0x69

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

.method public constructor <init>(Landroid/app/Activity;ILjava/lang/String;Lcom/whatsapp/ms;III)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 76
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 20
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/b;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/whatsapp/b;->a:Landroid/view/inputmethod/InputMethodManager;

    .line 6
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/b;->c:Z

    .line 23
    sget-object v0, Lcom/whatsapp/v4;->d:[I

    array-length v0, v0

    new-array v0, v0, [Lcom/whatsapp/pe;

    iput-object v0, p0, Lcom/whatsapp/b;->p:[Lcom/whatsapp/pe;

    .line 41
    iput v2, p0, Lcom/whatsapp/b;->r:I

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/whatsapp/b;->u:Ljava/lang/String;

    .line 27
    new-instance v0, Lcom/whatsapp/hs;

    invoke-direct {v0, p0}, Lcom/whatsapp/hs;-><init>(Lcom/whatsapp/b;)V

    iput-object v0, p0, Lcom/whatsapp/b;->v:Landroid/text/TextWatcher;

    .line 72
    new-instance v0, Lcom/whatsapp/js;

    invoke-direct {v0, p0}, Lcom/whatsapp/js;-><init>(Lcom/whatsapp/b;)V

    iput-object v0, p0, Lcom/whatsapp/b;->w:Landroid/view/View$OnClickListener;

    .line 28
    iput-object p1, p0, Lcom/whatsapp/b;->d:Landroid/app/Activity;

    .line 32
    invoke-virtual {p1}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/b;->e:Landroid/content/Context;

    .line 30
    iput-object p4, p0, Lcom/whatsapp/b;->g:Lcom/whatsapp/ms;

    .line 94
    iput p2, p0, Lcom/whatsapp/b;->h:I

    .line 13
    iput p5, p0, Lcom/whatsapp/b;->r:I

    .line 17
    iput p6, p0, Lcom/whatsapp/b;->s:I

    .line 89
    iput p7, p0, Lcom/whatsapp/b;->t:I

    .line 57
    iput-object p3, p0, Lcom/whatsapp/b;->u:Ljava/lang/String;

    .line 66
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 31
    iget-object v0, p0, Lcom/whatsapp/b;->d:Landroid/app/Activity;

    sget-object v1, Lcom/whatsapp/b;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 16
    iget-object v1, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 86
    return-void
.end method

.method static a(Lcom/whatsapp/b;)V
    .locals 0
    .parameter

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/whatsapp/b;->a()V

    return-void
.end method

.method static a(Lcom/whatsapp/b;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 75
    iput-boolean p1, p0, Lcom/whatsapp/b;->c:Z

    return p1
.end method

.method static b(Lcom/whatsapp/b;)Lcom/whatsapp/ms;
    .locals 1
    .parameter

    .prologue
    .line 60
    iget-object v0, p0, Lcom/whatsapp/b;->g:Lcom/whatsapp/ms;

    return-object v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 56
    iget-object v0, p0, Lcom/whatsapp/b;->a:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isFullscreenMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/whatsapp/b;->a:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 45
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;Landroid/content/Context;)V
    .locals 10
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 68
    new-instance v9, Landroid/view/animation/AnimationSet;

    invoke-direct {v9, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 14
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/high16 v6, -0x4080

    move v3, v1

    move v4, v2

    move v5, v1

    move v7, v1

    move v8, v2

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 50
    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 85
    new-instance v1, Lcom/whatsapp/is;

    invoke-direct {v1, p0}, Lcom/whatsapp/is;-><init>(Lcom/whatsapp/b;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 25
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 49
    new-instance v0, Landroid/view/animation/LayoutAnimationController;

    const/high16 v1, 0x3e80

    invoke-direct {v0, v9, v1}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;F)V

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 24
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .parameter

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 63
    invoke-virtual {p0, v5}, Lcom/whatsapp/b;->requestWindowFeature(I)Z

    .line 52
    const v0, 0x7f030033

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->setContentView(I)V

    .line 91
    const v0, 0x7f0d0035

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v1, p0, Lcom/whatsapp/b;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 48
    iget v0, p0, Lcom/whatsapp/b;->h:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->setTitle(I)V

    .line 67
    const v0, 0x7f0d00c0

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 92
    new-instance v1, Lcom/whatsapp/ls;

    const/4 v4, 0x0

    invoke-direct {v1, p0, v4}, Lcom/whatsapp/ls;-><init>(Lcom/whatsapp/b;Lcom/whatsapp/es;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    const v0, 0x7f0d00bf

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 42
    new-instance v1, Lcom/whatsapp/es;

    invoke-direct {v1, p0}, Lcom/whatsapp/es;-><init>(Lcom/whatsapp/b;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    const v0, 0x7f0d0103

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/b;->f:Landroid/widget/TextView;

    .line 11
    iget v0, p0, Lcom/whatsapp/b;->r:I

    if-lez v0, :cond_0

    .line 83
    const v0, 0x7f0d0102

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    .line 61
    iget-object v0, p0, Lcom/whatsapp/b;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    new-array v0, v5, [Landroid/text/InputFilter;

    .line 69
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    iget v4, p0, Lcom/whatsapp/b;->r:I

    invoke-direct {v1, v4}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v1, v0, v2

    .line 36
    iget-object v1, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 80
    if-eqz v3, :cond_1

    .line 44
    :cond_0
    const v0, 0x7f0d0101

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    .line 51
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setVisibility(I)V

    .line 33
    iget-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/b;->v:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 79
    iget-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/TextEmojiLabel;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 22
    invoke-virtual {p0}, Lcom/whatsapp/b;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 77
    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 90
    const/16 v1, 0x30

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 71
    invoke-virtual {p0}, Lcom/whatsapp/b;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 39
    const v0, 0x7f0d0046

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/whatsapp/b;->i:Landroid/widget/ImageButton;

    .line 73
    const v0, 0x7f0d0048

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/whatsapp/b;->l:Landroid/view/ViewGroup;

    .line 84
    iget-object v0, p0, Lcom/whatsapp/b;->i:Landroid/widget/ImageButton;

    new-instance v1, Lcom/whatsapp/fs;

    invoke-direct {v1, p0}, Lcom/whatsapp/fs;-><init>(Lcom/whatsapp/b;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    const v0, 0x7f0d0034

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/b;->n:Landroid/view/View;

    .line 74
    iget-object v0, p0, Lcom/whatsapp/b;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    add-int/lit8 v0, v0, -0x28

    int-to-float v0, v0

    iget-object v1, p0, Lcom/whatsapp/b;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0a0033

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/whatsapp/b;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->t:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whatsapp/b;->o:I

    .line 59
    const v0, 0x7f0d004e

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/whatsapp/b;->m:Landroid/view/ViewGroup;

    .line 95
    const v0, 0x7f0d0049

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/whatsapp/b;->j:Landroid/widget/ViewFlipper;

    move v1, v2

    .line 12
    :goto_0
    sget-object v0, Lcom/whatsapp/v4;->d:[I

    array-length v0, v0

    if-ge v1, v0, :cond_2

    .line 26
    sget-object v0, Lcom/whatsapp/v4;->d:[I

    aget v0, v0, v1

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 8
    iget-object v4, p0, Lcom/whatsapp/b;->p:[Lcom/whatsapp/pe;

    new-instance v5, Lcom/whatsapp/pe;

    iget-object v6, p0, Lcom/whatsapp/b;->e:Landroid/content/Context;

    invoke-direct {v5, p0, v6, v1}, Lcom/whatsapp/pe;-><init>(Lcom/whatsapp/b;Landroid/content/Context;I)V

    aput-object v5, v4, v1

    .line 4
    iget-object v4, p0, Lcom/whatsapp/b;->p:[Lcom/whatsapp/pe;

    aget-object v4, v4, v1

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 65
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setClickable(Z)V

    .line 15
    const v4, 0x7f02041a

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setSelector(I)V

    .line 55
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 62
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_3

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/b;->j:Landroid/widget/ViewFlipper;

    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 37
    const v0, 0x7f0d004f

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0d0051

    invoke-virtual {p0, v1}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0d0052

    invoke-virtual {p0, v2}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0d0053

    invoke-virtual {p0, v3}, Lcom/whatsapp/b;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/whatsapp/b;->j:Landroid/widget/ViewFlipper;

    iget-object v5, p0, Lcom/whatsapp/b;->m:Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v5}, Lcom/whatsapp/v4;->a(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/ViewFlipper;Landroid/view/ViewGroup;)V

    .line 81
    iget-object v0, p0, Lcom/whatsapp/b;->m:Landroid/view/ViewGroup;

    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Landroid/view/ViewGroup;I)V

    .line 78
    new-instance v0, Lcom/whatsapp/gs;

    invoke-direct {v0, p0}, Lcom/whatsapp/gs;-><init>(Lcom/whatsapp/b;)V

    invoke-virtual {p0, v0}, Lcom/whatsapp/b;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 29
    return-void

    :cond_3
    move v1, v0

    goto :goto_0
.end method

.method public onStart()V
    .locals 4

    .prologue
    .line 58
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 21
    invoke-direct {p0}, Lcom/whatsapp/b;->b()V

    .line 7
    sget-object v0, Lcom/whatsapp/b;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whatsapp/b;->b:Ljava/lang/String;

    .line 70
    :goto_0
    iget-object v1, p0, Lcom/whatsapp/b;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 35
    iget v2, p0, Lcom/whatsapp/b;->s:I

    if-eqz v2, :cond_0

    .line 9
    iget-object v2, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    iget v3, p0, Lcom/whatsapp/b;->s:I

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setHint(I)V

    .line 2
    :cond_0
    iget-object v2, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_1
    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 53
    if-eqz v0, :cond_2

    .line 19
    iget-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    .line 43
    :cond_2
    return-void

    .line 7
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/b;->u:Ljava/lang/String;

    goto :goto_0
.end method

.method public onStop()V
    .locals 3

    .prologue
    .line 40
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 93
    iget-boolean v0, p0, Lcom/whatsapp/b;->c:Z

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/whatsapp/b;->q:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/b;->b:Ljava/lang/String;

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/b;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 54
    return-void
.end method
