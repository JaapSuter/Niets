.class public final Lcom/whatsapp/ae;
.super Landroid/text/SpannableStringBuilder;
.source "ae.java"


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    invoke-direct {p0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 5
    return-void
.end method


# virtual methods
.method public charAt(I)C
    .locals 1
    .parameter

    .prologue
    .line 2
    if-gez p1, :cond_0

    .line 8
    const/16 v0, 0x20

    :goto_0
    return v0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    goto :goto_0
.end method

.method public getChars(II[CI)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    if-ge p1, p2, :cond_0

    .line 7
    invoke-super {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->getChars(II[CI)V

    .line 4
    :cond_0
    return-void
.end method
