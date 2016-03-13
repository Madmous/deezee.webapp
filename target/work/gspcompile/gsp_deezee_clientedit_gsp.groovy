import com.madmous.deezee.Client
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deezee_clientedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/client/edit.gsp" }
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
invokeTag('message','g',7,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['href':("main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['src':("plugins/font-awesome-4.5.0/css/font-awesome.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("plugins/animate-custom.css")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',14,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',18,['controller':("graph"),'action':("index"),'class':("suivi")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',21,['class':("logout"),'controller':("logout")],2)
printHtmlPart(10)
invokeTag('image','asset',28,['src':("show_client.png"),'alt':("Key icon")],-1)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('hiddenField','g',40,['name':("version"),'value':(clientInstance?.version)],-1)
printHtmlPart(13)
invokeTag('render','g',42,['template':("form")],-1)
printHtmlPart(14)
})
invokeTag('form','g',44,['url':([resource:clientInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(15)
if(true && (flash.message)) {
printHtmlPart(16)
expressionOut.print(flash.message)
printHtmlPart(17)
}
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(21)
expressionOut.print(error.field)
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('message','g',56,['error':(error)],-1)
printHtmlPart(24)
})
invokeTag('eachError','g',57,['bean':(clientInstance),'var':("error")],3)
printHtmlPart(25)
})
invokeTag('hasErrors','g',59,['bean':(clientInstance)],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('hiddenField','g',61,['name':("version"),'value':(clientInstance?.version)],-1)
printHtmlPart(28)
invokeTag('render','g',63,['template':("form")],-1)
printHtmlPart(29)
invokeTag('actionSubmit','g',66,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(30)
})
invokeTag('form','g',68,['url':([resource:clientInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',77,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453579329000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
