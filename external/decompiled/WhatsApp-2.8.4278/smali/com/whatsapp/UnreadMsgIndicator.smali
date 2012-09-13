.class public Lcom/whatsapp/UnreadMsgIndicator;
.super Landroid/view/View;
.source "UnreadMsgIndicator.java"


# instance fields
.field mContext:Landroid/content/Context;

.field textPaint:Landroid/text/TextPaint;

.field unreadCount:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 11
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    .line 8
    iput-object p1, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    .line 4
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2
    .parameter

    .prologue
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/UnreadMsgIndicator;->unreadCount:Ljava/lang/String;

    .line 23
    invoke-virtual {p0}, Lcom/whatsapp/UnreadMsgIndicator;->invalidate()V

    .line 13
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8
    .parameter

    .prologue
    const/4 v7, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 12
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 26
    const/16 v4, 0x79

    const/16 v5, 0x81

    const/16 v6, 0x89

    invoke-static {v4, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    new-instance v4, Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/whatsapp/UnreadMsgIndicator;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p0}, Lcom/whatsapp/UnreadMsgIndicator;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-direct {v4, v1, v1, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 2
    iget-object v5, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v5}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v5

    iget v5, v5, Lcom/whatsapp/j4;->G:I

    int-to-float v5, v5

    iget-object v6, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v6}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v6

    iget v6, v6, Lcom/whatsapp/j4;->G:I

    int-to-float v6, v6

    invoke-virtual {p1, v4, v5, v6, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 3
    iget-object v3, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v3, v7}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 17
    iget-object v3, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/text/TextPaint;->setColor(I)V

    .line 6
    iget-object v3, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    iget-object v4, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v4}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v4

    iget v4, v4, Lcom/whatsapp/j4;->D:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 24
    iget-object v3, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v4}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 9
    iget-object v3, p0, Lcom/whatsapp/UnreadMsgIndicator;->unreadCount:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-array v3, v3, [F

    .line 19
    iget-object v4, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    iget-object v5, p0, Lcom/whatsapp/UnreadMsgIndicator;->unreadCount:Ljava/lang/String;

    iget-object v6, p0, Lcom/whatsapp/UnreadMsgIndicator;->unreadCount:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v5, v0, v6, v3}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;II[F)I

    .line 5
    :cond_0
    array-length v4, v3

    if-ge v0, v4, :cond_1

    .line 10
    aget v4, v3, v0

    add-float/2addr v1, v4

    .line 20
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/UnreadMsgIndicator;->unreadCount:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->H:I

    int-to-float v2, v2

    const/high16 v3, 0x4000

    div-float/2addr v1, v3

    sub-float v1, v2, v1

    iget-object v2, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v2

    iget v2, v2, Lcom/whatsapp/j4;->I:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/whatsapp/UnreadMsgIndicator;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 14
    iget-object v0, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->E:I

    iget-object v1, p0, Lcom/whatsapp/UnreadMsgIndicator;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->F:I

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/UnreadMsgIndicator;->setMeasuredDimension(II)V

    .line 21
    return-void
.end method
