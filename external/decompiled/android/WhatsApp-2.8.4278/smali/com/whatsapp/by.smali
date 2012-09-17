.class Lcom/whatsapp/by;
.super Ljava/lang/Object;
.source "by.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/PickFileType;


# direct methods
.method constructor <init>(Lcom/whatsapp/PickFileType;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/by;->a:Lcom/whatsapp/PickFileType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 1
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whatsapp/by;->a:Lcom/whatsapp/PickFileType;

    invoke-static {v0, v1}, Lcom/whatsapp/j5;->b(ILandroid/app/Activity;)V

    .line 3
    return-void
.end method
