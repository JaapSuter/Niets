.class Lcom/whatsapp/h3;
.super Ljava/lang/Object;
.source "h3.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final a:Landroid/preference/CheckBoxPreference;

.field final b:Lcom/whatsapp/Settings;


# direct methods
.method constructor <init>(Lcom/whatsapp/Settings;Landroid/preference/CheckBoxPreference;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/h3;->b:Lcom/whatsapp/Settings;

    iput-object p2, p0, Lcom/whatsapp/h3;->a:Landroid/preference/CheckBoxPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 1
    iget-object v0, p0, Lcom/whatsapp/h3;->a:Landroid/preference/CheckBoxPreference;

    invoke-virtual {v0}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sput-boolean v1, Lcom/whatsapp/Conversation;->r:Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/whatsapp/Conversation;->r:Z

    .line 5
    :cond_1
    return v1
.end method
