.class Lcom/whatsapp/sp;
.super Ljava/lang/Object;
.source "sp.java"

# interfaces
.implements Landroid/database/sqlite/SQLiteTransactionListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:Lcom/whatsapp/qp;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u00076A\u0019Z\u0016*N\u001bV\u000b7\\@^\u0000=J\u000b\u001f\u00076A\u001b^\u0007-\u0015O"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/sp;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x3f

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x64

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x59

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x2f

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x6f

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/sp;->b:Lcom/whatsapp/qp;

    iput-object p2, p0, Lcom/whatsapp/sp;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 0

    .prologue
    .line 3
    return-void
.end method

.method public onCommit()V
    .locals 2

    .prologue
    .line 2
    sget-object v0, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1
    sget-object v0, Lcom/whatsapp/sp;->z:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/sp;->a:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/g;->a(Z)V

    .line 6
    return-void
.end method

.method public onRollback()V
    .locals 0

    .prologue
    .line 4
    return-void
.end method