.class public Lcom/whatsapp/zx;
.super Ljava/lang/Object;
.source "zx.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/zx;-><init>(Ljava/lang/String;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/zx;->b:Z

    .line 44
    if-nez p1, :cond_0

    .line 18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 35
    :cond_0
    invoke-static {}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getInstance()Lcom/google/i18n/phonenumbers/PhoneNumberUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getAsYouTypeFormatter(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/zx;->d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    .line 70
    return-void
.end method

.method private a(CZ)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 53
    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/whatsapp/zx;->d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputDigitAndRememberPosition(C)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/zx;->d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputDigit(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/CharSequence;I)Ljava/lang/String;
    .locals 11
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 22
    add-int/lit8 v7, p2, -0x1

    .line 64
    const/4 v2, 0x0

    .line 21
    iget-object v0, p0, Lcom/whatsapp/zx;->d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->clear()V

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    move v4, v1

    move v0, v1

    move v3, v1

    .line 67
    :goto_0
    if-ge v4, v8, :cond_4

    .line 57
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 38
    invoke-static {v5}, Landroid/telephony/PhoneNumberUtils;->isNonSeparator(C)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 41
    if-eqz v3, :cond_0

    .line 36
    invoke-direct {p0, v3, v0}, Lcom/whatsapp/zx;->a(CZ)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    move v0, v1

    :cond_0
    move-object v3, v2

    move v2, v5

    .line 20
    :goto_1
    if-ne v4, v7, :cond_1

    .line 68
    const/4 v0, 0x1

    .line 4
    :cond_1
    add-int/lit8 v4, v4, 0x1

    if-eqz v6, :cond_5

    move v1, v0

    move-object v0, v3

    .line 50
    :goto_2
    if-eqz v2, :cond_2

    .line 60
    invoke-direct {p0, v2, v1}, Lcom/whatsapp/zx;->a(CZ)Ljava/lang/String;

    move-result-object v0

    .line 24
    :cond_2
    return-object v0

    :cond_3
    move v10, v3

    move-object v3, v2

    move v2, v10

    goto :goto_1

    :cond_4
    move v1, v0

    move-object v0, v2

    move v2, v3

    goto :goto_2

    :cond_5
    move v10, v2

    move-object v2, v3

    move v3, v10

    goto :goto_0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/zx;->c:Z

    .line 16
    iget-object v0, p0, Lcom/whatsapp/zx;->d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->clear()V

    .line 54
    return-void
.end method

.method private a(Ljava/lang/CharSequence;II)Z
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    move v0, p2

    .line 19
    :cond_0
    add-int v2, p2, p3

    if-ge v0, v2, :cond_2

    .line 62
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 39
    invoke-static {v2}, Landroid/telephony/PhoneNumberUtils;->isNonSeparator(C)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1
    const/4 v0, 0x1

    .line 40
    :goto_0
    return v0

    .line 33
    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 40
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized afterTextChanged(Landroid/text/Editable;)V
    .locals 7
    .parameter

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 49
    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Lcom/whatsapp/zx;->c:Z

    if-eqz v2, :cond_2

    .line 63
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iput-boolean v0, p0, Lcom/whatsapp/zx;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_0
    :goto_1
    monitor-exit p0

    return-void

    :cond_1
    move v0, v1

    .line 63
    goto :goto_0

    .line 5
    :cond_2
    :try_start_1
    iget-boolean v0, p0, Lcom/whatsapp/zx;->b:Z

    if-nez v0, :cond_0

    .line 6
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/whatsapp/zx;->a(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v3

    .line 51
    if-eqz v3, :cond_0

    .line 10
    iget-object v0, p0, Lcom/whatsapp/zx;->d:Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->getRememberedPosition()I

    move-result v6

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/zx;->b:Z

    .line 13
    const/4 v1, 0x0

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    invoke-static {p1, v6}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 48
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/zx;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 23
    iget-boolean v1, p0, Lcom/whatsapp/zx;->b:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/whatsapp/zx;->c:Z

    if-eqz v1, :cond_1

    .line 31
    :cond_0
    :goto_0
    return-void

    .line 59
    :cond_1
    if-nez p3, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v1, p2, :cond_2

    .line 17
    const/4 v1, 0x1

    iput v1, p0, Lcom/whatsapp/zx;->a:I

    if-eqz v0, :cond_0

    .line 55
    :cond_2
    if-nez p4, :cond_3

    add-int v1, p2, p3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ne v1, v2, :cond_3

    if-lez p3, :cond_3

    .line 66
    const/4 v1, 0x0

    iput v1, p0, Lcom/whatsapp/zx;->a:I

    if-eqz v0, :cond_0

    .line 61
    :cond_3
    if-lez p3, :cond_4

    invoke-direct {p0, p1, p2, p3}, Lcom/whatsapp/zx;->a(Ljava/lang/CharSequence;II)Z

    move-result v1

    if-nez v1, :cond_4

    .line 12
    const/4 v1, 0x2

    iput v1, p0, Lcom/whatsapp/zx;->a:I

    if-eqz v0, :cond_0

    .line 11
    :cond_4
    const/4 v0, 0x3

    iput v0, p0, Lcom/whatsapp/zx;->a:I

    goto :goto_0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x3

    .line 30
    iget-boolean v0, p0, Lcom/whatsapp/zx;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/whatsapp/zx;->c:Z

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    :goto_0
    return-void

    .line 26
    :cond_1
    iget v0, p0, Lcom/whatsapp/zx;->a:I

    if-ne v0, v2, :cond_2

    .line 27
    if-lez p4, :cond_2

    invoke-direct {p0, p1, p2, p4}, Lcom/whatsapp/zx;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    if-nez v0, :cond_2

    .line 25
    const/4 v0, 0x2

    iput v0, p0, Lcom/whatsapp/zx;->a:I

    .line 8
    :cond_2
    iget v0, p0, Lcom/whatsapp/zx;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    if-lez p4, :cond_3

    invoke-direct {p0, p1, p2, p4}, Lcom/whatsapp/zx;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 45
    invoke-direct {p0}, Lcom/whatsapp/zx;->a()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 46
    :cond_3
    iget v0, p0, Lcom/whatsapp/zx;->a:I

    if-ne v0, v2, :cond_0

    .line 37
    invoke-direct {p0}, Lcom/whatsapp/zx;->a()V

    goto :goto_0
.end method
