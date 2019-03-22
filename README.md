Smart Positioning
====================
- - -

# 1° PCD Assignment
__Studenti:__

* **Manuel Bonarrigo**
+ **Lorenzo Rizzato**
- **Luca Giulianini**

## Obiettivo del Progetto

Si consideri un sistema formato da N particelle p[i] su un piano cartesiano.
Nel sistema esiste un “campo di forze” per cui su ogni elemento p[i] viene esercitata una forza repulsiva da ogni elemento p[j]
Si vuole considerare una simulazione che rappresenta il moto delle particelle nel tempo (logico), inoltre si vorrà:

1. Realizzare una versione concorrente della simulazione considerando un insieme considerando un insieme iniziale N di particelle e calcolando l’evoluzione temporale per un certo numero di passi Nsteps, verificando lo speedup ottenuto rispetto a una versione sequenziale. N e Nsteps possono essere assunti come parametri. La posizione iniziale delle particelle può essere casuale, la velocità iniziale nulla.
2. Estendere la simulazione con una GUI che permetta di:
    *Lanciare e fermare la simulazione con pulsanti start e stop
    +Per ogni passo della simulazione, visualizzare il piano cartesiano con la posizione delle particelle
