.class public Lcom/whatsapp/k5;
.super Ljava/lang/Object;
.source "k5.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0
    .parameter

    .prologue
    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lcom/whatsapp/k5;->a:Z

    .line 3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/k5;->a:Z

    .line 9
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/k5;->a:Z

    .line 7
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1
    .parameter

    .prologue
    .line 8
    iget-boolean v0, p0, Lcom/whatsapp/k5;->a:Z

    if-eqz v0, :cond_0

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/whatsapp/k5;->a:Z

    return v0
.end method
