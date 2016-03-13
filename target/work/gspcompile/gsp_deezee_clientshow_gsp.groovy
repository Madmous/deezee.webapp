import com.madmous.deezee.Client
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_clientshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/client/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'client.label', default: 'Client'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
invokeTag('stylesheet','asset',9,['href':("main.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',10,['src':("plugins/font-awesome-4.5.0/css/font-awesome.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',11,['src':("plugins/animate-custom.css")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('message','g',15,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',19,['controller':("graph"),'action':("index"),'class':("suivi")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',22,['class':("logout"),'controller':("logout")],2)
printHtmlPart(12)
invokeTag('image','asset',29,['src':("show_client.png"),'alt':("Key icon")],-1)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
expressionOut.print(message(code: 'default.button.delete.confirm.message', default: 'Are you sure?'))
printHtmlPart(15)
})
invokeTag('form','g',40,['url':([resource:clientInstance, action:'delete']),'class':("formShow"),'method':("DELETE")],2)
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
invokeTag('message','g',50,['code':(flash.message),'args':(flash.args),'default':(flash.defaultMessage)],-1)
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (flash.error)) {
printHtmlPart(20)
invokeTag('message','g',58,['code':(flash.error),'args':(flash.args),'default':(flash.defaultMessage)],-1)
printHtmlPart(18)
}
printHtmlPart(21)
if(true && (clientInstance?.partiePrenante)) {
printHtmlPart(22)
invokeTag('message','g',68,['code':("client.partiePrenante.label"),'default':("Partie Prenante")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',70,['bean':(clientInstance),'field':("partiePrenante")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.personneRessource)) {
printHtmlPart(26)
invokeTag('message','g',76,['code':("client.personneRessource.label"),'default':("Personne Ressource")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',78,['bean':(clientInstance),'field':("personneRessource")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.poste)) {
printHtmlPart(28)
invokeTag('message','g',84,['code':("client.poste.label"),'default':("Poste")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',86,['bean':(clientInstance),'field':("poste")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.contact)) {
printHtmlPart(30)
invokeTag('message','g',92,['code':("client.contact.label"),'default':("Contact")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',94,['bean':(clientInstance),'field':("contact")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.objectif)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("client.objectif.label"),'default':("Objectif")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(clientInstance),'field':("objectif")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.position)) {
printHtmlPart(34)
invokeTag('message','g',108,['code':("client.position.label"),'default':("Position")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',110,['bean':(clientInstance),'field':("position")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.influence)) {
printHtmlPart(36)
invokeTag('message','g',116,['code':("client.influence.label"),'default':("Influence")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',118,['bean':(clientInstance),'field':("influence")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.interet)) {
printHtmlPart(38)
invokeTag('message','g',124,['code':("client.interet.label"),'default':("Interet")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',126,['bean':(clientInstance),'field':("interet")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.besoin)) {
printHtmlPart(40)
invokeTag('message','g',132,['code':("client.besoin.label"),'default':("Besoin")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',134,['bean':(clientInstance),'field':("besoin")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.strategie)) {
printHtmlPart(42)
invokeTag('message','g',140,['code':("client.strategie.label"),'default':("Strategie")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',142,['bean':(clientInstance),'field':("strategie")],-1)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (clientInstance?.commentaire)) {
printHtmlPart(44)
invokeTag('message','g',148,['code':("client.commentaire.label"),'default':("Commentaire")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',150,['bean':(clientInstance),'field':("commentaire")],-1)
printHtmlPart(24)
}
printHtmlPart(46)
createTagBody(2, {->
printHtmlPart(47)
invokeTag('render','g',174,['template':("editForm")],-1)
printHtmlPart(48)
invokeTag('submitButton','g',177,['name':("update"),'class':("btn btn-warning"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(49)
expressionOut.print(message(code: 'default.close.label', default: 'Close'))
printHtmlPart(50)
})
invokeTag('form','g',180,['role':("form"),'class':("form-horizontal icon-validation"),'url':([resource: clientInstance, action: 'save'])],2)
printHtmlPart(51)
})
invokeTag('captureBody','sitemesh',185,[:],1)
printHtmlPart(52)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453581259000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
