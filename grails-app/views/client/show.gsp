
<%@ page import="com.madmous.deezee.Client" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'client.label', default: 'Client')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
        <asset:stylesheet href="main.css"/>
            <asset:stylesheet src="plugins/font-awesome-4.5.0/css/font-awesome.css"/>
            <asset:stylesheet src="plugins/animate-custom.css"/>
	</head>
	<body>
		<header>
			<a href="#show-client" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
			<div class="nav" role="navigation">
                <ul class="pres">
                    <li><a class="home" href="${createLink(uri: '/')}">Home</a></li>
                    <li><g:link controller="graph" action="index" class="suivi">Follow-up</g:link></li>
                </ul>
                <ul class="log">
                    <li><g:link class="logout" controller='logout'>Logout</g:link></li>
                </ul>
			</div>
		</header>
        <article>
            <section class="intro text-center">
                <div class="page-icon animated bounceInDown">
                    <asset:image src="show_client.png" alt="Key icon"/>
                </div>
            </section>
            <section class="main">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                                <g:form url="[resource:clientInstance, action:'delete']" class="formShow" method="DELETE">
                                    <button type="button" class="editClient btn btn-primary btn-lg" data-toggle="modal" data-target="#modal-editClient">Edit the Client Informations</button>
                                    <button type="submit" class="btn btn-danger btn-lg" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');">Remove the Client</button>
                                </g:form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <g:if test="${flash.message}">
                                    <div class="alert alert-success fade in">
                                        <button type="button" class="close" data-dismiss="alert"
                                                aria-hidden="true">×</button>
                                        <strong>Success!</strong> <g:message code="${flash.message}" args="${flash.args}"
                                                                            default="${flash.defaultMessage}"/>.
                                    </div>
                                </g:if>
                                <g:if test="${flash.error}">
                                    <div class="alert alert-danger fade in">
                                        <button type="button" class="close" data-dismiss="alert"
                                                aria-hidden="true">×</button>
                                        <strong>something Went Wrong!</strong> <g:message code="${flash.error}" args="${flash.args}"
                                                                            default="${flash.defaultMessage}"/>.
                                    </div>
                                </g:if>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12 table-responsive">
                                <ol class="property-list client">
                                    <g:if test="${clientInstance?.partiePrenante}">
                                        <li class="fieldcontain">
                                            <span id="partiePrenante-label" class="property-label"><g:message code="client.partiePrenante.label" default="Partie Prenante" /></span>

                                            <span class="property-value" aria-labelledby="partiePrenante-label"><g:fieldValue bean="${clientInstance}" field="partiePrenante"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.personneRessource}">
                                        <li class="fieldcontain">
                                            <span id="personneRessource-label" class="property-label"><g:message code="client.personneRessource.label" default="Personne Ressource" /></span>

                                            <span class="property-value" aria-labelledby="personneRessource-label"><g:fieldValue bean="${clientInstance}" field="personneRessource"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.poste}">
                                        <li class="fieldcontain">
                                            <span id="poste-label" class="property-label"><g:message code="client.poste.label" default="Poste" /></span>

                                            <span class="property-value" aria-labelledby="poste-label"><g:fieldValue bean="${clientInstance}" field="poste"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.contact}">
                                        <li class="fieldcontain">
                                            <span id="contact-label" class="property-label"><g:message code="client.contact.label" default="Contact" /></span>

                                            <span class="property-value" aria-labelledby="contact-label"><g:fieldValue bean="${clientInstance}" field="contact"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.objectif}">
                                        <li class="fieldcontain">
                                            <span id="objectif-label" class="property-label"><g:message code="client.objectif.label" default="Objectif" /></span>

                                            <span class="property-value" aria-labelledby="objectif-label"><g:fieldValue bean="${clientInstance}" field="objectif"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.position}">
                                        <li class="fieldcontain">
                                            <span id="position-label" class="property-label"><g:message code="client.position.label" default="Position" /></span>

                                            <span class="property-value" aria-labelledby="position-label"><g:fieldValue bean="${clientInstance}" field="position"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.influence}">
                                        <li class="fieldcontain">
                                            <span id="influence-label" class="property-label"><g:message code="client.influence.label" default="Influence" /></span>

                                            <span class="property-value" aria-labelledby="influence-label"><g:fieldValue bean="${clientInstance}" field="influence"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.interet}">
                                        <li class="fieldcontain">
                                            <span id="interet-label" class="property-label"><g:message code="client.interet.label" default="Interet" /></span>

                                            <span class="property-value" aria-labelledby="interet-label"><g:fieldValue bean="${clientInstance}" field="interet"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.besoin}">
                                        <li class="fieldcontain">
                                            <span id="besoin-label" class="property-label"><g:message code="client.besoin.label" default="Besoin" /></span>

                                            <span class="property-value" aria-labelledby="besoin-label"><g:fieldValue bean="${clientInstance}" field="besoin"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.strategie}">
                                        <li class="fieldcontain">
                                            <span id="strategie-label" class="property-label"><g:message code="client.strategie.label" default="Strategie" /></span>

                                            <span class="property-value" aria-labelledby="strategie-label"><g:fieldValue bean="${clientInstance}" field="strategie"/></span>

                                        </li>
                                    </g:if>
                                    <g:if test="${clientInstance?.commentaire}">
                                        <li class="fieldcontain">
                                            <span id="commentaire-label" class="property-label"><g:message code="client.commentaire.label" default="Commentaire" /></span>

                                            <span class="property-value" aria-labelledby="commentaire-label"><g:fieldValue bean="${clientInstance}" field="commentaire"/></span>

                                        </li>
                                    </g:if>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <div class="modal fade" id="modal-editClient" aria-hidden="true" style="display: none;">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header bg-gray-light">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">
                                <!-- Début titre de la page -->
                                <strong>Update Client</strong>
                            </h4>
                        </div>
                        <g:form role="form" class="form-horizontal icon-validation"
                                url="[resource: clientInstance, action: 'save']">
                            <div class="modal-body">
                                <g:render template="editForm"/>
                            </div>
                            <div class="modal-footer text-center">
                                <g:submitButton name="update" class="btn btn-warning" value="${message(code: 'default.button.update.label', default: 'Update')}"/>
                                <button type="button" class="btn btn-danger" data-dismiss="modal">${message(code: 'default.close.label', default: 'Close')}</button>
                            </div>
                        </g:form>
                    </div>
                </div>
            </div>
        </article>
	</body>
</html>
