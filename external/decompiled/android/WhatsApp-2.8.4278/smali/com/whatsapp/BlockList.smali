.class public Lcom/whatsapp/BlockList;
.super Lcom/whatsapp/DialogToastListActivity;
.source "BlockList.java"

# interfaces
.implements Lcom/whatsapp/k2;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field private i:Lcom/whatsapp/pj;

.field j:Lcom/whatsapp/ce;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v4, 0x61

    const/16 v2, 0x4c

    const/16 v3, 0x48

    const/16 v1, 0x26

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "G\",\u0013\u0004O(f\u0008\u0005R)&\u0015EG/<\u0008\u0004Hb\u0018((m"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v8, 0x1

    const-string v0, "E#%O\u001cN-<\u0012\nV<"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/BlockList;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x6b

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    move v0, v3

    goto :goto_2

    :pswitch_3
    move v0, v4

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x6b

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    move v0, v3

    goto :goto_3

    :pswitch_7
    move v0, v4

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/BlockList;->g:Ljava/util/ArrayList;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/BlockList;->h:Z

    .line 1
    new-instance v0, Lcom/whatsapp/pj;

    invoke-direct {v0}, Lcom/whatsapp/pj;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/BlockList;->i:Lcom/whatsapp/pj;

    .line 56
    return-void
.end method

.method static a(Lcom/whatsapp/BlockList;)Lcom/whatsapp/pj;
    .locals 1
    .parameter

    .prologue
    .line 12
    iget-object v0, p0, Lcom/whatsapp/BlockList;->i:Lcom/whatsapp/pj;

    return-object v0
.end method

