import com.madmous.deezee.Client
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_client_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/client/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: Client, field: 'partiePrenante', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("client.partiePrenante.label"),'default':("Partie Prenante")],-1)
printHtmlPart(2)
invokeTag('textField','g',8,['name':("partiePrenante"),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'personneRessource', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("client.personneRessource.label"),'default':("Personne Ressource")],-1)
printHtmlPart(2)
invokeTag('textField','g',17,['name':("personneRessource"),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'poste', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("client.poste.label"),'default':("Poste")],-1)
printHtmlPart(6)
invokeTag('textField','g',26,['name':("poste")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'contact', 'error'))
printHtmlPart(7)
invokeTag('message','g',32,['code':("client.contact.label"),'default':("Contact")],-1)
printHtmlPart(6)
invokeTag('textField','g',35,['name':("contact")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'objectif', 'error'))
printHtmlPart(8)
invokeTag('message','g',41,['code':("client.objectif.label"),'default':("Objectif")],-1)
printHtmlPart(6)
invokeTag('textField','g',44,['name':("objectif")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: Client, field: 'position', 'error'))
printHtmlPart(10)
invokeTag('message','g',50,['code':("client.position.label"),'default':("Position")],-1)
printHtmlPart(11)
invokeTag('select','g',53,['name':("position"),'from':(Client.constraints.position.inList),'required':(""),'noSelection':(['':'Please select one ...'])],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: Client, field: 'influence', 'error'))
printHtmlPart(13)
invokeTag('message','g',59,['code':("client.influence.label"),'default':("Influence")],-1)
printHtmlPart(11)
invokeTag('select','g',62,['name':("influence"),'from':(Client.constraints.influence.inList),'required':(""),'noSelection':(['':'Please select one ...'])],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: Client, field: 'interet', 'error'))
printHtmlPart(14)
invokeTag('message','g',68,['code':("client.interet.label"),'default':("Interet")],-1)
printHtmlPart(11)
invokeTag('select','g',71,['name':("interet"),'from':(Client.constraints.interet.inList),'required':(""),'noSelection':(['':'Please select one ...'])],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: Client, field: 'besoin', 'error'))
printHtmlPart(16)
invokeTag('message','g',80,['code':("client.besoin.label"),'default':("Besoin")],-1)
printHtmlPart(6)
invokeTag('textField','g',83,['name':("besoin")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'strategie', 'error'))
printHtmlPart(17)
invokeTag('message','g',89,['code':("client.strategie.label"),'default':("Strategie")],-1)
printHtmlPart(6)
invokeTag('textField','g',92,['name':("strategie")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: Client, field: 'commentaire', 'error'))
printHtmlPart(18)
invokeTag('message','g',98,['code':("client.commentaire.label"),'default':("Commentaire")],-1)
printHtmlPart(6)
invokeTag('textField','g',101,['name':("commentaire")],-1)
printHtmlPart(19)
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
