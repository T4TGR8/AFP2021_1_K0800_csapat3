## 1. Rendszer célja
---

A rendszer célja hogy a vásárló képes legyen alapvető matematikai műveletek elvégzésére,
 az álltalunk fejlesztett program segítségével.
 
## 2. Projektterv

## 3. Üzleti folyamatok modellje
---
![Business](uzleti.png)

## 4. Követelmények

### Funkcionális
    - Egyszerűbb matematikai műveletek elvégzése
    - A folyamat alatt az eredmények tárolása
    - Megakadályozni, hogy a felhasználó érvénytelen adatot adjon meg

### Nem Funkcionális 
    - Gyorsnak és átláthatónak kell lennie

## 5. Funkcionális terv
---
### Rendszerszereplő:
    - Felhasználó

### Rendszerhasználati esetek:
* Felhasználó tudjon a programmal:
    - Összeadni
    - Kivonnni
	- Osztani
    - Szorozni
    - Számokat begépelni
	- Részeredményeket és korábbi eredményeket megtekinteni
	- Kijelző törlésére és beírt reláció javítására/törlésére

### Menü-hierarchia:
* Interface:
	- Kijelző megjelenítése mely a jelenlegi eredményt mutatja
	- Gombok melyek a reláció beírásához szükségesek(Számok 0-9, operátorok)
	- Gomb mellyel egy ablakon láthatóak az előzőleg számolt eredmények/részeredmények


## 6. Fizikai környezet
---
### Fejlesztői környezet:
    - JavaFX
    - Git
    - Notepad++
	- Visual Studio Code


## 7. Architekturális terv
---
Az alkalmazás a felhasználó gépén fog futni java kliensen keresztül, esetleges adatok tárolása a felhasználó tárhelyén történik.

* Specifikáció:
    - Szükséges egy számítógép melyen java telepítve van

## 8. Adatbázis terv
---

Az alkalmazásunkhoz nincs szükség adatbázisra, azonban előfordulhat, hogy tárolni kell helyi fájlokat

## 9. Implementációs terv
---
Az alkalmazás a felhasználó gépén fog futni java segítségével.
Valamint a részeredmények és az előző eredmények a felhasználó rendszerének tárhelyén fog helyi fájlként tárolásra kerülni.

## 10. Tesztterv
---
A rendszerterv szerint implementált szoftver tesztelésének célja az Üzleti folyamatok modellje című pontban meghatározott folyamatok helyes, gördülékeny lefutása.

A tesztelés során használt kliens hardverek a napjainkban általánosan elterjedt hardverkonfigurációjú PC-k illetve laptopok.
A minimum hardverkonfiguráció: Intel Celeron processzor, 4GB RAM, 128GB HDD, a képernyők felbontása: 
1280x1024, 1920x1080

A tesztelés során a szoftver megflelelő működését vizsgáljuk. Amennyiben az elvártnak megfelelő 
eredményt kapunk, a teszt eset sikeresnek tekinthető, ellenkező esetben a hibát rögzítjük a teszt jegyzőkönyvben. Ezt követően a megtalált
hibákat javítjuk a szoftverben, és újbóli tesztelésnek vetjük alá a rendszert.

## 11. Telepítési terv
### Fizikai telepítési terv: 
    - Szükség van a megfelelő specifikációs számítógépre, amely képes futtatni java környezetet  
### Szoftver telepítési terv: 
    - A java telepítése után telepíthető az alkalmazás

## 12. Karbantartási terv
