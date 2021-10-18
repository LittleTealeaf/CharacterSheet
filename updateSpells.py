import subprocess
import urllib.request
import os

# path of spells.json
# path = os.path.dirname(__file__)"/resources/spells/spells.json"
path = os.path.join(os.path.dirname(__file__),"resources","spells","spells.json")
url = "https://raw.githubusercontent.com/vorpalhex/srd_spells/master/spells.json"

# Also look into using http://www.dnd5eapi.co/



fp = urllib.request.urlopen(url)
mybytes = fp.read()

mystr = mybytes.decode("UTF-8")
fp.close()


file = open(path,'w')
file.seek(0)
file.write(mystr)
file.truncate()
file.close()