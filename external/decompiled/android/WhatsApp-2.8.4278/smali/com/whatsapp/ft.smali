.class Lcom/whatsapp/ft;
.super Ljava/lang/Object;
.source "ft.java"

# interfaces
.implements Lcom/whatsapp/gw;


# instance fields
.field final a:Lcom/whatsapp/GalleryView;


# direct methods
.method constructor <init>(Lcom/whatsapp/GalleryView;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/ft;->a:Lcom/whatsapp/GalleryView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/ft;->a:Lcom/whatsapp/GalleryView;

    iget-boolean v0, v0, Lcom/whatsapp/GalleryView;->locked:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ft;->a:Lcom/whatsapp/GalleryView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/whatsapp/GalleryView;->locked:Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ft;->a:Lcom/whatsapp/GalleryView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/whatsapp/GalleryView;->locked:Z

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ft;->a:Lcom/whatsapp/GalleryView;

    iget-boolean v0, v0, Lcom/whatsapp/GalleryView;->locked:Z

    return v0
.end method
