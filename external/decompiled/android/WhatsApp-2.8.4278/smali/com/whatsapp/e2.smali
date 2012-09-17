.class Lcom/whatsapp/e2;
.super Ljava/lang/Object;
.source "e2.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/whatsapp/RegisterPhone;


# direct methods
.method constructor <init>(Lcom/whatsapp/RegisterPhone;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/e2;->b:Lcom/whatsapp/RegisterPhone;

    iput-object p2, p0, Lcom/whatsapp/e2;->a:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/whatsapp/e2;->b:Lcom/whatsapp/RegisterPhone;

    const/16 v1, 0x16

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/e2;->b:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/e2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->a(Ljava/lang/String;)V

    .line 3
    return-void
.end method
