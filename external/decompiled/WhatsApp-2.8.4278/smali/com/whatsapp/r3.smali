.class Lcom/whatsapp/r3;
.super Ljava/lang/Object;
.source "r3.java"

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
    iput-object p1, p0, Lcom/whatsapp/r3;->a:Lcom/whatsapp/Settings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2
    .parameter

    .prologue
    .line 1
    new-instance v0, Lcom/whatsapp/yb;

    iget-object v1, p0, Lcom/whatsapp/r3;->a:Lcom/whatsapp/Settings;

    invoke-direct {v0, v1}, Lcom/whatsapp/yb;-><init>(Lcom/whatsapp/Settings;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/yb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 3
    const/4 v0, 0x1

    return v0
.end method
