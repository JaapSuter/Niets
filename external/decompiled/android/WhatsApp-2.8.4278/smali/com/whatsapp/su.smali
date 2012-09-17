.class Lcom/whatsapp/su;
.super Ljava/lang/Object;
.source "su.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/GroupChatMap;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x74

    const/16 v4, 0x1f

    const/16 v3, 0x10

    const/16 v1, 0xf

    const/4 v6, 0x0

    const/16 v0, 0x8

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "{\u0010\u0018*"

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

    const/4 v10, 0x1

    const-string v0, "n\u001b\u0010bpf\u0011Zyq{\u0010\u001ad1n\u0016\u0000ypa[=^LJ\' OP]*1TV["

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\u007f\u001d\u001b~z"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "n\u001b\u0010bpf\u0011Zyq{\u0010\u001ad1n\u0016\u0000ypa[=^LJ\' "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "n\u001b\u0010bpf\u0011Zyq{\u0010\u001ad1n\u0016\u0000ypa[7QSC"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "y\u001b\u0010>~a\u0011\u0006\u007fvk[\u0017em|\u001a\u0006>v{\u0010\u0019?|`\u001b\u0000q|{"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "h\u0007\u001beoP\u0018\u0015`0l\u001a\u001adzw\u0001Tcf|\u0001\u0011}?l\u001a\u001ad~l\u0001T|v|\u0001Tspz\u0019\u00100q`\u0001Tvpz\u001b\u0010"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x7

    const-string v0, "\u007f\u001d\u001b~zP\u0001\r`z"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_8
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_8

    :pswitch_1
    const/16 v0, 0x75

    goto :goto_8

    :pswitch_2
    move v0, v2

    goto :goto_8

    :pswitch_3
    move v0, v3

    goto :goto_8

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_9

    :pswitch_5
    const/16 v0, 0x75

    goto :goto_9

    :pswitch_6
    move v0, v2

    goto :goto_9

    :pswitch_7
    move v0, v3

    goto :goto_9

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_a

    :pswitch_9
    const/16 v0, 0x75

    goto :goto_a

    :pswitch_a
    move v0, v2

    goto :goto_a

    :pswitch_b
    move v0, v3

    goto :goto_a

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_b

    :pswitch_d
    const/16 v0, 0x75

    goto :goto_b

    :pswitch_e
    move v0, v2

    goto :goto_b

    :pswitch_f
    move v0, v3

    goto :goto_b

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_c

    :pswitch_11
    const/16 v0, 0x75

    goto :goto_c

    :pswitch_12
    move v0, v2

    goto :goto_c

    :pswitch_13
    move v0, v3

    goto :goto_c

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_d

    :pswitch_15
    const/16 v0, 0x75

    goto :goto_d

    :pswitch_16
    move v0, v2

    goto :goto_d

    :pswitch_17
    move v0, v3

    goto :goto_d

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_e

    :pswitch_19
    const/16 v0, 0x75

    goto :goto_e

    :pswitch_1a
    move v0, v2

    goto :goto_e

    :pswitch_1b
    move v0, v3

    goto :goto_e

    :cond_7
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_f
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_f

    :pswitch_1d
    const/16 v0, 0x75

    goto :goto_f

    :pswitch_1e
    move v0, v2

    goto :goto_f

    :pswitch_1f
    move v0, v3

    goto :goto_f

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

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/GroupChatMap;)V
    .locals 0
    .parameter

    .prologue
    .line 24
    iput-object p1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 10
    packed-switch p2, :pswitch_data_0

    .line 3
    :cond_0
    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 21
    return-void

    .line 16
    :pswitch_0
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    iget-object v2, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v2}, Lcom/whatsapp/GroupChatMap;->i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/Conversation;->a(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whatsapp/GroupChatMap;->startActivity(Landroid/content/Intent;)V

    .line 17
    if-eqz v0, :cond_0

    .line 1
    :pswitch_1
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 14
    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 12
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-virtual {v1, v2}, Lcom/whatsapp/GroupChatMap;->startActivity(Landroid/content/Intent;)V

    .line 18
    if-eqz v0, :cond_0

    .line 25
    :pswitch_2
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;

    move-result-object v1

    iget-object v1, v1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v1, :cond_1

    .line 13
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1, v2}, Lcom/whatsapp/ContactInfo;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    if-eqz v0, :cond_0

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v1}, Lcom/whatsapp/GroupChatMap;->i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whatsapp/zq;->a()Ljava/lang/String;

    move-result-object v1

    .line 2
    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    sget-object v4, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 23
    sget-object v3, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    aget-object v3, v3, v6

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-virtual {v1}, Lcom/whatsapp/GroupChatMap;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 4
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 6
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    const/16 v3, 0xa

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/GroupChatMap;->startActivityForResult(Landroid/content/Intent;I)V

    if-eqz v0, :cond_3

    .line 29
    :cond_2
    sget-object v1, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lcom/whatsapp/App;->h()V

    .line 20
    :cond_3
    if-eqz v0, :cond_0

    .line 26
    :pswitch_3
    invoke-static {v5}, Lcom/whatsapp/g;->a(Z)V

    .line 30
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 7
    sget-object v1, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    sget-object v1, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    aget-object v1, v1, v6

    iget-object v2, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    invoke-static {v2}, Lcom/whatsapp/GroupChatMap;->i(Lcom/whatsapp/GroupChatMap;)Lcom/whatsapp/zq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 22
    sget-object v1, Lcom/whatsapp/su;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 19
    const/high16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 27
    iget-object v1, p0, Lcom/whatsapp/su;->a:Lcom/whatsapp/GroupChatMap;

    const/16 v2, 0xb

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/GroupChatMap;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 10
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
