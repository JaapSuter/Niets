.class Lcom/whatsapp/on;
.super Ljava/lang/Object;
.source "on.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final a:Lcom/whatsapp/ze;


# direct methods
.method constructor <init>(Lcom/whatsapp/ze;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 11
    :cond_0
    :goto_0
    :pswitch_0
    iget-object v1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    iget v1, v1, Lcom/whatsapp/ze;->m:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 6
    iget-object v1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    iget-boolean v1, v1, Lcom/whatsapp/ze;->d:Z

    if-eqz v1, :cond_1

    .line 2
    iget-object v1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    invoke-virtual {v1, v4}, Lcom/whatsapp/ze;->b(Z)V

    if-eqz v0, :cond_2

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    invoke-virtual {v0, v3}, Lcom/whatsapp/ze;->b(Z)V

    .line 7
    :cond_2
    return v3

    .line 12
    :pswitch_1
    iget-object v1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    iput-boolean v4, v1, Lcom/whatsapp/ze;->d:Z

    .line 8
    if-eqz v0, :cond_0

    .line 3
    :pswitch_2
    iget-object v1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    iput-boolean v3, v1, Lcom/whatsapp/ze;->d:Z

    .line 9
    if-eqz v0, :cond_0

    .line 4
    :pswitch_3
    iget-object v1, p0, Lcom/whatsapp/on;->a:Lcom/whatsapp/ze;

    iput-boolean v3, v1, Lcom/whatsapp/ze;->d:Z

    goto :goto_0

    .line 10
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
