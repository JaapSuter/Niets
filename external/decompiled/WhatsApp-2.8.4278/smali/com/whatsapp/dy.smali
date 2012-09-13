.class Lcom/whatsapp/dy;
.super Ljava/lang/Object;
.source "dy.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/PickFileType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u0019LH"

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

    sput-object v0, Lcom/whatsapp/dy;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x60

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x73

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x25

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x2c

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x3a

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/PickFileType;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 8
    invoke-static {}, Lcom/whatsapp/App;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    const-class v2, Lcom/whatsapp/LocationPicker;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    sget-object v1, Lcom/whatsapp/dy;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    iget-object v2, v2, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    iget-object v1, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    invoke-virtual {v1, v0}, Lcom/whatsapp/PickFileType;->startActivity(Landroid/content/Intent;)V

    .line 4
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    iget-object v1, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    iget-object v1, v1, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whatsapp/App;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 1
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/dy;->a:Lcom/whatsapp/PickFileType;

    invoke-virtual {v0}, Lcom/whatsapp/PickFileType;->finish()V

    .line 7
    return-void
.end method
