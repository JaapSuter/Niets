.class public Lu;
.super Ljava/lang/Object;
.source "u.java"


# static fields
.field private static a:[Ljava/lang/Object;

.field private static b:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lu;->a:[Ljava/lang/Object;

    .line 7
    const/16 v0, 0x49

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lu;->b:[Ljava/lang/Object;

    return-void
.end method

.method public static a(I)I
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    sget-boolean v1, Lhb;->a:Z

    .line 4
    const/4 v0, 0x4

    :cond_0
    const/16 v2, 0x20

    if-ge v0, v2, :cond_1

    .line 11
    shl-int v2, v3, v0

    add-int/lit8 v2, v2, -0xc

    if-gt p0, v2, :cond_2

    .line 14
    shl-int v0, v3, v0

    add-int/lit8 p0, v0, -0xc

    :cond_1
    :goto_0
    return p0

    .line 13
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)[TT;"
        }
    .end annotation

    .prologue
    .line 12
    const-class v0, Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    .line 5
    sget-object v0, Lu;->a:[Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 16
    :goto_0
    return-object v0

    .line 15
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/lit8 v1, v0, 0x49

    .line 3
    sget-object v0, Lu;->b:[Ljava/lang/Object;

    aget-object v0, v0, v1

    .line 9
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    if-eq v2, p0, :cond_2

    .line 17
    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    .line 8
    sget-object v2, Lu;->b:[Ljava/lang/Object;

    aput-object v0, v2, v1

    .line 16
    :cond_2
    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0
.end method

.method public static b(I)I
    .locals 1
    .parameter

    .prologue
    .line 1
    mul-int/lit8 v0, p0, 0x2

    invoke-static {v0}, Lu;->a(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public static c(I)I
    .locals 1
    .parameter

    .prologue
    .line 2
    mul-int/lit8 v0, p0, 0x4

    invoke-static {v0}, Lu;->a(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    return v0
.end method
