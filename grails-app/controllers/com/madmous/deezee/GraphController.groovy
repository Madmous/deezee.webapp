package com.madmous.deezee

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class GraphController {
    def index() {
        def impliquerEtroitement = Client.findAllByInfluenceAndInteret("eleve","eleve")
        log.debug("index() -->> ${impliquerEtroitement.size()} client(s) à impliquer étroitement : ${impliquerEtroitement}")
        def maintenirSatisfait = Client.findAllByInfluenceAndInteret("eleve","faible")
        log.debug("index() -->> ${maintenirSatisfait.size()} client(s) à maintenir satisfait : ${maintenirSatisfait}")
        def suiviOccasionnel = Client.findAllByInfluenceAndInteret("faible","faible")
        log.debug("index() -->> ${suiviOccasionnel.size()} client(s) à suivre occasionnellement : ${suiviOccasionnel}")
        def maintenirInforme = Client.findAllByInfluenceAndInteret("faible","eleve")
        log.debug("index() -->> ${maintenirInforme.size()} client(s) à maintenir informé : ${maintenirInforme}")
        def totalClient = impliquerEtroitement.size() + maintenirSatisfait.size() + suiviOccasionnel.size() + maintenirInforme.size()
        log.debug("index() -->> Total client : ${totalClient}")
        def impliquerEtroitementPourcent = percentage(impliquerEtroitement.size(), totalClient)
        log.debug("index() -->> Pourcentage client à impliquer étroitement : ${impliquerEtroitementPourcent}")
        def maintenirSatisfaitPourcent = percentage(maintenirSatisfait.size(), totalClient)
        log.debug("index() -->> Pourcentage client à maintenir satisfait : ${maintenirSatisfaitPourcent}")
        def suiviOccasionnelPourcent = percentage(suiviOccasionnel.size(), totalClient)
        log.debug("index() -->> Pourcentage client à suivre occasionnellement : ${suiviOccasionnelPourcent}")
        def maintenirInformePourcent = percentage(maintenirInforme.size(), totalClient)
        log.debug("index() -->> Pourcentage client à maintenir informé : ${maintenirInformePourcent}")
        //client = client as JSON
        render view: 'index', model: [
                impliquerEtroitement: impliquerEtroitement,
                maintenirSatisfait: maintenirSatisfait,
                suiviOccasionnel: suiviOccasionnel,
                maintenirInforme: maintenirInforme,
                impliquerEtroitementPourcent: impliquerEtroitementPourcent,
                maintenirSatisfaitPourcent: maintenirSatisfaitPourcent,
                suiviOccasionnelPourcent: suiviOccasionnelPourcent,
                maintenirInformePourcent: maintenirInformePourcent
        ]
    }
    def percentage(def specificClient, def totalClient){
        def value = (specificClient * 100)/totalClient
        value = Math.ceil(value)
        return value
    }
}
