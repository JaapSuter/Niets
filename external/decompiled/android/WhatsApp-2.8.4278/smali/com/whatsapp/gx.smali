.class Lcom/whatsapp/gx;
.super Ljava/lang/Object;
.source "gx.java"

# interfaces
.implements Lcom/whatsapp/nr;


# instance fields
.field final a:Lcom/whatsapp/fx;


# direct methods
.method constructor <init>(Lcom/whatsapp/fx;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/gx;->a:Lcom/whatsapp/fx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/gx;->a:Lcom/whatsapp/fx;

    iget-object v0, v0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/MediaView;->a(Lcom/whatsapp/MediaView;Z)Z

    .line 3
    iget-object v0, p0, Lcom/whatsapp/gx;->a:Lcom/whatsapp/fx;

    iget-object v0, v0, Lcom/whatsapp/fx;->c:Lcom/whatsapp/MediaView;

    invoke-virtual {v0}, Lcom/whatsapp/MediaView;->finish()V

    .line 1
    return-void
.end method
