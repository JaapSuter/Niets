.class public Lcom/whatsapp/DialogToastActivity;
.super Landroid/app/Activity;
.source "DialogToastActivity.java"

# interfaces
.implements Lcom/whatsapp/lr;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Lcom/whatsapp/nr;

.field private d:Lcom/whatsapp/ed;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x6c

    const/16 v4, 0x3d

    const/16 v2, 0x3a

    const/4 v6, 0x0

    const/16 v1, 0x39

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "T~P\rQV]m\u0003\\JNj\u0018OPT^"

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

    const-string v0, "T~P\rQV]m\u0003\\JNj\u0018OPT^%Y"

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

    const-string v0, "]SX\u0000R^NV\rNM[Z\u0018TOSM\u0015\u0012VT[\r^RJK\tNJ_]C\\ZNP\u001aTMC\u0019\u0002R\u0019[Z\u0018TO_"

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

    sput-object v9, Lcom/whatsapp/DialogToastActivity;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

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
    move v0, v1

    goto :goto_3

    :pswitch_3
    move v0, v3

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

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
    move v0, v1

    goto :goto_4

    :pswitch_7
    move v0, v3

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

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
    move v0, v1

    goto :goto_5

    :pswitch_b
    move v0, v3

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
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/DialogToastActivity;->e:Z

    .line 6
    return-void
.end method

.method static a(Lcom/whatsapp/DialogToastActivity;)Lcom/whatsapp/nr;
    .locals 1
    .parameter

    .prologue
    .line 42
    iget-object v0, p0, Lcom/whatsapp/DialogToastActivity;->c:Lcom/whatsapp/nr;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->c:Lcom/whatsapp/nr;

    .line 50
    invoke-virtual {p0, p1}, Lcom/whatsapp/DialogToastActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    .line 20
    iput p1, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    .line 38
    invoke-virtual {p0}, Lcom/whatsapp/DialogToastActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lcom/whatsapp/DialogToastActivity;->showDialog(I)V

    .line 16
    :cond_0
    return-void
.end method

.method public a(ILcom/whatsapp/nr;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 34
    iput-object p2, p0, Lcom/whatsapp/DialogToastActivity;->c:Lcom/whatsapp/nr;

    .line 31
    invoke-virtual {p0, p1}, Lcom/whatsapp/DialogToastActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    .line 12
    iput p1, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    .line 19
    invoke-virtual {p0}, Lcom/whatsapp/DialogToastActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lcom/whatsapp/DialogToastActivity;->showDialog(I)V

    .line 40
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->c:Lcom/whatsapp/nr;

    .line 13
    iput-object p1, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    .line 48
    invoke-virtual {p0}, Lcom/whatsapp/DialogToastActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lcom/whatsapp/DialogToastActivity;->showDialog(I)V

    .line 17
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/whatsapp/DialogToastActivity;->e:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_1

    .line 28
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 27
    :cond_1
    sget-object v0, Lcom/whatsapp/DialogToastActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 11
    :cond_2
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .parameter

    .prologue
    .line 35
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 9
    new-instance v0, Lcom/whatsapp/ed;

    invoke-direct {v0}, Lcom/whatsapp/ed;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->d:Lcom/whatsapp/ed;

    .line 43
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter

    .prologue
    .line 36
    packed-switch p1, :pswitch_data_0

    .line 54
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 8
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/mr;

    invoke-direct {v2, p0}, Lcom/whatsapp/mr;-><init>(Lcom/whatsapp/DialogToastActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 36
    :pswitch_data_0
    .packed-switch 0x1f4
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/lr;)V

    .line 5
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/DialogToastActivity;->d:Lcom/whatsapp/ed;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ed;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/whatsapp/DialogToastActivity;->d:Lcom/whatsapp/ed;

    invoke-virtual {v0, v1}, Lcom/whatsapp/ed;->removeMessages(I)V

    .line 22
    :cond_0
    invoke-static {}, Lcom/whatsapp/App;->nb()V

    .line 1
    iput-boolean v1, p0, Lcom/whatsapp/DialogToastActivity;->e:Z

    .line 47
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 18
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 37
    sget-object v0, Lcom/whatsapp/DialogToastActivity;->z:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    .line 7
    sget-object v0, Lcom/whatsapp/DialogToastActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    .line 26
    iget v0, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    if-eqz v0, :cond_0

    .line 24
    iget v0, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/DialogToastActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    .line 3
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    .line 25
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/lr;)V

    .line 21
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 49
    iget-object v0, p0, Lcom/whatsapp/DialogToastActivity;->d:Lcom/whatsapp/ed;

    const/4 v1, 0x0

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Lcom/whatsapp/ed;->sendEmptyMessageDelayed(IJ)Z

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/DialogToastActivity;->e:Z

    .line 29
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .parameter

    .prologue
    .line 30
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 14
    sget-object v0, Lcom/whatsapp/DialogToastActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/DialogToastActivity;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 15
    sget-object v0, Lcom/whatsapp/DialogToastActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget v1, p0, Lcom/whatsapp/DialogToastActivity;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 45
    return-void
.end method
