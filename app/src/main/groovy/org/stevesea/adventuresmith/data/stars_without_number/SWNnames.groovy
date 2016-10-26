/*
 * Copyright (c) 2016 Steve Christensen
 *
 * This file is part of RPG-Pad.
 *
 * RPG-Pad is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RPG-Pad is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RPG-Pad.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.stevesea.adventuresmith.data.stars_without_number

import groovy.transform.CompileStatic
import org.stevesea.adventuresmith.data.AbstractGenerator

@CompileStatic
class SWNnames extends AbstractGenerator {
    static LinkedHashMap<String, LinkedHashMap<String, List<String>>> culture_names = [
            (Culture.Arabic): [
                    Male: '''\
Aamir
Ayub
Binyamin
Efraim
Ibrahim
Ilyas
Ismail
Jibril
Jumanah
Kazi
Lut
Matta
Mohammed
Mubarak
Mustafa
Nazir
Rahim
Reza
Sharif
Taimur
Usman
Yakub
Yusuf
Zakariya
Zubair\
'''.readLines(),
                    Female: '''\
Aisha
Badia
Chanda
Fatimah
Halah
Khayrah
Layla
Mina
Munisa
Mysha
Nissa
Nura
Parveen
Rana
Shalha
Suhira
Tahirah
Yasmin
Zulehka\
'''.readLines(),
                    Surname: '''\
Abdel
Awad
Dahhak
Essa
Hanna
Harbi
Hassan
Isa
Kasim
Katib
Khalil
Malik
Mansoor
Mazin
Musa
Najeeb
Namari
Naser
Rahman
Rasheed
Saleh
Salim
Shadi
Sulaiman
Tabari\
'''.readLines(),
                    PlaceName: '''\
Adan
Ahsa
Andalus
Asmara
Asqlan
Baqubah
Basit
Baysan
Baytlahm
Bursaid
Dahilah
Darasalam
Dawhah
Ganin
Gebal
Gibuti
Giddah
Harmah
Hartum
Hibah
Hims
Hubar
Karbala
Kut
Lacant
Magrit
Masqat
Misr
Muruni
Qabis
Qina
Rabat
Ramlah
Riyadh
Sabtah
Salalah
Sana
Sinqit
Suqutrah
Sur
Tabuk
Tangah
Tarifah
Tarrakunah
Tisit
Uman
Urdunn
Wasqah
Yaburah
Yaman\
'''.readLines(),
            ],
            (Culture.Chinese): [
                    Male: '''\
Aiguo
Bohai
Chao
Dai
Dawei
Duyi
Fa
Fu
Gui
Hong
Jianyu
Kang
Li
Niu
Peng
Quan
Ru
Shen
Shi
Song
Tao
Xue
Yi
Yuan
Zian\
'''.readLines(),
                    Female: '''\
Biyu
Changying
Daiyu
Huidai
Huiliang
Jia
Jingfei
Lan
Liling
Liu
Meili
Niu
Peizhi
Qiao
Qing
Ruolan
Shu
Suyin
Ting
Xia
Xiaowen
Xiulan
Ya
Ying
Zhilan\
'''.readLines(),
                    Surname: '''\
Bai
Cao
Chen
Cui
Ding
Du
Fang
Fu
Guo
Han
Hao
Huang
Lei
Li
Liang
Liu
Long
Song
Tan
Tang
Wang
Wu
Xing
Yang
Zhang\
'''.readLines(),
                    PlaceName: '''\
Andong
Anqing
Anshan
Chaoyang
Chaozhou
Chifeng
Dalian
Dunhuang
Fengjia
Fengtian
Fuliang
Fushun
Gansu
Ganzhou
Guizhou
Hotan
Hunan
Jinan
Jingdezhen
Jinxi
Jinzhou
Kunming
Liaoning
Linyi
Lushun
Luzhou
Ningxia
Pingxiang
Pizhou
Qidong
Qingdao
Qinghai
Rehe
Shanxi
Taiyuan
Tengzhou
Urumqi
Weifang
Wugang
Wuxi
Xiamen
Xian
Xikang
Xining
Xinjiang
Yidu
Yingkou
Yuxi
Zigong
Zoige\
'''.readLines(),

            ],
            (Culture.English): [
                    Male: '''\
Adam
Albert
Alfred
Allan
Archibald
Arthur
Basil
Charles
Colin
Donald
Douglas
Edgar
Edmund
Edward
George
Harold
Henry
Ian
James
John
Lewis
Oliver
Philip
Richard
William\
'''.readLines(),
                    Female: '''\
Abigail
Anne
Beatrice
Blanche
Catherine
Charlotte
Claire
Eleanor
Elizabeth
Emily
Emma
Georgia
Harriet
Joan
Judy
Julia
Lucy
Lydia
Margaret
Mary
Molly
Nora
Rosie
Sarah
Victoria\
'''.readLines(),
                    Surname: '''\
Barker
Brown
Butler
Carter
Chapman
Collins
Cook
Davies
Gray
Green
Harris
Jackson
Jones
Lloyd
Miller
Roberts
Smith
Taylor
Thomas
Turner
Watson
White
Williams
Wood
Young\
'''.readLines(),
                    PlaceName: '''\
Aldington
Appleton
Ashdon
Berwick
Bramford
Brimstage
Carden
Churchill
Clifton
Colby
Copford
Cromer
Davenham
Dersingham
Doverdale
Elsted
Ferring
Gissing
Heydon
Holt
Hunston
Hutton
Inkberrow
Inworth
Isfield
Kedington
Latchford
Leigh
Leighton
Maresfield
Markshall
Netherpool
Newton
Oxton
Preston
Ridley
Rochford
Seaford
Selsey
Stanton
Stockham
Stoke
Sutton
Thakeham
Thetford
Thorndon
Ulting
Upton
Westhorpe
Worcester\
'''.readLines(),

            ],
            (Culture.Indian): [
                    Male: '''\
Amrit
Ashok
Chand
Dinesh
Gobind
Harinder
Jagdish
Johar
Kurien
Lakshman
Madhav
Mahinder
Mohal
Narinder
Nikhil
Omrao
Prasad
Pratap
Ranjit
Sanjay
Shankar
Thakur
Vijay
Vipul
Yash\
'''.readLines(),
                    Female: '''\
Amala
Asha
Chandra
Devika
Esha
Gita
Indira
Indrani
Jaya
Jayanti
Kiri
Lalita
Malati
Mira
Mohana
Neela
Nita
Rajani
Sarala
Sarika
Sheela
Sunita
Trishna
Usha
Vasanta\
'''.readLines(),
                    Surname: '''\
Achari
Banerjee
Bhatnagar
Bose
Chauhan
Chopra
Das
Dutta
Gupta
Johar
Kapoor
Mahajan
Malhotra
Mehra
Nehru
Patil
Rao
Saxena
Sharma
Sharma
Singh
Trivedi
Venkatesan
Verma
Yadav\
'''.readLines(),
                    PlaceName: '''\
Ahmedabad
Alipurduar
Alubari
Anjanadri
Ankleshwar
Balarika
Bhanuja
Bhilwada
Brahmaghosa
Bulandshahar
Candrama
Chalisgaon
Chandragiri
Charbagh
Chayanka
Chittorgarh
Dayabasti
Dikpala
Ekanga
Gandhidham
Gollaprolu
Grahisa
Guwahati
Haridasva
Indraprastha
Jaisalmer
Jharonda
Kadambur
Kalasipalyam
Karnataka
Kutchuhery
Lalgola
Mainaguri
Nainital
Nandidurg
Narayanadri
Panipat
Panjagutta
Pathankot
Pathardih
Porbandar
Rajasthan
Renigunta
Sewagram
Shakurbasti
Siliguri
Sonepat
Teliwara
Tinpahar
Villivakkam\
'''.readLines(),

            ],
            (Culture.Japanese): [
                    Male: '''\
Akira
Daisuke
Fukashi
Goro
Hiro
Hiroya
Hotaka
Katsu
Katsuto
Keishuu
Kyuuto
Mikiya
Mitsunobu
Mitsuru
Naruhiko
Nobu
Shigeo
Shigeto
Shou
Shuji
Takaharu
Teruaki
Tetsushi
Tsukasa
Yasuharu\
'''.readLines(),
                    Female: '''\
Aemi
Airi
Ako
Ayu
Chikaze
Eriko
Hina
Kaori
Keiko
Kyouka
Mayumi
Miho
Namiko
Natsu
Nobuko
Rei
Ririsa
Sakimi
Shihoko
Shika
Tsukiko
Tsuzune
Yoriko
Yorimi
Yoshiko\
'''.readLines(),
                    Surname: '''\
Abe
Arakaki
Endo
Fujiwara
Goto
Ito
Kikuchi
Kinjo
Kobayashi
Koga
Komatsu
Maeda
Nakamura
Narita
Ochi
Oshiro
Saito
Sakamoto
Sato
Suzuki
Takahashi
Tanaka
Watanabe
Yamamoto
Yamasaki\
'''.readLines(),
                    PlaceName: '''\
Bando
Chikuma
Chikusei
Chino
Hitachi
Hitachinaka
Hitachiomiya
Hitachiota
Iida
Iiyama
Ina
Inashiki
Ishioka
Itako
Kamisu
Kasama
Kashima
Kasumigaura
Kitaibaraki
Kiyose
Koga
Komagane
Komoro
Matsumoto
Mito
Mitsukaido
Moriya
Nagano
Naka
Nakano
Ogi
Okaya
Omachi
Ryugasaki
Saku
Settsu
Shimotsuma
Shiojiri
Suwa
Suzaka
Takahagi
Takeo
Tomi
Toride
Tsuchiura
Tsukuba
Ueda
Ushiku
Yoshikawa
Yuki\
'''.readLines(),

            ],
            (Culture.Nigerian): [
                    Male: '''\
Adesegun
Akintola
Amabere
Arikawe
Asagwara
Chidubem
Chinedu
Chiwetei
Damilola
Esangbedo
Ezenwoye
Folarin
Genechi
Idowu
Kelechi
Ketanndu
Melubari
Nkanta
Obafemi
Olatunde
Olumide
Tombari
Udofia
Uyoata
Uzochi\
'''.readLines(),
                    Female: '''\
Abike
Adesuwa
Adunola
Anguli
Arewa
Asari
Bisola
Chioma
Eduwa
Emilohi
Fehintola
Folasade
Mahparah
Minika
Nkolika
Nkoyo
Nuanae
Obioma
Olafemi
Shanumi
Sominabo
Suliat
Tariere
Temedire
Yemisi\
'''.readLines(),
                    Surname: '''\
Adegboye
Adeniyi
Adeyeku
Adunola
Agbaje
Akpan
Akpehi
Aliki
Asuni
Babangida
Ekim
Ezeiruaku
Fabiola
Fasola
Nwokolo
Nzeocha
Ojo
Okonkwo
Okoye
Olaniyan
Olawale
Olumese
Onajobi
Soyinka
Yamusa\
'''.readLines(),
                    PlaceName: '''\
Abadan
Ador
Agatu
Akamkpa
Akpabuyo
Ala
Askira
Bakassi
Bama
Bayo
Bekwara
Biase
Boki
Buruku
Calabar
Chibok
Damboa
Dikwa
Etung
Gboko
Gubio
Guzamala
Gwoza
Hawul
Ikom
Jere
Kalabalge
Katsina
Knoduga
Konshishatse
Kukawa
Kwande
Kwayakusar
Logo
Mafa
Makurdi
Nganzai
Obanliku
Obi
Obubra
Obudu
Odukpani
Ogbadibo
Ohimini
Okpokwu
Otukpo
Shani
Ugep
Vandeikya
Yala\
'''.readLines(),

            ],
            (Culture.Russian): [
                    Male: '''\
Aleksandr
Andrei
Arkady
Boris
Dmitri
Dominik
Grigory
Igor
Ilya
Ivan
Kiril
Konstantin
Leonid
Nikolai
Oleg
Pavel
Petr
Sergei
Stepan
Valentin
Vasily
Viktor
Yakov
Yegor
Yuri\
'''.readLines(),
                    Female: '''\
Aleksandra
Anastasia
Anja
Catarina
Devora
Dima
Ekaterina
Eva
Irina
Karolina
Katlina
Kira
Ludmilla
Mara
Nadezdha
Nastassia
Natalya
Oksana
Olena
Olga
Sofia
Svetlana
Tatyana
Vilma
Yelena\
'''.readLines(),
                    Surname: '''\
Abelev
Bobrikov
Chemerkin
Gogunov
Gurov
Iltchenko
Kavelin
Komarov
Korovin
Kurnikov
Lebedev
Litvak
Mekhdiev
Muraviov
Nikitin
Ortov
Peshkov
Romasko
Shvedov
Sikorski
Stolypin
Turov
Volokh
Zaitsev
Zhukov\
'''.readLines(),
                    PlaceName: '''\
Amur
Arkhangelsk
Astrakhan
Belgorod
Bryansk
Chelyabinsk
Chita
Gorki
Irkutsk
Ivanovo
Kaliningrad
Kaluga
Kamchatka
Kemerovo
Kirov
Kostroma
Kurgan
Kursk
Leningrad
Lipetsk
Magadan
Moscow
Murmansk
Novgorod
Novosibirsk
Omsk
Orenburg
Oryol
Penza
Perm
Pskov
Rostov
Ryazan
Sakhalin
Samara
Saratov
Smolensk
Sverdlovsk
Tambov
Tomsk
Tula
Tver
Tyumen
Ulyanovsk
Vladimir
Volgograd
Vologda
Voronezh
Vyborg
Yaroslavl\
'''.readLines(),

            ],
            (Culture.Spanish): [
                    Male: '''\
Alejandro
Alonso
Amelio
Armando
Bernardo
Carlos
Cesar
Diego
Emilio
Estevan
Felipe
Francisco
Guillermo
Javier
Jose
Juan
Julio
Luis
Pedro
Raul
Ricardo
Salvador
Santiago
Valeriano
Vicente\
'''.readLines(),
                    Female: '''\
Adalina
Aleta
Ana
Ascencion
Beatriz
Carmela
Celia
Dolores
Elena
Emelina
Felipa
Inez
Isabel
Jacinta
Lucia
Lupe
Maria
Marta
Nina
Paloma
Rafaela
Soledad
Teresa
Valencia
Zenaida\
'''.readLines(),
                    Surname: '''\
Arellano
Arispana
Borrego
Carderas
Carranzo
Cordova
Enciso
Espejo
Gavilan
Guerra
Guillen
Huertas
Illan
Jurado
Moretta
Motolinia
Pancorbo
Paredes
Quesada
Roma
Rubiera
Santoro
Torrillas
Vera
Vivero\
'''.readLines(),
                    PlaceName: '''\
Aguascebas
Alcazar
Barranquete
Bravatas
Cabezudos
Calderon
Cantera
Castillo
Delgadas
Donablanca
Encinetas
Estrella
Faustino
Fuentebravia
Gafarillos
Gironda
Higueros
Huelago
Humilladero
Illora
Isabela
Izbor
Jandilla
Jinetes
Limones
Loreto
Lujar
Marbela
Matagorda
Nacimiento
Niguelas
Ogijares
Ortegicar
Pampanico
Pelado
Quesada
Quintera
Riguelo
Ruescas
Salteras
Santopitar
Taberno
Torres
Umbrete
Valdecazorla
Velez
Vistahermosa
Yeguas
Zahora
Zumeta\
'''.readLines(),

            ],
    ]

    String pickCulture() {
        pick(culture_names.keySet())
    }

    List<String> pickCultures(int n) {
        pickN(culture_names.keySet(), n) as List<String>
    }

    String getPlaceName() {
        // TODO: this assumes all cultures are equally weighted.
        getPlaceName(pickCulture())
    }

    String getPlaceName(@Culture String culture) {
        pick(culture_names.get(culture).get('PlaceName'))
    }

    // TODO: there are interesting culture-specific naming rules in the SWN resources, follow them?
    String generate(@Culture String culture) {
        """\
<strong>Culture</strong> - ${culture}
<br/>
<br/><strong><small>Male:</small></strong> ${pick(culture_names.get(culture).get('Male'))}
<br/><strong><small>Female:</small></strong> ${pick(culture_names.get(culture).get('Female'))}
<br/><strong><small>Surname:</small></strong> ${pick(culture_names.get(culture).get('Surname'))}
<br/>
<br/><strong><small>Place:</small></strong> ${pick(culture_names.get(culture).get('PlaceName'))}\
"""
    }

    String generate() {
        generate(pickCulture())
    }

    public static Map<String, SWNnames> generators = [
            (Culture.Arabic): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Arabic)
                }
            },
            (Culture.Chinese): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Chinese)
                }
            },
            (Culture.English): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.English)
                }
            },
            (Culture.Indian): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Indian)
                }
            },
            (Culture.Japanese): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Japanese)
                }
            },
            (Culture.Nigerian): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Nigerian)
                }
            },
            (Culture.Russian): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Russian)
                }
            },
            (Culture.Spanish): new SWNnames() {
                @Override
                String generate() {
                    generate(Culture.Spanish)
                }
            },
    ]
}
