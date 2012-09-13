.class Lcom/whatsapp/t1;
.super Ljava/lang/Object;
.source "t1.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/RecordAudio;


# direct methods
.method constructor <init>(Lcom/whatsapp/RecordAudio;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/t1;->a:Lcom/whatsapp/RecordAudio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/t1;->a:Lcom/whatsapp/RecordAudio;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/RecordAudio;->removeDialog(I)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/t1;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->finish()V

    .line 1
    return-void
.end method
