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
	ldc literal_440:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_441:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_442:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_443:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_444:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_445:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_446:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_447:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_448:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_449:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_450:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_451:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_452:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_453:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_454:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_455:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_456:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_457:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_458:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_459:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_460:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_461:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_462:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_463:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_464:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_465:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_466:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_467:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_468:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_469:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_470:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_471:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_472:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_473:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_474:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_475:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_476:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_477:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_478:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_479:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_480:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_481:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_482:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_483:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_484:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_485:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_486:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_487:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_488:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_489:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_490:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_491:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_492:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_493:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_494:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_495:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_496:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_497:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_498:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_499:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_500:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_501:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_502:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_503:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_504:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_505:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_506:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_507:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_508:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_509:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_510:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_511:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_512:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_513:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_514:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_515:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_516:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_517:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_518:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_519:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_520:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_521:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_522:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_523:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_524:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_525:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_526:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_527:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_528:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_529:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_530:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_531:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_532:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_533:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_534:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_535:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_536:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_537:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_538:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_539:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_540:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_541:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_542:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_543:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_544:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_545:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_546:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_547:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_548:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_549:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_550:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_551:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_552:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_553:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_554:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_555:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_556:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_557:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_558:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_559:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_560:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_561:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_562:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_563:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_564:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_565:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_566:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_567:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_568:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_569:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_570:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_571:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_572:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_573:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_574:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_575:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_576:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_577:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_578:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_579:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_580:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_581:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_582:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_583:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_584:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_585:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_586:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_587:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_588:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_589:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_590:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_591:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_592:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_593:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_594:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_595:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_596:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_597:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_598:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_599:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_600:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_601:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_602:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_603:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_604:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_605:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_606:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_607:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_608:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_609:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_610:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_611:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_612:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_613:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_614:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_615:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_616:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_617:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_618:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_619:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_620:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_621:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_622:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_623:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_624:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_625:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_626:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_627:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_628:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_629:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_630:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_631:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_632:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_633:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_634:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_635:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_636:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_637:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_638:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_639:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_640:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_641:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_642:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_643:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_644:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_645:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_646:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_647:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_648:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_649:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_650:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_651:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_652:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_653:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_654:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_655:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_656:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_657:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_658:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_659:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_660:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_661:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_662:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_663:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_664:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_665:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_666:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_667:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_668:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_669:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_670:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_671:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_672:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_673:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_674:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_675:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_676:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_677:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
