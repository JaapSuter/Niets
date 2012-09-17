.class public Lcom/whatsapp/af;
.super Lcom/whatsapp/ze;
.source "af.java"


# static fields
.field private static final G:Ljava/lang/String;


# instance fields
.field private final F:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "Ug\u000bEcD{\u0004GoYfHAiA%\u0006\\hBi\u0006G)Ug\u000bGgU|HGnCe\u0007\u001cdW{\u0000\u00052\u001bl\u0000PiRmJVtDg\u0017"

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

    sput-object v0, Lcom/whatsapp/af;->G:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x6

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x36

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x8

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x65

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x33

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/ze;-><init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)V

    .line 30
    const v0, 0x7f0d0059

    invoke-virtual {p0, v0}, Lcom/whatsapp/af;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/af;->F:Landroid/widget/Button;

    .line 20
    iget-object v0, p0, Lcom/whatsapp/af;->F:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/tn;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whatsapp/tn;-><init>(Lcom/whatsapp/af;Lcom/whatsapp/sn;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    invoke-direct {p0, p2}, Lcom/whatsapp/af;->b(Lcom/whatsapp/sz;)V

    .line 34
    return-void
.end method

.method private b(Lcom/whatsapp/sz;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 39
    iget-object v0, p1, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lcom/whatsapp/af;->F:Landroid/widget/Button;

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg;->b(Ljava/lang/String;)Lg;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lb; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_2

    iget-object v2, v0, Lg;->f:[B

    if-eqz v2, :cond_2

    iget-object v2, v0, Lg;->f:[B

    array-length v2, v2

    if-lez v2, :cond_2

    .line 12
    :try_start_1
    iget-object v0, v0, Lg;->f:[B

    invoke-static {v0}, Lwb;->b([B)[B

    move-result-object v0

    .line 13
    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 19
    :goto_1
    iget-object v2, p0, Lcom/whatsapp/af;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02041c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1
    if-eqz v0, :cond_0

    .line 15
    new-instance v3, Lcom/whatsapp/o;

    iget-object v4, p0, Lcom/whatsapp/af;->f:Landroid/content/Context;

    invoke-direct {v3, v4, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 26
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-virtual {v3, v5, v5, v0, v4}, Lcom/whatsapp/o;->setBounds(IIII)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/af;->F:Landroid/widget/Button;

    invoke-virtual {v0, v3, v1, v1, v1}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 21
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/af;->F:Landroid/widget/Button;

    invoke-virtual {v0, v2, v1, v1, v1}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 11
    :cond_1
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 14
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 27
    goto :goto_0

    .line 2
    :catch_1
    move-exception v0

    .line 42
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 40
    goto :goto_0

    .line 33
    :catch_2
    move-exception v0

    .line 8
    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0

    .line 28
    :catch_3
    move-exception v0

    .line 31
    sget-object v2, Lcom/whatsapp/af;->G:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 23
    goto :goto_1

    .line 18
    :catch_4
    move-exception v0

    .line 36
    sget-object v2, Lcom/whatsapp/af;->G:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 6
    const v0, 0x7f03001a

    return v0
.end method

.method public a(Lcom/whatsapp/sz;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 25
    iget-object v0, p0, Lcom/whatsapp/af;->o:Lcom/whatsapp/sz;

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_1

    .line 29
    :cond_0
    invoke-direct {p0, p1}, Lcom/whatsapp/af;->b(Lcom/whatsapp/sz;)V

    .line 10
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;Z)V

    .line 16
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 41
    const v0, 0x7f03001b

    return v0
.end method
