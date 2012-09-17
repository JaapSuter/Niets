.class final Lcom/whatsapp/l4;
.super Ljava/lang/Object;
.source "l4.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u0019W[6\u0010\t\u0019N;\\\u001e\\N&\u0015\tO_t\u000e\tTU \u0019LO_&\u000f\u0005VT"

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

    sput-object v0, Lcom/whatsapp/l4;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7c

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x6c

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x39

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x3a

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x54

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/l4;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 3
    invoke-static {}, Lcom/whatsapp/k4;->i()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    .line 10
    iget-object v2, p0, Lcom/whatsapp/l4;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/whatsapp/n7;->a(Ljava/lang/String;)Lcom/whatsapp/n7;

    move-result-object v2

    .line 2
    if-nez v2, :cond_1

    .line 16
    :cond_0
    :goto_0
    return-void

    .line 11
    :cond_1
    invoke-static {v1}, Lcom/whatsapp/n7;->a(Ljava/lang/String;)Lcom/whatsapp/n7;

    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v2, v1}, Lcom/whatsapp/n7;->a(Lcom/whatsapp/n7;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 8
    :cond_2
    :goto_1
    if-eqz v0, :cond_0

    .line 7
    :cond_3
    sget-object v0, Lcom/whatsapp/l4;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :pswitch_0
    invoke-static {}, Lcom/whatsapp/k4;->j()V

    .line 13
    if-eqz v0, :cond_2

    .line 1
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/k4;->h()V

    goto :goto_1

    .line 6
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
