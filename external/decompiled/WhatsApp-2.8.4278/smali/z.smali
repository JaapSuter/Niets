.class public Lz;
.super Ljava/lang/Object;
.source "z.java"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2
    new-instance v0, Lcb;

    invoke-direct {v0, v1}, Lcb;-><init>(Lab;)V

    sput-object v0, Lz;->a:Ljava/lang/Object;

    .line 4
    new-instance v0, Lbb;

    invoke-direct {v0, v1}, Lbb;-><init>(Lab;)V

    sput-object v0, Lz;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Ljava/lang/CharSequence;)I
    .locals 1
    .parameter

    .prologue
    .line 7
    instance-of v0, p0, Lfb;

    if-eqz v0, :cond_0

    .line 5
    check-cast p0, Lfb;

    sget-object v0, Lz;->a:Ljava/lang/Object;

    invoke-interface {p0, v0}, Lfb;->a(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    .line 3
    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static final b(Ljava/lang/CharSequence;)I
    .locals 1
    .parameter

    .prologue
    .line 1
    instance-of v0, p0, Lfb;

    if-eqz v0, :cond_0

    .line 8
    check-cast p0, Lfb;

    sget-object v0, Lz;->b:Ljava/lang/Object;

    invoke-interface {p0, v0}, Lfb;->a(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    .line 6
    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method
