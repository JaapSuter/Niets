.class public Lcom/whatsapp/accountsync/ContactsSyncAdapterService;
.super Landroid/app/Service;
.source "ContactsSyncAdapterService.java"


# static fields
.field private static a:Lcom/whatsapp/accountsync/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/accountsync/ContactsSyncAdapterService;->a:Lcom/whatsapp/accountsync/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 5
    return-void
.end method

.method private a()Lcom/whatsapp/accountsync/b;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/whatsapp/accountsync/ContactsSyncAdapterService;->a:Lcom/whatsapp/accountsync/b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/whatsapp/accountsync/b;

    invoke-direct {v0, p0}, Lcom/whatsapp/accountsync/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/whatsapp/accountsync/ContactsSyncAdapterService;->a:Lcom/whatsapp/accountsync/b;

    .line 1
    :cond_0
    sget-object v0, Lcom/whatsapp/accountsync/ContactsSyncAdapterService;->a:Lcom/whatsapp/accountsync/b;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .parameter

    .prologue
    .line 3
    .line 6
    invoke-direct {p0}, Lcom/whatsapp/accountsync/ContactsSyncAdapterService;->a()Lcom/whatsapp/accountsync/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/accountsync/b;->getSyncAdapterBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 9
    return-object v0
.end method
