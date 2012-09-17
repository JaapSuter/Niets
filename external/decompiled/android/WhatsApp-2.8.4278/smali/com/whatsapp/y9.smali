.class Lcom/whatsapp/y9;
.super Ljava/lang/Thread;
.source "y9.java"


# instance fields
.field final a:Lcom/whatsapp/ViewSharedContactActivity;


# direct methods
.method constructor <init>(Lcom/whatsapp/ViewSharedContactActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/y9;->a:Lcom/whatsapp/ViewSharedContactActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(Z)I

    .line 2
    return-void
.end method
