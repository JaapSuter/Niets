.class Lcom/whatsapp/cr;
.super Ljava/lang/Object;
.source "cr.java"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/DeleteAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v1, 0x63

    const/16 v2, 0x5e

    const/16 v3, 0x29

    const/16 v4, 0x10

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0007;Eu\u001f\u0006?Js\u001fL)Hd\u0008\u000b;[?\n\u0005*Lb\u001f\u0006&]s\u0003\u00020Nu\u000fC8Hy\u0007\u0006:\t|\u0004\u000c5\\`(\u000c+Gd\u0019\u001a\u001dFt\u000eC8[\u007f\u0006C\u001dFe\u0005\u0017,P@\u0003\u000c0LY\u0005\u00051"

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

    const-string v0, "?\u001a"

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

    sput-object v9, Lcom/whatsapp/cr;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x6b

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
    move v0, v3

    goto :goto_2

    :pswitch_3
    move v0, v4

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x6b

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
    move v0, v3

    goto :goto_3

    :pswitch_7
    move v0, v4

    goto :goto_3

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

.method constructor <init>(Lcom/whatsapp/DeleteAccount;)V
    .locals 0
    .parameter

    .prologue
    .line 19
    iput-object p1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    const/4 v0, 0x0

    .line 21
    :try_start_0
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-static {v1}, Lcom/whatsapp/DeleteAccount;->a(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-static {v1}, Lcom/whatsapp/DeleteAccount;->a(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/jp;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 7
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-static {v1}, Lcom/whatsapp/DeleteAccount;->a(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 20
    :goto_0
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    iget-object v1, v1, Lcom/whatsapp/DeleteAccount;->n:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 13
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    iget-object v1, v1, Lcom/whatsapp/DeleteAccount;->o:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    const v4, 0x7f090062

    invoke-virtual {v3, v4}, Lcom/whatsapp/DeleteAccount;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_2

    .line 10
    :cond_0
    if-nez v0, :cond_1

    .line 14
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    iget-object v1, v1, Lcom/whatsapp/DeleteAccount;->o:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    const v4, 0x7f090063

    invoke-virtual {v3, v4}, Lcom/whatsapp/DeleteAccount;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_2

    .line 1
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    iget-object v1, v1, Lcom/whatsapp/DeleteAccount;->o:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-static {v1, v0}, Lcom/whatsapp/DeleteAccount;->a(Lcom/whatsapp/DeleteAccount;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    iget-object v0, v0, Lcom/whatsapp/DeleteAccount;->p:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/cr;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    iget-object v1, v1, Lcom/whatsapp/DeleteAccount;->p:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_2
    return-void

    .line 15
    :cond_3
    :try_start_1
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-static {v1}, Lcom/whatsapp/DeleteAccount;->a(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 18
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/jp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 16
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/cr;->a:Lcom/whatsapp/DeleteAccount;

    invoke-static {v1}, Lcom/whatsapp/DeleteAccount;->a(Lcom/whatsapp/DeleteAccount;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto/16 :goto_0

    .line 12
    :catch_0
    move-exception v1

    .line 3
    sget-object v3, Lcom/whatsapp/cr;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-static {v3, v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 17
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    return-void
.end method
