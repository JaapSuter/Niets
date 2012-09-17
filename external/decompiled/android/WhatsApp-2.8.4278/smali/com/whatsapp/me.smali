.class Lcom/whatsapp/me;
.super Landroid/widget/BaseAdapter;
.source "me.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field final c:Lcom/whatsapp/Conversation;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, " (>n%8\u0016.o6 (3d\""

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

    sput-object v0, Lcom/whatsapp/me;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x50

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x4c

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x49

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x47

    goto :goto_1

    :pswitch_3
    const/4 v0, 0x1

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

.method public constructor <init>(Lcom/whatsapp/Conversation;Landroid/content/Context;I)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 18
    iput-object p1, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 35
    iput-object p2, p0, Lcom/whatsapp/me;->a:Landroid/content/Context;

    .line 2
    iput p3, p0, Lcom/whatsapp/me;->b:I

    .line 13
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 3

    .prologue
    .line 22
    sget v0, Lcom/whatsapp/v4;->b:I

    invoke-static {v0}, Lcom/whatsapp/v4;->a(I)I

    move-result v0

    iget-object v1, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget v1, v1, Lcom/whatsapp/Conversation;->X:I

    div-int v1, v0, v1

    sget v0, Lcom/whatsapp/v4;->b:I

    invoke-static {v0}, Lcom/whatsapp/v4;->a(I)I

    move-result v0

    iget-object v2, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget v2, v2, Lcom/whatsapp/Conversation;->X:I

    rem-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 33
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter

    .prologue
    .line 21
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v8, 0x0

    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 9
    if-eqz p2, :cond_0

    move-object v0, p2

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget v1, v1, Lcom/whatsapp/Conversation;->X:I

    if-eq v0, v1, :cond_6

    .line 11
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/me;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 7
    const v1, 0x7f030034

    invoke-virtual {v0, v1, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move v1, v2

    .line 32
    :cond_1
    iget-object v4, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget v4, v4, Lcom/whatsapp/Conversation;->X:I

    if-ge v1, v4, :cond_2

    .line 4
    new-instance v4, Landroid/widget/ImageView;

    iget-object v5, p0, Lcom/whatsapp/me;->a:Landroid/content/Context;

    invoke-direct {v4, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 6
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v6, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    invoke-static {v6}, Lcom/whatsapp/Conversation;->m(Lcom/whatsapp/Conversation;)Lcom/whatsapp/j4;

    move-result-object v6

    iget v6, v6, Lcom/whatsapp/j4;->t:I

    iget-object v7, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    invoke-static {v7}, Lcom/whatsapp/Conversation;->m(Lcom/whatsapp/Conversation;)Lcom/whatsapp/j4;

    move-result-object v7

    iget v7, v7, Lcom/whatsapp/j4;->u:I

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 34
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 25
    add-int/lit8 v1, v1, 0x1

    if-eqz v3, :cond_1

    :cond_2
    move-object p2, v0

    :goto_0
    move v1, v2

    .line 23
    :goto_1
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 12
    iget v0, p0, Lcom/whatsapp/me;->b:I

    iget-object v4, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget v4, v4, Lcom/whatsapp/Conversation;->X:I

    mul-int/2addr v4, p1

    add-int/2addr v4, v1

    invoke-static {v0, v4}, Lcom/whatsapp/v4;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 1
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 8
    if-eqz v4, :cond_3

    .line 3
    iget-object v5, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    invoke-static {v5}, Lcom/whatsapp/Conversation;->m(Lcom/whatsapp/Conversation;)Lcom/whatsapp/j4;

    move-result-object v5

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Lcom/whatsapp/j4;->a(F)F

    move-result v5

    float-to-int v5, v5

    iget-object v6, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    invoke-static {v6}, Lcom/whatsapp/Conversation;->m(Lcom/whatsapp/Conversation;)Lcom/whatsapp/j4;

    move-result-object v6

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Lcom/whatsapp/j4;->a(F)F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v4, v2, v2, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 15
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    const v4, 0x7f02040e

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 29
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 14
    iget-object v4, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget v4, v4, Lcom/whatsapp/Conversation;->X:I

    mul-int/2addr v4, p1

    add-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 24
    iget-object v4, p0, Lcom/whatsapp/me;->c:Lcom/whatsapp/Conversation;

    iget-object v4, v4, Lcom/whatsapp/Conversation;->gc:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v3, :cond_4

    .line 17
    :cond_3
    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 30
    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 27
    :cond_4
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_7

    .line 36
    :cond_5
    invoke-virtual {p2, v2}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 5
    new-instance v0, Lcom/whatsapp/mn;

    invoke-direct {v0, p0}, Lcom/whatsapp/mn;-><init>(Lcom/whatsapp/me;)V

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 26
    return-object p2

    .line 20
    :cond_6
    check-cast p2, Landroid/widget/LinearLayout;

    goto :goto_0

    :cond_7
    move v1, v0

    goto :goto_1
.end method
