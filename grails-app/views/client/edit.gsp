<%@ page import="com.madmous.deezee.Client" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'client.label', default: 'Client')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
		<asset:stylesheet href="main.css"/>
        <asset:stylesheet src="plugins/font-awesome-4.5.0/css/font-awesome.css"/>
        <asset:stylesheet src="plugins/animate-custom.css"/>
	</head>
	<body>
		<header>
			<a href="#edit-client" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
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
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <g:form url="[resource:clientInstance, action:'update']" method="PUT" >
                                    <div class="text-center buttonUpdate">
                                        <button type="update" class="btn btn-warning btn-lg text-center">Update Client Informations</button>
                                    </div>
                                        <g:hiddenField name="version" value="${clientInstance?.version}" />
                                    <fieldset class="form">
                                        <g:render template="form"/>
                                    </fieldset>
                                </g:form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12 table-responsive">
                                <div id="edit-client" class="content scaffold-edit" role="main">
                                    <g:if test="${flash.message}">
                                        <div class="message" role="status">${flash.message}</div>
                                    </g:if>
                                    <g:hasErrors bean="${clientInstance}">
                                        <ul class="errors" role="alert">
                                            <g:eachError bean="${clientInstance}" var="error">
                                                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                                            </g:eachError>
                                        </ul>
                                    </g:hasErrors>
                                    <!--<g:form url="[resource:clientInstance, action:'update']" method="PUT" >
                                        <g:hiddenField name="version" value="${clientInstance?.version}" />
                                        <fieldset class="form">
                                            <g:render template="form"/>
                                        </fieldset>
                                        <fieldset class="buttons">
                                            <g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
                                        </fieldset>
                                    </g:form>-->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
		</article>

	</body>
</html>
