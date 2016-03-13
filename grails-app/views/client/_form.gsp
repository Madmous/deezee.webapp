<%@ page import="com.madmous.deezee.Client" %>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'partiePrenante', 'error')} required">
	<label for="partiePrenante">
		<g:message code="client.partiePrenante.label" default="Partie Prenante" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="partiePrenante" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'personneRessource', 'error')} required">
	<label for="personneRessource">
		<g:message code="client.personneRessource.label" default="Personne Ressource" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="personneRessource" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'poste', 'error')} ">
	<label for="poste">
		<g:message code="client.poste.label" default="Poste" />

	</label>
	<g:textField name="poste"/>

</div>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'contact', 'error')} ">
	<label for="contact">
		<g:message code="client.contact.label" default="Contact" />

	</label>
	<g:textField name="contact"/>

</div>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'objectif', 'error')} ">
	<label for="objectif">
		<g:message code="client.objectif.label" default="Objectif" />

	</label>
	<g:textField name="objectif"/>

</div>

    <div class="fieldcontain ${hasErrors(bean: Client, field: 'position', 'error')} required">
        <label for="position">
            <g:message code="client.position.label" default="Position" />
            <span class="required-indicator">*</span>
        </label>
        <g:select name="position" from="${Client.constraints.position.inList}" required="" noSelection="['':'Please select one ...']"/>

    </div>

    <div class="fieldcontain ${hasErrors(bean: Client, field: 'influence', 'error')} required">
        <label for="influence">
            <g:message code="client.influence.label" default="Influence" />
            <span class="required-indicator">*</span>
        </label>
        <g:select name="influence" from="${Client.constraints.influence.inList}" required="" noSelection="['':'Please select one ...']"/>

    </div>

    <div class="fieldcontain ${hasErrors(bean: Client, field: 'interet', 'error')} required">
        <label for="interet">
            <g:message code="client.interet.label" default="Interet" />
            <span class="required-indicator">*</span>
        </label>
        <g:select name="interet" from="${Client.constraints.interet.inList}" required="" noSelection="['':'Please select one ...']"/>

    </div>




<div class="fieldcontain ${hasErrors(bean: Client, field: 'besoin', 'error')} ">
	<label for="besoin">
		<g:message code="client.besoin.label" default="Besoin" />

	</label>
	<g:textField name="besoin"/>

</div>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'strategie', 'error')} ">
	<label for="strategie">
		<g:message code="client.strategie.label" default="Strategie" />

	</label>
	<g:textField name="strategie"/>

</div>

<div class="fieldcontain ${hasErrors(bean: Client, field: 'commentaire', 'error')} ">
	<label for="commentaire">
		<g:message code="client.commentaire.label" default="Commentaire" />

	</label>
	<g:textField name="commentaire"/>

</div>

