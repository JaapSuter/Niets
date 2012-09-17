.class La;
.super Ljava/io/BufferedReader;
.source "a.java"


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    invoke-direct {p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 3
    return-void
.end method


# virtual methods
.method public readLine()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 5
    invoke-super {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 7
    iget-wide v5, p0, La;->a:J

    sub-long v0, v3, v0

    add-long/2addr v0, v5

    iput-wide v0, p0, La;->a:J

    .line 2
    return-object v2
.end method
