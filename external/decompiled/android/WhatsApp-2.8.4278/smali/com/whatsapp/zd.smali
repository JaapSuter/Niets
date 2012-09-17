.class final Lcom/whatsapp/zd;
.super Landroid/text/Spannable$Factory;
.source "zd.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1
    invoke-direct {p0}, Landroid/text/Spannable$Factory;-><init>()V

    return-void
.end method


# virtual methods
.method public newSpannable(Ljava/lang/CharSequence;)Landroid/text/Spannable;
    .locals 2
    .parameter

    .prologue
    .line 2
    new-instance v0, Lcom/whatsapp/g4;

    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1}, Lcom/whatsapp/g4;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
