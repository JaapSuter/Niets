.class Lcom/whatsapp/sg;
.super Ljava/lang/Object;
.source "sg.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/rg;


# direct methods
.method constructor <init>(Lcom/whatsapp/rg;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/sg;->a:Lcom/whatsapp/rg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 3
    :goto_0
    const/high16 v0, 0x10

    new-array v0, v0, [B

    goto :goto_0
.end method
