.class public Lcom/whatsapp/accountsync/LoginActivity;
.super Landroid/accounts/AccountAuthenticatorActivity;
.source "LoginActivity.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x7b

    const/16 v4, 0x69

    const/16 v1, 0x60

    const/4 v6, 0x0

    const/16 v3, 0x3f

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0013\u0013P\u001e`\u0012\u001eX\u0000L\u0014\t^\u001dV\u000f\u0015`\u000fV\u0012\u0008K6[\u000c\u001c"

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

    const-string v0, "\u000c\u0014X\u0000Q\u0001\u0018K\u0000I\t\u000fFF\\\u0012\u001e^\u001dZ"

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

    const/4 v8, 0x2

    const-string v0, "\u0010\u0013P\u0007Z"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/accountsync/LoginActivity;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v3

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_3

    :pswitch_1
    move v0, v2

    goto :goto_3

    :pswitch_2
    move v0, v3

    goto :goto_3

    :pswitch_3
    move v0, v4

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v3

    :goto_4
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_4

    :pswitch_5
    move v0, v2

    goto :goto_4

    :pswitch_6
    move v0, v3

    goto :goto_4

    :pswitch_7
    move v0, v4

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v3

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_5

    :pswitch_9
    move v0, v2

    goto :goto_5

    :pswitch_a
    move v0, v3

    goto :goto_5

    :pswitch_b
    move v0, v4

    goto :goto_5

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
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/accounts/AccountAuthenticatorActivity;-><init>()V

    .line 6
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 11
    .parameter

    .prologue
    const/4 v10, 0x2

    const/4 v3, 0x0

    const/4 v1, 0x1

    sget-boolean v4, Lcom/whatsapp/accountsync/PerformSyncManager;->b:Z

    .line 10
    invoke-super {p0, p1}, Landroid/accounts/AccountAuthenticatorActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    const v0, 0x7f030042

    invoke-virtual {p0, v0}, Lcom/whatsapp/accountsync/LoginActivity;->setContentView(I)V

    .line 18
    sget-object v0, Lcom/whatsapp/accountsync/LoginActivity;->z:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 8
    invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v5

    .line 3
    array-length v6, v5

    move v2, v3

    move v0, v3

    :cond_0
    if-ge v2, v6, :cond_2

    aget-object v7, v5, v2

    .line 23
    invoke-virtual {p0}, Lcom/whatsapp/accountsync/LoginActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v8

    const v9, 0x7f09000a

    invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    iget-object v7, v7, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v0, v1

    .line 4
    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-eqz v4, :cond_0

    sget v2, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/whatsapp/App;->wc:I

    .line 14
    :cond_2
    if-eqz v0, :cond_3

    .line 26
    invoke-virtual {p0}, Lcom/whatsapp/accountsync/LoginActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f090242

    invoke-virtual {p0, v2}, Lcom/whatsapp/accountsync/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 12
    invoke-virtual {p0}, Lcom/whatsapp/accountsync/LoginActivity;->finish()V

    if-eqz v4, :cond_4

    .line 24
    :cond_3
    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/accountsync/LoginActivity;->a:Ljava/lang/String;

    .line 21
    iget-object v0, p0, Lcom/whatsapp/accountsync/LoginActivity;->a:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 20
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/whatsapp/Main;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 7
    sget-object v2, Lcom/whatsapp/accountsync/LoginActivity;->z:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 16
    invoke-virtual {p0, v0}, Lcom/whatsapp/accountsync/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 17
    invoke-virtual {p0}, Lcom/whatsapp/accountsync/LoginActivity;->finish()V

    .line 19
    :cond_4
    :goto_0
    return-void

    .line 15
    :cond_5
    sget-object v0, Lcom/whatsapp/accountsync/LoginActivity;->z:[Ljava/lang/String;

    aget-object v0, v0, v10

    invoke-virtual {p0, v0}, Lcom/whatsapp/accountsync/LoginActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 11
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/mh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/accountsync/LoginActivity;->b:Ljava/lang/String;

    .line 9
    new-instance v0, Lcom/whatsapp/accountsync/c;

    invoke-direct {v0, p0, p0}, Lcom/whatsapp/accountsync/c;-><init>(Lcom/whatsapp/accountsync/LoginActivity;Landroid/content/Context;)V

    .line 1
    new-array v2, v10, [Ljava/lang/String;

    iget-object v4, p0, Lcom/whatsapp/accountsync/LoginActivity;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    iget-object v3, p0, Lcom/whatsapp/accountsync/LoginActivity;->b:Ljava/lang/String;

    aput-object v3, v2, v1

    invoke-virtual {v0, v2}, Lcom/whatsapp/accountsync/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method
