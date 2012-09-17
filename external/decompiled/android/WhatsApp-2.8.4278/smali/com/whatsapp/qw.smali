.class public Lcom/whatsapp/qw;
.super Ljava/lang/Object;
.source "qw.java"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/whatsapp/wz;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iput-object p1, p0, Lcom/whatsapp/qw;->a:Ljava/lang/String;

    .line 2
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0
    .parameter

    .prologue
    .line 5
    return-void
.end method

.method public run()V
    .locals 0

    .prologue
    .line 4
    return-void
.end method
