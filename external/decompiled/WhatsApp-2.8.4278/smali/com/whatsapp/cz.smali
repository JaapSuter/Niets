.class Lcom/whatsapp/cz;
.super Ljava/lang/Object;
.source "cz.java"

# interfaces
.implements Lcom/whatsapp/ms;


# instance fields
.field final a:Lcom/whatsapp/bz;


# direct methods
.method constructor <init>(Lcom/whatsapp/bz;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/cz;->a:Lcom/whatsapp/bz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 6
    :goto_0
    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0, p1}, Lcom/whatsapp/App;->a(Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lcom/whatsapp/App;->h(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/cz;->a:Lcom/whatsapp/bz;

    iget-object v0, v0, Lcom/whatsapp/bz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {p1, v0}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/cz;->a:Lcom/whatsapp/bz;

    iget-object v1, v1, Lcom/whatsapp/bz;->a:Lcom/whatsapp/ProfileInfoActivity;

    invoke-static {v1}, Lcom/whatsapp/ProfileInfoActivity;->a(Lcom/whatsapp/ProfileInfoActivity;)Landroid/widget/TextView;

    move-result-object v1

    if-nez v0, :cond_1

    :goto_1
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_1
.end method
