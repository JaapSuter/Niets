.class Lcom/whatsapp/lk;
.super Ljava/lang/Object;
.source "lk.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Z

.field final b:Z

.field final c:Lcom/whatsapp/ContactPicker;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v2, 0x71

    const/16 v3, 0x22

    const/16 v4, 0x13

    const/4 v1, 0x4

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "t\u0019\u0014Lvw_\u000fZg"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v8, 0x1

    const-string v0, "i\u001e\u000eLga\u0015"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/lk;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    const/16 v0, 0x7b

    goto :goto_2

    :pswitch_3
    move v0, v3

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    const/16 v0, 0x7b

    goto :goto_3

    :pswitch_7
    move v0, v3

    goto :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/ContactPicker;ZZ)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 12
    iput-object p1, p0, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    iput-boolean p2, p0, Lcom/whatsapp/lk;->a:Z

    iput-boolean p3, p0, Lcom/whatsapp/lk;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 2
    sget v0, Lcom/whatsapp/App;->f:I

    if-lt v0, v3, :cond_0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v0}, Lcom/whatsapp/ContactPicker;->n(Lcom/whatsapp/ContactPicker;)V

    .line 8
    :cond_0
    sget v0, Lcom/whatsapp/App;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 5
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v1, Lcom/whatsapp/lk;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    sget-object v0, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v1, Lcom/whatsapp/lk;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/Advanced;->a(Landroid/net/Uri;Ljava/lang/String;)V

    .line 10
    :cond_1
    iget-boolean v0, p0, Lcom/whatsapp/lk;->a:Z

    invoke-static {v0}, Lcom/whatsapp/tp;->a(Z)I

    move-result v0

    .line 3
    sget v1, Lcom/whatsapp/App;->f:I

    if-lt v1, v3, :cond_2

    .line 4
    iget-object v1, p0, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->n(Lcom/whatsapp/ContactPicker;)V

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/lk;->c:Lcom/whatsapp/ContactPicker;

    invoke-static {v1}, Lcom/whatsapp/ContactPicker;->q(Lcom/whatsapp/ContactPicker;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/mk;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/mk;-><init>(Lcom/whatsapp/lk;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1
    return-void
.end method
