.class Lcom/whatsapp/y6;
.super Ljava/lang/Object;
.source "y6.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/VerifySms;


# direct methods
.method constructor <init>(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/y6;->a:Lcom/whatsapp/VerifySms;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/y6;->a:Lcom/whatsapp/VerifySms;

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifySms;->removeDialog(I)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/y6;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->n(Lcom/whatsapp/VerifySms;)V

    .line 4
    return-void
.end method