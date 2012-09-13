.class Lcom/whatsapp/mi;
.super Ljava/lang/Object;
.source "mi.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/BroadcastMediaPicker;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "KM\'[ZoL4GOTB0GHjH0"

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

    sput-object v0, Lcom/whatsapp/mi;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x3b

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0xb

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x2f

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x55

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x34

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/BroadcastMediaPicker;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/mi;->a:Lcom/whatsapp/BroadcastMediaPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 7
    new-instance v2, Lcom/whatsapp/sz;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    iget-object v3, v3, Lcom/whatsapp/App$Me;->jabber_id:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/mi;->z:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v0, v1

    check-cast v0, [B

    new-instance v4, Lcom/whatsapp/MediaData;

    invoke-direct {v4}, Lcom/whatsapp/MediaData;-><init>()V

    invoke-direct {v2, v3, v0, v4}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;[BLjava/lang/Object;)V

    sput-object v2, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    .line 5
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    const/4 v2, 0x1

    iput v2, v0, Lcom/whatsapp/sz;->h:I

    .line 6
    sget-object v0, Lcom/whatsapp/BroadcastMessageComposer;->k:Lcom/whatsapp/sz;

    const/4 v2, 0x5

    iput-byte v2, v0, Lcom/whatsapp/sz;->l:B

    .line 4
    iget-object v0, p0, Lcom/whatsapp/mi;->a:Lcom/whatsapp/BroadcastMediaPicker;

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Lcom/whatsapp/BroadcastMediaPicker;->setResult(ILandroid/content/Intent;)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/mi;->a:Lcom/whatsapp/BroadcastMediaPicker;

    invoke-virtual {v0}, Lcom/whatsapp/BroadcastMediaPicker;->finish()V

    .line 3
    return-void
.end method
