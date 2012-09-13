.class Lcom/whatsapp/p1;
.super Ljava/lang/Object;
.source "p1.java"

# interfaces
.implements Lcom/whatsapp/nr;


# instance fields
.field final a:Lcom/whatsapp/n1;


# direct methods
.method constructor <init>(Lcom/whatsapp/n1;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/p1;->a:Lcom/whatsapp/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/p1;->a:Lcom/whatsapp/n1;

    iget-object v0, v0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->finish()V

    .line 2
    return-void
.end method
