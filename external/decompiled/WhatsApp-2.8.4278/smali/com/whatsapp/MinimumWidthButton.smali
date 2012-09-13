.class public Lcom/whatsapp/MinimumWidthButton;
.super Landroid/widget/Button;
.source "MinimumWidthButton.java"


# static fields
.field static minimunWidth:I

.field private static final z:Ljava/lang/String;


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v4, 0x0

    const-string v0, "K~x@\u0013"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    move v2, v1

    move v3, v4

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/MinimumWidthButton;->z:Ljava/lang/String;

    .line 18
    sput v4, Lcom/whatsapp/MinimumWidthButton;->minimunWidth:I

    return-void

    .line -1
    :cond_0
    aget-char v5, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7b

    :goto_1
    xor-int/2addr v0, v5

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x3c

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x17

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x1c

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x34

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    iput-object p1, p0, Lcom/whatsapp/MinimumWidthButton;->mContext:Landroid/content/Context;

    move v0, v1

    .line 8
    :cond_0
    invoke-interface {p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 16
    invoke-interface {p2, v0}, Landroid/util/AttributeSet;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/MinimumWidthButton;->z:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-interface {p2, v0}, Landroid/util/AttributeSet;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v4

    iget v4, v4, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    sput v3, Lcom/whatsapp/MinimumWidthButton;->minimunWidth:I

    .line 17
    if-eqz v2, :cond_2

    .line 11
    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 15
    :cond_2
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 10
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3}, Landroid/text/TextPaint;-><init>()V

    .line 20
    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0a0008

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v3, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 14
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 12
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    new-array v4, v4, [F

    .line 21
    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    invoke-virtual {v3, v5, v0, v6, v4}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/CharSequence;II[F)I

    .line 24
    :cond_0
    array-length v3, v4

    if-ge v0, v3, :cond_1

    .line 23
    aget v3, v4, v0

    add-float/2addr v1, v3

    .line 19
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/MinimumWidthButton;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->J:F

    add-float/2addr v1, v0

    .line 1
    sget v0, Lcom/whatsapp/MinimumWidthButton;->minimunWidth:I

    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getSuggestedMinimumWidth()I

    move-result v2

    if-le v0, v2, :cond_2

    sget v0, Lcom/whatsapp/MinimumWidthButton;->minimunWidth:I

    .line 13
    :goto_0
    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v2, p2}, Lcom/whatsapp/MinimumWidthButton;->resolveSize(II)I

    move-result v2

    .line 2
    int-to-float v3, v0

    cmpl-float v3, v3, v1

    if-lez v3, :cond_3

    int-to-float v0, v0

    :goto_1
    float-to-int v0, v0

    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/MinimumWidthButton;->setMeasuredDimension(II)V

    .line 3
    return-void

    .line 1
    :cond_2
    invoke-virtual {p0}, Lcom/whatsapp/MinimumWidthButton;->getSuggestedMinimumWidth()I

    move-result v0

    goto :goto_0

    :cond_3
    move v0, v1

    .line 2
    goto :goto_1
.end method
