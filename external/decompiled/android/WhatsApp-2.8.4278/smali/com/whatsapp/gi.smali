.class Lcom/whatsapp/gi;
.super Ljava/lang/Object;
.source "gi.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Landroid/content/Intent;

.field final b:Landroid/content/pm/ResolveInfo;

.field final c:Lcom/whatsapp/a;


# direct methods
.method constructor <init>(Lcom/whatsapp/a;Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/gi;->c:Lcom/whatsapp/a;

    iput-object p2, p0, Lcom/whatsapp/gi;->a:Landroid/content/Intent;

    iput-object p3, p0, Lcom/whatsapp/gi;->b:Landroid/content/pm/ResolveInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 7
    iget-object v0, p0, Lcom/whatsapp/gi;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcom/whatsapp/gi;->b:Landroid/content/pm/ResolveInfo;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/gi;->b:Landroid/content/pm/ResolveInfo;

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/whatsapp/gi;->c:Lcom/whatsapp/a;

    iget v1, v1, Lcom/whatsapp/a;->h:I

    if-lez v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/whatsapp/gi;->c:Lcom/whatsapp/a;

    iget-object v1, v1, Lcom/whatsapp/a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/whatsapp/gi;->c:Lcom/whatsapp/a;

    iget v2, v2, Lcom/whatsapp/a;->h:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/gi;->c:Lcom/whatsapp/a;

    iget-object v1, v1, Lcom/whatsapp/a;->a:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 2
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/gi;->c:Lcom/whatsapp/a;

    invoke-virtual {v0}, Lcom/whatsapp/a;->dismiss()V

    .line 5
    return-void
.end method
