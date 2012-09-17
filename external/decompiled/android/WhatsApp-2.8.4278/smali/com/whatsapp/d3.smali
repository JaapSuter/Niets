.class Lcom/whatsapp/d3;
.super Ljava/lang/Object;
.source "d3.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final a:Lcom/whatsapp/Settings;


# direct methods
.method constructor <init>(Lcom/whatsapp/Settings;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/d3;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/d3;->a:Lcom/whatsapp/Settings;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/whatsapp/d3;->a:Lcom/whatsapp/Settings;

    const-class v3, Lcom/whatsapp/ProfileInfoActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/Settings;->startActivity(Landroid/content/Intent;)V

    .line 3
    const/4 v0, 0x1

    return v0
.end method
