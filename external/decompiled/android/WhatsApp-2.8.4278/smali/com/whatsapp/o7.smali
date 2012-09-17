.class Lcom/whatsapp/o7;
.super Ljava/lang/Object;
.source "o7.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/ViewProfilePhoto;


# direct methods
.method constructor <init>(Lcom/whatsapp/ViewProfilePhoto;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/o7;->a:Lcom/whatsapp/ViewProfilePhoto;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/o7;->a:Lcom/whatsapp/ViewProfilePhoto;

    invoke-static {v0}, Lcom/whatsapp/ViewProfilePhoto;->a(Lcom/whatsapp/ViewProfilePhoto;)Lcom/whatsapp/zq;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/o7;->a:Lcom/whatsapp/ViewProfilePhoto;

    const/16 v2, 0xc

    invoke-static {v0, v1, v2}, Lcom/whatsapp/iz;->a(Lcom/whatsapp/zq;Landroid/app/Activity;I)V

    .line 2
    return-void
.end method
