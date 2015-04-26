package lila.shutup

/**
 * - words are automatically pluralized. "tit" will also match "tits"
 * - words are automatically leetified. "tit" will also match "t1t", "t-i-t", and more.
 * - words do not partial match. "anal" will NOT match "analysis".
 */
object Dictionary {

  def en: List[String] = dict("""
(c|k)oc?k
(c|k)oc?ksuc?ker
(c|k)um(shot|)
(c|k)unt(ing|)
(f+|ph)(u{1,}|a{1,}|e{1,})c?k(er|r|u|k|ed|d|t|ing|tar|tard|face|)
abortion
anal(plug|sex|)
anus
arse(hole|)
ass
ass?hole
ball
bastard?
bewb
bimbo
bitche?
blow
blowjob
blumpkin
bollock
boner
boob
bugger
buk?kake
bull?shit
cawk
chink
choad
clit
clitoris
condom
coon
cooter
cornhole
coward?
crap
cunn?ilingu
dic?k
dic?khead
dildo
dogg?ystyle
dong
douche(bag|)
dyke
fag
fagg?ot
fanny
fart
foreskin
gangbang
genital
genitalia
gobshite?
gook
gypo
handjob
hell
hitler
homm?o
honkey
hooker
hore
horny
humping
incest
jerk
jizz?(um|)
kaffir
kike
labia
lesbo
masturbat(e|ion)
milf
molest
moron
mother
motherfuc?k
mthrfckr
muff
nazi
negro
nigg?(er|a|ah)
nonce
nutsac?k
pa?edo
pa?edo(f|ph)ile
paki
pecker
pederast
pen(1|i)s
pig
pimp
piss
poof
poon
poop
porn
pric?k
pron
prostitute
punani
puss(i|y|ie)
queef
queer
quim
raped?
rapist
rect(al|um)
retard(ed|)
rimjob
schlong
screw(d|ed|)
scrotum
scum(bag|)
semen
sex
shag
shemale
shit(z|e|y|ty|bag|)
sister
slag
slut
spastic
spaz
sperm
spick
spoo
spooge
spunk
stripper
stupid
suc?k
taint
tart
terrorist
tit(s|ies|ties|ty)(fuc?k)
tosser
turd
twat
vag
vagin(a|al|)
vibrator
vulva
wanc?k(er|)
wetback
whore?
wog
""")

  private def dict(words: String) = words.lines.filter(_.nonEmpty).toList
}
