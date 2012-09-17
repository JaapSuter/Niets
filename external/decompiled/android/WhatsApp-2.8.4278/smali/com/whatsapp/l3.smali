.class Lcom/whatsapp/l3;
.super Ljava/lang/Object;
.source "l3.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/Settings;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "3!> V\t$6:N9>&"

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

    sput-object v0, Lcom/whatsapp/l3;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x3a

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x56

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x4c

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x5f

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x49

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/Settings;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/l3;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 7
    sget-boolean v0, Lcom/whatsapp/App;->mb:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/whatsapp/App;->lb:Z

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/l3;->a:Lcom/whatsapp/Settings;

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f0900b6

    :goto_0
    invoke-virtual {v1, v0}, Lcom/whatsapp/Settings;->a(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 1
    :cond_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/whatsapp/l3;->a:Lcom/whatsapp/Settings;

    const-class v2, Lcom/whatsapp/ContactPicker;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    sget-object v1, Lcom/whatsapp/l3;->z:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 6
    iget-object v1, p0, Lcom/whatsapp/l3;->a:Lcom/whatsapp/Settings;

    const/16 v2, 0x68

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/Settings;->startActivityForResult(Landroid/content/Intent;I)V

    .line 5
    :cond_2
    return v3

    .line 2
    :cond_3
    const v0, 0x7f0900b7

    goto :goto_0
.end method
