import urllib2

uagent = "WhatsApp/2.6.10 S40Version/04.60 Device/nokiac3-00"

# number with 00 and countrycode, e.g. 00491234567890
def get_new_code(cc, num, sms):	
	url = "https://r.whatsapp.net/v1/code.php?cc=%s&in=%s&to=%s&lc=DE&lg=de&mcc=000&mnc=000&imsi=00000000000000&method=sms"%(cc, num, sms)
	opener = urllib2.build_opener(urllib2.HTTPRedirectHandler())
	opener.addheaders = [('User-agent', uagent)]
	connection = opener.open(url)
	response = connection.read()
	connection.close()
	print response

# number with 00 and countrycode like above
# password should be a 32 character md5 lookalike to not draw attention
# code is the 3 digit code you got in your txt
def register_number_with_password(cc, number, password, code):
	url = "https://r.whatsapp.net/v1/register.php?cc=%s&in=%s&udid=%s&code=%s"%(cc, number, password, code)
	opener = urllib2.build_opener(urllib2.HTTPRedirectHandler())
	opener.addheaders = [('User-agent', uagent)]
	connection = opener.open(url)
	response = connection.read()
	connection.close()
	print response

# 16045646511
# get_new_code("1", "16043135227", "16043135227")

# b901df5dc3d7cffeb3f6fe50ad1bc4e2 = MD5("JaapSuter")
register_number_with_password("1", "16043135227", "b901df5dc3d7cffeb3f6fe50ad1bc4e2", "145")


# https://r.whatsapp.net/v1/exist.php?cc=1&in=6043135227&udid=3a65f5bd7256642f90efe085190c038a
# https://r.whatsapp.net/v1/code.php?cc=61&in=416905612&to=61416905612&lc=CA&lg=en&mcc=302&mnc=220&imsi=00000000000000&method=sms
# https://r.whatsapp.net/v1/exist.php?cc=1&in=416905612&udid=3a65f5bd7256642f90efe085190c038a