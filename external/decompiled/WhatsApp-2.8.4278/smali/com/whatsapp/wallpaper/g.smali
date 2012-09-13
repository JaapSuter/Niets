.class Lcom/whatsapp/wallpaper/g;
.super Ljava/lang/Object;
.source "g.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/wallpaper/k;

.field final b:Z

.field final c:Lcom/whatsapp/wallpaper/ImageViewTouchBase;


# direct methods
.method constructor <init>(Lcom/whatsapp/wallpaper/ImageViewTouchBase;Lcom/whatsapp/wallpaper/k;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/wallpaper/g;->c:Lcom/whatsapp/wallpaper/ImageViewTouchBase;

    iput-object p2, p0, Lcom/whatsapp/wallpaper/g;->a:Lcom/whatsapp/wallpaper/k;

    iput-boolean p3, p0, Lcom/whatsapp/wallpaper/g;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/wallpaper/g;->c:Lcom/whatsapp/wallpaper/ImageViewTouchBase;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/g;->a:Lcom/whatsapp/wallpaper/k;

    iget-boolean v2, p0, Lcom/whatsapp/wallpaper/g;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Lcom/whatsapp/wallpaper/k;Z)V

    .line 1
    return-void
.end method
