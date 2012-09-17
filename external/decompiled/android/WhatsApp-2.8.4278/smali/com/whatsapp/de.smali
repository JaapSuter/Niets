.class public Lcom/whatsapp/de;
.super Landroid/widget/ArrayAdapter;
.source "de.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/whatsapp/zq;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/view/LayoutInflater;

.field final c:Lcom/whatsapp/BroadcastMessageComposer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v1, 0x68

    const-string v0, "qD"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    move v3, v2

    move-object v2, v0

    :goto_0
    if-gt v3, v4, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/de;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v5, v2, v4

    rem-int/lit8 v0, v4, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v1

    :goto_1
    xor-int/2addr v0, v5

    int-to-char v0, v0

    aput-char v0, v2, v4

    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x51

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x64

    goto :goto_1

    :pswitch_2
    move v0, v1

    goto :goto_1

    :pswitch_3
    const/4 v0, 0x4

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

.method public constructor <init>(Lcom/whatsapp/BroadcastMessageComposer;Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 17
    iput-object p1, p0, Lcom/whatsapp/de;->c:Lcom/whatsapp/BroadcastMessageComposer;

    .line 20
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 8
    iput-object p4, p0, Lcom/whatsapp/de;->a:Ljava/util/ArrayList;

    .line 18
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/de;->b:Landroid/view/LayoutInflater;

    .line 25
    return-void
.end method


# virtual methods
.method public a(I)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 28
    iget-object v0, p0, Lcom/whatsapp/de;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/whatsapp/de;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/whatsapp/de;->a(I)Lcom/whatsapp/zq;

    move-result-object v0

    return-object v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 19
    if-nez p2, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/de;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f03004c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lcom/whatsapp/de;->a(I)Lcom/whatsapp/zq;

    move-result-object v2

    .line 2
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    const v0, 0x7f0d00e1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 26
    invoke-static {}, Lcom/whatsapp/BroadcastMessageComposer;->e()I

    move-result v1

    invoke-static {}, Lcom/whatsapp/BroadcastMessageComposer;->f()F

    move-result v4

    const/4 v5, 0x1

    invoke-virtual {v2, v1, v4, v5}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 14
    if-nez v1, :cond_1

    .line 7
    invoke-virtual {v2}, Lcom/whatsapp/zq;->k()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v3, :cond_2

    .line 12
    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 16
    :cond_2
    const v0, 0x7f0d014d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 29
    const v1, 0x7f0d014e

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 11
    invoke-virtual {v2}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v0, v2, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/whatsapp/zq;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/de;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/whatsapp/de;->c:Lcom/whatsapp/BroadcastMessageComposer;

    invoke-virtual {v2}, Lcom/whatsapp/BroadcastMessageComposer;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/whatsapp/v4;->b(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 4
    if-nez v2, :cond_6

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    rem-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_3

    .line 22
    const v0, 0x7f020414

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz v3, :cond_4

    .line 1
    :cond_3
    const v0, 0x7f020416

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 13
    :cond_4
    return-object p2

    .line 24
    :cond_5
    sget-object v0, Lcom/whatsapp/de;->z:Ljava/lang/String;

    goto :goto_0

    :cond_6
    move-object v0, v2

    .line 4
    goto :goto_1
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 6
    const/4 v0, 0x1

    return v0
.end method
