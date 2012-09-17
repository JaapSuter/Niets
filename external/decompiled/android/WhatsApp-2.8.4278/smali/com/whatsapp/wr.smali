.class Lcom/whatsapp/wr;
.super Ljava/lang/Object;
.source "wr.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/whatsapp/xr;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/EditGroupSubject;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "K\u00136\u0000\nH\u0018)\u000bM"

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

    sput-object v0, Lcom/whatsapp/wr;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2a

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x3f

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x6a

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x46

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x65

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/EditGroupSubject;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/wr;->a:Lcom/whatsapp/EditGroupSubject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/xr;Lcom/whatsapp/xr;)I
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 3
    instance-of v0, p1, Lcom/whatsapp/xr;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lcom/whatsapp/xr;

    if-nez v0, :cond_1

    .line 5
    :cond_0
    sget-object v0, Lcom/whatsapp/wr;->z:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 2
    :cond_1
    iget-object v0, p1, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    iget-object v0, v0, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    iget-object v1, p2, Lcom/whatsapp/xr;->c:Lcom/whatsapp/yr;

    iget-object v1, v1, Lcom/whatsapp/yr;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    check-cast p1, Lcom/whatsapp/xr;

    check-cast p2, Lcom/whatsapp/xr;

    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/wr;->a(Lcom/whatsapp/xr;Lcom/whatsapp/xr;)I

    move-result v0

    return v0
.end method
