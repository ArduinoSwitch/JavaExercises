# JavaExercises
Simple java exercises to learn how works object orientation language

Pràctica 7: Iteracions mentre
L’objectiu d’aquesta pràctica és introduir un altre tipus d'instrucció iterativa que anomenarem mentre.



Atenció, els següents exercicis han de fer-se en Java i/o en Python (tret que s'especifiqui a l'enunciat concret).  Es recomana anar alternant, per exemple fer la majoria dels parells en Java i els senars en Python.  Com a activitat opcional, poden fer-se tots en els dos llenguatges.

Exercici 1: Validació de dades d'entrada de l'usuari
Desenvolupa un programa que demani a l’usuari un número positiu i retorni l'arrel quadrada.  Si el número introduït és negatiu, el programa ha de mostrar un missatge d’error, i tornar a demanar a l’usuari el número.  Mentre l’usuari torni a introduir una dada incorrecta, el programa repetirà el comportament anterior.

Exercici 2: Validació condicional
Modifica alguns programes dels fets anteriorment (mínim tres), aplicant una validació que sigui de l'estil de la de l’exercici anterior.

Exercici 3: Sumar entrada
Fes un programa que vagi demanant números a l’usuari fins que aquest introdueixi un 0.  Has de mostrar la suma de tots els números introduïts.

Exercici 4: Estadístiques entrada (opcional)
Fes el mateix que abans, però ara volem mostrar a mes de la suma, la mitjana, el mínim i el màxim.

Exercici 5: La calculadora multioperació
Desenvolupa en una calculadora senzilla que demani a l’usuari un primer operand numèric, una operació entre (+ - * /) i un segon operand, i escrigui el resultat d’aplicar l’operació als operands. Un cop mostrat el resultat, la calculadora demana a l’usuari si vol realitzar un nou càlcul. El programa continuarà oferint a l’usuari la possibilitat de calcular, fins que l’usuari respongui negativament.
Atenció: cal evitar divisió per zero. Aviseu a l'usuari de l'error, però permeteu continuar calculant.

Exercici 6: L'ascensor continu
Tornem a considerar l'ascensor d'un exercici anterior.

Recordem que l'ascensor dóna servei a un edifici amb planta baixa i dos pisos, i disposa dels següents botons: ‘pujar 1’, ‘pujar 2’, ‘baixar 1’ i ‘baixar 2’. L’ascensor es comporta, a partir dels botons esmentats, segons el següent diagrama de transició d’estats:
 
En aquesta ocasió, haurem de desenvolupar una nova versió del programa que simulava el funcionament de l'ascensor.
Aquest cop, però, el programa escriu el següent menú:
    Es troba a <pis actual>
    Seleccioni una opció:
    a: pujar un pis
    b: pujar dos pisos
    c: baixar un pis
    d: baixar dos pisos
    x: sortir de l’ascensor
En cas que l’usuari demani una opció correcta, el programa calcula el nou pis. Si l’opció és incorrecta, escriurà un missatge d’error adequat. En ambdós casos tornarà a escriure el menú anterior, fins que l’usuari teclegi x. Moment en que acabarà el programa.
Desenvolupa aquest programa en C.



Exercici 7: màquina expenedora de monedes
Es vol simular el funcionament d'una màquina expenedora de monedes.  Dissenyeu un  programa que desglossi una quantitat de diners (introduïda per l'usuari) en el mínim nombre de bitllets i monedes possibles (indicant a l'usuari per pantalla quin és el resultat per a cada moneda en el cas de que la quantitat no sigui zero).

Exercici 8: màquina d'apostes (opcional)
Volem simular el funcionament d'una partida (sense introducció de crèdits o monedes) d'una màquina d'apostes que segueix el següent esquema:
1.	Genera tres nombres (valor entre 0 i 9) en cadascun de les seves finestres i els mostri a l'usuari
2.	Genera avanços (valor entre 0 i 5) i els mostra a l'usuari

Nota: Part de l'exercici consisteix en trobar la funció per generar un número aleatori.

3.	Calcula coincidències (excloents en ordre decreixent) de tres tipus:
•	Tipus 3 : Els tres nombres iguals: guanya 250 €
•	Tipus 2 : Dos nombres iguals (1-2 o 2-3) : guanya 20€
•	Tipus 1 : Un 7 a l'inici i/o al final: guanya 1€

4.	Indica guanys
5.	Permet  avanços  en  les  tres  finestres, utilitzant botons per cada finestra (els avanços es gestionen cíclicament a elecció de l'usuari)
Nota 2: Gestió d'avanços:
polsa ‘1’: avanç al botó 1
polsa ‘2’: avanç al botó 2
polsa ‘3’:  avanç al botó 3
polsa ‘0’: no desitja més avanços
