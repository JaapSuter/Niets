.class public Lcom/whatsapp/re;
.super Landroid/widget/BaseAdapter;
.source "re.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/LocationPickerPopup;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "x;.\u00071`\u0005>\u0006\"x;#\r6"

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

    sput-object v0, Lcom/whatsapp/re;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x44

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x14

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x5a

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x57

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x68

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(Lcom/whatsapp/LocationPickerPopup;Landroid/content/Context;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 20
    iput-object p1, p0, Lcom/whatsapp/re;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/whatsapp/re;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 23
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/re;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/z9;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 15
    iget-object v0, p0, Lcom/whatsapp/re;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v0}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/z9;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter

    .prologue
    .line 11
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1
    .parameter

    .prologue
    .line 6
    const/4 v0, 0x0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    .line 5
    .line 17
    if-nez p2, :cond_0

    .line 1
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/re;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 14
    const v1, 0x7f030041

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 22
    :cond_0
    const v0, 0x7f0d012d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2
    const v1, 0x7f0d0132

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 19
    iget-object v2, p0, Lcom/whatsapp/re;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 16
    iget-object v2, p0, Lcom/whatsapp/re;->a:Lcom/whatsapp/LocationPickerPopup;

    invoke-static {v2}, Lcom/whatsapp/LocationPickerPopup;->b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/whatsapp/z9;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whatsapp/fy;

    .line 13
    iget-object v3, v2, Lcom/whatsapp/fy;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, v2, Lcom/whatsapp/fy;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, ""

    iget-object v3, v2, Lcom/whatsapp/fy;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v0, v2, Lcom/whatsapp/fy;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 12
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 24
    :cond_2
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 4
    const/4 v0, 0x1

    return v0
.end method
