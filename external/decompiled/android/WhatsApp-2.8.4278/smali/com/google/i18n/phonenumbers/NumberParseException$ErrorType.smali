.class public final enum Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/i18n/phonenumbers/NumberParseException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ErrorType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

.field public static final enum INVALID_COUNTRY_CODE:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

.field public static final enum NOT_A_NUMBER:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

.field public static final enum TOO_LONG:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

.field public static final enum TOO_SHORT_AFTER_IDD:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

.field public static final enum TOO_SHORT_NSN:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    const-string v1, "INVALID_COUNTRY_CODE"

    invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    const-string v1, "NOT_A_NUMBER"

    invoke-direct {v0, v1, v3}, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->NOT_A_NUMBER:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    const-string v1, "TOO_SHORT_AFTER_IDD"

    invoke-direct {v0, v1, v4}, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->TOO_SHORT_AFTER_IDD:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    const-string v1, "TOO_SHORT_NSN"

    invoke-direct {v0, v1, v5}, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->TOO_SHORT_NSN:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    const-string v1, "TOO_LONG"

    invoke-direct {v0, v1, v6}, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->TOO_LONG:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    sget-object v1, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->NOT_A_NUMBER:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->TOO_SHORT_AFTER_IDD:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->TOO_SHORT_NSN:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->TOO_LONG:Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->$VALUES:[Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;
    .locals 1

    const-class v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    return-object v0
.end method

.method public static final values()[Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;
    .locals 1

    sget-object v0, Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->$VALUES:[Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    invoke-virtual {v0}, [Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;

    return-object v0
.end method
