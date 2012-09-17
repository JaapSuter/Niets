.class Lcom/whatsapp/dm;
.super Ljava/lang/Object;
.source "dm.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "XK\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/dm;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x5e

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x32

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x22

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x64

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x45

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    const/16 v2, 0x8

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    iget-object v1, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->y(Lcom/whatsapp/Conversation;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    iget-object v1, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->V:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 7
    iget-object v1, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-boolean v1, v1, Lcom/whatsapp/zq;->n:Z

    if-eqz v1, :cond_0

    .line 12
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    const-class v3, Lcom/whatsapp/ViewProfilePhoto;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    sget-object v2, Lcom/whatsapp/dm;->z:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    iget-object v3, v3, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    iget-object v2, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    invoke-virtual {v2, v1}, Lcom/whatsapp/Conversation;->startActivity(Landroid/content/Intent;)V

    .line 8
    if-eqz v0, :cond_2

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->k(Lcom/whatsapp/Conversation;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9
    iget-object v1, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v2, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    const/16 v3, 0x13

    invoke-static {v1, v2, v3}, Lcom/whatsapp/iz;->a(Lcom/whatsapp/zq;Landroid/app/Activity;I)V

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/dm;->a:Lcom/whatsapp/Conversation;

    const v1, 0x7f09018e

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 1
    :cond_2
    return-void
.end method
