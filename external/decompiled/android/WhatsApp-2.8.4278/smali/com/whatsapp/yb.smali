.class public Lcom/whatsapp/yb;
.super Landroid/os/AsyncTask;
.source "yb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/Settings;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v2, 0x5a

    const/16 v1, 0x43

    const/16 v4, 0x23

    const/16 v3, 0xb

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "0?\u000f\u007fJ-=\u0008$P:4\u0018$P69\u0018nP0u\u0018iP7;\u000f~Pc"

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

    const-string v0, "0?\u000f\u007fJ-=\u0008$P:4\u0018$E\"3\u0017nGl9\u0019xW\".\u000ex\u0003"

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

    sput-object v9, Lcom/whatsapp/yb;->z:[Ljava/lang/String;

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

.method protected constructor <init>(Lcom/whatsapp/Settings;)V
    .locals 0
    .parameter

    .prologue
    .line 24
    iput-object p1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private a(Landroid/preference/CheckBoxPreference;)V
    .locals 1
    .parameter

    .prologue
    .line 4
    invoke-virtual {p1}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/preference/CheckBoxPreference;->setChecked(Z)V

    .line 15
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .parameter

    .prologue
    .line 20
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/whatsapp/tp;->a(Z)I

    move-result v0

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 2
    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lcom/whatsapp/Settings;->removeDialog(I)V

    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_0

    .line 8
    sget-object v1, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    invoke-virtual {v1, v4}, Lcom/whatsapp/g;->b(Z)V

    .line 19
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/whatsapp/App;->b(J)V

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/yb;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v2}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v2

    invoke-virtual {v2}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    const v2, 0x7f0902be

    invoke-virtual {v1, v2}, Lcom/whatsapp/Settings;->a(I)V

    if-eqz v0, :cond_3

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 6
    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v1}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/whatsapp/yb;->a(Landroid/preference/CheckBoxPreference;)V

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/yb;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v2}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v2

    invoke-virtual {v2}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 18
    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    const v2, 0x7f090167

    invoke-virtual {v1, v2}, Lcom/whatsapp/Settings;->a(I)V

    if-eqz v0, :cond_3

    .line 13
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_2

    .line 7
    sget-object v1, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    invoke-virtual {v1, v4}, Lcom/whatsapp/g;->c(Z)V

    .line 23
    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v1}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/whatsapp/yb;->a(Landroid/preference/CheckBoxPreference;)V

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/yb;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v2}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v2

    invoke-virtual {v2}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    const v2, 0x7f090166

    invoke-virtual {v1, v2}, Lcom/whatsapp/Settings;->a(I)V

    if-eqz v0, :cond_3

    .line 27
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 25
    iget-object v0, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v0}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whatsapp/yb;->a(Landroid/preference/CheckBoxPreference;)V

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/yb;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    invoke-static {v1}, Lcom/whatsapp/Settings;->d(Lcom/whatsapp/Settings;)Landroid/preference/CheckBoxPreference;

    move-result-object v1

    invoke-virtual {v1}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    const v1, 0x7f090168

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->a(I)V

    .line 21
    :cond_3
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 29
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/yb;->a([Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 26
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/yb;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 9
    iget-object v0, p0, Lcom/whatsapp/yb;->a:Lcom/whatsapp/Settings;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->showDialog(I)V

    .line 11
    return-void
.end method
