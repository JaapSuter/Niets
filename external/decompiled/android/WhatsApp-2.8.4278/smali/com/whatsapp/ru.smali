.class Lcom/whatsapp/ru;
.super Ljava/lang/Object;
.source "ru.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/GroupChatMap;


# direct methods
.method constructor <init>(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ru;->a:Lcom/whatsapp/GroupChatMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/ru;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->b(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/GoogleMapView;

    move-result-object v1

    iget-object v0, p0, Lcom/whatsapp/ru;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v0}, Lcom/whatsapp/GroupChatMap;->b(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/GoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/GoogleMapView;->isSatellite()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/whatsapp/GoogleMapView;->setSatellite(Z)V

    .line 1
    return-void

    .line 3
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
