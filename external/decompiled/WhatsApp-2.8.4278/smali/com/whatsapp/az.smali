.class Lcom/whatsapp/az;
.super Ljava/lang/Object;
.source "az.java"


# instance fields
.field a:Z

.field b:J

.field c:J

.field final d:Lcom/whatsapp/yy;


# direct methods
.method private constructor <init>(Lcom/whatsapp/yy;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/az;->d:Lcom/whatsapp/yy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/yy;Lcom/whatsapp/zy;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 2
    invoke-direct {p0, p1}, Lcom/whatsapp/az;-><init>(Lcom/whatsapp/yy;)V

    return-void
.end method
