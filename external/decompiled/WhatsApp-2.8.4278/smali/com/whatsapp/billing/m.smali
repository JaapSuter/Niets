.class public Lcom/whatsapp/billing/m;
.super Ljava/lang/Object;
.source "m.java"


# static fields
.field private static a:Lcom/whatsapp/billing/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Lcom/whatsapp/billing/k;
    .locals 1

    .prologue
    .line 4
    sget-object v0, Lcom/whatsapp/billing/m;->a:Lcom/whatsapp/billing/k;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/whatsapp/billing/b;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    new-instance v8, Ljava/lang/Thread;

    new-instance v0, Lcom/whatsapp/billing/n;

    move-object v1, p0

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/whatsapp/billing/n;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/billing/b;JLjava/lang/String;)V

    invoke-direct {v8, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 1
    return-void
.end method
