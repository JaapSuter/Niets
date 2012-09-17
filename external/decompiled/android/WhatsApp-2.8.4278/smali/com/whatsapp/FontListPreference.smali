.class public Lcom/whatsapp/FontListPreference;
.super Landroid/preference/ListPreference;
.source "FontListPreference.java"


# static fields
.field static a:I = 0x0

.field public static final b:I = -0x2

.field public static final c:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 2
    const/4 v0, 0x0

    sput v0, Lcom/whatsapp/FontListPreference;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    invoke-direct {p0, p1}, Landroid/preference/ListPreference;-><init>(Landroid/content/Context;)V

    .line 3
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-direct {p0, p1, p2}, Landroid/preference/ListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    return-void
.end method


# virtual methods
.method public persistString(Ljava/lang/String;)Z
    .locals 1
    .parameter

    .prologue
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/whatsapp/FontListPreference;->a:I

    .line 4
    invoke-super {p0, p1}, Landroid/preference/ListPreference;->persistString(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
