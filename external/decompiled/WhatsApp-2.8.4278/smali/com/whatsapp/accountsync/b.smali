.class Lcom/whatsapp/accountsync/b;
.super Landroid/content/AbstractThreadedSyncAdapter;
.source "b.java"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter

    .prologue
    .line 2
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/content/AbstractThreadedSyncAdapter;-><init>(Landroid/content/Context;Z)V

    .line 5
    iput-object p1, p0, Lcom/whatsapp/accountsync/b;->a:Landroid/content/Context;

    .line 1
    return-void
.end method

.method static a(Lcom/whatsapp/accountsync/b;)Landroid/content/Context;
    .locals 1
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/accountsync/b;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onPerformSync(Landroid/accounts/Account;Landroid/os/Bundle;Ljava/lang/String;Landroid/content/ContentProviderClient;Landroid/content/SyncResult;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 8
    new-instance v0, Lcom/whatsapp/accountsync/f;

    invoke-direct {v0, p0}, Lcom/whatsapp/accountsync/f;-><init>(Lcom/whatsapp/accountsync/b;)V

    .line 6
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 7
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3
    return-void
.end method
