.class Lcom/whatsapp/sr;
.super Ljava/lang/Object;
.source "sr.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method constructor <init>(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/sr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    if-eqz p3, :cond_0

    .line 7
    :cond_0
    const/4 v0, 0x6

    if-eq p2, v0, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_4

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/sr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/whatsapp/sr;->a:Lcom/whatsapp/EditGroupSubject;

    iget-object v0, v0, Lcom/whatsapp/EditGroupSubject;->E:Lcom/whatsapp/j4;

    invoke-virtual {v0}, Lcom/whatsapp/j4;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/whatsapp/sr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->c(Lcom/whatsapp/EditGroupSubject;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_3

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/sr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-static {v0}, Lcom/whatsapp/EditGroupSubject;->b(Lcom/whatsapp/EditGroupSubject;)V

    .line 1
    :cond_3
    const/4 v0, 0x1

    .line 3
    :goto_0
    return v0

    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method
