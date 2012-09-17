.class Lcom/whatsapp/pi;
.super Ljava/lang/Object;
.source "pi.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v1, 0x6e

    const-string v0, "\u000f\u0000BN\"\u0007\n\u0008O(\u001a\u001aOR*\u001d@js\u000e/:os\u00031=ii\u001f-+yo\u0008::or\n="

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    move v3, v2

    move-object v2, v0

    :goto_0
    if-gt v3, v4, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/pi;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v5, v2, v4

    rem-int/lit8 v0, v4, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x4d

    :goto_1
    xor-int/2addr v0, v5

    int-to-char v0, v0

    aput-char v0, v2, v4

    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_1

    :pswitch_1
    move v0, v1

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x26

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x3c

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/pi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/pi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/pi;->z:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/BroadcastMessageComposer;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/pi;->a:Lcom/whatsapp/BroadcastMessageComposer;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/BroadcastMessageComposer;->removeDialog(I)V

    .line 1
    return-void
.end method
