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
	ldc literal_179:"1"
	aastore 
	dup 
	bipush 6
	ldc literal_180:"1.0"
	aastore 
	dup 
	bipush 7
	ldc literal_181:"ack"
	aastore 
	dup 
	bipush 8
	ldc literal_182:"action"
	aastore 
	dup 
	bipush 9
	ldc literal_183:"active"
	aastore 
	dup 
	bipush 10
	ldc literal_184:"add"
	aastore 
	dup 
	bipush 11
	ldc literal_185:"all"
	aastore 
	dup 
	bipush 12
	ldc literal_186:"allow"
	aastore 
	dup 
	bipush 13
	ldc literal_187:"apple"
	aastore 
	dup 
	bipush 14
	ldc literal_188:"audio"
	aastore 
	dup 
	bipush 15
	ldc literal_189:"auth"
	aastore 
	dup 
	bipush 16
	ldc literal_190:"author"
	aastore 
	dup 
	bipush 17
	ldc literal_191:"available"
	aastore 
	dup 
	bipush 18
	ldc literal_192:"bad-request"
	aastore 
	dup 
	bipush 19
	ldc literal_193:"base64"
	aastore 
	dup 
	bipush 20
	ldc literal_194:"Bell.caf"
	aastore 
	dup 
	bipush 21
	ldc literal_195:"bind"
	aastore 
	dup 
	bipush 22
	ldc literal_196:"body"
	aastore 
	dup 
	bipush 23
	ldc literal_197:"Boing.caf"
	aastore 
	dup 
	bipush 24
	ldc literal_198:"cancel"
	aastore 
	dup 
	bipush 25
	ldc literal_199:"category"
	aastore 
	dup 
	bipush 26
	ldc literal_200:"challenge"
	aastore 
	dup 
	bipush 27
	ldc literal_201:"chat"
	aastore 
	dup 
	bipush 28
	ldc literal_202:"clean"
	aastore 
	dup 
	bipush 29
	ldc literal_203:"code"
	aastore 
	dup 
	bipush 30
	ldc literal_204:"composing"
	aastore 
	dup 
	bipush 31
	ldc literal_205:"config"
	aastore 
	dup 
	bipush 32
	ldc literal_206:"conflict"
	aastore 
	dup 
	bipush 33
	ldc literal_207:"contacts"
	aastore 
	dup 
	bipush 34
	ldc literal_208:"create"
	aastore 
	dup 
	bipush 35
	ldc literal_209:"creation"
	aastore 
	dup 
	bipush 36
	ldc literal_210:"default"
	aastore 
	dup 
	bipush 37
	ldc literal_211:"delay"
	aastore 
	dup 
	bipush 38
	ldc literal_212:"delete"
	aastore 
	dup 
	bipush 39
	ldc literal_213:"delivered"
	aastore 
	dup 
	bipush 40
	ldc literal_214:"deny"
	aastore 
	dup 
	bipush 41
	ldc literal_215:"DIGEST-MD5"
	aastore 
	dup 
	bipush 42
	ldc literal_216:"DIGEST-MD5-1"
	aastore 
	dup 
	bipush 43
	ldc literal_217:"dirty"
	aastore 
	dup 
	bipush 44
	ldc literal_218:"en"
	aastore 
	dup 
	bipush 45
	ldc literal_219:"enable"
	aastore 
	dup 
	bipush 46
	ldc literal_220:"encoding"
	aastore 
	dup 
	bipush 47
	ldc literal_221:"error"
	aastore 
	dup 
	bipush 48
	ldc literal_222:"expiration"
	aastore 
	dup 
	bipush 49
	ldc literal_223:"expired"
	aastore 
	dup 
	bipush 50
	ldc literal_224:"failure"
	aastore 
	dup 
	bipush 51
	ldc literal_225:"false"
	aastore 
	dup 
	bipush 52
	ldc literal_226:"favorites"
	aastore 
	dup 
	bipush 53
	ldc literal_227:"feature"
	aastore 
	dup 
	bipush 54
	ldc literal_228:"field"
	aastore 
	dup 
	bipush 55
	ldc literal_229:"free"
	aastore 
	dup 
	bipush 56
	ldc literal_230:"from"
	aastore 
	dup 
	bipush 57
	ldc literal_231:"g.us"
	aastore 
	dup 
	bipush 58
	ldc literal_232:"get"
	aastore 
	dup 
	bipush 59
	ldc literal_233:"Glass.caf"
	aastore 
	dup 
	bipush 60
	ldc literal_234:"google"
	aastore 
	dup 
	bipush 61
	ldc literal_235:"group"
	aastore 
	dup 
	bipush 62
	ldc literal_236:"groups"
	aastore 
	dup 
	bipush 63
	ldc literal_237:"g_sound"
	aastore 
	dup 
	bipush 64
	ldc literal_238:"Harp.caf"
	aastore 
	dup 
	bipush 65
	ldc literal_239:"http://etherx.jabber.org/streams"
	aastore 
	dup 
	bipush 66
	ldc literal_240:"http://jabber.org/protocol/chatstates"
	aastore 
	dup 
	bipush 67
	ldc literal_241:"id"
	aastore 
	dup 
	bipush 68
	ldc literal_242:"image"
	aastore 
	dup 
	bipush 69
	ldc literal_243:"img"
	aastore 
	dup 
	bipush 70
	ldc literal_244:"inactive"
	aastore 
	dup 
	bipush 71
	ldc literal_245:"internal-server-error"
	aastore 
	dup 
	bipush 72
	ldc literal_246:"iq"
	aastore 
	dup 
	bipush 73
	ldc literal_247:"item"
	aastore 
	dup 
	bipush 74
	ldc literal_248:"item-not-found"
	aastore 
	dup 
	bipush 75
	ldc literal_249:"jabber:client"
	aastore 
	dup 
	bipush 76
	ldc literal_250:"jabber:iq:last"
	aastore 
	dup 
	bipush 77
	ldc literal_251:"jabber:iq:privacy"
	aastore 
	dup 
	bipush 78
	ldc literal_252:"jabber:x:delay"
	aastore 
	dup 
	bipush 79
	ldc literal_253:"jabber:x:event"
	aastore 
	dup 
	bipush 80
	ldc literal_254:"jid"
	aastore 
	dup 
	bipush 81
	ldc literal_255:"jid-malformed"
	aastore 
	dup 
	bipush 82
	ldc literal_256:"kind"
	aastore 
	dup 
	bipush 83
	ldc literal_257:"leave"
	aastore 
	dup 
	bipush 84
	ldc literal_258:"leave-all"
	aastore 
	dup 
	bipush 85
	ldc literal_259:"list"
	aastore 
	dup 
	bipush 86
	ldc literal_260:"location"
	aastore 
	dup 
	bipush 87
	ldc literal_261:"max_groups"
	aastore 
	dup 
	bipush 88
	ldc literal_262:"max_participants"
	aastore 
	dup 
	bipush 89
	ldc literal_263:"max_subject"
	aastore 
	dup 
	bipush 90
	ldc literal_264:"mechanism"
	aastore 
	dup 
	bipush 91
	ldc literal_265:"mechanisms"
	aastore 
	dup 
	bipush 92
	ldc literal_266:"media"
	aastore 
	dup 
	bipush 93
	ldc literal_267:"message"
	aastore 
	dup 
	bipush 94
	ldc literal_268:"message_acks"
	aastore 
	dup 
	bipush 95
	ldc literal_269:"missing"
	aastore 
	dup 
	bipush 96
	ldc literal_270:"modify"
	aastore 
	dup 
	bipush 97
	ldc literal_271:"name"
	aastore 
	dup 
	bipush 98
	ldc literal_272:"not-acceptable"
	aastore 
	dup 
	bipush 99
	ldc literal_273:"not-allowed"
	aastore 
	dup 
	bipush 100
	ldc literal_274:"not-authorized"
	aastore 
	dup 
	bipush 101
	ldc literal_275:"notify"
	aastore 
	dup 
	bipush 102
	ldc literal_276:"Offline Storage"
	aastore 
	dup 
	bipush 103
	ldc literal_277:"order"
	aastore 
	dup 
	bipush 104
	ldc literal_278:"owner"
	aastore 
	dup 
	bipush 105
	ldc literal_279:"owning"
	aastore 
	dup 
	bipush 106
	ldc literal_280:"paid"
	aastore 
	dup 
	bipush 107
	ldc literal_281:"participant"
	aastore 
	dup 
	bipush 108
	ldc literal_282:"participants"
	aastore 
	dup 
	bipush 109
	ldc literal_283:"participating"
	aastore 
	dup 
	bipush 110
	ldc literal_284:"fail"
	aastore 
	dup 
	bipush 111
	ldc literal_285:"paused"
	aastore 
	dup 
	bipush 112
	ldc literal_286:"picture"
	aastore 
	dup 
	bipush 113
	ldc literal_287:"ping"
	aastore 
	dup 
	bipush 114
	ldc literal_288:"PLAIN"
	aastore 
	dup 
	bipush 115
	ldc literal_289:"platform"
	aastore 
	dup 
	bipush 116
	ldc literal_290:"presence"
	aastore 
	dup 
	bipush 117
	ldc literal_291:"preview"
	aastore 
	dup 
	bipush 118
	ldc literal_292:"probe"
	aastore 
	dup 
	bipush 119
	ldc literal_293:"prop"
	aastore 
	dup 
	bipush 120
	ldc literal_294:"props"
	aastore 
	dup 
	bipush 121
	ldc literal_295:"p_o"
	aastore 
	dup 
	bipush 122
	ldc literal_296:"p_t"
	aastore 
	dup 
	bipush 123
	ldc literal_297:"query"
	aastore 
	dup 
	bipush 124
	ldc literal_298:"raw"
	aastore 
	dup 
	bipush 125
	ldc literal_299:"receipt"
	aastore 
	dup 
	bipush 126
	ldc literal_300:"receipt_acks"
	aastore 
	dup 
	bipush 127
	ldc literal_301:"received"
	aastore 
	dup 
	sipush 128
	ldc literal_302:"relay"
	aastore 
	dup 
	sipush 129
	ldc literal_303:"remove"
	aastore 
	dup 
	sipush 130
	ldc literal_304:"Replaced by new connection"
	aastore 
	dup 
	sipush 131
	ldc literal_305:"request"
	aastore 
	dup 
	sipush 132
	ldc literal_306:"resource"
	aastore 
	dup 
	sipush 133
	ldc literal_307:"resource-constraint"
	aastore 
	dup 
	sipush 134
	ldc literal_308:"response"
	aastore 
	dup 
	sipush 135
	ldc literal_309:"result"
	aastore 
	dup 
	sipush 136
	ldc literal_310:"retry"
	aastore 
	dup 
	sipush 137
	ldc literal_311:"rim"
	aastore 
	dup 
	sipush 138
	ldc literal_312:"s.whatsapp.net"
	aastore 
	dup 
	sipush 139
	ldc literal_313:"seconds"
	aastore 
	dup 
	sipush 140
	ldc literal_314:"server"
	aastore 
	dup 
	sipush 141
	ldc literal_315:"session"
	aastore 
	dup 
	sipush 142
	ldc literal_316:"set"
	aastore 
	dup 
	sipush 143
	ldc literal_317:"show"
	aastore 
	dup 
	sipush 144
	ldc literal_318:"sid"
	aastore 
	dup 
	sipush 145
	ldc literal_319:"sound"
	aastore 
	dup 
	sipush 146
	ldc literal_320:"stamp"
	aastore 
	dup 
	sipush 147
	ldc literal_321:"starttls"
	aastore 
	dup 
	sipush 148
	ldc literal_322:"status"
	aastore 
	dup 
	sipush 149
	ldc literal_323:"stream:error"
	aastore 
	dup 
	sipush 150
	ldc literal_324:"stream:features"
	aastore 
	dup 
	sipush 151
	ldc literal_325:"subject"
	aastore 
	dup 
	sipush 152
	ldc literal_326:"subscribe"
	aastore 
	dup 
	sipush 153
	ldc literal_327:"success"
	aastore 
	dup 
	sipush 154
	ldc literal_328:"system-shutdown"
	aastore 
	dup 
	sipush 155
	ldc literal_329:"s_o"
	aastore 
	dup 
	sipush 156
	ldc literal_330:"s_t"
	aastore 
	dup 
	sipush 157
	ldc literal_331:"t"
	aastore 
	dup 
	sipush 158
	ldc literal_332:"TimePassing.caf"
	aastore 
	dup 
	sipush 159
	ldc literal_333:"timestamp"
	aastore 
	dup 
	sipush 160
	ldc literal_334:"to"
	aastore 
	dup 
	sipush 161
	ldc literal_335:"Tri-tone.caf"
	aastore 
	dup 
	sipush 162
	ldc literal_336:"type"
	aastore 
	dup 
	sipush 163
	ldc literal_337:"unavailable"
	aastore 
	dup 
	sipush 164
	ldc literal_338:"uri"
	aastore 
	dup 
	sipush 165
	ldc literal_339:"url"
	aastore 
	dup 
	sipush 166
	ldc literal_340:"urn:ietf:params:xml:ns:xmpp-bind"
	aastore 
	dup 
	sipush 167
	ldc literal_341:"urn:ietf:params:xml:ns:xmpp-sasl"
	aastore 
	dup 
	sipush 168
	ldc literal_342:"urn:ietf:params:xml:ns:xmpp-session"
	aastore 
	dup 
	sipush 169
	ldc literal_343:"urn:ietf:params:xml:ns:xmpp-stanzas"
	aastore 
	dup 
	sipush 170
	ldc literal_344:"urn:ietf:params:xml:ns:xmpp-streams"
	aastore 
	dup 
	sipush 171
	ldc literal_345:"urn:xmpp:delay"
	aastore 
	dup 
	sipush 172
	ldc literal_346:"urn:xmpp:ping"
	aastore 
	dup 
	sipush 173
	ldc literal_347:"urn:xmpp:receipts"
	aastore 
	dup 
	sipush 174
	ldc literal_348:"urn:xmpp:whatsapp"
	aastore 
	dup 
	sipush 175
	ldc literal_349:"urn:xmpp:whatsapp:dirty"
	aastore 
	dup 
	sipush 176
	ldc literal_350:"urn:xmpp:whatsapp:mms"
	aastore 
	dup 
	sipush 177
	ldc literal_351:"urn:xmpp:whatsapp:push"
	aastore 
	dup 
	sipush 178
	ldc literal_352:"value"
	aastore 
	dup 
	sipush 179
	ldc literal_353:"vcard"
	aastore 
	dup 
	sipush 180
	ldc literal_354:"version"
	aastore 
	dup 
	sipush 181
	ldc literal_355:"video"
	aastore 
	dup 
	sipush 182
	ldc literal_356:"w"
	aastore 
	dup 
	sipush 183
	ldc literal_357:"w:g"
	aastore 
	dup 
	sipush 184
	ldc literal_358:"w:p:r"
	aastore 
	dup 
	sipush 185
	ldc literal_359:"wait"
	aastore 
	dup 
	sipush 186
	ldc literal_360:"x"
	aastore 
	dup 
	sipush 187
	ldc literal_361:"xml-not-well-formed"
	aastore 
	dup 
	sipush 188
	ldc literal_362:"xml:lang"
	aastore 
	dup 
	sipush 189
	ldc literal_363:"xmlns"
	aastore 
	dup 
	sipush 190
	ldc literal_364:"xmlns:stream"
	aastore 
	dup 
	sipush 191
	ldc literal_365:"Xylophone.caf"
	aastore 
	dup 
	sipush 192
	ldc literal_366:"account"
	aastore 
	dup 
	sipush 193
	ldc literal_367:"digest"
	aastore 
	dup 
	sipush 194
	ldc literal_368:"g_notify"
	aastore 
	dup 
	sipush 195
	ldc literal_369:"method"
	aastore 
	dup 
	sipush 196
	ldc literal_370:"password"
	aastore 
	dup 
	sipush 197
	ldc literal_371:"registration"
	aastore 
	dup 
	sipush 198
	ldc literal_372:"stat"
	aastore 
	dup 
	sipush 199
	ldc literal_373:"text"
	aastore 
	dup 
	sipush 200
	ldc literal_374:"user"
	aastore 
	dup 
	sipush 201
	ldc literal_375:"username"
	aastore 
	dup 
	sipush 202
	ldc literal_376:"event"
	aastore 
	dup 
	sipush 203
	ldc literal_377:"latitude"
	aastore 
	dup 
	sipush 204
	ldc literal_378:"longitude"
	aastore 
	dup 
	sipush 205
	ldc literal_379:"true"
	aastore 
	dup 
	sipush 206
	ldc literal_380:"after"
	aastore 
	dup 
	sipush 207
	ldc literal_381:"before"
	aastore 
	dup 
	sipush 208
	ldc literal_382:"broadcast"
	aastore 
	dup 
	sipush 209
	ldc literal_383:"count"
	aastore 
	dup 
	sipush 210
	ldc literal_384:"features"
	aastore 
	dup 
	sipush 211
	ldc literal_385:"first"
	aastore 
	dup 
	sipush 212
	ldc literal_386:"index"
	aastore 
	dup 
	sipush 213
	ldc literal_387:"invalid-mechanism"
	aastore 
	dup 
	sipush 214
	ldc literal_388:"last"
	aastore 
	dup 
	sipush 215
	ldc literal_389:"max"
	aastore 
	dup 
	sipush 216
	ldc literal_390:"offline"
	aastore 
	dup 
	sipush 217
	ldc literal_391:"proceed"
	aastore 
	dup 
	sipush 218
	ldc literal_392:"required"
	aastore 
	dup 
	sipush 219
	ldc literal_393:"sync"
	aastore 
	dup 
	sipush 220
	ldc literal_394:"elapsed"
	aastore 
	dup 
	sipush 221
	ldc literal_395:"ip"
	aastore 
	dup 
	sipush 222
	ldc literal_396:"microsoft"
	aastore 
	dup 
	sipush 223
	ldc literal_397:"mute"
	aastore 
	dup 
	sipush 224
	ldc literal_398:"nokia"
	aastore 
	dup 
	sipush 225
	ldc literal_399:"off"
	aastore 
	dup 
	sipush 226
	ldc literal_400:"pin"
	aastore 
	dup 
	sipush 227
	ldc literal_401:"pop_mean_time"
	aastore 
	dup 
	sipush 228
	ldc literal_402:"pop_plus_minus"
	aastore 
	dup 
	sipush 229
	ldc literal_403:"port"
	aastore 
	dup 
	sipush 230
	ldc literal_404:"reason"
	aastore 
	dup 
	sipush 231
	ldc literal_405:"server-error"
	aastore 
	dup 
	sipush 232
	ldc literal_406:"silent"
	aastore 
	dup 
	sipush 233
	ldc literal_407:"timeout"
	aastore 
	dup 
	sipush 234
	ldc literal_408:"lc"
	aastore 
	dup 
	sipush 235
	ldc literal_409:"lg"
	aastore 
	dup 
	sipush 236
	ldc literal_410:"bad-protocol"
	aastore 
	dup 
	sipush 237
	ldc literal_411:"none"
	aastore 
	dup 
	sipush 238
	ldc literal_412:"remote-server-timeout"
	aastore 
	dup 
	sipush 239
	ldc literal_413:"service-unavailable"
	aastore 
	dup 
	sipush 240
	ldc literal_414:"w:p"
	aastore 
	dup 
	sipush 241
	ldc literal_415:"w:profile:picture"
	aastore 
	dup 
	sipush 242
	ldc literal_416:"notification"
	aastore 
	putstatic dictionary // FunXMPP
	clinit_return 
	}

}
