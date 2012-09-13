.class public abstract Lcom/whatsapp/billing/k;
.super Ljava/lang/Object;
.source "k.java"


# static fields
.field private static final b:[Ljava/lang/Class;


# instance fields
.field private final a:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 2
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/IntentSender;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Landroid/content/Intent;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/billing/k;->b:[Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/whatsapp/billing/b;Ljava/lang/String;IJLjava/lang/String;)V
.end method

.method b(Lcom/whatsapp/billing/b;Ljava/lang/String;IJLjava/lang/String;)V
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iget-object v8, p0, Lcom/whatsapp/billing/k;->a:Landroid/os/Handler;

    new-instance v0, Lcom/whatsapp/billing/l;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/whatsapp/billing/l;-><init>(Lcom/whatsapp/billing/k;Lcom/whatsapp/billing/b;Ljava/lang/String;IJLjava/lang/String;)V

    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 3
    return-void
.end method
