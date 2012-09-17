.class Lcom/whatsapp/gs;
.super Ljava/lang/Object;
.source "gs.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final a:Lcom/whatsapp/b;


# direct methods
.method constructor <init>(Lcom/whatsapp/b;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/gs;->a:Lcom/whatsapp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/gs;->a:Lcom/whatsapp/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/b;->a(Lcom/whatsapp/b;Z)Z

    .line 4
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/b;->b:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/whatsapp/gs;->a:Lcom/whatsapp/b;

    iget-object v0, v0, Lcom/whatsapp/b;->d:Landroid/app/Activity;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/app/Activity;->removeDialog(I)V

    .line 1
    return-void
.end method
