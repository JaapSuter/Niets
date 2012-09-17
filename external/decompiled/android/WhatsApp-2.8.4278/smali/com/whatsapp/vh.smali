.class Lcom/whatsapp/vh;
.super Ljava/lang/Object;
.source "vh.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/App;


# direct methods
.method constructor <init>(Lcom/whatsapp/App;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/vh;->a:Lcom/whatsapp/App;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/whatsapp/App;->Eb()V

    .line 2
    return-void
.end method
