.class Lcom/whatsapp/wn;
.super Ljava/lang/Object;
.source "wn.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/cf;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v4, 0x7e

    const/16 v1, 0x72

    const/16 v3, 0x29

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001au]qD].D`\u000e\u0001/Nn\u0011\u0015mL/\u001d\u001dl\u0006l\u001f\u0002r\u0016pC\u001enJ;"

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

    const-string v0, "\u0013oMs\u0011\u001be\u0007h\u0010\u0006dGuP\u0013b]h\u0011\u001c/\u007fH;%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v2

    const/4 v8, 0x2

    const-string v0, "R)"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/wn;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_3

    :pswitch_1
    move v0, v2

    goto :goto_3

    :pswitch_2
    move v0, v3

    goto :goto_3

    :pswitch_3
    move v0, v2

    goto :goto_3

    :cond_1
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_4
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_4

    :pswitch_5
    move v0, v2

    goto :goto_4

    :pswitch_6
    move v0, v3

    goto :goto_4

    :pswitch_7
    move v0, v2

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_5

    :pswitch_9
    move v0, v2

    goto :goto_5

    :pswitch_a
    move v0, v3

    goto :goto_5

    :pswitch_b
    move v0, v2

    goto :goto_5

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

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method

.method private constructor <init>(Lcom/whatsapp/cf;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/cf;Lcom/whatsapp/un;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 2
    invoke-direct {p0, p1}, Lcom/whatsapp/wn;-><init>(Lcom/whatsapp/cf;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 7
    iget-object v0, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v0, v0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090262

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_2

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v0, v0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v0, v0, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 5
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v2, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v2, v2, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_2

    .line 10
    :cond_1
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v1, v1, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v1, v1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    .line 11
    :cond_2
    const-string v1, "("

    const-string v2, "["

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 4
    const-string v1, ")"

    const-string v2, "]"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/wn;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v2, v2, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-wide v2, v2, Lcom/whatsapp/sz;->q:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    iget-object v2, v2, Lcom/whatsapp/cf;->o:Lcom/whatsapp/sz;

    iget-wide v2, v2, Lcom/whatsapp/sz;->r:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/wn;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 12
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/wn;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/wn;->a:Lcom/whatsapp/cf;

    invoke-virtual {v0}, Lcom/whatsapp/cf;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 6
    return-void
.end method
