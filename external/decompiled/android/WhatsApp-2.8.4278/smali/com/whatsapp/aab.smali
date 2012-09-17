.class Lcom/whatsapp/aab;
.super Ljava/util/GregorianCalendar;
.source "aab.java"


# instance fields
.field private a:I

.field final b:Lcom/whatsapp/MediaGallery;


# direct methods
.method public constructor <init>(Lcom/whatsapp/MediaGallery;ILjava/util/Calendar;)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/aab;->b:Lcom/whatsapp/MediaGallery;

    invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 9
    iput p2, p0, Lcom/whatsapp/aab;->a:I

    .line 7
    invoke-virtual {p3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/aab;->setTime(Ljava/util/Date;)V

    .line 1
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 4
    iget v0, p0, Lcom/whatsapp/aab;->a:I

    packed-switch v0, :pswitch_data_0

    .line 5
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/aab;->get(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 10
    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/aab;->b:Lcom/whatsapp/MediaGallery;

    const v1, 0x7f090217

    invoke-virtual {v0, v1}, Lcom/whatsapp/MediaGallery;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 6
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/aab;->b:Lcom/whatsapp/MediaGallery;

    const v1, 0x7f090216

    invoke-virtual {v0, v1}, Lcom/whatsapp/MediaGallery;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/aab;->b:Lcom/whatsapp/MediaGallery;

    const v1, 0x7f090215

    invoke-virtual {v0, v1}, Lcom/whatsapp/MediaGallery;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 8
    :pswitch_3
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/whatsapp/aab;->get(I)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->getMonthString(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 4
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
