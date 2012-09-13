.class public Lhb;
.super Ljava/lang/Object;
.source "hb.java"


# static fields
.field public static a:Z


# direct methods
.method public static a(Ljava/lang/CharSequence;II[CI)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lhb;->a:Z

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 4
    const-class v0, Ljava/lang/String;

    if-ne v2, v0, :cond_0

    move-object v0, p0

    .line 5
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/lang/String;->getChars(II[CI)V

    if-eqz v1, :cond_4

    .line 8
    :cond_0
    const-class v0, Ljava/lang/StringBuffer;

    if-ne v2, v0, :cond_1

    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    if-eqz v1, :cond_4

    .line 15
    :cond_1
    const-class v0, Ljava/lang/StringBuilder;

    if-ne v2, v0, :cond_2

    move-object v0, p0

    .line 16
    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    if-eqz v1, :cond_4

    .line 13
    :cond_2
    instance-of v0, p0, Lw;

    if-eqz v0, :cond_3

    move-object v0, p0

    .line 11
    check-cast v0, Lw;

    invoke-interface {v0, p1, p2, p3, p4}, Lw;->a(II[CI)V

    if-eqz v1, :cond_4

    .line 3
    :cond_3
    :goto_0
    if-ge p1, p2, :cond_4

    .line 7
    add-int/lit8 v0, p4, 0x1

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    aput-char v2, p3, p4

    .line 9
    add-int/lit8 p1, p1, 0x1

    if-eqz v1, :cond_5

    .line 14
    :cond_4
    return-void

    :cond_5
    move p4, v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/CharSequence;)Z
    .locals 1
    .parameter

    .prologue
    .line 10
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 12
    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 1
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
