import com.madmous.deezee.Client
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_graphindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/graph/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['href':("graph.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',11,['src':("plugins/font-awesome-4.5.0/css/font-awesome.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',12,['src':("plugins/animate-custom.css")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',16,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',20,['controller':("graph"),'action':("index"),'class':("suivi")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',23,['class':("logout"),'controller':("logout")],2)
printHtmlPart(9)
for( _it401426807 in (maintenirSatisfait) ) {
changeItVariable(_it401426807)
printHtmlPart(10)
expressionOut.print(it)
printHtmlPart(11)
}
printHtmlPart(12)
for( _it1534210022 in (impliquerEtroitement) ) {
changeItVariable(_it1534210022)
printHtmlPart(10)
expressionOut.print(it)
printHtmlPart(11)
}
printHtmlPart(13)
for( _it631690225 in (suiviOccasionnel) ) {
changeItVariable(_it631690225)
printHtmlPart(10)
expressionOut.print(it)
printHtmlPart(11)
}
printHtmlPart(14)
for( _it1805944454 in (maintenirInforme) ) {
changeItVariable(_it1805944454)
printHtmlPart(10)
expressionOut.print(it)
printHtmlPart(11)
}
printHtmlPart(15)
invokeTag('javascript','asset',70,['src':("graph.js")],-1)
printHtmlPart(16)
expressionOut.print(client)
printHtmlPart(17)
expressionOut.print(maintenirSatisfaitPourcent)
printHtmlPart(18)
expressionOut.print(impliquerEtroitementPourcent)
printHtmlPart(19)
expressionOut.print(suiviOccasionnelPourcent)
printHtmlPart(20)
expressionOut.print(maintenirInformePourcent)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453564200000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
