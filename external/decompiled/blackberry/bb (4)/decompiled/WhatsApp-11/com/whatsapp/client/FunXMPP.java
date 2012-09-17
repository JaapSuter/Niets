// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static com.whatsapp.client. /*module:WhatsApp-17.class#7*/  message_store ; // ofs = 55966 addr = 4)
	public static String /*java.lang.String[]*/  dictionary ; // ofs = 55972 addr = 5)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String removeResourceFromJID( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 47
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label10
	aload_0 
	areturn 
Label10:
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static FunXMPP
	clinit_wait 
	new FunXMPP$1
	dup 
	invokespecial com.whatsapp.client.FunXMPP$1.<init> // pc=1
	putstatic message_store // FunXMPP
	sipush 243
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aconst_null 
	aastore 
	dup 
	iconst_1 
	aconst_null 
	aastore 
	dup 
	bipush 2
	aconst_null 
	aastore 
	dup 
	bipush 3
	aconst_null 
	aastore 
	dup 
	bipush 4
	aconst_null 
	aastore 
	dup 
	bipush 5
	ldc literal_304:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_305:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_306:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_307:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_308:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_309:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_310:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_311:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_312:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_313:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_314:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_315:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_316:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_317:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_318:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_319:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_320:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_321:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_322:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_323:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_324:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_325:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_326:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_327:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_328:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_329:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_330:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_331:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_332:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_333:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_334:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_335:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_336:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_337:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_338:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_339:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_340:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_341:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_342:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_343:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_344:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_345:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_346:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_347:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_348:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_349:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_350:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_351:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_352:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_353:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_354:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_355:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_356:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_357:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_358:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_359:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_360:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_361:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_362:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_363:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_364:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_365:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_366:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_367:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_368:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_369:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_370:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_371:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_372:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_373:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_374:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_375:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_376:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_377:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_378:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_379:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_380:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_381:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_382:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_383:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_384:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_385:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_386:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_387:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_388:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_389:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_390:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_391:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_392:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_393:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_394:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_395:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_396:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_397:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_398:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_399:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_400:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_401:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_402:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_403:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_404:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_405:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_406:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_407:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_408:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_409:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_410:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_411:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_412:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_413:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_414:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_415:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_416:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_417:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_418:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_419:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_420:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_421:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_422:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_423:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_424:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_425:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_426:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_427:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_428:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_429:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_430:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_431:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_432:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_433:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_434:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_435:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_436:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_437:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_438:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_439:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_440:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_441:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_442:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_443:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_444:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_445:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_446:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_447:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_448:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_449:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_450:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_451:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_452:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_453:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_454:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_455:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_456:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_457:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_458:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_459:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_460:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_461:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_462:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_463:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_464:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_465:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_466:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_467:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_468:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_469:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_470:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_471:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_472:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_473:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_474:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_475:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_476:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_477:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_478:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_479:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_480:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_481:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_482:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_483:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_484:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_485:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_486:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_487:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_488:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_489:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_490:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_491:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_492:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_493:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_494:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_495:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_496:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_497:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_498:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_499:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_500:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_501:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_502:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_503:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_504:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_505:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_506:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_507:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_508:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_509:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_510:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_511:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_512:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_513:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_514:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_515:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_516:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_517:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_518:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_519:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_520:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_521:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_522:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_523:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_524:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_525:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_526:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_527:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_528:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_529:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_530:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_531:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_532:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_533:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_534:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_535:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_536:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_537:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_538:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_539:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_540:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_541:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
