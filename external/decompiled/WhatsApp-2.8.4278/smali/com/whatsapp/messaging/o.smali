.class public Lcom/whatsapp/messaging/o;
.super Ljava/lang/Object;
.source "o.java"

# interfaces
.implements Lcom/whatsapp/h1;


# instance fields
.field final a:Lcom/whatsapp/messaging/m;


# direct methods
.method public constructor <init>(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/messaging/o;->a:Lcom/whatsapp/messaging/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([B[B)Lcom/whatsapp/g1;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 4
    :try_start_0
    new-instance v0, Lcom/whatsapp/kz;

    invoke-direct {v0, p1, p2}, Lcom/whatsapp/kz;-><init>([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    .line 3
    :catch_0
    move-exception v0

    .line 1
    const/4 v0, 0x0

    goto :goto_0
.end method
