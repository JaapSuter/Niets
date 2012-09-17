.class public final Lcom/whatsapp/w0;
.super Ljava/lang/Object;
.source "w0.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4
    :cond_1
    iput-object p1, p0, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    .line 5
    return-void
.end method
