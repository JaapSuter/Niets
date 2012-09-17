.class Lcom/whatsapp/i3;
.super Ljava/lang/Object;
.source "i3.java"

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
    .line 5
    iput-object p1, p0, Lcom/whatsapp/i3;->b:Lcom/whatsapp/Settings;

    iput-object p2, p0, Lcom/whatsapp/i3;->a:Landroid/preference/CheckBoxPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 2
    iget-object v0, p0, Lcom/whatsapp/i3;->a:Landroid/preference/CheckBoxPreference;

    invoke-virtual {v0}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->b(Z)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->b(Z)V

    .line 1
    :cond_1
    return v2
.end method
