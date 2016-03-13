import com.madmous.deezee.Client
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_client_editForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/client/_editForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: Client, field: 'partiePrenante', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("client.partiePrenante.label"),'default':("Partie Prenante")],-1)
printHtmlPart(2)
invokeTag('textField','g',8,['name':("partiePrenante"),'required':(""),'value':(fieldValue(bean: clientInstance, field: 'partiePrenante'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'personneRessource', 'error'))
printHtmlPart(4)
invokeTag('message','g',12,['code':("client.personneRessource.label"),'default':("Personne Ressource")],-1)
printHtmlPart(2)
invokeTag('textField','g',15,['name':("personneRessource"),'required':(""),'value':(fieldValue(bean: clientInstance, field: 'personneRessource'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'poste', 'error'))
printHtmlPart(5)
invokeTag('message','g',19,['code':("client.poste.label"),'default':("Poste")],-1)
printHtmlPart(6)
invokeTag('textField','g',21,['name':("poste"),'value':(fieldValue(bean: clientInstance, field: 'poste'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'contact', 'error'))
printHtmlPart(7)
invokeTag('message','g',25,['code':("client.contact.label"),'default':("Contact")],-1)
printHtmlPart(6)
invokeTag('textField','g',27,['name':("contact"),'value':(fieldValue(bean: clientInstance, field: 'contact'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'objectif', 'error'))
printHtmlPart(8)
invokeTag('message','g',31,['code':("client.objectif.label"),'default':("Objectif")],-1)
printHtmlPart(6)
invokeTag('textField','g',33,['name':("objectif"),'value':(fieldValue(bean: clientInstance, field: 'objectif'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'position', 'error'))
printHtmlPart(9)
invokeTag('message','g',37,['code':("client.position.label"),'default':("Position")],-1)
printHtmlPart(2)
invokeTag('select','g',40,['name':("position"),'from':(Client.constraints.position.inList),'required':(""),'noSelection':(['':'Please select one ...']),'value':(fieldValue(bean: clientInstance, field: 'position'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'influence', 'error'))
printHtmlPart(10)
invokeTag('message','g',44,['code':("client.influence.label"),'default':("Influence")],-1)
printHtmlPart(2)
invokeTag('select','g',47,['name':("influence"),'from':(Client.constraints.influence.inList),'required':(""),'noSelection':(['':'Please select one ...']),'value':(fieldValue(bean: clientInstance, field: 'influence'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'interet', 'error'))
printHtmlPart(11)
invokeTag('message','g',51,['code':("client.interet.label"),'default':("Interet")],-1)
printHtmlPart(2)
invokeTag('select','g',54,['name':("interet"),'from':(Client.constraints.interet.inList),'required':(""),'noSelection':(['':'Please select one ...']),'value':(fieldValue(bean: clientInstance, field: 'interet'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'besoin', 'error'))
printHtmlPart(12)
invokeTag('message','g',58,['code':("client.besoin.label"),'default':("Besoin")],-1)
printHtmlPart(6)
invokeTag('textField','g',60,['name':("besoin"),'value':(fieldValue(bean: clientInstance, field: 'besoin'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'strategie', 'error'))
printHtmlPart(13)
invokeTag('message','g',64,['code':("client.strategie.label"),'default':("Strategie")],-1)
printHtmlPart(14)
invokeTag('textField','g',67,['name':("strategie"),'value':(fieldValue(bean: clientInstance, field: 'strategie'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'commentaire', 'error'))
printHtmlPart(15)
invokeTag('message','g',71,['code':("client.commentaire.label"),'default':("Commentaire")],-1)
printHtmlPart(14)
invokeTag('textField','g',74,['name':("commentaire"),'value':(fieldValue(bean: clientInstance, field: 'commentaire'))],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453578799000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
