import sys, re
reload(sys)
sys.setdefaultencoding('utf-8')

import codecs
codecs.register(lambda name: name == 'cp65001' and codecs.lookup('utf-8') or None)

import SimpleHTTPServer
import SocketServer
import hashlib
import argparse
import logging
import cgi
import subprocess

logging.basicConfig(level=logging.DEBUG)

class ServerHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):

    def do_GET(self):
        SimpleHTTPServer.SimpleHTTPRequestHandler.do_GET(self)

    def do_POST(self):
        form = cgi.FieldStorage(
            fp=self.rfile,
            headers=self.headers,
            environ={'REQUEST_METHOD':'POST', 'CONTENT_TYPE':self.headers['Content-Type'], })

        cc = form["cc"].value if form.has_key("cc") else '0'
        src = form["src"].value if form.has_key("src") else '123456789'
        dst = form["dst"].value  if form.has_key("dst") else '987654321'
        imei = form["imei"].value if form.has_key("imei") else '00000000'
        udid = form["udid"].value if form.has_key("udid") else ''
        udid = udid if len(udid) == 32 else hashlib.md5(imei[::-1]).hexdigest()
        msg = form["msg"].value if form.has_key("msg") else 'No Message'

        execWhaSpoke = [r'C:\Python27\python.exe',
                        r'C:\Users\Jaap\Projects\Code\airG\WhatsApp\Reference\whatspoke\termclient.py',
                        cc,
                        src,
                        dst,
                        udid,
                        msg]

        p = subprocess.Popen(execWhaSpoke, stdout=subprocess.PIPE)
        out, err = p.communicate()
        out = out if out else "No output"
        err = err if err else "No errors..."
        with open('stdout.log', 'wb') as f:
          f.write(out.replace('\r\n', '\n').replace('\r', '\n'))
        with open('stderr.log', 'wb') as f:
          f.write(err.replace('\r\n', '\n').replace('\r', '\n'))

        print out

        SimpleHTTPServer.SimpleHTTPRequestHandler.do_GET(self)

    

parser = argparse.ArgumentParser(description="Serve That's Up...")
parser.add_argument('port', type=int, default="10180")
args = parser.parse_args()

Handler = ServerHandler
Handler.extensions_map.update({
        '': 'application/octet-stream', # Default
        '.log': 'text/plain'})

httpd = SocketServer.TCPServer(("", args.port), Handler)

print "serving at port", args.port
httpd.serve_forever()