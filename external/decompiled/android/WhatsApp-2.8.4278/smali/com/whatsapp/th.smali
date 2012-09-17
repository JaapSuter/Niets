.class Lcom/whatsapp/th;
.super Ljava/lang/Object;
.source "th.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/App$16;


# direct methods
.method constructor <init>(Lcom/whatsapp/App$16;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/th;->a:Lcom/whatsapp/App$16;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 2
    invoke-static {}, Lcom/whatsapp/g5;->c()Ljava/io/File;

    .line 1
    return-void
.end method
