.class Lcom/whatsapp/e3;
.super Ljava/lang/Object;
.source "e3.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Landroid/preference/Preference;

.field final b:Lcom/whatsapp/Settings;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "#n`jU=z~g"

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

    sput-object v0, Lcom/whatsapp/e3;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xa

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x53

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x1b

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x13

    goto :goto_1

    :pswitch_3
    const/4 v0, 0x2

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/Settings;Landroid/preference/Preference;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/e3;->b:Lcom/whatsapp/Settings;

    iput-object p2, p0, Lcom/whatsapp/e3;->a:Landroid/preference/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 8
    .parameter

    .prologue
    .line 3
    new-instance v4, Lcom/whatsapp/f3;

    invoke-direct {v4, p0}, Lcom/whatsapp/f3;-><init>(Lcom/whatsapp/e3;)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/e3;->a:Landroid/preference/Preference;

    invoke-virtual {v0}, Landroid/preference/Preference;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/e3;->z:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    new-instance v0, Lcom/whatsapp/b;

    iget-object v1, p0, Lcom/whatsapp/e3;->b:Lcom/whatsapp/Settings;

    const v2, 0x7f0901b5

    const/16 v5, 0x19

    const/4 v6, 0x0

    const v7, 0x7f0902a3

    invoke-direct/range {v0 .. v7}, Lcom/whatsapp/b;-><init>(Landroid/app/Activity;ILjava/lang/String;Lcom/whatsapp/ms;III)V

    .line 5
    invoke-virtual {v0}, Lcom/whatsapp/b;->show()V

    .line 1
    const/4 v0, 0x1

    return v0
.end method
