import com.madmous.deezee.Client
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_clientindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/client/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'client.label', default: 'Client'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("plugins/font-awesome-4.5.0/css/font-awesome.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("plugins/animate-custom.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',11,['src':("jquery.mCustomScrollbar.css")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',16,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',20,['controller':("graph"),'action':("index"),'class':("suivi")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',23,['class':("logout"),'controller':("logout")],2)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
invokeTag('message','g',42,['code':(flash.message),'args':(flash.args),'default':(flash.defaultMessage)],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flash.error)) {
printHtmlPart(14)
invokeTag('message','g',50,['code':(flash.error),'args':(flash.args),'default':(flash.defaultMessage)],-1)
printHtmlPart(12)
}
printHtmlPart(15)
loop:{
int i = 0
for( clientInstance in (clientInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
expressionOut.print(fieldValue(bean: clientInstance, field: "personneRessource"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clientInstance, field: "position"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: clientInstance, field: "influence"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clientInstance, field: "interet"))
printHtmlPart(18)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',80,['action':("show"),'id':(clientInstance.id)],3)
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
invokeTag('message','g',99,['code':("client.create.particulier"),'default':("Veuillez ajouter un nouveau client")],-1)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('render','g',106,['template':("form")],-1)
printHtmlPart(25)
invokeTag('submitButton','g',110,['name':("create"),'class':("btn btn-primary"),'value':(message(code: 'default.save.label', default: 'Save'))],-1)
printHtmlPart(26)
expressionOut.print(message(code: 'default.close.label', default: 'Close'))
printHtmlPart(27)
})
invokeTag('form','g',113,['role':("form"),'class':("form-horizontal icon-validation"),'url':([resource: clientInstance, action: 'save'])],2)
printHtmlPart(28)
invokeTag('javascript','asset',121,['src':("jquery.mCustomScrollbar.js")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',122,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453583514000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
