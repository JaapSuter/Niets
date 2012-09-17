.class public Lcom/whatsapp/AbridgedTextView;
.super Landroid/widget/TextView;
.source "AbridgedTextView.java"


# static fields
.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v1, 0x2e

    const/16 v4, 0x19

    const/16 v2, 0x14

    const/16 v3, 0xb

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u00158m+"

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

    const-string v0, "\u0000:m"

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

    sput-object v9, Lcom/whatsapp/AbridgedTextView;->z:[Ljava/lang/String;

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
    const/16 v0, 0x43

    goto :goto_2

    :pswitch_3
    move v0, v3

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
    const/16 v0, 0x43

    goto :goto_3

    :pswitch_7
    move v0, v3

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter

    .prologue
    .line 16
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method private a(Ljava/lang/String;C)Z
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move v0, v1

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, p2, :cond_2

    .line 18
    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1

    .line 17
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    goto :goto_0
.end method


# virtual methods
.method a(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 26
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 1
    invoke-virtual {p0}, Lcom/whatsapp/AbridgedTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0008

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 10
    invoke-virtual {p0}, Lcom/whatsapp/AbridgedTextView;->getWidth()I

    move-result v2

    int-to-float v7, v2

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    new-array v8, v2, [F

    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2, v8}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;II[F)I

    .line 13
    const/4 v0, 0x2

    .line 2
    sget-object v2, Lcom/whatsapp/AbridgedTextView;->z:[Ljava/lang/String;

    aget-object v9, v2, v1

    move v2, v1

    move v3, v0

    move v4, v1

    move v5, v1

    move v0, v1

    .line 36
    :cond_0
    array-length v10, v8

    if-ge v0, v10, :cond_4

    .line 21
    int-to-float v5, v5

    aget v10, v8, v0

    add-float/2addr v5, v10

    float-to-int v5, v5

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-direct {p0, v9, v10}, Lcom/whatsapp/AbridgedTextView;->a(Ljava/lang/String;C)Z

    move-result v10

    if-eqz v10, :cond_1

    move v4, v0

    .line 15
    :cond_1
    int-to-float v10, v5

    cmpl-float v10, v10, v7

    if-lez v10, :cond_2

    .line 11
    add-int/lit8 v3, v3, -0x1

    move v2, v0

    move v5, v1

    move v0, v4

    .line 7
    :cond_2
    if-nez v3, :cond_3

    .line 5
    add-int/lit8 v2, v2, -0x3

    .line 19
    if-eqz v6, :cond_4

    .line 30
    :cond_3
    add-int/lit8 v0, v0, 0x1

    if-eqz v6, :cond_0

    .line 24
    :cond_4
    if-nez v3, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/AbridgedTextView;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_5
    return-object p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 8
    invoke-super {p0, p2, p1, p3, p4}, Landroid/widget/TextView;->onSizeChanged(IIII)V

    .line 27
    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/AbridgedTextView;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    return-void
.end method
