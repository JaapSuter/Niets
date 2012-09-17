.class public Lcom/whatsapp/dj;
.super Ljava/lang/Object;
.source "dj.java"


# instance fields
.field a:I

.field private b:I

.field c:F

.field d:Lcom/whatsapp/sz;

.field e:Lcom/whatsapp/dj;

.field f:Lcom/whatsapp/dj;


# direct methods
.method public constructor <init>(ILcom/whatsapp/sz;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    const/16 v0, -0x63

    iput v0, p0, Lcom/whatsapp/dj;->a:I

    .line 11
    iput p1, p0, Lcom/whatsapp/dj;->a:I

    .line 6
    iput-object p2, p0, Lcom/whatsapp/dj;->d:Lcom/whatsapp/sz;

    .line 4
    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/16 v0, -0x63

    iput v0, p0, Lcom/whatsapp/dj;->a:I

    .line 2
    if-eqz p2, :cond_0

    .line 9
    iput-object p1, p0, Lcom/whatsapp/dj;->e:Lcom/whatsapp/dj;

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    .line 13
    :cond_1
    iput-object p3, p0, Lcom/whatsapp/dj;->d:Lcom/whatsapp/sz;

    .line 7
    return-void
.end method

.method static a(Lcom/whatsapp/dj;)I
    .locals 1
    .parameter

    .prologue
    .line 5
    iget v0, p0, Lcom/whatsapp/dj;->b:I

    return v0
.end method


# virtual methods
.method public a(I)V
    .locals 0
    .parameter

    .prologue
    .line 10
    iput p1, p0, Lcom/whatsapp/dj;->b:I

    .line 15
    return-void
.end method
