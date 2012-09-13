.class final Lcom/whatsapp/up;
.super Ljava/lang/Object;
.source "up.java"

# interfaces
.implements Lcom/whatsapp/vp;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 5
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/tp;->g:Z

    .line 3
    return-void
.end method

.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 4
    sget v0, Lcom/whatsapp/tp;->f:I

    add-int/2addr v0, p1

    sput v0, Lcom/whatsapp/tp;->f:I

    .line 2
    return-void
.end method

.method public b(I)V
    .locals 0
    .parameter

    .prologue
    .line 7
    invoke-static {p1}, Lcom/whatsapp/tp;->d(I)I

    .line 6
    return-void
.end method
