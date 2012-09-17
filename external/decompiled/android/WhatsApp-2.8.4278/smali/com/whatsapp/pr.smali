.class Lcom/whatsapp/pr;
.super Ljava/lang/Object;
.source "pr.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method constructor <init>(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/pr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/pr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1
    return-void
.end method
