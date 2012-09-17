.class Lcom/whatsapp/h;
.super Landroid/database/CursorWrapper;
.source "h.java"


# instance fields
.field private a:Lcom/whatsapp/sq;


# direct methods
.method public constructor <init>(Landroid/database/Cursor;Lcom/whatsapp/sq;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    invoke-direct {p0, p1}, Landroid/database/CursorWrapper;-><init>(Landroid/database/Cursor;)V

    .line 7
    iput-object p2, p0, Lcom/whatsapp/h;->a:Lcom/whatsapp/sq;

    .line 11
    return-void
.end method


# virtual methods
.method public deactivate()V
    .locals 0

    .prologue
    .line 2
    invoke-super {p0}, Landroid/database/CursorWrapper;->deactivate()V

    .line 4
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 14
    .line 12
    :try_start_0
    invoke-super {p0}, Landroid/database/CursorWrapper;->getCount()I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 18
    return v0

    .line 16
    :catch_0
    move-exception v0

    .line 3
    invoke-static {}, Lcom/whatsapp/fq;->y()V

    .line 17
    throw v0
.end method

.method public requery()Z
    .locals 2

    .prologue
    .line 9
    iget-object v0, p0, Lcom/whatsapp/h;->a:Lcom/whatsapp/sq;

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/whatsapp/h;->a:Lcom/whatsapp/sq;

    invoke-interface {v0}, Lcom/whatsapp/sq;->a()V

    .line 13
    :cond_0
    invoke-super {p0}, Landroid/database/CursorWrapper;->requery()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/whatsapp/h;->a:Lcom/whatsapp/sq;

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/whatsapp/h;->a:Lcom/whatsapp/sq;

    invoke-interface {v1}, Lcom/whatsapp/sq;->b()V

    .line 1
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
