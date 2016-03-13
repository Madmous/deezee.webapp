import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_clientcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/client/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'client.label', default: 'Client'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['href':("main.css")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',15,['controller':("graph"),'action':("index"),'class':("suivi")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',16,['class':("logout"),'controller':("logout")],2)
printHtmlPart(10)
invokeTag('message','g',22,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
expressionOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',29,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',30,['bean':(clientInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',32,['bean':(clientInstance)],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('render','g',35,['template':("form")],-1)
printHtmlPart(23)
invokeTag('submitButton','g',38,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',40,['url':([resource:clientInstance, action:'save'])],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1452984281000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
