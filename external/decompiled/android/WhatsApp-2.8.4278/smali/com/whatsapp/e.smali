.class final Lcom/whatsapp/e;
.super Lcom/whatsapp/c;
.source "e.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final b:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "^BM\u0019\u0007O^B\u001b\u000bRCP@\u0001QB@\u0004OJ_L\u0001\u0005\u0010YJ\u0002\u0007\u001d"

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

    sput-object v0, Lcom/whatsapp/e;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x62

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x3d

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x2d

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x23

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

.method constructor <init>(Landroid/app/Activity;ILandroid/app/Activity;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 6
    iput-object p3, p0, Lcom/whatsapp/e;->b:Landroid/app/Activity;

    invoke-direct {p0, p1, p2}, Lcom/whatsapp/c;-><init>(Landroid/app/Activity;I)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .parameter

    .prologue
    .line 2
    invoke-super {p0, p1}, Lcom/whatsapp/c;->onCreate(Landroid/os/Bundle;)V

    .line 5
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/e;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/whatsapp/e;->b:Landroid/app/Activity;

    sget v0, Lcom/whatsapp/App;->g:I

    if-nez v0, :cond_0

    const v0, 0x7f0900a3

    :goto_0
    invoke-virtual {v1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    const v0, 0x7f0d016e

    invoke-virtual {p0, v0}, Lcom/whatsapp/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    const v0, 0x7f0d016f

    invoke-virtual {p0, v0}, Lcom/whatsapp/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/so;

    invoke-direct {v1, p0}, Lcom/whatsapp/so;-><init>(Lcom/whatsapp/e;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1
    return-void

    .line 7
    :cond_0
    const v0, 0x7f0900a2

    goto :goto_0
.end method
