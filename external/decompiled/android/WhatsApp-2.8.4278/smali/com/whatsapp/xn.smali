.class Lcom/whatsapp/xn;
.super Ljava/lang/Object;
.source "xn.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/df;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u001eh~F$\t)tG<\u0013e\u007fI/]duL\"\u001c)}M8\u000ehwMk\n`d@k\u0013f0E.\u0019`q\u0008*\t}qK#\u0018m"

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

    sput-object v0, Lcom/whatsapp/xn;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x4b

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x7d

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x9

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x10

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x28

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/df;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/xn;->a:Lcom/whatsapp/df;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/xn;->a:Lcom/whatsapp/df;

    iget-object v0, v0, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/xn;->a:Lcom/whatsapp/df;

    iget-object v0, v0, Lcom/whatsapp/df;->n:Lcom/whatsapp/Conversation;

    iget-object v1, p0, Lcom/whatsapp/xn;->a:Lcom/whatsapp/df;

    iget-object v1, v1, Lcom/whatsapp/df;->o:Lcom/whatsapp/sz;

    invoke-static {v0, v1}, Lcom/whatsapp/App;->a(Landroid/app/Activity;Lcom/whatsapp/sz;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    sget-object v0, Lcom/whatsapp/xn;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/xn;->a:Lcom/whatsapp/df;

    invoke-virtual {v0}, Lcom/whatsapp/df;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f09010b

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 1
    :cond_1
    return-void
.end method
