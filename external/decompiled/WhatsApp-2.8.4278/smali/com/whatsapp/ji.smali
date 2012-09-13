.class Lcom/whatsapp/ji;
.super Ljava/lang/Object;
.source "ji.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMediaPicker;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMediaPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ji;->a:Lcom/whatsapp/BroadcastMediaPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 1
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whatsapp/ji;->a:Lcom/whatsapp/BroadcastMediaPicker;

    invoke-static {v0, v1}, Lcom/whatsapp/j5;->b(ILandroid/app/Activity;)V

    .line 3
    return-void
.end method