.method private a()V
    .locals 5

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 72
    iget-object v0, p0, Lcom/whatsapp/BlockList;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 44
    sget-object v0, Lcom/whatsapp/App;->yb:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v2

    .line 74
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    :try_start_0
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 77
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v3

    .line 73
    if-eqz v3, :cond_1

    .line 62
    iget-object v4, p0, Lcom/whatsapp/BlockList;->g:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    .line 66
    :cond_1
    iget-object v3, p0, Lcom/whatsapp/BlockList;->g:Ljava/util/ArrayList;

    new-instance v4, Lcom/whatsapp/zq;

    invoke-direct {v4, v0}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 82
    :catch_0
    move-exception v0

    if-eqz v1, :cond_0

    .line 52
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/BlockList;->g:Ljava/util/ArrayList;

    new-instance v1, Lcom/whatsapp/ej;

    invoke-direct {v1}, Lcom/whatsapp/ej;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 39
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/whatsapp/BlockList;->a()V

    .line 43
    iget-object v0, p0, Lcom/whatsapp/BlockList;->j:Lcom/whatsapp/ce;

    invoke-virtual {v0}, Lcom/whatsapp/ce;->notifyDataSetChanged()V

    .line 27
    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/j2;)V
    .locals 1
    .parameter

    .prologue
    .line 28
    iget-boolean v0, p1, Lcom/whatsapp/j2;->j:Z

    if-eqz v0, :cond_0

    .line 61
    invoke-direct {p0}, Lcom/whatsapp/BlockList;->b()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 6
    :cond_0
    const/16 v0, 0x6c

    invoke-virtual {p0, v0}, Lcom/whatsapp/BlockList;->showDialog(I)V

    .line 29
    :cond_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    .line 76
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 67
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 32
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f09010d

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 50
    :cond_0
    const/16 v0, 0x6b

    invoke-virtual {p0, v0}, Lcom/whatsapp/BlockList;->showDialog(I)V

    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/BlockList;->h:Z

    .line 51
    new-instance v0, Lcom/whatsapp/o8;

    invoke-direct {v0, p0, p3}, Lcom/whatsapp/o8;-><init>(Lcom/whatsapp/BlockList;Landroid/content/Intent;)V

    invoke-virtual {v0}, Lcom/whatsapp/o8;->start()V

    .line 60
    :cond_1
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 7
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 36
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getListView()Landroid/widget/ListView;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 65
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 53
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    .line 41
    :pswitch_0
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v1

    if-nez v1, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f09010d

    invoke-static {v1, v2, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 33
    :cond_0
    const/16 v1, 0x6b

    invoke-virtual {p0, v1}, Lcom/whatsapp/BlockList;->showDialog(I)V

    .line 42
    iput-boolean v3, p0, Lcom/whatsapp/BlockList;->h:Z

    .line 55
    new-instance v1, Lcom/whatsapp/n8;

    invoke-direct {v1, p0, v0}, Lcom/whatsapp/n8;-><init>(Lcom/whatsapp/BlockList;Lcom/whatsapp/zq;)V

    invoke-virtual {v1}, Lcom/whatsapp/n8;->start()V

    .line 16
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    .line 11
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 81
    const v0, 0x7f030007

    invoke-virtual {p0, v0}, Lcom/whatsapp/BlockList;->setContentView(I)V

    .line 4
    invoke-direct {p0}, Lcom/whatsapp/BlockList;->a()V

    .line 18
    new-instance v0, Lcom/whatsapp/ce;

    const v1, 0x7f030014

    iget-object v2, p0, Lcom/whatsapp/BlockList;->g:Ljava/util/ArrayList;

    invoke-direct {v0, p0, p0, v1, v2}, Lcom/whatsapp/ce;-><init>(Lcom/whatsapp/BlockList;Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lcom/whatsapp/BlockList;->j:Lcom/whatsapp/ce;

    .line 22
    iget-object v0, p0, Lcom/whatsapp/BlockList;->j:Lcom/whatsapp/ce;

    invoke-virtual {p0, v0}, Lcom/whatsapp/BlockList;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 5
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getListView()Landroid/widget/ListView;

    move-result-object v0

    const v1, 0x7f0d003f

    invoke-virtual {p0, v1}, Lcom/whatsapp/BlockList;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 68
    const v0, 0x7f0d003e

    invoke-virtual {p0, v0}, Lcom/whatsapp/BlockList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/hi;

    invoke-direct {v1, p0}, Lcom/whatsapp/hi;-><init>(Lcom/whatsapp/BlockList;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/BlockList;->registerForContextMenu(Landroid/view/View;)V

    .line 57
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 38
    move-object v0, p3

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 71
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getListView()Landroid/widget/ListView;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 35
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/DialogToastListActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 37
    const v1, 0x7f090229

    invoke-virtual {p0, v1}, Lcom/whatsapp/BlockList;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v3, v3, v0}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 54
    return-void
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter

    .prologue
    .line 49
    packed-switch p1, :pswitch_data_0

    .line 79
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 21
    const v1, 0x7f09008a

    invoke-virtual {p0, v1}, Lcom/whatsapp/BlockList;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 15
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 17
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 9
    :pswitch_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-boolean v0, p0, Lcom/whatsapp/BlockList;->h:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0902ae

    :goto_1
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/ii;

    invoke-direct {v2, p0}, Lcom/whatsapp/ii;-><init>(Lcom/whatsapp/BlockList;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x7f0902af

    goto :goto_1

    .line 49
    :pswitch_data_0
    .packed-switch 0x6b
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 46
    invoke-virtual {p0}, Lcom/whatsapp/BlockList;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 70
    const v1, 0x7f09003b

    invoke-virtual {p0, v1}, Lcom/whatsapp/BlockList;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-interface {p1, v2, v2, v2, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v1

    .line 8
    const v2, 0x7f0203bc

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 2
    const/4 v0, 0x1

    return v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 80
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/BlockList;->i:Lcom/whatsapp/pj;

    invoke-virtual {v0}, Lcom/whatsapp/pj;->a()V

    .line 13
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 78
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 63
    :goto_0
    return v3

    .line 3
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/whatsapp/BlockList;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    sget-object v1, Lcom/whatsapp/BlockList;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/BlockList;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 78
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 34
    invoke-static {p0}, Lcom/whatsapp/j2;->b(Lcom/whatsapp/k2;)V

    .line 75
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onPause()V

    .line 40
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 59
    invoke-static {p0}, Lcom/whatsapp/j2;->a(Lcom/whatsapp/k2;)V

    .line 24
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onResume()V

    .line 31
    return-void
.end method
