// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static com.whatsapp.client.FunXMPP$MessageStore /*module:WhatsApp-17.class#29*/  message_store ; // ofs = 56892 addr = 35)
	public static String /*java.lang.String[]*/  dictionary ; // ofs = 56898 addr = 36)


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
	ldc literal_412:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_413:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_414:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_415:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_416:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_417:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_418:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_419:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_420:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_421:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_422:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_423:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_424:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_425:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_426:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_427:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_428:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_429:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_430:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_431:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_432:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_433:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_434:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_435:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_436:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_437:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_438:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_439:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_440:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_441:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_442:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_443:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_444:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_445:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_446:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_447:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_448:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_449:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_450:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_451:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_452:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_453:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_454:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_455:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_456:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_457:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_458:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_459:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_460:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_461:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_462:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_463:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_464:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_465:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_466:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_467:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_468:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_469:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_470:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_471:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_472:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_473:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_474:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_475:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_476:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_477:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_478:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_479:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_480:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_481:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_482:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_483:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_484:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_485:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_486:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_487:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_488:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_489:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_490:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_491:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_492:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_493:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_494:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_495:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_496:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_497:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_498:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_499:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_500:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_501:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_502:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_503:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_504:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_505:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_506:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_507:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_508:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_509:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_510:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_511:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_512:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_513:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_514:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_515:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_516:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_517:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_518:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_519:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_520:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_521:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_522:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_523:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_524:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_525:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_526:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_527:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_528:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_529:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_530:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_531:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_532:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_533:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_534:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_535:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_536:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_537:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_538:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_539:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_540:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_541:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_542:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_543:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_544:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_545:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_546:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_547:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_548:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_549:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_550:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_551:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_552:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_553:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_554:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_555:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_556:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_557:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_558:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_559:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_560:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_561:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_562:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_563:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_564:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_565:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_566:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_567:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_568:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_569:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_570:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_571:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_572:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_573:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_574:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_575:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_576:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_577:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_578:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_579:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_580:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_581:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_582:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_583:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_584:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_585:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_586:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_587:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_588:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_589:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_590:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_591:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_592:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_593:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_594:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_595:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_596:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_597:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_598:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_599:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_600:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_601:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_602:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_603:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_604:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_605:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_606:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_607:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_608:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_609:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_610:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_611:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_612:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_613:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_614:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_615:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_616:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_617:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_618:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_619:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_620:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_621:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_622:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_623:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_624:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_625:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_626:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_627:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_628:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_629:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_630:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_631:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_632:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_633:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_634:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_635:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_636:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_637:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_638:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_639:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_640:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_641:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_642:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_643:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_644:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_645:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_646:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_647:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_648:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_649:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
