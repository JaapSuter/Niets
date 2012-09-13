.class Lcom/whatsapp/q3;
.super Ljava/lang/Object;
.source "q3.java"

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
    iput-object p1, p0, Lcom/whatsapp/q3;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 2
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 1
    invoke-static {}, Lcom/whatsapp/e4;->c()V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/q3;->a:Lcom/whatsapp/Settings;

    invoke-virtual {v0}, Lcom/whatsapp/Settings;->b()V

    .line 4
    :cond_0
    return-void
.end method
