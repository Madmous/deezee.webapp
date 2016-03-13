<%@ page import="com.madmous.deezee.Client" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <g:set var="entityName" value="${message(code: 'client.label', default: 'Client')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <asset:stylesheet src="main.css"/>
        <asset:stylesheet src="plugins/font-awesome-4.5.0/css/font-awesome.css"/>
        <asset:stylesheet src="plugins/animate-custom.css"/>
        <asset:stylesheet src="jquery.mCustomScrollbar.css"/>

    </head>
    <body>
        <header>
            <a href="#list-client" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
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
                <i class="fa fa-group fa-4x animated bounceInDown"></i>
                <h1 class="animated flipInX">Client List</h1>
            </section>
            <section class="main">
                <div class="panel panel-default">
                    <div class="panel-body">
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
                                    <div class="alert indexAlert alert-danger fade in">
                                        <button type="button" class="close" data-dismiss="alert"
                                                aria-hidden="true">×</button>
                                        <strong>Something Went Wrong!</strong> <g:message code="${flash.error}" args="${flash.args}"
                                                                                          default="${flash.defaultMessage}"/>.
                                    </div>
                                </g:if>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <button type="button" class="addClient btn btn-info btn-lg" data-toggle="modal" data-target="#modal-client">Add a new Client</button>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12 table-responsive mCustomScrollbar" data-mcs-theme="dark">
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Personne Ressource</th>
                                            <th>Position</th>
                                            <th>Influence</th>
                                            <th>Interest</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <g:each in="${clientInstanceList}" status="i" var="clientInstance">
                                            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                                                <td>${fieldValue(bean: clientInstance, field: "personneRessource")}</td>
                                                <td>${fieldValue(bean: clientInstance, field: "position")}</td>
                                                <!--Flg-->
                                                <td>${fieldValue(bean: clientInstance, field: "influence")}</td>
                                                <td>${fieldValue(bean: clientInstance, field: "interet")}</td>
                                                <td><g:link action="show" id="${clientInstance.id}"><i class="fa fa-sun-o fa-1x"></i></g:link></td>
                                            </tr>
                                        </g:each>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <div class="modal fade" id="modal-client" aria-hidden="true" style="display: none;">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header bg-gray-light">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">
                                <!-- Début titre de la page -->
                                <strong>
                                    <g:message code="client.create.particulier" default="Veuillez ajouter un nouveau client"/>
                                </strong>
                            </h4>
                        </div>
                        <g:form role="form" class="form-horizontal icon-validation"
                                url="[resource: clientInstance, action: 'save']">
                            <div class="modal-body">
                                <g:render template="form"/>
                            </div>
                            <div class="modal-footer text-center">

                                <g:submitButton name="create" class="btn btn-primary" value="${message(code: 'default.save.label', default: 'Save')}"/>
                                <button type="button" class="btn btn-danger" data-dismiss="modal">${message(code: 'default.close.label', default: 'Close')}</button>
                            </div>
                        </g:form>
                    </div>
                </div>
            </div>

        </article>
        <footer><p>Copyright &copy; 2015 Madmous | All rights reserved.</p></footer>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <asset:javascript src="jquery.mCustomScrollbar.js"/>
    </body>
</html>
