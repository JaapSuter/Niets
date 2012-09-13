.class final Lcom/whatsapp/y4;
.super Ljava/lang/Object;
.source "y4.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Landroid/widget/ViewFlipper;

.field final b:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Landroid/widget/ViewFlipper;Landroid/view/ViewGroup;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/y4;->a:Landroid/widget/ViewFlipper;

    iput-object p2, p0, Lcom/whatsapp/y4;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    const/4 v0, 0x2

    sput v0, Lcom/whatsapp/v4;->b:I

    .line 2
    iget-object v0, p0, Lcom/whatsapp/y4;->a:Landroid/widget/ViewFlipper;

    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/y4;->b:Landroid/view/ViewGroup;

    sget v1, Lcom/whatsapp/v4;->b:I

    invoke-static {v0, v1}, Lcom/whatsapp/v4;->a(Landroid/view/ViewGroup;I)V

    .line 5
    return-void
.end method
