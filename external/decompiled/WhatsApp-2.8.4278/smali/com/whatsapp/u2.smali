.class Lcom/whatsapp/u2;
.super Ljava/lang/Object;
.source "u2.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/Settings;


# direct methods
.method constructor <init>(Lcom/whatsapp/Settings;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/u2;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/u2;->a:Lcom/whatsapp/Settings;

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->removeDialog(I)V

    .line 1
    return-void
.end method