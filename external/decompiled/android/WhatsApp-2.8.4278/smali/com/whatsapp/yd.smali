.class final Lcom/whatsapp/yd;
.super Landroid/text/Editable$Factory;
.source "yd.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2
    invoke-direct {p0}, Landroid/text/Editable$Factory;-><init>()V

    return-void
.end method


# virtual methods
.method public newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 1
    .parameter

    .prologue
    .line 1
    new-instance v0, Lcom/whatsapp/ae;

    invoke-direct {v0, p1}, Lcom/whatsapp/ae;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
