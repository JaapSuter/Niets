.class public Lcom/whatsapp/rn;
.super Ljava/lang/Object;
.source "rn.java"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whatsapp/rn;->a:Ljava/lang/String;

    .line 7
    iput p2, p0, Lcom/whatsapp/rn;->b:I

    .line 3
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/rn;-><init>(Ljava/lang/String;I)V

    .line 1
    iput-object p3, p0, Lcom/whatsapp/rn;->c:Ljava/lang/String;

    .line 5
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/rn;->a:Ljava/lang/String;

    return-object v0
.end method
