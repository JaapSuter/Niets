.class Lcom/whatsapp/h2;
.super Ljava/lang/Object;
.source "h2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/RegisterPhone;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "\u007f_\u000b\u0002)tQ\u0012_?l@HO1i^\u0012^\'C^\u0007A;"

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

    sput-object v0, Lcom/whatsapp/h2;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x5e

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x1c

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x30

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x66

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x2c

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/RegisterPhone;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/h2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter

    .prologue
    .line 6
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/whatsapp/h2;->a:Lcom/whatsapp/RegisterPhone;

    const-class v2, Lcom/whatsapp/CountryPicker;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    sget-object v1, Lcom/whatsapp/h2;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/h2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v2, v2, Lcom/whatsapp/RegisterPhone;->C:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    iget-object v1, p0, Lcom/whatsapp/h2;->a:Lcom/whatsapp/RegisterPhone;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/RegisterPhone;->startActivityForResult(Landroid/content/Intent;I)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/h2;->a:Lcom/whatsapp/RegisterPhone;

    iget-object v0, v0, Lcom/whatsapp/RegisterPhone;->B:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/whatsapp/h2;->a:Lcom/whatsapp/RegisterPhone;

    invoke-static {v1}, Lcom/whatsapp/RegisterPhone;->c(Lcom/whatsapp/RegisterPhone;)Landroid/text/TextWatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1
    return-void
.end method
