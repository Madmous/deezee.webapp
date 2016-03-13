package com.madmous.deezee

class Client {

    String partiePrenante
    String personneRessource
    String poste
    String contact
    String objectif
    String position
    String influence
    String interet
    String besoin
    String strategie
    String commentaire

    static constraints = {
        partiePrenante(nullable: false)
        personneRessource(nullable: false)
        poste(nullable: true)
        contact(nullable: true)
        objectif(nullable: true)
        position(inList: ['appui actif','appui passif', 'indecise', 'inconnu'])
        influence(inList: ['faible','moyen', 'eleve', 'inconnu'])
        interet(inList: ['faible','moyen', 'eleve', 'inconnu'])
        besoin(nullable: true)
        strategie(nullable: true)
        commentaire(nullable: true)
    }
    String toString() {
        return "${personneRessource}"
    }
}
