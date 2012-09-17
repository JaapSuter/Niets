.class public Lcom/whatsapp/zp;
.super Ljava/lang/Object;
.source "zp.java"


# instance fields
.field public a:Lcom/whatsapp/tf;

.field public b:Lcom/whatsapp/sf;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whatsapp/tf;Lcom/whatsapp/sf;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whatsapp/zp;->a:Lcom/whatsapp/tf;

    .line 1
    iput-object p2, p0, Lcom/whatsapp/zp;->b:Lcom/whatsapp/sf;

    .line 2
    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/tf;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whatsapp/zp;->a:Lcom/whatsapp/tf;

    .line 6
    iput-object p2, p0, Lcom/whatsapp/zp;->c:Ljava/lang/String;

    .line 5
    return-void
.end method
