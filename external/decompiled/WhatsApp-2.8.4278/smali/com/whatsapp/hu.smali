.class public Lcom/whatsapp/hu;
.super Ljava/lang/Object;
.source "hu.java"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whatsapp/hu;->b:Ljava/lang/String;

    .line 1
    iput p2, p0, Lcom/whatsapp/hu;->a:I

    .line 4
    return-void
.end method
