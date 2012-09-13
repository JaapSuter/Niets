.class Lcom/whatsapp/xi;
.super Ljava/lang/Object;
.source "xi.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field private a:Z

.field final b:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 1
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/xi;->a:Z

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 7
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x0

    const/4 v5, 0x1

    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 9
    const/4 v0, 0x6

    if-ne p2, v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget-boolean v0, Lcom/whatsapp/BroadcastMessageComposer;->j:Z

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->n:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->performClick()Z

    if-eqz v6, :cond_5

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-static {v0}, Lcom/whatsapp/BroadcastMessageComposer;->b(Lcom/whatsapp/BroadcastMessageComposer;)V

    if-eqz v6, :cond_5

    .line 15
    :cond_1
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_5

    .line 8
    iget-boolean v0, p0, Lcom/whatsapp/xi;->a:Z

    if-nez v0, :cond_4

    .line 7
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v2

    .line 11
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v3

    .line 2
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-eq v2, v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    const-string v3, "\n"

    invoke-interface/range {v0 .. v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    if-eqz v6, :cond_3

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/xi;->b:Lcom/whatsapp/BroadcastMessageComposer;

    iget-object v0, v0, Lcom/whatsapp/BroadcastMessageComposer;->i:Landroid/widget/EditText;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->append(Ljava/lang/CharSequence;)V

    .line 14
    :cond_3
    iput-boolean v5, p0, Lcom/whatsapp/xi;->a:Z

    .line 12
    if-eqz v6, :cond_5

    .line 3
    :cond_4
    iput-boolean v4, p0, Lcom/whatsapp/xi;->a:Z

    .line 4
    :cond_5
    return v5
.end method
