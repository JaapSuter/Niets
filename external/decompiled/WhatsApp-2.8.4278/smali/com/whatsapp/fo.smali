.class Lcom/whatsapp/fo;
.super Ljava/lang/Object;
.source "fo.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/w8;


# direct methods
.method constructor <init>(Lcom/whatsapp/w8;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/fo;->a:Lcom/whatsapp/w8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/fo;->a:Lcom/whatsapp/w8;

    iget-object v0, v0, Lcom/whatsapp/w8;->a:Lcom/whatsapp/eo;

    iget-object v0, v0, Lcom/whatsapp/eo;->a:Lcom/whatsapp/Conversations;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversations;->removeDialog(I)V

    .line 1
    return-void
.end method
